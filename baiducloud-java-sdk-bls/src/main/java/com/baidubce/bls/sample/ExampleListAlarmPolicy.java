package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListAlarmPolicyRequest;
import com.baidubce.bls.models.ListAlarmPolicyResponse;

public class ExampleListAlarmPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        ListAlarmPolicyRequest listAlarmPolicyRequest = new ListAlarmPolicyRequest();
        listAlarmPolicyRequest.setPolicyNamePattern("");
        listAlarmPolicyRequest.setPolicyIdPattern("");
        listAlarmPolicyRequest.setLogStoreNamePattern("");
        listAlarmPolicyRequest.setState("");
        listAlarmPolicyRequest.setNoticeState("");
        listAlarmPolicyRequest.setOrderBy("");
        listAlarmPolicyRequest.setOrder("");
        listAlarmPolicyRequest.setPageNo(0);
        listAlarmPolicyRequest.setPageSize(0);
        try {
            ListAlarmPolicyResponse response = client.listAlarmPolicy(listAlarmPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
