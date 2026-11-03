package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.UnbindVpcToRuleRequest;
import java.util.ArrayList;

public class ExampleUnbindVpcToRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PrivatezoneClient client = new PrivatezoneClient(bceClientConfig);
        UnbindVpcToRuleRequest unbindVpcToRuleRequest = new UnbindVpcToRuleRequest();
        unbindVpcToRuleRequest.setRuleId("");
        unbindVpcToRuleRequest.setClientToken("");
        unbindVpcToRuleRequest.setVpcRegions(new ArrayList<>());
        try {
            client.unbindVpcToRule(unbindVpcToRuleRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
