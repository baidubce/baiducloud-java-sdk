package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.CreateInstanceGroupRequest;
import com.baidubce.bcm.models.CreateInstanceGroupResponse;
import java.util.ArrayList;

public class ExampleCreateInstanceGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        CreateInstanceGroupRequest createInstanceGroupRequest = new CreateInstanceGroupRequest();
        createInstanceGroupRequest.setScope("");
        createInstanceGroupRequest.setResourceType("");
        createInstanceGroupRequest.setName("");
        createInstanceGroupRequest.setInstances(new ArrayList<>());
        try {
            CreateInstanceGroupResponse response = client.createInstanceGroup(createInstanceGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
