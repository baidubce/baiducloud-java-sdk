package com.baidubce.as;

import com.baidubce.as.models.AdjustNumV2Request;
import com.baidubce.as.models.AdjustNumV2Response;
import com.baidubce.as.models.AttachNodeV2Request;
import com.baidubce.as.models.AttachNodeV2Response;
import com.baidubce.as.models.CreateAsGroupV2Request;
import com.baidubce.as.models.CreateAsGroupV2Response;
import com.baidubce.as.models.CreateRuleV2Request;
import com.baidubce.as.models.CreateRuleV2Response;
import com.baidubce.as.models.DeleteAsGroupV2Request;
import com.baidubce.as.models.DeleteRuleV2Request;
import com.baidubce.as.models.DetachNodeV2Request;
import com.baidubce.as.models.DetachNodeV2Response;
import com.baidubce.as.models.ExecRuleV2Request;
import com.baidubce.as.models.ExecRuleV2Response;
import com.baidubce.as.models.GetAsGroupV2Request;
import com.baidubce.as.models.GetAsGroupV2Response;
import com.baidubce.as.models.GetRuleV2Request;
import com.baidubce.as.models.GetRuleV2Response;
import com.baidubce.as.models.ListAsGroupV2Request;
import com.baidubce.as.models.ListAsGroupV2Response;
import com.baidubce.as.models.ListAsNodeV2Request;
import com.baidubce.as.models.ListAsNodeV2Response;
import com.baidubce.as.models.ListRuleV2Request;
import com.baidubce.as.models.ListRuleV2Response;
import com.baidubce.as.models.ListTaskV2Request;
import com.baidubce.as.models.ListTaskV2Response;
import com.baidubce.as.models.ScalingDownV2Request;
import com.baidubce.as.models.ScalingDownV2Response;
import com.baidubce.as.models.ScalingUpV2Request;
import com.baidubce.as.models.ScalingUpV2Response;
import com.baidubce.as.models.UpdateIsManagedV2Request;
import com.baidubce.as.models.UpdateProtectV2Request;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for AsClient
 */
