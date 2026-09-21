package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.SetConfigUsingPOSTRequest;

public class ExampleSetConfigUsingPOST {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        SetConfigUsingPOSTRequest setConfigUsingPOSTRequest = new SetConfigUsingPOSTRequest();
        setConfigUsingPOSTRequest.setInstanceId("");
        setConfigUsingPOSTRequest.setEngineType("");
        setConfigUsingPOSTRequest.setAutoBackupConfig("");
        setConfigUsingPOSTRequest.setAutoBackupEnabled(false);
        setConfigUsingPOSTRequest.setIsEncrypt("");
        try {
            client.setConfigUsingPOST(setConfigUsingPOSTRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
