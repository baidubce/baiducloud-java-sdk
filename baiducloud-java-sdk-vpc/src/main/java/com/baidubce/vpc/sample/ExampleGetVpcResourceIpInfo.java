package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.GetVpcResourceIpInfoRequest;
import com.baidubce.vpc.models.GetVpcResourceIpInfoResponse;

public class ExampleGetVpcResourceIpInfo {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
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
