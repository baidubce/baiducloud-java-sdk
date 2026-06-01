package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.CreateDedicatedChannelRequest;
import com.baidubce.et.models.CreateDedicatedChannelResponse;
import java.util.ArrayList;

public class ExampleCreateDedicatedChannel {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EtClient client = new EtClient(config);
        CreateDedicatedChannelRequest createDedicatedChannelRequest = new CreateDedicatedChannelRequest();
        createDedicatedChannelRequest.setEtId("");
        createDedicatedChannelRequest.setClientToken("");
        createDedicatedChannelRequest.setAuthorizedUsers(new ArrayList<>());
        createDedicatedChannelRequest.setDescription("");
        createDedicatedChannelRequest.setBaiduAddress("");
        createDedicatedChannelRequest.setName("");
        createDedicatedChannelRequest.setNetworks(new ArrayList<>());
        createDedicatedChannelRequest.setCustomerAddress("");
        createDedicatedChannelRequest.setRouteType("");
        createDedicatedChannelRequest.setVlanId(0);
        createDedicatedChannelRequest.setBgpAsn("");
        createDedicatedChannelRequest.setBgpKey("");
        createDedicatedChannelRequest.setEnableIpv6(0);
        createDedicatedChannelRequest.setBaiduIpv6Address("");
        createDedicatedChannelRequest.setCustomerIpv6Address("");
        createDedicatedChannelRequest.setIpv6Networks(new ArrayList<>());
        createDedicatedChannelRequest.setTags(new ArrayList<>());
        try {
            CreateDedicatedChannelResponse response = client.createDedicatedChannel(createDedicatedChannelRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
