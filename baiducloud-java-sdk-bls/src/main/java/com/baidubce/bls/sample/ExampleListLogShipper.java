package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListLogShipperRequest;
import com.baidubce.bls.models.ListLogShipperResponse;

public class ExampleListLogShipper {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        ListLogShipperRequest listLogShipperRequest = new ListLogShipperRequest();
        listLogShipperRequest.setLogShipperID("");
        listLogShipperRequest.setLogShipperName("");
        listLogShipperRequest.setProject("");
        listLogShipperRequest.setLogStoreName("");
        listLogShipperRequest.setDestType("");
        listLogShipperRequest.setStatus("");
        listLogShipperRequest.setOrderBy("");
        listLogShipperRequest.setOrder("");
        listLogShipperRequest.setPageNo(0);
        listLogShipperRequest.setPageSize(0);
        try {
            ListLogShipperResponse response = client.listLogShipper(listLogShipperRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
