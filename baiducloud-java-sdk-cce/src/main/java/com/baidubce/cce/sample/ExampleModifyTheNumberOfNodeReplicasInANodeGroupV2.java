package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.ModifyTheNumberOfNodeReplicasInANodeGroupV2Request;
import com.baidubce.cce.models.DeleteOption;
import com.baidubce.cce.models.ModifyTheNumberOfNodeReplicasInANodeGroupV2Response;
import java.util.ArrayList;

public class ExampleModifyTheNumberOfNodeReplicasInANodeGroupV2 {
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

        ModifyTheNumberOfNodeReplicasInANodeGroupV2Request modifyTheNumberOfNodeReplicasInANodeGroupV2Request = new ModifyTheNumberOfNodeReplicasInANodeGroupV2Request();
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setClusterID("");
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setInstanceGroupID("");
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setReplicas(0);
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setInstanceIDs(new ArrayList<>());
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setDeleteInstance(false);
        modifyTheNumberOfNodeReplicasInANodeGroupV2Request.setDeleteOption(deleteOption);
        try {
            ModifyTheNumberOfNodeReplicasInANodeGroupV2Response response = client.modifyTheNumberOfNodeReplicasInANodeGroupV2(modifyTheNumberOfNodeReplicasInANodeGroupV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
