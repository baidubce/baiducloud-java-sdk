package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.QueryAndParseRecordListRequest;
import com.baidubce.dns.models.QueryAndParseRecordListResponse;

public class ExampleQueryAndParseRecordList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        DnsClient client = new DnsClient(config);
        QueryAndParseRecordListRequest queryAndParseRecordListRequest = new QueryAndParseRecordListRequest();
        queryAndParseRecordListRequest.setZoneName("");
        queryAndParseRecordListRequest.setRr("");
        queryAndParseRecordListRequest.setId("");
        queryAndParseRecordListRequest.setMarker("");
        queryAndParseRecordListRequest.setMaxKeys(0);
        try {
            QueryAndParseRecordListResponse response = client.queryAndParseRecordList(queryAndParseRecordListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
