package com.baidubce.cfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfs.CfsClient;
import com.baidubce.cfs.models.UpdatePermissionGroupRulesRequest;

public class ExampleUpdatePermissionGroupRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CfsClient client = new CfsClient(config);
        UpdatePermissionGroupRulesRequest updatePermissionGroupRulesRequest = new UpdatePermissionGroupRulesRequest();
        updatePermissionGroupRulesRequest.setAgName("");
        updatePermissionGroupRulesRequest.setArId("");
        updatePermissionGroupRulesRequest.setIp("");
        updatePermissionGroupRulesRequest.setMask(0);
        updatePermissionGroupRulesRequest.setWriteAccess("");
        updatePermissionGroupRulesRequest.setUserAccess("");
        updatePermissionGroupRulesRequest.setPriority(0);
        try {
            client.updatePermissionGroupRules(updatePermissionGroupRulesRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
