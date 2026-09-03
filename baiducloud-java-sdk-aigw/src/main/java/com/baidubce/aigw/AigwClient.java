package com.baidubce.aigw;

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

import com.baidubce.aigw.models.CreateAIGatewayRequest;
import com.baidubce.aigw.models.CreateAIGatewayResponse;
import com.baidubce.aigw.models.CreateConsumerRequest;
import com.baidubce.aigw.models.CreateConsumerResponse;
import com.baidubce.aigw.models.CreateRouteRequest;
import com.baidubce.aigw.models.CreateRouteResponse;
import com.baidubce.aigw.models.CreateServiceRequest;
import com.baidubce.aigw.models.CreateServiceResponse;
import com.baidubce.aigw.models.DeleteAIGatewayRequest;
import com.baidubce.aigw.models.DeleteAIGatewayResponse;
import com.baidubce.aigw.models.DeleteConsumerRequest;
import com.baidubce.aigw.models.DeleteConsumerResponse;
import com.baidubce.aigw.models.DeleteRouteRequest;
import com.baidubce.aigw.models.DeleteRouteResponse;
import com.baidubce.aigw.models.DeleteServiceRequest;
import com.baidubce.aigw.models.DeleteServiceResponse;
import com.baidubce.aigw.models.GetAIGatewayDetailRequest;
import com.baidubce.aigw.models.GetAIGatewayDetailResponse;
import com.baidubce.aigw.models.GetConsumerListRequest;
import com.baidubce.aigw.models.GetConsumerListResponse;
import com.baidubce.aigw.models.GetConsumerRequest;
import com.baidubce.aigw.models.GetConsumerResponse;
import com.baidubce.aigw.models.GetServiceDetailRequest;
import com.baidubce.aigw.models.GetServiceDetailResponse;
import com.baidubce.aigw.models.GetServiceListRequest;
import com.baidubce.aigw.models.GetServiceListResponse;
import com.baidubce.aigw.models.ListAIGatewaysRequest;
import com.baidubce.aigw.models.ListAIGatewaysResponse;
import com.baidubce.aigw.models.ListServicesBySourceRequest;
import com.baidubce.aigw.models.ListServicesBySourceResponse;
import com.baidubce.aigw.models.QueryRoutingDetailsRequest;
import com.baidubce.aigw.models.QueryRoutingDetailsResponse;
import com.baidubce.aigw.models.QueryRoutingListRequest;
import com.baidubce.aigw.models.QueryRoutingListResponse;
import com.baidubce.aigw.models.UpdateAIGatewayRequest;
import com.baidubce.aigw.models.UpdateAIGatewayResponse;
import com.baidubce.aigw.models.UpdateConsumerRequest;
import com.baidubce.aigw.models.UpdateConsumerResponse;
import com.baidubce.aigw.models.UpdateRouteRequest;
import com.baidubce.aigw.models.UpdateRouteResponse;
import com.baidubce.aigw.models.UpdateServiceRequest;
import com.baidubce.aigw.models.UpdateServiceResponse;

