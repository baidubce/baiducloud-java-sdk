package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.CreateInstanceRequest;
import com.baidubce.rapidfs.models.CreateInstanceResponse;
import java.util.ArrayList;

public class ExampleCreateInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(config);
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest();
        createInstanceRequest.setClientToken("");
        createInstanceRequest.setInstanceName("");
        createInstanceRequest.setDescription("");
        createInstanceRequest.setZone("");
        createInstanceRequest.setVpcId("");
        createInstanceRequest.setSubnetId("");
        createInstanceRequest.setManagedMode("");
        createInstanceRequest.setMetaSpec("");
        createInstanceRequest.setDataSpec("");
        createInstanceRequest.setType("");
        createInstanceRequest.setCapacityTiB(0);
        createInstanceRequest.setCceClusterId("");
        createInstanceRequest.setAihcResourcePoolId("");
        createInstanceRequest.setK8sControllerId("");
        createInstanceRequest.setK8sControllerToken("");
        createInstanceRequest.setTokenRefreshIntervalMinutes(0);
        createInstanceRequest.setTags(new ArrayList<>());
        try {
            CreateInstanceResponse response = client.createInstance(createInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
