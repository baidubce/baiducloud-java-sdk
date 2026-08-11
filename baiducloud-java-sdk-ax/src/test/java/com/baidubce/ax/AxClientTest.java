package com.baidubce.ax;

import com.baidubce.ax.models.QuerySandboxesRequest;
import com.baidubce.ax.models.QuerySandboxesResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * API tests for AxClient
 */
public class AxClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private AxClient axClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        axClient = new AxClient(config);
    }

    /**
     * querySandboxes
     *
     */
    @Test
    public void querySandboxesTest() {
        QuerySandboxesRequest querySandboxesRequest = new QuerySandboxesRequest();
        querySandboxesRequest.setLimit(0);
        querySandboxesRequest.setNextToken("");
        querySandboxesRequest.setSandboxIds(new ArrayList<>());
        querySandboxesRequest.setImagePaths(new ArrayList<>());
        querySandboxesRequest.setMetadata(new HashMap<>());
        querySandboxesRequest.setState(new ArrayList<>());
        QuerySandboxesResponse response = axClient.querySandboxes(querySandboxesRequest);
        System.out.println(response);
    }
}
