

package com.baidubce.vpc;

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
     * createAReservedNetworkSegment
     *
     */
    @Test
    public void createAReservedNetworkSegmentTest() {
        CreateAReservedNetworkSegmentRequest createAReservedNetworkSegmentRequest = new CreateAReservedNetworkSegmentRequest();
        createAReservedNetworkSegmentRequest.setClientToken("");
        createAReservedNetworkSegmentRequest.setSubnetId("");
        createAReservedNetworkSegmentRequest.setIpCidr("");
        createAReservedNetworkSegmentRequest.setIpVersion(0);
        createAReservedNetworkSegmentRequest.setDescription("");
        CreateAReservedNetworkSegmentResponse response = vpcClient.createAReservedNetworkSegment(createAReservedNetworkSegmentRequest);
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
     * deleteReservedNetworkSegment
     *
     */
    @Test
    public void deleteReservedNetworkSegmentTest() {
        DeleteReservedNetworkSegmentRequest deleteReservedNetworkSegmentRequest = new DeleteReservedNetworkSegmentRequest();
        deleteReservedNetworkSegmentRequest.setIpReserveId("");
        deleteReservedNetworkSegmentRequest.setClientToken("");
        vpcClient.deleteReservedNetworkSegment(deleteReservedNetworkSegmentRequest);
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
     * enableVpcRelay
     *
     */
    @Test
    public void enableVpcRelayTest() {
        EnableVpcRelayRequest enableVpcRelayRequest = new EnableVpcRelayRequest();
        enableVpcRelayRequest.setVpcId("");
        enableVpcRelayRequest.setClientToken("");
        vpcClient.enableVpcRelay(enableVpcRelayRequest);
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
     * queryTheIpAddressesOccupiedByProductsWithinVpc
     *
     */
    @Test
    public void queryTheIpAddressesOccupiedByProductsWithinVpcTest() {
        QueryTheIpAddressesOccupiedByProductsWithinVpcRequest queryTheIpAddressesOccupiedByProductsWithinVpcRequest = new QueryTheIpAddressesOccupiedByProductsWithinVpcRequest();
        queryTheIpAddressesOccupiedByProductsWithinVpcRequest.setVpcId("");
        queryTheIpAddressesOccupiedByProductsWithinVpcRequest.setSubnetId("");
        queryTheIpAddressesOccupiedByProductsWithinVpcRequest.setResourceType("");
        queryTheIpAddressesOccupiedByProductsWithinVpcRequest.setPageNo(0);
        queryTheIpAddressesOccupiedByProductsWithinVpcRequest.setPageSize(0);
        QueryTheIpAddressesOccupiedByProductsWithinVpcResponse response = vpcClient.queryTheIpAddressesOccupiedByProductsWithinVpc(queryTheIpAddressesOccupiedByProductsWithinVpcRequest);
        System.out.println(response);
    }
    /**
     * queryTheReservedNetworkSegmentList
     *
     */
    @Test
    public void queryTheReservedNetworkSegmentListTest() {
        QueryTheReservedNetworkSegmentListRequest queryTheReservedNetworkSegmentListRequest = new QueryTheReservedNetworkSegmentListRequest();
        queryTheReservedNetworkSegmentListRequest.setSubnetId("");
        queryTheReservedNetworkSegmentListRequest.setMarker("");
        queryTheReservedNetworkSegmentListRequest.setMaxKeys(0);
        QueryTheReservedNetworkSegmentListResponse response = vpcClient.queryTheReservedNetworkSegmentList(queryTheReservedNetworkSegmentListRequest);
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
}
