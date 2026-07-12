package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.CheckTemplateV2Request;
import com.baidubce.oos.models.CheckTemplateV2Response;
import java.util.ArrayList;

public class ExampleCheckTemplateV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        CheckTemplateV2Request checkTemplateV2Request = new CheckTemplateV2Request();
        checkTemplateV2Request.setName("");
        checkTemplateV2Request.setDescription("");
        checkTemplateV2Request.setTags(new ArrayList<>());
        checkTemplateV2Request.setLinear(false);
        checkTemplateV2Request.setParallelism(0);
        checkTemplateV2Request.setOperators(new ArrayList<>());
        checkTemplateV2Request.setLinks(new ArrayList<>());
        checkTemplateV2Request.setProperties(new ArrayList<>());
        try {
            CheckTemplateV2Response response = client.checkTemplateV2(checkTemplateV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
