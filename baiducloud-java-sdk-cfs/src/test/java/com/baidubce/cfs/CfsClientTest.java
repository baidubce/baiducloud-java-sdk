package com.baidubce.cfs;

import com.baidubce.cfs.models.BatchCreationOfPermissionGroupRulesRequest;
import com.baidubce.cfs.models.BatchCreationOfPermissionGroupRulesResponse;
import com.baidubce.cfs.models.CreateFileSystemRequest;
import com.baidubce.cfs.models.CreateFileSystemResponse;
import com.baidubce.cfs.models.CreateMountingTargetRequest;
import com.baidubce.cfs.models.CreateMountingTargetResponse;
import com.baidubce.cfs.models.CreatePermissionGroupRequest;
import com.baidubce.cfs.models.CreatePermissionGroupRulesRequest;
import com.baidubce.cfs.models.CreatePermissionGroupRulesResponse;
import com.baidubce.cfs.models.DeletePermissionGroupRequest;
import com.baidubce.cfs.models.DeletePermissionGroupRuleRequest;
import com.baidubce.cfs.models.DropFileSystemRequest;
import com.baidubce.cfs.models.DropMountTargetRequest;
import com.baidubce.cfs.models.ModifyTheMountTargetPermissionGroupRequest;
import com.baidubce.cfs.models.QueryFileSystemRequest;
import com.baidubce.cfs.models.QueryFileSystemResponse;
import com.baidubce.cfs.models.QueryMountedClientRequest;
import com.baidubce.cfs.models.QueryMountedClientResponse;
import com.baidubce.cfs.models.QueryMountingTargetRequest;
import com.baidubce.cfs.models.QueryMountingTargetResponse;
import com.baidubce.cfs.models.QueryPermissionGroupRequest;
import com.baidubce.cfs.models.QueryPermissionGroupResponse;
import com.baidubce.cfs.models.QueryPermissionGroupRulesRequest;
import com.baidubce.cfs.models.QueryPermissionGroupRulesResponse;
import com.baidubce.cfs.models.UpdateFileSystemLabelsRequest;
import com.baidubce.cfs.models.UpdateFileSystemRequest;
import com.baidubce.cfs.models.UpdatePermissionGroupRequest;
import com.baidubce.cfs.models.UpdatePermissionGroupRulesRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for CfsClient
 */
