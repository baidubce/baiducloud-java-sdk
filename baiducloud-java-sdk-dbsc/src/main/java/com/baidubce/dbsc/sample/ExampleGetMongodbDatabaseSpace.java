package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceRequest;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceResponse;

public class ExampleGetMongodbDatabaseSpace {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMongodbDatabaseSpaceRequest getMongodbDatabaseSpaceRequest = new GetMongodbDatabaseSpaceRequest();
        getMongodbDatabaseSpaceRequest.setNodeId("");
        getMongodbDatabaseSpaceRequest.setDatabase("");
        getMongodbDatabaseSpaceRequest.setOrderBy("");
        getMongodbDatabaseSpaceRequest.setOrder("");
        getMongodbDatabaseSpaceRequest.setPage(0);
        getMongodbDatabaseSpaceRequest.setPageSize(0);
        try {
            GetMongodbDatabaseSpaceResponse response = client.getMongodbDatabaseSpace(getMongodbDatabaseSpaceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
