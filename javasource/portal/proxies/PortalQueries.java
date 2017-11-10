// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package portal.proxies;

public enum PortalQueries
{
	MyRequests(new java.lang.String[][] { new java.lang.String[] { "en_US", "MyRequests" } }),
	MyOrganizationRequests(new java.lang.String[][] { new java.lang.String[] { "en_US", "MyOrganizationRequests" } }),
	OrdersWaitingForApproval(new java.lang.String[][] { new java.lang.String[] { "en_US", "OrdersWaitingForApproval" } }),
	OrderHistory(new java.lang.String[][] { new java.lang.String[] { "en_US", "OrderHistory" } }),
	MyRequestHistory(new java.lang.String[][] { new java.lang.String[] { "en_US", "MyRequestHistory" } }),
	MyOrganizationRequestHistory(new java.lang.String[][] { new java.lang.String[] { "en_US", "MyOrganizationRequestHistory" } }),
	MySolvedRequests(new java.lang.String[][] { new java.lang.String[] { "en_US", "MySolvedRequests" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private PortalQueries(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}