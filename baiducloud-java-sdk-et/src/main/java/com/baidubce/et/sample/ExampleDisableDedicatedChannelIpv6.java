package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.DisableDedicatedChannelIpv6Request;

public class ExampleDisableDedicatedChannelIpv6 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        EtClient client = new EtClient(bceClientConfig);
        DisableDedicatedChannelIpv6Request disableDedicatedChannelIpv6Request = new DisableDedicatedChannelIpv6Request();
        disableDedicatedChannelIpv6Request.setEtId("");
        disableDedicatedChannelIpv6Request.setEtChannelId("");
        disableDedicatedChannelIpv6Request.setClientToken("");
        try {
            client.disableDedicatedChannelIpv6(disableDedicatedChannelIpv6Request);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
