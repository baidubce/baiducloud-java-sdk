package com.baidubce.bcc;

import com.baidubce.bcc.models.AddIpv6Request;
import com.baidubce.bcc.models.AddIpv6Response;
import com.baidubce.bcc.models.AttachVolumeRequest;
import com.baidubce.bcc.models.AttachVolumeResponse;
import com.baidubce.bcc.models.AutoReleaseInstanceRequest;
import com.baidubce.bcc.models.BatchAddIpRequest;
import com.baidubce.bcc.models.BatchChangeToPostpaidRequest;
import com.baidubce.bcc.models.BatchChangeToPostpaidResponse;
import com.baidubce.bcc.models.BatchChangeToPrepaidRequest;
import com.baidubce.bcc.models.BatchChangeToPrepaidResponse;
import com.baidubce.bcc.models.BatchDeleteIpRequest;
import com.baidubce.bcc.models.BatchRefundResourceRequest;
import com.baidubce.bcc.models.BatchRefundResourceResponse;
import com.baidubce.bcc.models.BatchStartInstanceRequest;
import com.baidubce.bcc.models.BatchStopInstanceRequest;
import com.baidubce.bcc.models.BindInstanceToSecurityGroupRequest;
import com.baidubce.bcc.models.BindInstanceToTagsRequest;
import com.baidubce.bcc.models.BindRoleRequest;
import com.baidubce.bcc.models.BindRoleResponse;
import com.baidubce.bcc.models.BindTagImageRequest;
import com.baidubce.bcc.models.BindTagVolumeRequest;
import com.baidubce.bcc.models.CancelRemoteCopyImageRequest;
import com.baidubce.bcc.models.ChangeToPrepaidRequest;
import com.baidubce.bcc.models.ChangeToPrepaidResponse;
import com.baidubce.bcc.models.ChangeVpcRequest;
import com.baidubce.bcc.models.CreateAutoRenewRuleRequest;
import com.baidubce.bcc.models.CreateImageRequest;
import com.baidubce.bcc.models.CreateImageResponse;
import com.baidubce.bcc.models.CreateInstanceBySpecRequest;
import com.baidubce.bcc.models.CreateInstanceBySpecResponse;
import com.baidubce.bcc.models.CreateVolumeRequest;
import com.baidubce.bcc.models.CreateVolumeResponse;
import com.baidubce.bcc.models.DelIpv6Request;
import com.baidubce.bcc.models.DeleteAutoRenewRuleRequest;
import com.baidubce.bcc.models.DeleteImageRequest;
import com.baidubce.bcc.models.DeleteInstanceDeploySetRequest;
import com.baidubce.bcc.models.DeletePrepayInstanceRequest;
import com.baidubce.bcc.models.DeletePrepayInstanceResponse;
import com.baidubce.bcc.models.DeleteRecycledInstanceRequest;
import com.baidubce.bcc.models.DetachVolumeRequest;
import com.baidubce.bcc.models.EnterRescueModeRequest;
import com.baidubce.bcc.models.EnterRescueModeResponse;
import com.baidubce.bcc.models.ExitRescueModeRequest;
import com.baidubce.bcc.models.ExitRescueModeResponse;
import com.baidubce.bcc.models.GetAvailableImagesBySpecRequest;
import com.baidubce.bcc.models.GetAvailableImagesBySpecResponse;
import com.baidubce.bcc.models.GetCdsPriceRequest;
import com.baidubce.bcc.models.GetCdsPriceResponse;
import com.baidubce.bcc.models.GetDiskQuotaRequest;
import com.baidubce.bcc.models.GetDiskQuotaResponse;
import com.baidubce.bcc.models.GetImageRequest;
import com.baidubce.bcc.models.GetImageResponse;
import com.baidubce.bcc.models.GetInstanceNoChargeListRequest;
import com.baidubce.bcc.models.GetInstanceNoChargeListResponse;
import com.baidubce.bcc.models.GetInstanceRequest;
import com.baidubce.bcc.models.GetInstanceResponse;
import com.baidubce.bcc.models.GetInstanceUserDataInfoRequest;
import com.baidubce.bcc.models.GetInstanceUserDataInfoResponse;
import com.baidubce.bcc.models.GetInstanceVncRequest;
import com.baidubce.bcc.models.GetInstanceVncResponse;
import com.baidubce.bcc.models.GetRoleListResponse;
import com.baidubce.bcc.models.GetVolumeRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressResponse;
import com.baidubce.bcc.models.GetVolumeResponse;
import com.baidubce.bcc.models.ImportImageRequest;
import com.baidubce.bcc.models.ImportImageResponse;
import com.baidubce.bcc.models.InstanceBatchResizeBySpecRequest;
import com.baidubce.bcc.models.InstanceBatchResizeBySpecResponse;
import com.baidubce.bcc.models.InstanceDeletionProtectionRequest;
import com.baidubce.bcc.models.InstanceRecoveryRequest;
import com.baidubce.bcc.models.ListAvailableResizeSpecRequest;
import com.baidubce.bcc.models.ListAvailableResizeSpecResponse;
import com.baidubce.bcc.models.ListImagesRequest;
import com.baidubce.bcc.models.ListImagesResponse;
import com.baidubce.bcc.models.ListInstanceByIdsRequest;
import com.baidubce.bcc.models.ListInstanceByIdsResponse;
import com.baidubce.bcc.models.ListInstanceEnisRequest;
import com.baidubce.bcc.models.ListInstanceEnisResponse;
import com.baidubce.bcc.models.ListInstancesRequest;
import com.baidubce.bcc.models.ListInstancesResponse;
import com.baidubce.bcc.models.ListOsRequest;
import com.baidubce.bcc.models.ListOsResponse;
import com.baidubce.bcc.models.ListRecycleInstanceRequest;
import com.baidubce.bcc.models.ListRecycleInstanceResponse;
import com.baidubce.bcc.models.ListSharedUserRequest;
import com.baidubce.bcc.models.ListSharedUserResponse;
import com.baidubce.bcc.models.ListVolumesRequest;
import com.baidubce.bcc.models.ListVolumesResponse;
import com.baidubce.bcc.models.ModifyCdsAttributeRequest;
import com.baidubce.bcc.models.ModifyInstanceAttributesRequest;
import com.baidubce.bcc.models.ModifyInstanceDescRequest;
import com.baidubce.bcc.models.ModifyInstanceHostnameRequest;
import com.baidubce.bcc.models.ModifyInstancePasswordRequest;
import com.baidubce.bcc.models.ModifyRelatedDeletePolicyRequest;
import com.baidubce.bcc.models.ModifyVolumeChargeTypeRequest;
import com.baidubce.bcc.models.PurchaseReservedInstanceRequest;
import com.baidubce.bcc.models.PurchaseReservedInstanceResponse;
import com.baidubce.bcc.models.PurchaseReservedVolumeRequest;
import com.baidubce.bcc.models.PurchaseReservedVolumeResponse;
import com.baidubce.bcc.models.RebootInstanceRequest;
import com.baidubce.bcc.models.RebuildBatchInstanceRequest;
import com.baidubce.bcc.models.RebuildInstanceRequest;
import com.baidubce.bcc.models.ReleaseInstanceByPostRequest;
import com.baidubce.bcc.models.ReleaseMultipleInstanceByPostRequest;
import com.baidubce.bcc.models.ReleaseVolumeRequest;
import com.baidubce.bcc.models.RemoteCopyImageRequest;
import com.baidubce.bcc.models.RemoteCopyImageResponse;
import com.baidubce.bcc.models.RenameImageRequest;
import com.baidubce.bcc.models.RenameVolumeRequest;
import com.baidubce.bcc.models.ResizeInstanceBySpecRequest;
import com.baidubce.bcc.models.ResizeVolumeRequest;
import com.baidubce.bcc.models.ResizeVolumeResponse;
import com.baidubce.bcc.models.RollbackVolumeRequest;
import com.baidubce.bcc.models.ShareImageRequest;
import com.baidubce.bcc.models.StartInstanceRequest;
import com.baidubce.bcc.models.StopInstanceRequest;
import com.baidubce.bcc.models.UnShareImageRequest;
import com.baidubce.bcc.models.UnbindInstanceFromSecurityGroupRequest;
import com.baidubce.bcc.models.UnbindInstanceFromTagsRequest;
import com.baidubce.bcc.models.UnbindRoleRequest;
import com.baidubce.bcc.models.UnbindRoleResponse;
import com.baidubce.bcc.models.UnbindTagImageRequest;
import com.baidubce.bcc.models.UnbindTagVolumeRequest;
import com.baidubce.bcc.models.UpdateInstanceSubnetRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for BccClient
 */
