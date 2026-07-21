package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.DecodingApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.DecodingApikeyPermanentlyValidResponse;

public class ExampleDecodingApikeyPermanentlyValid {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        IamClient client = new IamClient(bceClientConfig);
        DecodingApikeyPermanentlyValidRequest decodingApikeyPermanentlyValidRequest = new DecodingApikeyPermanentlyValidRequest();
        decodingApikeyPermanentlyValidRequest.setUserId("");
        decodingApikeyPermanentlyValidRequest.setId("");
        try {
            DecodingApikeyPermanentlyValidResponse response = client.decodingApikeyPermanentlyValid(decodingApikeyPermanentlyValidRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
