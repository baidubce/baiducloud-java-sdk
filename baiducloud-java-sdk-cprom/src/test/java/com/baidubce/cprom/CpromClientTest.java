package com.baidubce.cprom;

import com.baidubce.cprom.models.BindClusterRequest;
import com.baidubce.cprom.models.BindClusterResponse;
import com.baidubce.cprom.models.ClaimAlertEventRequest;
import com.baidubce.cprom.models.ClaimAlertEventResponse;
import com.baidubce.cprom.models.CreateAlertRequest;
import com.baidubce.cprom.models.CreateAlertResponse;
import com.baidubce.cprom.models.CreateCustomScrapeTaskRequest;
import com.baidubce.cprom.models.CreateCustomScrapeTaskResponse;
import com.baidubce.cprom.models.CreateInstanceRequest;
import com.baidubce.cprom.models.CreateNotificationPolicyRequest;
import com.baidubce.cprom.models.CreateNotificationPolicyResponse;
import com.baidubce.cprom.models.CreatePodmonitorRequest;
import com.baidubce.cprom.models.CreatePodmonitorResponse;
import com.baidubce.cprom.models.CreateServiceMonitorRequest;
import com.baidubce.cprom.models.CreateServiceMonitorResponse;
import com.baidubce.cprom.models.DeleteAlertRequest;
import com.baidubce.cprom.models.DeleteCustomScrapeTaskRequest;
import com.baidubce.cprom.models.DeleteInstanceRequest;
import com.baidubce.cprom.models.DeleteNotificationPolicyRequest;
import com.baidubce.cprom.models.DeletePodmonitorRequest;
import com.baidubce.cprom.models.DeleteServiceMonitorRequest;
import com.baidubce.cprom.models.GenerateInstanceTokenRequest;
import com.baidubce.cprom.models.GetAlertDetailRequest;
import com.baidubce.cprom.models.GetAlertDetailResponse;
import com.baidubce.cprom.models.GetAlertEventDetailRequest;
import com.baidubce.cprom.models.GetAlertEventDetailResponse;
import com.baidubce.cprom.models.GetClusterBindStatusRequest;
import com.baidubce.cprom.models.GetClusterBindStatusResponse;
import com.baidubce.cprom.models.GetNotificationPolicyRequest;
import com.baidubce.cprom.models.GetNotificationPolicyResponse;
import com.baidubce.cprom.models.ListAlertEventsRequest;
import com.baidubce.cprom.models.ListAlertEventsResponse;
import com.baidubce.cprom.models.ListAlertTemplatesResponse;
import com.baidubce.cprom.models.ListAlertsRequest;
import com.baidubce.cprom.models.ListAlertsResponse;
import com.baidubce.cprom.models.ListBindableCloudProductsResponse;
import com.baidubce.cprom.models.ListInstancesRequest;
import com.baidubce.cprom.models.ListInstancesResponse;
import com.baidubce.cprom.models.ListNotificationPoliciesRequest;
import com.baidubce.cprom.models.ListNotificationPoliciesResponse;
import com.baidubce.cprom.models.ListPodMonitorsRequest;
import com.baidubce.cprom.models.ListPodMonitorsResponse;
import com.baidubce.cprom.models.ListRelatedCloudProductsRequest;
import com.baidubce.cprom.models.ListRelatedCloudProductsResponse;
import com.baidubce.cprom.models.ListServiceMonitorsRequest;
import com.baidubce.cprom.models.ListServiceMonitorsResponse;
import com.baidubce.cprom.models.RemoteReadRequest;
import com.baidubce.cprom.models.RemoteReadResponse;
import com.baidubce.cprom.models.RemoteWriteRequest;
import com.baidubce.cprom.models.TogglePodMonitorServiceRequest;
import com.baidubce.cprom.models.ToggleServiceMonitorServiceRequest;
import com.baidubce.cprom.models.UpdateAlertRequest;
import com.baidubce.cprom.models.UpdateNotificationPolicyRequest;
import com.baidubce.cprom.models.UpdatePodMonitorRequest;
import com.baidubce.cprom.models.UpdateRelatedCloudProductsRequest;
import com.baidubce.cprom.models.UpdateServiceMonitorRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * API tests for CpromClient
 */
