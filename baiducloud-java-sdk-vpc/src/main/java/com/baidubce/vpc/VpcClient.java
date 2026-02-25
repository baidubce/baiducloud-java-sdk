package com.baidubce.vpc;
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

import com.baidubce.vpc.models.CloseVpcRelayRequest;
import com.baidubce.vpc.models.CreateAReservedNetworkSegmentRequest;
import com.baidubce.vpc.models.CreateAReservedNetworkSegmentResponse;
import com.baidubce.vpc.models.CreateSubnetRequest;
import com.baidubce.vpc.models.CreateSubnetResponse;
import com.baidubce.vpc.models.CreateVpcRequest;
import com.baidubce.vpc.models.CreateVpcResponse;
import com.baidubce.vpc.models.DeleteReservedNetworkSegmentRequest;
import com.baidubce.vpc.models.DeleteSubnetRequest;
import com.baidubce.vpc.models.DeleteVpcRequest;
import com.baidubce.vpc.models.EnableVpcRelayRequest;
import com.baidubce.vpc.models.QuerySpecifiedSubnetRequest;
import com.baidubce.vpc.models.QuerySpecifiedSubnetResponse;
import com.baidubce.vpc.models.QuerySpecifiedVpcRequest;
import com.baidubce.vpc.models.QuerySpecifiedVpcResponse;
import com.baidubce.vpc.models.QuerySubnetListRequest;
import com.baidubce.vpc.models.QuerySubnetListResponse;
import com.baidubce.vpc.models.QueryTheIpAddressesOccupiedByProductsWithinVpcRequest;
import com.baidubce.vpc.models.QueryTheIpAddressesOccupiedByProductsWithinVpcResponse;
import com.baidubce.vpc.models.QueryTheReservedNetworkSegmentListRequest;
import com.baidubce.vpc.models.QueryTheReservedNetworkSegmentListResponse;
import com.baidubce.vpc.models.QueryVpcIntranetIpRequest;
import com.baidubce.vpc.models.QueryVpcIntranetIpResponse;
import com.baidubce.vpc.models.QueryVpcListRequest;
import com.baidubce.vpc.models.QueryVpcListResponse;
import com.baidubce.vpc.models.UpdateSubnetRequest;
import com.baidubce.vpc.models.UpdateVpcRequest;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;


