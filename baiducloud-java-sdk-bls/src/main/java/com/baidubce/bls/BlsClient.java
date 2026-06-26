package com.baidubce.bls;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.http.handler.BceStreamResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.auth.SignOptions;
import com.baidubce.util.RequestBodyUtils;
import java.util.Arrays;
import java.util.HashSet;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.bls.models.AsyncSearchRequest;
import com.baidubce.bls.models.AsyncSearchResponse;
import com.baidubce.bls.models.BatchGetLogStoreRequest;
import com.baidubce.bls.models.BatchGetLogStoreResponse;
import com.baidubce.bls.models.BulkDeleteLogShipperRequest;
import com.baidubce.bls.models.BulkDeleteLogShipperResponse;
import com.baidubce.bls.models.BulkSetLogShipperStatusRequest;
import com.baidubce.bls.models.BulkSetLogShipperStatusResponse;
import com.baidubce.bls.models.CreateAlarmPolicyRequest;
import com.baidubce.bls.models.CreateAlarmPolicyResponse;
import com.baidubce.bls.models.CreateDownloadTaskRequest;
import com.baidubce.bls.models.CreateDownloadTaskResponse;
import com.baidubce.bls.models.CreateFastQueryRequest;
import com.baidubce.bls.models.CreateFastQueryResponse;
import com.baidubce.bls.models.CreateIndexRequest;
import com.baidubce.bls.models.CreateIndexResponse;
import com.baidubce.bls.models.CreateLogShipperRequest;
import com.baidubce.bls.models.CreateLogShipperResponse;
import com.baidubce.bls.models.CreateLogStoreRequest;
import com.baidubce.bls.models.CreateLogStoreResponse;
import com.baidubce.bls.models.CreateLogStoreTemplateRequest;
import com.baidubce.bls.models.CreateLogStoreTemplateResponse;
import com.baidubce.bls.models.CreateLogStoreViewRequest;
import com.baidubce.bls.models.CreateProjectRequest;
import com.baidubce.bls.models.CreateProjectResponse;
import com.baidubce.bls.models.CreateTaskRequest;
import com.baidubce.bls.models.CreateTaskResponse;
import com.baidubce.bls.models.DeleteAlarmPolicyRequest;
import com.baidubce.bls.models.DeleteAlarmPolicyResponse;
import com.baidubce.bls.models.DeleteDownloadTaskRequest;
import com.baidubce.bls.models.DeleteDownloadTaskResponse;
import com.baidubce.bls.models.DeleteFastQueryRequest;
import com.baidubce.bls.models.DeleteFastQueryResponse;
import com.baidubce.bls.models.DeleteIndexRequest;
import com.baidubce.bls.models.DeleteIndexResponse;
import com.baidubce.bls.models.DeleteLogStoreRequest;
import com.baidubce.bls.models.DeleteLogStoreResponse;
import com.baidubce.bls.models.DeleteLogStoreTemplatesRequest;
import com.baidubce.bls.models.DeleteLogStoreTemplatesResponse;
import com.baidubce.bls.models.DeleteLogStoreViewRequest;
import com.baidubce.bls.models.DeleteLogStoreViewResponse;
import com.baidubce.bls.models.DeleteProjectRequest;
import com.baidubce.bls.models.DeleteProjectResponse;
import com.baidubce.bls.models.DeleteSingleLogShipperRequest;
import com.baidubce.bls.models.DeleteSingleLogShipperResponse;
import com.baidubce.bls.models.DescribeAlarmPolicyRequest;
import com.baidubce.bls.models.DescribeAlarmPolicyResponse;
import com.baidubce.bls.models.DescribeAlarmRecordRequest;
import com.baidubce.bls.models.DescribeAlarmRecordResponse;
import com.baidubce.bls.models.DescribeDownloadTaskRequest;
import com.baidubce.bls.models.DescribeDownloadTaskResponse;
import com.baidubce.bls.models.DescribeFastQueryRequest;
import com.baidubce.bls.models.DescribeFastQueryResponse;
import com.baidubce.bls.models.DescribeIndexRequest;
import com.baidubce.bls.models.DescribeIndexResponse;
import com.baidubce.bls.models.DescribeLogStoreRequest;
import com.baidubce.bls.models.DescribeLogStoreResponse;
import com.baidubce.bls.models.DescribeLogStoreTemplateRequest;
import com.baidubce.bls.models.DescribeLogStoreTemplateResponse;
import com.baidubce.bls.models.DescribeLogStoreTemplatesRequest;
import com.baidubce.bls.models.DescribeLogStoreTemplatesResponse;
import com.baidubce.bls.models.DescribeLogStoreViewRequest;
import com.baidubce.bls.models.DescribeLogStoreViewResponse;
import com.baidubce.bls.models.DescribeProjectRequest;
import com.baidubce.bls.models.DescribeProjectResponse;
import com.baidubce.bls.models.DisableAlarmPolicyRequest;
import com.baidubce.bls.models.DisableAlarmPolicyResponse;
import com.baidubce.bls.models.EnableAlarmPolicyRequest;
import com.baidubce.bls.models.EnableAlarmPolicyResponse;
import com.baidubce.bls.models.FieldCapsRequest;
import com.baidubce.bls.models.FieldCapsResponse;
import com.baidubce.bls.models.GetDownloadTaskLinkRequest;
import com.baidubce.bls.models.GetDownloadTaskLinkResponse;
import com.baidubce.bls.models.GetLogShipperRequest;
import com.baidubce.bls.models.GetLogShipperResponse;
import com.baidubce.bls.models.ListAlarmExecutionStatsRequest;
import com.baidubce.bls.models.ListAlarmExecutionStatsResponse;
import com.baidubce.bls.models.ListAlarmExecutionsRequest;
import com.baidubce.bls.models.ListAlarmExecutionsResponse;
import com.baidubce.bls.models.ListAlarmPolicyRequest;
import com.baidubce.bls.models.ListAlarmPolicyResponse;
import com.baidubce.bls.models.ListAlarmRecordRequest;
import com.baidubce.bls.models.ListAlarmRecordResponse;
import com.baidubce.bls.models.ListDownloadTaskRequest;
import com.baidubce.bls.models.ListDownloadTaskResponse;
import com.baidubce.bls.models.ListFastQueryRequest;
import com.baidubce.bls.models.ListFastQueryResponse;
import com.baidubce.bls.models.ListLogShipperRecordRequest;
import com.baidubce.bls.models.ListLogShipperRecordResponse;
import com.baidubce.bls.models.ListLogShipperRequest;
import com.baidubce.bls.models.ListLogShipperResponse;
import com.baidubce.bls.models.ListLogStoreRequest;
import com.baidubce.bls.models.ListLogStoreResponse;
import com.baidubce.bls.models.ListLogStoreViewRequest;
import com.baidubce.bls.models.ListLogStoreViewResponse;
import com.baidubce.bls.models.ListLogStreamRequest;
import com.baidubce.bls.models.ListLogStreamResponse;
import com.baidubce.bls.models.ListProjectRequest;
import com.baidubce.bls.models.ListProjectResponse;
import com.baidubce.bls.models.PullLogRecordRequest;
import com.baidubce.bls.models.PullLogRecordResponse;
import com.baidubce.bls.models.PushLogRecordRequest;
import com.baidubce.bls.models.PushLogRecordResponse;
import com.baidubce.bls.models.QueryLogHistogramRequest;
import com.baidubce.bls.models.QueryLogHistogramResponse;
import com.baidubce.bls.models.QueryLogRecordRequest;
import com.baidubce.bls.models.QueryLogRecordResponse;
import com.baidubce.bls.models.ResolveIndexRequest;
import com.baidubce.bls.models.ResolveIndexResponse;
import com.baidubce.bls.models.SetSingleLogShipperStatusRequest;
import com.baidubce.bls.models.SetSingleLogShipperStatusResponse;
import com.baidubce.bls.models.TermsEnumRequest;
import com.baidubce.bls.models.TermsEnumResponse;
import com.baidubce.bls.models.UpdateAlarmPolicyRequest;
import com.baidubce.bls.models.UpdateAlarmPolicyResponse;
import com.baidubce.bls.models.UpdateFastQueryRequest;
import com.baidubce.bls.models.UpdateFastQueryResponse;
import com.baidubce.bls.models.UpdateIndexRequest;
import com.baidubce.bls.models.UpdateIndexResponse;
import com.baidubce.bls.models.UpdateLogShipperRequest;
import com.baidubce.bls.models.UpdateLogShipperResponse;
import com.baidubce.bls.models.UpdateLogStoreRequest;
import com.baidubce.bls.models.UpdateLogStoreResponse;
import com.baidubce.bls.models.UpdateLogStoreTemplateRequest;
import com.baidubce.bls.models.UpdateLogStoreTemplateResponse;
import com.baidubce.bls.models.UpdateLogStoreViewRequest;
import com.baidubce.bls.models.UpdateProjectRequest;
import com.baidubce.bls.models.UpdateProjectResponse;
import com.baidubce.bls.models.UpdateTaskRequest;
import com.baidubce.bls.models.ValidateAlarmConditionRequest;
import com.baidubce.bls.models.ValidateAlarmConditionResponse;
import com.baidubce.bls.models.ValidateAlarmPolicySQLRequest;
import com.baidubce.bls.models.ValidateAlarmPolicySQLResponse;

