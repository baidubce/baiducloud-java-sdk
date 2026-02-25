package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryTheReservedNetworkSegmentListRequest;
import com.baidubce.vpc.models.QueryTheReservedNetworkSegmentListResponse;

public class ExampleQueryTheReservedNetworkSegmentList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        QueryTheReservedNetworkSegmentListRequest queryTheReservedNetworkSegmentListRequest = new QueryTheReservedNetworkSegmentListRequest();
        queryTheReservedNetworkSegmentListRequest.setSubnetId("");
        queryTheReservedNetworkSegmentListRequest.setMarker("");
        queryTheReservedNetworkSegmentListRequest.setMaxKeys(0);
        try {
            QueryTheReservedNetworkSegmentListResponse response = client.queryTheReservedNetworkSegmentList(queryTheReservedNetworkSegmentListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
