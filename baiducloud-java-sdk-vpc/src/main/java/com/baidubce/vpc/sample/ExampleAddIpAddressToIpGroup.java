package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.AddIpAddressToIpGroupRequest;
import java.util.ArrayList;

public class ExampleAddIpAddressToIpGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        AddIpAddressToIpGroupRequest addIpAddressToIpGroupRequest = new AddIpAddressToIpGroupRequest();
        addIpAddressToIpGroupRequest.setIpSetId("");
        addIpAddressToIpGroupRequest.setClientToken("");
        addIpAddressToIpGroupRequest.setIpAddressInfo(new ArrayList<>());
        try {
            client.addIpAddressToIpGroup(addIpAddressToIpGroupRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