public class CpromClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CpromClient cpromClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        cpromClient = new CpromClient(config);
    }

    /**
     * bindCluster
     *
     */
    @Test
    public void bindClusterTest() {
        BindClusterRequest bindClusterRequest = new BindClusterRequest();
        bindClusterRequest.setInstanceId("");
        bindClusterRequest.setAction("");
        bindClusterRequest.setClusterId("");
        BindClusterResponse response = cpromClient.bindCluster(bindClusterRequest);
        System.out.println(response);
    }
    /**
     * claimAlertEvent
     *
     */
    @Test
    public void claimAlertEventTest() {
        ClaimAlertEventRequest claimAlertEventRequest = new ClaimAlertEventRequest();
        claimAlertEventRequest.setEventIds(new ArrayList<>());
        claimAlertEventRequest.setClaimReason("");
        ClaimAlertEventResponse response = cpromClient.claimAlertEvent(claimAlertEventRequest);
        System.out.println(response);
    }
    /**
     * createAlert
     *
     */
    @Test
    public void createAlertTest() {
        CreateAlertRequest createAlertRequest = new CreateAlertRequest();
        createAlertRequest.setInstanceId("");
        createAlertRequest.setAlertName("");
        createAlertRequest.setExpr("");
        createAlertRequest.setCpromFor("");
        createAlertRequest.setDescription("");
        createAlertRequest.setNotifyRuleId("");
        createAlertRequest.setEnable(false);
        createAlertRequest.setSeverity("");
        createAlertRequest.setLabels(new HashMap<>());
        createAlertRequest.setAnnotations(new HashMap<>());
        CreateAlertResponse response = cpromClient.createAlert(createAlertRequest);
        System.out.println(response);
    }
    /**
     * createCustomScrapeTask
     *
     */
    @Test
    public void createCustomScrapeTaskTest() {
        CreateCustomScrapeTaskRequest createCustomScrapeTaskRequest = new CreateCustomScrapeTaskRequest();
        createCustomScrapeTaskRequest.setInstanceId("");
        createCustomScrapeTaskRequest.setAgentId("");
        createCustomScrapeTaskRequest.setConfig("");
        CreateCustomScrapeTaskResponse response = cpromClient.createCustomScrapeTask(createCustomScrapeTaskRequest);
        System.out.println(response);
    }
    /**
     * createInstance
     *
     */
    @Test
    public void createInstanceTest() {
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest();
        createInstanceRequest.setInstanceName("");
        createInstanceRequest.setInstanceType("");
        createInstanceRequest.setInstanceSpec("");
        createInstanceRequest.setRetentionPeriod("");
        createInstanceRequest.setNeedGrafana(false);
        createInstanceRequest.setGrafanaName("");
        createInstanceRequest.setGrafanaAdminPassword("");
        cpromClient.createInstance(createInstanceRequest);
    }
    /**
     * createNotificationPolicy
     *
     */
    @Test
    public void createNotificationPolicyTest() {
        CreateNotificationPolicyRequest createNotificationPolicyRequest = new CreateNotificationPolicyRequest();
        createNotificationPolicyRequest.setNotifyRuleName("");
        createNotificationPolicyRequest.setStartTime("");
        createNotificationPolicyRequest.setEndTime("");
        createNotificationPolicyRequest.setChannel(new ArrayList<>());
        createNotificationPolicyRequest.setReceiverType("");
        createNotificationPolicyRequest.setUsers(new ArrayList<>());
        createNotificationPolicyRequest.setUserGroups(new ArrayList<>());
        createNotificationPolicyRequest.setWebhookConfigList(new ArrayList<>());
        createNotificationPolicyRequest.setEscalateConfigList(new ArrayList<>());
        createNotificationPolicyRequest.setRepeatNotifyConfig(null);
        CreateNotificationPolicyResponse response = cpromClient.createNotificationPolicy(createNotificationPolicyRequest);
        System.out.println(response);
    }
    /**
     * createPodmonitor
     *
     */
    @Test
    public void createPodmonitorTest() {
        CreatePodmonitorRequest createPodmonitorRequest = new CreatePodmonitorRequest();
        createPodmonitorRequest.setInstanceId("");
        createPodmonitorRequest.setAgentId("");
        createPodmonitorRequest.setApiVersion("");
        createPodmonitorRequest.setKind("");
        createPodmonitorRequest.setMetadata(null);
        createPodmonitorRequest.setSpec(null);
        CreatePodmonitorResponse response = cpromClient.createPodmonitor(createPodmonitorRequest);
        System.out.println(response);
    }
    /**
     * createServiceMonitor
     *
     */
    @Test
    public void createServiceMonitorTest() {
        CreateServiceMonitorRequest createServiceMonitorRequest = new CreateServiceMonitorRequest();
        createServiceMonitorRequest.setInstanceId("");
        createServiceMonitorRequest.setAgentId("");
        createServiceMonitorRequest.setApiVersion("");
        createServiceMonitorRequest.setKind("");
        createServiceMonitorRequest.setMetadata(null);
        createServiceMonitorRequest.setSpec(null);
        CreateServiceMonitorResponse response = cpromClient.createServiceMonitor(createServiceMonitorRequest);
        System.out.println(response);
    }
    /**
     * deleteAlert
     *
     */
    @Test
    public void deleteAlertTest() {
        DeleteAlertRequest deleteAlertRequest = new DeleteAlertRequest();
        deleteAlertRequest.setAlertingRuleId("");
        deleteAlertRequest.setInstanceId("");
        cpromClient.deleteAlert(deleteAlertRequest);
    }
    /**
     * deleteCustomScrapeTask
     *
     */
    @Test
    public void deleteCustomScrapeTaskTest() {
        DeleteCustomScrapeTaskRequest deleteCustomScrapeTaskRequest = new DeleteCustomScrapeTaskRequest();
        deleteCustomScrapeTaskRequest.setScrapeJobId("");
        deleteCustomScrapeTaskRequest.setInstanceId("");
        deleteCustomScrapeTaskRequest.setAgentId("");
        cpromClient.deleteCustomScrapeTask(deleteCustomScrapeTaskRequest);
    }
    /**
     * deleteInstance
     *
     */
    @Test
    public void deleteInstanceTest() {
        DeleteInstanceRequest deleteInstanceRequest = new DeleteInstanceRequest();
        deleteInstanceRequest.setInstanceId("");
        deleteInstanceRequest.setDeleteGrafana(false);
        cpromClient.deleteInstance(deleteInstanceRequest);
    }
    /**
     * deleteNotificationPolicy
     *
     */
    @Test
    public void deleteNotificationPolicyTest() {
        DeleteNotificationPolicyRequest deleteNotificationPolicyRequest = new DeleteNotificationPolicyRequest();
        deleteNotificationPolicyRequest.setNotifyRuleId("");
        cpromClient.deleteNotificationPolicy(deleteNotificationPolicyRequest);
    }
    /**
     * deletePodmonitor
     *
     */
    @Test
    public void deletePodmonitorTest() {
        DeletePodmonitorRequest deletePodmonitorRequest = new DeletePodmonitorRequest();
        deletePodmonitorRequest.setPodMonitorName("");
        deletePodmonitorRequest.setInstanceId("");
        deletePodmonitorRequest.setAgentId("");
        cpromClient.deletePodmonitor(deletePodmonitorRequest);
    }
    /**
     * deleteServiceMonitor
     *
     */
    @Test
    public void deleteServiceMonitorTest() {
        DeleteServiceMonitorRequest deleteServiceMonitorRequest = new DeleteServiceMonitorRequest();
        deleteServiceMonitorRequest.setServiceMonitorName("");
        deleteServiceMonitorRequest.setInstanceId("");
        deleteServiceMonitorRequest.setAgentId("");
        cpromClient.deleteServiceMonitor(deleteServiceMonitorRequest);
    }
    /**
     * generateInstanceToken
     *
     */
    @Test
    public void generateInstanceTokenTest() {
        GenerateInstanceTokenRequest generateInstanceTokenRequest = new GenerateInstanceTokenRequest();
        generateInstanceTokenRequest.setInstanceId("");
        generateInstanceTokenRequest.setAction("");
        generateInstanceTokenRequest.setToken("");
        cpromClient.generateInstanceToken(generateInstanceTokenRequest);
    }
    /**
     * getAlertDetail
     *
     */
    @Test
    public void getAlertDetailTest() {
        GetAlertDetailRequest getAlertDetailRequest = new GetAlertDetailRequest();
        getAlertDetailRequest.setAlertingRuleId("");
        getAlertDetailRequest.setInstanceId("");
        GetAlertDetailResponse response = cpromClient.getAlertDetail(getAlertDetailRequest);
        System.out.println(response);
    }
    /**
     * getAlertEventDetail
     *
     */
    @Test
    public void getAlertEventDetailTest() {
        GetAlertEventDetailRequest getAlertEventDetailRequest = new GetAlertEventDetailRequest();
        getAlertEventDetailRequest.setEventId("");
        GetAlertEventDetailResponse response = cpromClient.getAlertEventDetail(getAlertEventDetailRequest);
        System.out.println(response);
    }
    /**
     * getClusterBindStatus
     *
     */
    @Test
    public void getClusterBindStatusTest() {
        GetClusterBindStatusRequest getClusterBindStatusRequest = new GetClusterBindStatusRequest();
        getClusterBindStatusRequest.setClusterId("");
        GetClusterBindStatusResponse response = cpromClient.getClusterBindStatus(getClusterBindStatusRequest);
        System.out.println(response);
    }
    /**
     * getNotificationPolicy
     *
     */
    @Test
    public void getNotificationPolicyTest() {
        GetNotificationPolicyRequest getNotificationPolicyRequest = new GetNotificationPolicyRequest();
        getNotificationPolicyRequest.setNotifyRuleId("");
        GetNotificationPolicyResponse response = cpromClient.getNotificationPolicy(getNotificationPolicyRequest);
        System.out.println(response);
    }
    /**
     * listAlertEvents
     *
     */
    @Test
    public void listAlertEventsTest() {
        ListAlertEventsRequest listAlertEventsRequest = new ListAlertEventsRequest();
        listAlertEventsRequest.setStartTime(0);
        listAlertEventsRequest.setEndTime(0);
        listAlertEventsRequest.setPageNo(0);
        listAlertEventsRequest.setPageSize(0);
        listAlertEventsRequest.setMonitorInstanceId("");
        listAlertEventsRequest.setAlertingRuleId("");
        listAlertEventsRequest.setAlertingRuleName("");
        listAlertEventsRequest.setNotifyRuleId("");
        listAlertEventsRequest.setNotifyRuleName("");
        listAlertEventsRequest.setSeverity("");
        listAlertEventsRequest.setStatus("");
        listAlertEventsRequest.setExpr("");
        listAlertEventsRequest.setOrderBy("");
        listAlertEventsRequest.setOrder("");
        listAlertEventsRequest.setAlarmTags("");
        ListAlertEventsResponse response = cpromClient.listAlertEvents(listAlertEventsRequest);
        System.out.println(response);
    }
    /**
     * listAlertTemplates
     *
     */
    @Test
    public void listAlertTemplatesTest() {
        ListAlertTemplatesResponse response = cpromClient.listAlertTemplates();
        System.out.println(response);
    }
    /**
     * listAlerts
     *
     */
    @Test
    public void listAlertsTest() {
        ListAlertsRequest listAlertsRequest = new ListAlertsRequest();
        listAlertsRequest.setInstanceId("");
        listAlertsRequest.setPageSize(0);
        listAlertsRequest.setPageNo(0);
        listAlertsRequest.setKeywordType("");
        listAlertsRequest.setKeyword("");
        ListAlertsResponse response = cpromClient.listAlerts(listAlertsRequest);
        System.out.println(response);
    }
    /**
     * listBindableCloudProducts
     *
     */
    @Test
    public void listBindableCloudProductsTest() {
        ListBindableCloudProductsResponse response = cpromClient.listBindableCloudProducts();
        System.out.println(response);
    }
    /**
     * listInstances
     *
     */
    @Test
    public void listInstancesTest() {
        ListInstancesRequest listInstancesRequest = new ListInstancesRequest();
        listInstancesRequest.setPageSize(0);
        listInstancesRequest.setPageNo(0);
        listInstancesRequest.setOrderBy("");
        listInstancesRequest.setOrder("");
        listInstancesRequest.setPhase("");
        ListInstancesResponse response = cpromClient.listInstances(listInstancesRequest);
        System.out.println(response);
    }
    /**
     * listNotificationPolicies
     *
     */
    @Test
    public void listNotificationPoliciesTest() {
        ListNotificationPoliciesRequest listNotificationPoliciesRequest = new ListNotificationPoliciesRequest();
        listNotificationPoliciesRequest.setKeywordType("");
        listNotificationPoliciesRequest.setKeyword("");
        ListNotificationPoliciesResponse response = cpromClient.listNotificationPolicies(listNotificationPoliciesRequest);
        System.out.println(response);
    }
    /**
     * listPodMonitors
     *
     */
    @Test
    public void listPodMonitorsTest() {
        ListPodMonitorsRequest listPodMonitorsRequest = new ListPodMonitorsRequest();
        listPodMonitorsRequest.setInstanceId("");
        listPodMonitorsRequest.setAgentId("");
        listPodMonitorsRequest.setPageNo(0);
        listPodMonitorsRequest.setPageSize(0);
        listPodMonitorsRequest.setKeywordType("");
        listPodMonitorsRequest.setKeyword("");
        listPodMonitorsRequest.setOrderBy("");
        listPodMonitorsRequest.setOrder("");
        ListPodMonitorsResponse response = cpromClient.listPodMonitors(listPodMonitorsRequest);
        System.out.println(response);
    }
    /**
     * listRelatedCloudProducts
     *
     */
    @Test
    public void listRelatedCloudProductsTest() {
        ListRelatedCloudProductsRequest listRelatedCloudProductsRequest = new ListRelatedCloudProductsRequest();
        listRelatedCloudProductsRequest.setInstanceId("");
        ListRelatedCloudProductsResponse response = cpromClient.listRelatedCloudProducts(listRelatedCloudProductsRequest);
        System.out.println(response);
    }
    /**
     * listServiceMonitors
     *
     */
    @Test
    public void listServiceMonitorsTest() {
        ListServiceMonitorsRequest listServiceMonitorsRequest = new ListServiceMonitorsRequest();
        listServiceMonitorsRequest.setInstanceId("");
        listServiceMonitorsRequest.setAgentId("");
        listServiceMonitorsRequest.setPageNo(0);
        listServiceMonitorsRequest.setPageSize(0);
        listServiceMonitorsRequest.setKeywordType("");
        listServiceMonitorsRequest.setKeyword("");
        listServiceMonitorsRequest.setOrderBy("");
        listServiceMonitorsRequest.setOrder("");
        ListServiceMonitorsResponse response = cpromClient.listServiceMonitors(listServiceMonitorsRequest);
        System.out.println(response);
    }
    /**
     * remoteRead
     *
     */
    @Test
    public void remoteReadTest() {
        RemoteReadRequest remoteReadRequest = new RemoteReadRequest();
        remoteReadRequest.setRemoteReadUrl("");
        remoteReadRequest.setQuery("");
        remoteReadRequest.setStep(0);
        remoteReadRequest.setStart(0L);
        remoteReadRequest.setEnd(0L);
        RemoteReadResponse response = cpromClient.remoteRead(remoteReadRequest);
        System.out.println(response);
    }
    /**
     * remoteWrite
     *
     */
    @Test
    public void remoteWriteTest() {
        RemoteWriteRequest remoteWriteRequest = new RemoteWriteRequest();
        remoteWriteRequest.setRemoteWriteUrl("");
        remoteWriteRequest.setContentType("");
        remoteWriteRequest.setContentEncoding("");
        remoteWriteRequest.setInstanceId("");
        remoteWriteRequest.setAuthorization("");
        remoteWriteRequest.setBody(null);
        cpromClient.remoteWrite(remoteWriteRequest);
    }
    /**
     * togglePodMonitorService
     *
     */
    @Test
    public void togglePodMonitorServiceTest() {
        TogglePodMonitorServiceRequest togglePodMonitorServiceRequest = new TogglePodMonitorServiceRequest();
        togglePodMonitorServiceRequest.setAction("");
        togglePodMonitorServiceRequest.setInstanceId("");
        togglePodMonitorServiceRequest.setAgentId("");
        cpromClient.togglePodMonitorService(togglePodMonitorServiceRequest);
    }
    /**
     * toggleServiceMonitorService
     *
     */
    @Test
    public void toggleServiceMonitorServiceTest() {
        ToggleServiceMonitorServiceRequest toggleServiceMonitorServiceRequest = new ToggleServiceMonitorServiceRequest();
        toggleServiceMonitorServiceRequest.setAction("");
        toggleServiceMonitorServiceRequest.setInstanceId("");
        toggleServiceMonitorServiceRequest.setAgentId("");
        cpromClient.toggleServiceMonitorService(toggleServiceMonitorServiceRequest);
    }
    /**
     * updateAlert
     *
     */
    @Test
    public void updateAlertTest() {
        UpdateAlertRequest updateAlertRequest = new UpdateAlertRequest();
        updateAlertRequest.setAlertingRuleId("");
        updateAlertRequest.setInstanceId("");
        updateAlertRequest.setAlertName("");
        updateAlertRequest.setExpr("");
        updateAlertRequest.setCpromFor("");
        updateAlertRequest.setDescription("");
        updateAlertRequest.setNotifyRuleId("");
        updateAlertRequest.setSeverity("");
        updateAlertRequest.setEnable(false);
        updateAlertRequest.setLabels(new HashMap<>());
        updateAlertRequest.setAnnotations(new HashMap<>());
        cpromClient.updateAlert(updateAlertRequest);
    }
    /**
     * updateNotificationPolicy
     *
     */
    @Test
    public void updateNotificationPolicyTest() {
        UpdateNotificationPolicyRequest updateNotificationPolicyRequest = new UpdateNotificationPolicyRequest();
        updateNotificationPolicyRequest.setNotifyRuleId("");
        updateNotificationPolicyRequest.setNotifyRuleName("");
        updateNotificationPolicyRequest.setStartTime("");
        updateNotificationPolicyRequest.setEndTime("");
        updateNotificationPolicyRequest.setChannel(new ArrayList<>());
        updateNotificationPolicyRequest.setReceiverType("");
        updateNotificationPolicyRequest.setUsers(new ArrayList<>());
        updateNotificationPolicyRequest.setUserGroups(new ArrayList<>());
        updateNotificationPolicyRequest.setWebhookConfigList(new ArrayList<>());
        updateNotificationPolicyRequest.setEscalateConfigList(new ArrayList<>());
        updateNotificationPolicyRequest.setRepeatNotifyConfig(null);
        cpromClient.updateNotificationPolicy(updateNotificationPolicyRequest);
    }
    /**
     * updatePodMonitor
     *
     */
    @Test
    public void updatePodMonitorTest() {
        UpdatePodMonitorRequest updatePodMonitorRequest = new UpdatePodMonitorRequest();
        updatePodMonitorRequest.setPodMonitorName("");
        updatePodMonitorRequest.setInstanceId("");
        updatePodMonitorRequest.setAgentId("");
        updatePodMonitorRequest.setEnable("");
        updatePodMonitorRequest.setPodMonitor(null);
        cpromClient.updatePodMonitor(updatePodMonitorRequest);
    }
    /**
     * updateRelatedCloudProducts
     *
     */
    @Test
    public void updateRelatedCloudProductsTest() {
        UpdateRelatedCloudProductsRequest updateRelatedCloudProductsRequest = new UpdateRelatedCloudProductsRequest();
        updateRelatedCloudProductsRequest.setInstanceId("");
        updateRelatedCloudProductsRequest.setScopes(new ArrayList<>());
        cpromClient.updateRelatedCloudProducts(updateRelatedCloudProductsRequest);
    }
    /**
     * updateServiceMonitor
     *
     */
    @Test
    public void updateServiceMonitorTest() {
        UpdateServiceMonitorRequest updateServiceMonitorRequest = new UpdateServiceMonitorRequest();
        updateServiceMonitorRequest.setServiceMonitorName("");
        updateServiceMonitorRequest.setInstanceId("");
        updateServiceMonitorRequest.setAgentId("");
        updateServiceMonitorRequest.setEnable("");
        updateServiceMonitorRequest.setServiceMonitor(null);
        cpromClient.updateServiceMonitor(updateServiceMonitorRequest);
    }
}
