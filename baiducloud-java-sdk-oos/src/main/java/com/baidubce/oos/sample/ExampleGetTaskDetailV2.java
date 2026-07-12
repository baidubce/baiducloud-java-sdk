package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.GetTaskDetailV2Request;
import com.baidubce.oos.models.GetTaskDetailV2Response;

public class ExampleGetTaskDetailV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        GetTaskDetailV2Request getTaskDetailV2Request = new GetTaskDetailV2Request();
        getTaskDetailV2Request.setDagId("");
        getTaskDetailV2Request.setTaskId("");
        getTaskDetailV2Request.setNamespace("");
        getTaskDetailV2Request.setIgnoreChildren("");
        getTaskDetailV2Request.setLocale("");
        try {
            GetTaskDetailV2Response response = client.getTaskDetailV2(getTaskDetailV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
