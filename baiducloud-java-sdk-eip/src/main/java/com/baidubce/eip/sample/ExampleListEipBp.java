package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.ListEipBpRequest;
import com.baidubce.eip.models.ListEipBpResponse;

public class ExampleListEipBp {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EipClient client = new EipClient(config);
        ListEipBpRequest listEipBpRequest = new ListEipBpRequest();
        listEipBpRequest.setMarker("");
        listEipBpRequest.setMaxKeys(0);
        listEipBpRequest.setId("");
        listEipBpRequest.setName("");
        listEipBpRequest.setBindType("");
        listEipBpRequest.setType("");
        try {
            ListEipBpResponse response = client.listEipBp(listEipBpRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
