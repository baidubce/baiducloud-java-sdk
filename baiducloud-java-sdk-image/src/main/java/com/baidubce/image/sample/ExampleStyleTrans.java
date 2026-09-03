package com.baidubce.image.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.image.ImageClient;
import com.baidubce.image.models.StyleTransRequest;
import com.baidubce.image.models.StyleTransResponse;

public class ExampleStyleTrans {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        // String ak = "Your Ak";
        // String sk = "Your Sk";
        // bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        // ==== AccessToken 鉴权（API Key / Secret Key 换取 AccessToken）====
        // String apiKey = "Your ApiKey";
        // String secretKey = "Your SecretKey";
        // bceClientConfig.setCredentials(new BceAccessTokenCredentials(apiKey, secretKey));

        // ==== API Key 鉴权 ====
        String apiKey = "Your ApiKey";
        bceClientConfig.setCredentials(new BceApiKeyCredentials(apiKey));

        ImageClient client = new ImageClient(bceClientConfig);
        StyleTransRequest styleTransRequest = new StyleTransRequest();
        styleTransRequest.setOption("");
        styleTransRequest.setImage("");
        styleTransRequest.setUrl("");
        try {
            StyleTransResponse response = client.styleTrans(styleTransRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
