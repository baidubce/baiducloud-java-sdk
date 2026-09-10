package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.DeleteNodesClusterScalingV2Request;
import com.baidubce.cce.models.DeleteOption;
import com.baidubce.cce.models.DeleteNodesClusterScalingV2Response;
import java.util.ArrayList;

public class ExampleDeleteNodesClusterScalingV2 {
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

        DeleteNodesClusterScalingV2Request deleteNodesClusterScalingV2Request = new DeleteNodesClusterScalingV2Request();
        deleteNodesClusterScalingV2Request.setClusterID("");
        deleteNodesClusterScalingV2Request.setDeleteOption(deleteOption);
        deleteNodesClusterScalingV2Request.setInstanceIDs(new ArrayList<>());
        deleteNodesClusterScalingV2Request.setScaleDown(false);
        try {
            DeleteNodesClusterScalingV2Response response = client.deleteNodesClusterScalingV2(deleteNodesClusterScalingV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
