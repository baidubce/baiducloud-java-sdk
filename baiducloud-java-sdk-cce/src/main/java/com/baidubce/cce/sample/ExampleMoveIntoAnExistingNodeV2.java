package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.MoveIntoAnExistingNodeV2Request;
import com.baidubce.cce.models.MoveIntoAnExistingNodeV2Response;
import java.util.ArrayList;

public class ExampleMoveIntoAnExistingNodeV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        MoveIntoAnExistingNodeV2Request moveIntoAnExistingNodeV2Request = new MoveIntoAnExistingNodeV2Request();
        moveIntoAnExistingNodeV2Request.setClusterID("");
        moveIntoAnExistingNodeV2Request.setInstanceGroupID("");
        moveIntoAnExistingNodeV2Request.setInCluster(false);
        moveIntoAnExistingNodeV2Request.setUseInstanceGroupConfig(false);
        moveIntoAnExistingNodeV2Request.setUseInstanceGroupConfigWithDiskInfo(false);
        moveIntoAnExistingNodeV2Request.setInstallGpuDriver(false);
        moveIntoAnExistingNodeV2Request.setExistedInstances(new ArrayList<>());
        moveIntoAnExistingNodeV2Request.setExistedInstancesInCluster(new ArrayList<>());
        try {
            MoveIntoAnExistingNodeV2Response response = client.moveIntoAnExistingNodeV2(moveIntoAnExistingNodeV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
