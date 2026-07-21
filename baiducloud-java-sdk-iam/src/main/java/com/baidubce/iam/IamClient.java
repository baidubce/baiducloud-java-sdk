package com.baidubce.iam;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.auth.SignOptions;
import com.baidubce.util.RequestBodyUtils;
import java.util.Arrays;
import java.util.HashSet;
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.iam.models.AddUserToGroupRequest;
import com.baidubce.iam.models.AssociateGroupPermissionsRequest;
import com.baidubce.iam.models.AssociateRolePermissionsRequest;
import com.baidubce.iam.models.AssociateUserPermissionsRequest;
import com.baidubce.iam.models.ChangeSubUserPasswordRequest;
import com.baidubce.iam.models.CreateAccessKeyRequest;
import com.baidubce.iam.models.CreateApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.CreateApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.CreateGroupRequest;
import com.baidubce.iam.models.CreateRoleRequest;
import com.baidubce.iam.models.CreateStrategyRequest;
import com.baidubce.iam.models.CreateUserRequest;
import com.baidubce.iam.models.DecodingApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.DecodingApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.DeleteAccessKeyRequest;
import com.baidubce.iam.models.DeleteApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.DeleteApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.DeleteGroupRequest;
import com.baidubce.iam.models.DeleteLoginProfileRequest;
import com.baidubce.iam.models.DeleteRoleRequest;
import com.baidubce.iam.models.DeleteStrategyRequest;
import com.baidubce.iam.models.DeleteUserRequest;
import com.baidubce.iam.models.DisableAccessKeyRequest;
import com.baidubce.iam.models.EnableAccessKeyRequest;
import com.baidubce.iam.models.GetLoginProfileRequest;
import com.baidubce.iam.models.GetSessionApiKeyRequest;
import com.baidubce.iam.models.GetSessionApiKeyResponse;
import com.baidubce.iam.models.GetUserRequest;
import com.baidubce.iam.models.ListAccessKeyRequest;
import com.baidubce.iam.models.ListAccessKeyResponse;
import com.baidubce.iam.models.ListAllSubjectsGrantedPermissionsRequest;
import com.baidubce.iam.models.ListAllSubjectsGrantedPermissionsResponse;
import com.baidubce.iam.models.ListGroupsResponse;
import com.baidubce.iam.models.ListRolesResponse;
import com.baidubce.iam.models.ListStrategiesRequest;
import com.baidubce.iam.models.ListStrategiesResponse;
import com.baidubce.iam.models.ListThePermissionsOfRolesRequest;
import com.baidubce.iam.models.ListThePermissionsOfRolesResponse;
import com.baidubce.iam.models.ListThePermissionsOfTheGroupRequest;
import com.baidubce.iam.models.ListThePermissionsOfTheGroupResponse;
import com.baidubce.iam.models.ListTheSubjectsGrantedPermissionsRequest;
import com.baidubce.iam.models.ListTheSubjectsGrantedPermissionsResponse;
import com.baidubce.iam.models.ListTheUserSPermissionsRequest;
import com.baidubce.iam.models.ListTheUserSPermissionsResponse;
import com.baidubce.iam.models.ListUserGroupsRequest;
import com.baidubce.iam.models.ListUserGroupsResponse;
import com.baidubce.iam.models.ListUserResponse;
import com.baidubce.iam.models.ListUsersWithinTheGroupRequest;
import com.baidubce.iam.models.ListUsersWithinTheGroupResponse;
import com.baidubce.iam.models.ModifySubUserOperationProtectionRequest;
import com.baidubce.iam.models.ObtainAListOfPermanentlyValidApikeysRequest;
import com.baidubce.iam.models.ObtainAListOfPermanentlyValidApikeysResponse;
import com.baidubce.iam.models.QueryApikeyDetailsPermanentlyValidRequest;
import com.baidubce.iam.models.QueryApikeyDetailsPermanentlyValidResponse;
import com.baidubce.iam.models.QueryGroupRequest;
import com.baidubce.iam.models.QueryRoleRequest;
import com.baidubce.iam.models.QueryStrategyRequest;
import com.baidubce.iam.models.QuerySubUserIdpResponse;
import com.baidubce.iam.models.QuerySummaryOfMainAccountResponse;
import com.baidubce.iam.models.QueryTheLastUsageTimeOfAccesskeyRequest;
import com.baidubce.iam.models.QueryTheLastUsageTimeOfAccesskeyResponse;
import com.baidubce.iam.models.RemoveGroupPermissionsRequest;
import com.baidubce.iam.models.RemoveRolePermissionsRequest;
import com.baidubce.iam.models.RemoveUserFromTheGroupRequest;
import com.baidubce.iam.models.RemoveUserPermissionsRequest;
import com.baidubce.iam.models.UnbindSubUserVirtualMfaRequest;
import com.baidubce.iam.models.UpdateApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.UpdateApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.UpdateGroupRequest;
import com.baidubce.iam.models.UpdateLoginProfileRequest;
import com.baidubce.iam.models.UpdateRoleRequest;
import com.baidubce.iam.models.UpdateStrategyRequest;
import com.baidubce.iam.models.UpdateSubUserIdpRequest;
import com.baidubce.iam.models.UpdateSubUserIdpResponse;
import com.baidubce.iam.models.UpdateSubUserIdpStatusRequest;
import com.baidubce.iam.models.UpdateSubUserIdpStatusResponse;
import com.baidubce.iam.models.UpdateUserRequest;

