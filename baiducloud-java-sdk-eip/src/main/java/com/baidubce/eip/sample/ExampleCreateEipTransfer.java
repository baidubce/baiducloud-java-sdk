package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.CreateEipTransferRequest;
import com.baidubce.eip.models.CreateEipTransferResponse;
import java.util.ArrayList;

public class ExampleCreateEipTransfer {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EipClient client = new EipClient(config);
        CreateEipTransferRequest createEipTransferRequest = new CreateEipTransferRequest();
        createEipTransferRequest.setClientToken("");
        createEipTransferRequest.setTransferType("");
        createEipTransferRequest.setTransferResourceList(new ArrayList<>());
        createEipTransferRequest.setToUserId("");
        try {
            CreateEipTransferResponse response = client.createEipTransfer(createEipTransferRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
