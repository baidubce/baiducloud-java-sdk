package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.ListPostgresqlSlowLogsRequest;
import com.baidubce.dbsc.models.ListPostgresqlSlowLogsResponse;
import java.util.ArrayList;

public class ExampleListPostgresqlSlowLogs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        ListPostgresqlSlowLogsRequest listPostgresqlSlowLogsRequest = new ListPostgresqlSlowLogsRequest();
        listPostgresqlSlowLogsRequest.setAppId("");
        listPostgresqlSlowLogsRequest.setNodeId("");
        listPostgresqlSlowLogsRequest.setStart("");
        listPostgresqlSlowLogsRequest.setEnd("");
        listPostgresqlSlowLogsRequest.setPage(0);
        listPostgresqlSlowLogsRequest.setPageSize(0);
        listPostgresqlSlowLogsRequest.setDbNames(new ArrayList<>());
        listPostgresqlSlowLogsRequest.setClientIPs(new ArrayList<>());
        listPostgresqlSlowLogsRequest.setUsers(new ArrayList<>());
        listPostgresqlSlowLogsRequest.setOrderBy("");
        listPostgresqlSlowLogsRequest.setOrder("");
        try {
            ListPostgresqlSlowLogsResponse response = client.listPostgresqlSlowLogs(listPostgresqlSlowLogsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
