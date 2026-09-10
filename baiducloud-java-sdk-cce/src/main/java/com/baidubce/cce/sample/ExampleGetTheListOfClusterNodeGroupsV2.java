package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.GetTheListOfClusterNodeGroupsV2Request;
import com.baidubce.cce.models.GetTheListOfClusterNodeGroupsV2Response;

public class ExampleGetTheListOfClusterNodeGroupsV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        GetTheListOfClusterNodeGroupsV2Request getTheListOfClusterNodeGroupsV2Request = new GetTheListOfClusterNodeGroupsV2Request();
        getTheListOfClusterNodeGroupsV2Request.setClusterID("");
        getTheListOfClusterNodeGroupsV2Request.setPageNo(0);
        getTheListOfClusterNodeGroupsV2Request.setPageSize(0);
        getTheListOfClusterNodeGroupsV2Request.setKeywordType("");
        getTheListOfClusterNodeGroupsV2Request.setKeyword("");
        getTheListOfClusterNodeGroupsV2Request.setAutoscalerEnabled("");
        getTheListOfClusterNodeGroupsV2Request.setChargingType("");
        try {
            GetTheListOfClusterNodeGroupsV2Response response = client.getTheListOfClusterNodeGroupsV2(getTheListOfClusterNodeGroupsV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
