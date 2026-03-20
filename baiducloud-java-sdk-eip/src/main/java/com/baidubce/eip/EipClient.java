package com.baidubce.eip;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.util.HttpUtils;
import java.net.URI;
import com.baidubce.util.JsonUtils;
import java.io.UnsupportedEncodingException;
import com.baidubce.BceClientException;
import com.baidubce.auth.SignOptions;
import com.baidubce.http.Headers;
import com.baidubce.internal.RestartableInputStream;
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.eip.models.AddTbspAreaBlockingRequest;
import com.baidubce.eip.models.AddTbspIpWhitelistRequest;
import com.baidubce.eip.models.AddTbspProtocolBlockingRequest;
import com.baidubce.eip.models.ApplyForEipRequest;
import com.baidubce.eip.models.ApplyForEipResponse;
import com.baidubce.eip.models.BandwidthPackageInquiryRequest;
import com.baidubce.eip.models.BandwidthPackageInquiryResponse;
import com.baidubce.eip.models.BindEipRequest;
import com.baidubce.eip.models.BindTbspProtectionObjectRequest;
import com.baidubce.eip.models.CancelEipTransferRequest;
import com.baidubce.eip.models.CreateEipTransferRequest;
import com.baidubce.eip.models.CreateEipTransferResponse;
import com.baidubce.eip.models.CreateTbspRequest;
import com.baidubce.eip.models.CreateTbspResponse;
import com.baidubce.eip.models.DetailTbspRequest;
import com.baidubce.eip.models.DetailTbspResponse;
import com.baidubce.eip.models.DirectEipRequest;
import com.baidubce.eip.models.DisableTbspIpCleanRequest;
import com.baidubce.eip.models.EipBandwidthScalingCapacityRequest;
import com.baidubce.eip.models.EipInquiryRequest;
import com.baidubce.eip.models.EipInquiryResponse;
import com.baidubce.eip.models.EipPostpaidToPrepaidRequest;
import com.baidubce.eip.models.EipRenewalRequest;
import com.baidubce.eip.models.EnableTbspIpCleanRequest;
import com.baidubce.eip.models.ListEipTransferRequest;
import com.baidubce.eip.models.ListEipTransferResponse;
import com.baidubce.eip.models.ListRecycleEipsRequest;
import com.baidubce.eip.models.ListRecycleEipsResponse;
import com.baidubce.eip.models.ListTbspAreaBlockingRequest;
import com.baidubce.eip.models.ListTbspAreaBlockingResponse;
import com.baidubce.eip.models.ListTbspIpCleanRequest;
import com.baidubce.eip.models.ListTbspIpCleanResponse;
import com.baidubce.eip.models.ListTbspIpWhitelistRequest;
import com.baidubce.eip.models.ListTbspIpWhitelistResponse;
import com.baidubce.eip.models.ListTbspProtocolBlockingRequest;
import com.baidubce.eip.models.ListTbspProtocolBlockingResponse;
import com.baidubce.eip.models.ListTbspRequest;
import com.baidubce.eip.models.ListTbspResponse;
import com.baidubce.eip.models.ModifyTbspIpCleanThresholdRequest;
import com.baidubce.eip.models.ModifyTbspIpProtectLevelRequest;
import com.baidubce.eip.models.OptionalReleaseEipRequest;
import com.baidubce.eip.models.QueryEipListRequest;
import com.baidubce.eip.models.QueryEipListResponse;
import com.baidubce.eip.models.ReceiveEipTransferRequest;
import com.baidubce.eip.models.RefundEipRequest;
import com.baidubce.eip.models.RejectEipTransferRequest;
import com.baidubce.eip.models.ReleaseEipFromRecycleRequest;
import com.baidubce.eip.models.ReleaseEipRequest;
import com.baidubce.eip.models.RemoveTbspAreaBlockingRequest;
import com.baidubce.eip.models.RemoveTbspIpWhitelistRequest;
import com.baidubce.eip.models.RemoveTbspProtocolBlockingRequest;
import com.baidubce.eip.models.RenewTbspRequest;
import com.baidubce.eip.models.ResizeTbspRequest;
import com.baidubce.eip.models.RestoreEipFromRecycleRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryResponse;
import com.baidubce.eip.models.SharedDataPackageInquiryRequest;
import com.baidubce.eip.models.SharedDataPackageInquiryResponse;
import com.baidubce.eip.models.StartEipAutoRenewRequest;
import com.baidubce.eip.models.StopEipAutoRenewRequest;
import com.baidubce.eip.models.UnDirectEipRequest;
import com.baidubce.eip.models.UnbindEipRequest;
import com.baidubce.eip.models.UnbindTbspProtectionObjectRequest;
import com.baidubce.eip.models.UpdateEipDeleteProtectRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class EipClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";

    private static final String CONSTANT_TBSP = "tbsp";

    private static final String CONSTANT_AREA_BLOCKING = "areaBlocking";

    private static final String CONSTANT_EIP = "eip";

    private static final String CONSTANT_PRICE = "price";

    private static final String CONSTANT_PROTOCOL_BLOCKING = "protocolBlocking";

    private static final String CONSTANT_EIPBP = "eipbp";

    private static final String CONSTANT_IP_PROTECT_LEVEL = "ipProtectLevel";

    private static final String CONSTANT_TRANSFER = "transfer";

    private static final String CONSTANT_IP_CLEAN = "ipClean";

    private static final String CONSTANT_RECYCLE = "recycle";

    private static final String CONSTANT_IP_WHITELIST = "ipWhitelist";

    private static final String CONSTANT_REFUND = "refund";

    private static final String CONSTANT_DELETE_PROTECT = "deleteProtect";

    private static final String CONSTANT_EIPTP = "eiptp";

    private static final String CONSTANT_EIPGROUP = "eipgroup";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public EipClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public EipClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addTbspAreaBlocking
     * 
     * @param request 入参结构体
     */
    public void addTbspAreaBlocking(AddTbspAreaBlockingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_AREA_BLOCKING);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addTbspIpWhitelist
     * 
     * @param request 入参结构体
     */
    public void addTbspIpWhitelist(AddTbspIpWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_WHITELIST);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addTbspProtocolBlocking
     * 
     * @param request 入参结构体
     */
    public void addTbspProtocolBlocking(AddTbspProtocolBlockingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_PROTOCOL_BLOCKING);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * applyForEip
     * 
     * @param request 入参结构体
     * @return ApplyForEipResponse
     */
    public ApplyForEipResponse applyForEip(ApplyForEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_EIP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, ApplyForEipResponse.class);
    }

    /**
     * bandwidthPackageInquiry
     * 
     * @param request 入参结构体
     * @return BandwidthPackageInquiryResponse
     */
    public BandwidthPackageInquiryResponse bandwidthPackageInquiry(BandwidthPackageInquiryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_EIPBP, CONSTANT_PRICE);
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, BandwidthPackageInquiryResponse.class);
    }

    /**
     * bindEip
     * 
     * @param request 入参结构体
     */
    public void bindEip(BindEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindTbspProtectionObject
     * 
     * @param request 入参结构体
     */
    public void bindTbspProtectionObject(BindTbspProtectionObjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * cancelEipTransfer
     * 
     * @param request 入参结构体
     */
    public void cancelEipTransfer(CancelEipTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TRANSFER);
        internalRequest.addParameter("cancel", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createEipTransfer
     * 
     * @param request 入参结构体
     * @return CreateEipTransferResponse
     */
    public CreateEipTransferResponse createEipTransfer(CreateEipTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_TRANSFER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateEipTransferResponse.class);
    }

    /**
     * createTbsp
     * 
     * @param request 入参结构体
     * @return CreateTbspResponse
     */
    public CreateTbspResponse createTbsp(CreateTbspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_TBSP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateTbspResponse.class);
    }

    /**
     * detailTbsp
     * 
     * @param request 入参结构体
     * @return DetailTbspResponse
     */
    public DetailTbspResponse detailTbsp(DetailTbspRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TBSP, request.getId());
        return invokeHttpClient(internalRequest, DetailTbspResponse.class);
    }

    /**
     * directEip
     * 
     * @param request 入参结构体
     */
    public void directEip(DirectEipRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("direct", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disableTbspIpClean
     * 
     * @param request 入参结构体
     */
    public void disableTbspIpClean(DisableTbspIpCleanRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_CLEAN);
        internalRequest.addParameter("turnOffClean", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * eipBandwidthScalingCapacity
     * 
     * @param request 入参结构体
     */
    public void eipBandwidthScalingCapacity(EipBandwidthScalingCapacityRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("resize", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * eipInquiry
     * 
     * @param request 入参结构体
     * @return EipInquiryResponse
     */
    public EipInquiryResponse eipInquiry(EipInquiryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_EIP, CONSTANT_PRICE);
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, EipInquiryResponse.class);
    }

    /**
     * eipPostpaidToPrepaid
     * 
     * @param request 入参结构体
     */
    public void eipPostpaidToPrepaid(EipPostpaidToPrepaidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("action", "TO_PREPAY");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * eipRenewal
     * 
     * @param request 入参结构体
     */
    public void eipRenewal(EipRenewalRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * enableTbspIpClean
     * 
     * @param request 入参结构体
     */
    public void enableTbspIpClean(EnableTbspIpCleanRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_CLEAN);
        internalRequest.addParameter("turnOnClean", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * listEipTransfer
     * 
     * @param request 入参结构体
     * @return ListEipTransferResponse
     */
    public ListEipTransferResponse listEipTransfer(ListEipTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TRANSFER);
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getDirection() != null) {
            internalRequest.addParameter("direction", request.getDirection());
        }
        if (request.getTransferId() != null) {
            internalRequest.addParameter("transferId", request.getTransferId());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getFuzzyTransferId() != null) {
            internalRequest.addParameter("fuzzyTransferId", request.getFuzzyTransferId());
        }
        if (request.getFuzzyInstanceId() != null) {
            internalRequest.addParameter("fuzzyInstanceId", request.getFuzzyInstanceId());
        }
        if (request.getFuzzyInstanceName() != null) {
            internalRequest.addParameter("fuzzyInstanceName", request.getFuzzyInstanceName());
        }
        if (request.getFuzzyInstanceIp() != null) {
            internalRequest.addParameter("fuzzyInstanceIp", request.getFuzzyInstanceIp());
        }
        return invokeHttpClient(internalRequest, ListEipTransferResponse.class);
    }

    /**
     * listRecycleEips
     * 
     * @param request 入参结构体
     * @return ListRecycleEipsResponse
     */
    public ListRecycleEipsResponse listRecycleEips(ListRecycleEipsRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_EIP, CONSTANT_RECYCLE);
        if (request.getEip() != null) {
            internalRequest.addParameter("eip", request.getEip());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListRecycleEipsResponse.class);
    }

    /**
     * listTbsp
     * 
     * @param request 入参结构体
     * @return ListTbspResponse
     */
    public ListTbspResponse listTbsp(ListTbspRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TBSP);
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListTbspResponse.class);
    }

    /**
     * listTbspAreaBlocking
     * 
     * @param request 入参结构体
     * @return ListTbspAreaBlockingResponse
     */
    public ListTbspAreaBlockingResponse listTbspAreaBlocking(ListTbspAreaBlockingRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_AREA_BLOCKING);
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        return invokeHttpClient(internalRequest, ListTbspAreaBlockingResponse.class);
    }

    /**
     * listTbspIpClean
     * 
     * @param request 入参结构体
     * @return ListTbspIpCleanResponse
     */
    public ListTbspIpCleanResponse listTbspIpClean(ListTbspIpCleanRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_CLEAN);
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListTbspIpCleanResponse.class);
    }

    /**
     * listTbspIpWhitelist
     * 
     * @param request 入参结构体
     * @return ListTbspIpWhitelistResponse
     */
    public ListTbspIpWhitelistResponse listTbspIpWhitelist(ListTbspIpWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_WHITELIST);
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        if (request.getIpCidr() != null) {
            internalRequest.addParameter("ipCidr", request.getIpCidr());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListTbspIpWhitelistResponse.class);
    }

    /**
     * listTbspProtocolBlocking
     * 
     * @param request 入参结构体
     * @return ListTbspProtocolBlockingResponse
     */
    public ListTbspProtocolBlockingResponse listTbspProtocolBlocking(ListTbspProtocolBlockingRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_PROTOCOL_BLOCKING);
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        return invokeHttpClient(internalRequest, ListTbspProtocolBlockingResponse.class);
    }

    /**
     * modifyTbspIpCleanThreshold
     * 
     * @param request 入参结构体
     */
    public void modifyTbspIpCleanThreshold(ModifyTbspIpCleanThresholdRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_CLEAN);
        internalRequest.addParameter("modifyThreshold", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyTbspIpProtectLevel
     * 
     * @param request 入参结构体
     */
    public void modifyTbspIpProtectLevel(ModifyTbspIpProtectLevelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_PROTECT_LEVEL);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * optionalReleaseEip
     * 
     * @param request 入参结构体
     */
    public void optionalReleaseEip(OptionalReleaseEipRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_EIP, request.getEip());
        if (request.getReleaseToRecycle() != null) {
            internalRequest.addParameter("releaseToRecycle", String.valueOf(request.getReleaseToRecycle()));
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryEipList
     * 
     * @param request 入参结构体
     * @return QueryEipListResponse
     */
    public QueryEipListResponse queryEipList(QueryEipListRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_EIP);
        if (request.getIpVersion() != null) {
            internalRequest.addParameter("ipVersion", request.getIpVersion());
        }
        if (request.getEip() != null) {
            internalRequest.addParameter("eip", request.getEip());
        }
        if (request.getInstanceType() != null) {
            internalRequest.addParameter("instanceType", request.getInstanceType());
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getEipIds() != null && !request.getEipIds().isEmpty()) {
            internalRequest.addParameter("eipIds", String.join(",", request.getEipIds()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryEipListResponse.class);
    }

    /**
     * receiveEipTransfer
     * 
     * @param request 入参结构体
     */
    public void receiveEipTransfer(ReceiveEipTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TRANSFER);
        internalRequest.addParameter("accept", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * refundEip
     * 
     * @param request 入参结构体
     */
    public void refundEip(RefundEipRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, CONSTANT_REFUND, request.getEip());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * rejectEipTransfer
     * 
     * @param request 入参结构体
     */
    public void rejectEipTransfer(RejectEipTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TRANSFER);
        internalRequest.addParameter("reject", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseEip
     * 
     * @param request 入参结构体
     */
    public void releaseEip(ReleaseEipRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_EIP, request.getEip());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getReleaseToRecycle() != null) {
            internalRequest.addParameter("releaseToRecycle", String.valueOf(request.getReleaseToRecycle()));
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseEipFromRecycle
     * 
     * @param request 入参结构体
     */
    public void releaseEipFromRecycle(ReleaseEipFromRecycleRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_EIP, CONSTANT_RECYCLE, request.getEip());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeTbspAreaBlocking
     * 
     * @param request 入参结构体
     */
    public void removeTbspAreaBlocking(RemoveTbspAreaBlockingRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_AREA_BLOCKING);
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        if (request.getBlockType() != null) {
            internalRequest.addParameter("blockType", request.getBlockType());
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeTbspIpWhitelist
     * 
     * @param request 入参结构体
     */
    public void removeTbspIpWhitelist(RemoveTbspIpWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_WHITELIST);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        if (request.getWhitelistId() != null) {
            internalRequest.addParameter("whitelistId", request.getWhitelistId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeTbspProtocolBlocking
     * 
     * @param request 入参结构体
     */
    public void removeTbspProtocolBlocking(RemoveTbspProtocolBlockingRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_PROTOCOL_BLOCKING);
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renewTbsp
     * 
     * @param request 入参结构体
     */
    public void renewTbsp(RenewTbspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resizeTbsp
     * 
     * @param request 入参结构体
     */
    public void resizeTbsp(ResizeTbspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId());
        internalRequest.addParameter("resize", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * restoreEipFromRecycle
     * 
     * @param request 入参结构体
     */
    public void restoreEipFromRecycle(RestoreEipFromRecycleRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, CONSTANT_RECYCLE, request.getEip());
        internalRequest.addParameter("restore", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * sharedBandwidthInquiry
     * 
     * @param request 入参结构体
     * @return SharedBandwidthInquiryResponse
     */
    public SharedBandwidthInquiryResponse sharedBandwidthInquiry(SharedBandwidthInquiryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_EIPGROUP, CONSTANT_PRICE);
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, SharedBandwidthInquiryResponse.class);
    }

    /**
     * sharedDataPackageInquiry
     * 
     * @param request 入参结构体
     * @return SharedDataPackageInquiryResponse
     */
    public SharedDataPackageInquiryResponse sharedDataPackageInquiry(SharedDataPackageInquiryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_EIPTP, CONSTANT_PRICE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, SharedDataPackageInquiryResponse.class);
    }

    /**
     * startEipAutoRenew
     * 
     * @param request 入参结构体
     */
    public void startEipAutoRenew(StartEipAutoRenewRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("startAutoRenew", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * stopEipAutoRenew
     * 
     * @param request 入参结构体
     */
    public void stopEipAutoRenew(StopEipAutoRenewRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("stopAutoRenew", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unDirectEip
     * 
     * @param request 入参结构体
     */
    public void unDirectEip(UnDirectEipRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("unDirect", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindEip
     * 
     * @param request 入参结构体
     */
    public void unbindEip(UnbindEipRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindTbspProtectionObject
     * 
     * @param request 入参结构体
     */
    public void unbindTbspProtectionObject(UnbindTbspProtectionObjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateEipDeleteProtect
     * 
     * @param request 入参结构体
     */
    public void updateEipDeleteProtect(UpdateEipDeleteProtectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip(), CONSTANT_DELETE_PROTECT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
    * Creates and initializes a new request object for the specified resource.
    *
    * @param bceRequest The original BCE request created by the user.
    * @param httpMethod The HTTP method to use when sending the request.
    * @param pathVariables The optional variables used in the URI path.
    * @return A new request object populated with endpoint, resource path and specific
    *         parameters to send.
    */
    private InternalRequest createRequest(AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
        List<String> path = new ArrayList<String>();
        if (pathVariables != null) {
            for (String pathVariable : pathVariables) {
                path.add(pathVariable);
            }
        }
        URI uri = HttpUtils.appendUri(this.getEndpoint(), path.toArray(new String[path.size()]));
        InternalRequest request = new InternalRequest(httpMethod, uri);
        SignOptions signOptions = new SignOptions();
        signOptions.setHeadersToSign(new HashSet<String>(Arrays.asList(HEADERS_TO_SIGN)));
        request.setSignOptions(signOptions);
        request.setCredentials(bceRequest.getRequestCredentials());
        return request;
    }

    /**
    * the method to fill the internalRequest's content field with bceRequest
    * only support HttpMethodName.POST or HttpMethodName.PUT
    *
    * @param internalRequest A request object, populated with endpoint, resource path, ready for callers to populate
    * any additional headers or parameters, and execute.
    * @param bceRequest The original request, as created by the user.
    */
    protected void fillPayload(InternalRequest internalRequest, AbstractBceRequest bceRequest) {
        if (internalRequest.getHttpMethod() == HttpMethodName.POST || internalRequest.getHttpMethod() == HttpMethodName.PUT) {
            String strJson = JsonUtils.toJsonString(bceRequest);
            byte[] requestJson = null;
            try {
                requestJson = strJson.getBytes(DEFAULT_ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new BceClientException("Unsupported encode.", e);
            }
            internalRequest.addHeader(Headers.CONTENT_LENGTH, String.valueOf(requestJson.length));
            internalRequest.addHeader(Headers.CONTENT_TYPE, DEFAULT_CONTENT_TYPE);
            internalRequest.setContent(RestartableInputStream.wrap(requestJson));
        }
    }
}
