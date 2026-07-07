package com.baidubce.bci.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bci.BciClient;
import com.baidubce.bci.models.CreateInstanceRequest;
import com.baidubce.bci.models.CreateInstanceResponse;
import com.baidubce.bci.models.Volume;
import java.util.ArrayList;

public class ExampleCreateInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BciClient client = new BciClient(bceClientConfig);
        Volume volume = new Volume();
        volume.setNfs(new ArrayList<>());
        volume.setEmptyDir(new ArrayList<>());
        volume.setConfigFile(new ArrayList<>());

        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest();
        createInstanceRequest.setClientToken("");
        createInstanceRequest.setName("");
        createInstanceRequest.setZoneName("");
        createInstanceRequest.setSecurityGroupIds(new ArrayList<>());
        createInstanceRequest.setSubnetIds(new ArrayList<>());
        createInstanceRequest.setRestartPolicy("");
        createInstanceRequest.setEipIp("");
        createInstanceRequest.setAutoCreateEip(false);
        createInstanceRequest.setEipName("");
        createInstanceRequest.setEipRouteType("");
        createInstanceRequest.setEipBandwidthInMbps(0);
        createInstanceRequest.setEipBillingMethod("");
        createInstanceRequest.setGpuType("");
        createInstanceRequest.setTerminationGracePeriodSeconds(0L);
        createInstanceRequest.setHostName("");
        createInstanceRequest.setTags(new ArrayList<>());
        createInstanceRequest.setImageRegistryCredentials(new ArrayList<>());
        createInstanceRequest.setContainers(new ArrayList<>());
        createInstanceRequest.setInitContainers(new ArrayList<>());
        createInstanceRequest.setVolume(volume);
        try {
            CreateInstanceResponse response = client.createInstance(createInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
