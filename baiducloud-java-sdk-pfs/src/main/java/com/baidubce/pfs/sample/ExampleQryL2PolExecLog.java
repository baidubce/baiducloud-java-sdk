package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.QryL2PolExecLogRequest;
import com.baidubce.pfs.models.QryL2PolExecLogResponse;

public class ExampleQryL2PolExecLog {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        QryL2PolExecLogRequest qryL2PolExecLogRequest = new QryL2PolExecLogRequest();
        qryL2PolExecLogRequest.setInstanceId("");
        qryL2PolExecLogRequest.setPolicyId("");
        qryL2PolExecLogRequest.setStartTime(0);
        qryL2PolExecLogRequest.setEndTime(0);
        try {
            QryL2PolExecLogResponse response = client.qryL2PolExecLog(qryL2PolExecLogRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
