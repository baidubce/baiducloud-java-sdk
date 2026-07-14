package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.ListAsGroupV2Request;
import com.baidubce.as.models.ListAsGroupV2Response;

public class ExampleListAsGroupV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        ListAsGroupV2Request listAsGroupV2Request = new ListAsGroupV2Request();
        listAsGroupV2Request.setPageNo(0);
        listAsGroupV2Request.setPageSize(0);
        listAsGroupV2Request.setKeyword("");
        listAsGroupV2Request.setKeywordType("");
        listAsGroupV2Request.setSubKeywordType("");
        listAsGroupV2Request.setOrder("");
        listAsGroupV2Request.setOrderBy("");
        try {
            ListAsGroupV2Response response = client.listAsGroupV2(listAsGroupV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
