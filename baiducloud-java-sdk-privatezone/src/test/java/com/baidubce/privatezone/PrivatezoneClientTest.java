package com.baidubce.privatezone;

import com.baidubce.privatezone.models.AddParsingRecordsRequest;
import com.baidubce.privatezone.models.AddParsingRecordsResponse;
import com.baidubce.privatezone.models.AssociateVpcRequest;
import com.baidubce.privatezone.models.CreateAPrivateZoneRequest;
import com.baidubce.privatezone.models.CreateAPrivateZoneResponse;
import com.baidubce.privatezone.models.DeleteParsingRecordsRequest;
import com.baidubce.privatezone.models.DeletePrivateZoneRequest;
import com.baidubce.privatezone.models.DisassociateVpcRequest;
import com.baidubce.privatezone.models.ModifyParsingRecordsRequest;
import com.baidubce.privatezone.models.QueryAndParseRecordListRequest;
import com.baidubce.privatezone.models.QueryAndParseRecordListResponse;
import com.baidubce.privatezone.models.QueryTheListOfPrivateZonesRequest;
import com.baidubce.privatezone.models.QueryTheListOfPrivateZonesResponse;
import com.baidubce.privatezone.models.SearchForDetailsOfPrivatzoneRequest;
import com.baidubce.privatezone.models.SearchForDetailsOfPrivatzoneResponse;
import com.baidubce.privatezone.models.SetParsingRecordStatusRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for PrivatezoneClient
 */
