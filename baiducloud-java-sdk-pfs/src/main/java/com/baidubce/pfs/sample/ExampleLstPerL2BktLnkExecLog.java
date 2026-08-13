package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.LstPerL2BktLnkExecLogRequest;
import com.baidubce.pfs.models.LstPerL2BktLnkExecLogResponse;

public class ExampleLstPerL2BktLnkExecLog {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        LstPerL2BktLnkExecLogRequest lstPerL2BktLnkExecLogRequest = new LstPerL2BktLnkExecLogRequest();
        lstPerL2BktLnkExecLogRequest.setInstanceId("");
        lstPerL2BktLnkExecLogRequest.setBucketLinkId("");
        lstPerL2BktLnkExecLogRequest.setStartTime(0);
        lstPerL2BktLnkExecLogRequest.setEndTime(0);
        try {
            LstPerL2BktLnkExecLogResponse response = client.lstPerL2BktLnkExecLog(lstPerL2BktLnkExecLogRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
