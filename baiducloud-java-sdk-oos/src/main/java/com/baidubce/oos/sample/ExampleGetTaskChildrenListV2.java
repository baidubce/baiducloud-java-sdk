package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.GetTaskChildrenListV2Request;
import com.baidubce.oos.models.GetTaskChildrenListV2Response;
import java.util.ArrayList;

public class ExampleGetTaskChildrenListV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        GetTaskChildrenListV2Request getTaskChildrenListV2Request = new GetTaskChildrenListV2Request();
        getTaskChildrenListV2Request.setLocale("");
        getTaskChildrenListV2Request.setExecutionId("");
        getTaskChildrenListV2Request.setTaskId("");
        getTaskChildrenListV2Request.setNamespace("");
        getTaskChildrenListV2Request.setStates(new ArrayList<>());
        getTaskChildrenListV2Request.setPageNo(0);
        getTaskChildrenListV2Request.setPageSize(0);
        try {
            GetTaskChildrenListV2Response response = client.getTaskChildrenListV2(getTaskChildrenListV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
