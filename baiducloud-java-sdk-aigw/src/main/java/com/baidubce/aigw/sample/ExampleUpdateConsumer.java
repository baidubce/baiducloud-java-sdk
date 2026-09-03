package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.UpdateConsumerRequest;
import com.baidubce.aigw.models.UpdateConsumerResponse;
import com.baidubce.aigw.models.IAMCredentialSpec;
import com.baidubce.aigw.models.ConsumerCredentialLocation;
import com.baidubce.aigw.models.CredentialOp;
import java.util.ArrayList;

public class ExampleUpdateConsumer {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        CredentialOp credentialOp = new CredentialOp();
        credentialOp.setOperation("");
        credentialOp.setCredentialName("");
        credentialOp.setValue("");

        ConsumerCredentialLocation credentialLocation = new ConsumerCredentialLocation();
        credentialLocation.setInHeader(false);
        credentialLocation.setInQuery(false);
        credentialLocation.setKeyNames(new ArrayList<>());

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

        UpdateConsumerRequest updateConsumerRequest = new UpdateConsumerRequest();
        updateConsumerRequest.setInstanceId("");
        updateConsumerRequest.setConsumerId("");
        updateConsumerRequest.setXRegion("");
        updateConsumerRequest.setKeyType("");
        updateConsumerRequest.setDescription("");
        updateConsumerRequest.setRouteNames(new ArrayList<>());
        updateConsumerRequest.setTags(new ArrayList<>());
        updateConsumerRequest.setCredentialOp(credentialOp);
        updateConsumerRequest.setCredentialLocation(credentialLocation);
        updateConsumerRequest.setIamCredential(iamCredential);
        try {
            UpdateConsumerResponse response = client.updateConsumer(updateConsumerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
