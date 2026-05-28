package com.baidubce.dns;

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

import com.baidubce.dns.models.AddLineGroupRequest;
import com.baidubce.dns.models.CreatePaidZoneRequest;
import com.baidubce.dns.models.CreateRecordRequest;
import com.baidubce.dns.models.CreateZoneRequest;
import com.baidubce.dns.models.DeleteLineGroupRequest;
import com.baidubce.dns.models.DeleteRecordRequest;
import com.baidubce.dns.models.DeleteZoneRequest;
import com.baidubce.dns.models.ListLineGroupRequest;
import com.baidubce.dns.models.ListLineGroupResponse;
import com.baidubce.dns.models.ListRecordRequest;
import com.baidubce.dns.models.ListRecordResponse;
import com.baidubce.dns.models.ListZoneRequest;
import com.baidubce.dns.models.ListZoneResponse;
import com.baidubce.dns.models.RenewZoneRequest;
import com.baidubce.dns.models.UpdateLineGroupRequest;
import com.baidubce.dns.models.UpdateRecordDisableRequest;
import com.baidubce.dns.models.UpdateRecordEnableRequest;
import com.baidubce.dns.models.UpdateRecordRequest;
import com.baidubce.dns.models.UpgradeZoneRequest;

public class DnsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_DNS = "dns";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_ORDER = "order";
    private static final String CONSTANT_CUSTOMLINE = "customline";
    private static final String CONSTANT_RECORD = "record";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public DnsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public DnsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addLineGroup
     * 
     * @param request 入参结构体
     */
    public void addLineGroup(AddLineGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DNS, CONSTANT_CUSTOMLINE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createPaidZone
     * 
     * @param request 入参结构体
     */
    public void createPaidZone(CreatePaidZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, CONSTANT_ORDER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createRecord
     * 
     * @param request 入参结构体
     */
    public void createRecord(CreateRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createZone
     * 
     * @param request 入参结构体
     */
    public void createZone(CreateZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteLineGroup
     * 
     * @param request 入参结构体
     */
    public void deleteLineGroup(DeleteLineGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_DNS, CONSTANT_CUSTOMLINE, request.getLineId());
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
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD, request.getRecordId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteZone
     * 
     * @param request 入参结构体
     */
    public void deleteZone(DeleteZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * listLineGroup
     * 
     * @param request 入参结构体
     * @return ListLineGroupResponse
     */
    public ListLineGroupResponse listLineGroup(ListLineGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DNS, CONSTANT_CUSTOMLINE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListLineGroupResponse.class);
    }

    /**
     * listRecord
     * 
     * @param request 入参结构体
     * @return ListRecordResponse
     */
    public ListRecordResponse listRecord(ListRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD);
        if (request.getRr() != null) {
            internalRequest.addParameter("rr", request.getRr());
        }
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListRecordResponse.class);
    }

    /**
     * listZone
     * 
     * @param request 入参结构体
     * @return ListZoneResponse
     */
    public ListZoneResponse listZone(ListZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE);
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListZoneResponse.class);
    }

    /**
     * renewZone
     * 
     * @param request 入参结构体
     */
    public void renewZone(RenewZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, CONSTANT_ORDER, request.getName());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateLineGroup
     * 
     * @param request 入参结构体
     */
    public void updateLineGroup(UpdateLineGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_CUSTOMLINE, String.valueOf(request.getLineId()));
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
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD, request.getRecordId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRecordDisable
     * 
     * @param request 入参结构体
     */
    public void updateRecordDisable(UpdateRecordDisableRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD, request.getRecordId());
        internalRequest.addParameter("disable", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRecordEnable
     * 
     * @param request 入参结构体
     */
    public void updateRecordEnable(UpdateRecordEnableRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD, request.getRecordId());
        internalRequest.addParameter("enable", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * upgradeZone
     * 
     * @param request 入参结构体
     */
    public void upgradeZone(UpgradeZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, CONSTANT_ORDER);
        internalRequest.addParameter("upgradeToDiscount", null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
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
