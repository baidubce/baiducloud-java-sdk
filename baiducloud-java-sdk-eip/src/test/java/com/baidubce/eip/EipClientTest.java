package com.baidubce.eip;

import com.baidubce.eip.models.AddEipGroupCountRequest;
import com.baidubce.eip.models.AddTbspAreaBlockingRequest;
import com.baidubce.eip.models.AddTbspIpWhitelistRequest;
import com.baidubce.eip.models.AddTbspProtocolBlockingRequest;
import com.baidubce.eip.models.ApplyForEipRequest;
import com.baidubce.eip.models.ApplyForEipResponse;
import com.baidubce.eip.models.BandwidthPackageInquiryRequest;
import com.baidubce.eip.models.BandwidthPackageInquiryResponse;
import com.baidubce.eip.models.BindEipRequest;
import com.baidubce.eip.models.BindTbspProtectionObjectRequest;
import com.baidubce.eip.models.CancelEipTransferRequest;
import com.baidubce.eip.models.CreateASharedTrafficPackageRequest;
import com.baidubce.eip.models.CreateASharedTrafficPackageResponse;
import com.baidubce.eip.models.CreateEipBpRequest;
import com.baidubce.eip.models.CreateEipBpResponse;
import com.baidubce.eip.models.CreateEipGroupRequest;
import com.baidubce.eip.models.CreateEipGroupResponse;
import com.baidubce.eip.models.CreateEipTransferRequest;
import com.baidubce.eip.models.CreateEipTransferResponse;
import com.baidubce.eip.models.CreateTbspRequest;
import com.baidubce.eip.models.CreateTbspResponse;
import com.baidubce.eip.models.DetailTbspRequest;
import com.baidubce.eip.models.DetailTbspResponse;
import com.baidubce.eip.models.DirectEipRequest;
import com.baidubce.eip.models.DisableTbspIpCleanRequest;
import com.baidubce.eip.models.EipBandwidthScalingCapacityRequest;
import com.baidubce.eip.models.EipInquiryRequest;
import com.baidubce.eip.models.EipInquiryResponse;
import com.baidubce.eip.models.EipPostpaidToPrepaidRequest;
import com.baidubce.eip.models.EipRenewalRequest;
import com.baidubce.eip.models.EnableTbspIpCleanRequest;
import com.baidubce.eip.models.GetEipBpRequest;
import com.baidubce.eip.models.GetEipBpResponse;
import com.baidubce.eip.models.GetEipGroupRequest;
import com.baidubce.eip.models.GetEipGroupResponse;
import com.baidubce.eip.models.ListBaseDdosAttackRecordRequest;
import com.baidubce.eip.models.ListBaseDdosAttackRecordResponse;
import com.baidubce.eip.models.ListBaseDdosRequest;
import com.baidubce.eip.models.ListBaseDdosResponse;
import com.baidubce.eip.models.ListEipBpRequest;
import com.baidubce.eip.models.ListEipBpResponse;
import com.baidubce.eip.models.ListEipGroupRequest;
import com.baidubce.eip.models.ListEipGroupResponse;
import com.baidubce.eip.models.ListEipTransferRequest;
import com.baidubce.eip.models.ListEipTransferResponse;
import com.baidubce.eip.models.ListRecycleEipsRequest;
import com.baidubce.eip.models.ListRecycleEipsResponse;
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
import com.baidubce.eip.models.ListUnbanRequest;
import com.baidubce.eip.models.ListUnbanResponse;
import com.baidubce.eip.models.ModifyTbspIpCleanThresholdRequest;
import com.baidubce.eip.models.ModifyTbspIpProtectLevelRequest;
import com.baidubce.eip.models.MoveInEipsRequest;
import com.baidubce.eip.models.MoveOutEipsRequest;
import com.baidubce.eip.models.OptionalReleaseEipRequest;
import com.baidubce.eip.models.PurchaseReservedEipGroupRequest;
import com.baidubce.eip.models.QueryEipListRequest;
import com.baidubce.eip.models.QueryEipListResponse;
import com.baidubce.eip.models.QueryTheDetailsOfSharedTrafficPackagesRequest;
import com.baidubce.eip.models.QueryTheDetailsOfSharedTrafficPackagesResponse;
import com.baidubce.eip.models.QueryTheListOfSharedTrafficPackagesRequest;
import com.baidubce.eip.models.QueryTheListOfSharedTrafficPackagesResponse;
import com.baidubce.eip.models.ReceiveEipTransferRequest;
import com.baidubce.eip.models.RefundEipGroupRequest;
import com.baidubce.eip.models.RefundEipRequest;
import com.baidubce.eip.models.RejectEipTransferRequest;
import com.baidubce.eip.models.ReleaseEipBpRequest;
import com.baidubce.eip.models.ReleaseEipFromRecycleRequest;
import com.baidubce.eip.models.ReleaseEipGroupRequest;
import com.baidubce.eip.models.ReleaseEipRequest;
import com.baidubce.eip.models.RemoveTbspAreaBlockingRequest;
import com.baidubce.eip.models.RemoveTbspIpWhitelistRequest;
import com.baidubce.eip.models.RemoveTbspProtocolBlockingRequest;
import com.baidubce.eip.models.RenewTbspRequest;
import com.baidubce.eip.models.ResizeEipBpBandwidthRequest;
import com.baidubce.eip.models.ResizeEipGroupBandwidthRequest;
import com.baidubce.eip.models.ResizeTbspRequest;
import com.baidubce.eip.models.RestoreEipFromRecycleRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryResponse;
import com.baidubce.eip.models.SharedDataPackageInquiryRequest;
import com.baidubce.eip.models.SharedDataPackageInquiryResponse;
import com.baidubce.eip.models.StartEipAutoRenewRequest;
import com.baidubce.eip.models.StopEipAutoRenewRequest;
import com.baidubce.eip.models.UnDirectEipRequest;
import com.baidubce.eip.models.UnbindEipRequest;
import com.baidubce.eip.models.UnbindTbspProtectionObjectRequest;
import com.baidubce.eip.models.UpdateBaseDdosThresholdRequest;
import com.baidubce.eip.models.UpdateEipBpAutoReleaseTimeRequest;
import com.baidubce.eip.models.UpdateEipBpNameRequest;
import com.baidubce.eip.models.UpdateEipDeleteProtectRequest;
import com.baidubce.eip.models.UpdateEipGroupRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for EipClient
 */
