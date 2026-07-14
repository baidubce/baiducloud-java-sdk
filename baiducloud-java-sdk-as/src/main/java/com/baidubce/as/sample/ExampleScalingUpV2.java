package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.ScalingUpV2Request;
import com.baidubce.as.models.ScalingUpV2Response;
import java.util.ArrayList;

public class ExampleScalingUpV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        ScalingUpV2Request scalingUpV2Request = new ScalingUpV2Request();
        scalingUpV2Request.setGroupId("");
        scalingUpV2Request.setScalingUp("");
        scalingUpV2Request.setNodeCount(0);
        scalingUpV2Request.setZone(new ArrayList<>());
        scalingUpV2Request.setExpansionStrategy("");
        try {
            ScalingUpV2Response response = client.scalingUpV2(scalingUpV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
