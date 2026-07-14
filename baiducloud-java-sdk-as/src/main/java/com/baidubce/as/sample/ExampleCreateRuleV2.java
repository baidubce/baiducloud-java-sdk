package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.CreateRuleV2Request;
import com.baidubce.as.models.AsAlarmRule;
import com.baidubce.as.models.CreateRuleV2Response;
import com.baidubce.as.models.MonitorObject;
import java.util.ArrayList;

public class ExampleCreateRuleV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        AsAlarmRule asAlarmRule = new AsAlarmRule();
        asAlarmRule.setId(0);
        asAlarmRule.setScope("");
        MonitorObject monitorObject = new MonitorObject();
        monitorObject.setType("");
        monitorObject.setNames(new ArrayList<>());
        monitorObject.setResources(new ArrayList<>());
        monitorObject.setTypeName("");

        asAlarmRule.setMonitorObject(monitorObject);
        asAlarmRule.setRules(new ArrayList<>());
        asAlarmRule.setAlarmName("");
        asAlarmRule.setAliasName("");
        asAlarmRule.setInsufficientCycle(0);
        asAlarmRule.setPolicyEnabled(false);
        asAlarmRule.setRuleContents(new ArrayList<>());
        asAlarmRule.setRuleContentsEn(new ArrayList<>());
        asAlarmRule.setSource("");
        asAlarmRule.setComponentType("");
        asAlarmRule.setAlarmActions(new ArrayList<>());
        asAlarmRule.setOkActions(new ArrayList<>());
        asAlarmRule.setInsufficientActions(new ArrayList<>());

        CreateRuleV2Request createRuleV2Request = new CreateRuleV2Request();
        createRuleV2Request.setRuleName("");
        createRuleV2Request.setGroupId("");
        createRuleV2Request.setState("");
        createRuleV2Request.setType("");
        createRuleV2Request.setActionType("");
        createRuleV2Request.setActionNum(0);
        createRuleV2Request.setCronTime("");
        createRuleV2Request.setCooldownInSec(0);
        createRuleV2Request.setPeriodType("");
        createRuleV2Request.setPeriodValue(0);
        createRuleV2Request.setPeriodStartTime("");
        createRuleV2Request.setPeriodEndTime("");
        createRuleV2Request.setAsAlarmRule(asAlarmRule);
        try {
            CreateRuleV2Response response = client.createRuleV2(createRuleV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
