package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateProbeRequest;
import com.baidubce.vpc.models.CreateProbeResponse;
import java.util.ArrayList;

public class ExampleCreateProbe {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        VpcClient client = new VpcClient(bceClientConfig);
        CreateProbeRequest createProbeRequest = new CreateProbeRequest();
        createProbeRequest.setClientToken("");
        createProbeRequest.setName("");
        createProbeRequest.setDescription("");
        createProbeRequest.setVpcId("");
        createProbeRequest.setSubnetId("");
        createProbeRequest.setProtocol("");
        createProbeRequest.setFrequency(0);
        createProbeRequest.setSourceIps(new ArrayList<>());
        createProbeRequest.setSourceIpNum(0);
        createProbeRequest.setDestIp("");
        createProbeRequest.setDestPort(0);
        createProbeRequest.setPayload("");
        try {
            CreateProbeResponse response = client.createProbe(createProbeRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
