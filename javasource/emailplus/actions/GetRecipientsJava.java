// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailplus.actions;

import java.util.ArrayList;
import java.util.List;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeUtility;
import nap.proxies.Contact_Info;
import nap.proxies.Contact_Types;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import emailplus.proxies.MessageRecipient;
import com.mendix.webui.CustomJavaAction;

public class GetRecipientsJava extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __MxMessage;
	private emailplus.proxies.Message MxMessage;
	private emailplus.proxies.MessageRecipientTypeEnum RecipientTypePar;
	private java.lang.Boolean IsFrom;
	private java.lang.String RecipientsString;

	public GetRecipientsJava(IContext context, IMendixObject MxMessage, java.lang.String RecipientTypePar, java.lang.Boolean IsFrom, java.lang.String RecipientsString)
	{
		super(context);
		this.__MxMessage = MxMessage;
		this.RecipientTypePar = RecipientTypePar == null ? null : emailplus.proxies.MessageRecipientTypeEnum.valueOf(RecipientTypePar);
		this.IsFrom = IsFrom;
		this.RecipientsString = RecipientsString;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.MxMessage = __MxMessage == null ? null : emailplus.proxies.Message.initialize(getContext(), __MxMessage);

		// BEGIN USER CODE
		if (RecipientsString==null) return false;
		// fix:: undisclosed recipients(Outlook) caused failure of InternetAddress.parse due to colon(:)
		String replacedRecipients = RecipientsString.replace(';', ',').replace(':', ' ');
		IContext context = this.getContext();
		InternetAddress[] internetAddressArray;
		// [3937] Added debug logging under node ExpertDesk, as it is Java Action of the modeler
		// To fill the array, first try the default strict parse of the recipient list as is
		// if it fails, none strict parse is performed
		// if that fails, it will split each recipient from the string and parses them separately (quoted if needed).
		try {
			internetAddressArray = InternetAddress.parse(replacedRecipients);
		} catch (javax.mail.internet.AddressException addrStrictException) {
			Core.getLogger("ExpertDesk").debug("AddressException on strict parsing, for: " + replacedRecipients);
			try {
				internetAddressArray = InternetAddress.parse(replacedRecipients, false);		
			} catch (javax.mail.internet.AddressException addrException) {
				// [3937] To store only the successful recipients, we need the List and not array
				// and finally add all the List elements to the original internetAddressArray
				Core.getLogger("ExpertDesk").debug("AddressException on non-strict parsing.");
				String[] addrList = RecipientsString.split(";");
				List<InternetAddress> internetAddressList = new ArrayList<InternetAddress>();
				for (String addr : addrList) { // order doesn't matter
					String converted = MimeUtility.quote(addr, "()<>,;:\\\"[] \t");
					try {
						InternetAddress[] singleResult = InternetAddress.parse(converted);
						// [3605] If returned with a array with at least 1 element add that element. It shouldn't have more elements
						if (singleResult != null && singleResult.length > 0) internetAddressList.add(singleResult[0]);
					} catch (javax.mail.internet.AddressException addrExceptionQuoted) {
						Core.getLogger("ExpertDesk").debug("AddressException on recipient [" + addr + "], quoted [" + converted + "].");						
					}
				}
				internetAddressArray = new InternetAddress[internetAddressList.size()];
				internetAddressArray = internetAddressList.toArray(internetAddressArray);
			}
		}
		// [3937] calls to InternetAddress.getAddress() are followed up by a replace to remove any added quotes 
		if (internetAddressArray!=null && internetAddressArray.length>0) {
			if (IsFrom) {
				List<IMendixObject> iMendixObjectList = Core.retrieveXPathQuery(context, "//NAP.Contact_Info[ContactType='Email' and Detail = '" + internetAddressArray[0].getAddress().replaceAll("\"", "") + "']");
				if (iMendixObjectList !=null && iMendixObjectList.size()>0) {
					Contact_Info contactInfo = Contact_Info.initialize(context, iMendixObjectList.get(0));
					MxMessage.setMessage_From_Contact_Info(context, contactInfo);
				} else {
					Contact_Info contactInfo = new Contact_Info(context);
					contactInfo.setDetail(internetAddressArray[0].getAddress().replaceAll("\"", ""));
					contactInfo.setContactType(Contact_Types.Email);
					Core.commit(context, contactInfo.getMendixObject());
					MxMessage.setMessage_From_Contact_Info(context, contactInfo);
				}
			} else {
				for(InternetAddress internetAddress:internetAddressArray) {
					List<IMendixObject> iMendixObjectList = Core.retrieveXPathQuery(context, "//NAP.Contact_Info[ContactType='Email' and Detail = '" + internetAddress.getAddress().replaceAll("\"", "") + "']");
					Contact_Info contactInfo = null;
					List<Contact_Info> contactInfoList = new ArrayList<Contact_Info>();
					if (iMendixObjectList !=null && iMendixObjectList.size()>0) {
						contactInfo = Contact_Info.initialize(context, iMendixObjectList.get(0));
						contactInfoList.add(contactInfo);
					} else {
						contactInfo = new Contact_Info(context);
						contactInfo.setDetail(internetAddress.getAddress().replaceAll("\"", ""));
						contactInfo.setContactType(Contact_Types.Email);
						Core.commit(context, contactInfo.getMendixObject());						
						contactInfoList.add(contactInfo);
					}
					List<IMendixObject> iExistingRecipientObjectList = Core.retrieveXPathQuery(context, "//EmailPlus.MessageRecipient[EmailPlus.MessageRecipient_Message = "+MxMessage.getMendixObject().getId().toLong() + " and EmailPlus.MessageRecipient_Contact_Info/NAP.Contact_Info[ContactType='Email' and Detail = '" + internetAddress.getAddress() + "']]");
					if (iExistingRecipientObjectList!=null && iExistingRecipientObjectList.size()>0) {
						return true;
					}
					MessageRecipient messageRecipient = new MessageRecipient(context);
					messageRecipient.setMessageRecipient_Contact_Info(contactInfoList);
					messageRecipient.setRecipientType(RecipientTypePar);
					messageRecipient.setMessageRecipient_Message(MxMessage);
					Core.commit(context, messageRecipient.getMendixObject());
				}
			}
			return true;
		} else {
			return false;			
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetRecipientsJava";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}