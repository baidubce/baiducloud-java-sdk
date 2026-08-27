package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.UpdateApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.UpdateApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.ACL;
import java.util.ArrayList;

public class ExampleUpdateApikeyPermanentlyValid {
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

        UpdateApikeyPermanentlyValidRequest updateApikeyPermanentlyValidRequest = new UpdateApikeyPermanentlyValidRequest();
        updateApikeyPermanentlyValidRequest.setUserId("");
        updateApikeyPermanentlyValidRequest.setId("");
        updateApikeyPermanentlyValidRequest.setAcl(acl);
        try {
            UpdateApikeyPermanentlyValidResponse response = client.updateApikeyPermanentlyValid(updateApikeyPermanentlyValidRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
