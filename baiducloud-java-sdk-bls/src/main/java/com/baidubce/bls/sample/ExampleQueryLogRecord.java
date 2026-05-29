package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.QueryLogRecordRequest;
import com.baidubce.bls.models.QueryLogRecordResponse;

public class ExampleQueryLogRecord {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlsClient client = new BlsClient(config);
        QueryLogRecordRequest queryLogRecordRequest = new QueryLogRecordRequest();
        queryLogRecordRequest.setLogStoreName("");
        queryLogRecordRequest.setQuery("");
        queryLogRecordRequest.setStartDateTime("");
        queryLogRecordRequest.setEndDateTime("");
        queryLogRecordRequest.setProject("");
        queryLogRecordRequest.setLogStreamName("");
        queryLogRecordRequest.setMarker("");
        queryLogRecordRequest.setLimit(0);
        queryLogRecordRequest.setSort("");
        queryLogRecordRequest.setPageNo(0);
        queryLogRecordRequest.setPageSize(0);
        try {
            QueryLogRecordResponse response = client.queryLogRecord(queryLogRecordRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
