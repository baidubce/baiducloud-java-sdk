package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.SearchForDetailsOfPrivatzoneRequest;
import com.baidubce.privatezone.models.SearchForDetailsOfPrivatzoneResponse;

public class ExampleSearchForDetailsOfPrivatzone {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        SearchForDetailsOfPrivatzoneRequest searchForDetailsOfPrivatzoneRequest = new SearchForDetailsOfPrivatzoneRequest();
        searchForDetailsOfPrivatzoneRequest.setZoneId("");
        try {
            SearchForDetailsOfPrivatzoneResponse response = client.searchForDetailsOfPrivatzone(searchForDetailsOfPrivatzoneRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
