package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListReservedInstanceTransferOutRequest;
import com.baidubce.bcc.models.ListReservedInstanceTransferOutResponse;
import java.util.ArrayList;

public class ExampleListReservedInstanceTransferOut {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListReservedInstanceTransferOutRequest listReservedInstanceTransferOutRequest = new ListReservedInstanceTransferOutRequest();
        listReservedInstanceTransferOutRequest.setMarker("");
        listReservedInstanceTransferOutRequest.setMaxKeys(0);
        listReservedInstanceTransferOutRequest.setReservedInstanceIds(new ArrayList<>());
        listReservedInstanceTransferOutRequest.setTransferRecordIds(new ArrayList<>());
        listReservedInstanceTransferOutRequest.setSpec("");
        listReservedInstanceTransferOutRequest.setStatus("");
        try {
            ListReservedInstanceTransferOutResponse response = client.listReservedInstanceTransferOut(listReservedInstanceTransferOutRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
