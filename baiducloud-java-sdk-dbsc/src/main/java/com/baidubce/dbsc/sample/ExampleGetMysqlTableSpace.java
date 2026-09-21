package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMysqlTableSpaceRequest;
import com.baidubce.dbsc.models.GetMysqlTableSpaceResponse;

public class ExampleGetMysqlTableSpace {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMysqlTableSpaceRequest getMysqlTableSpaceRequest = new GetMysqlTableSpaceRequest();
        getMysqlTableSpaceRequest.setNodeId("");
        getMysqlTableSpaceRequest.setDatabase("");
        getMysqlTableSpaceRequest.setTable("");
        getMysqlTableSpaceRequest.setOrderBy("");
        getMysqlTableSpaceRequest.setOrder("");
        getMysqlTableSpaceRequest.setPage(0);
        getMysqlTableSpaceRequest.setPageSize(0);
        try {
            GetMysqlTableSpaceResponse response = client.getMysqlTableSpace(getMysqlTableSpaceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
