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
import static com.baidubce.util.Validate.checkNotNull;
import com.baidubce.common.BaseBceRequest;
import java.util.UUID;
import com.google.common.base.Strings;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.eip.models.AddTbspAreaBlockingRequest;
import com.baidubce.eip.models.AddTbspIpWhitelistRequest;
import com.baidubce.eip.models.AddTbspProtocolBlockingRequest;
import com.baidubce.eip.models.BandwidthPackageInquiryRequest;
import com.baidubce.eip.models.BandwidthPackageInquiryResponse;
import com.baidubce.eip.models.BindTbspProtectionObjectRequest;
import com.baidubce.eip.models.CreateTbspRequest;
import com.baidubce.eip.models.CreateTbspResponse;
import com.baidubce.eip.models.DetailTbspRequest;
import com.baidubce.eip.models.DetailTbspResponse;
import com.baidubce.eip.models.DisableTbspIpCleanRequest;
import com.baidubce.eip.models.EipInquiryRequest;
import com.baidubce.eip.models.EipInquiryResponse;
import com.baidubce.eip.models.EnableTbspIpCleanRequest;
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
import com.baidubce.eip.models.RemoveTbspAreaBlockingRequest;
import com.baidubce.eip.models.RemoveTbspIpWhitelistRequest;
import com.baidubce.eip.models.RemoveTbspProtocolBlockingRequest;
import com.baidubce.eip.models.RenewTbspRequest;
import com.baidubce.eip.models.ResizeTbspRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryResponse;
import com.baidubce.eip.models.SharedDataPackageInquiryRequest;
import com.baidubce.eip.models.SharedDataPackageInquiryResponse;
import com.baidubce.eip.models.UnbindTbspProtectionObjectRequest;


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

    private static final String CONSTANT_IP_CLEAN = "ipClean";

    private static final String CONSTANT_IP_WHITELIST = "ipWhitelist";

    private static final String CONSTANT_EIPTP = "eiptp";

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
