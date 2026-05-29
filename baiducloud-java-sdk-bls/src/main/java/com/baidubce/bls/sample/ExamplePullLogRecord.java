package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.PullLogRecordRequest;
import com.baidubce.bls.models.PullLogRecordResponse;

public class ExamplePullLogRecord {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlsClient client = new BlsClient(config);
        PullLogRecordRequest pullLogRecordRequest = new PullLogRecordRequest();
        pullLogRecordRequest.setLogStoreName("");
        pullLogRecordRequest.setLogStreamName("");
        pullLogRecordRequest.setStartDateTime("");
        pullLogRecordRequest.setEndDateTime("");
        pullLogRecordRequest.setProject("");
        pullLogRecordRequest.setLimit(0);
        pullLogRecordRequest.setMarker("");
        try {
            PullLogRecordResponse response = client.pullLogRecord(pullLogRecordRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
