package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.ModifyIGAutoScalerRequest;
import com.baidubce.cce.models.ModifyIGAutoScalerResponse;

public class ExampleModifyIGAutoScaler {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        ModifyIGAutoScalerRequest modifyIGAutoScalerRequest = new ModifyIGAutoScalerRequest();
        modifyIGAutoScalerRequest.setClusterID("");
        modifyIGAutoScalerRequest.setInstanceGroupID("");
        modifyIGAutoScalerRequest.setEnabled(false);
        modifyIGAutoScalerRequest.setMinReplicas(0);
        modifyIGAutoScalerRequest.setMaxReplicas(0);
        modifyIGAutoScalerRequest.setScalingGroupPriority(0);
        try {
            ModifyIGAutoScalerResponse response = client.modifyIGAutoScaler(modifyIGAutoScalerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
