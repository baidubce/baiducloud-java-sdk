package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.ErrorLogDownloadDetailsRequest;
import com.baidubce.rds.models.ErrorLogDownloadDetailsResponse;

public class ExampleErrorLogDownloadDetails {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        ErrorLogDownloadDetailsRequest errorLogDownloadDetailsRequest = new ErrorLogDownloadDetailsRequest();
        errorLogDownloadDetailsRequest.setInstanceId("");
        errorLogDownloadDetailsRequest.setLogId("");
        errorLogDownloadDetailsRequest.setDownloadValidTimeInSec(0);
        try {
            ErrorLogDownloadDetailsResponse response = client.errorLogDownloadDetails(errorLogDownloadDetailsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
