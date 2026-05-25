package com.baidubce.vpc;

import com.baidubce.vpc.models.AcceptPeerToPeerConnectionApplicationsRequest;
import com.baidubce.vpc.models.ActiveStandbySwitchoverRequest;
import com.baidubce.vpc.models.AddAclRuleRequest;
import com.baidubce.vpc.models.AddElasticNetworkCardAuxiliaryIpRequest;
import com.baidubce.vpc.models.AddElasticNetworkCardAuxiliaryIpResponse;
import com.baidubce.vpc.models.AddIpAddressGroupToIpAddressFamilyRequest;
import com.baidubce.vpc.models.AddIpAddressesToTheIpAddressGroupRequest;
import com.baidubce.vpc.models.AddIpv6OnlyOutboundAndNoInboundPolicyRequest;
import com.baidubce.vpc.models.AddIpv6OnlyOutboundAndNoInboundPolicyResponse;
import com.baidubce.vpc.models.AuthorizeRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.AuthorizedEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.BatchAddDnatRulesRequest;
import com.baidubce.vpc.models.BatchAddDnatRulesResponse;
import com.baidubce.vpc.models.BatchAddSnatRulesRequest;
import com.baidubce.vpc.models.BatchAddSnatRulesResponse;
import com.baidubce.vpc.models.BatchCreateSslVpnUsersRequest;
import com.baidubce.vpc.models.BatchCreateSslVpnUsersResponse;
import com.baidubce.vpc.models.BatchDeleteElasticNetworkCardIntranetIpRequest;
import com.baidubce.vpc.models.BatchIncreaseElasticNetworkCardIntranetIpRequest;
import com.baidubce.vpc.models.BatchIncreaseElasticNetworkCardIntranetIpResponse;
import com.baidubce.vpc.models.BindEipRequest;
import com.baidubce.vpc.models.BindPhysicalDedicatedLineRequest;
import com.baidubce.vpc.models.ClosePeerToPeerConnectionToSynchronizeDnsRequest;
import com.baidubce.vpc.models.CloseVpcRelayRequest;
import com.baidubce.vpc.models.CreateAHighlyAvailableVirtualIpRequest;
import com.baidubce.vpc.models.CreateAHighlyAvailableVirtualIpResponse;
import com.baidubce.vpc.models.CreateAPeerToPeerConnectionRequest;
import com.baidubce.vpc.models.CreateAPeerToPeerConnectionResponse;
import com.baidubce.vpc.models.CreateARegularSecurityGroupV2Request;
import com.baidubce.vpc.models.CreateARegularSecurityGroupV2Response;
import com.baidubce.vpc.models.CreateAnIpv6GatewayRequest;
import com.baidubce.vpc.models.CreateAnIpv6GatewayResponse;
import com.baidubce.vpc.models.CreateDedicatedGatewayHealthCheckRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayResponse;
import com.baidubce.vpc.models.CreateDnatRuleRequest;
import com.baidubce.vpc.models.CreateDnatRuleResponse;
import com.baidubce.vpc.models.CreateElasticNetworkCardRequest;
import com.baidubce.vpc.models.CreateElasticNetworkCardResponse;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupResponse;
import com.baidubce.vpc.models.CreateGatewayLimitRulesRequest;
import com.baidubce.vpc.models.CreateGatewayLimitRulesResponse;
import com.baidubce.vpc.models.CreateIpAddressFamilyRequest;
import com.baidubce.vpc.models.CreateIpAddressFamilyResponse;
import com.baidubce.vpc.models.CreateIpAddressGroupRequest;
import com.baidubce.vpc.models.CreateIpAddressGroupResponse;
import com.baidubce.vpc.models.CreateIpReservedRequest;
import com.baidubce.vpc.models.CreateIpReservedResponse;
import com.baidubce.vpc.models.CreateIpv6GatewaySpeedLimitPolicyRequest;
import com.baidubce.vpc.models.CreateIpv6GatewaySpeedLimitPolicyResponse;
import com.baidubce.vpc.models.CreateNatRequest;
import com.baidubce.vpc.models.CreateNatResponse;
import com.baidubce.vpc.models.CreateNetworkDetectionRequest;
import com.baidubce.vpc.models.CreateNetworkDetectionResponse;
import com.baidubce.vpc.models.CreateRoutingRulesRequest;
import com.baidubce.vpc.models.CreateRoutingRulesResponse;
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
import com.baidubce.vpc.models.DeleteElasticNetworkCardAuxiliaryIpRequest;
import com.baidubce.vpc.models.DeleteEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.DeleteEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.DeleteGatewayLimitRuleRequest;
import com.baidubce.vpc.models.DeleteHighlyAvailableVirtualIpRequest;
import com.baidubce.vpc.models.DeleteIpAddressFamilyRequest;
import com.baidubce.vpc.models.DeleteIpAddressFromIpAddressGroupRequest;
import com.baidubce.vpc.models.DeleteIpAddressGroupRequest;
import com.baidubce.vpc.models.DeleteIpReserveRequest;
import com.baidubce.vpc.models.DeleteIpv6GatewayRequest;
import com.baidubce.vpc.models.DeleteIpv6GatewaySpeedLimitPolicyRequest;
import com.baidubce.vpc.models.DeleteIpv6OnlyAccessPolicyRequest;
import com.baidubce.vpc.models.DeleteNetworkDetectionRequest;
import com.baidubce.vpc.models.DeleteRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.DeleteRegularSecurityGroupV2Request;
import com.baidubce.vpc.models.DeleteRoutingRulesRequest;
import com.baidubce.vpc.models.DeleteSnatRuleRequest;
import com.baidubce.vpc.models.DeleteSslVpnServerRequest;
import com.baidubce.vpc.models.DeleteSslVpnUserRequest;
import com.baidubce.vpc.models.DeleteSubnetRequest;
import com.baidubce.vpc.models.DeleteUserGatewayRequest;
import com.baidubce.vpc.models.DeleteVpcRequest;
import com.baidubce.vpc.models.DeleteVpnTunnelRequest;
import com.baidubce.vpc.models.ElasticNetworkCardBindingEipRequest;
import com.baidubce.vpc.models.ElasticNetworkCardMountedCloudProductInstanceRequest;
import com.baidubce.vpc.models.ElasticNetworkCardUnbindingEipRequest;
import com.baidubce.vpc.models.ElasticNetworkCardUninstallationCloudProductInstanceRequest;
import com.baidubce.vpc.models.ElasticNetworkCardUpdateEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.ElasticNetworkCardUpdatesRegularSecurityGroupRequest;
import com.baidubce.vpc.models.EnablePeerToPeerConnectionToSynchronizeDnsRequest;
import com.baidubce.vpc.models.GetNatRequest;
import com.baidubce.vpc.models.GetNatResponse;
import com.baidubce.vpc.models.GetVpcResourceIpInfoRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoResponse;
import com.baidubce.vpc.models.HighAvailabilityVirtualIpUnbindingEipRequest;
import com.baidubce.vpc.models.HighAvailabilityVirtualIpUnbindingInstanceRequest;
import com.baidubce.vpc.models.HighlyAvailableVirtualIpBindingEipRequest;
import com.baidubce.vpc.models.HighlyAvailableVirtualIpBindingInstanceRequest;
import com.baidubce.vpc.models.Ipv6GatewayBandwidthUpgradeAndDowngradeRequest;
import com.baidubce.vpc.models.ListDnatRuleRequest;
import com.baidubce.vpc.models.ListDnatRuleResponse;
import com.baidubce.vpc.models.ListIpReserveRequest;
import com.baidubce.vpc.models.ListIpReserveResponse;
import com.baidubce.vpc.models.ListNatRequest;
import com.baidubce.vpc.models.ListNatResponse;
import com.baidubce.vpc.models.ListSnatRuleRequest;
import com.baidubce.vpc.models.ListSnatRuleResponse;
import com.baidubce.vpc.models.ModifyGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ModifyNatRequest;
import com.baidubce.vpc.models.NatBindEipRequest;
import com.baidubce.vpc.models.NatUnBindEipRequest;
import com.baidubce.vpc.models.OpenVpcRelayRequest;
import com.baidubce.vpc.models.PeerToPeerConnectionBandwidthUpgradeAndDowngradeRequest;
import com.baidubce.vpc.models.PeerToPeerConnectionRenewalRequest;
import com.baidubce.vpc.models.PrepaidPeerToPeerConnectionUnsubscribeRequest;
import com.baidubce.vpc.models.PurchaseReservedNatRequest;
import com.baidubce.vpc.models.QueryAclRequest;
import com.baidubce.vpc.models.QueryAclResponse;
import com.baidubce.vpc.models.QueryAclRulesRequest;
import com.baidubce.vpc.models.QueryAclRulesResponse;
import com.baidubce.vpc.models.QueryIpAddressFamilyListRequest;
import com.baidubce.vpc.models.QueryIpAddressFamilyListResponse;
import com.baidubce.vpc.models.QueryIpv6GatewayRequest;
import com.baidubce.vpc.models.QueryIpv6GatewayResponse;
import com.baidubce.vpc.models.QueryNetworkDetectionDetailsRequest;
import com.baidubce.vpc.models.QueryNetworkDetectionDetailsResponse;
import com.baidubce.vpc.models.QueryNetworkDetectionListRequest;
import com.baidubce.vpc.models.QueryNetworkDetectionListResponse;
import com.baidubce.vpc.models.QueryRoutingRulesRequest;
import com.baidubce.vpc.models.QueryRoutingRulesResponse;
import com.baidubce.vpc.models.QueryRoutingTableRequest;
import com.baidubce.vpc.models.QueryRoutingTableResponse;
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
import com.baidubce.vpc.models.QueryTheListOfElasticNetworkCardsRequest;
import com.baidubce.vpc.models.QueryTheListOfElasticNetworkCardsResponse;
import com.baidubce.vpc.models.QueryTheListOfEnterpriseSecurityGroupsRequest;
import com.baidubce.vpc.models.QueryTheListOfEnterpriseSecurityGroupsResponse;
import com.baidubce.vpc.models.QueryTheListOfHighlyAvailableVirtualIpsRequest;
import com.baidubce.vpc.models.QueryTheListOfHighlyAvailableVirtualIpsResponse;
import com.baidubce.vpc.models.QueryTheListOfIpAddressGroupsRequest;
import com.baidubce.vpc.models.QueryTheListOfIpAddressGroupsResponse;
import com.baidubce.vpc.models.QueryTheListOfPeerConnectionsRequest;
import com.baidubce.vpc.models.QueryTheListOfPeerConnectionsResponse;
import com.baidubce.vpc.models.QueryTheListOfRegularSecurityGroupsV2Request;
import com.baidubce.vpc.models.QueryTheListOfRegularSecurityGroupsV2Response;
import com.baidubce.vpc.models.QueryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest;
import com.baidubce.vpc.models.QueryTheListOfSpeedLimitPoliciesForIpv6GatewayResponse;
import com.baidubce.vpc.models.QueryTheSpecifiedElasticNetworkCardRequest;
import com.baidubce.vpc.models.QueryTheSpecifiedElasticNetworkCardResponse;
import com.baidubce.vpc.models.QueryTheSpecifiedHighlyAvailableVirtualIpRequest;
import com.baidubce.vpc.models.QueryTheSpecifiedHighlyAvailableVirtualIpResponse;
import com.baidubce.vpc.models.QueryTheSpecifiedIpAddressFamilyRequest;
import com.baidubce.vpc.models.QueryTheSpecifiedIpAddressFamilyResponse;
import com.baidubce.vpc.models.QueryTheSpecifiedIpAddressGroupRequest;
import com.baidubce.vpc.models.QueryTheSpecifiedIpAddressGroupResponse;
import com.baidubce.vpc.models.QueryTheStatusOfTheElasticNetworkCardRequest;
import com.baidubce.vpc.models.QueryTheStatusOfTheElasticNetworkCardResponse;
import com.baidubce.vpc.models.QueryVpcIntranetIpRequest;
import com.baidubce.vpc.models.QueryVpcIntranetIpResponse;
import com.baidubce.vpc.models.QueryVpcListRequest;
import com.baidubce.vpc.models.QueryVpcListResponse;
import com.baidubce.vpc.models.QueryVpnListRequest;
import com.baidubce.vpc.models.QueryVpnListResponse;
import com.baidubce.vpc.models.QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest;
import com.baidubce.vpc.models.QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionResponse;
import com.baidubce.vpc.models.RejectPeerToPeerConnectionRequestRequest;
import com.baidubce.vpc.models.ReleaseDedicatedGatewayRequest;
import com.baidubce.vpc.models.ReleaseNatRequest;
import com.baidubce.vpc.models.ReleasePeerToPeerConnectionRequest;
import com.baidubce.vpc.models.ReleaseVpnRequest;
import com.baidubce.vpc.models.RemoveElasticNetworkCardRequest;
import com.baidubce.vpc.models.RemoveIpAddressGroupFromIpAddressFamilyRequest;
import com.baidubce.vpc.models.RenewVpnRequest;
import com.baidubce.vpc.models.ResizeNatRequest;
import com.baidubce.vpc.models.RevokeRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.SearchForVpnDetailsRequest;
import com.baidubce.vpc.models.SearchForVpnDetailsResponse;
import com.baidubce.vpc.models.SearchVpnTunnelRequest;
import com.baidubce.vpc.models.SearchVpnTunnelResponse;
import com.baidubce.vpc.models.UnbindEipRequest;
import com.baidubce.vpc.models.UnbindPhysicalDedicatedLineRequest;
import com.baidubce.vpc.models.UpdateAclRulesRequest;
import com.baidubce.vpc.models.UpdateDedicatedGatewayRequest;
import com.baidubce.vpc.models.UpdateDnatRuleRequest;
import com.baidubce.vpc.models.UpdateElasticNetworkCardRequest;
import com.baidubce.vpc.models.UpdateEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.UpdateHighlyAvailableVirtualIpRequest;
import com.baidubce.vpc.models.UpdateIpAddressFamilyRequest;
import com.baidubce.vpc.models.UpdateIpAddressGroupRequest;
import com.baidubce.vpc.models.UpdateIpv6GatewayReleaseProtectionSwitchRequest;
import com.baidubce.vpc.models.UpdateIpv6GatewaySpeedLimitPolicyRequest;
import com.baidubce.vpc.models.UpdateNatReleaseProtectionSwitchRequest;
import com.baidubce.vpc.models.UpdateNetworkDetectionRequest;
import com.baidubce.vpc.models.UpdatePeerToPeerConnectionReleaseProtectionSwitchRequest;
import com.baidubce.vpc.models.UpdateRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.UpdateRoutingRulesRequest;
import com.baidubce.vpc.models.UpdateSnatRuleRequest;
import com.baidubce.vpc.models.UpdateSslVpnServerRequest;
import com.baidubce.vpc.models.UpdateSslVpnUsersRequest;
import com.baidubce.vpc.models.UpdateSubnetRequest;
import com.baidubce.vpc.models.UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest;
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
import com.baidubce.vpc.models.ViewPeerToPeerConnectionDetailsRequest;
import com.baidubce.vpc.models.ViewPeerToPeerConnectionDetailsResponse;
import com.baidubce.vpc.models.ViewSecurityGroupDetailsV2Request;
import com.baidubce.vpc.models.ViewSecurityGroupDetailsV2Response;
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
     * acceptPeerToPeerConnectionApplications
     *
     */
    @Test
    public void acceptPeerToPeerConnectionApplicationsTest() {
        AcceptPeerToPeerConnectionApplicationsRequest acceptPeerToPeerConnectionApplicationsRequest = new AcceptPeerToPeerConnectionApplicationsRequest();
        acceptPeerToPeerConnectionApplicationsRequest.setPeerConnId("");
        acceptPeerToPeerConnectionApplicationsRequest.setClientToken("");
        vpcClient.acceptPeerToPeerConnectionApplications(acceptPeerToPeerConnectionApplicationsRequest);
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
     * addElasticNetworkCardAuxiliaryIp
     *
     */
    @Test
    public void addElasticNetworkCardAuxiliaryIpTest() {
        AddElasticNetworkCardAuxiliaryIpRequest addElasticNetworkCardAuxiliaryIpRequest = new AddElasticNetworkCardAuxiliaryIpRequest();
        addElasticNetworkCardAuxiliaryIpRequest.setEniId("");
        addElasticNetworkCardAuxiliaryIpRequest.setClientToken("");
        addElasticNetworkCardAuxiliaryIpRequest.setIsIpv6(false);
        addElasticNetworkCardAuxiliaryIpRequest.setPrivateIpAddress("");
        AddElasticNetworkCardAuxiliaryIpResponse response = vpcClient.addElasticNetworkCardAuxiliaryIp(addElasticNetworkCardAuxiliaryIpRequest);
        System.out.println(response);
    }
    /**
     * addIpAddressGroupToIpAddressFamily
     *
     */
    @Test
    public void addIpAddressGroupToIpAddressFamilyTest() {
        AddIpAddressGroupToIpAddressFamilyRequest addIpAddressGroupToIpAddressFamilyRequest = new AddIpAddressGroupToIpAddressFamilyRequest();
        addIpAddressGroupToIpAddressFamilyRequest.setIpGroupId("");
        addIpAddressGroupToIpAddressFamilyRequest.setClientToken("");
        addIpAddressGroupToIpAddressFamilyRequest.setIpSetIds(new ArrayList<>());
        vpcClient.addIpAddressGroupToIpAddressFamily(addIpAddressGroupToIpAddressFamilyRequest);
    }
    /**
     * addIpAddressesToTheIpAddressGroup
     *
     */
    @Test
    public void addIpAddressesToTheIpAddressGroupTest() {
        AddIpAddressesToTheIpAddressGroupRequest addIpAddressesToTheIpAddressGroupRequest = new AddIpAddressesToTheIpAddressGroupRequest();
        addIpAddressesToTheIpAddressGroupRequest.setIpSetId("");
        addIpAddressesToTheIpAddressGroupRequest.setClientToken("");
        addIpAddressesToTheIpAddressGroupRequest.setIpAddressInfo(new ArrayList<>());
        vpcClient.addIpAddressesToTheIpAddressGroup(addIpAddressesToTheIpAddressGroupRequest);
    }
    /**
     * addIpv6OnlyOutboundAndNoInboundPolicy
     *
     */
    @Test
    public void addIpv6OnlyOutboundAndNoInboundPolicyTest() {
        AddIpv6OnlyOutboundAndNoInboundPolicyRequest addIpv6OnlyOutboundAndNoInboundPolicyRequest = new AddIpv6OnlyOutboundAndNoInboundPolicyRequest();
        addIpv6OnlyOutboundAndNoInboundPolicyRequest.setGatewayId("");
        addIpv6OnlyOutboundAndNoInboundPolicyRequest.setClientToken("");
        addIpv6OnlyOutboundAndNoInboundPolicyRequest.setCidr("");
        AddIpv6OnlyOutboundAndNoInboundPolicyResponse response = vpcClient.addIpv6OnlyOutboundAndNoInboundPolicy(addIpv6OnlyOutboundAndNoInboundPolicyRequest);
        System.out.println(response);
    }
    /**
     * authorizeRegularSecurityGroupRulesV2
     *
     */
    @Test
    public void authorizeRegularSecurityGroupRulesV2Test() {
        AuthorizeRegularSecurityGroupRulesV2Request authorizeRegularSecurityGroupRulesV2Request = new AuthorizeRegularSecurityGroupRulesV2Request();
        authorizeRegularSecurityGroupRulesV2Request.setSecurityGroupId("");
        authorizeRegularSecurityGroupRulesV2Request.setSgVersion(0L);
        authorizeRegularSecurityGroupRulesV2Request.setClientToken("");
        authorizeRegularSecurityGroupRulesV2Request.setRule(null);
        vpcClient.authorizeRegularSecurityGroupRulesV2(authorizeRegularSecurityGroupRulesV2Request);
    }
    /**
     * authorizedEnterpriseSecurityGroupRules
     *
     */
    @Test
    public void authorizedEnterpriseSecurityGroupRulesTest() {
        AuthorizedEnterpriseSecurityGroupRulesRequest authorizedEnterpriseSecurityGroupRulesRequest = new AuthorizedEnterpriseSecurityGroupRulesRequest();
        authorizedEnterpriseSecurityGroupRulesRequest.setEnterpriseSecurityGroupId("");
        authorizedEnterpriseSecurityGroupRulesRequest.setClientToken("");
        authorizedEnterpriseSecurityGroupRulesRequest.setRules(new ArrayList<>());
        vpcClient.authorizedEnterpriseSecurityGroupRules(authorizedEnterpriseSecurityGroupRulesRequest);
    }
    /**
     * batchAddDnatRules
     *
     */
    @Test
    public void batchAddDnatRulesTest() {
        BatchAddDnatRulesRequest batchAddDnatRulesRequest = new BatchAddDnatRulesRequest();
        batchAddDnatRulesRequest.setClientToken("");
        batchAddDnatRulesRequest.setNatId("");
        batchAddDnatRulesRequest.setRules(new ArrayList<>());
        BatchAddDnatRulesResponse response = vpcClient.batchAddDnatRules(batchAddDnatRulesRequest);
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
     * batchDeleteElasticNetworkCardIntranetIp
     *
     */
    @Test
    public void batchDeleteElasticNetworkCardIntranetIpTest() {
        BatchDeleteElasticNetworkCardIntranetIpRequest batchDeleteElasticNetworkCardIntranetIpRequest = new BatchDeleteElasticNetworkCardIntranetIpRequest();
        batchDeleteElasticNetworkCardIntranetIpRequest.setEniId("");
        batchDeleteElasticNetworkCardIntranetIpRequest.setClientToken("");
        batchDeleteElasticNetworkCardIntranetIpRequest.setPrivateIpAddresses(new ArrayList<>());
        vpcClient.batchDeleteElasticNetworkCardIntranetIp(batchDeleteElasticNetworkCardIntranetIpRequest);
    }
    /**
     * batchIncreaseElasticNetworkCardIntranetIp
     *
     */
    @Test
    public void batchIncreaseElasticNetworkCardIntranetIpTest() {
        BatchIncreaseElasticNetworkCardIntranetIpRequest batchIncreaseElasticNetworkCardIntranetIpRequest = new BatchIncreaseElasticNetworkCardIntranetIpRequest();
        batchIncreaseElasticNetworkCardIntranetIpRequest.setEniId("");
        batchIncreaseElasticNetworkCardIntranetIpRequest.setClientToken("");
        batchIncreaseElasticNetworkCardIntranetIpRequest.setIsIpv6(false);
        batchIncreaseElasticNetworkCardIntranetIpRequest.setPrivateIpAddresses(new ArrayList<>());
        batchIncreaseElasticNetworkCardIntranetIpRequest.setPrivateIpAddressCount(0);
        BatchIncreaseElasticNetworkCardIntranetIpResponse response = vpcClient.batchIncreaseElasticNetworkCardIntranetIp(batchIncreaseElasticNetworkCardIntranetIpRequest);
        System.out.println(response);
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
     * closePeerToPeerConnectionToSynchronizeDns
     *
     */
    @Test
    public void closePeerToPeerConnectionToSynchronizeDnsTest() {
        ClosePeerToPeerConnectionToSynchronizeDnsRequest closePeerToPeerConnectionToSynchronizeDnsRequest = new ClosePeerToPeerConnectionToSynchronizeDnsRequest();
        closePeerToPeerConnectionToSynchronizeDnsRequest.setPeerConnId("");
        closePeerToPeerConnectionToSynchronizeDnsRequest.setRole("");
        closePeerToPeerConnectionToSynchronizeDnsRequest.setClientToken("");
        vpcClient.closePeerToPeerConnectionToSynchronizeDns(closePeerToPeerConnectionToSynchronizeDnsRequest);
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
     * createAHighlyAvailableVirtualIp
     *
     */
    @Test
    public void createAHighlyAvailableVirtualIpTest() {
        CreateAHighlyAvailableVirtualIpRequest createAHighlyAvailableVirtualIpRequest = new CreateAHighlyAvailableVirtualIpRequest();
        createAHighlyAvailableVirtualIpRequest.setClientToken("");
        createAHighlyAvailableVirtualIpRequest.setName("");
        createAHighlyAvailableVirtualIpRequest.setSubnetId("");
        createAHighlyAvailableVirtualIpRequest.setPrivateIpAddress("");
        createAHighlyAvailableVirtualIpRequest.setDescription("");
        CreateAHighlyAvailableVirtualIpResponse response = vpcClient.createAHighlyAvailableVirtualIp(createAHighlyAvailableVirtualIpRequest);
        System.out.println(response);
    }
    /**
     * createAPeerToPeerConnection
     *
     */
    @Test
    public void createAPeerToPeerConnectionTest() {
        CreateAPeerToPeerConnectionRequest createAPeerToPeerConnectionRequest = new CreateAPeerToPeerConnectionRequest();
        createAPeerToPeerConnectionRequest.setClientToken("");
        createAPeerToPeerConnectionRequest.setBandwidthInMbps(0);
        createAPeerToPeerConnectionRequest.setDescription("");
        createAPeerToPeerConnectionRequest.setLocalIfName("");
        createAPeerToPeerConnectionRequest.setLocalVpcId("");
        createAPeerToPeerConnectionRequest.setPeerAccountId("");
        createAPeerToPeerConnectionRequest.setPeerVpcId("");
        createAPeerToPeerConnectionRequest.setPeerRegion("");
        createAPeerToPeerConnectionRequest.setPeerIfName("");
        createAPeerToPeerConnectionRequest.setBilling(null);
        createAPeerToPeerConnectionRequest.setTags(new ArrayList<>());
        createAPeerToPeerConnectionRequest.setResourceGroupId("");
        createAPeerToPeerConnectionRequest.setDeleteProtect(false);
        CreateAPeerToPeerConnectionResponse response = vpcClient.createAPeerToPeerConnection(createAPeerToPeerConnectionRequest);
        System.out.println(response);
    }
    /**
     * createARegularSecurityGroupV2
     *
     */
    @Test
    public void createARegularSecurityGroupV2Test() {
        CreateARegularSecurityGroupV2Request createARegularSecurityGroupV2Request = new CreateARegularSecurityGroupV2Request();
        createARegularSecurityGroupV2Request.setClientToken("");
        createARegularSecurityGroupV2Request.setName("");
        createARegularSecurityGroupV2Request.setVpcId("");
        createARegularSecurityGroupV2Request.setDesc("");
        createARegularSecurityGroupV2Request.setRules(new ArrayList<>());
        createARegularSecurityGroupV2Request.setTags(new ArrayList<>());
        CreateARegularSecurityGroupV2Response response = vpcClient.createARegularSecurityGroupV2(createARegularSecurityGroupV2Request);
        System.out.println(response);
    }
    /**
     * createAnIpv6Gateway
     *
     */
    @Test
    public void createAnIpv6GatewayTest() {
        CreateAnIpv6GatewayRequest createAnIpv6GatewayRequest = new CreateAnIpv6GatewayRequest();
        createAnIpv6GatewayRequest.setClientToken("");
        createAnIpv6GatewayRequest.setVpcId("");
        createAnIpv6GatewayRequest.setName("");
        createAnIpv6GatewayRequest.setBandwidthInMbps(0);
        createAnIpv6GatewayRequest.setBilling(null);
        createAnIpv6GatewayRequest.setTags(new ArrayList<>());
        createAnIpv6GatewayRequest.setResourceGroupId("");
        createAnIpv6GatewayRequest.setDeleteProtect(false);
        CreateAnIpv6GatewayResponse response = vpcClient.createAnIpv6Gateway(createAnIpv6GatewayRequest);
        System.out.println(response);
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
        createDedicatedGatewayHealthCheckRequest.setHealthCheckSourceIp("");
        createDedicatedGatewayHealthCheckRequest.setHealthCheckType("");
        createDedicatedGatewayHealthCheckRequest.setHealthCheckPort(0);
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
        createDnatRuleRequest.setClientToken("");
        createDnatRuleRequest.setNatId("");
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
     * createElasticNetworkCard
     *
     */
    @Test
    public void createElasticNetworkCardTest() {
        CreateElasticNetworkCardRequest createElasticNetworkCardRequest = new CreateElasticNetworkCardRequest();
        createElasticNetworkCardRequest.setClientToken("");
        createElasticNetworkCardRequest.setName("");
        createElasticNetworkCardRequest.setSubnetId("");
        createElasticNetworkCardRequest.setSecurityGroupIds(new ArrayList<>());
        createElasticNetworkCardRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        createElasticNetworkCardRequest.setPrivateIpSet(new ArrayList<>());
        createElasticNetworkCardRequest.setIpv6PrivateIpSet(new ArrayList<>());
        createElasticNetworkCardRequest.setDescription("");
        createElasticNetworkCardRequest.setNetworkInterfaceTrafficMode("");
        CreateElasticNetworkCardResponse response = vpcClient.createElasticNetworkCard(createElasticNetworkCardRequest);
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
     * createIpAddressFamily
     *
     */
    @Test
    public void createIpAddressFamilyTest() {
        CreateIpAddressFamilyRequest createIpAddressFamilyRequest = new CreateIpAddressFamilyRequest();
        createIpAddressFamilyRequest.setClientToken("");
        createIpAddressFamilyRequest.setName("");
        createIpAddressFamilyRequest.setIpVersion("");
        createIpAddressFamilyRequest.setIpSetIds(new ArrayList<>());
        createIpAddressFamilyRequest.setDescription("");
        CreateIpAddressFamilyResponse response = vpcClient.createIpAddressFamily(createIpAddressFamilyRequest);
        System.out.println(response);
    }
    /**
     * createIpAddressGroup
     *
     */
    @Test
    public void createIpAddressGroupTest() {
        CreateIpAddressGroupRequest createIpAddressGroupRequest = new CreateIpAddressGroupRequest();
        createIpAddressGroupRequest.setClientToken("");
        createIpAddressGroupRequest.setName("");
        createIpAddressGroupRequest.setIpVersion("");
        createIpAddressGroupRequest.setIpAddressInfo(new ArrayList<>());
        createIpAddressGroupRequest.setDescription("");
        CreateIpAddressGroupResponse response = vpcClient.createIpAddressGroup(createIpAddressGroupRequest);
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
     * createIpv6GatewaySpeedLimitPolicy
     *
     */
    @Test
    public void createIpv6GatewaySpeedLimitPolicyTest() {
        CreateIpv6GatewaySpeedLimitPolicyRequest createIpv6GatewaySpeedLimitPolicyRequest = new CreateIpv6GatewaySpeedLimitPolicyRequest();
        createIpv6GatewaySpeedLimitPolicyRequest.setGatewayId("");
        createIpv6GatewaySpeedLimitPolicyRequest.setClientToken("");
        createIpv6GatewaySpeedLimitPolicyRequest.setIpv6Address("");
        createIpv6GatewaySpeedLimitPolicyRequest.setIngressBandwidthInMbps(0);
        createIpv6GatewaySpeedLimitPolicyRequest.setEgressBandwidthInMbps(0);
        CreateIpv6GatewaySpeedLimitPolicyResponse response = vpcClient.createIpv6GatewaySpeedLimitPolicy(createIpv6GatewaySpeedLimitPolicyRequest);
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
        createNatRequest.setTags(new ArrayList<>());
        createNatRequest.setResourceGroupId("");
        createNatRequest.setDeleteProtect(false);
        CreateNatResponse response = vpcClient.createNat(createNatRequest);
        System.out.println(response);
    }
    /**
     * createNetworkDetection
     *
     */
    @Test
    public void createNetworkDetectionTest() {
        CreateNetworkDetectionRequest createNetworkDetectionRequest = new CreateNetworkDetectionRequest();
        createNetworkDetectionRequest.setClientToken("");
        createNetworkDetectionRequest.setName("");
        createNetworkDetectionRequest.setDescription("");
        createNetworkDetectionRequest.setVpcId("");
        createNetworkDetectionRequest.setSubnetId("");
        createNetworkDetectionRequest.setProtocol("");
        createNetworkDetectionRequest.setFrequency(0);
        createNetworkDetectionRequest.setSourceIps(new ArrayList<>());
        createNetworkDetectionRequest.setSourceIpNum(0);
        createNetworkDetectionRequest.setDestIp("");
        createNetworkDetectionRequest.setDestPort(0);
        createNetworkDetectionRequest.setPayload("");
        CreateNetworkDetectionResponse response = vpcClient.createNetworkDetection(createNetworkDetectionRequest);
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
     * createSnatRule
     *
     */
    @Test
    public void createSnatRuleTest() {
        CreateSnatRuleRequest createSnatRuleRequest = new CreateSnatRuleRequest();
        createSnatRuleRequest.setClientToken("");
        createSnatRuleRequest.setNatId("");
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
        deleteDnatRuleRequest.setClientToken("");
        deleteDnatRuleRequest.setNatId("");
        deleteDnatRuleRequest.setRuleId("");
        vpcClient.deleteDnatRule(deleteDnatRuleRequest);
    }
    /**
     * deleteElasticNetworkCardAuxiliaryIp
     *
     */
    @Test
    public void deleteElasticNetworkCardAuxiliaryIpTest() {
        DeleteElasticNetworkCardAuxiliaryIpRequest deleteElasticNetworkCardAuxiliaryIpRequest = new DeleteElasticNetworkCardAuxiliaryIpRequest();
        deleteElasticNetworkCardAuxiliaryIpRequest.setEniId("");
        deleteElasticNetworkCardAuxiliaryIpRequest.setPrivateIpAddress("");
        deleteElasticNetworkCardAuxiliaryIpRequest.setClientToken("");
        vpcClient.deleteElasticNetworkCardAuxiliaryIp(deleteElasticNetworkCardAuxiliaryIpRequest);
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
     * deleteHighlyAvailableVirtualIp
     *
     */
    @Test
    public void deleteHighlyAvailableVirtualIpTest() {
        DeleteHighlyAvailableVirtualIpRequest deleteHighlyAvailableVirtualIpRequest = new DeleteHighlyAvailableVirtualIpRequest();
        deleteHighlyAvailableVirtualIpRequest.setHaVipId("");
        deleteHighlyAvailableVirtualIpRequest.setClientToken("");
        vpcClient.deleteHighlyAvailableVirtualIp(deleteHighlyAvailableVirtualIpRequest);
    }
    /**
     * deleteIpAddressFamily
     *
     */
    @Test
    public void deleteIpAddressFamilyTest() {
        DeleteIpAddressFamilyRequest deleteIpAddressFamilyRequest = new DeleteIpAddressFamilyRequest();
        deleteIpAddressFamilyRequest.setIpGroupId("");
        deleteIpAddressFamilyRequest.setClientToken("");
        vpcClient.deleteIpAddressFamily(deleteIpAddressFamilyRequest);
    }
    /**
     * deleteIpAddressFromIpAddressGroup
     *
     */
    @Test
    public void deleteIpAddressFromIpAddressGroupTest() {
        DeleteIpAddressFromIpAddressGroupRequest deleteIpAddressFromIpAddressGroupRequest = new DeleteIpAddressFromIpAddressGroupRequest();
        deleteIpAddressFromIpAddressGroupRequest.setIpSetId("");
        deleteIpAddressFromIpAddressGroupRequest.setClientToken("");
        deleteIpAddressFromIpAddressGroupRequest.setIpAddressInfo(new ArrayList<>());
        vpcClient.deleteIpAddressFromIpAddressGroup(deleteIpAddressFromIpAddressGroupRequest);
    }
    /**
     * deleteIpAddressGroup
     *
     */
    @Test
    public void deleteIpAddressGroupTest() {
        DeleteIpAddressGroupRequest deleteIpAddressGroupRequest = new DeleteIpAddressGroupRequest();
        deleteIpAddressGroupRequest.setIpSetId("");
        deleteIpAddressGroupRequest.setClientToken("");
        vpcClient.deleteIpAddressGroup(deleteIpAddressGroupRequest);
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
     * deleteIpv6GatewaySpeedLimitPolicy
     *
     */
    @Test
    public void deleteIpv6GatewaySpeedLimitPolicyTest() {
        DeleteIpv6GatewaySpeedLimitPolicyRequest deleteIpv6GatewaySpeedLimitPolicyRequest = new DeleteIpv6GatewaySpeedLimitPolicyRequest();
        deleteIpv6GatewaySpeedLimitPolicyRequest.setGatewayId("");
        deleteIpv6GatewaySpeedLimitPolicyRequest.setRateLimitRuleId("");
        deleteIpv6GatewaySpeedLimitPolicyRequest.setClientToken("");
        vpcClient.deleteIpv6GatewaySpeedLimitPolicy(deleteIpv6GatewaySpeedLimitPolicyRequest);
    }
    /**
     * deleteIpv6OnlyAccessPolicy
     *
     */
    @Test
    public void deleteIpv6OnlyAccessPolicyTest() {
        DeleteIpv6OnlyAccessPolicyRequest deleteIpv6OnlyAccessPolicyRequest = new DeleteIpv6OnlyAccessPolicyRequest();
        deleteIpv6OnlyAccessPolicyRequest.setGatewayId("");
        deleteIpv6OnlyAccessPolicyRequest.setEgressOnlyRuleId("");
        deleteIpv6OnlyAccessPolicyRequest.setClientToken("");
        vpcClient.deleteIpv6OnlyAccessPolicy(deleteIpv6OnlyAccessPolicyRequest);
    }
    /**
     * deleteNetworkDetection
     *
     */
    @Test
    public void deleteNetworkDetectionTest() {
        DeleteNetworkDetectionRequest deleteNetworkDetectionRequest = new DeleteNetworkDetectionRequest();
        deleteNetworkDetectionRequest.setProbeId("");
        deleteNetworkDetectionRequest.setClientToken("");
        vpcClient.deleteNetworkDetection(deleteNetworkDetectionRequest);
    }
    /**
     * deleteRegularSecurityGroupRulesV2
     *
     */
    @Test
    public void deleteRegularSecurityGroupRulesV2Test() {
        DeleteRegularSecurityGroupRulesV2Request deleteRegularSecurityGroupRulesV2Request = new DeleteRegularSecurityGroupRulesV2Request();
        deleteRegularSecurityGroupRulesV2Request.setSecurityGroupRuleId("");
        deleteRegularSecurityGroupRulesV2Request.setClientToken("");
        deleteRegularSecurityGroupRulesV2Request.setSgVersion(0L);
        vpcClient.deleteRegularSecurityGroupRulesV2(deleteRegularSecurityGroupRulesV2Request);
    }
    /**
     * deleteRegularSecurityGroupV2
     *
     */
    @Test
    public void deleteRegularSecurityGroupV2Test() {
        DeleteRegularSecurityGroupV2Request deleteRegularSecurityGroupV2Request = new DeleteRegularSecurityGroupV2Request();
        deleteRegularSecurityGroupV2Request.setSecurityGroupId("");
        deleteRegularSecurityGroupV2Request.setClientToken("");
        vpcClient.deleteRegularSecurityGroupV2(deleteRegularSecurityGroupV2Request);
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
     * deleteSnatRule
     *
     */
    @Test
    public void deleteSnatRuleTest() {
        DeleteSnatRuleRequest deleteSnatRuleRequest = new DeleteSnatRuleRequest();
        deleteSnatRuleRequest.setClientToken("");
        deleteSnatRuleRequest.setNatId("");
        deleteSnatRuleRequest.setRuleId("");
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
     * elasticNetworkCardBindingEip
     *
     */
    @Test
    public void elasticNetworkCardBindingEipTest() {
        ElasticNetworkCardBindingEipRequest elasticNetworkCardBindingEipRequest = new ElasticNetworkCardBindingEipRequest();
        elasticNetworkCardBindingEipRequest.setEniId("");
        elasticNetworkCardBindingEipRequest.setClientToken("");
        elasticNetworkCardBindingEipRequest.setPrivateIpAddress("");
        elasticNetworkCardBindingEipRequest.setPublicIpAddress("");
        vpcClient.elasticNetworkCardBindingEip(elasticNetworkCardBindingEipRequest);
    }
    /**
     * elasticNetworkCardMountedCloudProductInstance
     *
     */
    @Test
    public void elasticNetworkCardMountedCloudProductInstanceTest() {
        ElasticNetworkCardMountedCloudProductInstanceRequest elasticNetworkCardMountedCloudProductInstanceRequest = new ElasticNetworkCardMountedCloudProductInstanceRequest();
        elasticNetworkCardMountedCloudProductInstanceRequest.setEniId("");
        elasticNetworkCardMountedCloudProductInstanceRequest.setClientToken("");
        elasticNetworkCardMountedCloudProductInstanceRequest.setInstanceId("");
        elasticNetworkCardMountedCloudProductInstanceRequest.setInstanceType("");
        vpcClient.elasticNetworkCardMountedCloudProductInstance(elasticNetworkCardMountedCloudProductInstanceRequest);
    }
    /**
     * elasticNetworkCardUnbindingEip
     *
     */
    @Test
    public void elasticNetworkCardUnbindingEipTest() {
        ElasticNetworkCardUnbindingEipRequest elasticNetworkCardUnbindingEipRequest = new ElasticNetworkCardUnbindingEipRequest();
        elasticNetworkCardUnbindingEipRequest.setEniId("");
        elasticNetworkCardUnbindingEipRequest.setClientToken("");
        elasticNetworkCardUnbindingEipRequest.setPublicIpAddress("");
        vpcClient.elasticNetworkCardUnbindingEip(elasticNetworkCardUnbindingEipRequest);
    }
    /**
     * elasticNetworkCardUninstallationCloudProductInstance
     *
     */
    @Test
    public void elasticNetworkCardUninstallationCloudProductInstanceTest() {
        ElasticNetworkCardUninstallationCloudProductInstanceRequest elasticNetworkCardUninstallationCloudProductInstanceRequest =
                new ElasticNetworkCardUninstallationCloudProductInstanceRequest();
        elasticNetworkCardUninstallationCloudProductInstanceRequest.setEniId("");
        elasticNetworkCardUninstallationCloudProductInstanceRequest.setClientToken("");
        elasticNetworkCardUninstallationCloudProductInstanceRequest.setInstanceId("");
        vpcClient.elasticNetworkCardUninstallationCloudProductInstance(elasticNetworkCardUninstallationCloudProductInstanceRequest);
    }
    /**
     * elasticNetworkCardUpdateEnterpriseSecurityGroup
     *
     */
    @Test
    public void elasticNetworkCardUpdateEnterpriseSecurityGroupTest() {
        ElasticNetworkCardUpdateEnterpriseSecurityGroupRequest elasticNetworkCardUpdateEnterpriseSecurityGroupRequest =
                new ElasticNetworkCardUpdateEnterpriseSecurityGroupRequest();
        elasticNetworkCardUpdateEnterpriseSecurityGroupRequest.setEniId("");
        elasticNetworkCardUpdateEnterpriseSecurityGroupRequest.setClientToken("");
        elasticNetworkCardUpdateEnterpriseSecurityGroupRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        vpcClient.elasticNetworkCardUpdateEnterpriseSecurityGroup(elasticNetworkCardUpdateEnterpriseSecurityGroupRequest);
    }
    /**
     * elasticNetworkCardUpdatesRegularSecurityGroup
     *
     */
    @Test
    public void elasticNetworkCardUpdatesRegularSecurityGroupTest() {
        ElasticNetworkCardUpdatesRegularSecurityGroupRequest elasticNetworkCardUpdatesRegularSecurityGroupRequest = new ElasticNetworkCardUpdatesRegularSecurityGroupRequest();
        elasticNetworkCardUpdatesRegularSecurityGroupRequest.setEniId("");
        elasticNetworkCardUpdatesRegularSecurityGroupRequest.setClientToken("");
        elasticNetworkCardUpdatesRegularSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        vpcClient.elasticNetworkCardUpdatesRegularSecurityGroup(elasticNetworkCardUpdatesRegularSecurityGroupRequest);
    }
    /**
     * enablePeerToPeerConnectionToSynchronizeDns
     *
     */
    @Test
    public void enablePeerToPeerConnectionToSynchronizeDnsTest() {
        EnablePeerToPeerConnectionToSynchronizeDnsRequest enablePeerToPeerConnectionToSynchronizeDnsRequest = new EnablePeerToPeerConnectionToSynchronizeDnsRequest();
        enablePeerToPeerConnectionToSynchronizeDnsRequest.setPeerConnId("");
        enablePeerToPeerConnectionToSynchronizeDnsRequest.setRole("");
        enablePeerToPeerConnectionToSynchronizeDnsRequest.setClientToken("");
        vpcClient.enablePeerToPeerConnectionToSynchronizeDns(enablePeerToPeerConnectionToSynchronizeDnsRequest);
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
     * highAvailabilityVirtualIpUnbindingEip
     *
     */
    @Test
    public void highAvailabilityVirtualIpUnbindingEipTest() {
        HighAvailabilityVirtualIpUnbindingEipRequest highAvailabilityVirtualIpUnbindingEipRequest = new HighAvailabilityVirtualIpUnbindingEipRequest();
        highAvailabilityVirtualIpUnbindingEipRequest.setHaVipId("");
        highAvailabilityVirtualIpUnbindingEipRequest.setClientToken("");
        vpcClient.highAvailabilityVirtualIpUnbindingEip(highAvailabilityVirtualIpUnbindingEipRequest);
    }
    /**
     * highAvailabilityVirtualIpUnbindingInstance
     *
     */
    @Test
    public void highAvailabilityVirtualIpUnbindingInstanceTest() {
        HighAvailabilityVirtualIpUnbindingInstanceRequest highAvailabilityVirtualIpUnbindingInstanceRequest = new HighAvailabilityVirtualIpUnbindingInstanceRequest();
        highAvailabilityVirtualIpUnbindingInstanceRequest.setHaVipId("");
        highAvailabilityVirtualIpUnbindingInstanceRequest.setClientToken("");
        highAvailabilityVirtualIpUnbindingInstanceRequest.setInstanceIds(new ArrayList<>());
        highAvailabilityVirtualIpUnbindingInstanceRequest.setInstanceType("");
        vpcClient.highAvailabilityVirtualIpUnbindingInstance(highAvailabilityVirtualIpUnbindingInstanceRequest);
    }
    /**
     * highlyAvailableVirtualIpBindingEip
     *
     */
    @Test
    public void highlyAvailableVirtualIpBindingEipTest() {
        HighlyAvailableVirtualIpBindingEipRequest highlyAvailableVirtualIpBindingEipRequest = new HighlyAvailableVirtualIpBindingEipRequest();
        highlyAvailableVirtualIpBindingEipRequest.setHaVipId("");
        highlyAvailableVirtualIpBindingEipRequest.setClientToken("");
        highlyAvailableVirtualIpBindingEipRequest.setPublicIpAddress("");
        vpcClient.highlyAvailableVirtualIpBindingEip(highlyAvailableVirtualIpBindingEipRequest);
    }
    /**
     * highlyAvailableVirtualIpBindingInstance
     *
     */
    @Test
    public void highlyAvailableVirtualIpBindingInstanceTest() {
        HighlyAvailableVirtualIpBindingInstanceRequest highlyAvailableVirtualIpBindingInstanceRequest = new HighlyAvailableVirtualIpBindingInstanceRequest();
        highlyAvailableVirtualIpBindingInstanceRequest.setHaVipId("");
        highlyAvailableVirtualIpBindingInstanceRequest.setClientToken("");
        highlyAvailableVirtualIpBindingInstanceRequest.setInstanceIds(new ArrayList<>());
        highlyAvailableVirtualIpBindingInstanceRequest.setInstanceType("");
        vpcClient.highlyAvailableVirtualIpBindingInstance(highlyAvailableVirtualIpBindingInstanceRequest);
    }
    /**
     * ipv6GatewayBandwidthUpgradeAndDowngrade
     *
     */
    @Test
    public void ipv6GatewayBandwidthUpgradeAndDowngradeTest() {
        Ipv6GatewayBandwidthUpgradeAndDowngradeRequest ipv6GatewayBandwidthUpgradeAndDowngradeRequest = new Ipv6GatewayBandwidthUpgradeAndDowngradeRequest();
        ipv6GatewayBandwidthUpgradeAndDowngradeRequest.setGatewayId("");
        ipv6GatewayBandwidthUpgradeAndDowngradeRequest.setClientToken("");
        ipv6GatewayBandwidthUpgradeAndDowngradeRequest.setBandwidthInMbps(0);
        vpcClient.ipv6GatewayBandwidthUpgradeAndDowngrade(ipv6GatewayBandwidthUpgradeAndDowngradeRequest);
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
     * peerToPeerConnectionBandwidthUpgradeAndDowngrade
     *
     */
    @Test
    public void peerToPeerConnectionBandwidthUpgradeAndDowngradeTest() {
        PeerToPeerConnectionBandwidthUpgradeAndDowngradeRequest peerToPeerConnectionBandwidthUpgradeAndDowngradeRequest =
                new PeerToPeerConnectionBandwidthUpgradeAndDowngradeRequest();
        peerToPeerConnectionBandwidthUpgradeAndDowngradeRequest.setPeerConnId("");
        peerToPeerConnectionBandwidthUpgradeAndDowngradeRequest.setClientToken("");
        peerToPeerConnectionBandwidthUpgradeAndDowngradeRequest.setNewBandwidthInMbps(0);
        vpcClient.peerToPeerConnectionBandwidthUpgradeAndDowngrade(peerToPeerConnectionBandwidthUpgradeAndDowngradeRequest);
    }
    /**
     * peerToPeerConnectionRenewal
     *
     */
    @Test
    public void peerToPeerConnectionRenewalTest() {
        PeerToPeerConnectionRenewalRequest peerToPeerConnectionRenewalRequest = new PeerToPeerConnectionRenewalRequest();
        peerToPeerConnectionRenewalRequest.setPeerConnId("");
        peerToPeerConnectionRenewalRequest.setClientToken("");
        peerToPeerConnectionRenewalRequest.setBilling(null);
        vpcClient.peerToPeerConnectionRenewal(peerToPeerConnectionRenewalRequest);
    }
    /**
     * prepaidPeerToPeerConnectionUnsubscribe
     *
     */
    @Test
    public void prepaidPeerToPeerConnectionUnsubscribeTest() {
        PrepaidPeerToPeerConnectionUnsubscribeRequest prepaidPeerToPeerConnectionUnsubscribeRequest = new PrepaidPeerToPeerConnectionUnsubscribeRequest();
        prepaidPeerToPeerConnectionUnsubscribeRequest.setPeerConnId("");
        prepaidPeerToPeerConnectionUnsubscribeRequest.setClientToken("");
        vpcClient.prepaidPeerToPeerConnectionUnsubscribe(prepaidPeerToPeerConnectionUnsubscribeRequest);
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
     * queryIpAddressFamilyList
     *
     */
    @Test
    public void queryIpAddressFamilyListTest() {
        QueryIpAddressFamilyListRequest queryIpAddressFamilyListRequest = new QueryIpAddressFamilyListRequest();
        queryIpAddressFamilyListRequest.setIpVersion("");
        queryIpAddressFamilyListRequest.setMarker("");
        queryIpAddressFamilyListRequest.setMaxKeys(0);
        QueryIpAddressFamilyListResponse response = vpcClient.queryIpAddressFamilyList(queryIpAddressFamilyListRequest);
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
     * queryNetworkDetectionDetails
     *
     */
    @Test
    public void queryNetworkDetectionDetailsTest() {
        QueryNetworkDetectionDetailsRequest queryNetworkDetectionDetailsRequest = new QueryNetworkDetectionDetailsRequest();
        queryNetworkDetectionDetailsRequest.setProbeId("");
        QueryNetworkDetectionDetailsResponse response = vpcClient.queryNetworkDetectionDetails(queryNetworkDetectionDetailsRequest);
        System.out.println(response);
    }
    /**
     * queryNetworkDetectionList
     *
     */
    @Test
    public void queryNetworkDetectionListTest() {
        QueryNetworkDetectionListRequest queryNetworkDetectionListRequest = new QueryNetworkDetectionListRequest();
        queryNetworkDetectionListRequest.setMarker("");
        queryNetworkDetectionListRequest.setMaxKeys(0);
        QueryNetworkDetectionListResponse response = vpcClient.queryNetworkDetectionList(queryNetworkDetectionListRequest);
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
     * queryTheListOfElasticNetworkCards
     *
     */
    @Test
    public void queryTheListOfElasticNetworkCardsTest() {
        QueryTheListOfElasticNetworkCardsRequest queryTheListOfElasticNetworkCardsRequest = new QueryTheListOfElasticNetworkCardsRequest();
        queryTheListOfElasticNetworkCardsRequest.setVpcId("");
        queryTheListOfElasticNetworkCardsRequest.setInstanceId("");
        queryTheListOfElasticNetworkCardsRequest.setName("");
        queryTheListOfElasticNetworkCardsRequest.setPrivateIpAddress(new ArrayList<>());
        queryTheListOfElasticNetworkCardsRequest.setMarker("");
        queryTheListOfElasticNetworkCardsRequest.setMaxKeys(0);
        QueryTheListOfElasticNetworkCardsResponse response = vpcClient.queryTheListOfElasticNetworkCards(queryTheListOfElasticNetworkCardsRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfEnterpriseSecurityGroups
     *
     */
    @Test
    public void queryTheListOfEnterpriseSecurityGroupsTest() {
        QueryTheListOfEnterpriseSecurityGroupsRequest queryTheListOfEnterpriseSecurityGroupsRequest = new QueryTheListOfEnterpriseSecurityGroupsRequest();
        queryTheListOfEnterpriseSecurityGroupsRequest.setMarker("");
        queryTheListOfEnterpriseSecurityGroupsRequest.setMaxKeys(0);
        queryTheListOfEnterpriseSecurityGroupsRequest.setInstanceId("");
        QueryTheListOfEnterpriseSecurityGroupsResponse response = vpcClient.queryTheListOfEnterpriseSecurityGroups(queryTheListOfEnterpriseSecurityGroupsRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfHighlyAvailableVirtualIps
     *
     */
    @Test
    public void queryTheListOfHighlyAvailableVirtualIpsTest() {
        QueryTheListOfHighlyAvailableVirtualIpsRequest queryTheListOfHighlyAvailableVirtualIpsRequest = new QueryTheListOfHighlyAvailableVirtualIpsRequest();
        queryTheListOfHighlyAvailableVirtualIpsRequest.setVpcId("");
        queryTheListOfHighlyAvailableVirtualIpsRequest.setMarker("");
        queryTheListOfHighlyAvailableVirtualIpsRequest.setMaxKeys(0);
        QueryTheListOfHighlyAvailableVirtualIpsResponse response = vpcClient.queryTheListOfHighlyAvailableVirtualIps(queryTheListOfHighlyAvailableVirtualIpsRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfIpAddressGroups
     *
     */
    @Test
    public void queryTheListOfIpAddressGroupsTest() {
        QueryTheListOfIpAddressGroupsRequest queryTheListOfIpAddressGroupsRequest = new QueryTheListOfIpAddressGroupsRequest();
        queryTheListOfIpAddressGroupsRequest.setIpVersion("");
        queryTheListOfIpAddressGroupsRequest.setMarker("");
        queryTheListOfIpAddressGroupsRequest.setMaxKeys(0);
        QueryTheListOfIpAddressGroupsResponse response = vpcClient.queryTheListOfIpAddressGroups(queryTheListOfIpAddressGroupsRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfPeerConnections
     *
     */
    @Test
    public void queryTheListOfPeerConnectionsTest() {
        QueryTheListOfPeerConnectionsRequest queryTheListOfPeerConnectionsRequest = new QueryTheListOfPeerConnectionsRequest();
        queryTheListOfPeerConnectionsRequest.setVpcId("");
        queryTheListOfPeerConnectionsRequest.setMarker("");
        queryTheListOfPeerConnectionsRequest.setMaxKeys(0);
        QueryTheListOfPeerConnectionsResponse response = vpcClient.queryTheListOfPeerConnections(queryTheListOfPeerConnectionsRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfRegularSecurityGroupsV2
     *
     */
    @Test
    public void queryTheListOfRegularSecurityGroupsV2Test() {
        QueryTheListOfRegularSecurityGroupsV2Request queryTheListOfRegularSecurityGroupsV2Request = new QueryTheListOfRegularSecurityGroupsV2Request();
        queryTheListOfRegularSecurityGroupsV2Request.setMarker("");
        queryTheListOfRegularSecurityGroupsV2Request.setMaxKeys(0);
        queryTheListOfRegularSecurityGroupsV2Request.setInstanceId("");
        queryTheListOfRegularSecurityGroupsV2Request.setVpcId("");
        queryTheListOfRegularSecurityGroupsV2Request.setSecurityGroupId("");
        queryTheListOfRegularSecurityGroupsV2Request.setSecurityGroupIds("");
        QueryTheListOfRegularSecurityGroupsV2Response response = vpcClient.queryTheListOfRegularSecurityGroupsV2(queryTheListOfRegularSecurityGroupsV2Request);
        System.out.println(response);
    }
    /**
     * queryTheListOfSpeedLimitPoliciesForIpv6Gateway
     *
     */
    @Test
    public void queryTheListOfSpeedLimitPoliciesForIpv6GatewayTest() {
        QueryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest queryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest = new QueryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest();
        queryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest.setGatewayId("");
        queryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest.setMarker("");
        queryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest.setMaxKeys(0);
        QueryTheListOfSpeedLimitPoliciesForIpv6GatewayResponse response =
                vpcClient.queryTheListOfSpeedLimitPoliciesForIpv6Gateway(queryTheListOfSpeedLimitPoliciesForIpv6GatewayRequest);
        System.out.println(response);
    }
    /**
     * queryTheSpecifiedElasticNetworkCard
     *
     */
    @Test
    public void queryTheSpecifiedElasticNetworkCardTest() {
        QueryTheSpecifiedElasticNetworkCardRequest queryTheSpecifiedElasticNetworkCardRequest = new QueryTheSpecifiedElasticNetworkCardRequest();
        queryTheSpecifiedElasticNetworkCardRequest.setEniId("");
        QueryTheSpecifiedElasticNetworkCardResponse response = vpcClient.queryTheSpecifiedElasticNetworkCard(queryTheSpecifiedElasticNetworkCardRequest);
        System.out.println(response);
    }
    /**
     * queryTheSpecifiedHighlyAvailableVirtualIp
     *
     */
    @Test
    public void queryTheSpecifiedHighlyAvailableVirtualIpTest() {
        QueryTheSpecifiedHighlyAvailableVirtualIpRequest queryTheSpecifiedHighlyAvailableVirtualIpRequest = new QueryTheSpecifiedHighlyAvailableVirtualIpRequest();
        queryTheSpecifiedHighlyAvailableVirtualIpRequest.setHaVipId("");
        QueryTheSpecifiedHighlyAvailableVirtualIpResponse response = vpcClient.queryTheSpecifiedHighlyAvailableVirtualIp(queryTheSpecifiedHighlyAvailableVirtualIpRequest);
        System.out.println(response);
    }
    /**
     * queryTheSpecifiedIpAddressFamily
     *
     */
    @Test
    public void queryTheSpecifiedIpAddressFamilyTest() {
        QueryTheSpecifiedIpAddressFamilyRequest queryTheSpecifiedIpAddressFamilyRequest = new QueryTheSpecifiedIpAddressFamilyRequest();
        queryTheSpecifiedIpAddressFamilyRequest.setIpGroupId("");
        QueryTheSpecifiedIpAddressFamilyResponse response = vpcClient.queryTheSpecifiedIpAddressFamily(queryTheSpecifiedIpAddressFamilyRequest);
        System.out.println(response);
    }
    /**
     * queryTheSpecifiedIpAddressGroup
     *
     */
    @Test
    public void queryTheSpecifiedIpAddressGroupTest() {
        QueryTheSpecifiedIpAddressGroupRequest queryTheSpecifiedIpAddressGroupRequest = new QueryTheSpecifiedIpAddressGroupRequest();
        queryTheSpecifiedIpAddressGroupRequest.setIpSetId("");
        QueryTheSpecifiedIpAddressGroupResponse response = vpcClient.queryTheSpecifiedIpAddressGroup(queryTheSpecifiedIpAddressGroupRequest);
        System.out.println(response);
    }
    /**
     * queryTheStatusOfTheElasticNetworkCard
     *
     */
    @Test
    public void queryTheStatusOfTheElasticNetworkCardTest() {
        QueryTheStatusOfTheElasticNetworkCardRequest queryTheStatusOfTheElasticNetworkCardRequest = new QueryTheStatusOfTheElasticNetworkCardRequest();
        queryTheStatusOfTheElasticNetworkCardRequest.setEniId("");
        QueryTheStatusOfTheElasticNetworkCardResponse response = vpcClient.queryTheStatusOfTheElasticNetworkCard(queryTheStatusOfTheElasticNetworkCardRequest);
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
     * queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusion
     *
     */
    @Test
    public void queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionTest() {
        QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest =
                new QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest();
        queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest.setGatewayId("");
        queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest.setMarker("");
        queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest.setMaxKeys(0);
        QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionResponse response =
                vpcClient.queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusion(queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest);
        System.out.println(response);
    }
    /**
     * rejectPeerToPeerConnectionRequest
     *
     */
    @Test
    public void rejectPeerToPeerConnectionRequestTest() {
        RejectPeerToPeerConnectionRequestRequest rejectPeerToPeerConnectionRequestRequest = new RejectPeerToPeerConnectionRequestRequest();
        rejectPeerToPeerConnectionRequestRequest.setPeerConnId("");
        rejectPeerToPeerConnectionRequestRequest.setClientToken("");
        vpcClient.rejectPeerToPeerConnectionRequest(rejectPeerToPeerConnectionRequestRequest);
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
     * releasePeerToPeerConnection
     *
     */
    @Test
    public void releasePeerToPeerConnectionTest() {
        ReleasePeerToPeerConnectionRequest releasePeerToPeerConnectionRequest = new ReleasePeerToPeerConnectionRequest();
        releasePeerToPeerConnectionRequest.setPeerConnId("");
        releasePeerToPeerConnectionRequest.setClientToken("");
        vpcClient.releasePeerToPeerConnection(releasePeerToPeerConnectionRequest);
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
     * removeElasticNetworkCard
     *
     */
    @Test
    public void removeElasticNetworkCardTest() {
        RemoveElasticNetworkCardRequest removeElasticNetworkCardRequest = new RemoveElasticNetworkCardRequest();
        removeElasticNetworkCardRequest.setEniId("");
        removeElasticNetworkCardRequest.setClientToken("");
        vpcClient.removeElasticNetworkCard(removeElasticNetworkCardRequest);
    }
    /**
     * removeIpAddressGroupFromIpAddressFamily
     *
     */
    @Test
    public void removeIpAddressGroupFromIpAddressFamilyTest() {
        RemoveIpAddressGroupFromIpAddressFamilyRequest removeIpAddressGroupFromIpAddressFamilyRequest = new RemoveIpAddressGroupFromIpAddressFamilyRequest();
        removeIpAddressGroupFromIpAddressFamilyRequest.setIpGroupId("");
        removeIpAddressGroupFromIpAddressFamilyRequest.setClientToken("");
        removeIpAddressGroupFromIpAddressFamilyRequest.setIpSetIds(new ArrayList<>());
        vpcClient.removeIpAddressGroupFromIpAddressFamily(removeIpAddressGroupFromIpAddressFamilyRequest);
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
     * resizeNat
     *
     */
    @Test
    public void resizeNatTest() {
        ResizeNatRequest resizeNatRequest = new ResizeNatRequest();
        resizeNatRequest.setClientToken("");
        resizeNatRequest.setNatId("");
        resizeNatRequest.setCuNum(0);
        vpcClient.resizeNat(resizeNatRequest);
    }
    /**
     * revokeRegularSecurityGroupRulesV2
     *
     */
    @Test
    public void revokeRegularSecurityGroupRulesV2Test() {
        RevokeRegularSecurityGroupRulesV2Request revokeRegularSecurityGroupRulesV2Request = new RevokeRegularSecurityGroupRulesV2Request();
        revokeRegularSecurityGroupRulesV2Request.setSecurityGroupId("");
        revokeRegularSecurityGroupRulesV2Request.setClientToken("");
        revokeRegularSecurityGroupRulesV2Request.setSgVersion(0L);
        revokeRegularSecurityGroupRulesV2Request.setRule(null);
        vpcClient.revokeRegularSecurityGroupRulesV2(revokeRegularSecurityGroupRulesV2Request);
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
     * updateElasticNetworkCard
     *
     */
    @Test
    public void updateElasticNetworkCardTest() {
        UpdateElasticNetworkCardRequest updateElasticNetworkCardRequest = new UpdateElasticNetworkCardRequest();
        updateElasticNetworkCardRequest.setEniId("");
        updateElasticNetworkCardRequest.setClientToken("");
        updateElasticNetworkCardRequest.setName("");
        updateElasticNetworkCardRequest.setDescription("");
        vpcClient.updateElasticNetworkCard(updateElasticNetworkCardRequest);
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
     * updateHighlyAvailableVirtualIp
     *
     */
    @Test
    public void updateHighlyAvailableVirtualIpTest() {
        UpdateHighlyAvailableVirtualIpRequest updateHighlyAvailableVirtualIpRequest = new UpdateHighlyAvailableVirtualIpRequest();
        updateHighlyAvailableVirtualIpRequest.setHaVipId("");
        updateHighlyAvailableVirtualIpRequest.setClientToken("");
        updateHighlyAvailableVirtualIpRequest.setName("");
        updateHighlyAvailableVirtualIpRequest.setDescription("");
        vpcClient.updateHighlyAvailableVirtualIp(updateHighlyAvailableVirtualIpRequest);
    }
    /**
     * updateIpAddressFamily
     *
     */
    @Test
    public void updateIpAddressFamilyTest() {
        UpdateIpAddressFamilyRequest updateIpAddressFamilyRequest = new UpdateIpAddressFamilyRequest();
        updateIpAddressFamilyRequest.setIpGroupId("");
        updateIpAddressFamilyRequest.setClientToken("");
        updateIpAddressFamilyRequest.setName("");
        updateIpAddressFamilyRequest.setDescription("");
        vpcClient.updateIpAddressFamily(updateIpAddressFamilyRequest);
    }
    /**
     * updateIpAddressGroup
     *
     */
    @Test
    public void updateIpAddressGroupTest() {
        UpdateIpAddressGroupRequest updateIpAddressGroupRequest = new UpdateIpAddressGroupRequest();
        updateIpAddressGroupRequest.setIpSetId("");
        updateIpAddressGroupRequest.setClientToken("");
        updateIpAddressGroupRequest.setName("");
        updateIpAddressGroupRequest.setDescription("");
        vpcClient.updateIpAddressGroup(updateIpAddressGroupRequest);
    }
    /**
     * updateIpv6GatewayReleaseProtectionSwitch
     *
     */
    @Test
    public void updateIpv6GatewayReleaseProtectionSwitchTest() {
        UpdateIpv6GatewayReleaseProtectionSwitchRequest updateIpv6GatewayReleaseProtectionSwitchRequest = new UpdateIpv6GatewayReleaseProtectionSwitchRequest();
        updateIpv6GatewayReleaseProtectionSwitchRequest.setGatewayId("");
        updateIpv6GatewayReleaseProtectionSwitchRequest.setClientToken("");
        updateIpv6GatewayReleaseProtectionSwitchRequest.setDeleteProtect(0);
        vpcClient.updateIpv6GatewayReleaseProtectionSwitch(updateIpv6GatewayReleaseProtectionSwitchRequest);
    }
    /**
     * updateIpv6GatewaySpeedLimitPolicy
     *
     */
    @Test
    public void updateIpv6GatewaySpeedLimitPolicyTest() {
        UpdateIpv6GatewaySpeedLimitPolicyRequest updateIpv6GatewaySpeedLimitPolicyRequest = new UpdateIpv6GatewaySpeedLimitPolicyRequest();
        updateIpv6GatewaySpeedLimitPolicyRequest.setGatewayId("");
        updateIpv6GatewaySpeedLimitPolicyRequest.setRateLimitRuleId("");
        updateIpv6GatewaySpeedLimitPolicyRequest.setClientToken("");
        updateIpv6GatewaySpeedLimitPolicyRequest.setIngressBandwidthInMbps(0);
        updateIpv6GatewaySpeedLimitPolicyRequest.setEgressBandwidthInMbps(0);
        vpcClient.updateIpv6GatewaySpeedLimitPolicy(updateIpv6GatewaySpeedLimitPolicyRequest);
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
     * updateNetworkDetection
     *
     */
    @Test
    public void updateNetworkDetectionTest() {
        UpdateNetworkDetectionRequest updateNetworkDetectionRequest = new UpdateNetworkDetectionRequest();
        updateNetworkDetectionRequest.setProbeId("");
        updateNetworkDetectionRequest.setClientToken("");
        updateNetworkDetectionRequest.setName("");
        updateNetworkDetectionRequest.setDescription("");
        updateNetworkDetectionRequest.setDestIp("");
        updateNetworkDetectionRequest.setDestPort(0);
        vpcClient.updateNetworkDetection(updateNetworkDetectionRequest);
    }
    /**
     * updatePeerToPeerConnectionReleaseProtectionSwitch
     *
     */
    @Test
    public void updatePeerToPeerConnectionReleaseProtectionSwitchTest() {
        UpdatePeerToPeerConnectionReleaseProtectionSwitchRequest updatePeerToPeerConnectionReleaseProtectionSwitchRequest =
                new UpdatePeerToPeerConnectionReleaseProtectionSwitchRequest();
        updatePeerToPeerConnectionReleaseProtectionSwitchRequest.setPeerConnId("");
        updatePeerToPeerConnectionReleaseProtectionSwitchRequest.setDeleteProtect(false);
        vpcClient.updatePeerToPeerConnectionReleaseProtectionSwitch(updatePeerToPeerConnectionReleaseProtectionSwitchRequest);
    }
    /**
     * updateRegularSecurityGroupRulesV2
     *
     */
    @Test
    public void updateRegularSecurityGroupRulesV2Test() {
        UpdateRegularSecurityGroupRulesV2Request updateRegularSecurityGroupRulesV2Request = new UpdateRegularSecurityGroupRulesV2Request();
        updateRegularSecurityGroupRulesV2Request.setClientToken("");
        updateRegularSecurityGroupRulesV2Request.setSgVersion(0L);
        updateRegularSecurityGroupRulesV2Request.setSecurityGroupRuleId("");
        updateRegularSecurityGroupRulesV2Request.setRemark("");
        updateRegularSecurityGroupRulesV2Request.setPortRange("");
        updateRegularSecurityGroupRulesV2Request.setSourceIp("");
        updateRegularSecurityGroupRulesV2Request.setSourceGroupId("");
        updateRegularSecurityGroupRulesV2Request.setDestIp("");
        updateRegularSecurityGroupRulesV2Request.setDestGroupId("");
        updateRegularSecurityGroupRulesV2Request.setProtocol("");
        vpcClient.updateRegularSecurityGroupRulesV2(updateRegularSecurityGroupRulesV2Request);
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
     * updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnections
     *
     */
    @Test
    public void updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsTest() {
        UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest =
                new UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest();
        updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest.setPeerConnId("");
        updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest.setLocalIfId("");
        updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest.setDescription("");
        updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest.setLocalIfName("");
        vpcClient.updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnections(updateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest);
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
    /**
     * viewPeerToPeerConnectionDetails
     *
     */
    @Test
    public void viewPeerToPeerConnectionDetailsTest() {
        ViewPeerToPeerConnectionDetailsRequest viewPeerToPeerConnectionDetailsRequest = new ViewPeerToPeerConnectionDetailsRequest();
        viewPeerToPeerConnectionDetailsRequest.setPeerConnId("");
        viewPeerToPeerConnectionDetailsRequest.setRole("");
        ViewPeerToPeerConnectionDetailsResponse response = vpcClient.viewPeerToPeerConnectionDetails(viewPeerToPeerConnectionDetailsRequest);
        System.out.println(response);
    }
    /**
     * viewSecurityGroupDetailsV2
     *
     */
    @Test
    public void viewSecurityGroupDetailsV2Test() {
        ViewSecurityGroupDetailsV2Request viewSecurityGroupDetailsV2Request = new ViewSecurityGroupDetailsV2Request();
        viewSecurityGroupDetailsV2Request.setSecurityGroupId("");
        ViewSecurityGroupDetailsV2Response response = vpcClient.viewSecurityGroupDetailsV2(viewSecurityGroupDetailsV2Request);
        System.out.println(response);
    }
}
