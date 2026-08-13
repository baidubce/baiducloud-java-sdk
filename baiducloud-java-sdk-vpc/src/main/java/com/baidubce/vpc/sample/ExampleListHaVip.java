package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ListHaVipRequest;
import com.baidubce.vpc.models.ListHaVipResponse;

public class ExampleListHaVip {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ListHaVipRequest listHaVipRequest = new ListHaVipRequest();
        listHaVipRequest.setVpcId("");
        listHaVipRequest.setMarker("");
        listHaVipRequest.setMaxKeys(0);
        try {
            ListHaVipResponse response = client.listHaVip(listHaVipRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
