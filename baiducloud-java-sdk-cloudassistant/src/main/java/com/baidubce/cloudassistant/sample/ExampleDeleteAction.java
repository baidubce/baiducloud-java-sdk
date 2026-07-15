package com.baidubce.cloudassistant.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cloudassistant.CloudassistantClient;
import com.baidubce.cloudassistant.models.DeleteActionRequest;
import com.baidubce.cloudassistant.models.DeleteActionResponse;

public class ExampleDeleteAction {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CloudassistantClient client = new CloudassistantClient(bceClientConfig);
        DeleteActionRequest deleteActionRequest = new DeleteActionRequest();
        deleteActionRequest.setId("");
        try {
            DeleteActionResponse response = client.deleteAction(deleteActionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
