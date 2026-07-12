package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.GetOperatorListV2Request;
import com.baidubce.oos.models.GetOperatorListV2Response;

public class ExampleGetOperatorListV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        GetOperatorListV2Request getOperatorListV2Request = new GetOperatorListV2Request();
        getOperatorListV2Request.setLocale("");
        getOperatorListV2Request.setOperator(null);
        getOperatorListV2Request.setSort("");
        getOperatorListV2Request.setAscending(false);
        getOperatorListV2Request.setPageNo(0);
        getOperatorListV2Request.setPageSize(0);
        try {
            GetOperatorListV2Response response = client.getOperatorListV2(getOperatorListV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