public class EipClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private EipClient eipClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        eipClient = new EipClient(config);
    }

    /**
     * addEipGroupCount
     *
     */
    @Test
    public void addEipGroupCountTest() {
        AddEipGroupCountRequest addEipGroupCountRequest = new AddEipGroupCountRequest();
        addEipGroupCountRequest.setId("");
        addEipGroupCountRequest.setClientToken("");
        addEipGroupCountRequest.setEipAddCount(0);
        addEipGroupCountRequest.setEipv6AddCount(0);
        eipClient.addEipGroupCount(addEipGroupCountRequest);
    }
    /**
     * addTbspAreaBlocking
     *
     */
    @Test
    public void addTbspAreaBlockingTest() {
        AddTbspAreaBlockingRequest addTbspAreaBlockingRequest = new AddTbspAreaBlockingRequest();
        addTbspAreaBlockingRequest.setId("");
        addTbspAreaBlockingRequest.setClientToken("");
        addTbspAreaBlockingRequest.setIp("");
        addTbspAreaBlockingRequest.setBlockTime(0);
        addTbspAreaBlockingRequest.setBlockType("");
        eipClient.addTbspAreaBlocking(addTbspAreaBlockingRequest);
    }
    /**
     * addTbspIpWhitelist
     *
     */
    @Test
    public void addTbspIpWhitelistTest() {
        AddTbspIpWhitelistRequest addTbspIpWhitelistRequest = new AddTbspIpWhitelistRequest();
        addTbspIpWhitelistRequest.setId("");
        addTbspIpWhitelistRequest.setClientToken("");
        addTbspIpWhitelistRequest.setIp("");
        addTbspIpWhitelistRequest.setIpCidrList(new ArrayList<>());
        eipClient.addTbspIpWhitelist(addTbspIpWhitelistRequest);
    }
    /**
     * addTbspProtocolBlocking
     *
     */
    @Test
    public void addTbspProtocolBlockingTest() {
        AddTbspProtocolBlockingRequest addTbspProtocolBlockingRequest = new AddTbspProtocolBlockingRequest();
        addTbspProtocolBlockingRequest.setId("");
        addTbspProtocolBlockingRequest.setClientToken("");
        addTbspProtocolBlockingRequest.setIp("");
        addTbspProtocolBlockingRequest.setProtocolPortList(new ArrayList<>());
        eipClient.addTbspProtocolBlocking(addTbspProtocolBlockingRequest);
    }
    /**
     * applyForEip
     *
     */
    @Test
    public void applyForEipTest() {
        ApplyForEipRequest applyForEipRequest = new ApplyForEipRequest();
        applyForEipRequest.setClientToken("");
        applyForEipRequest.setIpVersion("");
        applyForEipRequest.setRouteType("");
        applyForEipRequest.setBandwidthInMbps(0);
        applyForEipRequest.setBilling(null);
        applyForEipRequest.setName("");
        applyForEipRequest.setTags(new ArrayList<>());
        applyForEipRequest.setResourceGroupId("");
        applyForEipRequest.setAutoRenewTimeUnit("");
        applyForEipRequest.setAutoRenewTime(0);
        applyForEipRequest.setDeleteProtect(false);
        ApplyForEipResponse response = eipClient.applyForEip(applyForEipRequest);
        System.out.println(response);
    }
    /**
     * bandwidthPackageInquiry
     *
     */
    @Test
    public void bandwidthPackageInquiryTest() {
        BandwidthPackageInquiryRequest bandwidthPackageInquiryRequest = new BandwidthPackageInquiryRequest();
        bandwidthPackageInquiryRequest.setBandwidthInMbps(0);
        bandwidthPackageInquiryRequest.setCount(0);
        bandwidthPackageInquiryRequest.setType("");
        BandwidthPackageInquiryResponse response = eipClient.bandwidthPackageInquiry(bandwidthPackageInquiryRequest);
        System.out.println(response);
    }
    /**
     * bindEip
     *
     */
    @Test
    public void bindEipTest() {
        BindEipRequest bindEipRequest = new BindEipRequest();
        bindEipRequest.setEip("");
        bindEipRequest.setClientToken("");
        bindEipRequest.setInstanceType("");
        bindEipRequest.setInstanceId("");
        bindEipRequest.setInstanceIp("");
        eipClient.bindEip(bindEipRequest);
    }
    /**
     * bindTbspProtectionObject
     *
     */
    @Test
    public void bindTbspProtectionObjectTest() {
        BindTbspProtectionObjectRequest bindTbspProtectionObjectRequest = new BindTbspProtectionObjectRequest();
        bindTbspProtectionObjectRequest.setId("");
        bindTbspProtectionObjectRequest.setClientToken("");
        bindTbspProtectionObjectRequest.setIpList(new ArrayList<>());
        eipClient.bindTbspProtectionObject(bindTbspProtectionObjectRequest);
    }
    /**
     * cancelEipTransfer
     *
     */
    @Test
    public void cancelEipTransferTest() {
        CancelEipTransferRequest cancelEipTransferRequest = new CancelEipTransferRequest();
        cancelEipTransferRequest.setClientToken("");
        cancelEipTransferRequest.setTransferIdList(new ArrayList<>());
        eipClient.cancelEipTransfer(cancelEipTransferRequest);
    }
    /**
     * createASharedTrafficPackage
     *
     */
    @Test
    public void createASharedTrafficPackageTest() {
        CreateASharedTrafficPackageRequest createASharedTrafficPackageRequest = new CreateASharedTrafficPackageRequest();
        createASharedTrafficPackageRequest.setClientToken("");
        createASharedTrafficPackageRequest.setReservationLength(0);
        createASharedTrafficPackageRequest.setCapacity("");
        createASharedTrafficPackageRequest.setDeductPolicy("");
        createASharedTrafficPackageRequest.setPackageType("");
        CreateASharedTrafficPackageResponse response = eipClient.createASharedTrafficPackage(createASharedTrafficPackageRequest);
        System.out.println(response);
    }
    /**
     * createEipBp
     *
     */
    @Test
    public void createEipBpTest() {
        CreateEipBpRequest createEipBpRequest = new CreateEipBpRequest();
        createEipBpRequest.setClientToken("");
        createEipBpRequest.setName("");
        createEipBpRequest.setEip("");
        createEipBpRequest.setEipGroupId("");
        createEipBpRequest.setBandwidthInMbps(0);
        createEipBpRequest.setType("");
        createEipBpRequest.setAutoReleaseTime("");
        createEipBpRequest.setTags(new ArrayList<>());
        createEipBpRequest.setResourceGroupId("");
        CreateEipBpResponse response = eipClient.createEipBp(createEipBpRequest);
        System.out.println(response);
    }
    /**
     * createEipGroup
     *
     */
    @Test
    public void createEipGroupTest() {
        CreateEipGroupRequest createEipGroupRequest = new CreateEipGroupRequest();
        createEipGroupRequest.setClientToken("");
        createEipGroupRequest.setRouteType("");
        createEipGroupRequest.setEipCount(0);
        createEipGroupRequest.setEipv6Count(0);
        createEipGroupRequest.setBandwidthInMbps(0);
        createEipGroupRequest.setBilling(null);
        createEipGroupRequest.setName("");
        createEipGroupRequest.setTags(new ArrayList<>());
        createEipGroupRequest.setResourceGroupId("");
        CreateEipGroupResponse response = eipClient.createEipGroup(createEipGroupRequest);
        System.out.println(response);
    }
    /**
     * createEipTransfer
     *
     */
    @Test
    public void createEipTransferTest() {
        CreateEipTransferRequest createEipTransferRequest = new CreateEipTransferRequest();
        createEipTransferRequest.setClientToken("");
        createEipTransferRequest.setTransferType("");
        createEipTransferRequest.setTransferResourceList(new ArrayList<>());
        createEipTransferRequest.setToUserId("");
        CreateEipTransferResponse response = eipClient.createEipTransfer(createEipTransferRequest);
        System.out.println(response);
    }
    /**
     * createTbsp
     *
     */
    @Test
    public void createTbspTest() {
        CreateTbspRequest createTbspRequest = new CreateTbspRequest();
        createTbspRequest.setClientToken("");
        createTbspRequest.setName("");
        createTbspRequest.setLineType("");
        createTbspRequest.setIpCapacity(0);
        createTbspRequest.setReservationLength(0);
        createTbspRequest.setReservationTimeUnit("");
        createTbspRequest.setAutoRenewTime(0);
        createTbspRequest.setAutoRenewTimeUnit("");
        CreateTbspResponse response = eipClient.createTbsp(createTbspRequest);
        System.out.println(response);
    }
    /**
     * detailTbsp
     *
     */
    @Test
    public void detailTbspTest() {
        DetailTbspRequest detailTbspRequest = new DetailTbspRequest();
        detailTbspRequest.setId("");
        DetailTbspResponse response = eipClient.detailTbsp(detailTbspRequest);
        System.out.println(response);
    }
    /**
     * directEip
     *
     */
    @Test
    public void directEipTest() {
        DirectEipRequest directEipRequest = new DirectEipRequest();
        directEipRequest.setEip("");
        directEipRequest.setClientToken("");
        eipClient.directEip(directEipRequest);
    }
    /**
     * disableTbspIpClean
     *
     */
    @Test
    public void disableTbspIpCleanTest() {
        DisableTbspIpCleanRequest disableTbspIpCleanRequest = new DisableTbspIpCleanRequest();
        disableTbspIpCleanRequest.setId("");
        disableTbspIpCleanRequest.setClientToken("");
        disableTbspIpCleanRequest.setIp("");
        disableTbspIpCleanRequest.setTurnOffDuration(0);
        eipClient.disableTbspIpClean(disableTbspIpCleanRequest);
    }
    /**
     * eipBandwidthScalingCapacity
     *
     */
    @Test
    public void eipBandwidthScalingCapacityTest() {
        EipBandwidthScalingCapacityRequest eipBandwidthScalingCapacityRequest = new EipBandwidthScalingCapacityRequest();
        eipBandwidthScalingCapacityRequest.setEip("");
        eipBandwidthScalingCapacityRequest.setClientToken("");
        eipBandwidthScalingCapacityRequest.setNewBandwidthInMbps(0);
        eipClient.eipBandwidthScalingCapacity(eipBandwidthScalingCapacityRequest);
    }
    /**
     * eipInquiry
     *
     */
    @Test
    public void eipInquiryTest() {
        EipInquiryRequest eipInquiryRequest = new EipInquiryRequest();
        eipInquiryRequest.setBandwidthInMbps(0);
        eipInquiryRequest.setCount(0);
        eipInquiryRequest.setPurchaseType("");
        eipInquiryRequest.setBilling(null);
        EipInquiryResponse response = eipClient.eipInquiry(eipInquiryRequest);
        System.out.println(response);
    }
    /**
     * eipPostpaidToPrepaid
     *
     */
    @Test
    public void eipPostpaidToPrepaidTest() {
        EipPostpaidToPrepaidRequest eipPostpaidToPrepaidRequest = new EipPostpaidToPrepaidRequest();
        eipPostpaidToPrepaidRequest.setEip("");
        eipPostpaidToPrepaidRequest.setClientToken("");
        eipPostpaidToPrepaidRequest.setPurchaseLength(0);
        eipPostpaidToPrepaidRequest.setBandWidth(0);
        eipClient.eipPostpaidToPrepaid(eipPostpaidToPrepaidRequest);
    }
    /**
     * eipRenewal
     *
     */
    @Test
    public void eipRenewalTest() {
        EipRenewalRequest eipRenewalRequest = new EipRenewalRequest();
        eipRenewalRequest.setEip("");
        eipRenewalRequest.setClientToken("");
        eipRenewalRequest.setBilling(null);
        eipClient.eipRenewal(eipRenewalRequest);
    }
    /**
     * enableTbspIpClean
     *
     */
    @Test
    public void enableTbspIpCleanTest() {
        EnableTbspIpCleanRequest enableTbspIpCleanRequest = new EnableTbspIpCleanRequest();
        enableTbspIpCleanRequest.setId("");
        enableTbspIpCleanRequest.setClientToken("");
        enableTbspIpCleanRequest.setIp("");
        eipClient.enableTbspIpClean(enableTbspIpCleanRequest);
    }
    /**
     * getEipBp
     *
     */
    @Test
    public void getEipBpTest() {
        GetEipBpRequest getEipBpRequest = new GetEipBpRequest();
        getEipBpRequest.setId("");
        getEipBpRequest.setClientToken("");
        GetEipBpResponse response = eipClient.getEipBp(getEipBpRequest);
        System.out.println(response);
    }
    /**
     * getEipGroup
     *
     */
    @Test
    public void getEipGroupTest() {
        GetEipGroupRequest getEipGroupRequest = new GetEipGroupRequest();
        getEipGroupRequest.setId("");
        GetEipGroupResponse response = eipClient.getEipGroup(getEipGroupRequest);
        System.out.println(response);
    }
    /**
     * listBaseDdos
     *
     */
    @Test
    public void listBaseDdosTest() {
        ListBaseDdosRequest listBaseDdosRequest = new ListBaseDdosRequest();
        listBaseDdosRequest.setIps("");
        listBaseDdosRequest.setType("");
        listBaseDdosRequest.setMarker("");
        listBaseDdosRequest.setMaxKeys(0);
        ListBaseDdosResponse response = eipClient.listBaseDdos(listBaseDdosRequest);
        System.out.println(response);
    }
    /**
     * listBaseDdosAttackRecord
     *
     */
    @Test
    public void listBaseDdosAttackRecordTest() {
        ListBaseDdosAttackRecordRequest listBaseDdosAttackRecordRequest = new ListBaseDdosAttackRecordRequest();
        listBaseDdosAttackRecordRequest.setIp("");
        listBaseDdosAttackRecordRequest.setStartTime("");
        listBaseDdosAttackRecordRequest.setMarker("");
        listBaseDdosAttackRecordRequest.setMaxKeys(0);
        ListBaseDdosAttackRecordResponse response = eipClient.listBaseDdosAttackRecord(listBaseDdosAttackRecordRequest);
        System.out.println(response);
    }
    /**
     * listEipBp
     *
     */
    @Test
    public void listEipBpTest() {
        ListEipBpRequest listEipBpRequest = new ListEipBpRequest();
        listEipBpRequest.setMarker("");
        listEipBpRequest.setMaxKeys(0);
        listEipBpRequest.setId("");
        listEipBpRequest.setName("");
        listEipBpRequest.setBindType("");
        listEipBpRequest.setType("");
        ListEipBpResponse response = eipClient.listEipBp(listEipBpRequest);
        System.out.println(response);
    }
    /**
     * listEipGroup
     *
     */
    @Test
    public void listEipGroupTest() {
        ListEipGroupRequest listEipGroupRequest = new ListEipGroupRequest();
        listEipGroupRequest.setId("");
        listEipGroupRequest.setName("");
        listEipGroupRequest.setStatus("");
        listEipGroupRequest.setMarker("");
        listEipGroupRequest.setMaxKeys(0);
        ListEipGroupResponse response = eipClient.listEipGroup(listEipGroupRequest);
        System.out.println(response);
    }
    /**
     * listEipTransfer
     *
     */
    @Test
    public void listEipTransferTest() {
        ListEipTransferRequest listEipTransferRequest = new ListEipTransferRequest();
        listEipTransferRequest.setMaxKeys(0);
        listEipTransferRequest.setMarker("");
        listEipTransferRequest.setDirection("");
        listEipTransferRequest.setTransferId("");
        listEipTransferRequest.setStatus("");
        listEipTransferRequest.setFuzzyTransferId("");
        listEipTransferRequest.setFuzzyInstanceId("");
        listEipTransferRequest.setFuzzyInstanceName("");
        listEipTransferRequest.setFuzzyInstanceIp("");
        ListEipTransferResponse response = eipClient.listEipTransfer(listEipTransferRequest);
        System.out.println(response);
    }
    /**
     * listRecycleEips
     *
     */
    @Test
    public void listRecycleEipsTest() {
        ListRecycleEipsRequest listRecycleEipsRequest = new ListRecycleEipsRequest();
        listRecycleEipsRequest.setEip("");
        listRecycleEipsRequest.setName("");
        listRecycleEipsRequest.setMarker("");
        listRecycleEipsRequest.setMaxKeys(0);
        ListRecycleEipsResponse response = eipClient.listRecycleEips(listRecycleEipsRequest);
        System.out.println(response);
    }
    /**
     * listTbsp
     *
     */
    @Test
    public void listTbspTest() {
        ListTbspRequest listTbspRequest = new ListTbspRequest();
        listTbspRequest.setId("");
        listTbspRequest.setName("");
        listTbspRequest.setStatus("");
        listTbspRequest.setMarker("");
        listTbspRequest.setMaxKeys(0);
        ListTbspResponse response = eipClient.listTbsp(listTbspRequest);
        System.out.println(response);
    }
    /**
     * listTbspAreaBlocking
     *
     */
    @Test
    public void listTbspAreaBlockingTest() {
        ListTbspAreaBlockingRequest listTbspAreaBlockingRequest = new ListTbspAreaBlockingRequest();
        listTbspAreaBlockingRequest.setId("");
        listTbspAreaBlockingRequest.setIp("");
        ListTbspAreaBlockingResponse response = eipClient.listTbspAreaBlocking(listTbspAreaBlockingRequest);
        System.out.println(response);
    }
    /**
     * listTbspIpClean
     *
     */
    @Test
    public void listTbspIpCleanTest() {
        ListTbspIpCleanRequest listTbspIpCleanRequest = new ListTbspIpCleanRequest();
        listTbspIpCleanRequest.setId("");
        listTbspIpCleanRequest.setIp("");
        listTbspIpCleanRequest.setMarker("");
        listTbspIpCleanRequest.setMaxKeys(0);
        ListTbspIpCleanResponse response = eipClient.listTbspIpClean(listTbspIpCleanRequest);
        System.out.println(response);
    }
    /**
     * listTbspIpWhitelist
     *
     */
    @Test
    public void listTbspIpWhitelistTest() {
        ListTbspIpWhitelistRequest listTbspIpWhitelistRequest = new ListTbspIpWhitelistRequest();
        listTbspIpWhitelistRequest.setId("");
        listTbspIpWhitelistRequest.setIp("");
        listTbspIpWhitelistRequest.setIpCidr("");
        listTbspIpWhitelistRequest.setMarker("");
        listTbspIpWhitelistRequest.setMaxKeys(0);
        ListTbspIpWhitelistResponse response = eipClient.listTbspIpWhitelist(listTbspIpWhitelistRequest);
        System.out.println(response);
    }
    /**
     * listTbspProtocolBlocking
     *
     */
    @Test
    public void listTbspProtocolBlockingTest() {
        ListTbspProtocolBlockingRequest listTbspProtocolBlockingRequest = new ListTbspProtocolBlockingRequest();
        listTbspProtocolBlockingRequest.setId("");
        listTbspProtocolBlockingRequest.setIp("");
        ListTbspProtocolBlockingResponse response = eipClient.listTbspProtocolBlocking(listTbspProtocolBlockingRequest);
        System.out.println(response);
    }
    /**
     * listUnban
     *
     */
    @Test
    public void listUnbanTest() {
        ListUnbanRequest listUnbanRequest = new ListUnbanRequest();
        listUnbanRequest.setMarker("");
        listUnbanRequest.setMaxKeys(0);
        listUnbanRequest.setIp("");
        ListUnbanResponse response = eipClient.listUnban(listUnbanRequest);
        System.out.println(response);
    }
    /**
     * modifyTbspIpCleanThreshold
     *
     */
    @Test
    public void modifyTbspIpCleanThresholdTest() {
        ModifyTbspIpCleanThresholdRequest modifyTbspIpCleanThresholdRequest = new ModifyTbspIpCleanThresholdRequest();
        modifyTbspIpCleanThresholdRequest.setId("");
        modifyTbspIpCleanThresholdRequest.setClientToken("");
        modifyTbspIpCleanThresholdRequest.setIp("");
        modifyTbspIpCleanThresholdRequest.setThresholdType("");
        modifyTbspIpCleanThresholdRequest.setCleanMbps(0);
        modifyTbspIpCleanThresholdRequest.setCleanPps(0);
        eipClient.modifyTbspIpCleanThreshold(modifyTbspIpCleanThresholdRequest);
    }
    /**
     * modifyTbspIpProtectLevel
     *
     */
    @Test
    public void modifyTbspIpProtectLevelTest() {
        ModifyTbspIpProtectLevelRequest modifyTbspIpProtectLevelRequest = new ModifyTbspIpProtectLevelRequest();
        modifyTbspIpProtectLevelRequest.setId("");
        modifyTbspIpProtectLevelRequest.setClientToken("");
        modifyTbspIpProtectLevelRequest.setIp("");
        modifyTbspIpProtectLevelRequest.setProtectLevel(0);
        eipClient.modifyTbspIpProtectLevel(modifyTbspIpProtectLevelRequest);
    }
    /**
     * moveInEips
     *
     */
    @Test
    public void moveInEipsTest() {
        MoveInEipsRequest moveInEipsRequest = new MoveInEipsRequest();
        moveInEipsRequest.setId("");
        moveInEipsRequest.setClientToken("");
        moveInEipsRequest.setEips(new ArrayList<>());
        eipClient.moveInEips(moveInEipsRequest);
    }
    /**
     * moveOutEips
     *
     */
    @Test
    public void moveOutEipsTest() {
        MoveOutEipsRequest moveOutEipsRequest = new MoveOutEipsRequest();
        moveOutEipsRequest.setId("");
        moveOutEipsRequest.setClientToken("");
        moveOutEipsRequest.setMoveOutEips(new ArrayList<>());
        eipClient.moveOutEips(moveOutEipsRequest);
    }
    /**
     * optionalReleaseEip
     *
     */
    @Test
    public void optionalReleaseEipTest() {
        OptionalReleaseEipRequest optionalReleaseEipRequest = new OptionalReleaseEipRequest();
        optionalReleaseEipRequest.setEip("");
        optionalReleaseEipRequest.setReleaseToRecycle(false);
        optionalReleaseEipRequest.setClientToken("");
        eipClient.optionalReleaseEip(optionalReleaseEipRequest);
    }
    /**
     * purchaseReservedEipGroup
     *
     */
    @Test
    public void purchaseReservedEipGroupTest() {
        PurchaseReservedEipGroupRequest purchaseReservedEipGroupRequest = new PurchaseReservedEipGroupRequest();
        purchaseReservedEipGroupRequest.setId("");
        purchaseReservedEipGroupRequest.setClientToken("");
        purchaseReservedEipGroupRequest.setBilling(null);
        eipClient.purchaseReservedEipGroup(purchaseReservedEipGroupRequest);
    }
    /**
     * queryEipList
     *
     */
    @Test
    public void queryEipListTest() {
        QueryEipListRequest queryEipListRequest = new QueryEipListRequest();
        queryEipListRequest.setIpVersion("");
        queryEipListRequest.setEip("");
        queryEipListRequest.setInstanceType("");
        queryEipListRequest.setInstanceId("");
        queryEipListRequest.setName("");
        queryEipListRequest.setStatus("");
        queryEipListRequest.setEipIds(new ArrayList<>());
        queryEipListRequest.setMarker("");
        queryEipListRequest.setMaxKeys(0);
        QueryEipListResponse response = eipClient.queryEipList(queryEipListRequest);
        System.out.println(response);
    }
    /**
     * queryTheDetailsOfSharedTrafficPackages
     *
     */
    @Test
    public void queryTheDetailsOfSharedTrafficPackagesTest() {
        QueryTheDetailsOfSharedTrafficPackagesRequest queryTheDetailsOfSharedTrafficPackagesRequest = new QueryTheDetailsOfSharedTrafficPackagesRequest();
        queryTheDetailsOfSharedTrafficPackagesRequest.setId("");
        queryTheDetailsOfSharedTrafficPackagesRequest.setClientToken("");
        QueryTheDetailsOfSharedTrafficPackagesResponse response = eipClient.queryTheDetailsOfSharedTrafficPackages(queryTheDetailsOfSharedTrafficPackagesRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfSharedTrafficPackages
     *
     */
    @Test
    public void queryTheListOfSharedTrafficPackagesTest() {
        QueryTheListOfSharedTrafficPackagesRequest queryTheListOfSharedTrafficPackagesRequest = new QueryTheListOfSharedTrafficPackagesRequest();
        queryTheListOfSharedTrafficPackagesRequest.setMarker("");
        queryTheListOfSharedTrafficPackagesRequest.setMaxKeys(0);
        queryTheListOfSharedTrafficPackagesRequest.setId("");
        queryTheListOfSharedTrafficPackagesRequest.setStatus("");
        queryTheListOfSharedTrafficPackagesRequest.setDeductPolicy("");
        QueryTheListOfSharedTrafficPackagesResponse response = eipClient.queryTheListOfSharedTrafficPackages(queryTheListOfSharedTrafficPackagesRequest);
        System.out.println(response);
    }
    /**
     * receiveEipTransfer
     *
     */
    @Test
    public void receiveEipTransferTest() {
        ReceiveEipTransferRequest receiveEipTransferRequest = new ReceiveEipTransferRequest();
        receiveEipTransferRequest.setClientToken("");
        receiveEipTransferRequest.setTransferIdList(new ArrayList<>());
        eipClient.receiveEipTransfer(receiveEipTransferRequest);
    }
    /**
     * refundEip
     *
     */
    @Test
    public void refundEipTest() {
        RefundEipRequest refundEipRequest = new RefundEipRequest();
        refundEipRequest.setEip("");
        refundEipRequest.setClientToken("");
        eipClient.refundEip(refundEipRequest);
    }
    /**
     * refundEipGroup
     *
     */
    @Test
    public void refundEipGroupTest() {
        RefundEipGroupRequest refundEipGroupRequest = new RefundEipGroupRequest();
        refundEipGroupRequest.setId("");
        refundEipGroupRequest.setClientToken("");
        eipClient.refundEipGroup(refundEipGroupRequest);
    }
    /**
     * rejectEipTransfer
     *
     */
    @Test
    public void rejectEipTransferTest() {
        RejectEipTransferRequest rejectEipTransferRequest = new RejectEipTransferRequest();
        rejectEipTransferRequest.setClientToken("");
        rejectEipTransferRequest.setTransferIdList(new ArrayList<>());
        eipClient.rejectEipTransfer(rejectEipTransferRequest);
    }
    /**
     * releaseEip
     *
     */
    @Test
    public void releaseEipTest() {
        ReleaseEipRequest releaseEipRequest = new ReleaseEipRequest();
        releaseEipRequest.setEip("");
        releaseEipRequest.setClientToken("");
        releaseEipRequest.setReleaseToRecycle(false);
        eipClient.releaseEip(releaseEipRequest);
    }
    /**
     * releaseEipBp
     *
     */
    @Test
    public void releaseEipBpTest() {
        ReleaseEipBpRequest releaseEipBpRequest = new ReleaseEipBpRequest();
        releaseEipBpRequest.setId("");
        releaseEipBpRequest.setClientToken("");
        eipClient.releaseEipBp(releaseEipBpRequest);
    }
    /**
     * releaseEipFromRecycle
     *
     */
    @Test
    public void releaseEipFromRecycleTest() {
        ReleaseEipFromRecycleRequest releaseEipFromRecycleRequest = new ReleaseEipFromRecycleRequest();
        releaseEipFromRecycleRequest.setEip("");
        releaseEipFromRecycleRequest.setClientToken("");
        eipClient.releaseEipFromRecycle(releaseEipFromRecycleRequest);
    }
    /**
     * releaseEipGroup
     *
     */
    @Test
    public void releaseEipGroupTest() {
        ReleaseEipGroupRequest releaseEipGroupRequest = new ReleaseEipGroupRequest();
        releaseEipGroupRequest.setId("");
        releaseEipGroupRequest.setClientToken("");
        eipClient.releaseEipGroup(releaseEipGroupRequest);
    }
    /**
     * removeTbspAreaBlocking
     *
     */
    @Test
    public void removeTbspAreaBlockingTest() {
        RemoveTbspAreaBlockingRequest removeTbspAreaBlockingRequest = new RemoveTbspAreaBlockingRequest();
        removeTbspAreaBlockingRequest.setId("");
        removeTbspAreaBlockingRequest.setIp("");
        removeTbspAreaBlockingRequest.setBlockType("");
        removeTbspAreaBlockingRequest.setClientToken("");
        eipClient.removeTbspAreaBlocking(removeTbspAreaBlockingRequest);
    }
    /**
     * removeTbspIpWhitelist
     *
     */
    @Test
    public void removeTbspIpWhitelistTest() {
        RemoveTbspIpWhitelistRequest removeTbspIpWhitelistRequest = new RemoveTbspIpWhitelistRequest();
        removeTbspIpWhitelistRequest.setId("");
        removeTbspIpWhitelistRequest.setClientToken("");
        removeTbspIpWhitelistRequest.setIp("");
        removeTbspIpWhitelistRequest.setWhitelistId("");
        eipClient.removeTbspIpWhitelist(removeTbspIpWhitelistRequest);
    }
    /**
     * removeTbspProtocolBlocking
     *
     */
    @Test
    public void removeTbspProtocolBlockingTest() {
        RemoveTbspProtocolBlockingRequest removeTbspProtocolBlockingRequest = new RemoveTbspProtocolBlockingRequest();
        removeTbspProtocolBlockingRequest.setId("");
        removeTbspProtocolBlockingRequest.setIp("");
        removeTbspProtocolBlockingRequest.setClientToken("");
        eipClient.removeTbspProtocolBlocking(removeTbspProtocolBlockingRequest);
    }
    /**
     * renewTbsp
     *
     */
    @Test
    public void renewTbspTest() {
        RenewTbspRequest renewTbspRequest = new RenewTbspRequest();
        renewTbspRequest.setId("");
        renewTbspRequest.setClientToken("");
        renewTbspRequest.setRenewTime(0);
        renewTbspRequest.setRenewTimeUnit("");
        eipClient.renewTbsp(renewTbspRequest);
    }
    /**
     * resizeEipBpBandwidth
     *
     */
    @Test
    public void resizeEipBpBandwidthTest() {
        ResizeEipBpBandwidthRequest resizeEipBpBandwidthRequest = new ResizeEipBpBandwidthRequest();
        resizeEipBpBandwidthRequest.setId("");
        resizeEipBpBandwidthRequest.setClientToken("");
        resizeEipBpBandwidthRequest.setBandwidthInMbps(0);
        eipClient.resizeEipBpBandwidth(resizeEipBpBandwidthRequest);
    }
    /**
     * resizeEipGroupBandwidth
     *
     */
    @Test
    public void resizeEipGroupBandwidthTest() {
        ResizeEipGroupBandwidthRequest resizeEipGroupBandwidthRequest = new ResizeEipGroupBandwidthRequest();
        resizeEipGroupBandwidthRequest.setId("");
        resizeEipGroupBandwidthRequest.setClientToken("");
        resizeEipGroupBandwidthRequest.setBandwidthInMbps(0);
        eipClient.resizeEipGroupBandwidth(resizeEipGroupBandwidthRequest);
    }
    /**
     * resizeTbsp
     *
     */
    @Test
    public void resizeTbspTest() {
        ResizeTbspRequest resizeTbspRequest = new ResizeTbspRequest();
        resizeTbspRequest.setId("");
        resizeTbspRequest.setClientToken("");
        resizeTbspRequest.setIpCapacity(0);
        eipClient.resizeTbsp(resizeTbspRequest);
    }
    /**
     * restoreEipFromRecycle
     *
     */
    @Test
    public void restoreEipFromRecycleTest() {
        RestoreEipFromRecycleRequest restoreEipFromRecycleRequest = new RestoreEipFromRecycleRequest();
        restoreEipFromRecycleRequest.setEip("");
        restoreEipFromRecycleRequest.setClientToken("");
        eipClient.restoreEipFromRecycle(restoreEipFromRecycleRequest);
    }
    /**
     * sharedBandwidthInquiry
     *
     */
    @Test
    public void sharedBandwidthInquiryTest() {
        SharedBandwidthInquiryRequest sharedBandwidthInquiryRequest = new SharedBandwidthInquiryRequest();
        sharedBandwidthInquiryRequest.setBandwidthInMbps(0);
        sharedBandwidthInquiryRequest.setCount(0);
        sharedBandwidthInquiryRequest.setIpNum(0);
        sharedBandwidthInquiryRequest.setBilling(null);
        SharedBandwidthInquiryResponse response = eipClient.sharedBandwidthInquiry(sharedBandwidthInquiryRequest);
        System.out.println(response);
    }
    /**
     * sharedDataPackageInquiry
     *
     */
    @Test
    public void sharedDataPackageInquiryTest() {
        SharedDataPackageInquiryRequest sharedDataPackageInquiryRequest = new SharedDataPackageInquiryRequest();
        sharedDataPackageInquiryRequest.setClientToken("");
        sharedDataPackageInquiryRequest.setReservationLength(0);
        sharedDataPackageInquiryRequest.setCapacity("");
        sharedDataPackageInquiryRequest.setDeductPolicy("");
        sharedDataPackageInquiryRequest.setPackageType("");
        SharedDataPackageInquiryResponse response = eipClient.sharedDataPackageInquiry(sharedDataPackageInquiryRequest);
        System.out.println(response);
    }
    /**
     * startEipAutoRenew
     *
     */
    @Test
    public void startEipAutoRenewTest() {
        StartEipAutoRenewRequest startEipAutoRenewRequest = new StartEipAutoRenewRequest();
        startEipAutoRenewRequest.setClientToken("");
        startEipAutoRenewRequest.setEip("");
        startEipAutoRenewRequest.setAutoRenewTimeUnit("");
        startEipAutoRenewRequest.setAutoRenewTime(0);
        eipClient.startEipAutoRenew(startEipAutoRenewRequest);
    }
    /**
     * stopEipAutoRenew
     *
     */
    @Test
    public void stopEipAutoRenewTest() {
        StopEipAutoRenewRequest stopEipAutoRenewRequest = new StopEipAutoRenewRequest();
        stopEipAutoRenewRequest.setClientToken("");
        stopEipAutoRenewRequest.setEip("");
        eipClient.stopEipAutoRenew(stopEipAutoRenewRequest);
    }
    /**
     * unDirectEip
     *
     */
    @Test
    public void unDirectEipTest() {
        UnDirectEipRequest unDirectEipRequest = new UnDirectEipRequest();
        unDirectEipRequest.setEip("");
        unDirectEipRequest.setClientToken("");
        eipClient.unDirectEip(unDirectEipRequest);
    }
    /**
     * unbindEip
     *
     */
    @Test
    public void unbindEipTest() {
        UnbindEipRequest unbindEipRequest = new UnbindEipRequest();
        unbindEipRequest.setEip("");
        unbindEipRequest.setClientToken("");
        eipClient.unbindEip(unbindEipRequest);
    }
    /**
     * unbindTbspProtectionObject
     *
     */
    @Test
    public void unbindTbspProtectionObjectTest() {
        UnbindTbspProtectionObjectRequest unbindTbspProtectionObjectRequest = new UnbindTbspProtectionObjectRequest();
        unbindTbspProtectionObjectRequest.setId("");
        unbindTbspProtectionObjectRequest.setClientToken("");
        unbindTbspProtectionObjectRequest.setIpList(new ArrayList<>());
        eipClient.unbindTbspProtectionObject(unbindTbspProtectionObjectRequest);
    }
    /**
     * updateBaseDdosThreshold
     *
     */
    @Test
    public void updateBaseDdosThresholdTest() {
        UpdateBaseDdosThresholdRequest updateBaseDdosThresholdRequest = new UpdateBaseDdosThresholdRequest();
        updateBaseDdosThresholdRequest.setIp("");
        updateBaseDdosThresholdRequest.setClientToken("");
        updateBaseDdosThresholdRequest.setThresholdType("");
        updateBaseDdosThresholdRequest.setIpCleanMbps(0L);
        updateBaseDdosThresholdRequest.setIpCleanPps(0L);
        eipClient.updateBaseDdosThreshold(updateBaseDdosThresholdRequest);
    }
    /**
     * updateEipBpAutoReleaseTime
     *
     */
    @Test
    public void updateEipBpAutoReleaseTimeTest() {
        UpdateEipBpAutoReleaseTimeRequest updateEipBpAutoReleaseTimeRequest = new UpdateEipBpAutoReleaseTimeRequest();
        updateEipBpAutoReleaseTimeRequest.setId("");
        updateEipBpAutoReleaseTimeRequest.setClientToken("");
        updateEipBpAutoReleaseTimeRequest.setAutoReleaseTime("");
        eipClient.updateEipBpAutoReleaseTime(updateEipBpAutoReleaseTimeRequest);
    }
    /**
     * updateEipBpName
     *
     */
    @Test
    public void updateEipBpNameTest() {
        UpdateEipBpNameRequest updateEipBpNameRequest = new UpdateEipBpNameRequest();
        updateEipBpNameRequest.setId("");
        updateEipBpNameRequest.setClientToken("");
        updateEipBpNameRequest.setName("");
        eipClient.updateEipBpName(updateEipBpNameRequest);
    }
    /**
     * updateEipDeleteProtect
     *
     */
    @Test
    public void updateEipDeleteProtectTest() {
        UpdateEipDeleteProtectRequest updateEipDeleteProtectRequest = new UpdateEipDeleteProtectRequest();
        updateEipDeleteProtectRequest.setEip("");
        updateEipDeleteProtectRequest.setClientToken("");
        updateEipDeleteProtectRequest.setDeleteProtect(false);
        eipClient.updateEipDeleteProtect(updateEipDeleteProtectRequest);
    }
    /**
     * updateEipGroup
     *
     */
    @Test
    public void updateEipGroupTest() {
        UpdateEipGroupRequest updateEipGroupRequest = new UpdateEipGroupRequest();
        updateEipGroupRequest.setId("");
        updateEipGroupRequest.setClientToken("");
        updateEipGroupRequest.setName("");
        eipClient.updateEipGroup(updateEipGroupRequest);
    }
}
