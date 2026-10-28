package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.DeletePrepayInstanceRequest;
import com.baidubce.bcc.models.DeletePrepayInstanceResponse;

public class ExampleDeletePrepayInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        DeletePrepayInstanceRequest deletePrepayInstanceRequest = new DeletePrepayInstanceRequest();
        deletePrepayInstanceRequest.setInstanceId("");
        deletePrepayInstanceRequest.setRelatedReleaseFlag(false);
        deletePrepayInstanceRequest.setDeleteCdsSnapshotFlag(false);
        deletePrepayInstanceRequest.setDeleteRelatedEnisFlag(false);
        try {
            DeletePrepayInstanceResponse response = client.deletePrepayInstance(deletePrepayInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
