package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListLogShipperRecordRequest;
import com.baidubce.bls.models.ListLogShipperRecordResponse;

public class ExampleListLogShipperRecord {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        ListLogShipperRecordRequest listLogShipperRecordRequest = new ListLogShipperRecordRequest();
        listLogShipperRecordRequest.setLogShipperID("");
        listLogShipperRecordRequest.setSinceHours(0);
        listLogShipperRecordRequest.setPageNo(0);
        listLogShipperRecordRequest.setPageSize(0);
        try {
            ListLogShipperRecordResponse response = client.listLogShipperRecord(listLogShipperRecordRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
