package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.UpdateNodeAttributesV2Request;
import com.baidubce.cce.models.UpdateNodeAttributesV2Response;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleUpdateNodeAttributesV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        UpdateNodeAttributesV2Request updateNodeAttributesV2Request = new UpdateNodeAttributesV2Request();
        updateNodeAttributesV2Request.setClusterID("");
        updateNodeAttributesV2Request.setInstanceID("");
        updateNodeAttributesV2Request.setLabels(new HashMap<>());
        updateNodeAttributesV2Request.setAnnotations(new HashMap<>());
        updateNodeAttributesV2Request.setTaints(new ArrayList<>());
        updateNodeAttributesV2Request.setCceInstancePriority(0);
        try {
            UpdateNodeAttributesV2Response response = client.updateNodeAttributesV2(updateNodeAttributesV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
