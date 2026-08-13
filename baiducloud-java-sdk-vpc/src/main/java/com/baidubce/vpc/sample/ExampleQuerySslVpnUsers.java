package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QuerySslVpnUsersRequest;
import com.baidubce.vpc.models.QuerySslVpnUsersResponse;

public class ExampleQuerySslVpnUsers {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        QuerySslVpnUsersRequest querySslVpnUsersRequest = new QuerySslVpnUsersRequest();
        querySslVpnUsersRequest.setVpnId("");
        querySslVpnUsersRequest.setMarker("");
        querySslVpnUsersRequest.setMaxKeys(0);
        querySslVpnUsersRequest.setUserName("");
        try {
            QuerySslVpnUsersResponse response = client.querySslVpnUsers(querySslVpnUsersRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
