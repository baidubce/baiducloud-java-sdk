package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.ModifyBackupStrategyRequest;
import java.util.ArrayList;

public class ExampleModifyBackupStrategy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        ModifyBackupStrategyRequest modifyBackupStrategyRequest = new ModifyBackupStrategyRequest();
        modifyBackupStrategyRequest.setInstanceId("");
        modifyBackupStrategyRequest.setBackupDays("");
        modifyBackupStrategyRequest.setBackupTime("");
        modifyBackupStrategyRequest.setPersistent(false);
        modifyBackupStrategyRequest.setExpireInDays(0);
        modifyBackupStrategyRequest.setLogBackupRetainDays(0);
        modifyBackupStrategyRequest.setDataBackupType("");
        modifyBackupStrategyRequest.setIncrementalDataBackupEnable(false);
        modifyBackupStrategyRequest.setIncrementalDataBackupInterval(0);
        modifyBackupStrategyRequest.setLatestDataBackupRetainDays(0);
        modifyBackupStrategyRequest.setRetentionPeriod(0);
        modifyBackupStrategyRequest.setTimeUnit("");
        modifyBackupStrategyRequest.setDataBackupCopyEnable(false);
        modifyBackupStrategyRequest.setDataBackupCopyStoragesRegions(new ArrayList<>());
        modifyBackupStrategyRequest.setDataBackupCopyRetainDays(0);
        try {
            client.modifyBackupStrategy(modifyBackupStrategyRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
