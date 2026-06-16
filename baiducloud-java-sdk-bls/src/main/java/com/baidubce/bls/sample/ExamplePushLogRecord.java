package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.PushLogRecordRequest;
import com.baidubce.bls.models.PushLogRecordResponse;
import java.util.ArrayList;

public class ExamplePushLogRecord {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        PushLogRecordRequest pushLogRecordRequest = new PushLogRecordRequest();
        pushLogRecordRequest.setLogStoreName("");
        pushLogRecordRequest.setProject("");
        pushLogRecordRequest.setLogStreamName("");
        pushLogRecordRequest.setType("");
        pushLogRecordRequest.setLogRecords(new ArrayList<>());
        pushLogRecordRequest.setTags(new ArrayList<>());
        try {
            PushLogRecordResponse response = client.pushLogRecord(pushLogRecordRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
