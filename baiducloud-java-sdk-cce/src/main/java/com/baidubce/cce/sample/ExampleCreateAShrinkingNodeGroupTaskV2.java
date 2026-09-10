package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.CreateAShrinkingNodeGroupTaskV2Request;
import com.baidubce.cce.models.DeleteOption;
import com.baidubce.cce.models.CreateAShrinkingNodeGroupTaskV2Response;
import java.util.ArrayList;

public class ExampleCreateAShrinkingNodeGroupTaskV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        DeleteOption deleteOption = new DeleteOption();
        deleteOption.setDeleteResource(false);
        deleteOption.setDeleteCDSSnapshot(false);
        deleteOption.setMoveOut(false);

        CreateAShrinkingNodeGroupTaskV2Request createAShrinkingNodeGroupTaskV2Request = new CreateAShrinkingNodeGroupTaskV2Request();
        createAShrinkingNodeGroupTaskV2Request.setClusterID("");
        createAShrinkingNodeGroupTaskV2Request.setInstanceGroupID("");
        createAShrinkingNodeGroupTaskV2Request.setInstancesToBeRemoved(new ArrayList<>());
        createAShrinkingNodeGroupTaskV2Request.setK8sNodesToBeRemoved(new ArrayList<>());
        createAShrinkingNodeGroupTaskV2Request.setCleanPolicy("");
        createAShrinkingNodeGroupTaskV2Request.setDeleteOption(deleteOption);
        try {
            CreateAShrinkingNodeGroupTaskV2Response response = client.createAShrinkingNodeGroupTaskV2(createAShrinkingNodeGroupTaskV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
