package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.CreateADatasetV2Request;
import com.baidubce.aihc.models.CreateADatasetV2Response;
import com.baidubce.aihc.models.DatasetVersionEntry;
import java.util.ArrayList;

public class ExampleCreateADatasetV2 {
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

        CreateADatasetV2Request createADatasetV2Request = new CreateADatasetV2Request();
        createADatasetV2Request.setName("");
        createADatasetV2Request.setStorageType("");
        createADatasetV2Request.setStorageInstance("");
        createADatasetV2Request.setImportFormat("");
        createADatasetV2Request.setDescription("");
        createADatasetV2Request.setOwner("");
        createADatasetV2Request.setVisibilityScope("");
        createADatasetV2Request.setVisibilityUser(new ArrayList<>());
        createADatasetV2Request.setVisibilityGroup(new ArrayList<>());
        createADatasetV2Request.setInitVersionEntry(initVersionEntry);
        try {
            CreateADatasetV2Response response = client.createADatasetV2(createADatasetV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
