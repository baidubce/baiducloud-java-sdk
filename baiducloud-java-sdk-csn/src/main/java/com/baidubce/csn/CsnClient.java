package com.baidubce.csn;

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

import com.baidubce.csn.models.AddRouteRuleRequest;
import com.baidubce.csn.models.AttachCsnInstanceRequest;
import com.baidubce.csn.models.BindCsnBpRequest;
import com.baidubce.csn.models.CreateAssociationRelationRequest;
import com.baidubce.csn.models.CreateCsnBpRequest;
import com.baidubce.csn.models.CreateCsnBpResponse;
import com.baidubce.csn.models.CreateCsnRequest;
import com.baidubce.csn.models.CreateCsnResponse;
import com.baidubce.csn.models.CreateRegionBandwidthRequest;
import com.baidubce.csn.models.CreateStudyRelationRequest;
import com.baidubce.csn.models.DeleteAssociationRelationRequest;
import com.baidubce.csn.models.DeleteCsnBpRequest;
import com.baidubce.csn.models.DeleteCsnRequest;
import com.baidubce.csn.models.DeleteRegionBandwidthRequest;
import com.baidubce.csn.models.DeleteRouteRuleRequest;
import com.baidubce.csn.models.DeleteStudyRelationRequest;
import com.baidubce.csn.models.DetachCsnInstanceRequest;
import com.baidubce.csn.models.QueryAssociationRelationRequest;
import com.baidubce.csn.models.QueryAssociationRelationResponse;
import com.baidubce.csn.models.QueryCsnBpDetailRequest;
import com.baidubce.csn.models.QueryCsnBpDetailResponse;
import com.baidubce.csn.models.QueryCsnBpListRequest;
import com.baidubce.csn.models.QueryCsnBpListResponse;
import com.baidubce.csn.models.QueryCsnBpPriceRequest;
import com.baidubce.csn.models.QueryCsnBpPriceResponse;
import com.baidubce.csn.models.QueryCsnDetailRequest;
import com.baidubce.csn.models.QueryCsnDetailResponse;
import com.baidubce.csn.models.QueryCsnInstanceRequest;
import com.baidubce.csn.models.QueryCsnInstanceResponse;
import com.baidubce.csn.models.QueryCsnListRequest;
import com.baidubce.csn.models.QueryCsnListResponse;
import com.baidubce.csn.models.QueryRegionBandwidthByCsnRequest;
import com.baidubce.csn.models.QueryRegionBandwidthByCsnResponse;
import com.baidubce.csn.models.QueryRegionBandwidthRequest;
import com.baidubce.csn.models.QueryRegionBandwidthResponse;
import com.baidubce.csn.models.QueryRouteRuleRequest;
import com.baidubce.csn.models.QueryRouteRuleResponse;
import com.baidubce.csn.models.QueryRouteTableListRequest;
import com.baidubce.csn.models.QueryRouteTableListResponse;
import com.baidubce.csn.models.QueryStudyRelationRequest;
import com.baidubce.csn.models.QueryStudyRelationResponse;
import com.baidubce.csn.models.QueryTgwListRequest;
import com.baidubce.csn.models.QueryTgwListResponse;
import com.baidubce.csn.models.QueryTgwRouteRequest;
import com.baidubce.csn.models.QueryTgwRouteResponse;
import com.baidubce.csn.models.ResizeCsnBpRequest;
import com.baidubce.csn.models.UnbindCsnBpRequest;
import com.baidubce.csn.models.UpdateCsnBpRequest;
import com.baidubce.csn.models.UpdateCsnRequest;
import com.baidubce.csn.models.UpdateRegionBandwidthRequest;
import com.baidubce.csn.models.UpdateTgwRequest;

