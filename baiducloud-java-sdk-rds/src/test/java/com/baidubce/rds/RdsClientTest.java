package com.baidubce.rds;

import com.baidubce.rds.models.QueryTaskListRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;

/**
 * API tests for RdsClient
 */
public class RdsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private RdsClient rdsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        config.setCredentials(new DefaultBceCredentials(AK, SK));

        rdsClient = new RdsClient(config);
    }

    /**
     * queryTaskList
     *
     */
    @Test
    public void queryTaskListTest() {
        QueryTaskListRequest queryTaskListRequest = new QueryTaskListRequest();
        queryTaskListRequest.setPageSize("");
        queryTaskListRequest.setPageNo("");
        queryTaskListRequest.setInstanceId("");
        queryTaskListRequest.setInstanceName("");
        queryTaskListRequest.setTaskId(0);
        queryTaskListRequest.setTaskType("");
        queryTaskListRequest.setTaskStatus("");
        queryTaskListRequest.setStartTime("");
        queryTaskListRequest.setEndTime("");
        rdsClient.queryTaskList(queryTaskListRequest);
    }
}
