package com.baidubce.aigw;

import com.baidubce.aigw.models.CreateAIGatewayRequest;
import com.baidubce.aigw.models.CreateAIGatewayResponse;
import com.baidubce.aigw.models.CreateConsumerRequest;
import com.baidubce.aigw.models.CreateConsumerResponse;
import com.baidubce.aigw.models.CreateRouteRequest;
import com.baidubce.aigw.models.CreateRouteResponse;
import com.baidubce.aigw.models.CreateServiceRequest;
import com.baidubce.aigw.models.CreateServiceResponse;
import com.baidubce.aigw.models.DeleteAIGatewayRequest;
import com.baidubce.aigw.models.DeleteAIGatewayResponse;
import com.baidubce.aigw.models.DeleteConsumerRequest;
import com.baidubce.aigw.models.DeleteConsumerResponse;
import com.baidubce.aigw.models.DeleteRouteRequest;
import com.baidubce.aigw.models.DeleteRouteResponse;
import com.baidubce.aigw.models.DeleteServiceRequest;
import com.baidubce.aigw.models.DeleteServiceResponse;
import com.baidubce.aigw.models.GetAIGatewayDetailRequest;
import com.baidubce.aigw.models.GetAIGatewayDetailResponse;
import com.baidubce.aigw.models.GetConsumerListRequest;
import com.baidubce.aigw.models.GetConsumerListResponse;
import com.baidubce.aigw.models.GetConsumerRequest;
import com.baidubce.aigw.models.GetConsumerResponse;
import com.baidubce.aigw.models.GetServiceDetailRequest;
import com.baidubce.aigw.models.GetServiceDetailResponse;
import com.baidubce.aigw.models.GetServiceListRequest;
import com.baidubce.aigw.models.GetServiceListResponse;
import com.baidubce.aigw.models.ListAIGatewaysRequest;
import com.baidubce.aigw.models.ListAIGatewaysResponse;
import com.baidubce.aigw.models.ListServicesBySourceRequest;
import com.baidubce.aigw.models.ListServicesBySourceResponse;
import com.baidubce.aigw.models.QueryRoutingDetailsRequest;
import com.baidubce.aigw.models.QueryRoutingDetailsResponse;
import com.baidubce.aigw.models.QueryRoutingListRequest;
import com.baidubce.aigw.models.QueryRoutingListResponse;
import com.baidubce.aigw.models.UpdateAIGatewayRequest;
import com.baidubce.aigw.models.UpdateAIGatewayResponse;
import com.baidubce.aigw.models.UpdateConsumerRequest;
import com.baidubce.aigw.models.UpdateConsumerResponse;
import com.baidubce.aigw.models.UpdateRouteRequest;
import com.baidubce.aigw.models.UpdateRouteResponse;
import com.baidubce.aigw.models.UpdateServiceRequest;
import com.baidubce.aigw.models.UpdateServiceResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for AigwClient
 */
