package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeAlarmPoliciesRequest;
import com.baidubce.bcm.models.DescribeAlarmPoliciesResponse;

public class ExampleDescribeAlarmPolicies {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        DescribeAlarmPoliciesRequest describeAlarmPoliciesRequest = new DescribeAlarmPoliciesRequest();
        describeAlarmPoliciesRequest.setPolicyName("");
        describeAlarmPoliciesRequest.setPolicyId("");
        describeAlarmPoliciesRequest.setScope("");
        describeAlarmPoliciesRequest.setResourceType("");
        describeAlarmPoliciesRequest.setRecursive(false);
        describeAlarmPoliciesRequest.setSubResourceType("");
        describeAlarmPoliciesRequest.setNotifyEnabled(false);
        describeAlarmPoliciesRequest.setType("");
        describeAlarmPoliciesRequest.setOrder("");
        describeAlarmPoliciesRequest.setOrderBy("");
        describeAlarmPoliciesRequest.setPageNo(0);
        describeAlarmPoliciesRequest.setPageSize(0);
        try {
            DescribeAlarmPoliciesResponse response = client.describeAlarmPolicies(describeAlarmPoliciesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
