package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.QueryAndParseRecordListRequest;
import com.baidubce.privatezone.models.QueryAndParseRecordListResponse;

public class ExampleQueryAndParseRecordList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        QueryAndParseRecordListRequest queryAndParseRecordListRequest = new QueryAndParseRecordListRequest();
        queryAndParseRecordListRequest.setZoneId("");
        queryAndParseRecordListRequest.setMarker("");
        queryAndParseRecordListRequest.setMaxKeys(0);
        queryAndParseRecordListRequest.setRr("");
        queryAndParseRecordListRequest.setSearchMode("");
        queryAndParseRecordListRequest.setType("");
        queryAndParseRecordListRequest.setValue("");
        try {
            QueryAndParseRecordListResponse response = client.queryAndParseRecordList(queryAndParseRecordListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
