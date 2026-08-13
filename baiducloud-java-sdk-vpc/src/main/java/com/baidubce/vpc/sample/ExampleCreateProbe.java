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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