public class IamClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_ACCOUNT = "account";
    private static final String CONSTANT_SUMMARY = "summary";
    private static final String CONSTANT_POLICY = "policy";
    private static final String CONSTANT_ROLE = "role";
    private static final String CONSTANT_APIKEY = "apikey";
    private static final String CONSTANT_CREATE = "create";
    private static final String CONSTANT_ENTITY = "entity";
    private static final String CONSTANT_SUB_USER = "subUser";
    private static final String CONSTANT_IDP = "idp";
    private static final String CONSTANT_UPDATE_STATUS = "updateStatus";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_ACCESSKEY = "accesskey";
    private static final String CONSTANT_LASTUSEDTIME = "lastusedtime";
    private static final String CONSTANT_USER = "user";
    private static final String CONSTANT_LOGIN_PROFILE = "loginProfile";
    private static final String CONSTANT_B_C_E__B_E_A_R_E_R = "BCE-BEARER";
    private static final String CONSTANT_TOKEN = "token";
    private static final String CONSTANT_GROUP = "group";
    private static final String CONSTANT_OPERATION = "operation";
    private static final String CONSTANT_MFA = "mfa";
    private static final String CONSTANT_SWITCH = "switch";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_QUERY = "query";
    private static final String CONSTANT_GRANT = "grant";
    private static final String CONSTANT_UPDATE = "update";
    private static final String CONSTANT_DETAIL = "detail";
    private static final String CONSTANT_MFA_TYPE = "mfaType";
    private static final String CONSTANT_DECRYPT = "decrypt";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public IamClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public IamClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addUserToGroup
     * 
     * @param request 入参结构体
     */
    public void addUserToGroup(AddUserToGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_GROUP, request.getGroupName(), CONSTANT_USER, request.getUserName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * associateGroupPermissions
     * 
     * @param request 入参结构体
     */
    public void associateGroupPermissions(AssociateGroupPermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_GROUP, request.getGroupName(), CONSTANT_POLICY, request.getPolicyName());
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * associateRolePermissions
     * 
     * @param request 入参结构体
     */
    public void associateRolePermissions(AssociateRolePermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ROLE, request.getRoleName(), CONSTANT_POLICY, request.getPolicyName());
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * associateUserPermissions
     * 
     * @param request 入参结构体
     */
    public void associateUserPermissions(AssociateUserPermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_POLICY, request.getPolicyName());
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * changeSubUserPassword
     * 
     * @param request 入参结构体
     */
    public void changeSubUserPassword(ChangeSubUserPasswordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SUB_USER, request.getUserName(), CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAccessKey
     * 
     * @param request 入参结构体
     */
    public void createAccessKey(CreateAccessKeyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_ACCESSKEY);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createApikeyPermanentlyValid
     * 
     * @param request 入参结构体
     * @return CreateApikeyPermanentlyValidResponse
     */
    public CreateApikeyPermanentlyValidResponse createApikeyPermanentlyValid(CreateApikeyPermanentlyValidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APIKEY, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateApikeyPermanentlyValidResponse.class);
    }

    /**
     * createGroup
     * 
     * @param request 入参结构体
     */
    public void createGroup(CreateGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_GROUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createRole
     * 
     * @param request 入参结构体
     */
    public void createRole(CreateRoleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ROLE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createStrategy
     * 
     * @param request 入参结构体
     */
    public void createStrategy(CreateStrategyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_POLICY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createUser
     * 
     * @param request 入参结构体
     */
    public void createUser(CreateUserRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_USER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * decodingApikeyPermanentlyValid
     * 
     * @param request 入参结构体
     * @return DecodingApikeyPermanentlyValidResponse
     */
    public DecodingApikeyPermanentlyValidResponse decodingApikeyPermanentlyValid(DecodingApikeyPermanentlyValidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APIKEY, CONSTANT_DECRYPT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DecodingApikeyPermanentlyValidResponse.class);
    }

    /**
     * deleteAccessKey
     * 
     * @param request 入参结构体
     */
    public void deleteAccessKey(DeleteAccessKeyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_ACCESSKEY, request.getAccessKeyId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteApikeyPermanentlyValid
     * 
     * @param request 入参结构体
     * @return DeleteApikeyPermanentlyValidResponse
     */
    public DeleteApikeyPermanentlyValidResponse deleteApikeyPermanentlyValid(DeleteApikeyPermanentlyValidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APIKEY, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteApikeyPermanentlyValidResponse.class);
    }

    /**
     * deleteGroup
     * 
     * @param request 入参结构体
     */
    public void deleteGroup(DeleteGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_GROUP, request.getGroupName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteLoginProfile
     * 
     * @param request 入参结构体
     */
    public void deleteLoginProfile(DeleteLoginProfileRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_LOGIN_PROFILE);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRole
     * 
     * @param request 入参结构体
     */
    public void deleteRole(DeleteRoleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ROLE, request.getRoleName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteStrategy
     * 
     * @param request 入参结构体
     */
    public void deleteStrategy(DeleteStrategyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_POLICY, request.getPolicyName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSubUserIdp
     * 
     */
    public void deleteSubUserIdp() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, VERSION_V1, CONSTANT_SUB_USER, CONSTANT_IDP, CONSTANT_DELETE);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteUser
     * 
     * @param request 入参结构体
     */
    public void deleteUser(DeleteUserRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_USER, request.getUserName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disableAccessKey
     * 
     * @param request 入参结构体
     */
    public void disableAccessKey(DisableAccessKeyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_ACCESSKEY, request.getAccessKeyId());
        internalRequest.addParameter("disable", null);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * enableAccessKey
     * 
     * @param request 入参结构体
     */
    public void enableAccessKey(EnableAccessKeyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_ACCESSKEY, request.getAccessKeyId());
        internalRequest.addParameter("enable", null);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getLoginProfile
     * 
     * @param request 入参结构体
     */
    public void getLoginProfile(GetLoginProfileRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_LOGIN_PROFILE);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getSessionApiKey
     * 
     * @param request 入参结构体
     * @return GetSessionApiKeyResponse
     */
    public GetSessionApiKeyResponse getSessionApiKey(GetSessionApiKeyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_B_C_E__B_E_A_R_E_R, CONSTANT_TOKEN);
        if (request.getExpireInSeconds() != null) {
            internalRequest.addParameter("expireInSeconds", String.valueOf(request.getExpireInSeconds()));
        }
        if (request.getAcl() != null) {
            internalRequest.addParameter("acl", request.getAcl());
        }
        return invokeHttpClient(internalRequest, GetSessionApiKeyResponse.class);
    }

    /**
     * getUser
     * 
     * @param request 入参结构体
     */
    public void getUser(GetUserRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_USER, request.getUserName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * listAccessKey
     * 
     * @param request 入参结构体
     * @return ListAccessKeyResponse
     */
    public ListAccessKeyResponse listAccessKey(ListAccessKeyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_ACCESSKEY);
        return invokeHttpClient(internalRequest, ListAccessKeyResponse.class);
    }

    /**
     * listAllSubjectsGrantedPermissions
     * 
     * @param request 入参结构体
     * @return ListAllSubjectsGrantedPermissionsResponse
     */
    public ListAllSubjectsGrantedPermissionsResponse listAllSubjectsGrantedPermissions(ListAllSubjectsGrantedPermissionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_POLICY, request.getPolicyId(), CONSTANT_ENTITY);
        return invokeHttpClient(internalRequest, ListAllSubjectsGrantedPermissionsResponse.class);
    }

    /**
     * listGroups
     * 
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_GROUP);
        return invokeHttpClient(internalRequest, ListGroupsResponse.class);
    }

    /**
     * listRoles
     * 
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_ROLE);
        return invokeHttpClient(internalRequest, ListRolesResponse.class);
    }

    /**
     * listStrategies
     * 
     * @param request 入参结构体
     * @return ListStrategiesResponse
     */
    public ListStrategiesResponse listStrategies(ListStrategiesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_POLICY);
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        if (request.getNameFilter() != null) {
            internalRequest.addParameter("nameFilter", request.getNameFilter());
        }
        return invokeHttpClient(internalRequest, ListStrategiesResponse.class);
    }

    /**
     * listThePermissionsOfRoles
     * 
     * @param request 入参结构体
     * @return ListThePermissionsOfRolesResponse
     */
    public ListThePermissionsOfRolesResponse listThePermissionsOfRoles(ListThePermissionsOfRolesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ROLE, request.getRoleName(), CONSTANT_POLICY);
        return invokeHttpClient(internalRequest, ListThePermissionsOfRolesResponse.class);
    }

    /**
     * listThePermissionsOfTheGroup
     * 
     * @param request 入参结构体
     * @return ListThePermissionsOfTheGroupResponse
     */
    public ListThePermissionsOfTheGroupResponse listThePermissionsOfTheGroup(ListThePermissionsOfTheGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_GROUP, request.getGroupName(), CONSTANT_POLICY);
        return invokeHttpClient(internalRequest, ListThePermissionsOfTheGroupResponse.class);
    }

    /**
     * listTheSubjectsGrantedPermissions
     * 
     * @param request 入参结构体
     * @return ListTheSubjectsGrantedPermissionsResponse
     */
    public ListTheSubjectsGrantedPermissionsResponse listTheSubjectsGrantedPermissions(ListTheSubjectsGrantedPermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_POLICY, request.getPolicyId(), CONSTANT_GRANT, request.getGrantType());
        return invokeHttpClient(internalRequest, ListTheSubjectsGrantedPermissionsResponse.class);
    }

    /**
     * listTheUserSPermissions
     * 
     * @param request 入参结构体
     * @return ListTheUserSPermissionsResponse
     */
    public ListTheUserSPermissionsResponse listTheUserSPermissions(ListTheUserSPermissionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_POLICY);
        return invokeHttpClient(internalRequest, ListTheUserSPermissionsResponse.class);
    }

    /**
     * listUser
     * 
     * @return ListUserResponse
     */
    public ListUserResponse listUser() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_USER);
        return invokeHttpClient(internalRequest, ListUserResponse.class);
    }

    /**
     * listUserGroups
     * 
     * @param request 入参结构体
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_GROUP);
        return invokeHttpClient(internalRequest, ListUserGroupsResponse.class);
    }

    /**
     * listUsersWithinTheGroup
     * 
     * @param request 入参结构体
     * @return ListUsersWithinTheGroupResponse
     */
    public ListUsersWithinTheGroupResponse listUsersWithinTheGroup(ListUsersWithinTheGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_GROUP, request.getGroupName(), CONSTANT_USER);
        return invokeHttpClient(internalRequest, ListUsersWithinTheGroupResponse.class);
    }

    /**
     * modifySubUserOperationProtection
     * 
     * @param request 入参结构体
     */
    public void modifySubUserOperationProtection(ModifySubUserOperationProtectionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_USER, CONSTANT_OPERATION, CONSTANT_MFA, CONSTANT_SWITCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * obtainAListOfPermanentlyValidApikeys
     * 
     * @param request 入参结构体
     * @return ObtainAListOfPermanentlyValidApikeysResponse
     */
    public ObtainAListOfPermanentlyValidApikeysResponse obtainAListOfPermanentlyValidApikeys(ObtainAListOfPermanentlyValidApikeysRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APIKEY, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ObtainAListOfPermanentlyValidApikeysResponse.class);
    }

    /**
     * queryApikeyDetailsPermanentlyValid
     * 
     * @param request 入参结构体
     * @return QueryApikeyDetailsPermanentlyValidResponse
     */
    public QueryApikeyDetailsPermanentlyValidResponse queryApikeyDetailsPermanentlyValid(QueryApikeyDetailsPermanentlyValidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APIKEY, CONSTANT_DETAIL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, QueryApikeyDetailsPermanentlyValidResponse.class);
    }

    /**
     * queryGroup
     * 
     * @param request 入参结构体
     */
    public void queryGroup(QueryGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_GROUP, request.getGroupName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryRole
     * 
     * @param request 入参结构体
     */
    public void queryRole(QueryRoleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ROLE, request.getRoleName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryStrategy
     * 
     * @param request 入参结构体
     */
    public void queryStrategy(QueryStrategyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_POLICY, request.getPolicyName());
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * querySubUserIdp
     * 
     * @return QuerySubUserIdpResponse
     */
    public QuerySubUserIdpResponse querySubUserIdp() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_SUB_USER, CONSTANT_IDP, CONSTANT_QUERY);
        return invokeHttpClient(internalRequest, QuerySubUserIdpResponse.class);
    }

    /**
     * querySummaryOfMainAccount
     * 
     * @return QuerySummaryOfMainAccountResponse
     */
    public QuerySummaryOfMainAccountResponse querySummaryOfMainAccount() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_ACCOUNT, CONSTANT_SUMMARY);
        return invokeHttpClient(internalRequest, QuerySummaryOfMainAccountResponse.class);
    }

    /**
     * queryTheLastUsageTimeOfAccesskey
     * 
     * @param request 入参结构体
     * @return QueryTheLastUsageTimeOfAccesskeyResponse
     */
    public QueryTheLastUsageTimeOfAccesskeyResponse queryTheLastUsageTimeOfAccesskey(QueryTheLastUsageTimeOfAccesskeyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ACCESSKEY, request.getAccessKeyId(), CONSTANT_LASTUSEDTIME);
        return invokeHttpClient(internalRequest, QueryTheLastUsageTimeOfAccesskeyResponse.class);
    }

    /**
     * removeGroupPermissions
     * 
     * @param request 入参结构体
     */
    public void removeGroupPermissions(RemoveGroupPermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_GROUP, request.getGroupName(), CONSTANT_POLICY, request.getPolicyName());
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeRolePermissions
     * 
     * @param request 入参结构体
     */
    public void removeRolePermissions(RemoveRolePermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ROLE, request.getRoleName(), CONSTANT_POLICY, request.getPolicyName());
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeUserFromTheGroup
     * 
     * @param request 入参结构体
     */
    public void removeUserFromTheGroup(RemoveUserFromTheGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_GROUP, request.getGroupName(), CONSTANT_USER, request.getUserName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeUserPermissions
     * 
     * @param request 入参结构体
     */
    public void removeUserPermissions(RemoveUserPermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_POLICY, request.getPolicyName());
        if (request.getPolicyType() != null) {
            internalRequest.addParameter("policyType", request.getPolicyType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindSubUserVirtualMfa
     * 
     * @param request 入参结构体
     */
    public void unbindSubUserVirtualMfa(UnbindSubUserVirtualMfaRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_MFA_TYPE, request.getMfaType());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateApikeyPermanentlyValid
     * 
     * @param request 入参结构体
     * @return UpdateApikeyPermanentlyValidResponse
     */
    public UpdateApikeyPermanentlyValidResponse updateApikeyPermanentlyValid(UpdateApikeyPermanentlyValidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APIKEY, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateApikeyPermanentlyValidResponse.class);
    }

    /**
     * updateGroup
     * 
     * @param request 入参结构体
     */
    public void updateGroup(UpdateGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_GROUP, request.getGroupName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateLoginProfile
     * 
     * @param request 入参结构体
     */
    public void updateLoginProfile(UpdateLoginProfileRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_USER, request.getUserName(), CONSTANT_LOGIN_PROFILE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRole
     * 
     * @param request 入参结构体
     */
    public void updateRole(UpdateRoleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ROLE, request.getRoleName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateStrategy
     * 
     * @param request 入参结构体
     */
    public void updateStrategy(UpdateStrategyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_POLICY, request.getPolicyName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSubUserIdp
     * 
     * @param request 入参结构体
     * @return UpdateSubUserIdpResponse
     */
    public UpdateSubUserIdpResponse updateSubUserIdp(UpdateSubUserIdpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SUB_USER, CONSTANT_IDP, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateSubUserIdpResponse.class);
    }

    /**
     * updateSubUserIdpStatus
     * 
     * @param request 入参结构体
     * @return UpdateSubUserIdpStatusResponse
     */
    public UpdateSubUserIdpStatusResponse updateSubUserIdpStatus(UpdateSubUserIdpStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SUB_USER, CONSTANT_IDP, CONSTANT_UPDATE_STATUS);
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        return invokeHttpClient(internalRequest, UpdateSubUserIdpStatusResponse.class);
    }

    /**
     * updateUser
     * 
     * @param request 入参结构体
     */
    public void updateUser(UpdateUserRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_USER, request.getUserName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
    * Creates and initializes a new request object for the specified resource.
    *
    * @param bceRequest    The original BCE request created by the user.
    * @param httpMethod    The HTTP method to use when sending the request.
    * @param pathVariables The optional variables used in the URI path.
    * @return A new request object populated with endpoint, resource path and specific
    *         parameters to send.
    */
    protected InternalRequest createRequest(AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
        return super.createRequest(bceRequest, httpMethod, createSignOptions(), pathVariables);
    }

    /**
    * 创建签名选项
    *
    * @return 配置了服务所需签名头的 SignOptions
    */
    private SignOptions createSignOptions() {
        SignOptions signOptions = new SignOptions();
        signOptions.setHeadersToSign(new HashSet<String>(Arrays.asList(HEADERS_TO_SIGN)));
        return signOptions;
    }
}
