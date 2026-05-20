package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.UpgradeTheFreeDomainNameToTheUniversalVersionRequest;
import java.util.ArrayList;

public class ExampleUpgradeTheFreeDomainNameToTheUniversalVersion {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        DnsClient client = new DnsClient(config);
        UpgradeTheFreeDomainNameToTheUniversalVersionRequest upgradeTheFreeDomainNameToTheUniversalVersionRequest = new UpgradeTheFreeDomainNameToTheUniversalVersionRequest();
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setAction("");
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setClientToken("");
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setNames(new ArrayList<>());
        upgradeTheFreeDomainNameToTheUniversalVersionRequest.setBilling(new ArrayList<>());
        try {
            client.upgradeTheFreeDomainNameToTheUniversalVersion(upgradeTheFreeDomainNameToTheUniversalVersionRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
