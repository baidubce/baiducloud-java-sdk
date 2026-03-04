package com.baidubce.vpc;

import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.models.CloseVpcRelayRequest;
import com.baidubce.vpc.models.CreateIpReservedRequest;
import com.baidubce.vpc.models.CreateIpReservedResponse;
import com.baidubce.vpc.models.CreateSubnetRequest;
import com.baidubce.vpc.models.CreateSubnetResponse;
import com.baidubce.vpc.models.CreateVpcRequest;
import com.baidubce.vpc.models.CreateVpcResponse;
import com.baidubce.vpc.models.DeleteIpReserveRequest;
import com.baidubce.vpc.models.DeleteSubnetRequest;
import com.baidubce.vpc.models.DeleteVpcRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoResponse;
import com.baidubce.vpc.models.ListIpReserveRequest;
import com.baidubce.vpc.models.ListIpReserveResponse;
import com.baidubce.vpc.models.OpenVpcRelayRequest;
import com.baidubce.vpc.models.QuerySpecifiedSubnetRequest;
import com.baidubce.vpc.models.QuerySpecifiedSubnetResponse;
import com.baidubce.vpc.models.QuerySpecifiedVpcRequest;
import com.baidubce.vpc.models.QuerySpecifiedVpcResponse;
import com.baidubce.vpc.models.QuerySubnetListRequest;
import com.baidubce.vpc.models.QuerySubnetListResponse;
import com.baidubce.vpc.models.QueryVpcIntranetIpRequest;
import com.baidubce.vpc.models.QueryVpcIntranetIpResponse;
import com.baidubce.vpc.models.QueryVpcListRequest;
import com.baidubce.vpc.models.QueryVpcListResponse;
import com.baidubce.vpc.models.UpdateSubnetRequest;
import com.baidubce.vpc.models.UpdateVpcRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/** API tests for VpcClient */
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

  /** closeVpcRelay */
  @Test
  public void closeVpcRelayTest() {
    CloseVpcRelayRequest closeVpcRelayRequest = new CloseVpcRelayRequest();
    closeVpcRelayRequest.setVpcId("");
    closeVpcRelayRequest.setClientToken("");
    vpcClient.closeVpcRelay(closeVpcRelayRequest);
  }

  /** createIpReserved */
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

  /** createSubnet */
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

  /** createVpc */
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

  /** deleteIpReserve */
  @Test
  public void deleteIpReserveTest() {
    DeleteIpReserveRequest deleteIpReserveRequest = new DeleteIpReserveRequest();
    deleteIpReserveRequest.setIpReserveId("");
    deleteIpReserveRequest.setClientToken("");
    vpcClient.deleteIpReserve(deleteIpReserveRequest);
  }

  /** deleteSubnet */
  @Test
  public void deleteSubnetTest() {
    DeleteSubnetRequest deleteSubnetRequest = new DeleteSubnetRequest();
    deleteSubnetRequest.setSubnetId("");
    deleteSubnetRequest.setClientToken("");
    vpcClient.deleteSubnet(deleteSubnetRequest);
  }

  /** deleteVpc */
  @Test
  public void deleteVpcTest() {
    DeleteVpcRequest deleteVpcRequest = new DeleteVpcRequest();
    deleteVpcRequest.setVpcId("");
    deleteVpcRequest.setClientToken("");
    vpcClient.deleteVpc(deleteVpcRequest);
  }

  /** getVpcResourceIpInfo */
  @Test
  public void getVpcResourceIpInfoTest() {
    GetVpcResourceIpInfoRequest getVpcResourceIpInfoRequest = new GetVpcResourceIpInfoRequest();
    getVpcResourceIpInfoRequest.setVpcId("");
    getVpcResourceIpInfoRequest.setSubnetId("");
    getVpcResourceIpInfoRequest.setResourceType("");
    getVpcResourceIpInfoRequest.setPageNo(0);
    getVpcResourceIpInfoRequest.setPageSize(0);
    GetVpcResourceIpInfoResponse response =
        vpcClient.getVpcResourceIpInfo(getVpcResourceIpInfoRequest);
    System.out.println(response);
  }

  /** listIpReserve */
  @Test
  public void listIpReserveTest() {
    ListIpReserveRequest listIpReserveRequest = new ListIpReserveRequest();
    listIpReserveRequest.setSubnetId("");
    listIpReserveRequest.setMarker("");
    listIpReserveRequest.setMaxKeys(0);
    ListIpReserveResponse response = vpcClient.listIpReserve(listIpReserveRequest);
    System.out.println(response);
  }

  /** openVpcRelay */
  @Test
  public void openVpcRelayTest() {
    OpenVpcRelayRequest openVpcRelayRequest = new OpenVpcRelayRequest();
    openVpcRelayRequest.setVpcId("");
    openVpcRelayRequest.setClientToken("");
    vpcClient.openVpcRelay(openVpcRelayRequest);
  }

  /** querySpecifiedSubnet */
  @Test
  public void querySpecifiedSubnetTest() {
    QuerySpecifiedSubnetRequest querySpecifiedSubnetRequest = new QuerySpecifiedSubnetRequest();
    querySpecifiedSubnetRequest.setSubnetId("");
    QuerySpecifiedSubnetResponse response =
        vpcClient.querySpecifiedSubnet(querySpecifiedSubnetRequest);
    System.out.println(response);
  }

  /** querySpecifiedVpc */
  @Test
  public void querySpecifiedVpcTest() {
    QuerySpecifiedVpcRequest querySpecifiedVpcRequest = new QuerySpecifiedVpcRequest();
    querySpecifiedVpcRequest.setVpcId("");
    QuerySpecifiedVpcResponse response = vpcClient.querySpecifiedVpc(querySpecifiedVpcRequest);
    System.out.println(response);
  }

  /** querySubnetList */
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

  /** queryVpcIntranetIp */
  @Test
  public void queryVpcIntranetIpTest() {
    QueryVpcIntranetIpRequest queryVpcIntranetIpRequest = new QueryVpcIntranetIpRequest();
    queryVpcIntranetIpRequest.setVpcId("");
    queryVpcIntranetIpRequest.setPrivateIpAddresses(new ArrayList<>());
    queryVpcIntranetIpRequest.setPrivateIpRange("");
    QueryVpcIntranetIpResponse response = vpcClient.queryVpcIntranetIp(queryVpcIntranetIpRequest);
    System.out.println(response);
  }

  /** queryVpcList */
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

  /** updateSubnet */
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

  /** updateVpc */
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
