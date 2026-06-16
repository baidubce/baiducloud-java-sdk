package com.baidubce.cfw;

import com.baidubce.cfw.models.BindCfwRequest;
import com.baidubce.cfw.models.CreateCfwRequest;
import com.baidubce.cfw.models.CreateCfwResponse;
import com.baidubce.cfw.models.CreateCfwRuleRequest;
import com.baidubce.cfw.models.CreateStatelessCfwRequest;
import com.baidubce.cfw.models.CreateStatelessCfwResponse;
import com.baidubce.cfw.models.DeleteCfwRequest;
import com.baidubce.cfw.models.DeleteCfwRuleRequest;
import com.baidubce.cfw.models.DisableCfwProtectRequest;
import com.baidubce.cfw.models.EnableCfwProtectRequest;
import com.baidubce.cfw.models.GetCfwRequest;
import com.baidubce.cfw.models.GetCfwResponse;
import com.baidubce.cfw.models.GetStatelessCfwRequest;
import com.baidubce.cfw.models.GetStatelessCfwResponse;
import com.baidubce.cfw.models.ListCfwRequest;
import com.baidubce.cfw.models.ListCfwResponse;
import com.baidubce.cfw.models.ListProtectInstancesRequest;
import com.baidubce.cfw.models.ListProtectInstancesResponse;
import com.baidubce.cfw.models.ListStatelessCfwResponse;
import com.baidubce.cfw.models.UnbindCfwRequest;
import com.baidubce.cfw.models.UpdateCfwRequest;
import com.baidubce.cfw.models.UpdateCfwRuleRequest;
import com.baidubce.cfw.models.UpdateStatelessCfwRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for CfwClient
 */
