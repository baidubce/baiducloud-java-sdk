package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.QueryDedicatedLinesRequest;
import com.baidubce.et.models.QueryDedicatedLinesResponse;

public class ExampleQueryDedicatedLines {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        EtClient client = new EtClient(bceClientConfig);
        QueryDedicatedLinesRequest queryDedicatedLinesRequest = new QueryDedicatedLinesRequest();
        queryDedicatedLinesRequest.setMarker("");
        queryDedicatedLinesRequest.setMaxKeys(0);
        queryDedicatedLinesRequest.setStatus("");
        try {
            QueryDedicatedLinesResponse response = client.queryDedicatedLines(queryDedicatedLinesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
