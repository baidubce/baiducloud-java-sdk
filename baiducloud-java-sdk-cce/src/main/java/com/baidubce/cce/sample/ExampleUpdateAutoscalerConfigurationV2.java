package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.UpdateAutoscalerConfigurationV2Request;
import com.baidubce.cce.models.UpdateAutoscalerConfigurationV2Response;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleUpdateAutoscalerConfigurationV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        UpdateAutoscalerConfigurationV2Request updateAutoscalerConfigurationV2Request = new UpdateAutoscalerConfigurationV2Request();
        updateAutoscalerConfigurationV2Request.setClusterID("");
        updateAutoscalerConfigurationV2Request.setExpander("");
        updateAutoscalerConfigurationV2Request.setInstanceGroups(new ArrayList<>());
        updateAutoscalerConfigurationV2Request.setKubeVersion("");
        updateAutoscalerConfigurationV2Request.setMaxEmptyBulkDelete(0);
        updateAutoscalerConfigurationV2Request.setScaleDownDelayAfterAdd(0);
        updateAutoscalerConfigurationV2Request.setScaleDownEnabled(false);
        updateAutoscalerConfigurationV2Request.setScaleDownGPUUtilizationThreshold(0);
        updateAutoscalerConfigurationV2Request.setScaleDownUnneededTime(0);
        updateAutoscalerConfigurationV2Request.setScaleDownUtilizationThreshold(0);
        updateAutoscalerConfigurationV2Request.setSkipNodesWithLocalStorage(false);
        updateAutoscalerConfigurationV2Request.setSkipNodesWithSystemPods(false);
        updateAutoscalerConfigurationV2Request.setCustomConfigs(new HashMap<>());
        try {
            UpdateAutoscalerConfigurationV2Response response = client.updateAutoscalerConfigurationV2(updateAutoscalerConfigurationV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
