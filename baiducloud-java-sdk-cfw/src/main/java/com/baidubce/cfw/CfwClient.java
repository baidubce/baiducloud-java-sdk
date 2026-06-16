package com.baidubce.cfw;

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

import com.baidubce.cfw.models.BindCfwRequest;
import com.baidubce.cfw.models.CreateCfwRequest;
import com.baidubce.cfw.models.CreateCfwResponse;
import com.baidubce.cfw.models.CreateCfwRuleRequest;
import com.baidubce.cfw.models.CreateStatelessCfwRequest;
import com.baidubce.cfw.models.CreateStatelessCfwResponse;
import com.baidubce.cfw.models.DeleteCfwRequest;
import com.baidubce.cfw.models.DeleteCfwRuleRequest;
import com.baidubce.cfw.models.DisableCfwProtectRequest;
import com.baidubce.cfw.models.EnableCfwProtectRequest;
import com.baidubce.cfw.models.GetCfwRequest;
import com.baidubce.cfw.models.GetCfwResponse;
import com.baidubce.cfw.models.GetStatelessCfwRequest;
import com.baidubce.cfw.models.GetStatelessCfwResponse;
import com.baidubce.cfw.models.ListCfwRequest;
import com.baidubce.cfw.models.ListCfwResponse;
import com.baidubce.cfw.models.ListProtectInstancesRequest;
import com.baidubce.cfw.models.ListProtectInstancesResponse;
import com.baidubce.cfw.models.ListStatelessCfwResponse;
import com.baidubce.cfw.models.UnbindCfwRequest;
import com.baidubce.cfw.models.UpdateCfwRequest;
import com.baidubce.cfw.models.UpdateCfwRuleRequest;
import com.baidubce.cfw.models.UpdateStatelessCfwRequest;

public class CfwClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_CFW = "cfw";
    private static final String CONSTANT_STATELESS = "stateless";
    private static final String CONSTANT_RULE = "rule";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_INSTANCE = "instance";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public CfwClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public CfwClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * bindCfw
     * 
     * @param request 入参结构体
     */
    public void bindCfw(BindCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, request.getCfwId());
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createCfw
     * 
     * @param request 入参结构体
     * @return CreateCfwResponse
     */
    public CreateCfwResponse createCfw(CreateCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CFW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateCfwResponse.class);
    }

    /**
     * createCfwRule
     * 
     * @param request 入参结构体
     */
    public void createCfwRule(CreateCfwRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CFW, request.getCfwId(), CONSTANT_RULE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createStatelessCfw
     * 
     * @param request 入参结构体
     * @return CreateStatelessCfwResponse
     */
    public CreateStatelessCfwResponse createStatelessCfw(CreateStatelessCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CFW, CONSTANT_STATELESS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateStatelessCfwResponse.class);
    }

    /**
     * deleteCfw
     * 
     * @param request 入参结构体
     */
    public void deleteCfw(DeleteCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_CFW, request.getCfwId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteCfwRule
     * 
     * @param request 入参结构体
     */
    public void deleteCfwRule(DeleteCfwRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, request.getCfwId(), CONSTANT_DELETE, CONSTANT_RULE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disableCfwProtect
     * 
     * @param request 入参结构体
     */
    public void disableCfwProtect(DisableCfwProtectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, request.getCfwId());
        internalRequest.addParameter("off", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * enableCfwProtect
     * 
     * @param request 入参结构体
     */
    public void enableCfwProtect(EnableCfwProtectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, request.getCfwId());
        internalRequest.addParameter("on", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getCfw
     * 
     * @param request 入参结构体
     * @return GetCfwResponse
     */
    public GetCfwResponse getCfw(GetCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CFW, request.getCfwId());
        return invokeHttpClient(internalRequest, GetCfwResponse.class);
    }

    /**
     * getStatelessCfw
     * 
     * @param request 入参结构体
     * @return GetStatelessCfwResponse
     */
    public GetStatelessCfwResponse getStatelessCfw(GetStatelessCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CFW, CONSTANT_STATELESS, request.getCfwId());
        return invokeHttpClient(internalRequest, GetStatelessCfwResponse.class);
    }

    /**
     * listCfw
     * 
     * @param request 入参结构体
     * @return ListCfwResponse
     */
    public ListCfwResponse listCfw(ListCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CFW);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListCfwResponse.class);
    }

    /**
     * listProtectInstances
     * 
     * @param request 入参结构体
     * @return ListProtectInstancesResponse
     */
    public ListProtectInstancesResponse listProtectInstances(ListProtectInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CFW, CONSTANT_INSTANCE);
        if (request.getInstanceType() != null) {
            internalRequest.addParameter("instanceType", request.getInstanceType());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getRegion() != null) {
            internalRequest.addParameter("region", request.getRegion());
        }
        return invokeHttpClient(internalRequest, ListProtectInstancesResponse.class);
    }

    /**
     * listStatelessCfw
     * 
     * @return ListStatelessCfwResponse
     */
    public ListStatelessCfwResponse listStatelessCfw() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_CFW, CONSTANT_STATELESS);
        internalRequest.addParameter("marker", "cfw-egx34bzjj43k");
        internalRequest.addParameter("maxKeys", "1");
        return invokeHttpClient(internalRequest, ListStatelessCfwResponse.class);
    }

    /**
     * unbindCfw
     * 
     * @param request 入参结构体
     */
    public void unbindCfw(UnbindCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, request.getCfwId());
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateCfw
     * 
     * @param request 入参结构体
     */
    public void updateCfw(UpdateCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, request.getCfwId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateCfwRule
     * 
     * @param request 入参结构体
     */
    public void updateCfwRule(UpdateCfwRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, request.getCfwId(), CONSTANT_RULE, request.getCfwRuleId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateStatelessCfw
     * 
     * @param request 入参结构体
     */
    public void updateStatelessCfw(UpdateStatelessCfwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFW, CONSTANT_STATELESS, request.getCfwId());
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
