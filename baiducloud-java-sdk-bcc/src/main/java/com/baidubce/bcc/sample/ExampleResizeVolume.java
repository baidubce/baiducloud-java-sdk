package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ResizeVolumeRequest;
import com.baidubce.bcc.models.ResizeVolumeResponse;

public class ExampleResizeVolume {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BccClient client = new BccClient(config);
        ResizeVolumeRequest resizeVolumeRequest = new ResizeVolumeRequest();
        resizeVolumeRequest.setVolumeId("");
        resizeVolumeRequest.setNewCdsSizeInGB(0);
        resizeVolumeRequest.setNewExtraIO(0);
        resizeVolumeRequest.setNewVolumeType("");
        try {
            ResizeVolumeResponse response = client.resizeVolume(resizeVolumeRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
