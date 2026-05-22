package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbPolicyRequest;
import java.util.ArrayList;

public class ExampleUpdateAppBlbPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        UpdateAppBlbPolicyRequest updateAppBlbPolicyRequest = new UpdateAppBlbPolicyRequest();
        updateAppBlbPolicyRequest.setBlbId("");
        updateAppBlbPolicyRequest.setClientToken("");
        updateAppBlbPolicyRequest.setPort(0);
        updateAppBlbPolicyRequest.setType("");
        updateAppBlbPolicyRequest.setPolicyList(new ArrayList<>());
        try {
            client.updateAppBlbPolicy(updateAppBlbPolicyRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
