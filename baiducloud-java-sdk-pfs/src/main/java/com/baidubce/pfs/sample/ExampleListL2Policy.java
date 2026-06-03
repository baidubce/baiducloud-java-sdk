package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListL2PolicyRequest;
import com.baidubce.pfs.models.ListL2PolicyResponse;

public class ExampleListL2Policy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PfsClient client = new PfsClient(config);
        ListL2PolicyRequest listL2PolicyRequest = new ListL2PolicyRequest();
        listL2PolicyRequest.setInstanceId("");
        listL2PolicyRequest.setMaxKeys(0);
        listL2PolicyRequest.setMarker("");
        try {
            ListL2PolicyResponse response = client.listL2Policy(listL2PolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