public class CsnClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_CSN = "csn";
    private static final String CONSTANT_ROUTE_TABLE = "routeTable";
    private static final String CONSTANT_RULE = "rule";
    private static final String CONSTANT_BP = "bp";
    private static final String CONSTANT_LIMIT = "limit";
    private static final String CONSTANT_PROPAGATION = "propagation";
    private static final String CONSTANT_TGW = "tgw";
    private static final String CONSTANT_ASSOCIATION = "association";
    private static final String CONSTANT_PRICE = "price";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_INSTANCE = "instance";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public CsnClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public CsnClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addRouteRule
     * 
     * @param request 入参结构体
     */
    public void addRouteRule(AddRouteRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN, CONSTANT_ROUTE_TABLE, request.getCsnRtId(), CONSTANT_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * attachCsnInstance
     * 
     * @param request 入参结构体
     */
    public void attachCsnInstance(AttachCsnInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, request.getCsnId());
        internalRequest.addParameter("attach", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindCsnBp
     * 
     * @param request 入参结构体
     */
    public void bindCsnBp(BindCsnBpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAssociationRelation
     * 
     * @param request 入参结构体
     */
    public void createAssociationRelation(CreateAssociationRelationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN, CONSTANT_ROUTE_TABLE, request.getCsnRtId(), CONSTANT_ASSOCIATION);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createCsn
     * 
     * @param request 入参结构体
     * @return CreateCsnResponse
     */
    public CreateCsnResponse createCsn(CreateCsnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateCsnResponse.class);
    }

    /**
     * createCsnBp
     * 
     * @param request 入参结构体
     * @return CreateCsnBpResponse
     */
    public CreateCsnBpResponse createCsnBp(CreateCsnBpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN, CONSTANT_BP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateCsnBpResponse.class);
    }

    /**
     * createRegionBandwidth
     * 
     * @param request 入参结构体
     */
    public void createRegionBandwidth(CreateRegionBandwidthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId(), CONSTANT_LIMIT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createStudyRelation
     * 
     * @param request 入参结构体
     */
    public void createStudyRelation(CreateStudyRelationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN, CONSTANT_ROUTE_TABLE, request.getCsnRtId(), CONSTANT_PROPAGATION);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAssociationRelation
     * 
     * @param request 入参结构体
     */
    public void deleteAssociationRelation(DeleteAssociationRelationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        VERSION_V1,
                        CONSTANT_CSN,
                        CONSTANT_ROUTE_TABLE,
                        request.getCsnRtId(),
                        CONSTANT_ASSOCIATION,
                        request.getAttachId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteCsn
     * 
     * @param request 入参结构体
     */
    public void deleteCsn(DeleteCsnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_CSN, request.getCsnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteCsnBp
     * 
     * @param request 入参结构体
     */
    public void deleteCsnBp(DeleteCsnBpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRegionBandwidth
     * 
     * @param request 入参结构体
     */
    public void deleteRegionBandwidth(DeleteRegionBandwidthRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId(), CONSTANT_LIMIT, CONSTANT_DELETE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRouteRule
     * 
     * @param request 入参结构体
     */
    public void deleteRouteRule(DeleteRouteRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_CSN, CONSTANT_ROUTE_TABLE, request.getCsnRtId(), CONSTANT_RULE, request.getCsnRtRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteStudyRelation
     * 
     * @param request 入参结构体
     */
    public void deleteStudyRelation(DeleteStudyRelationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        VERSION_V1,
                        CONSTANT_CSN,
                        CONSTANT_ROUTE_TABLE,
                        request.getCsnRtId(),
                        CONSTANT_PROPAGATION,
                        request.getAttachId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * detachCsnInstance
     * 
     * @param request 入参结构体
     */
    public void detachCsnInstance(DetachCsnInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, request.getCsnId());
        internalRequest.addParameter("detach", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryAssociationRelation
     * 
     * @param request 入参结构体
     * @return QueryAssociationRelationResponse
     */
    public QueryAssociationRelationResponse queryAssociationRelation(QueryAssociationRelationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, CONSTANT_ROUTE_TABLE, request.getCsnRtId(), CONSTANT_ASSOCIATION);
        return invokeHttpClient(internalRequest, QueryAssociationRelationResponse.class);
    }

    /**
     * queryCsnBpDetail
     * 
     * @param request 入参结构体
     * @return QueryCsnBpDetailResponse
     */
    public QueryCsnBpDetailResponse queryCsnBpDetail(QueryCsnBpDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId());
        return invokeHttpClient(internalRequest, QueryCsnBpDetailResponse.class);
    }

    /**
     * queryCsnBpList
     * 
     * @param request 入参结构体
     * @return QueryCsnBpListResponse
     */
    public QueryCsnBpListResponse queryCsnBpList(QueryCsnBpListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, CONSTANT_BP);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryCsnBpListResponse.class);
    }

    /**
     * queryCsnBpPrice
     * 
     * @param request 入参结构体
     * @return QueryCsnBpPriceResponse
     */
    public QueryCsnBpPriceResponse queryCsnBpPrice(QueryCsnBpPriceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, CONSTANT_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, QueryCsnBpPriceResponse.class);
    }

    /**
     * queryCsnDetail
     * 
     * @param request 入参结构体
     * @return QueryCsnDetailResponse
     */
    public QueryCsnDetailResponse queryCsnDetail(QueryCsnDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, request.getCsnId());
        return invokeHttpClient(internalRequest, QueryCsnDetailResponse.class);
    }

    /**
     * queryCsnInstance
     * 
     * @param request 入参结构体
     * @return QueryCsnInstanceResponse
     */
    public QueryCsnInstanceResponse queryCsnInstance(QueryCsnInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, request.getCsnId(), CONSTANT_INSTANCE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryCsnInstanceResponse.class);
    }

    /**
     * queryCsnList
     * 
     * @param request 入参结构体
     * @return QueryCsnListResponse
     */
    public QueryCsnListResponse queryCsnList(QueryCsnListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryCsnListResponse.class);
    }

    /**
     * queryRegionBandwidth
     * 
     * @param request 入参结构体
     * @return QueryRegionBandwidthResponse
     */
    public QueryRegionBandwidthResponse queryRegionBandwidth(QueryRegionBandwidthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId(), CONSTANT_LIMIT);
        return invokeHttpClient(internalRequest, QueryRegionBandwidthResponse.class);
    }

    /**
     * queryRegionBandwidthByCsn
     * 
     * @param request 入参结构体
     * @return QueryRegionBandwidthByCsnResponse
     */
    public QueryRegionBandwidthByCsnResponse queryRegionBandwidthByCsn(QueryRegionBandwidthByCsnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, request.getCsnId(), CONSTANT_BP, CONSTANT_LIMIT);
        return invokeHttpClient(internalRequest, QueryRegionBandwidthByCsnResponse.class);
    }

    /**
     * queryRouteRule
     * 
     * @param request 入参结构体
     * @return QueryRouteRuleResponse
     */
    public QueryRouteRuleResponse queryRouteRule(QueryRouteRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, CONSTANT_ROUTE_TABLE, request.getCsnRtId(), CONSTANT_RULE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryRouteRuleResponse.class);
    }

    /**
     * queryRouteTableList
     * 
     * @param request 入参结构体
     * @return QueryRouteTableListResponse
     */
    public QueryRouteTableListResponse queryRouteTableList(QueryRouteTableListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, request.getCsnId(), CONSTANT_ROUTE_TABLE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryRouteTableListResponse.class);
    }

    /**
     * queryStudyRelation
     * 
     * @param request 入参结构体
     * @return QueryStudyRelationResponse
     */
    public QueryStudyRelationResponse queryStudyRelation(QueryStudyRelationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, CONSTANT_ROUTE_TABLE, request.getCsnRtId(), CONSTANT_PROPAGATION);
        return invokeHttpClient(internalRequest, QueryStudyRelationResponse.class);
    }

    /**
     * queryTgwList
     * 
     * @param request 入参结构体
     * @return QueryTgwListResponse
     */
    public QueryTgwListResponse queryTgwList(QueryTgwListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, request.getCsnId(), CONSTANT_TGW);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryTgwListResponse.class);
    }

    /**
     * queryTgwRoute
     * 
     * @param request 入参结构体
     * @return QueryTgwRouteResponse
     */
    public QueryTgwRouteResponse queryTgwRoute(QueryTgwRouteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CSN, request.getCsnId(), CONSTANT_TGW, request.getTgwId(), CONSTANT_RULE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryTgwRouteResponse.class);
    }

    /**
     * resizeCsnBp
     * 
     * @param request 入参结构体
     */
    public void resizeCsnBp(ResizeCsnBpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId());
        internalRequest.addParameter("resize", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindCsnBp
     * 
     * @param request 入参结构体
     */
    public void unbindCsnBp(UnbindCsnBpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateCsn
     * 
     * @param request 入参结构体
     */
    public void updateCsn(UpdateCsnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, request.getCsnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateCsnBp
     * 
     * @param request 入参结构体
     */
    public void updateCsnBp(UpdateCsnBpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRegionBandwidth
     * 
     * @param request 入参结构体
     */
    public void updateRegionBandwidth(UpdateRegionBandwidthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, CONSTANT_BP, request.getCsnBpId(), CONSTANT_LIMIT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateTgw
     * 
     * @param request 入参结构体
     */
    public void updateTgw(UpdateTgwRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CSN, request.getCsnId(), CONSTANT_TGW, request.getTgwId());
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
