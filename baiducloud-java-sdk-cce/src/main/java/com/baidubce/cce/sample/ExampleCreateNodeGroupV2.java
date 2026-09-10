package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.CreateNodeGroupV2Request;
import com.baidubce.cce.models.ClusterAutoscalerSpec;
import com.baidubce.cce.models.CreateNodeGroupV2Response;
import com.baidubce.cce.models.InstanceTemplate;
import java.util.ArrayList;

public class ExampleCreateNodeGroupV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        InstanceTemplate instanceTemplate = new InstanceTemplate();
        instanceTemplate.setMachineType("");
        instanceTemplate.setInstanceType("");
        instanceTemplate.setInstanceName("");
        instanceTemplate.setVpcConfig(null);
        instanceTemplate.setInstanceResource(null);
        instanceTemplate.setCheckGPUDriver(false);
        instanceTemplate.setImageID("");
        instanceTemplate.setUserData(null);
        instanceTemplate.setInstanceOS(null);
        instanceTemplate.setScaleDownDisabled(false);
        instanceTemplate.setIsOpenHostnameDomain(false);
        instanceTemplate.setNeedEIP(false);
        instanceTemplate.setEipOption(null);
        instanceTemplate.setIamRole(null);
        instanceTemplate.setDeployCustomConfig(null);
        instanceTemplate.setRuntimeType("");
        instanceTemplate.setRuntimeVersion("");
        instanceTemplate.setDeploySetIDs(new ArrayList<>());
        instanceTemplate.setLabels(java.util.Collections.singletonMap("key", ""));
        instanceTemplate.setAnnotations(java.util.Collections.singletonMap("key", ""));
        instanceTemplate.setTags(new ArrayList<>());
        instanceTemplate.setTaints(new ArrayList<>());
        instanceTemplate.setRelationTag(false);
        instanceTemplate.setInstancePreChargingOption(null);

        ClusterAutoscalerSpec clusterAutoscalerSpec = new ClusterAutoscalerSpec();
        clusterAutoscalerSpec.setEnabled(false);
        clusterAutoscalerSpec.setMinReplicas(0);
        clusterAutoscalerSpec.setMaxReplicas(0);
        clusterAutoscalerSpec.setScalingGroupPriority(0);

        CreateNodeGroupV2Request createNodeGroupV2Request = new CreateNodeGroupV2Request();
        createNodeGroupV2Request.setClusterID("");
        createNodeGroupV2Request.setInstanceGroupName("");
        createNodeGroupV2Request.setClusterRole("");
        createNodeGroupV2Request.setShrinkPolicy("");
        createNodeGroupV2Request.setUpdatePolicy("");
        createNodeGroupV2Request.setCleanPolicy("");
        createNodeGroupV2Request.setInstanceTemplate(instanceTemplate);
        createNodeGroupV2Request.setReplicas(0);
        createNodeGroupV2Request.setClusterAutoscalerSpec(clusterAutoscalerSpec);
        try {
            CreateNodeGroupV2Response response = client.createNodeGroupV2(createNodeGroupV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
