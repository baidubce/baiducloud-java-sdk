package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.RebuildBatchInstanceRequest;
import java.util.ArrayList;

public class ExampleRebuildBatchInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        RebuildBatchInstanceRequest rebuildBatchInstanceRequest = new RebuildBatchInstanceRequest();
        rebuildBatchInstanceRequest.setImageId("");
        rebuildBatchInstanceRequest.setKeepImageLogin(false);
        rebuildBatchInstanceRequest.setIsPreserveData(false);
        rebuildBatchInstanceRequest.setAdminPass("");
        rebuildBatchInstanceRequest.setIsOpenHostEye(false);
        rebuildBatchInstanceRequest.setSysRootSize(0);
        rebuildBatchInstanceRequest.setKeypairId("");
        rebuildBatchInstanceRequest.setDataPartitionType("");
        rebuildBatchInstanceRequest.setRootPartitionType("");
        rebuildBatchInstanceRequest.setRaidId("");
        rebuildBatchInstanceRequest.setUserData("");
        rebuildBatchInstanceRequest.setUseLastUserData(false);
        rebuildBatchInstanceRequest.setCleanLastUserData(false);
        rebuildBatchInstanceRequest.setInstanceIds(new ArrayList<>());
        try {
            client.rebuildBatchInstance(rebuildBatchInstanceRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
