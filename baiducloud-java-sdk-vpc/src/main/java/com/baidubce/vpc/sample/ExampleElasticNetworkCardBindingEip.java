package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ElasticNetworkCardBindingEipRequest;

public class ExampleElasticNetworkCardBindingEip {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        ElasticNetworkCardBindingEipRequest elasticNetworkCardBindingEipRequest = new ElasticNetworkCardBindingEipRequest();
        elasticNetworkCardBindingEipRequest.setEniId("");
        elasticNetworkCardBindingEipRequest.setClientToken("");
        elasticNetworkCardBindingEipRequest.setPrivateIpAddress("");
        elasticNetworkCardBindingEipRequest.setPublicIpAddress("");
        try {
            client.elasticNetworkCardBindingEip(elasticNetworkCardBindingEipRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
