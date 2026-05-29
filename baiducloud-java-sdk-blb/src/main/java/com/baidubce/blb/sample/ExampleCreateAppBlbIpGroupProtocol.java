package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbIpGroupProtocolRequest;

public class ExampleCreateAppBlbIpGroupProtocol {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        CreateAppBlbIpGroupProtocolRequest createAppBlbIpGroupProtocolRequest = new CreateAppBlbIpGroupProtocolRequest();
        createAppBlbIpGroupProtocolRequest.setBlbId("");
        createAppBlbIpGroupProtocolRequest.setClientToken("");
        createAppBlbIpGroupProtocolRequest.setIpGroupId("");
        createAppBlbIpGroupProtocolRequest.setType("");
        createAppBlbIpGroupProtocolRequest.setHealthCheck("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckPort(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckUrlPath("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckTimeoutInSecond(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckIntervalInSecond(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckDownRetry(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckUpRetry(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckNormalStatus("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckHost("");
        createAppBlbIpGroupProtocolRequest.setUdpHealthCheckString("");
        try {
            client.createAppBlbIpGroupProtocol(createAppBlbIpGroupProtocolRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
