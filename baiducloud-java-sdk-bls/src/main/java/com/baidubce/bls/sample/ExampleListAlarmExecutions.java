package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListAlarmExecutionsRequest;
import com.baidubce.bls.models.ListAlarmExecutionsResponse;
import java.util.ArrayList;

public class ExampleListAlarmExecutions {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        ListAlarmExecutionsRequest listAlarmExecutionsRequest = new ListAlarmExecutionsRequest();
        listAlarmExecutionsRequest.setPolicyId("");
        listAlarmExecutionsRequest.setLogStoreName("");
        listAlarmExecutionsRequest.setState("");
        listAlarmExecutionsRequest.setNoticeStates(new ArrayList<>());
        listAlarmExecutionsRequest.setStartDateTime("");
        listAlarmExecutionsRequest.setEndDateTime("");
        listAlarmExecutionsRequest.setOrderBy("");
        listAlarmExecutionsRequest.setOrder("");
        listAlarmExecutionsRequest.setPageNo(0);
        listAlarmExecutionsRequest.setPageSize(0);
        try {
            ListAlarmExecutionsResponse response = client.listAlarmExecutions(listAlarmExecutionsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
