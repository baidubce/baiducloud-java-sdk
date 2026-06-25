package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.RemoteWriteRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExampleRemoteWrite {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        RemoteWriteRequest remoteWriteRequest = new RemoteWriteRequest();
        remoteWriteRequest.setRemoteWriteUrl("");
        remoteWriteRequest.setContentType("");
        remoteWriteRequest.setContentEncoding("");
        remoteWriteRequest.setInstanceId("");
        remoteWriteRequest.setAuthorization("");
        try {
            // 文件流上传示例
            File fileBody = new File("/path/to/your/file");
            remoteWriteRequest.setBody(new FileInputStream(fileBody));
            client.remoteWrite(remoteWriteRequest);
        } catch (BceClientException | FileNotFoundException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
