package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DeleteInstanceGroupInstancesRequest;
import com.baidubce.bcm.models.DeleteInstanceGroupInstancesResponse;
import java.util.ArrayList;

public class ExampleDeleteInstanceGroupInstances {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DeleteInstanceGroupInstancesRequest deleteInstanceGroupInstancesRequest = new DeleteInstanceGroupInstancesRequest();
        deleteInstanceGroupInstancesRequest.setId("");
        deleteInstanceGroupInstancesRequest.setInstances(new ArrayList<>());
        try {
            DeleteInstanceGroupInstancesResponse response = client.deleteInstanceGroupInstances(deleteInstanceGroupInstancesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
