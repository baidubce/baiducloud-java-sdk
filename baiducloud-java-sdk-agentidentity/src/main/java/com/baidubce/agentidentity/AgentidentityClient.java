package com.baidubce.agentidentity;

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
import com.baidubce.common.BaseBceResponse;

import com.baidubce.agentidentity.models.AuthorizeEndpointRequest;
import com.baidubce.agentidentity.models.BatchAcquisitionOfUsersRequest;
import com.baidubce.agentidentity.models.BatchGetResourceApiKeyRequest;
import com.baidubce.agentidentity.models.BatchGetResourceApiKeyResponse;
import com.baidubce.agentidentity.models.CompleteOauth2sessionRequest;
import com.baidubce.agentidentity.models.CreateAgentRequest;
import com.baidubce.agentidentity.models.CreateCredentialProviderRequest;
import com.baidubce.agentidentity.models.CreateIdpConfigurationRequest;
import com.baidubce.agentidentity.models.CreateOauth2ClientRequest;
import com.baidubce.agentidentity.models.CreateUserPoolRequest;
import com.baidubce.agentidentity.models.CreateUserRequest;
import com.baidubce.agentidentity.models.DeleteAgentRequest;
import com.baidubce.agentidentity.models.DeleteCredentialProviderRequest;
import com.baidubce.agentidentity.models.DeleteIdpConfigurationRequest;
import com.baidubce.agentidentity.models.DeleteOauth2ClientRequest;
import com.baidubce.agentidentity.models.DeleteUserPoolRequest;
import com.baidubce.agentidentity.models.DeleteUserRequest;
import com.baidubce.agentidentity.models.DisableIdpConfigurationRequest;
import com.baidubce.agentidentity.models.EnableIdpConfigurationRequest;
import com.baidubce.agentidentity.models.GetAgentRequest;
import com.baidubce.agentidentity.models.GetCredentialProviderRequest;
import com.baidubce.agentidentity.models.GetIdpConfigurationRequest;
import com.baidubce.agentidentity.models.GetOauth2ClientRequest;
import com.baidubce.agentidentity.models.GetResourceApikeyRequest;
import com.baidubce.agentidentity.models.GetResourceOauth2tokenRequest;
import com.baidubce.agentidentity.models.GetUserPoolRequest;
import com.baidubce.agentidentity.models.GetUserRequest;
import com.baidubce.agentidentity.models.GetWATForUserRequest;
import com.baidubce.agentidentity.models.GetWorkloadAccessTokenRequest;
import com.baidubce.agentidentity.models.ListAgentsRequest;
import com.baidubce.agentidentity.models.ListAgentsResponse;
import com.baidubce.agentidentity.models.ListCredentialProvidersRequest;
import com.baidubce.agentidentity.models.ListCredentialProvidersResponse;
import com.baidubce.agentidentity.models.ListIdpConfigurationsRequest;
import com.baidubce.agentidentity.models.ListIdpConfigurationsResponse;
import com.baidubce.agentidentity.models.ListOauth2ClientsRequest;
import com.baidubce.agentidentity.models.ListOauth2ClientsResponse;
import com.baidubce.agentidentity.models.ListUserPoolsRequest;
import com.baidubce.agentidentity.models.ListUserPoolsResponse;
import com.baidubce.agentidentity.models.ListUsersRequest;
import com.baidubce.agentidentity.models.ListUsersResponse;
import com.baidubce.agentidentity.models.OIDCDiscoveryRequest;
import com.baidubce.agentidentity.models.Oauth2idpCallbackRequest;
import com.baidubce.agentidentity.models.ResetPasswordRequest;
import com.baidubce.agentidentity.models.TokenEndpointRequest;
import com.baidubce.agentidentity.models.UpdateAgentRequest;
import com.baidubce.agentidentity.models.UpdateCredentialProviderRequest;
import com.baidubce.agentidentity.models.UpdateIdpConfigurationRequest;
import com.baidubce.agentidentity.models.UpdateOauth2ClientRequest;
import com.baidubce.agentidentity.models.UpdateUserPoolRequest;
import com.baidubce.agentidentity.models.UpdateUserRequest;
import com.baidubce.agentidentity.models.UserinfoEndpointRequest;
import com.baidubce.agentidentity.models.UserinfoEndpointResponse;

