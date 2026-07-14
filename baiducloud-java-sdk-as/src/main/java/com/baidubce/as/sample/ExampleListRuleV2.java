package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.ListRuleV2Request;
import com.baidubce.as.models.ListRuleV2Response;

public class ExampleListRuleV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        ListRuleV2Request listRuleV2Request = new ListRuleV2Request();
        listRuleV2Request.setGroupid("");
        listRuleV2Request.setPageNo(0);
        listRuleV2Request.setPageSize(0);
        listRuleV2Request.setKeyword("");
        listRuleV2Request.setKeywordType("");
        listRuleV2Request.setOrder("");
        listRuleV2Request.setOrderBy("");
        try {
            ListRuleV2Response response = client.listRuleV2(listRuleV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
