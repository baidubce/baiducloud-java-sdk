package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.UpdateServiceConfigRequest;
import com.baidubce.apm.models.UpdateServiceConfigResponse;
import com.baidubce.apm.models.SampleConfig;
import com.baidubce.apm.models.MllmResourceDumpConfig;
import com.baidubce.apm.models.LoggingConfig;
import com.baidubce.apm.models.ServiceTopoConfig;
import com.baidubce.apm.models.ServiceRequestConfig;
import java.util.ArrayList;

public class ExampleUpdateServiceConfig {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        SampleConfig sampleConfig = new SampleConfig();
        sampleConfig.setEnabled(false);
        sampleConfig.setProcessors(java.util.Arrays.asList(new SampleProcessor()));

        LoggingConfig loggingConfig = new LoggingConfig();
        loggingConfig.setEnabled(false);
        loggingConfig.setRegion("");
        loggingConfig.setProject("");
        loggingConfig.setLogStoreName("");
        loggingConfig.setTraceIdIndex("");
        loggingConfig.setTraceIdKey("");
        loggingConfig.setSpanIdIndex("");
        loggingConfig.setSpanIdKey("");

        ServiceRequestConfig requestConfig = new ServiceRequestConfig();
        requestConfig.setGlobal(false);
        requestConfig.setServerSlowRequestThresholdSeconds(0.0);
        requestConfig.setDbSlowRequestThresholdSeconds(0.0);
        requestConfig.setOkHttpStatus(java.util.Arrays.asList(0));

        ServiceTopoConfig topoConfig = new ServiceTopoConfig();
        topoConfig.setGlobal(false);
        topoConfig.setRequestSecondsThreshold(0.0);
        topoConfig.setErrorRateThreshold(0.0);

        MllmResourceDumpConfig mllmResourceDumpConfig = new MllmResourceDumpConfig();
        mllmResourceDumpConfig.setRetentionDays(0);
        mllmResourceDumpConfig.setBucket("");

        UpdateServiceConfigRequest updateServiceConfigRequest = new UpdateServiceConfigRequest();
        updateServiceConfigRequest.setServiceNames(new ArrayList<>());
        updateServiceConfigRequest.setSampleConfig(sampleConfig);
        updateServiceConfigRequest.setLoggingConfig(loggingConfig);
        updateServiceConfigRequest.setRequestConfig(requestConfig);
        updateServiceConfigRequest.setTopoConfig(topoConfig);
        updateServiceConfigRequest.setMllmResourceDumpConfig(mllmResourceDumpConfig);
        try {
            UpdateServiceConfigResponse response = client.updateServiceConfig(updateServiceConfigRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
