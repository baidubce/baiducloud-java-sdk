package com.baidubce.cloudassistant.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cloudassistant.CloudassistantClient;
import com.baidubce.cloudassistant.models.ActionRunRequest;
import com.baidubce.cloudassistant.models.TargetSelector;
import com.baidubce.cloudassistant.models.TargetImport;
import com.baidubce.cloudassistant.models.ActionRunResponse;
import java.util.ArrayList;

public class ExampleActionRun {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CloudassistantClient client = new CloudassistantClient(bceClientConfig);
        TargetSelector targetSelector = new TargetSelector();
        targetSelector.setInstanceType("");
        targetSelector.setTags(new ArrayList<>());
        TargetImport importInstances = new TargetImport();
        importInstances.setKeywordType("");
        importInstances.setInstances(new ArrayList<>());

        targetSelector.setImportInstances(importInstances);

        ActionRunRequest actionRunRequest = new ActionRunRequest();
        actionRunRequest.setLocale("");
        actionRunRequest.setAction(null);
        actionRunRequest.setParameters(null);
        actionRunRequest.setTargetSelectorType("");
        actionRunRequest.setTargets(new ArrayList<>());
        actionRunRequest.setTargetSelector(targetSelector);
        try {
            ActionRunResponse response = client.actionRun(actionRunRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
