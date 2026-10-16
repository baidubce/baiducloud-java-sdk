package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DeleteAppBlbPolicyRequest;
import java.util.ArrayList;

public class ExampleDeleteAppBlbPolicy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DeleteAppBlbPolicyRequest deleteAppBlbPolicyRequest = new DeleteAppBlbPolicyRequest();
        deleteAppBlbPolicyRequest.setBlbId("");
        deleteAppBlbPolicyRequest.setClientToken("");
        deleteAppBlbPolicyRequest.setPort(0);
        deleteAppBlbPolicyRequest.setPolicyIdList(new ArrayList<>());
        deleteAppBlbPolicyRequest.setType("");
        try {
            client.deleteAppBlbPolicy(deleteAppBlbPolicyRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