public class AigwClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_AIGATEWAY = "aigateway";
    private static final String CONSTANT_AIGW = "aigw";
    private static final String CONSTANT_SERVICE = "service";
    private static final String CONSTANT_ROUTE = "route";
    private static final String CONSTANT_DETAIL = "detail";
    private static final String CONSTANT_CLUSTER = "cluster";
    private static final String CONSTANT_CONSUMER = "consumer";
    private static final String CONSTANT_SERVICE_LIST = "serviceList";
    private static final String CONSTANT_CONSUMERS = "consumers";
    private static final String CONSTANT_LIST = "list";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public AigwClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public AigwClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * createAIGateway
     * 
     * @param request 入参结构体
     * @return CreateAIGatewayResponse
     */
    public CreateAIGatewayResponse createAIGateway(CreateAIGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_AIGATEWAY);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAIGatewayResponse.class);
    }

    /**
     * createConsumer
     * 
     * @param request 入参结构体
     * @return CreateConsumerResponse
     */
    public CreateConsumerResponse createConsumer(CreateConsumerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), CONSTANT_CONSUMER);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateConsumerResponse.class);
    }

    /**
     * createRoute
     * 
     * @param request 入参结构体
     * @return CreateRouteResponse
     */
    public CreateRouteResponse createRoute(CreateRouteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getClusterId(), CONSTANT_ROUTE);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateRouteResponse.class);
    }

    /**
     * createService
     * 
     * @param request 入参结构体
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_AIGW, CONSTANT_CLUSTER, request.getInstanceId(), CONSTANT_SERVICE_LIST);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateServiceResponse.class);
    }

    /**
     * deleteAIGateway
     * 
     * @param request 入参结构体
     * @return DeleteAIGatewayResponse
     */
    public DeleteAIGatewayResponse deleteAIGateway(DeleteAIGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_AIGATEWAY, request.getInstanceId());
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getForce() != null) {
            internalRequest.addParameter("force", String.valueOf(request.getForce()));
        }
        return invokeHttpClient(internalRequest, DeleteAIGatewayResponse.class);
    }

    /**
     * deleteConsumer
     * 
     * @param request 入参结构体
     * @return DeleteConsumerResponse
     */
    public DeleteConsumerResponse deleteConsumer(DeleteConsumerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), CONSTANT_CONSUMER, request.getConsumerId());
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getKeyType() != null) {
            internalRequest.addParameter("keyType", request.getKeyType());
        }
        return invokeHttpClient(internalRequest, DeleteConsumerResponse.class);
    }

    /**
     * deleteRoute
     * 
     * @param request 入参结构体
     * @return DeleteRouteResponse
     */
    public DeleteRouteResponse deleteRoute(DeleteRouteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getRouteName(), CONSTANT_ROUTE, CONSTANT_DETAIL);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        return invokeHttpClient(internalRequest, DeleteRouteResponse.class);
    }

    /**
     * deleteService
     * 
     * @param request 入参结构体
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        CONSTANT_V1,
                        CONSTANT_AIGW,
                        request.getInstanceId(),
                        request.getServiceName(),
                        request.getNamespace(),
                        CONSTANT_SERVICE);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        return invokeHttpClient(internalRequest, DeleteServiceResponse.class);
    }

    /**
     * getAIGatewayDetail
     * 
     * @param request 入参结构体
     * @return GetAIGatewayDetailResponse
     */
    public GetAIGatewayDetailResponse getAIGatewayDetail(GetAIGatewayDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGATEWAY, request.getInstanceId());
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getSrcProduct() != null) {
            internalRequest.addParameter("srcProduct", request.getSrcProduct());
        }
        return invokeHttpClient(internalRequest, GetAIGatewayDetailResponse.class);
    }

    /**
     * getConsumer
     * 
     * @param request 入参结构体
     * @return GetConsumerResponse
     */
    public GetConsumerResponse getConsumer(GetConsumerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), CONSTANT_CONSUMER, request.getConsumerId());
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getKeyType() != null) {
            internalRequest.addParameter("keyType", request.getKeyType());
        }
        return invokeHttpClient(internalRequest, GetConsumerResponse.class);
    }

    /**
     * getConsumerList
     * 
     * @param request 入参结构体
     * @return GetConsumerListResponse
     */
    public GetConsumerListResponse getConsumerList(GetConsumerListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), CONSTANT_CONSUMERS);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getTagKey() != null) {
            internalRequest.addParameter("tagKey", request.getTagKey());
        }
        if (request.getTagValue() != null) {
            internalRequest.addParameter("tagValue", request.getTagValue());
        }
        return invokeHttpClient(internalRequest, GetConsumerListResponse.class);
    }

    /**
     * getServiceDetail
     * 
     * @param request 入参结构体
     * @return GetServiceDetailResponse
     */
    public GetServiceDetailResponse getServiceDetail(GetServiceDetailRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getServiceName(), CONSTANT_SERVICE);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        return invokeHttpClient(internalRequest, GetServiceDetailResponse.class);
    }

    /**
     * getServiceList
     * 
     * @param request 入参结构体
     * @return GetServiceListResponse
     */
    public GetServiceListResponse getServiceList(GetServiceListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), CONSTANT_SERVICE);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getServiceSource() != null) {
            internalRequest.addParameter("serviceSource", request.getServiceSource());
        }
        return invokeHttpClient(internalRequest, GetServiceListResponse.class);
    }

    /**
     * listAIGateways
     * 
     * @param request 入参结构体
     * @return ListAIGatewaysResponse
     */
    public ListAIGatewaysResponse listAIGateways(ListAIGatewaysRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGATEWAY, CONSTANT_LIST);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getSrcProduct() != null) {
            internalRequest.addParameter("srcProduct", request.getSrcProduct());
        }
        if (request.getTagKey() != null) {
            internalRequest.addParameter("tagKey", request.getTagKey());
        }
        if (request.getTagValue() != null) {
            internalRequest.addParameter("tagValue", request.getTagValue());
        }
        if (request.getResourceGroupId() != null) {
            internalRequest.addParameter("resourceGroupId", request.getResourceGroupId());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, ListAIGatewaysResponse.class);
    }

    /**
     * listServicesBySource
     * 
     * @param request 入参结构体
     * @return ListServicesBySourceResponse
     */
    public ListServicesBySourceResponse listServicesBySource(ListServicesBySourceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), CONSTANT_SERVICE);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getServiceSource() != null) {
            internalRequest.addParameter("serviceSource", request.getServiceSource());
        }
        return invokeHttpClient(internalRequest, ListServicesBySourceResponse.class);
    }

    /**
     * queryRoutingDetails
     * 
     * @param request 入参结构体
     * @return QueryRoutingDetailsResponse
     */
    public QueryRoutingDetailsResponse queryRoutingDetails(QueryRoutingDetailsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getRouteName(), CONSTANT_ROUTE, CONSTANT_DETAIL);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        return invokeHttpClient(internalRequest, QueryRoutingDetailsResponse.class);
    }

    /**
     * queryRoutingList
     * 
     * @param request 入参结构体
     * @return QueryRoutingListResponse
     */
    public QueryRoutingListResponse queryRoutingList(QueryRoutingListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_AIGW, CONSTANT_CLUSTER, request.getInstanceId(), CONSTANT_ROUTE);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getRouteName() != null) {
            internalRequest.addParameter("routeName", request.getRouteName());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, QueryRoutingListResponse.class);
    }

    /**
     * updateAIGateway
     * 
     * @param request 入参结构体
     * @return UpdateAIGatewayResponse
     */
    public UpdateAIGatewayResponse updateAIGateway(UpdateAIGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_AIGATEWAY, request.getInstanceId());
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAIGatewayResponse.class);
    }

    /**
     * updateConsumer
     * 
     * @param request 入参结构体
     * @return UpdateConsumerResponse
     */
    public UpdateConsumerResponse updateConsumer(UpdateConsumerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), CONSTANT_CONSUMER, request.getConsumerId());
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        if (request.getKeyType() != null) {
            internalRequest.addParameter("keyType", request.getKeyType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateConsumerResponse.class);
    }

    /**
     * updateRoute
     * 
     * @param request 入参结构体
     * @return UpdateRouteResponse
     */
    public UpdateRouteResponse updateRoute(UpdateRouteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getRouteName(), CONSTANT_ROUTE, CONSTANT_DETAIL);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateRouteResponse.class);
    }

    /**
     * updateService
     * 
     * @param request 入参结构体
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getServiceNamePath(), CONSTANT_SERVICE);
        if (request.getXRegion() != null) {
            internalRequest.addHeader("X-Region", String.valueOf(request.getXRegion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateServiceResponse.class);
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
