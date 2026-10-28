package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.BindRoleRequest;
import com.baidubce.bcc.models.BindRoleResponse;
import java.util.ArrayList;

public class ExampleBindRole {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        BindRoleRequest bindRoleRequest = new BindRoleRequest();
        bindRoleRequest.setRoleName("");
        bindRoleRequest.setInstances(new ArrayList<>());
        try {
            BindRoleResponse response = client.bindRole(bindRoleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
