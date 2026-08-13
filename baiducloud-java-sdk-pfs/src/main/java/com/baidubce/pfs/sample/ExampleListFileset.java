package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListFilesetRequest;
import com.baidubce.pfs.models.ListFilesetResponse;

public class ExampleListFileset {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
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
