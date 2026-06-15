package com.baidubce.et;

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

import com.baidubce.et.models.ApplyPhysicalDedicatedLineRequest;
import com.baidubce.et.models.ApplyPhysicalDedicatedLineResponse;
import com.baidubce.et.models.AssociatedDedicatedChannelRequest;
import com.baidubce.et.models.CreateDedicatedChannelBfdRequest;
import com.baidubce.et.models.CreateDedicatedChannelRequest;
import com.baidubce.et.models.CreateDedicatedChannelResponse;
import com.baidubce.et.models.CreateDedicatedChannelRouteParametersRequest;
import com.baidubce.et.models.CreateDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.CreateDedicatedChannelRouteRulesResponse;
import com.baidubce.et.models.CreateDedicatedChannelUserObjectRequest;
import com.baidubce.et.models.DeleteDedicatedChannelBfdRequest;
import com.baidubce.et.models.DeleteDedicatedChannelRequest;
import com.baidubce.et.models.DeleteDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.DeletePhysicalDedicatedLineRequest;
import com.baidubce.et.models.DisableDedicatedChannelIpv6Request;
import com.baidubce.et.models.EnableDedicatedChannelIpv6Request;
import com.baidubce.et.models.QueryDedicatedChannelRequest;
import com.baidubce.et.models.QueryDedicatedChannelResponse;
import com.baidubce.et.models.QueryDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.QueryDedicatedChannelRouteRulesResponse;
import com.baidubce.et.models.QueryDedicatedLineDetailRequest;
import com.baidubce.et.models.QueryDedicatedLineDetailResponse;
import com.baidubce.et.models.QueryDedicatedLinesRequest;
import com.baidubce.et.models.QueryDedicatedLinesResponse;
import com.baidubce.et.models.RemoveDedicatedChannelRouteParametersRequest;
import com.baidubce.et.models.RemoveDedicatedChannelUserObjectRequest;
import com.baidubce.et.models.ResubmitDedicatedChannelRequest;
import com.baidubce.et.models.UnrelatedDedicatedLineChannelRequest;
import com.baidubce.et.models.UpdateDedicatedChannelBfdRequest;
import com.baidubce.et.models.UpdateDedicatedChannelRequest;
import com.baidubce.et.models.UpdateDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.UpdatePhysicalDedicatedLineRequest;

