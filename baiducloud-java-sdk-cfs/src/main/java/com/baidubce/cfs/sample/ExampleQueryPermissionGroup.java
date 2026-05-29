package com.baidubce.cfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfs.CfsClient;
import com.baidubce.cfs.models.QueryPermissionGroupRequest;
import com.baidubce.cfs.models.QueryPermissionGroupResponse;

public class ExampleQueryPermissionGroup {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CfsClient client = new CfsClient(config);
        QueryPermissionGroupRequest queryPermissionGroupRequest = new QueryPermissionGroupRequest();
        queryPermissionGroupRequest.setAgName("");
        queryPermissionGroupRequest.setMarker("");
        queryPermissionGroupRequest.setMaxKeys(0);
        try {
            QueryPermissionGroupResponse response = client.queryPermissionGroup(queryPermissionGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
