package com.baidubce.rds;

import com.baidubce.rds.models.AddAccountApiAtTableGranularityRequest;
import com.baidubce.rds.models.BatchConfigurationOfInstancesRequest;
import com.baidubce.rds.models.BatchConfigurationOfInstancesResponse;
import com.baidubce.rds.models.BindingTagsRequest;
import com.baidubce.rds.models.ChangeAccountPasswordRequest;
import com.baidubce.rds.models.CheckTheWhitelistRequest;
import com.baidubce.rds.models.CheckTheWhitelistResponse;
import com.baidubce.rds.models.ClusterStatusCheckRequest;
import com.baidubce.rds.models.ClusterStatusCheckResponse;
import com.baidubce.rds.models.CopyParameterTemplateRequest;
import com.baidubce.rds.models.CreateADatabaseRequest;
import com.baidubce.rds.models.CreateAPrimaryInstanceRequest;
import com.baidubce.rds.models.CreateAPrimaryInstanceResponse;
import com.baidubce.rds.models.CreateAProxyInstanceRequest;
import com.baidubce.rds.models.CreateAProxyInstanceResponse;
import com.baidubce.rds.models.CreateAccountRequest;
import com.baidubce.rds.models.CreateReadOnlyInstanceRequest;
import com.baidubce.rds.models.CreateReadOnlyInstanceResponse;
import com.baidubce.rds.models.DeleteAccountRequest;
import com.baidubce.rds.models.DeleteTheDatabaseRequest;
import com.baidubce.rds.models.DeleteTheSpecifiedBackupSetRequest;
import com.baidubce.rds.models.DialTestInterfaceRequest;
import com.baidubce.rds.models.DialTestInterfaceResponse;
import com.baidubce.rds.models.DoesTheInstanceSupportEnablingAutomaticExpansionRequest;
import com.baidubce.rds.models.DoesTheInstanceSupportEnablingAutomaticExpansionResponse;
import com.baidubce.rds.models.ErrorLogListRequest;
import com.baidubce.rds.models.ErrorLogListResponse;
import com.baidubce.rds.models.GetParameterTemplateDetailsRequest;
import com.baidubce.rds.models.GetParameterTemplateDetailsResponse;
import com.baidubce.rds.models.GetParameterTemplateListRequest;
import com.baidubce.rds.models.GetParameterTemplateListResponse;
import com.baidubce.rds.models.GetPgLogDetailsRequest;
import com.baidubce.rds.models.GetPgLogDetailsResponse;
import com.baidubce.rds.models.GetPgLogListRequest;
import com.baidubce.rds.models.GetPgLogListResponse;
import com.baidubce.rds.models.InstanceEnablesAutomaticRenewalRequest;
import com.baidubce.rds.models.ManuallyInitiateFullPhysicalBackupRequest;
import com.baidubce.rds.models.ModifyAccountNotesRequest;
import com.baidubce.rds.models.ModifyAccountPermissionsRequest;
import com.baidubce.rds.models.ModifyBackupStrategyRequest;
import com.baidubce.rds.models.ModifyConfigurationParametersRequest;
import com.baidubce.rds.models.ModifyDatabasePortRequest;
import com.baidubce.rds.models.ModifyDescriptionInformationRequest;
import com.baidubce.rds.models.ObtainBinlogInformationRequest;
import com.baidubce.rds.models.ObtainBinlogInformationResponse;
import com.baidubce.rds.models.ObtainSslEncryptionCertificateResponse;
import com.baidubce.rds.models.ObtainSslEncryptionInformationRequest;
import com.baidubce.rds.models.ObtainSslEncryptionInformationResponse;
import com.baidubce.rds.models.QueryAccountDetailsRequest;
import com.baidubce.rds.models.QueryAccountDetailsResponse;
import com.baidubce.rds.models.QueryAccountListRequest;
import com.baidubce.rds.models.QueryAccountListResponse;
import com.baidubce.rds.models.QueryAndModifyHistoryRequest;
import com.baidubce.rds.models.QueryAndModifyHistoryResponse;
import com.baidubce.rds.models.QueryBackupDetailsRequest;
import com.baidubce.rds.models.QueryBackupDetailsResponse;
import com.baidubce.rds.models.QueryBackupListRequest;
import com.baidubce.rds.models.QueryBackupListResponse;
import com.baidubce.rds.models.QueryInstanceListRequest;
import com.baidubce.rds.models.QueryInstanceListResponse;
import com.baidubce.rds.models.QueryParameterListRequest;
import com.baidubce.rds.models.QueryParameterListResponse;
import com.baidubce.rds.models.QuerySubnetListRequest;
import com.baidubce.rds.models.QuerySubnetListResponse;
import com.baidubce.rds.models.QueryTaskListRequest;
import com.baidubce.rds.models.QueryTaskListResponse;
import com.baidubce.rds.models.QueryTheDetailsOfTheSpecifiedInstanceRequest;
import com.baidubce.rds.models.QueryTheDetailsOfTheSpecifiedInstanceResponse;
import com.baidubce.rds.models.QueryTheListOfAvailableZonesResponse;
import com.baidubce.rds.models.ReleaseInstanceRequest;
import com.baidubce.rds.models.ReleaseInstanceResponse;
import com.baidubce.rds.models.RenewalExampleRequest;
import com.baidubce.rds.models.RenewalExampleResponse;
import com.baidubce.rds.models.RestartTheInstanceRequest;
import com.baidubce.rds.models.RestoreLibraryTablesBasedOnBackupSetsRequest;
import com.baidubce.rds.models.RestoreTheDatabaseTableByTimePointRequest;
import com.baidubce.rds.models.RetrieveDatabaseListRequest;
import com.baidubce.rds.models.RetrieveDatabaseListResponse;
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigRequest;
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigResponse;
import com.baidubce.rds.models.RetrieveTheBinlogListRequest;
import com.baidubce.rds.models.RetrieveTheBinlogListResponse;
import com.baidubce.rds.models.SetEncryptionPolicyApiRequest;
import com.baidubce.rds.models.SlowLogListRequest;
import com.baidubce.rds.models.SlowLogListResponse;
import com.baidubce.rds.models.TableGranularityQueryUserDetailsApiRequest;
import com.baidubce.rds.models.TableGranularityQueryUserDetailsApiResponse;
import com.baidubce.rds.models.TableGranularityQueryUserListApiRequest;
import com.baidubce.rds.models.TableGranularityQueryUserListApiResponse;
import com.baidubce.rds.models.TableGranularityUpdateUserDescriptionApiRequest;
import com.baidubce.rds.models.TargetRegionMappingListApiRequest;
import com.baidubce.rds.models.TargetRegionMappingListApiResponse;
import com.baidubce.rds.models.TransformationExampleRequest;
import com.baidubce.rds.models.TransformationExampleResponse;
import com.baidubce.rds.models.UpdateAutomaticStorageExpansionConfigurationRequest;
import com.baidubce.rds.models.UpdateInstanceConnectionInformationRequest;
import com.baidubce.rds.models.UpdateInstanceNameRequest;
import com.baidubce.rds.models.UpdateInstancePublicNetworkAccessStatusRequest;
import com.baidubce.rds.models.UpdateInstanceSynchronizationModeRequest;
import com.baidubce.rds.models.UpdateTimeWindowRequest;
import com.baidubce.rds.models.UpdateWhitelistRequest;
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
     * addAccountApiAtTableGranularity
     *
     */
    @Test
    public void addAccountApiAtTableGranularityTest() {
        AddAccountApiAtTableGranularityRequest addAccountApiAtTableGranularityRequest = new AddAccountApiAtTableGranularityRequest();
        addAccountApiAtTableGranularityRequest.setInstanceId("");
        rdsClient.addAccountApiAtTableGranularity(addAccountApiAtTableGranularityRequest);
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
     * changeAccountPassword
     *
     */
    @Test
    public void changeAccountPasswordTest() {
        ChangeAccountPasswordRequest changeAccountPasswordRequest = new ChangeAccountPasswordRequest();
        changeAccountPasswordRequest.setInstanceId("");
        changeAccountPasswordRequest.setAccountName("");
        changeAccountPasswordRequest.setPassword("");
        rdsClient.changeAccountPassword(changeAccountPasswordRequest);
    }
    /**
     * checkTheWhitelist
     *
     */
    @Test
    public void checkTheWhitelistTest() {
        CheckTheWhitelistRequest checkTheWhitelistRequest = new CheckTheWhitelistRequest();
        checkTheWhitelistRequest.setInstanceId("");
        CheckTheWhitelistResponse response = rdsClient.checkTheWhitelist(checkTheWhitelistRequest);
        System.out.println(response);
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
     * copyParameterTemplate
     *
     */
    @Test
    public void copyParameterTemplateTest() {
        CopyParameterTemplateRequest copyParameterTemplateRequest = new CopyParameterTemplateRequest();
        copyParameterTemplateRequest.setName("");
        copyParameterTemplateRequest.setDesc("");
        copyParameterTemplateRequest.setTemplateId("");
        rdsClient.copyParameterTemplate(copyParameterTemplateRequest);
    }
    /**
     * createADatabase
     *
     */
    @Test
    public void createADatabaseTest() {
        CreateADatabaseRequest createADatabaseRequest = new CreateADatabaseRequest();
        createADatabaseRequest.setInstanceId("");
        createADatabaseRequest.setCharacterSetName("");
        createADatabaseRequest.setDbName("");
        createADatabaseRequest.setRemark("");
        createADatabaseRequest.setAccountPrivileges(new ArrayList<>());
        createADatabaseRequest.setCtype("");
        createADatabaseRequest.setCollate("");
        createADatabaseRequest.setOwner("");
        rdsClient.createADatabase(createADatabaseRequest);
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
     * createAccount
     *
     */
    @Test
    public void createAccountTest() {
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        createAccountRequest.setInstanceId("");
        createAccountRequest.setAccountName("");
        createAccountRequest.setPassword("");
        createAccountRequest.setAccountType("");
        createAccountRequest.setDatabasePrivileges(new ArrayList<>());
        createAccountRequest.setDesc("");
        createAccountRequest.setType("");
        rdsClient.createAccount(createAccountRequest);
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
     * deleteAccount
     *
     */
    @Test
    public void deleteAccountTest() {
        DeleteAccountRequest deleteAccountRequest = new DeleteAccountRequest();
        deleteAccountRequest.setInstanceId("");
        deleteAccountRequest.setAccountName("");
        rdsClient.deleteAccount(deleteAccountRequest);
    }
    /**
     * deleteTheDatabase
     *
     */
    @Test
    public void deleteTheDatabaseTest() {
        DeleteTheDatabaseRequest deleteTheDatabaseRequest = new DeleteTheDatabaseRequest();
        deleteTheDatabaseRequest.setInstanceId("");
        deleteTheDatabaseRequest.setDbName("");
        rdsClient.deleteTheDatabase(deleteTheDatabaseRequest);
    }
    /**
     * deleteTheSpecifiedBackupSet
     *
     */
    @Test
    public void deleteTheSpecifiedBackupSetTest() {
        DeleteTheSpecifiedBackupSetRequest deleteTheSpecifiedBackupSetRequest = new DeleteTheSpecifiedBackupSetRequest();
        deleteTheSpecifiedBackupSetRequest.setInstanceId("");
        deleteTheSpecifiedBackupSetRequest.setSnapshotId("");
        rdsClient.deleteTheSpecifiedBackupSet(deleteTheSpecifiedBackupSetRequest);
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
     * errorLogList
     *
     */
    @Test
    public void errorLogListTest() {
        ErrorLogListRequest errorLogListRequest = new ErrorLogListRequest();
        errorLogListRequest.setInstanceId("");
        errorLogListRequest.setDatetime("");
        ErrorLogListResponse response = rdsClient.errorLogList(errorLogListRequest);
        System.out.println(response);
    }
    /**
     * getParameterTemplateDetails
     *
     */
    @Test
    public void getParameterTemplateDetailsTest() {
        GetParameterTemplateDetailsRequest getParameterTemplateDetailsRequest = new GetParameterTemplateDetailsRequest();
        getParameterTemplateDetailsRequest.setTemplateId("");
        GetParameterTemplateDetailsResponse response = rdsClient.getParameterTemplateDetails(getParameterTemplateDetailsRequest);
        System.out.println(response);
    }
    /**
     * getParameterTemplateList
     *
     */
    @Test
    public void getParameterTemplateListTest() {
        GetParameterTemplateListRequest getParameterTemplateListRequest = new GetParameterTemplateListRequest();
        getParameterTemplateListRequest.setDbType("");
        getParameterTemplateListRequest.setDbVersion("");
        GetParameterTemplateListResponse response = rdsClient.getParameterTemplateList(getParameterTemplateListRequest);
        System.out.println(response);
    }
    /**
     * getPgLogDetails
     *
     */
    @Test
    public void getPgLogDetailsTest() {
        GetPgLogDetailsRequest getPgLogDetailsRequest = new GetPgLogDetailsRequest();
        getPgLogDetailsRequest.setInstanceId("");
        getPgLogDetailsRequest.setPglogId("");
        getPgLogDetailsRequest.setDownloadValidTimeInSec(0);
        GetPgLogDetailsResponse response = rdsClient.getPgLogDetails(getPgLogDetailsRequest);
        System.out.println(response);
    }
    /**
     * getPgLogList
     *
     */
    @Test
    public void getPgLogListTest() {
        GetPgLogListRequest getPgLogListRequest = new GetPgLogListRequest();
        getPgLogListRequest.setInstanceId("");
        getPgLogListRequest.setDate("");
        GetPgLogListResponse response = rdsClient.getPgLogList(getPgLogListRequest);
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
     * manuallyInitiateFullPhysicalBackup
     *
     */
    @Test
    public void manuallyInitiateFullPhysicalBackupTest() {
        ManuallyInitiateFullPhysicalBackupRequest manuallyInitiateFullPhysicalBackupRequest = new ManuallyInitiateFullPhysicalBackupRequest();
        manuallyInitiateFullPhysicalBackupRequest.setInstanceId("");
        manuallyInitiateFullPhysicalBackupRequest.setEffectiveTime("");
        manuallyInitiateFullPhysicalBackupRequest.setDataBackupType("");
        rdsClient.manuallyInitiateFullPhysicalBackup(manuallyInitiateFullPhysicalBackupRequest);
    }
    /**
     * modifyAccountNotes
     *
     */
    @Test
    public void modifyAccountNotesTest() {
        ModifyAccountNotesRequest modifyAccountNotesRequest = new ModifyAccountNotesRequest();
        modifyAccountNotesRequest.setInstanceId("");
        modifyAccountNotesRequest.setAccountName("");
        modifyAccountNotesRequest.setRemark("");
        rdsClient.modifyAccountNotes(modifyAccountNotesRequest);
    }
    /**
     * modifyAccountPermissions
     *
     */
    @Test
    public void modifyAccountPermissionsTest() {
        ModifyAccountPermissionsRequest modifyAccountPermissionsRequest = new ModifyAccountPermissionsRequest();
        modifyAccountPermissionsRequest.setInstanceId("");
        modifyAccountPermissionsRequest.setAccountName("");
        modifyAccountPermissionsRequest.setDatabasePrivileges(new ArrayList<>());
        rdsClient.modifyAccountPermissions(modifyAccountPermissionsRequest);
    }
    /**
     * modifyBackupStrategy
     *
     */
    @Test
    public void modifyBackupStrategyTest() {
        ModifyBackupStrategyRequest modifyBackupStrategyRequest = new ModifyBackupStrategyRequest();
        modifyBackupStrategyRequest.setInstanceId("");
        modifyBackupStrategyRequest.setBackupDays("");
        modifyBackupStrategyRequest.setBackupTime("");
        modifyBackupStrategyRequest.setPersistent(false);
        modifyBackupStrategyRequest.setExpireInDays(0);
        modifyBackupStrategyRequest.setLogBackupRetainDays(0);
        modifyBackupStrategyRequest.setDataBackupType("");
        modifyBackupStrategyRequest.setIncrementalDataBackupEnable(false);
        modifyBackupStrategyRequest.setIncrementalDataBackupInterval(0);
        modifyBackupStrategyRequest.setLatestDataBackupRetainDays(0);
        modifyBackupStrategyRequest.setRetentionPeriod(0);
        modifyBackupStrategyRequest.setTimeUnit("");
        modifyBackupStrategyRequest.setDataBackupCopyEnable(false);
        modifyBackupStrategyRequest.setDataBackupCopyStoragesRegions(new ArrayList<>());
        modifyBackupStrategyRequest.setDataBackupCopyRetainDays(0);
        rdsClient.modifyBackupStrategy(modifyBackupStrategyRequest);
    }
    /**
     * modifyConfigurationParameters
     *
     */
    @Test
    public void modifyConfigurationParametersTest() {
        ModifyConfigurationParametersRequest modifyConfigurationParametersRequest = new ModifyConfigurationParametersRequest();
        modifyConfigurationParametersRequest.setInstanceId("");
        modifyConfigurationParametersRequest.setEffectiveTime("");
        modifyConfigurationParametersRequest.setParameters(new ArrayList<>());
        rdsClient.modifyConfigurationParameters(modifyConfigurationParametersRequest);
    }
    /**
     * modifyDatabasePort
     *
     */
    @Test
    public void modifyDatabasePortTest() {
        ModifyDatabasePortRequest modifyDatabasePortRequest = new ModifyDatabasePortRequest();
        modifyDatabasePortRequest.setInstanceId("");
        modifyDatabasePortRequest.setEntryPort(0);
        rdsClient.modifyDatabasePort(modifyDatabasePortRequest);
    }
    /**
     * modifyDescriptionInformation
     *
     */
    @Test
    public void modifyDescriptionInformationTest() {
        ModifyDescriptionInformationRequest modifyDescriptionInformationRequest = new ModifyDescriptionInformationRequest();
        modifyDescriptionInformationRequest.setInstanceId("");
        modifyDescriptionInformationRequest.setDbName("");
        modifyDescriptionInformationRequest.setRemark("");
        rdsClient.modifyDescriptionInformation(modifyDescriptionInformationRequest);
    }
    /**
     * obtainBinlogInformation
     *
     */
    @Test
    public void obtainBinlogInformationTest() {
        ObtainBinlogInformationRequest obtainBinlogInformationRequest = new ObtainBinlogInformationRequest();
        obtainBinlogInformationRequest.setInstanceId("");
        obtainBinlogInformationRequest.setLogId("");
        obtainBinlogInformationRequest.setDownloadValidTimeInSec("");
        ObtainBinlogInformationResponse response = rdsClient.obtainBinlogInformation(obtainBinlogInformationRequest);
        System.out.println(response);
    }
    /**
     * obtainSslEncryptionCertificate
     *
     */
    @Test
    public void obtainSslEncryptionCertificateTest() {
        ObtainSslEncryptionCertificateResponse response = rdsClient.obtainSslEncryptionCertificate();
        System.out.println(response);
    }
    /**
     * obtainSslEncryptionInformation
     *
     */
    @Test
    public void obtainSslEncryptionInformationTest() {
        ObtainSslEncryptionInformationRequest obtainSslEncryptionInformationRequest = new ObtainSslEncryptionInformationRequest();
        obtainSslEncryptionInformationRequest.setInstanceId("");
        ObtainSslEncryptionInformationResponse response = rdsClient.obtainSslEncryptionInformation(obtainSslEncryptionInformationRequest);
        System.out.println(response);
    }
    /**
     * queryAccountDetails
     *
     */
    @Test
    public void queryAccountDetailsTest() {
        QueryAccountDetailsRequest queryAccountDetailsRequest = new QueryAccountDetailsRequest();
        queryAccountDetailsRequest.setInstanceId("");
        queryAccountDetailsRequest.setAccountName("");
        QueryAccountDetailsResponse response = rdsClient.queryAccountDetails(queryAccountDetailsRequest);
        System.out.println(response);
    }
    /**
     * queryAccountList
     *
     */
    @Test
    public void queryAccountListTest() {
        QueryAccountListRequest queryAccountListRequest = new QueryAccountListRequest();
        queryAccountListRequest.setInstanceId("");
        QueryAccountListResponse response = rdsClient.queryAccountList(queryAccountListRequest);
        System.out.println(response);
    }
    /**
     * queryAndModifyHistory
     *
     */
    @Test
    public void queryAndModifyHistoryTest() {
        QueryAndModifyHistoryRequest queryAndModifyHistoryRequest = new QueryAndModifyHistoryRequest();
        queryAndModifyHistoryRequest.setInstanceId("");
        QueryAndModifyHistoryResponse response = rdsClient.queryAndModifyHistory(queryAndModifyHistoryRequest);
        System.out.println(response);
    }
    /**
     * queryBackupDetails
     *
     */
    @Test
    public void queryBackupDetailsTest() {
        QueryBackupDetailsRequest queryBackupDetailsRequest = new QueryBackupDetailsRequest();
        queryBackupDetailsRequest.setInstanceId("");
        queryBackupDetailsRequest.setBackupId("");
        QueryBackupDetailsResponse response = rdsClient.queryBackupDetails(queryBackupDetailsRequest);
        System.out.println(response);
    }
    /**
     * queryBackupList
     *
     */
    @Test
    public void queryBackupListTest() {
        QueryBackupListRequest queryBackupListRequest = new QueryBackupListRequest();
        queryBackupListRequest.setInstanceId("");
        queryBackupListRequest.setMarker("");
        queryBackupListRequest.setMaxKeys(0);
        QueryBackupListResponse response = rdsClient.queryBackupList(queryBackupListRequest);
        System.out.println(response);
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
     * queryParameterList
     *
     */
    @Test
    public void queryParameterListTest() {
        QueryParameterListRequest queryParameterListRequest = new QueryParameterListRequest();
        queryParameterListRequest.setInstanceId("");
        QueryParameterListResponse response = rdsClient.queryParameterList(queryParameterListRequest);
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
     * queryTheDetailsOfTheSpecifiedInstance
     *
     */
    @Test
    public void queryTheDetailsOfTheSpecifiedInstanceTest() {
        QueryTheDetailsOfTheSpecifiedInstanceRequest queryTheDetailsOfTheSpecifiedInstanceRequest = new QueryTheDetailsOfTheSpecifiedInstanceRequest();
        queryTheDetailsOfTheSpecifiedInstanceRequest.setInstanceId("");
        QueryTheDetailsOfTheSpecifiedInstanceResponse response = rdsClient.queryTheDetailsOfTheSpecifiedInstance(queryTheDetailsOfTheSpecifiedInstanceRequest);
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
     * restoreLibraryTablesBasedOnBackupSets
     *
     */
    @Test
    public void restoreLibraryTablesBasedOnBackupSetsTest() {
        RestoreLibraryTablesBasedOnBackupSetsRequest restoreLibraryTablesBasedOnBackupSetsRequest = new RestoreLibraryTablesBasedOnBackupSetsRequest();
        restoreLibraryTablesBasedOnBackupSetsRequest.setInstanceId("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setSourceInstanceId("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setTargetInstanceId("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setSnapshotId("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setData(new ArrayList<>());
        restoreLibraryTablesBasedOnBackupSetsRequest.setDbName("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setNewDbname("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setRestoreMode("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setTables(new ArrayList<>());
        restoreLibraryTablesBasedOnBackupSetsRequest.setTableName("");
        restoreLibraryTablesBasedOnBackupSetsRequest.setNewTablename("");
        rdsClient.restoreLibraryTablesBasedOnBackupSets(restoreLibraryTablesBasedOnBackupSetsRequest);
    }
    /**
     * restoreTheDatabaseTableByTimePoint
     *
     */
    @Test
    public void restoreTheDatabaseTableByTimePointTest() {
        RestoreTheDatabaseTableByTimePointRequest restoreTheDatabaseTableByTimePointRequest = new RestoreTheDatabaseTableByTimePointRequest();
        restoreTheDatabaseTableByTimePointRequest.setInstanceId("");
        restoreTheDatabaseTableByTimePointRequest.setSourceInstanceId("");
        restoreTheDatabaseTableByTimePointRequest.setTargetInstanceId("");
        restoreTheDatabaseTableByTimePointRequest.setDatetime("");
        restoreTheDatabaseTableByTimePointRequest.setData(new ArrayList<>());
        restoreTheDatabaseTableByTimePointRequest.setDbName("");
        restoreTheDatabaseTableByTimePointRequest.setNewDbname("");
        restoreTheDatabaseTableByTimePointRequest.setRestoreMode("");
        restoreTheDatabaseTableByTimePointRequest.setTables(new ArrayList<>());
        restoreTheDatabaseTableByTimePointRequest.setTableName("");
        restoreTheDatabaseTableByTimePointRequest.setNewTablename("");
        rdsClient.restoreTheDatabaseTableByTimePoint(restoreTheDatabaseTableByTimePointRequest);
    }
    /**
     * retrieveDatabaseList
     *
     */
    @Test
    public void retrieveDatabaseListTest() {
        RetrieveDatabaseListRequest retrieveDatabaseListRequest = new RetrieveDatabaseListRequest();
        retrieveDatabaseListRequest.setInstanceId("");
        RetrieveDatabaseListResponse response = rdsClient.retrieveDatabaseList(retrieveDatabaseListRequest);
        System.out.println(response);
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
     * retrieveTheBinlogList
     *
     */
    @Test
    public void retrieveTheBinlogListTest() {
        RetrieveTheBinlogListRequest retrieveTheBinlogListRequest = new RetrieveTheBinlogListRequest();
        retrieveTheBinlogListRequest.setInstanceId("");
        retrieveTheBinlogListRequest.setDatetime("");
        RetrieveTheBinlogListResponse response = rdsClient.retrieveTheBinlogList(retrieveTheBinlogListRequest);
        System.out.println(response);
    }
    /**
     * setEncryptionPolicyApi
     *
     */
    @Test
    public void setEncryptionPolicyApiTest() {
        SetEncryptionPolicyApiRequest setEncryptionPolicyApiRequest = new SetEncryptionPolicyApiRequest();
        setEncryptionPolicyApiRequest.setInstanceId("");
        setEncryptionPolicyApiRequest.setBackupPolicy(new ArrayList<>());
        rdsClient.setEncryptionPolicyApi(setEncryptionPolicyApiRequest);
    }
    /**
     * slowLogList
     *
     */
    @Test
    public void slowLogListTest() {
        SlowLogListRequest slowLogListRequest = new SlowLogListRequest();
        slowLogListRequest.setInstanceId("");
        slowLogListRequest.setDatetime("");
        SlowLogListResponse response = rdsClient.slowLogList(slowLogListRequest);
        System.out.println(response);
    }
    /**
     * tableGranularityQueryUserDetailsApi
     *
     */
    @Test
    public void tableGranularityQueryUserDetailsApiTest() {
        TableGranularityQueryUserDetailsApiRequest tableGranularityQueryUserDetailsApiRequest = new TableGranularityQueryUserDetailsApiRequest();
        tableGranularityQueryUserDetailsApiRequest.setInstanceId("");
        tableGranularityQueryUserDetailsApiRequest.setUser("");
        tableGranularityQueryUserDetailsApiRequest.setHost("");
        TableGranularityQueryUserDetailsApiResponse response = rdsClient.tableGranularityQueryUserDetailsApi(tableGranularityQueryUserDetailsApiRequest);
        System.out.println(response);
    }
    /**
     * tableGranularityQueryUserListApi
     *
     */
    @Test
    public void tableGranularityQueryUserListApiTest() {
        TableGranularityQueryUserListApiRequest tableGranularityQueryUserListApiRequest = new TableGranularityQueryUserListApiRequest();
        tableGranularityQueryUserListApiRequest.setInstanceId("");
        TableGranularityQueryUserListApiResponse response = rdsClient.tableGranularityQueryUserListApi(tableGranularityQueryUserListApiRequest);
        System.out.println(response);
    }
    /**
     * tableGranularityUpdateUserDescriptionApi
     *
     */
    @Test
    public void tableGranularityUpdateUserDescriptionApiTest() {
        TableGranularityUpdateUserDescriptionApiRequest tableGranularityUpdateUserDescriptionApiRequest = new TableGranularityUpdateUserDescriptionApiRequest();
        tableGranularityUpdateUserDescriptionApiRequest.setInstanceId("");
        tableGranularityUpdateUserDescriptionApiRequest.setUser("");
        tableGranularityUpdateUserDescriptionApiRequest.setHost("");
        tableGranularityUpdateUserDescriptionApiRequest.setRemark("");
        rdsClient.tableGranularityUpdateUserDescriptionApi(tableGranularityUpdateUserDescriptionApiRequest);
    }
    /**
     * targetRegionMappingListApi
     *
     */
    @Test
    public void targetRegionMappingListApiTest() {
        TargetRegionMappingListApiRequest targetRegionMappingListApiRequest = new TargetRegionMappingListApiRequest();
        targetRegionMappingListApiRequest.setInstanceId("");
        TargetRegionMappingListApiResponse response = rdsClient.targetRegionMappingListApi(targetRegionMappingListApiRequest);
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
    /**
     * updateWhitelist
     *
     */
    @Test
    public void updateWhitelistTest() {
        UpdateWhitelistRequest updateWhitelistRequest = new UpdateWhitelistRequest();
        updateWhitelistRequest.setInstanceId("");
        updateWhitelistRequest.setAction("");
        updateWhitelistRequest.setSecurityIps(new ArrayList<>());
        updateWhitelistRequest.setTag("");
        rdsClient.updateWhitelist(updateWhitelistRequest);
    }
}
