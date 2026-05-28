package com.baidubce.privatezone;

import com.baidubce.privatezone.models.AddRecordRequest;
import com.baidubce.privatezone.models.AddRecordResponse;
import com.baidubce.privatezone.models.BindVpcRequest;
import com.baidubce.privatezone.models.CreatePrivateZoneRequest;
import com.baidubce.privatezone.models.CreatePrivateZoneResponse;
import com.baidubce.privatezone.models.DeletePrivateZoneRequest;
import com.baidubce.privatezone.models.DeleteRecordRequest;
import com.baidubce.privatezone.models.DisableRecordRequest;
import com.baidubce.privatezone.models.EnableRecordRequest;
import com.baidubce.privatezone.models.GetPrivateZoneRequest;
import com.baidubce.privatezone.models.GetPrivateZoneResponse;
import com.baidubce.privatezone.models.ListPrivateZoneRequest;
import com.baidubce.privatezone.models.ListPrivateZoneResponse;
import com.baidubce.privatezone.models.ListRecordRequest;
import com.baidubce.privatezone.models.ListRecordResponse;
import com.baidubce.privatezone.models.UnbindVpcRequest;
import com.baidubce.privatezone.models.UpdateRecordRequest;
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
     * addRecord
     *
     */
    @Test
    public void addRecordTest() {
        AddRecordRequest addRecordRequest = new AddRecordRequest();
        addRecordRequest.setZoneId("");
        addRecordRequest.setClientToken("");
        addRecordRequest.setRr("");
        addRecordRequest.setValue("");
        addRecordRequest.setType("");
        addRecordRequest.setPriority(0);
        addRecordRequest.setTtl(0);
        addRecordRequest.setDescription("");
        AddRecordResponse response = privatezoneClient.addRecord(addRecordRequest);
        System.out.println(response);
    }
    /**
     * bindVpc
     *
     */
    @Test
    public void bindVpcTest() {
        BindVpcRequest bindVpcRequest = new BindVpcRequest();
        bindVpcRequest.setZoneId("");
        bindVpcRequest.setClientToken("");
        bindVpcRequest.setRegion("");
        bindVpcRequest.setVpcIds(new ArrayList<>());
        privatezoneClient.bindVpc(bindVpcRequest);
    }
    /**
     * createPrivateZone
     *
     */
    @Test
    public void createPrivateZoneTest() {
        CreatePrivateZoneRequest createPrivateZoneRequest = new CreatePrivateZoneRequest();
        createPrivateZoneRequest.setClientToken("");
        createPrivateZoneRequest.setZoneName("");
        CreatePrivateZoneResponse response = privatezoneClient.createPrivateZone(createPrivateZoneRequest);
        System.out.println(response);
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
     * deleteRecord
     *
     */
    @Test
    public void deleteRecordTest() {
        DeleteRecordRequest deleteRecordRequest = new DeleteRecordRequest();
        deleteRecordRequest.setRecordId("");
        deleteRecordRequest.setClientToken("");
        privatezoneClient.deleteRecord(deleteRecordRequest);
    }
    /**
     * disableRecord
     *
     */
    @Test
    public void disableRecordTest() {
        DisableRecordRequest disableRecordRequest = new DisableRecordRequest();
        disableRecordRequest.setRecordId("");
        disableRecordRequest.setClientToken("");
        privatezoneClient.disableRecord(disableRecordRequest);
    }
    /**
     * enableRecord
     *
     */
    @Test
    public void enableRecordTest() {
        EnableRecordRequest enableRecordRequest = new EnableRecordRequest();
        enableRecordRequest.setRecordId("");
        enableRecordRequest.setAction("");
        enableRecordRequest.setClientToken("");
        privatezoneClient.enableRecord(enableRecordRequest);
    }
    /**
     * getPrivateZone
     *
     */
    @Test
    public void getPrivateZoneTest() {
        GetPrivateZoneRequest getPrivateZoneRequest = new GetPrivateZoneRequest();
        getPrivateZoneRequest.setZoneId("");
        GetPrivateZoneResponse response = privatezoneClient.getPrivateZone(getPrivateZoneRequest);
        System.out.println(response);
    }
    /**
     * listPrivateZone
     *
     */
    @Test
    public void listPrivateZoneTest() {
        ListPrivateZoneRequest listPrivateZoneRequest = new ListPrivateZoneRequest();
        listPrivateZoneRequest.setMarker("");
        listPrivateZoneRequest.setMaxKeys(0);
        ListPrivateZoneResponse response = privatezoneClient.listPrivateZone(listPrivateZoneRequest);
        System.out.println(response);
    }
    /**
     * listRecord
     *
     */
    @Test
    public void listRecordTest() {
        ListRecordRequest listRecordRequest = new ListRecordRequest();
        listRecordRequest.setZoneId("");
        listRecordRequest.setMarker("");
        listRecordRequest.setMaxKeys(0);
        listRecordRequest.setRr("");
        listRecordRequest.setSearchMode("");
        listRecordRequest.setType("");
        listRecordRequest.setValue("");
        ListRecordResponse response = privatezoneClient.listRecord(listRecordRequest);
        System.out.println(response);
    }
    /**
     * unbindVpc
     *
     */
    @Test
    public void unbindVpcTest() {
        UnbindVpcRequest unbindVpcRequest = new UnbindVpcRequest();
        unbindVpcRequest.setZoneId("");
        unbindVpcRequest.setAction("");
        unbindVpcRequest.setClientToken("");
        unbindVpcRequest.setRegion("");
        unbindVpcRequest.setVpcIds(new ArrayList<>());
        privatezoneClient.unbindVpc(unbindVpcRequest);
    }
    /**
     * updateRecord
     *
     */
    @Test
    public void updateRecordTest() {
        UpdateRecordRequest updateRecordRequest = new UpdateRecordRequest();
        updateRecordRequest.setRecordId("");
        updateRecordRequest.setClientToken("");
        updateRecordRequest.setRr("");
        updateRecordRequest.setValue("");
        updateRecordRequest.setType("");
        updateRecordRequest.setTtl(0);
        updateRecordRequest.setPriority(0);
        updateRecordRequest.setDescription("");
        privatezoneClient.updateRecord(updateRecordRequest);
    }
}
