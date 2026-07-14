package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.AttachNodeV2Request;
import com.baidubce.as.models.AttachNodeV2Response;
import java.util.ArrayList;

public class ExampleAttachNodeV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        AttachNodeV2Request attachNodeV2Request = new AttachNodeV2Request();
        attachNodeV2Request.setGroupId("");
        attachNodeV2Request.setAttachNode("");
        attachNodeV2Request.setNodes(new ArrayList<>());
        try {
            AttachNodeV2Response response = client.attachNodeV2(attachNodeV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
