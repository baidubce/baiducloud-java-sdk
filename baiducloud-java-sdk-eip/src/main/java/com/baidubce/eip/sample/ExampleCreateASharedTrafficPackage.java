package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.CreateASharedTrafficPackageRequest;
import com.baidubce.eip.models.CreateASharedTrafficPackageResponse;

public class ExampleCreateASharedTrafficPackage {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EipClient client = new EipClient(config);
        CreateASharedTrafficPackageRequest createASharedTrafficPackageRequest = new CreateASharedTrafficPackageRequest();
        createASharedTrafficPackageRequest.setClientToken("");
        createASharedTrafficPackageRequest.setReservationLength(0);
        createASharedTrafficPackageRequest.setCapacity("");
        createASharedTrafficPackageRequest.setDeductPolicy("");
        createASharedTrafficPackageRequest.setPackageType("");
        try {
            CreateASharedTrafficPackageResponse response = client.createASharedTrafficPackage(createASharedTrafficPackageRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
