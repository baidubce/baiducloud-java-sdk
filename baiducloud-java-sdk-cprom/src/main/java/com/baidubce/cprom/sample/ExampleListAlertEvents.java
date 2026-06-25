package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.ListAlertEventsRequest;
import com.baidubce.cprom.models.ListAlertEventsResponse;

public class ExampleListAlertEvents {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        ListAlertEventsRequest listAlertEventsRequest = new ListAlertEventsRequest();
        listAlertEventsRequest.setStartTime(0);
        listAlertEventsRequest.setEndTime(0);
        listAlertEventsRequest.setPageNo(0);
        listAlertEventsRequest.setPageSize(0);
        listAlertEventsRequest.setMonitorInstanceId("");
        listAlertEventsRequest.setAlertingRuleId("");
        listAlertEventsRequest.setAlertingRuleName("");
        listAlertEventsRequest.setNotifyRuleId("");
        listAlertEventsRequest.setNotifyRuleName("");
        listAlertEventsRequest.setSeverity("");
        listAlertEventsRequest.setStatus("");
        listAlertEventsRequest.setExpr("");
        listAlertEventsRequest.setOrderBy("");
        listAlertEventsRequest.setOrder("");
        listAlertEventsRequest.setAlarmTags("");
        try {
            ListAlertEventsResponse response = client.listAlertEvents(listAlertEventsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
