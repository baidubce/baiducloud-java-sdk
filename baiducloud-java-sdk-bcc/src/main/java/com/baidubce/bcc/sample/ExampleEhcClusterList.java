package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.EhcClusterListRequest;
import com.baidubce.bcc.models.EhcClusterListResponse;
import java.util.ArrayList;

public class ExampleEhcClusterList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        EhcClusterListRequest ehcClusterListRequest = new EhcClusterListRequest();
        ehcClusterListRequest.setEhcClusterIdList(new ArrayList<>());
        ehcClusterListRequest.setNameList(new ArrayList<>());
        ehcClusterListRequest.setZoneName("");
        try {
            EhcClusterListResponse response = client.ehcClusterList(ehcClusterListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
