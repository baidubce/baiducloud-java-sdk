package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.QryL2PolExecDetailRequest;
import com.baidubce.pfs.models.QryL2PolExecDetailResponse;

public class ExampleQryL2PolExecDetail {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        PfsClient client = new PfsClient(bceClientConfig);
        QryL2PolExecDetailRequest qryL2PolExecDetailRequest = new QryL2PolExecDetailRequest();
        qryL2PolExecDetailRequest.setInstanceId("");
        qryL2PolExecDetailRequest.setPolicyId("");
        qryL2PolExecDetailRequest.setJobId("");
        try {
            QryL2PolExecDetailResponse response = client.qryL2PolExecDetail(qryL2PolExecDetailRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
