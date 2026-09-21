package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.ModifyPublicAccessUsingPUTRequest;

public class ExampleModifyPublicAccessUsingPUT {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        ModifyPublicAccessUsingPUTRequest modifyPublicAccessUsingPUTRequest = new ModifyPublicAccessUsingPUTRequest();
        modifyPublicAccessUsingPUTRequest.setInstanceId("");
        modifyPublicAccessUsingPUTRequest.setPublicAccess(false);
        try {
            client.modifyPublicAccessUsingPUT(modifyPublicAccessUsingPUTRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
