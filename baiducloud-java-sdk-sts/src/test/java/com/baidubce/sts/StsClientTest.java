package com.baidubce.sts;

import com.baidubce.sts.models.AssumeRoleRequest;
import com.baidubce.sts.models.AssumeRoleResponse;
import com.baidubce.sts.models.GetSessionTokenRequest;
import com.baidubce.sts.models.GetSessionTokenResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;

/**
 * API tests for StsClient
 */
public class StsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private StsClient stsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        stsClient = new StsClient(config);
    }

    /**
     * assumeRole
     *
     */
    @Test
    public void assumeRoleTest() {
        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest();
        assumeRoleRequest.setAccountId("");
        assumeRoleRequest.setRoleName("");
        assumeRoleRequest.setDurationSeconds("");
        assumeRoleRequest.setUserId("");
        assumeRoleRequest.setAccessControlList("");
        AssumeRoleResponse response = stsClient.assumeRole(assumeRoleRequest);
        System.out.println(response);
    }
    /**
     * getSessionToken
     *
     */
    @Test
    public void getSessionTokenTest() {
        GetSessionTokenRequest getSessionTokenRequest = new GetSessionTokenRequest();
        getSessionTokenRequest.setDurationSeconds("");
        getSessionTokenRequest.setAccessControlList("");
        getSessionTokenRequest.setAttachment("");
        GetSessionTokenResponse response = stsClient.getSessionToken(getSessionTokenRequest);
        System.out.println(response);
    }
}
