package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.SlowLogDownloadDetailsRequest;
import com.baidubce.rds.models.SlowLogDownloadDetailsResponse;

public class ExampleSlowLogDownloadDetails {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        SlowLogDownloadDetailsRequest slowLogDownloadDetailsRequest = new SlowLogDownloadDetailsRequest();
        slowLogDownloadDetailsRequest.setInstanceId("");
        slowLogDownloadDetailsRequest.setLogId("");
        slowLogDownloadDetailsRequest.setDownloadValidTimeInSec(0);
        try {
            SlowLogDownloadDetailsResponse response = client.slowLogDownloadDetails(slowLogDownloadDetailsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
