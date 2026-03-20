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
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.vpc.models.BatchCreateSslVpnUsersRequest;
import com.baidubce.vpc.models.BatchCreateSslVpnUsersResponse;
import com.baidubce.vpc.models.BindEipRequest;
import com.baidubce.vpc.models.CloseVpcRelayRequest;
import com.baidubce.vpc.models.CreateIpReservedRequest;
import com.baidubce.vpc.models.CreateIpReservedResponse;
import com.baidubce.vpc.models.CreateSslVpnServerRequest;
import com.baidubce.vpc.models.CreateSslVpnServerResponse;
import com.baidubce.vpc.models.CreateSubnetRequest;
import com.baidubce.vpc.models.CreateSubnetResponse;
import com.baidubce.vpc.models.CreateUserGatewayRequest;
import com.baidubce.vpc.models.CreateUserGatewayResponse;
import com.baidubce.vpc.models.CreateVpcRequest;
import com.baidubce.vpc.models.CreateVpcResponse;
import com.baidubce.vpc.models.CreateVpnRequest;
import com.baidubce.vpc.models.CreateVpnResponse;
import com.baidubce.vpc.models.CreateVpnTunnelRequest;
import com.baidubce.vpc.models.CreateVpnTunnelResponse;
import com.baidubce.vpc.models.DeleteIpReserveRequest;
import com.baidubce.vpc.models.DeleteSslVpnServerRequest;
import com.baidubce.vpc.models.DeleteSslVpnUserRequest;
import com.baidubce.vpc.models.DeleteSubnetRequest;
import com.baidubce.vpc.models.DeleteUserGatewayRequest;
import com.baidubce.vpc.models.DeleteVpcRequest;
import com.baidubce.vpc.models.DeleteVpnTunnelRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoResponse;
import com.baidubce.vpc.models.ListIpReserveRequest;
import com.baidubce.vpc.models.ListIpReserveResponse;
import com.baidubce.vpc.models.OpenVpcRelayRequest;
import com.baidubce.vpc.models.QuerySpecifiedSubnetRequest;
import com.baidubce.vpc.models.QuerySpecifiedSubnetResponse;
import com.baidubce.vpc.models.QuerySpecifiedVpcRequest;
import com.baidubce.vpc.models.QuerySpecifiedVpcResponse;
import com.baidubce.vpc.models.QuerySslVpnServerRequest;
import com.baidubce.vpc.models.QuerySslVpnServerResponse;
import com.baidubce.vpc.models.QuerySslVpnUsersRequest;
import com.baidubce.vpc.models.QuerySslVpnUsersResponse;
import com.baidubce.vpc.models.QuerySubnetListRequest;
import com.baidubce.vpc.models.QuerySubnetListResponse;
import com.baidubce.vpc.models.QueryVpcIntranetIpRequest;
import com.baidubce.vpc.models.QueryVpcIntranetIpResponse;
import com.baidubce.vpc.models.QueryVpcListRequest;
import com.baidubce.vpc.models.QueryVpcListResponse;
import com.baidubce.vpc.models.QueryVpnListRequest;
import com.baidubce.vpc.models.QueryVpnListResponse;
import com.baidubce.vpc.models.ReleaseVpnRequest;
import com.baidubce.vpc.models.RenewVpnRequest;
import com.baidubce.vpc.models.SearchForVpnDetailsRequest;
import com.baidubce.vpc.models.SearchForVpnDetailsResponse;
import com.baidubce.vpc.models.SearchVpnTunnelRequest;
import com.baidubce.vpc.models.SearchVpnTunnelResponse;
import com.baidubce.vpc.models.UnbindEipRequest;
import com.baidubce.vpc.models.UpdateSslVpnServerRequest;
import com.baidubce.vpc.models.UpdateSslVpnUsersRequest;
import com.baidubce.vpc.models.UpdateSubnetRequest;
import com.baidubce.vpc.models.UpdateUserGatewayRequest;
import com.baidubce.vpc.models.UpdateVpcRequest;
import com.baidubce.vpc.models.UpdateVpnReleaseProtectionRequest;
import com.baidubce.vpc.models.UpdateVpnRequest;
import com.baidubce.vpc.models.UpdateVpnTunnelRequest;
import com.baidubce.vpc.models.UserGatewayDetailsRequest;
import com.baidubce.vpc.models.UserGatewayDetailsResponse;
import com.baidubce.vpc.models.UserGatewayListRequest;
import com.baidubce.vpc.models.UserGatewayListResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class VpcClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";

    private static final String CONSTANT_VPC = "vpc";

    private static final String CONSTANT_VPN = "vpn";

    private static final String CONSTANT_VPNCONN = "vpnconn";

    private static final String CONSTANT_SSL_VPN_SERVER = "sslVpnServer";

    private static final String CONSTANT_SHUTDOWN_RELAY = "shutdownRelay";

    private static final String CONSTANT_RESOURCE_IP = "resourceIp";

    private static final String CONSTANT_CGW = "cgw";

    private static final String CONSTANT_SSL_VPN_USER = "sslVpnUser";

    private static final String CONSTANT_SUBNET = "subnet";

    private static final String CONSTANT_PRIVATE_IP_ADDRESS_INFO = "privateIpAddressInfo";

    private static final String CONSTANT_IPRESERVE = "ipreserve";

    private static final String CONSTANT_OPEN_RELAY = "openRelay";

    private static final String CONSTANT_DELETE_PROTECT = "deleteProtect";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public VpcClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public VpcClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * batchCreateSslVpnUsers
     * 
     * @param request 入参结构体
     * @return BatchCreateSslVpnUsersResponse
     */
    public BatchCreateSslVpnUsersResponse batchCreateSslVpnUsers(BatchCreateSslVpnUsersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_USER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchCreateSslVpnUsersResponse.class);
    }

    /**
     * bindEip
     * 
     * @param request 入参结构体
     */
    public void bindEip(BindEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * closeVpcRelay
     * 
     * @param request 入参结构体
     */
    public void closeVpcRelay(CloseVpcRelayRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_VPC, CONSTANT_SHUTDOWN_RELAY, request.getVpcId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createIpReserved
     * 
     * @param request 入参结构体
     * @return CreateIpReservedResponse
     */
    public CreateIpReservedResponse createIpReserved(CreateIpReservedRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SUBNET, CONSTANT_IPRESERVE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateIpReservedResponse.class);
    }

    /**
     * createSslVpnServer
     * 
     * @param request 入参结构体
     * @return CreateSslVpnServerResponse
     */
    public CreateSslVpnServerResponse createSslVpnServer(CreateSslVpnServerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_SERVER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSslVpnServerResponse.class);
    }

    /**
     * createSubnet
     * 
     * @param request 入参结构体
     * @return CreateSubnetResponse
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SUBNET);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSubnetResponse.class);
    }

    /**
     * createUserGateway
     * 
     * @param request 入参结构体
     * @return CreateUserGatewayResponse
     */
    public CreateUserGatewayResponse createUserGateway(CreateUserGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateUserGatewayResponse.class);
    }

    /**
     * createVpc
     * 
     * @param request 入参结构体
     * @return CreateVpcResponse
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VPC);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateVpcResponse.class);
    }

    /**
     * createVpn
     * 
     * @param request 入参结构体
     * @return CreateVpnResponse
     */
    public CreateVpnResponse createVpn(CreateVpnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VPN);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateVpnResponse.class);
    }

    /**
     * createVpnTunnel
     * 
     * @param request 入参结构体
     * @return CreateVpnTunnelResponse
     */
    public CreateVpnTunnelResponse createVpnTunnel(CreateVpnTunnelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_VPNCONN);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateVpnTunnelResponse.class);
    }

    /**
     * deleteIpReserve
     * 
     * @param request 入参结构体
     */
    public void deleteIpReserve(DeleteIpReserveRequest request) {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_SUBNET, CONSTANT_IPRESERVE, request.getIpReserveId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSslVpnServer
     * 
     * @param request 入参结构体
     */
    public void deleteSslVpnServer(DeleteSslVpnServerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        new BaseBceRequest(),
                        HttpMethodName.DELETE,
                        VERSION_V1,
                        CONSTANT_VPN,
                        request.getVpnId(),
                        CONSTANT_SSL_VPN_SERVER,
                        request.getSslVpnServerId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSslVpnUser
     * 
     * @param request 入参结构体
     */
    public void deleteSslVpnUser(DeleteSslVpnUserRequest request) {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_USER, request.getUserId());
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
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_SUBNET, request.getSubnetId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteUserGateway
     * 
     * @param request 入参结构体
     */
    public void deleteUserGateway(DeleteUserGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW, request.getCgwId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteVpc
     * 
     * @param request 入参结构体
     */
    public void deleteVpc(DeleteVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPC, request.getVpcId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteVpnTunnel
     * 
     * @param request 入参结构体
     */
    public void deleteVpnTunnel(DeleteVpnTunnelRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, CONSTANT_VPNCONN, request.getVpnConnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getVpcResourceIpInfo
     * 
     * @param request 入参结构体
     * @return GetVpcResourceIpInfoResponse
     */
    public GetVpcResourceIpInfoResponse getVpcResourceIpInfo(GetVpcResourceIpInfoRequest request) {
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
        return invokeHttpClient(internalRequest, GetVpcResourceIpInfoResponse.class);
    }

    /**
     * listIpReserve
     * 
     * @param request 入参结构体
     * @return ListIpReserveResponse
     */
    public ListIpReserveResponse listIpReserve(ListIpReserveRequest request) {
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
        return invokeHttpClient(internalRequest, ListIpReserveResponse.class);
    }

    /**
     * openVpcRelay
     * 
     * @param request 入参结构体
     */
    public void openVpcRelay(OpenVpcRelayRequest request) {
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
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, request.getVpcId());
        return invokeHttpClient(internalRequest, QuerySpecifiedVpcResponse.class);
    }

    /**
     * querySslVpnServer
     * 
     * @param request 入参结构体
     * @return QuerySslVpnServerResponse
     */
    public QuerySslVpnServerResponse querySslVpnServer(QuerySslVpnServerRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_SERVER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        return invokeHttpClient(internalRequest, QuerySslVpnServerResponse.class);
    }

    /**
     * querySslVpnUsers
     * 
     * @param request 入参结构体
     * @return QuerySslVpnUsersResponse
     */
    public QuerySslVpnUsersResponse querySslVpnUsers(QuerySslVpnUsersRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_USER);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getUserName() != null) {
            internalRequest.addParameter("userName", request.getUserName());
        }
        return invokeHttpClient(internalRequest, QuerySslVpnUsersResponse.class);
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
     * queryVpcIntranetIp
     * 
     * @param request 入参结构体
     * @return QueryVpcIntranetIpResponse
     */
    public QueryVpcIntranetIpResponse queryVpcIntranetIp(QueryVpcIntranetIpRequest request) {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, request.getVpcId(), CONSTANT_PRIVATE_IP_ADDRESS_INFO);
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
     * queryVpnList
     * 
     * @param request 入参结构体
     * @return QueryVpnListResponse
     */
    public QueryVpnListResponse queryVpnList(QueryVpnListRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPN);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getEip() != null) {
            internalRequest.addParameter("eip", request.getEip());
        }
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        return invokeHttpClient(internalRequest, QueryVpnListResponse.class);
    }

    /**
     * releaseVpn
     * 
     * @param request 入参结构体
     */
    public void releaseVpn(ReleaseVpnRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renewVpn
     * 
     * @param request 入参结构体
     */
    public void renewVpn(RenewVpnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * searchForVpnDetails
     * 
     * @param request 入参结构体
     * @return SearchForVpnDetailsResponse
     */
    public SearchForVpnDetailsResponse searchForVpnDetails(SearchForVpnDetailsRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        return invokeHttpClient(internalRequest, SearchForVpnDetailsResponse.class);
    }

    /**
     * searchVpnTunnel
     * 
     * @param request 入参结构体
     * @return SearchVpnTunnelResponse
     */
    public SearchVpnTunnelResponse searchVpnTunnel(SearchVpnTunnelRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, CONSTANT_VPNCONN, request.getVpnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        return invokeHttpClient(internalRequest, SearchVpnTunnelResponse.class);
    }

    /**
     * unbindEip
     * 
     * @param request 入参结构体
     */
    public void unbindEip(UnbindEipRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSslVpnServer
     * 
     * @param request 入参结构体
     */
    public void updateSslVpnServer(UpdateSslVpnServerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_SERVER, request.getSslVpnServerId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSslVpnUsers
     * 
     * @param request 入参结构体
     */
    public void updateSslVpnUsers(UpdateSslVpnUsersRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_USER, request.getUserId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSubnet
     * 
     * @param request 入参结构体
     */
    public void updateSubnet(UpdateSubnetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SUBNET, request.getSubnetId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateUserGateway
     * 
     * @param request 入参结构体
     */
    public void updateUserGateway(UpdateUserGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW, request.getCgwId());
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPC, request.getVpcId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateVpn
     * 
     * @param request 入参结构体
     */
    public void updateVpn(UpdateVpnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateVpnReleaseProtection
     * 
     * @param request 入参结构体
     */
    public void updateVpnReleaseProtection(UpdateVpnReleaseProtectionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_DELETE_PROTECT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateVpnTunnel
     * 
     * @param request 入参结构体
     */
    public void updateVpnTunnel(UpdateVpnTunnelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, CONSTANT_VPNCONN, request.getVpnConnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * userGatewayDetails
     * 
     * @param request 入参结构体
     * @return UserGatewayDetailsResponse
     */
    public UserGatewayDetailsResponse userGatewayDetails(UserGatewayDetailsRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW, request.getCgwId());
        return invokeHttpClient(internalRequest, UserGatewayDetailsResponse.class);
    }

    /**
     * userGatewayList
     * 
     * @param request 入参结构体
     * @return UserGatewayListResponse
     */
    public UserGatewayListResponse userGatewayList(UserGatewayListRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, UserGatewayListResponse.class);
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
