package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.ResubmitDedicatedChannelRequest;
import java.util.ArrayList;

public class ExampleResubmitDedicatedChannel {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        EtClient client = new EtClient(bceClientConfig);
        ResubmitDedicatedChannelRequest resubmitDedicatedChannelRequest = new ResubmitDedicatedChannelRequest();
        resubmitDedicatedChannelRequest.setEtId("");
        resubmitDedicatedChannelRequest.setEtChannelId("");
        resubmitDedicatedChannelRequest.setClientToken("");
        resubmitDedicatedChannelRequest.setAuthorizedUsers(new ArrayList<>());
        resubmitDedicatedChannelRequest.setDescription("");
        resubmitDedicatedChannelRequest.setBaiduAddress("");
        resubmitDedicatedChannelRequest.setName("");
        resubmitDedicatedChannelRequest.setNetworks(new ArrayList<>());
        resubmitDedicatedChannelRequest.setCustomerAddress("");
        resubmitDedicatedChannelRequest.setRouteType("");
        resubmitDedicatedChannelRequest.setVlanId(0);
        resubmitDedicatedChannelRequest.setEnableIpv6(0);
        resubmitDedicatedChannelRequest.setBaiduIpv6Address("");
        resubmitDedicatedChannelRequest.setCustomerIpv6Address("");
        resubmitDedicatedChannelRequest.setIpv6Networks(new ArrayList<>());
        try {
            client.resubmitDedicatedChannel(resubmitDedicatedChannelRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
