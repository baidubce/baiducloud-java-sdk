package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.KillMysqlSessionRequest;
import com.baidubce.dbsc.models.KillMysqlSessionResponse;
import java.util.ArrayList;

public class ExampleKillMysqlSession {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        KillMysqlSessionRequest killMysqlSessionRequest = new KillMysqlSessionRequest();
        killMysqlSessionRequest.setAppId("");
        killMysqlSessionRequest.setNodeId("");
        killMysqlSessionRequest.setIdItems(new ArrayList<>());
        try {
            KillMysqlSessionResponse response = client.killMysqlSession(killMysqlSessionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
