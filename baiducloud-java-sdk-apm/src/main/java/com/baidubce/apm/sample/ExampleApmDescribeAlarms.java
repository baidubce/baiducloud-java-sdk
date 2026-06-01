package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.ApmDescribeAlarmsRequest;
import com.baidubce.apm.models.ApmDescribeAlarmsResponse;

public class ExampleApmDescribeAlarms {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        ApmDescribeAlarmsRequest apmDescribeAlarmsRequest = new ApmDescribeAlarmsRequest();
        apmDescribeAlarmsRequest.setBeginDatetime("");
        apmDescribeAlarmsRequest.setEndDatetime("");
        apmDescribeAlarmsRequest.setPolicyName("");
        apmDescribeAlarmsRequest.setLevel("");
        apmDescribeAlarmsRequest.setMetricKind("");
        apmDescribeAlarmsRequest.setState("");
        apmDescribeAlarmsRequest.setOrderBy("");
        apmDescribeAlarmsRequest.setOrder("");
        apmDescribeAlarmsRequest.setPageNo(0);
        apmDescribeAlarmsRequest.setPageSize(0);
        try {
            ApmDescribeAlarmsResponse response = client.apmDescribeAlarms(apmDescribeAlarmsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
