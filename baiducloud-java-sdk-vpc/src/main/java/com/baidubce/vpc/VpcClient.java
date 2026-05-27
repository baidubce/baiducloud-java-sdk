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
import com.baidubce.auth.SignOptions;
import com.baidubce.util.RequestBodyUtils;
import java.util.Arrays;
import java.util.HashSet;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.vpc.models.AcceptPeerConnRequest;
import com.baidubce.vpc.models.ActiveStandbySwitchoverRequest;
import com.baidubce.vpc.models.AddAclRuleRequest;
import com.baidubce.vpc.models.AddEniIpRequest;
import com.baidubce.vpc.models.AddEniIpResponse;
import com.baidubce.vpc.models.AddIpAddressToIpGroupRequest;
import com.baidubce.vpc.models.AddIpGroupToIpSetRequest;
import com.baidubce.vpc.models.AttachEniInstanceRequest;
import com.baidubce.vpc.models.AuthorizeEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.AuthorizeSecurityGroupRulesRequest;
import com.baidubce.vpc.models.BatchAddDnatRulesRequest;
import com.baidubce.vpc.models.BatchAddDnatRulesResponse;
import com.baidubce.vpc.models.BatchAddEniIpRequest;
import com.baidubce.vpc.models.BatchAddEniIpResponse;
import com.baidubce.vpc.models.BatchAddSnatRulesRequest;
import com.baidubce.vpc.models.BatchAddSnatRulesResponse;
import com.baidubce.vpc.models.BatchCreateSslVpnUsersRequest;
import com.baidubce.vpc.models.BatchCreateSslVpnUsersResponse;
import com.baidubce.vpc.models.BatchDeleteEniIpRequest;
import com.baidubce.vpc.models.BindEipRequest;
import com.baidubce.vpc.models.BindEniEipRequest;
import com.baidubce.vpc.models.BindHaVipEipRequest;
import com.baidubce.vpc.models.BindHaVipInstanceRequest;
import com.baidubce.vpc.models.BindPhysicalDedicatedLineRequest;
import com.baidubce.vpc.models.ClosePeerConnSyncDnsRequest;
import com.baidubce.vpc.models.CloseVpcRelayRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayHealthCheckRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayResponse;
import com.baidubce.vpc.models.CreateDnatRuleRequest;
import com.baidubce.vpc.models.CreateDnatRuleResponse;
import com.baidubce.vpc.models.CreateEgressOnlyRuleRequest;
import com.baidubce.vpc.models.CreateEgressOnlyRuleResponse;
import com.baidubce.vpc.models.CreateEniRequest;
import com.baidubce.vpc.models.CreateEniResponse;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupResponse;
import com.baidubce.vpc.models.CreateGatewayLimitRulesRequest;
import com.baidubce.vpc.models.CreateGatewayLimitRulesResponse;
import com.baidubce.vpc.models.CreateHaVipRequest;
import com.baidubce.vpc.models.CreateHaVipResponse;
import com.baidubce.vpc.models.CreateIpGroupRequest;
import com.baidubce.vpc.models.CreateIpGroupResponse;
import com.baidubce.vpc.models.CreateIpReservedRequest;
import com.baidubce.vpc.models.CreateIpReservedResponse;
import com.baidubce.vpc.models.CreateIpSetRequest;
import com.baidubce.vpc.models.CreateIpSetResponse;
import com.baidubce.vpc.models.CreateIpv6GatewayRequest;
import com.baidubce.vpc.models.CreateIpv6GatewayResponse;
import com.baidubce.vpc.models.CreateNatRequest;
import com.baidubce.vpc.models.CreateNatResponse;
import com.baidubce.vpc.models.CreatePeerConnRequest;
import com.baidubce.vpc.models.CreatePeerConnResponse;
import com.baidubce.vpc.models.CreateProbeRequest;
import com.baidubce.vpc.models.CreateProbeResponse;
import com.baidubce.vpc.models.CreateRateLimitRuleRequest;
import com.baidubce.vpc.models.CreateRateLimitRuleResponse;
import com.baidubce.vpc.models.CreateRoutingRulesRequest;
import com.baidubce.vpc.models.CreateRoutingRulesResponse;
import com.baidubce.vpc.models.CreateSecurityGroupRequest;
import com.baidubce.vpc.models.CreateSecurityGroupResponse;
import com.baidubce.vpc.models.CreateSnatRuleRequest;
import com.baidubce.vpc.models.CreateSnatRuleResponse;
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
import com.baidubce.vpc.models.DeleteAclRuleRequest;
import com.baidubce.vpc.models.DeleteDnatRuleRequest;
import com.baidubce.vpc.models.DeleteEniIpRequest;
import com.baidubce.vpc.models.DeleteEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.DeleteEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.DeleteGatewayLimitRuleRequest;
import com.baidubce.vpc.models.DeleteHaVipRequest;
import com.baidubce.vpc.models.DeleteIpGroupRequest;
import com.baidubce.vpc.models.DeleteIpReserveRequest;
import com.baidubce.vpc.models.DeleteIpSetRequest;
import com.baidubce.vpc.models.DeleteIpv6GatewayEgressOnlyRuleRequest;
import com.baidubce.vpc.models.DeleteIpv6GatewayRateLimitRuleRequest;
import com.baidubce.vpc.models.DeleteIpv6GatewayRequest;
import com.baidubce.vpc.models.DeleteProbeRequest;
import com.baidubce.vpc.models.DeleteRoutingRulesRequest;
import com.baidubce.vpc.models.DeleteSecurityGroupRequest;
import com.baidubce.vpc.models.DeleteSecurityGroupRulesRequest;
import com.baidubce.vpc.models.DeleteSnatRuleRequest;
import com.baidubce.vpc.models.DeleteSslVpnServerRequest;
import com.baidubce.vpc.models.DeleteSslVpnUserRequest;
import com.baidubce.vpc.models.DeleteSubnetRequest;
import com.baidubce.vpc.models.DeleteUserGatewayRequest;
import com.baidubce.vpc.models.DeleteVpcRequest;
import com.baidubce.vpc.models.DeleteVpnTunnelRequest;
import com.baidubce.vpc.models.DetachEniInstanceRequest;
import com.baidubce.vpc.models.GetEniDetailRequest;
import com.baidubce.vpc.models.GetEniDetailResponse;
import com.baidubce.vpc.models.GetEniStatusRequest;
import com.baidubce.vpc.models.GetEniStatusResponse;
import com.baidubce.vpc.models.GetHaVipDetailRequest;
import com.baidubce.vpc.models.GetHaVipDetailResponse;
import com.baidubce.vpc.models.GetNatRequest;
import com.baidubce.vpc.models.GetNatResponse;
import com.baidubce.vpc.models.GetPeerConnRequest;
import com.baidubce.vpc.models.GetPeerConnResponse;
import com.baidubce.vpc.models.GetProbeDetailRequest;
import com.baidubce.vpc.models.GetProbeDetailResponse;
import com.baidubce.vpc.models.GetSecurityGroupDetailsRequest;
import com.baidubce.vpc.models.GetSecurityGroupDetailsResponse;
import com.baidubce.vpc.models.GetVpcResourceIpInfoRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoResponse;
import com.baidubce.vpc.models.ListDnatRuleRequest;
import com.baidubce.vpc.models.ListDnatRuleResponse;
import com.baidubce.vpc.models.ListEgressOnlyRuleRequest;
import com.baidubce.vpc.models.ListEgressOnlyRuleResponse;
import com.baidubce.vpc.models.ListEniRequest;
import com.baidubce.vpc.models.ListEniResponse;
import com.baidubce.vpc.models.ListHaVipRequest;
import com.baidubce.vpc.models.ListHaVipResponse;
import com.baidubce.vpc.models.ListIpReserveRequest;
import com.baidubce.vpc.models.ListIpReserveResponse;
import com.baidubce.vpc.models.ListNatRequest;
import com.baidubce.vpc.models.ListNatResponse;
import com.baidubce.vpc.models.ListPeerConnRequest;
import com.baidubce.vpc.models.ListPeerConnResponse;
import com.baidubce.vpc.models.ListProbesRequest;
import com.baidubce.vpc.models.ListProbesResponse;
import com.baidubce.vpc.models.ListRateLimitRuleRequest;
import com.baidubce.vpc.models.ListRateLimitRuleResponse;
import com.baidubce.vpc.models.ListSnatRuleRequest;
import com.baidubce.vpc.models.ListSnatRuleResponse;
import com.baidubce.vpc.models.ModifyGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ModifyNatRequest;
import com.baidubce.vpc.models.NatBindEipRequest;
import com.baidubce.vpc.models.NatUnBindEipRequest;
import com.baidubce.vpc.models.OpenPeerConnSyncDnsRequest;
import com.baidubce.vpc.models.OpenVpcRelayRequest;
import com.baidubce.vpc.models.PurchaseReservedNatRequest;
import com.baidubce.vpc.models.QueryAclRequest;
import com.baidubce.vpc.models.QueryAclResponse;
import com.baidubce.vpc.models.QueryAclRulesRequest;
import com.baidubce.vpc.models.QueryAclRulesResponse;
import com.baidubce.vpc.models.QueryEnterpriseSecurityGroupListRequest;
import com.baidubce.vpc.models.QueryEnterpriseSecurityGroupListResponse;
import com.baidubce.vpc.models.QueryIpGroupDetailRequest;
import com.baidubce.vpc.models.QueryIpGroupDetailResponse;
import com.baidubce.vpc.models.QueryIpGroupListRequest;
import com.baidubce.vpc.models.QueryIpGroupListResponse;
import com.baidubce.vpc.models.QueryIpSetDetailRequest;
import com.baidubce.vpc.models.QueryIpSetDetailResponse;
import com.baidubce.vpc.models.QueryIpSetListRequest;
import com.baidubce.vpc.models.QueryIpSetListResponse;
import com.baidubce.vpc.models.QueryIpv6GatewayRequest;
import com.baidubce.vpc.models.QueryIpv6GatewayResponse;
import com.baidubce.vpc.models.QueryRoutingRulesRequest;
import com.baidubce.vpc.models.QueryRoutingRulesResponse;
import com.baidubce.vpc.models.QueryRoutingTableRequest;
import com.baidubce.vpc.models.QueryRoutingTableResponse;
import com.baidubce.vpc.models.QuerySecurityGroupsListRequest;
import com.baidubce.vpc.models.QuerySecurityGroupsListResponse;
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
import com.baidubce.vpc.models.QueryTheDetailsOfTheDedicatedGatewayRequest;
import com.baidubce.vpc.models.QueryTheDetailsOfTheDedicatedGatewayResponse;
import com.baidubce.vpc.models.QueryTheListOfDedicatedLineGatewaysRequest;
import com.baidubce.vpc.models.QueryTheListOfDedicatedLineGatewaysResponse;
import com.baidubce.vpc.models.QueryVpcIntranetIpRequest;
import com.baidubce.vpc.models.QueryVpcIntranetIpResponse;
import com.baidubce.vpc.models.QueryVpcListRequest;
import com.baidubce.vpc.models.QueryVpcListResponse;
import com.baidubce.vpc.models.QueryVpnListRequest;
import com.baidubce.vpc.models.QueryVpnListResponse;
import com.baidubce.vpc.models.RefundPeerConnRequest;
import com.baidubce.vpc.models.RejectPeerConnRequest;
import com.baidubce.vpc.models.ReleaseDedicatedGatewayRequest;
import com.baidubce.vpc.models.ReleaseNatRequest;
import com.baidubce.vpc.models.ReleasePeerConnRequest;
import com.baidubce.vpc.models.ReleaseVpnRequest;
import com.baidubce.vpc.models.RemoveEniRequest;
import com.baidubce.vpc.models.RemoveIpAddressFromIpGroupRequest;
import com.baidubce.vpc.models.RemoveIpGroupFromIpSetRequest;
import com.baidubce.vpc.models.RenewPeerConnRequest;
import com.baidubce.vpc.models.RenewVpnRequest;
import com.baidubce.vpc.models.ResizeIpv6GatewayRequest;
import com.baidubce.vpc.models.ResizeNatRequest;
import com.baidubce.vpc.models.RevokeSecurityGroupRulesRequest;
import com.baidubce.vpc.models.SearchForVpnDetailsRequest;
import com.baidubce.vpc.models.SearchForVpnDetailsResponse;
import com.baidubce.vpc.models.SearchVpnTunnelRequest;
import com.baidubce.vpc.models.SearchVpnTunnelResponse;
import com.baidubce.vpc.models.UnbindEipRequest;
import com.baidubce.vpc.models.UnbindEniEipRequest;
import com.baidubce.vpc.models.UnbindHaVipEipRequest;
import com.baidubce.vpc.models.UnbindHaVipInstanceRequest;
import com.baidubce.vpc.models.UnbindPhysicalDedicatedLineRequest;
import com.baidubce.vpc.models.UpdateAclRulesRequest;
import com.baidubce.vpc.models.UpdateDedicatedGatewayRequest;
import com.baidubce.vpc.models.UpdateDeleteProtectRequest;
import com.baidubce.vpc.models.UpdateDnatRuleRequest;
import com.baidubce.vpc.models.UpdateEniEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.UpdateEniRequest;
import com.baidubce.vpc.models.UpdateEniSecurityGroupRequest;
import com.baidubce.vpc.models.UpdateEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.UpdateHaVipRequest;
import com.baidubce.vpc.models.UpdateIpGroupRequest;
import com.baidubce.vpc.models.UpdateIpSetRequest;
import com.baidubce.vpc.models.UpdateNatReleaseProtectionSwitchRequest;
import com.baidubce.vpc.models.UpdatePeerConnBandwidthRequest;
import com.baidubce.vpc.models.UpdatePeerConnDeleteProtectRequest;
import com.baidubce.vpc.models.UpdatePeerConnRequest;
import com.baidubce.vpc.models.UpdateProbeRequest;
import com.baidubce.vpc.models.UpdateRateLimitRuleRequest;
import com.baidubce.vpc.models.UpdateRoutingRulesRequest;
import com.baidubce.vpc.models.UpdateSecurityGroupRulesRequest;
import com.baidubce.vpc.models.UpdateSnatRuleRequest;
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
import com.baidubce.vpc.models.ViewGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ViewGatewayLimitRulesResponse;