public class AigwClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private AigwClient aigwClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        config.setCredentials(new DefaultBceCredentials(AK, SK));

        aigwClient = new AigwClient(config);
    }

    /**
     * createAIGateway
     *
     */
    @Test
    public void createAIGatewayTest() {
        CreateAIGatewayRequest createAIGatewayRequest = new CreateAIGatewayRequest();
        createAIGatewayRequest.setXRegion("");
        createAIGatewayRequest.setName("");
        createAIGatewayRequest.setVpcId("");
        createAIGatewayRequest.setVpcCidr("");
        createAIGatewayRequest.setSubnetId("");
        createAIGatewayRequest.setGatewayType("");
        createAIGatewayRequest.setIsInternal("");
        createAIGatewayRequest.setNetworkTypes(new ArrayList<>());
        createAIGatewayRequest.setReplicas(0);
        createAIGatewayRequest.setInstallMode("");
        createAIGatewayRequest.setDescription("");
        createAIGatewayRequest.setDeleteProtection(false);
        createAIGatewayRequest.setSrcProduct("");
        createAIGatewayRequest.setAccountId("");
        createAIGatewayRequest.setWorkspaceId("");
        createAIGatewayRequest.setWorkspaceName("");
        createAIGatewayRequest.setBlbId("");
        createAIGatewayRequest.setBlbIp("");
        createAIGatewayRequest.setClusters(new ArrayList<>());
        createAIGatewayRequest.setCpromInstanceId("");
        createAIGatewayRequest.setCpromBearerToken("");
        createAIGatewayRequest.setBlsEnabled(false);
        createAIGatewayRequest.setLogStoreName("");
        createAIGatewayRequest.setVersion("");
        createAIGatewayRequest.setTags(new ArrayList<>());
        createAIGatewayRequest.setResourceGroupId("");
        createAIGatewayRequest.setAihcArgs(null);
        CreateAIGatewayResponse response = aigwClient.createAIGateway(createAIGatewayRequest);
        System.out.println(response);
    }
    /**
     * createConsumer
     *
     */
    @Test
    public void createConsumerTest() {
        CreateConsumerRequest createConsumerRequest = new CreateConsumerRequest();
        createConsumerRequest.setInstanceId("");
        createConsumerRequest.setXRegion("");
        createConsumerRequest.setConsumerName("");
        createConsumerRequest.setDescription("");
        createConsumerRequest.setAuthType("");
        createConsumerRequest.setCredentialType("");
        createConsumerRequest.setRouteNames(new ArrayList<>());
        createConsumerRequest.setTags(new ArrayList<>());
        createConsumerRequest.setCredential(null);
        createConsumerRequest.setIamCredential(null);
        CreateConsumerResponse response = aigwClient.createConsumer(createConsumerRequest);
        System.out.println(response);
    }
    /**
     * createRoute
     *
     */
    @Test
    public void createRouteTest() {
        CreateRouteRequest createRouteRequest = new CreateRouteRequest();
        createRouteRequest.setInstanceId("");
        createRouteRequest.setClusterId("");
        createRouteRequest.setXRegion("");
        createRouteRequest.setRouteName("");
        createRouteRequest.setSrcProduct("");
        createRouteRequest.setAccessMode("");
        createRouteRequest.setWebSubdomain("");
        createRouteRequest.setServicePath("");
        createRouteRequest.setDomains(new ArrayList<>());
        createRouteRequest.setMatchRules(null);
        createRouteRequest.setMultiService(false);
        createRouteRequest.setTrafficDistributionStrategy("");
        createRouteRequest.setEnableWeightAdjust(false);
        createRouteRequest.setTargetService(null);
        createRouteRequest.setRewrite(null);
        createRouteRequest.setRegexRewrite(null);
        createRouteRequest.setCustomHeaders(new ArrayList<>());
        createRouteRequest.setSkipSetHostHeader(false);
        createRouteRequest.setAuthEnabled(false);
        createRouteRequest.setAllowedConsumers(new ArrayList<>());
        createRouteRequest.setTokenRateLimit(null);
        createRouteRequest.setRequestRateLimit(null);
        createRouteRequest.setTimeoutPolicy(null);
        createRouteRequest.setRetryPolicy(null);
        createRouteRequest.setCorsPolicy(null);
        createRouteRequest.setResponseHeaders(null);
        createRouteRequest.setFallbackConfig(null);
        CreateRouteResponse response = aigwClient.createRoute(createRouteRequest);
        System.out.println(response);
    }
    /**
     * createService
     *
     */
    @Test
    public void createServiceTest() {
        CreateServiceRequest createServiceRequest = new CreateServiceRequest();
        createServiceRequest.setInstanceId("");
        createServiceRequest.setXRegion("");
        createServiceRequest.setServiceSource("");
        createServiceRequest.setNamespace("");
        createServiceRequest.setServiceName("");
        createServiceRequest.setClusterId("");
        createServiceRequest.setClusterIds(new ArrayList<>());
        createServiceRequest.setServiceList(new ArrayList<>());
        createServiceRequest.setRegistryId("");
        createServiceRequest.setServiceAddresses(new ArrayList<>());
        createServiceRequest.setServiceProtocol("");
        createServiceRequest.setProvider("");
        createServiceRequest.setEndpoint("");
        createServiceRequest.setApiKeys(new ArrayList<>());
        createServiceRequest.setCredentialSource("");
        createServiceRequest.setCredentialNames(new ArrayList<>());
        createServiceRequest.setFailoverEnabled(false);
        createServiceRequest.setFailoverModel("");
        CreateServiceResponse response = aigwClient.createService(createServiceRequest);
        System.out.println(response);
    }
    /**
     * deleteAIGateway
     *
     */
    @Test
    public void deleteAIGatewayTest() {
        DeleteAIGatewayRequest deleteAIGatewayRequest = new DeleteAIGatewayRequest();
        deleteAIGatewayRequest.setInstanceId("");
        deleteAIGatewayRequest.setXRegion("");
        deleteAIGatewayRequest.setForce(false);
        DeleteAIGatewayResponse response = aigwClient.deleteAIGateway(deleteAIGatewayRequest);
        System.out.println(response);
    }
    /**
     * deleteConsumer
     *
     */
    @Test
    public void deleteConsumerTest() {
        DeleteConsumerRequest deleteConsumerRequest = new DeleteConsumerRequest();
        deleteConsumerRequest.setInstanceId("");
        deleteConsumerRequest.setConsumerId("");
        deleteConsumerRequest.setXRegion("");
        deleteConsumerRequest.setKeyType("");
        DeleteConsumerResponse response = aigwClient.deleteConsumer(deleteConsumerRequest);
        System.out.println(response);
    }
    /**
     * deleteRoute
     *
     */
    @Test
    public void deleteRouteTest() {
        DeleteRouteRequest deleteRouteRequest = new DeleteRouteRequest();
        deleteRouteRequest.setInstanceId("");
        deleteRouteRequest.setRouteName("");
        deleteRouteRequest.setXRegion("");
        DeleteRouteResponse response = aigwClient.deleteRoute(deleteRouteRequest);
        System.out.println(response);
    }
    /**
     * deleteService
     *
     */
    @Test
    public void deleteServiceTest() {
        DeleteServiceRequest deleteServiceRequest = new DeleteServiceRequest();
        deleteServiceRequest.setInstanceId("");
        deleteServiceRequest.setServiceName("");
        deleteServiceRequest.setNamespace("");
        deleteServiceRequest.setXRegion("");
        DeleteServiceResponse response = aigwClient.deleteService(deleteServiceRequest);
        System.out.println(response);
    }
    /**
     * getAIGatewayDetail
     *
     */
    @Test
    public void getAIGatewayDetailTest() {
        GetAIGatewayDetailRequest getAIGatewayDetailRequest = new GetAIGatewayDetailRequest();
        getAIGatewayDetailRequest.setInstanceId("");
        getAIGatewayDetailRequest.setXRegion("");
        getAIGatewayDetailRequest.setSrcProduct("");
        GetAIGatewayDetailResponse response = aigwClient.getAIGatewayDetail(getAIGatewayDetailRequest);
        System.out.println(response);
    }
    /**
     * getConsumer
     *
     */
    @Test
    public void getConsumerTest() {
        GetConsumerRequest getConsumerRequest = new GetConsumerRequest();
        getConsumerRequest.setInstanceId("");
        getConsumerRequest.setConsumerId("");
        getConsumerRequest.setXRegion("");
        getConsumerRequest.setKeyType("");
        GetConsumerResponse response = aigwClient.getConsumer(getConsumerRequest);
        System.out.println(response);
    }
    /**
     * getConsumerList
     *
     */
    @Test
    public void getConsumerListTest() {
        GetConsumerListRequest getConsumerListRequest = new GetConsumerListRequest();
        getConsumerListRequest.setInstanceId("");
        getConsumerListRequest.setXRegion("");
        getConsumerListRequest.setPageNo(0);
        getConsumerListRequest.setPageSize(0);
        getConsumerListRequest.setTagKey("");
        getConsumerListRequest.setTagValue("");
        GetConsumerListResponse response = aigwClient.getConsumerList(getConsumerListRequest);
        System.out.println(response);
    }
    /**
     * getServiceDetail
     *
     */
    @Test
    public void getServiceDetailTest() {
        GetServiceDetailRequest getServiceDetailRequest = new GetServiceDetailRequest();
        getServiceDetailRequest.setInstanceId("");
        getServiceDetailRequest.setServiceName("");
        getServiceDetailRequest.setXRegion("");
        GetServiceDetailResponse response = aigwClient.getServiceDetail(getServiceDetailRequest);
        System.out.println(response);
    }
    /**
     * getServiceList
     *
     */
    @Test
    public void getServiceListTest() {
        GetServiceListRequest getServiceListRequest = new GetServiceListRequest();
        getServiceListRequest.setInstanceId("");
        getServiceListRequest.setXRegion("");
        getServiceListRequest.setServiceSource("");
        GetServiceListResponse response = aigwClient.getServiceList(getServiceListRequest);
        System.out.println(response);
    }
    /**
     * listAIGateways
     *
     */
    @Test
    public void listAIGatewaysTest() {
        ListAIGatewaysRequest listAIGatewaysRequest = new ListAIGatewaysRequest();
        listAIGatewaysRequest.setXRegion("");
        listAIGatewaysRequest.setKeyword("");
        listAIGatewaysRequest.setKeywordType("");
        listAIGatewaysRequest.setStatus("");
        listAIGatewaysRequest.setSrcProduct("");
        listAIGatewaysRequest.setTagKey("");
        listAIGatewaysRequest.setTagValue("");
        listAIGatewaysRequest.setResourceGroupId("");
        listAIGatewaysRequest.setPageNo(0);
        listAIGatewaysRequest.setPageSize(0);
        listAIGatewaysRequest.setOrderBy("");
        listAIGatewaysRequest.setOrder("");
        ListAIGatewaysResponse response = aigwClient.listAIGateways(listAIGatewaysRequest);
        System.out.println(response);
    }
    /**
     * listServicesBySource
     *
     */
    @Test
    public void listServicesBySourceTest() {
        ListServicesBySourceRequest listServicesBySourceRequest = new ListServicesBySourceRequest();
        listServicesBySourceRequest.setInstanceId("");
        listServicesBySourceRequest.setXRegion("");
        listServicesBySourceRequest.setServiceSource("");
        ListServicesBySourceResponse response = aigwClient.listServicesBySource(listServicesBySourceRequest);
        System.out.println(response);
    }
    /**
     * queryRoutingDetails
     *
     */
    @Test
    public void queryRoutingDetailsTest() {
        QueryRoutingDetailsRequest queryRoutingDetailsRequest = new QueryRoutingDetailsRequest();
        queryRoutingDetailsRequest.setInstanceId("");
        queryRoutingDetailsRequest.setRouteName("");
        queryRoutingDetailsRequest.setXRegion("");
        QueryRoutingDetailsResponse response = aigwClient.queryRoutingDetails(queryRoutingDetailsRequest);
        System.out.println(response);
    }
    /**
     * queryRoutingList
     *
     */
    @Test
    public void queryRoutingListTest() {
        QueryRoutingListRequest queryRoutingListRequest = new QueryRoutingListRequest();
        queryRoutingListRequest.setInstanceId("");
        queryRoutingListRequest.setXRegion("");
        queryRoutingListRequest.setRouteName("");
        queryRoutingListRequest.setPageNo(0);
        queryRoutingListRequest.setPageSize(0);
        queryRoutingListRequest.setOrderBy("");
        queryRoutingListRequest.setOrder("");
        QueryRoutingListResponse response = aigwClient.queryRoutingList(queryRoutingListRequest);
        System.out.println(response);
    }
    /**
     * updateAIGateway
     *
     */
    @Test
    public void updateAIGatewayTest() {
        UpdateAIGatewayRequest updateAIGatewayRequest = new UpdateAIGatewayRequest();
        updateAIGatewayRequest.setInstanceId("");
        updateAIGatewayRequest.setXRegion("");
        updateAIGatewayRequest.setName("");
        updateAIGatewayRequest.setDescription("");
        updateAIGatewayRequest.setDeleteProtection(false);
        updateAIGatewayRequest.setPublicAccessible(false);
        updateAIGatewayRequest.setReplicas(0);
        updateAIGatewayRequest.setNetworkTypes(new ArrayList<>());
        updateAIGatewayRequest.setTags(new ArrayList<>());
        UpdateAIGatewayResponse response = aigwClient.updateAIGateway(updateAIGatewayRequest);
        System.out.println(response);
    }
    /**
     * updateConsumer
     *
     */
    @Test
    public void updateConsumerTest() {
        UpdateConsumerRequest updateConsumerRequest = new UpdateConsumerRequest();
        updateConsumerRequest.setInstanceId("");
        updateConsumerRequest.setConsumerId("");
        updateConsumerRequest.setXRegion("");
        updateConsumerRequest.setKeyType("");
        updateConsumerRequest.setDescription("");
        updateConsumerRequest.setRouteNames(new ArrayList<>());
        updateConsumerRequest.setTags(new ArrayList<>());
        updateConsumerRequest.setCredentialOp(null);
        updateConsumerRequest.setCredentialLocation(null);
        updateConsumerRequest.setIamCredential(null);
        UpdateConsumerResponse response = aigwClient.updateConsumer(updateConsumerRequest);
        System.out.println(response);
    }
    /**
     * updateRoute
     *
     */
    @Test
    public void updateRouteTest() {
        UpdateRouteRequest updateRouteRequest = new UpdateRouteRequest();
        updateRouteRequest.setInstanceId("");
        updateRouteRequest.setRouteName("");
        updateRouteRequest.setXRegion("");
        updateRouteRequest.setSrcProduct("");
        updateRouteRequest.setAccessMode("");
        updateRouteRequest.setWebSubdomain("");
        updateRouteRequest.setServicePath("");
        updateRouteRequest.setDomains(new ArrayList<>());
        updateRouteRequest.setMatchRules(null);
        updateRouteRequest.setMultiService(false);
        updateRouteRequest.setTrafficDistributionStrategy("");
        updateRouteRequest.setEnableWeightAdjust(false);
        updateRouteRequest.setTargetService(null);
        updateRouteRequest.setRewrite(null);
        updateRouteRequest.setRegexRewrite(null);
        updateRouteRequest.setCustomHeaders(new ArrayList<>());
        updateRouteRequest.setSkipSetHostHeader(false);
        updateRouteRequest.setAuthEnabled(false);
        updateRouteRequest.setAllowedConsumers(new ArrayList<>());
        updateRouteRequest.setTokenRateLimit(null);
        updateRouteRequest.setRequestRateLimit(null);
        updateRouteRequest.setTimeoutPolicy(null);
        updateRouteRequest.setRetryPolicy(null);
        updateRouteRequest.setCorsPolicy(null);
        updateRouteRequest.setResponseHeaders(null);
        updateRouteRequest.setFallbackConfig(null);
        UpdateRouteResponse response = aigwClient.updateRoute(updateRouteRequest);
        System.out.println(response);
    }
    /**
     * updateService
     *
     */
    @Test
    public void updateServiceTest() {
        UpdateServiceRequest updateServiceRequest = new UpdateServiceRequest();
        updateServiceRequest.setInstanceId("");
        updateServiceRequest.setServiceNamePath("");
        updateServiceRequest.setXRegion("");
        updateServiceRequest.setServiceName("");
        updateServiceRequest.setServiceAddresses(new ArrayList<>());
        updateServiceRequest.setServiceProtocol("");
        updateServiceRequest.setProvider("");
        updateServiceRequest.setEndpoint("");
        updateServiceRequest.setApiKeys(new ArrayList<>());
        updateServiceRequest.setFailoverEnabled(false);
        updateServiceRequest.setFailoverModel("");
        updateServiceRequest.setCredentialSource("");
        updateServiceRequest.setCredentialNames(new ArrayList<>());
        UpdateServiceResponse response = aigwClient.updateService(updateServiceRequest);
        System.out.println(response);
    }
}
