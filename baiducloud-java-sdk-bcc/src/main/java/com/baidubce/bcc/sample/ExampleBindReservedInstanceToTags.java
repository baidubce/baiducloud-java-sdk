package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.BindReservedInstanceToTagsRequest;
import java.util.ArrayList;

public class ExampleBindReservedInstanceToTags {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        BindReservedInstanceToTagsRequest bindReservedInstanceToTagsRequest = new BindReservedInstanceToTagsRequest();
        bindReservedInstanceToTagsRequest.setReservedInstanceIds(new ArrayList<>());
        bindReservedInstanceToTagsRequest.setChangeTags(new ArrayList<>());
        try {
            client.bindReservedInstanceToTags(bindReservedInstanceToTagsRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
