package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.BatchAddEniIpRequest;
import com.baidubce.vpc.models.BatchAddEniIpResponse;
import java.util.ArrayList;

public class ExampleBatchAddEniIp {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        BatchAddEniIpRequest batchAddEniIpRequest = new BatchAddEniIpRequest();
        batchAddEniIpRequest.setEniId("");
        batchAddEniIpRequest.setClientToken("");
        batchAddEniIpRequest.setIsIpv6(false);
        batchAddEniIpRequest.setPrivateIpAddresses(new ArrayList<>());
        batchAddEniIpRequest.setPrivateIpAddressCount(0);
        try {
            BatchAddEniIpResponse response = client.batchAddEniIp(batchAddEniIpRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
