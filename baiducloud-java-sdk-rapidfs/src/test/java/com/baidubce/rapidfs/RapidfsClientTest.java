package com.baidubce.rapidfs;

import com.baidubce.rapidfs.models.AddCacheNodesRequest;
import com.baidubce.rapidfs.models.AddCacheNodesResponse;
import com.baidubce.rapidfs.models.CancelCacheRuleJobRequest;
import com.baidubce.rapidfs.models.CancelMetaSyncJobRequest;
import com.baidubce.rapidfs.models.CheckBeforeAddCacheNodesRequest;
import com.baidubce.rapidfs.models.CheckBeforeAddCacheNodesResponse;
import com.baidubce.rapidfs.models.CheckBeforeCreateInstanceRequest;
import com.baidubce.rapidfs.models.CheckBeforeCreateInstanceResponse;
import com.baidubce.rapidfs.models.CreateAndAssignTagRequest;
import com.baidubce.rapidfs.models.CreateAuthGroupRequest;
import com.baidubce.rapidfs.models.CreateAuthGroupResponse;
import com.baidubce.rapidfs.models.CreateCacheRuleRequest;
import com.baidubce.rapidfs.models.CreateCacheRuleResponse;
import com.baidubce.rapidfs.models.CreateInstanceRequest;
import com.baidubce.rapidfs.models.CreateInstanceResponse;
import com.baidubce.rapidfs.models.CreateMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.CreateMetaSyncRuleResponse;
import com.baidubce.rapidfs.models.DeleteAuthGroupRequest;
import com.baidubce.rapidfs.models.DeleteCacheRuleRequest;
import com.baidubce.rapidfs.models.DeleteInstanceRequest;
import com.baidubce.rapidfs.models.DeleteInstanceResponse;
import com.baidubce.rapidfs.models.DeleteMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.DescribeAihcResourcePoolsRequest;
import com.baidubce.rapidfs.models.DescribeAihcResourcePoolsResponse;
import com.baidubce.rapidfs.models.DescribeAllocatableDataSrcQuotaRequest;
import com.baidubce.rapidfs.models.DescribeAllocatableDataSrcQuotaResponse;
import com.baidubce.rapidfs.models.DescribeAuthGroupRequest;
import com.baidubce.rapidfs.models.DescribeAuthGroupResponse;
import com.baidubce.rapidfs.models.DescribeAuthGroupsRequest;
import com.baidubce.rapidfs.models.DescribeAuthGroupsResponse;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupRequest;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupResponse;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupsRequest;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupsResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodeBccCandidatesRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeBccCandidatesResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodeQuotaRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeQuotaResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodeRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodesRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodesResponse;
import com.baidubce.rapidfs.models.DescribeCacheRuleJobsRequest;
import com.baidubce.rapidfs.models.DescribeCacheRuleJobsResponse;
import com.baidubce.rapidfs.models.DescribeCacheRuleRequest;
import com.baidubce.rapidfs.models.DescribeCacheRuleResponse;
import com.baidubce.rapidfs.models.DescribeCacheRulesRequest;
import com.baidubce.rapidfs.models.DescribeCacheRulesResponse;
import com.baidubce.rapidfs.models.DescribeCceClustersRequest;
import com.baidubce.rapidfs.models.DescribeCceClustersResponse;
import com.baidubce.rapidfs.models.DescribeDataSrcRequest;
import com.baidubce.rapidfs.models.DescribeDataSrcResponse;
import com.baidubce.rapidfs.models.DescribeDataSrcsRequest;
import com.baidubce.rapidfs.models.DescribeDataSrcsResponse;
import com.baidubce.rapidfs.models.DescribeInstanceRequest;
import com.baidubce.rapidfs.models.DescribeInstanceResponse;
import com.baidubce.rapidfs.models.DescribeInstancesRequest;
import com.baidubce.rapidfs.models.DescribeInstancesResponse;
import com.baidubce.rapidfs.models.DescribeMetaSyncJobsRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncJobsResponse;
import com.baidubce.rapidfs.models.DescribeMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncRuleResponse;
import com.baidubce.rapidfs.models.DescribeMetaSyncRulesRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncRulesResponse;
import com.baidubce.rapidfs.models.DescribeOrderRequest;
import com.baidubce.rapidfs.models.DescribeOrderResponse;
import com.baidubce.rapidfs.models.DescribePriceRequest;
import com.baidubce.rapidfs.models.DescribePriceResponse;
import com.baidubce.rapidfs.models.DescribeSpecsRequest;
import com.baidubce.rapidfs.models.DescribeSpecsResponse;
import com.baidubce.rapidfs.models.DescribeTokenRequest;
import com.baidubce.rapidfs.models.DescribeTokenResponse;
import com.baidubce.rapidfs.models.DescribeZonesResponse;
import com.baidubce.rapidfs.models.DisableMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.EnableMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.ExecuteCacheRuleJobRequest;
import com.baidubce.rapidfs.models.ExecuteMetaSyncJobRequest;
import com.baidubce.rapidfs.models.ImportDataSrcRequest;
import com.baidubce.rapidfs.models.ImportDataSrcResponse;
import com.baidubce.rapidfs.models.ModifyAuthGroupRequest;
import com.baidubce.rapidfs.models.ModifyDataSrcRequest;
import com.baidubce.rapidfs.models.ModifyMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.ModifyTokenRequest;
import com.baidubce.rapidfs.models.RemoveCacheNodesRequest;
import com.baidubce.rapidfs.models.RemoveDataSrcRequest;
import com.baidubce.rapidfs.models.RemoveDataSrcResponse;
import com.baidubce.rapidfs.models.ResizeInstanceRequest;
import com.baidubce.rapidfs.models.ResizeInstanceResponse;
import com.baidubce.rapidfs.models.RestartCacheNodesRequest;
import com.baidubce.rapidfs.models.StartCacheNodesRequest;
import com.baidubce.rapidfs.models.StopCacheNodesRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for RapidfsClient
 */
