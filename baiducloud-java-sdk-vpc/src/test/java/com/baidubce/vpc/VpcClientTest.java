package com.baidubce.vpc;

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
}
