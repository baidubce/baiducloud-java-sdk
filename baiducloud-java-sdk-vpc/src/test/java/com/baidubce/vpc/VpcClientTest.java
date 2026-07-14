package com.baidubce.vpc;

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
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for VpcClient
 */
public class VpcClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private VpcClient vpcClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        vpcClient = new VpcClient(config);
    }

    /**
     * acceptPeerConn
     *
     */
    @Test
    public void acceptPeerConnTest() {
        AcceptPeerConnRequest acceptPeerConnRequest = new AcceptPeerConnRequest();
        acceptPeerConnRequest.setPeerConnId("");
        acceptPeerConnRequest.setClientToken("");
        vpcClient.acceptPeerConn(acceptPeerConnRequest);
    }
    /**
     * activeStandbySwitchover
     *
     */
    @Test
    public void activeStandbySwitchoverTest() {
        ActiveStandbySwitchoverRequest activeStandbySwitchoverRequest = new ActiveStandbySwitchoverRequest();
        activeStandbySwitchoverRequest.setRouteRuleId("");
        activeStandbySwitchoverRequest.setClientToken("");
        vpcClient.activeStandbySwitchover(activeStandbySwitchoverRequest);
    }
    /**
     * addAclRule
     *
     */
    @Test
    public void addAclRuleTest() {
        AddAclRuleRequest addAclRuleRequest = new AddAclRuleRequest();
        addAclRuleRequest.setClientToken("");
        addAclRuleRequest.setAclRules(new ArrayList<>());
        vpcClient.addAclRule(addAclRuleRequest);
    }
    /**
     * addEniIp
     *
     */
    @Test
    public void addEniIpTest() {
        AddEniIpRequest addEniIpRequest = new AddEniIpRequest();
        addEniIpRequest.setEniId("");
        addEniIpRequest.setClientToken("");
        addEniIpRequest.setIsIpv6(false);
        addEniIpRequest.setPrivateIpAddress("");
        AddEniIpResponse response = vpcClient.addEniIp(addEniIpRequest);
        System.out.println(response);
    }
    /**
     * addIpAddressToIpGroup
     *
     */
    @Test
    public void addIpAddressToIpGroupTest() {
        AddIpAddressToIpGroupRequest addIpAddressToIpGroupRequest = new AddIpAddressToIpGroupRequest();
        addIpAddressToIpGroupRequest.setIpSetId("");
        addIpAddressToIpGroupRequest.setClientToken("");
        addIpAddressToIpGroupRequest.setIpAddressInfo(new ArrayList<>());
        vpcClient.addIpAddressToIpGroup(addIpAddressToIpGroupRequest);
    }
    /**
     * addIpGroupToIpSet
     *
     */
    @Test
    public void addIpGroupToIpSetTest() {
        AddIpGroupToIpSetRequest addIpGroupToIpSetRequest = new AddIpGroupToIpSetRequest();
        addIpGroupToIpSetRequest.setIpGroupId("");
        addIpGroupToIpSetRequest.setClientToken("");
        addIpGroupToIpSetRequest.setIpSetIds(new ArrayList<>());
        vpcClient.addIpGroupToIpSet(addIpGroupToIpSetRequest);
    }
    /**
     * attachEniInstance
     *
     */
    @Test
    public void attachEniInstanceTest() {
        AttachEniInstanceRequest attachEniInstanceRequest = new AttachEniInstanceRequest();
        attachEniInstanceRequest.setEniId("");
        attachEniInstanceRequest.setClientToken("");
        attachEniInstanceRequest.setInstanceId("");
        attachEniInstanceRequest.setInstanceType("");
        vpcClient.attachEniInstance(attachEniInstanceRequest);
    }
    /**
     * authorizeEnterpriseSecurityGroupRules
     *
     */
    @Test
    public void authorizeEnterpriseSecurityGroupRulesTest() {
        AuthorizeEnterpriseSecurityGroupRulesRequest authorizeEnterpriseSecurityGroupRulesRequest = new AuthorizeEnterpriseSecurityGroupRulesRequest();
        authorizeEnterpriseSecurityGroupRulesRequest.setEnterpriseSecurityGroupId("");
        authorizeEnterpriseSecurityGroupRulesRequest.setClientToken("");
        authorizeEnterpriseSecurityGroupRulesRequest.setRules(new ArrayList<>());
        vpcClient.authorizeEnterpriseSecurityGroupRules(authorizeEnterpriseSecurityGroupRulesRequest);
    }
    /**
     * authorizeSecurityGroupRules
     *
     */
    @Test
    public void authorizeSecurityGroupRulesTest() {
        AuthorizeSecurityGroupRulesRequest authorizeSecurityGroupRulesRequest = new AuthorizeSecurityGroupRulesRequest();
        authorizeSecurityGroupRulesRequest.setSecurityGroupId("");
        authorizeSecurityGroupRulesRequest.setSgVersion(0L);
        authorizeSecurityGroupRulesRequest.setClientToken("");
        authorizeSecurityGroupRulesRequest.setRule(null);
        vpcClient.authorizeSecurityGroupRules(authorizeSecurityGroupRulesRequest);
    }
    /**
     * batchAddDnatRules
     *
     */
    @Test
    public void batchAddDnatRulesTest() {
        BatchAddDnatRulesRequest batchAddDnatRulesRequest = new BatchAddDnatRulesRequest();
        batchAddDnatRulesRequest.setNatId("");
        batchAddDnatRulesRequest.setClientToken("");
        batchAddDnatRulesRequest.setRules(new ArrayList<>());
        BatchAddDnatRulesResponse response = vpcClient.batchAddDnatRules(batchAddDnatRulesRequest);
        System.out.println(response);
    }
    /**
     * batchAddEniIp
     *
     */
    @Test
    public void batchAddEniIpTest() {
        BatchAddEniIpRequest batchAddEniIpRequest = new BatchAddEniIpRequest();
        batchAddEniIpRequest.setEniId("");
        batchAddEniIpRequest.setClientToken("");
        batchAddEniIpRequest.setIsIpv6(false);
        batchAddEniIpRequest.setPrivateIpAddresses(new ArrayList<>());
        batchAddEniIpRequest.setPrivateIpAddressCount(0);
        BatchAddEniIpResponse response = vpcClient.batchAddEniIp(batchAddEniIpRequest);
        System.out.println(response);
    }
    /**
     * batchAddSnatRules
     *
     */
    @Test
    public void batchAddSnatRulesTest() {
        BatchAddSnatRulesRequest batchAddSnatRulesRequest = new BatchAddSnatRulesRequest();
        batchAddSnatRulesRequest.setClientToken("");
        batchAddSnatRulesRequest.setNatId("");
        batchAddSnatRulesRequest.setSnatRules(new ArrayList<>());
        BatchAddSnatRulesResponse response = vpcClient.batchAddSnatRules(batchAddSnatRulesRequest);
        System.out.println(response);
    }
    /**
     * batchCreateSslVpnUsers
     *
     */
    @Test
    public void batchCreateSslVpnUsersTest() {
        BatchCreateSslVpnUsersRequest batchCreateSslVpnUsersRequest = new BatchCreateSslVpnUsersRequest();
        batchCreateSslVpnUsersRequest.setVpnId("");
        batchCreateSslVpnUsersRequest.setClientToken("");
        batchCreateSslVpnUsersRequest.setSslVpnUsers(new ArrayList<>());
        BatchCreateSslVpnUsersResponse response = vpcClient.batchCreateSslVpnUsers(batchCreateSslVpnUsersRequest);
        System.out.println(response);
    }
    /**
     * batchDeleteEniIp
     *
     */
    @Test
    public void batchDeleteEniIpTest() {
        BatchDeleteEniIpRequest batchDeleteEniIpRequest = new BatchDeleteEniIpRequest();
        batchDeleteEniIpRequest.setEniId("");
        batchDeleteEniIpRequest.setClientToken("");
        batchDeleteEniIpRequest.setPrivateIpAddresses(new ArrayList<>());
        vpcClient.batchDeleteEniIp(batchDeleteEniIpRequest);
    }
    /**
     * bindEip
     *
     */
    @Test
    public void bindEipTest() {
        BindEipRequest bindEipRequest = new BindEipRequest();
        bindEipRequest.setVpnId("");
        bindEipRequest.setClientToken("");
        bindEipRequest.setEip("");
        vpcClient.bindEip(bindEipRequest);
    }
    /**
     * bindEniEip
     *
     */
    @Test
    public void bindEniEipTest() {
        BindEniEipRequest bindEniEipRequest = new BindEniEipRequest();
        bindEniEipRequest.setEniId("");
        bindEniEipRequest.setClientToken("");
        bindEniEipRequest.setPrivateIpAddress("");
        bindEniEipRequest.setPublicIpAddress("");
        vpcClient.bindEniEip(bindEniEipRequest);
    }
    /**
     * bindHaVipEip
     *
     */
    @Test
    public void bindHaVipEipTest() {
        BindHaVipEipRequest bindHaVipEipRequest = new BindHaVipEipRequest();
        bindHaVipEipRequest.setHaVipId("");
        bindHaVipEipRequest.setClientToken("");
        bindHaVipEipRequest.setPublicIpAddress("");
        vpcClient.bindHaVipEip(bindHaVipEipRequest);
    }
    /**
     * bindHaVipInstance
     *
     */
    @Test
    public void bindHaVipInstanceTest() {
        BindHaVipInstanceRequest bindHaVipInstanceRequest = new BindHaVipInstanceRequest();
        bindHaVipInstanceRequest.setHaVipId("");
        bindHaVipInstanceRequest.setClientToken("");
        bindHaVipInstanceRequest.setInstanceIds(new ArrayList<>());
        bindHaVipInstanceRequest.setInstanceType("");
        vpcClient.bindHaVipInstance(bindHaVipInstanceRequest);
    }
    /**
     * bindPhysicalDedicatedLine
     *
     */
    @Test
    public void bindPhysicalDedicatedLineTest() {
        BindPhysicalDedicatedLineRequest bindPhysicalDedicatedLineRequest = new BindPhysicalDedicatedLineRequest();
        bindPhysicalDedicatedLineRequest.setEtGatewayId("");
        bindPhysicalDedicatedLineRequest.setClientToken("");
        bindPhysicalDedicatedLineRequest.setEtId("");
        bindPhysicalDedicatedLineRequest.setChannelId("");
        bindPhysicalDedicatedLineRequest.setLocalCidrs(new ArrayList<>());
        vpcClient.bindPhysicalDedicatedLine(bindPhysicalDedicatedLineRequest);
    }
    /**
     * closePeerConnSyncDns
     *
     */
    @Test
    public void closePeerConnSyncDnsTest() {
        ClosePeerConnSyncDnsRequest closePeerConnSyncDnsRequest = new ClosePeerConnSyncDnsRequest();
        closePeerConnSyncDnsRequest.setPeerConnId("");
        closePeerConnSyncDnsRequest.setRole("");
        closePeerConnSyncDnsRequest.setClientToken("");
        vpcClient.closePeerConnSyncDns(closePeerConnSyncDnsRequest);
    }
    /**
     * closeVpcRelay
     *
     */
    @Test
    public void closeVpcRelayTest() {
        CloseVpcRelayRequest closeVpcRelayRequest = new CloseVpcRelayRequest();
        closeVpcRelayRequest.setVpcId("");
        closeVpcRelayRequest.setClientToken("");
        vpcClient.closeVpcRelay(closeVpcRelayRequest);
    }
    /**
     * createDedicatedGateway
     *
     */
    @Test
    public void createDedicatedGatewayTest() {
        CreateDedicatedGatewayRequest createDedicatedGatewayRequest = new CreateDedicatedGatewayRequest();
        createDedicatedGatewayRequest.setClientToken("");
        createDedicatedGatewayRequest.setName("");
        createDedicatedGatewayRequest.setVpcId("");
        createDedicatedGatewayRequest.setSpeed(0);
        createDedicatedGatewayRequest.setDescription("");
        createDedicatedGatewayRequest.setEtId("");
        createDedicatedGatewayRequest.setChannelId("");
        createDedicatedGatewayRequest.setLocalCidrs(new ArrayList<>());
        createDedicatedGatewayRequest.setTags(new ArrayList<>());
        createDedicatedGatewayRequest.setResourceGroupId("");
        CreateDedicatedGatewayResponse response = vpcClient.createDedicatedGateway(createDedicatedGatewayRequest);
        System.out.println(response);
    }
    /**
     * createDedicatedGatewayHealthCheck
     *
     */
    @Test
    public void createDedicatedGatewayHealthCheckTest() {
        CreateDedicatedGatewayHealthCheckRequest createDedicatedGatewayHealthCheckRequest = new CreateDedicatedGatewayHealthCheckRequest();
        createDedicatedGatewayHealthCheckRequest.setEtGatewayId("");
        createDedicatedGatewayHealthCheckRequest.setClientToken("");
        createDedicatedGatewayHealthCheckRequest.setDcphyId("");
        createDedicatedGatewayHealthCheckRequest.setChannelId("");
        createDedicatedGatewayHealthCheckRequest.setSubnetId("");
        createDedicatedGatewayHealthCheckRequest.setHealthCheckSourceIp("");
        createDedicatedGatewayHealthCheckRequest.setHealthCheckType("");
        createDedicatedGatewayHealthCheckRequest.setHealthCheckInterval(0);
        createDedicatedGatewayHealthCheckRequest.setHealthThreshold(0);
        createDedicatedGatewayHealthCheckRequest.setUnhealthThreshold(0);
        createDedicatedGatewayHealthCheckRequest.setAutoGenerateRouteRule(false);
        vpcClient.createDedicatedGatewayHealthCheck(createDedicatedGatewayHealthCheckRequest);
    }
    /**
     * createDnatRule
     *
     */
    @Test
    public void createDnatRuleTest() {
        CreateDnatRuleRequest createDnatRuleRequest = new CreateDnatRuleRequest();
        createDnatRuleRequest.setNatId("");
        createDnatRuleRequest.setClientToken("");
        createDnatRuleRequest.setRuleName("");
        createDnatRuleRequest.setPublicIpAddress("");
        createDnatRuleRequest.setPrivateIpAddress("");
        createDnatRuleRequest.setProtocol("");
        createDnatRuleRequest.setPublicPort(0);
        createDnatRuleRequest.setPrivatePort(0);
        createDnatRuleRequest.setPublicPortRange("");
        createDnatRuleRequest.setPrivatePortRange("");
        CreateDnatRuleResponse response = vpcClient.createDnatRule(createDnatRuleRequest);
        System.out.println(response);
    }
    /**
     * createEgressOnlyRule
     *
     */
    @Test
    public void createEgressOnlyRuleTest() {
        CreateEgressOnlyRuleRequest createEgressOnlyRuleRequest = new CreateEgressOnlyRuleRequest();
        createEgressOnlyRuleRequest.setGatewayId("");
        createEgressOnlyRuleRequest.setClientToken("");
        createEgressOnlyRuleRequest.setCidr("");
        CreateEgressOnlyRuleResponse response = vpcClient.createEgressOnlyRule(createEgressOnlyRuleRequest);
        System.out.println(response);
    }
    /**
     * createEni
     *
     */
    @Test
    public void createEniTest() {
        CreateEniRequest createEniRequest = new CreateEniRequest();
        createEniRequest.setClientToken("");
        createEniRequest.setName("");
        createEniRequest.setSubnetId("");
        createEniRequest.setSecurityGroupIds(new ArrayList<>());
        createEniRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        createEniRequest.setPrivateIpSet(new ArrayList<>());
        createEniRequest.setIpv6PrivateIpSet(new ArrayList<>());
        createEniRequest.setDescription("");
        createEniRequest.setNetworkInterfaceTrafficMode("");
        CreateEniResponse response = vpcClient.createEni(createEniRequest);
        System.out.println(response);
    }
    /**
     * createEnterpriseSecurityGroup
     *
     */
    @Test
    public void createEnterpriseSecurityGroupTest() {
        CreateEnterpriseSecurityGroupRequest createEnterpriseSecurityGroupRequest = new CreateEnterpriseSecurityGroupRequest();
        createEnterpriseSecurityGroupRequest.setClientToken("");
        createEnterpriseSecurityGroupRequest.setName("");
        createEnterpriseSecurityGroupRequest.setDesc("");
        createEnterpriseSecurityGroupRequest.setRules(new ArrayList<>());
        createEnterpriseSecurityGroupRequest.setTags(new ArrayList<>());
        CreateEnterpriseSecurityGroupResponse response = vpcClient.createEnterpriseSecurityGroup(createEnterpriseSecurityGroupRequest);
        System.out.println(response);
    }
    /**
     * createGatewayLimitRules
     *
     */
    @Test
    public void createGatewayLimitRulesTest() {
        CreateGatewayLimitRulesRequest createGatewayLimitRulesRequest = new CreateGatewayLimitRulesRequest();
        createGatewayLimitRulesRequest.setClientToken("");
        createGatewayLimitRulesRequest.setIpVersion("");
        createGatewayLimitRulesRequest.setName("");
        createGatewayLimitRulesRequest.setDescription("");
        createGatewayLimitRulesRequest.setServiceType("");
        createGatewayLimitRulesRequest.setSubServiceType("");
        createGatewayLimitRulesRequest.setPeerRegion("");
        createGatewayLimitRulesRequest.setResourceId("");
        createGatewayLimitRulesRequest.setDirection("");
        createGatewayLimitRulesRequest.setCidr("");
        createGatewayLimitRulesRequest.setBandwidth(0);
        CreateGatewayLimitRulesResponse response = vpcClient.createGatewayLimitRules(createGatewayLimitRulesRequest);
        System.out.println(response);
    }
    /**
     * createHaVip
     *
     */
    @Test
    public void createHaVipTest() {
        CreateHaVipRequest createHaVipRequest = new CreateHaVipRequest();
        createHaVipRequest.setClientToken("");
        createHaVipRequest.setName("");
        createHaVipRequest.setSubnetId("");
        createHaVipRequest.setPrivateIpAddress("");
        createHaVipRequest.setDescription("");
        CreateHaVipResponse response = vpcClient.createHaVip(createHaVipRequest);
        System.out.println(response);
    }
    /**
     * createIpGroup
     *
     */
    @Test
    public void createIpGroupTest() {
        CreateIpGroupRequest createIpGroupRequest = new CreateIpGroupRequest();
        createIpGroupRequest.setClientToken("");
        createIpGroupRequest.setName("");
        createIpGroupRequest.setIpVersion("");
        createIpGroupRequest.setIpAddressInfo(new ArrayList<>());
        createIpGroupRequest.setDescription("");
        CreateIpGroupResponse response = vpcClient.createIpGroup(createIpGroupRequest);
        System.out.println(response);
    }
    /**
     * createIpReserved
     *
     */
    @Test
    public void createIpReservedTest() {
        CreateIpReservedRequest createIpReservedRequest = new CreateIpReservedRequest();
        createIpReservedRequest.setClientToken("");
        createIpReservedRequest.setSubnetId("");
        createIpReservedRequest.setIpCidr("");
        createIpReservedRequest.setIpVersion(0);
        createIpReservedRequest.setDescription("");
        CreateIpReservedResponse response = vpcClient.createIpReserved(createIpReservedRequest);
        System.out.println(response);
    }
    /**
     * createIpSet
     *
     */
    @Test
    public void createIpSetTest() {
        CreateIpSetRequest createIpSetRequest = new CreateIpSetRequest();
        createIpSetRequest.setClientToken("");
        createIpSetRequest.setName("");
        createIpSetRequest.setIpVersion("");
        createIpSetRequest.setIpSetIds(new ArrayList<>());
        createIpSetRequest.setDescription("");
        CreateIpSetResponse response = vpcClient.createIpSet(createIpSetRequest);
        System.out.println(response);
    }
    /**
     * createIpv6Gateway
     *
     */
    @Test
    public void createIpv6GatewayTest() {
        CreateIpv6GatewayRequest createIpv6GatewayRequest = new CreateIpv6GatewayRequest();
        createIpv6GatewayRequest.setClientToken("");
        createIpv6GatewayRequest.setVpcId("");
        createIpv6GatewayRequest.setName("");
        createIpv6GatewayRequest.setBandwidthInMbps(0);
        createIpv6GatewayRequest.setBilling(null);
        createIpv6GatewayRequest.setTags(new ArrayList<>());
        createIpv6GatewayRequest.setResourceGroupId("");
        createIpv6GatewayRequest.setDeleteProtect(false);
        CreateIpv6GatewayResponse response = vpcClient.createIpv6Gateway(createIpv6GatewayRequest);
        System.out.println(response);
    }
    /**
     * createNat
     *
     */
    @Test
    public void createNatTest() {
        CreateNatRequest createNatRequest = new CreateNatRequest();
        createNatRequest.setClientToken("");
        createNatRequest.setName("");
        createNatRequest.setVpcId("");
        createNatRequest.setCuNum(0);
        createNatRequest.setIpVersion("");
        createNatRequest.setBindEips(new ArrayList<>());
        createNatRequest.setBilling(null);
        createNatRequest.setSessionConfig(null);
        createNatRequest.setTags(new ArrayList<>());
        createNatRequest.setResourceGroupId("");
        createNatRequest.setDeleteProtect(false);
        CreateNatResponse response = vpcClient.createNat(createNatRequest);
        System.out.println(response);
    }
    /**
     * createPeerConn
     *
     */
    @Test
    public void createPeerConnTest() {
        CreatePeerConnRequest createPeerConnRequest = new CreatePeerConnRequest();
        createPeerConnRequest.setClientToken("");
        createPeerConnRequest.setBandwidthInMbps(0);
        createPeerConnRequest.setDescription("");
        createPeerConnRequest.setLocalIfName("");
        createPeerConnRequest.setLocalVpcId("");
        createPeerConnRequest.setPeerAccountId("");
        createPeerConnRequest.setPeerVpcId("");
        createPeerConnRequest.setPeerRegion("");
        createPeerConnRequest.setPeerIfName("");
        createPeerConnRequest.setBilling(null);
        createPeerConnRequest.setTags(new ArrayList<>());
        createPeerConnRequest.setResourceGroupId("");
        createPeerConnRequest.setDeleteProtect(false);
        CreatePeerConnResponse response = vpcClient.createPeerConn(createPeerConnRequest);
        System.out.println(response);
    }
    /**
     * createProbe
     *
     */
    @Test
    public void createProbeTest() {
        CreateProbeRequest createProbeRequest = new CreateProbeRequest();
        createProbeRequest.setClientToken("");
        createProbeRequest.setName("");
        createProbeRequest.setDescription("");
        createProbeRequest.setVpcId("");
        createProbeRequest.setSubnetId("");
        createProbeRequest.setProtocol("");
        createProbeRequest.setFrequency(0);
        createProbeRequest.setSourceIps(new ArrayList<>());
        createProbeRequest.setSourceIpNum(0);
        createProbeRequest.setDestIp("");
        createProbeRequest.setDestPort(0);
        createProbeRequest.setPayload("");
        CreateProbeResponse response = vpcClient.createProbe(createProbeRequest);
        System.out.println(response);
    }
    /**
     * createRateLimitRule
     *
     */
    @Test
    public void createRateLimitRuleTest() {
        CreateRateLimitRuleRequest createRateLimitRuleRequest = new CreateRateLimitRuleRequest();
        createRateLimitRuleRequest.setGatewayId("");
        createRateLimitRuleRequest.setClientToken("");
        createRateLimitRuleRequest.setIpv6Address("");
        createRateLimitRuleRequest.setIngressBandwidthInMbps(0);
        createRateLimitRuleRequest.setEgressBandwidthInMbps(0);
        CreateRateLimitRuleResponse response = vpcClient.createRateLimitRule(createRateLimitRuleRequest);
        System.out.println(response);
    }
    /**
     * createRoutingRules
     *
     */
    @Test
    public void createRoutingRulesTest() {
        CreateRoutingRulesRequest createRoutingRulesRequest = new CreateRoutingRulesRequest();
        createRoutingRulesRequest.setClientToken("");
        createRoutingRulesRequest.setRouteTableId("");
        createRoutingRulesRequest.setSourceAddress("");
        createRoutingRulesRequest.setDestinationAddress("");
        createRoutingRulesRequest.setNexthopId("");
        createRoutingRulesRequest.setNexthopType("");
        createRoutingRulesRequest.setNextHopList(new ArrayList<>());
        createRoutingRulesRequest.setDescription("");
        CreateRoutingRulesResponse response = vpcClient.createRoutingRules(createRoutingRulesRequest);
        System.out.println(response);
    }
    /**
     * createSecurityGroup
     *
     */
    @Test
    public void createSecurityGroupTest() {
        CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest();
        createSecurityGroupRequest.setClientToken("");
        createSecurityGroupRequest.setName("");
        createSecurityGroupRequest.setVpcId("");
        createSecurityGroupRequest.setDesc("");
        createSecurityGroupRequest.setRules(new ArrayList<>());
        createSecurityGroupRequest.setTags(new ArrayList<>());
        CreateSecurityGroupResponse response = vpcClient.createSecurityGroup(createSecurityGroupRequest);
        System.out.println(response);
    }
    /**
     * createSnatRule
     *
     */
    @Test
    public void createSnatRuleTest() {
        CreateSnatRuleRequest createSnatRuleRequest = new CreateSnatRuleRequest();
        createSnatRuleRequest.setNatId("");
        createSnatRuleRequest.setClientToken("");
        createSnatRuleRequest.setRuleName("");
        createSnatRuleRequest.setPublicIpsAddress(new ArrayList<>());
        createSnatRuleRequest.setSourceCIDR("");
        CreateSnatRuleResponse response = vpcClient.createSnatRule(createSnatRuleRequest);
        System.out.println(response);
    }
    /**
     * createSslVpnServer
     *
     */
    @Test
    public void createSslVpnServerTest() {
        CreateSslVpnServerRequest createSslVpnServerRequest = new CreateSslVpnServerRequest();
        createSslVpnServerRequest.setVpnId("");
        createSslVpnServerRequest.setClientToken("");
        createSslVpnServerRequest.setSslVpnServerName("");
        createSslVpnServerRequest.setInterfaceType("");
        createSslVpnServerRequest.setLocalSubnets(new ArrayList<>());
        createSslVpnServerRequest.setRemoteSubnet("");
        createSslVpnServerRequest.setClientDns("");
        CreateSslVpnServerResponse response = vpcClient.createSslVpnServer(createSslVpnServerRequest);
        System.out.println(response);
    }
    /**
     * createSubnet
     *
     */
    @Test
    public void createSubnetTest() {
        CreateSubnetRequest createSubnetRequest = new CreateSubnetRequest();
        createSubnetRequest.setClientToken("");
        createSubnetRequest.setName("");
        createSubnetRequest.setEnableIpv6(false);
        createSubnetRequest.setZoneName("");
        createSubnetRequest.setCidr("");
        createSubnetRequest.setVpcId("");
        createSubnetRequest.setVpcSecondaryCidr("");
        createSubnetRequest.setSubnetType("");
        createSubnetRequest.setDescription("");
        createSubnetRequest.setTags(new ArrayList<>());
        CreateSubnetResponse response = vpcClient.createSubnet(createSubnetRequest);
        System.out.println(response);
    }
    /**
     * createUserGateway
     *
     */
    @Test
    public void createUserGatewayTest() {
        CreateUserGatewayRequest createUserGatewayRequest = new CreateUserGatewayRequest();
        createUserGatewayRequest.setClientToken("");
        createUserGatewayRequest.setName("");
        createUserGatewayRequest.setIp("");
        createUserGatewayRequest.setDescription("");
        CreateUserGatewayResponse response = vpcClient.createUserGateway(createUserGatewayRequest);
        System.out.println(response);
    }
    /**
     * createVpc
     *
     */
    @Test
    public void createVpcTest() {
        CreateVpcRequest createVpcRequest = new CreateVpcRequest();
        createVpcRequest.setClientToken("");
        createVpcRequest.setName("");
        createVpcRequest.setDescription("");
        createVpcRequest.setCidr("");
        createVpcRequest.setEnableIpv6(false);
        createVpcRequest.setTags(new ArrayList<>());
        CreateVpcResponse response = vpcClient.createVpc(createVpcRequest);
        System.out.println(response);
    }
    /**
     * createVpn
     *
     */
    @Test
    public void createVpnTest() {
        CreateVpnRequest createVpnRequest = new CreateVpnRequest();
        createVpnRequest.setClientToken("");
        createVpnRequest.setVpcId("");
        createVpnRequest.setSubnetId("");
        createVpnRequest.setVpnName("");
        createVpnRequest.setType("");
        createVpnRequest.setDescription("");
        createVpnRequest.setEip("");
        createVpnRequest.setTags(new ArrayList<>());
        createVpnRequest.setResourceGroupId("");
        createVpnRequest.setBilling(null);
        createVpnRequest.setMaxConnection(0);
        createVpnRequest.setDeleteProtect(false);
        CreateVpnResponse response = vpcClient.createVpn(createVpnRequest);
        System.out.println(response);
    }
    /**
     * createVpnTunnel
     *
     */
    @Test
    public void createVpnTunnelTest() {
        CreateVpnTunnelRequest createVpnTunnelRequest = new CreateVpnTunnelRequest();
        createVpnTunnelRequest.setVpnId("");
        createVpnTunnelRequest.setClientToken("");
        createVpnTunnelRequest.setSecretKey("");
        createVpnTunnelRequest.setLocalSubnets(new ArrayList<>());
        createVpnTunnelRequest.setCgwId("");
        createVpnTunnelRequest.setRemoteSubnets(new ArrayList<>());
        createVpnTunnelRequest.setDescription("");
        createVpnTunnelRequest.setVpnConnName("");
        createVpnTunnelRequest.setIkeConfig(null);
        createVpnTunnelRequest.setIpsecConfig(null);
        CreateVpnTunnelResponse response = vpcClient.createVpnTunnel(createVpnTunnelRequest);
        System.out.println(response);
    }
    /**
     * deleteAclRule
     *
     */
    @Test
    public void deleteAclRuleTest() {
        DeleteAclRuleRequest deleteAclRuleRequest = new DeleteAclRuleRequest();
        deleteAclRuleRequest.setAclRuleId("");
        deleteAclRuleRequest.setClientToken("");
        vpcClient.deleteAclRule(deleteAclRuleRequest);
    }
    /**
     * deleteDnatRule
     *
     */
    @Test
    public void deleteDnatRuleTest() {
        DeleteDnatRuleRequest deleteDnatRuleRequest = new DeleteDnatRuleRequest();
        deleteDnatRuleRequest.setNatId("");
        deleteDnatRuleRequest.setRuleId("");
        deleteDnatRuleRequest.setClientToken("");
        vpcClient.deleteDnatRule(deleteDnatRuleRequest);
    }
    /**
     * deleteEniIp
     *
     */
    @Test
    public void deleteEniIpTest() {
        DeleteEniIpRequest deleteEniIpRequest = new DeleteEniIpRequest();
        deleteEniIpRequest.setEniId("");
        deleteEniIpRequest.setPrivateIpAddress("");
        deleteEniIpRequest.setClientToken("");
        vpcClient.deleteEniIp(deleteEniIpRequest);
    }
    /**
     * deleteEnterpriseSecurityGroup
     *
     */
    @Test
    public void deleteEnterpriseSecurityGroupTest() {
        DeleteEnterpriseSecurityGroupRequest deleteEnterpriseSecurityGroupRequest = new DeleteEnterpriseSecurityGroupRequest();
        deleteEnterpriseSecurityGroupRequest.setEnterpriseSecurityGroupId("");
        deleteEnterpriseSecurityGroupRequest.setClientToken("");
        vpcClient.deleteEnterpriseSecurityGroup(deleteEnterpriseSecurityGroupRequest);
    }
    /**
     * deleteEnterpriseSecurityGroupRules
     *
     */
    @Test
    public void deleteEnterpriseSecurityGroupRulesTest() {
        DeleteEnterpriseSecurityGroupRulesRequest deleteEnterpriseSecurityGroupRulesRequest = new DeleteEnterpriseSecurityGroupRulesRequest();
        deleteEnterpriseSecurityGroupRulesRequest.setEnterpriseSecurityGroupRuleId("");
        deleteEnterpriseSecurityGroupRulesRequest.setClientToken("");
        vpcClient.deleteEnterpriseSecurityGroupRules(deleteEnterpriseSecurityGroupRulesRequest);
    }
    /**
     * deleteGatewayLimitRule
     *
     */
    @Test
    public void deleteGatewayLimitRuleTest() {
        DeleteGatewayLimitRuleRequest deleteGatewayLimitRuleRequest = new DeleteGatewayLimitRuleRequest();
        deleteGatewayLimitRuleRequest.setGlrId("");
        deleteGatewayLimitRuleRequest.setClientToken("");
        vpcClient.deleteGatewayLimitRule(deleteGatewayLimitRuleRequest);
    }
    /**
     * deleteHaVip
     *
     */
    @Test
    public void deleteHaVipTest() {
        DeleteHaVipRequest deleteHaVipRequest = new DeleteHaVipRequest();
        deleteHaVipRequest.setHaVipId("");
        deleteHaVipRequest.setClientToken("");
        vpcClient.deleteHaVip(deleteHaVipRequest);
    }
    /**
     * deleteIpGroup
     *
     */
    @Test
    public void deleteIpGroupTest() {
        DeleteIpGroupRequest deleteIpGroupRequest = new DeleteIpGroupRequest();
        deleteIpGroupRequest.setIpSetId("");
        deleteIpGroupRequest.setClientToken("");
        vpcClient.deleteIpGroup(deleteIpGroupRequest);
    }
    /**
     * deleteIpReserve
     *
     */
    @Test
    public void deleteIpReserveTest() {
        DeleteIpReserveRequest deleteIpReserveRequest = new DeleteIpReserveRequest();
        deleteIpReserveRequest.setIpReserveId("");
        deleteIpReserveRequest.setClientToken("");
        vpcClient.deleteIpReserve(deleteIpReserveRequest);
    }
    /**
     * deleteIpSet
     *
     */
    @Test
    public void deleteIpSetTest() {
        DeleteIpSetRequest deleteIpSetRequest = new DeleteIpSetRequest();
        deleteIpSetRequest.setIpGroupId("");
        deleteIpSetRequest.setClientToken("");
        vpcClient.deleteIpSet(deleteIpSetRequest);
    }
    /**
     * deleteIpv6Gateway
     *
     */
    @Test
    public void deleteIpv6GatewayTest() {
        DeleteIpv6GatewayRequest deleteIpv6GatewayRequest = new DeleteIpv6GatewayRequest();
        deleteIpv6GatewayRequest.setGatewayId("");
        deleteIpv6GatewayRequest.setClientToken("");
        vpcClient.deleteIpv6Gateway(deleteIpv6GatewayRequest);
    }
    /**
     * deleteIpv6GatewayEgressOnlyRule
     *
     */
    @Test
    public void deleteIpv6GatewayEgressOnlyRuleTest() {
        DeleteIpv6GatewayEgressOnlyRuleRequest deleteIpv6GatewayEgressOnlyRuleRequest = new DeleteIpv6GatewayEgressOnlyRuleRequest();
        deleteIpv6GatewayEgressOnlyRuleRequest.setGatewayId("");
        deleteIpv6GatewayEgressOnlyRuleRequest.setEgressOnlyRuleId("");
        deleteIpv6GatewayEgressOnlyRuleRequest.setClientToken("");
        vpcClient.deleteIpv6GatewayEgressOnlyRule(deleteIpv6GatewayEgressOnlyRuleRequest);
    }
    /**
     * deleteIpv6GatewayRateLimitRule
     *
     */
    @Test
    public void deleteIpv6GatewayRateLimitRuleTest() {
        DeleteIpv6GatewayRateLimitRuleRequest deleteIpv6GatewayRateLimitRuleRequest = new DeleteIpv6GatewayRateLimitRuleRequest();
        deleteIpv6GatewayRateLimitRuleRequest.setGatewayId("");
        deleteIpv6GatewayRateLimitRuleRequest.setRateLimitRuleId("");
        deleteIpv6GatewayRateLimitRuleRequest.setClientToken("");
        vpcClient.deleteIpv6GatewayRateLimitRule(deleteIpv6GatewayRateLimitRuleRequest);
    }
    /**
     * deleteProbe
     *
     */
    @Test
    public void deleteProbeTest() {
        DeleteProbeRequest deleteProbeRequest = new DeleteProbeRequest();
        deleteProbeRequest.setProbeId("");
        deleteProbeRequest.setClientToken("");
        vpcClient.deleteProbe(deleteProbeRequest);
    }
    /**
     * deleteRoutingRules
     *
     */
    @Test
    public void deleteRoutingRulesTest() {
        DeleteRoutingRulesRequest deleteRoutingRulesRequest = new DeleteRoutingRulesRequest();
        deleteRoutingRulesRequest.setRouteRuleId("");
        deleteRoutingRulesRequest.setClientToken("");
        vpcClient.deleteRoutingRules(deleteRoutingRulesRequest);
    }
    /**
     * deleteSecurityGroup
     *
     */
    @Test
    public void deleteSecurityGroupTest() {
        DeleteSecurityGroupRequest deleteSecurityGroupRequest = new DeleteSecurityGroupRequest();
        deleteSecurityGroupRequest.setSecurityGroupId("");
        deleteSecurityGroupRequest.setClientToken("");
        vpcClient.deleteSecurityGroup(deleteSecurityGroupRequest);
    }
    /**
     * deleteSecurityGroupRules
     *
     */
    @Test
    public void deleteSecurityGroupRulesTest() {
        DeleteSecurityGroupRulesRequest deleteSecurityGroupRulesRequest = new DeleteSecurityGroupRulesRequest();
        deleteSecurityGroupRulesRequest.setSecurityGroupRuleId("");
        deleteSecurityGroupRulesRequest.setClientToken("");
        deleteSecurityGroupRulesRequest.setSgVersion(0L);
        vpcClient.deleteSecurityGroupRules(deleteSecurityGroupRulesRequest);
    }
    /**
     * deleteSnatRule
     *
     */
    @Test
    public void deleteSnatRuleTest() {
        DeleteSnatRuleRequest deleteSnatRuleRequest = new DeleteSnatRuleRequest();
        deleteSnatRuleRequest.setNatId("");
        deleteSnatRuleRequest.setRuleId("");
        deleteSnatRuleRequest.setClientToken("");
        vpcClient.deleteSnatRule(deleteSnatRuleRequest);
    }
    /**
     * deleteSslVpnServer
     *
     */
    @Test
    public void deleteSslVpnServerTest() {
        DeleteSslVpnServerRequest deleteSslVpnServerRequest = new DeleteSslVpnServerRequest();
        deleteSslVpnServerRequest.setVpnId("");
        deleteSslVpnServerRequest.setSslVpnServerId("");
        deleteSslVpnServerRequest.setClientToken("");
        vpcClient.deleteSslVpnServer(deleteSslVpnServerRequest);
    }
    /**
     * deleteSslVpnUser
     *
     */
    @Test
    public void deleteSslVpnUserTest() {
        DeleteSslVpnUserRequest deleteSslVpnUserRequest = new DeleteSslVpnUserRequest();
        deleteSslVpnUserRequest.setVpnId("");
        deleteSslVpnUserRequest.setUserId("");
        deleteSslVpnUserRequest.setClientToken("");
        vpcClient.deleteSslVpnUser(deleteSslVpnUserRequest);
    }
    /**
     * deleteSubnet
     *
     */
    @Test
    public void deleteSubnetTest() {
        DeleteSubnetRequest deleteSubnetRequest = new DeleteSubnetRequest();
        deleteSubnetRequest.setSubnetId("");
        deleteSubnetRequest.setClientToken("");
        vpcClient.deleteSubnet(deleteSubnetRequest);
    }
    /**
     * deleteUserGateway
     *
     */
    @Test
    public void deleteUserGatewayTest() {
        DeleteUserGatewayRequest deleteUserGatewayRequest = new DeleteUserGatewayRequest();
        deleteUserGatewayRequest.setCgwId("");
        vpcClient.deleteUserGateway(deleteUserGatewayRequest);
    }
    /**
     * deleteVpc
     *
     */
    @Test
    public void deleteVpcTest() {
        DeleteVpcRequest deleteVpcRequest = new DeleteVpcRequest();
        deleteVpcRequest.setVpcId("");
        deleteVpcRequest.setClientToken("");
        vpcClient.deleteVpc(deleteVpcRequest);
    }
    /**
     * deleteVpnTunnel
     *
     */
    @Test
    public void deleteVpnTunnelTest() {
        DeleteVpnTunnelRequest deleteVpnTunnelRequest = new DeleteVpnTunnelRequest();
        deleteVpnTunnelRequest.setVpnConnId("");
        deleteVpnTunnelRequest.setClientToken("");
        vpcClient.deleteVpnTunnel(deleteVpnTunnelRequest);
    }
    /**
     * detachEniInstance
     *
     */
    @Test
    public void detachEniInstanceTest() {
        DetachEniInstanceRequest detachEniInstanceRequest = new DetachEniInstanceRequest();
        detachEniInstanceRequest.setEniId("");
        detachEniInstanceRequest.setClientToken("");
        detachEniInstanceRequest.setInstanceId("");
        vpcClient.detachEniInstance(detachEniInstanceRequest);
    }
    /**
     * getEniDetail
     *
     */
    @Test
    public void getEniDetailTest() {
        GetEniDetailRequest getEniDetailRequest = new GetEniDetailRequest();
        getEniDetailRequest.setEniId("");
        GetEniDetailResponse response = vpcClient.getEniDetail(getEniDetailRequest);
        System.out.println(response);
    }
    /**
     * getEniStatus
     *
     */
    @Test
    public void getEniStatusTest() {
        GetEniStatusRequest getEniStatusRequest = new GetEniStatusRequest();
        getEniStatusRequest.setEniId("");
        GetEniStatusResponse response = vpcClient.getEniStatus(getEniStatusRequest);
        System.out.println(response);
    }
    /**
     * getHaVipDetail
     *
     */
    @Test
    public void getHaVipDetailTest() {
        GetHaVipDetailRequest getHaVipDetailRequest = new GetHaVipDetailRequest();
        getHaVipDetailRequest.setHaVipId("");
        GetHaVipDetailResponse response = vpcClient.getHaVipDetail(getHaVipDetailRequest);
        System.out.println(response);
    }
    /**
     * getNat
     *
     */
    @Test
    public void getNatTest() {
        GetNatRequest getNatRequest = new GetNatRequest();
        getNatRequest.setNatId("");
        GetNatResponse response = vpcClient.getNat(getNatRequest);
        System.out.println(response);
    }
    /**
     * getPeerConn
     *
     */
    @Test
    public void getPeerConnTest() {
        GetPeerConnRequest getPeerConnRequest = new GetPeerConnRequest();
        getPeerConnRequest.setPeerConnId("");
        getPeerConnRequest.setRole("");
        GetPeerConnResponse response = vpcClient.getPeerConn(getPeerConnRequest);
        System.out.println(response);
    }
    /**
     * getProbeDetail
     *
     */
    @Test
    public void getProbeDetailTest() {
        GetProbeDetailRequest getProbeDetailRequest = new GetProbeDetailRequest();
        getProbeDetailRequest.setProbeId("");
        GetProbeDetailResponse response = vpcClient.getProbeDetail(getProbeDetailRequest);
        System.out.println(response);
    }
    /**
     * getSecurityGroupDetails
     *
     */
    @Test
    public void getSecurityGroupDetailsTest() {
        GetSecurityGroupDetailsRequest getSecurityGroupDetailsRequest = new GetSecurityGroupDetailsRequest();
        getSecurityGroupDetailsRequest.setSecurityGroupId("");
        GetSecurityGroupDetailsResponse response = vpcClient.getSecurityGroupDetails(getSecurityGroupDetailsRequest);
        System.out.println(response);
    }
    /**
     * getVpcResourceIpInfo
     *
     */
    @Test
    public void getVpcResourceIpInfoTest() {
        GetVpcResourceIpInfoRequest getVpcResourceIpInfoRequest = new GetVpcResourceIpInfoRequest();
        getVpcResourceIpInfoRequest.setVpcId("");
        getVpcResourceIpInfoRequest.setSubnetId("");
        getVpcResourceIpInfoRequest.setResourceType("");
        getVpcResourceIpInfoRequest.setPageNo(0);
        getVpcResourceIpInfoRequest.setPageSize(0);
        GetVpcResourceIpInfoResponse response = vpcClient.getVpcResourceIpInfo(getVpcResourceIpInfoRequest);
        System.out.println(response);
    }
    /**
     * listDnatRule
     *
     */
    @Test
    public void listDnatRuleTest() {
        ListDnatRuleRequest listDnatRuleRequest = new ListDnatRuleRequest();
        listDnatRuleRequest.setNatId("");
        listDnatRuleRequest.setMarker("");
        listDnatRuleRequest.setMaxKeys(0);
        ListDnatRuleResponse response = vpcClient.listDnatRule(listDnatRuleRequest);
        System.out.println(response);
    }
    /**
     * listEgressOnlyRule
     *
     */
    @Test
    public void listEgressOnlyRuleTest() {
        ListEgressOnlyRuleRequest listEgressOnlyRuleRequest = new ListEgressOnlyRuleRequest();
        listEgressOnlyRuleRequest.setGatewayId("");
        listEgressOnlyRuleRequest.setMarker("");
        listEgressOnlyRuleRequest.setMaxKeys(0);
        ListEgressOnlyRuleResponse response = vpcClient.listEgressOnlyRule(listEgressOnlyRuleRequest);
        System.out.println(response);
    }
    /**
     * listEni
     *
     */
    @Test
    public void listEniTest() {
        ListEniRequest listEniRequest = new ListEniRequest();
        listEniRequest.setVpcId("");
        listEniRequest.setInstanceId("");
        listEniRequest.setName("");
        listEniRequest.setPrivateIpAddress(new ArrayList<>());
        listEniRequest.setMarker("");
        listEniRequest.setMaxKeys(0);
        ListEniResponse response = vpcClient.listEni(listEniRequest);
        System.out.println(response);
    }
    /**
     * listHaVip
     *
     */
    @Test
    public void listHaVipTest() {
        ListHaVipRequest listHaVipRequest = new ListHaVipRequest();
        listHaVipRequest.setVpcId("");
        listHaVipRequest.setMarker("");
        listHaVipRequest.setMaxKeys(0);
        ListHaVipResponse response = vpcClient.listHaVip(listHaVipRequest);
        System.out.println(response);
    }
    /**
     * listIpReserve
     *
     */
    @Test
    public void listIpReserveTest() {
        ListIpReserveRequest listIpReserveRequest = new ListIpReserveRequest();
        listIpReserveRequest.setSubnetId("");
        listIpReserveRequest.setMarker("");
        listIpReserveRequest.setMaxKeys(0);
        ListIpReserveResponse response = vpcClient.listIpReserve(listIpReserveRequest);
        System.out.println(response);
    }
    /**
     * listNat
     *
     */
    @Test
    public void listNatTest() {
        ListNatRequest listNatRequest = new ListNatRequest();
        listNatRequest.setVpcId("");
        listNatRequest.setNatId("");
        listNatRequest.setName("");
        listNatRequest.setIp("");
        listNatRequest.setMarker("");
        listNatRequest.setMaxKeys(0);
        ListNatResponse response = vpcClient.listNat(listNatRequest);
        System.out.println(response);
    }
    /**
     * listPeerConn
     *
     */
    @Test
    public void listPeerConnTest() {
        ListPeerConnRequest listPeerConnRequest = new ListPeerConnRequest();
        listPeerConnRequest.setVpcId("");
        listPeerConnRequest.setMarker("");
        listPeerConnRequest.setMaxKeys(0);
        ListPeerConnResponse response = vpcClient.listPeerConn(listPeerConnRequest);
        System.out.println(response);
    }
    /**
     * listProbes
     *
     */
    @Test
    public void listProbesTest() {
        ListProbesRequest listProbesRequest = new ListProbesRequest();
        listProbesRequest.setMarker("");
        listProbesRequest.setMaxKeys(0);
        ListProbesResponse response = vpcClient.listProbes(listProbesRequest);
        System.out.println(response);
    }
    /**
     * listRateLimitRule
     *
     */
    @Test
    public void listRateLimitRuleTest() {
        ListRateLimitRuleRequest listRateLimitRuleRequest = new ListRateLimitRuleRequest();
        listRateLimitRuleRequest.setGatewayId("");
        listRateLimitRuleRequest.setMarker("");
        listRateLimitRuleRequest.setMaxKeys(0);
        ListRateLimitRuleResponse response = vpcClient.listRateLimitRule(listRateLimitRuleRequest);
        System.out.println(response);
    }
    /**
     * listSnatRule
     *
     */
    @Test
    public void listSnatRuleTest() {
        ListSnatRuleRequest listSnatRuleRequest = new ListSnatRuleRequest();
        listSnatRuleRequest.setNatId("");
        listSnatRuleRequest.setMarker("");
        listSnatRuleRequest.setMaxKeys(0);
        ListSnatRuleResponse response = vpcClient.listSnatRule(listSnatRuleRequest);
        System.out.println(response);
    }
    /**
     * modifyGatewayLimitRules
     *
     */
    @Test
    public void modifyGatewayLimitRulesTest() {
        ModifyGatewayLimitRulesRequest modifyGatewayLimitRulesRequest = new ModifyGatewayLimitRulesRequest();
        modifyGatewayLimitRulesRequest.setGlrId("");
        modifyGatewayLimitRulesRequest.setClientToken("");
        modifyGatewayLimitRulesRequest.setName("");
        modifyGatewayLimitRulesRequest.setDescription("");
        modifyGatewayLimitRulesRequest.setBandwidth(0);
        vpcClient.modifyGatewayLimitRules(modifyGatewayLimitRulesRequest);
    }
    /**
     * modifyNat
     *
     */
    @Test
    public void modifyNatTest() {
        ModifyNatRequest modifyNatRequest = new ModifyNatRequest();
        modifyNatRequest.setNatId("");
        modifyNatRequest.setClientToken("");
        modifyNatRequest.setName("");
        vpcClient.modifyNat(modifyNatRequest);
    }
    /**
     * natBindEip
     *
     */
    @Test
    public void natBindEipTest() {
        NatBindEipRequest natBindEipRequest = new NatBindEipRequest();
        natBindEipRequest.setNatId("");
        natBindEipRequest.setClientToken("");
        natBindEipRequest.setBindEips(new ArrayList<>());
        vpcClient.natBindEip(natBindEipRequest);
    }
    /**
     * natUnBindEip
     *
     */
    @Test
    public void natUnBindEipTest() {
        NatUnBindEipRequest natUnBindEipRequest = new NatUnBindEipRequest();
        natUnBindEipRequest.setNatId("");
        natUnBindEipRequest.setClientToken("");
        natUnBindEipRequest.setBindEips(new ArrayList<>());
        vpcClient.natUnBindEip(natUnBindEipRequest);
    }
    /**
     * openPeerConnSyncDns
     *
     */
    @Test
    public void openPeerConnSyncDnsTest() {
        OpenPeerConnSyncDnsRequest openPeerConnSyncDnsRequest = new OpenPeerConnSyncDnsRequest();
        openPeerConnSyncDnsRequest.setPeerConnId("");
        openPeerConnSyncDnsRequest.setRole("");
        openPeerConnSyncDnsRequest.setClientToken("");
        vpcClient.openPeerConnSyncDns(openPeerConnSyncDnsRequest);
    }
    /**
     * openVpcRelay
     *
     */
    @Test
    public void openVpcRelayTest() {
        OpenVpcRelayRequest openVpcRelayRequest = new OpenVpcRelayRequest();
        openVpcRelayRequest.setVpcId("");
        openVpcRelayRequest.setClientToken("");
        vpcClient.openVpcRelay(openVpcRelayRequest);
    }
    /**
     * purchaseReservedNat
     *
     */
    @Test
    public void purchaseReservedNatTest() {
        PurchaseReservedNatRequest purchaseReservedNatRequest = new PurchaseReservedNatRequest();
        purchaseReservedNatRequest.setNatId("");
        purchaseReservedNatRequest.setClientToken("");
        purchaseReservedNatRequest.setBilling(null);
        vpcClient.purchaseReservedNat(purchaseReservedNatRequest);
    }
    /**
     * queryAcl
     *
     */
    @Test
    public void queryAclTest() {
        QueryAclRequest queryAclRequest = new QueryAclRequest();
        queryAclRequest.setVpcId("");
        QueryAclResponse response = vpcClient.queryAcl(queryAclRequest);
        System.out.println(response);
    }
    /**
     * queryAclRules
     *
     */
    @Test
    public void queryAclRulesTest() {
        QueryAclRulesRequest queryAclRulesRequest = new QueryAclRulesRequest();
        queryAclRulesRequest.setSubnetId("");
        queryAclRulesRequest.setMarker("");
        queryAclRulesRequest.setMaxKeys(0);
        QueryAclRulesResponse response = vpcClient.queryAclRules(queryAclRulesRequest);
        System.out.println(response);
    }
    /**
     * queryEnterpriseSecurityGroupList
     *
     */
    @Test
    public void queryEnterpriseSecurityGroupListTest() {
        QueryEnterpriseSecurityGroupListRequest queryEnterpriseSecurityGroupListRequest = new QueryEnterpriseSecurityGroupListRequest();
        queryEnterpriseSecurityGroupListRequest.setMarker("");
        queryEnterpriseSecurityGroupListRequest.setMaxKeys(0);
        queryEnterpriseSecurityGroupListRequest.setInstanceId("");
        QueryEnterpriseSecurityGroupListResponse response = vpcClient.queryEnterpriseSecurityGroupList(queryEnterpriseSecurityGroupListRequest);
        System.out.println(response);
    }
    /**
     * queryIpGroupDetail
     *
     */
    @Test
    public void queryIpGroupDetailTest() {
        QueryIpGroupDetailRequest queryIpGroupDetailRequest = new QueryIpGroupDetailRequest();
        queryIpGroupDetailRequest.setIpSetId("");
        QueryIpGroupDetailResponse response = vpcClient.queryIpGroupDetail(queryIpGroupDetailRequest);
        System.out.println(response);
    }
    /**
     * queryIpGroupList
     *
     */
    @Test
    public void queryIpGroupListTest() {
        QueryIpGroupListRequest queryIpGroupListRequest = new QueryIpGroupListRequest();
        queryIpGroupListRequest.setIpVersion("");
        queryIpGroupListRequest.setMarker("");
        queryIpGroupListRequest.setMaxKeys(0);
        QueryIpGroupListResponse response = vpcClient.queryIpGroupList(queryIpGroupListRequest);
        System.out.println(response);
    }
    /**
     * queryIpSetDetail
     *
     */
    @Test
    public void queryIpSetDetailTest() {
        QueryIpSetDetailRequest queryIpSetDetailRequest = new QueryIpSetDetailRequest();
        queryIpSetDetailRequest.setIpGroupId("");
        QueryIpSetDetailResponse response = vpcClient.queryIpSetDetail(queryIpSetDetailRequest);
        System.out.println(response);
    }
    /**
     * queryIpSetList
     *
     */
    @Test
    public void queryIpSetListTest() {
        QueryIpSetListRequest queryIpSetListRequest = new QueryIpSetListRequest();
        queryIpSetListRequest.setIpVersion("");
        queryIpSetListRequest.setMarker("");
        queryIpSetListRequest.setMaxKeys(0);
        QueryIpSetListResponse response = vpcClient.queryIpSetList(queryIpSetListRequest);
        System.out.println(response);
    }
    /**
     * queryIpv6Gateway
     *
     */
    @Test
    public void queryIpv6GatewayTest() {
        QueryIpv6GatewayRequest queryIpv6GatewayRequest = new QueryIpv6GatewayRequest();
        queryIpv6GatewayRequest.setVpcId("");
        QueryIpv6GatewayResponse response = vpcClient.queryIpv6Gateway(queryIpv6GatewayRequest);
        System.out.println(response);
    }
    /**
     * queryRoutingRules
     *
     */
    @Test
    public void queryRoutingRulesTest() {
        QueryRoutingRulesRequest queryRoutingRulesRequest = new QueryRoutingRulesRequest();
        queryRoutingRulesRequest.setRouteTableId("");
        queryRoutingRulesRequest.setVpcId("");
        queryRoutingRulesRequest.setMarker("");
        queryRoutingRulesRequest.setMaxKeys(0);
        QueryRoutingRulesResponse response = vpcClient.queryRoutingRules(queryRoutingRulesRequest);
        System.out.println(response);
    }
    /**
     * queryRoutingTable
     *
     */
    @Test
    public void queryRoutingTableTest() {
        QueryRoutingTableRequest queryRoutingTableRequest = new QueryRoutingTableRequest();
        queryRoutingTableRequest.setRouteTableId("");
        queryRoutingTableRequest.setVpcId("");
        QueryRoutingTableResponse response = vpcClient.queryRoutingTable(queryRoutingTableRequest);
        System.out.println(response);
    }
    /**
     * querySecurityGroupsList
     *
     */
    @Test
    public void querySecurityGroupsListTest() {
        QuerySecurityGroupsListRequest querySecurityGroupsListRequest = new QuerySecurityGroupsListRequest();
        querySecurityGroupsListRequest.setMarker("");
        querySecurityGroupsListRequest.setMaxKeys(0);
        querySecurityGroupsListRequest.setInstanceId("");
        querySecurityGroupsListRequest.setVpcId("");
        querySecurityGroupsListRequest.setSecurityGroupId("");
        querySecurityGroupsListRequest.setSecurityGroupIds("");
        QuerySecurityGroupsListResponse response = vpcClient.querySecurityGroupsList(querySecurityGroupsListRequest);
        System.out.println(response);
    }
    /**
     * querySpecifiedSubnet
     *
     */
    @Test
    public void querySpecifiedSubnetTest() {
        QuerySpecifiedSubnetRequest querySpecifiedSubnetRequest = new QuerySpecifiedSubnetRequest();
        querySpecifiedSubnetRequest.setSubnetId("");
        QuerySpecifiedSubnetResponse response = vpcClient.querySpecifiedSubnet(querySpecifiedSubnetRequest);
        System.out.println(response);
    }
    /**
     * querySpecifiedVpc
     *
     */
    @Test
    public void querySpecifiedVpcTest() {
        QuerySpecifiedVpcRequest querySpecifiedVpcRequest = new QuerySpecifiedVpcRequest();
        querySpecifiedVpcRequest.setVpcId("");
        QuerySpecifiedVpcResponse response = vpcClient.querySpecifiedVpc(querySpecifiedVpcRequest);
        System.out.println(response);
    }
    /**
     * querySslVpnServer
     *
     */
    @Test
    public void querySslVpnServerTest() {
        QuerySslVpnServerRequest querySslVpnServerRequest = new QuerySslVpnServerRequest();
        querySslVpnServerRequest.setVpnId("");
        querySslVpnServerRequest.setClientToken("");
        QuerySslVpnServerResponse response = vpcClient.querySslVpnServer(querySslVpnServerRequest);
        System.out.println(response);
    }
    /**
     * querySslVpnUsers
     *
     */
    @Test
    public void querySslVpnUsersTest() {
        QuerySslVpnUsersRequest querySslVpnUsersRequest = new QuerySslVpnUsersRequest();
        querySslVpnUsersRequest.setVpnId("");
        querySslVpnUsersRequest.setMarker("");
        querySslVpnUsersRequest.setMaxKeys(0);
        querySslVpnUsersRequest.setUserName("");
        QuerySslVpnUsersResponse response = vpcClient.querySslVpnUsers(querySslVpnUsersRequest);
        System.out.println(response);
    }
    /**
     * querySubnetList
     *
     */
    @Test
    public void querySubnetListTest() {
        QuerySubnetListRequest querySubnetListRequest = new QuerySubnetListRequest();
        querySubnetListRequest.setMarker("");
        querySubnetListRequest.setMaxKeys(0);
        querySubnetListRequest.setVpcId("");
        querySubnetListRequest.setZoneName("");
        querySubnetListRequest.setSubnetType("");
        querySubnetListRequest.setSubnetIds("");
        QuerySubnetListResponse response = vpcClient.querySubnetList(querySubnetListRequest);
        System.out.println(response);
    }
    /**
     * queryTheDetailsOfTheDedicatedGateway
     *
     */
    @Test
    public void queryTheDetailsOfTheDedicatedGatewayTest() {
        QueryTheDetailsOfTheDedicatedGatewayRequest queryTheDetailsOfTheDedicatedGatewayRequest = new QueryTheDetailsOfTheDedicatedGatewayRequest();
        queryTheDetailsOfTheDedicatedGatewayRequest.setEtGatewayId("");
        QueryTheDetailsOfTheDedicatedGatewayResponse response = vpcClient.queryTheDetailsOfTheDedicatedGateway(queryTheDetailsOfTheDedicatedGatewayRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfDedicatedLineGateways
     *
     */
    @Test
    public void queryTheListOfDedicatedLineGatewaysTest() {
        QueryTheListOfDedicatedLineGatewaysRequest queryTheListOfDedicatedLineGatewaysRequest = new QueryTheListOfDedicatedLineGatewaysRequest();
        queryTheListOfDedicatedLineGatewaysRequest.setVpcId("");
        queryTheListOfDedicatedLineGatewaysRequest.setEtGatewayId("");
        queryTheListOfDedicatedLineGatewaysRequest.setName("");
        queryTheListOfDedicatedLineGatewaysRequest.setStatus("");
        queryTheListOfDedicatedLineGatewaysRequest.setMarker("");
        queryTheListOfDedicatedLineGatewaysRequest.setMaxKeys(0);
        QueryTheListOfDedicatedLineGatewaysResponse response = vpcClient.queryTheListOfDedicatedLineGateways(queryTheListOfDedicatedLineGatewaysRequest);
        System.out.println(response);
    }
    /**
     * queryVpcIntranetIp
     *
     */
    @Test
    public void queryVpcIntranetIpTest() {
        QueryVpcIntranetIpRequest queryVpcIntranetIpRequest = new QueryVpcIntranetIpRequest();
        queryVpcIntranetIpRequest.setVpcId("");
        queryVpcIntranetIpRequest.setPrivateIpAddresses(new ArrayList<>());
        queryVpcIntranetIpRequest.setPrivateIpRange("");
        QueryVpcIntranetIpResponse response = vpcClient.queryVpcIntranetIp(queryVpcIntranetIpRequest);
        System.out.println(response);
    }
    /**
     * queryVpcList
     *
     */
    @Test
    public void queryVpcListTest() {
        QueryVpcListRequest queryVpcListRequest = new QueryVpcListRequest();
        queryVpcListRequest.setMarker("");
        queryVpcListRequest.setMaxKeys(0);
        queryVpcListRequest.setIsDefault(false);
        queryVpcListRequest.setVpcIds("");
        QueryVpcListResponse response = vpcClient.queryVpcList(queryVpcListRequest);
        System.out.println(response);
    }
    /**
     * queryVpnList
     *
     */
    @Test
    public void queryVpnListTest() {
        QueryVpnListRequest queryVpnListRequest = new QueryVpnListRequest();
        queryVpnListRequest.setVpcId("");
        queryVpnListRequest.setMarker("");
        queryVpnListRequest.setMaxKeys(0);
        queryVpnListRequest.setEip("");
        queryVpnListRequest.setType("");
        QueryVpnListResponse response = vpcClient.queryVpnList(queryVpnListRequest);
        System.out.println(response);
    }
    /**
     * refundPeerConn
     *
     */
    @Test
    public void refundPeerConnTest() {
        RefundPeerConnRequest refundPeerConnRequest = new RefundPeerConnRequest();
        refundPeerConnRequest.setPeerConnId("");
        refundPeerConnRequest.setClientToken("");
        vpcClient.refundPeerConn(refundPeerConnRequest);
    }
    /**
     * rejectPeerConn
     *
     */
    @Test
    public void rejectPeerConnTest() {
        RejectPeerConnRequest rejectPeerConnRequest = new RejectPeerConnRequest();
        rejectPeerConnRequest.setPeerConnId("");
        rejectPeerConnRequest.setClientToken("");
        vpcClient.rejectPeerConn(rejectPeerConnRequest);
    }
    /**
     * releaseDedicatedGateway
     *
     */
    @Test
    public void releaseDedicatedGatewayTest() {
        ReleaseDedicatedGatewayRequest releaseDedicatedGatewayRequest = new ReleaseDedicatedGatewayRequest();
        releaseDedicatedGatewayRequest.setEtGatewayId("");
        releaseDedicatedGatewayRequest.setClientToken("");
        vpcClient.releaseDedicatedGateway(releaseDedicatedGatewayRequest);
    }
    /**
     * releaseNat
     *
     */
    @Test
    public void releaseNatTest() {
        ReleaseNatRequest releaseNatRequest = new ReleaseNatRequest();
        releaseNatRequest.setNatId("");
        releaseNatRequest.setClientToken("");
        vpcClient.releaseNat(releaseNatRequest);
    }
    /**
     * releasePeerConn
     *
     */
    @Test
    public void releasePeerConnTest() {
        ReleasePeerConnRequest releasePeerConnRequest = new ReleasePeerConnRequest();
        releasePeerConnRequest.setPeerConnId("");
        releasePeerConnRequest.setClientToken("");
        vpcClient.releasePeerConn(releasePeerConnRequest);
    }
    /**
     * releaseVpn
     *
     */
    @Test
    public void releaseVpnTest() {
        ReleaseVpnRequest releaseVpnRequest = new ReleaseVpnRequest();
        releaseVpnRequest.setVpnId("");
        releaseVpnRequest.setClientToken("");
        vpcClient.releaseVpn(releaseVpnRequest);
    }
    /**
     * removeEni
     *
     */
    @Test
    public void removeEniTest() {
        RemoveEniRequest removeEniRequest = new RemoveEniRequest();
        removeEniRequest.setEniId("");
        removeEniRequest.setClientToken("");
        vpcClient.removeEni(removeEniRequest);
    }
    /**
     * removeIpAddressFromIpGroup
     *
     */
    @Test
    public void removeIpAddressFromIpGroupTest() {
        RemoveIpAddressFromIpGroupRequest removeIpAddressFromIpGroupRequest = new RemoveIpAddressFromIpGroupRequest();
        removeIpAddressFromIpGroupRequest.setIpSetId("");
        removeIpAddressFromIpGroupRequest.setClientToken("");
        removeIpAddressFromIpGroupRequest.setIpAddressInfo(new ArrayList<>());
        vpcClient.removeIpAddressFromIpGroup(removeIpAddressFromIpGroupRequest);
    }
    /**
     * removeIpGroupFromIpSet
     *
     */
    @Test
    public void removeIpGroupFromIpSetTest() {
        RemoveIpGroupFromIpSetRequest removeIpGroupFromIpSetRequest = new RemoveIpGroupFromIpSetRequest();
        removeIpGroupFromIpSetRequest.setIpGroupId("");
        removeIpGroupFromIpSetRequest.setClientToken("");
        removeIpGroupFromIpSetRequest.setIpSetIds(new ArrayList<>());
        vpcClient.removeIpGroupFromIpSet(removeIpGroupFromIpSetRequest);
    }
    /**
     * renewPeerConn
     *
     */
    @Test
    public void renewPeerConnTest() {
        RenewPeerConnRequest renewPeerConnRequest = new RenewPeerConnRequest();
        renewPeerConnRequest.setPeerConnId("");
        renewPeerConnRequest.setClientToken("");
        renewPeerConnRequest.setBilling(null);
        vpcClient.renewPeerConn(renewPeerConnRequest);
    }
    /**
     * renewVpn
     *
     */
    @Test
    public void renewVpnTest() {
        RenewVpnRequest renewVpnRequest = new RenewVpnRequest();
        renewVpnRequest.setVpnId("");
        renewVpnRequest.setClientToken("");
        renewVpnRequest.setBilling(null);
        vpcClient.renewVpn(renewVpnRequest);
    }
    /**
     * resizeIpv6Gateway
     *
     */
    @Test
    public void resizeIpv6GatewayTest() {
        ResizeIpv6GatewayRequest resizeIpv6GatewayRequest = new ResizeIpv6GatewayRequest();
        resizeIpv6GatewayRequest.setGatewayId("");
        resizeIpv6GatewayRequest.setClientToken("");
        resizeIpv6GatewayRequest.setBandwidthInMbps(0);
        vpcClient.resizeIpv6Gateway(resizeIpv6GatewayRequest);
    }
    /**
     * resizeNat
     *
     */
    @Test
    public void resizeNatTest() {
        ResizeNatRequest resizeNatRequest = new ResizeNatRequest();
        resizeNatRequest.setNatId("");
        resizeNatRequest.setClientToken("");
        resizeNatRequest.setCuNum(0);
        vpcClient.resizeNat(resizeNatRequest);
    }
    /**
     * revokeSecurityGroupRules
     *
     */
    @Test
    public void revokeSecurityGroupRulesTest() {
        RevokeSecurityGroupRulesRequest revokeSecurityGroupRulesRequest = new RevokeSecurityGroupRulesRequest();
        revokeSecurityGroupRulesRequest.setSecurityGroupId("");
        revokeSecurityGroupRulesRequest.setClientToken("");
        revokeSecurityGroupRulesRequest.setSgVersion(0L);
        revokeSecurityGroupRulesRequest.setRule(null);
        vpcClient.revokeSecurityGroupRules(revokeSecurityGroupRulesRequest);
    }
    /**
     * searchForVpnDetails
     *
     */
    @Test
    public void searchForVpnDetailsTest() {
        SearchForVpnDetailsRequest searchForVpnDetailsRequest = new SearchForVpnDetailsRequest();
        searchForVpnDetailsRequest.setVpnId("");
        SearchForVpnDetailsResponse response = vpcClient.searchForVpnDetails(searchForVpnDetailsRequest);
        System.out.println(response);
    }
    /**
     * searchVpnTunnel
     *
     */
    @Test
    public void searchVpnTunnelTest() {
        SearchVpnTunnelRequest searchVpnTunnelRequest = new SearchVpnTunnelRequest();
        searchVpnTunnelRequest.setVpnId("");
        searchVpnTunnelRequest.setClientToken("");
        SearchVpnTunnelResponse response = vpcClient.searchVpnTunnel(searchVpnTunnelRequest);
        System.out.println(response);
    }
    /**
     * unbindEip
     *
     */
    @Test
    public void unbindEipTest() {
        UnbindEipRequest unbindEipRequest = new UnbindEipRequest();
        unbindEipRequest.setVpnId("");
        unbindEipRequest.setClientToken("");
        vpcClient.unbindEip(unbindEipRequest);
    }
    /**
     * unbindEniEip
     *
     */
    @Test
    public void unbindEniEipTest() {
        UnbindEniEipRequest unbindEniEipRequest = new UnbindEniEipRequest();
        unbindEniEipRequest.setEniId("");
        unbindEniEipRequest.setClientToken("");
        unbindEniEipRequest.setPublicIpAddress("");
        vpcClient.unbindEniEip(unbindEniEipRequest);
    }
    /**
     * unbindHaVipEip
     *
     */
    @Test
    public void unbindHaVipEipTest() {
        UnbindHaVipEipRequest unbindHaVipEipRequest = new UnbindHaVipEipRequest();
        unbindHaVipEipRequest.setHaVipId("");
        unbindHaVipEipRequest.setClientToken("");
        vpcClient.unbindHaVipEip(unbindHaVipEipRequest);
    }
    /**
     * unbindHaVipInstance
     *
     */
    @Test
    public void unbindHaVipInstanceTest() {
        UnbindHaVipInstanceRequest unbindHaVipInstanceRequest = new UnbindHaVipInstanceRequest();
        unbindHaVipInstanceRequest.setHaVipId("");
        unbindHaVipInstanceRequest.setClientToken("");
        unbindHaVipInstanceRequest.setInstanceIds(new ArrayList<>());
        unbindHaVipInstanceRequest.setInstanceType("");
        vpcClient.unbindHaVipInstance(unbindHaVipInstanceRequest);
    }
    /**
     * unbindPhysicalDedicatedLine
     *
     */
    @Test
    public void unbindPhysicalDedicatedLineTest() {
        UnbindPhysicalDedicatedLineRequest unbindPhysicalDedicatedLineRequest = new UnbindPhysicalDedicatedLineRequest();
        unbindPhysicalDedicatedLineRequest.setEtGatewayId("");
        unbindPhysicalDedicatedLineRequest.setClientToken("");
        vpcClient.unbindPhysicalDedicatedLine(unbindPhysicalDedicatedLineRequest);
    }
    /**
     * updateAclRules
     *
     */
    @Test
    public void updateAclRulesTest() {
        UpdateAclRulesRequest updateAclRulesRequest = new UpdateAclRulesRequest();
        updateAclRulesRequest.setAclRuleId("");
        updateAclRulesRequest.setClientToken("");
        updateAclRulesRequest.setDescription("");
        updateAclRulesRequest.setProtocol("");
        updateAclRulesRequest.setSourceIpAddress("");
        updateAclRulesRequest.setDestinationIpAddress("");
        updateAclRulesRequest.setSourcePort("");
        updateAclRulesRequest.setDestinationPort("");
        updateAclRulesRequest.setPosition(0);
        updateAclRulesRequest.setAction("");
        vpcClient.updateAclRules(updateAclRulesRequest);
    }
    /**
     * updateDedicatedGateway
     *
     */
    @Test
    public void updateDedicatedGatewayTest() {
        UpdateDedicatedGatewayRequest updateDedicatedGatewayRequest = new UpdateDedicatedGatewayRequest();
        updateDedicatedGatewayRequest.setEtGatewayId("");
        updateDedicatedGatewayRequest.setClientToken("");
        updateDedicatedGatewayRequest.setName("");
        updateDedicatedGatewayRequest.setSpeed(0);
        updateDedicatedGatewayRequest.setDescription("");
        updateDedicatedGatewayRequest.setLocalCidrs(new ArrayList<>());
        updateDedicatedGatewayRequest.setEnableIpv6(0);
        updateDedicatedGatewayRequest.setIpv6LocalCidrs(new ArrayList<>());
        vpcClient.updateDedicatedGateway(updateDedicatedGatewayRequest);
    }
    /**
     * updateDeleteProtect
     *
     */
    @Test
    public void updateDeleteProtectTest() {
        UpdateDeleteProtectRequest updateDeleteProtectRequest = new UpdateDeleteProtectRequest();
        updateDeleteProtectRequest.setGatewayId("");
        updateDeleteProtectRequest.setClientToken("");
        updateDeleteProtectRequest.setDeleteProtect(0);
        vpcClient.updateDeleteProtect(updateDeleteProtectRequest);
    }
    /**
     * updateDnatRule
     *
     */
    @Test
    public void updateDnatRuleTest() {
        UpdateDnatRuleRequest updateDnatRuleRequest = new UpdateDnatRuleRequest();
        updateDnatRuleRequest.setNatId("");
        updateDnatRuleRequest.setRuleId("");
        updateDnatRuleRequest.setClientToken("");
        updateDnatRuleRequest.setRuleName("");
        updateDnatRuleRequest.setProtocol("");
        updateDnatRuleRequest.setPublicPort(0);
        updateDnatRuleRequest.setPrivatePort(0);
        updateDnatRuleRequest.setPublicPortRange("");
        updateDnatRuleRequest.setPrivatePortRange("");
        updateDnatRuleRequest.setPrivateIpAddress("");
        updateDnatRuleRequest.setPublicIpAddress("");
        vpcClient.updateDnatRule(updateDnatRuleRequest);
    }
    /**
     * updateEni
     *
     */
    @Test
    public void updateEniTest() {
        UpdateEniRequest updateEniRequest = new UpdateEniRequest();
        updateEniRequest.setEniId("");
        updateEniRequest.setClientToken("");
        updateEniRequest.setName("");
        updateEniRequest.setDescription("");
        vpcClient.updateEni(updateEniRequest);
    }
    /**
     * updateEniEnterpriseSecurityGroup
     *
     */
    @Test
    public void updateEniEnterpriseSecurityGroupTest() {
        UpdateEniEnterpriseSecurityGroupRequest updateEniEnterpriseSecurityGroupRequest = new UpdateEniEnterpriseSecurityGroupRequest();
        updateEniEnterpriseSecurityGroupRequest.setEniId("");
        updateEniEnterpriseSecurityGroupRequest.setClientToken("");
        updateEniEnterpriseSecurityGroupRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        vpcClient.updateEniEnterpriseSecurityGroup(updateEniEnterpriseSecurityGroupRequest);
    }
    /**
     * updateEniSecurityGroup
     *
     */
    @Test
    public void updateEniSecurityGroupTest() {
        UpdateEniSecurityGroupRequest updateEniSecurityGroupRequest = new UpdateEniSecurityGroupRequest();
        updateEniSecurityGroupRequest.setEniId("");
        updateEniSecurityGroupRequest.setClientToken("");
        updateEniSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        vpcClient.updateEniSecurityGroup(updateEniSecurityGroupRequest);
    }
    /**
     * updateEnterpriseSecurityGroupRules
     *
     */
    @Test
    public void updateEnterpriseSecurityGroupRulesTest() {
        UpdateEnterpriseSecurityGroupRulesRequest updateEnterpriseSecurityGroupRulesRequest = new UpdateEnterpriseSecurityGroupRulesRequest();
        updateEnterpriseSecurityGroupRulesRequest.setEnterpriseSecurityGroupRuleId("");
        updateEnterpriseSecurityGroupRulesRequest.setClientToken("");
        updateEnterpriseSecurityGroupRulesRequest.setRemark("");
        updateEnterpriseSecurityGroupRulesRequest.setPortRange("");
        updateEnterpriseSecurityGroupRulesRequest.setSourcePortRange("");
        updateEnterpriseSecurityGroupRulesRequest.setSourceIp("");
        updateEnterpriseSecurityGroupRulesRequest.setDestIp("");
        updateEnterpriseSecurityGroupRulesRequest.setLocalIp("");
        updateEnterpriseSecurityGroupRulesRequest.setRemoteIpSet("");
        updateEnterpriseSecurityGroupRulesRequest.setRemoteIpGroup("");
        updateEnterpriseSecurityGroupRulesRequest.setAction("");
        updateEnterpriseSecurityGroupRulesRequest.setPriority(0);
        updateEnterpriseSecurityGroupRulesRequest.setProtocol("");
        vpcClient.updateEnterpriseSecurityGroupRules(updateEnterpriseSecurityGroupRulesRequest);
    }
    /**
     * updateHaVip
     *
     */
    @Test
    public void updateHaVipTest() {
        UpdateHaVipRequest updateHaVipRequest = new UpdateHaVipRequest();
        updateHaVipRequest.setHaVipId("");
        updateHaVipRequest.setClientToken("");
        updateHaVipRequest.setName("");
        updateHaVipRequest.setDescription("");
        vpcClient.updateHaVip(updateHaVipRequest);
    }
    /**
     * updateIpGroup
     *
     */
    @Test
    public void updateIpGroupTest() {
        UpdateIpGroupRequest updateIpGroupRequest = new UpdateIpGroupRequest();
        updateIpGroupRequest.setIpSetId("");
        updateIpGroupRequest.setClientToken("");
        updateIpGroupRequest.setName("");
        updateIpGroupRequest.setDescription("");
        vpcClient.updateIpGroup(updateIpGroupRequest);
    }
    /**
     * updateIpSet
     *
     */
    @Test
    public void updateIpSetTest() {
        UpdateIpSetRequest updateIpSetRequest = new UpdateIpSetRequest();
        updateIpSetRequest.setIpGroupId("");
        updateIpSetRequest.setClientToken("");
        updateIpSetRequest.setName("");
        updateIpSetRequest.setDescription("");
        vpcClient.updateIpSet(updateIpSetRequest);
    }
    /**
     * updateNatReleaseProtectionSwitch
     *
     */
    @Test
    public void updateNatReleaseProtectionSwitchTest() {
        UpdateNatReleaseProtectionSwitchRequest updateNatReleaseProtectionSwitchRequest = new UpdateNatReleaseProtectionSwitchRequest();
        updateNatReleaseProtectionSwitchRequest.setNatId("");
        updateNatReleaseProtectionSwitchRequest.setClientToken("");
        updateNatReleaseProtectionSwitchRequest.setDeleteProtect(false);
        vpcClient.updateNatReleaseProtectionSwitch(updateNatReleaseProtectionSwitchRequest);
    }
    /**
     * updatePeerConn
     *
     */
    @Test
    public void updatePeerConnTest() {
        UpdatePeerConnRequest updatePeerConnRequest = new UpdatePeerConnRequest();
        updatePeerConnRequest.setPeerConnId("");
        updatePeerConnRequest.setClientToken("");
        updatePeerConnRequest.setLocalIfId("");
        updatePeerConnRequest.setDescription("");
        updatePeerConnRequest.setLocalIfName("");
        vpcClient.updatePeerConn(updatePeerConnRequest);
    }
    /**
     * updatePeerConnBandwidth
     *
     */
    @Test
    public void updatePeerConnBandwidthTest() {
        UpdatePeerConnBandwidthRequest updatePeerConnBandwidthRequest = new UpdatePeerConnBandwidthRequest();
        updatePeerConnBandwidthRequest.setPeerConnId("");
        updatePeerConnBandwidthRequest.setClientToken("");
        updatePeerConnBandwidthRequest.setNewBandwidthInMbps(0);
        vpcClient.updatePeerConnBandwidth(updatePeerConnBandwidthRequest);
    }
    /**
     * updatePeerConnDeleteProtect
     *
     */
    @Test
    public void updatePeerConnDeleteProtectTest() {
        UpdatePeerConnDeleteProtectRequest updatePeerConnDeleteProtectRequest = new UpdatePeerConnDeleteProtectRequest();
        updatePeerConnDeleteProtectRequest.setPeerConnId("");
        updatePeerConnDeleteProtectRequest.setClientToken("");
        updatePeerConnDeleteProtectRequest.setDeleteProtect(false);
        vpcClient.updatePeerConnDeleteProtect(updatePeerConnDeleteProtectRequest);
    }
    /**
     * updateProbe
     *
     */
    @Test
    public void updateProbeTest() {
        UpdateProbeRequest updateProbeRequest = new UpdateProbeRequest();
        updateProbeRequest.setProbeId("");
        updateProbeRequest.setClientToken("");
        updateProbeRequest.setName("");
        updateProbeRequest.setDescription("");
        updateProbeRequest.setDestIp("");
        updateProbeRequest.setDestPort(0);
        vpcClient.updateProbe(updateProbeRequest);
    }
    /**
     * updateRateLimitRule
     *
     */
    @Test
    public void updateRateLimitRuleTest() {
        UpdateRateLimitRuleRequest updateRateLimitRuleRequest = new UpdateRateLimitRuleRequest();
        updateRateLimitRuleRequest.setGatewayId("");
        updateRateLimitRuleRequest.setRateLimitRuleId("");
        updateRateLimitRuleRequest.setClientToken("");
        updateRateLimitRuleRequest.setIngressBandwidthInMbps(0);
        updateRateLimitRuleRequest.setEgressBandwidthInMbps(0);
        vpcClient.updateRateLimitRule(updateRateLimitRuleRequest);
    }
    /**
     * updateRoutingRules
     *
     */
    @Test
    public void updateRoutingRulesTest() {
        UpdateRoutingRulesRequest updateRoutingRulesRequest = new UpdateRoutingRulesRequest();
        updateRoutingRulesRequest.setRouteRuleId("");
        updateRoutingRulesRequest.setClientToken("");
        updateRoutingRulesRequest.setSourceAddress("");
        updateRoutingRulesRequest.setDestinationAddress("");
        updateRoutingRulesRequest.setNexthopId("");
        updateRoutingRulesRequest.setDescription("");
        vpcClient.updateRoutingRules(updateRoutingRulesRequest);
    }
    /**
     * updateSecurityGroupRules
     *
     */
    @Test
    public void updateSecurityGroupRulesTest() {
        UpdateSecurityGroupRulesRequest updateSecurityGroupRulesRequest = new UpdateSecurityGroupRulesRequest();
        updateSecurityGroupRulesRequest.setClientToken("");
        updateSecurityGroupRulesRequest.setSgVersion(0L);
        updateSecurityGroupRulesRequest.setSecurityGroupRuleId("");
        updateSecurityGroupRulesRequest.setRemark("");
        updateSecurityGroupRulesRequest.setPortRange("");
        updateSecurityGroupRulesRequest.setSourceIp("");
        updateSecurityGroupRulesRequest.setSourceGroupId("");
        updateSecurityGroupRulesRequest.setDestIp("");
        updateSecurityGroupRulesRequest.setDestGroupId("");
        updateSecurityGroupRulesRequest.setProtocol("");
        vpcClient.updateSecurityGroupRules(updateSecurityGroupRulesRequest);
    }
    /**
     * updateSnatRule
     *
     */
    @Test
    public void updateSnatRuleTest() {
        UpdateSnatRuleRequest updateSnatRuleRequest = new UpdateSnatRuleRequest();
        updateSnatRuleRequest.setNatId("");
        updateSnatRuleRequest.setRuleId("");
        updateSnatRuleRequest.setClientToken("");
        updateSnatRuleRequest.setRuleName("");
        updateSnatRuleRequest.setSourceCIDR("");
        updateSnatRuleRequest.setPublicIpsAddress(new ArrayList<>());
        vpcClient.updateSnatRule(updateSnatRuleRequest);
    }
    /**
     * updateSslVpnServer
     *
     */
    @Test
    public void updateSslVpnServerTest() {
        UpdateSslVpnServerRequest updateSslVpnServerRequest = new UpdateSslVpnServerRequest();
        updateSslVpnServerRequest.setVpnId("");
        updateSslVpnServerRequest.setSslVpnServerId("");
        updateSslVpnServerRequest.setClientToken("");
        updateSslVpnServerRequest.setSslVpnServerName("");
        updateSslVpnServerRequest.setLocalSubnets(new ArrayList<>());
        updateSslVpnServerRequest.setRemoteSubnet("");
        updateSslVpnServerRequest.setClientDns("");
        vpcClient.updateSslVpnServer(updateSslVpnServerRequest);
    }
    /**
     * updateSslVpnUsers
     *
     */
    @Test
    public void updateSslVpnUsersTest() {
        UpdateSslVpnUsersRequest updateSslVpnUsersRequest = new UpdateSslVpnUsersRequest();
        updateSslVpnUsersRequest.setVpnId("");
        updateSslVpnUsersRequest.setUserId("");
        updateSslVpnUsersRequest.setClientToken("");
        updateSslVpnUsersRequest.setClientName("");
        updateSslVpnUsersRequest.setPassword("");
        updateSslVpnUsersRequest.setDescription("");
        vpcClient.updateSslVpnUsers(updateSslVpnUsersRequest);
    }
    /**
     * updateSubnet
     *
     */
    @Test
    public void updateSubnetTest() {
        UpdateSubnetRequest updateSubnetRequest = new UpdateSubnetRequest();
        updateSubnetRequest.setSubnetId("");
        updateSubnetRequest.setClientToken("");
        updateSubnetRequest.setName("");
        updateSubnetRequest.setDescription("");
        updateSubnetRequest.setEnableIpv6(false);
        vpcClient.updateSubnet(updateSubnetRequest);
    }
    /**
     * updateUserGateway
     *
     */
    @Test
    public void updateUserGatewayTest() {
        UpdateUserGatewayRequest updateUserGatewayRequest = new UpdateUserGatewayRequest();
        updateUserGatewayRequest.setCgwId("");
        updateUserGatewayRequest.setClientToken("");
        updateUserGatewayRequest.setName("");
        updateUserGatewayRequest.setDescription("");
        vpcClient.updateUserGateway(updateUserGatewayRequest);
    }
    /**
     * updateVpc
     *
     */
    @Test
    public void updateVpcTest() {
        UpdateVpcRequest updateVpcRequest = new UpdateVpcRequest();
        updateVpcRequest.setVpcId("");
        updateVpcRequest.setClientToken("");
        updateVpcRequest.setName("");
        updateVpcRequest.setDescription("");
        updateVpcRequest.setEnableIpv6(false);
        updateVpcRequest.setSecondaryCidr(new ArrayList<>());
        vpcClient.updateVpc(updateVpcRequest);
    }
    /**
     * updateVpn
     *
     */
    @Test
    public void updateVpnTest() {
        UpdateVpnRequest updateVpnRequest = new UpdateVpnRequest();
        updateVpnRequest.setVpnId("");
        updateVpnRequest.setClientToken("");
        updateVpnRequest.setVpnName("");
        updateVpnRequest.setDescription("");
        vpcClient.updateVpn(updateVpnRequest);
    }
    /**
     * updateVpnReleaseProtection
     *
     */
    @Test
    public void updateVpnReleaseProtectionTest() {
        UpdateVpnReleaseProtectionRequest updateVpnReleaseProtectionRequest = new UpdateVpnReleaseProtectionRequest();
        updateVpnReleaseProtectionRequest.setVpnId("");
        updateVpnReleaseProtectionRequest.setClientToken("");
        updateVpnReleaseProtectionRequest.setDeleteProtect(false);
        vpcClient.updateVpnReleaseProtection(updateVpnReleaseProtectionRequest);
    }
    /**
     * updateVpnTunnel
     *
     */
    @Test
    public void updateVpnTunnelTest() {
        UpdateVpnTunnelRequest updateVpnTunnelRequest = new UpdateVpnTunnelRequest();
        updateVpnTunnelRequest.setVpnConnId("");
        updateVpnTunnelRequest.setClientToken("");
        updateVpnTunnelRequest.setVpnId("");
        updateVpnTunnelRequest.setSecretKey("");
        updateVpnTunnelRequest.setLocalSubnets(new ArrayList<>());
        updateVpnTunnelRequest.setCgwId("");
        updateVpnTunnelRequest.setRemoteSubnets(new ArrayList<>());
        updateVpnTunnelRequest.setDescription("");
        updateVpnTunnelRequest.setVpnConnName("");
        updateVpnTunnelRequest.setIkeConfig(null);
        updateVpnTunnelRequest.setIpsecConfig(null);
        vpcClient.updateVpnTunnel(updateVpnTunnelRequest);
    }
    /**
     * userGatewayDetails
     *
     */
    @Test
    public void userGatewayDetailsTest() {
        UserGatewayDetailsRequest userGatewayDetailsRequest = new UserGatewayDetailsRequest();
        userGatewayDetailsRequest.setCgwId("");
        UserGatewayDetailsResponse response = vpcClient.userGatewayDetails(userGatewayDetailsRequest);
        System.out.println(response);
    }
    /**
     * userGatewayList
     *
     */
    @Test
    public void userGatewayListTest() {
        UserGatewayListRequest userGatewayListRequest = new UserGatewayListRequest();
        userGatewayListRequest.setMarker("");
        userGatewayListRequest.setMaxKeys(0);
        UserGatewayListResponse response = vpcClient.userGatewayList(userGatewayListRequest);
        System.out.println(response);
    }
    /**
     * viewGatewayLimitRules
     *
     */
    @Test
    public void viewGatewayLimitRulesTest() {
        ViewGatewayLimitRulesRequest viewGatewayLimitRulesRequest = new ViewGatewayLimitRulesRequest();
        viewGatewayLimitRulesRequest.setServiceType("");
        viewGatewayLimitRulesRequest.setName("");
        viewGatewayLimitRulesRequest.setGlrId("");
        viewGatewayLimitRulesRequest.setResourceId("");
        viewGatewayLimitRulesRequest.setMarker("");
        viewGatewayLimitRulesRequest.setMaxKeys("");
        ViewGatewayLimitRulesResponse response = vpcClient.viewGatewayLimitRules(viewGatewayLimitRulesRequest);
        System.out.println(response);
    }
}
