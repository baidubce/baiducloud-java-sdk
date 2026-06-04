package com.baidubce.privatezone;

import com.baidubce.privatezone.models.AddRecordRequest;
import com.baidubce.privatezone.models.AddRecordResponse;
import com.baidubce.privatezone.models.BindVpcRequest;
import com.baidubce.privatezone.models.BindVpcToRuleRequest;
import com.baidubce.privatezone.models.CreatePrivateZoneRequest;
import com.baidubce.privatezone.models.CreatePrivateZoneResponse;
import com.baidubce.privatezone.models.CreateResolverRequest;
import com.baidubce.privatezone.models.CreateResolverResponse;
import com.baidubce.privatezone.models.CreateResolverRuleRequest;
import com.baidubce.privatezone.models.CreateResolverRuleResponse;
import com.baidubce.privatezone.models.DeletePrivateZoneRequest;
import com.baidubce.privatezone.models.DeleteRecordRequest;
import com.baidubce.privatezone.models.DeleteResolverRequest;
import com.baidubce.privatezone.models.DeleteResolverRuleRequest;
import com.baidubce.privatezone.models.DisableRecordRequest;
import com.baidubce.privatezone.models.EnableRecordRequest;
import com.baidubce.privatezone.models.GetDnsResolverDetailRequest;
import com.baidubce.privatezone.models.GetDnsResolverDetailResponse;
import com.baidubce.privatezone.models.GetDnsResolverListRequest;
import com.baidubce.privatezone.models.GetDnsResolverListResponse;
import com.baidubce.privatezone.models.GetDnsResolverRuleDetailRequest;
import com.baidubce.privatezone.models.GetDnsResolverRuleDetailResponse;
import com.baidubce.privatezone.models.GetDnsResolverRuleListRequest;
import com.baidubce.privatezone.models.GetDnsResolverRuleListResponse;
import com.baidubce.privatezone.models.GetPrivateZoneRequest;
import com.baidubce.privatezone.models.GetPrivateZoneResponse;
import com.baidubce.privatezone.models.ListPrivateZoneRequest;
import com.baidubce.privatezone.models.ListPrivateZoneResponse;
import com.baidubce.privatezone.models.ListRecordRequest;
import com.baidubce.privatezone.models.ListRecordResponse;
import com.baidubce.privatezone.models.UnbindVpcRequest;
import com.baidubce.privatezone.models.UnbindVpcToRuleRequest;
import com.baidubce.privatezone.models.UpdateDnsParserRequest;
import com.baidubce.privatezone.models.UpdateRecordRequest;
import com.baidubce.privatezone.models.UpdateResolverRuleRequest;
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
     * bindVpcToRule
     *
     */
    @Test
    public void bindVpcToRuleTest() {
        BindVpcToRuleRequest bindVpcToRuleRequest = new BindVpcToRuleRequest();
        bindVpcToRuleRequest.setRuleId("");
        bindVpcToRuleRequest.setClienToken("");
        bindVpcToRuleRequest.setVpcRegions(new ArrayList<>());
        privatezoneClient.bindVpcToRule(bindVpcToRuleRequest);
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
     * createResolver
     *
     */
    @Test
    public void createResolverTest() {
        CreateResolverRequest createResolverRequest = new CreateResolverRequest();
        createResolverRequest.setClientToken("");
        createResolverRequest.setName("");
        createResolverRequest.setDescription("");
        createResolverRequest.setVpcId("");
        createResolverRequest.setVpcRegion("");
        createResolverRequest.setIpModels(new ArrayList<>());
        createResolverRequest.setType("");
        CreateResolverResponse response = privatezoneClient.createResolver(createResolverRequest);
        System.out.println(response);
    }
    /**
     * createResolverRule
     *
     */
    @Test
    public void createResolverRuleTest() {
        CreateResolverRuleRequest createResolverRuleRequest = new CreateResolverRuleRequest();
        createResolverRuleRequest.setClientToken("");
        createResolverRuleRequest.setName("");
        createResolverRuleRequest.setDescription("");
        createResolverRuleRequest.setZone("");
        createResolverRuleRequest.setResolverId("");
        createResolverRuleRequest.setDnsServerConfigs(new ArrayList<>());
        CreateResolverRuleResponse response = privatezoneClient.createResolverRule(createResolverRuleRequest);
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
     * deleteResolver
     *
     */
    @Test
    public void deleteResolverTest() {
        DeleteResolverRequest deleteResolverRequest = new DeleteResolverRequest();
        deleteResolverRequest.setResolverId("");
        deleteResolverRequest.setClientToken("");
        privatezoneClient.deleteResolver(deleteResolverRequest);
    }
    /**
     * deleteResolverRule
     *
     */
    @Test
    public void deleteResolverRuleTest() {
        DeleteResolverRuleRequest deleteResolverRuleRequest = new DeleteResolverRuleRequest();
        deleteResolverRuleRequest.setRuleId("");
        deleteResolverRuleRequest.setClientToken("");
        privatezoneClient.deleteResolverRule(deleteResolverRuleRequest);
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
        enableRecordRequest.setClientToken("");
        privatezoneClient.enableRecord(enableRecordRequest);
    }
    /**
     * getDnsResolverDetail
     *
     */
    @Test
    public void getDnsResolverDetailTest() {
        GetDnsResolverDetailRequest getDnsResolverDetailRequest = new GetDnsResolverDetailRequest();
        getDnsResolverDetailRequest.setResolverId("");
        GetDnsResolverDetailResponse response = privatezoneClient.getDnsResolverDetail(getDnsResolverDetailRequest);
        System.out.println(response);
    }
    /**
     * getDnsResolverList
     *
     */
    @Test
    public void getDnsResolverListTest() {
        GetDnsResolverListRequest getDnsResolverListRequest = new GetDnsResolverListRequest();
        getDnsResolverListRequest.setMarker("");
        getDnsResolverListRequest.setMaxKeys("");
        getDnsResolverListRequest.setStatus("");
        GetDnsResolverListResponse response = privatezoneClient.getDnsResolverList(getDnsResolverListRequest);
        System.out.println(response);
    }
    /**
     * getDnsResolverRuleDetail
     *
     */
    @Test
    public void getDnsResolverRuleDetailTest() {
        GetDnsResolverRuleDetailRequest getDnsResolverRuleDetailRequest = new GetDnsResolverRuleDetailRequest();
        getDnsResolverRuleDetailRequest.setRuleId("");
        GetDnsResolverRuleDetailResponse response = privatezoneClient.getDnsResolverRuleDetail(getDnsResolverRuleDetailRequest);
        System.out.println(response);
    }
    /**
     * getDnsResolverRuleList
     *
     */
    @Test
    public void getDnsResolverRuleListTest() {
        GetDnsResolverRuleListRequest getDnsResolverRuleListRequest = new GetDnsResolverRuleListRequest();
        getDnsResolverRuleListRequest.setMarker("");
        getDnsResolverRuleListRequest.setMaxKeys("");
        getDnsResolverRuleListRequest.setStatus("");
        GetDnsResolverRuleListResponse response = privatezoneClient.getDnsResolverRuleList(getDnsResolverRuleListRequest);
        System.out.println(response);
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
        unbindVpcRequest.setClientToken("");
        unbindVpcRequest.setRegion("");
        unbindVpcRequest.setVpcIds(new ArrayList<>());
        privatezoneClient.unbindVpc(unbindVpcRequest);
    }
    /**
     * unbindVpcToRule
     *
     */
    @Test
    public void unbindVpcToRuleTest() {
        UnbindVpcToRuleRequest unbindVpcToRuleRequest = new UnbindVpcToRuleRequest();
        unbindVpcToRuleRequest.setRuleId("");
        unbindVpcToRuleRequest.setClienToken("");
        unbindVpcToRuleRequest.setVpcRegions(new ArrayList<>());
        privatezoneClient.unbindVpcToRule(unbindVpcToRuleRequest);
    }
    /**
     * updateDnsParser
     *
     */
    @Test
    public void updateDnsParserTest() {
        UpdateDnsParserRequest updateDnsParserRequest = new UpdateDnsParserRequest();
        updateDnsParserRequest.setResolverId("");
        updateDnsParserRequest.setClientToken("");
        updateDnsParserRequest.setName("");
        updateDnsParserRequest.setDescription("");
        privatezoneClient.updateDnsParser(updateDnsParserRequest);
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
    /**
     * updateResolverRule
     *
     */
    @Test
    public void updateResolverRuleTest() {
        UpdateResolverRuleRequest updateResolverRuleRequest = new UpdateResolverRuleRequest();
        updateResolverRuleRequest.setReluId("");
        updateResolverRuleRequest.setClientToken("");
        updateResolverRuleRequest.setName("");
        updateResolverRuleRequest.setDescription("");
        updateResolverRuleRequest.setDnsServerConfigs(new ArrayList<>());
        privatezoneClient.updateResolverRule(updateResolverRuleRequest);
    }
}
