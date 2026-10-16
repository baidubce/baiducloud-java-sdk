package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbIpGroupRequest;
import com.baidubce.blb.models.CreateAppBlbIpGroupResponse;
import java.util.ArrayList;

public class ExampleCreateAppBlbIpGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        CreateAppBlbIpGroupRequest createAppBlbIpGroupRequest = new CreateAppBlbIpGroupRequest();
        createAppBlbIpGroupRequest.setBlbId("");
        createAppBlbIpGroupRequest.setClientToken("");
        createAppBlbIpGroupRequest.setName("");
        createAppBlbIpGroupRequest.setDesc("");
        createAppBlbIpGroupRequest.setPreserveClientIpEnabled(false);
        createAppBlbIpGroupRequest.setGroupTargetType("");
        createAppBlbIpGroupRequest.setMemberList(new ArrayList<>());
        try {
            CreateAppBlbIpGroupResponse response = client.createAppBlbIpGroup(createAppBlbIpGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
