package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMysqlDatabaseSpaceRequest;
import com.baidubce.dbsc.models.GetMysqlDatabaseSpaceResponse;

public class ExampleGetMysqlDatabaseSpace {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMysqlDatabaseSpaceRequest getMysqlDatabaseSpaceRequest = new GetMysqlDatabaseSpaceRequest();
        getMysqlDatabaseSpaceRequest.setNodeId("");
        getMysqlDatabaseSpaceRequest.setDatabase("");
        getMysqlDatabaseSpaceRequest.setOrderBy("");
        getMysqlDatabaseSpaceRequest.setOrder("");
        getMysqlDatabaseSpaceRequest.setPage(0);
        getMysqlDatabaseSpaceRequest.setPageSize(0);
        try {
            GetMysqlDatabaseSpaceResponse response = client.getMysqlDatabaseSpace(getMysqlDatabaseSpaceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