public class VpcClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_VPC = "vpc";
    private static final String CONSTANT_NAT = "nat";
    private static final String CONSTANT_DNAT_RULE = "dnatRule";
    private static final String CONSTANT_IP_GROUP = "ipGroup";
    private static final String CONSTANT_UNBIND_IP_SET = "unbindIpSet";
    private static final String CONSTANT_SECURITY_GROUP = "securityGroup";
    private static final String CONSTANT_RULE = "rule";
    private static final String CONSTANT_RESOURCE_IP = "resourceIp";
    private static final String CONSTANT_UPDATE = "update";
    private static final String CONSTANT_IP_SET = "ipSet";
    private static final String CONSTANT_PRIVATE_IP_ADDRESS_INFO = "privateIpAddressInfo";
    private static final String CONSTANT_ENI = "eni";
    private static final String CONSTANT_SNAT_RULE = "snatRule";
    private static final String CONSTANT_ET_GATEWAY = "etGateway";
    private static final String CONSTANT_VPN = "vpn";
    private static final String CONSTANT_CGW = "cgw";
    private static final String CONSTANT_HAVIP = "havip";
    private static final String CONSTANT_PEERCONN = "peerconn";
    private static final String CONSTANT_BATCH_CREATE = "batchCreate";
    private static final String CONSTANT_VPNCONN = "vpnconn";
    private static final String CONSTANT_ENTERPRISE = "enterprise";
    private static final String CONSTANT_SECURITY = "security";
    private static final String CONSTANT_ACL = "acl";
    private static final String CONSTANT_GATEWAY = "gateway";
    private static final String CONSTANT_LIMITRULE = "limitrule";
    private static final String CONSTANT_SUBNET = "subnet";
    private static final String CONSTANT_I_PV6_GATEWAY = "IPv6Gateway";
    private static final String CONSTANT_EGRESS_ONLY_RULE = "egressOnlyRule";
    private static final String CONSTANT_IPRESERVE = "ipreserve";
    private static final String CONSTANT_SSL_VPN_SERVER = "sslVpnServer";
    private static final String CONSTANT_DELETE_PROTECT = "deleteProtect";
    private static final String CONSTANT_PRIVATE_IP = "privateIp";
    private static final String CONSTANT_BATCH_ADD = "batchAdd";
    private static final String CONSTANT_ROUTE = "route";
    private static final String CONSTANT_RATE_LIMIT_RULE = "rateLimitRule";
    private static final String CONSTANT_PROBE = "probe";
    private static final String CONSTANT_SHUTDOWN_RELAY = "shutdownRelay";
    private static final String CONSTANT_HEALTH_CHECK = "healthCheck";
    private static final String CONSTANT_SSL_VPN_USER = "sslVpnUser";
    private static final String CONSTANT_DELETE_IP_ADDRESS = "deleteIpAddress";
    private static final String CONSTANT_BIND_IP_SET = "bindIpSet";
    private static final String CONSTANT_BATCH_DEL = "batchDel";
    private static final String CONSTANT_OPEN_RELAY = "openRelay";
    private static final String CONSTANT_STATUS = "status";
    private static final String CONSTANT_IP_ADDRESS = "ipAddress";

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
     * acceptPeerConn
     * 
     * @param request 入参结构体
     */
    public void acceptPeerConn(AcceptPeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        internalRequest.addParameter("accept", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * activeStandbySwitchover
     * 
     * @param request 入参结构体
     */
    public void activeStandbySwitchover(ActiveStandbySwitchoverRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ROUTE, CONSTANT_RULE, request.getRouteRuleId());
        internalRequest.addParameter("switchRouteHA", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addAclRule
     * 
     * @param request 入参结构体
     */
    public void addAclRule(AddAclRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ACL, CONSTANT_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addEniIp
     * 
     * @param request 入参结构体
     * @return AddEniIpResponse
     */
    public AddEniIpResponse addEniIp(AddEniIpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENI, request.getEniId(), CONSTANT_PRIVATE_IP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AddEniIpResponse.class);
    }

    /**
     * addIpAddressToIpGroup
     * 
     * @param request 入参结构体
     */
    public void addIpAddressToIpGroup(AddIpAddressToIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IP_SET, request.getIpSetId(), CONSTANT_IP_ADDRESS);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addIpGroupToIpSet
     * 
     * @param request 入参结构体
     */
    public void addIpGroupToIpSet(AddIpGroupToIpSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IP_GROUP, request.getIpGroupId(), CONSTANT_BIND_IP_SET);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * attachEniInstance
     * 
     * @param request 入参结构体
     */
    public void attachEniInstance(AttachEniInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENI, request.getEniId());
        internalRequest.addParameter("attach", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * authorizeEnterpriseSecurityGroupRules
     * 
     * @param request 入参结构体
     */
    public void authorizeEnterpriseSecurityGroupRules(AuthorizeEnterpriseSecurityGroupRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENTERPRISE, CONSTANT_SECURITY, request.getEnterpriseSecurityGroupId());
        internalRequest.addParameter("authorizeRule", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * authorizeSecurityGroupRules
     * 
     * @param request 入参结构体
     */
    public void authorizeSecurityGroupRules(AuthorizeSecurityGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SECURITY_GROUP, request.getSecurityGroupId());
        internalRequest.addParameter("authorizeRule", null);
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchAddDnatRules
     * 
     * @param request 入参结构体
     * @return BatchAddDnatRulesResponse
     */
    public BatchAddDnatRulesResponse batchAddDnatRules(BatchAddDnatRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_DNAT_RULE, CONSTANT_BATCH_CREATE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchAddDnatRulesResponse.class);
    }

    /**
     * batchAddEniIp
     * 
     * @param request 入参结构体
     * @return BatchAddEniIpResponse
     */
    public BatchAddEniIpResponse batchAddEniIp(BatchAddEniIpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENI, request.getEniId(), CONSTANT_PRIVATE_IP, CONSTANT_BATCH_ADD);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchAddEniIpResponse.class);
    }

    /**
     * batchAddSnatRules
     * 
     * @param request 入参结构体
     * @return BatchAddSnatRulesResponse
     */
    public BatchAddSnatRulesResponse batchAddSnatRules(BatchAddSnatRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_NAT, CONSTANT_SNAT_RULE, CONSTANT_BATCH_CREATE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchAddSnatRulesResponse.class);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchCreateSslVpnUsersResponse.class);
    }

    /**
     * batchDeleteEniIp
     * 
     * @param request 入参结构体
     */
    public void batchDeleteEniIp(BatchDeleteEniIpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENI, request.getEniId(), CONSTANT_PRIVATE_IP, CONSTANT_BATCH_DEL);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindEniEip
     * 
     * @param request 入参结构体
     */
    public void bindEniEip(BindEniEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENI, request.getEniId());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindHaVipEip
     * 
     * @param request 入参结构体
     */
    public void bindHaVipEip(BindHaVipEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_HAVIP, request.getHaVipId());
        internalRequest.addParameter("bindPublicIp", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindHaVipInstance
     * 
     * @param request 入参结构体
     */
    public void bindHaVipInstance(BindHaVipInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_HAVIP, request.getHaVipId());
        internalRequest.addParameter("attach", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindPhysicalDedicatedLine
     * 
     * @param request 入参结构体
     */
    public void bindPhysicalDedicatedLine(BindPhysicalDedicatedLineRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET_GATEWAY, request.getEtGatewayId());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * closePeerConnSyncDns
     * 
     * @param request 入参结构体
     */
    public void closePeerConnSyncDns(ClosePeerConnSyncDnsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        internalRequest.addParameter("close", null);
        if (request.getRole() != null) {
            internalRequest.addParameter("role", request.getRole());
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * closeVpcRelay
     * 
     * @param request 入参结构体
     */
    public void closeVpcRelay(CloseVpcRelayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPC, CONSTANT_SHUTDOWN_RELAY, request.getVpcId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createDedicatedGateway
     * 
     * @param request 入参结构体
     * @return CreateDedicatedGatewayResponse
     */
    public CreateDedicatedGatewayResponse createDedicatedGateway(CreateDedicatedGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ET_GATEWAY);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDedicatedGatewayResponse.class);
    }

    /**
     * createDedicatedGatewayHealthCheck
     * 
     * @param request 入参结构体
     */
    public void createDedicatedGatewayHealthCheck(CreateDedicatedGatewayHealthCheckRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ET_GATEWAY, request.getEtGatewayId(), CONSTANT_HEALTH_CHECK);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createDnatRule
     * 
     * @param request 入参结构体
     * @return CreateDnatRuleResponse
     */
    public CreateDnatRuleResponse createDnatRule(CreateDnatRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_DNAT_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDnatRuleResponse.class);
    }

    /**
     * createEgressOnlyRule
     * 
     * @param request 入参结构体
     * @return CreateEgressOnlyRuleResponse
     */
    public CreateEgressOnlyRuleResponse createEgressOnlyRule(CreateEgressOnlyRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_I_PV6_GATEWAY, request.getGatewayId(), CONSTANT_EGRESS_ONLY_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateEgressOnlyRuleResponse.class);
    }

    /**
     * createEni
     * 
     * @param request 入参结构体
     * @return CreateEniResponse
     */
    public CreateEniResponse createEni(CreateEniRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENI);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateEniResponse.class);
    }

    /**
     * createEnterpriseSecurityGroup
     * 
     * @param request 入参结构体
     * @return CreateEnterpriseSecurityGroupResponse
     */
    public CreateEnterpriseSecurityGroupResponse createEnterpriseSecurityGroup(CreateEnterpriseSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENTERPRISE, CONSTANT_SECURITY);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateEnterpriseSecurityGroupResponse.class);
    }

    /**
     * createGatewayLimitRules
     * 
     * @param request 入参结构体
     * @return CreateGatewayLimitRulesResponse
     */
    public CreateGatewayLimitRulesResponse createGatewayLimitRules(CreateGatewayLimitRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateGatewayLimitRulesResponse.class);
    }

    /**
     * createHaVip
     * 
     * @param request 入参结构体
     * @return CreateHaVipResponse
     */
    public CreateHaVipResponse createHaVip(CreateHaVipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_HAVIP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateHaVipResponse.class);
    }

    /**
     * createIpGroup
     * 
     * @param request 入参结构体
     * @return CreateIpGroupResponse
     */
    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IP_SET);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateIpGroupResponse.class);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateIpReservedResponse.class);
    }

    /**
     * createIpSet
     * 
     * @param request 入参结构体
     * @return CreateIpSetResponse
     */
    public CreateIpSetResponse createIpSet(CreateIpSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IP_GROUP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateIpSetResponse.class);
    }

    /**
     * createIpv6Gateway
     * 
     * @param request 入参结构体
     * @return CreateIpv6GatewayResponse
     */
    public CreateIpv6GatewayResponse createIpv6Gateway(CreateIpv6GatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_I_PV6_GATEWAY);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateIpv6GatewayResponse.class);
    }

    /**
     * createNat
     * 
     * @param request 入参结构体
     * @return CreateNatResponse
     */
    public CreateNatResponse createNat(CreateNatRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_NAT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateNatResponse.class);
    }

    /**
     * createPeerConn
     * 
     * @param request 入参结构体
     * @return CreatePeerConnResponse
     */
    public CreatePeerConnResponse createPeerConn(CreatePeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PEERCONN);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreatePeerConnResponse.class);
    }

    /**
     * createProbe
     * 
     * @param request 入参结构体
     * @return CreateProbeResponse
     */
    public CreateProbeResponse createProbe(CreateProbeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PROBE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateProbeResponse.class);
    }

    /**
     * createRateLimitRule
     * 
     * @param request 入参结构体
     * @return CreateRateLimitRuleResponse
     */
    public CreateRateLimitRuleResponse createRateLimitRule(CreateRateLimitRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_I_PV6_GATEWAY, request.getGatewayId(), CONSTANT_RATE_LIMIT_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateRateLimitRuleResponse.class);
    }

    /**
     * createRoutingRules
     * 
     * @param request 入参结构体
     * @return CreateRoutingRulesResponse
     */
    public CreateRoutingRulesResponse createRoutingRules(CreateRoutingRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ROUTE, CONSTANT_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateRoutingRulesResponse.class);
    }

    /**
     * createSecurityGroup
     * 
     * @param request 入参结构体
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SECURITY_GROUP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSecurityGroupResponse.class);
    }

    /**
     * createSnatRule
     * 
     * @param request 入参结构体
     * @return CreateSnatRuleResponse
     */
    public CreateSnatRuleResponse createSnatRule(CreateSnatRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_SNAT_RULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSnatRuleResponse.class);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateVpnTunnelResponse.class);
    }

    /**
     * deleteAclRule
     * 
     * @param request 入参结构体
     */
    public void deleteAclRule(DeleteAclRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ACL, CONSTANT_RULE, request.getAclRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDnatRule
     * 
     * @param request 入参结构体
     */
    public void deleteDnatRule(DeleteDnatRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_DNAT_RULE, request.getRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteEniIp
     * 
     * @param request 入参结构体
     */
    public void deleteEniIp(DeleteEniIpRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ENI, request.getEniId(), CONSTANT_PRIVATE_IP, request.getPrivateIpAddress());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteEnterpriseSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void deleteEnterpriseSecurityGroup(DeleteEnterpriseSecurityGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ENTERPRISE, CONSTANT_SECURITY, request.getEnterpriseSecurityGroupId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteEnterpriseSecurityGroupRules
     * 
     * @param request 入参结构体
     */
    public void deleteEnterpriseSecurityGroupRules(DeleteEnterpriseSecurityGroupRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ENTERPRISE, CONSTANT_SECURITY, CONSTANT_RULE, request.getEnterpriseSecurityGroupRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteGatewayLimitRule
     * 
     * @param request 入参结构体
     */
    public void deleteGatewayLimitRule(DeleteGatewayLimitRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE, request.getGlrId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteHaVip
     * 
     * @param request 入参结构体
     */
    public void deleteHaVip(DeleteHaVipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_HAVIP, request.getHaVipId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIpGroup
     * 
     * @param request 入参结构体
     */
    public void deleteIpGroup(DeleteIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_IP_SET, request.getIpSetId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIpReserve
     * 
     * @param request 入参结构体
     */
    public void deleteIpReserve(DeleteIpReserveRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_SUBNET, CONSTANT_IPRESERVE, request.getIpReserveId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIpSet
     * 
     * @param request 入参结构体
     */
    public void deleteIpSet(DeleteIpSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_IP_GROUP, request.getIpGroupId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIpv6Gateway
     * 
     * @param request 入参结构体
     */
    public void deleteIpv6Gateway(DeleteIpv6GatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_I_PV6_GATEWAY, request.getGatewayId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIpv6GatewayEgressOnlyRule
     * 
     * @param request 入参结构体
     */
    public void deleteIpv6GatewayEgressOnlyRule(DeleteIpv6GatewayEgressOnlyRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        VERSION_V1,
                        CONSTANT_I_PV6_GATEWAY,
                        request.getGatewayId(),
                        CONSTANT_EGRESS_ONLY_RULE,
                        request.getEgressOnlyRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIpv6GatewayRateLimitRule
     * 
     * @param request 入参结构体
     */
    public void deleteIpv6GatewayRateLimitRule(DeleteIpv6GatewayRateLimitRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.DELETE,
                        VERSION_V1,
                        CONSTANT_I_PV6_GATEWAY,
                        request.getGatewayId(),
                        CONSTANT_RATE_LIMIT_RULE,
                        request.getRateLimitRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteProbe
     * 
     * @param request 入参结构体
     */
    public void deleteProbe(DeleteProbeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_PROBE, request.getProbeId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRoutingRules
     * 
     * @param request 入参结构体
     */
    public void deleteRoutingRules(DeleteRoutingRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ROUTE, CONSTANT_RULE, request.getRouteRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_SECURITY_GROUP, request.getSecurityGroupId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSecurityGroupRules
     * 
     * @param request 入参结构体
     */
    public void deleteSecurityGroupRules(DeleteSecurityGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_SECURITY_GROUP, CONSTANT_RULE, request.getSecurityGroupRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSnatRule
     * 
     * @param request 入参结构体
     */
    public void deleteSnatRule(DeleteSnatRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_SNAT_RULE, request.getRuleId());
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
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_SERVER, request.getSslVpnServerId());
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
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_USER, request.getUserId());
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_SUBNET, request.getSubnetId());
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW, request.getCgwId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteVpc
     * 
     * @param request 入参结构体
     */
    public void deleteVpc(DeleteVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPC, request.getVpcId());
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, CONSTANT_VPNCONN, request.getVpnConnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * detachEniInstance
     * 
     * @param request 入参结构体
     */
    public void detachEniInstance(DetachEniInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENI, request.getEniId());
        internalRequest.addParameter("detach", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getEniDetail
     * 
     * @param request 入参结构体
     * @return GetEniDetailResponse
     */
    public GetEniDetailResponse getEniDetail(GetEniDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ENI, request.getEniId());
        return invokeHttpClient(internalRequest, GetEniDetailResponse.class);
    }

    /**
     * getEniStatus
     * 
     * @param request 入参结构体
     * @return GetEniStatusResponse
     */
    public GetEniStatusResponse getEniStatus(GetEniStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ENI, request.getEniId(), CONSTANT_STATUS);
        return invokeHttpClient(internalRequest, GetEniStatusResponse.class);
    }

    /**
     * getHaVipDetail
     * 
     * @param request 入参结构体
     * @return GetHaVipDetailResponse
     */
    public GetHaVipDetailResponse getHaVipDetail(GetHaVipDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_HAVIP, request.getHaVipId());
        return invokeHttpClient(internalRequest, GetHaVipDetailResponse.class);
    }

    /**
     * getNat
     * 
     * @param request 入参结构体
     * @return GetNatResponse
     */
    public GetNatResponse getNat(GetNatRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_NAT, request.getNatId());
        return invokeHttpClient(internalRequest, GetNatResponse.class);
    }

    /**
     * getPeerConn
     * 
     * @param request 入参结构体
     * @return GetPeerConnResponse
     */
    public GetPeerConnResponse getPeerConn(GetPeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        if (request.getRole() != null) {
            internalRequest.addParameter("role", request.getRole());
        }
        return invokeHttpClient(internalRequest, GetPeerConnResponse.class);
    }

    /**
     * getProbeDetail
     * 
     * @param request 入参结构体
     * @return GetProbeDetailResponse
     */
    public GetProbeDetailResponse getProbeDetail(GetProbeDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PROBE, request.getProbeId());
        return invokeHttpClient(internalRequest, GetProbeDetailResponse.class);
    }

    /**
     * getSecurityGroupDetails
     * 
     * @param request 入参结构体
     * @return GetSecurityGroupDetailsResponse
     */
    public GetSecurityGroupDetailsResponse getSecurityGroupDetails(GetSecurityGroupDetailsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SECURITY_GROUP, request.getSecurityGroupId());
        return invokeHttpClient(internalRequest, GetSecurityGroupDetailsResponse.class);
    }

    /**
     * getVpcResourceIpInfo
     * 
     * @param request 入参结构体
     * @return GetVpcResourceIpInfoResponse
     */
    public GetVpcResourceIpInfoResponse getVpcResourceIpInfo(GetVpcResourceIpInfoRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, CONSTANT_RESOURCE_IP);
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
     * listDnatRule
     * 
     * @param request 入参结构体
     * @return ListDnatRuleResponse
     */
    public ListDnatRuleResponse listDnatRule(ListDnatRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_DNAT_RULE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListDnatRuleResponse.class);
    }

    /**
     * listEgressOnlyRule
     * 
     * @param request 入参结构体
     * @return ListEgressOnlyRuleResponse
     */
    public ListEgressOnlyRuleResponse listEgressOnlyRule(ListEgressOnlyRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_I_PV6_GATEWAY, request.getGatewayId(), CONSTANT_EGRESS_ONLY_RULE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListEgressOnlyRuleResponse.class);
    }

    /**
     * listEni
     * 
     * @param request 入参结构体
     * @return ListEniResponse
     */
    public ListEniResponse listEni(ListEniRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ENI);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getPrivateIpAddress() != null && !request.getPrivateIpAddress().isEmpty()) {
            internalRequest.addParameter("privateIpAddress", String.join(",", request.getPrivateIpAddress()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListEniResponse.class);
    }

    /**
     * listHaVip
     * 
     * @param request 入参结构体
     * @return ListHaVipResponse
     */
    public ListHaVipResponse listHaVip(ListHaVipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_HAVIP);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListHaVipResponse.class);
    }

    /**
     * listIpReserve
     * 
     * @param request 入参结构体
     * @return ListIpReserveResponse
     */
    public ListIpReserveResponse listIpReserve(ListIpReserveRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SUBNET, CONSTANT_IPRESERVE);
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
     * listNat
     * 
     * @param request 入参结构体
     * @return ListNatResponse
     */
    public ListNatResponse listNat(ListNatRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_NAT);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getNatId() != null) {
            internalRequest.addParameter("natId", request.getNatId());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getIp() != null) {
            internalRequest.addParameter("ip", request.getIp());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListNatResponse.class);
    }

    /**
     * listPeerConn
     * 
     * @param request 入参结构体
     * @return ListPeerConnResponse
     */
    public ListPeerConnResponse listPeerConn(ListPeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PEERCONN);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListPeerConnResponse.class);
    }

    /**
     * listProbes
     * 
     * @param request 入参结构体
     * @return ListProbesResponse
     */
    public ListProbesResponse listProbes(ListProbesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PROBE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListProbesResponse.class);
    }

    /**
     * listRateLimitRule
     * 
     * @param request 入参结构体
     * @return ListRateLimitRuleResponse
     */
    public ListRateLimitRuleResponse listRateLimitRule(ListRateLimitRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_I_PV6_GATEWAY, request.getGatewayId(), CONSTANT_RATE_LIMIT_RULE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListRateLimitRuleResponse.class);
    }

    /**
     * listSnatRule
     * 
     * @param request 入参结构体
     * @return ListSnatRuleResponse
     */
    public ListSnatRuleResponse listSnatRule(ListSnatRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_SNAT_RULE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListSnatRuleResponse.class);
    }

    /**
     * modifyGatewayLimitRules
     * 
     * @param request 入参结构体
     */
    public void modifyGatewayLimitRules(ModifyGatewayLimitRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE, request.getGlrId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyNat
     * 
     * @param request 入参结构体
     */
    public void modifyNat(ModifyNatRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * natBindEip
     * 
     * @param request 入参结构体
     */
    public void natBindEip(NatBindEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * natUnBindEip
     * 
     * @param request 入参结构体
     */
    public void natUnBindEip(NatUnBindEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * openPeerConnSyncDns
     * 
     * @param request 入参结构体
     */
    public void openPeerConnSyncDns(OpenPeerConnSyncDnsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        internalRequest.addParameter("open", null);
        if (request.getRole() != null) {
            internalRequest.addParameter("role", request.getRole());
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * openVpcRelay
     * 
     * @param request 入参结构体
     */
    public void openVpcRelay(OpenVpcRelayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPC, CONSTANT_OPEN_RELAY, request.getVpcId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * purchaseReservedNat
     * 
     * @param request 入参结构体
     */
    public void purchaseReservedNat(PurchaseReservedNatRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryAcl
     * 
     * @param request 入参结构体
     * @return QueryAclResponse
     */
    public QueryAclResponse queryAcl(QueryAclRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ACL);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        return invokeHttpClient(internalRequest, QueryAclResponse.class);
    }

    /**
     * queryAclRules
     * 
     * @param request 入参结构体
     * @return QueryAclRulesResponse
     */
    public QueryAclRulesResponse queryAclRules(QueryAclRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ACL, CONSTANT_RULE);
        if (request.getSubnetId() != null) {
            internalRequest.addParameter("subnetId", request.getSubnetId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryAclRulesResponse.class);
    }

    /**
     * queryEnterpriseSecurityGroupList
     * 
     * @param request 入参结构体
     * @return QueryEnterpriseSecurityGroupListResponse
     */
    public QueryEnterpriseSecurityGroupListResponse queryEnterpriseSecurityGroupList(QueryEnterpriseSecurityGroupListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ENTERPRISE, CONSTANT_SECURITY);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        return invokeHttpClient(internalRequest, QueryEnterpriseSecurityGroupListResponse.class);
    }

    /**
     * queryIpGroupDetail
     * 
     * @param request 入参结构体
     * @return QueryIpGroupDetailResponse
     */
    public QueryIpGroupDetailResponse queryIpGroupDetail(QueryIpGroupDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_IP_SET, request.getIpSetId());
        return invokeHttpClient(internalRequest, QueryIpGroupDetailResponse.class);
    }

    /**
     * queryIpGroupList
     * 
     * @param request 入参结构体
     * @return QueryIpGroupListResponse
     */
    public QueryIpGroupListResponse queryIpGroupList(QueryIpGroupListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_IP_SET);
        if (request.getIpVersion() != null) {
            internalRequest.addParameter("ipVersion", request.getIpVersion());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryIpGroupListResponse.class);
    }

    /**
     * queryIpSetDetail
     * 
     * @param request 入参结构体
     * @return QueryIpSetDetailResponse
     */
    public QueryIpSetDetailResponse queryIpSetDetail(QueryIpSetDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_IP_GROUP, request.getIpGroupId());
        return invokeHttpClient(internalRequest, QueryIpSetDetailResponse.class);
    }

    /**
     * queryIpSetList
     * 
     * @param request 入参结构体
     * @return QueryIpSetListResponse
     */
    public QueryIpSetListResponse queryIpSetList(QueryIpSetListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_IP_GROUP);
        if (request.getIpVersion() != null) {
            internalRequest.addParameter("ipVersion", request.getIpVersion());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryIpSetListResponse.class);
    }

    /**
     * queryIpv6Gateway
     * 
     * @param request 入参结构体
     * @return QueryIpv6GatewayResponse
     */
    public QueryIpv6GatewayResponse queryIpv6Gateway(QueryIpv6GatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_I_PV6_GATEWAY);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        return invokeHttpClient(internalRequest, QueryIpv6GatewayResponse.class);
    }

    /**
     * queryRoutingRules
     * 
     * @param request 入参结构体
     * @return QueryRoutingRulesResponse
     */
    public QueryRoutingRulesResponse queryRoutingRules(QueryRoutingRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ROUTE, CONSTANT_RULE);
        if (request.getRouteTableId() != null) {
            internalRequest.addParameter("routeTableId", request.getRouteTableId());
        }
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryRoutingRulesResponse.class);
    }

    /**
     * queryRoutingTable
     * 
     * @param request 入参结构体
     * @return QueryRoutingTableResponse
     */
    public QueryRoutingTableResponse queryRoutingTable(QueryRoutingTableRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ROUTE);
        if (request.getRouteTableId() != null) {
            internalRequest.addParameter("routeTableId", request.getRouteTableId());
        }
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        return invokeHttpClient(internalRequest, QueryRoutingTableResponse.class);
    }

    /**
     * querySecurityGroupsList
     * 
     * @param request 入参结构体
     * @return QuerySecurityGroupsListResponse
     */
    public QuerySecurityGroupsListResponse querySecurityGroupsList(QuerySecurityGroupsListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SECURITY_GROUP);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getSecurityGroupId() != null) {
            internalRequest.addParameter("securityGroupId", request.getSecurityGroupId());
        }
        if (request.getSecurityGroupIds() != null) {
            internalRequest.addParameter("securityGroupIds", request.getSecurityGroupIds());
        }
        return invokeHttpClient(internalRequest, QuerySecurityGroupsListResponse.class);
    }

    /**
     * querySpecifiedSubnet
     * 
     * @param request 入参结构体
     * @return QuerySpecifiedSubnetResponse
     */
    public QuerySpecifiedSubnetResponse querySpecifiedSubnet(QuerySpecifiedSubnetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SUBNET, request.getSubnetId());
        return invokeHttpClient(internalRequest, QuerySpecifiedSubnetResponse.class);
    }

    /**
     * querySpecifiedVpc
     * 
     * @param request 入参结构体
     * @return QuerySpecifiedVpcResponse
     */
    public QuerySpecifiedVpcResponse querySpecifiedVpc(QuerySpecifiedVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, request.getVpcId());
        return invokeHttpClient(internalRequest, QuerySpecifiedVpcResponse.class);
    }

    /**
     * querySslVpnServer
     * 
     * @param request 入参结构体
     * @return QuerySslVpnServerResponse
     */
    public QuerySslVpnServerResponse querySslVpnServer(QuerySslVpnServerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_SERVER);
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, request.getVpnId(), CONSTANT_SSL_VPN_USER);
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SUBNET);
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
     * queryTheDetailsOfTheDedicatedGateway
     * 
     * @param request 入参结构体
     * @return QueryTheDetailsOfTheDedicatedGatewayResponse
     */
    public QueryTheDetailsOfTheDedicatedGatewayResponse queryTheDetailsOfTheDedicatedGateway(QueryTheDetailsOfTheDedicatedGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ET_GATEWAY, request.getEtGatewayId());
        return invokeHttpClient(internalRequest, QueryTheDetailsOfTheDedicatedGatewayResponse.class);
    }

    /**
     * queryTheListOfDedicatedLineGateways
     * 
     * @param request 入参结构体
     * @return QueryTheListOfDedicatedLineGatewaysResponse
     */
    public QueryTheListOfDedicatedLineGatewaysResponse queryTheListOfDedicatedLineGateways(QueryTheListOfDedicatedLineGatewaysRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ET_GATEWAY);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getEtGatewayId() != null) {
            internalRequest.addParameter("etGatewayId", request.getEtGatewayId());
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
        return invokeHttpClient(internalRequest, QueryTheListOfDedicatedLineGatewaysResponse.class);
    }

    /**
     * queryVpcIntranetIp
     * 
     * @param request 入参结构体
     * @return QueryVpcIntranetIpResponse
     */
    public QueryVpcIntranetIpResponse queryVpcIntranetIp(QueryVpcIntranetIpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPC, request.getVpcId(), CONSTANT_PRIVATE_IP_ADDRESS_INFO);
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPC);
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPN);
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
     * refundPeerConn
     * 
     * @param request 入参结构体
     */
    public void refundPeerConn(RefundPeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        internalRequest.addParameter("refund", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * rejectPeerConn
     * 
     * @param request 入参结构体
     */
    public void rejectPeerConn(RejectPeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        internalRequest.addParameter("reject", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseDedicatedGateway
     * 
     * @param request 入参结构体
     */
    public void releaseDedicatedGateway(ReleaseDedicatedGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ET_GATEWAY, request.getEtGatewayId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseNat
     * 
     * @param request 入参结构体
     */
    public void releaseNat(ReleaseNatRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_NAT, request.getNatId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releasePeerConn
     * 
     * @param request 入参结构体
     */
    public void releasePeerConn(ReleasePeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseVpn
     * 
     * @param request 入参结构体
     */
    public void releaseVpn(ReleaseVpnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeEni
     * 
     * @param request 入参结构体
     */
    public void removeEni(RemoveEniRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ENI, request.getEniId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeIpAddressFromIpGroup
     * 
     * @param request 入参结构体
     */
    public void removeIpAddressFromIpGroup(RemoveIpAddressFromIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IP_SET, request.getIpSetId(), CONSTANT_DELETE_IP_ADDRESS);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeIpGroupFromIpSet
     * 
     * @param request 入参结构体
     */
    public void removeIpGroupFromIpSet(RemoveIpGroupFromIpSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_IP_GROUP, request.getIpGroupId(), CONSTANT_UNBIND_IP_SET);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renewPeerConn
     * 
     * @param request 入参结构体
     */
    public void renewPeerConn(RenewPeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resizeIpv6Gateway
     * 
     * @param request 入参结构体
     */
    public void resizeIpv6Gateway(ResizeIpv6GatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_I_PV6_GATEWAY, request.getGatewayId());
        internalRequest.addParameter("resize", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resizeNat
     * 
     * @param request 入参结构体
     */
    public void resizeNat(ResizeNatRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId());
        internalRequest.addParameter("resize", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * revokeSecurityGroupRules
     * 
     * @param request 入参结构体
     */
    public void revokeSecurityGroupRules(RevokeSecurityGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SECURITY_GROUP, request.getSecurityGroupId());
        internalRequest.addParameter("revokeRule", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * searchForVpnDetails
     * 
     * @param request 入参结构体
     * @return SearchForVpnDetailsResponse
     */
    public SearchForVpnDetailsResponse searchForVpnDetails(SearchForVpnDetailsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        return invokeHttpClient(internalRequest, SearchForVpnDetailsResponse.class);
    }

    /**
     * searchVpnTunnel
     * 
     * @param request 入参结构体
     * @return SearchVpnTunnelResponse
     */
    public SearchVpnTunnelResponse searchVpnTunnel(SearchVpnTunnelRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, CONSTANT_VPNCONN, request.getVpnId());
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
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VPN, request.getVpnId());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindEniEip
     * 
     * @param request 入参结构体
     */
    public void unbindEniEip(UnbindEniEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENI, request.getEniId());
        internalRequest.addParameter("unBind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindHaVipEip
     * 
     * @param request 入参结构体
     */
    public void unbindHaVipEip(UnbindHaVipEipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_HAVIP, request.getHaVipId());
        internalRequest.addParameter("unbindPublicIp", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindHaVipInstance
     * 
     * @param request 入参结构体
     */
    public void unbindHaVipInstance(UnbindHaVipInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_HAVIP, request.getHaVipId());
        internalRequest.addParameter("detach", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindPhysicalDedicatedLine
     * 
     * @param request 入参结构体
     */
    public void unbindPhysicalDedicatedLine(UnbindPhysicalDedicatedLineRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET_GATEWAY, request.getEtGatewayId());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAclRules
     * 
     * @param request 入参结构体
     */
    public void updateAclRules(UpdateAclRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ACL, CONSTANT_RULE, request.getAclRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDedicatedGateway
     * 
     * @param request 入参结构体
     */
    public void updateDedicatedGateway(UpdateDedicatedGatewayRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ET_GATEWAY, request.getEtGatewayId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDeleteProtect
     * 
     * @param request 入参结构体
     */
    public void updateDeleteProtect(UpdateDeleteProtectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_I_PV6_GATEWAY, request.getGatewayId(), CONSTANT_DELETE_PROTECT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDnatRule
     * 
     * @param request 入参结构体
     */
    public void updateDnatRule(UpdateDnatRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_DNAT_RULE, request.getRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateEni
     * 
     * @param request 入参结构体
     */
    public void updateEni(UpdateEniRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENI, request.getEniId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateEniEnterpriseSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void updateEniEnterpriseSecurityGroup(UpdateEniEnterpriseSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENI, request.getEniId());
        internalRequest.addParameter("bindEsg", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateEniSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void updateEniSecurityGroup(UpdateEniSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENI, request.getEniId());
        internalRequest.addParameter("bindSg", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateEnterpriseSecurityGroupRules
     * 
     * @param request 入参结构体
     */
    public void updateEnterpriseSecurityGroupRules(UpdateEnterpriseSecurityGroupRulesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ENTERPRISE, CONSTANT_SECURITY, CONSTANT_RULE, request.getEnterpriseSecurityGroupRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateHaVip
     * 
     * @param request 入参结构体
     */
    public void updateHaVip(UpdateHaVipRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_HAVIP, request.getHaVipId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateIpGroup
     * 
     * @param request 入参结构体
     */
    public void updateIpGroup(UpdateIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_IP_SET, request.getIpSetId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateIpSet
     * 
     * @param request 入参结构体
     */
    public void updateIpSet(UpdateIpSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_IP_GROUP, request.getIpGroupId());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateNatReleaseProtectionSwitch
     * 
     * @param request 入参结构体
     */
    public void updateNatReleaseProtectionSwitch(UpdateNatReleaseProtectionSwitchRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_DELETE_PROTECT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updatePeerConn
     * 
     * @param request 入参结构体
     */
    public void updatePeerConn(UpdatePeerConnRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updatePeerConnBandwidth
     * 
     * @param request 入参结构体
     */
    public void updatePeerConnBandwidth(UpdatePeerConnBandwidthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId());
        internalRequest.addParameter("resize", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updatePeerConnDeleteProtect
     * 
     * @param request 入参结构体
     */
    public void updatePeerConnDeleteProtect(UpdatePeerConnDeleteProtectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PEERCONN, request.getPeerConnId(), CONSTANT_DELETE_PROTECT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateProbe
     * 
     * @param request 入参结构体
     */
    public void updateProbe(UpdateProbeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PROBE, request.getProbeId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRateLimitRule
     * 
     * @param request 入参结构体
     */
    public void updateRateLimitRule(UpdateRateLimitRuleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        VERSION_V1,
                        CONSTANT_I_PV6_GATEWAY,
                        request.getGatewayId(),
                        CONSTANT_RATE_LIMIT_RULE,
                        request.getRateLimitRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRoutingRules
     * 
     * @param request 入参结构体
     */
    public void updateRoutingRules(UpdateRoutingRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ROUTE, CONSTANT_RULE, request.getRouteRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSecurityGroupRules
     * 
     * @param request 入参结构体
     */
    public void updateSecurityGroupRules(UpdateSecurityGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SECURITY_GROUP, CONSTANT_RULE, CONSTANT_UPDATE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSnatRule
     * 
     * @param request 入参结构体
     */
    public void updateSnatRule(UpdateSnatRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_NAT, request.getNatId(), CONSTANT_SNAT_RULE, request.getRuleId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * userGatewayDetails
     * 
     * @param request 入参结构体
     * @return UserGatewayDetailsResponse
     */
    public UserGatewayDetailsResponse userGatewayDetails(UserGatewayDetailsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW, request.getCgwId());
        return invokeHttpClient(internalRequest, UserGatewayDetailsResponse.class);
    }

    /**
     * userGatewayList
     * 
     * @param request 入参结构体
     * @return UserGatewayListResponse
     */
    public UserGatewayListResponse userGatewayList(UserGatewayListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VPN, CONSTANT_CGW);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, UserGatewayListResponse.class);
    }

    /**
     * viewGatewayLimitRules
     * 
     * @param request 入参结构体
     * @return ViewGatewayLimitRulesResponse
     */
    public ViewGatewayLimitRulesResponse viewGatewayLimitRules(ViewGatewayLimitRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE);
        if (request.getServiceType() != null) {
            internalRequest.addParameter("serviceType", request.getServiceType());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getGlrId() != null) {
            internalRequest.addParameter("glrId", request.getGlrId());
        }
        if (request.getResourceId() != null) {
            internalRequest.addParameter("resourceId", request.getResourceId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", request.getMaxKeys());
        }
        return invokeHttpClient(internalRequest, ViewGatewayLimitRulesResponse.class);
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
