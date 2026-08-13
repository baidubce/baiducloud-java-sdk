package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.UpdateStatelessCfwRequest;
import java.util.ArrayList;

public class ExampleUpdateStatelessCfw {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CfwClient client = new CfwClient(bceClientConfig);
        UpdateStatelessCfwRequest updateStatelessCfwRequest = new UpdateStatelessCfwRequest();
        updateStatelessCfwRequest.setCfwId("");
        updateStatelessCfwRequest.setName("");
        updateStatelessCfwRequest.setDescription("");
        updateStatelessCfwRequest.setProtocol("");
        updateStatelessCfwRequest.setIpList(new ArrayList<>());
        try {
            client.updateStatelessCfw(updateStatelessCfwRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
