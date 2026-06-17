package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.UpdateLogStoreTemplateRequest;
import com.baidubce.bls.models.Index;
import com.baidubce.bls.models.UpdateLogStoreTemplateResponse;
import com.baidubce.bls.models.Template;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleUpdateLogStoreTemplate {
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

        UpdateLogStoreTemplateRequest updateLogStoreTemplateRequest = new UpdateLogStoreTemplateRequest();
        updateLogStoreTemplateRequest.setName("");
        updateLogStoreTemplateRequest.setProjectPatterns(new ArrayList<>());
        updateLogStoreTemplateRequest.setLogstorePatterns(new ArrayList<>());
        updateLogStoreTemplateRequest.setPriority(0);
        updateLogStoreTemplateRequest.setTemplate(template);
        try {
            UpdateLogStoreTemplateResponse response = client.updateLogStoreTemplate(updateLogStoreTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