public class VpcClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";

    private static final String CONSTANT_VPC = "vpc";

    private static final String CONSTANT_SHUTDOWN_RELAY = "shutdownRelay";

    private static final String CONSTANT_RESOURCE_IP = "resourceIp";

    private static final String CONSTANT_SUBNET = "subnet";

    private static final String CONSTANT_IPRESERVE = "ipreserve";

    private static final String CONSTANT_OPEN_RELAY = "openRelay";

    private static final String CONSTANT_PRIVATE_IP_ADDRESS_INFO = "privateIpAddressInfo";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static HttpResponseHandler[] VpcClientHandlers = new HttpResponseHandler[] {
        new BceMetadataResponseHandler(),
        new BceErrorResponseHandler(),
        new BceJsonResponseHandler()
    };

    public VpcClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public VpcClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, VpcClientHandlers);
    }

  /**
   * closeVpcRelay
   * 
   * @param request 入参结构体
   */
  public void closeVpcRelay(CloseVpcRelayRequest request) {
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling closeVpcRelay");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_VPC, CONSTANT_SHUTDOWN_RELAY, request.getVpcId());
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * createAReservedNetworkSegment
   * 
   * @param request 入参结构体
   * @return CreateAReservedNetworkSegmentResponse
   */
  public CreateAReservedNetworkSegmentResponse createAReservedNetworkSegment(CreateAReservedNetworkSegmentRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'subnetId' is set
    checkNotNull(request.getSubnetId(), "Missing the required parameter 'subnetId' when calling createAReservedNetworkSegment");
    // verify the required parameter 'ipCidr' is set
    checkNotNull(request.getIpCidr(), "Missing the required parameter 'ipCidr' when calling createAReservedNetworkSegment");
    // verify the required parameter 'ipVersion' is set
    checkNotNull(request.getIpVersion(), "Missing the required parameter 'ipVersion' when calling createAReservedNetworkSegment");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SUBNET, CONSTANT_IPRESERVE);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    return invokeHttpClient(internalRequest, CreateAReservedNetworkSegmentResponse.class);
  }

  /**
   * createSubnet
   * 
   * @param request 入参结构体
   * @return CreateSubnetResponse
   */
  public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'name' is set
    checkNotNull(request.getName(), "Missing the required parameter 'name' when calling createSubnet");
    // verify the required parameter 'zoneName' is set
    checkNotNull(request.getZoneName(), "Missing the required parameter 'zoneName' when calling createSubnet");
    // verify the required parameter 'cidr' is set
    checkNotNull(request.getCidr(), "Missing the required parameter 'cidr' when calling createSubnet");
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling createSubnet");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SUBNET);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    return invokeHttpClient(internalRequest, CreateSubnetResponse.class);
  }

  /**
   * createVpc
   * 
   * @param request 入参结构体
   * @return CreateVpcResponse
   */
  public CreateVpcResponse createVpc(CreateVpcRequest request) {
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'name' is set
    checkNotNull(request.getName(), "Missing the required parameter 'name' when calling createVpc");
    // verify the required parameter 'cidr' is set
    checkNotNull(request.getCidr(), "Missing the required parameter 'cidr' when calling createVpc");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VPC);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    return invokeHttpClient(internalRequest, CreateVpcResponse.class);
  }

  /**
   * deleteReservedNetworkSegment
   * 
   * @param request 入参结构体
   */
  public void deleteReservedNetworkSegment(DeleteReservedNetworkSegmentRequest request) {
    // verify the required parameter 'ipReserveId' is set
    checkNotNull(request.getIpReserveId(), "Missing the required parameter 'ipReserveId' when calling deleteReservedNetworkSegment");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_SUBNET, CONSTANT_IPRESERVE, request.getIpReserveId());
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * deleteSubnet
   * 
   * @param request 入参结构体
   */
  public void deleteSubnet(DeleteSubnetRequest request) {
    // verify the required parameter 'subnetId' is set
    checkNotNull(request.getSubnetId(), "Missing the required parameter 'subnetId' when calling deleteSubnet");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_SUBNET, request.getSubnetId());
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * deleteVpc
   * 
   * @param request 入参结构体
   */
  public void deleteVpc(DeleteVpcRequest request) {
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling deleteVpc");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPC, request.getVpcId());
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * enableVpcRelay
   * 
   * @param request 入参结构体
   */
  public void enableVpcRelay(EnableVpcRelayRequest request) {
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling enableVpcRelay");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_VPC, CONSTANT_OPEN_RELAY, request.getVpcId());
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * querySpecifiedSubnet
   * 
   * @param request 入参结构体
   * @return QuerySpecifiedSubnetResponse
   */
  public QuerySpecifiedSubnetResponse querySpecifiedSubnet(QuerySpecifiedSubnetRequest request) {
    // verify the required parameter 'subnetId' is set
    checkNotNull(request.getSubnetId(), "Missing the required parameter 'subnetId' when calling querySpecifiedSubnet");
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_SUBNET, request.getSubnetId());
    return invokeHttpClient(internalRequest, QuerySpecifiedSubnetResponse.class);
  }

  /**
   * querySpecifiedVpc
   * 
   * @param request 入参结构体
   * @return QuerySpecifiedVpcResponse
   */
  public QuerySpecifiedVpcResponse querySpecifiedVpc(QuerySpecifiedVpcRequest request) {
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling querySpecifiedVpc");
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, request.getVpcId());
    return invokeHttpClient(internalRequest, QuerySpecifiedVpcResponse.class);
  }

  /**
   * querySubnetList
   * 
   * @param request 入参结构体
   * @return QuerySubnetListResponse
   */
  public QuerySubnetListResponse querySubnetList(QuerySubnetListRequest request) {
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_SUBNET);
    if (request.getMarker() != null) {
        internalRequest.addParameter("marker", request.getMarker());
    }
    if (request.getMaxKeys() != null) {
        internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
    }
    if (request.getVpcId() != null) {
        internalRequest.addParameter("vpcId", request.getVpcId());
    }
    if (request.getZoneName() != null) {
        internalRequest.addParameter("zoneName", request.getZoneName());
    }
    if (request.getSubnetType() != null) {
        internalRequest.addParameter("subnetType", request.getSubnetType());
    }
    if (request.getSubnetIds() != null) {
        internalRequest.addParameter("subnetIds", request.getSubnetIds());
    }
    return invokeHttpClient(internalRequest, QuerySubnetListResponse.class);
  }

  /**
   * queryTheIpAddressesOccupiedByProductsWithinVpc
   * 
   * @param request 入参结构体
   * @return QueryTheIpAddressesOccupiedByProductsWithinVpcResponse
   */
  public QueryTheIpAddressesOccupiedByProductsWithinVpcResponse queryTheIpAddressesOccupiedByProductsWithinVpc(QueryTheIpAddressesOccupiedByProductsWithinVpcRequest request) {
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling queryTheIpAddressesOccupiedByProductsWithinVpc");
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, CONSTANT_RESOURCE_IP);
    if (request.getVpcId() != null) {
        internalRequest.addParameter("vpcId", request.getVpcId());
    }
    if (request.getSubnetId() != null) {
        internalRequest.addParameter("subnetId", request.getSubnetId());
    }
    if (request.getResourceType() != null) {
        internalRequest.addParameter("resourceType", request.getResourceType());
    }
    if (request.getPageNo() != null) {
        internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
    }
    if (request.getPageSize() != null) {
        internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
    }
    return invokeHttpClient(internalRequest, QueryTheIpAddressesOccupiedByProductsWithinVpcResponse.class);
  }

  /**
   * queryTheReservedNetworkSegmentList
   * 
   * @param request 入参结构体
   * @return QueryTheReservedNetworkSegmentListResponse
   */
  public QueryTheReservedNetworkSegmentListResponse queryTheReservedNetworkSegmentList(QueryTheReservedNetworkSegmentListRequest request) {
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_SUBNET, CONSTANT_IPRESERVE);
    if (request.getSubnetId() != null) {
        internalRequest.addParameter("subnetId", request.getSubnetId());
    }
    if (request.getMarker() != null) {
        internalRequest.addParameter("marker", request.getMarker());
    }
    if (request.getMaxKeys() != null) {
        internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
    }
    return invokeHttpClient(internalRequest, QueryTheReservedNetworkSegmentListResponse.class);
  }

  /**
   * queryVpcIntranetIp
   * 
   * @param request 入参结构体
   * @return QueryVpcIntranetIpResponse
   */
  public QueryVpcIntranetIpResponse queryVpcIntranetIp(QueryVpcIntranetIpRequest request) {
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling queryVpcIntranetIp");
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, request.getVpcId(), CONSTANT_PRIVATE_IP_ADDRESS_INFO);
    if (request.getPrivateIpAddresses() != null && !request.getPrivateIpAddresses().isEmpty()) {
        internalRequest.addParameter("privateIpAddresses", String.join(",", request.getPrivateIpAddresses()));
    }
    if (request.getPrivateIpRange() != null) {
        internalRequest.addParameter("privateIpRange", request.getPrivateIpRange());
    }
    return invokeHttpClient(internalRequest, QueryVpcIntranetIpResponse.class);
  }

  /**
   * queryVpcList
   * 
   * @param request 入参结构体
   * @return QueryVpcListResponse
   */
  public QueryVpcListResponse queryVpcList(QueryVpcListRequest request) {
    InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPC);
    if (request.getMarker() != null) {
        internalRequest.addParameter("marker", request.getMarker());
    }
    if (request.getMaxKeys() != null) {
        internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
    }
    if (request.getIsDefault() != null) {
        internalRequest.addParameter("isDefault", String.valueOf(request.getIsDefault()));
    }
    if (request.getVpcIds() != null) {
        internalRequest.addParameter("vpcIds", request.getVpcIds());
    }
    return invokeHttpClient(internalRequest, QueryVpcListResponse.class);
  }

  /**
   * updateSubnet
   * 
   * @param request 入参结构体
   */
  public void updateSubnet(UpdateSubnetRequest request) {
    // verify the required parameter 'subnetId' is set
    checkNotNull(request.getSubnetId(), "Missing the required parameter 'subnetId' when calling updateSubnet");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'name' is set
    checkNotNull(request.getName(), "Missing the required parameter 'name' when calling updateSubnet");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SUBNET, request.getSubnetId());
    internalRequest.addParameter("modifyAttribute", null);
    if (request.getClientToken() != null) {
        internalRequest.addParameter("clientToken", request.getClientToken());
    }
    fillPayload(internalRequest, request);
    invokeHttpClient(internalRequest, BaseBceResponse.class);
  }

  /**
   * updateVpc
   * 
   * @param request 入参结构体
   */
  public void updateVpc(UpdateVpcRequest request) {
    // verify the required parameter 'vpcId' is set
    checkNotNull(request.getVpcId(), "Missing the required parameter 'vpcId' when calling updateVpc");
    if (Strings.isNullOrEmpty(request.getClientToken())) {
        request.setClientToken(generateDefaultClientToken());
    }
    // verify the required parameter 'name' is set
    checkNotNull(request.getName(), "Missing the required parameter 'name' when calling updateVpc");
    InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPC, request.getVpcId());
    internalRequest.addParameter("modifyAttribute", null);
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
