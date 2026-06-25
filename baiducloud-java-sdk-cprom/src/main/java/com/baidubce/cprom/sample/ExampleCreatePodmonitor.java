package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.CreatePodmonitorRequest;
import com.baidubce.cprom.models.ObjectMeta;
import com.baidubce.cprom.models.CreatePodmonitorResponse;
import com.baidubce.cprom.models.PodMonitorSpec;
import com.baidubce.cprom.models.LabelSelector;
import com.baidubce.cprom.models.NamespaceSelector;
import java.util.ArrayList;

public class ExampleCreatePodmonitor {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        ObjectMeta metadata = new ObjectMeta();
        metadata.setName("");
        metadata.setNamespace("");

        PodMonitorSpec spec = new PodMonitorSpec();
        NamespaceSelector namespaceSelector = new NamespaceSelector();
        namespaceSelector.setMatchNames(new ArrayList<>());

        spec.setNamespaceSelector(namespaceSelector);
        spec.setPodMetricsEndpoints(new ArrayList<>());
        LabelSelector selector = new LabelSelector();
        selector.setMatchLabels(java.util.Collections.singletonMap("key", ""));

        spec.setSelector(selector);

        CreatePodmonitorRequest createPodmonitorRequest = new CreatePodmonitorRequest();
        createPodmonitorRequest.setInstanceId("");
        createPodmonitorRequest.setAgentId("");
        createPodmonitorRequest.setApiVersion("");
        createPodmonitorRequest.setKind("");
        createPodmonitorRequest.setMetadata(metadata);
        createPodmonitorRequest.setSpec(spec);
        try {
            CreatePodmonitorResponse response = client.createPodmonitor(createPodmonitorRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
