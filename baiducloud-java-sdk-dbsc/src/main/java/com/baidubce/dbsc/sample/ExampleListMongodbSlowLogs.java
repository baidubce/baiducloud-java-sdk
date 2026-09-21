package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.ListMongodbSlowLogsRequest;
import com.baidubce.dbsc.models.ListMongodbSlowLogsResponse;

public class ExampleListMongodbSlowLogs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        ListMongodbSlowLogsRequest listMongodbSlowLogsRequest = new ListMongodbSlowLogsRequest();
        listMongodbSlowLogsRequest.setStart("");
        listMongodbSlowLogsRequest.setEnd("");
        listMongodbSlowLogsRequest.setNodeId("");
        listMongodbSlowLogsRequest.setUsers("");
        listMongodbSlowLogsRequest.setDbNames("");
        listMongodbSlowLogsRequest.setClientIps("");
        listMongodbSlowLogsRequest.setNamespace("");
        listMongodbSlowLogsRequest.setFingerprintMd5("");
        listMongodbSlowLogsRequest.setOrderBy("");
        listMongodbSlowLogsRequest.setOrder("");
        listMongodbSlowLogsRequest.setPage(0);
        listMongodbSlowLogsRequest.setPageSize(0);
        try {
            ListMongodbSlowLogsResponse response = client.listMongodbSlowLogs(listMongodbSlowLogsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
