package com.baidubce.cfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfs.CfsClient;
import com.baidubce.cfs.models.QueryPermissionGroupRulesRequest;
import com.baidubce.cfs.models.QueryPermissionGroupRulesResponse;

public class ExampleQueryPermissionGroupRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CfsClient client = new CfsClient(config);
        QueryPermissionGroupRulesRequest queryPermissionGroupRulesRequest = new QueryPermissionGroupRulesRequest();
        queryPermissionGroupRulesRequest.setAgName("");
        queryPermissionGroupRulesRequest.setArId("");
        queryPermissionGroupRulesRequest.setMarker("");
        queryPermissionGroupRulesRequest.setMaxKeys(0);
        try {
            QueryPermissionGroupRulesResponse response = client.queryPermissionGroupRules(queryPermissionGroupRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
