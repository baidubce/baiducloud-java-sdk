package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.CreateTemplateV2Request;
import com.baidubce.oos.models.CreateTemplateV2Response;
import java.util.ArrayList;

public class ExampleCreateTemplateV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        CreateTemplateV2Request createTemplateV2Request = new CreateTemplateV2Request();
        createTemplateV2Request.setName("");
        createTemplateV2Request.setDescription("");
        createTemplateV2Request.setTags(new ArrayList<>());
        createTemplateV2Request.setLinear(false);
        createTemplateV2Request.setParallelism(0);
        createTemplateV2Request.setOperators(new ArrayList<>());
        createTemplateV2Request.setLinks(new ArrayList<>());
        createTemplateV2Request.setProperties(new ArrayList<>());
        try {
            CreateTemplateV2Response response = client.createTemplateV2(createTemplateV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
