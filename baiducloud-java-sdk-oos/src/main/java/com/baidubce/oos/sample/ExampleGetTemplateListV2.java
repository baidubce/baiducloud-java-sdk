package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.GetTemplateListV2Request;
import com.baidubce.oos.models.GetTemplateListV2Response;

public class ExampleGetTemplateListV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        GetTemplateListV2Request getTemplateListV2Request = new GetTemplateListV2Request();
        getTemplateListV2Request.setLocale("");
        getTemplateListV2Request.setNamespace("");
        getTemplateListV2Request.setName("");
        getTemplateListV2Request.setId("");
        getTemplateListV2Request.setType("");
        getTemplateListV2Request.setSort("");
        getTemplateListV2Request.setAscending(false);
        getTemplateListV2Request.setPageNo(0);
        getTemplateListV2Request.setPageSize(0);
        getTemplateListV2Request.setSupportedInstanceType("");
        try {
            GetTemplateListV2Response response = client.getTemplateListV2(getTemplateListV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
