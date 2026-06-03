package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.QryL2PolExecLogRequest;
import com.baidubce.pfs.models.QryL2PolExecLogResponse;

public class ExampleQryL2PolExecLog {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PfsClient client = new PfsClient(config);
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
