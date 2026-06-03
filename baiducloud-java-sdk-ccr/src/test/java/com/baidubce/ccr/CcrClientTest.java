package com.baidubce.ccr;

import com.baidubce.ccr.models.AddPublicNetworkWhitelistRequest;
import com.baidubce.ccr.models.AddVpcLinkRequest;
import com.baidubce.ccr.models.CreateAcceleratorFilterRequest;
import com.baidubce.ccr.models.CreateImageMigrationRuleRequest;
import com.baidubce.ccr.models.CreateInstanceSyncRequest;
import com.baidubce.ccr.models.CreateRobotAccountRequest;
import com.baidubce.ccr.models.CreateRobotAccountResponse;
import com.baidubce.ccr.models.CreateTemporaryPasswordRequest;
import com.baidubce.ccr.models.CreateTemporaryPasswordResponse;
import com.baidubce.ccr.models.CreateTriggerRequest;
import com.baidubce.ccr.models.DeleteAcceleratorFilterRequest;
import com.baidubce.ccr.models.DeleteAcceleratorFiltersRequest;
import com.baidubce.ccr.models.DeleteChartRequest;
import com.baidubce.ccr.models.DeleteChartVersionRequest;
import com.baidubce.ccr.models.DeleteChartVersionsRequest;
import com.baidubce.ccr.models.DeleteChartsRequest;
import com.baidubce.ccr.models.DeleteImageMigrationRuleRequest;
import com.baidubce.ccr.models.DeleteInstanceSyncRequest;
import com.baidubce.ccr.models.DeleteProjectRequest;
import com.baidubce.ccr.models.DeleteProjectsRequest;
import com.baidubce.ccr.models.DeletePublicNetworkWhitelistRequest;
import com.baidubce.ccr.models.DeleteRepositoriesRequest;
import com.baidubce.ccr.models.DeleteRepositoryRequest;
import com.baidubce.ccr.models.DeleteRobotAccountRequest;
import com.baidubce.ccr.models.DeleteTagRequest;
import com.baidubce.ccr.models.DeleteTagsRequest;
import com.baidubce.ccr.models.DeleteTriggerRequest;
import com.baidubce.ccr.models.DeleteTriggersRequest;
import com.baidubce.ccr.models.DeleteVpcLinkRequest;
import com.baidubce.ccr.models.DownloadChartRequest;
import com.baidubce.ccr.models.ExecuteImageMigrationRequest;
import com.baidubce.ccr.models.ExecuteInstanceSyncRequest;
import com.baidubce.ccr.models.GetAcceleratorFilterDetailRequest;
import com.baidubce.ccr.models.GetAcceleratorFilterDetailResponse;
import com.baidubce.ccr.models.GetImageMigrationExecutionRecordDetailRequest;
import com.baidubce.ccr.models.GetImageMigrationExecutionRecordDetailResponse;
import com.baidubce.ccr.models.GetImageMigrationRuleDetailRequest;
import com.baidubce.ccr.models.GetImageMigrationRuleDetailResponse;
import com.baidubce.ccr.models.GetImageMigrationTaskLogsRequest;
import com.baidubce.ccr.models.GetInstanceDetailRequest;
import com.baidubce.ccr.models.GetInstanceDetailResponse;
import com.baidubce.ccr.models.GetInstanceSyncDetailRequest;
import com.baidubce.ccr.models.GetInstanceSyncDetailResponse;
import com.baidubce.ccr.models.GetInstanceSyncExecutionDetailRequest;
import com.baidubce.ccr.models.GetInstanceSyncExecutionDetailResponse;
import com.baidubce.ccr.models.GetInstanceSyncTaskLogsRequest;
import com.baidubce.ccr.models.GetPublicNetworkConfigRequest;
import com.baidubce.ccr.models.GetPublicNetworkConfigResponse;
import com.baidubce.ccr.models.GetRepositoryRequest;
import com.baidubce.ccr.models.GetRepositoryResponse;
import com.baidubce.ccr.models.GetTagBuildHistoryRequest;
import com.baidubce.ccr.models.GetTagBuildHistoryResponse;
import com.baidubce.ccr.models.GetTagDetailRequest;
import com.baidubce.ccr.models.GetTagDetailResponse;
import com.baidubce.ccr.models.GetTagsScanOverviewRequest;
import com.baidubce.ccr.models.GetTagsScanOverviewResponse;
import com.baidubce.ccr.models.GetTriggerDetailRequest;
import com.baidubce.ccr.models.GetTriggerDetailResponse;
import com.baidubce.ccr.models.GetUserDetailRequest;
import com.baidubce.ccr.models.GetUserDetailResponse;
import com.baidubce.ccr.models.ListAcceleratorFiltersRequest;
import com.baidubce.ccr.models.ListAcceleratorFiltersResponse;
import com.baidubce.ccr.models.ListChartVersionsRequest;
import com.baidubce.ccr.models.ListChartVersionsResponse;
import com.baidubce.ccr.models.ListChartsRequest;
import com.baidubce.ccr.models.ListChartsResponse;
import com.baidubce.ccr.models.ListImageMigrationRecordsRequest;
import com.baidubce.ccr.models.ListImageMigrationRecordsResponse;
import com.baidubce.ccr.models.ListImageMigrationRulesRequest;
import com.baidubce.ccr.models.ListImageMigrationRulesResponse;
import com.baidubce.ccr.models.ListImageMigrationTaskRecordsRequest;
import com.baidubce.ccr.models.ListImageMigrationTaskRecordsResponse;
import com.baidubce.ccr.models.ListInstanceSyncRecordsRequest;
import com.baidubce.ccr.models.ListInstanceSyncRecordsResponse;
import com.baidubce.ccr.models.ListInstanceSyncTaskRecordsRequest;
import com.baidubce.ccr.models.ListInstanceSyncTaskRecordsResponse;
import com.baidubce.ccr.models.ListInstanceSyncsRequest;
import com.baidubce.ccr.models.ListInstanceSyncsResponse;
import com.baidubce.ccr.models.ListInstancesRequest;
import com.baidubce.ccr.models.ListInstancesResponse;
import com.baidubce.ccr.models.ListProjectsRequest;
import com.baidubce.ccr.models.ListProjectsResponse;
import com.baidubce.ccr.models.ListRepositoriesRequest;
import com.baidubce.ccr.models.ListRepositoriesResponse;
import com.baidubce.ccr.models.ListRobotAccountsRequest;
import com.baidubce.ccr.models.ListRobotAccountsResponse;
import com.baidubce.ccr.models.ListTagsRequest;
import com.baidubce.ccr.models.ListTagsResponse;
import com.baidubce.ccr.models.ListTriggerTasksRequest;
import com.baidubce.ccr.models.ListTriggerTasksResponse;
import com.baidubce.ccr.models.ListTriggersRequest;
import com.baidubce.ccr.models.ListTriggersResponse;
import com.baidubce.ccr.models.ListVpcLinksRequest;
import com.baidubce.ccr.models.ListVpcLinksResponse;
import com.baidubce.ccr.models.ReExecuteTriggerTaskRequest;
import com.baidubce.ccr.models.RefreshRobotAccountKeyRequest;
import com.baidubce.ccr.models.RefreshRobotAccountKeyResponse;
import com.baidubce.ccr.models.ResetPasswordRequest;
import com.baidubce.ccr.models.StopImageMigrationRequest;
import com.baidubce.ccr.models.StopInstanceSyncRequest;
import com.baidubce.ccr.models.TestAcceleratorFilterRequest;
import com.baidubce.ccr.models.TestAcceleratorFilterResponse;
import com.baidubce.ccr.models.TestTriggerTargetAddressRequest;
import com.baidubce.ccr.models.ToggleAcceleratorFilterRequest;
import com.baidubce.ccr.models.ToggleTriggerRequest;
import com.baidubce.ccr.models.TriggerTagScanRequest;
import com.baidubce.ccr.models.UpdateAcceleratorFilterRequest;
import com.baidubce.ccr.models.UpdateImageMigrationRuleRequest;
import com.baidubce.ccr.models.UpdateInstanceNameRequest;
import com.baidubce.ccr.models.UpdateInstanceNameResponse;
import com.baidubce.ccr.models.UpdateInstanceSyncRequest;
import com.baidubce.ccr.models.UpdateInstanceTagsRequest;
import com.baidubce.ccr.models.UpdatePublicNetworkRequest;
import com.baidubce.ccr.models.UpdateRepositoryRequest;
import com.baidubce.ccr.models.UpdateRepositoryResponse;
import com.baidubce.ccr.models.UpdateRobotAccountRequest;
import com.baidubce.ccr.models.UpdateTriggerRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * API tests for CcrClient
 */
