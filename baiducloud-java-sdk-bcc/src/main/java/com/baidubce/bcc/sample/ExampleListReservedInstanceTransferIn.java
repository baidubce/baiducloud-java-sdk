package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListReservedInstanceTransferInRequest;
import com.baidubce.bcc.models.ListReservedInstanceTransferInResponse;
import java.util.ArrayList;

public class ExampleListReservedInstanceTransferIn {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListReservedInstanceTransferInRequest listReservedInstanceTransferInRequest = new ListReservedInstanceTransferInRequest();
        listReservedInstanceTransferInRequest.setMarker("");
        listReservedInstanceTransferInRequest.setMaxKeys(0);
        listReservedInstanceTransferInRequest.setReservedInstanceIds(new ArrayList<>());
        listReservedInstanceTransferInRequest.setTransferRecordIds(new ArrayList<>());
        listReservedInstanceTransferInRequest.setSpec("");
        listReservedInstanceTransferInRequest.setStatus("");
        try {
            ListReservedInstanceTransferInResponse response = client.listReservedInstanceTransferIn(listReservedInstanceTransferInRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
