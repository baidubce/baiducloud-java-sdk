package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.ListPegadbSlowLogsRequest;
import com.baidubce.dbsc.models.ListPegadbSlowLogsResponse;

public class ExampleListPegadbSlowLogs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        ListPegadbSlowLogsRequest listPegadbSlowLogsRequest = new ListPegadbSlowLogsRequest();
        listPegadbSlowLogsRequest.setNodeId("");
        listPegadbSlowLogsRequest.setStart("");
        listPegadbSlowLogsRequest.setEnd("");
        listPegadbSlowLogsRequest.setDbEngine("");
        listPegadbSlowLogsRequest.setPage(0);
        listPegadbSlowLogsRequest.setPageSize(0);
        listPegadbSlowLogsRequest.setOrderBy("");
        listPegadbSlowLogsRequest.setOrder("");
        try {
            ListPegadbSlowLogsResponse response = client.listPegadbSlowLogs(listPegadbSlowLogsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
