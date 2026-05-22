package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateARegularSecurityGroupV2Request;
import com.baidubce.vpc.models.CreateARegularSecurityGroupV2Response;
import java.util.ArrayList;

public class ExampleCreateARegularSecurityGroupV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        CreateARegularSecurityGroupV2Request createARegularSecurityGroupV2Request = new CreateARegularSecurityGroupV2Request();
        createARegularSecurityGroupV2Request.setClientToken("");
        createARegularSecurityGroupV2Request.setName("");
        createARegularSecurityGroupV2Request.setVpcId("");
        createARegularSecurityGroupV2Request.setDesc("");
        createARegularSecurityGroupV2Request.setRules(new ArrayList<>());
        createARegularSecurityGroupV2Request.setTags(new ArrayList<>());
        try {
            CreateARegularSecurityGroupV2Response response = client.createARegularSecurityGroupV2(createARegularSecurityGroupV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
