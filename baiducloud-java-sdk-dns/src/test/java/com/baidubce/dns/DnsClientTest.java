package com.baidubce.dns;

import com.baidubce.dns.models.AddLineGroupRequest;
import com.baidubce.dns.models.CreatePaidZoneRequest;
import com.baidubce.dns.models.CreateRecordRequest;
import com.baidubce.dns.models.CreateZoneRequest;
import com.baidubce.dns.models.DeleteLineGroupRequest;
import com.baidubce.dns.models.DeleteRecordRequest;
import com.baidubce.dns.models.DeleteZoneRequest;
import com.baidubce.dns.models.ListLineGroupRequest;
import com.baidubce.dns.models.ListLineGroupResponse;
import com.baidubce.dns.models.ListRecordRequest;
import com.baidubce.dns.models.ListRecordResponse;
import com.baidubce.dns.models.ListZoneRequest;
import com.baidubce.dns.models.ListZoneResponse;
import com.baidubce.dns.models.RenewZoneRequest;
import com.baidubce.dns.models.UpdateLineGroupRequest;
import com.baidubce.dns.models.UpdateRecordDisableRequest;
import com.baidubce.dns.models.UpdateRecordEnableRequest;
import com.baidubce.dns.models.UpdateRecordRequest;
import com.baidubce.dns.models.UpgradeZoneRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for DnsClient
 */
