package com.baidubce.eip;

import com.baidubce.AbstractBceClient;
import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.SignOptions;
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;
import com.baidubce.eip.models.ActivateEipAutomaticRenewalRequest;
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
import com.baidubce.eip.models.CloseEipDirectAccessRequest;
import com.baidubce.eip.models.CreateEipTransferRequest;
import com.baidubce.eip.models.CreateTbspRequest;
import com.baidubce.eip.models.CreateTbspResponse;
import com.baidubce.eip.models.DetailTbspRequest;
import com.baidubce.eip.models.DetailTbspResponse;
import com.baidubce.eip.models.DisableTbspIpCleanRequest;
import com.baidubce.eip.models.EipBandwidthScalingCapacityRequest;
import com.baidubce.eip.models.EipInquiryRequest;
import com.baidubce.eip.models.EipInquiryResponse;
import com.baidubce.eip.models.EipPostpaidToPrepaidRequest;
import com.baidubce.eip.models.EipRenewalRequest;
import com.baidubce.eip.models.EnableEipDirectAccessRequest;
import com.baidubce.eip.models.EnableTbspIpCleanRequest;
import com.baidubce.eip.models.ListEipTransferRequest;
import com.baidubce.eip.models.ListEipTransferResponse;
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
import com.baidubce.eip.models.PrepaidEipUnsubscribeRequest;
import com.baidubce.eip.models.QueryEipListRequest;
import com.baidubce.eip.models.QueryEipListResponse;
import com.baidubce.eip.models.QueryTheListOfEipsInTheRecyclingBinRequest;
import com.baidubce.eip.models.QueryTheListOfEipsInTheRecyclingBinResponse;
import com.baidubce.eip.models.ReceiveEipTransferRequest;
import com.baidubce.eip.models.RejectEipTransferRequest;
import com.baidubce.eip.models.ReleaseEipRequest;
import com.baidubce.eip.models.ReleaseTheEipFromTheRecyclingBinRequest;
import com.baidubce.eip.models.RemoveTbspAreaBlockingRequest;
import com.baidubce.eip.models.RemoveTbspIpWhitelistRequest;
import com.baidubce.eip.models.RemoveTbspProtocolBlockingRequest;
import com.baidubce.eip.models.RenewTbspRequest;
import com.baidubce.eip.models.ResizeTbspRequest;
import com.baidubce.eip.models.RestoreEipInRecycleBinRequest;
import com.baidubce.eip.models.SelectiveReleaseOfEipRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryResponse;
import com.baidubce.eip.models.SharedDataPackageInquiryRequest;
import com.baidubce.eip.models.SharedDataPackageInquiryResponse;
import com.baidubce.eip.models.TurnOffEipAutomaticRenewalRequest;
import com.baidubce.eip.models.UnbindEipRequest;
import com.baidubce.eip.models.UnbindTbspProtectionObjectRequest;
import com.baidubce.eip.models.UpdateEipReleaseProtectionSwitchRequest;
import com.baidubce.http.Headers;
import com.baidubce.http.HttpMethodName;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.internal.InternalRequest;
import com.baidubce.internal.RestartableInputStream;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.util.HttpUtils;
import com.baidubce.util.JsonUtils;
import com.google.common.base.Strings;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import static com.baidubce.util.Validate.checkNotNull;


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

    private static final String CONSTANT_RECYCLE = "recycle";

    private static final String CONSTANT_TRANSFER = "transfer";

    private static final String CONSTANT_IP_CLEAN = "ipClean";

    private static final String CONSTANT_IP_WHITELIST = "ipWhitelist";

    private static final String CONSTANT_REFUND = "refund";

    private static final String CONSTANT_EIPTP = "eiptp";

    private static final String CONSTANT_DELETE_PROTECT = "deleteProtect";

    private static final String CONSTANT_EIPGROUP = "eipgroup";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static HttpResponseHandler[] EipClientHandlers = new HttpResponseHandler[] {
        new BceMetadataResponseHandler(),
        new BceErrorResponseHandler(),
        new BceJsonResponseHandler()
    };

    public EipClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public EipClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, EipClientHandlers);
    }

  /**
   * activateEipAutomaticRenewal
   * 
   * @param request 入参结构体
   */
  public void activateEipAutomaticRenewal(ActivateEipAutomaticRenewalRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling activateEipAutomaticRenewal");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
    internalRequest.addParameter("startAutoRenew", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * addTbspAreaBlocking
   * 
   * @param request 入参结构体
   */
  public void addTbspAreaBlocking(AddTbspAreaBlockingRequest request) {
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling addTbspAreaBlocking");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling addTbspIpWhitelist");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling addTbspProtocolBlocking");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'bandwidthInMbps' is set
    checkNotNull(request.getBandwidthInMbps(), "Missing the required parameter 'bandwidthInMbps' when calling applyForEip");
    // verify the required parameter 'billing' is set
    checkNotNull(request.getBilling(), "Missing the required parameter 'billing' when calling applyForEip");
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
    // verify the required parameter 'bandwidthInMbps' is set
    checkNotNull(request.getBandwidthInMbps(), "Missing the required parameter 'bandwidthInMbps' when calling bandwidthPackageInquiry");
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
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling bindEip");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'instanceType' is set
    checkNotNull(request.getInstanceType(), "Missing the required parameter 'instanceType' when calling bindEip");
    // verify the required parameter 'instanceId' is set
    checkNotNull(request.getInstanceId(), "Missing the required parameter 'instanceId' when calling bindEip");
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling bindTbspProtectionObject");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'ipList' is set
    checkNotNull(request.getIpList(), "Missing the required parameter 'ipList' when calling bindTbspProtectionObject");
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
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'transferIdList' is set
    checkNotNull(request.getTransferIdList(), "Missing the required parameter 'transferIdList' when calling cancelEipTransfer");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TRANSFER);
    internalRequest.addParameter("cancel", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * closeEipDirectAccess
   * 
   * @param request 入参结构体
   */
  public void closeEipDirectAccess(CloseEipDirectAccessRequest request) {
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling closeEipDirectAccess");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
    internalRequest.addParameter("unDirect", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * createEipTransfer
   * 
   * @param request 入参结构体
   */
  public void createEipTransfer(CreateEipTransferRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'transferType' is set
    checkNotNull(request.getTransferType(), "Missing the required parameter 'transferType' when calling createEipTransfer");
    // verify the required parameter 'transferResourceList' is set
    checkNotNull(request.getTransferResourceList(), "Missing the required parameter 'transferResourceList' when calling createEipTransfer");
    // verify the required parameter 'toUserId' is set
    checkNotNull(request.getToUserId(), "Missing the required parameter 'toUserId' when calling createEipTransfer");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_TRANSFER);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * createTbsp
   * 
   * @param request 入参结构体
   * @return CreateTbspResponse
   */
  public CreateTbspResponse createTbsp(CreateTbspRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'name' is set
    checkNotNull(request.getName(), "Missing the required parameter 'name' when calling createTbsp");
    // verify the required parameter 'lineType' is set
    checkNotNull(request.getLineType(), "Missing the required parameter 'lineType' when calling createTbsp");
    // verify the required parameter 'ipCapacity' is set
    checkNotNull(request.getIpCapacity(), "Missing the required parameter 'ipCapacity' when calling createTbsp");
    // verify the required parameter 'reservationLength' is set
    checkNotNull(request.getReservationLength(), "Missing the required parameter 'reservationLength' when calling createTbsp");
    // verify the required parameter 'reservationTimeUnit' is set
    checkNotNull(request.getReservationTimeUnit(), "Missing the required parameter 'reservationTimeUnit' when calling createTbsp");
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling detailTbsp");
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_TBSP, request.getId());
    return invokeHttpClient(internalRequest, DetailTbspResponse.class);
  }

  /**
   * disableTbspIpClean
   * 
   * @param request 入参结构体
   */
  public void disableTbspIpClean(DisableTbspIpCleanRequest request) {
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling disableTbspIpClean");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling eipBandwidthScalingCapacity");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'newBandwidthInMbps' is set
    checkNotNull(request.getNewBandwidthInMbps(), "Missing the required parameter 'newBandwidthInMbps' when calling eipBandwidthScalingCapacity");
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
    // verify the required parameter 'bandwidthInMbps' is set
    checkNotNull(request.getBandwidthInMbps(), "Missing the required parameter 'bandwidthInMbps' when calling eipInquiry");
    // verify the required parameter 'billing' is set
    checkNotNull(request.getBilling(), "Missing the required parameter 'billing' when calling eipInquiry");
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
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling eipPostpaidToPrepaid");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'purchaseLength' is set
    checkNotNull(request.getPurchaseLength(), "Missing the required parameter 'purchaseLength' when calling eipPostpaidToPrepaid");
    // verify the required parameter 'bandWidth' is set
    checkNotNull(request.getBandWidth(), "Missing the required parameter 'bandWidth' when calling eipPostpaidToPrepaid");
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
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling eipRenewal");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'billing' is set
    checkNotNull(request.getBilling(), "Missing the required parameter 'billing' when calling eipRenewal");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
    internalRequest.addParameter("purchaseReserved", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * enableEipDirectAccess
   * 
   * @param request 入参结构体
   */
  public void enableEipDirectAccess(EnableEipDirectAccessRequest request) {
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling enableEipDirectAccess");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
    internalRequest.addParameter("direct", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * enableTbspIpClean
   * 
   * @param request 入参结构体
   */
  public void enableTbspIpClean(EnableTbspIpCleanRequest request) {
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling enableTbspIpClean");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling listTbspAreaBlocking");
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling listTbspIpClean");
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling listTbspIpWhitelist");
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling listTbspProtocolBlocking");
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling modifyTbspIpCleanThreshold");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling modifyTbspIpProtectLevel");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId(), CONSTANT_IP_PROTECT_LEVEL);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * prepaidEipUnsubscribe
   * 
   * @param request 入参结构体
   */
  public void prepaidEipUnsubscribe(PrepaidEipUnsubscribeRequest request) {
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling prepaidEipUnsubscribe");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, CONSTANT_REFUND, request.getEip());
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
   * queryTheListOfEipsInTheRecyclingBin
   * 
   * @param request 入参结构体
   * @return QueryTheListOfEipsInTheRecyclingBinResponse
   */
  public QueryTheListOfEipsInTheRecyclingBinResponse queryTheListOfEipsInTheRecyclingBin(QueryTheListOfEipsInTheRecyclingBinRequest request) {
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
    return invokeHttpClient(internalRequest, QueryTheListOfEipsInTheRecyclingBinResponse.class);
  }

  /**
   * receiveEipTransfer
   * 
   * @param request 入参结构体
   */
  public void receiveEipTransfer(ReceiveEipTransferRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'transferIdList' is set
    checkNotNull(request.getTransferIdList(), "Missing the required parameter 'transferIdList' when calling receiveEipTransfer");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TRANSFER);
    internalRequest.addParameter("accept", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * rejectEipTransfer
   * 
   * @param request 入参结构体
   */
  public void rejectEipTransfer(RejectEipTransferRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'transferIdList' is set
    checkNotNull(request.getTransferIdList(), "Missing the required parameter 'transferIdList' when calling rejectEipTransfer");
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
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling releaseEip");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
   * releaseTheEipFromTheRecyclingBin
   * 
   * @param request 入参结构体
   */
  public void releaseTheEipFromTheRecyclingBin(ReleaseTheEipFromTheRecyclingBinRequest request) {
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling releaseTheEipFromTheRecyclingBin");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling removeTbspAreaBlocking");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling removeTbspIpWhitelist");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling removeTbspProtocolBlocking");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling renewTbsp");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'renewTime' is set
    checkNotNull(request.getRenewTime(), "Missing the required parameter 'renewTime' when calling renewTbsp");
    // verify the required parameter 'renewTimeUnit' is set
    checkNotNull(request.getRenewTimeUnit(), "Missing the required parameter 'renewTimeUnit' when calling renewTbsp");
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling resizeTbsp");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'ipCapacity' is set
    checkNotNull(request.getIpCapacity(), "Missing the required parameter 'ipCapacity' when calling resizeTbsp");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId());
    internalRequest.addParameter("resize", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * restoreEipInRecycleBin
   * 
   * @param request 入参结构体
   */
  public void restoreEipInRecycleBin(RestoreEipInRecycleBinRequest request) {
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling restoreEipInRecycleBin");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, CONSTANT_RECYCLE, request.getEip());
    internalRequest.addParameter("restore", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * selectiveReleaseOfEip
   * 
   * @param request 入参结构体
   */
  public void selectiveReleaseOfEip(SelectiveReleaseOfEipRequest request) {
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling selectiveReleaseOfEip");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
   * sharedBandwidthInquiry
   * 
   * @param request 入参结构体
   * @return SharedBandwidthInquiryResponse
   */
  public SharedBandwidthInquiryResponse sharedBandwidthInquiry(SharedBandwidthInquiryRequest request) {
    // verify the required parameter 'bandwidthInMbps' is set
    checkNotNull(request.getBandwidthInMbps(), "Missing the required parameter 'bandwidthInMbps' when calling sharedBandwidthInquiry");
    // verify the required parameter 'ipNum' is set
    checkNotNull(request.getIpNum(), "Missing the required parameter 'ipNum' when calling sharedBandwidthInquiry");
    // verify the required parameter 'billing' is set
    checkNotNull(request.getBilling(), "Missing the required parameter 'billing' when calling sharedBandwidthInquiry");
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
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'reservationLength' is set
    checkNotNull(request.getReservationLength(), "Missing the required parameter 'reservationLength' when calling sharedDataPackageInquiry");
    // verify the required parameter 'capacity' is set
    checkNotNull(request.getCapacity(), "Missing the required parameter 'capacity' when calling sharedDataPackageInquiry");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_EIPTP, CONSTANT_PRICE);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    return invokeHttpClient(internalRequest, SharedDataPackageInquiryResponse.class);
  }

  /**
   * turnOffEipAutomaticRenewal
   * 
   * @param request 入参结构体
   */
  public void turnOffEipAutomaticRenewal(TurnOffEipAutomaticRenewalRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling turnOffEipAutomaticRenewal");
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_EIP, request.getEip());
    internalRequest.addParameter("stopAutoRenew", null);
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
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling unbindEip");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
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
    // verify the required parameter 'id' is set
    checkNotNull(request.getId(), "Missing the required parameter 'id' when calling unbindTbspProtectionObject");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'ipList' is set
    checkNotNull(request.getIpList(), "Missing the required parameter 'ipList' when calling unbindTbspProtectionObject");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_TBSP, request.getId());
    internalRequest.addParameter("unbind", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * updateEipReleaseProtectionSwitch
   * 
   * @param request 入参结构体
   */
  public void updateEipReleaseProtectionSwitch(UpdateEipReleaseProtectionSwitchRequest request) {
    // verify the required parameter 'eip' is set
    checkNotNull(request.getEip(), "Missing the required parameter 'eip' when calling updateEipReleaseProtectionSwitch");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'deleteProtect' is set
    checkNotNull(request.getDeleteProtect(), "Missing the required parameter 'deleteProtect' when calling updateEipReleaseProtectionSwitch");
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
  private InternalRequest createRequest(
  AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
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
      if (internalRequest.getHttpMethod() == HttpMethodName.POST
      || internalRequest.getHttpMethod() == HttpMethodName.PUT) {
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

  /**
  * The default method to generate the random String for clientToken if the optional parameter clientToken
  * is not specified by the user.
  *
  * The default algorithm is using {@link UUID} to generate a random UUID,
  * @return An random String generated by {@link UUID}.
  */
  private String generateDefaultClientToken() {
      return UUID.randomUUID().toString();
  }
}
