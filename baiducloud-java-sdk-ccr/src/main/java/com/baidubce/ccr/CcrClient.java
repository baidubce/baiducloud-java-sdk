package com.baidubce.ccr;

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

import com.baidubce.ccr.models.AddPublicNetworkWhitelistRequest;
import com.baidubce.ccr.models.AddVpcLinkRequest;
import com.baidubce.ccr.models.CreateAcceleratorFilterRequest;
import com.baidubce.ccr.models.CreateImageMigrationRuleRequest;
import com.baidubce.ccr.models.CreateInstanceSyncRequest;
import com.baidubce.ccr.models.CreateProjectRequest;
import com.baidubce.ccr.models.CreateProjectResponse;
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
import com.baidubce.ccr.models.GetProjectDetailRequest;
import com.baidubce.ccr.models.GetProjectDetailResponse;
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
import com.baidubce.ccr.models.UpdateProjectRequest;
import com.baidubce.ccr.models.UpdateProjectResponse;
import com.baidubce.ccr.models.UpdatePublicNetworkRequest;
import com.baidubce.ccr.models.UpdateRepositoryRequest;
import com.baidubce.ccr.models.UpdateRepositoryResponse;
import com.baidubce.ccr.models.UpdateRobotAccountRequest;
import com.baidubce.ccr.models.UpdateTriggerRequest;

