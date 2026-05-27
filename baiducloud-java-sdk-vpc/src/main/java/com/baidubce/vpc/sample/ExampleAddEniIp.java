package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.AddEniIpRequest;
import com.baidubce.vpc.models.AddEniIpResponse;

public class ExampleAddEniIp {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        AddEniIpRequest addEniIpRequest = new AddEniIpRequest();
        addEniIpRequest.setEniId("");
        addEniIpRequest.setClientToken("");
        addEniIpRequest.setIsIpv6(false);
        addEniIpRequest.setPrivateIpAddress("");
        try {
            AddEniIpResponse response = client.addEniIp(addEniIpRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
