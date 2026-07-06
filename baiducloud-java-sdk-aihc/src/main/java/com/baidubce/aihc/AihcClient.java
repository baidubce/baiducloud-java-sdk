package com.baidubce.aihc;

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

import com.baidubce.aihc.models.BatchStopTrainingTasksV2Request;
import com.baidubce.aihc.models.BatchStopTrainingTasksV2Response;
import com.baidubce.aihc.models.CreateDatasetRequest;
import com.baidubce.aihc.models.CreateDatasetResponse;
import com.baidubce.aihc.models.CreateDatasetVersionRequest;
import com.baidubce.aihc.models.CreateDatasetVersionResponse;
import com.baidubce.aihc.models.CreateJobRequest;
import com.baidubce.aihc.models.CreateJobResponse;
import com.baidubce.aihc.models.CreateModelRequest;
import com.baidubce.aihc.models.CreateModelResponse;
import com.baidubce.aihc.models.CreateModelVersionRequest;
import com.baidubce.aihc.models.CreateModelVersionResponse;
import com.baidubce.aihc.models.DeleteDatasetRequest;
import com.baidubce.aihc.models.DeleteDatasetVersionRequest;
import com.baidubce.aihc.models.DeleteJobRequest;
import com.baidubce.aihc.models.DeleteJobResponse;
import com.baidubce.aihc.models.DeleteModelRequest;
import com.baidubce.aihc.models.DeleteModelVersionRequest;
import com.baidubce.aihc.models.DescribeDatasetRequest;
import com.baidubce.aihc.models.DescribeDatasetResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionRequest;
import com.baidubce.aihc.models.DescribeDatasetVersionResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionsRequest;
import com.baidubce.aihc.models.DescribeDatasetVersionsResponse;
import com.baidubce.aihc.models.DescribeDatasetsRequest;
import com.baidubce.aihc.models.DescribeDatasetsResponse;
import com.baidubce.aihc.models.DescribeJobEventsRequest;
import com.baidubce.aihc.models.DescribeJobEventsResponse;
import com.baidubce.aihc.models.DescribeJobLogsRequest;
import com.baidubce.aihc.models.DescribeJobLogsResponse;
import com.baidubce.aihc.models.DescribeJobMetricsRequest;
import com.baidubce.aihc.models.DescribeJobMetricsResponse;
import com.baidubce.aihc.models.DescribeJobNodesRequest;
import com.baidubce.aihc.models.DescribeJobNodesResponse;
import com.baidubce.aihc.models.DescribeJobRequest;
import com.baidubce.aihc.models.DescribeJobResponse;
import com.baidubce.aihc.models.DescribeJobWebterminalRequest;
import com.baidubce.aihc.models.DescribeJobWebterminalResponse;
import com.baidubce.aihc.models.DescribeJobsRequest;
import com.baidubce.aihc.models.DescribeJobsResponse;
import com.baidubce.aihc.models.DescribeModelRequest;
import com.baidubce.aihc.models.DescribeModelResponse;
import com.baidubce.aihc.models.DescribeModelVersionRequest;
import com.baidubce.aihc.models.DescribeModelVersionResponse;
import com.baidubce.aihc.models.DescribeModelVersionsRequest;
import com.baidubce.aihc.models.DescribeModelVersionsResponse;
import com.baidubce.aihc.models.DescribeModelsRequest;
import com.baidubce.aihc.models.DescribeModelsResponse;
import com.baidubce.aihc.models.DescribePodEventsRequest;
import com.baidubce.aihc.models.DescribePodEventsResponse;
import com.baidubce.aihc.models.ModifyDatasetRequest;
import com.baidubce.aihc.models.ModifyJobRequest;
import com.baidubce.aihc.models.ModifyJobResponse;
import com.baidubce.aihc.models.ModifyModelRequest;
import com.baidubce.aihc.models.StopJobRequest;
import com.baidubce.aihc.models.StopJobResponse;

