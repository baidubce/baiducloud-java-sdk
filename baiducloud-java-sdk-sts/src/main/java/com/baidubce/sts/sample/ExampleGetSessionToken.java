package com.baidubce.sts.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.sts.StsClient;
import com.baidubce.sts.models.GetSessionTokenRequest;
import com.baidubce.sts.models.GetSessionTokenResponse;

public class ExampleGetSessionToken {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        StsClient client = new StsClient(bceClientConfig);
        GetSessionTokenRequest getSessionTokenRequest = new GetSessionTokenRequest();
        getSessionTokenRequest.setDurationSeconds("");
        getSessionTokenRequest.setAccessControlList("");
        getSessionTokenRequest.setAttachment("");
        try {
            GetSessionTokenResponse response = client.getSessionToken(getSessionTokenRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
