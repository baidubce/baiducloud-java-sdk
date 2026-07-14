package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.ListTaskV2Request;
import com.baidubce.as.models.ListTaskV2Response;

public class ExampleListTaskV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        ListTaskV2Request listTaskV2Request = new ListTaskV2Request();
        listTaskV2Request.setGroupid("");
        listTaskV2Request.setOrderBy("");
        listTaskV2Request.setPageNo(0);
        listTaskV2Request.setOrder("");
        listTaskV2Request.setPageSize(0);
        listTaskV2Request.setStartTime("");
        listTaskV2Request.setEndTime("");
        try {
            ListTaskV2Response response = client.listTaskV2(listTaskV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