public class BccClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private BccClient bccClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        bccClient = new BccClient(config);
    }

    /**
     * addIpv6
     *
     */
    @Test
    public void addIpv6Test() {
        AddIpv6Request addIpv6Request = new AddIpv6Request();
        addIpv6Request.setInstanceId("");
        addIpv6Request.setIpv6Address("");
        addIpv6Request.setReboot(false);
        AddIpv6Response response = bccClient.addIpv6(addIpv6Request);
        System.out.println(response);
    }
    /**
     * attachVolume
     *
     */
    @Test
    public void attachVolumeTest() {
        AttachVolumeRequest attachVolumeRequest = new AttachVolumeRequest();
        attachVolumeRequest.setVolumeId("");
        attachVolumeRequest.setInstanceId("");
        attachVolumeRequest.setDeleteWithInstance(false);
        attachVolumeRequest.setDeleteAutoSnapshot(false);
        AttachVolumeResponse response = bccClient.attachVolume(attachVolumeRequest);
        System.out.println(response);
    }
    /**
     * autoReleaseInstance
     *
     */
    @Test
    public void autoReleaseInstanceTest() {
        AutoReleaseInstanceRequest autoReleaseInstanceRequest = new AutoReleaseInstanceRequest();
        autoReleaseInstanceRequest.setInstanceId("");
        autoReleaseInstanceRequest.setIsEipAutoRelatedDelete(false);
        autoReleaseInstanceRequest.setReleaseTime("");
        bccClient.autoReleaseInstance(autoReleaseInstanceRequest);
    }
    /**
     * batchAddIp
     *
     */
    @Test
    public void batchAddIpTest() {
        BatchAddIpRequest batchAddIpRequest = new BatchAddIpRequest();
        batchAddIpRequest.setInstanceId("");
        batchAddIpRequest.setSecondaryPrivateIpAddressCount(0);
        batchAddIpRequest.setPrivateIps(new ArrayList<>());
        batchAddIpRequest.setAllocateMultiIpv6Addr(false);
        bccClient.batchAddIp(batchAddIpRequest);
    }
    /**
     * batchChangeToPostpaid
     *
     */
    @Test
    public void batchChangeToPostpaidTest() {
        BatchChangeToPostpaidRequest batchChangeToPostpaidRequest = new BatchChangeToPostpaidRequest();
        batchChangeToPostpaidRequest.setConfig(new ArrayList<>());
        BatchChangeToPostpaidResponse response = bccClient.batchChangeToPostpaid(batchChangeToPostpaidRequest);
        System.out.println(response);
    }
    /**
     * batchChangeToPrepaid
     *
     */
    @Test
    public void batchChangeToPrepaidTest() {
        BatchChangeToPrepaidRequest batchChangeToPrepaidRequest = new BatchChangeToPrepaidRequest();
        batchChangeToPrepaidRequest.setConfig(new ArrayList<>());
        BatchChangeToPrepaidResponse response = bccClient.batchChangeToPrepaid(batchChangeToPrepaidRequest);
        System.out.println(response);
    }
    /**
     * batchDeleteIp
     *
     */
    @Test
    public void batchDeleteIpTest() {
        BatchDeleteIpRequest batchDeleteIpRequest = new BatchDeleteIpRequest();
        batchDeleteIpRequest.setInstanceId("");
        batchDeleteIpRequest.setPrivateIps(new ArrayList<>());
        bccClient.batchDeleteIp(batchDeleteIpRequest);
    }
    /**
     * batchRefundResource
     *
     */
    @Test
    public void batchRefundResourceTest() {
        BatchRefundResourceRequest batchRefundResourceRequest = new BatchRefundResourceRequest();
        batchRefundResourceRequest.setInstanceIds(new ArrayList<>());
        batchRefundResourceRequest.setRelatedReleaseFlag(false);
        batchRefundResourceRequest.setDeleteCdsSnapshotFlag(false);
        batchRefundResourceRequest.setDeleteRelatedEnisFlag(false);
        BatchRefundResourceResponse response = bccClient.batchRefundResource(batchRefundResourceRequest);
        System.out.println(response);
    }
    /**
     * batchStartInstance
     *
     */
    @Test
    public void batchStartInstanceTest() {
        BatchStartInstanceRequest batchStartInstanceRequest = new BatchStartInstanceRequest();
        batchStartInstanceRequest.setInstanceIds(new ArrayList<>());
        bccClient.batchStartInstance(batchStartInstanceRequest);
    }
    /**
     * batchStopInstance
     *
     */
    @Test
    public void batchStopInstanceTest() {
        BatchStopInstanceRequest batchStopInstanceRequest = new BatchStopInstanceRequest();
        batchStopInstanceRequest.setInstanceIds(new ArrayList<>());
        batchStopInstanceRequest.setForceStop(false);
        batchStopInstanceRequest.setStopWithNoCharge(false);
        bccClient.batchStopInstance(batchStopInstanceRequest);
    }
    /**
     * bindInstanceToSecurityGroup
     *
     */
    @Test
    public void bindInstanceToSecurityGroupTest() {
        BindInstanceToSecurityGroupRequest bindInstanceToSecurityGroupRequest = new BindInstanceToSecurityGroupRequest();
        bindInstanceToSecurityGroupRequest.setInstanceId("");
        bindInstanceToSecurityGroupRequest.setSecurityGroupId("");
        bccClient.bindInstanceToSecurityGroup(bindInstanceToSecurityGroupRequest);
    }
    /**
     * bindInstanceToTags
     *
     */
    @Test
    public void bindInstanceToTagsTest() {
        BindInstanceToTagsRequest bindInstanceToTagsRequest = new BindInstanceToTagsRequest();
        bindInstanceToTagsRequest.setInstanceId("");
        bindInstanceToTagsRequest.setChangeTags(new ArrayList<>());
        bindInstanceToTagsRequest.setAttachRelatedResourceTag(false);
        bccClient.bindInstanceToTags(bindInstanceToTagsRequest);
    }
    /**
     * bindRole
     *
     */
    @Test
    public void bindRoleTest() {
        BindRoleRequest bindRoleRequest = new BindRoleRequest();
        bindRoleRequest.setRoleName("");
        bindRoleRequest.setInstances(new ArrayList<>());
        BindRoleResponse response = bccClient.bindRole(bindRoleRequest);
        System.out.println(response);
    }
    /**
     * bindTagImage
     *
     */
    @Test
    public void bindTagImageTest() {
        BindTagImageRequest bindTagImageRequest = new BindTagImageRequest();
        bindTagImageRequest.setImageId("");
        bindTagImageRequest.setChangeTags(new ArrayList<>());
        bccClient.bindTagImage(bindTagImageRequest);
    }
    /**
     * bindTagVolume
     *
     */
    @Test
    public void bindTagVolumeTest() {
        BindTagVolumeRequest bindTagVolumeRequest = new BindTagVolumeRequest();
        bindTagVolumeRequest.setVolumeId("");
        bindTagVolumeRequest.setChangeTags(new ArrayList<>());
        bccClient.bindTagVolume(bindTagVolumeRequest);
    }
    /**
     * cancelRemoteCopyImage
     *
     */
    @Test
    public void cancelRemoteCopyImageTest() {
        CancelRemoteCopyImageRequest cancelRemoteCopyImageRequest = new CancelRemoteCopyImageRequest();
        cancelRemoteCopyImageRequest.setImageId("");
        bccClient.cancelRemoteCopyImage(cancelRemoteCopyImageRequest);
    }
    /**
     * changeToPrepaid
     *
     */
    @Test
    public void changeToPrepaidTest() {
        ChangeToPrepaidRequest changeToPrepaidRequest = new ChangeToPrepaidRequest();
        changeToPrepaidRequest.setInstanceId("");
        changeToPrepaidRequest.setDuration(0);
        changeToPrepaidRequest.setAutoRenew(false);
        changeToPrepaidRequest.setAutoRenewPeriod(0);
        changeToPrepaidRequest.setRelationCds(false);
        ChangeToPrepaidResponse response = bccClient.changeToPrepaid(changeToPrepaidRequest);
        System.out.println(response);
    }
    /**
     * changeVpc
     *
     */
    @Test
    public void changeVpcTest() {
        ChangeVpcRequest changeVpcRequest = new ChangeVpcRequest();
        changeVpcRequest.setInstanceId("");
        changeVpcRequest.setSubnetId("");
        changeVpcRequest.setInternalIp("");
        changeVpcRequest.setSecurityGroupIds(new ArrayList<>());
        changeVpcRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        changeVpcRequest.setReboot(false);
        bccClient.changeVpc(changeVpcRequest);
    }
    /**
     * createAutoRenewRule
     *
     */
    @Test
    public void createAutoRenewRuleTest() {
        CreateAutoRenewRuleRequest createAutoRenewRuleRequest = new CreateAutoRenewRuleRequest();
        createAutoRenewRuleRequest.setInstanceId("");
        createAutoRenewRuleRequest.setRenewTimeUnit("");
        createAutoRenewRuleRequest.setRenewTime(0);
        createAutoRenewRuleRequest.setRenewEip(false);
        bccClient.createAutoRenewRule(createAutoRenewRuleRequest);
    }
    /**
     * createImage
     *
     */
    @Test
    public void createImageTest() {
        CreateImageRequest createImageRequest = new CreateImageRequest();
        createImageRequest.setImageName("");
        createImageRequest.setInstanceId("");
        createImageRequest.setSnapshotId("");
        createImageRequest.setEncryptKey("");
        createImageRequest.setRelateCds(false);
        createImageRequest.setDetection(false);
        CreateImageResponse response = bccClient.createImage(createImageRequest);
        System.out.println(response);
    }
    /**
     * createInstanceBySpec
     *
     */
    @Test
    public void createInstanceBySpecTest() {
        CreateInstanceBySpecRequest createInstanceBySpecRequest = new CreateInstanceBySpecRequest();
        createInstanceBySpecRequest.setKeepImageLogin(false);
        createInstanceBySpecRequest.setBccCreateWithScript("");
        createInstanceBySpecRequest.setName("");
        createInstanceBySpecRequest.setCpuThreadConfig("");
        createInstanceBySpecRequest.setNumaConfig("");
        createInstanceBySpecRequest.setEnableDeleteProtection(false);
        createInstanceBySpecRequest.setHostname("");
        createInstanceBySpecRequest.setAutoSeqSuffix(false);
        createInstanceBySpecRequest.setIsOpenHostnameDomain(false);
        createInstanceBySpecRequest.setAdminPass("");
        createInstanceBySpecRequest.setKeypairId("");
        createInstanceBySpecRequest.setAspId("");
        createInstanceBySpecRequest.setSpecId("");
        createInstanceBySpecRequest.setEnableJumboFrame(false);
        createInstanceBySpecRequest.setUserData("");
        createInstanceBySpecRequest.setDeletionProtection("");
        createInstanceBySpecRequest.setAutoRenewTimeUnit("");
        createInstanceBySpecRequest.setAutoRenewTime(0);
        createInstanceBySpecRequest.setHosteyeType("");
        createInstanceBySpecRequest.setEnableNuma(false);
        createInstanceBySpecRequest.setDataPartitionType("");
        createInstanceBySpecRequest.setRootPartitionType("");
        createInstanceBySpecRequest.setCdsAutoRenew(false);
        createInstanceBySpecRequest.setCreateCdsList(new ArrayList<>());
        createInstanceBySpecRequest.setImageId("");
        createInstanceBySpecRequest.setSpec("");
        createInstanceBySpecRequest.setRoleName("");
        createInstanceBySpecRequest.setBidModel("");
        createInstanceBySpecRequest.setBidPrice("");
        createInstanceBySpecRequest.setRootDiskSizeInGb(0);
        createInstanceBySpecRequest.setRootDiskExtraIo("");
        createInstanceBySpecRequest.setRootDiskStorageType("");
        createInstanceBySpecRequest.setNetworkCapacityInMbps(0);
        createInstanceBySpecRequest.setEhcClusterId("");
        createInstanceBySpecRequest.setPurchaseCount(0);
        createInstanceBySpecRequest.setPurchaseMinCount(0);
        createInstanceBySpecRequest.setDedicatedHostId("");
        createInstanceBySpecRequest.setRelationTag(false);
        createInstanceBySpecRequest.setTags(new ArrayList<>());
        createInstanceBySpecRequest.setFileSystems(new ArrayList<>());
        createInstanceBySpecRequest.setEphemeralDisks(new ArrayList<>());
        createInstanceBySpecRequest.setSecurityGroupId("");
        createInstanceBySpecRequest.setEnterpriseSecurityGroupId("");
        createInstanceBySpecRequest.setSecurityGroupIds(new ArrayList<>());
        createInstanceBySpecRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        createInstanceBySpecRequest.setSubnetId("");
        createInstanceBySpecRequest.setDeployId("");
        createInstanceBySpecRequest.setDeployIdList(new ArrayList<>());
        createInstanceBySpecRequest.setEniIds(new ArrayList<>());
        createInstanceBySpecRequest.setDisableRootDiskSerial("");
        createInstanceBySpecRequest.setZoneName("");
        createInstanceBySpecRequest.setInternalIps(new ArrayList<>());
        createInstanceBySpecRequest.setResGroupId("");
        createInstanceBySpecRequest.setIsEipAutoRelatedDelete(false);
        createInstanceBySpecRequest.setNetworkPurchaseType("");
        createInstanceBySpecRequest.setInstanceType("");
        createInstanceBySpecRequest.setInternetChargeType("");
        createInstanceBySpecRequest.setEipName("");
        createInstanceBySpecRequest.setIsOpenHostEye(false);
        createInstanceBySpecRequest.setEnableHt(false);
        createInstanceBySpecRequest.setBilling(null);
        createInstanceBySpecRequest.setIsOpenIpv6(false);
        CreateInstanceBySpecResponse response = bccClient.createInstanceBySpec(createInstanceBySpecRequest);
        System.out.println(response);
    }
    /**
     * createVolume
     *
     */
    @Test
    public void createVolumeTest() {
        CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest();
        createVolumeRequest.setZoneName("");
        createVolumeRequest.setStorageType("");
        createVolumeRequest.setCdsSizeInGB(0);
        createVolumeRequest.setCdsExtraIo(0);
        createVolumeRequest.setSnapshotId("");
        createVolumeRequest.setShareSnapshotId("");
        createVolumeRequest.setEnableDeleteProtection("");
        createVolumeRequest.setInstanceId("");
        createVolumeRequest.setEncryptKey("");
        createVolumeRequest.setName("");
        createVolumeRequest.setDescription("");
        createVolumeRequest.setRenewTimeUnit("");
        createVolumeRequest.setRenewTime(0);
        createVolumeRequest.setRelationTag(false);
        createVolumeRequest.setTags(new ArrayList<>());
        createVolumeRequest.setResGroupId("");
        createVolumeRequest.setBilling(null);
        createVolumeRequest.setClusterId("");
        createVolumeRequest.setChargeType("");
        createVolumeRequest.setAutoSnapshotPolicy(null);
        createVolumeRequest.setDeleteWithInstance(false);
        createVolumeRequest.setDeleteAutoSnapshot(false);
        createVolumeRequest.setPurchaseCount(0);
        CreateVolumeResponse response = bccClient.createVolume(createVolumeRequest);
        System.out.println(response);
    }
    /**
     * delIpv6
     *
     */
    @Test
    public void delIpv6Test() {
        DelIpv6Request delIpv6Request = new DelIpv6Request();
        delIpv6Request.setInstanceId("");
        delIpv6Request.setIpv6Address("");
        delIpv6Request.setReboot(false);
        bccClient.delIpv6(delIpv6Request);
    }
    /**
     * deleteAutoRenewRule
     *
     */
    @Test
    public void deleteAutoRenewRuleTest() {
        DeleteAutoRenewRuleRequest deleteAutoRenewRuleRequest = new DeleteAutoRenewRuleRequest();
        deleteAutoRenewRuleRequest.setInstanceId("");
        deleteAutoRenewRuleRequest.setRenewEip(false);
        bccClient.deleteAutoRenewRule(deleteAutoRenewRuleRequest);
    }
    /**
     * deleteImage
     *
     */
    @Test
    public void deleteImageTest() {
        DeleteImageRequest deleteImageRequest = new DeleteImageRequest();
        deleteImageRequest.setImageId("");
        bccClient.deleteImage(deleteImageRequest);
    }
    /**
     * deleteInstanceDeploySet
     *
     */
    @Test
    public void deleteInstanceDeploySetTest() {
        DeleteInstanceDeploySetRequest deleteInstanceDeploySetRequest = new DeleteInstanceDeploySetRequest();
        deleteInstanceDeploySetRequest.setDeployId("");
        deleteInstanceDeploySetRequest.setInstanceIdList(new ArrayList<>());
        bccClient.deleteInstanceDeploySet(deleteInstanceDeploySetRequest);
    }
    /**
     * deletePrepayInstance
     *
     */
    @Test
    public void deletePrepayInstanceTest() {
        DeletePrepayInstanceRequest deletePrepayInstanceRequest = new DeletePrepayInstanceRequest();
        deletePrepayInstanceRequest.setInstanceId("");
        deletePrepayInstanceRequest.setRelatedReleaseFlag(false);
        deletePrepayInstanceRequest.setDeleteCdsSnapshotFlag(false);
        deletePrepayInstanceRequest.setDeleteRelatedEnisFlag(false);
        DeletePrepayInstanceResponse response = bccClient.deletePrepayInstance(deletePrepayInstanceRequest);
        System.out.println(response);
    }
    /**
     * deleteRecycledInstance
     *
     */
    @Test
    public void deleteRecycledInstanceTest() {
        DeleteRecycledInstanceRequest deleteRecycledInstanceRequest = new DeleteRecycledInstanceRequest();
        deleteRecycledInstanceRequest.setInstanceId("");
        bccClient.deleteRecycledInstance(deleteRecycledInstanceRequest);
    }
    /**
     * detachVolume
     *
     */
    @Test
    public void detachVolumeTest() {
        DetachVolumeRequest detachVolumeRequest = new DetachVolumeRequest();
        detachVolumeRequest.setVolumeId("");
        detachVolumeRequest.setInstanceId("");
        bccClient.detachVolume(detachVolumeRequest);
    }
    /**
     * enterRescueMode
     *
     */
    @Test
    public void enterRescueModeTest() {
        EnterRescueModeRequest enterRescueModeRequest = new EnterRescueModeRequest();
        enterRescueModeRequest.setInstanceId("");
        enterRescueModeRequest.setForceStop(false);
        enterRescueModeRequest.setPassword("");
        EnterRescueModeResponse response = bccClient.enterRescueMode(enterRescueModeRequest);
        System.out.println(response);
    }
    /**
     * exitRescueMode
     *
     */
    @Test
    public void exitRescueModeTest() {
        ExitRescueModeRequest exitRescueModeRequest = new ExitRescueModeRequest();
        exitRescueModeRequest.setInstanceId("");
        ExitRescueModeResponse response = bccClient.exitRescueMode(exitRescueModeRequest);
        System.out.println(response);
    }
    /**
     * getAvailableImagesBySpec
     *
     */
    @Test
    public void getAvailableImagesBySpecTest() {
        GetAvailableImagesBySpecRequest getAvailableImagesBySpecRequest = new GetAvailableImagesBySpecRequest();
        getAvailableImagesBySpecRequest.setSpec("");
        getAvailableImagesBySpecRequest.setMarker("");
        getAvailableImagesBySpecRequest.setMaxKeys(0);
        getAvailableImagesBySpecRequest.setOsName("");
        GetAvailableImagesBySpecResponse response = bccClient.getAvailableImagesBySpec(getAvailableImagesBySpecRequest);
        System.out.println(response);
    }
    /**
     * getCdsPrice
     *
     */
    @Test
    public void getCdsPriceTest() {
        GetCdsPriceRequest getCdsPriceRequest = new GetCdsPriceRequest();
        getCdsPriceRequest.setStorageType("");
        getCdsPriceRequest.setCdsSizeInGB(0);
        getCdsPriceRequest.setPaymentTiming("");
        getCdsPriceRequest.setZoneName("");
        getCdsPriceRequest.setPurchaseCount(0);
        getCdsPriceRequest.setPurchaseLength(0);
        getCdsPriceRequest.setCdsExtraIo(0);
        GetCdsPriceResponse response = bccClient.getCdsPrice(getCdsPriceRequest);
        System.out.println(response);
    }
    /**
     * getDiskQuota
     *
     */
    @Test
    public void getDiskQuotaTest() {
        GetDiskQuotaRequest getDiskQuotaRequest = new GetDiskQuotaRequest();
        getDiskQuotaRequest.setZoneName("");
        GetDiskQuotaResponse response = bccClient.getDiskQuota(getDiskQuotaRequest);
        System.out.println(response);
    }
    /**
     * getImage
     *
     */
    @Test
    public void getImageTest() {
        GetImageRequest getImageRequest = new GetImageRequest();
        getImageRequest.setImageId("");
        GetImageResponse response = bccClient.getImage(getImageRequest);
        System.out.println(response);
    }
    /**
     * getInstance
     *
     */
    @Test
    public void getInstanceTest() {
        GetInstanceRequest getInstanceRequest = new GetInstanceRequest();
        getInstanceRequest.setInstanceId("");
        GetInstanceResponse response = bccClient.getInstance(getInstanceRequest);
        System.out.println(response);
    }
    /**
     * getInstanceNoChargeList
     *
     */
    @Test
    public void getInstanceNoChargeListTest() {
        GetInstanceNoChargeListRequest getInstanceNoChargeListRequest = new GetInstanceNoChargeListRequest();
        getInstanceNoChargeListRequest.setMarker("");
        getInstanceNoChargeListRequest.setMaxKeys(0);
        getInstanceNoChargeListRequest.setInternalIp("");
        getInstanceNoChargeListRequest.setKeypairId("");
        getInstanceNoChargeListRequest.setZoneName("");
        getInstanceNoChargeListRequest.setInstanceIds("");
        GetInstanceNoChargeListResponse response = bccClient.getInstanceNoChargeList(getInstanceNoChargeListRequest);
        System.out.println(response);
    }
    /**
     * getInstanceUserDataInfo
     *
     */
    @Test
    public void getInstanceUserDataInfoTest() {
        GetInstanceUserDataInfoRequest getInstanceUserDataInfoRequest = new GetInstanceUserDataInfoRequest();
        getInstanceUserDataInfoRequest.setInstanceId("");
        GetInstanceUserDataInfoResponse response = bccClient.getInstanceUserDataInfo(getInstanceUserDataInfoRequest);
        System.out.println(response);
    }
    /**
     * getInstanceVnc
     *
     */
    @Test
    public void getInstanceVncTest() {
        GetInstanceVncRequest getInstanceVncRequest = new GetInstanceVncRequest();
        getInstanceVncRequest.setInstanceId("");
        GetInstanceVncResponse response = bccClient.getInstanceVnc(getInstanceVncRequest);
        System.out.println(response);
    }
    /**
     * getRoleList
     *
     */
    @Test
    public void getRoleListTest() {
        GetRoleListResponse response = bccClient.getRoleList();
        System.out.println(response);
    }
    /**
     * getVolume
     *
     */
    @Test
    public void getVolumeTest() {
        GetVolumeRequest getVolumeRequest = new GetVolumeRequest();
        getVolumeRequest.setVolumeId("");
        GetVolumeResponse response = bccClient.getVolume(getVolumeRequest);
        System.out.println(response);
    }
    /**
     * getVolumeResizeProgress
     *
     */
    @Test
    public void getVolumeResizeProgressTest() {
        GetVolumeResizeProgressRequest getVolumeResizeProgressRequest = new GetVolumeResizeProgressRequest();
        getVolumeResizeProgressRequest.setVolumeId("");
        GetVolumeResizeProgressResponse response = bccClient.getVolumeResizeProgress(getVolumeResizeProgressRequest);
        System.out.println(response);
    }
    /**
     * importImage
     *
     */
    @Test
    public void importImageTest() {
        ImportImageRequest importImageRequest = new ImportImageRequest();
        importImageRequest.setOsName("");
        importImageRequest.setOsArch("");
        importImageRequest.setOsType("");
        importImageRequest.setOsVersion("");
        importImageRequest.setName("");
        importImageRequest.setBosUrl("");
        importImageRequest.setDetection(false);
        importImageRequest.setGenerationType("");
        ImportImageResponse response = bccClient.importImage(importImageRequest);
        System.out.println(response);
    }
    /**
     * instanceBatchResizeBySpec
     *
     */
    @Test
    public void instanceBatchResizeBySpecTest() {
        InstanceBatchResizeBySpecRequest instanceBatchResizeBySpecRequest = new InstanceBatchResizeBySpecRequest();
        instanceBatchResizeBySpecRequest.setSpec("");
        instanceBatchResizeBySpecRequest.setInstanceIdList(new ArrayList<>());
        instanceBatchResizeBySpecRequest.setEnableJumboFrame(false);
        instanceBatchResizeBySpecRequest.setSubnetId("");
        instanceBatchResizeBySpecRequest.setLogicalZone("");
        InstanceBatchResizeBySpecResponse response = bccClient.instanceBatchResizeBySpec(instanceBatchResizeBySpecRequest);
        System.out.println(response);
    }
    /**
     * instanceDeletionProtection
     *
     */
    @Test
    public void instanceDeletionProtectionTest() {
        InstanceDeletionProtectionRequest instanceDeletionProtectionRequest = new InstanceDeletionProtectionRequest();
        instanceDeletionProtectionRequest.setInstanceId("");
        instanceDeletionProtectionRequest.setDeletionProtection(0);
        bccClient.instanceDeletionProtection(instanceDeletionProtectionRequest);
    }
    /**
     * instanceRecovery
     *
     */
    @Test
    public void instanceRecoveryTest() {
        InstanceRecoveryRequest instanceRecoveryRequest = new InstanceRecoveryRequest();
        instanceRecoveryRequest.setInstanceIds(new ArrayList<>());
        bccClient.instanceRecovery(instanceRecoveryRequest);
    }
    /**
     * listAvailableResizeSpec
     *
     */
    @Test
    public void listAvailableResizeSpecTest() {
        ListAvailableResizeSpecRequest listAvailableResizeSpecRequest = new ListAvailableResizeSpecRequest();
        listAvailableResizeSpecRequest.setSpec("");
        listAvailableResizeSpecRequest.setSpecId("");
        listAvailableResizeSpecRequest.setZone("");
        listAvailableResizeSpecRequest.setInstanceIdList(new ArrayList<>());
        ListAvailableResizeSpecResponse response = bccClient.listAvailableResizeSpec(listAvailableResizeSpecRequest);
        System.out.println(response);
    }
    /**
     * listImages
     *
     */
    @Test
    public void listImagesTest() {
        ListImagesRequest listImagesRequest = new ListImagesRequest();
        listImagesRequest.setMarker("");
        listImagesRequest.setMaxKeys(0);
        listImagesRequest.setImageType("");
        listImagesRequest.setImageName("");
        ListImagesResponse response = bccClient.listImages(listImagesRequest);
        System.out.println(response);
    }
    /**
     * listInstanceByIds
     *
     */
    @Test
    public void listInstanceByIdsTest() {
        ListInstanceByIdsRequest listInstanceByIdsRequest = new ListInstanceByIdsRequest();
        listInstanceByIdsRequest.setMarker("");
        listInstanceByIdsRequest.setMaxKeys(0);
        listInstanceByIdsRequest.setInstanceIds(new ArrayList<>());
        ListInstanceByIdsResponse response = bccClient.listInstanceByIds(listInstanceByIdsRequest);
        System.out.println(response);
    }
    /**
     * listInstanceEnis
     *
     */
    @Test
    public void listInstanceEnisTest() {
        ListInstanceEnisRequest listInstanceEnisRequest = new ListInstanceEnisRequest();
        listInstanceEnisRequest.setInstanceId("");
        ListInstanceEnisResponse response = bccClient.listInstanceEnis(listInstanceEnisRequest);
        System.out.println(response);
    }
    /**
     * listInstances
     *
     */
    @Test
    public void listInstancesTest() {
        ListInstancesRequest listInstancesRequest = new ListInstancesRequest();
        listInstancesRequest.setMarker("");
        listInstancesRequest.setMaxKeys(0);
        listInstancesRequest.setInternalIp("");
        listInstancesRequest.setDedicatedHostId("");
        listInstancesRequest.setZoneName("");
        listInstancesRequest.setShowRdmaTopo("");
        listInstancesRequest.setInstanceIds("");
        listInstancesRequest.setInstanceNames("");
        listInstancesRequest.setFuzzyInstanceName("");
        listInstancesRequest.setVolumeIds("");
        listInstancesRequest.setDeploySetIds("");
        listInstancesRequest.setSecurityGroupIds("");
        listInstancesRequest.setPaymentTiming("");
        listInstancesRequest.setStatus("");
        listInstancesRequest.setTags("");
        listInstancesRequest.setVpcId("");
        listInstancesRequest.setPrivateIps("");
        listInstancesRequest.setEhcClusterId("");
        ListInstancesResponse response = bccClient.listInstances(listInstancesRequest);
        System.out.println(response);
    }
    /**
     * listOs
     *
     */
    @Test
    public void listOsTest() {
        ListOsRequest listOsRequest = new ListOsRequest();
        listOsRequest.setInstanceIds(new ArrayList<>());
        ListOsResponse response = bccClient.listOs(listOsRequest);
        System.out.println(response);
    }
    /**
     * listRecycleInstance
     *
     */
    @Test
    public void listRecycleInstanceTest() {
        ListRecycleInstanceRequest listRecycleInstanceRequest = new ListRecycleInstanceRequest();
        listRecycleInstanceRequest.setMarker("");
        listRecycleInstanceRequest.setMaxKeys(0);
        listRecycleInstanceRequest.setInstanceId("");
        listRecycleInstanceRequest.setName("");
        listRecycleInstanceRequest.setPaymentTiming("");
        listRecycleInstanceRequest.setRecycleBegin("");
        listRecycleInstanceRequest.setRecycleEnd("");
        ListRecycleInstanceResponse response = bccClient.listRecycleInstance(listRecycleInstanceRequest);
        System.out.println(response);
    }
    /**
     * listSharedUser
     *
     */
    @Test
    public void listSharedUserTest() {
        ListSharedUserRequest listSharedUserRequest = new ListSharedUserRequest();
        listSharedUserRequest.setImageId("");
        ListSharedUserResponse response = bccClient.listSharedUser(listSharedUserRequest);
        System.out.println(response);
    }
    /**
     * listVolumes
     *
     */
    @Test
    public void listVolumesTest() {
        ListVolumesRequest listVolumesRequest = new ListVolumesRequest();
        listVolumesRequest.setMarker("");
        listVolumesRequest.setMaxKeys(0);
        listVolumesRequest.setInstanceId("");
        listVolumesRequest.setZoneName("");
        listVolumesRequest.setClusterId("");
        listVolumesRequest.setChargeFilter("");
        listVolumesRequest.setUsageFilter("");
        listVolumesRequest.setName("");
        listVolumesRequest.setProductCategory("");
        ListVolumesResponse response = bccClient.listVolumes(listVolumesRequest);
        System.out.println(response);
    }
    /**
     * modifyCdsAttribute
     *
     */
    @Test
    public void modifyCdsAttributeTest() {
        ModifyCdsAttributeRequest modifyCdsAttributeRequest = new ModifyCdsAttributeRequest();
        modifyCdsAttributeRequest.setVolumeId("");
        modifyCdsAttributeRequest.setCdsName("");
        modifyCdsAttributeRequest.setDesc("");
        modifyCdsAttributeRequest.setDeleteWithInstance(false);
        modifyCdsAttributeRequest.setDeleteAutoSnapshot(false);
        bccClient.modifyCdsAttribute(modifyCdsAttributeRequest);
    }
    /**
     * modifyInstanceAttributes
     *
     */
    @Test
    public void modifyInstanceAttributesTest() {
        ModifyInstanceAttributesRequest modifyInstanceAttributesRequest = new ModifyInstanceAttributesRequest();
        modifyInstanceAttributesRequest.setInstanceId("");
        modifyInstanceAttributesRequest.setName("");
        modifyInstanceAttributesRequest.setEnableJumboFrame(false);
        modifyInstanceAttributesRequest.setNetEthQueueCount("");
        bccClient.modifyInstanceAttributes(modifyInstanceAttributesRequest);
    }
    /**
     * modifyInstanceDesc
     *
     */
    @Test
    public void modifyInstanceDescTest() {
        ModifyInstanceDescRequest modifyInstanceDescRequest = new ModifyInstanceDescRequest();
        modifyInstanceDescRequest.setInstanceId("");
        modifyInstanceDescRequest.setDesc("");
        bccClient.modifyInstanceDesc(modifyInstanceDescRequest);
    }
    /**
     * modifyInstanceHostname
     *
     */
    @Test
    public void modifyInstanceHostnameTest() {
        ModifyInstanceHostnameRequest modifyInstanceHostnameRequest = new ModifyInstanceHostnameRequest();
        modifyInstanceHostnameRequest.setInstanceId("");
        modifyInstanceHostnameRequest.setReboot(false);
        modifyInstanceHostnameRequest.setIsOpenHostnameDomain(false);
        modifyInstanceHostnameRequest.setHostname("");
        modifyInstanceHostnameRequest.setIsAllowHostnameRepeat(false);
        bccClient.modifyInstanceHostname(modifyInstanceHostnameRequest);
    }
    /**
     * modifyInstancePassword
     *
     */
    @Test
    public void modifyInstancePasswordTest() {
        ModifyInstancePasswordRequest modifyInstancePasswordRequest = new ModifyInstancePasswordRequest();
        modifyInstancePasswordRequest.setInstanceId("");
        modifyInstancePasswordRequest.setAdminPass("");
        bccClient.modifyInstancePassword(modifyInstancePasswordRequest);
    }
    /**
     * modifyRelatedDeletePolicy
     *
     */
    @Test
    public void modifyRelatedDeletePolicyTest() {
        ModifyRelatedDeletePolicyRequest modifyRelatedDeletePolicyRequest = new ModifyRelatedDeletePolicyRequest();
        modifyRelatedDeletePolicyRequest.setInstanceId("");
        modifyRelatedDeletePolicyRequest.setIsEipAutoRelatedDelete(false);
        bccClient.modifyRelatedDeletePolicy(modifyRelatedDeletePolicyRequest);
    }
    /**
     * modifyVolumeChargeType
     *
     */
    @Test
    public void modifyVolumeChargeTypeTest() {
        ModifyVolumeChargeTypeRequest modifyVolumeChargeTypeRequest = new ModifyVolumeChargeTypeRequest();
        modifyVolumeChargeTypeRequest.setVolumeId("");
        modifyVolumeChargeTypeRequest.setBilling(null);
        modifyVolumeChargeTypeRequest.setEffectiveType("");
        bccClient.modifyVolumeChargeType(modifyVolumeChargeTypeRequest);
    }
    /**
     * purchaseReservedInstance
     *
     */
    @Test
    public void purchaseReservedInstanceTest() {
        PurchaseReservedInstanceRequest purchaseReservedInstanceRequest = new PurchaseReservedInstanceRequest();
        purchaseReservedInstanceRequest.setInstanceId("");
        purchaseReservedInstanceRequest.setRelatedRenewFlag("");
        purchaseReservedInstanceRequest.setBilling(null);
        purchaseReservedInstanceRequest.setCdsCustomPeriod(new ArrayList<>());
        PurchaseReservedInstanceResponse response = bccClient.purchaseReservedInstance(purchaseReservedInstanceRequest);
        System.out.println(response);
    }
    /**
     * purchaseReservedVolume
     *
     */
    @Test
    public void purchaseReservedVolumeTest() {
        PurchaseReservedVolumeRequest purchaseReservedVolumeRequest = new PurchaseReservedVolumeRequest();
        purchaseReservedVolumeRequest.setVolumeId("");
        purchaseReservedVolumeRequest.setBilling(null);
        purchaseReservedVolumeRequest.setInstanceId("");
        PurchaseReservedVolumeResponse response = bccClient.purchaseReservedVolume(purchaseReservedVolumeRequest);
        System.out.println(response);
    }
    /**
     * rebootInstance
     *
     */
    @Test
    public void rebootInstanceTest() {
        RebootInstanceRequest rebootInstanceRequest = new RebootInstanceRequest();
        rebootInstanceRequest.setInstanceId("");
        rebootInstanceRequest.setForceStop(false);
        bccClient.rebootInstance(rebootInstanceRequest);
    }
    /**
     * rebuildBatchInstance
     *
     */
    @Test
    public void rebuildBatchInstanceTest() {
        RebuildBatchInstanceRequest rebuildBatchInstanceRequest = new RebuildBatchInstanceRequest();
        rebuildBatchInstanceRequest.setImageId("");
        rebuildBatchInstanceRequest.setKeepImageLogin(false);
        rebuildBatchInstanceRequest.setIsPreserveData(false);
        rebuildBatchInstanceRequest.setAdminPass("");
        rebuildBatchInstanceRequest.setIsOpenHostEye(false);
        rebuildBatchInstanceRequest.setSysRootSize(0);
        rebuildBatchInstanceRequest.setKeypairId("");
        rebuildBatchInstanceRequest.setDataPartitionType("");
        rebuildBatchInstanceRequest.setRootPartitionType("");
        rebuildBatchInstanceRequest.setRaidId("");
        rebuildBatchInstanceRequest.setUserData("");
        rebuildBatchInstanceRequest.setUseLastUserData(false);
        rebuildBatchInstanceRequest.setCleanLastUserData(false);
        rebuildBatchInstanceRequest.setInstanceIds(new ArrayList<>());
        bccClient.rebuildBatchInstance(rebuildBatchInstanceRequest);
    }
    /**
     * rebuildInstance
     *
     */
    @Test
    public void rebuildInstanceTest() {
        RebuildInstanceRequest rebuildInstanceRequest = new RebuildInstanceRequest();
        rebuildInstanceRequest.setInstanceId("");
        rebuildInstanceRequest.setImageId("");
        rebuildInstanceRequest.setKeepImageLogin(false);
        rebuildInstanceRequest.setIsPreserveData(false);
        rebuildInstanceRequest.setAdminPass("");
        rebuildInstanceRequest.setIsOpenHostEye(false);
        rebuildInstanceRequest.setSysRootSize(0);
        rebuildInstanceRequest.setKeypairId("");
        rebuildInstanceRequest.setDataPartitionType("");
        rebuildInstanceRequest.setRootPartitionType("");
        rebuildInstanceRequest.setRaidId("");
        rebuildInstanceRequest.setUserData("");
        rebuildInstanceRequest.setUseLastUserData(false);
        rebuildInstanceRequest.setCleanLastUserData(false);
        bccClient.rebuildInstance(rebuildInstanceRequest);
    }
    /**
     * releaseInstanceByPost
     *
     */
    @Test
    public void releaseInstanceByPostTest() {
        ReleaseInstanceByPostRequest releaseInstanceByPostRequest = new ReleaseInstanceByPostRequest();
        releaseInstanceByPostRequest.setInstanceId("");
        releaseInstanceByPostRequest.setRelatedReleaseFlag(false);
        releaseInstanceByPostRequest.setDeleteCdsSnapshotFlag(false);
        releaseInstanceByPostRequest.setDeleteRelatedEnisFlag(false);
        releaseInstanceByPostRequest.setBccRecycleFlag(false);
        releaseInstanceByPostRequest.setCdsAttributeActive(false);
        bccClient.releaseInstanceByPost(releaseInstanceByPostRequest);
    }
    /**
     * releaseMultipleInstanceByPost
     *
     */
    @Test
    public void releaseMultipleInstanceByPostTest() {
        ReleaseMultipleInstanceByPostRequest releaseMultipleInstanceByPostRequest = new ReleaseMultipleInstanceByPostRequest();
        releaseMultipleInstanceByPostRequest.setInstanceIds(new ArrayList<>());
        releaseMultipleInstanceByPostRequest.setRelatedReleaseFlag(false);
        releaseMultipleInstanceByPostRequest.setDeleteRelatedCdsFlag(false);
        releaseMultipleInstanceByPostRequest.setDeleteCdsSnapshotFlag(false);
        releaseMultipleInstanceByPostRequest.setDeleteRelatedEnisFlag(false);
        releaseMultipleInstanceByPostRequest.setBccRecycleFlag(false);
        bccClient.releaseMultipleInstanceByPost(releaseMultipleInstanceByPostRequest);
    }
    /**
     * releaseVolume
     *
     */
    @Test
    public void releaseVolumeTest() {
        ReleaseVolumeRequest releaseVolumeRequest = new ReleaseVolumeRequest();
        releaseVolumeRequest.setVolumeId("");
        releaseVolumeRequest.setAutoSnapshot("");
        releaseVolumeRequest.setManualSnapshot("");
        releaseVolumeRequest.setCdsAttributeActive(false);
        releaseVolumeRequest.setRecycle("");
        bccClient.releaseVolume(releaseVolumeRequest);
    }
    /**
     * remoteCopyImage
     *
     */
    @Test
    public void remoteCopyImageTest() {
        RemoteCopyImageRequest remoteCopyImageRequest = new RemoteCopyImageRequest();
        remoteCopyImageRequest.setImageId("");
        remoteCopyImageRequest.setName("");
        remoteCopyImageRequest.setDestRegion(new ArrayList<>());
        RemoteCopyImageResponse response = bccClient.remoteCopyImage(remoteCopyImageRequest);
        System.out.println(response);
    }
    /**
     * renameImage
     *
     */
    @Test
    public void renameImageTest() {
        RenameImageRequest renameImageRequest = new RenameImageRequest();
        renameImageRequest.setImageIds(new ArrayList<>());
        renameImageRequest.setName("");
        bccClient.renameImage(renameImageRequest);
    }
    /**
     * renameVolume
     *
     */
    @Test
    public void renameVolumeTest() {
        RenameVolumeRequest renameVolumeRequest = new RenameVolumeRequest();
        renameVolumeRequest.setVolumeId("");
        renameVolumeRequest.setName("");
        bccClient.renameVolume(renameVolumeRequest);
    }
    /**
     * resizeInstanceBySpec
     *
     */
    @Test
    public void resizeInstanceBySpecTest() {
        ResizeInstanceBySpecRequest resizeInstanceBySpecRequest = new ResizeInstanceBySpecRequest();
        resizeInstanceBySpecRequest.setInstanceId("");
        resizeInstanceBySpecRequest.setAction("");
        resizeInstanceBySpecRequest.setSpec("");
        resizeInstanceBySpecRequest.setEnableJumboFrame(false);
        bccClient.resizeInstanceBySpec(resizeInstanceBySpecRequest);
    }
    /**
     * resizeVolume
     *
     */
    @Test
    public void resizeVolumeTest() {
        ResizeVolumeRequest resizeVolumeRequest = new ResizeVolumeRequest();
        resizeVolumeRequest.setVolumeId("");
        resizeVolumeRequest.setNewCdsSizeInGB(0);
        resizeVolumeRequest.setNewExtraIO(0);
        resizeVolumeRequest.setNewVolumeType("");
        ResizeVolumeResponse response = bccClient.resizeVolume(resizeVolumeRequest);
        System.out.println(response);
    }
    /**
     * rollbackVolume
     *
     */
    @Test
    public void rollbackVolumeTest() {
        RollbackVolumeRequest rollbackVolumeRequest = new RollbackVolumeRequest();
        rollbackVolumeRequest.setVolumeId("");
        rollbackVolumeRequest.setSnapshotId("");
        bccClient.rollbackVolume(rollbackVolumeRequest);
    }
    /**
     * shareImage
     *
     */
    @Test
    public void shareImageTest() {
        ShareImageRequest shareImageRequest = new ShareImageRequest();
        shareImageRequest.setImageId("");
        shareImageRequest.setAccount("");
        shareImageRequest.setAccountId("");
        shareImageRequest.setUcAccount("");
        bccClient.shareImage(shareImageRequest);
    }
    /**
     * startInstance
     *
     */
    @Test
    public void startInstanceTest() {
        StartInstanceRequest startInstanceRequest = new StartInstanceRequest();
        startInstanceRequest.setInstanceId("");
        bccClient.startInstance(startInstanceRequest);
    }
    /**
     * stopInstance
     *
     */
    @Test
    public void stopInstanceTest() {
        StopInstanceRequest stopInstanceRequest = new StopInstanceRequest();
        stopInstanceRequest.setInstanceId("");
        stopInstanceRequest.setForceStop(false);
        stopInstanceRequest.setStopWithNoCharge(false);
        bccClient.stopInstance(stopInstanceRequest);
    }
    /**
     * unShareImage
     *
     */
    @Test
    public void unShareImageTest() {
        UnShareImageRequest unShareImageRequest = new UnShareImageRequest();
        unShareImageRequest.setImageId("");
        unShareImageRequest.setAccount("");
        unShareImageRequest.setAccountId("");
        unShareImageRequest.setUcAccount("");
        bccClient.unShareImage(unShareImageRequest);
    }
    /**
     * unbindInstanceFromSecurityGroup
     *
     */
    @Test
    public void unbindInstanceFromSecurityGroupTest() {
        UnbindInstanceFromSecurityGroupRequest unbindInstanceFromSecurityGroupRequest = new UnbindInstanceFromSecurityGroupRequest();
        unbindInstanceFromSecurityGroupRequest.setInstanceId("");
        unbindInstanceFromSecurityGroupRequest.setSecurityGroupId("");
        bccClient.unbindInstanceFromSecurityGroup(unbindInstanceFromSecurityGroupRequest);
    }
    /**
     * unbindInstanceFromTags
     *
     */
    @Test
    public void unbindInstanceFromTagsTest() {
        UnbindInstanceFromTagsRequest unbindInstanceFromTagsRequest = new UnbindInstanceFromTagsRequest();
        unbindInstanceFromTagsRequest.setInstanceId("");
        unbindInstanceFromTagsRequest.setChangeTags(new ArrayList<>());
        unbindInstanceFromTagsRequest.setAttachRelatedResourceTag(false);
        bccClient.unbindInstanceFromTags(unbindInstanceFromTagsRequest);
    }
    /**
     * unbindRole
     *
     */
    @Test
    public void unbindRoleTest() {
        UnbindRoleRequest unbindRoleRequest = new UnbindRoleRequest();
        unbindRoleRequest.setRoleName("");
        unbindRoleRequest.setInstances(new ArrayList<>());
        UnbindRoleResponse response = bccClient.unbindRole(unbindRoleRequest);
        System.out.println(response);
    }
    /**
     * unbindTagImage
     *
     */
    @Test
    public void unbindTagImageTest() {
        UnbindTagImageRequest unbindTagImageRequest = new UnbindTagImageRequest();
        unbindTagImageRequest.setImageId("");
        unbindTagImageRequest.setChangeTags(new ArrayList<>());
        bccClient.unbindTagImage(unbindTagImageRequest);
    }
    /**
     * unbindTagVolume
     *
     */
    @Test
    public void unbindTagVolumeTest() {
        UnbindTagVolumeRequest unbindTagVolumeRequest = new UnbindTagVolumeRequest();
        unbindTagVolumeRequest.setVolumeId("");
        unbindTagVolumeRequest.setChangeTags(new ArrayList<>());
        bccClient.unbindTagVolume(unbindTagVolumeRequest);
    }
    /**
     * updateInstanceSubnet
     *
     */
    @Test
    public void updateInstanceSubnetTest() {
        UpdateInstanceSubnetRequest updateInstanceSubnetRequest = new UpdateInstanceSubnetRequest();
        updateInstanceSubnetRequest.setInstanceId("");
        updateInstanceSubnetRequest.setSubnetId("");
        updateInstanceSubnetRequest.setInternalIp("");
        updateInstanceSubnetRequest.setSecurityGroupIds(new ArrayList<>());
        updateInstanceSubnetRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        bccClient.updateInstanceSubnet(updateInstanceSubnetRequest);
    }
}
