package org.egov.ewst.util;

public class ErrorConstants {

	private ErrorConstants() {
	}

	public static final String EG_PT_REQUESTINFO_Key = "No RequestInfo";
	public static final String EG_PT_REQUESTINFO_MSG = "RequestInfo is mandatory for RequestInfo";

	public static final String INVALID_TENANT_ID_MDMS_KEY = "INVALID TENANTID";
	public static final String INVALID_TENANT_ID_MDMS_MSG = "No data found for this tenentID";

	public static final String MISSING_ROLE_USERID_CODE = "USERID_ROLECODE_MISSING";
	public static final String MISSING_ROLE_USERID_MSG = "User id, tenantid and rolecode are mandatory in the request info";

	public static final String MISSING_REQ_INFO_CODE = "REQ_INFO_MISSING";
	public static final String MISSING_REQ_INFO_MSG = "RequestInfo is mandatory in the request.";

	public static final String MISSING_USR_INFO_CODE = "USR_INFO_MISSING";
	public static final String MISSING_USR_INFO_MSG = "UserIndfo is mandatory within the RequestInfo.";

}