public class BlsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String VERSION_V2 = "v2";
    private static final String VERSION_V3 = "v3";
    private static final String CONSTANT_ALARM = "alarm";
    private static final String CONSTANT_RECORD = "record";
    private static final String CONSTANT_LOGSTORE = "logstore";
    private static final String CONSTANT_DOWNLOAD = "download";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_BLS = "bls";
    private static final String CONSTANT_LOGSHIPPER = "logshipper";
    private static final String CONSTANT_PROJECT = "project";
    private static final String CONSTANT_INDEX = "index";
    private static final String CONSTANT_EXECUTION = "execution";
    private static final String CONSTANT_LOGSTREAM = "logstream";
    private static final String CONSTANT_STATUS = "status";
    private static final String CONSTANT_BATCH = "batch";
    private static final String CONSTANT_POLICY = "policy";
    private static final String CONSTANT_FIELD_CAPS = "_field_caps";
    private static final String CONSTANT_FASTQUERY = "fastquery";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_LOGHISTOGRAM = "loghistogram";
    private static final String CONSTANT_LOGRECORD = "logrecord";
    private static final String CONSTANT_STATS = "stats";
    private static final String CONSTANT_ENABLE = "enable";
    private static final String CONSTANT_LINK = "link";
    private static final String CONSTANT_CONDITION = "condition";
    private static final String CONSTANT_VALIDATE = "validate";
    private static final String CONSTANT_ASYNC_SEARCH = "_async_search";
    private static final String CONSTANT_DISABLE = "disable";
    private static final String CONSTANT_RESOLVE = "_resolve";
    private static final String CONSTANT_TERMS_ENUM = "_terms_enum";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public BlsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public BlsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * asyncSearch
     * 
     * @param request 入参结构体
     * @return AsyncSearchResponse
     */
    public AsyncSearchResponse asyncSearch(AsyncSearchRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, request.getName(), CONSTANT_ASYNC_SEARCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AsyncSearchResponse.class);
    }

    /**
     * batchGetLogStore
     * 
     * @param request 入参结构体
     * @return BatchGetLogStoreResponse
     */
    public BatchGetLogStoreResponse batchGetLogStore(BatchGetLogStoreRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSTORE, CONSTANT_BATCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchGetLogStoreResponse.class);
    }

    /**
     * bulkDeleteLogShipper
     * 
     * @param request 入参结构体
     * @return BulkDeleteLogShipperResponse
     */
    public BulkDeleteLogShipperResponse bulkDeleteLogShipper(BulkDeleteLogShipperRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_LOGSHIPPER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BulkDeleteLogShipperResponse.class);
    }

    /**
     * bulkSetLogShipperStatus
     * 
     * @param request 入参结构体
     * @return BulkSetLogShipperStatusResponse
     */
    public BulkSetLogShipperStatusResponse bulkSetLogShipperStatus(BulkSetLogShipperStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LOGSHIPPER, CONSTANT_STATUS, CONSTANT_BATCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BulkSetLogShipperStatusResponse.class);
    }

    /**
     * createAlarmPolicy
     * 
     * @param request 入参结构体
     * @return CreateAlarmPolicyResponse
     */
    public CreateAlarmPolicyResponse createAlarmPolicy(CreateAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_POLICY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAlarmPolicyResponse.class);
    }

    /**
     * createDownloadTask
     * 
     * @param request 入参结构体
     * @return CreateDownloadTaskResponse
     */
    public CreateDownloadTaskResponse createDownloadTask(CreateDownloadTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_LOGSTORE, CONSTANT_DOWNLOAD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDownloadTaskResponse.class);
    }

    /**
     * createFastQuery
     * 
     * @param request 入参结构体
     * @return CreateFastQueryResponse
     */
    public CreateFastQueryResponse createFastQuery(CreateFastQueryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_FASTQUERY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateFastQueryResponse.class);
    }

    /**
     * createIndex
     * 
     * @param request 入参结构体
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndex(CreateIndexRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_INDEX);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateIndexResponse.class);
    }

    /**
     * createLogShipper
     * 
     * @param request 入参结构体
     * @return CreateLogShipperResponse
     */
    public CreateLogShipperResponse createLogShipper(CreateLogShipperRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSHIPPER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateLogShipperResponse.class);
    }

    /**
     * createLogStore
     * 
     * @param request 入参结构体
     * @return CreateLogStoreResponse
     */
    public CreateLogStoreResponse createLogStore(CreateLogStoreRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSTORE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateLogStoreResponse.class);
    }

    /**
     * createLogStoreTemplate
     * 
     * @param request 入参结构体
     * @return CreateLogStoreTemplateResponse
     */
    public CreateLogStoreTemplateResponse createLogStoreTemplate(CreateLogStoreTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "CreateLogStoreTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateLogStoreTemplateResponse.class);
    }

    /**
     * createLogStoreView
     * 
     * @param request 入参结构体
     */
    public void createLogStoreView(CreateLogStoreViewRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "CreateLogStoreView");
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PROJECT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateProjectResponse.class);
    }

    /**
     * createTask
     * 
     * @param request 入参结构体
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateTaskResponse.class);
    }

    /**
     * deleteAlarmPolicy
     * 
     * @param request 入参结构体
     * @return DeleteAlarmPolicyResponse
     */
    public DeleteAlarmPolicyResponse deleteAlarmPolicy(DeleteAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ALARM, CONSTANT_POLICY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteAlarmPolicyResponse.class);
    }

    /**
     * deleteDownloadTask
     * 
     * @param request 入参结构体
     * @return DeleteDownloadTaskResponse
     */
    public DeleteDownloadTaskResponse deleteDownloadTask(DeleteDownloadTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_LOGSTORE, CONSTANT_DOWNLOAD, request.getUuid());
        return invokeHttpClient(internalRequest, DeleteDownloadTaskResponse.class);
    }

    /**
     * deleteFastQuery
     * 
     * @param request 入参结构体
     * @return DeleteFastQueryResponse
     */
    public DeleteFastQueryResponse deleteFastQuery(DeleteFastQueryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_FASTQUERY, request.getFastQueryName());
        return invokeHttpClient(internalRequest, DeleteFastQueryResponse.class);
    }

    /**
     * deleteIndex
     * 
     * @param request 入参结构体
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndex(DeleteIndexRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_INDEX);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        return invokeHttpClient(internalRequest, DeleteIndexResponse.class);
    }

    /**
     * deleteLogStore
     * 
     * @param request 入参结构体
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStore(DeleteLogStoreRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName());
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        return invokeHttpClient(internalRequest, DeleteLogStoreResponse.class);
    }

    /**
     * deleteLogStoreTemplates
     * 
     * @param request 入参结构体
     * @return DeleteLogStoreTemplatesResponse
     */
    public DeleteLogStoreTemplatesResponse deleteLogStoreTemplates(DeleteLogStoreTemplatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "DeleteLogStoreTemplates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteLogStoreTemplatesResponse.class);
    }

    /**
     * deleteLogStoreView
     * 
     * @param request 入参结构体
     * @return DeleteLogStoreViewResponse
     */
    public DeleteLogStoreViewResponse deleteLogStoreView(DeleteLogStoreViewRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "DeleteLogStoreView");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteLogStoreViewResponse.class);
    }

    /**
     * deleteProject
     * 
     * @param request 入参结构体
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_PROJECT, request.getUuid());
        return invokeHttpClient(internalRequest, DeleteProjectResponse.class);
    }

    /**
     * deleteSingleLogShipper
     * 
     * @param request 入参结构体
     * @return DeleteSingleLogShipperResponse
     */
    public DeleteSingleLogShipperResponse deleteSingleLogShipper(DeleteSingleLogShipperRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_LOGSHIPPER, request.getLogShipperID());
        return invokeHttpClient(internalRequest, DeleteSingleLogShipperResponse.class);
    }

    /**
     * describeAlarmPolicy
     * 
     * @param request 入参结构体
     * @return DescribeAlarmPolicyResponse
     */
    public DescribeAlarmPolicyResponse describeAlarmPolicy(DescribeAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ALARM, CONSTANT_POLICY);
        if (request.getPolicyName() != null) {
            internalRequest.addParameter("PolicyName", request.getPolicyName());
        }
        return invokeHttpClient(internalRequest, DescribeAlarmPolicyResponse.class);
    }

    /**
     * describeAlarmRecord
     * 
     * @param request 入参结构体
     * @return DescribeAlarmRecordResponse
     */
    public DescribeAlarmRecordResponse describeAlarmRecord(DescribeAlarmRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ALARM, CONSTANT_RECORD);
        if (request.getAlarmId() != null) {
            internalRequest.addParameter("alarmId", request.getAlarmId());
        }
        return invokeHttpClient(internalRequest, DescribeAlarmRecordResponse.class);
    }

    /**
     * describeDownloadTask
     * 
     * @param request 入参结构体
     * @return DescribeDownloadTaskResponse
     */
    public DescribeDownloadTaskResponse describeDownloadTask(DescribeDownloadTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_LOGSTORE, CONSTANT_DOWNLOAD, request.getUuid());
        return invokeHttpClient(internalRequest, DescribeDownloadTaskResponse.class);
    }

    /**
     * describeFastQuery
     * 
     * @param request 入参结构体
     * @return DescribeFastQueryResponse
     */
    public DescribeFastQueryResponse describeFastQuery(DescribeFastQueryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_FASTQUERY, request.getFastQueryName());
        return invokeHttpClient(internalRequest, DescribeFastQueryResponse.class);
    }

    /**
     * describeIndex
     * 
     * @param request 入参结构体
     * @return DescribeIndexResponse
     */
    public DescribeIndexResponse describeIndex(DescribeIndexRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_INDEX);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        return invokeHttpClient(internalRequest, DescribeIndexResponse.class);
    }

    /**
     * describeLogStore
     * 
     * @param request 入参结构体
     * @return DescribeLogStoreResponse
     */
    public DescribeLogStoreResponse describeLogStore(DescribeLogStoreRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName());
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        return invokeHttpClient(internalRequest, DescribeLogStoreResponse.class);
    }

    /**
     * describeLogStoreTemplate
     * 
     * @param request 入参结构体
     * @return DescribeLogStoreTemplateResponse
     */
    public DescribeLogStoreTemplateResponse describeLogStoreTemplate(DescribeLogStoreTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "DescribeLogStoreTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLogStoreTemplateResponse.class);
    }

    /**
     * describeLogStoreTemplates
     * 
     * @param request 入参结构体
     * @return DescribeLogStoreTemplatesResponse
     */
    public DescribeLogStoreTemplatesResponse describeLogStoreTemplates(DescribeLogStoreTemplatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "DescribeLogStoreTemplates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLogStoreTemplatesResponse.class);
    }

    /**
     * describeLogStoreView
     * 
     * @param request 入参结构体
     * @return DescribeLogStoreViewResponse
     */
    public DescribeLogStoreViewResponse describeLogStoreView(DescribeLogStoreViewRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "DescribeLogStoreView");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLogStoreViewResponse.class);
    }

    /**
     * describeProject
     * 
     * @param request 入参结构体
     * @return DescribeProjectResponse
     */
    public DescribeProjectResponse describeProject(DescribeProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PROJECT, request.getUuid());
        return invokeHttpClient(internalRequest, DescribeProjectResponse.class);
    }

    /**
     * disableAlarmPolicy
     * 
     * @param request 入参结构体
     * @return DisableAlarmPolicyResponse
     */
    public DisableAlarmPolicyResponse disableAlarmPolicy(DisableAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_POLICY, CONSTANT_DISABLE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DisableAlarmPolicyResponse.class);
    }

    /**
     * enableAlarmPolicy
     * 
     * @param request 入参结构体
     * @return EnableAlarmPolicyResponse
     */
    public EnableAlarmPolicyResponse enableAlarmPolicy(EnableAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_POLICY, CONSTANT_ENABLE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, EnableAlarmPolicyResponse.class);
    }

    /**
     * fieldCaps
     * 
     * @param request 入参结构体
     * @return FieldCapsResponse
     */
    public FieldCapsResponse fieldCaps(FieldCapsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, request.getName(), CONSTANT_FIELD_CAPS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FieldCapsResponse.class);
    }

    /**
     * getDownloadTaskLink
     * 
     * @param request 入参结构体
     * @return GetDownloadTaskLinkResponse
     */
    public GetDownloadTaskLinkResponse getDownloadTaskLink(GetDownloadTaskLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_LOGSTORE, CONSTANT_DOWNLOAD, CONSTANT_LINK, request.getUuid());
        return invokeHttpClient(internalRequest, GetDownloadTaskLinkResponse.class);
    }

    /**
     * getLogShipper
     * 
     * @param request 入参结构体
     * @return GetLogShipperResponse
     */
    public GetLogShipperResponse getLogShipper(GetLogShipperRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSHIPPER, request.getLogShipperID());
        return invokeHttpClient(internalRequest, GetLogShipperResponse.class);
    }

    /**
     * listAlarmExecutionStats
     * 
     * @param request 入参结构体
     * @return ListAlarmExecutionStatsResponse
     */
    public ListAlarmExecutionStatsResponse listAlarmExecutionStats(ListAlarmExecutionStatsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_EXECUTION, CONSTANT_STATS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListAlarmExecutionStatsResponse.class);
    }

    /**
     * listAlarmExecutions
     * 
     * @param request 入参结构体
     * @return ListAlarmExecutionsResponse
     */
    public ListAlarmExecutionsResponse listAlarmExecutions(ListAlarmExecutionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_EXECUTION, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListAlarmExecutionsResponse.class);
    }

    /**
     * listAlarmPolicy
     * 
     * @param request 入参结构体
     * @return ListAlarmPolicyResponse
     */
    public ListAlarmPolicyResponse listAlarmPolicy(ListAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_POLICY, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListAlarmPolicyResponse.class);
    }

    /**
     * listAlarmRecord
     * 
     * @param request 入参结构体
     * @return ListAlarmRecordResponse
     */
    public ListAlarmRecordResponse listAlarmRecord(ListAlarmRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_RECORD, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListAlarmRecordResponse.class);
    }

    /**
     * listDownloadTask
     * 
     * @param request 入参结构体
     * @return ListDownloadTaskResponse
     */
    public ListDownloadTaskResponse listDownloadTask(ListDownloadTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_LOGSTORE, CONSTANT_DOWNLOAD, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListDownloadTaskResponse.class);
    }

    /**
     * listFastQuery
     * 
     * @param request 入参结构体
     * @return ListFastQueryResponse
     */
    public ListFastQueryResponse listFastQuery(ListFastQueryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_FASTQUERY);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLogStoreName() != null) {
            internalRequest.addParameter("logStoreName", request.getLogStoreName());
        }
        if (request.getNamePattern() != null) {
            internalRequest.addParameter("namePattern", request.getNamePattern());
        }
        if (request.getLogStoreType() != null) {
            internalRequest.addParameter("logStoreType", request.getLogStoreType());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListFastQueryResponse.class);
    }

    /**
     * listLogShipper
     * 
     * @param request 入参结构体
     * @return ListLogShipperResponse
     */
    public ListLogShipperResponse listLogShipper(ListLogShipperRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSHIPPER);
        internalRequest.addParameter("", null);
        if (request.getLogShipperID() != null) {
            internalRequest.addParameter("logShipperID", request.getLogShipperID());
        }
        if (request.getLogShipperName() != null) {
            internalRequest.addParameter("logShipperName", request.getLogShipperName());
        }
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLogStoreName() != null) {
            internalRequest.addParameter("logStoreName", request.getLogStoreName());
        }
        if (request.getDestType() != null) {
            internalRequest.addParameter("destType", request.getDestType());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListLogShipperResponse.class);
    }

    /**
     * listLogShipperRecord
     * 
     * @param request 入参结构体
     * @return ListLogShipperRecordResponse
     */
    public ListLogShipperRecordResponse listLogShipperRecord(ListLogShipperRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSHIPPER, request.getLogShipperID(), CONSTANT_RECORD);
        if (request.getSinceHours() != null) {
            internalRequest.addParameter("sinceHours", String.valueOf(request.getSinceHours()));
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListLogShipperRecordResponse.class);
    }

    /**
     * listLogStore
     * 
     * @param request 入参结构体
     * @return ListLogStoreResponse
     */
    public ListLogStoreResponse listLogStore(ListLogStoreRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSTORE, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListLogStoreResponse.class);
    }

    /**
     * listLogStoreView
     * 
     * @param request 入参结构体
     * @return ListLogStoreViewResponse
     */
    public ListLogStoreViewResponse listLogStoreView(ListLogStoreViewRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "DescribeLogStoreViews");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListLogStoreViewResponse.class);
    }

    /**
     * listLogStream
     * 
     * @param request 入参结构体
     * @return ListLogStreamResponse
     */
    public ListLogStreamResponse listLogStream(ListLogStreamRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGSTREAM);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getNamePattern() != null) {
            internalRequest.addParameter("namePattern", request.getNamePattern());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        HttpResponseHandler[] streamHandlers = new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceStreamResponseHandler(), new BceErrorResponseHandler()};
        return invokeHttpClient(internalRequest, ListLogStreamResponse.class, streamHandlers);
    }

    /**
     * listProject
     * 
     * @param request 入参结构体
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PROJECT, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListProjectResponse.class);
    }

    /**
     * pullLogRecord
     * 
     * @param request 入参结构体
     * @return PullLogRecordResponse
     */
    public PullLogRecordResponse pullLogRecord(PullLogRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGRECORD);
        if (request.getLogStreamName() != null) {
            internalRequest.addParameter("logStreamName", request.getLogStreamName());
        }
        if (request.getStartDateTime() != null) {
            internalRequest.addParameter("startDateTime", request.getStartDateTime());
        }
        if (request.getEndDateTime() != null) {
            internalRequest.addParameter("endDateTime", request.getEndDateTime());
        }
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLogStoreType() != null) {
            internalRequest.addParameter("logStoreType", request.getLogStoreType());
        }
        if (request.getLimit() != null) {
            internalRequest.addParameter("limit", String.valueOf(request.getLimit()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        return invokeHttpClient(internalRequest, PullLogRecordResponse.class);
    }

    /**
     * pushLogRecord
     * 
     * @param request 入参结构体
     * @return PushLogRecordResponse
     */
    public PushLogRecordResponse pushLogRecord(PushLogRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGRECORD);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PushLogRecordResponse.class);
    }

    /**
     * queryLogHistogram
     * 
     * @param request 入参结构体
     * @return QueryLogHistogramResponse
     */
    public QueryLogHistogramResponse queryLogHistogram(QueryLogHistogramRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGHISTOGRAM);
        if (request.getQuery() != null) {
            internalRequest.addParameter("query", request.getQuery());
        }
        if (request.getStartDateTime() != null) {
            internalRequest.addParameter("startDateTime", request.getStartDateTime());
        }
        if (request.getEndDateTime() != null) {
            internalRequest.addParameter("endDateTime", request.getEndDateTime());
        }
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLogStreamName() != null) {
            internalRequest.addParameter("logStreamName", request.getLogStreamName());
        }
        if (request.getLogStoreType() != null) {
            internalRequest.addParameter("logStoreType", request.getLogStoreType());
        }
        return invokeHttpClient(internalRequest, QueryLogHistogramResponse.class);
    }

    /**
     * queryLogRecord
     * 
     * @param request 入参结构体
     * @return QueryLogRecordResponse
     */
    public QueryLogRecordResponse queryLogRecord(QueryLogRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGRECORD);
        if (request.getQuery() != null) {
            internalRequest.addParameter("query", request.getQuery());
        }
        if (request.getStartDateTime() != null) {
            internalRequest.addParameter("startDateTime", request.getStartDateTime());
        }
        if (request.getEndDateTime() != null) {
            internalRequest.addParameter("endDateTime", request.getEndDateTime());
        }
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLogStreamName() != null) {
            internalRequest.addParameter("logStreamName", request.getLogStreamName());
        }
        if (request.getLogStoreType() != null) {
            internalRequest.addParameter("logStoreType", request.getLogStoreType());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getLimit() != null) {
            internalRequest.addParameter("limit", String.valueOf(request.getLimit()));
        }
        if (request.getSort() != null) {
            internalRequest.addParameter("sort", request.getSort());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, QueryLogRecordResponse.class);
    }

    /**
     * resolveIndex
     * 
     * @param request 入参结构体
     * @return ResolveIndexResponse
     */
    public ResolveIndexResponse resolveIndex(ResolveIndexRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_RESOLVE, CONSTANT_INDEX, request.getName());
        return invokeHttpClient(internalRequest, ResolveIndexResponse.class);
    }

    /**
     * setSingleLogShipperStatus
     * 
     * @param request 入参结构体
     * @return SetSingleLogShipperStatusResponse
     */
    public SetSingleLogShipperStatusResponse setSingleLogShipperStatus(SetSingleLogShipperStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LOGSHIPPER, request.getLogShipperID(), CONSTANT_STATUS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, SetSingleLogShipperStatusResponse.class);
    }

    /**
     * termsEnum
     * 
     * @param request 入参结构体
     * @return TermsEnumResponse
     */
    public TermsEnumResponse termsEnum(TermsEnumRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, request.getName(), CONSTANT_TERMS_ENUM);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TermsEnumResponse.class);
    }

    /**
     * updateAlarmPolicy
     * 
     * @param request 入参结构体
     * @return UpdateAlarmPolicyResponse
     */
    public UpdateAlarmPolicyResponse updateAlarmPolicy(UpdateAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ALARM, CONSTANT_POLICY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAlarmPolicyResponse.class);
    }

    /**
     * updateFastQuery
     * 
     * @param request 入参结构体
     * @return UpdateFastQueryResponse
     */
    public UpdateFastQueryResponse updateFastQuery(UpdateFastQueryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_FASTQUERY, request.getName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateFastQueryResponse.class);
    }

    /**
     * updateIndex
     * 
     * @param request 入参结构体
     * @return UpdateIndexResponse
     */
    public UpdateIndexResponse updateIndex(UpdateIndexRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_INDEX);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateIndexResponse.class);
    }

    /**
     * updateLogShipper
     * 
     * @param request 入参结构体
     * @return UpdateLogShipperResponse
     */
    public UpdateLogShipperResponse updateLogShipper(UpdateLogShipperRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LOGSHIPPER, request.getLogShipperID());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateLogShipperResponse.class);
    }

    /**
     * updateLogStore
     * 
     * @param request 入参结构体
     * @return UpdateLogStoreResponse
     */
    public UpdateLogStoreResponse updateLogStore(UpdateLogStoreRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName());
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateLogStoreResponse.class);
    }

    /**
     * updateLogStoreTemplate
     * 
     * @param request 入参结构体
     * @return UpdateLogStoreTemplateResponse
     */
    public UpdateLogStoreTemplateResponse updateLogStoreTemplate(UpdateLogStoreTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "UpdateLogStoreTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateLogStoreTemplateResponse.class);
    }

    /**
     * updateLogStoreView
     * 
     * @param request 入参结构体
     */
    public void updateLogStoreView(UpdateLogStoreViewRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V3, CONSTANT_BLS);
        internalRequest.addParameter("action", "UpdateLogStoreView");
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PROJECT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateProjectResponse.class);
    }

    /**
     * updateTask
     * 
     * @param request 入参结构体
     */
    public void updateTask(UpdateTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_TASK, request.getTaskId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * validateAlarmCondition
     * 
     * @param request 入参结构体
     * @return ValidateAlarmConditionResponse
     */
    public ValidateAlarmConditionResponse validateAlarmCondition(ValidateAlarmConditionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ALARM, CONSTANT_CONDITION, CONSTANT_VALIDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ValidateAlarmConditionResponse.class);
    }

    /**
     * validateAlarmPolicySQL
     * 
     * @param request 入参结构体
     * @return ValidateAlarmPolicySQLResponse
     */
    public ValidateAlarmPolicySQLResponse validateAlarmPolicySQL(ValidateAlarmPolicySQLRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSTORE, CONSTANT_VALIDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ValidateAlarmPolicySQLResponse.class);
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
