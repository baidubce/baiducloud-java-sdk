package com.baidubce.cloudassistant;

import com.baidubce.cloudassistant.models.ActionListRequest;
import com.baidubce.cloudassistant.models.ActionListResponse;
import com.baidubce.cloudassistant.models.ActionLogRequest;
import com.baidubce.cloudassistant.models.ActionLogResponse;
import com.baidubce.cloudassistant.models.ActionRunListRequest;
import com.baidubce.cloudassistant.models.ActionRunListResponse;
import com.baidubce.cloudassistant.models.ActionRunRequest;
import com.baidubce.cloudassistant.models.ActionRunResponse;
import com.baidubce.cloudassistant.models.BatchGetAgentRequest;
import com.baidubce.cloudassistant.models.BatchGetAgentResponse;
import com.baidubce.cloudassistant.models.CreateActionRequest;
import com.baidubce.cloudassistant.models.CreateActionResponse;
import com.baidubce.cloudassistant.models.DeleteActionRequest;
import com.baidubce.cloudassistant.models.DeleteActionResponse;
import com.baidubce.cloudassistant.models.GetActionRequest;
import com.baidubce.cloudassistant.models.GetActionResponse;
import com.baidubce.cloudassistant.models.GetActionRunRequest;
import com.baidubce.cloudassistant.models.GetActionRunResponse;
import com.baidubce.cloudassistant.models.UpdateActionRequest;
import com.baidubce.cloudassistant.models.UpdateActionResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for CloudassistantClient
 */
public class CloudassistantClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CloudassistantClient cloudassistantClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        cloudassistantClient = new CloudassistantClient(config);
    }

    /**
     * actionList
     *
     */
    @Test
    public void actionListTest() {
        ActionListRequest actionListRequest = new ActionListRequest();
        actionListRequest.setLocale("");
        actionListRequest.setPageNo(0);
        actionListRequest.setPageSize(0);
        actionListRequest.setSort("");
        actionListRequest.setAscending(false);
        actionListRequest.setAction(null);
        ActionListResponse response = cloudassistantClient.actionList(actionListRequest);
        System.out.println(response);
    }
    /**
     * actionLog
     *
     */
    @Test
    public void actionLogTest() {
        ActionLogRequest actionLogRequest = new ActionLogRequest();
        actionLogRequest.setRunId("");
        actionLogRequest.setChildId("");
        actionLogRequest.setCursor(0);
        ActionLogResponse response = cloudassistantClient.actionLog(actionLogRequest);
        System.out.println(response);
    }
    /**
     * actionRun
     *
     */
    @Test
    public void actionRunTest() {
        ActionRunRequest actionRunRequest = new ActionRunRequest();
        actionRunRequest.setLocale("");
        actionRunRequest.setAction(null);
        actionRunRequest.setParameters(null);
        actionRunRequest.setTargetSelectorType("");
        actionRunRequest.setTargets(new ArrayList<>());
        actionRunRequest.setTargetSelector(null);
        ActionRunResponse response = cloudassistantClient.actionRun(actionRunRequest);
        System.out.println(response);
    }
    /**
     * actionRunList
     *
     */
    @Test
    public void actionRunListTest() {
        ActionRunListRequest actionRunListRequest = new ActionRunListRequest();
        actionRunListRequest.setLocale("");
        actionRunListRequest.setPageNo(0);
        actionRunListRequest.setPageSize(0);
        actionRunListRequest.setSort("");
        actionRunListRequest.setAscending(false);
        actionRunListRequest.setAction(null);
        actionRunListRequest.setState("");
        actionRunListRequest.setRunId("");
        actionRunListRequest.setStartTime(0);
        actionRunListRequest.setEndTime(0);
        ActionRunListResponse response = cloudassistantClient.actionRunList(actionRunListRequest);
        System.out.println(response);
    }
    /**
     * batchGetAgent
     *
     */
    @Test
    public void batchGetAgentTest() {
        BatchGetAgentRequest batchGetAgentRequest = new BatchGetAgentRequest();
        batchGetAgentRequest.setHosts(new ArrayList<>());
        BatchGetAgentResponse response = cloudassistantClient.batchGetAgent(batchGetAgentRequest);
        System.out.println(response);
    }
    /**
     * createAction
     *
     */
    @Test
    public void createActionTest() {
        CreateActionRequest createActionRequest = new CreateActionRequest();
        createActionRequest.setExecution("");
        createActionRequest.setAction(null);
        createActionRequest.setParameters(null);
        createActionRequest.setTargetSelectorType("");
        createActionRequest.setTargets(new ArrayList<>());
        createActionRequest.setTargetSelector(null);
        CreateActionResponse response = cloudassistantClient.createAction(createActionRequest);
        System.out.println(response);
    }
    /**
     * deleteAction
     *
     */
    @Test
    public void deleteActionTest() {
        DeleteActionRequest deleteActionRequest = new DeleteActionRequest();
        deleteActionRequest.setId("");
        DeleteActionResponse response = cloudassistantClient.deleteAction(deleteActionRequest);
        System.out.println(response);
    }
    /**
     * getAction
     *
     */
    @Test
    public void getActionTest() {
        GetActionRequest getActionRequest = new GetActionRequest();
        getActionRequest.setId("");
        getActionRequest.setLocale("");
        GetActionResponse response = cloudassistantClient.getAction(getActionRequest);
        System.out.println(response);
    }
    /**
     * getActionRun
     *
     */
    @Test
    public void getActionRunTest() {
        GetActionRunRequest getActionRunRequest = new GetActionRunRequest();
        getActionRunRequest.setId("");
        getActionRunRequest.setWithLog("");
        getActionRunRequest.setPageNo(0);
        getActionRunRequest.setPageSize(0);
        getActionRunRequest.setChildRunState("");
        getActionRunRequest.setLocale("");
        GetActionRunResponse response = cloudassistantClient.getActionRun(getActionRunRequest);
        System.out.println(response);
    }
    /**
     * updateAction
     *
     */
    @Test
    public void updateActionTest() {
        UpdateActionRequest updateActionRequest = new UpdateActionRequest();
        updateActionRequest.setExecution("");
        updateActionRequest.setAction(null);
        updateActionRequest.setParameters(null);
        updateActionRequest.setTargetSelectorType("");
        updateActionRequest.setTargets(new ArrayList<>());
        updateActionRequest.setTargetSelector(null);
        UpdateActionResponse response = cloudassistantClient.updateAction(updateActionRequest);
        System.out.println(response);
    }
}
