package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.UpdateIsManagedV2Request;
import java.util.ArrayList;

public class ExampleUpdateIsManagedV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        UpdateIsManagedV2Request updateIsManagedV2Request = new UpdateIsManagedV2Request();
        updateIsManagedV2Request.setGroupId("");
        updateIsManagedV2Request.setUpdateIsManaged("");
        updateIsManagedV2Request.setAddManagedNodeIds(new ArrayList<>());
        updateIsManagedV2Request.setDelManagedNodeIds(new ArrayList<>());
        try {
            client.updateIsManagedV2(updateIsManagedV2Request);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
