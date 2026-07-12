package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.CreateExecutionV2Request;
import com.baidubce.oos.models.CreateExecutionV2Response;
import com.baidubce.oos.models.Template;
import java.util.ArrayList;

public class ExampleCreateExecutionV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        Template template = new Template();
        template.setId("");
        template.setRef("");
        template.setName("");
        template.setType("");
        template.setDescription("");
        template.setTags(new ArrayList<>());
        template.setLinear(false);
        template.setParallelism(0);
        template.setOperators(new ArrayList<>());
        template.setLinks(new ArrayList<>());
        template.setProperties(new ArrayList<>());
        template.setUpdatedTime("");
        template.setSupportedInstanceTypes(new ArrayList<>());

        CreateExecutionV2Request createExecutionV2Request = new CreateExecutionV2Request();
        createExecutionV2Request.setLocale("");
        createExecutionV2Request.setDescription("");
        createExecutionV2Request.setTemplate(template);
        createExecutionV2Request.setParallelism(0);
        createExecutionV2Request.setManually(false);
        createExecutionV2Request.setProperties(null);
        createExecutionV2Request.setTags(new ArrayList<>());
        try {
            CreateExecutionV2Response response = client.createExecutionV2(createExecutionV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
