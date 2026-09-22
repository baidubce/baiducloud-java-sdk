package com.baidubce.scs;

import com.baidubce.scs.models.AccountListRequest;
import com.baidubce.scs.models.AccountListResponse;
import com.baidubce.scs.models.AddIpWhitelistRequest;
import com.baidubce.scs.models.AddParametersToParameterTemplateRequest;
import com.baidubce.scs.models.ApplicationParameterTemplateRequest;
import com.baidubce.scs.models.AuditLogSwitchRequest;
import com.baidubce.scs.models.BatchRestoreInstancesRequest;
import com.baidubce.scs.models.BindSecurityGroupRequest;
import com.baidubce.scs.models.BindSecurityGroupResponse;
import com.baidubce.scs.models.BindTagsRequest;
import com.baidubce.scs.models.CancelPrepaidToPostpaidRequest;
import com.baidubce.scs.models.ChangeAccessPasswordRequest;
import com.baidubce.scs.models.ChangeAccountPasswordRequest;
import com.baidubce.scs.models.ChangeConfigurationRequest;
import com.baidubce.scs.models.ChangeConfigurationResponse;
import com.baidubce.scs.models.ClearInstanceRequest;
import com.baidubce.scs.models.ClusterStatusCheckRequest;
import com.baidubce.scs.models.ClusterStatusCheckResponse;
import com.baidubce.scs.models.ClusterTypeUpgradeRequest;
import com.baidubce.scs.models.ClusterTypeUpgradeResponse;
import com.baidubce.scs.models.CreateAccountRequest;
import com.baidubce.scs.models.CreateAnInstanceRequest;
import com.baidubce.scs.models.CreateAnInstanceResponse;
import com.baidubce.scs.models.CreateDeploymentSetRequest;
import com.baidubce.scs.models.CreateDeploymentSetResponse;
import com.baidubce.scs.models.CreateEntranceRequest;
import com.baidubce.scs.models.CreateEntranceResponse;
import com.baidubce.scs.models.CreateHotGroupRequest;
import com.baidubce.scs.models.CreateHotGroupResponse;
import com.baidubce.scs.models.CreateInstanceWhiteGroupRequest;
import com.baidubce.scs.models.CreateParameterTemplateRequest;
import com.baidubce.scs.models.CreateParameterTemplateResponse;
import com.baidubce.scs.models.CreateSyncGroupRequest;
import com.baidubce.scs.models.CreateSyncGroupResponse;
import com.baidubce.scs.models.DeleteAccountRequest;
import com.baidubce.scs.models.DeleteDeploymentSetRequest;
import com.baidubce.scs.models.DeleteInstanceWhiteGroupRequest;
import com.baidubce.scs.models.DeleteInstancesRequest;
import com.baidubce.scs.models.DeleteIpWhitelistRequest;
import com.baidubce.scs.models.DeleteManualBackupRequest;
import com.baidubce.scs.models.DeleteMemoryScalingConfigRequest;
import com.baidubce.scs.models.DeleteParameterTemplateRequest;
import com.baidubce.scs.models.DeleteSyncGroupRequest;
import com.baidubce.scs.models.DisconnectEntranceRequest;
import com.baidubce.scs.models.DisconnectEntranceResponse;
import com.baidubce.scs.models.DomainNameExchangeRequest;
import com.baidubce.scs.models.GePriceForResizeInstanceRequest;
import com.baidubce.scs.models.GePriceForResizeInstanceResponse;
import com.baidubce.scs.models.GetApplicationParameterTemplateRecordsRequest;
import com.baidubce.scs.models.GetApplicationParameterTemplateRecordsResponse;
import com.baidubce.scs.models.GetAvailableZonesResponse;
import com.baidubce.scs.models.GetBackUpUrlRequest;
import com.baidubce.scs.models.GetBackUpUrlResponse;
import com.baidubce.scs.models.GetBackUpUsageRequest;
import com.baidubce.scs.models.GetBackUpUsageResponse;
import com.baidubce.scs.models.GetBackupListRequest;
import com.baidubce.scs.models.GetBackupListResponse;
import com.baidubce.scs.models.GetBackupStrategyRequest;
import com.baidubce.scs.models.GetBackupStrategyResponse;
import com.baidubce.scs.models.GetClusterBlbStatusRequest;
import com.baidubce.scs.models.GetClusterBlbStatusResponse;
import com.baidubce.scs.models.GetDeploymentSetListResponse;
import com.baidubce.scs.models.GetHotGroupDetailRequest;
import com.baidubce.scs.models.GetHotGroupDetailResponse;
import com.baidubce.scs.models.GetHotGroupListRequest;
import com.baidubce.scs.models.GetHotGroupListResponse;
import com.baidubce.scs.models.GetInstanceDetailRequest;
import com.baidubce.scs.models.GetInstanceDetailResponse;
import com.baidubce.scs.models.GetInstanceListRequest;
import com.baidubce.scs.models.GetInstanceListResponse;
import com.baidubce.scs.models.GetInstanceSpecListResponse;
import com.baidubce.scs.models.GetInstanceWhiteGroupRequest;
import com.baidubce.scs.models.GetInstanceWhiteGroupResponse;
import com.baidubce.scs.models.GetParameterListRequest;
import com.baidubce.scs.models.GetParameterListResponse;
import com.baidubce.scs.models.GetParameterTemplateListRequest;
import com.baidubce.scs.models.GetParameterTemplateListResponse;
import com.baidubce.scs.models.GetPriceForCreateInstanceRequest;
import com.baidubce.scs.models.GetPriceForCreateInstanceResponse;
import com.baidubce.scs.models.GetRecycleListRequest;
import com.baidubce.scs.models.GetRecycleListResponse;
import com.baidubce.scs.models.GetSubnetListRequest;
import com.baidubce.scs.models.GetSubnetListResponse;
import com.baidubce.scs.models.GetSyncGroupStatusRequest;
import com.baidubce.scs.models.GetSyncGroupStatusResponse;
import com.baidubce.scs.models.GetSystemParameterListRequest;
import com.baidubce.scs.models.GetSystemParameterListResponse;
import com.baidubce.scs.models.GetTimeWindowRequest;
import com.baidubce.scs.models.GetTimeWindowResponse;
import com.baidubce.scs.models.GetTlsCertRequest;
import com.baidubce.scs.models.GetTlsCertResponse;
import com.baidubce.scs.models.HotGroupAddClusterRequest;
import com.baidubce.scs.models.HotGroupChangeMasterRoleRequest;
import com.baidubce.scs.models.HotGroupForbidWriteRequest;
import com.baidubce.scs.models.HotGroupModifyNameRequest;
import com.baidubce.scs.models.HotGroupPreCheckRequest;
import com.baidubce.scs.models.HotGroupPreCheckResponse;
import com.baidubce.scs.models.HotGroupRemoveClusterRequest;
import com.baidubce.scs.models.HotGroupSetFlowControlRulesRequest;
import com.baidubce.scs.models.HotGroupStaleReadableRequest;
import com.baidubce.scs.models.HotGroupSyncStatusRequest;
import com.baidubce.scs.models.HotGroupSyncStatusResponse;
import com.baidubce.scs.models.InstanceVersionUpgradeRequest;
import com.baidubce.scs.models.LogDetailsRequest;
import com.baidubce.scs.models.LogDetailsResponse;
import com.baidubce.scs.models.LogListRequest;
import com.baidubce.scs.models.LogListResponse;
import com.baidubce.scs.models.ManualBackupRequest;
import com.baidubce.scs.models.ManuallyModifyBandwidthRequest;
import com.baidubce.scs.models.ManuallyModifyBandwidthResponse;
import com.baidubce.scs.models.MasterSlaveSwitchRequest;
import com.baidubce.scs.models.ModifyBackupCommentRequest;
import com.baidubce.scs.models.ModifyDeploymentSetRequest;
import com.baidubce.scs.models.ModifyEntranceRequest;
import com.baidubce.scs.models.ModifyInstanceDomainNameRequest;
import com.baidubce.scs.models.ModifyInstanceNameRequest;
import com.baidubce.scs.models.ModifyParameterTemplateNameRequest;
import com.baidubce.scs.models.ModifyParametersRequest;
import com.baidubce.scs.models.ModifyReplicationZoneRequest;
import com.baidubce.scs.models.ModifySyncGroupNameRequest;
import com.baidubce.scs.models.ModifyTimeWindowRequest;
import com.baidubce.scs.models.ParameterTemplateDeleteParametersRequest;
import com.baidubce.scs.models.ParameterTemplateDetailsRequest;
import com.baidubce.scs.models.ParameterTemplateDetailsResponse;
import com.baidubce.scs.models.ParameterTemplateModifyParametersRequest;
import com.baidubce.scs.models.PostPaidToPrepaidRequest;
import com.baidubce.scs.models.PostPaidToPrepaidResponse;
import com.baidubce.scs.models.PrepaidToPostpaidRequest;
import com.baidubce.scs.models.PrepaidToPostpaidResponse;
import com.baidubce.scs.models.ProxyNodeReplaceRequest;
import com.baidubce.scs.models.ProxyVersionUpgradeOrRestartRequest;
import com.baidubce.scs.models.QueryIpWhitelistRequest;
import com.baidubce.scs.models.QueryIpWhitelistResponse;
import com.baidubce.scs.models.QueryMemoryScalingConfigRequest;
import com.baidubce.scs.models.QueryMemoryScalingConfigResponse;
import com.baidubce.scs.models.ReleaseHotGroupRequest;
import com.baidubce.scs.models.ReleaseInstanceRequest;
import com.baidubce.scs.models.RenewInstanceRequest;
import com.baidubce.scs.models.RenewInstanceResponse;
import com.baidubce.scs.models.RestartInstanceRequest;
import com.baidubce.scs.models.SetBackupPolicyRequest;
import com.baidubce.scs.models.SetClusterAsMasterRequest;
import com.baidubce.scs.models.SetClusterAsSlaveRequest;
import com.baidubce.scs.models.SetMemoryScalingConfigRequest;
import com.baidubce.scs.models.SetPermissionsRequest;
import com.baidubce.scs.models.SyncGroupAddInstanceRequest;
import com.baidubce.scs.models.SyncGroupDelayInfoRequest;
import com.baidubce.scs.models.SyncGroupDelayInfoResponse;
import com.baidubce.scs.models.SyncGroupDetailRequest;
import com.baidubce.scs.models.SyncGroupDetailResponse;
import com.baidubce.scs.models.SyncGroupListResponse;
import com.baidubce.scs.models.SyncGroupModifyBnsgroupRequest;
import com.baidubce.scs.models.SyncGroupPreCheckRequest;
import com.baidubce.scs.models.SyncGroupPreCheckResponse;
import com.baidubce.scs.models.SyncGroupRemoveInstanceRequest;
import com.baidubce.scs.models.TdeEncryptionRequest;
import com.baidubce.scs.models.TdeEncryptionResponse;
import com.baidubce.scs.models.UnbindSecurityGroupRequest;
import com.baidubce.scs.models.UnbindSecurityGroupResponse;
import com.baidubce.scs.models.UnbindTagsRequest;
import com.baidubce.scs.models.UpdateInstanceWhiteGroupRequest;
import com.baidubce.scs.models.UpdateSecurityGroupRequest;
import com.baidubce.scs.models.UpdateSecurityGroupResponse;
import com.baidubce.scs.models.UpdateTlsEncryptionRequest;
import com.baidubce.scs.models.ViewSecurityGroupRequest;
import com.baidubce.scs.models.ViewSecurityGroupResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

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
     * accountList
     *
     */
    @Test
    public void accountListTest() {
        AccountListRequest accountListRequest = new AccountListRequest();
        accountListRequest.setInstanceId("");
        AccountListResponse response = scsClient.accountList(accountListRequest);
        System.out.println(response);
    }
    /**
     * addIpWhitelist
     *
     */
    @Test
    public void addIpWhitelistTest() {
        AddIpWhitelistRequest addIpWhitelistRequest = new AddIpWhitelistRequest();
        addIpWhitelistRequest.setInstanceId("");
        addIpWhitelistRequest.setSecurityIps(new ArrayList<>());
        scsClient.addIpWhitelist(addIpWhitelistRequest);
    }
    /**
     * addParametersToParameterTemplate
     *
     */
    @Test
    public void addParametersToParameterTemplateTest() {
        AddParametersToParameterTemplateRequest addParametersToParameterTemplateRequest = new AddParametersToParameterTemplateRequest();
        addParametersToParameterTemplateRequest.setTemplateShowId("");
        addParametersToParameterTemplateRequest.setParameters(new ArrayList<>());
        scsClient.addParametersToParameterTemplate(addParametersToParameterTemplateRequest);
    }
    /**
     * applicationParameterTemplate
     *
     */
    @Test
    public void applicationParameterTemplateTest() {
        ApplicationParameterTemplateRequest applicationParameterTemplateRequest = new ApplicationParameterTemplateRequest();
        applicationParameterTemplateRequest.setTemplateShowId("");
        applicationParameterTemplateRequest.setExtra("");
        applicationParameterTemplateRequest.setCacheClusterList(new ArrayList<>());
        applicationParameterTemplateRequest.setRebootType(0);
        applicationParameterTemplateRequest.setParameters(new ArrayList<>());
        scsClient.applicationParameterTemplate(applicationParameterTemplateRequest);
    }
    /**
     * auditLogSwitch
     *
     */
    @Test
    public void auditLogSwitchTest() {
        AuditLogSwitchRequest auditLogSwitchRequest = new AuditLogSwitchRequest();
        auditLogSwitchRequest.setInstanceId("");
        auditLogSwitchRequest.setAction("");
        scsClient.auditLogSwitch(auditLogSwitchRequest);
    }
    /**
     * batchRestoreInstances
     *
     */
    @Test
    public void batchRestoreInstancesTest() {
        BatchRestoreInstancesRequest batchRestoreInstancesRequest = new BatchRestoreInstancesRequest();
        batchRestoreInstancesRequest.setInstanceIds(new ArrayList<>());
        scsClient.batchRestoreInstances(batchRestoreInstancesRequest);
    }
    /**
     * bindSecurityGroup
     *
     */
    @Test
    public void bindSecurityGroupTest() {
        BindSecurityGroupRequest bindSecurityGroupRequest = new BindSecurityGroupRequest();
        bindSecurityGroupRequest.setInstanceId("");
        bindSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        BindSecurityGroupResponse response = scsClient.bindSecurityGroup(bindSecurityGroupRequest);
        System.out.println(response);
    }
    /**
     * bindTags
     *
     */
    @Test
    public void bindTagsTest() {
        BindTagsRequest bindTagsRequest = new BindTagsRequest();
        bindTagsRequest.setInstanceId("");
        bindTagsRequest.setChangeTags(new ArrayList<>());
        scsClient.bindTags(bindTagsRequest);
    }
    /**
     * cancelPrepaidToPostpaid
     *
     */
    @Test
    public void cancelPrepaidToPostpaidTest() {
        CancelPrepaidToPostpaidRequest cancelPrepaidToPostpaidRequest = new CancelPrepaidToPostpaidRequest();
        cancelPrepaidToPostpaidRequest.setInstanceIds(new ArrayList<>());
        scsClient.cancelPrepaidToPostpaid(cancelPrepaidToPostpaidRequest);
    }
    /**
     * changeAccessPassword
     *
     */
    @Test
    public void changeAccessPasswordTest() {
        ChangeAccessPasswordRequest changeAccessPasswordRequest = new ChangeAccessPasswordRequest();
        changeAccessPasswordRequest.setInstanceId("");
        changeAccessPasswordRequest.setPassword("");
        scsClient.changeAccessPassword(changeAccessPasswordRequest);
    }
    /**
     * changeAccountPassword
     *
     */
    @Test
    public void changeAccountPasswordTest() {
        ChangeAccountPasswordRequest changeAccountPasswordRequest = new ChangeAccountPasswordRequest();
        changeAccountPasswordRequest.setInstanceId("");
        changeAccountPasswordRequest.setUserName("");
        changeAccountPasswordRequest.setClientAuth("");
        scsClient.changeAccountPassword(changeAccountPasswordRequest);
    }
    /**
     * changeConfiguration
     *
     */
    @Test
    public void changeConfigurationTest() {
        ChangeConfigurationRequest changeConfigurationRequest = new ChangeConfigurationRequest();
        changeConfigurationRequest.setInstanceId("");
        changeConfigurationRequest.setClientToken("");
        changeConfigurationRequest.setBilling(null);
        changeConfigurationRequest.setEngineVersion("");
        changeConfigurationRequest.setNodeType("");
        changeConfigurationRequest.setShardNum(0);
        changeConfigurationRequest.setDiskFlavor(0);
        ChangeConfigurationResponse response = scsClient.changeConfiguration(changeConfigurationRequest);
        System.out.println(response);
    }
    /**
     * clearInstance
     *
     */
    @Test
    public void clearInstanceTest() {
        ClearInstanceRequest clearInstanceRequest = new ClearInstanceRequest();
        clearInstanceRequest.setInstanceId("");
        clearInstanceRequest.setPassword("");
        clearInstanceRequest.setDbIndex(0);
        clearInstanceRequest.setIsFlushExpired(false);
        clearInstanceRequest.setIsDefer(false);
        scsClient.clearInstance(clearInstanceRequest);
    }
    /**
     * clusterStatusCheck
     *
     */
    @Test
    public void clusterStatusCheckTest() {
        ClusterStatusCheckRequest clusterStatusCheckRequest = new ClusterStatusCheckRequest();
        clusterStatusCheckRequest.setInstanceId("");
        ClusterStatusCheckResponse response = scsClient.clusterStatusCheck(clusterStatusCheckRequest);
        System.out.println(response);
    }
    /**
     * clusterTypeUpgrade
     *
     */
    @Test
    public void clusterTypeUpgradeTest() {
        ClusterTypeUpgradeRequest clusterTypeUpgradeRequest = new ClusterTypeUpgradeRequest();
        clusterTypeUpgradeRequest.setInstanceId("");
        clusterTypeUpgradeRequest.setIsDefer(false);
        clusterTypeUpgradeRequest.setNodeType("");
        clusterTypeUpgradeRequest.setShardNum(0);
        clusterTypeUpgradeRequest.setReplicationInfo(new ArrayList<>());
        ClusterTypeUpgradeResponse response = scsClient.clusterTypeUpgrade(clusterTypeUpgradeRequest);
        System.out.println(response);
    }
    /**
     * createAccount
     *
     */
    @Test
    public void createAccountTest() {
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        createAccountRequest.setInstanceId("");
        createAccountRequest.setUserName("");
        createAccountRequest.setClientAuth("");
        createAccountRequest.setExtra("");
        createAccountRequest.setUserType(0);
        scsClient.createAccount(createAccountRequest);
    }
    /**
     * createAnInstance
     *
     */
    @Test
    public void createAnInstanceTest() {
        CreateAnInstanceRequest createAnInstanceRequest = new CreateAnInstanceRequest();
        createAnInstanceRequest.setClientToken("");
        createAnInstanceRequest.setBilling(null);
        createAnInstanceRequest.setInstanceName("");
        createAnInstanceRequest.setNodeType("");
        createAnInstanceRequest.setPort(0);
        createAnInstanceRequest.setEngine(0);
        createAnInstanceRequest.setEngineVersion("");
        createAnInstanceRequest.setStoreType(0);
        createAnInstanceRequest.setEnableReadOnly(0);
        createAnInstanceRequest.setPurchaseCount(0);
        createAnInstanceRequest.setShardNum(0);
        createAnInstanceRequest.setProxyNum(0);
        createAnInstanceRequest.setClusterType("");
        createAnInstanceRequest.setDiskFlavor(0);
        createAnInstanceRequest.setDiskType("");
        createAnInstanceRequest.setVpcId("");
        createAnInstanceRequest.setReplicationInfo(new ArrayList<>());
        createAnInstanceRequest.setAutoRenewTimeUnit("");
        createAnInstanceRequest.setAutoRenewTime(0);
        createAnInstanceRequest.setBgwGroupId("");
        createAnInstanceRequest.setClientAuth("");
        createAnInstanceRequest.setTags(new ArrayList<>());
        createAnInstanceRequest.setConfTpl("");
        createAnInstanceRequest.setResourceGroupId("");
        createAnInstanceRequest.setAutoBackupConfig("");
        createAnInstanceRequest.setDeployIdList(new ArrayList<>());
        CreateAnInstanceResponse response = scsClient.createAnInstance(createAnInstanceRequest);
        System.out.println(response);
    }
    /**
     * createDeploymentSet
     *
     */
    @Test
    public void createDeploymentSetTest() {
        CreateDeploymentSetRequest createDeploymentSetRequest = new CreateDeploymentSetRequest();
        createDeploymentSetRequest.setName("");
        createDeploymentSetRequest.setDesc("");
        createDeploymentSetRequest.setStrategy("");
        createDeploymentSetRequest.setConcurrency(0);
        CreateDeploymentSetResponse response = scsClient.createDeploymentSet(createDeploymentSetRequest);
        System.out.println(response);
    }
    /**
     * createEntrance
     *
     */
    @Test
    public void createEntranceTest() {
        CreateEntranceRequest createEntranceRequest = new CreateEntranceRequest();
        createEntranceRequest.setInstanceId("");
        CreateEntranceResponse response = scsClient.createEntrance(createEntranceRequest);
        System.out.println(response);
    }
    /**
     * createHotGroup
     *
     */
    @Test
    public void createHotGroupTest() {
        CreateHotGroupRequest createHotGroupRequest = new CreateHotGroupRequest();
        createHotGroupRequest.setLeader(null);
        CreateHotGroupResponse response = scsClient.createHotGroup(createHotGroupRequest);
        System.out.println(response);
    }
    /**
     * createInstanceWhiteGroup
     *
     */
    @Test
    public void createInstanceWhiteGroupTest() {
        CreateInstanceWhiteGroupRequest createInstanceWhiteGroupRequest = new CreateInstanceWhiteGroupRequest();
        createInstanceWhiteGroupRequest.setInstanceId("");
        createInstanceWhiteGroupRequest.setGroupName("");
        createInstanceWhiteGroupRequest.setClusterIpList(new ArrayList<>());
        scsClient.createInstanceWhiteGroup(createInstanceWhiteGroupRequest);
    }
    /**
     * createParameterTemplate
     *
     */
    @Test
    public void createParameterTemplateTest() {
        CreateParameterTemplateRequest createParameterTemplateRequest = new CreateParameterTemplateRequest();
        createParameterTemplateRequest.setName("");
        createParameterTemplateRequest.setEngine("");
        createParameterTemplateRequest.setEngineVersion("");
        createParameterTemplateRequest.setClusterType("");
        createParameterTemplateRequest.setTemplateType(0);
        createParameterTemplateRequest.setComment("");
        createParameterTemplateRequest.setParameters(new ArrayList<>());
        CreateParameterTemplateResponse response = scsClient.createParameterTemplate(createParameterTemplateRequest);
        System.out.println(response);
    }
    /**
     * createSyncGroup
     *
     */
    @Test
    public void createSyncGroupTest() {
        CreateSyncGroupRequest createSyncGroupRequest = new CreateSyncGroupRequest();
        createSyncGroupRequest.setSyncGroupName("");
        createSyncGroupRequest.setMembers(new ArrayList<>());
        CreateSyncGroupResponse response = scsClient.createSyncGroup(createSyncGroupRequest);
        System.out.println(response);
    }
    /**
     * deleteAccount
     *
     */
    @Test
    public void deleteAccountTest() {
        DeleteAccountRequest deleteAccountRequest = new DeleteAccountRequest();
        deleteAccountRequest.setInstanceId("");
        deleteAccountRequest.setUserName("");
        scsClient.deleteAccount(deleteAccountRequest);
    }
    /**
     * deleteDeploymentSet
     *
     */
    @Test
    public void deleteDeploymentSetTest() {
        DeleteDeploymentSetRequest deleteDeploymentSetRequest = new DeleteDeploymentSetRequest();
        deleteDeploymentSetRequest.setDeploySetId("");
        scsClient.deleteDeploymentSet(deleteDeploymentSetRequest);
    }
    /**
     * deleteInstanceWhiteGroup
     *
     */
    @Test
    public void deleteInstanceWhiteGroupTest() {
        DeleteInstanceWhiteGroupRequest deleteInstanceWhiteGroupRequest = new DeleteInstanceWhiteGroupRequest();
        deleteInstanceWhiteGroupRequest.setInstanceId("");
        deleteInstanceWhiteGroupRequest.setGroupName("");
        scsClient.deleteInstanceWhiteGroup(deleteInstanceWhiteGroupRequest);
    }
    /**
     * deleteInstances
     *
     */
    @Test
    public void deleteInstancesTest() {
        DeleteInstancesRequest deleteInstancesRequest = new DeleteInstancesRequest();
        deleteInstancesRequest.setInstanceIds(new ArrayList<>());
        scsClient.deleteInstances(deleteInstancesRequest);
    }
    /**
     * deleteIpWhitelist
     *
     */
    @Test
    public void deleteIpWhitelistTest() {
        DeleteIpWhitelistRequest deleteIpWhitelistRequest = new DeleteIpWhitelistRequest();
        deleteIpWhitelistRequest.setInstanceId("");
        deleteIpWhitelistRequest.setSecurityIps(new ArrayList<>());
        scsClient.deleteIpWhitelist(deleteIpWhitelistRequest);
    }
    /**
     * deleteManualBackup
     *
     */
    @Test
    public void deleteManualBackupTest() {
        DeleteManualBackupRequest deleteManualBackupRequest = new DeleteManualBackupRequest();
        deleteManualBackupRequest.setInstanceId("");
        deleteManualBackupRequest.setBatchId("");
        scsClient.deleteManualBackup(deleteManualBackupRequest);
    }
    /**
     * deleteMemoryScalingConfig
     *
     */
    @Test
    public void deleteMemoryScalingConfigTest() {
        DeleteMemoryScalingConfigRequest deleteMemoryScalingConfigRequest = new DeleteMemoryScalingConfigRequest();
        deleteMemoryScalingConfigRequest.setInstanceId("");
        scsClient.deleteMemoryScalingConfig(deleteMemoryScalingConfigRequest);
    }
    /**
     * deleteParameterTemplate
     *
     */
    @Test
    public void deleteParameterTemplateTest() {
        DeleteParameterTemplateRequest deleteParameterTemplateRequest = new DeleteParameterTemplateRequest();
        deleteParameterTemplateRequest.setTemplateShowId("");
        scsClient.deleteParameterTemplate(deleteParameterTemplateRequest);
    }
    /**
     * deleteSyncGroup
     *
     */
    @Test
    public void deleteSyncGroupTest() {
        DeleteSyncGroupRequest deleteSyncGroupRequest = new DeleteSyncGroupRequest();
        deleteSyncGroupRequest.setSyncGroupShowId("");
        scsClient.deleteSyncGroup(deleteSyncGroupRequest);
    }
    /**
     * disconnectEntrance
     *
     */
    @Test
    public void disconnectEntranceTest() {
        DisconnectEntranceRequest disconnectEntranceRequest = new DisconnectEntranceRequest();
        disconnectEntranceRequest.setInstanceId("");
        DisconnectEntranceResponse response = scsClient.disconnectEntrance(disconnectEntranceRequest);
        System.out.println(response);
    }
    /**
     * domainNameExchange
     *
     */
    @Test
    public void domainNameExchangeTest() {
        DomainNameExchangeRequest domainNameExchangeRequest = new DomainNameExchangeRequest();
        domainNameExchangeRequest.setSourceInstanceId("");
        domainNameExchangeRequest.setTargetInstanceId("");
        scsClient.domainNameExchange(domainNameExchangeRequest);
    }
    /**
     * gePriceForResizeInstance
     *
     */
    @Test
    public void gePriceForResizeInstanceTest() {
        GePriceForResizeInstanceRequest gePriceForResizeInstanceRequest = new GePriceForResizeInstanceRequest();
        gePriceForResizeInstanceRequest.setClientToken("");
        gePriceForResizeInstanceRequest.setInstanceId("");
        gePriceForResizeInstanceRequest.setNodeType("");
        gePriceForResizeInstanceRequest.setShardNum(0);
        gePriceForResizeInstanceRequest.setReplicationNum(0);
        gePriceForResizeInstanceRequest.setDiskFlavor(0);
        gePriceForResizeInstanceRequest.setChargeType("");
        gePriceForResizeInstanceRequest.setPeriod(0);
        gePriceForResizeInstanceRequest.setChangeType("");
        GePriceForResizeInstanceResponse response = scsClient.gePriceForResizeInstance(gePriceForResizeInstanceRequest);
        System.out.println(response);
    }
    /**
     * getApplicationParameterTemplateRecords
     *
     */
    @Test
    public void getApplicationParameterTemplateRecordsTest() {
        GetApplicationParameterTemplateRecordsRequest getApplicationParameterTemplateRecordsRequest = new GetApplicationParameterTemplateRecordsRequest();
        getApplicationParameterTemplateRecordsRequest.setTemplateShowId("");
        getApplicationParameterTemplateRecordsRequest.setMarker("");
        getApplicationParameterTemplateRecordsRequest.setMaxKeys(0);
        GetApplicationParameterTemplateRecordsResponse response = scsClient.getApplicationParameterTemplateRecords(getApplicationParameterTemplateRecordsRequest);
        System.out.println(response);
    }
    /**
     * getAvailableZones
     *
     */
    @Test
    public void getAvailableZonesTest() {
        GetAvailableZonesResponse response = scsClient.getAvailableZones();
        System.out.println(response);
    }
    /**
     * getBackUpUrl
     *
     */
    @Test
    public void getBackUpUrlTest() {
        GetBackUpUrlRequest getBackUpUrlRequest = new GetBackUpUrlRequest();
        getBackUpUrlRequest.setInstanceId("");
        getBackUpUrlRequest.setBackupId(0);
        GetBackUpUrlResponse response = scsClient.getBackUpUrl(getBackUpUrlRequest);
        System.out.println(response);
    }
    /**
     * getBackUpUsage
     *
     */
    @Test
    public void getBackUpUsageTest() {
        GetBackUpUsageRequest getBackUpUsageRequest = new GetBackUpUsageRequest();
        getBackUpUsageRequest.setInstanceId("");
        GetBackUpUsageResponse response = scsClient.getBackUpUsage(getBackUpUsageRequest);
        System.out.println(response);
    }
    /**
     * getBackupList
     *
     */
    @Test
    public void getBackupListTest() {
        GetBackupListRequest getBackupListRequest = new GetBackupListRequest();
        getBackupListRequest.setInstanceId("");
        GetBackupListResponse response = scsClient.getBackupList(getBackupListRequest);
        System.out.println(response);
    }
    /**
     * getBackupStrategy
     *
     */
    @Test
    public void getBackupStrategyTest() {
        GetBackupStrategyRequest getBackupStrategyRequest = new GetBackupStrategyRequest();
        getBackupStrategyRequest.setInstanceId("");
        GetBackupStrategyResponse response = scsClient.getBackupStrategy(getBackupStrategyRequest);
        System.out.println(response);
    }
    /**
     * getClusterBlbStatus
     *
     */
    @Test
    public void getClusterBlbStatusTest() {
        GetClusterBlbStatusRequest getClusterBlbStatusRequest = new GetClusterBlbStatusRequest();
        getClusterBlbStatusRequest.setInstanceId("");
        GetClusterBlbStatusResponse response = scsClient.getClusterBlbStatus(getClusterBlbStatusRequest);
        System.out.println(response);
    }
    /**
     * getDeploymentSetList
     *
     */
    @Test
    public void getDeploymentSetListTest() {
        GetDeploymentSetListResponse response = scsClient.getDeploymentSetList();
        System.out.println(response);
    }
    /**
     * getHotGroupDetail
     *
     */
    @Test
    public void getHotGroupDetailTest() {
        GetHotGroupDetailRequest getHotGroupDetailRequest = new GetHotGroupDetailRequest();
        getHotGroupDetailRequest.setGroupId("");
        GetHotGroupDetailResponse response = scsClient.getHotGroupDetail(getHotGroupDetailRequest);
        System.out.println(response);
    }
    /**
     * getHotGroupList
     *
     */
    @Test
    public void getHotGroupListTest() {
        GetHotGroupListRequest getHotGroupListRequest = new GetHotGroupListRequest();
        getHotGroupListRequest.setPageSize(0);
        getHotGroupListRequest.setPageNo(0);
        GetHotGroupListResponse response = scsClient.getHotGroupList(getHotGroupListRequest);
        System.out.println(response);
    }
    /**
     * getInstanceDetail
     *
     */
    @Test
    public void getInstanceDetailTest() {
        GetInstanceDetailRequest getInstanceDetailRequest = new GetInstanceDetailRequest();
        getInstanceDetailRequest.setInstanceId("");
        GetInstanceDetailResponse response = scsClient.getInstanceDetail(getInstanceDetailRequest);
        System.out.println(response);
    }
    /**
     * getInstanceList
     *
     */
    @Test
    public void getInstanceListTest() {
        GetInstanceListRequest getInstanceListRequest = new GetInstanceListRequest();
        getInstanceListRequest.setMarker("");
        getInstanceListRequest.setMaxKeys("");
        getInstanceListRequest.setInstanceIds("");
        getInstanceListRequest.setVnetIp("");
        GetInstanceListResponse response = scsClient.getInstanceList(getInstanceListRequest);
        System.out.println(response);
    }
    /**
     * getInstanceSpecList
     *
     */
    @Test
    public void getInstanceSpecListTest() {
        GetInstanceSpecListResponse response = scsClient.getInstanceSpecList();
        System.out.println(response);
    }
    /**
     * getInstanceWhiteGroup
     *
     */
    @Test
    public void getInstanceWhiteGroupTest() {
        GetInstanceWhiteGroupRequest getInstanceWhiteGroupRequest = new GetInstanceWhiteGroupRequest();
        getInstanceWhiteGroupRequest.setInstanceId("");
        getInstanceWhiteGroupRequest.setGroupName("");
        GetInstanceWhiteGroupResponse response = scsClient.getInstanceWhiteGroup(getInstanceWhiteGroupRequest);
        System.out.println(response);
    }
    /**
     * getParameterList
     *
     */
    @Test
    public void getParameterListTest() {
        GetParameterListRequest getParameterListRequest = new GetParameterListRequest();
        getParameterListRequest.setInstanceId("");
        GetParameterListResponse response = scsClient.getParameterList(getParameterListRequest);
        System.out.println(response);
    }
    /**
     * getParameterTemplateList
     *
     */
    @Test
    public void getParameterTemplateListTest() {
        GetParameterTemplateListRequest getParameterTemplateListRequest = new GetParameterTemplateListRequest();
        getParameterTemplateListRequest.setMarker("");
        getParameterTemplateListRequest.setMaxKeys(0);
        GetParameterTemplateListResponse response = scsClient.getParameterTemplateList(getParameterTemplateListRequest);
        System.out.println(response);
    }
    /**
     * getPriceForCreateInstance
     *
     */
    @Test
    public void getPriceForCreateInstanceTest() {
        GetPriceForCreateInstanceRequest getPriceForCreateInstanceRequest = new GetPriceForCreateInstanceRequest();
        getPriceForCreateInstanceRequest.setEngine(0);
        getPriceForCreateInstanceRequest.setClusterType("");
        getPriceForCreateInstanceRequest.setNodeType("");
        getPriceForCreateInstanceRequest.setCacheInstanceType(0);
        getPriceForCreateInstanceRequest.setShardNum(0);
        getPriceForCreateInstanceRequest.setReplicationNum(0);
        getPriceForCreateInstanceRequest.setInstanceNum(0);
        getPriceForCreateInstanceRequest.setDiskType("");
        getPriceForCreateInstanceRequest.setDiskFlavor(0);
        getPriceForCreateInstanceRequest.setChargeType("");
        getPriceForCreateInstanceRequest.setPeriod(0);
        getPriceForCreateInstanceRequest.setTimeUnit("");
        GetPriceForCreateInstanceResponse response = scsClient.getPriceForCreateInstance(getPriceForCreateInstanceRequest);
        System.out.println(response);
    }
    /**
     * getRecycleList
     *
     */
    @Test
    public void getRecycleListTest() {
        GetRecycleListRequest getRecycleListRequest = new GetRecycleListRequest();
        getRecycleListRequest.setMarker("");
        getRecycleListRequest.setMaxKeys(0);
        GetRecycleListResponse response = scsClient.getRecycleList(getRecycleListRequest);
        System.out.println(response);
    }
    /**
     * getSubnetList
     *
     */
    @Test
    public void getSubnetListTest() {
        GetSubnetListRequest getSubnetListRequest = new GetSubnetListRequest();
        getSubnetListRequest.setVpcId("");
        getSubnetListRequest.setZoneName("");
        GetSubnetListResponse response = scsClient.getSubnetList(getSubnetListRequest);
        System.out.println(response);
    }
    /**
     * getSyncGroupStatus
     *
     */
    @Test
    public void getSyncGroupStatusTest() {
        GetSyncGroupStatusRequest getSyncGroupStatusRequest = new GetSyncGroupStatusRequest();
        getSyncGroupStatusRequest.setSyncGroupShowId("");
        GetSyncGroupStatusResponse response = scsClient.getSyncGroupStatus(getSyncGroupStatusRequest);
        System.out.println(response);
    }
    /**
     * getSystemParameterList
     *
     */
    @Test
    public void getSystemParameterListTest() {
        GetSystemParameterListRequest getSystemParameterListRequest = new GetSystemParameterListRequest();
        getSystemParameterListRequest.setEngine("");
        getSystemParameterListRequest.setEngineVersion("");
        getSystemParameterListRequest.setClusterType("");
        GetSystemParameterListResponse response = scsClient.getSystemParameterList(getSystemParameterListRequest);
        System.out.println(response);
    }
    /**
     * getTimeWindow
     *
     */
    @Test
    public void getTimeWindowTest() {
        GetTimeWindowRequest getTimeWindowRequest = new GetTimeWindowRequest();
        getTimeWindowRequest.setInstanceId("");
        GetTimeWindowResponse response = scsClient.getTimeWindow(getTimeWindowRequest);
        System.out.println(response);
    }
    /**
     * getTlsCert
     *
     */
    @Test
    public void getTlsCertTest() {
        GetTlsCertRequest getTlsCertRequest = new GetTlsCertRequest();
        getTlsCertRequest.setInstanceId("");
        GetTlsCertResponse response = scsClient.getTlsCert(getTlsCertRequest);
        System.out.println(response);
    }
    /**
     * hotGroupAddCluster
     *
     */
    @Test
    public void hotGroupAddClusterTest() {
        HotGroupAddClusterRequest hotGroupAddClusterRequest = new HotGroupAddClusterRequest();
        hotGroupAddClusterRequest.setGroupId("");
        hotGroupAddClusterRequest.setFollowerId("");
        hotGroupAddClusterRequest.setFollowerRegion("");
        hotGroupAddClusterRequest.setSyncMaster("");
        scsClient.hotGroupAddCluster(hotGroupAddClusterRequest);
    }
    /**
     * hotGroupChangeMasterRole
     *
     */
    @Test
    public void hotGroupChangeMasterRoleTest() {
        HotGroupChangeMasterRoleRequest hotGroupChangeMasterRoleRequest = new HotGroupChangeMasterRoleRequest();
        hotGroupChangeMasterRoleRequest.setGroupId("");
        hotGroupChangeMasterRoleRequest.setInstanceId("");
        scsClient.hotGroupChangeMasterRole(hotGroupChangeMasterRoleRequest);
    }
    /**
     * hotGroupForbidWrite
     *
     */
    @Test
    public void hotGroupForbidWriteTest() {
        HotGroupForbidWriteRequest hotGroupForbidWriteRequest = new HotGroupForbidWriteRequest();
        hotGroupForbidWriteRequest.setGroupId("");
        hotGroupForbidWriteRequest.setForbidWriteFlag(false);
        scsClient.hotGroupForbidWrite(hotGroupForbidWriteRequest);
    }
    /**
     * hotGroupModifyName
     *
     */
    @Test
    public void hotGroupModifyNameTest() {
        HotGroupModifyNameRequest hotGroupModifyNameRequest = new HotGroupModifyNameRequest();
        hotGroupModifyNameRequest.setGroupId("");
        hotGroupModifyNameRequest.setGroupName("");
        scsClient.hotGroupModifyName(hotGroupModifyNameRequest);
    }
    /**
     * hotGroupPreCheck
     *
     */
    @Test
    public void hotGroupPreCheckTest() {
        HotGroupPreCheckRequest hotGroupPreCheckRequest = new HotGroupPreCheckRequest();
        hotGroupPreCheckRequest.setLeader(null);
        hotGroupPreCheckRequest.setFollowers(new ArrayList<>());
        HotGroupPreCheckResponse response = scsClient.hotGroupPreCheck(hotGroupPreCheckRequest);
        System.out.println(response);
    }
    /**
     * hotGroupRemoveCluster
     *
     */
    @Test
    public void hotGroupRemoveClusterTest() {
        HotGroupRemoveClusterRequest hotGroupRemoveClusterRequest = new HotGroupRemoveClusterRequest();
        hotGroupRemoveClusterRequest.setGroupId("");
        hotGroupRemoveClusterRequest.setInstanceId("");
        scsClient.hotGroupRemoveCluster(hotGroupRemoveClusterRequest);
    }
    /**
     * hotGroupSetFlowControlRules
     *
     */
    @Test
    public void hotGroupSetFlowControlRulesTest() {
        HotGroupSetFlowControlRulesRequest hotGroupSetFlowControlRulesRequest = new HotGroupSetFlowControlRulesRequest();
        hotGroupSetFlowControlRulesRequest.setGroupId("");
        hotGroupSetFlowControlRulesRequest.setClusterShowId("");
        hotGroupSetFlowControlRulesRequest.setQpsWrite(0);
        hotGroupSetFlowControlRulesRequest.setQpsRead(0);
        scsClient.hotGroupSetFlowControlRules(hotGroupSetFlowControlRulesRequest);
    }
    /**
     * hotGroupStaleReadable
     *
     */
    @Test
    public void hotGroupStaleReadableTest() {
        HotGroupStaleReadableRequest hotGroupStaleReadableRequest = new HotGroupStaleReadableRequest();
        hotGroupStaleReadableRequest.setGroupId("");
        hotGroupStaleReadableRequest.setFollowerId("");
        hotGroupStaleReadableRequest.setStaleReadable(false);
        scsClient.hotGroupStaleReadable(hotGroupStaleReadableRequest);
    }
    /**
     * hotGroupSyncStatus
     *
     */
    @Test
    public void hotGroupSyncStatusTest() {
        HotGroupSyncStatusRequest hotGroupSyncStatusRequest = new HotGroupSyncStatusRequest();
        hotGroupSyncStatusRequest.setGroupId("");
        HotGroupSyncStatusResponse response = scsClient.hotGroupSyncStatus(hotGroupSyncStatusRequest);
        System.out.println(response);
    }
    /**
     * instanceVersionUpgrade
     *
     */
    @Test
    public void instanceVersionUpgradeTest() {
        InstanceVersionUpgradeRequest instanceVersionUpgradeRequest = new InstanceVersionUpgradeRequest();
        instanceVersionUpgradeRequest.setInstanceId("");
        instanceVersionUpgradeRequest.setKernelVersion("");
        instanceVersionUpgradeRequest.setIsDefer(false);
        scsClient.instanceVersionUpgrade(instanceVersionUpgradeRequest);
    }
    /**
     * logDetails
     *
     */
    @Test
    public void logDetailsTest() {
        LogDetailsRequest logDetailsRequest = new LogDetailsRequest();
        logDetailsRequest.setInstanceId("");
        logDetailsRequest.setLogId("");
        logDetailsRequest.setValidSeconds("");
        LogDetailsResponse response = scsClient.logDetails(logDetailsRequest);
        System.out.println(response);
    }
    /**
     * logList
     *
     */
    @Test
    public void logListTest() {
        LogListRequest logListRequest = new LogListRequest();
        logListRequest.setInstanceId("");
        logListRequest.setStartTime("");
        logListRequest.setEndTime("");
        LogListResponse response = scsClient.logList(logListRequest);
        System.out.println(response);
    }
    /**
     * manualBackup
     *
     */
    @Test
    public void manualBackupTest() {
        ManualBackupRequest manualBackupRequest = new ManualBackupRequest();
        manualBackupRequest.setInstanceId("");
        manualBackupRequest.setComment("");
        scsClient.manualBackup(manualBackupRequest);
    }
    /**
     * manuallyModifyBandwidth
     *
     */
    @Test
    public void manuallyModifyBandwidthTest() {
        ManuallyModifyBandwidthRequest manuallyModifyBandwidthRequest = new ManuallyModifyBandwidthRequest();
        manuallyModifyBandwidthRequest.setInstanceId("");
        manuallyModifyBandwidthRequest.setShardBandwidthInfo(new ArrayList<>());
        ManuallyModifyBandwidthResponse response = scsClient.manuallyModifyBandwidth(manuallyModifyBandwidthRequest);
        System.out.println(response);
    }
    /**
     * masterSlaveSwitch
     *
     */
    @Test
    public void masterSlaveSwitchTest() {
        MasterSlaveSwitchRequest masterSlaveSwitchRequest = new MasterSlaveSwitchRequest();
        masterSlaveSwitchRequest.setInstanceId("");
        masterSlaveSwitchRequest.setShards(new ArrayList<>());
        scsClient.masterSlaveSwitch(masterSlaveSwitchRequest);
    }
    /**
     * modifyBackupComment
     *
     */
    @Test
    public void modifyBackupCommentTest() {
        ModifyBackupCommentRequest modifyBackupCommentRequest = new ModifyBackupCommentRequest();
        modifyBackupCommentRequest.setInstanceId("");
        modifyBackupCommentRequest.setBatchId("");
        modifyBackupCommentRequest.setComment("");
        scsClient.modifyBackupComment(modifyBackupCommentRequest);
    }
    /**
     * modifyDeploymentSet
     *
     */
    @Test
    public void modifyDeploymentSetTest() {
        ModifyDeploymentSetRequest modifyDeploymentSetRequest = new ModifyDeploymentSetRequest();
        modifyDeploymentSetRequest.setDeploySetId("");
        modifyDeploymentSetRequest.setDesc("");
        modifyDeploymentSetRequest.setName("");
        modifyDeploymentSetRequest.setConcurrency(0);
        scsClient.modifyDeploymentSet(modifyDeploymentSetRequest);
    }
    /**
     * modifyEntrance
     *
     */
    @Test
    public void modifyEntranceTest() {
        ModifyEntranceRequest modifyEntranceRequest = new ModifyEntranceRequest();
        modifyEntranceRequest.setInstanceId("");
        modifyEntranceRequest.setIsDefer(false);
        scsClient.modifyEntrance(modifyEntranceRequest);
    }
    /**
     * modifyInstanceDomainName
     *
     */
    @Test
    public void modifyInstanceDomainNameTest() {
        ModifyInstanceDomainNameRequest modifyInstanceDomainNameRequest = new ModifyInstanceDomainNameRequest();
        modifyInstanceDomainNameRequest.setInstanceId("");
        modifyInstanceDomainNameRequest.setDomain("");
        scsClient.modifyInstanceDomainName(modifyInstanceDomainNameRequest);
    }
    /**
     * modifyInstanceName
     *
     */
    @Test
    public void modifyInstanceNameTest() {
        ModifyInstanceNameRequest modifyInstanceNameRequest = new ModifyInstanceNameRequest();
        modifyInstanceNameRequest.setInstanceId("");
        modifyInstanceNameRequest.setInstanceName("");
        scsClient.modifyInstanceName(modifyInstanceNameRequest);
    }
    /**
     * modifyParameterTemplateName
     *
     */
    @Test
    public void modifyParameterTemplateNameTest() {
        ModifyParameterTemplateNameRequest modifyParameterTemplateNameRequest = new ModifyParameterTemplateNameRequest();
        modifyParameterTemplateNameRequest.setTemplateShowId("");
        modifyParameterTemplateNameRequest.setName("");
        scsClient.modifyParameterTemplateName(modifyParameterTemplateNameRequest);
    }
    /**
     * modifyParameters
     *
     */
    @Test
    public void modifyParametersTest() {
        ModifyParametersRequest modifyParametersRequest = new ModifyParametersRequest();
        modifyParametersRequest.setInstanceId("");
        modifyParametersRequest.setParameter(null);
        scsClient.modifyParameters(modifyParametersRequest);
    }
    /**
     * modifyReplicationZone
     *
     */
    @Test
    public void modifyReplicationZoneTest() {
        ModifyReplicationZoneRequest modifyReplicationZoneRequest = new ModifyReplicationZoneRequest();
        modifyReplicationZoneRequest.setInstanceId("");
        modifyReplicationZoneRequest.setIsDefer(false);
        modifyReplicationZoneRequest.setReplicationInfo(new ArrayList<>());
        scsClient.modifyReplicationZone(modifyReplicationZoneRequest);
    }
    /**
     * modifySyncGroupName
     *
     */
    @Test
    public void modifySyncGroupNameTest() {
        ModifySyncGroupNameRequest modifySyncGroupNameRequest = new ModifySyncGroupNameRequest();
        modifySyncGroupNameRequest.setSyncGroupShowId("");
        modifySyncGroupNameRequest.setGroupName("");
        scsClient.modifySyncGroupName(modifySyncGroupNameRequest);
    }
    /**
     * modifyTimeWindow
     *
     */
    @Test
    public void modifyTimeWindowTest() {
        ModifyTimeWindowRequest modifyTimeWindowRequest = new ModifyTimeWindowRequest();
        modifyTimeWindowRequest.setInstanceId("");
        modifyTimeWindowRequest.setStartTime("");
        modifyTimeWindowRequest.setDuration(0);
        modifyTimeWindowRequest.setPeriod(new ArrayList<>());
        scsClient.modifyTimeWindow(modifyTimeWindowRequest);
    }
    /**
     * parameterTemplateDeleteParameters
     *
     */
    @Test
    public void parameterTemplateDeleteParametersTest() {
        ParameterTemplateDeleteParametersRequest parameterTemplateDeleteParametersRequest = new ParameterTemplateDeleteParametersRequest();
        parameterTemplateDeleteParametersRequest.setTemplateShowId("");
        parameterTemplateDeleteParametersRequest.setParameters(new ArrayList<>());
        scsClient.parameterTemplateDeleteParameters(parameterTemplateDeleteParametersRequest);
    }
    /**
     * parameterTemplateDetails
     *
     */
    @Test
    public void parameterTemplateDetailsTest() {
        ParameterTemplateDetailsRequest parameterTemplateDetailsRequest = new ParameterTemplateDetailsRequest();
        parameterTemplateDetailsRequest.setTemplateShowId("");
        ParameterTemplateDetailsResponse response = scsClient.parameterTemplateDetails(parameterTemplateDetailsRequest);
        System.out.println(response);
    }
    /**
     * parameterTemplateModifyParameters
     *
     */
    @Test
    public void parameterTemplateModifyParametersTest() {
        ParameterTemplateModifyParametersRequest parameterTemplateModifyParametersRequest = new ParameterTemplateModifyParametersRequest();
        parameterTemplateModifyParametersRequest.setTemplateShowId("");
        parameterTemplateModifyParametersRequest.setParameters(new ArrayList<>());
        scsClient.parameterTemplateModifyParameters(parameterTemplateModifyParametersRequest);
    }
    /**
     * postPaidToPrepaid
     *
     */
    @Test
    public void postPaidToPrepaidTest() {
        PostPaidToPrepaidRequest postPaidToPrepaidRequest = new PostPaidToPrepaidRequest();
        postPaidToPrepaidRequest.setDuration(0);
        postPaidToPrepaidRequest.setInstanceIds(new ArrayList<>());
        PostPaidToPrepaidResponse response = scsClient.postPaidToPrepaid(postPaidToPrepaidRequest);
        System.out.println(response);
    }
    /**
     * prepaidToPostpaid
     *
     */
    @Test
    public void prepaidToPostpaidTest() {
        PrepaidToPostpaidRequest prepaidToPostpaidRequest = new PrepaidToPostpaidRequest();
        prepaidToPostpaidRequest.setInstanceIds(new ArrayList<>());
        PrepaidToPostpaidResponse response = scsClient.prepaidToPostpaid(prepaidToPostpaidRequest);
        System.out.println(response);
    }
    /**
     * proxyNodeReplace
     *
     */
    @Test
    public void proxyNodeReplaceTest() {
        ProxyNodeReplaceRequest proxyNodeReplaceRequest = new ProxyNodeReplaceRequest();
        proxyNodeReplaceRequest.setInstanceId("");
        proxyNodeReplaceRequest.setProxyList(new ArrayList<>());
        proxyNodeReplaceRequest.setDefer(false);
        scsClient.proxyNodeReplace(proxyNodeReplaceRequest);
    }
    /**
     * proxyVersionUpgradeOrRestart
     *
     */
    @Test
    public void proxyVersionUpgradeOrRestartTest() {
        ProxyVersionUpgradeOrRestartRequest proxyVersionUpgradeOrRestartRequest = new ProxyVersionUpgradeOrRestartRequest();
        proxyVersionUpgradeOrRestartRequest.setInstanceId("");
        proxyVersionUpgradeOrRestartRequest.setProxyList(new ArrayList<>());
        proxyVersionUpgradeOrRestartRequest.setUpgradeType("");
        proxyVersionUpgradeOrRestartRequest.setIsDefer(false);
        scsClient.proxyVersionUpgradeOrRestart(proxyVersionUpgradeOrRestartRequest);
    }
    /**
     * queryIpWhitelist
     *
     */
    @Test
    public void queryIpWhitelistTest() {
        QueryIpWhitelistRequest queryIpWhitelistRequest = new QueryIpWhitelistRequest();
        queryIpWhitelistRequest.setInstanceId("");
        QueryIpWhitelistResponse response = scsClient.queryIpWhitelist(queryIpWhitelistRequest);
        System.out.println(response);
    }
    /**
     * queryMemoryScalingConfig
     *
     */
    @Test
    public void queryMemoryScalingConfigTest() {
        QueryMemoryScalingConfigRequest queryMemoryScalingConfigRequest = new QueryMemoryScalingConfigRequest();
        queryMemoryScalingConfigRequest.setInstanceId("");
        QueryMemoryScalingConfigResponse response = scsClient.queryMemoryScalingConfig(queryMemoryScalingConfigRequest);
        System.out.println(response);
    }
    /**
     * releaseHotGroup
     *
     */
    @Test
    public void releaseHotGroupTest() {
        ReleaseHotGroupRequest releaseHotGroupRequest = new ReleaseHotGroupRequest();
        releaseHotGroupRequest.setGroupId("");
        scsClient.releaseHotGroup(releaseHotGroupRequest);
    }
    /**
     * releaseInstance
     *
     */
    @Test
    public void releaseInstanceTest() {
        ReleaseInstanceRequest releaseInstanceRequest = new ReleaseInstanceRequest();
        releaseInstanceRequest.setInstanceId("");
        scsClient.releaseInstance(releaseInstanceRequest);
    }
    /**
     * renewInstance
     *
     */
    @Test
    public void renewInstanceTest() {
        RenewInstanceRequest renewInstanceRequest = new RenewInstanceRequest();
        renewInstanceRequest.setInstanceIds(new ArrayList<>());
        renewInstanceRequest.setDuration(0);
        RenewInstanceResponse response = scsClient.renewInstance(renewInstanceRequest);
        System.out.println(response);
    }
    /**
     * restartInstance
     *
     */
    @Test
    public void restartInstanceTest() {
        RestartInstanceRequest restartInstanceRequest = new RestartInstanceRequest();
        restartInstanceRequest.setInstanceId("");
        restartInstanceRequest.setIsDefer(false);
        scsClient.restartInstance(restartInstanceRequest);
    }
    /**
     * setBackupPolicy
     *
     */
    @Test
    public void setBackupPolicyTest() {
        SetBackupPolicyRequest setBackupPolicyRequest = new SetBackupPolicyRequest();
        setBackupPolicyRequest.setInstanceId("");
        setBackupPolicyRequest.setBackupTime("");
        setBackupPolicyRequest.setBackupDays("");
        setBackupPolicyRequest.setExpireDay(0);
        setBackupPolicyRequest.setIsEncrypt("");
        scsClient.setBackupPolicy(setBackupPolicyRequest);
    }
    /**
     * setClusterAsMaster
     *
     */
    @Test
    public void setClusterAsMasterTest() {
        SetClusterAsMasterRequest setClusterAsMasterRequest = new SetClusterAsMasterRequest();
        setClusterAsMasterRequest.setInstanceId("");
        scsClient.setClusterAsMaster(setClusterAsMasterRequest);
    }
    /**
     * setClusterAsSlave
     *
     */
    @Test
    public void setClusterAsSlaveTest() {
        SetClusterAsSlaveRequest setClusterAsSlaveRequest = new SetClusterAsSlaveRequest();
        setClusterAsSlaveRequest.setInstanceId("");
        setClusterAsSlaveRequest.setMasterDomain("");
        setClusterAsSlaveRequest.setMasterPort(0);
        scsClient.setClusterAsSlave(setClusterAsSlaveRequest);
    }
    /**
     * setMemoryScalingConfig
     *
     */
    @Test
    public void setMemoryScalingConfigTest() {
        SetMemoryScalingConfigRequest setMemoryScalingConfigRequest = new SetMemoryScalingConfigRequest();
        setMemoryScalingConfigRequest.setInstanceId("");
        setMemoryScalingConfigRequest.setMemSpec(null);
        scsClient.setMemoryScalingConfig(setMemoryScalingConfigRequest);
    }
    /**
     * setPermissions
     *
     */
    @Test
    public void setPermissionsTest() {
        SetPermissionsRequest setPermissionsRequest = new SetPermissionsRequest();
        setPermissionsRequest.setInstanceId("");
        setPermissionsRequest.setUserName("");
        setPermissionsRequest.setUserType(0);
        scsClient.setPermissions(setPermissionsRequest);
    }
    /**
     * syncGroupAddInstance
     *
     */
    @Test
    public void syncGroupAddInstanceTest() {
        SyncGroupAddInstanceRequest syncGroupAddInstanceRequest = new SyncGroupAddInstanceRequest();
        syncGroupAddInstanceRequest.setGroupId("");
        syncGroupAddInstanceRequest.setMemberId("");
        syncGroupAddInstanceRequest.setRegion("");
        scsClient.syncGroupAddInstance(syncGroupAddInstanceRequest);
    }
    /**
     * syncGroupDelayInfo
     *
     */
    @Test
    public void syncGroupDelayInfoTest() {
        SyncGroupDelayInfoRequest syncGroupDelayInfoRequest = new SyncGroupDelayInfoRequest();
        syncGroupDelayInfoRequest.setGroupId("");
        SyncGroupDelayInfoResponse response = scsClient.syncGroupDelayInfo(syncGroupDelayInfoRequest);
        System.out.println(response);
    }
    /**
     * syncGroupDetail
     *
     */
    @Test
    public void syncGroupDetailTest() {
        SyncGroupDetailRequest syncGroupDetailRequest = new SyncGroupDetailRequest();
        syncGroupDetailRequest.setSyncGroupShowId("");
        SyncGroupDetailResponse response = scsClient.syncGroupDetail(syncGroupDetailRequest);
        System.out.println(response);
    }
    /**
     * syncGroupList
     *
     */
    @Test
    public void syncGroupListTest() {
        SyncGroupListResponse response = scsClient.syncGroupList();
        System.out.println(response);
    }
    /**
     * syncGroupModifyBnsgroup
     *
     */
    @Test
    public void syncGroupModifyBnsgroupTest() {
        SyncGroupModifyBnsgroupRequest syncGroupModifyBnsgroupRequest = new SyncGroupModifyBnsgroupRequest();
        syncGroupModifyBnsgroupRequest.setGroupId("");
        syncGroupModifyBnsgroupRequest.setBnsGroup("");
        scsClient.syncGroupModifyBnsgroup(syncGroupModifyBnsgroupRequest);
    }
    /**
     * syncGroupPreCheck
     *
     */
    @Test
    public void syncGroupPreCheckTest() {
        SyncGroupPreCheckRequest syncGroupPreCheckRequest = new SyncGroupPreCheckRequest();
        syncGroupPreCheckRequest.setSyncGroupShowId("");
        syncGroupPreCheckRequest.setMembers(new ArrayList<>());
        SyncGroupPreCheckResponse response = scsClient.syncGroupPreCheck(syncGroupPreCheckRequest);
        System.out.println(response);
    }
    /**
     * syncGroupRemoveInstance
     *
     */
    @Test
    public void syncGroupRemoveInstanceTest() {
        SyncGroupRemoveInstanceRequest syncGroupRemoveInstanceRequest = new SyncGroupRemoveInstanceRequest();
        syncGroupRemoveInstanceRequest.setGroupId("");
        syncGroupRemoveInstanceRequest.setMemberId("");
        syncGroupRemoveInstanceRequest.setRegion("");
        scsClient.syncGroupRemoveInstance(syncGroupRemoveInstanceRequest);
    }
    /**
     * tdeEncryption
     *
     */
    @Test
    public void tdeEncryptionTest() {
        TdeEncryptionRequest tdeEncryptionRequest = new TdeEncryptionRequest();
        tdeEncryptionRequest.setInstanceId("");
        tdeEncryptionRequest.setAction("");
        TdeEncryptionResponse response = scsClient.tdeEncryption(tdeEncryptionRequest);
        System.out.println(response);
    }
    /**
     * unbindSecurityGroup
     *
     */
    @Test
    public void unbindSecurityGroupTest() {
        UnbindSecurityGroupRequest unbindSecurityGroupRequest = new UnbindSecurityGroupRequest();
        unbindSecurityGroupRequest.setInstanceId("");
        unbindSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        UnbindSecurityGroupResponse response = scsClient.unbindSecurityGroup(unbindSecurityGroupRequest);
        System.out.println(response);
    }
    /**
     * unbindTags
     *
     */
    @Test
    public void unbindTagsTest() {
        UnbindTagsRequest unbindTagsRequest = new UnbindTagsRequest();
        unbindTagsRequest.setInstanceId("");
        unbindTagsRequest.setChangeTags(new ArrayList<>());
        scsClient.unbindTags(unbindTagsRequest);
    }
    /**
     * updateInstanceWhiteGroup
     *
     */
    @Test
    public void updateInstanceWhiteGroupTest() {
        UpdateInstanceWhiteGroupRequest updateInstanceWhiteGroupRequest = new UpdateInstanceWhiteGroupRequest();
        updateInstanceWhiteGroupRequest.setInstanceId("");
        updateInstanceWhiteGroupRequest.setGroupName("");
        updateInstanceWhiteGroupRequest.setNewGroupName("");
        updateInstanceWhiteGroupRequest.setClusterIpList(new ArrayList<>());
        scsClient.updateInstanceWhiteGroup(updateInstanceWhiteGroupRequest);
    }
    /**
     * updateSecurityGroup
     *
     */
    @Test
    public void updateSecurityGroupTest() {
        UpdateSecurityGroupRequest updateSecurityGroupRequest = new UpdateSecurityGroupRequest();
        updateSecurityGroupRequest.setInstanceId("");
        updateSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        UpdateSecurityGroupResponse response = scsClient.updateSecurityGroup(updateSecurityGroupRequest);
        System.out.println(response);
    }
    /**
     * updateTlsEncryption
     *
     */
    @Test
    public void updateTlsEncryptionTest() {
        UpdateTlsEncryptionRequest updateTlsEncryptionRequest = new UpdateTlsEncryptionRequest();
        updateTlsEncryptionRequest.setInstanceId("");
        updateTlsEncryptionRequest.setAction("");
        scsClient.updateTlsEncryption(updateTlsEncryptionRequest);
    }
    /**
     * viewSecurityGroup
     *
     */
    @Test
    public void viewSecurityGroupTest() {
        ViewSecurityGroupRequest viewSecurityGroupRequest = new ViewSecurityGroupRequest();
        viewSecurityGroupRequest.setInstanceId("");
        ViewSecurityGroupResponse response = scsClient.viewSecurityGroup(viewSecurityGroupRequest);
        System.out.println(response);
    }
}