public class CcrClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CcrClient ccrClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        ccrClient = new CcrClient(config);
    }

    /**
     * addPublicNetworkWhitelist
     *
     */
    @Test
    public void addPublicNetworkWhitelistTest() {
        AddPublicNetworkWhitelistRequest addPublicNetworkWhitelistRequest = new AddPublicNetworkWhitelistRequest();
        addPublicNetworkWhitelistRequest.setInstanceId("");
        addPublicNetworkWhitelistRequest.setIpAddr("");
        addPublicNetworkWhitelistRequest.setDescription("");
        ccrClient.addPublicNetworkWhitelist(addPublicNetworkWhitelistRequest);
    }
    /**
     * addVpcLink
     *
     */
    @Test
    public void addVpcLinkTest() {
        AddVpcLinkRequest addVpcLinkRequest = new AddVpcLinkRequest();
        addVpcLinkRequest.setInstanceId("");
        addVpcLinkRequest.setVpcID("");
        addVpcLinkRequest.setSubnetID("");
        addVpcLinkRequest.setIpType("");
        addVpcLinkRequest.setIpAddress("");
        addVpcLinkRequest.setAutoDnsResolve(false);
        ccrClient.addVpcLink(addVpcLinkRequest);
    }
    /**
     * createAcceleratorFilter
     *
     */
    @Test
    public void createAcceleratorFilterTest() {
        CreateAcceleratorFilterRequest createAcceleratorFilterRequest = new CreateAcceleratorFilterRequest();
        createAcceleratorFilterRequest.setInstanceId("");
        createAcceleratorFilterRequest.setDescription("");
        createAcceleratorFilterRequest.setFilters(new ArrayList<>());
        createAcceleratorFilterRequest.setName("");
        ccrClient.createAcceleratorFilter(createAcceleratorFilterRequest);
    }
    /**
     * createImageMigrationRule
     *
     */
    @Test
    public void createImageMigrationRuleTest() {
        CreateImageMigrationRuleRequest createImageMigrationRuleRequest = new CreateImageMigrationRuleRequest();
        createImageMigrationRuleRequest.setInstanceId("");
        createImageMigrationRuleRequest.setDescription("");
        createImageMigrationRuleRequest.setDestProjectName("");
        createImageMigrationRuleRequest.setFilters(new ArrayList<>());
        createImageMigrationRuleRequest.setName("");
        createImageMigrationRuleRequest.setOverride(false);
        createImageMigrationRuleRequest.setSrcRegistry(null);
        createImageMigrationRuleRequest.setTrigger(null);
        ccrClient.createImageMigrationRule(createImageMigrationRuleRequest);
    }
    /**
     * createInstanceSync
     *
     */
    @Test
    public void createInstanceSyncTest() {
        CreateInstanceSyncRequest createInstanceSyncRequest = new CreateInstanceSyncRequest();
        createInstanceSyncRequest.setInstanceId("");
        createInstanceSyncRequest.setDescription("");
        createInstanceSyncRequest.setDestInstanceId("");
        createInstanceSyncRequest.setDestProjectName("");
        createInstanceSyncRequest.setName("");
        createInstanceSyncRequest.setOverride(false);
        createInstanceSyncRequest.setSrcProjectName("");
        createInstanceSyncRequest.setSrcRepository("");
        createInstanceSyncRequest.setSrcTag("");
        createInstanceSyncRequest.setSyncType("");
        createInstanceSyncRequest.setTrigger(null);
        ccrClient.createInstanceSync(createInstanceSyncRequest);
    }
    /**
     * createRobotAccount
     *
     */
    @Test
    public void createRobotAccountTest() {
        CreateRobotAccountRequest createRobotAccountRequest = new CreateRobotAccountRequest();
        createRobotAccountRequest.setInstanceId("");
        createRobotAccountRequest.setName("");
        createRobotAccountRequest.setSecret("");
        createRobotAccountRequest.setDisable(false);
        createRobotAccountRequest.setDuration(0);
        createRobotAccountRequest.setDescription("");
        createRobotAccountRequest.setPermissions(new ArrayList<>());
        CreateRobotAccountResponse response = ccrClient.createRobotAccount(createRobotAccountRequest);
        System.out.println(response);
    }
    /**
     * createTemporaryPassword
     *
     */
    @Test
    public void createTemporaryPasswordTest() {
        CreateTemporaryPasswordRequest createTemporaryPasswordRequest = new CreateTemporaryPasswordRequest();
        createTemporaryPasswordRequest.setInstanceId("");
        createTemporaryPasswordRequest.setDuration(0);
        CreateTemporaryPasswordResponse response = ccrClient.createTemporaryPassword(createTemporaryPasswordRequest);
        System.out.println(response);
    }
    /**
     * createTrigger
     *
     */
    @Test
    public void createTriggerTest() {
        CreateTriggerRequest createTriggerRequest = new CreateTriggerRequest();
        createTriggerRequest.setInstanceId("");
        createTriggerRequest.setDescription("");
        createTriggerRequest.setEventTypes(new ArrayList<>());
        createTriggerRequest.setFilters(new ArrayList<>());
        createTriggerRequest.setName("");
        createTriggerRequest.setTargets(new ArrayList<>());
        ccrClient.createTrigger(createTriggerRequest);
    }
    /**
     * deleteAcceleratorFilter
     *
     */
    @Test
    public void deleteAcceleratorFilterTest() {
        DeleteAcceleratorFilterRequest deleteAcceleratorFilterRequest = new DeleteAcceleratorFilterRequest();
        deleteAcceleratorFilterRequest.setInstanceId("");
        deleteAcceleratorFilterRequest.setPolicyId("");
        ccrClient.deleteAcceleratorFilter(deleteAcceleratorFilterRequest);
    }
    /**
     * deleteAcceleratorFilters
     *
     */
    @Test
    public void deleteAcceleratorFiltersTest() {
        DeleteAcceleratorFiltersRequest deleteAcceleratorFiltersRequest = new DeleteAcceleratorFiltersRequest();
        deleteAcceleratorFiltersRequest.setInstanceId("");
        deleteAcceleratorFiltersRequest.setItems(new ArrayList<>());
        ccrClient.deleteAcceleratorFilters(deleteAcceleratorFiltersRequest);
    }
    /**
     * deleteChart
     *
     */
    @Test
    public void deleteChartTest() {
        DeleteChartRequest deleteChartRequest = new DeleteChartRequest();
        deleteChartRequest.setInstanceId("");
        deleteChartRequest.setProjectName("");
        deleteChartRequest.setChartName("");
        ccrClient.deleteChart(deleteChartRequest);
    }
    /**
     * deleteChartVersion
     *
     */
    @Test
    public void deleteChartVersionTest() {
        DeleteChartVersionRequest deleteChartVersionRequest = new DeleteChartVersionRequest();
        deleteChartVersionRequest.setInstanceId("");
        deleteChartVersionRequest.setProjectName("");
        deleteChartVersionRequest.setChartName("");
        deleteChartVersionRequest.setChartVersion("");
        ccrClient.deleteChartVersion(deleteChartVersionRequest);
    }
    /**
     * deleteChartVersions
     *
     */
    @Test
    public void deleteChartVersionsTest() {
        DeleteChartVersionsRequest deleteChartVersionsRequest = new DeleteChartVersionsRequest();
        deleteChartVersionsRequest.setInstanceId("");
        deleteChartVersionsRequest.setProjectName("");
        deleteChartVersionsRequest.setChartName("");
        deleteChartVersionsRequest.setItems(new ArrayList<>());
        ccrClient.deleteChartVersions(deleteChartVersionsRequest);
    }
    /**
     * deleteCharts
     *
     */
    @Test
    public void deleteChartsTest() {
        DeleteChartsRequest deleteChartsRequest = new DeleteChartsRequest();
        deleteChartsRequest.setInstanceId("");
        deleteChartsRequest.setProjectName("");
        deleteChartsRequest.setItems(new ArrayList<>());
        ccrClient.deleteCharts(deleteChartsRequest);
    }
    /**
     * deleteImageMigrationRule
     *
     */
    @Test
    public void deleteImageMigrationRuleTest() {
        DeleteImageMigrationRuleRequest deleteImageMigrationRuleRequest = new DeleteImageMigrationRuleRequest();
        deleteImageMigrationRuleRequest.setInstanceId("");
        deleteImageMigrationRuleRequest.setPolicyId("");
        ccrClient.deleteImageMigrationRule(deleteImageMigrationRuleRequest);
    }
    /**
     * deleteInstanceSync
     *
     */
    @Test
    public void deleteInstanceSyncTest() {
        DeleteInstanceSyncRequest deleteInstanceSyncRequest = new DeleteInstanceSyncRequest();
        deleteInstanceSyncRequest.setInstanceId("");
        deleteInstanceSyncRequest.setPolicyId("");
        ccrClient.deleteInstanceSync(deleteInstanceSyncRequest);
    }
    /**
     * deleteProject
     *
     */
    @Test
    public void deleteProjectTest() {
        DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
        deleteProjectRequest.setInstanceId("");
        deleteProjectRequest.setProjectName("");
        ccrClient.deleteProject(deleteProjectRequest);
    }
    /**
     * deleteProjects
     *
     */
    @Test
    public void deleteProjectsTest() {
        DeleteProjectsRequest deleteProjectsRequest = new DeleteProjectsRequest();
        deleteProjectsRequest.setInstanceId("");
        deleteProjectsRequest.setItems(new ArrayList<>());
        ccrClient.deleteProjects(deleteProjectsRequest);
    }
    /**
     * deletePublicNetworkWhitelist
     *
     */
    @Test
    public void deletePublicNetworkWhitelistTest() {
        DeletePublicNetworkWhitelistRequest deletePublicNetworkWhitelistRequest = new DeletePublicNetworkWhitelistRequest();
        deletePublicNetworkWhitelistRequest.setInstanceId("");
        deletePublicNetworkWhitelistRequest.setItems(new ArrayList<>());
        ccrClient.deletePublicNetworkWhitelist(deletePublicNetworkWhitelistRequest);
    }
    /**
     * deleteRepositories
     *
     */
    @Test
    public void deleteRepositoriesTest() {
        DeleteRepositoriesRequest deleteRepositoriesRequest = new DeleteRepositoriesRequest();
        deleteRepositoriesRequest.setInstanceId("");
        deleteRepositoriesRequest.setProjectName("");
        deleteRepositoriesRequest.setItems(new ArrayList<>());
        ccrClient.deleteRepositories(deleteRepositoriesRequest);
    }
    /**
     * deleteRepository
     *
     */
    @Test
    public void deleteRepositoryTest() {
        DeleteRepositoryRequest deleteRepositoryRequest = new DeleteRepositoryRequest();
        deleteRepositoryRequest.setInstanceId("");
        deleteRepositoryRequest.setProjectName("");
        deleteRepositoryRequest.setRepositoryName("");
        ccrClient.deleteRepository(deleteRepositoryRequest);
    }
    /**
     * deleteRobotAccount
     *
     */
    @Test
    public void deleteRobotAccountTest() {
        DeleteRobotAccountRequest deleteRobotAccountRequest = new DeleteRobotAccountRequest();
        deleteRobotAccountRequest.setInstanceId("");
        deleteRobotAccountRequest.setRobotID("");
        ccrClient.deleteRobotAccount(deleteRobotAccountRequest);
    }
    /**
     * deleteTag
     *
     */
    @Test
    public void deleteTagTest() {
        DeleteTagRequest deleteTagRequest = new DeleteTagRequest();
        deleteTagRequest.setInstanceId("");
        deleteTagRequest.setProjectName("");
        deleteTagRequest.setRepositoryName("");
        deleteTagRequest.setTagName("");
        ccrClient.deleteTag(deleteTagRequest);
    }
    /**
     * deleteTags
     *
     */
    @Test
    public void deleteTagsTest() {
        DeleteTagsRequest deleteTagsRequest = new DeleteTagsRequest();
        deleteTagsRequest.setInstanceId("");
        deleteTagsRequest.setProjectName("");
        deleteTagsRequest.setRepositoryName("");
        deleteTagsRequest.setItems(new ArrayList<>());
        ccrClient.deleteTags(deleteTagsRequest);
    }
    /**
     * deleteTrigger
     *
     */
    @Test
    public void deleteTriggerTest() {
        DeleteTriggerRequest deleteTriggerRequest = new DeleteTriggerRequest();
        deleteTriggerRequest.setInstanceId("");
        deleteTriggerRequest.setPolicyId("");
        ccrClient.deleteTrigger(deleteTriggerRequest);
    }
    /**
     * deleteTriggers
     *
     */
    @Test
    public void deleteTriggersTest() {
        DeleteTriggersRequest deleteTriggersRequest = new DeleteTriggersRequest();
        deleteTriggersRequest.setInstanceId("");
        deleteTriggersRequest.setItems(new ArrayList<>());
        ccrClient.deleteTriggers(deleteTriggersRequest);
    }
    /**
     * deleteVpcLink
     *
     */
    @Test
    public void deleteVpcLinkTest() {
        DeleteVpcLinkRequest deleteVpcLinkRequest = new DeleteVpcLinkRequest();
        deleteVpcLinkRequest.setInstanceId("");
        deleteVpcLinkRequest.setVpcID("");
        deleteVpcLinkRequest.setSubnetID("");
        ccrClient.deleteVpcLink(deleteVpcLinkRequest);
    }
    /**
     * downloadChart
     *
     */
    @Test
    public void downloadChartTest() {
        DownloadChartRequest downloadChartRequest = new DownloadChartRequest();
        downloadChartRequest.setInstanceId("");
        downloadChartRequest.setProjectName("");
        downloadChartRequest.setFilename("");
        ccrClient.downloadChart(downloadChartRequest);
    }
    /**
     * executeImageMigration
     *
     */
    @Test
    public void executeImageMigrationTest() {
        ExecuteImageMigrationRequest executeImageMigrationRequest = new ExecuteImageMigrationRequest();
        executeImageMigrationRequest.setInstanceId("");
        executeImageMigrationRequest.setPolicyId(0);
        ccrClient.executeImageMigration(executeImageMigrationRequest);
    }
    /**
     * executeInstanceSync
     *
     */
    @Test
    public void executeInstanceSyncTest() {
        ExecuteInstanceSyncRequest executeInstanceSyncRequest = new ExecuteInstanceSyncRequest();
        executeInstanceSyncRequest.setInstanceId("");
        executeInstanceSyncRequest.setPolicyId(0);
        ccrClient.executeInstanceSync(executeInstanceSyncRequest);
    }
    /**
     * getAcceleratorFilterDetail
     *
     */
    @Test
    public void getAcceleratorFilterDetailTest() {
        GetAcceleratorFilterDetailRequest getAcceleratorFilterDetailRequest = new GetAcceleratorFilterDetailRequest();
        getAcceleratorFilterDetailRequest.setInstanceId("");
        getAcceleratorFilterDetailRequest.setPolicyId("");
        GetAcceleratorFilterDetailResponse response = ccrClient.getAcceleratorFilterDetail(getAcceleratorFilterDetailRequest);
        System.out.println(response);
    }
    /**
     * getImageMigrationExecutionRecordDetail
     *
     */
    @Test
    public void getImageMigrationExecutionRecordDetailTest() {
        GetImageMigrationExecutionRecordDetailRequest getImageMigrationExecutionRecordDetailRequest = new GetImageMigrationExecutionRecordDetailRequest();
        getImageMigrationExecutionRecordDetailRequest.setInstanceId("");
        getImageMigrationExecutionRecordDetailRequest.setExecutionId("");
        GetImageMigrationExecutionRecordDetailResponse response = ccrClient.getImageMigrationExecutionRecordDetail(getImageMigrationExecutionRecordDetailRequest);
        System.out.println(response);
    }
    /**
     * getImageMigrationRuleDetail
     *
     */
    @Test
    public void getImageMigrationRuleDetailTest() {
        GetImageMigrationRuleDetailRequest getImageMigrationRuleDetailRequest = new GetImageMigrationRuleDetailRequest();
        getImageMigrationRuleDetailRequest.setInstanceId("");
        getImageMigrationRuleDetailRequest.setPolicyId("");
        GetImageMigrationRuleDetailResponse response = ccrClient.getImageMigrationRuleDetail(getImageMigrationRuleDetailRequest);
        System.out.println(response);
    }
    /**
     * getImageMigrationTaskLogs
     *
     */
    @Test
    public void getImageMigrationTaskLogsTest() {
        GetImageMigrationTaskLogsRequest getImageMigrationTaskLogsRequest = new GetImageMigrationTaskLogsRequest();
        getImageMigrationTaskLogsRequest.setInstanceId("");
        getImageMigrationTaskLogsRequest.setExecutionId("");
        getImageMigrationTaskLogsRequest.setTaskId("");
        ccrClient.getImageMigrationTaskLogs(getImageMigrationTaskLogsRequest);
    }
    /**
     * getInstanceDetail
     *
     */
    @Test
    public void getInstanceDetailTest() {
        GetInstanceDetailRequest getInstanceDetailRequest = new GetInstanceDetailRequest();
        getInstanceDetailRequest.setInstanceId("");
        GetInstanceDetailResponse response = ccrClient.getInstanceDetail(getInstanceDetailRequest);
        System.out.println(response);
    }
    /**
     * getInstanceSyncDetail
     *
     */
    @Test
    public void getInstanceSyncDetailTest() {
        GetInstanceSyncDetailRequest getInstanceSyncDetailRequest = new GetInstanceSyncDetailRequest();
        getInstanceSyncDetailRequest.setInstanceId("");
        getInstanceSyncDetailRequest.setPolicyId("");
        GetInstanceSyncDetailResponse response = ccrClient.getInstanceSyncDetail(getInstanceSyncDetailRequest);
        System.out.println(response);
    }
    /**
     * getInstanceSyncExecutionDetail
     *
     */
    @Test
    public void getInstanceSyncExecutionDetailTest() {
        GetInstanceSyncExecutionDetailRequest getInstanceSyncExecutionDetailRequest = new GetInstanceSyncExecutionDetailRequest();
        getInstanceSyncExecutionDetailRequest.setInstanceId("");
        getInstanceSyncExecutionDetailRequest.setExecutionId("");
        GetInstanceSyncExecutionDetailResponse response = ccrClient.getInstanceSyncExecutionDetail(getInstanceSyncExecutionDetailRequest);
        System.out.println(response);
    }
    /**
     * getInstanceSyncTaskLogs
     *
     */
    @Test
    public void getInstanceSyncTaskLogsTest() {
        GetInstanceSyncTaskLogsRequest getInstanceSyncTaskLogsRequest = new GetInstanceSyncTaskLogsRequest();
        getInstanceSyncTaskLogsRequest.setInstanceId("");
        getInstanceSyncTaskLogsRequest.setExecutionId("");
        getInstanceSyncTaskLogsRequest.setTaskId("");
        ccrClient.getInstanceSyncTaskLogs(getInstanceSyncTaskLogsRequest);
    }
    /**
     * getPublicNetworkConfig
     *
     */
    @Test
    public void getPublicNetworkConfigTest() {
        GetPublicNetworkConfigRequest getPublicNetworkConfigRequest = new GetPublicNetworkConfigRequest();
        getPublicNetworkConfigRequest.setInstanceId("");
        GetPublicNetworkConfigResponse response = ccrClient.getPublicNetworkConfig(getPublicNetworkConfigRequest);
        System.out.println(response);
    }
    /**
     * getRepository
     *
     */
    @Test
    public void getRepositoryTest() {
        GetRepositoryRequest getRepositoryRequest = new GetRepositoryRequest();
        getRepositoryRequest.setInstanceId("");
        getRepositoryRequest.setProjectName("");
        getRepositoryRequest.setRepositoryName("");
        GetRepositoryResponse response = ccrClient.getRepository(getRepositoryRequest);
        System.out.println(response);
    }
    /**
     * getTagBuildHistory
     *
     */
    @Test
    public void getTagBuildHistoryTest() {
        GetTagBuildHistoryRequest getTagBuildHistoryRequest = new GetTagBuildHistoryRequest();
        getTagBuildHistoryRequest.setInstanceId("");
        getTagBuildHistoryRequest.setProjectName("");
        getTagBuildHistoryRequest.setRepositoryName("");
        getTagBuildHistoryRequest.setTagName("");
        GetTagBuildHistoryResponse response = ccrClient.getTagBuildHistory(getTagBuildHistoryRequest);
        System.out.println(response);
    }
    /**
     * getTagDetail
     *
     */
    @Test
    public void getTagDetailTest() {
        GetTagDetailRequest getTagDetailRequest = new GetTagDetailRequest();
        getTagDetailRequest.setInstanceId("");
        getTagDetailRequest.setProjectName("");
        getTagDetailRequest.setRepositoryName("");
        getTagDetailRequest.setTagName("");
        GetTagDetailResponse response = ccrClient.getTagDetail(getTagDetailRequest);
        System.out.println(response);
    }
    /**
     * getTagsScanOverview
     *
     */
    @Test
    public void getTagsScanOverviewTest() {
        GetTagsScanOverviewRequest getTagsScanOverviewRequest = new GetTagsScanOverviewRequest();
        getTagsScanOverviewRequest.setInstanceId("");
        getTagsScanOverviewRequest.setProjectName("");
        getTagsScanOverviewRequest.setRepositoryName("");
        getTagsScanOverviewRequest.setTagName("");
        getTagsScanOverviewRequest.setPageNo(0);
        getTagsScanOverviewRequest.setPageSize(0);
        GetTagsScanOverviewResponse response = ccrClient.getTagsScanOverview(getTagsScanOverviewRequest);
        System.out.println(response);
    }
    /**
     * getTriggerDetail
     *
     */
    @Test
    public void getTriggerDetailTest() {
        GetTriggerDetailRequest getTriggerDetailRequest = new GetTriggerDetailRequest();
        getTriggerDetailRequest.setInstanceId("");
        getTriggerDetailRequest.setPolicyId("");
        GetTriggerDetailResponse response = ccrClient.getTriggerDetail(getTriggerDetailRequest);
        System.out.println(response);
    }
    /**
     * getUserDetail
     *
     */
    @Test
    public void getUserDetailTest() {
        GetUserDetailRequest getUserDetailRequest = new GetUserDetailRequest();
        getUserDetailRequest.setUserId("");
        GetUserDetailResponse response = ccrClient.getUserDetail(getUserDetailRequest);
        System.out.println(response);
    }
    /**
     * listAcceleratorFilters
     *
     */
    @Test
    public void listAcceleratorFiltersTest() {
        ListAcceleratorFiltersRequest listAcceleratorFiltersRequest = new ListAcceleratorFiltersRequest();
        listAcceleratorFiltersRequest.setInstanceId("");
        listAcceleratorFiltersRequest.setPolicyName("");
        listAcceleratorFiltersRequest.setPageNo(0);
        listAcceleratorFiltersRequest.setPageSize(0);
        ListAcceleratorFiltersResponse response = ccrClient.listAcceleratorFilters(listAcceleratorFiltersRequest);
        System.out.println(response);
    }
    /**
     * listChartVersions
     *
     */
    @Test
    public void listChartVersionsTest() {
        ListChartVersionsRequest listChartVersionsRequest = new ListChartVersionsRequest();
        listChartVersionsRequest.setInstanceId("");
        listChartVersionsRequest.setProjectName("");
        listChartVersionsRequest.setChartName("");
        listChartVersionsRequest.setChartVersion("");
        listChartVersionsRequest.setPageNo(0);
        listChartVersionsRequest.setPageSize(0);
        ListChartVersionsResponse response = ccrClient.listChartVersions(listChartVersionsRequest);
        System.out.println(response);
    }
    /**
     * listCharts
     *
     */
    @Test
    public void listChartsTest() {
        ListChartsRequest listChartsRequest = new ListChartsRequest();
        listChartsRequest.setInstanceId("");
        listChartsRequest.setProjectName("");
        listChartsRequest.setChartName("");
        listChartsRequest.setPageNo(0);
        listChartsRequest.setPageSize(0);
        ListChartsResponse response = ccrClient.listCharts(listChartsRequest);
        System.out.println(response);
    }
    /**
     * listImageMigrationRecords
     *
     */
    @Test
    public void listImageMigrationRecordsTest() {
        ListImageMigrationRecordsRequest listImageMigrationRecordsRequest = new ListImageMigrationRecordsRequest();
        listImageMigrationRecordsRequest.setInstanceId("");
        listImageMigrationRecordsRequest.setPolicyId("");
        listImageMigrationRecordsRequest.setPageNo(0);
        listImageMigrationRecordsRequest.setPageSize(0);
        ListImageMigrationRecordsResponse response = ccrClient.listImageMigrationRecords(listImageMigrationRecordsRequest);
        System.out.println(response);
    }
    /**
     * listImageMigrationRules
     *
     */
    @Test
    public void listImageMigrationRulesTest() {
        ListImageMigrationRulesRequest listImageMigrationRulesRequest = new ListImageMigrationRulesRequest();
        listImageMigrationRulesRequest.setInstanceId("");
        listImageMigrationRulesRequest.setPolicyName("");
        listImageMigrationRulesRequest.setPageNo(0);
        listImageMigrationRulesRequest.setPageSize(0);
        ListImageMigrationRulesResponse response = ccrClient.listImageMigrationRules(listImageMigrationRulesRequest);
        System.out.println(response);
    }
    /**
     * listImageMigrationTaskRecords
     *
     */
    @Test
    public void listImageMigrationTaskRecordsTest() {
        ListImageMigrationTaskRecordsRequest listImageMigrationTaskRecordsRequest = new ListImageMigrationTaskRecordsRequest();
        listImageMigrationTaskRecordsRequest.setInstanceId("");
        listImageMigrationTaskRecordsRequest.setExecutionId("");
        listImageMigrationTaskRecordsRequest.setPageNo(0);
        listImageMigrationTaskRecordsRequest.setPageSize(0);
        ListImageMigrationTaskRecordsResponse response = ccrClient.listImageMigrationTaskRecords(listImageMigrationTaskRecordsRequest);
        System.out.println(response);
    }
    /**
     * listInstanceSyncRecords
     *
     */
    @Test
    public void listInstanceSyncRecordsTest() {
        ListInstanceSyncRecordsRequest listInstanceSyncRecordsRequest = new ListInstanceSyncRecordsRequest();
        listInstanceSyncRecordsRequest.setInstanceId("");
        listInstanceSyncRecordsRequest.setPolicyId("");
        listInstanceSyncRecordsRequest.setPageNo(0);
        listInstanceSyncRecordsRequest.setPageSize(0);
        ListInstanceSyncRecordsResponse response = ccrClient.listInstanceSyncRecords(listInstanceSyncRecordsRequest);
        System.out.println(response);
    }
    /**
     * listInstanceSyncTaskRecords
     *
     */
    @Test
    public void listInstanceSyncTaskRecordsTest() {
        ListInstanceSyncTaskRecordsRequest listInstanceSyncTaskRecordsRequest = new ListInstanceSyncTaskRecordsRequest();
        listInstanceSyncTaskRecordsRequest.setInstanceId("");
        listInstanceSyncTaskRecordsRequest.setExecutionId("");
        listInstanceSyncTaskRecordsRequest.setPageNo(0);
        listInstanceSyncTaskRecordsRequest.setPageSize(0);
        ListInstanceSyncTaskRecordsResponse response = ccrClient.listInstanceSyncTaskRecords(listInstanceSyncTaskRecordsRequest);
        System.out.println(response);
    }
    /**
     * listInstanceSyncs
     *
     */
    @Test
    public void listInstanceSyncsTest() {
        ListInstanceSyncsRequest listInstanceSyncsRequest = new ListInstanceSyncsRequest();
        listInstanceSyncsRequest.setInstanceId("");
        listInstanceSyncsRequest.setPolicyName("");
        listInstanceSyncsRequest.setPageNo(0);
        listInstanceSyncsRequest.setPageSize(0);
        ListInstanceSyncsResponse response = ccrClient.listInstanceSyncs(listInstanceSyncsRequest);
        System.out.println(response);
    }
    /**
     * listInstances
     *
     */
    @Test
    public void listInstancesTest() {
        ListInstancesRequest listInstancesRequest = new ListInstancesRequest();
        listInstancesRequest.setPageNo(0);
        listInstancesRequest.setPageSize(0);
        listInstancesRequest.setKeywordType("");
        listInstancesRequest.setKeyword("");
        listInstancesRequest.setAcrossregion("");
        ListInstancesResponse response = ccrClient.listInstances(listInstancesRequest);
        System.out.println(response);
    }
    /**
     * listProjects
     *
     */
    @Test
    public void listProjectsTest() {
        ListProjectsRequest listProjectsRequest = new ListProjectsRequest();
        listProjectsRequest.setInstanceId("");
        listProjectsRequest.setProjectName("");
        listProjectsRequest.setPageNo(0);
        listProjectsRequest.setPageSize(0);
        ListProjectsResponse response = ccrClient.listProjects(listProjectsRequest);
        System.out.println(response);
    }
    /**
     * listRepositories
     *
     */
    @Test
    public void listRepositoriesTest() {
        ListRepositoriesRequest listRepositoriesRequest = new ListRepositoriesRequest();
        listRepositoriesRequest.setInstanceId("");
        listRepositoriesRequest.setProjectName("");
        listRepositoriesRequest.setRepositoryName("");
        listRepositoriesRequest.setPageNo(0);
        listRepositoriesRequest.setPageSize(0);
        ListRepositoriesResponse response = ccrClient.listRepositories(listRepositoriesRequest);
        System.out.println(response);
    }
    /**
     * listRobotAccounts
     *
     */
    @Test
    public void listRobotAccountsTest() {
        ListRobotAccountsRequest listRobotAccountsRequest = new ListRobotAccountsRequest();
        listRobotAccountsRequest.setInstanceId("");
        listRobotAccountsRequest.setStatus("");
        listRobotAccountsRequest.setPageNo(0);
        listRobotAccountsRequest.setPageSize(0);
        ListRobotAccountsResponse response = ccrClient.listRobotAccounts(listRobotAccountsRequest);
        System.out.println(response);
    }
    /**
     * listTags
     *
     */
    @Test
    public void listTagsTest() {
        ListTagsRequest listTagsRequest = new ListTagsRequest();
        listTagsRequest.setInstanceId("");
        listTagsRequest.setProjectName("");
        listTagsRequest.setRepositoryName("");
        listTagsRequest.setTagName("");
        listTagsRequest.setPageNo(0);
        listTagsRequest.setPageSize(0);
        ListTagsResponse response = ccrClient.listTags(listTagsRequest);
        System.out.println(response);
    }
    /**
     * listTriggerTasks
     *
     */
    @Test
    public void listTriggerTasksTest() {
        ListTriggerTasksRequest listTriggerTasksRequest = new ListTriggerTasksRequest();
        listTriggerTasksRequest.setInstanceId("");
        listTriggerTasksRequest.setPolicyId("");
        listTriggerTasksRequest.setPageNo(0);
        listTriggerTasksRequest.setPageSize(0);
        ListTriggerTasksResponse response = ccrClient.listTriggerTasks(listTriggerTasksRequest);
        System.out.println(response);
    }
    /**
     * listTriggers
     *
     */
    @Test
    public void listTriggersTest() {
        ListTriggersRequest listTriggersRequest = new ListTriggersRequest();
        listTriggersRequest.setInstanceId("");
        listTriggersRequest.setPolicyName("");
        listTriggersRequest.setPageNo(0);
        listTriggersRequest.setPageSize(0);
        ListTriggersResponse response = ccrClient.listTriggers(listTriggersRequest);
        System.out.println(response);
    }
    /**
     * listVpcLinks
     *
     */
    @Test
    public void listVpcLinksTest() {
        ListVpcLinksRequest listVpcLinksRequest = new ListVpcLinksRequest();
        listVpcLinksRequest.setInstanceId("");
        ListVpcLinksResponse response = ccrClient.listVpcLinks(listVpcLinksRequest);
        System.out.println(response);
    }
    /**
     * reExecuteTriggerTask
     *
     */
    @Test
    public void reExecuteTriggerTaskTest() {
        ReExecuteTriggerTaskRequest reExecuteTriggerTaskRequest = new ReExecuteTriggerTaskRequest();
        reExecuteTriggerTaskRequest.setInstanceId("");
        reExecuteTriggerTaskRequest.setPolicyId("");
        reExecuteTriggerTaskRequest.setJobId("");
        ccrClient.reExecuteTriggerTask(reExecuteTriggerTaskRequest);
    }
    /**
     * refreshRobotAccountKey
     *
     */
    @Test
    public void refreshRobotAccountKeyTest() {
        RefreshRobotAccountKeyRequest refreshRobotAccountKeyRequest = new RefreshRobotAccountKeyRequest();
        refreshRobotAccountKeyRequest.setInstanceId("");
        refreshRobotAccountKeyRequest.setRobotID("");
        refreshRobotAccountKeyRequest.setSecret("");
        RefreshRobotAccountKeyResponse response = ccrClient.refreshRobotAccountKey(refreshRobotAccountKeyRequest);
        System.out.println(response);
    }
    /**
     * resetPassword
     *
     */
    @Test
    public void resetPasswordTest() {
        ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest();
        resetPasswordRequest.setInstanceId("");
        resetPasswordRequest.setPassword("");
        ccrClient.resetPassword(resetPasswordRequest);
    }
    /**
     * stopImageMigration
     *
     */
    @Test
    public void stopImageMigrationTest() {
        StopImageMigrationRequest stopImageMigrationRequest = new StopImageMigrationRequest();
        stopImageMigrationRequest.setInstanceId("");
        stopImageMigrationRequest.setExecutionId("");
        ccrClient.stopImageMigration(stopImageMigrationRequest);
    }
    /**
     * stopInstanceSync
     *
     */
    @Test
    public void stopInstanceSyncTest() {
        StopInstanceSyncRequest stopInstanceSyncRequest = new StopInstanceSyncRequest();
        stopInstanceSyncRequest.setInstanceId("");
        stopInstanceSyncRequest.setExecutionId("");
        ccrClient.stopInstanceSync(stopInstanceSyncRequest);
    }
    /**
     * testAcceleratorFilter
     *
     */
    @Test
    public void testAcceleratorFilterTest() {
        TestAcceleratorFilterRequest testAcceleratorFilterRequest = new TestAcceleratorFilterRequest();
        testAcceleratorFilterRequest.setFilters(new ArrayList<>());
        testAcceleratorFilterRequest.setRepository("");
        TestAcceleratorFilterResponse response = ccrClient.testAcceleratorFilter(testAcceleratorFilterRequest);
        System.out.println(response);
    }
    /**
     * testTriggerTargetAddress
     *
     */
    @Test
    public void testTriggerTargetAddressTest() {
        TestTriggerTargetAddressRequest testTriggerTargetAddressRequest = new TestTriggerTargetAddressRequest();
        testTriggerTargetAddressRequest.setInstanceId("");
        testTriggerTargetAddressRequest.setAddress("");
        testTriggerTargetAddressRequest.setHeaders(new HashMap<>());
        ccrClient.testTriggerTargetAddress(testTriggerTargetAddressRequest);
    }
    /**
     * toggleAcceleratorFilter
     *
     */
    @Test
    public void toggleAcceleratorFilterTest() {
        ToggleAcceleratorFilterRequest toggleAcceleratorFilterRequest = new ToggleAcceleratorFilterRequest();
        toggleAcceleratorFilterRequest.setInstanceId("");
        toggleAcceleratorFilterRequest.setPolicyId("");
        toggleAcceleratorFilterRequest.setEnabled("");
        ccrClient.toggleAcceleratorFilter(toggleAcceleratorFilterRequest);
    }
    /**
     * toggleTrigger
     *
     */
    @Test
    public void toggleTriggerTest() {
        ToggleTriggerRequest toggleTriggerRequest = new ToggleTriggerRequest();
        toggleTriggerRequest.setInstanceId("");
        toggleTriggerRequest.setPolicyId("");
        toggleTriggerRequest.setEnabled("");
        ccrClient.toggleTrigger(toggleTriggerRequest);
    }
    /**
     * triggerTagScan
     *
     */
    @Test
    public void triggerTagScanTest() {
        TriggerTagScanRequest triggerTagScanRequest = new TriggerTagScanRequest();
        triggerTagScanRequest.setInstanceId("");
        triggerTagScanRequest.setProjectName("");
        triggerTagScanRequest.setRepositoryName("");
        triggerTagScanRequest.setTagName("");
        ccrClient.triggerTagScan(triggerTagScanRequest);
    }
    /**
     * updateAcceleratorFilter
     *
     */
    @Test
    public void updateAcceleratorFilterTest() {
        UpdateAcceleratorFilterRequest updateAcceleratorFilterRequest = new UpdateAcceleratorFilterRequest();
        updateAcceleratorFilterRequest.setInstanceId("");
        updateAcceleratorFilterRequest.setPolicyId("");
        updateAcceleratorFilterRequest.setDescription("");
        updateAcceleratorFilterRequest.setFilters(new ArrayList<>());
        updateAcceleratorFilterRequest.setName("");
        ccrClient.updateAcceleratorFilter(updateAcceleratorFilterRequest);
    }
    /**
     * updateImageMigrationRule
     *
     */
    @Test
    public void updateImageMigrationRuleTest() {
        UpdateImageMigrationRuleRequest updateImageMigrationRuleRequest = new UpdateImageMigrationRuleRequest();
        updateImageMigrationRuleRequest.setInstanceId("");
        updateImageMigrationRuleRequest.setPolicyId("");
        updateImageMigrationRuleRequest.setDescription("");
        updateImageMigrationRuleRequest.setDestProjectName("");
        updateImageMigrationRuleRequest.setFilters(new ArrayList<>());
        updateImageMigrationRuleRequest.setName("");
        updateImageMigrationRuleRequest.setOverride(false);
        updateImageMigrationRuleRequest.setSrcRegistry(null);
        updateImageMigrationRuleRequest.setTrigger(null);
        ccrClient.updateImageMigrationRule(updateImageMigrationRuleRequest);
    }
    /**
     * updateInstanceName
     *
     */
    @Test
    public void updateInstanceNameTest() {
        UpdateInstanceNameRequest updateInstanceNameRequest = new UpdateInstanceNameRequest();
        updateInstanceNameRequest.setInstanceId("");
        updateInstanceNameRequest.setName("");
        UpdateInstanceNameResponse response = ccrClient.updateInstanceName(updateInstanceNameRequest);
        System.out.println(response);
    }
    /**
     * updateInstanceSync
     *
     */
    @Test
    public void updateInstanceSyncTest() {
        UpdateInstanceSyncRequest updateInstanceSyncRequest = new UpdateInstanceSyncRequest();
        updateInstanceSyncRequest.setInstanceId("");
        updateInstanceSyncRequest.setPolicyId("");
        updateInstanceSyncRequest.setDescription("");
        updateInstanceSyncRequest.setDestInstanceId("");
        updateInstanceSyncRequest.setDestProjectName("");
        updateInstanceSyncRequest.setName("");
        updateInstanceSyncRequest.setOverride(false);
        updateInstanceSyncRequest.setSrcProjectName("");
        updateInstanceSyncRequest.setSrcRepository("");
        updateInstanceSyncRequest.setSrcTag("");
        updateInstanceSyncRequest.setSyncType("");
        updateInstanceSyncRequest.setTrigger(null);
        ccrClient.updateInstanceSync(updateInstanceSyncRequest);
    }
    /**
     * updateInstanceTags
     *
     */
    @Test
    public void updateInstanceTagsTest() {
        UpdateInstanceTagsRequest updateInstanceTagsRequest = new UpdateInstanceTagsRequest();
        updateInstanceTagsRequest.setInstanceId("");
        updateInstanceTagsRequest.setTags(new ArrayList<>());
        ccrClient.updateInstanceTags(updateInstanceTagsRequest);
    }
    /**
     * updatePublicNetwork
     *
     */
    @Test
    public void updatePublicNetworkTest() {
        UpdatePublicNetworkRequest updatePublicNetworkRequest = new UpdatePublicNetworkRequest();
        updatePublicNetworkRequest.setInstanceId("");
        updatePublicNetworkRequest.setAction("");
        ccrClient.updatePublicNetwork(updatePublicNetworkRequest);
    }
    /**
     * updateRepository
     *
     */
    @Test
    public void updateRepositoryTest() {
        UpdateRepositoryRequest updateRepositoryRequest = new UpdateRepositoryRequest();
        updateRepositoryRequest.setInstanceId("");
        updateRepositoryRequest.setProjectName("");
        updateRepositoryRequest.setRepositoryName("");
        updateRepositoryRequest.setDescription("");
        UpdateRepositoryResponse response = ccrClient.updateRepository(updateRepositoryRequest);
        System.out.println(response);
    }
    /**
     * updateRobotAccount
     *
     */
    @Test
    public void updateRobotAccountTest() {
        UpdateRobotAccountRequest updateRobotAccountRequest = new UpdateRobotAccountRequest();
        updateRobotAccountRequest.setInstanceId("");
        updateRobotAccountRequest.setRobotID("");
        updateRobotAccountRequest.setDisable(false);
        updateRobotAccountRequest.setDuration(0);
        updateRobotAccountRequest.setDescription("");
        updateRobotAccountRequest.setPermissions(new ArrayList<>());
        ccrClient.updateRobotAccount(updateRobotAccountRequest);
    }
    /**
     * updateTrigger
     *
     */
    @Test
    public void updateTriggerTest() {
        UpdateTriggerRequest updateTriggerRequest = new UpdateTriggerRequest();
        updateTriggerRequest.setInstanceId("");
        updateTriggerRequest.setPolicyId("");
        updateTriggerRequest.setDescription("");
        updateTriggerRequest.setEventTypes(new ArrayList<>());
        updateTriggerRequest.setFilters(new ArrayList<>());
        updateTriggerRequest.setName("");
        updateTriggerRequest.setTargets(new ArrayList<>());
        ccrClient.updateTrigger(updateTriggerRequest);
    }
}
