package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryTheListOfDedicatedLineGatewaysRequest;
import com.baidubce.vpc.models.QueryTheListOfDedicatedLineGatewaysResponse;

public class ExampleQueryTheListOfDedicatedLineGateways {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        VpcClient client = new VpcClient(bceClientConfig);
        QueryTheListOfDedicatedLineGatewaysRequest queryTheListOfDedicatedLineGatewaysRequest = new QueryTheListOfDedicatedLineGatewaysRequest();
        queryTheListOfDedicatedLineGatewaysRequest.setVpcId("");
        queryTheListOfDedicatedLineGatewaysRequest.setEtGatewayId("");
        queryTheListOfDedicatedLineGatewaysRequest.setName("");
        queryTheListOfDedicatedLineGatewaysRequest.setStatus("");
        queryTheListOfDedicatedLineGatewaysRequest.setMarker("");
        queryTheListOfDedicatedLineGatewaysRequest.setMaxKeys(0);
        try {
            QueryTheListOfDedicatedLineGatewaysResponse response = client.queryTheListOfDedicatedLineGateways(queryTheListOfDedicatedLineGatewaysRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
