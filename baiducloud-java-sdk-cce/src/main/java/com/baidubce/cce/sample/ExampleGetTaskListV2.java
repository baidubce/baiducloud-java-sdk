package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.GetTaskListV2Request;
import com.baidubce.cce.models.GetTaskListV2Response;

public class ExampleGetTaskListV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        GetTaskListV2Request getTaskListV2Request = new GetTaskListV2Request();
        getTaskListV2Request.setTaskType("");
        getTaskListV2Request.setTargetID("");
        getTaskListV2Request.setOperationType("");
        getTaskListV2Request.setPhase("");
        getTaskListV2Request.setOrder("");
        getTaskListV2Request.setOrderBy("");
        getTaskListV2Request.setPageNo(0);
        getTaskListV2Request.setPageSize(0);
        try {
            GetTaskListV2Response response = client.getTaskListV2(getTaskListV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
