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

import com.baidubce.aigw.models.CreateRouteRequest;
import com.baidubce.aigw.models.CreateRouteResponse;
import com.baidubce.aigw.models.DeleteRouteRequest;
import com.baidubce.aigw.models.DeleteRouteResponse;
import com.baidubce.aigw.models.QueryRoutingDetailsRequest;
import com.baidubce.aigw.models.QueryRoutingDetailsResponse;
import com.baidubce.aigw.models.QueryRoutingListRequest;
import com.baidubce.aigw.models.QueryRoutingListResponse;
import com.baidubce.aigw.models.UpdateRouteRequest;
import com.baidubce.aigw.models.UpdateRouteResponse;

public class AigwClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_AIGW = "aigw";
    private static final String CONSTANT_ROUTE = "route";
    private static final String CONSTANT_DETAIL = "detail";
    private static final String CONSTANT_CLUSTER = "cluster";

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
     * createRoute
     * 
     * @param request 入参结构体
     * @return CreateRouteResponse
     */
    public CreateRouteResponse createRoute(CreateRouteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getClusterId(), CONSTANT_ROUTE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateRouteResponse.class);
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
        return invokeHttpClient(internalRequest, DeleteRouteResponse.class);
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
     * updateRoute
     * 
     * @param request 入参结构体
     * @return UpdateRouteResponse
     */
    public UpdateRouteResponse updateRoute(UpdateRouteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_AIGW, request.getInstanceId(), request.getRouteName(), CONSTANT_ROUTE, CONSTANT_DETAIL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateRouteResponse.class);
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
