package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.AccessRuleModel;
import com.baidubce.pfs.models.CreateL3AccessRuleRequest;
import com.baidubce.pfs.models.CreateL3AccessRuleResponse;
import java.util.Arrays;

public class ExampleCreateL3AccessRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        CreateL3AccessRuleRequest request = new CreateL3AccessRuleRequest();
        request.setAccessGroupName("Your AccessGroupName");
        request.setZoneName("Your ZoneName");
        request.setAccessRules(Arrays.asList(
                new AccessRuleModel().setIp("192.168.1.0").setMask(24).setWriteAccess("read_write").setUserAccess("no_squash").setPriority(100)));
        try {
            CreateL3AccessRuleResponse response = client.createL3AccessRule(request);
            System.out.println(response);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
