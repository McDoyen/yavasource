// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slm_notifications.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the SLM_Notifications module
	public static void apply_Commitment(IContext context, slm_notifications.proxies.Commitment _commitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Commitment", _commitment == null ? null : _commitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.Apply_Commitment", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditCommitment_AfterCommit(IContext context, slm_notifications.proxies.Commitment _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "SLM_Notifications.AuditCommitment_AfterCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean auditCommitment_AfterDelete(IContext context, slm_notifications.proxies.Commitment _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.AuditCommitment_AfterDelete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditCommitment_GetAuditRecord(IContext context, slm_notifications.proxies.Commitment _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "SLM_Notifications.AuditCommitment_GetAuditRecord", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditEscalation_AfterCommit(IContext context, slm_notifications.proxies.Escalation _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "SLM_Notifications.AuditEscalation_AfterCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean auditEscalation_AfterDelete(IContext context, slm_notifications.proxies.Escalation _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.AuditEscalation_AfterDelete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean autoCloseEscalationValidation(IContext context, slm_notifications.proxies.AutoCloseEscalation _autoCloseEscalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AutoCloseEscalation", _autoCloseEscalation == null ? null : _autoCloseEscalation.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.AutoCloseEscalationValidation", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean autoCloseEscalationValidationSendToNobody(IContext context, slm_notifications.proxies.AutoCloseEscalation _autoCloseEscalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AutoCloseEscalation", _autoCloseEscalation == null ? null : _autoCloseEscalation.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.AutoCloseEscalationValidationSendToNobody", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cancelAddEscalations(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "SLM_Notifications.CancelAddEscalations", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean check_EscalationInUse(IContext context, slm_notifications.proxies.SLMEscalation _sLMEscalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SLMEscalation", _sLMEscalation == null ? null : _sLMEscalation.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.Check_EscalationInUse", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean commitmentValidations(IContext context, slm_notifications.proxies.Commitment _commitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Commitment", _commitment == null ? null : _commitment.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.CommitmentValidations", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyCommitment(IContext context, slm_notifications.proxies.Commitment _commitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Commitment", _commitment == null ? null : _commitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.CopyCommitment", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyCommitmentList(IContext context, java.util.List<slm_notifications.proxies.Commitment> _commitmentList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_commitmentList = null;
			if (_commitmentList != null)
			{
				listparam_commitmentList = new java.util.ArrayList<IMendixObject>();
				for (slm_notifications.proxies.Commitment obj : _commitmentList)
					listparam_commitmentList.add(obj.getMendixObject());
			}
			params.put("CommitmentList", listparam_commitmentList);
			Core.execute(context, "SLM_Notifications.CopyCommitmentList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String fieldEscalationByStr(IContext context, slm_notifications.proxies.SLMEscalation _escalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Escalation", _escalation == null ? null : _escalation.getMendixObject());
			return (java.lang.String)Core.execute(context, "SLM_Notifications.FieldEscalationByStr", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * Incident 3757:
	 * When changing an escalation property or text, the changes will affect all related commitments to this  escalations.
	 */
	public static void iVK_EditResolveEscalation(IContext context, slm_notifications.proxies.Commitment _inputCommitment, slm_notifications.proxies.Resolve_Escalation _inputResolve_Escalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InputCommitment", _inputCommitment == null ? null : _inputCommitment.getMendixObject());
			params.put("InputResolve_Escalation", _inputResolve_Escalation == null ? null : _inputResolve_Escalation.getMendixObject());
			Core.execute(context, "SLM_Notifications.IVK_EditResolveEscalation", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * Incident 3757:
	 * When changing an escalation property or text, the changes will affect all related commitments to this  escalations.
	 * 
	 */
	public static void iVK_EditResponseEscalation(IContext context, slm_notifications.proxies.Commitment _commitment, slm_notifications.proxies.Response_Escalation _response_Escalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Commitment", _commitment == null ? null : _commitment.getMendixObject());
			params.put("Response_Escalation", _response_Escalation == null ? null : _response_Escalation.getMendixObject());
			Core.execute(context, "SLM_Notifications.IVK_EditResponseEscalation", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_NewResolveEscalation(IContext context, slm_notifications.proxies.Commitment _inputCommitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InputCommitment", _inputCommitment == null ? null : _inputCommitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.IVK_NewResolveEscalation", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_NewResponseEscalation(IContext context, slm_notifications.proxies.Commitment _inputCommitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InputCommitment", _inputCommitment == null ? null : _inputCommitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.IVK_NewResponseEscalation", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SelectResolveMessagePercentage(IContext context, slm_notifications.proxies.Commitment _inputCommitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InputCommitment", _inputCommitment == null ? null : _inputCommitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.IVK_SelectResolveMessagePercentage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SelectResponseMessagePercentage(IContext context, slm_notifications.proxies.Commitment _inputCommitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InputCommitment", _inputCommitment == null ? null : _inputCommitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.IVK_SelectResponseMessagePercentage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void removeUnusedEscalations(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "SLM_Notifications.RemoveUnusedEscalations", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void selectResolveEscalationPercentage(IContext context, java.util.List<slm_notifications.proxies.Resolve_Escalation> _inputResolve_EscalationList, slm_notifications.proxies.Commitment _inputCommitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_inputResolve_EscalationList = null;
			if (_inputResolve_EscalationList != null)
			{
				listparam_inputResolve_EscalationList = new java.util.ArrayList<IMendixObject>();
				for (slm_notifications.proxies.Resolve_Escalation obj : _inputResolve_EscalationList)
					listparam_inputResolve_EscalationList.add(obj.getMendixObject());
			}
			params.put("InputResolve_EscalationList", listparam_inputResolve_EscalationList);
			params.put("InputCommitment", _inputCommitment == null ? null : _inputCommitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.SelectResolveEscalationPercentage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void selectResponseEscalationPercentage(IContext context, java.util.List<slm_notifications.proxies.Response_Escalation> _inputResponse_EscalationList, slm_notifications.proxies.Commitment _inputCommitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_inputResponse_EscalationList = null;
			if (_inputResponse_EscalationList != null)
			{
				listparam_inputResponse_EscalationList = new java.util.ArrayList<IMendixObject>();
				for (slm_notifications.proxies.Response_Escalation obj : _inputResponse_EscalationList)
					listparam_inputResponse_EscalationList.add(obj.getMendixObject());
			}
			params.put("InputResponse_EscalationList", listparam_inputResponse_EscalationList);
			params.put("InputCommitment", _inputCommitment == null ? null : _inputCommitment.getMendixObject());
			Core.execute(context, "SLM_Notifications.SelectResponseEscalationPercentage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean setTimesFromString(IContext context, slm_notifications.proxies.Commitment _commitment)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Commitment", _commitment == null ? null : _commitment.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.SetTimesFromString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sLMEscalationValidationAndSetDurationString(IContext context, slm_notifications.proxies.SLMEscalation _sLMEscalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SLMEscalation", _sLMEscalation == null ? null : _sLMEscalation.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.SLMEscalationValidationAndSetDurationString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sLMEscalationValidationSendToNobody(IContext context, slm_notifications.proxies.SLMEscalation _escalation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Escalation", _escalation == null ? null : _escalation.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "SLM_Notifications.SLMEscalationValidationSendToNobody", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}