public class CfwClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CfwClient cfwClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        cfwClient = new CfwClient(config);
    }

    /**
     * bindCfw
     *
     */
    @Test
    public void bindCfwTest() {
        BindCfwRequest bindCfwRequest = new BindCfwRequest();
        bindCfwRequest.setCfwId("");
        bindCfwRequest.setInstanceType("");
        bindCfwRequest.setInstances(new ArrayList<>());
        cfwClient.bindCfw(bindCfwRequest);
    }
    /**
     * createCfw
     *
     */
    @Test
    public void createCfwTest() {
        CreateCfwRequest createCfwRequest = new CreateCfwRequest();
        createCfwRequest.setName("");
        createCfwRequest.setType(0);
        createCfwRequest.setBorder(0);
        createCfwRequest.setDescription("");
        createCfwRequest.setCfwRules(new ArrayList<>());
        CreateCfwResponse response = cfwClient.createCfw(createCfwRequest);
        System.out.println(response);
    }
    /**
     * createCfwRule
     *
     */
    @Test
    public void createCfwRuleTest() {
        CreateCfwRuleRequest createCfwRuleRequest = new CreateCfwRuleRequest();
        createCfwRuleRequest.setCfwId("");
        createCfwRuleRequest.setCfwRules(new ArrayList<>());
        cfwClient.createCfwRule(createCfwRuleRequest);
    }
    /**
     * createStatelessCfw
     *
     */
    @Test
    public void createStatelessCfwTest() {
        CreateStatelessCfwRequest createStatelessCfwRequest = new CreateStatelessCfwRequest();
        createStatelessCfwRequest.setName("");
        createStatelessCfwRequest.setDescription("");
        createStatelessCfwRequest.setDefaultAction("");
        createStatelessCfwRequest.setProtocol("");
        createStatelessCfwRequest.setIpList(new ArrayList<>());
        CreateStatelessCfwResponse response = cfwClient.createStatelessCfw(createStatelessCfwRequest);
        System.out.println(response);
    }
    /**
     * deleteCfw
     *
     */
    @Test
    public void deleteCfwTest() {
        DeleteCfwRequest deleteCfwRequest = new DeleteCfwRequest();
        deleteCfwRequest.setCfwId("");
        cfwClient.deleteCfw(deleteCfwRequest);
    }
    /**
     * deleteCfwRule
     *
     */
    @Test
    public void deleteCfwRuleTest() {
        DeleteCfwRuleRequest deleteCfwRuleRequest = new DeleteCfwRuleRequest();
        deleteCfwRuleRequest.setCfwId("");
        deleteCfwRuleRequest.setCfwRuleIds(new ArrayList<>());
        cfwClient.deleteCfwRule(deleteCfwRuleRequest);
    }
    /**
     * disableCfwProtect
     *
     */
    @Test
    public void disableCfwProtectTest() {
        DisableCfwProtectRequest disableCfwProtectRequest = new DisableCfwProtectRequest();
        disableCfwProtectRequest.setCfwId("");
        disableCfwProtectRequest.setInstanceId("");
        disableCfwProtectRequest.setRole("");
        disableCfwProtectRequest.setMemberId("");
        cfwClient.disableCfwProtect(disableCfwProtectRequest);
    }
    /**
     * enableCfwProtect
     *
     */
    @Test
    public void enableCfwProtectTest() {
        EnableCfwProtectRequest enableCfwProtectRequest = new EnableCfwProtectRequest();
        enableCfwProtectRequest.setCfwId("");
        enableCfwProtectRequest.setInstanceId("");
        enableCfwProtectRequest.setRole("");
        enableCfwProtectRequest.setMemberId("");
        cfwClient.enableCfwProtect(enableCfwProtectRequest);
    }
    /**
     * getCfw
     *
     */
    @Test
    public void getCfwTest() {
        GetCfwRequest getCfwRequest = new GetCfwRequest();
        getCfwRequest.setCfwId("");
        GetCfwResponse response = cfwClient.getCfw(getCfwRequest);
        System.out.println(response);
    }
    /**
     * getStatelessCfw
     *
     */
    @Test
    public void getStatelessCfwTest() {
        GetStatelessCfwRequest getStatelessCfwRequest = new GetStatelessCfwRequest();
        getStatelessCfwRequest.setCfwId("");
        GetStatelessCfwResponse response = cfwClient.getStatelessCfw(getStatelessCfwRequest);
        System.out.println(response);
    }
    /**
     * listCfw
     *
     */
    @Test
    public void listCfwTest() {
        ListCfwRequest listCfwRequest = new ListCfwRequest();
        listCfwRequest.setMarker("");
        listCfwRequest.setMaxKeys(0);
        ListCfwResponse response = cfwClient.listCfw(listCfwRequest);
        System.out.println(response);
    }
    /**
     * listProtectInstances
     *
     */
    @Test
    public void listProtectInstancesTest() {
        ListProtectInstancesRequest listProtectInstancesRequest = new ListProtectInstancesRequest();
        listProtectInstancesRequest.setInstanceType("");
        listProtectInstancesRequest.setMarker("");
        listProtectInstancesRequest.setMaxKeys(0);
        listProtectInstancesRequest.setStatus("");
        listProtectInstancesRequest.setRegion("");
        ListProtectInstancesResponse response = cfwClient.listProtectInstances(listProtectInstancesRequest);
        System.out.println(response);
    }
    /**
     * listStatelessCfw
     *
     */
    @Test
    public void listStatelessCfwTest() {
        ListStatelessCfwResponse response = cfwClient.listStatelessCfw();
        System.out.println(response);
    }
    /**
     * unbindCfw
     *
     */
    @Test
    public void unbindCfwTest() {
        UnbindCfwRequest unbindCfwRequest = new UnbindCfwRequest();
        unbindCfwRequest.setCfwId("");
        unbindCfwRequest.setInstanceType("");
        unbindCfwRequest.setInstances(new ArrayList<>());
        cfwClient.unbindCfw(unbindCfwRequest);
    }
    /**
     * updateCfw
     *
     */
    @Test
    public void updateCfwTest() {
        UpdateCfwRequest updateCfwRequest = new UpdateCfwRequest();
        updateCfwRequest.setCfwId("");
        updateCfwRequest.setName("");
        updateCfwRequest.setDescription("");
        cfwClient.updateCfw(updateCfwRequest);
    }
    /**
     * updateCfwRule
     *
     */
    @Test
    public void updateCfwRuleTest() {
        UpdateCfwRuleRequest updateCfwRuleRequest = new UpdateCfwRuleRequest();
        updateCfwRuleRequest.setCfwId("");
        updateCfwRuleRequest.setCfwRuleId("");
        updateCfwRuleRequest.setIpVersion(0);
        updateCfwRuleRequest.setPriority(0);
        updateCfwRuleRequest.setProtocol("");
        updateCfwRuleRequest.setDirection("");
        updateCfwRuleRequest.setSourceAddress("");
        updateCfwRuleRequest.setDestAddress("");
        updateCfwRuleRequest.setSourcePort("");
        updateCfwRuleRequest.setDestPort("");
        updateCfwRuleRequest.setAction("");
        updateCfwRuleRequest.setDescription("");
        cfwClient.updateCfwRule(updateCfwRuleRequest);
    }
    /**
     * updateStatelessCfw
     *
     */
    @Test
    public void updateStatelessCfwTest() {
        UpdateStatelessCfwRequest updateStatelessCfwRequest = new UpdateStatelessCfwRequest();
        updateStatelessCfwRequest.setCfwId("");
        updateStatelessCfwRequest.setName("");
        updateStatelessCfwRequest.setDescription("");
        updateStatelessCfwRequest.setProtocol("");
        updateStatelessCfwRequest.setIpList(new ArrayList<>());
        cfwClient.updateStatelessCfw(updateStatelessCfwRequest);
    }
}
