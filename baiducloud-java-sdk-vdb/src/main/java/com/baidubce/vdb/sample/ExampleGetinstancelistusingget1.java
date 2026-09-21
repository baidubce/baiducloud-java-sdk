package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.Getinstancelistusingget1Request;
import com.baidubce.vdb.models.Getinstancelistusingget1Response;

public class ExampleGetinstancelistusingget1 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        Getinstancelistusingget1Request getinstancelistusingget1Request = new Getinstancelistusingget1Request();
        getinstancelistusingget1Request.setEngineType("");
        try {
            Getinstancelistusingget1Response response = client.getinstancelistusingget1(getinstancelistusingget1Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
