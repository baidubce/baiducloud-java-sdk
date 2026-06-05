package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.DnsServerConfig;
import com.baidubce.privatezone.models.UpdateResolverRuleRequest;

import java.util.ArrayList;
import java.util.List;

public class ExampleUpdateResolverRule {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        UpdateResolverRuleRequest updateResolverRuleRequest = new UpdateResolverRuleRequest();
        updateResolverRuleRequest.setReluId("");
        updateResolverRuleRequest.setClientToken("");
        updateResolverRuleRequest.setName("");
        updateResolverRuleRequest.setDescription("");
        List<DnsServerConfig> dnsServerConfigs = new ArrayList<>();
        DnsServerConfig dnsServerConfig = new DnsServerConfig();
        dnsServerConfig.setIp("12.29.2.4");
        dnsServerConfig.setPort(53);
        dnsServerConfigs.add(dnsServerConfig);
        updateResolverRuleRequest.setDnsServerConfigs(dnsServerConfigs);
        try {
            client.updateResolverRule(updateResolverRuleRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
