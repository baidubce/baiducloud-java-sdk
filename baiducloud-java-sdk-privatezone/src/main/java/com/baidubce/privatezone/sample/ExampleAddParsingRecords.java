package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.AddParsingRecordsRequest;
import com.baidubce.privatezone.models.AddParsingRecordsResponse;

public class ExampleAddParsingRecords {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        AddParsingRecordsRequest addParsingRecordsRequest = new AddParsingRecordsRequest();
        addParsingRecordsRequest.setZoneId("");
        addParsingRecordsRequest.setClientToken("");
        addParsingRecordsRequest.setRr("");
        addParsingRecordsRequest.setValue("");
        addParsingRecordsRequest.setType("");
        addParsingRecordsRequest.setPriority(0);
        addParsingRecordsRequest.setTtl(0);
        addParsingRecordsRequest.setDescription("");
        try {
            AddParsingRecordsResponse response = client.addParsingRecords(addParsingRecordsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
