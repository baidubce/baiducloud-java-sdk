package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.GetTheListOfClusterNodesV2Request;
import com.baidubce.cce.models.GetTheListOfClusterNodesV2Response;

public class ExampleGetTheListOfClusterNodesV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        GetTheListOfClusterNodesV2Request getTheListOfClusterNodesV2Request = new GetTheListOfClusterNodesV2Request();
        getTheListOfClusterNodesV2Request.setClusterID("");
        getTheListOfClusterNodesV2Request.setKeywordType("");
        getTheListOfClusterNodesV2Request.setKeyword("");
        getTheListOfClusterNodesV2Request.setOrderBy("");
        getTheListOfClusterNodesV2Request.setOrder("");
        getTheListOfClusterNodesV2Request.setPageNo(0);
        getTheListOfClusterNodesV2Request.setPageSize(0);
        try {
            GetTheListOfClusterNodesV2Response response = client.getTheListOfClusterNodesV2(getTheListOfClusterNodesV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
