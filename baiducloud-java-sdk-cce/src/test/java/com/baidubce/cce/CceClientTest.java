package com.baidubce.cce;

import com.baidubce.cce.models.BatchCreateDiagnosisTasksRequest;
import com.baidubce.cce.models.BatchCreateDiagnosisTasksResponse;
import com.baidubce.cce.models.CreateAShrinkingNodeGroupTaskV2Request;
import com.baidubce.cce.models.CreateAShrinkingNodeGroupTaskV2Response;
import com.baidubce.cce.models.CreateAnAutoscalerV2Request;
import com.baidubce.cce.models.CreateAnAutoscalerV2Response;
import com.baidubce.cce.models.CreateDiagnosisTaskRequest;
import com.baidubce.cce.models.CreateDiagnosisTaskResponse;
import com.baidubce.cce.models.CreateExpansionNodeGroupTaskV2Request;
import com.baidubce.cce.models.CreateExpansionNodeGroupTaskV2Response;
import com.baidubce.cce.models.CreateInspectionRequest;
import com.baidubce.cce.models.CreateInspectionResponse;
import com.baidubce.cce.models.CreateNodeGroupV2Request;
import com.baidubce.cce.models.CreateNodeGroupV2Response;
import com.baidubce.cce.models.DeleteNodeGroupV2Request;
import com.baidubce.cce.models.DeleteNodeGroupV2Response;
import com.baidubce.cce.models.DeleteNodesClusterScalingV2Request;
import com.baidubce.cce.models.DeleteNodesClusterScalingV2Response;
import com.baidubce.cce.models.GetDiagnosisReportDetailRequest;
import com.baidubce.cce.models.GetDiagnosisReportDetailResponse;
import com.baidubce.cce.models.GetInspectionItemsRequest;
import com.baidubce.cce.models.GetInspectionItemsResponse;
import com.baidubce.cce.models.GetInspectionSubscriptionConfigRequest;
import com.baidubce.cce.models.GetInspectionSubscriptionConfigResponse;
import com.baidubce.cce.models.GetLatestReportRequest;
import com.baidubce.cce.models.GetLatestReportResponse;
import com.baidubce.cce.models.GetNodeDetailsV2Request;
import com.baidubce.cce.models.GetNodeDetailsV2Response;
import com.baidubce.cce.models.GetNodeGroupDetailsV2Request;
import com.baidubce.cce.models.GetNodeGroupDetailsV2Response;
import com.baidubce.cce.models.GetPackageListV2Request;
import com.baidubce.cce.models.GetPackageListV2Response;
import com.baidubce.cce.models.GetReportByTaskIDRequest;
import com.baidubce.cce.models.GetReportByTaskIDResponse;
import com.baidubce.cce.models.GetReportConfigRequest;
import com.baidubce.cce.models.GetReportConfigResponse;
import com.baidubce.cce.models.GetReportListRequest;
import com.baidubce.cce.models.GetReportListResponse;
import com.baidubce.cce.models.GetTaskListV2Request;
import com.baidubce.cce.models.GetTaskListV2Response;
import com.baidubce.cce.models.GetTheListOfClusterNodeGroupsV2Request;
import com.baidubce.cce.models.GetTheListOfClusterNodeGroupsV2Response;
import com.baidubce.cce.models.GetTheListOfClusterNodesV2Request;
import com.baidubce.cce.models.GetTheListOfClusterNodesV2Response;
import com.baidubce.cce.models.HasInspectingTaskRequest;
import com.baidubce.cce.models.HasInspectingTaskResponse;
import com.baidubce.cce.models.ListDiagnosisReportsRequest;
import com.baidubce.cce.models.ListDiagnosisReportsResponse;
import com.baidubce.cce.models.ModifyIGAutoScalerRequest;
import com.baidubce.cce.models.ModifyIGAutoScalerResponse;
import com.baidubce.cce.models.ModifyNodeGroupNodeShrinkProtectionStatusV2Request;
import com.baidubce.cce.models.ModifyNodeGroupNodeShrinkProtectionStatusV2Response;
import com.baidubce.cce.models.ModifyTheNumberOfNodeReplicasInANodeGroupV2Request;
import com.baidubce.cce.models.ModifyTheNumberOfNodeReplicasInANodeGroupV2Response;
import com.baidubce.cce.models.MoveIntoAnExistingNodeV2Request;
import com.baidubce.cce.models.MoveIntoAnExistingNodeV2Response;
import com.baidubce.cce.models.QueryTheConfigurationOfAutoscalerV2Request;
import com.baidubce.cce.models.QueryTheConfigurationOfAutoscalerV2Response;
import com.baidubce.cce.models.RetrieveTheNodeGroupNodeListV2Request;
import com.baidubce.cce.models.RetrieveTheNodeGroupNodeListV2Response;
import com.baidubce.cce.models.StepsToObtainNodeEventsV2Request;
import com.baidubce.cce.models.StepsToObtainNodeEventsV2Response;
import com.baidubce.cce.models.SynchronizeNodeMetadataV2Request;
import com.baidubce.cce.models.SynchronizeNodeMetadataV2Response;
import com.baidubce.cce.models.UpdateAutoscalerConfigurationV2Request;
import com.baidubce.cce.models.UpdateAutoscalerConfigurationV2Response;
import com.baidubce.cce.models.UpdateInspectionItemsRequest;
import com.baidubce.cce.models.UpdateInspectionSubscriptionConfigRequest;
import com.baidubce.cce.models.UpdateNodeAttributesV2Request;
import com.baidubce.cce.models.UpdateNodeAttributesV2Response;
import com.baidubce.cce.models.ViewTaskDetailsV2Request;
import com.baidubce.cce.models.ViewTaskDetailsV2Response;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * API tests for CceClient
 */
