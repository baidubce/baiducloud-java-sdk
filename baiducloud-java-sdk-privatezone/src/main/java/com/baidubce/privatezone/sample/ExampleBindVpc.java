package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.BindVpcRequest;

import java.util.*;

public class ExampleBindVpc {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        BindVpcRequest bindVpcRequest = new BindVpcRequest();
        bindVpcRequest.setZoneId("zone-3k8dt2sy97u5");
        bindVpcRequest.setAction("bind");
        bindVpcRequest.setClientToken("");
        bindVpcRequest.setRegion("bj");
        bindVpcRequest.setVpcIds(new ArrayList<>(Arrays.asList("vpc-8zn7k6fny75x")));
        try {
            client.bindVpc(bindVpcRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