public class PrivatezoneClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private PrivatezoneClient privatezoneClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        privatezoneClient = new PrivatezoneClient(config);
    }

    /**
     * addParsingRecords
     *
     */
    @Test
    public void addParsingRecordsTest() {
        AddParsingRecordsRequest addParsingRecordsRequest = new AddParsingRecordsRequest();
        addParsingRecordsRequest.setZoneId("");
        addParsingRecordsRequest.setClientToken("");
        addParsingRecordsRequest.setRr("");
        addParsingRecordsRequest.setValue("");
        addParsingRecordsRequest.setType("");
        addParsingRecordsRequest.setPriority(0);
        addParsingRecordsRequest.setTtl(0);
        addParsingRecordsRequest.setDescription("");
        AddParsingRecordsResponse response = privatezoneClient.addParsingRecords(addParsingRecordsRequest);
        System.out.println(response);
    }
    /**
     * associateVpc
     *
     */
    @Test
    public void associateVpcTest() {
        AssociateVpcRequest associateVpcRequest = new AssociateVpcRequest();
        associateVpcRequest.setZoneId("");
        associateVpcRequest.setAction("");
        associateVpcRequest.setClientToken("");
        associateVpcRequest.setRegion("");
        associateVpcRequest.setVpcIds(new ArrayList<>());
        privatezoneClient.associateVpc(associateVpcRequest);
    }
    /**
     * createAPrivateZone
     *
     */
    @Test
    public void createAPrivateZoneTest() {
        CreateAPrivateZoneRequest createAPrivateZoneRequest = new CreateAPrivateZoneRequest();
        createAPrivateZoneRequest.setClientToken("");
        createAPrivateZoneRequest.setZoneName("");
        CreateAPrivateZoneResponse response = privatezoneClient.createAPrivateZone(createAPrivateZoneRequest);
        System.out.println(response);
    }
    /**
     * deleteParsingRecords
     *
     */
    @Test
    public void deleteParsingRecordsTest() {
        DeleteParsingRecordsRequest deleteParsingRecordsRequest = new DeleteParsingRecordsRequest();
        deleteParsingRecordsRequest.setRecordId("");
        deleteParsingRecordsRequest.setClientToken("");
        privatezoneClient.deleteParsingRecords(deleteParsingRecordsRequest);
    }
    /**
     * deletePrivateZone
     *
     */
    @Test
    public void deletePrivateZoneTest() {
        DeletePrivateZoneRequest deletePrivateZoneRequest = new DeletePrivateZoneRequest();
        deletePrivateZoneRequest.setZoneId("");
        deletePrivateZoneRequest.setClientToken("");
        privatezoneClient.deletePrivateZone(deletePrivateZoneRequest);
    }
    /**
     * disassociateVpc
     *
     */
    @Test
    public void disassociateVpcTest() {
        DisassociateVpcRequest disassociateVpcRequest = new DisassociateVpcRequest();
        disassociateVpcRequest.setZoneId("");
        disassociateVpcRequest.setAction("");
        disassociateVpcRequest.setClientToken("");
        disassociateVpcRequest.setRegion("");
        disassociateVpcRequest.setVpcIds(new ArrayList<>());
        privatezoneClient.disassociateVpc(disassociateVpcRequest);
    }
    /**
     * modifyParsingRecords
     *
     */
    @Test
    public void modifyParsingRecordsTest() {
        ModifyParsingRecordsRequest modifyParsingRecordsRequest = new ModifyParsingRecordsRequest();
        modifyParsingRecordsRequest.setRecordId("");
        modifyParsingRecordsRequest.setClientToken("");
        modifyParsingRecordsRequest.setRr("");
        modifyParsingRecordsRequest.setValue("");
        modifyParsingRecordsRequest.setType("");
        modifyParsingRecordsRequest.setTtl(0);
        modifyParsingRecordsRequest.setPriority(0);
        modifyParsingRecordsRequest.setDescription("");
        privatezoneClient.modifyParsingRecords(modifyParsingRecordsRequest);
    }
    /**
     * queryAndParseRecordList
     *
     */
    @Test
    public void queryAndParseRecordListTest() {
        QueryAndParseRecordListRequest queryAndParseRecordListRequest = new QueryAndParseRecordListRequest();
        queryAndParseRecordListRequest.setZoneId("");
        queryAndParseRecordListRequest.setMarker("");
        queryAndParseRecordListRequest.setMaxKeys(0);
        queryAndParseRecordListRequest.setRr("");
        queryAndParseRecordListRequest.setSearchMode("");
        queryAndParseRecordListRequest.setType("");
        queryAndParseRecordListRequest.setValue("");
        QueryAndParseRecordListResponse response = privatezoneClient.queryAndParseRecordList(queryAndParseRecordListRequest);
        System.out.println(response);
    }
    /**
     * queryTheListOfPrivateZones
     *
     */
    @Test
    public void queryTheListOfPrivateZonesTest() {
        QueryTheListOfPrivateZonesRequest queryTheListOfPrivateZonesRequest = new QueryTheListOfPrivateZonesRequest();
        queryTheListOfPrivateZonesRequest.setMarker("");
        queryTheListOfPrivateZonesRequest.setMaxKeys(0);
        QueryTheListOfPrivateZonesResponse response = privatezoneClient.queryTheListOfPrivateZones(queryTheListOfPrivateZonesRequest);
        System.out.println(response);
    }
    /**
     * searchForDetailsOfPrivatzone
     *
     */
    @Test
    public void searchForDetailsOfPrivatzoneTest() {
        SearchForDetailsOfPrivatzoneRequest searchForDetailsOfPrivatzoneRequest = new SearchForDetailsOfPrivatzoneRequest();
        searchForDetailsOfPrivatzoneRequest.setZoneId("");
        SearchForDetailsOfPrivatzoneResponse response = privatezoneClient.searchForDetailsOfPrivatzone(searchForDetailsOfPrivatzoneRequest);
        System.out.println(response);
    }
    /**
     * setParsingRecordStatus
     *
     */
    @Test
    public void setParsingRecordStatusTest() {
        SetParsingRecordStatusRequest setParsingRecordStatusRequest = new SetParsingRecordStatusRequest();
        setParsingRecordStatusRequest.setRecordId("");
        setParsingRecordStatusRequest.setAction("");
        setParsingRecordStatusRequest.setClientToken("");
        privatezoneClient.setParsingRecordStatus(setParsingRecordStatusRequest);
    }
}
