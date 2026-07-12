package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.UpdateTemplateV2Request;
import com.baidubce.oos.models.UpdateTemplateV2Response;
import java.util.ArrayList;

public class ExampleUpdateTemplateV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        UpdateTemplateV2Request updateTemplateV2Request = new UpdateTemplateV2Request();
        updateTemplateV2Request.setNamespace("");
        updateTemplateV2Request.setId("");
        updateTemplateV2Request.setName("");
        updateTemplateV2Request.setDescription("");
        updateTemplateV2Request.setTags(new ArrayList<>());
        updateTemplateV2Request.setLinear(false);
        updateTemplateV2Request.setParallelism(0);
        updateTemplateV2Request.setOperators(new ArrayList<>());
        updateTemplateV2Request.setLinks(new ArrayList<>());
        updateTemplateV2Request.setProperties(new ArrayList<>());
        try {
            UpdateTemplateV2Response response = client.updateTemplateV2(updateTemplateV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
