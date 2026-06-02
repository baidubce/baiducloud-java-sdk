package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdateFilesetRequest;
import com.baidubce.pfs.models.UpdateFilesetResponse;

public class ExampleUpdateFileset {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PfsClient client = new PfsClient(config);
        UpdateFilesetRequest updateFilesetRequest = new UpdateFilesetRequest();
        updateFilesetRequest.setInstanceId("");
        updateFilesetRequest.setFilesetId("");
        updateFilesetRequest.setFilesetName("");
        updateFilesetRequest.setBlockQuota(0);
        updateFilesetRequest.setFilesQuota(0L);
        updateFilesetRequest.setQpsLimit(0);
        updateFilesetRequest.setBandwidthLimitMb(0);
        try {
            UpdateFilesetResponse response = client.updateFileset(updateFilesetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