public class CceClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CceClient cceClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        config.setCredentials(new DefaultBceCredentials(AK, SK));

        cceClient = new CceClient(config);
    }

    /**
     * batchCreateDiagnosisTasks
     *
     */
    @Test
    public void batchCreateDiagnosisTasksTest() {
        BatchCreateDiagnosisTasksRequest batchCreateDiagnosisTasksRequest = new BatchCreateDiagnosisTasksRequest();
        batchCreateDiagnosisTasksRequest.setClusterID("");
        batchCreateDiagnosisTasksRequest.setType("");
        batchCreateDiagnosisTasksRequest.setTargets(new ArrayList<>());
        BatchCreateDiagnosisTasksResponse response = cceClient.batchCreateDiagnosisTasks(batchCreateDiagnosisTasksRequest);
        System.out.println(response);
    }
    /**
     * createAShrinkingNodeGroupTaskV2
     *
     */
    @Test
    public void createAShrinkingNodeGroupTaskV2Test() {
        CreateAShrinkingNodeGroupTaskV2Request createAShrinkingNodeGroupTaskV2Request = new CreateAShrinkingNodeGroupTaskV2Request();
        createAShrinkingNodeGroupTaskV2Request.setClusterID("");
        createAShrinkingNodeGroupTaskV2Request.setInstanceGroupID("");
        createAShrinkingNodeGroupTaskV2Request.setInstancesToBeRemoved(new ArrayList<>());
        createAShrinkingNodeGroupTaskV2Request.setK8sNodesToBeRemoved(new ArrayList<>());
        createAShrinkingNodeGroupTaskV2Request.setCleanPolicy("");
        createAShrinkingNodeGroupTaskV2Request.setDeleteOption(null);
        CreateAShrinkingNodeGroupTaskV2Response response = cceClient.createAShrinkingNodeGroupTaskV2(createAShrinkingNodeGroupTaskV2Request);
        System.out.println(response);
    }
    /**
     * createAnAutoscalerV2
     *
     */
    @Test
    public void createAnAutoscalerV2Test() {
        CreateAnAutoscalerV2Request createAnAutoscalerV2Request = new CreateAnAutoscalerV2Request();
        createAnAutoscalerV2Request.setClusterID("");
        CreateAnAutoscalerV2Response response = cceClient.createAnAutoscalerV2(createAnAutoscalerV2Request);
        System.out.println(response);
    }
    /**
     * createDiagnosisTask
     *
     */
    @Test
    public void createDiagnosisTaskTest() {
        CreateDiagnosisTaskRequest createDiagnosisTaskRequest = new CreateDiagnosisTaskRequest();
        createDiagnosisTaskRequest.setClusterID("");
        createDiagnosisTaskRequest.setType("");
        createDiagnosisTaskRequest.setTarget(null);
        createDiagnosisTaskRequest.setExistedOption(null);
        CreateDiagnosisTaskResponse response = cceClient.createDiagnosisTask(createDiagnosisTaskRequest);
        System.out.println(response);
    }
    /**
     * createExpansionNodeGroupTaskV2
     *
     */
    @Test
    public void createExpansionNodeGroupTaskV2Test() {
        CreateExpansionNodeGroupTaskV2Request createExpansionNodeGroupTaskV2Request = new CreateExpansionNodeGroupTaskV2Request();
        createExpansionNodeGroupTaskV2Request.setClusterID("");
        createExpansionNodeGroupTaskV2Request.setInstanceGroupID("");
        createExpansionNodeGroupTaskV2Request.setUpToReplicas(0);
        createExpansionNodeGroupTaskV2Request.setUpReplicas(0);
        CreateExpansionNodeGroupTaskV2Response response = cceClient.createExpansionNodeGroupTaskV2(createExpansionNodeGroupTaskV2Request);
        System.out.println(response);
    }
    /**
     * createInspection
     *
     */
    @Test
    public void createInspectionTest() {
        CreateInspectionRequest createInspectionRequest = new CreateInspectionRequest();
        createInspectionRequest.setClusterID("");
        CreateInspectionResponse response = cceClient.createInspection(createInspectionRequest);
        System.out.println(response);
    }
    /**
     * createNodeGroupV2
     *
     */
    @Test
    public void createNodeGroupV2Test() {
        CreateNodeGroupV2Request createNodeGroupV2Request = new CreateNodeGroupV2Request();
        createNodeGroupV2Request.setClusterID("");
        createNodeGroupV2Request.setInstanceGroupName("");
        createNodeGroupV2Request.setClusterRole("");
        createNodeGroupV2Request.setShrinkPolicy("");
        createNodeGroupV2Request.setUpdatePolicy("");
        createNodeGroupV2Request.setCleanPolicy("");
        createNodeGroupV2Request.setInstanceTemplate(null);
        createNodeGroupV2Request.setReplicas(0);
        createNodeGroupV2Request.setClusterAutoscalerSpec(null);
        CreateNodeGroupV2Response response = cceClient.createNodeGroupV2(createNodeGroupV2Request);
        System.out.println(response);
    }
    /**
     * deleteNodeGroupV2
     *
     */
    @Test
    public void deleteNodeGroupV2Test() {
        DeleteNodeGroupV2Request deleteNodeGroupV2Request = new DeleteNodeGroupV2Request();
        deleteNodeGroupV2Request.setClusterID("");
        deleteNodeGroupV2Request.setInstanceGroupID("");
        deleteNodeGroupV2Request.setDeleteInstances(false);
        deleteNodeGroupV2Request.setReleaseAllResource(false);
        DeleteNodeGroupV2Response response = cceClient.deleteNodeGroupV2(deleteNodeGroupV2Request);
        System.out.println(response);
    }
    /**
     * deleteNodesClusterScalingV2
     *
     */
    @Test
    public void deleteNodesClusterScalingV2Test() {
        DeleteNodesClusterScalingV2Request deleteNodesClusterScalingV2Request = new DeleteNodesClusterScalingV2Request();
        deleteNodesClusterScalingV2Request.setClusterID("");
        deleteNodesClusterScalingV2Request.setDeleteOption(null);
        deleteNodesClusterScalingV2Request.setInstanceIDs(new ArrayList<>());
        deleteNodesClusterScalingV2Request.setScaleDown(false);
        DeleteNodesClusterScalingV2Response response = cceClient.deleteNodesClusterScalingV2(deleteNodesClusterScalingV2Request);
        System.out.println(response);
    }
    /**
     * getDiagnosisReportDetail
     *
     */
    @Test
    public void getDiagnosisReportDetailTest() {
        GetDiagnosisReportDetailRequest getDiagnosisReportDetailRequest = new GetDiagnosisReportDetailRequest();
        getDiagnosisReportDetailRequest.setClusterID("");
        getDiagnosisReportDetailRequest.setTaskID("");
        GetDiagnosisReportDetailResponse response = cceClient.getDiagnosisReportDetail(getDiagnosisReportDetailRequest);
        System.out.println(response);
    }
    /**
     * getInspectionItems
     *
     */
    @Test
    public void getInspectionItemsTest() {
        GetInspectionItemsRequest getInspectionItemsRequest = new GetInspectionItemsRequest();
        getInspectionItemsRequest.setClusterID("");
        GetInspectionItemsResponse response = cceClient.getInspectionItems(getInspectionItemsRequest);
        System.out.println(response);
    }
    /**
     * getInspectionSubscriptionConfig
     *
     */
    @Test
    public void getInspectionSubscriptionConfigTest() {
        GetInspectionSubscriptionConfigRequest getInspectionSubscriptionConfigRequest = new GetInspectionSubscriptionConfigRequest();
        getInspectionSubscriptionConfigRequest.setClusterID("");
        GetInspectionSubscriptionConfigResponse response = cceClient.getInspectionSubscriptionConfig(getInspectionSubscriptionConfigRequest);
        System.out.println(response);
    }
    /**
     * getLatestReport
     *
     */
    @Test
    public void getLatestReportTest() {
        GetLatestReportRequest getLatestReportRequest = new GetLatestReportRequest();
        getLatestReportRequest.setClusterID("");
        GetLatestReportResponse response = cceClient.getLatestReport(getLatestReportRequest);
        System.out.println(response);
    }
    /**
     * getNodeDetailsV2
     *
     */
    @Test
    public void getNodeDetailsV2Test() {
        GetNodeDetailsV2Request getNodeDetailsV2Request = new GetNodeDetailsV2Request();
        getNodeDetailsV2Request.setClusterID("");
        getNodeDetailsV2Request.setInstanceID("");
        GetNodeDetailsV2Response response = cceClient.getNodeDetailsV2(getNodeDetailsV2Request);
        System.out.println(response);
    }
    /**
     * getNodeGroupDetailsV2
     *
     */
    @Test
    public void getNodeGroupDetailsV2Test() {
        GetNodeGroupDetailsV2Request getNodeGroupDetailsV2Request = new GetNodeGroupDetailsV2Request();
        getNodeGroupDetailsV2Request.setClusterID("");
        getNodeGroupDetailsV2Request.setInstanceGroupID("");
        GetNodeGroupDetailsV2Response response = cceClient.getNodeGroupDetailsV2(getNodeGroupDetailsV2Request);
        System.out.println(response);
    }
    /**
     * getPackageListV2
     *
     */
    @Test
    public void getPackageListV2Test() {
        GetPackageListV2Request getPackageListV2Request = new GetPackageListV2Request();
        getPackageListV2Request.setType("");
        getPackageListV2Request.setMachineSpecList(new ArrayList<>());
        GetPackageListV2Response response = cceClient.getPackageListV2(getPackageListV2Request);
        System.out.println(response);
    }
    /**
     * getReportByTaskID
     *
     */
    @Test
    public void getReportByTaskIDTest() {
        GetReportByTaskIDRequest getReportByTaskIDRequest = new GetReportByTaskIDRequest();
        getReportByTaskIDRequest.setClusterID("");
        getReportByTaskIDRequest.setTaskID("");
        GetReportByTaskIDResponse response = cceClient.getReportByTaskID(getReportByTaskIDRequest);
        System.out.println(response);
    }
    /**
     * getReportConfig
     *
     */
    @Test
    public void getReportConfigTest() {
        GetReportConfigRequest getReportConfigRequest = new GetReportConfigRequest();
        getReportConfigRequest.setClusterID("");
        GetReportConfigResponse response = cceClient.getReportConfig(getReportConfigRequest);
        System.out.println(response);
    }
    /**
     * getReportList
     *
     */
    @Test
    public void getReportListTest() {
        GetReportListRequest getReportListRequest = new GetReportListRequest();
        getReportListRequest.setClusterID("");
        getReportListRequest.setOrder("");
        getReportListRequest.setOrderBy("");
        getReportListRequest.setInspectionType("");
        getReportListRequest.setInspectionStatus("");
        GetReportListResponse response = cceClient.getReportList(getReportListRequest);
        System.out.println(response);
    }
    /**
     * getTaskListV2
     *
     */
    @Test
    public void getTaskListV2Test() {
        GetTaskListV2Request getTaskListV2Request = new GetTaskListV2Request();
        getTaskListV2Request.setTaskType("");
        getTaskListV2Request.setTargetID("");
        getTaskListV2Request.setOperationType("");
        getTaskListV2Request.setPhase("");
        getTaskListV2Request.setOrder("");
        getTaskListV2Request.setOrderBy("");
        getTaskListV2Request.setPageNo(0);
        getTaskListV2Request.setPageSize(0);
        GetTaskListV2Response response = cceClient.getTaskListV2(getTaskListV2Request);
        System.out.println(response);
    }
    /**
     * getTheListOfClusterNodeGroupsV2
     *
     */
    @Test
    public void getTheListOfClusterNodeGroupsV2Test() {
        GetTheListOfClusterNodeGroupsV2Request getTheListOfClusterNodeGroupsV2Request = new GetTheListOfClusterNodeGroupsV2Request();
        getTheListOfClusterNodeGroupsV2Request.setClusterID("");
        getTheListOfClusterNodeGroupsV2Request.setPageNo(0);
        getTheListOfClusterNodeGroupsV2Request.setPageSize(0);
        getTheListOfClusterNodeGroupsV2Request.setKeywordType("");
        getTheListOfClusterNodeGroupsV2Request.setKeyword("");
        getTheListOfClusterNodeGroupsV2Request.setAutoscalerEnabled("");
        getTheListOfClusterNodeGroupsV2Request.setChargingType("");
        GetTheListOfClusterNodeGroupsV2Response response = cceClient.getTheListOfClusterNodeGroupsV2(getTheListOfClusterNodeGroupsV2Request);
        System.out.println(response);
    }
    /**
     * getTheListOfClusterNodesV2
     *
     */
    @Test
    public void getTheListOfClusterNodesV2Test() {
        GetTheListOfClusterNodesV2Request getTheListOfClusterNodesV2Request = new GetTheListOfClusterNodesV2Request();
        getTheListOfClusterNodesV2Request.setClusterID("");
        getTheListOfClusterNodesV2Request.setKeywordType("");
        getTheListOfClusterNodesV2Request.setKeyword("");
        getTheListOfClusterNodesV2Request.setOrderBy("");
        getTheListOfClusterNodesV2Request.setOrder("");
        getTheListOfClusterNodesV2Request.setPageNo(0);
        getTheListOfClusterNodesV2Request.setPageSize(0);
        GetTheListOfClusterNodesV2Response response = cceClient.getTheListOfClusterNodesV2(getTheListOfClusterNodesV2Request);
        System.out.println(response);
    }
    /**
     * hasInspectingTask
     *
     */
    @Test
    public void hasInspectingTaskTest() {
        HasInspectingTaskRequest hasInspectingTaskRequest = new HasInspectingTaskRequest();
        hasInspectingTaskRequest.setClusterID("");
        HasInspectingTaskResponse response = cceClient.hasInspectingTask(hasInspectingTaskRequest);
        System.out.println(response);
    }
    /**
     * listDiagnosisReports
     *
     */
    @Test
    public void listDiagnosisReportsTest() {
        ListDiagnosisReportsRequest listDiagnosisReportsRequest = new ListDiagnosisReportsRequest();
        listDiagnosisReportsRequest.setClusterID("");
        listDiagnosisReportsRequest.setPageNo(0);
        listDiagnosisReportsRequest.setPageSize(0);
        listDiagnosisReportsRequest.setOrder("");
        listDiagnosisReportsRequest.setOrderBy("");
        listDiagnosisReportsRequest.setResultFilter("");
        ListDiagnosisReportsResponse response = cceClient.listDiagnosisReports(listDiagnosisReportsRequest);
        System.out.println(response);
    }
    /**
     * modifyIGAutoScaler
     *
     */
    @Test
    public void modifyIGAutoScalerTest() {
        ModifyIGAutoScalerRequest modifyIGAutoScalerRequest = new ModifyIGAutoScalerRequest();
        modifyIGAutoScalerRequest.setClusterID("");
        modifyIGAutoScalerRequest.setInstanceGroupID("");
        modifyIGAutoScalerRequest.setEnabled(false);
        modifyIGAutoScalerRequest.setMinReplicas(0);
        modifyIGAutoScalerRequest.setMaxReplicas(0);
        modifyIGAutoScalerRequest.setScalingGroupPriority(0);
        ModifyIGAutoScalerResponse response = cceClient.modifyIGAutoScaler(modifyIGAutoScalerRequest);
        System.out.println(response);
    }
    /**
     * modifyNodeGroupNodeShrinkProtectionStatusV2
     *
     */
    @Test
    public void modifyNodeGroupNodeShrinkProtectionStatusV2Test() {
        ModifyNodeGroupNodeShrinkProtectionStatusV2Request modifyNodeGroupNodeShrinkProtectionStatusV2Request = new ModifyNodeGroupNodeShrinkProtectionStatusV2Request();
        modifyNodeGroupNodeShrinkProtectionStatusV2Request.setClusterID("");
        modifyNodeGroupNodeShrinkProtectionStatusV2Request.setInstanceIDs(new ArrayList<>());
        modifyNodeGroupNodeShrinkProtectionStatusV2Request.setScaleDownDisabled(false);
        ModifyNodeGroupNodeShrinkProtectionStatusV2Response response = cceClient.modifyNodeGroupNodeShrinkProtectionStatusV2(modifyNodeGroupNodeShrinkProtectionStatusV2Request);
        System.out.println(response);
    }
    /**
     * modifyTheNumberOfNodeReplicasInANodeGroupV2
     *
     */
    @Test
    public void modifyTheNumberOfNodeReplicasInANodeGroupV2Test() {
        ModifyTheNumberOfNodeReplicasInANodeGroupV2Request modifyTheNumberOfNodeReplicasInANodeGroupV2Request = new ModifyTheNumberOfNodeReplicasInANodeGroupV2Request();
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setClusterID("");
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setInstanceGroupID("");
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setReplicas(0);
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setInstanceIDs(new ArrayList<>());
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setDeleteInstance(false);
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setDeleteOption(null);
        ModifyTheNumberOfNodeReplicasInANodeGroupV2Response response = cceClient.modifyTheNumberOfNodeReplicasInANodeGroupV2(modifyTheNumberOfNodeReplicasInANodeGroupV2Request);
        System.out.println(response);
    }
    /**
     * moveIntoAnExistingNodeV2
     *
     */
    @Test
    public void moveIntoAnExistingNodeV2Test() {
        MoveIntoAnExistingNodeV2Request moveIntoAnExistingNodeV2Request = new MoveIntoAnExistingNodeV2Request();
        moveIntoAnExistingNodeV2Request.setClusterID("");
        moveIntoAnExistingNodeV2Request.setInstanceGroupID("");
        moveIntoAnExistingNodeV2Request.setInCluster(false);
        moveIntoAnExistingNodeV2Request.setUseInstanceGroupConfig(false);
        moveIntoAnExistingNodeV2Request.setUseInstanceGroupConfigWithDiskInfo(false);
        moveIntoAnExistingNodeV2Request.setInstallGpuDriver(false);
        moveIntoAnExistingNodeV2Request.setExistedInstances(new ArrayList<>());
        moveIntoAnExistingNodeV2Request.setExistedInstancesInCluster(new ArrayList<>());
        MoveIntoAnExistingNodeV2Response response = cceClient.moveIntoAnExistingNodeV2(moveIntoAnExistingNodeV2Request);
        System.out.println(response);
    }
    /**
     * queryTheConfigurationOfAutoscalerV2
     *
     */
    @Test
    public void queryTheConfigurationOfAutoscalerV2Test() {
        QueryTheConfigurationOfAutoscalerV2Request queryTheConfigurationOfAutoscalerV2Request = new QueryTheConfigurationOfAutoscalerV2Request();
        queryTheConfigurationOfAutoscalerV2Request.setClusterID("");
        QueryTheConfigurationOfAutoscalerV2Response response = cceClient.queryTheConfigurationOfAutoscalerV2(queryTheConfigurationOfAutoscalerV2Request);
        System.out.println(response);
    }
    /**
     * retrieveTheNodeGroupNodeListV2
     *
     */
    @Test
    public void retrieveTheNodeGroupNodeListV2Test() {
        RetrieveTheNodeGroupNodeListV2Request retrieveTheNodeGroupNodeListV2Request = new RetrieveTheNodeGroupNodeListV2Request();
        retrieveTheNodeGroupNodeListV2Request.setClusterID("");
        retrieveTheNodeGroupNodeListV2Request.setInstanceGroupID("");
        retrieveTheNodeGroupNodeListV2Request.setPageNo(0);
        retrieveTheNodeGroupNodeListV2Request.setPageSize(0);
        RetrieveTheNodeGroupNodeListV2Response response = cceClient.retrieveTheNodeGroupNodeListV2(retrieveTheNodeGroupNodeListV2Request);
        System.out.println(response);
    }
    /**
     * stepsToObtainNodeEventsV2
     *
     */
    @Test
    public void stepsToObtainNodeEventsV2Test() {
        StepsToObtainNodeEventsV2Request stepsToObtainNodeEventsV2Request = new StepsToObtainNodeEventsV2Request();
        stepsToObtainNodeEventsV2Request.setInstanceID("");
        StepsToObtainNodeEventsV2Response response = cceClient.stepsToObtainNodeEventsV2(stepsToObtainNodeEventsV2Request);
        System.out.println(response);
    }
    /**
     * synchronizeNodeMetadataV2
     *
     */
    @Test
    public void synchronizeNodeMetadataV2Test() {
        SynchronizeNodeMetadataV2Request synchronizeNodeMetadataV2Request = new SynchronizeNodeMetadataV2Request();
        synchronizeNodeMetadataV2Request.setClusterID("");
        SynchronizeNodeMetadataV2Response response = cceClient.synchronizeNodeMetadataV2(synchronizeNodeMetadataV2Request);
        System.out.println(response);
    }
    /**
     * updateAutoscalerConfigurationV2
     *
     */
    @Test
    public void updateAutoscalerConfigurationV2Test() {
        UpdateAutoscalerConfigurationV2Request updateAutoscalerConfigurationV2Request = new UpdateAutoscalerConfigurationV2Request();
        updateAutoscalerConfigurationV2Request.setClusterID("");
        updateAutoscalerConfigurationV2Request.setExpander("");
        updateAutoscalerConfigurationV2Request.setInstanceGroups(new ArrayList<>());
        updateAutoscalerConfigurationV2Request.setKubeVersion("");
        updateAutoscalerConfigurationV2Request.setMaxEmptyBulkDelete(0);
        updateAutoscalerConfigurationV2Request.setScaleDownDelayAfterAdd(0);
        updateAutoscalerConfigurationV2Request.setScaleDownEnabled(false);
        updateAutoscalerConfigurationV2Request.setScaleDownGPUUtilizationThreshold(0);
        updateAutoscalerConfigurationV2Request.setScaleDownUnneededTime(0);
        updateAutoscalerConfigurationV2Request.setScaleDownUtilizationThreshold(0);
        updateAutoscalerConfigurationV2Request.setSkipNodesWithLocalStorage(false);
        updateAutoscalerConfigurationV2Request.setSkipNodesWithSystemPods(false);
        updateAutoscalerConfigurationV2Request.setCustomConfigs(new HashMap<>());
        UpdateAutoscalerConfigurationV2Response response = cceClient.updateAutoscalerConfigurationV2(updateAutoscalerConfigurationV2Request);
        System.out.println(response);
    }
    /**
     * updateInspectionItems
     *
     */
    @Test
    public void updateInspectionItemsTest() {
        UpdateInspectionItemsRequest updateInspectionItemsRequest = new UpdateInspectionItemsRequest();
        updateInspectionItemsRequest.setClusterID("");
        updateInspectionItemsRequest.set（根元素）(new HashMap<>());
        cceClient.updateInspectionItems(updateInspectionItemsRequest);
    }
    /**
     * updateInspectionSubscriptionConfig
     *
     */
    @Test
    public void updateInspectionSubscriptionConfigTest() {
        UpdateInspectionSubscriptionConfigRequest updateInspectionSubscriptionConfigRequest = new UpdateInspectionSubscriptionConfigRequest();
        updateInspectionSubscriptionConfigRequest.setClusterID("");
        updateInspectionSubscriptionConfigRequest.setInspectionConfig(null);
        updateInspectionSubscriptionConfigRequest.setSubscriptionConfig(null);
        cceClient.updateInspectionSubscriptionConfig(updateInspectionSubscriptionConfigRequest);
    }
    /**
     * updateNodeAttributesV2
     *
     */
    @Test
    public void updateNodeAttributesV2Test() {
        UpdateNodeAttributesV2Request updateNodeAttributesV2Request = new UpdateNodeAttributesV2Request();
        updateNodeAttributesV2Request.setClusterID("");
        updateNodeAttributesV2Request.setInstanceID("");
        updateNodeAttributesV2Request.setLabels(new HashMap<>());
        updateNodeAttributesV2Request.setAnnotations(new HashMap<>());
        updateNodeAttributesV2Request.setTaints(new ArrayList<>());
        updateNodeAttributesV2Request.setCceInstancePriority(0);
        UpdateNodeAttributesV2Response response = cceClient.updateNodeAttributesV2(updateNodeAttributesV2Request);
        System.out.println(response);
    }
    /**
     * viewTaskDetailsV2
     *
     */
    @Test
    public void viewTaskDetailsV2Test() {
        ViewTaskDetailsV2Request viewTaskDetailsV2Request = new ViewTaskDetailsV2Request();
        viewTaskDetailsV2Request.setTaskType("");
        viewTaskDetailsV2Request.setTaskID("");
        ViewTaskDetailsV2Response response = cceClient.viewTaskDetailsV2(viewTaskDetailsV2Request);
        System.out.println(response);
    }
}
