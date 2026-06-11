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

import com.baidubce.aihc.models.CreateADatasetV2Request;
import com.baidubce.aihc.models.CreateADatasetV2Response;
import com.baidubce.aihc.models.CreateAModelV2Request;
import com.baidubce.aihc.models.CreateAModelV2Response;
import com.baidubce.aihc.models.CreateDatasetVersionV2Request;
import com.baidubce.aihc.models.CreateDatasetVersionV2Response;
import com.baidubce.aihc.models.GetAListOfModelVersionsV2Response;
import com.baidubce.aihc.models.GetDatasetDetailsV2Response;
import com.baidubce.aihc.models.GetDatasetVersionDetailsV2Response;
import com.baidubce.aihc.models.GetModelDetailsV2Response;
import com.baidubce.aihc.models.GetModelListV2Response;
import com.baidubce.aihc.models.GetModelVersionDetailsV2Response;
import com.baidubce.aihc.models.ModifyDatasetV2Request;
import com.baidubce.aihc.models.ModifyTheModelV2Request;
import com.baidubce.aihc.models.NewModelVersionV2Request;
import com.baidubce.aihc.models.NewModelVersionV2Response;
import com.baidubce.aihc.models.RetrieveTheDatasetListV2Response;
import com.baidubce.aihc.models.RetrieveTheDatasetVersionListV2Response;

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
     * createADatasetV2
     * 
     * @param request 入参结构体
     * @return CreateADatasetV2Response
     */
    public CreateADatasetV2Response createADatasetV2(CreateADatasetV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateDataset");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateADatasetV2Response.class);
    }

    /**
     * createAModelV2
     * 
     * @param request 入参结构体
     * @return CreateAModelV2Response
     */
    public CreateAModelV2Response createAModelV2(CreateAModelV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateModel");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAModelV2Response.class);
    }

    /**
     * createDatasetVersionV2
     * 
     * @param request 入参结构体
     * @return CreateDatasetVersionV2Response
     */
    public CreateDatasetVersionV2Response createDatasetVersionV2(CreateDatasetVersionV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateDatasetVersion");
        internalRequest.addParameter("datasetId", "xxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDatasetVersionV2Response.class);
    }

    /**
     * deleteDatasetV2
     * 
     */
    public void deleteDatasetV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteDataset");
        internalRequest.addParameter("datasetId", "xxx");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDatasetVersionV2
     * 
     */
    public void deleteDatasetVersionV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteDatasetVersion");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteModelV2
     * 
     */
    public void deleteModelV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteModel");
        internalRequest.addParameter("modelId", "xxx");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteModelVersionV2
     * 
     */
    public void deleteModelVersionV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteModelVersion");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getAListOfModelVersionsV2
     * 
     * @return GetAListOfModelVersionsV2Response
     */
    public GetAListOfModelVersionsV2Response getAListOfModelVersionsV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModelVersions");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        return invokeHttpClient(internalRequest, GetAListOfModelVersionsV2Response.class);
    }

    /**
     * getDatasetDetailsV2
     * 
     * @return GetDatasetDetailsV2Response
     */
    public GetDatasetDetailsV2Response getDatasetDetailsV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDataset");
        internalRequest.addParameter("datasetId", "xxx");
        return invokeHttpClient(internalRequest, GetDatasetDetailsV2Response.class);
    }

    /**
     * getDatasetVersionDetailsV2
     * 
     * @return GetDatasetVersionDetailsV2Response
     */
    public GetDatasetVersionDetailsV2Response getDatasetVersionDetailsV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasetVersion");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        return invokeHttpClient(internalRequest, GetDatasetVersionDetailsV2Response.class);
    }

    /**
     * getModelDetailsV2
     * 
     * @return GetModelDetailsV2Response
     */
    public GetModelDetailsV2Response getModelDetailsV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModel");
        internalRequest.addParameter("modelId", "xxx");
        return invokeHttpClient(internalRequest, GetModelDetailsV2Response.class);
    }

    /**
     * getModelListV2
     * 
     * @return GetModelListV2Response
     */
    public GetModelListV2Response getModelListV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModels");
        internalRequest.addParameter("keyword", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        return invokeHttpClient(internalRequest, GetModelListV2Response.class);
    }

    /**
     * getModelVersionDetailsV2
     * 
     * @return GetModelVersionDetailsV2Response
     */
    public GetModelVersionDetailsV2Response getModelVersionDetailsV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeModelVersion");
        internalRequest.addParameter("modelId", "xxx");
        internalRequest.addParameter("versionId", "xxx");
        return invokeHttpClient(internalRequest, GetModelVersionDetailsV2Response.class);
    }

    /**
     * modifyDatasetV2
     * 
     * @param request 入参结构体
     */
    public void modifyDatasetV2(ModifyDatasetV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ModifyDataset");
        internalRequest.addParameter("datasetId", "xxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyTheModelV2
     * 
     * @param request 入参结构体
     */
    public void modifyTheModelV2(ModifyTheModelV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ModifyModel");
        internalRequest.addParameter("modelId", "xxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * newModelVersionV2
     * 
     * @param request 入参结构体
     * @return NewModelVersionV2Response
     */
    public NewModelVersionV2Response newModelVersionV2(NewModelVersionV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateModelVersion");
        internalRequest.addParameter("modelId", "xxx");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, NewModelVersionV2Response.class);
    }

    /**
     * retrieveTheDatasetListV2
     * 
     * @return RetrieveTheDatasetListV2Response
     */
    public RetrieveTheDatasetListV2Response retrieveTheDatasetListV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasets");
        internalRequest.addParameter("keyword", "xxx");
        internalRequest.addParameter("storageType", "xxx");
        internalRequest.addParameter("storageInstances", "xxx");
        internalRequest.addParameter("importFormat", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        return invokeHttpClient(internalRequest, RetrieveTheDatasetListV2Response.class);
    }

    /**
     * retrieveTheDatasetVersionListV2
     * 
     * @return RetrieveTheDatasetVersionListV2Response
     */
    public RetrieveTheDatasetVersionListV2Response retrieveTheDatasetVersionListV2() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, null);
        internalRequest.addParameter("action", "DescribeDatasetVersions");
        internalRequest.addParameter("datasetId", "xxx");
        internalRequest.addParameter("pageNumber", "xxx");
        internalRequest.addParameter("pageSize", "xxx");
        return invokeHttpClient(internalRequest, RetrieveTheDatasetVersionListV2Response.class);
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
