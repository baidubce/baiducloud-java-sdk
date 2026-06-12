package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeAlarmsRequest;
import com.baidubce.bcm.models.DescribeAlarmsResponse;

public class ExampleDescribeAlarms {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        DescribeAlarmsRequest describeAlarmsRequest = new DescribeAlarmsRequest();
        describeAlarmsRequest.setStartTime("");
        describeAlarmsRequest.setEndTime("");
        describeAlarmsRequest.setPolicyName("");
        describeAlarmsRequest.setScope("");
        describeAlarmsRequest.setResourceType("");
        describeAlarmsRequest.setState("");
        describeAlarmsRequest.setType("");
        describeAlarmsRequest.setOrder("");
        describeAlarmsRequest.setOrderBy("");
        describeAlarmsRequest.setPageNo(0);
        describeAlarmsRequest.setPageSize(0);
        try {
            DescribeAlarmsResponse response = client.describeAlarms(describeAlarmsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