public class CfsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CfsClient cfsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        cfsClient = new CfsClient(config);
    }

    /**
     * batchCreationOfPermissionGroupRules
     *
     */
    @Test
    public void batchCreationOfPermissionGroupRulesTest() {
        BatchCreationOfPermissionGroupRulesRequest batchCreationOfPermissionGroupRulesRequest = new BatchCreationOfPermissionGroupRulesRequest();
        batchCreationOfPermissionGroupRulesRequest.setAgName("");
        batchCreationOfPermissionGroupRulesRequest.setAccessRules(new ArrayList<>());
        BatchCreationOfPermissionGroupRulesResponse response = cfsClient.batchCreationOfPermissionGroupRules(batchCreationOfPermissionGroupRulesRequest);
        System.out.println(response);
    }
    /**
     * createFileSystem
     *
     */
    @Test
    public void createFileSystemTest() {
        CreateFileSystemRequest createFileSystemRequest = new CreateFileSystemRequest();
        createFileSystemRequest.setFsName("");
        createFileSystemRequest.setZone("");
        createFileSystemRequest.setType("");
        createFileSystemRequest.setProtocol("");
        createFileSystemRequest.setTags(new ArrayList<>());
        createFileSystemRequest.setCapacityQuota(0L);
        CreateFileSystemResponse response = cfsClient.createFileSystem(createFileSystemRequest);
        System.out.println(response);
    }
    /**
     * createMountingTarget
     *
     */
    @Test
    public void createMountingTargetTest() {
        CreateMountingTargetRequest createMountingTargetRequest = new CreateMountingTargetRequest();
        createMountingTargetRequest.setFsId("");
        createMountingTargetRequest.setSubnetId("");
        createMountingTargetRequest.setVpcId("");
        createMountingTargetRequest.setAccessGroupName("");
        createMountingTargetRequest.setAddress("");
        CreateMountingTargetResponse response = cfsClient.createMountingTarget(createMountingTargetRequest);
        System.out.println(response);
    }
    /**
     * createPermissionGroup
     *
     */
    @Test
    public void createPermissionGroupTest() {
        CreatePermissionGroupRequest createPermissionGroupRequest = new CreatePermissionGroupRequest();
        createPermissionGroupRequest.setAccessGroupName("");
        createPermissionGroupRequest.setDescription("");
        cfsClient.createPermissionGroup(createPermissionGroupRequest);
    }
    /**
     * createPermissionGroupRules
     *
     */
    @Test
    public void createPermissionGroupRulesTest() {
        CreatePermissionGroupRulesRequest createPermissionGroupRulesRequest = new CreatePermissionGroupRulesRequest();
        createPermissionGroupRulesRequest.setAgName("");
        createPermissionGroupRulesRequest.setIp("");
        createPermissionGroupRulesRequest.setMask(0);
        createPermissionGroupRulesRequest.setWriteAccess("");
        createPermissionGroupRulesRequest.setUserAccess("");
        createPermissionGroupRulesRequest.setPriority(0);
        CreatePermissionGroupRulesResponse response = cfsClient.createPermissionGroupRules(createPermissionGroupRulesRequest);
        System.out.println(response);
    }
    /**
     * deletePermissionGroup
     *
     */
    @Test
    public void deletePermissionGroupTest() {
        DeletePermissionGroupRequest deletePermissionGroupRequest = new DeletePermissionGroupRequest();
        deletePermissionGroupRequest.setAgName("");
        cfsClient.deletePermissionGroup(deletePermissionGroupRequest);
    }
    /**
     * deletePermissionGroupRule
     *
     */
    @Test
    public void deletePermissionGroupRuleTest() {
        DeletePermissionGroupRuleRequest deletePermissionGroupRuleRequest = new DeletePermissionGroupRuleRequest();
        deletePermissionGroupRuleRequest.setAgName("");
        deletePermissionGroupRuleRequest.setArId("");
        cfsClient.deletePermissionGroupRule(deletePermissionGroupRuleRequest);
    }
    /**
     * dropFileSystem
     *
     */
    @Test
    public void dropFileSystemTest() {
        DropFileSystemRequest dropFileSystemRequest = new DropFileSystemRequest();
        dropFileSystemRequest.setFsId("");
        cfsClient.dropFileSystem(dropFileSystemRequest);
    }
    /**
     * dropMountTarget
     *
     */
    @Test
    public void dropMountTargetTest() {
        DropMountTargetRequest dropMountTargetRequest = new DropMountTargetRequest();
        dropMountTargetRequest.setFsId("");
        dropMountTargetRequest.setMountId("");
        cfsClient.dropMountTarget(dropMountTargetRequest);
    }
    /**
     * modifyTheMountTargetPermissionGroup
     *
     */
    @Test
    public void modifyTheMountTargetPermissionGroupTest() {
        ModifyTheMountTargetPermissionGroupRequest modifyTheMountTargetPermissionGroupRequest = new ModifyTheMountTargetPermissionGroupRequest();
        modifyTheMountTargetPermissionGroupRequest.setFsId("");
        modifyTheMountTargetPermissionGroupRequest.setMountID("");
        modifyTheMountTargetPermissionGroupRequest.setAccessGroupName("");
        cfsClient.modifyTheMountTargetPermissionGroup(modifyTheMountTargetPermissionGroupRequest);
    }
    /**
     * queryFileSystem
     *
     */
    @Test
    public void queryFileSystemTest() {
        QueryFileSystemRequest queryFileSystemRequest = new QueryFileSystemRequest();
        queryFileSystemRequest.setUserId("");
        queryFileSystemRequest.setFsId("");
        queryFileSystemRequest.setMarker("");
        queryFileSystemRequest.setMaxKeys(0);
        queryFileSystemRequest.setFilterTag("");
        QueryFileSystemResponse response = cfsClient.queryFileSystem(queryFileSystemRequest);
        System.out.println(response);
    }
    /**
     * queryMountedClient
     *
     */
    @Test
    public void queryMountedClientTest() {
        QueryMountedClientRequest queryMountedClientRequest = new QueryMountedClientRequest();
        queryMountedClientRequest.setFsId("");
        queryMountedClientRequest.setMarker("");
        queryMountedClientRequest.setMaxKeys(0);
        QueryMountedClientResponse response = cfsClient.queryMountedClient(queryMountedClientRequest);
        System.out.println(response);
    }
    /**
     * queryMountingTarget
     *
     */
    @Test
    public void queryMountingTargetTest() {
        QueryMountingTargetRequest queryMountingTargetRequest = new QueryMountingTargetRequest();
        queryMountingTargetRequest.setFId("");
        queryMountingTargetRequest.setMountId("");
        queryMountingTargetRequest.setMarker("");
        queryMountingTargetRequest.setMaxKeys(0);
        QueryMountingTargetResponse response = cfsClient.queryMountingTarget(queryMountingTargetRequest);
        System.out.println(response);
    }
    /**
     * queryPermissionGroup
     *
     */
    @Test
    public void queryPermissionGroupTest() {
        QueryPermissionGroupRequest queryPermissionGroupRequest = new QueryPermissionGroupRequest();
        queryPermissionGroupRequest.setAgName("");
        queryPermissionGroupRequest.setMarker("");
        queryPermissionGroupRequest.setMaxKeys(0);
        QueryPermissionGroupResponse response = cfsClient.queryPermissionGroup(queryPermissionGroupRequest);
        System.out.println(response);
    }
    /**
     * queryPermissionGroupRules
     *
     */
    @Test
    public void queryPermissionGroupRulesTest() {
        QueryPermissionGroupRulesRequest queryPermissionGroupRulesRequest = new QueryPermissionGroupRulesRequest();
        queryPermissionGroupRulesRequest.setAgName("");
        queryPermissionGroupRulesRequest.setArId("");
        queryPermissionGroupRulesRequest.setMarker("");
        queryPermissionGroupRulesRequest.setMaxKeys(0);
        QueryPermissionGroupRulesResponse response = cfsClient.queryPermissionGroupRules(queryPermissionGroupRulesRequest);
        System.out.println(response);
    }
    /**
     * updateFileSystem
     *
     */
    @Test
    public void updateFileSystemTest() {
        UpdateFileSystemRequest updateFileSystemRequest = new UpdateFileSystemRequest();
        updateFileSystemRequest.setFsId("");
        updateFileSystemRequest.setFsName("");
        updateFileSystemRequest.setCapacityQuota(0);
        cfsClient.updateFileSystem(updateFileSystemRequest);
    }
    /**
     * updateFileSystemLabels
     *
     */
    @Test
    public void updateFileSystemLabelsTest() {
        UpdateFileSystemLabelsRequest updateFileSystemLabelsRequest = new UpdateFileSystemLabelsRequest();
        updateFileSystemLabelsRequest.setTag("");
        updateFileSystemLabelsRequest.setFsId(new ArrayList<>());
        updateFileSystemLabelsRequest.setTags(new ArrayList<>());
        cfsClient.updateFileSystemLabels(updateFileSystemLabelsRequest);
    }
    /**
     * updatePermissionGroup
     *
     */
    @Test
    public void updatePermissionGroupTest() {
        UpdatePermissionGroupRequest updatePermissionGroupRequest = new UpdatePermissionGroupRequest();
        updatePermissionGroupRequest.setAgName("");
        updatePermissionGroupRequest.setDescription("");
        cfsClient.updatePermissionGroup(updatePermissionGroupRequest);
    }
    /**
     * updatePermissionGroupRules
     *
     */
    @Test
    public void updatePermissionGroupRulesTest() {
        UpdatePermissionGroupRulesRequest updatePermissionGroupRulesRequest = new UpdatePermissionGroupRulesRequest();
        updatePermissionGroupRulesRequest.setAgName("");
        updatePermissionGroupRulesRequest.setArId("");
        updatePermissionGroupRulesRequest.setIp("");
        updatePermissionGroupRulesRequest.setMask(0);
        updatePermissionGroupRulesRequest.setWriteAccess("");
        updatePermissionGroupRulesRequest.setUserAccess("");
        updatePermissionGroupRulesRequest.setPriority(0);
        cfsClient.updatePermissionGroupRules(updatePermissionGroupRulesRequest);
    }
}
