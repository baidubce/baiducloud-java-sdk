package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.CreateResolverRuleRequest;
import com.baidubce.privatezone.models.CreateResolverRuleResponse;
import com.baidubce.privatezone.models.DnsServerConfig;

import java.util.ArrayList;
import java.util.List;

public class ExampleCreateResolverRule {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        CreateResolverRuleRequest createResolverRuleRequest = new CreateResolverRuleRequest();
        createResolverRuleRequest.setClientToken("");
        createResolverRuleRequest.setName("");
        createResolverRuleRequest.setDescription("");
        createResolverRuleRequest.setZone("");
        createResolverRuleRequest.setResolverId("");
        List<DnsServerConfig> dnsServerConfigs = new ArrayList<>();
        DnsServerConfig dnsServerConfig = new DnsServerConfig();
        dnsServerConfig.setIp("");
        dnsServerConfig.setPort(42);
        dnsServerConfigs.add(dnsServerConfig);
        createResolverRuleRequest.setDnsServerConfigs(dnsServerConfigs);
        try {
            CreateResolverRuleResponse response = client.createResolverRule(createResolverRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
