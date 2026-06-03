package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.CheckBeforeCreateInstanceRequest;
import com.baidubce.rapidfs.models.CheckBeforeCreateInstanceResponse;

public class ExampleCheckBeforeCreateInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(config);
        CheckBeforeCreateInstanceRequest checkBeforeCreateInstanceRequest = new CheckBeforeCreateInstanceRequest();
        checkBeforeCreateInstanceRequest.setZone("");
        checkBeforeCreateInstanceRequest.setVpcId("");
        checkBeforeCreateInstanceRequest.setSubnetId("");
        checkBeforeCreateInstanceRequest.setManagedMode("");
        checkBeforeCreateInstanceRequest.setMetaSpec("");
        checkBeforeCreateInstanceRequest.setDataSpec("");
        checkBeforeCreateInstanceRequest.setType("");
        checkBeforeCreateInstanceRequest.setCapacityTiB(0);
        checkBeforeCreateInstanceRequest.setCceClusterId("");
        checkBeforeCreateInstanceRequest.setAihcResourcePoolId("");
        checkBeforeCreateInstanceRequest.setK8sControllerId("");
        checkBeforeCreateInstanceRequest.setK8sControllerToken("");
        try {
            CheckBeforeCreateInstanceResponse response = client.checkBeforeCreateInstance(checkBeforeCreateInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
