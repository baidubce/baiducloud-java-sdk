package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.UpdateServiceMonitorRequest;
import com.baidubce.cprom.models.ObjectMeta;
import com.baidubce.cprom.models.ServiceMonitorSpec;
import com.baidubce.cprom.models.ServiceMonitor;
import com.baidubce.cprom.models.LabelSelector;
import com.baidubce.cprom.models.NamespaceSelector;
import java.util.ArrayList;

public class ExampleUpdateServiceMonitor {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        ServiceMonitor serviceMonitor = new ServiceMonitor();
        serviceMonitor.setApiVersion("");
        serviceMonitor.setKind("");
        ObjectMeta metadata = new ObjectMeta();
        metadata.setName("");
        metadata.setNamespace("");

        serviceMonitor.setMetadata(metadata);
        ServiceMonitorSpec spec = new ServiceMonitorSpec();
        spec.setEndpoints(new ArrayList<>());
        NamespaceSelector namespaceSelector = new NamespaceSelector();
        namespaceSelector.setMatchNames(new ArrayList<>());

        spec.setNamespaceSelector(namespaceSelector);
        LabelSelector selector = new LabelSelector();
        selector.setMatchLabels(java.util.Collections.singletonMap("key", ""));

        spec.setSelector(selector);

        serviceMonitor.setSpec(spec);

        UpdateServiceMonitorRequest updateServiceMonitorRequest = new UpdateServiceMonitorRequest();
        updateServiceMonitorRequest.setServiceMonitorName("");
        updateServiceMonitorRequest.setInstanceId("");
        updateServiceMonitorRequest.setAgentId("");
        updateServiceMonitorRequest.setEnable("");
        updateServiceMonitorRequest.setServiceMonitor(serviceMonitor);
        try {
            client.updateServiceMonitor(updateServiceMonitorRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
