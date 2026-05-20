package com.baidubce.dns;

import com.baidubce.dns.models.AddDomainNameRequest;
import com.baidubce.dns.models.AddLineGroupRequest;
import com.baidubce.dns.models.AddParsingRecordsRequest;
import com.baidubce.dns.models.DeleteLineGroupRequest;
import com.baidubce.dns.models.DeleteParsingRecordsRequest;
import com.baidubce.dns.models.DomainNameRenewalRequest;
import com.baidubce.dns.models.ModifyParsingRecordsRequest;
import com.baidubce.dns.models.ModifyTheParsingRecordStatusRequest;
import com.baidubce.dns.models.PurchaseAPaidDomainNameRequest;
import com.baidubce.dns.models.QueryAndParseRecordListRequest;
import com.baidubce.dns.models.QueryAndParseRecordListResponse;
import com.baidubce.dns.models.QueryDomainNameListRequest;
import com.baidubce.dns.models.QueryDomainNameListResponse;
import com.baidubce.dns.models.QueryTheListOfLineGroupsRequest;
import com.baidubce.dns.models.QueryTheListOfLineGroupsResponse;
import com.baidubce.dns.models.RemoveDomainNameRequest;
import com.baidubce.dns.models.UpdateLineGroupRequest;
import com.baidubce.dns.models.UpgradeTheFreeDomainNameToTheUniversalVersionRequest;
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
     * addDomainName
     *
     */
    @Test
    public void addDomainNameTest() {
        AddDomainNameRequest addDomainNameRequest = new AddDomainNameRequest();
        addDomainNameRequest.setClientToken("");
        addDomainNameRequest.setName("");
        dnsClient.addDomainName(addDomainNameRequest);
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
     * addParsingRecords
     *
     */
    @Test
    public void addParsingRecordsTest() {
        AddParsingRecordsRequest addParsingRecordsRequest = new AddParsingRecordsRequest();
        addParsingRecordsRequest.setZoneName("");
        addParsingRecordsRequest.setClientToken("");
        addParsingRecordsRequest.setRr("");
        addParsingRecordsRequest.setType("");
        addParsingRecordsRequest.setValue("");
        addParsingRecordsRequest.setTtl(0);
        addParsingRecordsRequest.setLine("");
        addParsingRecordsRequest.setDescription("");
        addParsingRecordsRequest.setPriority(0);
        dnsClient.addParsingRecords(addParsingRecordsRequest);
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
     * deleteParsingRecords
     *
     */
    @Test
    public void deleteParsingRecordsTest() {
        DeleteParsingRecordsRequest deleteParsingRecordsRequest = new DeleteParsingRecordsRequest();
        deleteParsingRecordsRequest.setZoneName("");
        deleteParsingRecordsRequest.setRecordId("");
        deleteParsingRecordsRequest.setClientToken("");
        dnsClient.deleteParsingRecords(deleteParsingRecordsRequest);
    }
    /**
     * domainNameRenewal
     *
     */
    @Test
    public void domainNameRenewalTest() {
        DomainNameRenewalRequest domainNameRenewalRequest = new DomainNameRenewalRequest();
        domainNameRenewalRequest.setName("");
        domainNameRenewalRequest.setAction("");
        domainNameRenewalRequest.setClientToken("");
        domainNameRenewalRequest.setBilling(new ArrayList<>());
        dnsClient.domainNameRenewal(domainNameRenewalRequest);
    }
    /**
     * modifyParsingRecords
     *
     */
    @Test
    public void modifyParsingRecordsTest() {
        ModifyParsingRecordsRequest modifyParsingRecordsRequest = new ModifyParsingRecordsRequest();
        modifyParsingRecordsRequest.setZoneName("");
        modifyParsingRecordsRequest.setRecordId("");
        modifyParsingRecordsRequest.setClientToken("");
        modifyParsingRecordsRequest.setRr("");
        modifyParsingRecordsRequest.setType("");
        modifyParsingRecordsRequest.setValue("");
        modifyParsingRecordsRequest.setTtl(0);
        modifyParsingRecordsRequest.setDescription("");
        modifyParsingRecordsRequest.setPriority(0);
        dnsClient.modifyParsingRecords(modifyParsingRecordsRequest);
    }
    /**
     * modifyTheParsingRecordStatus
     *
     */
    @Test
    public void modifyTheParsingRecordStatusTest() {
        ModifyTheParsingRecordStatusRequest modifyTheParsingRecordStatusRequest = new ModifyTheParsingRecordStatusRequest();
        modifyTheParsingRecordStatusRequest.setZoneName("");
        modifyTheParsingRecordStatusRequest.setRecordId("");
        modifyTheParsingRecordStatusRequest.setAction("");
        modifyTheParsingRecordStatusRequest.setClientToken("");
        dnsClient.modifyTheParsingRecordStatus(modifyTheParsingRecordStatusRequest);
    }
    /**
     * purchaseAPaidDomainName
     *
     */
    @Test
    public void purchaseAPaidDomainNameTest() {
        PurchaseAPaidDomainNameRequest purchaseAPaidDomainNameRequest = new PurchaseAPaidDomainNameRequest();
        purchaseAPaidDomainNameRequest.setClientToken("");
        purchaseAPaidDomainNameRequest.setNames(new ArrayList<>());
        purchaseAPaidDomainNameRequest.setProductVersion("");
        purchaseAPaidDomainNameRequest.setBilling(new ArrayList<>());
        dnsClient.purchaseAPaidDomainName(purchaseAPaidDomainNameRequest);
    }
    /**
     * queryAndParseRecordList
     *
     */
    @Test
    public void queryAndParseRecordListTest() {
        QueryAndParseRecordListRequest queryAndParseRecordListRequest = new QueryAndParseRecordListRequest();
        queryAndParseRecordListRequest.setZoneName("");
        queryAndParseRecordListRequest.setRr("");
        queryAndParseRecordListRequest.setId("");
        queryAndParseRecordListRequest.setMarker("");
        queryAndParseRecordListRequest.setMaxKeys(0);
        QueryAndParseRecordListResponse response = dnsClient.queryAndParseRecordList(queryAndParseRecordListRequest);
        System.out.println(response);
    }
    /**
     * queryDomainNameList
     *
     */
    @Test
    public void queryDomainNameListTest() {
        QueryDomainNameListRequest queryDomainNameListRequest = new QueryDomainNameListRequest();
        queryDomainNameListRequest.setName("");
        queryDomainNameListRequest.setMarker("");
        queryDomainNameListRequest.setMaxKeys(0);
        QueryDomainNameListResponse response = dnsClient.queryDomainNameList(queryDomainNameListRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfLineGroups
     *
     */
    @Test
    public void queryTheListOfLineGroupsTest() {
        QueryTheListOfLineGroupsRequest queryTheListOfLineGroupsRequest = new QueryTheListOfLineGroupsRequest();
        queryTheListOfLineGroupsRequest.setMarker("");
        queryTheListOfLineGroupsRequest.setMaxKeys(0);
        QueryTheListOfLineGroupsResponse response = dnsClient.queryTheListOfLineGroups(queryTheListOfLineGroupsRequest);
        System.out.println(response);
    }
    /**
     * removeDomainName
     *
     */
    @Test
    public void removeDomainNameTest() {
        RemoveDomainNameRequest removeDomainNameRequest = new RemoveDomainNameRequest();
        removeDomainNameRequest.setZoneName("");
        removeDomainNameRequest.setClientToken("");
        dnsClient.removeDomainName(removeDomainNameRequest);
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
     * upgradeTheFreeDomainNameToTheUniversalVersion
     *
     */
    @Test
    public void upgradeTheFreeDomainNameToTheUniversalVersionTest() {
        UpgradeTheFreeDomainNameToTheUniversalVersionRequest upgradeTheFreeDomainNameToTheUniversalVersionRequest = new UpgradeTheFreeDomainNameToTheUniversalVersionRequest();
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setAction("");
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setClientToken("");
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setNames(new ArrayList<>());
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setBilling(new ArrayList<>());
        dnsClient.upgradeTheFreeDomainNameToTheUniversalVersion(upgradeTheFreeDomainNameToTheUniversalVersionRequest);
    }
}
