

package com.baidubce.eip;

import com.baidubce.eip.models.ActivateEipAutomaticRenewalRequest;
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
import com.baidubce.eip.models.CloseEipDirectAccessRequest;
import com.baidubce.eip.models.CreateEipTransferRequest;
import com.baidubce.eip.models.CreateTbspRequest;
import com.baidubce.eip.models.CreateTbspResponse;
import com.baidubce.eip.models.DetailTbspRequest;
import com.baidubce.eip.models.DetailTbspResponse;
import com.baidubce.eip.models.DisableTbspIpCleanRequest;
import com.baidubce.eip.models.EipBandwidthScalingCapacityRequest;
import com.baidubce.eip.models.EipInquiryRequest;
import com.baidubce.eip.models.EipInquiryResponse;
import com.baidubce.eip.models.EipPostpaidToPrepaidRequest;
import com.baidubce.eip.models.EipRenewalRequest;
import com.baidubce.eip.models.EnableEipDirectAccessRequest;
import com.baidubce.eip.models.EnableTbspIpCleanRequest;
import com.baidubce.eip.models.ListEipTransferRequest;
import com.baidubce.eip.models.ListEipTransferResponse;
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
import com.baidubce.eip.models.ModifyTbspIpCleanThresholdRequest;
import com.baidubce.eip.models.ModifyTbspIpProtectLevelRequest;
import com.baidubce.eip.models.PrepaidEipUnsubscribeRequest;
import com.baidubce.eip.models.QueryEipListRequest;
import com.baidubce.eip.models.QueryEipListResponse;
import com.baidubce.eip.models.QueryTheListOfEipsInTheRecyclingBinRequest;
import com.baidubce.eip.models.QueryTheListOfEipsInTheRecyclingBinResponse;
import com.baidubce.eip.models.ReceiveEipTransferRequest;
import com.baidubce.eip.models.RejectEipTransferRequest;
import com.baidubce.eip.models.ReleaseEipRequest;
import com.baidubce.eip.models.ReleaseTheEipFromTheRecyclingBinRequest;
import com.baidubce.eip.models.RemoveTbspAreaBlockingRequest;
import com.baidubce.eip.models.RemoveTbspIpWhitelistRequest;
import com.baidubce.eip.models.RemoveTbspProtocolBlockingRequest;
import com.baidubce.eip.models.RenewTbspRequest;
import com.baidubce.eip.models.ResizeTbspRequest;
import com.baidubce.eip.models.RestoreEipInRecycleBinRequest;
import com.baidubce.eip.models.SelectiveReleaseOfEipRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryResponse;
import com.baidubce.eip.models.SharedDataPackageInquiryRequest;
import com.baidubce.eip.models.SharedDataPackageInquiryResponse;
import com.baidubce.eip.models.TurnOffEipAutomaticRenewalRequest;
import com.baidubce.eip.models.UnbindEipRequest;
import com.baidubce.eip.models.UnbindTbspProtectionObjectRequest;
import com.baidubce.eip.models.UpdateEipReleaseProtectionSwitchRequest;
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
     * activateEipAutomaticRenewal
     *
     */
    @Test
    public void activateEipAutomaticRenewalTest() {
        ActivateEipAutomaticRenewalRequest activateEipAutomaticRenewalRequest = new ActivateEipAutomaticRenewalRequest();
        activateEipAutomaticRenewalRequest.setClientToken("");
        activateEipAutomaticRenewalRequest.setEip("");
        activateEipAutomaticRenewalRequest.setAutoRenewTimeUnit("");
        activateEipAutomaticRenewalRequest.setAutoRenewTime(0);
        eipClient.activateEipAutomaticRenewal(activateEipAutomaticRenewalRequest);
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
        cancelEipTransferRequest.setAction("");
        cancelEipTransferRequest.setClientToken("");
        cancelEipTransferRequest.setTransferIdList(new ArrayList<>());
        eipClient.cancelEipTransfer(cancelEipTransferRequest);
    }
    /**
     * closeEipDirectAccess
     *
     */
    @Test
    public void closeEipDirectAccessTest() {
        CloseEipDirectAccessRequest closeEipDirectAccessRequest = new CloseEipDirectAccessRequest();
        closeEipDirectAccessRequest.setEip("");
        closeEipDirectAccessRequest.setClientToken("");
        eipClient.closeEipDirectAccess(closeEipDirectAccessRequest);
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
        eipClient.createEipTransfer(createEipTransferRequest);
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
     * enableEipDirectAccess
     *
     */
    @Test
    public void enableEipDirectAccessTest() {
        EnableEipDirectAccessRequest enableEipDirectAccessRequest = new EnableEipDirectAccessRequest();
        enableEipDirectAccessRequest.setEip("");
        enableEipDirectAccessRequest.setClientToken("");
        eipClient.enableEipDirectAccess(enableEipDirectAccessRequest);
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
     * listEipTransfer
     *
     */
    @Test
    public void listEipTransferTest() {
        ListEipTransferRequest listEipTransferRequest = new ListEipTransferRequest();
        listEipTransferRequest.setMaxKeys("");
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
     * prepaidEipUnsubscribe
     *
     */
    @Test
    public void prepaidEipUnsubscribeTest() {
        PrepaidEipUnsubscribeRequest prepaidEipUnsubscribeRequest = new PrepaidEipUnsubscribeRequest();
        prepaidEipUnsubscribeRequest.setEip("");
        prepaidEipUnsubscribeRequest.setClientToken("");
        eipClient.prepaidEipUnsubscribe(prepaidEipUnsubscribeRequest);
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
     * queryTheListOfEipsInTheRecyclingBin
     *
     */
    @Test
    public void queryTheListOfEipsInTheRecyclingBinTest() {
        QueryTheListOfEipsInTheRecyclingBinRequest queryTheListOfEipsInTheRecyclingBinRequest = new QueryTheListOfEipsInTheRecyclingBinRequest();
        queryTheListOfEipsInTheRecyclingBinRequest.setEip("");
        queryTheListOfEipsInTheRecyclingBinRequest.setName("");
        queryTheListOfEipsInTheRecyclingBinRequest.setMarker("");
        queryTheListOfEipsInTheRecyclingBinRequest.setMaxKeys(0);
        QueryTheListOfEipsInTheRecyclingBinResponse response = eipClient.queryTheListOfEipsInTheRecyclingBin(queryTheListOfEipsInTheRecyclingBinRequest);
        System.out.println(response);
    }
    /**
     * receiveEipTransfer
     *
     */
    @Test
    public void receiveEipTransferTest() {
        ReceiveEipTransferRequest receiveEipTransferRequest = new ReceiveEipTransferRequest();
        receiveEipTransferRequest.setAction("");
        receiveEipTransferRequest.setClientToken("");
        receiveEipTransferRequest.setTransferIdList(new ArrayList<>());
        eipClient.receiveEipTransfer(receiveEipTransferRequest);
    }
    /**
     * rejectEipTransfer
     *
     */
    @Test
    public void rejectEipTransferTest() {
        RejectEipTransferRequest rejectEipTransferRequest = new RejectEipTransferRequest();
        rejectEipTransferRequest.setAction("");
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
     * releaseTheEipFromTheRecyclingBin
     *
     */
    @Test
    public void releaseTheEipFromTheRecyclingBinTest() {
        ReleaseTheEipFromTheRecyclingBinRequest releaseTheEipFromTheRecyclingBinRequest = new ReleaseTheEipFromTheRecyclingBinRequest();
        releaseTheEipFromTheRecyclingBinRequest.setEip("");
        releaseTheEipFromTheRecyclingBinRequest.setClientToken("");
        eipClient.releaseTheEipFromTheRecyclingBin(releaseTheEipFromTheRecyclingBinRequest);
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
     * restoreEipInRecycleBin
     *
     */
    @Test
    public void restoreEipInRecycleBinTest() {
        RestoreEipInRecycleBinRequest restoreEipInRecycleBinRequest = new RestoreEipInRecycleBinRequest();
        restoreEipInRecycleBinRequest.setEip("");
        restoreEipInRecycleBinRequest.setClientToken("");
        eipClient.restoreEipInRecycleBin(restoreEipInRecycleBinRequest);
    }
    /**
     * selectiveReleaseOfEip
     *
     */
    @Test
    public void selectiveReleaseOfEipTest() {
        SelectiveReleaseOfEipRequest selectiveReleaseOfEipRequest = new SelectiveReleaseOfEipRequest();
        selectiveReleaseOfEipRequest.setEip("");
        selectiveReleaseOfEipRequest.setReleaseToRecycle(false);
        selectiveReleaseOfEipRequest.setClientToken("");
        eipClient.selectiveReleaseOfEip(selectiveReleaseOfEipRequest);
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
     * turnOffEipAutomaticRenewal
     *
     */
    @Test
    public void turnOffEipAutomaticRenewalTest() {
        TurnOffEipAutomaticRenewalRequest turnOffEipAutomaticRenewalRequest = new TurnOffEipAutomaticRenewalRequest();
        turnOffEipAutomaticRenewalRequest.setClientToken("");
        turnOffEipAutomaticRenewalRequest.setEip("");
        eipClient.turnOffEipAutomaticRenewal(turnOffEipAutomaticRenewalRequest);
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
     * updateEipReleaseProtectionSwitch
     *
     */
    @Test
    public void updateEipReleaseProtectionSwitchTest() {
        UpdateEipReleaseProtectionSwitchRequest updateEipReleaseProtectionSwitchRequest = new UpdateEipReleaseProtectionSwitchRequest();
        updateEipReleaseProtectionSwitchRequest.setEip("");
        updateEipReleaseProtectionSwitchRequest.setClientToken("");
        updateEipReleaseProtectionSwitchRequest.setDeleteProtect(false);
        eipClient.updateEipReleaseProtectionSwitch(updateEipReleaseProtectionSwitchRequest);
    }
}
