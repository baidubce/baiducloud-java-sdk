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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
