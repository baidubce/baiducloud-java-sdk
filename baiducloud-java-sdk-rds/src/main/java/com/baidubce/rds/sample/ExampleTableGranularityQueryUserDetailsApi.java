package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.TableGranularityQueryUserDetailsApiRequest;
import com.baidubce.rds.models.TableGranularityQueryUserDetailsApiResponse;

public class ExampleTableGranularityQueryUserDetailsApi {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        TableGranularityQueryUserDetailsApiRequest tableGranularityQueryUserDetailsApiRequest = new TableGranularityQueryUserDetailsApiRequest();
        tableGranularityQueryUserDetailsApiRequest.setInstanceId("");
        tableGranularityQueryUserDetailsApiRequest.setUser("");
        tableGranularityQueryUserDetailsApiRequest.setHost("");
        try {
            TableGranularityQueryUserDetailsApiResponse response = client.tableGranularityQueryUserDetailsApi(tableGranularityQueryUserDetailsApiRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