public class AihcClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public AihcClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public AihcClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * batchStopTrainingTasksV2
     * 
     * @param request 入参结构体
     * @return BatchStopTrainingTasksV2Response
     */
    public BatchStopTrainingTasksV2Response batchStopTrainingTasksV2(BatchStopTrainingTasksV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "BatchStopJobs");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchStopTrainingTasksV2Response.class);
    }

    /**
     * createDataset
     * 
     * @param request 入参结构体
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDataset(CreateDatasetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateDataset");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDatasetResponse.class);
    }

    /**
     * createDatasetVersion
     * 
     * @param request 入参结构体
     * @return CreateDatasetVersionResponse
     */
    public CreateDatasetVersionResponse createDatasetVersion(CreateDatasetVersionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateDatasetVersion");
        if (request.getDatasetId() != null) {
            internalRequest.addParameter("datasetId", request.getDatasetId());
        }
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDatasetVersionResponse.class);
    }

    /**
     * createJob
     * 
     * @param request 入参结构体
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateJob");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateJobResponse.class);
    }

    /**
     * createModel
     * 
     * @param request 入参结构体
     * @return CreateModelResponse
     */
    public CreateModelResponse createModel(CreateModelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateModel");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateModelResponse.class);
    }

    /**
     * createModelVersion
     * 
     * @param request 入参结构体
     * @return CreateModelVersionResponse
     */
    public CreateModelVersionResponse createModelVersion(CreateModelVersionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateModelVersion");
        if (request.getModelId() != null) {
            internalRequest.addParameter("modelId", request.getModelId());
        }
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateModelVersionResponse.class);
    }

    /**
     * deleteDataset
     * 
     * @param request 入参结构体
     */
    public void deleteDataset(DeleteDatasetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteDataset");
        if (request.getDatasetId() != null) {
            internalRequest.addParameter("datasetId", request.getDatasetId());
        }
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDatasetVersion
     * 
     * @param request 入参结构体
     */
    public void deleteDatasetVersion(DeleteDatasetVersionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteDatasetVersion");
        if (request.getDatasetId() != null) {
            internalRequest.addParameter("datasetId", request.getDatasetId());
        }
        if (request.getVersionId() != null) {
            internalRequest.addParameter("versionId", request.getVersionId());
        }
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteJob
     * 
     * @param request 入参结构体
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteJob");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteJobResponse.class);
    }

    /**
     * deleteModel
     * 
     * @param request 入参结构体
     */
    public void deleteModel(DeleteModelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteModel");
        if (request.getModelId() != null) {
            internalRequest.addParameter("modelId", request.getModelId());
        }
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteModelVersion
     * 
     * @param request 入参结构体
     */
    public void deleteModelVersion(DeleteModelVersionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteModelVersion");
        if (request.getModelId() != null) {
            internalRequest.addParameter("modelId", request.getModelId());
        }
        if (request.getVersionId() != null) {
            internalRequest.addParameter("versionId", request.getVersionId());
        }
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * describeDataset
     * 
     * @param request 入参结构体
     * @return DescribeDatasetResponse
     */
    public DescribeDatasetResponse describeDataset(DescribeDatasetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDataset");
        if (request.getDatasetId() != null) {
            internalRequest.addParameter("datasetId", request.getDatasetId());
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetResponse.class);
    }

    /**
     * describeDatasetVersion
     * 
     * @param request 入参结构体
     * @return DescribeDatasetVersionResponse
     */
    public DescribeDatasetVersionResponse describeDatasetVersion(DescribeDatasetVersionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasetVersion");
        if (request.getDatasetId() != null) {
            internalRequest.addParameter("datasetId", request.getDatasetId());
        }
        if (request.getVersionId() != null) {
            internalRequest.addParameter("versionId", request.getVersionId());
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetVersionResponse.class);
    }

    /**
     * describeDatasetVersions
     * 
     * @param request 入参结构体
     * @return DescribeDatasetVersionsResponse
     */
    public DescribeDatasetVersionsResponse describeDatasetVersions(DescribeDatasetVersionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasetVersions");
        if (request.getDatasetId() != null) {
            internalRequest.addParameter("datasetId", request.getDatasetId());
        }
        if (request.getPageNumber() != null) {
            internalRequest.addParameter("pageNumber", String.valueOf(request.getPageNumber()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetVersionsResponse.class);
    }

    /**
     * describeDatasets
     * 
     * @param request 入参结构体
     * @return DescribeDatasetsResponse
     */
    public DescribeDatasetsResponse describeDatasets(DescribeDatasetsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasets");
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getStorageType() != null) {
            internalRequest.addParameter("storageType", request.getStorageType());
        }
        if (request.getStorageInstances() != null) {
            internalRequest.addParameter("storageInstances", request.getStorageInstances());
        }
        if (request.getImportFormat() != null) {
            internalRequest.addParameter("importFormat", request.getImportFormat());
        }
        if (request.getPageNumber() != null) {
            internalRequest.addParameter("pageNumber", String.valueOf(request.getPageNumber()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetsResponse.class);
    }

    /**
     * describeJob
     * 
     * @param request 入参结构体
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJob(DescribeJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeJob");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeJobResponse.class);
    }

    /**
     * describeJobEvents
     * 
     * @param request 入参结构体
     * @return DescribeJobEventsResponse
     */
    public DescribeJobEventsResponse describeJobEvents(DescribeJobEventsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeJobEvents");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeJobEventsResponse.class);
    }

    /**
     * describeJobLogs
     * 
     * @param request 入参结构体
     * @return DescribeJobLogsResponse
     */
    public DescribeJobLogsResponse describeJobLogs(DescribeJobLogsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeJobLogs");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeJobLogsResponse.class);
    }

    /**
     * describeJobMetrics
     * 
     * @param request 入参结构体
     * @return DescribeJobMetricsResponse
     */
    public DescribeJobMetricsResponse describeJobMetrics(DescribeJobMetricsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeJobMetrics");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeJobMetricsResponse.class);
    }

    /**
     * describeJobNodes
     * 
     * @param request 入参结构体
     * @return DescribeJobNodesResponse
     */
    public DescribeJobNodesResponse describeJobNodes(DescribeJobNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeJobNodes");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeJobNodesResponse.class);
    }

    /**
     * describeJobWebterminal
     * 
     * @param request 入参结构体
     * @return DescribeJobWebterminalResponse
     */
    public DescribeJobWebterminalResponse describeJobWebterminal(DescribeJobWebterminalRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeJobWebterminal");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeJobWebterminalResponse.class);
    }

    /**
     * describeJobs
     * 
     * @param request 入参结构体
     * @return DescribeJobsResponse
     */
    public DescribeJobsResponse describeJobs(DescribeJobsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeJobs");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        if (request.getQueueID() != null) {
            internalRequest.addParameter("queueID", request.getQueueID());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeJobsResponse.class);
    }

    /**
     * describeModel
     * 
     * @param request 入参结构体
     * @return DescribeModelResponse
     */
    public DescribeModelResponse describeModel(DescribeModelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModel");
        if (request.getModelId() != null) {
            internalRequest.addParameter("modelId", request.getModelId());
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelResponse.class);
    }

    /**
     * describeModelVersion
     * 
     * @param request 入参结构体
     * @return DescribeModelVersionResponse
     */
    public DescribeModelVersionResponse describeModelVersion(DescribeModelVersionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModelVersion");
        if (request.getModelId() != null) {
            internalRequest.addParameter("modelId", request.getModelId());
        }
        if (request.getVersionId() != null) {
            internalRequest.addParameter("versionId", request.getVersionId());
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelVersionResponse.class);
    }

    /**
     * describeModelVersions
     * 
     * @param request 入参结构体
     * @return DescribeModelVersionsResponse
     */
    public DescribeModelVersionsResponse describeModelVersions(DescribeModelVersionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModelVersions");
        if (request.getModelId() != null) {
            internalRequest.addParameter("modelId", request.getModelId());
        }
        if (request.getPageNumber() != null) {
            internalRequest.addParameter("pageNumber", String.valueOf(request.getPageNumber()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelVersionsResponse.class);
    }

    /**
     * describeModels
     * 
     * @param request 入参结构体
     * @return DescribeModelsResponse
     */
    public DescribeModelsResponse describeModels(DescribeModelsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModels");
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getPageNumber() != null) {
            internalRequest.addParameter("pageNumber", String.valueOf(request.getPageNumber()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelsResponse.class);
    }

    /**
     * describePodEvents
     * 
     * @param request 入参结构体
     * @return DescribePodEventsResponse
     */
    public DescribePodEventsResponse describePodEvents(DescribePodEventsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribePodEvents");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribePodEventsResponse.class);
    }

    /**
     * modifyDataset
     * 
     * @param request 入参结构体
     */
    public void modifyDataset(ModifyDatasetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ModifyDataset");
        if (request.getDatasetId() != null) {
            internalRequest.addParameter("datasetId", request.getDatasetId());
        }
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyJob
     * 
     * @param request 入参结构体
     * @return ModifyJobResponse
     */
    public ModifyJobResponse modifyJob(ModifyJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ModifyJob");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ModifyJobResponse.class);
    }

    /**
     * modifyModel
     * 
     * @param request 入参结构体
     */
    public void modifyModel(ModifyModelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ModifyModel");
        if (request.getModelId() != null) {
            internalRequest.addParameter("modelId", request.getModelId());
        }
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * stopJob
     * 
     * @param request 入参结构体
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "StopJob");
        internalRequest.addParameter("resourcePoolId", "xxxx");
        internalRequest.addParameter("queueID", "xxxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, StopJobResponse.class);
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
