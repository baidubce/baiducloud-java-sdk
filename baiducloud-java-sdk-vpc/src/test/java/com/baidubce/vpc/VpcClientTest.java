package com.baidubce.vpc;

import com.baidubce.vpc.models.CreateGatewayLimitRulesRequest;
import com.baidubce.vpc.models.CreateGatewayLimitRulesResponse;
import com.baidubce.vpc.models.DeleteGatewayLimitRuleRequest;
import com.baidubce.vpc.models.ModifyGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ViewGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ViewGatewayLimitRulesResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;

/**
 * API tests for VpcClient
 */
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

    /**
     * createGatewayLimitRules
     *
     */
    @Test
    public void createGatewayLimitRulesTest() {
        CreateGatewayLimitRulesRequest createGatewayLimitRulesRequest = new CreateGatewayLimitRulesRequest();
        createGatewayLimitRulesRequest.setClientToken("");
        createGatewayLimitRulesRequest.setIpVersion("");
        createGatewayLimitRulesRequest.setName("");
        createGatewayLimitRulesRequest.setDescription("");
        createGatewayLimitRulesRequest.setServiceType("");
        createGatewayLimitRulesRequest.setSubServiceType("");
        createGatewayLimitRulesRequest.setPeerRegion("");
        createGatewayLimitRulesRequest.setResourceId("");
        createGatewayLimitRulesRequest.setDirection("");
        createGatewayLimitRulesRequest.setCidr("");
        createGatewayLimitRulesRequest.setBandwidth(0);
        CreateGatewayLimitRulesResponse response = vpcClient.createGatewayLimitRules(createGatewayLimitRulesRequest);
        System.out.println(response);
    }
    /**
     * deleteGatewayLimitRule
     *
     */
    @Test
    public void deleteGatewayLimitRuleTest() {
        DeleteGatewayLimitRuleRequest deleteGatewayLimitRuleRequest = new DeleteGatewayLimitRuleRequest();
        deleteGatewayLimitRuleRequest.setGlrId("");
        deleteGatewayLimitRuleRequest.setClientToken("");
        vpcClient.deleteGatewayLimitRule(deleteGatewayLimitRuleRequest);
    }
    /**
     * modifyGatewayLimitRules
     *
     */
    @Test
    public void modifyGatewayLimitRulesTest() {
        ModifyGatewayLimitRulesRequest modifyGatewayLimitRulesRequest = new ModifyGatewayLimitRulesRequest();
        modifyGatewayLimitRulesRequest.setGlrId("");
        modifyGatewayLimitRulesRequest.setClientToken("");
        modifyGatewayLimitRulesRequest.setName("");
        modifyGatewayLimitRulesRequest.setDescription("");
        modifyGatewayLimitRulesRequest.setBandwidth(0);
        vpcClient.modifyGatewayLimitRules(modifyGatewayLimitRulesRequest);
    }
    /**
     * viewGatewayLimitRules
     *
     */
    @Test
    public void viewGatewayLimitRulesTest() {
        ViewGatewayLimitRulesRequest viewGatewayLimitRulesRequest = new ViewGatewayLimitRulesRequest();
        viewGatewayLimitRulesRequest.setServiceType("");
        viewGatewayLimitRulesRequest.setName("");
        viewGatewayLimitRulesRequest.setGlrId("");
        viewGatewayLimitRulesRequest.setResourceId("");
        viewGatewayLimitRulesRequest.setMarker("");
        viewGatewayLimitRulesRequest.setMaxKeys("");
        ViewGatewayLimitRulesResponse response = vpcClient.viewGatewayLimitRules(viewGatewayLimitRulesRequest);
        System.out.println(response);
    }
}