public class DnsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private DnsClient dnsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        dnsClient = new DnsClient(config);
    }

    /**
     * addLineGroup
     *
     */
    @Test
    public void addLineGroupTest() {
        AddLineGroupRequest addLineGroupRequest = new AddLineGroupRequest();
        addLineGroupRequest.setClientToken("");
        addLineGroupRequest.setName("");
        addLineGroupRequest.setLines(new ArrayList<>());
        dnsClient.addLineGroup(addLineGroupRequest);
    }
    /**
     * createPaidZone
     *
     */
    @Test
    public void createPaidZoneTest() {
        CreatePaidZoneRequest createPaidZoneRequest = new CreatePaidZoneRequest();
        createPaidZoneRequest.setClientToken("");
        createPaidZoneRequest.setNames(new ArrayList<>());
        createPaidZoneRequest.setProductVersion("");
        createPaidZoneRequest.setBilling(null);
        dnsClient.createPaidZone(createPaidZoneRequest);
    }
    /**
     * createRecord
     *
     */
    @Test
    public void createRecordTest() {
        CreateRecordRequest createRecordRequest = new CreateRecordRequest();
        createRecordRequest.setZoneName("");
        createRecordRequest.setClientToken("");
        createRecordRequest.setRr("");
        createRecordRequest.setType("");
        createRecordRequest.setValue("");
        createRecordRequest.setTtl(0);
        createRecordRequest.setLine("");
        createRecordRequest.setDescription("");
        createRecordRequest.setPriority(0);
        dnsClient.createRecord(createRecordRequest);
    }
    /**
     * createZone
     *
     */
    @Test
    public void createZoneTest() {
        CreateZoneRequest createZoneRequest = new CreateZoneRequest();
        createZoneRequest.setClientToken("");
        createZoneRequest.setName("");
        dnsClient.createZone(createZoneRequest);
    }
    /**
     * deleteLineGroup
     *
     */
    @Test
    public void deleteLineGroupTest() {
        DeleteLineGroupRequest deleteLineGroupRequest = new DeleteLineGroupRequest();
        deleteLineGroupRequest.setLineId("");
        deleteLineGroupRequest.setClientToken("");
        dnsClient.deleteLineGroup(deleteLineGroupRequest);
    }
    /**
     * deleteRecord
     *
     */
    @Test
    public void deleteRecordTest() {
        DeleteRecordRequest deleteRecordRequest = new DeleteRecordRequest();
        deleteRecordRequest.setZoneName("");
        deleteRecordRequest.setRecordId("");
        deleteRecordRequest.setClientToken("");
        dnsClient.deleteRecord(deleteRecordRequest);
    }
    /**
     * deleteZone
     *
     */
    @Test
    public void deleteZoneTest() {
        DeleteZoneRequest deleteZoneRequest = new DeleteZoneRequest();
        deleteZoneRequest.setZoneName("");
        deleteZoneRequest.setClientToken("");
        dnsClient.deleteZone(deleteZoneRequest);
    }
    /**
     * listLineGroup
     *
     */
    @Test
    public void listLineGroupTest() {
        ListLineGroupRequest listLineGroupRequest = new ListLineGroupRequest();
        listLineGroupRequest.setMarker("");
        listLineGroupRequest.setMaxKeys(0);
        ListLineGroupResponse response = dnsClient.listLineGroup(listLineGroupRequest);
        System.out.println(response);
    }
    /**
     * listRecord
     *
     */
    @Test
    public void listRecordTest() {
        ListRecordRequest listRecordRequest = new ListRecordRequest();
        listRecordRequest.setZoneName("");
        listRecordRequest.setRr("");
        listRecordRequest.setId("");
        listRecordRequest.setMarker("");
        listRecordRequest.setMaxKeys(0);
        ListRecordResponse response = dnsClient.listRecord(listRecordRequest);
        System.out.println(response);
    }
    /**
     * listZone
     *
     */
    @Test
    public void listZoneTest() {
        ListZoneRequest listZoneRequest = new ListZoneRequest();
        listZoneRequest.setName("");
        listZoneRequest.setMarker("");
        listZoneRequest.setMaxKeys(0);
        ListZoneResponse response = dnsClient.listZone(listZoneRequest);
        System.out.println(response);
    }
    /**
     * renewZone
     *
     */
    @Test
    public void renewZoneTest() {
        RenewZoneRequest renewZoneRequest = new RenewZoneRequest();
        renewZoneRequest.setName("");
        renewZoneRequest.setAction("");
        renewZoneRequest.setClientToken("");
        renewZoneRequest.setBilling(null);
        dnsClient.renewZone(renewZoneRequest);
    }
    /**
     * updateLineGroup
     *
     */
    @Test
    public void updateLineGroupTest() {
        UpdateLineGroupRequest updateLineGroupRequest = new UpdateLineGroupRequest();
        updateLineGroupRequest.setLineId(0);
        updateLineGroupRequest.setClientToken("");
        updateLineGroupRequest.setName("");
        updateLineGroupRequest.setLines(new ArrayList<>());
        dnsClient.updateLineGroup(updateLineGroupRequest);
    }
    /**
     * updateRecord
     *
     */
    @Test
    public void updateRecordTest() {
        UpdateRecordRequest updateRecordRequest = new UpdateRecordRequest();
        updateRecordRequest.setZoneName("");
        updateRecordRequest.setRecordId("");
        updateRecordRequest.setClientToken("");
        updateRecordRequest.setRr("");
        updateRecordRequest.setType("");
        updateRecordRequest.setValue("");
        updateRecordRequest.setTtl(0);
        updateRecordRequest.setDescription("");
        updateRecordRequest.setPriority(0);
        dnsClient.updateRecord(updateRecordRequest);
    }
    /**
     * updateRecordDisable
     *
     */
    @Test
    public void updateRecordDisableTest() {
        UpdateRecordDisableRequest updateRecordDisableRequest = new UpdateRecordDisableRequest();
        updateRecordDisableRequest.setZoneName("");
        updateRecordDisableRequest.setRecordId("");
        updateRecordDisableRequest.setClientToken("");
        dnsClient.updateRecordDisable(updateRecordDisableRequest);
    }
    /**
     * updateRecordEnable
     *
     */
    @Test
    public void updateRecordEnableTest() {
        UpdateRecordEnableRequest updateRecordEnableRequest = new UpdateRecordEnableRequest();
        updateRecordEnableRequest.setZoneName("");
        updateRecordEnableRequest.setRecordId("");
        updateRecordEnableRequest.setClientToken("");
        dnsClient.updateRecordEnable(updateRecordEnableRequest);
    }
    /**
     * upgradeZone
     *
     */
    @Test
    public void upgradeZoneTest() {
        UpgradeZoneRequest upgradeZoneRequest = new UpgradeZoneRequest();
        upgradeZoneRequest.setAction("");
        upgradeZoneRequest.setClientToken("");
        upgradeZoneRequest.setNames(new ArrayList<>());
        upgradeZoneRequest.setBilling(null);
        dnsClient.upgradeZone(upgradeZoneRequest);
    }
}
