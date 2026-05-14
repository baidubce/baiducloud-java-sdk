package com.baidubce.snic.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.snic.SnicClient;
import com.baidubce.snic.models.ListSnicRequest;
import com.baidubce.snic.models.ListSnicResponse;

public class ExampleListSnic {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        SnicClient client = new SnicClient(config);
        ListSnicRequest listSnicRequest = new ListSnicRequest();
        listSnicRequest.setVpcId("");
        listSnicRequest.setName("");
        listSnicRequest.setIpAddress("");
        listSnicRequest.setStatus("");
        listSnicRequest.setSubnetId("");
        listSnicRequest.setService("");
        listSnicRequest.setMarker("");
        listSnicRequest.setMaxKeys(0);
        try {
            ListSnicResponse response = client.listSnic(listSnicRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
