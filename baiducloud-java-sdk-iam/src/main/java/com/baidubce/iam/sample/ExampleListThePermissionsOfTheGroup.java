package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.ListThePermissionsOfTheGroupRequest;
import com.baidubce.iam.models.ListThePermissionsOfTheGroupResponse;

public class ExampleListThePermissionsOfTheGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        IamClient client = new IamClient(bceClientConfig);
        ListThePermissionsOfTheGroupRequest listThePermissionsOfTheGroupRequest = new ListThePermissionsOfTheGroupRequest();
        listThePermissionsOfTheGroupRequest.setGroupName("");
        try {
            ListThePermissionsOfTheGroupResponse response = client.listThePermissionsOfTheGroup(listThePermissionsOfTheGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
