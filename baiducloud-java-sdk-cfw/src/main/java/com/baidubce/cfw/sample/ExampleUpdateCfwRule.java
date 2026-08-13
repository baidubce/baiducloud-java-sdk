package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.UpdateCfwRuleRequest;

public class ExampleUpdateCfwRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CfwClient client = new CfwClient(bceClientConfig);
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
        try {
            client.updateCfwRule(updateCfwRuleRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