public class RapidfsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private RapidfsClient rapidfsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        rapidfsClient = new RapidfsClient(config);
    }

    /**
     * addCacheNodes
     *
     */
    @Test
    public void addCacheNodesTest() {
        AddCacheNodesRequest addCacheNodesRequest = new AddCacheNodesRequest();
        addCacheNodesRequest.setClientToken("");
        addCacheNodesRequest.setInstanceId("");
        addCacheNodesRequest.setType("");
        addCacheNodesRequest.setCacheNodes(new ArrayList<>());
        AddCacheNodesResponse response = rapidfsClient.addCacheNodes(addCacheNodesRequest);
        System.out.println(response);
    }
    /**
     * cancelCacheRuleJob
     *
     */
    @Test
    public void cancelCacheRuleJobTest() {
        CancelCacheRuleJobRequest cancelCacheRuleJobRequest = new CancelCacheRuleJobRequest();
        cancelCacheRuleJobRequest.setClientToken("");
        cancelCacheRuleJobRequest.setInstanceId("");
        cancelCacheRuleJobRequest.setDataSrcId("");
        cancelCacheRuleJobRequest.setCacheRuleId("");
        rapidfsClient.cancelCacheRuleJob(cancelCacheRuleJobRequest);
    }
    /**
     * cancelMetaSyncJob
     *
     */
    @Test
    public void cancelMetaSyncJobTest() {
        CancelMetaSyncJobRequest cancelMetaSyncJobRequest = new CancelMetaSyncJobRequest();
        cancelMetaSyncJobRequest.setClientToken("");
        cancelMetaSyncJobRequest.setInstanceId("");
        cancelMetaSyncJobRequest.setDataSrcId("");
        cancelMetaSyncJobRequest.setMetaSyncRuleId("");
        rapidfsClient.cancelMetaSyncJob(cancelMetaSyncJobRequest);
    }
    /**
     * checkBeforeAddCacheNodes
     *
     */
    @Test
    public void checkBeforeAddCacheNodesTest() {
        CheckBeforeAddCacheNodesRequest checkBeforeAddCacheNodesRequest = new CheckBeforeAddCacheNodesRequest();
        checkBeforeAddCacheNodesRequest.setInstanceId("");
        checkBeforeAddCacheNodesRequest.setType("");
        checkBeforeAddCacheNodesRequest.setCacheNodes(new ArrayList<>());
        CheckBeforeAddCacheNodesResponse response = rapidfsClient.checkBeforeAddCacheNodes(checkBeforeAddCacheNodesRequest);
        System.out.println(response);
    }
    /**
     * checkBeforeCreateInstance
     *
     */
    @Test
    public void checkBeforeCreateInstanceTest() {
        CheckBeforeCreateInstanceRequest checkBeforeCreateInstanceRequest = new CheckBeforeCreateInstanceRequest();
        checkBeforeCreateInstanceRequest.setZone("");
        checkBeforeCreateInstanceRequest.setVpcId("");
        checkBeforeCreateInstanceRequest.setSubnetId("");
        checkBeforeCreateInstanceRequest.setManagedMode("");
        checkBeforeCreateInstanceRequest.setMetaSpec("");
        checkBeforeCreateInstanceRequest.setDataSpec("");
        checkBeforeCreateInstanceRequest.setType("");
        checkBeforeCreateInstanceRequest.setCapacityTiB(0);
        checkBeforeCreateInstanceRequest.setCceClusterId("");
        checkBeforeCreateInstanceRequest.setAihcResourcePoolId("");
        checkBeforeCreateInstanceRequest.setK8sControllerId("");
        checkBeforeCreateInstanceRequest.setK8sControllerToken("");
        CheckBeforeCreateInstanceResponse response = rapidfsClient.checkBeforeCreateInstance(checkBeforeCreateInstanceRequest);
        System.out.println(response);
    }
    /**
     * createAndAssignTag
     *
     */
    @Test
    public void createAndAssignTagTest() {
        CreateAndAssignTagRequest createAndAssignTagRequest = new CreateAndAssignTagRequest();
        createAndAssignTagRequest.setClientToken("");
        createAndAssignTagRequest.setTagResources(new ArrayList<>());
        rapidfsClient.createAndAssignTag(createAndAssignTagRequest);
    }
    /**
     * createAuthGroup
     *
     */
    @Test
    public void createAuthGroupTest() {
        CreateAuthGroupRequest createAuthGroupRequest = new CreateAuthGroupRequest();
        createAuthGroupRequest.setClientToken("");
        createAuthGroupRequest.setAuthGroupName("");
        createAuthGroupRequest.setInstanceId("");
        createAuthGroupRequest.setDescription("");
        createAuthGroupRequest.setAuthInfos(new ArrayList<>());
        CreateAuthGroupResponse response = rapidfsClient.createAuthGroup(createAuthGroupRequest);
        System.out.println(response);
    }
    /**
     * createCacheRule
     *
     */
    @Test
    public void createCacheRuleTest() {
        CreateCacheRuleRequest createCacheRuleRequest = new CreateCacheRuleRequest();
        createCacheRuleRequest.setClientToken("");
        createCacheRuleRequest.setInstanceId("");
        createCacheRuleRequest.setDataSrcId("");
        createCacheRuleRequest.setCacheRuleName("");
        createCacheRuleRequest.setType("");
        createCacheRuleRequest.setDirectory("");
        createCacheRuleRequest.setExecuteOnCreate(false);
        createCacheRuleRequest.setDescription("");
        CreateCacheRuleResponse response = rapidfsClient.createCacheRule(createCacheRuleRequest);
        System.out.println(response);
    }
    /**
     * createInstance
     *
     */
    @Test
    public void createInstanceTest() {
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest();
        createInstanceRequest.setClientToken("");
        createInstanceRequest.setInstanceName("");
        createInstanceRequest.setDescription("");
        createInstanceRequest.setZone("");
        createInstanceRequest.setVpcId("");
        createInstanceRequest.setSubnetId("");
        createInstanceRequest.setManagedMode("");
        createInstanceRequest.setMetaSpec("");
        createInstanceRequest.setDataSpec("");
        createInstanceRequest.setType("");
        createInstanceRequest.setCapacityTiB(0);
        createInstanceRequest.setCceClusterId("");
        createInstanceRequest.setAihcResourcePoolId("");
        createInstanceRequest.setK8sControllerId("");
        createInstanceRequest.setK8sControllerToken("");
        createInstanceRequest.setTokenRefreshIntervalMinutes(0);
        createInstanceRequest.setTags(new ArrayList<>());
        CreateInstanceResponse response = rapidfsClient.createInstance(createInstanceRequest);
        System.out.println(response);
    }
    /**
     * createMetaSyncRule
     *
     */
    @Test
    public void createMetaSyncRuleTest() {
        CreateMetaSyncRuleRequest createMetaSyncRuleRequest = new CreateMetaSyncRuleRequest();
        createMetaSyncRuleRequest.setClientToken("");
        createMetaSyncRuleRequest.setInstanceId("");
        createMetaSyncRuleRequest.setDataSrcId("");
        createMetaSyncRuleRequest.setMetaSyncRuleName("");
        createMetaSyncRuleRequest.setType("");
        createMetaSyncRuleRequest.setDirectory("");
        createMetaSyncRuleRequest.setIntervalMinutes(0);
        createMetaSyncRuleRequest.setExecuteOnCreate(false);
        createMetaSyncRuleRequest.setEnableOnCreate(false);
        createMetaSyncRuleRequest.setDescription("");
        CreateMetaSyncRuleResponse response = rapidfsClient.createMetaSyncRule(createMetaSyncRuleRequest);
        System.out.println(response);
    }
    /**
     * deleteAuthGroup
     *
     */
    @Test
    public void deleteAuthGroupTest() {
        DeleteAuthGroupRequest deleteAuthGroupRequest = new DeleteAuthGroupRequest();
        deleteAuthGroupRequest.setClientToken("");
        deleteAuthGroupRequest.setInstanceId("");
        deleteAuthGroupRequest.setAuthGroupId("");
        rapidfsClient.deleteAuthGroup(deleteAuthGroupRequest);
    }
    /**
     * deleteCacheRule
     *
     */
    @Test
    public void deleteCacheRuleTest() {
        DeleteCacheRuleRequest deleteCacheRuleRequest = new DeleteCacheRuleRequest();
        deleteCacheRuleRequest.setClientToken("");
        deleteCacheRuleRequest.setInstanceId("");
        deleteCacheRuleRequest.setDataSrcId("");
        deleteCacheRuleRequest.setCacheRuleId("");
        rapidfsClient.deleteCacheRule(deleteCacheRuleRequest);
    }
    /**
     * deleteInstance
     *
     */
    @Test
    public void deleteInstanceTest() {
        DeleteInstanceRequest deleteInstanceRequest = new DeleteInstanceRequest();
        deleteInstanceRequest.setClientToken("");
        deleteInstanceRequest.setInstanceId("");
        deleteInstanceRequest.setToken("");
        DeleteInstanceResponse response = rapidfsClient.deleteInstance(deleteInstanceRequest);
        System.out.println(response);
    }
    /**
     * deleteMetaSyncRule
     *
     */
    @Test
    public void deleteMetaSyncRuleTest() {
        DeleteMetaSyncRuleRequest deleteMetaSyncRuleRequest = new DeleteMetaSyncRuleRequest();
        deleteMetaSyncRuleRequest.setClientToken("");
        deleteMetaSyncRuleRequest.setInstanceId("");
        deleteMetaSyncRuleRequest.setDataSrcId("");
        deleteMetaSyncRuleRequest.setMetaSyncRuleId("");
        rapidfsClient.deleteMetaSyncRule(deleteMetaSyncRuleRequest);
    }
    /**
     * describeAihcResourcePools
     *
     */
    @Test
    public void describeAihcResourcePoolsTest() {
        DescribeAihcResourcePoolsRequest describeAihcResourcePoolsRequest = new DescribeAihcResourcePoolsRequest();
        describeAihcResourcePoolsRequest.setVpcId("");
        describeAihcResourcePoolsRequest.setMaxKeys(0);
        describeAihcResourcePoolsRequest.setMarker("");
        DescribeAihcResourcePoolsResponse response = rapidfsClient.describeAihcResourcePools(describeAihcResourcePoolsRequest);
        System.out.println(response);
    }
    /**
     * describeAllocatableDataSrcQuota
     *
     */
    @Test
    public void describeAllocatableDataSrcQuotaTest() {
        DescribeAllocatableDataSrcQuotaRequest describeAllocatableDataSrcQuotaRequest = new DescribeAllocatableDataSrcQuotaRequest();
        describeAllocatableDataSrcQuotaRequest.setInstanceId("");
        describeAllocatableDataSrcQuotaRequest.setDataSrcId("");
        DescribeAllocatableDataSrcQuotaResponse response = rapidfsClient.describeAllocatableDataSrcQuota(describeAllocatableDataSrcQuotaRequest);
        System.out.println(response);
    }
    /**
     * describeAuthGroup
     *
     */
    @Test
    public void describeAuthGroupTest() {
        DescribeAuthGroupRequest describeAuthGroupRequest = new DescribeAuthGroupRequest();
        describeAuthGroupRequest.setInstanceId("");
        describeAuthGroupRequest.setAuthGroupId("");
        DescribeAuthGroupResponse response = rapidfsClient.describeAuthGroup(describeAuthGroupRequest);
        System.out.println(response);
    }
    /**
     * describeAuthGroups
     *
     */
    @Test
    public void describeAuthGroupsTest() {
        DescribeAuthGroupsRequest describeAuthGroupsRequest = new DescribeAuthGroupsRequest();
        describeAuthGroupsRequest.setInstanceId("");
        describeAuthGroupsRequest.setFilters(new ArrayList<>());
        describeAuthGroupsRequest.setMaxKeys(0);
        describeAuthGroupsRequest.setMarker("");
        DescribeAuthGroupsResponse response = rapidfsClient.describeAuthGroups(describeAuthGroupsRequest);
        System.out.println(response);
    }
    /**
     * describeCacheDeployGroup
     *
     */
    @Test
    public void describeCacheDeployGroupTest() {
        DescribeCacheDeployGroupRequest describeCacheDeployGroupRequest = new DescribeCacheDeployGroupRequest();
        describeCacheDeployGroupRequest.setInstanceId("");
        describeCacheDeployGroupRequest.setCacheDeployGroupName("");
        describeCacheDeployGroupRequest.setCacheDeployGroupNS("");
        DescribeCacheDeployGroupResponse response = rapidfsClient.describeCacheDeployGroup(describeCacheDeployGroupRequest);
        System.out.println(response);
    }
    /**
     * describeCacheDeployGroups
     *
     */
    @Test
    public void describeCacheDeployGroupsTest() {
        DescribeCacheDeployGroupsRequest describeCacheDeployGroupsRequest = new DescribeCacheDeployGroupsRequest();
        describeCacheDeployGroupsRequest.setInstanceId("");
        describeCacheDeployGroupsRequest.setMaxKeys(0);
        describeCacheDeployGroupsRequest.setMarker("");
        DescribeCacheDeployGroupsResponse response = rapidfsClient.describeCacheDeployGroups(describeCacheDeployGroupsRequest);
        System.out.println(response);
    }
    /**
     * describeCacheNode
     *
     */
    @Test
    public void describeCacheNodeTest() {
        DescribeCacheNodeRequest describeCacheNodeRequest = new DescribeCacheNodeRequest();
        describeCacheNodeRequest.setInstanceId("");
        describeCacheNodeRequest.setCacheNodeId("");
        DescribeCacheNodeResponse response = rapidfsClient.describeCacheNode(describeCacheNodeRequest);
        System.out.println(response);
    }
    /**
     * describeCacheNodeBccCandidates
     *
     */
    @Test
    public void describeCacheNodeBccCandidatesTest() {
        DescribeCacheNodeBccCandidatesRequest describeCacheNodeBccCandidatesRequest = new DescribeCacheNodeBccCandidatesRequest();
        describeCacheNodeBccCandidatesRequest.setInstanceId("");
        describeCacheNodeBccCandidatesRequest.setVpcId("");
        describeCacheNodeBccCandidatesRequest.setFilters(new ArrayList<>());
        describeCacheNodeBccCandidatesRequest.setMaxKeys(0);
        describeCacheNodeBccCandidatesRequest.setMarker("");
        DescribeCacheNodeBccCandidatesResponse response = rapidfsClient.describeCacheNodeBccCandidates(describeCacheNodeBccCandidatesRequest);
        System.out.println(response);
    }
    /**
     * describeCacheNodeQuota
     *
     */
    @Test
    public void describeCacheNodeQuotaTest() {
        DescribeCacheNodeQuotaRequest describeCacheNodeQuotaRequest = new DescribeCacheNodeQuotaRequest();
        describeCacheNodeQuotaRequest.setInstanceId("");
        DescribeCacheNodeQuotaResponse response = rapidfsClient.describeCacheNodeQuota(describeCacheNodeQuotaRequest);
        System.out.println(response);
    }
    /**
     * describeCacheNodes
     *
     */
    @Test
    public void describeCacheNodesTest() {
        DescribeCacheNodesRequest describeCacheNodesRequest = new DescribeCacheNodesRequest();
        describeCacheNodesRequest.setInstanceId("");
        describeCacheNodesRequest.setFilters(new ArrayList<>());
        describeCacheNodesRequest.setMaxKeys(0);
        describeCacheNodesRequest.setMarker("");
        DescribeCacheNodesResponse response = rapidfsClient.describeCacheNodes(describeCacheNodesRequest);
        System.out.println(response);
    }
    /**
     * describeCacheRule
     *
     */
    @Test
    public void describeCacheRuleTest() {
        DescribeCacheRuleRequest describeCacheRuleRequest = new DescribeCacheRuleRequest();
        describeCacheRuleRequest.setInstanceId("");
        describeCacheRuleRequest.setDataSrcId("");
        describeCacheRuleRequest.setCacheRuleId("");
        DescribeCacheRuleResponse response = rapidfsClient.describeCacheRule(describeCacheRuleRequest);
        System.out.println(response);
    }
    /**
     * describeCacheRuleJobs
     *
     */
    @Test
    public void describeCacheRuleJobsTest() {
        DescribeCacheRuleJobsRequest describeCacheRuleJobsRequest = new DescribeCacheRuleJobsRequest();
        describeCacheRuleJobsRequest.setInstanceId("");
        describeCacheRuleJobsRequest.setDataSrcId("");
        describeCacheRuleJobsRequest.setCacheRuleId("");
        describeCacheRuleJobsRequest.setMaxKeys(0);
        describeCacheRuleJobsRequest.setMarker("");
        DescribeCacheRuleJobsResponse response = rapidfsClient.describeCacheRuleJobs(describeCacheRuleJobsRequest);
        System.out.println(response);
    }
    /**
     * describeCacheRules
     *
     */
    @Test
    public void describeCacheRulesTest() {
        DescribeCacheRulesRequest describeCacheRulesRequest = new DescribeCacheRulesRequest();
        describeCacheRulesRequest.setInstanceId("");
        describeCacheRulesRequest.setFilters(new ArrayList<>());
        describeCacheRulesRequest.setMaxKeys(0);
        describeCacheRulesRequest.setMarker("");
        DescribeCacheRulesResponse response = rapidfsClient.describeCacheRules(describeCacheRulesRequest);
        System.out.println(response);
    }
    /**
     * describeCceClusters
     *
     */
    @Test
    public void describeCceClustersTest() {
        DescribeCceClustersRequest describeCceClustersRequest = new DescribeCceClustersRequest();
        describeCceClustersRequest.setVpcId("");
        describeCceClustersRequest.setMaxKeys(0);
        describeCceClustersRequest.setMarker("");
        DescribeCceClustersResponse response = rapidfsClient.describeCceClusters(describeCceClustersRequest);
        System.out.println(response);
    }
    /**
     * describeDataSrc
     *
     */
    @Test
    public void describeDataSrcTest() {
        DescribeDataSrcRequest describeDataSrcRequest = new DescribeDataSrcRequest();
        describeDataSrcRequest.setInstanceId("");
        describeDataSrcRequest.setDataSrcId("");
        DescribeDataSrcResponse response = rapidfsClient.describeDataSrc(describeDataSrcRequest);
        System.out.println(response);
    }
    /**
     * describeDataSrcs
     *
     */
    @Test
    public void describeDataSrcsTest() {
        DescribeDataSrcsRequest describeDataSrcsRequest = new DescribeDataSrcsRequest();
        describeDataSrcsRequest.setInstanceId("");
        describeDataSrcsRequest.setFilters(new ArrayList<>());
        describeDataSrcsRequest.setMaxKeys(0);
        describeDataSrcsRequest.setMarker("");
        DescribeDataSrcsResponse response = rapidfsClient.describeDataSrcs(describeDataSrcsRequest);
        System.out.println(response);
    }
    /**
     * describeInstance
     *
     */
    @Test
    public void describeInstanceTest() {
        DescribeInstanceRequest describeInstanceRequest = new DescribeInstanceRequest();
        describeInstanceRequest.setInstanceId("");
        DescribeInstanceResponse response = rapidfsClient.describeInstance(describeInstanceRequest);
        System.out.println(response);
    }
    /**
     * describeInstances
     *
     */
    @Test
    public void describeInstancesTest() {
        DescribeInstancesRequest describeInstancesRequest = new DescribeInstancesRequest();
        describeInstancesRequest.setFilters(new ArrayList<>());
        describeInstancesRequest.setMaxKeys(0);
        describeInstancesRequest.setMarker("");
        DescribeInstancesResponse response = rapidfsClient.describeInstances(describeInstancesRequest);
        System.out.println(response);
    }
    /**
     * describeMetaSyncJobs
     *
     */
    @Test
    public void describeMetaSyncJobsTest() {
        DescribeMetaSyncJobsRequest describeMetaSyncJobsRequest = new DescribeMetaSyncJobsRequest();
        describeMetaSyncJobsRequest.setInstanceId("");
        describeMetaSyncJobsRequest.setDataSrcId("");
        describeMetaSyncJobsRequest.setMetaSyncRuleId("");
        describeMetaSyncJobsRequest.setMaxKeys(0);
        describeMetaSyncJobsRequest.setMarker("");
        DescribeMetaSyncJobsResponse response = rapidfsClient.describeMetaSyncJobs(describeMetaSyncJobsRequest);
        System.out.println(response);
    }
    /**
     * describeMetaSyncRule
     *
     */
    @Test
    public void describeMetaSyncRuleTest() {
        DescribeMetaSyncRuleRequest describeMetaSyncRuleRequest = new DescribeMetaSyncRuleRequest();
        describeMetaSyncRuleRequest.setInstanceId("");
        describeMetaSyncRuleRequest.setDataSrcId("");
        describeMetaSyncRuleRequest.setMetaSyncRuleId("");
        DescribeMetaSyncRuleResponse response = rapidfsClient.describeMetaSyncRule(describeMetaSyncRuleRequest);
        System.out.println(response);
    }
    /**
     * describeMetaSyncRules
     *
     */
    @Test
    public void describeMetaSyncRulesTest() {
        DescribeMetaSyncRulesRequest describeMetaSyncRulesRequest = new DescribeMetaSyncRulesRequest();
        describeMetaSyncRulesRequest.setInstanceId("");
        describeMetaSyncRulesRequest.setFilters(new ArrayList<>());
        describeMetaSyncRulesRequest.setMaxKeys(0);
        describeMetaSyncRulesRequest.setMarker("");
        DescribeMetaSyncRulesResponse response = rapidfsClient.describeMetaSyncRules(describeMetaSyncRulesRequest);
        System.out.println(response);
    }
    /**
     * describeOrder
     *
     */
    @Test
    public void describeOrderTest() {
        DescribeOrderRequest describeOrderRequest = new DescribeOrderRequest();
        describeOrderRequest.setOrderId("");
        DescribeOrderResponse response = rapidfsClient.describeOrder(describeOrderRequest);
        System.out.println(response);
    }
    /**
     * describePrice
     *
     */
    @Test
    public void describePriceTest() {
        DescribePriceRequest describePriceRequest = new DescribePriceRequest();
        describePriceRequest.setCurrency("");
        describePriceRequest.setManagedMode("");
        describePriceRequest.setMetaSpec("");
        describePriceRequest.setDataSpec("");
        describePriceRequest.setCapacityTiB(0);
        DescribePriceResponse response = rapidfsClient.describePrice(describePriceRequest);
        System.out.println(response);
    }
    /**
     * describeSpecs
     *
     */
    @Test
    public void describeSpecsTest() {
        DescribeSpecsRequest describeSpecsRequest = new DescribeSpecsRequest();
        describeSpecsRequest.setFilters(new ArrayList<>());
        DescribeSpecsResponse response = rapidfsClient.describeSpecs(describeSpecsRequest);
        System.out.println(response);
    }
    /**
     * describeToken
     *
     */
    @Test
    public void describeTokenTest() {
        DescribeTokenRequest describeTokenRequest = new DescribeTokenRequest();
        describeTokenRequest.setInstanceId("");
        describeTokenRequest.setTokenId("");
        DescribeTokenResponse response = rapidfsClient.describeToken(describeTokenRequest);
        System.out.println(response);
    }
    /**
     * describeZones
     *
     */
    @Test
    public void describeZonesTest() {
        DescribeZonesResponse response = rapidfsClient.describeZones();
        System.out.println(response);
    }
    /**
     * disableMetaSyncRule
     *
     */
    @Test
    public void disableMetaSyncRuleTest() {
        DisableMetaSyncRuleRequest disableMetaSyncRuleRequest = new DisableMetaSyncRuleRequest();
        disableMetaSyncRuleRequest.setClientToken("");
        disableMetaSyncRuleRequest.setInstanceId("");
        disableMetaSyncRuleRequest.setDataSrcId("");
        disableMetaSyncRuleRequest.setMetaSyncRuleId("");
        rapidfsClient.disableMetaSyncRule(disableMetaSyncRuleRequest);
    }
    /**
     * enableMetaSyncRule
     *
     */
    @Test
    public void enableMetaSyncRuleTest() {
        EnableMetaSyncRuleRequest enableMetaSyncRuleRequest = new EnableMetaSyncRuleRequest();
        enableMetaSyncRuleRequest.setClientToken("");
        enableMetaSyncRuleRequest.setInstanceId("");
        enableMetaSyncRuleRequest.setDataSrcId("");
        enableMetaSyncRuleRequest.setMetaSyncRuleId("");
        rapidfsClient.enableMetaSyncRule(enableMetaSyncRuleRequest);
    }
    /**
     * executeCacheRuleJob
     *
     */
    @Test
    public void executeCacheRuleJobTest() {
        ExecuteCacheRuleJobRequest executeCacheRuleJobRequest = new ExecuteCacheRuleJobRequest();
        executeCacheRuleJobRequest.setClientToken("");
        executeCacheRuleJobRequest.setInstanceId("");
        executeCacheRuleJobRequest.setDataSrcId("");
        executeCacheRuleJobRequest.setCacheRuleId("");
        rapidfsClient.executeCacheRuleJob(executeCacheRuleJobRequest);
    }
    /**
     * executeMetaSyncJob
     *
     */
    @Test
    public void executeMetaSyncJobTest() {
        ExecuteMetaSyncJobRequest executeMetaSyncJobRequest = new ExecuteMetaSyncJobRequest();
        executeMetaSyncJobRequest.setClientToken("");
        executeMetaSyncJobRequest.setInstanceId("");
        executeMetaSyncJobRequest.setDataSrcId("");
        executeMetaSyncJobRequest.setMetaSyncRuleId("");
        rapidfsClient.executeMetaSyncJob(executeMetaSyncJobRequest);
    }
    /**
     * importDataSrc
     *
     */
    @Test
    public void importDataSrcTest() {
        ImportDataSrcRequest importDataSrcRequest = new ImportDataSrcRequest();
        importDataSrcRequest.setClientToken("");
        importDataSrcRequest.setInstanceId("");
        importDataSrcRequest.setDataSrcName("");
        importDataSrcRequest.setBucket("");
        importDataSrcRequest.setOtherAccount(false);
        importDataSrcRequest.setBucketAK("");
        importDataSrcRequest.setBucketSK("");
        importDataSrcRequest.setBucketStsToken("");
        importDataSrcRequest.setDirPrefix("");
        importDataSrcRequest.setKeepSymlink(false);
        importDataSrcRequest.setAuthGroupId("");
        importDataSrcRequest.setDescription("");
        importDataSrcRequest.setQuotaMiB(0);
        ImportDataSrcResponse response = rapidfsClient.importDataSrc(importDataSrcRequest);
        System.out.println(response);
    }
    /**
     * modifyAuthGroup
     *
     */
    @Test
    public void modifyAuthGroupTest() {
        ModifyAuthGroupRequest modifyAuthGroupRequest = new ModifyAuthGroupRequest();
        modifyAuthGroupRequest.setClientToken("");
        modifyAuthGroupRequest.setAuthGroupId("");
        modifyAuthGroupRequest.setInstanceId("");
        modifyAuthGroupRequest.setAuthGroupName("");
        modifyAuthGroupRequest.setDescription("");
        modifyAuthGroupRequest.setAuthInfos(new ArrayList<>());
        modifyAuthGroupRequest.setOriginalAuthInfos(new ArrayList<>());
        rapidfsClient.modifyAuthGroup(modifyAuthGroupRequest);
    }
    /**
     * modifyDataSrc
     *
     */
    @Test
    public void modifyDataSrcTest() {
        ModifyDataSrcRequest modifyDataSrcRequest = new ModifyDataSrcRequest();
        modifyDataSrcRequest.setClientToken("");
        modifyDataSrcRequest.setDataSrcId("");
        modifyDataSrcRequest.setInstanceId("");
        modifyDataSrcRequest.setKeepSymlink(false);
        modifyDataSrcRequest.setAuthGroupId("");
        modifyDataSrcRequest.setDescription("");
        modifyDataSrcRequest.setQuotaMiB(0);
        rapidfsClient.modifyDataSrc(modifyDataSrcRequest);
    }
    /**
     * modifyMetaSyncRule
     *
     */
    @Test
    public void modifyMetaSyncRuleTest() {
        ModifyMetaSyncRuleRequest modifyMetaSyncRuleRequest = new ModifyMetaSyncRuleRequest();
        modifyMetaSyncRuleRequest.setClientToken("");
        modifyMetaSyncRuleRequest.setInstanceId("");
        modifyMetaSyncRuleRequest.setDataSrcId("");
        modifyMetaSyncRuleRequest.setMetaSyncRuleId("");
        modifyMetaSyncRuleRequest.setMetaSyncRuleName("");
        modifyMetaSyncRuleRequest.setIntervalMinutes(0);
        modifyMetaSyncRuleRequest.setDescription("");
        rapidfsClient.modifyMetaSyncRule(modifyMetaSyncRuleRequest);
    }
    /**
     * modifyToken
     *
     */
    @Test
    public void modifyTokenTest() {
        ModifyTokenRequest modifyTokenRequest = new ModifyTokenRequest();
        modifyTokenRequest.setClientToken("");
        modifyTokenRequest.setInstanceId("");
        modifyTokenRequest.setTokenId("");
        modifyTokenRequest.setTokenRefreshIntervalMinutes(0);
        rapidfsClient.modifyToken(modifyTokenRequest);
    }
    /**
     * removeCacheNodes
     *
     */
    @Test
    public void removeCacheNodesTest() {
        RemoveCacheNodesRequest removeCacheNodesRequest = new RemoveCacheNodesRequest();
        removeCacheNodesRequest.setClientToken("");
        removeCacheNodesRequest.setInstanceId("");
        removeCacheNodesRequest.setCacheNodeIds(new ArrayList<>());
        removeCacheNodesRequest.setForceRemoveOnOffline(false);
        rapidfsClient.removeCacheNodes(removeCacheNodesRequest);
    }
    /**
     * removeDataSrc
     *
     */
    @Test
    public void removeDataSrcTest() {
        RemoveDataSrcRequest removeDataSrcRequest = new RemoveDataSrcRequest();
        removeDataSrcRequest.setClientToken("");
        removeDataSrcRequest.setDataSrcId("");
        removeDataSrcRequest.setInstanceId("");
        removeDataSrcRequest.setToken("");
        RemoveDataSrcResponse response = rapidfsClient.removeDataSrc(removeDataSrcRequest);
        System.out.println(response);
    }
    /**
     * resizeInstance
     *
     */
    @Test
    public void resizeInstanceTest() {
        ResizeInstanceRequest resizeInstanceRequest = new ResizeInstanceRequest();
        resizeInstanceRequest.setClientToken("");
        resizeInstanceRequest.setInstanceId("");
        resizeInstanceRequest.setCapacityTiB(0);
        ResizeInstanceResponse response = rapidfsClient.resizeInstance(resizeInstanceRequest);
        System.out.println(response);
    }
    /**
     * restartCacheNodes
     *
     */
    @Test
    public void restartCacheNodesTest() {
        RestartCacheNodesRequest restartCacheNodesRequest = new RestartCacheNodesRequest();
        restartCacheNodesRequest.setClientToken("");
        restartCacheNodesRequest.setInstanceId("");
        restartCacheNodesRequest.setCacheNodeIds(new ArrayList<>());
        rapidfsClient.restartCacheNodes(restartCacheNodesRequest);
    }
    /**
     * startCacheNodes
     *
     */
    @Test
    public void startCacheNodesTest() {
        StartCacheNodesRequest startCacheNodesRequest = new StartCacheNodesRequest();
        startCacheNodesRequest.setClientToken("");
        startCacheNodesRequest.setInstanceId("");
        startCacheNodesRequest.setCacheNodeIds(new ArrayList<>());
        rapidfsClient.startCacheNodes(startCacheNodesRequest);
    }
    /**
     * stopCacheNodes
     *
     */
    @Test
    public void stopCacheNodesTest() {
        StopCacheNodesRequest stopCacheNodesRequest = new StopCacheNodesRequest();
        stopCacheNodesRequest.setClientToken("");
        stopCacheNodesRequest.setInstanceId("");
        stopCacheNodesRequest.setCacheNodeIds(new ArrayList<>());
        stopCacheNodesRequest.setMigrateDataBeforeStop(false);
        rapidfsClient.stopCacheNodes(stopCacheNodesRequest);
    }
}
