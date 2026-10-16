package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbServerGroupRequest;
import com.baidubce.blb.models.CreateAppBlbServerGroupResponse;
import java.util.ArrayList;

public class ExampleCreateAppBlbServerGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        CreateAppBlbServerGroupRequest createAppBlbServerGroupRequest = new CreateAppBlbServerGroupRequest();
        createAppBlbServerGroupRequest.setBlbId("");
        createAppBlbServerGroupRequest.setClientToken("");
        createAppBlbServerGroupRequest.setName("");
        createAppBlbServerGroupRequest.setDesc("");
        createAppBlbServerGroupRequest.setPreserveClientIpEnabled(false);
        createAppBlbServerGroupRequest.setBackendServerList(new ArrayList<>());
        try {
            CreateAppBlbServerGroupResponse response = client.createAppBlbServerGroup(createAppBlbServerGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
