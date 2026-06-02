package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListFilesetRequest;
import com.baidubce.pfs.models.ListFilesetResponse;

public class ExampleListFileset {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PfsClient client = new PfsClient(config);
        ListFilesetRequest listFilesetRequest = new ListFilesetRequest();
        listFilesetRequest.setInstanceId("");
        listFilesetRequest.setFilesetId("");
        listFilesetRequest.setFilesetName("");
        listFilesetRequest.setManner("");
        listFilesetRequest.setOrder("");
        listFilesetRequest.setOrderBy("");
        listFilesetRequest.setPageNo(0);
        listFilesetRequest.setPageSize(0);
        try {
            ListFilesetResponse response = client.listFileset(listFilesetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
