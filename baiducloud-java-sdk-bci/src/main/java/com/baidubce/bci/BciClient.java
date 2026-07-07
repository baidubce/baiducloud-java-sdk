package com.baidubce.bci;

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

import com.baidubce.bci.models.BatchDeleteImageCachesRequest;
import com.baidubce.bci.models.BatchDeleteInstancesRequest;
import com.baidubce.bci.models.CreateImageCacheRequest;
import com.baidubce.bci.models.CreateImageCacheResponse;
import com.baidubce.bci.models.CreateInstanceRequest;
import com.baidubce.bci.models.CreateInstanceResponse;
import com.baidubce.bci.models.DeleteInstanceRequest;
import com.baidubce.bci.models.GetInstanceRequest;
import com.baidubce.bci.models.GetInstanceResponse;
import com.baidubce.bci.models.ListImageCachesRequest;
import com.baidubce.bci.models.ListImageCachesResponse;
import com.baidubce.bci.models.ListInstancesRequest;
import com.baidubce.bci.models.ListInstancesResponse;

public class BciClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_BATCH_DEL = "batchDel";
    private static final String CONSTANT_IMAGE_CACHE = "imageCache";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public BciClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public BciClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * batchDeleteImageCaches
     * 
     * @param request 入参结构体
     */
    public void batchDeleteImageCaches(BatchDeleteImageCachesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IMAGE_CACHE, CONSTANT_BATCH_DEL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchDeleteInstances
     * 
     * @param request 入参结构体
     */
    public void batchDeleteInstances(BatchDeleteInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, CONSTANT_BATCH_DEL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createImageCache
     * 
     * @param request 入参结构体
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCache(CreateImageCacheRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IMAGE_CACHE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateImageCacheResponse.class);
    }

    /**
     * createInstance
     * 
     * @param request 入参结构体
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateInstanceResponse.class);
    }

    /**
     * deleteInstance
     * 
     * @param request 入参结构体
     */
    public void deleteInstance(DeleteInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        if (request.getRelatedReleaseFlag() != null) {
            internalRequest.addParameter("relatedReleaseFlag", String.valueOf(request.getRelatedReleaseFlag()));
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getInstance
     * 
     * @param request 入参结构体
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        return invokeHttpClient(internalRequest, GetInstanceResponse.class);
    }

    /**
     * listImageCaches
     * 
     * @param request 入参结构体
     * @return ListImageCachesResponse
     */
    public ListImageCachesResponse listImageCaches(ListImageCachesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_IMAGE_CACHE);
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        return invokeHttpClient(internalRequest, ListImageCachesResponse.class);
    }

    /**
     * listInstances
     * 
     * @param request 入参结构体
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE);
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListInstancesResponse.class);
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
