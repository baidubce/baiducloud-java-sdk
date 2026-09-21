package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceRequest;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceResponse;

public class ExampleGetMongodbCollectionSpace {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMongodbCollectionSpaceRequest getMongodbCollectionSpaceRequest = new GetMongodbCollectionSpaceRequest();
        getMongodbCollectionSpaceRequest.setNodeId("");
        getMongodbCollectionSpaceRequest.setDatabase("");
        getMongodbCollectionSpaceRequest.setCollection("");
        getMongodbCollectionSpaceRequest.setOrderBy("");
        getMongodbCollectionSpaceRequest.setOrder("");
        getMongodbCollectionSpaceRequest.setPage(0);
        getMongodbCollectionSpaceRequest.setPageSize(0);
        try {
            GetMongodbCollectionSpaceResponse response = client.getMongodbCollectionSpace(getMongodbCollectionSpaceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
