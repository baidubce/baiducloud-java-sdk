package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.UpdateInstanceGroupRequest;
import com.baidubce.bcm.models.UpdateInstanceGroupResponse;
import java.util.ArrayList;

public class ExampleUpdateInstanceGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        UpdateInstanceGroupRequest updateInstanceGroupRequest = new UpdateInstanceGroupRequest();
        updateInstanceGroupRequest.setId("");
        updateInstanceGroupRequest.setScope("");
        updateInstanceGroupRequest.setResourceType("");
        updateInstanceGroupRequest.setName("");
        updateInstanceGroupRequest.setInstances(new ArrayList<>());
        try {
            UpdateInstanceGroupResponse response = client.updateInstanceGroup(updateInstanceGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
