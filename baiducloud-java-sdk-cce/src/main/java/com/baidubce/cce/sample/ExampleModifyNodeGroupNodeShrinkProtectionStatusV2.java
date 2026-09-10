package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.ModifyNodeGroupNodeShrinkProtectionStatusV2Request;
import com.baidubce.cce.models.ModifyNodeGroupNodeShrinkProtectionStatusV2Response;
import java.util.ArrayList;

public class ExampleModifyNodeGroupNodeShrinkProtectionStatusV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        ModifyNodeGroupNodeShrinkProtectionStatusV2Request modifyNodeGroupNodeShrinkProtectionStatusV2Request = new ModifyNodeGroupNodeShrinkProtectionStatusV2Request();
        modifyNodeGroupNodeShrinkProtectionStatusV2Request.setClusterID("");
        modifyNodeGroupNodeShrinkProtectionStatusV2Request.setInstanceIDs(new ArrayList<>());
        modifyNodeGroupNodeShrinkProtectionStatusV2Request.setScaleDownDisabled(false);
        try {
            ModifyNodeGroupNodeShrinkProtectionStatusV2Response response = client.modifyNodeGroupNodeShrinkProtectionStatusV2(modifyNodeGroupNodeShrinkProtectionStatusV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
