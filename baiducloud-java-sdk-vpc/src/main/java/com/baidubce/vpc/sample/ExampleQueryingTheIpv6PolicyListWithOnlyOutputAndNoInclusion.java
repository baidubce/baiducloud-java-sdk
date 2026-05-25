package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest;
import com.baidubce.vpc.models.QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionResponse;

public class ExampleQueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusion {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest =
                new QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest();
        queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest.setGatewayId("");
        queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest.setMarker("");
        queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest.setMaxKeys(0);
        try {
            QueryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionResponse response =
                    client.queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusion(queryingTheIpv6PolicyListWithOnlyOutputAndNoInclusionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
