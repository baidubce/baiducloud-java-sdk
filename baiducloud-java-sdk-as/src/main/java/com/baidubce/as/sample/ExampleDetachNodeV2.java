package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.DetachNodeV2Request;
import com.baidubce.as.models.DetachNodeV2Response;
import java.util.ArrayList;

public class ExampleDetachNodeV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        DetachNodeV2Request detachNodeV2Request = new DetachNodeV2Request();
        detachNodeV2Request.setGroupId("");
        detachNodeV2Request.setDetachNode("");
        detachNodeV2Request.setNodes(new ArrayList<>());
        try {
            DetachNodeV2Response response = client.detachNodeV2(detachNodeV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
