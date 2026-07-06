package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.CreateJobRequest;
import com.baidubce.aihc.models.ImageConfig;
import com.baidubce.aihc.models.AdvancedSettings;
import com.baidubce.aihc.models.CreateJobResponse;
import com.baidubce.aihc.models.AlertConfig;
import com.baidubce.aihc.models.TensorboardConfig;
import com.baidubce.aihc.models.JobSpec;
import java.util.ArrayList;

public class ExampleCreateJob {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AihcClient client = new AihcClient(bceClientConfig);
        JobSpec jobSpec = new JobSpec();
        jobSpec.setImage("");
        ImageConfig imageConfig = new ImageConfig();
        imageConfig.setUsername("");
        imageConfig.setPassword("");

        jobSpec.setImageConfig(imageConfig);
        jobSpec.setReplicas(0);
        jobSpec.setResources(new ArrayList<>());
        jobSpec.setEnvs(new ArrayList<>());
        jobSpec.setEnableRDMA(false);
        jobSpec.setHostNetwork(false);

        TensorboardConfig tensorboardConfig = new TensorboardConfig();
        tensorboardConfig.setEnable(false);
        tensorboardConfig.setLogPath("");

        AlertConfig alertConfig = new AlertConfig();
        alertConfig.setInstanceId("");
        alertConfig.setAlertItems(new ArrayList<>());
        alertConfig.setFor("");
        alertConfig.setNotifyRuleId("");

        AdvancedSettings advancedSettings = new AdvancedSettings();
        advancedSettings.setRuntimeEnv("");
        advancedSettings.setSubmitterBackoffLimit(0);

        CreateJobRequest createJobRequest = new CreateJobRequest();
        createJobRequest.setName("");
        createJobRequest.setQueue("");
        createJobRequest.setJobType("");
        createJobRequest.setJobSpec(jobSpec);
        createJobRequest.setCommand("");
        createJobRequest.setLabels(new ArrayList<>());
        createJobRequest.setPriority("");
        createJobRequest.setDatasources(new ArrayList<>());
        createJobRequest.setEnableBccl(false);
        createJobRequest.setFaultTolerance(false);
        createJobRequest.setFaultToleranceArgs("");
        createJobRequest.setTensorboardConfig(tensorboardConfig);
        createJobRequest.setAlertConfig(alertConfig);
        createJobRequest.setRetentionPeriod("");
        createJobRequest.setAdvancedSettings(advancedSettings);
        try {
            CreateJobResponse response = client.createJob(createJobRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
