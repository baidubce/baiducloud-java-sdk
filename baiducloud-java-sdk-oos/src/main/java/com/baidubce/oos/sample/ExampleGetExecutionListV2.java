package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.GetExecutionListV2Request;
import com.baidubce.oos.models.GetExecutionListV2Response;

public class ExampleGetExecutionListV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        GetExecutionListV2Request getExecutionListV2Request = new GetExecutionListV2Request();
        getExecutionListV2Request.setLocale("");
        getExecutionListV2Request.setNamespace("");
        getExecutionListV2Request.setTemplate(null);
        getExecutionListV2Request.setState("");
        getExecutionListV2Request.setTrigger("");
        getExecutionListV2Request.setCronExecutionName("");
        getExecutionListV2Request.setEventExecutionName("");
        getExecutionListV2Request.setStartTime(0);
        getExecutionListV2Request.setEndTime(0);
        getExecutionListV2Request.setSort("");
        getExecutionListV2Request.setAscending(false);
        getExecutionListV2Request.setPageNo(0);
        getExecutionListV2Request.setPageSize(0);
        try {
            GetExecutionListV2Response response = client.getExecutionListV2(getExecutionListV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
