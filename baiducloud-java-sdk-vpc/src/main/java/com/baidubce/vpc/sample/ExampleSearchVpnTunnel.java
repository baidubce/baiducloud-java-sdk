package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.SearchVpnTunnelRequest;
import com.baidubce.vpc.models.SearchVpnTunnelResponse;

public class ExampleSearchVpnTunnel {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        SearchVpnTunnelRequest searchVpnTunnelRequest = new SearchVpnTunnelRequest();
        searchVpnTunnelRequest.setVpnId("");
        searchVpnTunnelRequest.setClientToken("");
        try {
            SearchVpnTunnelResponse response = client.searchVpnTunnel(searchVpnTunnelRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
