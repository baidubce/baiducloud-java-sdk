package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QuerySubnetListRequest;
import com.baidubce.vpc.models.QuerySubnetListResponse;

public class ExampleQuerySubnetList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        QuerySubnetListRequest querySubnetListRequest = new QuerySubnetListRequest();
        querySubnetListRequest.setMarker("");
        querySubnetListRequest.setMaxKeys(0);
        querySubnetListRequest.setVpcId("");
        querySubnetListRequest.setZoneName("");
        querySubnetListRequest.setSubnetType("");
        querySubnetListRequest.setSubnetIds("");
        try {
            QuerySubnetListResponse response = client.querySubnetList(querySubnetListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
