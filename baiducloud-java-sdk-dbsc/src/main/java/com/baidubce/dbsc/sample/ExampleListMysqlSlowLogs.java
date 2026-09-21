package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.ListMysqlSlowLogsRequest;
import com.baidubce.dbsc.models.ListMysqlSlowLogsResponse;

public class ExampleListMysqlSlowLogs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        ListMysqlSlowLogsRequest listMysqlSlowLogsRequest = new ListMysqlSlowLogsRequest();
        listMysqlSlowLogsRequest.setStart("");
        listMysqlSlowLogsRequest.setEnd("");
        listMysqlSlowLogsRequest.setNodeId("");
        listMysqlSlowLogsRequest.setUsers("");
        listMysqlSlowLogsRequest.setDbNames("");
        listMysqlSlowLogsRequest.setClientIps("");
        listMysqlSlowLogsRequest.setFingerprintMd5("");
        listMysqlSlowLogsRequest.setOrderBy("");
        listMysqlSlowLogsRequest.setOrder("");
        listMysqlSlowLogsRequest.setPage(0);
        listMysqlSlowLogsRequest.setPageSize(0);
        try {
            ListMysqlSlowLogsResponse response = client.listMysqlSlowLogs(listMysqlSlowLogsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
