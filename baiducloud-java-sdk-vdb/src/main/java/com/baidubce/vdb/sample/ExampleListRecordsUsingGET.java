package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.ListRecordsUsingGETRequest;
import com.baidubce.vdb.models.ListRecordsUsingGETResponse;

public class ExampleListRecordsUsingGET {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        ListRecordsUsingGETRequest listRecordsUsingGETRequest = new ListRecordsUsingGETRequest();
        listRecordsUsingGETRequest.setInstanceId("");
        listRecordsUsingGETRequest.setEngineType("");
        listRecordsUsingGETRequest.setListOrder("");
        listRecordsUsingGETRequest.setPage("");
        listRecordsUsingGETRequest.setPageSize("");
        try {
            ListRecordsUsingGETResponse response = client.listRecordsUsingGET(listRecordsUsingGETRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
