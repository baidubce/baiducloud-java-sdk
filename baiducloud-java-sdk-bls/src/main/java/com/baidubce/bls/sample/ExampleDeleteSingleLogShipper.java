package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.DeleteSingleLogShipperRequest;
import com.baidubce.bls.models.DeleteSingleLogShipperResponse;

public class ExampleDeleteSingleLogShipper {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        DeleteSingleLogShipperRequest deleteSingleLogShipperRequest = new DeleteSingleLogShipperRequest();
        deleteSingleLogShipperRequest.setLogShipperID("");
        try {
            DeleteSingleLogShipperResponse response = client.deleteSingleLogShipper(deleteSingleLogShipperRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
