package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.InstanceParam;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTResponse;
import java.util.ArrayList;

public class ExampleCreateInstanceUsingPOST {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        InstanceParam instanceParam = new InstanceParam();
        instanceParam.setAvailabilityZone("");
        instanceParam.setAzInfos(new ArrayList<>());
        instanceParam.setCloneDataAppBackupId("");
        instanceParam.setCloneDataAppId("");
        instanceParam.setComponents(new ArrayList<>());
        instanceParam.setDataNodeNum(0);
        instanceParam.setDiskFlavor(0);
        instanceParam.setDiskType("");
        instanceParam.setEnableEmbedding(false);
        instanceParam.setEnableEncryption(false);
        instanceParam.setEngineVersion("");
        instanceParam.setFrom("");
        instanceParam.setInstanceName("");
        instanceParam.setInstanceNum(0);
        instanceParam.setInstanceType("");
        instanceParam.setMasterNodeSpec("");
        instanceParam.setMasterNum(0);
        instanceParam.setNodeSpec("");
        instanceParam.setNodeType("");
        instanceParam.setOrderId("");
        instanceParam.setPassword("");
        instanceParam.setPort(0);
        instanceParam.setProxyNodeSpec("");
        instanceParam.setProxyNum(0);
        instanceParam.setReqSource("");
        instanceParam.setSubnetId("");
        instanceParam.setSwitchEntrance("");
        instanceParam.setVpcId("");

        CreateInstanceUsingPOSTRequest createInstanceUsingPOSTRequest = new CreateInstanceUsingPOSTRequest();
        createInstanceUsingPOSTRequest.setEngineType("");
        createInstanceUsingPOSTRequest.setAutoRenew(false);
        createInstanceUsingPOSTRequest.setAutoRenewTime(0);
        createInstanceUsingPOSTRequest.setAutoRenewTimeUnit("");
        createInstanceUsingPOSTRequest.setComponents(new ArrayList<>());
        createInstanceUsingPOSTRequest.setDuration(0);
        createInstanceUsingPOSTRequest.setEnv("");
        createInstanceUsingPOSTRequest.setInstanceParam(instanceParam);
        createInstanceUsingPOSTRequest.setProductType("");
        createInstanceUsingPOSTRequest.setTimeUnit("");
        try {
            CreateInstanceUsingPOSTResponse response = client.createInstanceUsingPOST(createInstanceUsingPOSTRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
