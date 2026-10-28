package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ModifyVolumeDeleteProtectionV2Request;
import java.util.ArrayList;

public class ExampleModifyVolumeDeleteProtectionV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ModifyVolumeDeleteProtectionV2Request modifyVolumeDeleteProtectionV2Request = new ModifyVolumeDeleteProtectionV2Request();
        modifyVolumeDeleteProtectionV2Request.setVolumeIds(new ArrayList<>());
        modifyVolumeDeleteProtectionV2Request.setEnableDeleteProtection(false);
        try {
            client.modifyVolumeDeleteProtectionV2(modifyVolumeDeleteProtectionV2Request);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
