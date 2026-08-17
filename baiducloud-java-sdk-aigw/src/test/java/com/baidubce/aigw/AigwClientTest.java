package com.baidubce.aigw;

import com.baidubce.aigw.models.CreateConsumerRequest;
import com.baidubce.aigw.models.CreateConsumerResponse;
import com.baidubce.aigw.models.CreateRouteRequest;
import com.baidubce.aigw.models.CreateRouteResponse;
import com.baidubce.aigw.models.DeleteConsumerRequest;
import com.baidubce.aigw.models.DeleteConsumerResponse;
import com.baidubce.aigw.models.DeleteRouteRequest;
import com.baidubce.aigw.models.DeleteRouteResponse;
import com.baidubce.aigw.models.GetConsumerListRequest;
import com.baidubce.aigw.models.GetConsumerListResponse;
import com.baidubce.aigw.models.GetConsumerRequest;
import com.baidubce.aigw.models.GetConsumerResponse;
import com.baidubce.aigw.models.QueryRoutingDetailsRequest;
import com.baidubce.aigw.models.QueryRoutingDetailsResponse;
import com.baidubce.aigw.models.QueryRoutingListRequest;
import com.baidubce.aigw.models.QueryRoutingListResponse;
import com.baidubce.aigw.models.UpdateConsumerRequest;
import com.baidubce.aigw.models.UpdateConsumerResponse;
import com.baidubce.aigw.models.UpdateRouteRequest;
import com.baidubce.aigw.models.UpdateRouteResponse;
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
     * createConsumer
     *
     */
    @Test
    public void createConsumerTest() {
        CreateConsumerRequest createConsumerRequest = new CreateConsumerRequest();
        createConsumerRequest.setInstanceId("");
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
     * deleteConsumer
     *
     */
    @Test
    public void deleteConsumerTest() {
        DeleteConsumerRequest deleteConsumerRequest = new DeleteConsumerRequest();
        deleteConsumerRequest.setInstanceId("");
        deleteConsumerRequest.setConsumerId("");
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
        DeleteRouteResponse response = aigwClient.deleteRoute(deleteRouteRequest);
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
        getConsumerListRequest.setPageNo(0);
        getConsumerListRequest.setPageSize(0);
        getConsumerListRequest.setTagKey("");
        getConsumerListRequest.setTagValue("");
        GetConsumerListResponse response = aigwClient.getConsumerList(getConsumerListRequest);
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
        queryRoutingListRequest.setRouteName("");
        queryRoutingListRequest.setPageNo(0);
        queryRoutingListRequest.setPageSize(0);
        queryRoutingListRequest.setOrderBy("");
        queryRoutingListRequest.setOrder("");
        QueryRoutingListResponse response = aigwClient.queryRoutingList(queryRoutingListRequest);
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
}
