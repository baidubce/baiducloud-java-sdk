package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeLbdcBlbRequest;
import com.baidubce.blb.models.DescribeLbdcBlbResponse;

public class ExampleDescribeLbdcBlb {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeLbdcBlbRequest describeLbdcBlbRequest = new DescribeLbdcBlbRequest();
        describeLbdcBlbRequest.setId("");
        try {
            DescribeLbdcBlbResponse response = client.describeLbdcBlb(describeLbdcBlbRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
