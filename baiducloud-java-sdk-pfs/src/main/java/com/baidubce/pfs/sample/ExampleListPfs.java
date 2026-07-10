package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListPfsRequest;
import com.baidubce.pfs.models.ListPfsResponse;

public class ExampleListPfs {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        PfsClient client = new PfsClient(bceClientConfig);
        ListPfsRequest listPfsRequest = new ListPfsRequest();
        listPfsRequest.setMaxKeys(0);
        listPfsRequest.setMarker("");
        listPfsRequest.setFilterTag("");
        try {
            ListPfsResponse response = client.listPfs(listPfsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
