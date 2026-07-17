package com.baidubce.cloudassistant.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cloudassistant.CloudassistantClient;
import com.baidubce.cloudassistant.models.ActionListRequest;
import com.baidubce.cloudassistant.models.ActionListResponse;
import com.baidubce.cloudassistant.models.CommandFilter;
import com.baidubce.cloudassistant.models.FileUploadFilter;
import com.baidubce.cloudassistant.models.ActionFilter;

public class ExampleActionList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CloudassistantClient client = new CloudassistantClient(bceClientConfig);
        ActionFilter action = new ActionFilter();
        action.setId("");
        action.setName("");
        action.setType("");
        CommandFilter command = new CommandFilter();
        command.setScope("");
        command.setName("");
        command.setType("");

        action.setCommand(command);
        FileUploadFilter fileUpload = new FileUploadFilter();
        fileUpload.setFilename("");

        action.setFileUpload(fileUpload);

        ActionListRequest actionListRequest = new ActionListRequest();
        actionListRequest.setLocale("");
        actionListRequest.setPageNo(0);
        actionListRequest.setPageSize(0);
        actionListRequest.setSort("");
        actionListRequest.setAscending(false);
        actionListRequest.setAction(action);
        try {
            ActionListResponse response = client.actionList(actionListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
