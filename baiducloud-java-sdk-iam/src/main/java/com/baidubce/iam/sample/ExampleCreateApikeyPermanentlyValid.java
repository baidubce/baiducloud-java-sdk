package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.CreateApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.CreateApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.ACL;
import java.util.ArrayList;

public class ExampleCreateApikeyPermanentlyValid {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        IamClient client = new IamClient(bceClientConfig);
        ACL acl = new ACL();
        acl.setId("");
        acl.setVersion("");
        acl.setAccessControlList(new ArrayList<>());

        CreateApikeyPermanentlyValidRequest createApikeyPermanentlyValidRequest = new CreateApikeyPermanentlyValidRequest();
        createApikeyPermanentlyValidRequest.setUserId("");
        createApikeyPermanentlyValidRequest.setAcl(acl);
        createApikeyPermanentlyValidRequest.setName("");
        try {
            CreateApikeyPermanentlyValidResponse response = client.createApikeyPermanentlyValid(createApikeyPermanentlyValidRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
