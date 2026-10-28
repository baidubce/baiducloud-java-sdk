package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListInstancesRequest;
import com.baidubce.bcc.models.ListInstancesResponse;

public class ExampleListInstances {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListInstancesRequest listInstancesRequest = new ListInstancesRequest();
        listInstancesRequest.setMarker("");
        listInstancesRequest.setMaxKeys(0);
        listInstancesRequest.setInternalIp("");
        listInstancesRequest.setDedicatedHostId("");
        listInstancesRequest.setZoneName("");
        listInstancesRequest.setShowRdmaTopo("");
        listInstancesRequest.setInstanceIds("");
        listInstancesRequest.setInstanceNames("");
        listInstancesRequest.setFuzzyInstanceName("");
        listInstancesRequest.setVolumeIds("");
        listInstancesRequest.setDeploySetIds("");
        listInstancesRequest.setSecurityGroupIds("");
        listInstancesRequest.setPaymentTiming("");
        listInstancesRequest.setStatus("");
        listInstancesRequest.setTags("");
        listInstancesRequest.setVpcId("");
        listInstancesRequest.setPrivateIps("");
        listInstancesRequest.setEhcClusterId("");
        try {
            ListInstancesResponse response = client.listInstances(listInstancesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
