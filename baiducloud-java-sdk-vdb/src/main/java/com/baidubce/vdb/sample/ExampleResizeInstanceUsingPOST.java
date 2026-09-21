package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.ResizeInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.ResizeInstanceUsingPOSTResponse;
import java.util.ArrayList;

public class ExampleResizeInstanceUsingPOST {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        ResizeInstanceUsingPOSTRequest resizeInstanceUsingPOSTRequest = new ResizeInstanceUsingPOSTRequest();
        resizeInstanceUsingPOSTRequest.setEngineType("");
        resizeInstanceUsingPOSTRequest.setComponents(new ArrayList<>());
        resizeInstanceUsingPOSTRequest.setDataNodeNum(0);
        resizeInstanceUsingPOSTRequest.setDiskFlavor(0);
        resizeInstanceUsingPOSTRequest.setDiskType("");
        resizeInstanceUsingPOSTRequest.setEnv("");
        resizeInstanceUsingPOSTRequest.setInstanceId("");
        resizeInstanceUsingPOSTRequest.setMasterNodeSpec("");
        resizeInstanceUsingPOSTRequest.setMasterNum(0);
        resizeInstanceUsingPOSTRequest.setNodeSpec("");
        resizeInstanceUsingPOSTRequest.setNodeType("");
        resizeInstanceUsingPOSTRequest.setOrderId("");
        resizeInstanceUsingPOSTRequest.setProxyNodeSpec("");
        resizeInstanceUsingPOSTRequest.setProxyNum(0);
        try {
            ResizeInstanceUsingPOSTResponse response = client.resizeInstanceUsingPOST(resizeInstanceUsingPOSTRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
