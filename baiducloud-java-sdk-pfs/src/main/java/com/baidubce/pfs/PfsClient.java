package com.baidubce.pfs;

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

import com.baidubce.pfs.models.CreatePfsRequest;
import com.baidubce.pfs.models.CreatePfsResponse;
import com.baidubce.pfs.models.DeletePfsRequest;
import com.baidubce.pfs.models.DescPfsRequest;
import com.baidubce.pfs.models.DescPfsResponse;
import com.baidubce.pfs.models.ListPfsRequest;
import com.baidubce.pfs.models.ListPfsResponse;
import com.baidubce.pfs.models.UpdatePFSTagRequest;

public class PfsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_PFS = "pfs";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_TAG = "tag";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public PfsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public PfsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * createPfs
     * 
     * @param request 入参结构体
     * @return CreatePfsResponse
     */
    public CreatePfsResponse createPfs(CreatePfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreatePfsResponse.class);
    }

    /**
     * deletePfs
     * 
     * @param request 入参结构体
     */
    public void deletePfs(DeletePfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * descPfs
     * 
     * @param request 入参结构体
     * @return DescPfsResponse
     */
    public DescPfsResponse descPfs(DescPfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        return invokeHttpClient(internalRequest, DescPfsResponse.class);
    }

    /**
     * listPfs
     * 
     * @param request 入参结构体
     * @return ListPfsResponse
     */
    public ListPfsResponse listPfs(ListPfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        internalRequest.addParameter("manner", "marker");
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getFilterTag() != null) {
            internalRequest.addParameter("filterTag", request.getFilterTag());
        }
        return invokeHttpClient(internalRequest, ListPfsResponse.class);
    }

    /**
     * updatePFSTag
     * 
     * @param request 入参结构体
     */
    public void updatePFSTag(UpdatePFSTagRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_PFS, CONSTANT_TAG);
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
