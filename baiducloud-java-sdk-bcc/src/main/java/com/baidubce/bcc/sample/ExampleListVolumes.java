package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListVolumesRequest;
import com.baidubce.bcc.models.ListVolumesResponse;

public class ExampleListVolumes {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListVolumesRequest listVolumesRequest = new ListVolumesRequest();
        listVolumesRequest.setMarker("");
        listVolumesRequest.setMaxKeys(0);
        listVolumesRequest.setInstanceId("");
        listVolumesRequest.setZoneName("");
        listVolumesRequest.setClusterId("");
        listVolumesRequest.setChargeFilter("");
        listVolumesRequest.setUsageFilter("");
        listVolumesRequest.setName("");
        listVolumesRequest.setProductCategory("");
        try {
            ListVolumesResponse response = client.listVolumes(listVolumesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
