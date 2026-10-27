package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.ImportDataSrcRequest;
import com.baidubce.rapidfs.models.ImportDataSrcResponse;
import com.baidubce.rapidfs.models.MountServiceBinding;
import java.util.ArrayList;
import java.util.List;

public class ExampleImportDataSrc {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(bceClientConfig);
        ImportDataSrcRequest importDataSrcRequest = new ImportDataSrcRequest();
        importDataSrcRequest.setClientToken("");
        importDataSrcRequest.setInstanceId("");
        importDataSrcRequest.setDataSrcName("");
        importDataSrcRequest.setBucket("");
        importDataSrcRequest.setOtherAccount(false);
        importDataSrcRequest.setStorageType("BOS");
        importDataSrcRequest.setBucketEndpoint("");
        importDataSrcRequest.setBucketAK("");
        importDataSrcRequest.setBucketSK("");
        importDataSrcRequest.setBucketStsToken("");
        importDataSrcRequest.setDirPrefix("");
        importDataSrcRequest.setSyncMetaOnImport(true);
        importDataSrcRequest.setKeepSymlink(false);
        importDataSrcRequest.setAuthGroupId("");
        List<MountServiceBinding> mountServiceBindings = new ArrayList<>();
        mountServiceBindings.add(new MountServiceBinding()
                .setMountServiceId("MNTSVC-RAPIDFS_DEFAULT_ID")
                .setLogicalMountPath(""));
        importDataSrcRequest.setMountServiceBindings(mountServiceBindings);
        importDataSrcRequest.setDescription("");
        importDataSrcRequest.setQuotaMiB(0);
        try {
            ImportDataSrcResponse response = client.importDataSrc(importDataSrcRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
