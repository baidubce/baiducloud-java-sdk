package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.ListAIGatewaysRequest;
import com.baidubce.aigw.models.ListAIGatewaysResponse;

public class ExampleListAIGateways {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        ListAIGatewaysRequest listAIGatewaysRequest = new ListAIGatewaysRequest();
        listAIGatewaysRequest.setXRegion("");
        listAIGatewaysRequest.setKeyword("");
        listAIGatewaysRequest.setKeywordType("");
        listAIGatewaysRequest.setStatus("");
        listAIGatewaysRequest.setSrcProduct("");
        listAIGatewaysRequest.setTagKey("");
        listAIGatewaysRequest.setTagValue("");
        listAIGatewaysRequest.setResourceGroupId("");
        listAIGatewaysRequest.setPageNo(0);
        listAIGatewaysRequest.setPageSize(0);
        listAIGatewaysRequest.setOrderBy("");
        listAIGatewaysRequest.setOrder("");
        try {
            ListAIGatewaysResponse response = client.listAIGateways(listAIGatewaysRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
