package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListRecycleInstanceRequest;
import com.baidubce.bcc.models.ListRecycleInstanceResponse;

public class ExampleListRecycleInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        ListRecycleInstanceRequest listRecycleInstanceRequest = new ListRecycleInstanceRequest();
        listRecycleInstanceRequest.setMarker("");
        listRecycleInstanceRequest.setMaxKeys(0);
        listRecycleInstanceRequest.setInstanceId("");
        listRecycleInstanceRequest.setName("");
        listRecycleInstanceRequest.setPaymentTiming("");
        listRecycleInstanceRequest.setRecycleBegin("");
        listRecycleInstanceRequest.setRecycleEnd("");
        try {
            ListRecycleInstanceResponse response = client.listRecycleInstance(listRecycleInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
