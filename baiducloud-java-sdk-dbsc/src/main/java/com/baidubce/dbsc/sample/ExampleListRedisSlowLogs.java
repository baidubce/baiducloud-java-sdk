package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.ListRedisSlowLogsRequest;
import com.baidubce.dbsc.models.ListRedisSlowLogsResponse;

public class ExampleListRedisSlowLogs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        ListRedisSlowLogsRequest listRedisSlowLogsRequest = new ListRedisSlowLogsRequest();
        listRedisSlowLogsRequest.setNodeId("");
        listRedisSlowLogsRequest.setStart("");
        listRedisSlowLogsRequest.setEnd("");
        listRedisSlowLogsRequest.setDbEngine("");
        listRedisSlowLogsRequest.setPage(0);
        listRedisSlowLogsRequest.setPageSize(0);
        listRedisSlowLogsRequest.setOrderBy("");
        listRedisSlowLogsRequest.setOrder("");
        try {
            ListRedisSlowLogsResponse response = client.listRedisSlowLogs(listRedisSlowLogsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
