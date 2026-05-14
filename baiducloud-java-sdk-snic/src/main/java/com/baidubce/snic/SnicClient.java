package com.baidubce.snic;

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

import com.baidubce.snic.models.CreateSnicRequest;
import com.baidubce.snic.models.CreateSnicResponse;
import com.baidubce.snic.models.DeleteSnicRequest;
import com.baidubce.snic.models.DescribeSnicRequest;
import com.baidubce.snic.models.DescribeSnicResponse;
import com.baidubce.snic.models.ListSnicRequest;
import com.baidubce.snic.models.ListSnicResponse;
import com.baidubce.snic.models.QueryAvailablePublicServicesResponse;
import com.baidubce.snic.models.UpdateSnicEsgRequest;
import com.baidubce.snic.models.UpdateSnicRequest;
import com.baidubce.snic.models.UpdateSnicSgRequest;

public class SnicClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_ENDPOINT = "endpoint";
    private static final String CONSTANT_PUBLIC_SERVICE = "publicService";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public SnicClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public SnicClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * createSnic
     * 
     * @param request 入参结构体
     * @return CreateSnicResponse
     */
    public CreateSnicResponse createSnic(CreateSnicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENDPOINT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSnicResponse.class);
    }

    /**
     * deleteSnic
     * 
     * @param request 入参结构体
     */
    public void deleteSnic(DeleteSnicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ENDPOINT, request.getEndpointId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * describeSnic
     * 
     * @param request 入参结构体
     * @return DescribeSnicResponse
     */
    public DescribeSnicResponse describeSnic(DescribeSnicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ENDPOINT, request.getEndpointId());
        return invokeHttpClient(internalRequest, DescribeSnicResponse.class);
    }

    /**
     * listSnic
     * 
     * @param request 入参结构体
     * @return ListSnicResponse
     */
    public ListSnicResponse listSnic(ListSnicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ENDPOINT);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getIpAddress() != null) {
            internalRequest.addParameter("ipAddress", request.getIpAddress());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getSubnetId() != null) {
            internalRequest.addParameter("subnetId", request.getSubnetId());
        }
        if (request.getService() != null) {
            internalRequest.addParameter("service", request.getService());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListSnicResponse.class);
    }

    /**
     * queryAvailablePublicServices
     * 
     * @return QueryAvailablePublicServicesResponse
     */
    public QueryAvailablePublicServicesResponse queryAvailablePublicServices() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_ENDPOINT, CONSTANT_PUBLIC_SERVICE);
        return invokeHttpClient(internalRequest, QueryAvailablePublicServicesResponse.class);
    }

    /**
     * updateSnic
     * 
     * @param request 入参结构体
     */
    public void updateSnic(UpdateSnicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENDPOINT, request.getEndpointId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSnicEsg
     * 
     * @param request 入参结构体
     */
    public void updateSnicEsg(UpdateSnicEsgRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENDPOINT, request.getEndpointId());
        internalRequest.addParameter("bindEsg", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSnicSg
     * 
     * @param request 入参结构体
     */
    public void updateSnicSg(UpdateSnicSgRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENDPOINT, request.getEndpointId());
        internalRequest.addParameter("bindSg", null);
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
