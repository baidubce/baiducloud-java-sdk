package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.GetDnsResolverRuleListRequest;
import com.baidubce.privatezone.models.GetDnsResolverRuleListResponse;

public class ExampleGetDnsResolverRuleList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PrivatezoneClient client = new PrivatezoneClient(bceClientConfig);
        GetDnsResolverRuleListRequest getDnsResolverRuleListRequest = new GetDnsResolverRuleListRequest();
        getDnsResolverRuleListRequest.setMarker("");
        getDnsResolverRuleListRequest.setMaxKeys("");
        getDnsResolverRuleListRequest.setStatus("");
        try {
            GetDnsResolverRuleListResponse response = client.getDnsResolverRuleList(getDnsResolverRuleListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
