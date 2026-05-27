package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbServerGroupPortRequest;

public class ExampleUpdateAppBlbServerGroupPort {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        UpdateAppBlbServerGroupPortRequest updateAppBlbServerGroupPortRequest = new UpdateAppBlbServerGroupPortRequest();
        updateAppBlbServerGroupPortRequest.setBlbId("");
        updateAppBlbServerGroupPortRequest.setClientToken("");
        updateAppBlbServerGroupPortRequest.setSgId("");
        updateAppBlbServerGroupPortRequest.setPortId("");
        updateAppBlbServerGroupPortRequest.setEnableHealthCheck(false);
        updateAppBlbServerGroupPortRequest.setHealthCheck("");
        updateAppBlbServerGroupPortRequest.setHealthCheckPort(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckUrlPath("");
        updateAppBlbServerGroupPortRequest.setHealthCheckTimeoutInSecond(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckIntervalInSecond(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckDownRetry(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckUpRetry(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckNormalStatus("");
        updateAppBlbServerGroupPortRequest.setHealthCheckHost("");
        updateAppBlbServerGroupPortRequest.setUdpHealthCheckString("");
        try {
            client.updateAppBlbServerGroupPort(updateAppBlbServerGroupPortRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
