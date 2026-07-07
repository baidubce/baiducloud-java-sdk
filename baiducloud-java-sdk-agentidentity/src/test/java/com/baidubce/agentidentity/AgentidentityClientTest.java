package com.baidubce.agentidentity;

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
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for AgentidentityClient
 */
public class AgentidentityClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private AgentidentityClient agentidentityClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        agentidentityClient = new AgentidentityClient(config);
    }

    /**
     * authorizeEndpoint
     *
     */
    @Test
    public void authorizeEndpointTest() {
        AuthorizeEndpointRequest authorizeEndpointRequest = new AuthorizeEndpointRequest();
        authorizeEndpointRequest.setUserPoolId("");
        authorizeEndpointRequest.setClientId("");
        authorizeEndpointRequest.setRedirectUri("");
        authorizeEndpointRequest.setResponseType("");
        authorizeEndpointRequest.setScope("");
        authorizeEndpointRequest.setState("");
        authorizeEndpointRequest.setNonce("");
        agentidentityClient.authorizeEndpoint(authorizeEndpointRequest);
    }
    /**
     * batchAcquisitionOfUsers
     *
     */
    @Test
    public void batchAcquisitionOfUsersTest() {
        BatchAcquisitionOfUsersRequest batchAcquisitionOfUsersRequest = new BatchAcquisitionOfUsersRequest();
        batchAcquisitionOfUsersRequest.setUserPoolId("");
        batchAcquisitionOfUsersRequest.setIds(new ArrayList<>());
        agentidentityClient.batchAcquisitionOfUsers(batchAcquisitionOfUsersRequest);
    }
    /**
     * batchGetResourceApiKey
     *
     */
    @Test
    public void batchGetResourceApiKeyTest() {
        BatchGetResourceApiKeyRequest batchGetResourceApiKeyRequest = new BatchGetResourceApiKeyRequest();
        batchGetResourceApiKeyRequest.setXBceWorkloadAccessToken("");
        batchGetResourceApiKeyRequest.setNames(new ArrayList<>());
        batchGetResourceApiKeyRequest.setWorkloadAccessToken("");
        BatchGetResourceApiKeyResponse response = agentidentityClient.batchGetResourceApiKey(batchGetResourceApiKeyRequest);
        System.out.println(response);
    }
    /**
     * completeOauth2session
     *
     */
    @Test
    public void completeOauth2sessionTest() {
        CompleteOauth2sessionRequest completeOauth2sessionRequest = new CompleteOauth2sessionRequest();
        completeOauth2sessionRequest.setXBceWorkloadAccessToken("");
        completeOauth2sessionRequest.setSessionUri("");
        completeOauth2sessionRequest.setUserIdentifier(null);
        completeOauth2sessionRequest.setUserIdentifierUserId("");
        completeOauth2sessionRequest.setWorkloadAccessToken("");
        agentidentityClient.completeOauth2session(completeOauth2sessionRequest);
    }
    /**
     * createAgent
     *
     */
    @Test
    public void createAgentTest() {
        CreateAgentRequest createAgentRequest = new CreateAgentRequest();
        createAgentRequest.setName("");
        createAgentRequest.setDescription("");
        createAgentRequest.setAllowedResourceOauth2ReturnUrls(new ArrayList<>());
        agentidentityClient.createAgent(createAgentRequest);
    }
    /**
     * createCredentialProvider
     *
     */
    @Test
    public void createCredentialProviderTest() {
        CreateCredentialProviderRequest createCredentialProviderRequest = new CreateCredentialProviderRequest();
        createCredentialProviderRequest.setName("");
        createCredentialProviderRequest.setType("");
        createCredentialProviderRequest.setDesc("");
        createCredentialProviderRequest.setCredential(null);
        agentidentityClient.createCredentialProvider(createCredentialProviderRequest);
    }
    /**
     * createIdpConfiguration
     *
     */
    @Test
    public void createIdpConfigurationTest() {
        CreateIdpConfigurationRequest createIdpConfigurationRequest = new CreateIdpConfigurationRequest();
        createIdpConfigurationRequest.setUserPoolId("");
        createIdpConfigurationRequest.setName("");
        createIdpConfigurationRequest.setIdpType("");
        createIdpConfigurationRequest.setIdpProvider("");
        createIdpConfigurationRequest.setClientId("");
        createIdpConfigurationRequest.setClientSecret("");
        createIdpConfigurationRequest.setDiscoveryUrl("");
        createIdpConfigurationRequest.setAuthorizationEndpoint("");
        createIdpConfigurationRequest.setTokenEndpoint("");
        createIdpConfigurationRequest.setUserinfoEndpoint("");
        createIdpConfigurationRequest.setScopes(new ArrayList<>());
        createIdpConfigurationRequest.setUserIdClaim("");
        createIdpConfigurationRequest.setDisplayNameClaim("");
        createIdpConfigurationRequest.setAutoCreateUser(false);
        agentidentityClient.createIdpConfiguration(createIdpConfigurationRequest);
    }
    /**
     * createOauth2Client
     *
     */
    @Test
    public void createOauth2ClientTest() {
        CreateOauth2ClientRequest createOauth2ClientRequest = new CreateOauth2ClientRequest();
        createOauth2ClientRequest.setUserPoolId("");
        createOauth2ClientRequest.setName("");
        createOauth2ClientRequest.setDescription("");
        createOauth2ClientRequest.setClientType("");
        createOauth2ClientRequest.setRedirectUris(new ArrayList<>());
        createOauth2ClientRequest.setGrantTypes(new ArrayList<>());
        createOauth2ClientRequest.setScopes(new ArrayList<>());
        createOauth2ClientRequest.setAccessTokenTtl(0);
        createOauth2ClientRequest.setRefreshTokenTtl(0);
        agentidentityClient.createOauth2Client(createOauth2ClientRequest);
    }
    /**
     * createUser
     *
     */
    @Test
    public void createUserTest() {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserPoolId("");
        createUserRequest.setUsername("");
        createUserRequest.setDisplayName("");
        createUserRequest.setDescription("");
        createUserRequest.setPassword("");
        createUserRequest.setForceResetPassword(false);
        agentidentityClient.createUser(createUserRequest);
    }
    /**
     * createUserPool
     *
     */
    @Test
    public void createUserPoolTest() {
        CreateUserPoolRequest createUserPoolRequest = new CreateUserPoolRequest();
        createUserPoolRequest.setName("");
        createUserPoolRequest.setDescription("");
        agentidentityClient.createUserPool(createUserPoolRequest);
    }
    /**
     * deleteAgent
     *
     */
    @Test
    public void deleteAgentTest() {
        DeleteAgentRequest deleteAgentRequest = new DeleteAgentRequest();
        deleteAgentRequest.setAgentId("");
        agentidentityClient.deleteAgent(deleteAgentRequest);
    }
    /**
     * deleteCredentialProvider
     *
     */
    @Test
    public void deleteCredentialProviderTest() {
        DeleteCredentialProviderRequest deleteCredentialProviderRequest = new DeleteCredentialProviderRequest();
        deleteCredentialProviderRequest.setCredentialProviderId("");
        agentidentityClient.deleteCredentialProvider(deleteCredentialProviderRequest);
    }
    /**
     * deleteIdpConfiguration
     *
     */
    @Test
    public void deleteIdpConfigurationTest() {
        DeleteIdpConfigurationRequest deleteIdpConfigurationRequest = new DeleteIdpConfigurationRequest();
        deleteIdpConfigurationRequest.setUserPoolId("");
        deleteIdpConfigurationRequest.setId("");
        agentidentityClient.deleteIdpConfiguration(deleteIdpConfigurationRequest);
    }
    /**
     * deleteOauth2Client
     *
     */
    @Test
    public void deleteOauth2ClientTest() {
        DeleteOauth2ClientRequest deleteOauth2ClientRequest = new DeleteOauth2ClientRequest();
        deleteOauth2ClientRequest.setUserPoolId("");
        deleteOauth2ClientRequest.setId("");
        agentidentityClient.deleteOauth2Client(deleteOauth2ClientRequest);
    }
    /**
     * deleteUser
     *
     */
    @Test
    public void deleteUserTest() {
        DeleteUserRequest deleteUserRequest = new DeleteUserRequest();
        deleteUserRequest.setUserPoolId("");
        deleteUserRequest.setId("");
        agentidentityClient.deleteUser(deleteUserRequest);
    }
    /**
     * deleteUserPool
     *
     */
    @Test
    public void deleteUserPoolTest() {
        DeleteUserPoolRequest deleteUserPoolRequest = new DeleteUserPoolRequest();
        deleteUserPoolRequest.setId("");
        agentidentityClient.deleteUserPool(deleteUserPoolRequest);
    }
    /**
     * disableIdpConfiguration
     *
     */
    @Test
    public void disableIdpConfigurationTest() {
        DisableIdpConfigurationRequest disableIdpConfigurationRequest = new DisableIdpConfigurationRequest();
        disableIdpConfigurationRequest.setUserPoolId("");
        disableIdpConfigurationRequest.setId("");
        agentidentityClient.disableIdpConfiguration(disableIdpConfigurationRequest);
    }
    /**
     * enableIdpConfiguration
     *
     */
    @Test
    public void enableIdpConfigurationTest() {
        EnableIdpConfigurationRequest enableIdpConfigurationRequest = new EnableIdpConfigurationRequest();
        enableIdpConfigurationRequest.setUserPoolId("");
        enableIdpConfigurationRequest.setId("");
        agentidentityClient.enableIdpConfiguration(enableIdpConfigurationRequest);
    }
    /**
     * getAgent
     *
     */
    @Test
    public void getAgentTest() {
        GetAgentRequest getAgentRequest = new GetAgentRequest();
        getAgentRequest.setAgentId("");
        agentidentityClient.getAgent(getAgentRequest);
    }
    /**
     * getCredentialProvider
     *
     */
    @Test
    public void getCredentialProviderTest() {
        GetCredentialProviderRequest getCredentialProviderRequest = new GetCredentialProviderRequest();
        getCredentialProviderRequest.setCredentialProviderId("");
        agentidentityClient.getCredentialProvider(getCredentialProviderRequest);
    }
    /**
     * getIdpConfiguration
     *
     */
    @Test
    public void getIdpConfigurationTest() {
        GetIdpConfigurationRequest getIdpConfigurationRequest = new GetIdpConfigurationRequest();
        getIdpConfigurationRequest.setUserPoolId("");
        getIdpConfigurationRequest.setId("");
        agentidentityClient.getIdpConfiguration(getIdpConfigurationRequest);
    }
    /**
     * getOauth2Client
     *
     */
    @Test
    public void getOauth2ClientTest() {
        GetOauth2ClientRequest getOauth2ClientRequest = new GetOauth2ClientRequest();
        getOauth2ClientRequest.setUserPoolId("");
        getOauth2ClientRequest.setId("");
        agentidentityClient.getOauth2Client(getOauth2ClientRequest);
    }
    /**
     * getResourceApikey
     *
     */
    @Test
    public void getResourceApikeyTest() {
        GetResourceApikeyRequest getResourceApikeyRequest = new GetResourceApikeyRequest();
        getResourceApikeyRequest.setXBceWorkloadAccessToken("");
        getResourceApikeyRequest.setName("");
        getResourceApikeyRequest.setWorkloadAccessToken("");
        agentidentityClient.getResourceApikey(getResourceApikeyRequest);
    }
    /**
     * getResourceOauth2token
     *
     */
    @Test
    public void getResourceOauth2tokenTest() {
        GetResourceOauth2tokenRequest getResourceOauth2tokenRequest = new GetResourceOauth2tokenRequest();
        getResourceOauth2tokenRequest.setXBceWorkloadAccessToken("");
        getResourceOauth2tokenRequest.setResourceCredentialProviderName("");
        getResourceOauth2tokenRequest.setScopes(new ArrayList<>());
        getResourceOauth2tokenRequest.setOauth2Flow("");
        getResourceOauth2tokenRequest.setResourceOauth2ReturnUrl("");
        getResourceOauth2tokenRequest.setSessionUri("");
        getResourceOauth2tokenRequest.setForceAuthentication(false);
        getResourceOauth2tokenRequest.setWorkloadAccessToken("");
        agentidentityClient.getResourceOauth2token(getResourceOauth2tokenRequest);
    }
    /**
     * getUser
     *
     */
    @Test
    public void getUserTest() {
        GetUserRequest getUserRequest = new GetUserRequest();
        getUserRequest.setUserPoolId("");
        getUserRequest.setId("");
        getUserRequest.setUsername("");
        agentidentityClient.getUser(getUserRequest);
    }
    /**
     * getUserPool
     *
     */
    @Test
    public void getUserPoolTest() {
        GetUserPoolRequest getUserPoolRequest = new GetUserPoolRequest();
        getUserPoolRequest.setId("");
        agentidentityClient.getUserPool(getUserPoolRequest);
    }
    /**
     * getWATForUser
     *
     */
    @Test
    public void getWATForUserTest() {
        GetWATForUserRequest getWATForUserRequest = new GetWATForUserRequest();
        getWATForUserRequest.setBceUserId("");
        getWATForUserRequest.setAgentId("");
        getWATForUserRequest.setAgentName("");
        getWATForUserRequest.setUserId("");
        getWATForUserRequest.setSessionId("");
        getWATForUserRequest.setDurationSeconds(0);
        agentidentityClient.getWATForUser(getWATForUserRequest);
    }
    /**
     * getWorkloadAccessToken
     *
     */
    @Test
    public void getWorkloadAccessTokenTest() {
        GetWorkloadAccessTokenRequest getWorkloadAccessTokenRequest = new GetWorkloadAccessTokenRequest();
        getWorkloadAccessTokenRequest.setBceUserId("");
        getWorkloadAccessTokenRequest.setAgentId("");
        getWorkloadAccessTokenRequest.setAgentName("");
        getWorkloadAccessTokenRequest.setDurationSeconds(0);
        agentidentityClient.getWorkloadAccessToken(getWorkloadAccessTokenRequest);
    }
    /**
     * listAgents
     *
     */
    @Test
    public void listAgentsTest() {
        ListAgentsRequest listAgentsRequest = new ListAgentsRequest();
        listAgentsRequest.setPageNo(0);
        listAgentsRequest.setPageSize(0);
        listAgentsRequest.setKeyword("");
        ListAgentsResponse response = agentidentityClient.listAgents(listAgentsRequest);
        System.out.println(response);
    }
    /**
     * listCredentialProviders
     *
     */
    @Test
    public void listCredentialProvidersTest() {
        ListCredentialProvidersRequest listCredentialProvidersRequest = new ListCredentialProvidersRequest();
        listCredentialProvidersRequest.setPageNo(0);
        listCredentialProvidersRequest.setPageSize(0);
        listCredentialProvidersRequest.setType("");
        listCredentialProvidersRequest.setName("");
        ListCredentialProvidersResponse response = agentidentityClient.listCredentialProviders(listCredentialProvidersRequest);
        System.out.println(response);
    }
    /**
     * listIdpConfigurations
     *
     */
    @Test
    public void listIdpConfigurationsTest() {
        ListIdpConfigurationsRequest listIdpConfigurationsRequest = new ListIdpConfigurationsRequest();
        listIdpConfigurationsRequest.setUserPoolId("");
        listIdpConfigurationsRequest.setKeyword("");
        listIdpConfigurationsRequest.setPageNo(0);
        listIdpConfigurationsRequest.setPageSize(0);
        ListIdpConfigurationsResponse response = agentidentityClient.listIdpConfigurations(listIdpConfigurationsRequest);
        System.out.println(response);
    }
    /**
     * listOauth2Clients
     *
     */
    @Test
    public void listOauth2ClientsTest() {
        ListOauth2ClientsRequest listOauth2ClientsRequest = new ListOauth2ClientsRequest();
        listOauth2ClientsRequest.setUserPoolId("");
        listOauth2ClientsRequest.setKeyword("");
        listOauth2ClientsRequest.setPageNo(0);
        listOauth2ClientsRequest.setPageSize(0);
        ListOauth2ClientsResponse response = agentidentityClient.listOauth2Clients(listOauth2ClientsRequest);
        System.out.println(response);
    }
    /**
     * listUserPools
     *
     */
    @Test
    public void listUserPoolsTest() {
        ListUserPoolsRequest listUserPoolsRequest = new ListUserPoolsRequest();
        listUserPoolsRequest.setKeyword("");
        listUserPoolsRequest.setPageNo(0);
        listUserPoolsRequest.setPageSize(0);
        ListUserPoolsResponse response = agentidentityClient.listUserPools(listUserPoolsRequest);
        System.out.println(response);
    }
    /**
     * listUsers
     *
     */
    @Test
    public void listUsersTest() {
        ListUsersRequest listUsersRequest = new ListUsersRequest();
        listUsersRequest.setUserPoolId("");
        listUsersRequest.setKeyword("");
        listUsersRequest.setPageNo(0);
        listUsersRequest.setPageSize(0);
        ListUsersResponse response = agentidentityClient.listUsers(listUsersRequest);
        System.out.println(response);
    }
    /**
     * oIDCDiscovery
     *
     */
    @Test
    public void oIDCDiscoveryTest() {
        OIDCDiscoveryRequest oIDCDiscoveryRequest = new OIDCDiscoveryRequest();
        oIDCDiscoveryRequest.setUserPoolId("");
        agentidentityClient.oIDCDiscovery(oIDCDiscoveryRequest);
    }
    /**
     * oauth2idpCallback
     *
     */
    @Test
    public void oauth2idpCallbackTest() {
        Oauth2idpCallbackRequest oauth2idpCallbackRequest = new Oauth2idpCallbackRequest();
        oauth2idpCallbackRequest.setProviderId("");
        oauth2idpCallbackRequest.setCode("");
        oauth2idpCallbackRequest.setState("");
        agentidentityClient.oauth2idpCallback(oauth2idpCallbackRequest);
    }
    /**
     * resetPassword
     *
     */
    @Test
    public void resetPasswordTest() {
        ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest();
        resetPasswordRequest.setUserPoolId("");
        resetPasswordRequest.setUserId("");
        resetPasswordRequest.setNewPassword("");
        resetPasswordRequest.setPassword("");
        resetPasswordRequest.setForceResetPassword(false);
        agentidentityClient.resetPassword(resetPasswordRequest);
    }
    /**
     * tokenEndpoint
     *
     */
    @Test
    public void tokenEndpointTest() {
        TokenEndpointRequest tokenEndpointRequest = new TokenEndpointRequest();
        tokenEndpointRequest.setUserPoolId("");
        tokenEndpointRequest.setGrantType("");
        tokenEndpointRequest.setCode("");
        tokenEndpointRequest.setRefreshToken("");
        tokenEndpointRequest.setClientId("");
        tokenEndpointRequest.setClientSecret("");
        tokenEndpointRequest.setRedirectUri("");
        agentidentityClient.tokenEndpoint(tokenEndpointRequest);
    }
    /**
     * updateAgent
     *
     */
    @Test
    public void updateAgentTest() {
        UpdateAgentRequest updateAgentRequest = new UpdateAgentRequest();
        updateAgentRequest.setAgentId("");
        updateAgentRequest.setDescription("");
        updateAgentRequest.setAllowedResourceOauth2ReturnUrls(new ArrayList<>());
        agentidentityClient.updateAgent(updateAgentRequest);
    }
    /**
     * updateCredentialProvider
     *
     */
    @Test
    public void updateCredentialProviderTest() {
        UpdateCredentialProviderRequest updateCredentialProviderRequest = new UpdateCredentialProviderRequest();
        updateCredentialProviderRequest.setCredentialProviderId("");
        updateCredentialProviderRequest.setDesc("");
        updateCredentialProviderRequest.setCredential(null);
        agentidentityClient.updateCredentialProvider(updateCredentialProviderRequest);
    }
    /**
     * updateIdpConfiguration
     *
     */
    @Test
    public void updateIdpConfigurationTest() {
        UpdateIdpConfigurationRequest updateIdpConfigurationRequest = new UpdateIdpConfigurationRequest();
        updateIdpConfigurationRequest.setUserPoolId("");
        updateIdpConfigurationRequest.setId("");
        updateIdpConfigurationRequest.setName("");
        updateIdpConfigurationRequest.setClientId("");
        updateIdpConfigurationRequest.setClientSecret("");
        updateIdpConfigurationRequest.setAuthorizationEndpoint("");
        updateIdpConfigurationRequest.setTokenEndpoint("");
        updateIdpConfigurationRequest.setUserinfoEndpoint("");
        updateIdpConfigurationRequest.setScopes(new ArrayList<>());
        updateIdpConfigurationRequest.setUserIdClaim("");
        updateIdpConfigurationRequest.setDisplayNameClaim("");
        updateIdpConfigurationRequest.setAutoCreateUser(false);
        agentidentityClient.updateIdpConfiguration(updateIdpConfigurationRequest);
    }
    /**
     * updateOauth2Client
     *
     */
    @Test
    public void updateOauth2ClientTest() {
        UpdateOauth2ClientRequest updateOauth2ClientRequest = new UpdateOauth2ClientRequest();
        updateOauth2ClientRequest.setUserPoolId("");
        updateOauth2ClientRequest.setId("");
        updateOauth2ClientRequest.setName("");
        updateOauth2ClientRequest.setDescription("");
        updateOauth2ClientRequest.setRedirectUris(new ArrayList<>());
        updateOauth2ClientRequest.setGrantTypes(new ArrayList<>());
        updateOauth2ClientRequest.setScopes(new ArrayList<>());
        updateOauth2ClientRequest.setAccessTokenTtl(0);
        updateOauth2ClientRequest.setRefreshTokenTtl(0);
        agentidentityClient.updateOauth2Client(updateOauth2ClientRequest);
    }
    /**
     * updateUser
     *
     */
    @Test
    public void updateUserTest() {
        UpdateUserRequest updateUserRequest = new UpdateUserRequest();
        updateUserRequest.setUserPoolId("");
        updateUserRequest.setId("");
        updateUserRequest.setDisplayName("");
        updateUserRequest.setDescription("");
        agentidentityClient.updateUser(updateUserRequest);
    }
    /**
     * updateUserPool
     *
     */
    @Test
    public void updateUserPoolTest() {
        UpdateUserPoolRequest updateUserPoolRequest = new UpdateUserPoolRequest();
        updateUserPoolRequest.setId("");
        updateUserPoolRequest.setName("");
        updateUserPoolRequest.setDescription("");
        agentidentityClient.updateUserPool(updateUserPoolRequest);
    }
    /**
     * userinfoEndpoint
     *
     */
    @Test
    public void userinfoEndpointTest() {
        UserinfoEndpointRequest userinfoEndpointRequest = new UserinfoEndpointRequest();
        userinfoEndpointRequest.setUserPoolId("");
        userinfoEndpointRequest.setAuthorization("");
        UserinfoEndpointResponse response = agentidentityClient.userinfoEndpoint(userinfoEndpointRequest);
        System.out.println(response);
    }
}
