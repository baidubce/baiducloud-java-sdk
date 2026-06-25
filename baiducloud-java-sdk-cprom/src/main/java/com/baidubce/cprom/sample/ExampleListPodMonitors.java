package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.ListPodMonitorsRequest;
import com.baidubce.cprom.models.ListPodMonitorsResponse;

public class ExampleListPodMonitors {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        ListPodMonitorsRequest listPodMonitorsRequest = new ListPodMonitorsRequest();
        listPodMonitorsRequest.setInstanceId("");
        listPodMonitorsRequest.setAgentId("");
        listPodMonitorsRequest.setPageNo(0);
        listPodMonitorsRequest.setPageSize(0);
        listPodMonitorsRequest.setKeywordType("");
        listPodMonitorsRequest.setKeyword("");
        listPodMonitorsRequest.setOrderBy("");
        listPodMonitorsRequest.setOrder("");
        try {
            ListPodMonitorsResponse response = client.listPodMonitors(listPodMonitorsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
