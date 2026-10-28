package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.InstanceBatchResizeBySpecRequest;
import com.baidubce.bcc.models.InstanceBatchResizeBySpecResponse;
import java.util.ArrayList;

public class ExampleInstanceBatchResizeBySpec {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        InstanceBatchResizeBySpecRequest instanceBatchResizeBySpecRequest = new InstanceBatchResizeBySpecRequest();
        instanceBatchResizeBySpecRequest.setSpec("");
        instanceBatchResizeBySpecRequest.setInstanceIdList(new ArrayList<>());
        instanceBatchResizeBySpecRequest.setEnableJumboFrame(false);
        instanceBatchResizeBySpecRequest.setSubnetId("");
        instanceBatchResizeBySpecRequest.setLogicalZone("");
        try {
            InstanceBatchResizeBySpecResponse response = client.instanceBatchResizeBySpec(instanceBatchResizeBySpecRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