public class EtClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_ET = "et";
    private static final String CONSTANT_CHANNEL = "channel";
    private static final String CONSTANT_ROUTE = "route";
    private static final String CONSTANT_RULE = "rule";
    private static final String CONSTANT_INIT = "init";
    private static final String CONSTANT_BFD = "bfd";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public EtClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public EtClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * applyPhysicalDedicatedLine
     * 
     * @param request 入参结构体
     * @return ApplyPhysicalDedicatedLineResponse
     */
    public ApplyPhysicalDedicatedLineResponse applyPhysicalDedicatedLine(ApplyPhysicalDedicatedLineRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ET, CONSTANT_INIT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApplyPhysicalDedicatedLineResponse.class);
    }

    /**
     * associatedDedicatedChannel
     * 
     * @param request 入参结构体
     */
    public void associatedDedicatedChannel(AssociatedDedicatedChannelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("associate", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createDedicatedChannel
     * 
     * @param request 入参结构体
     * @return CreateDedicatedChannelResponse
     */
    public CreateDedicatedChannelResponse createDedicatedChannel(CreateDedicatedChannelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDedicatedChannelResponse.class);
    }

    /**
     * createDedicatedChannelBfd
     * 
     * @param request 入参结构体
     */
    public void createDedicatedChannelBfd(CreateDedicatedChannelBfdRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId(), CONSTANT_BFD);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createDedicatedChannelRouteParameters
     * 
     * @param request 入参结构体
     */
    public void createDedicatedChannelRouteParameters(CreateDedicatedChannelRouteParametersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("addRoutes", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createDedicatedChannelRouteRules
     * 
     * @param request 入参结构体
     * @return CreateDedicatedChannelRouteRulesResponse
     */
    public CreateDedicatedChannelRouteRulesResponse createDedicatedChannelRouteRules(CreateDedicatedChannelRouteRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        VERSION_V1,
                        CONSTANT_ET,
                        request.getEtId(),
                        CONSTANT_CHANNEL,
                        request.getEtChannelId(),
                        CONSTANT_ROUTE,
                        CONSTANT_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDedicatedChannelRouteRulesResponse.class);
    }

    /**
     * createDedicatedChannelUserObject
     * 
     * @param request 入参结构体
     */
    public void createDedicatedChannelUserObject(CreateDedicatedChannelUserObjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("addUsers", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDedicatedChannel
     * 
     * @param request 入参结构体
     */
    public void deleteDedicatedChannel(DeleteDedicatedChannelRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDedicatedChannelBfd
     * 
     * @param request 入参结构体
     */
    public void deleteDedicatedChannelBfd(DeleteDedicatedChannelBfdRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId(), CONSTANT_BFD);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDedicatedChannelRouteRules
     * 
     * @param request 入参结构体
     */
    public void deleteDedicatedChannelRouteRules(DeleteDedicatedChannelRouteRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        VERSION_V1,
                        CONSTANT_ET,
                        request.getEtId(),
                        CONSTANT_CHANNEL,
                        request.getEtChannelId(),
                        CONSTANT_ROUTE,
                        CONSTANT_RULE,
                        request.getRouteRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deletePhysicalDedicatedLine
     * 
     * @param request 入参结构体
     */
    public void deletePhysicalDedicatedLine(DeletePhysicalDedicatedLineRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ET, request.getDcphyId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disableDedicatedChannelIpv6
     * 
     * @param request 入参结构体
     */
    public void disableDedicatedChannelIpv6(DisableDedicatedChannelIpv6Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("disableIpv6", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * enableDedicatedChannelIpv6
     * 
     * @param request 入参结构体
     */
    public void enableDedicatedChannelIpv6(EnableDedicatedChannelIpv6Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("enableIpv6", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryDedicatedChannel
     * 
     * @param request 入参结构体
     * @return QueryDedicatedChannelResponse
     */
    public QueryDedicatedChannelResponse queryDedicatedChannel(QueryDedicatedChannelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getEtChannelId() != null) {
            internalRequest.addParameter("etChannelId", request.getEtChannelId());
        }
        return invokeHttpClient(internalRequest, QueryDedicatedChannelResponse.class);
    }

    /**
     * queryDedicatedChannelRouteRules
     * 
     * @param request 入参结构体
     * @return QueryDedicatedChannelRouteRulesResponse
     */
    public QueryDedicatedChannelRouteRulesResponse queryDedicatedChannelRouteRules(QueryDedicatedChannelRouteRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_ET,
                        request.getEtId(),
                        CONSTANT_CHANNEL,
                        request.getEtChannelId(),
                        CONSTANT_ROUTE,
                        CONSTANT_RULE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getDestAddress() != null) {
            internalRequest.addParameter("destAddress", request.getDestAddress());
        }
        return invokeHttpClient(internalRequest, QueryDedicatedChannelRouteRulesResponse.class);
    }

    /**
     * queryDedicatedLineDetail
     * 
     * @param request 入参结构体
     * @return QueryDedicatedLineDetailResponse
     */
    public QueryDedicatedLineDetailResponse queryDedicatedLineDetail(QueryDedicatedLineDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ET, request.getDcphyId());
        return invokeHttpClient(internalRequest, QueryDedicatedLineDetailResponse.class);
    }

    /**
     * queryDedicatedLines
     * 
     * @param request 入参结构体
     * @return QueryDedicatedLinesResponse
     */
    public QueryDedicatedLinesResponse queryDedicatedLines(QueryDedicatedLinesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ET);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        return invokeHttpClient(internalRequest, QueryDedicatedLinesResponse.class);
    }

    /**
     * removeDedicatedChannelRouteParameters
     * 
     * @param request 入参结构体
     */
    public void removeDedicatedChannelRouteParameters(RemoveDedicatedChannelRouteParametersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("removeRoutes", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeDedicatedChannelUserObject
     * 
     * @param request 入参结构体
     */
    public void removeDedicatedChannelUserObject(RemoveDedicatedChannelUserObjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("removeUsers", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resubmitDedicatedChannel
     * 
     * @param request 入参结构体
     */
    public void resubmitDedicatedChannel(ResubmitDedicatedChannelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("reCreate", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unrelatedDedicatedLineChannel
     * 
     * @param request 入参结构体
     */
    public void unrelatedDedicatedLineChannel(UnrelatedDedicatedLineChannelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("disassociate", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDedicatedChannel
     * 
     * @param request 入参结构体
     */
    public void updateDedicatedChannel(UpdateDedicatedChannelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDedicatedChannelBfd
     * 
     * @param request 入参结构体
     */
    public void updateDedicatedChannelBfd(UpdateDedicatedChannelBfdRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getEtId(), CONSTANT_CHANNEL, request.getEtChannelId(), CONSTANT_BFD);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDedicatedChannelRouteRules
     * 
     * @param request 入参结构体
     */
    public void updateDedicatedChannelRouteRules(UpdateDedicatedChannelRouteRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        VERSION_V1,
                        CONSTANT_ET,
                        request.getEtId(),
                        CONSTANT_CHANNEL,
                        request.getEtChannelId(),
                        CONSTANT_ROUTE,
                        CONSTANT_RULE,
                        request.getRouteRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updatePhysicalDedicatedLine
     * 
     * @param request 入参结构体
     */
    public void updatePhysicalDedicatedLine(UpdatePhysicalDedicatedLineRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET, request.getDcphyId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
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
