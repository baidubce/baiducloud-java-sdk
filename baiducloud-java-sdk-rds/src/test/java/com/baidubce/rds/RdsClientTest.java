package com.baidubce.rds;

import com.baidubce.rds.models.CreateAPrimaryInstanceRequest;
import com.baidubce.rds.models.CreateAPrimaryInstanceResponse;
import com.baidubce.rds.models.CreateAProxyInstanceRequest;
import com.baidubce.rds.models.CreateAProxyInstanceResponse;
import com.baidubce.rds.models.CreateReadOnlyInstanceRequest;
import com.baidubce.rds.models.CreateReadOnlyInstanceResponse;
import com.baidubce.rds.models.QueryTaskListRequest;
import com.baidubce.rds.models.QueryTaskListResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

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
     * createAPrimaryInstance
     *
     */
    @Test
    public void createAPrimaryInstanceTest() {
        CreateAPrimaryInstanceRequest createAPrimaryInstanceRequest = new CreateAPrimaryInstanceRequest();
        createAPrimaryInstanceRequest.setClientToken("");
        createAPrimaryInstanceRequest.setBilling(null);
        createAPrimaryInstanceRequest.setPurchaseCount(0);
        createAPrimaryInstanceRequest.setInstanceName("");
        createAPrimaryInstanceRequest.setEngine("");
        createAPrimaryInstanceRequest.setEngineVersion("");
        createAPrimaryInstanceRequest.setCategory("");
        createAPrimaryInstanceRequest.setCpuCount(0);
        createAPrimaryInstanceRequest.setMemoryCapacity(0);
        createAPrimaryInstanceRequest.setVolumeCapacity(0);
        createAPrimaryInstanceRequest.setDiskIoType("");
        createAPrimaryInstanceRequest.setZoneNames(new ArrayList<>());
        createAPrimaryInstanceRequest.setBcmGroupName("");
        createAPrimaryInstanceRequest.setVpcId("");
        createAPrimaryInstanceRequest.setIsDirectPay(false);
        createAPrimaryInstanceRequest.setSubnets(new ArrayList<>());
        createAPrimaryInstanceRequest.setTags(new ArrayList<>());
        createAPrimaryInstanceRequest.setBgwGroupId("");
        createAPrimaryInstanceRequest.setBgwGroupExclusive(false);
        createAPrimaryInstanceRequest.setCharacterSetName("");
        createAPrimaryInstanceRequest.setAutoRenewTimeUnit("");
        createAPrimaryInstanceRequest.setAutoRenewTime(0);
        createAPrimaryInstanceRequest.setLowerCaseTableNames(0);
        createAPrimaryInstanceRequest.setParameterTemplateId("");
        createAPrimaryInstanceRequest.setOvip("");
        createAPrimaryInstanceRequest.setEntryPort(0);
        createAPrimaryInstanceRequest.setReplicationType("");
        createAPrimaryInstanceRequest.setResourceGroupId("");
        createAPrimaryInstanceRequest.setInitialDataReference(null);
        createAPrimaryInstanceRequest.setData(new ArrayList<>());
        createAPrimaryInstanceRequest.setLeaderInstanceId("");
        createAPrimaryInstanceRequest.setResourceType("");
        CreateAPrimaryInstanceResponse response = rdsClient.createAPrimaryInstance(createAPrimaryInstanceRequest);
        System.out.println(response);
    }
    /**
     * createAProxyInstance
     *
     */
    @Test
    public void createAProxyInstanceTest() {
        CreateAProxyInstanceRequest createAProxyInstanceRequest = new CreateAProxyInstanceRequest();
        createAProxyInstanceRequest.setClientToken("");
        createAProxyInstanceRequest.setBilling(null);
        createAProxyInstanceRequest.setSourceInstanceId("");
        createAProxyInstanceRequest.setInstanceName("");
        createAProxyInstanceRequest.setNodeAmount(0);
        createAProxyInstanceRequest.setZoneNames(new ArrayList<>());
        createAProxyInstanceRequest.setVpcId("");
        createAProxyInstanceRequest.setIsDirectPay(false);
        createAProxyInstanceRequest.setSubnets(new ArrayList<>());
        createAProxyInstanceRequest.setOvip("");
        createAProxyInstanceRequest.setEntryPort(0);
        createAProxyInstanceRequest.setResourceGroupId("");
        CreateAProxyInstanceResponse response = rdsClient.createAProxyInstance(createAProxyInstanceRequest);
        System.out.println(response);
    }
    /**
     * createReadOnlyInstance
     *
     */
    @Test
    public void createReadOnlyInstanceTest() {
        CreateReadOnlyInstanceRequest createReadOnlyInstanceRequest = new CreateReadOnlyInstanceRequest();
        createReadOnlyInstanceRequest.setClientToken("");
        createReadOnlyInstanceRequest.setBilling(null);
        createReadOnlyInstanceRequest.setSourceInstanceId("");
        createReadOnlyInstanceRequest.setInstanceName("");
        createReadOnlyInstanceRequest.setCpuCount(0);
        createReadOnlyInstanceRequest.setMemoryCapacity(0);
        createReadOnlyInstanceRequest.setVolumeCapacity(0);
        createReadOnlyInstanceRequest.setDiskIoType("");
        createReadOnlyInstanceRequest.setZoneNames(new ArrayList<>());
        createReadOnlyInstanceRequest.setVpcId("");
        createReadOnlyInstanceRequest.setBcmGroupName("");
        createReadOnlyInstanceRequest.setIsDirectPay(false);
        createReadOnlyInstanceRequest.setSubnets(new ArrayList<>());
        createReadOnlyInstanceRequest.setOvip("");
        createReadOnlyInstanceRequest.setEntryPort(0);
        createReadOnlyInstanceRequest.setResourceGroupId("");
        createReadOnlyInstanceRequest.setReplicaType("");
        createReadOnlyInstanceRequest.setIsInheritMasterAuthip(false);
        createReadOnlyInstanceRequest.setPurchaseCount(0);
        createReadOnlyInstanceRequest.setResourceType("");
        createReadOnlyInstanceRequest.setAutoRenewTimeUnit("");
        createReadOnlyInstanceRequest.setAutoRenewTime(0);
        CreateReadOnlyInstanceResponse response = rdsClient.createReadOnlyInstance(createReadOnlyInstanceRequest);
        System.out.println(response);
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
        QueryTaskListResponse response = rdsClient.queryTaskList(queryTaskListRequest);
        System.out.println(response);
    }
}
