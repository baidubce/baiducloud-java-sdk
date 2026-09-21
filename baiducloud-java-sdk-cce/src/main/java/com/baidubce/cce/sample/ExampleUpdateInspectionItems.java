package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.UpdateInspectionItemsRequest;
import java.util.HashMap;

public class ExampleUpdateInspectionItems {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        UpdateInspectionItemsRequest updateInspectionItemsRequest = new UpdateInspectionItemsRequest();
        updateInspectionItemsRequest.setClusterID("");
        updateInspectionItemsRequest.set（根元素）(new HashMap<>());
        try {
            client.updateInspectionItems(updateInspectionItemsRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
