package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.ListInstanceSyncsRequest;
import com.baidubce.ccr.models.ListInstanceSyncsResponse;

public class ExampleListInstanceSyncs {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        ListInstanceSyncsRequest listInstanceSyncsRequest = new ListInstanceSyncsRequest();
        listInstanceSyncsRequest.setInstanceId("");
        listInstanceSyncsRequest.setPolicyName("");
        listInstanceSyncsRequest.setPageNo(0);
        listInstanceSyncsRequest.setPageSize(0);
        try {
            ListInstanceSyncsResponse response = client.listInstanceSyncs(listInstanceSyncsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
