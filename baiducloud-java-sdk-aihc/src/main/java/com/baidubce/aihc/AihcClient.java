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
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.aihc.models.CreateDatasetRequest;
import com.baidubce.aihc.models.CreateDatasetResponse;
import com.baidubce.aihc.models.CreateDatasetVersionRequest;
import com.baidubce.aihc.models.CreateDatasetVersionResponse;
import com.baidubce.aihc.models.CreateModelRequest;
import com.baidubce.aihc.models.CreateModelResponse;
import com.baidubce.aihc.models.CreateModelVersionRequest;
import com.baidubce.aihc.models.CreateModelVersionResponse;
import com.baidubce.aihc.models.DescribeDatasetResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionsResponse;
import com.baidubce.aihc.models.DescribeDatasetsResponse;
import com.baidubce.aihc.models.DescribeModelResponse;
import com.baidubce.aihc.models.DescribeModelVersionResponse;
import com.baidubce.aihc.models.DescribeModelVersionsResponse;
import com.baidubce.aihc.models.DescribeModelsResponse;
import com.baidubce.aihc.models.ModifyDatasetRequest;
import com.baidubce.aihc.models.ModifyModelRequest;

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
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDatasetVersionResponse.class);
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
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateModelVersionResponse.class);
    }

    /**
     * deleteDataset
     * 
     */
    public void deleteDataset() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteDataset");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDatasetVersion
     * 
     */
    public void deleteDatasetVersion() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteDatasetVersion");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteModel
     * 
     */
    public void deleteModel() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteModel");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteModelVersion
     * 
     */
    public void deleteModelVersion() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteModelVersion");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        internalRequest.addHeader("Version", "v2");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * describeDataset
     * 
     * @return DescribeDatasetResponse
     */
    public DescribeDatasetResponse describeDataset() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDataset");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetResponse.class);
    }

    /**
     * describeDatasetVersion
     * 
     * @return DescribeDatasetVersionResponse
     */
    public DescribeDatasetVersionResponse describeDatasetVersion() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasetVersion");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetVersionResponse.class);
    }

    /**
     * describeDatasetVersions
     * 
     * @return DescribeDatasetVersionsResponse
     */
    public DescribeDatasetVersionsResponse describeDatasetVersions() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasetVersions");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetVersionsResponse.class);
    }

    /**
     * describeDatasets
     * 
     * @return DescribeDatasetsResponse
     */
    public DescribeDatasetsResponse describeDatasets() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasets");
        internalRequest.addParameter("keyword", "xxx");
        internalRequest.addParameter("storageType", "xxx");
        internalRequest.addParameter("storageInstances", "xxx");
        internalRequest.addParameter("importFormat", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeDatasetsResponse.class);
    }

    /**
     * describeModel
     * 
     * @return DescribeModelResponse
     */
    public DescribeModelResponse describeModel() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModel");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelResponse.class);
    }

    /**
     * describeModelVersion
     * 
     * @return DescribeModelVersionResponse
     */
    public DescribeModelVersionResponse describeModelVersion() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModelVersion");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelVersionResponse.class);
    }

    /**
     * describeModelVersions
     * 
     * @return DescribeModelVersionsResponse
     */
    public DescribeModelVersionsResponse describeModelVersions() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModelVersions");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelVersionsResponse.class);
    }

    /**
     * describeModels
     * 
     * @return DescribeModelsResponse
     */
    public DescribeModelsResponse describeModels() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModels");
        internalRequest.addParameter("keyword", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        internalRequest.addHeader("Version", "v2");
        return invokeHttpClient(internalRequest, DescribeModelsResponse.class);
    }

    /**
     * modifyDataset
     * 
     * @param request 入参结构体
     */
    public void modifyDataset(ModifyDatasetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ModifyDataset");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyModel
     * 
     * @param request 入参结构体
     */
    public void modifyModel(ModifyModelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ModifyModel");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addHeader("Version", "v2");
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
