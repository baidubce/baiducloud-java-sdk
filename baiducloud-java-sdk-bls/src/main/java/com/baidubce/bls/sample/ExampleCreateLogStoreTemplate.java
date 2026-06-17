package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.CreateLogStoreTemplateRequest;
import com.baidubce.bls.models.Index;
import com.baidubce.bls.models.Template;
import com.baidubce.bls.models.CreateLogStoreTemplateResponse;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleCreateLogStoreTemplate {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        Template template = new Template();
        template.setRetention(0);
        template.setShardCount(0);
        template.setDisableShardAutoSplit(false);
        template.setMaxShardCount(0);
        template.setEnableHotRetention(false);
        template.setHotRetention(0);
        Index index = new Index();
        index.setFulltext(false);
        index.setCaseSensitive(false);
        index.setIncludeChinese(false);
        index.setSeparators("");
        index.setFields(new HashMap<>());

        template.setIndex(index);
        template.setName("");
        template.setProjectPatterns(new ArrayList<>());
        template.setLogstorePatterns(new ArrayList<>());
        template.setPriority(0);
        template.setCreatedTimestamp("");
        template.setUpdatedTimestamp("");

        CreateLogStoreTemplateRequest createLogStoreTemplateRequest = new CreateLogStoreTemplateRequest();
        createLogStoreTemplateRequest.setName("");
        createLogStoreTemplateRequest.setProjectPatterns(new ArrayList<>());
        createLogStoreTemplateRequest.setLogstorePatterns(new ArrayList<>());
        createLogStoreTemplateRequest.setPriority(0);
        createLogStoreTemplateRequest.setTemplate(template);
        try {
            CreateLogStoreTemplateResponse response = client.createLogStoreTemplate(createLogStoreTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
