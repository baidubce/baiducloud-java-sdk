package com.baidubce.vpc;

import com.baidubce.vpc.models.AcceptPeerToPeerConnectionApplicationsRequest;
import com.baidubce.vpc.models.ActiveStandbySwitchoverRequest;
import com.baidubce.vpc.models.AuthorizeRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.AuthorizedEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.BatchCreateSslVpnUsersRequest;
import com.baidubce.vpc.models.BatchCreateSslVpnUsersResponse;
import com.baidubce.vpc.models.BindEipRequest;
import com.baidubce.vpc.models.BindPhysicalDedicatedLineRequest;
import com.baidubce.vpc.models.ClosePeerToPeerConnectionToSynchronizeDnsRequest;
import com.baidubce.vpc.models.CloseVpcRelayRequest;
import com.baidubce.vpc.models.CreateAPeerToPeerConnectionRequest;
import com.baidubce.vpc.models.CreateAPeerToPeerConnectionResponse;
import com.baidubce.vpc.models.CreateARegularSecurityGroupV2Request;
import com.baidubce.vpc.models.CreateARegularSecurityGroupV2Response;
import com.baidubce.vpc.models.CreateDedicatedGatewayHealthCheckRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayResponse;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupResponse;
import com.baidubce.vpc.models.CreateGatewayLimitRulesRequest;
import com.baidubce.vpc.models.CreateGatewayLimitRulesResponse;
import com.baidubce.vpc.models.CreateIpReservedRequest;
import com.baidubce.vpc.models.CreateIpReservedResponse;
import com.baidubce.vpc.models.CreateRoutingRulesRequest;
import com.baidubce.vpc.models.CreateRoutingRulesResponse;
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
import com.baidubce.vpc.models.DeleteEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.DeleteEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.DeleteGatewayLimitRuleRequest;
import com.baidubce.vpc.models.DeleteIpReserveRequest;
import com.baidubce.vpc.models.DeleteRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.DeleteRegularSecurityGroupV2Request;
import com.baidubce.vpc.models.DeleteRoutingRulesRequest;
import com.baidubce.vpc.models.DeleteSslVpnServerRequest;
import com.baidubce.vpc.models.DeleteSslVpnUserRequest;
import com.baidubce.vpc.models.DeleteSubnetRequest;
import com.baidubce.vpc.models.DeleteUserGatewayRequest;
import com.baidubce.vpc.models.DeleteVpcRequest;
import com.baidubce.vpc.models.DeleteVpnTunnelRequest;
import com.baidubce.vpc.models.EnablePeerToPeerConnectionToSynchronizeDnsRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoResponse;
import com.baidubce.vpc.models.ListIpReserveRequest;
import com.baidubce.vpc.models.ListIpReserveResponse;
import com.baidubce.vpc.models.ModifyGatewayLimitRulesRequest;
import com.baidubce.vpc.models.OpenVpcRelayRequest;
import com.baidubce.vpc.models.PeerToPeerConnectionBandwidthUpgradeAndDowngradeRequest;
import com.baidubce.vpc.models.PeerToPeerConnectionRenewalRequest;
import com.baidubce.vpc.models.PrepaidPeerToPeerConnectionUnsubscribeRequest;
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
import com.baidubce.vpc.models.QueryTheListOfEnterpriseSecurityGroupsRequest;
import com.baidubce.vpc.models.QueryTheListOfEnterpriseSecurityGroupsResponse;
import com.baidubce.vpc.models.QueryTheListOfPeerConnectionsRequest;
import com.baidubce.vpc.models.QueryTheListOfPeerConnectionsResponse;
import com.baidubce.vpc.models.QueryTheListOfRegularSecurityGroupsV2Request;
import com.baidubce.vpc.models.QueryTheListOfRegularSecurityGroupsV2Response;
import com.baidubce.vpc.models.QueryVpcIntranetIpRequest;
import com.baidubce.vpc.models.QueryVpcIntranetIpResponse;
import com.baidubce.vpc.models.QueryVpcListRequest;
import com.baidubce.vpc.models.QueryVpcListResponse;
import com.baidubce.vpc.models.QueryVpnListRequest;
import com.baidubce.vpc.models.QueryVpnListResponse;
import com.baidubce.vpc.models.RejectPeerToPeerConnectionRequestRequest;
import com.baidubce.vpc.models.ReleaseDedicatedGatewayRequest;
import com.baidubce.vpc.models.ReleasePeerToPeerConnectionRequest;
import com.baidubce.vpc.models.ReleaseVpnRequest;
import com.baidubce.vpc.models.RenewVpnRequest;
import com.baidubce.vpc.models.RevokeRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.SearchForVpnDetailsRequest;
import com.baidubce.vpc.models.SearchForVpnDetailsResponse;
import com.baidubce.vpc.models.SearchVpnTunnelRequest;
import com.baidubce.vpc.models.SearchVpnTunnelResponse;
import com.baidubce.vpc.models.UnbindEipRequest;
import com.baidubce.vpc.models.UnbindPhysicalDedicatedLineRequest;
import com.baidubce.vpc.models.UpdateDedicatedGatewayRequest;
import com.baidubce.vpc.models.UpdateEnterpriseSecurityGroupRulesRequest;
import com.baidubce.vpc.models.UpdatePeerToPeerConnectionReleaseProtectionSwitchRequest;
import com.baidubce.vpc.models.UpdateRegularSecurityGroupRulesV2Request;
import com.baidubce.vpc.models.UpdateRoutingRulesRequest;
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
