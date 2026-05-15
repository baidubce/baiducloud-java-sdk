package com.baidubce.cfw;

import com.baidubce.cfw.models.QueryCfwListResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;

/**
 * API tests for CfwClient
 */
public class CfwClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CfwClient cfwClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        cfwClient = new CfwClient(config);
    }

    /**
     * queryCfwList
     *
     */
    @Test
    public void queryCfwListTest() {
        QueryCfwListResponse response = cfwClient.queryCfwList();
        System.out.println(response);
    }
}
