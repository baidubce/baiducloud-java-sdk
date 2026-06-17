package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.UpdateLogShipperRequest;
import com.baidubce.bls.models.DestConfig;
import com.baidubce.bls.models.UpdateLogShipperResponse;
import java.util.ArrayList;

public class ExampleUpdateLogShipper {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
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

        UpdateLogShipperRequest updateLogShipperRequest = new UpdateLogShipperRequest();
        updateLogShipperRequest.setLogShipperID("");
        updateLogShipperRequest.setProject("");
        updateLogShipperRequest.setLogShipperName("");
        updateLogShipperRequest.setDestConfig(destConfig);
        try {
            UpdateLogShipperResponse response = client.updateLogShipper(updateLogShipperRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
