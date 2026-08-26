package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.ImportAlarmTemplatesRequest;
import com.baidubce.bcm.models.ImportAlarmTemplatesResponse;
import java.util.ArrayList;

public class ExampleImportAlarmTemplates {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        ImportAlarmTemplatesRequest importAlarmTemplatesRequest = new ImportAlarmTemplatesRequest();
        importAlarmTemplatesRequest.setOverwrite(false);
        importAlarmTemplatesRequest.setTemplates(new ArrayList<>());
        try {
            ImportAlarmTemplatesResponse response = client.importAlarmTemplates(importAlarmTemplatesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
