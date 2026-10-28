package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.AddIpv6Request;
import com.baidubce.bcc.models.AddIpv6Response;

public class ExampleAddIpv6 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        AddIpv6Request addIpv6Request = new AddIpv6Request();
        addIpv6Request.setInstanceId("");
        addIpv6Request.setIpv6Address("");
        addIpv6Request.setReboot(false);
        try {
            AddIpv6Response response = client.addIpv6(addIpv6Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
