package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.GetTemplateDetailV2Request;
import com.baidubce.oos.models.GetTemplateDetailV2Response;

public class ExampleGetTemplateDetailV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        GetTemplateDetailV2Request getTemplateDetailV2Request = new GetTemplateDetailV2Request();
        getTemplateDetailV2Request.setNamespace("");
        getTemplateDetailV2Request.setId("");
        getTemplateDetailV2Request.setName("");
        getTemplateDetailV2Request.setType("");
        getTemplateDetailV2Request.setLocale("");
        try {
            GetTemplateDetailV2Response response = client.getTemplateDetailV2(getTemplateDetailV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
