package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.UnbindRoleRequest;
import com.baidubce.bcc.models.UnbindRoleResponse;
import java.util.ArrayList;

public class ExampleUnbindRole {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        UnbindRoleRequest unbindRoleRequest = new UnbindRoleRequest();
        unbindRoleRequest.setRoleName("");
        unbindRoleRequest.setInstances(new ArrayList<>());
        try {
            UnbindRoleResponse response = client.unbindRole(unbindRoleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
