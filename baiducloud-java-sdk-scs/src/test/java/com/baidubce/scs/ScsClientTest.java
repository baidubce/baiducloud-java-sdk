package com.baidubce.scs;

import com.baidubce.scs.models.InstanceListRequest;
import com.baidubce.scs.models.InstanceListResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;

/**
 * API tests for ScsClient
 */
public class ScsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private ScsClient scsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        config.setCredentials(new DefaultBceCredentials(AK, SK));

        scsClient = new ScsClient(config);
    }

    /**
     * instanceList
     *
     */
    @Test
    public void instanceListTest() {
        InstanceListRequest instanceListRequest = new InstanceListRequest();
        instanceListRequest.setMarker("");
        instanceListRequest.setMaxKeys("");
        instanceListRequest.setInstanceIds("");
        instanceListRequest.setVnetIp("");
        InstanceListResponse response = scsClient.instanceList(instanceListRequest);
        System.out.println(response);
    }
}