public class AsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private AsClient asClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        asClient = new AsClient(config);
    }

    /**
     * adjustNumV2
     *
     */
    @Test
    public void adjustNumV2Test() {
        AdjustNumV2Request adjustNumV2Request = new AdjustNumV2Request();
        adjustNumV2Request.setGroupId("");
        adjustNumV2Request.setAdjustNode("");
        adjustNumV2Request.setAdjustNum(0);
        AdjustNumV2Response response = asClient.adjustNumV2(adjustNumV2Request);
        System.out.println(response);
    }
    /**
     * attachNodeV2
     *
     */
    @Test
    public void attachNodeV2Test() {
        AttachNodeV2Request attachNodeV2Request = new AttachNodeV2Request();
        attachNodeV2Request.setGroupId("");
        attachNodeV2Request.setAttachNode("");
        attachNodeV2Request.setNodes(new ArrayList<>());
        AttachNodeV2Response response = asClient.attachNodeV2(attachNodeV2Request);
        System.out.println(response);
    }
    /**
     * createAsGroupV2
     *
     */
    @Test
    public void createAsGroupV2Test() {
        CreateAsGroupV2Request createAsGroupV2Request = new CreateAsGroupV2Request();
        createAsGroupV2Request.setGroupName("");
        createAsGroupV2Request.setZoneInfo(new ArrayList<>());
        createAsGroupV2Request.setConfig(null);
        createAsGroupV2Request.setKeypairId("");
        createAsGroupV2Request.setKeypairName("");
        createAsGroupV2Request.setKeepImageLogin(0);
        createAsGroupV2Request.setBlb(new ArrayList<>());
        createAsGroupV2Request.setBlbUnbindWaitTime(0);
        createAsGroupV2Request.setNodes(new ArrayList<>());
        createAsGroupV2Request.setEip(null);
        createAsGroupV2Request.setEipConfig(null);
        createAsGroupV2Request.setBilling(null);
        createAsGroupV2Request.setRds(new ArrayList<>());
        createAsGroupV2Request.setScs(new ArrayList<>());
        createAsGroupV2Request.setHealthCheck(null);
        createAsGroupV2Request.setExpansionStrategy("");
        createAsGroupV2Request.setShrinkageStrategy("");
        createAsGroupV2Request.setAssignTagInfo(null);
        createAsGroupV2Request.setCmdConfig(null);
        createAsGroupV2Request.setBccNameConfig(null);
        CreateAsGroupV2Response response = asClient.createAsGroupV2(createAsGroupV2Request);
        System.out.println(response);
    }
    /**
     * createRuleV2
     *
     */
    @Test
    public void createRuleV2Test() {
        CreateRuleV2Request createRuleV2Request = new CreateRuleV2Request();
        createRuleV2Request.setRuleName("");
        createRuleV2Request.setGroupId("");
        createRuleV2Request.setState("");
        createRuleV2Request.setType("");
        createRuleV2Request.setActionType("");
        createRuleV2Request.setActionNum(0);
        createRuleV2Request.setCronTime("");
        createRuleV2Request.setCooldownInSec(0);
        createRuleV2Request.setPeriodType("");
        createRuleV2Request.setPeriodValue(0);
        createRuleV2Request.setPeriodStartTime("");
        createRuleV2Request.setPeriodEndTime("");
        createRuleV2Request.setAsAlarmRule(null);
        CreateRuleV2Response response = asClient.createRuleV2(createRuleV2Request);
        System.out.println(response);
    }
    /**
     * deleteAsGroupV2
     *
     */
    @Test
    public void deleteAsGroupV2Test() {
        DeleteAsGroupV2Request deleteAsGroupV2Request = new DeleteAsGroupV2Request();
        deleteAsGroupV2Request.setGroupIds(new ArrayList<>());
        asClient.deleteAsGroupV2(deleteAsGroupV2Request);
    }
    /**
     * deleteRuleV2
     *
     */
    @Test
    public void deleteRuleV2Test() {
        DeleteRuleV2Request deleteRuleV2Request = new DeleteRuleV2Request();
        deleteRuleV2Request.setRuleId("");
        asClient.deleteRuleV2(deleteRuleV2Request);
    }
    /**
     * detachNodeV2
     *
     */
    @Test
    public void detachNodeV2Test() {
        DetachNodeV2Request detachNodeV2Request = new DetachNodeV2Request();
        detachNodeV2Request.setGroupId("");
        detachNodeV2Request.setDetachNode("");
        detachNodeV2Request.setNodes(new ArrayList<>());
        DetachNodeV2Response response = asClient.detachNodeV2(detachNodeV2Request);
        System.out.println(response);
    }
    /**
     * execRuleV2
     *
     */
    @Test
    public void execRuleV2Test() {
        ExecRuleV2Request execRuleV2Request = new ExecRuleV2Request();
        execRuleV2Request.setGroupId("");
        execRuleV2Request.setExecRule("");
        execRuleV2Request.setRuleId("");
        ExecRuleV2Response response = asClient.execRuleV2(execRuleV2Request);
        System.out.println(response);
    }
    /**
     * getAsGroupV2
     *
     */
    @Test
    public void getAsGroupV2Test() {
        GetAsGroupV2Request getAsGroupV2Request = new GetAsGroupV2Request();
        getAsGroupV2Request.setGroupId("");
        GetAsGroupV2Response response = asClient.getAsGroupV2(getAsGroupV2Request);
        System.out.println(response);
    }
    /**
     * getRuleV2
     *
     */
    @Test
    public void getRuleV2Test() {
        GetRuleV2Request getRuleV2Request = new GetRuleV2Request();
        getRuleV2Request.setRuleId("");
        GetRuleV2Response response = asClient.getRuleV2(getRuleV2Request);
        System.out.println(response);
    }
    /**
     * listAsGroupV2
     *
     */
    @Test
    public void listAsGroupV2Test() {
        ListAsGroupV2Request listAsGroupV2Request = new ListAsGroupV2Request();
        listAsGroupV2Request.setPageNo(0);
        listAsGroupV2Request.setPageSize(0);
        listAsGroupV2Request.setKeyword("");
        listAsGroupV2Request.setKeywordType("");
        listAsGroupV2Request.setSubKeywordType("");
        listAsGroupV2Request.setOrder("");
        listAsGroupV2Request.setOrderBy("");
        ListAsGroupV2Response response = asClient.listAsGroupV2(listAsGroupV2Request);
        System.out.println(response);
    }
    /**
     * listAsNodeV2
     *
     */
    @Test
    public void listAsNodeV2Test() {
        ListAsNodeV2Request listAsNodeV2Request = new ListAsNodeV2Request();
        listAsNodeV2Request.setGroupid("");
        listAsNodeV2Request.setPageNo(0);
        listAsNodeV2Request.setPageSize(0);
        listAsNodeV2Request.setKeyword("");
        listAsNodeV2Request.setKeywordType("");
        listAsNodeV2Request.setOrder("");
        listAsNodeV2Request.setOrderBy("");
        ListAsNodeV2Response response = asClient.listAsNodeV2(listAsNodeV2Request);
        System.out.println(response);
    }
    /**
     * listRuleV2
     *
     */
    @Test
    public void listRuleV2Test() {
        ListRuleV2Request listRuleV2Request = new ListRuleV2Request();
        listRuleV2Request.setGroupid("");
        listRuleV2Request.setPageNo(0);
        listRuleV2Request.setPageSize(0);
        listRuleV2Request.setKeyword("");
        listRuleV2Request.setKeywordType("");
        listRuleV2Request.setOrder("");
        listRuleV2Request.setOrderBy("");
        ListRuleV2Response response = asClient.listRuleV2(listRuleV2Request);
        System.out.println(response);
    }
    /**
     * listTaskV2
     *
     */
    @Test
    public void listTaskV2Test() {
        ListTaskV2Request listTaskV2Request = new ListTaskV2Request();
        listTaskV2Request.setGroupid("");
        listTaskV2Request.setOrderBy("");
        listTaskV2Request.setPageNo(0);
        listTaskV2Request.setOrder("");
        listTaskV2Request.setPageSize(0);
        listTaskV2Request.setStartTime("");
        listTaskV2Request.setEndTime("");
        ListTaskV2Response response = asClient.listTaskV2(listTaskV2Request);
        System.out.println(response);
    }
    /**
     * scalingDownV2
     *
     */
    @Test
    public void scalingDownV2Test() {
        ScalingDownV2Request scalingDownV2Request = new ScalingDownV2Request();
        scalingDownV2Request.setGroupId("");
        scalingDownV2Request.setScalingDown("");
        scalingDownV2Request.setNodes(new ArrayList<>());
        ScalingDownV2Response response = asClient.scalingDownV2(scalingDownV2Request);
        System.out.println(response);
    }
    /**
     * scalingUpV2
     *
     */
    @Test
    public void scalingUpV2Test() {
        ScalingUpV2Request scalingUpV2Request = new ScalingUpV2Request();
        scalingUpV2Request.setGroupId("");
        scalingUpV2Request.setScalingUp("");
        scalingUpV2Request.setNodeCount(0);
        scalingUpV2Request.setZone(new ArrayList<>());
        scalingUpV2Request.setExpansionStrategy("");
        ScalingUpV2Response response = asClient.scalingUpV2(scalingUpV2Request);
        System.out.println(response);
    }
    /**
     * updateIsManagedV2
     *
     */
    @Test
    public void updateIsManagedV2Test() {
        UpdateIsManagedV2Request updateIsManagedV2Request = new UpdateIsManagedV2Request();
        updateIsManagedV2Request.setGroupId("");
        updateIsManagedV2Request.setUpdateIsManaged("");
        updateIsManagedV2Request.setAddManagedNodeIds(new ArrayList<>());
        updateIsManagedV2Request.setDelManagedNodeIds(new ArrayList<>());
        asClient.updateIsManagedV2(updateIsManagedV2Request);
    }
    /**
     * updateProtectV2
     *
     */
    @Test
    public void updateProtectV2Test() {
        UpdateProtectV2Request updateProtectV2Request = new UpdateProtectV2Request();
        updateProtectV2Request.setGroupId("");
        updateProtectV2Request.setUpdateProtect("");
        updateProtectV2Request.setNodes(new ArrayList<>());
        updateProtectV2Request.setIsProtected(false);
        asClient.updateProtectV2(updateProtectV2Request);
    }
}
