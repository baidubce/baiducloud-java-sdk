package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.GetPriceForCreateInstanceRequest;
import com.baidubce.scs.models.GetPriceForCreateInstanceResponse;

public class ExampleGetPriceForCreateInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        GetPriceForCreateInstanceRequest getPriceForCreateInstanceRequest = new GetPriceForCreateInstanceRequest();
        getPriceForCreateInstanceRequest.setEngine(0);
        getPriceForCreateInstanceRequest.setClusterType("");
        getPriceForCreateInstanceRequest.setNodeType("");
        getPriceForCreateInstanceRequest.setCacheInstanceType(0);
        getPriceForCreateInstanceRequest.setShardNum(0);
        getPriceForCreateInstanceRequest.setReplicationNum(0);
        getPriceForCreateInstanceRequest.setInstanceNum(0);
        getPriceForCreateInstanceRequest.setDiskType("");
        getPriceForCreateInstanceRequest.setDiskFlavor(0);
        getPriceForCreateInstanceRequest.setChargeType("");
        getPriceForCreateInstanceRequest.setPeriod(0);
        getPriceForCreateInstanceRequest.setTimeUnit("");
        try {
            GetPriceForCreateInstanceResponse response = client.getPriceForCreateInstance(getPriceForCreateInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
