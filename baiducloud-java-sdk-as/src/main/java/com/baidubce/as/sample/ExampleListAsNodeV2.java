package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.ListAsNodeV2Request;
import com.baidubce.as.models.ListAsNodeV2Response;

public class ExampleListAsNodeV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        ListAsNodeV2Request listAsNodeV2Request = new ListAsNodeV2Request();
        listAsNodeV2Request.setGroupid("");
        listAsNodeV2Request.setPageNo(0);
        listAsNodeV2Request.setPageSize(0);
        listAsNodeV2Request.setKeyword("");
        listAsNodeV2Request.setKeywordType("");
        listAsNodeV2Request.setOrder("");
        listAsNodeV2Request.setOrderBy("");
        try {
            ListAsNodeV2Response response = client.listAsNodeV2(listAsNodeV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
