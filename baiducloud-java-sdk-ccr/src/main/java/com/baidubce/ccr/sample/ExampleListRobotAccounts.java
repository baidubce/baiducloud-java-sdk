package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.ListRobotAccountsRequest;
import com.baidubce.ccr.models.ListRobotAccountsResponse;

public class ExampleListRobotAccounts {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        ListRobotAccountsRequest listRobotAccountsRequest = new ListRobotAccountsRequest();
        listRobotAccountsRequest.setInstanceId("");
        listRobotAccountsRequest.setStatus("");
        listRobotAccountsRequest.setPageNo(0);
        listRobotAccountsRequest.setPageSize(0);
        try {
            ListRobotAccountsResponse response = client.listRobotAccounts(listRobotAccountsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
