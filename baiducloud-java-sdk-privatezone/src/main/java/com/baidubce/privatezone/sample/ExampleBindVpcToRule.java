package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.BindVpcToRuleRequest;
import com.baidubce.privatezone.models.VpcRegion;

import java.util.ArrayList;
import java.util.List;

public class ExampleBindVpcToRule {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        BindVpcToRuleRequest bindVpcToRuleRequest = new BindVpcToRuleRequest();
        bindVpcToRuleRequest.setRuleId("");
        bindVpcToRuleRequest.setClienToken("");
        List<VpcRegion> vpcRegions = new ArrayList<>();
        VpcRegion vpcRegion = new VpcRegion();
        List<String> vpcIds = new ArrayList<>();
        vpcIds.add("");
        vpcRegion.setVpcIds(vpcIds);
        vpcRegion.setRegion("");
        vpcRegions.add(vpcRegion);
        bindVpcToRuleRequest.setVpcRegions(vpcRegions);
        try {
            client.bindVpcToRule(bindVpcToRuleRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
