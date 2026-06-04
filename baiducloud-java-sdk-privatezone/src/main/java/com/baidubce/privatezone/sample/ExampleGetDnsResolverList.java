package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.GetDnsResolverListRequest;
import com.baidubce.privatezone.models.GetDnsResolverListResponse;

public class ExampleGetDnsResolverList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        GetDnsResolverListRequest getDnsResolverListRequest = new GetDnsResolverListRequest();
        getDnsResolverListRequest.setMarker("");
        getDnsResolverListRequest.setMaxKeys("");
        getDnsResolverListRequest.setStatus("");
        try {
            GetDnsResolverListResponse response = client.getDnsResolverList(getDnsResolverListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
