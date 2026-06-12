package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.CreateDatasetRequest;
import com.baidubce.aihc.models.CreateDatasetResponse;
import com.baidubce.aihc.models.DatasetVersionEntry;
import java.util.ArrayList;

public class ExampleCreateDataset {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AihcClient client = new AihcClient(bceClientConfig);
        DatasetVersionEntry initVersionEntry = new DatasetVersionEntry();
        initVersionEntry.setId("");
        initVersionEntry.setVersion("");
        initVersionEntry.setDescription("");
        initVersionEntry.setStoragePath("");
        initVersionEntry.setMountPath("");
        initVersionEntry.setCreateUser("");

        CreateDatasetRequest createDatasetRequest = new CreateDatasetRequest();
        createDatasetRequest.setName("");
        createDatasetRequest.setStorageType("");
        createDatasetRequest.setStorageInstance("");
        createDatasetRequest.setImportFormat("");
        createDatasetRequest.setDescription("");
        createDatasetRequest.setOwner("");
        createDatasetRequest.setVisibilityScope("");
        createDatasetRequest.setVisibilityUser(new ArrayList<>());
        createDatasetRequest.setVisibilityGroup(new ArrayList<>());
        createDatasetRequest.setInitVersionEntry(initVersionEntry);
        try {
            CreateDatasetResponse response = client.createDataset(createDatasetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
