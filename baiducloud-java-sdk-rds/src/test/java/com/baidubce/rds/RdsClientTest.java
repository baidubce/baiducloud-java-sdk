package com.baidubce.rds;

import com.baidubce.rds.models.BatchConfigurationOfInstancesRequest;
import com.baidubce.rds.models.BatchConfigurationOfInstancesResponse;
import com.baidubce.rds.models.BindingTagsRequest;
import com.baidubce.rds.models.ClusterStatusCheckRequest;
import com.baidubce.rds.models.ClusterStatusCheckResponse;
import com.baidubce.rds.models.CreateAPrimaryInstanceRequest;
import com.baidubce.rds.models.CreateAPrimaryInstanceResponse;
import com.baidubce.rds.models.CreateAProxyInstanceRequest;
import com.baidubce.rds.models.CreateAProxyInstanceResponse;
import com.baidubce.rds.models.CreateReadOnlyInstanceRequest;
import com.baidubce.rds.models.CreateReadOnlyInstanceResponse;
import com.baidubce.rds.models.DialTestInterfaceRequest;
import com.baidubce.rds.models.DialTestInterfaceResponse;
import com.baidubce.rds.models.DoesTheInstanceSupportEnablingAutomaticExpansionRequest;
import com.baidubce.rds.models.DoesTheInstanceSupportEnablingAutomaticExpansionResponse;
import com.baidubce.rds.models.InstanceEnablesAutomaticRenewalRequest;
import com.baidubce.rds.models.QueryInstanceListRequest;
import com.baidubce.rds.models.QueryInstanceListResponse;
import com.baidubce.rds.models.QuerySubnetListRequest;
import com.baidubce.rds.models.QuerySubnetListResponse;
import com.baidubce.rds.models.QueryTaskListRequest;
import com.baidubce.rds.models.QueryTaskListResponse;
import com.baidubce.rds.models.QueryTheListOfAvailableZonesResponse;
import com.baidubce.rds.models.ReleaseInstanceRequest;
import com.baidubce.rds.models.ReleaseInstanceResponse;
import com.baidubce.rds.models.RenewalExampleRequest;
import com.baidubce.rds.models.RenewalExampleResponse;
import com.baidubce.rds.models.RestartTheInstanceRequest;
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigRequest;
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigResponse;
import com.baidubce.rds.models.TransformationExampleRequest;
import com.baidubce.rds.models.TransformationExampleResponse;
import com.baidubce.rds.models.UpdateAutomaticStorageExpansionConfigurationRequest;
import com.baidubce.rds.models.UpdateInstanceConnectionInformationRequest;
import com.baidubce.rds.models.UpdateInstanceNameRequest;
import com.baidubce.rds.models.UpdateInstancePublicNetworkAccessStatusRequest;
import com.baidubce.rds.models.UpdateInstanceSynchronizationModeRequest;
import com.baidubce.rds.models.UpdateTimeWindowRequest;
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
     * batchConfigurationOfInstances
     *
     */
    @Test
    public void batchConfigurationOfInstancesTest() {
        BatchConfigurationOfInstancesRequest batchConfigurationOfInstancesRequest = new BatchConfigurationOfInstancesRequest();
        batchConfigurationOfInstancesRequest.setInstanceId("");
        batchConfigurationOfInstancesRequest.setCpuCount(0);
        batchConfigurationOfInstancesRequest.setMemoryCapacity(0);
        batchConfigurationOfInstancesRequest.setVolumeCapacity(0);
        batchConfigurationOfInstancesRequest.setReadReplicas(new ArrayList<>());
        batchConfigurationOfInstancesRequest.setIsBatchResize(false);
        batchConfigurationOfInstancesRequest.setIsDirectPay(false);
        batchConfigurationOfInstancesRequest.setIsEnhanced(false);
        batchConfigurationOfInstancesRequest.setEffectiveTime("");
        batchConfigurationOfInstancesRequest.setMasterAzone("");
        batchConfigurationOfInstancesRequest.setBackupAzone("");
        batchConfigurationOfInstancesRequest.setDiskIoType("");
        batchConfigurationOfInstancesRequest.setSubnetId("");
        batchConfigurationOfInstancesRequest.setEdgeSubnetId("");
        batchConfigurationOfInstancesRequest.setSubnets(new ArrayList<>());
        batchConfigurationOfInstancesRequest.setCouponId(new ArrayList<>());
        BatchConfigurationOfInstancesResponse response = rdsClient.batchConfigurationOfInstances(batchConfigurationOfInstancesRequest);
        System.out.println(response);
    }
    /**
     * bindingTags
     *
     */
    @Test
    public void bindingTagsTest() {
        BindingTagsRequest bindingTagsRequest = new BindingTagsRequest();
        bindingTagsRequest.setResources(new ArrayList<>());
        rdsClient.bindingTags(bindingTagsRequest);
    }
    /**
     * clusterStatusCheck
     *
     */
    @Test
    public void clusterStatusCheckTest() {
        ClusterStatusCheckRequest clusterStatusCheckRequest = new ClusterStatusCheckRequest();
        clusterStatusCheckRequest.setInstanceId("");
        ClusterStatusCheckResponse response = rdsClient.clusterStatusCheck(clusterStatusCheckRequest);
        System.out.println(response);
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
     * dialTestInterface
     *
     */
    @Test
    public void dialTestInterfaceTest() {
        DialTestInterfaceRequest dialTestInterfaceRequest = new DialTestInterfaceRequest();
        dialTestInterfaceRequest.setInstanceId("");
        DialTestInterfaceResponse response = rdsClient.dialTestInterface(dialTestInterfaceRequest);
        System.out.println(response);
    }
    /**
     * doesTheInstanceSupportEnablingAutomaticExpansion
     *
     */
    @Test
    public void doesTheInstanceSupportEnablingAutomaticExpansionTest() {
        DoesTheInstanceSupportEnablingAutomaticExpansionRequest doesTheInstanceSupportEnablingAutomaticExpansionRequest =
                new DoesTheInstanceSupportEnablingAutomaticExpansionRequest();
        doesTheInstanceSupportEnablingAutomaticExpansionRequest.setInstanceId("");
        DoesTheInstanceSupportEnablingAutomaticExpansionResponse response =
                rdsClient.doesTheInstanceSupportEnablingAutomaticExpansion(doesTheInstanceSupportEnablingAutomaticExpansionRequest);
        System.out.println(response);
    }
    /**
     * instanceEnablesAutomaticRenewal
     *
     */
    @Test
    public void instanceEnablesAutomaticRenewalTest() {
        InstanceEnablesAutomaticRenewalRequest instanceEnablesAutomaticRenewalRequest = new InstanceEnablesAutomaticRenewalRequest();
        instanceEnablesAutomaticRenewalRequest.setInstanceIds(new ArrayList<>());
        instanceEnablesAutomaticRenewalRequest.setAutoRenewTimeUnit("");
        instanceEnablesAutomaticRenewalRequest.setAutoRenewTime(0);
        rdsClient.instanceEnablesAutomaticRenewal(instanceEnablesAutomaticRenewalRequest);
    }
    /**
     * queryInstanceList
     *
     */
    @Test
    public void queryInstanceListTest() {
        QueryInstanceListRequest queryInstanceListRequest = new QueryInstanceListRequest();
        queryInstanceListRequest.setMarker("");
        queryInstanceListRequest.setMaxKeys(0);
        queryInstanceListRequest.setVnetIp("");
        QueryInstanceListResponse response = rdsClient.queryInstanceList(queryInstanceListRequest);
        System.out.println(response);
    }
    /**
     * querySubnetList
     *
     */
    @Test
    public void querySubnetListTest() {
        QuerySubnetListRequest querySubnetListRequest = new QuerySubnetListRequest();
        querySubnetListRequest.setZoneName("");
        querySubnetListRequest.setVpcId("");
        QuerySubnetListResponse response = rdsClient.querySubnetList(querySubnetListRequest);
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
    /**
     * queryTheListOfAvailableZones
     *
     */
    @Test
    public void queryTheListOfAvailableZonesTest() {
        QueryTheListOfAvailableZonesResponse response = rdsClient.queryTheListOfAvailableZones();
        System.out.println(response);
    }
    /**
     * releaseInstance
     *
     */
    @Test
    public void releaseInstanceTest() {
        ReleaseInstanceRequest releaseInstanceRequest = new ReleaseInstanceRequest();
        releaseInstanceRequest.setInstanceIds("");
        ReleaseInstanceResponse response = rdsClient.releaseInstance(releaseInstanceRequest);
        System.out.println(response);
    }
    /**
     * renewalExample
     *
     */
    @Test
    public void renewalExampleTest() {
        RenewalExampleRequest renewalExampleRequest = new RenewalExampleRequest();
        renewalExampleRequest.setDuration(0);
        renewalExampleRequest.setInstanceIds(new ArrayList<>());
        RenewalExampleResponse response = rdsClient.renewalExample(renewalExampleRequest);
        System.out.println(response);
    }
    /**
     * restartTheInstance
     *
     */
    @Test
    public void restartTheInstanceTest() {
        RestartTheInstanceRequest restartTheInstanceRequest = new RestartTheInstanceRequest();
        restartTheInstanceRequest.setInstanceId("");
        restartTheInstanceRequest.setEffectiveTime("");
        rdsClient.restartTheInstance(restartTheInstanceRequest);
    }
    /**
     * retrieveInstanceAutoScalingConfig
     *
     */
    @Test
    public void retrieveInstanceAutoScalingConfigTest() {
        RetrieveInstanceAutoScalingConfigRequest retrieveInstanceAutoScalingConfigRequest = new RetrieveInstanceAutoScalingConfigRequest();
        retrieveInstanceAutoScalingConfigRequest.setInstanceId("");
        RetrieveInstanceAutoScalingConfigResponse response = rdsClient.retrieveInstanceAutoScalingConfig(retrieveInstanceAutoScalingConfigRequest);
        System.out.println(response);
    }
    /**
     * transformationExample
     *
     */
    @Test
    public void transformationExampleTest() {
        TransformationExampleRequest transformationExampleRequest = new TransformationExampleRequest();
        transformationExampleRequest.setInstanceId("");
        transformationExampleRequest.setCpuCount(0);
        transformationExampleRequest.setMemoryCapacity(0);
        transformationExampleRequest.setVolumeCapacity(0);
        transformationExampleRequest.setAllocatedMemoryInMB(0);
        transformationExampleRequest.setNodeAmount(0);
        transformationExampleRequest.setIsDirectPay(false);
        transformationExampleRequest.setIsEnhanced(false);
        transformationExampleRequest.setEffectiveTime("");
        transformationExampleRequest.setMasterAzone("");
        transformationExampleRequest.setBackupAzone("");
        transformationExampleRequest.setDiskIoType("");
        transformationExampleRequest.setSubnetId("");
        transformationExampleRequest.setEdgeSubnetId("");
        transformationExampleRequest.setSubnets(new ArrayList<>());
        TransformationExampleResponse response = rdsClient.transformationExample(transformationExampleRequest);
        System.out.println(response);
    }
    /**
     * updateAutomaticStorageExpansionConfiguration
     *
     */
    @Test
    public void updateAutomaticStorageExpansionConfigurationTest() {
        UpdateAutomaticStorageExpansionConfigurationRequest updateAutomaticStorageExpansionConfigurationRequest = new UpdateAutomaticStorageExpansionConfigurationRequest();
        updateAutomaticStorageExpansionConfigurationRequest.setInstanceId("");
        updateAutomaticStorageExpansionConfigurationRequest.setAction("");
        updateAutomaticStorageExpansionConfigurationRequest.setFreeSpaceThreshold(0);
        updateAutomaticStorageExpansionConfigurationRequest.setDiskMaxLimit(0);
        rdsClient.updateAutomaticStorageExpansionConfiguration(updateAutomaticStorageExpansionConfigurationRequest);
    }
    /**
     * updateInstanceConnectionInformation
     *
     */
    @Test
    public void updateInstanceConnectionInformationTest() {
        UpdateInstanceConnectionInformationRequest updateInstanceConnectionInformationRequest = new UpdateInstanceConnectionInformationRequest();
        updateInstanceConnectionInformationRequest.setInstanceId("");
        updateInstanceConnectionInformationRequest.setAddress("");
        rdsClient.updateInstanceConnectionInformation(updateInstanceConnectionInformationRequest);
    }
    /**
     * updateInstanceName
     *
     */
    @Test
    public void updateInstanceNameTest() {
        UpdateInstanceNameRequest updateInstanceNameRequest = new UpdateInstanceNameRequest();
        updateInstanceNameRequest.setInstanceId("");
        updateInstanceNameRequest.setInstanceName("");
        rdsClient.updateInstanceName(updateInstanceNameRequest);
    }
    /**
     * updateInstancePublicNetworkAccessStatus
     *
     */
    @Test
    public void updateInstancePublicNetworkAccessStatusTest() {
        UpdateInstancePublicNetworkAccessStatusRequest updateInstancePublicNetworkAccessStatusRequest = new UpdateInstancePublicNetworkAccessStatusRequest();
        updateInstancePublicNetworkAccessStatusRequest.setInstanceId("");
        updateInstancePublicNetworkAccessStatusRequest.setPublicAccess(false);
        rdsClient.updateInstancePublicNetworkAccessStatus(updateInstancePublicNetworkAccessStatusRequest);
    }
    /**
     * updateInstanceSynchronizationMode
     *
     */
    @Test
    public void updateInstanceSynchronizationModeTest() {
        UpdateInstanceSynchronizationModeRequest updateInstanceSynchronizationModeRequest = new UpdateInstanceSynchronizationModeRequest();
        updateInstanceSynchronizationModeRequest.setInstanceId("");
        updateInstanceSynchronizationModeRequest.setSyncMode("");
        rdsClient.updateInstanceSynchronizationMode(updateInstanceSynchronizationModeRequest);
    }
    /**
     * updateTimeWindow
     *
     */
    @Test
    public void updateTimeWindowTest() {
        UpdateTimeWindowRequest updateTimeWindowRequest = new UpdateTimeWindowRequest();
        updateTimeWindowRequest.setInstanceId("");
        updateTimeWindowRequest.setMaintainStartTime("");
        updateTimeWindowRequest.setMaintainDuration(0);
        rdsClient.updateTimeWindow(updateTimeWindowRequest);
    }
}
