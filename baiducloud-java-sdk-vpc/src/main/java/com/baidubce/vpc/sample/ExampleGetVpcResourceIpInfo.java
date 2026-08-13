package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.GetVpcResourceIpInfoRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoResponse;

public class ExampleGetVpcResourceIpInfo {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        GetVpcResourceIpInfoRequest getVpcResourceIpInfoRequest = new GetVpcResourceIpInfoRequest();
        getVpcResourceIpInfoRequest.setVpcId("");
        getVpcResourceIpInfoRequest.setSubnetId("");
        getVpcResourceIpInfoRequest.setResourceType("");
        getVpcResourceIpInfoRequest.setPageNo(0);
        getVpcResourceIpInfoRequest.setPageSize(0);
        try {
            GetVpcResourceIpInfoResponse response = client.getVpcResourceIpInfo(getVpcResourceIpInfoRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