public class AgentidentityClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_AGENT_IDENTITY = "agent-identity";
    private static final String CONSTANT_WORKLOAD_ACCESS_TOKEN = "workload-access-token";
    private static final String CONSTANT_AGENT = "agent";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_USER_POOL = "user-pool";
    private static final String CONSTANT_USER = "user";
    private static final String CONSTANT_RESET_PASSWORD = "resetPassword";
    private static final String CONSTANT_OAUTH2_CLIENT = "oauth2-client";
    private static final String CONSTANT_GET = "get";
    private static final String CONSTANT_UPDATE = "update";
    private static final String CONSTANT_CREDENTIAL = "credential";
    private static final String CONSTANT_APIKEY = "apikey";
    private static final String CONSTANT_BATCH = "batch";
    private static final String CONSTANT_IDP_CONFIG = "idp-config";
    private static final String CONSTANT_CREATE = "create";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_CREDENTIAL_PROVIDER = "credential-provider";
    private static final String CONSTANT_INBOUND = "inbound";
    private static final String CONSTANT_TOKEN = "token";
    private static final String CONSTANT_WORKLOAD_ACCESS_TOKEN_FOR_USER = "workload-access-token-for-user";
    private static final String CONSTANT_OAUTH2 = "oauth2";
    private static final String CONSTANT_CALLBACK = "callback";
    private static final String CONSTANT_WELL_KNOWN = ".well-known";
    private static final String CONSTANT_OPENID_CONFIGURATION = "openid-configuration";
    private static final String CONSTANT_ENABLE = "enable";
    private static final String CONSTANT_USERINFO = "userinfo";
    private static final String CONSTANT_AUTHORIZE = "authorize";
    private static final String CONSTANT_COMPLETE_AUTH = "complete-auth";
    private static final String CONSTANT_DISABLE = "disable";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public AgentidentityClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public AgentidentityClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * authorizeEndpoint
     * 
     * @param request 入参结构体
     */
    public void authorizeEndpoint(AuthorizeEndpointRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_INBOUND, request.getUserPoolId(), CONSTANT_AUTHORIZE);
        if (request.getClientId() != null) {
            internalRequest.addParameter("client_id", request.getClientId());
        }
        if (request.getRedirectUri() != null) {
            internalRequest.addParameter("redirect_uri", request.getRedirectUri());
        }
        if (request.getResponseType() != null) {
            internalRequest.addParameter("response_type", request.getResponseType());
        }
        if (request.getScope() != null) {
            internalRequest.addParameter("scope", request.getScope());
        }
        if (request.getState() != null) {
            internalRequest.addParameter("state", request.getState());
        }
        if (request.getNonce() != null) {
            internalRequest.addParameter("nonce", request.getNonce());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchAcquisitionOfUsers
     * 
     * @param request 入参结构体
     */
    public void batchAcquisitionOfUsers(BatchAcquisitionOfUsersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_USER, CONSTANT_BATCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchGetResourceApiKey
     * 
     * @param request 入参结构体
     * @return BatchGetResourceApiKeyResponse
     */
    public BatchGetResourceApiKeyResponse batchGetResourceApiKey(BatchGetResourceApiKeyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL, CONSTANT_APIKEY, CONSTANT_BATCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchGetResourceApiKeyResponse.class);
    }

    /**
     * completeOauth2session
     * 
     * @param request 入参结构体
     */
    public void completeOauth2session(CompleteOauth2sessionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_OAUTH2, CONSTANT_COMPLETE_AUTH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAgent
     * 
     * @param request 入参结构体
     */
    public void createAgent(CreateAgentRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_AGENT, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createCredentialProvider
     * 
     * @param request 入参结构体
     */
    public void createCredentialProvider(CreateCredentialProviderRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL_PROVIDER, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createIdpConfiguration
     * 
     * @param request 入参结构体
     */
    public void createIdpConfiguration(CreateIdpConfigurationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_IDP_CONFIG, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createOauth2Client
     * 
     * @param request 入参结构体
     */
    public void createOauth2Client(CreateOauth2ClientRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_OAUTH2_CLIENT, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createUser
     * 
     * @param request 入参结构体
     */
    public void createUser(CreateUserRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_USER, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createUserPool
     * 
     * @param request 入参结构体
     */
    public void createUserPool(CreateUserPoolRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAgent
     * 
     * @param request 入参结构体
     */
    public void deleteAgent(DeleteAgentRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_AGENT, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteCredentialProvider
     * 
     * @param request 入参结构体
     */
    public void deleteCredentialProvider(DeleteCredentialProviderRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL_PROVIDER, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIdpConfiguration
     * 
     * @param request 入参结构体
     */
    public void deleteIdpConfiguration(DeleteIdpConfigurationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_IDP_CONFIG, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteOauth2Client
     * 
     * @param request 入参结构体
     */
    public void deleteOauth2Client(DeleteOauth2ClientRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_OAUTH2_CLIENT, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteUser
     * 
     * @param request 入参结构体
     */
    public void deleteUser(DeleteUserRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_USER, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteUserPool
     * 
     * @param request 入参结构体
     */
    public void deleteUserPool(DeleteUserPoolRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disableIdpConfiguration
     * 
     * @param request 入参结构体
     */
    public void disableIdpConfiguration(DisableIdpConfigurationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_IDP_CONFIG, CONSTANT_DISABLE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * enableIdpConfiguration
     * 
     * @param request 入参结构体
     */
    public void enableIdpConfiguration(EnableIdpConfigurationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_IDP_CONFIG, CONSTANT_ENABLE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getAgent
     * 
     * @param request 入参结构体
     */
    public void getAgent(GetAgentRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_AGENT, CONSTANT_GET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getCredentialProvider
     * 
     * @param request 入参结构体
     */
    public void getCredentialProvider(GetCredentialProviderRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL_PROVIDER, CONSTANT_GET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getIdpConfiguration
     * 
     * @param request 入参结构体
     */
    public void getIdpConfiguration(GetIdpConfigurationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_IDP_CONFIG, CONSTANT_GET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getOauth2Client
     * 
     * @param request 入参结构体
     */
    public void getOauth2Client(GetOauth2ClientRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_OAUTH2_CLIENT, CONSTANT_GET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getResourceApikey
     * 
     * @param request 入参结构体
     */
    public void getResourceApikey(GetResourceApikeyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL, CONSTANT_APIKEY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getResourceOauth2token
     * 
     * @param request 入参结构体
     */
    public void getResourceOauth2token(GetResourceOauth2tokenRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL, CONSTANT_OAUTH2);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getUser
     * 
     * @param request 入参结构体
     */
    public void getUser(GetUserRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_USER, CONSTANT_GET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getUserPool
     * 
     * @param request 入参结构体
     */
    public void getUserPool(GetUserPoolRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_GET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getWATForUser
     * 
     * @param request 入参结构体
     */
    public void getWATForUser(GetWATForUserRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_WORKLOAD_ACCESS_TOKEN_FOR_USER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getWorkloadAccessToken
     * 
     * @param request 入参结构体
     */
    public void getWorkloadAccessToken(GetWorkloadAccessTokenRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_WORKLOAD_ACCESS_TOKEN);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * listAgents
     * 
     * @param request 入参结构体
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_AGENT, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListAgentsResponse.class);
    }

    /**
     * listCredentialProviders
     * 
     * @param request 入参结构体
     * @return ListCredentialProvidersResponse
     */
    public ListCredentialProvidersResponse listCredentialProviders(ListCredentialProvidersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL_PROVIDER, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListCredentialProvidersResponse.class);
    }

    /**
     * listIdpConfigurations
     * 
     * @param request 入参结构体
     * @return ListIdpConfigurationsResponse
     */
    public ListIdpConfigurationsResponse listIdpConfigurations(ListIdpConfigurationsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_IDP_CONFIG, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListIdpConfigurationsResponse.class);
    }

    /**
     * listOauth2Clients
     * 
     * @param request 入参结构体
     * @return ListOauth2ClientsResponse
     */
    public ListOauth2ClientsResponse listOauth2Clients(ListOauth2ClientsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_OAUTH2_CLIENT, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListOauth2ClientsResponse.class);
    }

    /**
     * listUserPools
     * 
     * @param request 入参结构体
     * @return ListUserPoolsResponse
     */
    public ListUserPoolsResponse listUserPools(ListUserPoolsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListUserPoolsResponse.class);
    }

    /**
     * listUsers
     * 
     * @param request 入参结构体
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_USER, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListUsersResponse.class);
    }

    /**
     * oIDCDiscovery
     * 
     * @param request 入参结构体
     */
    public void oIDCDiscovery(OIDCDiscoveryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_AGENT_IDENTITY,
                        CONSTANT_INBOUND,
                        request.getUserPoolId(),
                        CONSTANT_WELL_KNOWN,
                        CONSTANT_OPENID_CONFIGURATION);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * oauth2idpCallback
     * 
     * @param request 入参结构体
     */
    public void oauth2idpCallback(Oauth2idpCallbackRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_OAUTH2, CONSTANT_CALLBACK, request.getProviderId());
        if (request.getCode() != null) {
            internalRequest.addParameter("code", request.getCode());
        }
        if (request.getState() != null) {
            internalRequest.addParameter("state", request.getState());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resetPassword
     * 
     * @param request 入参结构体
     */
    public void resetPassword(ResetPasswordRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_USER, CONSTANT_RESET_PASSWORD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * tokenEndpoint
     * 
     * @param request 入参结构体
     */
    public void tokenEndpoint(TokenEndpointRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_INBOUND, request.getUserPoolId(), CONSTANT_TOKEN);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAgent
     * 
     * @param request 入参结构体
     */
    public void updateAgent(UpdateAgentRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_AGENT, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateCredentialProvider
     * 
     * @param request 入参结构体
     */
    public void updateCredentialProvider(UpdateCredentialProviderRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_CREDENTIAL_PROVIDER, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateIdpConfiguration
     * 
     * @param request 入参结构体
     */
    public void updateIdpConfiguration(UpdateIdpConfigurationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_IDP_CONFIG, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateOauth2Client
     * 
     * @param request 入参结构体
     */
    public void updateOauth2Client(UpdateOauth2ClientRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_OAUTH2_CLIENT, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateUser
     * 
     * @param request 入参结构体
     */
    public void updateUser(UpdateUserRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_USER, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateUserPool
     * 
     * @param request 入参结构体
     */
    public void updateUserPool(UpdateUserPoolRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_USER_POOL, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * userinfoEndpoint
     * 
     * @param request 入参结构体
     * @return UserinfoEndpointResponse
     */
    public UserinfoEndpointResponse userinfoEndpoint(UserinfoEndpointRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_AGENT_IDENTITY, CONSTANT_INBOUND, request.getUserPoolId(), CONSTANT_USERINFO);
        return invokeHttpClient(internalRequest, UserinfoEndpointResponse.class);
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
