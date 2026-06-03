package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.TestAcceleratorFilterRequest;
import com.baidubce.ccr.models.TestAcceleratorFilterResponse;
import java.util.ArrayList;

public class ExampleTestAcceleratorFilter {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        TestAcceleratorFilterRequest testAcceleratorFilterRequest = new TestAcceleratorFilterRequest();
        testAcceleratorFilterRequest.setFilters(new ArrayList<>());
        testAcceleratorFilterRequest.setRepository("");
        try {
            TestAcceleratorFilterResponse response = client.testAcceleratorFilter(testAcceleratorFilterRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
