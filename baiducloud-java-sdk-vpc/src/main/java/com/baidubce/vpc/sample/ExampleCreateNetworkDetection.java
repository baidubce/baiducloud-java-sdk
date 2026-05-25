package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateNetworkDetectionRequest;
import com.baidubce.vpc.models.CreateNetworkDetectionResponse;
import java.util.ArrayList;

public class ExampleCreateNetworkDetection {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        CreateNetworkDetectionRequest createNetworkDetectionRequest = new CreateNetworkDetectionRequest();
        createNetworkDetectionRequest.setClientToken("");
        createNetworkDetectionRequest.setName("");
        createNetworkDetectionRequest.setDescription("");
        createNetworkDetectionRequest.setVpcId("");
        createNetworkDetectionRequest.setSubnetId("");
        createNetworkDetectionRequest.setProtocol("");
        createNetworkDetectionRequest.setFrequency(0);
        createNetworkDetectionRequest.setSourceIps(new ArrayList<>());
        createNetworkDetectionRequest.setSourceIpNum(0);
        createNetworkDetectionRequest.setDestIp("");
        createNetworkDetectionRequest.setDestPort(0);
        createNetworkDetectionRequest.setPayload("");
        try {
            CreateNetworkDetectionResponse response = client.createNetworkDetection(createNetworkDetectionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
