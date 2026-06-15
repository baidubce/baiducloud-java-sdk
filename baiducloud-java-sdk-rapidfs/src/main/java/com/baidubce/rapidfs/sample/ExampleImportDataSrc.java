package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.ImportDataSrcRequest;
import com.baidubce.rapidfs.models.ImportDataSrcResponse;

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
        importDataSrcRequest.setBucketAK("");
        importDataSrcRequest.setBucketSK("");
        importDataSrcRequest.setBucketStsToken("");
        importDataSrcRequest.setDirPrefix("");
        importDataSrcRequest.setKeepSymlink(false);
        importDataSrcRequest.setAuthGroupId("");
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
