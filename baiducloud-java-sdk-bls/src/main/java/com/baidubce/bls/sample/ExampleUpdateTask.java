package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.UpdateTaskRequest;
import com.baidubce.bls.models.ProcessConfig;
import com.baidubce.bls.models.DestConfig;
import com.baidubce.bls.models.SrcConfig;
import com.baidubce.bls.models.TaskConfig;
import java.util.ArrayList;

public class ExampleUpdateTask {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        TaskConfig config = new TaskConfig();
        SrcConfig srcConfig = new SrcConfig();
        srcConfig.setSrcType("");
        srcConfig.setLogType("");
        srcConfig.setSrcDir("");
        srcConfig.setMatchedPattern("");
        srcConfig.setIgnorePattern("");
        srcConfig.setTimeFormat("");
        srcConfig.setTtl(0);
        srcConfig.setUseMultiline(false);
        srcConfig.setMultilineRegex("");
        srcConfig.setRecursiveDir(false);
        srcConfig.setProcessType("");
        ProcessConfig processConfig = new ProcessConfig();
        processConfig.setRegex("");
        processConfig.setSeparator("");
        processConfig.setCustomSeparator("");
        processConfig.setQuote("");
        processConfig.setKvKeyIndex(0);
        processConfig.setKvValueIndex(0);
        processConfig.setSampleLog("");
        processConfig.setKeys("");
        processConfig.setDataType("");
        processConfig.setDiscardOnFailure(false);
        processConfig.setKeepOriginal(false);

        srcConfig.setProcessConfig(processConfig);
        srcConfig.setLogTime("");
        srcConfig.setTimestampKey("");
        srcConfig.setDateFormat("");
        srcConfig.setFilterExpr("");
        srcConfig.setMetaEnv(new ArrayList<>());
        srcConfig.setMetaLabel(new ArrayList<>());
        srcConfig.setMetaContainer(new ArrayList<>());
        srcConfig.setMetaToFields(false);
        srcConfig.setHarvesterLimit(0);

        config.setSrcConfig(srcConfig);
        DestConfig destConfig = new DestConfig();
        destConfig.setBoSPath("");
        destConfig.setPartitionFormatTS("");
        destConfig.setPartitionFormatLogStream(false);
        destConfig.setMaxObjectSize(0);
        destConfig.setCompressType("");
        destConfig.setDeliverInterval(0);
        destConfig.setStorageFormat("");
        destConfig.setCsvHeadline(false);
        destConfig.setCsvDelimiter("");
        destConfig.setCsvQuote("");
        destConfig.setNullIdentifier("");
        destConfig.setSelectedColumnName("");
        destConfig.setSelectedColumnType("");
        destConfig.setFieldsName(new ArrayList<>());
        destConfig.setFieldsType(new ArrayList<>());
        destConfig.setShipperType("");
        destConfig.setKafkaConfig("");
        destConfig.setDestType("");
        destConfig.setLogStore("");
        destConfig.setRateLimit(0);
        destConfig.setClientCount(0);

        config.setDestConfig(destConfig);

        UpdateTaskRequest updateTaskRequest = new UpdateTaskRequest();
        updateTaskRequest.setTaskId("");
        updateTaskRequest.setName("");
        updateTaskRequest.setConfig(config);
        updateTaskRequest.setHosts(new ArrayList<>());
        updateTaskRequest.setTags(new ArrayList<>());
        try {
            client.updateTask(updateTaskRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
