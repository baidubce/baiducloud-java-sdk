

package com.baidubce.eip;

import com.baidubce.eip.models.AddTbspAreaBlockingRequest;
import com.baidubce.eip.models.AddTbspIpWhitelistRequest;
import com.baidubce.eip.models.AddTbspProtocolBlockingRequest;
import com.baidubce.eip.models.BandwidthPackageInquiryRequest;
import com.baidubce.eip.models.BandwidthPackageInquiryResponse;
import com.baidubce.eip.models.BindTbspProtectionObjectRequest;
import com.baidubce.eip.models.CreateTbspRequest;
import com.baidubce.eip.models.CreateTbspResponse;
import com.baidubce.eip.models.DetailTbspRequest;
import com.baidubce.eip.models.DetailTbspResponse;
import com.baidubce.eip.models.DisableTbspIpCleanRequest;
import com.baidubce.eip.models.EipInquiryRequest;
import com.baidubce.eip.models.EipInquiryResponse;
import com.baidubce.eip.models.EnableTbspIpCleanRequest;
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
import com.baidubce.eip.models.RemoveTbspAreaBlockingRequest;
import com.baidubce.eip.models.RemoveTbspIpWhitelistRequest;
import com.baidubce.eip.models.RemoveTbspProtocolBlockingRequest;
import com.baidubce.eip.models.RenewTbspRequest;
import com.baidubce.eip.models.ResizeTbspRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryRequest;
import com.baidubce.eip.models.SharedBandwidthInquiryResponse;
import com.baidubce.eip.models.SharedDataPackageInquiryRequest;
import com.baidubce.eip.models.SharedDataPackageInquiryResponse;
import com.baidubce.eip.models.UnbindTbspProtectionObjectRequest;
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
}
