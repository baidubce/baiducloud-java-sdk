package com.baidubce.privatezone;

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

import com.baidubce.privatezone.models.AddRecordRequest;
import com.baidubce.privatezone.models.AddRecordResponse;
import com.baidubce.privatezone.models.BindVpcRequest;
import com.baidubce.privatezone.models.CreatePrivateZoneRequest;
import com.baidubce.privatezone.models.CreatePrivateZoneResponse;
import com.baidubce.privatezone.models.DeletePrivateZoneRequest;
import com.baidubce.privatezone.models.DeleteRecordRequest;
import com.baidubce.privatezone.models.DisableRecordRequest;
import com.baidubce.privatezone.models.EnableRecordRequest;
import com.baidubce.privatezone.models.GetPrivateZoneRequest;
import com.baidubce.privatezone.models.GetPrivateZoneResponse;
import com.baidubce.privatezone.models.ListPrivateZoneRequest;
import com.baidubce.privatezone.models.ListPrivateZoneResponse;
import com.baidubce.privatezone.models.ListRecordRequest;
import com.baidubce.privatezone.models.ListRecordResponse;
import com.baidubce.privatezone.models.UnbindVpcRequest;
import com.baidubce.privatezone.models.UpdateRecordRequest;

public class PrivatezoneClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_PRIVATEZONE = "privatezone";
    private static final String CONSTANT_RECORD = "record";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public PrivatezoneClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public PrivatezoneClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addRecord
     * 
     * @param request 入参结构体
     * @return AddRecordResponse
     */
    public AddRecordResponse addRecord(AddRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId(), CONSTANT_RECORD);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AddRecordResponse.class);
    }

    /**
     * bindVpc
     * 
     * @param request 入参结构体
     */
    public void bindVpc(BindVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createPrivateZone
     * 
     * @param request 入参结构体
     * @return CreatePrivateZoneResponse
     */
    public CreatePrivateZoneResponse createPrivateZone(CreatePrivateZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PRIVATEZONE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreatePrivateZoneResponse.class);
    }

    /**
     * deletePrivateZone
     * 
     * @param request 入参结构体
     */
    public void deletePrivateZone(DeletePrivateZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRecord
     * 
     * @param request 入参结构体
     */
    public void deleteRecord(DeleteRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_PRIVATEZONE, CONSTANT_RECORD, request.getRecordId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disableRecord
     * 
     * @param request 入参结构体
     */
    public void disableRecord(DisableRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, CONSTANT_RECORD, request.getRecordId());
        internalRequest.addParameter("disable", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * enableRecord
     * 
     * @param request 入参结构体
     */
    public void enableRecord(EnableRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, CONSTANT_RECORD, request.getRecordId());
        internalRequest.addParameter("enable", null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getPrivateZone
     * 
     * @param request 入参结构体
     * @return GetPrivateZoneResponse
     */
    public GetPrivateZoneResponse getPrivateZone(GetPrivateZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        return invokeHttpClient(internalRequest, GetPrivateZoneResponse.class);
    }

    /**
     * listPrivateZone
     * 
     * @param request 入参结构体
     * @return ListPrivateZoneResponse
     */
    public ListPrivateZoneResponse listPrivateZone(ListPrivateZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PRIVATEZONE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListPrivateZoneResponse.class);
    }

    /**
     * listRecord
     * 
     * @param request 入参结构体
     * @return ListRecordResponse
     */
    public ListRecordResponse listRecord(ListRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId(), CONSTANT_RECORD);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getRr() != null) {
            internalRequest.addParameter("rr", request.getRr());
        }
        if (request.getSearchMode() != null) {
            internalRequest.addParameter("searchMode", request.getSearchMode());
        }
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        if (request.getValue() != null) {
            internalRequest.addParameter("value", request.getValue());
        }
        return invokeHttpClient(internalRequest, ListRecordResponse.class);
    }

    /**
     * unbindVpc
     * 
     * @param request 入参结构体
     */
    public void unbindVpc(UnbindVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        internalRequest.addParameter(request.getAction(), null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRecord
     * 
     * @param request 入参结构体
     */
    public void updateRecord(UpdateRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, CONSTANT_RECORD, request.getRecordId());
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
