package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ChangeToPrepaidRequest;
import com.baidubce.bcc.models.ChangeToPrepaidResponse;

public class ExampleChangeToPrepaid {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ChangeToPrepaidRequest changeToPrepaidRequest = new ChangeToPrepaidRequest();
        changeToPrepaidRequest.setInstanceId("");
        changeToPrepaidRequest.setDuration(0);
        changeToPrepaidRequest.setAutoRenew(false);
        changeToPrepaidRequest.setAutoRenewPeriod(0);
        changeToPrepaidRequest.setRelationCds(false);
        try {
            ChangeToPrepaidResponse response = client.changeToPrepaid(changeToPrepaidRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
