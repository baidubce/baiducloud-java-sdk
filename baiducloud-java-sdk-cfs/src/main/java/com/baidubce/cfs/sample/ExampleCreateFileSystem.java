package com.baidubce.cfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfs.CfsClient;
import com.baidubce.cfs.models.CreateFileSystemRequest;
import com.baidubce.cfs.models.CreateFileSystemResponse;
import java.util.ArrayList;

public class ExampleCreateFileSystem {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CfsClient client = new CfsClient(config);
        CreateFileSystemRequest createFileSystemRequest = new CreateFileSystemRequest();
        createFileSystemRequest.setFsName("");
        createFileSystemRequest.setZone("");
        createFileSystemRequest.setType("");
        createFileSystemRequest.setProtocol("");
        createFileSystemRequest.setTags(new ArrayList<>());
        createFileSystemRequest.setCapacityQuota(0L);
        try {
            CreateFileSystemResponse response = client.createFileSystem(createFileSystemRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
