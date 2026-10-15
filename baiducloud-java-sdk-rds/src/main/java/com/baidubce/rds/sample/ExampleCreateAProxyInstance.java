package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.CreateAProxyInstanceRequest;
import com.baidubce.rds.models.CreateAProxyInstanceResponse;
import com.baidubce.rds.models.Billing;
import java.util.ArrayList;

public class ExampleCreateAProxyInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        billing.setReservation(null);

        CreateAProxyInstanceRequest createAProxyInstanceRequest = new CreateAProxyInstanceRequest();
        createAProxyInstanceRequest.setClientToken("");
        createAProxyInstanceRequest.setBilling(billing);
        createAProxyInstanceRequest.setSourceInstanceId("");
        createAProxyInstanceRequest.setInstanceName("");
        createAProxyInstanceRequest.setNodeAmount(0);
        createAProxyInstanceRequest.setZoneNames(new ArrayList<>());
        createAProxyInstanceRequest.setVpcId("");
        createAProxyInstanceRequest.setIsDirectPay(false);
        createAProxyInstanceRequest.setSubnets(new ArrayList<>());
        createAProxyInstanceRequest.setOvip("");
        createAProxyInstanceRequest.setEntryPort(0);
        createAProxyInstanceRequest.setResourceGroupId("");
        try {
            CreateAProxyInstanceResponse response = client.createAProxyInstance(createAProxyInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