public class CcrClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_INSTANCES = "instances";
    private static final String CONSTANT_CREDENTIAL = "credential";
    private static final String CONSTANT_PROJECTS = "projects";
    private static final String CONSTANT_ACCELERATORS = "accelerators";
    private static final String CONSTANT_POLICIES = "policies";
    private static final String CONSTANT_FILTERS = "filters";
    private static final String CONSTANT_SYNCS = "syncs";
    private static final String CONSTANT_REPOSITORIES = "repositories";
    private static final String CONSTANT_TAGS = "tags";
    private static final String CONSTANT_BUILDHISTORY = "buildhistory";
    private static final String CONSTANT_TRIGGERS = "triggers";
    private static final String CONSTANT_EXECUTIONS = "executions";
    private static final String CONSTANT_PUBLICLINKS = "publiclinks";
    private static final String CONSTANT_ROBOTS = "robots";
    private static final String CONSTANT_REPLICATIONS = "replications";
    private static final String CONSTANT_SCANOVERVIEW = "scanoverview";
    private static final String CONSTANT_TARGETS = "targets";
    private static final String CONSTANT_TASKS = "tasks";
    private static final String CONSTANT_SCAN = "scan";
    private static final String CONSTANT_PRIVATELINKS = "privatelinks";
    private static final String CONSTANT_CHARTS = "charts";
    private static final String CONSTANT_VERSIONS = "versions";
    private static final String CONSTANT_SECRET = "secret";
    private static final String CONSTANT_LOG = "log";
    private static final String CONSTANT_WHITELIST = "whitelist";
    private static final String CONSTANT_USERS = "users";
    private static final String CONSTANT_PROFILE = "profile";
    private static final String CONSTANT_ENABLE = "enable";
    private static final String CONSTANT_DOWNLOAD = "download";
    private static final String CONSTANT_JOBS = "jobs";
    private static final String CONSTANT_RETRY = "retry";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public CcrClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public CcrClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addPublicNetworkWhitelist
     * 
     * @param request 入参结构体
     */
    public void addPublicNetworkWhitelist(AddPublicNetworkWhitelistRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PUBLICLINKS, CONSTANT_WHITELIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addVpcLink
     * 
     * @param request 入参结构体
     */
    public void addVpcLink(AddVpcLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PRIVATELINKS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAcceleratorFilter
     * 
     * @param request 入参结构体
     */
    public void createAcceleratorFilter(CreateAcceleratorFilterRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ACCELERATORS, CONSTANT_POLICIES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createImageMigrationRule
     * 
     * @param request 入参结构体
     */
    public void createImageMigrationRule(CreateImageMigrationRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_REPLICATIONS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createInstanceSync
     * 
     * @param request 入参结构体
     */
    public void createInstanceSync(CreateInstanceSyncRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_SYNCS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createProject
     * 
     * @param request 入参结构体
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PROJECTS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateProjectResponse.class);
    }

    /**
     * createRobotAccount
     * 
     * @param request 入参结构体
     * @return CreateRobotAccountResponse
     */
    public CreateRobotAccountResponse createRobotAccount(CreateRobotAccountRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ROBOTS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateRobotAccountResponse.class);
    }

    /**
     * createTemporaryPassword
     * 
     * @param request 入参结构体
     * @return CreateTemporaryPasswordResponse
     */
    public CreateTemporaryPasswordResponse createTemporaryPassword(CreateTemporaryPasswordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_CREDENTIAL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateTemporaryPasswordResponse.class);
    }

    /**
     * createTrigger
     * 
     * @param request 入参结构体
     */
    public void createTrigger(CreateTriggerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_TRIGGERS, CONSTANT_POLICIES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAcceleratorFilter
     * 
     * @param request 入参结构体
     */
    public void deleteAcceleratorFilter(DeleteAcceleratorFilterRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_ACCELERATORS,
                        CONSTANT_POLICIES,
                        request.getPolicyId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAcceleratorFilters
     * 
     * @param request 入参结构体
     */
    public void deleteAcceleratorFilters(DeleteAcceleratorFiltersRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ACCELERATORS, CONSTANT_POLICIES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteChart
     * 
     * @param request 入参结构体
     */
    public void deleteChart(DeleteChartRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_CHARTS,
                        request.getChartName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteChartVersion
     * 
     * @param request 入参结构体
     */
    public void deleteChartVersion(DeleteChartVersionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_CHARTS,
                        request.getChartName(),
                        CONSTANT_VERSIONS,
                        request.getChartVersion());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteChartVersions
     * 
     * @param request 入参结构体
     */
    public void deleteChartVersions(DeleteChartVersionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_CHARTS,
                        request.getChartName(),
                        CONSTANT_VERSIONS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteCharts
     * 
     * @param request 入参结构体
     */
    public void deleteCharts(DeleteChartsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_CHARTS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteImageMigrationRule
     * 
     * @param request 入参结构体
     */
    public void deleteImageMigrationRule(DeleteImageMigrationRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_REPLICATIONS, request.getPolicyId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteInstanceSync
     * 
     * @param request 入参结构体
     */
    public void deleteInstanceSync(DeleteInstanceSyncRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_SYNCS, request.getPolicyId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteProject
     * 
     * @param request 入参结构体
     */
    public void deleteProject(DeleteProjectRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PROJECTS, request.getProjectName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteProjects
     * 
     * @param request 入参结构体
     */
    public void deleteProjects(DeleteProjectsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PROJECTS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deletePublicNetworkWhitelist
     * 
     * @param request 入参结构体
     */
    public void deletePublicNetworkWhitelist(DeletePublicNetworkWhitelistRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PUBLICLINKS, CONSTANT_WHITELIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRepositories
     * 
     * @param request 入参结构体
     */
    public void deleteRepositories(DeleteRepositoriesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRepository
     * 
     * @param request 入参结构体
     */
    public void deleteRepository(DeleteRepositoryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRobotAccount
     * 
     * @param request 入参结构体
     */
    public void deleteRobotAccount(DeleteRobotAccountRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ROBOTS, request.getRobotID());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteTag
     * 
     * @param request 入参结构体
     */
    public void deleteTag(DeleteTagRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName(),
                        CONSTANT_TAGS,
                        request.getTagName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteTags
     * 
     * @param request 入参结构体
     */
    public void deleteTags(DeleteTagsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName(),
                        CONSTANT_TAGS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteTrigger
     * 
     * @param request 入参结构体
     */
    public void deleteTrigger(DeleteTriggerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_TRIGGERS,
                        CONSTANT_POLICIES,
                        request.getPolicyId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteTriggers
     * 
     * @param request 入参结构体
     */
    public void deleteTriggers(DeleteTriggersRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_TRIGGERS, CONSTANT_POLICIES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteVpcLink
     * 
     * @param request 入参结构体
     */
    public void deleteVpcLink(DeleteVpcLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PRIVATELINKS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * downloadChart
     * 
     * @param request 入参结构体
     */
    public void downloadChart(DownloadChartRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_CHARTS,
                        CONSTANT_DOWNLOAD,
                        request.getFilename());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * executeImageMigration
     * 
     * @param request 入参结构体
     */
    public void executeImageMigration(ExecuteImageMigrationRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * executeInstanceSync
     * 
     * @param request 入参结构体
     */
    public void executeInstanceSync(ExecuteInstanceSyncRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getAcceleratorFilterDetail
     * 
     * @param request 入参结构体
     * @return GetAcceleratorFilterDetailResponse
     */
    public GetAcceleratorFilterDetailResponse getAcceleratorFilterDetail(GetAcceleratorFilterDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_ACCELERATORS,
                        CONSTANT_POLICIES,
                        request.getPolicyId());
        return invokeHttpClient(internalRequest, GetAcceleratorFilterDetailResponse.class);
    }

    /**
     * getImageMigrationExecutionRecordDetail
     * 
     * @param request 入参结构体
     * @return GetImageMigrationExecutionRecordDetailResponse
     */
    public GetImageMigrationExecutionRecordDetailResponse getImageMigrationExecutionRecordDetail(GetImageMigrationExecutionRecordDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS, request.getExecutionId());
        return invokeHttpClient(internalRequest, GetImageMigrationExecutionRecordDetailResponse.class);
    }

    /**
     * getImageMigrationRuleDetail
     * 
     * @param request 入参结构体
     * @return GetImageMigrationRuleDetailResponse
     */
    public GetImageMigrationRuleDetailResponse getImageMigrationRuleDetail(GetImageMigrationRuleDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_REPLICATIONS, request.getPolicyId());
        return invokeHttpClient(internalRequest, GetImageMigrationRuleDetailResponse.class);
    }

    /**
     * getImageMigrationTaskLogs
     * 
     * @param request 入参结构体
     */
    public void getImageMigrationTaskLogs(GetImageMigrationTaskLogsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_EXECUTIONS,
                        request.getExecutionId(),
                        CONSTANT_TASKS,
                        request.getTaskId(),
                        CONSTANT_LOG);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getInstanceDetail
     * 
     * @param request 入参结构体
     * @return GetInstanceDetailResponse
     */
    public GetInstanceDetailResponse getInstanceDetail(GetInstanceDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId());
        return invokeHttpClient(internalRequest, GetInstanceDetailResponse.class);
    }

    /**
     * getInstanceSyncDetail
     * 
     * @param request 入参结构体
     * @return GetInstanceSyncDetailResponse
     */
    public GetInstanceSyncDetailResponse getInstanceSyncDetail(GetInstanceSyncDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_SYNCS, request.getPolicyId());
        return invokeHttpClient(internalRequest, GetInstanceSyncDetailResponse.class);
    }

    /**
     * getInstanceSyncExecutionDetail
     * 
     * @param request 入参结构体
     * @return GetInstanceSyncExecutionDetailResponse
     */
    public GetInstanceSyncExecutionDetailResponse getInstanceSyncExecutionDetail(GetInstanceSyncExecutionDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS, request.getExecutionId());
        return invokeHttpClient(internalRequest, GetInstanceSyncExecutionDetailResponse.class);
    }

    /**
     * getInstanceSyncTaskLogs
     * 
     * @param request 入参结构体
     */
    public void getInstanceSyncTaskLogs(GetInstanceSyncTaskLogsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_EXECUTIONS,
                        request.getExecutionId(),
                        CONSTANT_TASKS,
                        request.getTaskId(),
                        CONSTANT_LOG);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getProjectDetail
     * 
     * @param request 入参结构体
     * @return GetProjectDetailResponse
     */
    public GetProjectDetailResponse getProjectDetail(GetProjectDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PROJECTS, request.getProjectName());
        return invokeHttpClient(internalRequest, GetProjectDetailResponse.class);
    }

    /**
     * getPublicNetworkConfig
     * 
     * @param request 入参结构体
     * @return GetPublicNetworkConfigResponse
     */
    public GetPublicNetworkConfigResponse getPublicNetworkConfig(GetPublicNetworkConfigRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PUBLICLINKS);
        return invokeHttpClient(internalRequest, GetPublicNetworkConfigResponse.class);
    }

    /**
     * getRepository
     * 
     * @param request 入参结构体
     * @return GetRepositoryResponse
     */
    public GetRepositoryResponse getRepository(GetRepositoryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName());
        return invokeHttpClient(internalRequest, GetRepositoryResponse.class);
    }

    /**
     * getTagBuildHistory
     * 
     * @param request 入参结构体
     * @return GetTagBuildHistoryResponse
     */
    public GetTagBuildHistoryResponse getTagBuildHistory(GetTagBuildHistoryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName(),
                        CONSTANT_TAGS,
                        request.getTagName(),
                        CONSTANT_BUILDHISTORY);
        return invokeHttpClient(internalRequest, GetTagBuildHistoryResponse.class);
    }

    /**
     * getTagDetail
     * 
     * @param request 入参结构体
     * @return GetTagDetailResponse
     */
    public GetTagDetailResponse getTagDetail(GetTagDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName(),
                        CONSTANT_TAGS,
                        request.getTagName());
        return invokeHttpClient(internalRequest, GetTagDetailResponse.class);
    }

    /**
     * getTagsScanOverview
     * 
     * @param request 入参结构体
     * @return GetTagsScanOverviewResponse
     */
    public GetTagsScanOverviewResponse getTagsScanOverview(GetTagsScanOverviewRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName(),
                        CONSTANT_TAGS,
                        request.getTagName(),
                        CONSTANT_SCANOVERVIEW);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetTagsScanOverviewResponse.class);
    }

    /**
     * getTriggerDetail
     * 
     * @param request 入参结构体
     * @return GetTriggerDetailResponse
     */
    public GetTriggerDetailResponse getTriggerDetail(GetTriggerDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_TRIGGERS,
                        CONSTANT_POLICIES,
                        request.getPolicyId());
        return invokeHttpClient(internalRequest, GetTriggerDetailResponse.class);
    }

    /**
     * getUserDetail
     * 
     * @param request 入参结构体
     * @return GetUserDetailResponse
     */
    public GetUserDetailResponse getUserDetail(GetUserDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_USERS, CONSTANT_PROFILE);
        if (request.getUserId() != null) {
            internalRequest.addParameter("userId", request.getUserId());
        }
        return invokeHttpClient(internalRequest, GetUserDetailResponse.class);
    }

    /**
     * listAcceleratorFilters
     * 
     * @param request 入参结构体
     * @return ListAcceleratorFiltersResponse
     */
    public ListAcceleratorFiltersResponse listAcceleratorFilters(ListAcceleratorFiltersRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ACCELERATORS, CONSTANT_POLICIES);
        if (request.getPolicyName() != null) {
            internalRequest.addParameter("policyName", request.getPolicyName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListAcceleratorFiltersResponse.class);
    }

    /**
     * listChartVersions
     * 
     * @param request 入参结构体
     * @return ListChartVersionsResponse
     */
    public ListChartVersionsResponse listChartVersions(ListChartVersionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_CHARTS,
                        request.getChartName(),
                        CONSTANT_VERSIONS);
        if (request.getChartVersion() != null) {
            internalRequest.addParameter("chartVersion", request.getChartVersion());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListChartVersionsResponse.class);
    }

    /**
     * listCharts
     * 
     * @param request 入参结构体
     * @return ListChartsResponse
     */
    public ListChartsResponse listCharts(ListChartsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_CHARTS);
        if (request.getChartName() != null) {
            internalRequest.addParameter("chartName", request.getChartName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListChartsResponse.class);
    }

    /**
     * listImageMigrationRecords
     * 
     * @param request 入参结构体
     * @return ListImageMigrationRecordsResponse
     */
    public ListImageMigrationRecordsResponse listImageMigrationRecords(ListImageMigrationRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS);
        if (request.getPolicyId() != null) {
            internalRequest.addParameter("policyId", request.getPolicyId());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListImageMigrationRecordsResponse.class);
    }

    /**
     * listImageMigrationRules
     * 
     * @param request 入参结构体
     * @return ListImageMigrationRulesResponse
     */
    public ListImageMigrationRulesResponse listImageMigrationRules(ListImageMigrationRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_REPLICATIONS);
        if (request.getPolicyName() != null) {
            internalRequest.addParameter("policyName", request.getPolicyName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListImageMigrationRulesResponse.class);
    }

    /**
     * listImageMigrationTaskRecords
     * 
     * @param request 入参结构体
     * @return ListImageMigrationTaskRecordsResponse
     */
    public ListImageMigrationTaskRecordsResponse listImageMigrationTaskRecords(ListImageMigrationTaskRecordsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_EXECUTIONS,
                        request.getExecutionId(),
                        CONSTANT_TASKS);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListImageMigrationTaskRecordsResponse.class);
    }

    /**
     * listInstanceSyncRecords
     * 
     * @param request 入参结构体
     * @return ListInstanceSyncRecordsResponse
     */
    public ListInstanceSyncRecordsResponse listInstanceSyncRecords(ListInstanceSyncRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS);
        if (request.getPolicyId() != null) {
            internalRequest.addParameter("policyId", request.getPolicyId());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListInstanceSyncRecordsResponse.class);
    }

    /**
     * listInstanceSyncTaskRecords
     * 
     * @param request 入参结构体
     * @return ListInstanceSyncTaskRecordsResponse
     */
    public ListInstanceSyncTaskRecordsResponse listInstanceSyncTaskRecords(ListInstanceSyncTaskRecordsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_EXECUTIONS,
                        request.getExecutionId(),
                        CONSTANT_TASKS);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListInstanceSyncTaskRecordsResponse.class);
    }

    /**
     * listInstanceSyncs
     * 
     * @param request 入参结构体
     * @return ListInstanceSyncsResponse
     */
    public ListInstanceSyncsResponse listInstanceSyncs(ListInstanceSyncsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_SYNCS);
        if (request.getPolicyName() != null) {
            internalRequest.addParameter("policyName", request.getPolicyName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListInstanceSyncsResponse.class);
    }

    /**
     * listInstances
     * 
     * @param request 入参结构体
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getAcrossregion() != null) {
            internalRequest.addParameter("acrossregion", request.getAcrossregion());
        }
        return invokeHttpClient(internalRequest, ListInstancesResponse.class);
    }

    /**
     * listProjects
     * 
     * @param request 入参结构体
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PROJECTS);
        if (request.getProjectName() != null) {
            internalRequest.addParameter("projectName", request.getProjectName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListProjectsResponse.class);
    }

    /**
     * listRepositories
     * 
     * @param request 入参结构体
     * @return ListRepositoriesResponse
     */
    public ListRepositoriesResponse listRepositories(ListRepositoriesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES);
        if (request.getRepositoryName() != null) {
            internalRequest.addParameter("repositoryName", request.getRepositoryName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListRepositoriesResponse.class);
    }

    /**
     * listRobotAccounts
     * 
     * @param request 入参结构体
     * @return ListRobotAccountsResponse
     */
    public ListRobotAccountsResponse listRobotAccounts(ListRobotAccountsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ROBOTS);
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListRobotAccountsResponse.class);
    }

    /**
     * listTags
     * 
     * @param request 入参结构体
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName(),
                        CONSTANT_TAGS);
        if (request.getTagName() != null) {
            internalRequest.addParameter("tagName", request.getTagName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListTagsResponse.class);
    }

    /**
     * listTriggerTasks
     * 
     * @param request 入参结构体
     * @return ListTriggerTasksResponse
     */
    public ListTriggerTasksResponse listTriggerTasks(ListTriggerTasksRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_TRIGGERS,
                        CONSTANT_POLICIES,
                        request.getPolicyId(),
                        CONSTANT_JOBS);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListTriggerTasksResponse.class);
    }

    /**
     * listTriggers
     * 
     * @param request 入参结构体
     * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggers(ListTriggersRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_TRIGGERS, CONSTANT_POLICIES);
        if (request.getPolicyName() != null) {
            internalRequest.addParameter("policyName", request.getPolicyName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListTriggersResponse.class);
    }

    /**
     * listVpcLinks
     * 
     * @param request 入参结构体
     * @return ListVpcLinksResponse
     */
    public ListVpcLinksResponse listVpcLinks(ListVpcLinksRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PRIVATELINKS);
        return invokeHttpClient(internalRequest, ListVpcLinksResponse.class);
    }

    /**
     * reExecuteTriggerTask
     * 
     * @param request 入参结构体
     */
    public void reExecuteTriggerTask(ReExecuteTriggerTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_TRIGGERS,
                        CONSTANT_POLICIES,
                        request.getPolicyId(),
                        CONSTANT_JOBS,
                        request.getJobId(),
                        CONSTANT_RETRY);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * refreshRobotAccountKey
     * 
     * @param request 入参结构体
     * @return RefreshRobotAccountKeyResponse
     */
    public RefreshRobotAccountKeyResponse refreshRobotAccountKey(RefreshRobotAccountKeyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ROBOTS, request.getRobotID(), CONSTANT_SECRET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RefreshRobotAccountKeyResponse.class);
    }

    /**
     * resetPassword
     * 
     * @param request 入参结构体
     */
    public void resetPassword(ResetPasswordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_CREDENTIAL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * stopImageMigration
     * 
     * @param request 入参结构体
     */
    public void stopImageMigration(StopImageMigrationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS, request.getExecutionId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * stopInstanceSync
     * 
     * @param request 入参结构体
     */
    public void stopInstanceSync(StopInstanceSyncRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_EXECUTIONS, request.getExecutionId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * testAcceleratorFilter
     * 
     * @param request 入参结构体
     * @return TestAcceleratorFilterResponse
     */
    public TestAcceleratorFilterResponse testAcceleratorFilter(TestAcceleratorFilterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_ACCELERATORS, CONSTANT_POLICIES, CONSTANT_FILTERS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TestAcceleratorFilterResponse.class);
    }

    /**
     * testTriggerTargetAddress
     * 
     * @param request 入参结构体
     */
    public void testTriggerTargetAddress(TestTriggerTargetAddressRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_TRIGGERS, CONSTANT_POLICIES, CONSTANT_TARGETS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * toggleAcceleratorFilter
     * 
     * @param request 入参结构体
     */
    public void toggleAcceleratorFilter(ToggleAcceleratorFilterRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_ACCELERATORS,
                        CONSTANT_POLICIES,
                        request.getPolicyId(),
                        CONSTANT_ENABLE);
        if (request.getEnabled() != null) {
            internalRequest.addParameter("enabled", request.getEnabled());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * toggleTrigger
     * 
     * @param request 入参结构体
     */
    public void toggleTrigger(ToggleTriggerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_TRIGGERS,
                        CONSTANT_POLICIES,
                        request.getPolicyId(),
                        CONSTANT_ENABLE);
        if (request.getEnabled() != null) {
            internalRequest.addParameter("enabled", request.getEnabled());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * triggerTagScan
     * 
     * @param request 入参结构体
     */
    public void triggerTagScan(TriggerTagScanRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName(),
                        CONSTANT_TAGS,
                        request.getTagName(),
                        CONSTANT_SCAN);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAcceleratorFilter
     * 
     * @param request 入参结构体
     */
    public void updateAcceleratorFilter(UpdateAcceleratorFilterRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_ACCELERATORS,
                        CONSTANT_POLICIES,
                        request.getPolicyId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateImageMigrationRule
     * 
     * @param request 入参结构体
     */
    public void updateImageMigrationRule(UpdateImageMigrationRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_REPLICATIONS, request.getPolicyId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceName
     * 
     * @param request 入参结构体
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateInstanceNameResponse.class);
    }

    /**
     * updateInstanceSync
     * 
     * @param request 入参结构体
     */
    public void updateInstanceSync(UpdateInstanceSyncRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_SYNCS, request.getPolicyId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceTags
     * 
     * @param request 入参结构体
     */
    public void updateInstanceTags(UpdateInstanceTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_TAGS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateProject
     * 
     * @param request 入参结构体
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PROJECTS, request.getProjectName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateProjectResponse.class);
    }

    /**
     * updatePublicNetwork
     * 
     * @param request 入参结构体
     */
    public void updatePublicNetwork(UpdatePublicNetworkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_PUBLICLINKS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRepository
     * 
     * @param request 入参结构体
     * @return UpdateRepositoryResponse
     */
    public UpdateRepositoryResponse updateRepository(UpdateRepositoryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_PROJECTS,
                        request.getProjectName(),
                        CONSTANT_REPOSITORIES,
                        request.getRepositoryName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateRepositoryResponse.class);
    }

    /**
     * updateRobotAccount
     * 
     * @param request 入参结构体
     */
    public void updateRobotAccount(UpdateRobotAccountRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCES, request.getInstanceId(), CONSTANT_ROBOTS, request.getRobotID());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateTrigger
     * 
     * @param request 入参结构体
     */
    public void updateTrigger(UpdateTriggerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V1,
                        CONSTANT_INSTANCES,
                        request.getInstanceId(),
                        CONSTANT_TRIGGERS,
                        CONSTANT_POLICIES,
                        request.getPolicyId());
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
