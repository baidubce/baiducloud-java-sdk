package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.CreateConsumerRequest;
import com.baidubce.aigw.models.CreateConsumerResponse;
import com.baidubce.aigw.models.IAMCredentialSpec;
import com.baidubce.aigw.models.ConsumerCredentialSpec;
import java.util.ArrayList;

public class ExampleCreateConsumer {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        ConsumerCredentialSpec credential = new ConsumerCredentialSpec();
        credential.setName("");
        credential.setGenerateMode("");
        credential.setValue("");
        credential.setInHeader(false);
        credential.setInQuery(false);
        credential.setKeyNames(new ArrayList<>());
        credential.setDescription("");

        IAMCredentialSpec iamCredential = new IAMCredentialSpec();
        iamCredential.setName("");
        iamCredential.setIamApiKeyId("");
        iamCredential.setIamTokenIdMasked("");
        iamCredential.setIamUserId("");
        iamCredential.setIamDomainId("");
        iamCredential.setResourceIds(new ArrayList<>());
        iamCredential.setInHeader(false);
        iamCredential.setInQuery(false);
        iamCredential.setKeyNames(new ArrayList<>());
        iamCredential.setStatus("");

        CreateConsumerRequest createConsumerRequest = new CreateConsumerRequest();
        createConsumerRequest.setInstanceId("");
        createConsumerRequest.setConsumerName("");
        createConsumerRequest.setDescription("");
        createConsumerRequest.setAuthType("");
        createConsumerRequest.setCredentialType("");
        createConsumerRequest.setRouteNames(new ArrayList<>());
        createConsumerRequest.setTags(new ArrayList<>());
        createConsumerRequest.setCredential(credential);
        createConsumerRequest.setIamCredential(iamCredential);
        try {
            CreateConsumerResponse response = client.createConsumer(createConsumerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
