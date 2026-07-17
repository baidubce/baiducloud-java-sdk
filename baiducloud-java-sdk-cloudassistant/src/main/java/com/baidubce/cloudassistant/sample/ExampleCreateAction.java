package com.baidubce.cloudassistant.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cloudassistant.CloudassistantClient;
import com.baidubce.cloudassistant.models.CreateActionRequest;
import com.baidubce.cloudassistant.models.Action;
import com.baidubce.cloudassistant.models.Command;
import com.baidubce.cloudassistant.models.TargetSelector;
import com.baidubce.cloudassistant.models.TargetImport;
import com.baidubce.cloudassistant.models.CreateActionResponse;
import com.baidubce.cloudassistant.models.FileUpload;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleCreateAction {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CloudassistantClient client = new CloudassistantClient(bceClientConfig);
        Action action = new Action();
        action.setId("");
        action.setRef("");
        action.setType("");
        action.setName("");
        action.setAlias("");
        action.setDescription("");
        action.setTimeoutSecond(0);
        Command command = new Command();
        command.setType("");
        command.setContent("");
        command.setScope("");
        command.setEnableParameter(false);
        command.setParameters(new ArrayList<>());
        command.setUser("");
        command.setWorkDir("");
        command.setExecParams(null);
        command.setWaitOnAgentMilli(0);

        action.setCommand(command);
        FileUpload fileUpload = new FileUpload();
        fileUpload.setOs("");
        fileUpload.setContent("");
        fileUpload.setFilename("");
        fileUpload.setFilepath("");
        fileUpload.setBosBucketName("");
        fileUpload.setBosFilePath("");
        fileUpload.setBosEtag("");
        fileUpload.setUser("");
        fileUpload.setGroup("");
        fileUpload.setMode("");
        fileUpload.setOverwrite(false);

        action.setFileUpload(fileUpload);
        action.setSupportedInstanceTypes(new ArrayList<>());
        action.setCreatedTimestamp(0L);
        action.setUpdatedTimestamp(0L);

        TargetSelector targetSelector = new TargetSelector();
        targetSelector.setInstanceType("");
        targetSelector.setTags(new ArrayList<>());
        TargetImport importInstances = new TargetImport();
        importInstances.setKeywordType("");
        importInstances.setInstances(new ArrayList<>());

        targetSelector.setImportInstances(importInstances);

        CreateActionRequest createActionRequest = new CreateActionRequest();
        createActionRequest.setExecution("");
        createActionRequest.setAction(action);
        createActionRequest.setParameters(new HashMap<>());
        createActionRequest.setTargetSelectorType("");
        createActionRequest.setTargets(new ArrayList<>());
        createActionRequest.setTargetSelector(targetSelector);
        try {
            CreateActionResponse response = client.createAction(createActionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
