package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListVolumeClustersRequest;
import com.baidubce.bcc.models.ListVolumeClustersResponse;

public class ExampleListVolumeClusters {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        ListVolumeClustersRequest listVolumeClustersRequest = new ListVolumeClustersRequest();
        listVolumeClustersRequest.setMarker("");
        listVolumeClustersRequest.setMaxKeys(0);
        listVolumeClustersRequest.setZoneName("");
        listVolumeClustersRequest.setClusterName("");
        try {
            ListVolumeClustersResponse response = client.listVolumeClusters(listVolumeClustersRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
