package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ListEniRequest;
import com.baidubce.vpc.models.ListEniResponse;
import java.util.ArrayList;

public class ExampleListEni {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ListEniRequest listEniRequest = new ListEniRequest();
        listEniRequest.setVpcId("");
        listEniRequest.setInstanceId("");
        listEniRequest.setName("");
        listEniRequest.setPrivateIpAddress(new ArrayList<>());
        listEniRequest.setMarker("");
        listEniRequest.setMaxKeys(0);
        try {
            ListEniResponse response = client.listEni(listEniRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
