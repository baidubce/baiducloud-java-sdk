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

import com.baidubce.dns.models.AddDomainNameRequest;
import com.baidubce.dns.models.AddLineGroupRequest;
import com.baidubce.dns.models.AddParsingRecordsRequest;
import com.baidubce.dns.models.DeleteLineGroupRequest;
import com.baidubce.dns.models.DeleteParsingRecordsRequest;
import com.baidubce.dns.models.DomainNameRenewalRequest;
import com.baidubce.dns.models.ModifyParsingRecordsRequest;
import com.baidubce.dns.models.ModifyTheParsingRecordStatusRequest;
import com.baidubce.dns.models.PurchaseAPaidDomainNameRequest;
import com.baidubce.dns.models.QueryAndParseRecordListRequest;
import com.baidubce.dns.models.QueryAndParseRecordListResponse;
import com.baidubce.dns.models.QueryDomainNameListRequest;
import com.baidubce.dns.models.QueryDomainNameListResponse;
import com.baidubce.dns.models.QueryTheListOfLineGroupsRequest;
import com.baidubce.dns.models.QueryTheListOfLineGroupsResponse;
import com.baidubce.dns.models.RemoveDomainNameRequest;
import com.baidubce.dns.models.UpdateLineGroupRequest;
import com.baidubce.dns.models.UpgradeTheFreeDomainNameToTheUniversalVersionRequest;

public class DnsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_DNS = "dns";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_RECORD = "record";
    private static final String CONSTANT_CUSTOMLINE = "customline";
    private static final String CONSTANT_ORDER = "order";

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
     * addDomainName
     * 
     * @param request 入参结构体
     */
    public void addDomainName(AddDomainNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
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
     * addParsingRecords
     * 
     * @param request 入参结构体
     */
    public void addParsingRecords(AddParsingRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD);
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
     * deleteParsingRecords
     * 
     * @param request 入参结构体
     */
    public void deleteParsingRecords(DeleteParsingRecordsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD, request.getRecordId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * domainNameRenewal
     * 
     * @param request 入参结构体
     */
    public void domainNameRenewal(DomainNameRenewalRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, CONSTANT_ORDER, request.getName());
        internalRequest.addParameter(request.getAction(), null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyParsingRecords
     * 
     * @param request 入参结构体
     */
    public void modifyParsingRecords(ModifyParsingRecordsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD, request.getRecordId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyTheParsingRecordStatus
     * 
     * @param request 入参结构体
     */
    public void modifyTheParsingRecordStatus(ModifyTheParsingRecordStatusRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName(), CONSTANT_RECORD, request.getRecordId());
        internalRequest.addParameter(request.getAction(), null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * purchaseAPaidDomainName
     * 
     * @param request 入参结构体
     */
    public void purchaseAPaidDomainName(PurchaseAPaidDomainNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, CONSTANT_ORDER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryAndParseRecordList
     * 
     * @param request 入参结构体
     * @return QueryAndParseRecordListResponse
     */
    public QueryAndParseRecordListResponse queryAndParseRecordList(QueryAndParseRecordListRequest request) {
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
        return invokeHttpClient(internalRequest, QueryAndParseRecordListResponse.class);
    }

    /**
     * queryDomainNameList
     * 
     * @param request 入参结构体
     * @return QueryDomainNameListResponse
     */
    public QueryDomainNameListResponse queryDomainNameList(QueryDomainNameListRequest request) {
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
        return invokeHttpClient(internalRequest, QueryDomainNameListResponse.class);
    }

    /**
     * queryTheListOfLineGroups
     * 
     * @param request 入参结构体
     * @return QueryTheListOfLineGroupsResponse
     */
    public QueryTheListOfLineGroupsResponse queryTheListOfLineGroups(QueryTheListOfLineGroupsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DNS, CONSTANT_CUSTOMLINE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryTheListOfLineGroupsResponse.class);
    }

    /**
     * removeDomainName
     * 
     * @param request 入参结构体
     */
    public void removeDomainName(RemoveDomainNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, request.getZoneName());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateLineGroup
     * 
     * @param request 入参结构体
     */
    public void updateLineGroup(UpdateLineGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_CUSTOMLINE, request.getLineId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * upgradeTheFreeDomainNameToTheUniversalVersion
     * 
     * @param request 入参结构体
     */
    public void upgradeTheFreeDomainNameToTheUniversalVersion(UpgradeTheFreeDomainNameToTheUniversalVersionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_DNS, CONSTANT_ZONE, CONSTANT_ORDER);
        internalRequest.addParameter(request.getAction(), null);
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
