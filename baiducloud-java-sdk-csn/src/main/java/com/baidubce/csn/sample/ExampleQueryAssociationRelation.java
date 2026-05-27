package com.baidubce.csn.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.csn.CsnClient;
import com.baidubce.csn.models.QueryAssociationRelationRequest;
import com.baidubce.csn.models.QueryAssociationRelationResponse;

public class ExampleQueryAssociationRelation {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CsnClient client = new CsnClient(config);
        QueryAssociationRelationRequest queryAssociationRelationRequest = new QueryAssociationRelationRequest();
        queryAssociationRelationRequest.setCsnRtId("");
        try {
            QueryAssociationRelationResponse response = client.queryAssociationRelation(queryAssociationRelationRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
