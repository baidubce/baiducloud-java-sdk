package com.baidubce.bcc;

import com.baidubce.bcc.models.AcceptReservedInstanceTransferRequest;
import com.baidubce.bcc.models.AddIpv6Request;
import com.baidubce.bcc.models.AddIpv6Response;
import com.baidubce.bcc.models.AttachAspRequest;
import com.baidubce.bcc.models.AttachKeypairRequest;
import com.baidubce.bcc.models.AttachVolumeRequest;
import com.baidubce.bcc.models.AttachVolumeResponse;
import com.baidubce.bcc.models.AuthorizeSecurityGroupRuleRequest;
import com.baidubce.bcc.models.AuthorizeServerEventRequest;
import com.baidubce.bcc.models.AuthorizeServerEventResponse;
import com.baidubce.bcc.models.AutoReleaseInstanceRequest;
import com.baidubce.bcc.models.AutoRenewReservedInstanceRequest;
import com.baidubce.bcc.models.AutoRenewReservedInstanceResponse;
import com.baidubce.bcc.models.AutoRenewVolumeClusterRequest;
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
import com.baidubce.bcc.models.BindInstanceSecurityGroupRequest;
import com.baidubce.bcc.models.BindInstanceSecurityGroupResponse;
import com.baidubce.bcc.models.BindInstanceToSecurityGroupRequest;
import com.baidubce.bcc.models.BindInstanceToTagsRequest;
import com.baidubce.bcc.models.BindReservedInstanceToTagsRequest;
import com.baidubce.bcc.models.BindRoleRequest;
import com.baidubce.bcc.models.BindRoleResponse;
import com.baidubce.bcc.models.BindTagImageRequest;
import com.baidubce.bcc.models.BindTagSnapchainRequest;
import com.baidubce.bcc.models.BindTagVolumeClusterRequest;
import com.baidubce.bcc.models.BindTagVolumeRequest;
import com.baidubce.bcc.models.CancelAutoRenewReservedInstanceRequest;
import com.baidubce.bcc.models.CancelAutoRenewReservedInstanceResponse;
import com.baidubce.bcc.models.CancelAutoRenewVolumeClusterRequest;
import com.baidubce.bcc.models.CancelBidOrderRequest;
import com.baidubce.bcc.models.CancelBidOrderResponse;
import com.baidubce.bcc.models.CancelRemoteCopyImageRequest;
import com.baidubce.bcc.models.CancelSnapshotShareRequest;
import com.baidubce.bcc.models.CancelSnapshotShareResponse;
import com.baidubce.bcc.models.ChangeToPrepaidRequest;
import com.baidubce.bcc.models.ChangeToPrepaidResponse;
import com.baidubce.bcc.models.ChangeVpcRequest;
import com.baidubce.bcc.models.CheckServerEventRequest;
import com.baidubce.bcc.models.CheckServerEventResponse;
import com.baidubce.bcc.models.CreateAspRequest;
import com.baidubce.bcc.models.CreateAspResponse;
import com.baidubce.bcc.models.CreateAuthorizationRuleRequest;
import com.baidubce.bcc.models.CreateAuthorizationRuleResponse;
import com.baidubce.bcc.models.CreateAutoRenewRuleRequest;
import com.baidubce.bcc.models.CreateBidInstanceRequest;
import com.baidubce.bcc.models.CreateBidInstanceResponse;
import com.baidubce.bcc.models.CreateDeploySetRequest;
import com.baidubce.bcc.models.CreateDeploySetResponse;
import com.baidubce.bcc.models.CreateEhcClusterRequest;
import com.baidubce.bcc.models.CreateEhcClusterResponse;
import com.baidubce.bcc.models.CreateImageRequest;
import com.baidubce.bcc.models.CreateImageResponse;
import com.baidubce.bcc.models.CreateInstanceBySpecRequest;
import com.baidubce.bcc.models.CreateInstanceBySpecResponse;
import com.baidubce.bcc.models.CreateKeypairRequest;
import com.baidubce.bcc.models.CreateKeypairResponse;
import com.baidubce.bcc.models.CreateReservedInstanceTransferRequest;
import com.baidubce.bcc.models.CreateReservedInstancesRequest;
import com.baidubce.bcc.models.CreateReservedInstancesResponse;
import com.baidubce.bcc.models.CreateSecurityGroupRequest;
import com.baidubce.bcc.models.CreateSecurityGroupResponse;
import com.baidubce.bcc.models.CreateSnapshotRequest;
import com.baidubce.bcc.models.CreateSnapshotResponse;
import com.baidubce.bcc.models.CreateSnapshotShareRequest;
import com.baidubce.bcc.models.CreateSnapshotShareResponse;
import com.baidubce.bcc.models.CreateVolumeClusterRequest;
import com.baidubce.bcc.models.CreateVolumeClusterResponse;
import com.baidubce.bcc.models.CreateVolumeRequest;
import com.baidubce.bcc.models.CreateVolumeResponse;
import com.baidubce.bcc.models.DelIpv6Request;
import com.baidubce.bcc.models.DeleteAspRequest;
import com.baidubce.bcc.models.DeleteAutoRenewRuleRequest;
import com.baidubce.bcc.models.DeleteDeploySetRequest;
import com.baidubce.bcc.models.DeleteEhcClusterRequest;
import com.baidubce.bcc.models.DeleteImageRequest;
import com.baidubce.bcc.models.DeleteInstUserOpAuthorizeRuleRequest;
import com.baidubce.bcc.models.DeleteInstUserOpAuthorizeRuleResponse;
import com.baidubce.bcc.models.DeleteInstanceDeploySetRequest;
import com.baidubce.bcc.models.DeleteKeypairRequest;
import com.baidubce.bcc.models.DeletePrepayInstanceRequest;
import com.baidubce.bcc.models.DeletePrepayInstanceResponse;
import com.baidubce.bcc.models.DeleteRecycledInstanceRequest;
import com.baidubce.bcc.models.DeleteSecurityGroupRequest;
import com.baidubce.bcc.models.DeleteSecurityGroupRuleRequest;
import com.baidubce.bcc.models.DeleteSnapshotRequest;
import com.baidubce.bcc.models.DeletesInstanceDeploySetRequest;
import com.baidubce.bcc.models.DescribeAuthorizeRulesRequest;
import com.baidubce.bcc.models.DescribeAuthorizeRulesResponse;
import com.baidubce.bcc.models.DescribePlannedEventRecordsRequest;
import com.baidubce.bcc.models.DescribePlannedEventRecordsResponse;
import com.baidubce.bcc.models.DescribePlannedEventsRequest;
import com.baidubce.bcc.models.DescribePlannedEventsResponse;
import com.baidubce.bcc.models.DescribeRegionsRequest;
import com.baidubce.bcc.models.DescribeRegionsResponse;
import com.baidubce.bcc.models.DescribeSnapshotsUsageRequest;
import com.baidubce.bcc.models.DescribeSnapshotsUsageResponse;
import com.baidubce.bcc.models.DescribeUnplannedEventRecordsRequest;
import com.baidubce.bcc.models.DescribeUnplannedEventRecordsResponse;
import com.baidubce.bcc.models.DescribeUnplannedEventsRequest;
import com.baidubce.bcc.models.DescribeUnplannedEventsResponse;
import com.baidubce.bcc.models.DetachAspRequest;
import com.baidubce.bcc.models.DetachKeypairRequest;
import com.baidubce.bcc.models.DetachVolumeRequest;
import com.baidubce.bcc.models.EhcClusterListRequest;
import com.baidubce.bcc.models.EhcClusterListResponse;
import com.baidubce.bcc.models.EnterRescueModeRequest;
import com.baidubce.bcc.models.EnterRescueModeResponse;
import com.baidubce.bcc.models.ExitRescueModeRequest;
import com.baidubce.bcc.models.ExitRescueModeResponse;
import com.baidubce.bcc.models.GetAspRequest;
import com.baidubce.bcc.models.GetAspResponse;
import com.baidubce.bcc.models.GetAvailableImagesBySpecRequest;
import com.baidubce.bcc.models.GetAvailableImagesBySpecResponse;
import com.baidubce.bcc.models.GetBidInstancePriceRequest;
import com.baidubce.bcc.models.GetBidInstancePriceResponse;
import com.baidubce.bcc.models.GetCdsPriceRequest;
import com.baidubce.bcc.models.GetCdsPriceResponse;
import com.baidubce.bcc.models.GetDeploySetRequest;
import com.baidubce.bcc.models.GetDeploySetResponse;
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
import com.baidubce.bcc.models.GetPriceBySpecRequest;
import com.baidubce.bcc.models.GetPriceBySpecResponse;
import com.baidubce.bcc.models.GetReservedInstancePriceRequest;
import com.baidubce.bcc.models.GetReservedInstancePriceResponse;
import com.baidubce.bcc.models.GetReservedInstanceRequest;
import com.baidubce.bcc.models.GetReservedInstanceResponse;
import com.baidubce.bcc.models.GetRoleListResponse;
import com.baidubce.bcc.models.GetSnapshotRequest;
import com.baidubce.bcc.models.GetSnapshotResponse;
import com.baidubce.bcc.models.GetTaskRequest;
import com.baidubce.bcc.models.GetTaskResponse;
import com.baidubce.bcc.models.GetVolumeClusterRequest;
import com.baidubce.bcc.models.GetVolumeClusterResponse;
import com.baidubce.bcc.models.GetVolumeRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressResponse;
import com.baidubce.bcc.models.GetVolumeResponse;
import com.baidubce.bcc.models.GetZoneBySpecRequest;
import com.baidubce.bcc.models.GetZoneBySpecResponse;
import com.baidubce.bcc.models.ImportImageRequest;
import com.baidubce.bcc.models.ImportImageResponse;
import com.baidubce.bcc.models.ImportKeypairRequest;
import com.baidubce.bcc.models.ImportKeypairResponse;
import com.baidubce.bcc.models.InstanceBatchResizeBySpecRequest;
import com.baidubce.bcc.models.InstanceBatchResizeBySpecResponse;
import com.baidubce.bcc.models.InstanceDeletionProtectionRequest;
import com.baidubce.bcc.models.InstanceRecoveryRequest;
import com.baidubce.bcc.models.KeypairDetailRequest;
import com.baidubce.bcc.models.KeypairDetailResponse;
import com.baidubce.bcc.models.ListAspsRequest;
import com.baidubce.bcc.models.ListAspsResponse;
import com.baidubce.bcc.models.ListAvailableResizeSpecRequest;
import com.baidubce.bcc.models.ListAvailableResizeSpecResponse;
import com.baidubce.bcc.models.ListBidFlavorResponse;
import com.baidubce.bcc.models.ListDeploySetResponse;
import com.baidubce.bcc.models.ListFlavorSpecRequest;
import com.baidubce.bcc.models.ListFlavorSpecResponse;
import com.baidubce.bcc.models.ListImagesRequest;
import com.baidubce.bcc.models.ListImagesResponse;
import com.baidubce.bcc.models.ListInstanceByIdsRequest;
import com.baidubce.bcc.models.ListInstanceByIdsResponse;
import com.baidubce.bcc.models.ListInstanceEnisRequest;
import com.baidubce.bcc.models.ListInstanceEnisResponse;
import com.baidubce.bcc.models.ListInstancesRequest;
import com.baidubce.bcc.models.ListInstancesResponse;
import com.baidubce.bcc.models.ListKeypairRequest;
import com.baidubce.bcc.models.ListKeypairResponse;
import com.baidubce.bcc.models.ListOsRequest;
import com.baidubce.bcc.models.ListOsResponse;
import com.baidubce.bcc.models.ListRecycleInstanceRequest;
import com.baidubce.bcc.models.ListRecycleInstanceResponse;
import com.baidubce.bcc.models.ListReservedInstanceTransferInRequest;
import com.baidubce.bcc.models.ListReservedInstanceTransferInResponse;
import com.baidubce.bcc.models.ListReservedInstanceTransferOutRequest;
import com.baidubce.bcc.models.ListReservedInstanceTransferOutResponse;
import com.baidubce.bcc.models.ListSecurityGroupsRequest;
import com.baidubce.bcc.models.ListSecurityGroupsResponse;
import com.baidubce.bcc.models.ListSharedUserRequest;
import com.baidubce.bcc.models.ListSharedUserResponse;
import com.baidubce.bcc.models.ListSnapchainRequest;
import com.baidubce.bcc.models.ListSnapchainResponse;
import com.baidubce.bcc.models.ListSnapshotShareRequest;
import com.baidubce.bcc.models.ListSnapshotShareResponse;
import com.baidubce.bcc.models.ListSnapshotsRequest;
import com.baidubce.bcc.models.ListSnapshotsResponse;
import com.baidubce.bcc.models.ListTaskRequest;
import com.baidubce.bcc.models.ListTaskResponse;
import com.baidubce.bcc.models.ListVolumeClustersRequest;
import com.baidubce.bcc.models.ListVolumeClustersResponse;
import com.baidubce.bcc.models.ListVolumesRequest;
import com.baidubce.bcc.models.ListVolumesResponse;
import com.baidubce.bcc.models.ListZonesResponse;
import com.baidubce.bcc.models.ModifyCdsAttributeRequest;
import com.baidubce.bcc.models.ModifyEhcClusterRequest;
import com.baidubce.bcc.models.ModifyInstUserOpAuthorizeRuleAttributeRequest;
import com.baidubce.bcc.models.ModifyInstUserOpAuthorizeRuleAttributeResponse;
import com.baidubce.bcc.models.ModifyInstanceAttributesRequest;
import com.baidubce.bcc.models.ModifyInstanceDescRequest;
import com.baidubce.bcc.models.ModifyInstanceHostnameRequest;
import com.baidubce.bcc.models.ModifyInstancePasswordRequest;
import com.baidubce.bcc.models.ModifyRelatedDeletePolicyRequest;
import com.baidubce.bcc.models.ModifyReservedInstancesRequest;
import com.baidubce.bcc.models.ModifyReservedInstancesResponse;
import com.baidubce.bcc.models.ModifySnapshotAttributeRequest;
import com.baidubce.bcc.models.ModifyVolumeChargeTypeRequest;
import com.baidubce.bcc.models.ModifyVolumeDeleteProtectionV2Request;
import com.baidubce.bcc.models.PurchaseReservedInstanceRequest;
import com.baidubce.bcc.models.PurchaseReservedInstanceResponse;
import com.baidubce.bcc.models.PurchaseReservedVolumeClusterRequest;
import com.baidubce.bcc.models.PurchaseReservedVolumeClusterResponse;
import com.baidubce.bcc.models.PurchaseReservedVolumeRequest;
import com.baidubce.bcc.models.PurchaseReservedVolumeResponse;
import com.baidubce.bcc.models.RebootInstanceRequest;
import com.baidubce.bcc.models.RebuildBatchInstanceRequest;
import com.baidubce.bcc.models.RebuildInstanceRequest;
import com.baidubce.bcc.models.RefuseReservedInstanceTransferRequest;
import com.baidubce.bcc.models.ReleaseInstanceByPostRequest;
import com.baidubce.bcc.models.ReleaseMultipleInstanceByPostRequest;
import com.baidubce.bcc.models.ReleaseVolumeRequest;
import com.baidubce.bcc.models.RemoteCopyImageRequest;
import com.baidubce.bcc.models.RemoteCopyImageResponse;
import com.baidubce.bcc.models.RemoteCopySnapshotRequest;
import com.baidubce.bcc.models.RemoteCopySnapshotResponse;
import com.baidubce.bcc.models.RenameImageRequest;
import com.baidubce.bcc.models.RenameKeypairRequest;
import com.baidubce.bcc.models.RenameVolumeRequest;
import com.baidubce.bcc.models.RenewReservedInstanceRequest;
import com.baidubce.bcc.models.RenewReservedInstanceResponse;
import com.baidubce.bcc.models.ReplaceInstanceSecurityGroupRequest;
import com.baidubce.bcc.models.ReplaceInstanceSecurityGroupResponse;
import com.baidubce.bcc.models.ResizeInstanceBySpecRequest;
import com.baidubce.bcc.models.ResizeVolumeClusterRequest;
import com.baidubce.bcc.models.ResizeVolumeClusterResponse;
import com.baidubce.bcc.models.ResizeVolumeRequest;
import com.baidubce.bcc.models.ResizeVolumeResponse;
import com.baidubce.bcc.models.RevokeReservedInstanceTransferRequest;
import com.baidubce.bcc.models.RevokeSecurityGroupRuleRequest;
import com.baidubce.bcc.models.RollbackVolumeRequest;
import com.baidubce.bcc.models.ShareImageRequest;
import com.baidubce.bcc.models.StartInstanceRequest;
import com.baidubce.bcc.models.StopInstanceRequest;
import com.baidubce.bcc.models.UnShareImageRequest;
import com.baidubce.bcc.models.UnbindInstanceFromSecurityGroupRequest;
import com.baidubce.bcc.models.UnbindInstanceFromTagsRequest;
import com.baidubce.bcc.models.UnbindInstanceSecurityGroupRequest;
import com.baidubce.bcc.models.UnbindInstanceSecurityGroupResponse;
import com.baidubce.bcc.models.UnbindReservedInstanceFromTagsRequest;
import com.baidubce.bcc.models.UnbindRoleRequest;
import com.baidubce.bcc.models.UnbindRoleResponse;
import com.baidubce.bcc.models.UnbindTagImageRequest;
import com.baidubce.bcc.models.UnbindTagSnapchainRequest;
import com.baidubce.bcc.models.UnbindTagVolumeClusterRequest;
import com.baidubce.bcc.models.UnbindTagVolumeRequest;
import com.baidubce.bcc.models.UpdateAspRequest;
import com.baidubce.bcc.models.UpdateDeploySetRelationRequest;
import com.baidubce.bcc.models.UpdateDeploySetRelationResponse;
import com.baidubce.bcc.models.UpdateDeploySetRequest;
import com.baidubce.bcc.models.UpdateInstanceSubnetRequest;
import com.baidubce.bcc.models.UpdateKeypairDescriptionRequest;
import com.baidubce.bcc.models.UpdateSecurityGroupRuleRequest;
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
     * acceptReservedInstanceTransfer
     *
     */
    @Test
    public void acceptReservedInstanceTransferTest() {
        AcceptReservedInstanceTransferRequest acceptReservedInstanceTransferRequest = new AcceptReservedInstanceTransferRequest();
        acceptReservedInstanceTransferRequest.setTransferRecordId("");
        acceptReservedInstanceTransferRequest.setEhcClusterId("");
        bccClient.acceptReservedInstanceTransfer(acceptReservedInstanceTransferRequest);
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
     * attachAsp
     *
     */
    @Test
    public void attachAspTest() {
        AttachAspRequest attachAspRequest = new AttachAspRequest();
        attachAspRequest.setAspId("");
        attachAspRequest.setVolumeIds(new ArrayList<>());
        attachAspRequest.setDeleteAutoSnapshot(false);
        bccClient.attachAsp(attachAspRequest);
    }
    /**
     * attachKeypair
     *
     */
    @Test
    public void attachKeypairTest() {
        AttachKeypairRequest attachKeypairRequest = new AttachKeypairRequest();
        attachKeypairRequest.setKeypairId("");
        attachKeypairRequest.setInstanceIds(new ArrayList<>());
        bccClient.attachKeypair(attachKeypairRequest);
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
     * authorizeSecurityGroupRule
     *
     */
    @Test
    public void authorizeSecurityGroupRuleTest() {
        AuthorizeSecurityGroupRuleRequest authorizeSecurityGroupRuleRequest = new AuthorizeSecurityGroupRuleRequest();
        authorizeSecurityGroupRuleRequest.setSecurityGroupId("");
        authorizeSecurityGroupRuleRequest.setSgVersion(0);
        authorizeSecurityGroupRuleRequest.setRule(null);
        bccClient.authorizeSecurityGroupRule(authorizeSecurityGroupRuleRequest);
    }
    /**
     * authorizeServerEvent
     *
     */
    @Test
    public void authorizeServerEventTest() {
        AuthorizeServerEventRequest authorizeServerEventRequest = new AuthorizeServerEventRequest();
        authorizeServerEventRequest.setAction("");
        authorizeServerEventRequest.setServerEventId("");
        authorizeServerEventRequest.setInstanceId("");
        authorizeServerEventRequest.setAuthorizeMaintenanceOperation("");
        authorizeServerEventRequest.setExecuteTime("");
        AuthorizeServerEventResponse response = bccClient.authorizeServerEvent(authorizeServerEventRequest);
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
     * autoRenewReservedInstance
     *
     */
    @Test
    public void autoRenewReservedInstanceTest() {
        AutoRenewReservedInstanceRequest autoRenewReservedInstanceRequest = new AutoRenewReservedInstanceRequest();
        autoRenewReservedInstanceRequest.setReservedInstanceIds(new ArrayList<>());
        autoRenewReservedInstanceRequest.setAutoRenewTimeUnit("");
        autoRenewReservedInstanceRequest.setAutoRenewTime(0);
        AutoRenewReservedInstanceResponse response = bccClient.autoRenewReservedInstance(autoRenewReservedInstanceRequest);
        System.out.println(response);
    }
    /**
     * autoRenewVolumeCluster
     *
     */
    @Test
    public void autoRenewVolumeClusterTest() {
        AutoRenewVolumeClusterRequest autoRenewVolumeClusterRequest = new AutoRenewVolumeClusterRequest();
        autoRenewVolumeClusterRequest.setClusterId("");
        autoRenewVolumeClusterRequest.setRenewTimeUnit("");
        autoRenewVolumeClusterRequest.setRenewTime(0);
        bccClient.autoRenewVolumeCluster(autoRenewVolumeClusterRequest);
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
     * bindInstanceSecurityGroup
     *
     */
    @Test
    public void bindInstanceSecurityGroupTest() {
        BindInstanceSecurityGroupRequest bindInstanceSecurityGroupRequest = new BindInstanceSecurityGroupRequest();
        bindInstanceSecurityGroupRequest.setInstanceIds(new ArrayList<>());
        bindInstanceSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        bindInstanceSecurityGroupRequest.setSecurityGroupType("");
        BindInstanceSecurityGroupResponse response = bccClient.bindInstanceSecurityGroup(bindInstanceSecurityGroupRequest);
        System.out.println(response);
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
     * bindReservedInstanceToTags
     *
     */
    @Test
    public void bindReservedInstanceToTagsTest() {
        BindReservedInstanceToTagsRequest bindReservedInstanceToTagsRequest = new BindReservedInstanceToTagsRequest();
        bindReservedInstanceToTagsRequest.setReservedInstanceIds(new ArrayList<>());
        bindReservedInstanceToTagsRequest.setChangeTags(new ArrayList<>());
        bccClient.bindReservedInstanceToTags(bindReservedInstanceToTagsRequest);
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
     * bindTagSnapchain
     *
     */
    @Test
    public void bindTagSnapchainTest() {
        BindTagSnapchainRequest bindTagSnapchainRequest = new BindTagSnapchainRequest();
        bindTagSnapchainRequest.setChainId("");
        bindTagSnapchainRequest.setChangeTags(new ArrayList<>());
        bccClient.bindTagSnapchain(bindTagSnapchainRequest);
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
     * bindTagVolumeCluster
     *
     */
    @Test
    public void bindTagVolumeClusterTest() {
        BindTagVolumeClusterRequest bindTagVolumeClusterRequest = new BindTagVolumeClusterRequest();
        bindTagVolumeClusterRequest.setClusterId("");
        bindTagVolumeClusterRequest.setChangeTags(new ArrayList<>());
        bccClient.bindTagVolumeCluster(bindTagVolumeClusterRequest);
    }
    /**
     * cancelAutoRenewReservedInstance
     *
     */
    @Test
    public void cancelAutoRenewReservedInstanceTest() {
        CancelAutoRenewReservedInstanceRequest cancelAutoRenewReservedInstanceRequest = new CancelAutoRenewReservedInstanceRequest();
        cancelAutoRenewReservedInstanceRequest.setReservedInstanceIds(new ArrayList<>());
        CancelAutoRenewReservedInstanceResponse response = bccClient.cancelAutoRenewReservedInstance(cancelAutoRenewReservedInstanceRequest);
        System.out.println(response);
    }
    /**
     * cancelAutoRenewVolumeCluster
     *
     */
    @Test
    public void cancelAutoRenewVolumeClusterTest() {
        CancelAutoRenewVolumeClusterRequest cancelAutoRenewVolumeClusterRequest = new CancelAutoRenewVolumeClusterRequest();
        cancelAutoRenewVolumeClusterRequest.setClusterId("");
        bccClient.cancelAutoRenewVolumeCluster(cancelAutoRenewVolumeClusterRequest);
    }
    /**
     * cancelBidOrder
     *
     */
    @Test
    public void cancelBidOrderTest() {
        CancelBidOrderRequest cancelBidOrderRequest = new CancelBidOrderRequest();
        cancelBidOrderRequest.setOrderId("");
        CancelBidOrderResponse response = bccClient.cancelBidOrder(cancelBidOrderRequest);
        System.out.println(response);
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
     * cancelSnapshotShare
     *
     */
    @Test
    public void cancelSnapshotShareTest() {
        CancelSnapshotShareRequest cancelSnapshotShareRequest = new CancelSnapshotShareRequest();
        cancelSnapshotShareRequest.setSourceSnapshotId("");
        cancelSnapshotShareRequest.setAccountIds(new ArrayList<>());
        cancelSnapshotShareRequest.setShareSnapshotId("");
        CancelSnapshotShareResponse response = bccClient.cancelSnapshotShare(cancelSnapshotShareRequest);
        System.out.println(response);
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
     * checkServerEvent
     *
     */
    @Test
    public void checkServerEventTest() {
        CheckServerEventRequest checkServerEventRequest = new CheckServerEventRequest();
        checkServerEventRequest.setAction("");
        checkServerEventRequest.setServerEventId("");
        checkServerEventRequest.setInstanceId("");
        checkServerEventRequest.setCheckResult("");
        checkServerEventRequest.setIssueEffect("");
        checkServerEventRequest.setIssueDescription("");
        checkServerEventRequest.setAuthorizeMaintenanceOperation("");
        CheckServerEventResponse response = bccClient.checkServerEvent(checkServerEventRequest);
        System.out.println(response);
    }
    /**
     * createAsp
     *
     */
    @Test
    public void createAspTest() {
        CreateAspRequest createAspRequest = new CreateAspRequest();
        createAspRequest.setName("");
        createAspRequest.setTimePoints(new ArrayList<>());
        createAspRequest.setRepeatWeekdays(new ArrayList<>());
        createAspRequest.setRetentionDays("");
        CreateAspResponse response = bccClient.createAsp(createAspRequest);
        System.out.println(response);
    }
    /**
     * createAuthorizationRule
     *
     */
    @Test
    public void createAuthorizationRuleTest() {
        CreateAuthorizationRuleRequest createAuthorizationRuleRequest = new CreateAuthorizationRuleRequest();
        createAuthorizationRuleRequest.setAction("");
        createAuthorizationRuleRequest.setEnableRule(0);
        createAuthorizationRuleRequest.setAuthorizeMaintenanceOperations(new ArrayList<>());
        createAuthorizationRuleRequest.setRuleName("");
        createAuthorizationRuleRequest.setServerEventCategory("");
        CreateAuthorizationRuleResponse response = bccClient.createAuthorizationRule(createAuthorizationRuleRequest);
        System.out.println(response);
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
     * createBidInstance
     *
     */
    @Test
    public void createBidInstanceTest() {
        CreateBidInstanceRequest createBidInstanceRequest = new CreateBidInstanceRequest();
        createBidInstanceRequest.setSpec("");
        createBidInstanceRequest.setImageId("");
        createBidInstanceRequest.setBilling(null);
        createBidInstanceRequest.setBidModel("");
        createBidInstanceRequest.setBidPrice("");
        createBidInstanceRequest.setCpuCount(0);
        createBidInstanceRequest.setMemoryCapacityInGB(0);
        createBidInstanceRequest.setRootDiskSizeInGb(0);
        createBidInstanceRequest.setRootDiskStorageType("");
        createBidInstanceRequest.setCreateCdsList(new ArrayList<>());
        createBidInstanceRequest.setEphemeralDisks(new ArrayList<>());
        createBidInstanceRequest.setNetworkCapacityInMbps(0);
        createBidInstanceRequest.setInternetChargeType("");
        createBidInstanceRequest.setEipName("");
        createBidInstanceRequest.setPurchaseCount(0);
        createBidInstanceRequest.setName("");
        createBidInstanceRequest.setHostname("");
        createBidInstanceRequest.setAutoSeqSuffix(false);
        createBidInstanceRequest.setIsOpenHostnameDomain(false);
        createBidInstanceRequest.setAdminPass("");
        createBidInstanceRequest.setKeypairId("");
        createBidInstanceRequest.setUserData("");
        createBidInstanceRequest.setZoneName("");
        createBidInstanceRequest.setSubnetId("");
        createBidInstanceRequest.setSecurityGroupId("");
        createBidInstanceRequest.setEnterpriseSecurityGroupId("");
        createBidInstanceRequest.setIsomerismCard("");
        createBidInstanceRequest.setDeletionProtection(0);
        createBidInstanceRequest.setRelationTag(false);
        createBidInstanceRequest.setIsOpenIpv6(false);
        createBidInstanceRequest.setTags(new ArrayList<>());
        createBidInstanceRequest.setAspId("");
        createBidInstanceRequest.setFileSystems(new ArrayList<>());
        createBidInstanceRequest.setIsEipAutoRelatedDelete(false);
        createBidInstanceRequest.setResGroupId("");
        CreateBidInstanceResponse response = bccClient.createBidInstance(createBidInstanceRequest);
        System.out.println(response);
    }
    /**
     * createDeploySet
     *
     */
    @Test
    public void createDeploySetTest() {
        CreateDeploySetRequest createDeploySetRequest = new CreateDeploySetRequest();
        createDeploySetRequest.setName("");
        createDeploySetRequest.setDesc("");
        createDeploySetRequest.setStrategy("");
        createDeploySetRequest.setConcurrency(0);
        CreateDeploySetResponse response = bccClient.createDeploySet(createDeploySetRequest);
        System.out.println(response);
    }
    /**
     * createEhcCluster
     *
     */
    @Test
    public void createEhcClusterTest() {
        CreateEhcClusterRequest createEhcClusterRequest = new CreateEhcClusterRequest();
        createEhcClusterRequest.setName("");
        createEhcClusterRequest.setZoneName("");
        createEhcClusterRequest.setDescription("");
        CreateEhcClusterResponse response = bccClient.createEhcCluster(createEhcClusterRequest);
        System.out.println(response);
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
     * createKeypair
     *
     */
    @Test
    public void createKeypairTest() {
        CreateKeypairRequest createKeypairRequest = new CreateKeypairRequest();
        createKeypairRequest.setName("");
        createKeypairRequest.setDescription("");
        CreateKeypairResponse response = bccClient.createKeypair(createKeypairRequest);
        System.out.println(response);
    }
    /**
     * createReservedInstanceTransfer
     *
     */
    @Test
    public void createReservedInstanceTransferTest() {
        CreateReservedInstanceTransferRequest createReservedInstanceTransferRequest = new CreateReservedInstanceTransferRequest();
        createReservedInstanceTransferRequest.setReservedInstanceIds(new ArrayList<>());
        createReservedInstanceTransferRequest.setRecipientAccountId("");
        bccClient.createReservedInstanceTransfer(createReservedInstanceTransferRequest);
    }
    /**
     * createReservedInstances
     *
     */
    @Test
    public void createReservedInstancesTest() {
        CreateReservedInstancesRequest createReservedInstancesRequest = new CreateReservedInstancesRequest();
        createReservedInstancesRequest.setReservedInstanceName("");
        createReservedInstancesRequest.setScope("");
        createReservedInstancesRequest.setZoneName("");
        createReservedInstancesRequest.setSpec("");
        createReservedInstancesRequest.setOfferingType("");
        createReservedInstancesRequest.setInstanceCount(0);
        createReservedInstancesRequest.setReservedInstanceCount(0);
        createReservedInstancesRequest.setReservedInstanceTime(0);
        createReservedInstancesRequest.setReservedInstanceTimeUnit("");
        createReservedInstancesRequest.setAutoRenew(false);
        createReservedInstancesRequest.setAutoRenewTimeUnit("");
        createReservedInstancesRequest.setAutoRenewTime(0);
        createReservedInstancesRequest.setEffectiveTime("");
        createReservedInstancesRequest.setTags(new ArrayList<>());
        createReservedInstancesRequest.setTicketId("");
        createReservedInstancesRequest.setEhcClusterId("");
        CreateReservedInstancesResponse response = bccClient.createReservedInstances(createReservedInstancesRequest);
        System.out.println(response);
    }
    /**
     * createSecurityGroup
     *
     */
    @Test
    public void createSecurityGroupTest() {
        CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest();
        createSecurityGroupRequest.setName("");
        createSecurityGroupRequest.setDesc("");
        createSecurityGroupRequest.setVpcId("");
        createSecurityGroupRequest.setTags(new ArrayList<>());
        createSecurityGroupRequest.setRules(new ArrayList<>());
        CreateSecurityGroupResponse response = bccClient.createSecurityGroup(createSecurityGroupRequest);
        System.out.println(response);
    }
    /**
     * createSnapshot
     *
     */
    @Test
    public void createSnapshotTest() {
        CreateSnapshotRequest createSnapshotRequest = new CreateSnapshotRequest();
        createSnapshotRequest.setVolumeId("");
        createSnapshotRequest.setSnapshotName("");
        createSnapshotRequest.setDesc("");
        createSnapshotRequest.setTags(new ArrayList<>());
        createSnapshotRequest.setRetentionInDays(0);
        CreateSnapshotResponse response = bccClient.createSnapshot(createSnapshotRequest);
        System.out.println(response);
    }
    /**
     * createSnapshotShare
     *
     */
    @Test
    public void createSnapshotShareTest() {
        CreateSnapshotShareRequest createSnapshotShareRequest = new CreateSnapshotShareRequest();
        createSnapshotShareRequest.setSnapshotId("");
        createSnapshotShareRequest.setAccountIds(new ArrayList<>());
        CreateSnapshotShareResponse response = bccClient.createSnapshotShare(createSnapshotShareRequest);
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
     * createVolumeCluster
     *
     */
    @Test
    public void createVolumeClusterTest() {
        CreateVolumeClusterRequest createVolumeClusterRequest = new CreateVolumeClusterRequest();
        createVolumeClusterRequest.setZoneName("");
        createVolumeClusterRequest.setClusterName("");
        createVolumeClusterRequest.setClusterSizeInGB(0);
        createVolumeClusterRequest.setStorageType("");
        createVolumeClusterRequest.setPurchaseCount(0);
        createVolumeClusterRequest.setBilling(null);
        createVolumeClusterRequest.setTags(new ArrayList<>());
        CreateVolumeClusterResponse response = bccClient.createVolumeCluster(createVolumeClusterRequest);
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
     * deleteAsp
     *
     */
    @Test
    public void deleteAspTest() {
        DeleteAspRequest deleteAspRequest = new DeleteAspRequest();
        deleteAspRequest.setAspId("");
        bccClient.deleteAsp(deleteAspRequest);
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
     * deleteDeploySet
     *
     */
    @Test
    public void deleteDeploySetTest() {
        DeleteDeploySetRequest deleteDeploySetRequest = new DeleteDeploySetRequest();
        deleteDeploySetRequest.setDeployId("");
        bccClient.deleteDeploySet(deleteDeploySetRequest);
    }
    /**
     * deleteEhcCluster
     *
     */
    @Test
    public void deleteEhcClusterTest() {
        DeleteEhcClusterRequest deleteEhcClusterRequest = new DeleteEhcClusterRequest();
        deleteEhcClusterRequest.setEhcClusterIdList(new ArrayList<>());
        bccClient.deleteEhcCluster(deleteEhcClusterRequest);
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
     * deleteInstUserOpAuthorizeRule
     *
     */
    @Test
    public void deleteInstUserOpAuthorizeRuleTest() {
        DeleteInstUserOpAuthorizeRuleRequest deleteInstUserOpAuthorizeRuleRequest = new DeleteInstUserOpAuthorizeRuleRequest();
        deleteInstUserOpAuthorizeRuleRequest.setAction("");
        deleteInstUserOpAuthorizeRuleRequest.setRuleId("");
        DeleteInstUserOpAuthorizeRuleResponse response = bccClient.deleteInstUserOpAuthorizeRule(deleteInstUserOpAuthorizeRuleRequest);
        System.out.println(response);
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
     * deleteKeypair
     *
     */
    @Test
    public void deleteKeypairTest() {
        DeleteKeypairRequest deleteKeypairRequest = new DeleteKeypairRequest();
        deleteKeypairRequest.setKeypairId("");
        bccClient.deleteKeypair(deleteKeypairRequest);
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
     * deleteSecurityGroup
     *
     */
    @Test
    public void deleteSecurityGroupTest() {
        DeleteSecurityGroupRequest deleteSecurityGroupRequest = new DeleteSecurityGroupRequest();
        deleteSecurityGroupRequest.setSecurityGroupId("");
        bccClient.deleteSecurityGroup(deleteSecurityGroupRequest);
    }
    /**
     * deleteSecurityGroupRule
     *
     */
    @Test
    public void deleteSecurityGroupRuleTest() {
        DeleteSecurityGroupRuleRequest deleteSecurityGroupRuleRequest = new DeleteSecurityGroupRuleRequest();
        deleteSecurityGroupRuleRequest.setSecurityGroupRuleId("");
        deleteSecurityGroupRuleRequest.setSgVersion(0);
        bccClient.deleteSecurityGroupRule(deleteSecurityGroupRuleRequest);
    }
    /**
     * deleteSnapshot
     *
     */
    @Test
    public void deleteSnapshotTest() {
        DeleteSnapshotRequest deleteSnapshotRequest = new DeleteSnapshotRequest();
        deleteSnapshotRequest.setSnapshotId("");
        bccClient.deleteSnapshot(deleteSnapshotRequest);
    }
    /**
     * deletesInstanceDeploySet
     *
     */
    @Test
    public void deletesInstanceDeploySetTest() {
        DeletesInstanceDeploySetRequest deletesInstanceDeploySetRequest = new DeletesInstanceDeploySetRequest();
        deletesInstanceDeploySetRequest.setDeployId("");
        deletesInstanceDeploySetRequest.setInstanceIdList(new ArrayList<>());
        bccClient.deletesInstanceDeploySet(deletesInstanceDeploySetRequest);
    }
    /**
     * describeAuthorizeRules
     *
     */
    @Test
    public void describeAuthorizeRulesTest() {
        DescribeAuthorizeRulesRequest describeAuthorizeRulesRequest = new DescribeAuthorizeRulesRequest();
        describeAuthorizeRulesRequest.setAction("");
        describeAuthorizeRulesRequest.setMarker("");
        describeAuthorizeRulesRequest.setMaxKeys(0);
        describeAuthorizeRulesRequest.setRuleIds(new ArrayList<>());
        describeAuthorizeRulesRequest.setRuleNames(new ArrayList<>());
        DescribeAuthorizeRulesResponse response = bccClient.describeAuthorizeRules(describeAuthorizeRulesRequest);
        System.out.println(response);
    }
    /**
     * describePlannedEventRecords
     *
     */
    @Test
    public void describePlannedEventRecordsTest() {
        DescribePlannedEventRecordsRequest describePlannedEventRecordsRequest = new DescribePlannedEventRecordsRequest();
        describePlannedEventRecordsRequest.setAction("");
        describePlannedEventRecordsRequest.setServerEventIds(new ArrayList<>());
        describePlannedEventRecordsRequest.setInstanceIds(new ArrayList<>());
        describePlannedEventRecordsRequest.setProductCategory("");
        describePlannedEventRecordsRequest.setServerEventType("");
        describePlannedEventRecordsRequest.setServerEventLogTimeFilter("");
        describePlannedEventRecordsRequest.setPeriodStartTime("");
        describePlannedEventRecordsRequest.setPeriodEndTime("");
        describePlannedEventRecordsRequest.setMaxKeys(0);
        describePlannedEventRecordsRequest.setMarker("");
        DescribePlannedEventRecordsResponse response = bccClient.describePlannedEventRecords(describePlannedEventRecordsRequest);
        System.out.println(response);
    }
    /**
     * describePlannedEvents
     *
     */
    @Test
    public void describePlannedEventsTest() {
        DescribePlannedEventsRequest describePlannedEventsRequest = new DescribePlannedEventsRequest();
        describePlannedEventsRequest.setAction("");
        describePlannedEventsRequest.setServerEventStatus("");
        describePlannedEventsRequest.setServerEventIds(new ArrayList<>());
        describePlannedEventsRequest.setInstanceIds(new ArrayList<>());
        describePlannedEventsRequest.setProductCategory("");
        describePlannedEventsRequest.setServerEventType("");
        describePlannedEventsRequest.setServerEventLogTimeFilter("");
        describePlannedEventsRequest.setPeriodStartTime("");
        describePlannedEventsRequest.setPeriodEndTime("");
        describePlannedEventsRequest.setMaxKeys(0);
        describePlannedEventsRequest.setMarker("");
        DescribePlannedEventsResponse response = bccClient.describePlannedEvents(describePlannedEventsRequest);
        System.out.println(response);
    }
    /**
     * describeRegions
     *
     */
    @Test
    public void describeRegionsTest() {
        DescribeRegionsRequest describeRegionsRequest = new DescribeRegionsRequest();
        describeRegionsRequest.setRegion("");
        DescribeRegionsResponse response = bccClient.describeRegions(describeRegionsRequest);
        System.out.println(response);
    }
    /**
     * describeSnapshotsUsage
     *
     */
    @Test
    public void describeSnapshotsUsageTest() {
        DescribeSnapshotsUsageRequest describeSnapshotsUsageRequest = new DescribeSnapshotsUsageRequest();
        describeSnapshotsUsageRequest.setAction("");
        DescribeSnapshotsUsageResponse response = bccClient.describeSnapshotsUsage(describeSnapshotsUsageRequest);
        System.out.println(response);
    }
    /**
     * describeUnplannedEventRecords
     *
     */
    @Test
    public void describeUnplannedEventRecordsTest() {
        DescribeUnplannedEventRecordsRequest describeUnplannedEventRecordsRequest = new DescribeUnplannedEventRecordsRequest();
        describeUnplannedEventRecordsRequest.setAction("");
        describeUnplannedEventRecordsRequest.setServerEventIds(new ArrayList<>());
        describeUnplannedEventRecordsRequest.setInstanceIds(new ArrayList<>());
        describeUnplannedEventRecordsRequest.setProductCategory("");
        describeUnplannedEventRecordsRequest.setServerEventType("");
        describeUnplannedEventRecordsRequest.setServerEventLogTimeFilter("");
        describeUnplannedEventRecordsRequest.setPeriodStartTime("");
        describeUnplannedEventRecordsRequest.setPeriodEndTime("");
        describeUnplannedEventRecordsRequest.setMaxKeys(0);
        describeUnplannedEventRecordsRequest.setMarker("");
        DescribeUnplannedEventRecordsResponse response = bccClient.describeUnplannedEventRecords(describeUnplannedEventRecordsRequest);
        System.out.println(response);
    }
    /**
     * describeUnplannedEvents
     *
     */
    @Test
    public void describeUnplannedEventsTest() {
        DescribeUnplannedEventsRequest describeUnplannedEventsRequest = new DescribeUnplannedEventsRequest();
        describeUnplannedEventsRequest.setAction("");
        describeUnplannedEventsRequest.setServerEventStatus("");
        describeUnplannedEventsRequest.setServerEventIds(new ArrayList<>());
        describeUnplannedEventsRequest.setInstanceIds(new ArrayList<>());
        describeUnplannedEventsRequest.setProductCategory("");
        describeUnplannedEventsRequest.setServerEventType("");
        describeUnplannedEventsRequest.setServerEventLogTimeFilter("");
        describeUnplannedEventsRequest.setPeriodStartTime("");
        describeUnplannedEventsRequest.setPeriodEndTime("");
        describeUnplannedEventsRequest.setMaxKeys(0);
        describeUnplannedEventsRequest.setMarker("");
        DescribeUnplannedEventsResponse response = bccClient.describeUnplannedEvents(describeUnplannedEventsRequest);
        System.out.println(response);
    }
    /**
     * detachAsp
     *
     */
    @Test
    public void detachAspTest() {
        DetachAspRequest detachAspRequest = new DetachAspRequest();
        detachAspRequest.setAspId("");
        detachAspRequest.setVolumeIds(new ArrayList<>());
        bccClient.detachAsp(detachAspRequest);
    }
    /**
     * detachKeypair
     *
     */
    @Test
    public void detachKeypairTest() {
        DetachKeypairRequest detachKeypairRequest = new DetachKeypairRequest();
        detachKeypairRequest.setKeypairId("");
        detachKeypairRequest.setInstanceIds(new ArrayList<>());
        bccClient.detachKeypair(detachKeypairRequest);
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
     * ehcClusterList
     *
     */
    @Test
    public void ehcClusterListTest() {
        EhcClusterListRequest ehcClusterListRequest = new EhcClusterListRequest();
        ehcClusterListRequest.setEhcClusterIdList(new ArrayList<>());
        ehcClusterListRequest.setNameList(new ArrayList<>());
        ehcClusterListRequest.setZoneName("");
        EhcClusterListResponse response = bccClient.ehcClusterList(ehcClusterListRequest);
        System.out.println(response);
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
     * getAsp
     *
     */
    @Test
    public void getAspTest() {
        GetAspRequest getAspRequest = new GetAspRequest();
        getAspRequest.setAspId("");
        GetAspResponse response = bccClient.getAsp(getAspRequest);
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
     * getBidInstancePrice
     *
     */
    @Test
    public void getBidInstancePriceTest() {
        GetBidInstancePriceRequest getBidInstancePriceRequest = new GetBidInstancePriceRequest();
        getBidInstancePriceRequest.setSpec("");
        getBidInstancePriceRequest.setRootDiskSizeInGb(0);
        getBidInstancePriceRequest.setRootDiskStorageType("");
        getBidInstancePriceRequest.setCreateCdsList(new ArrayList<>());
        getBidInstancePriceRequest.setNetworkCapacityInMbps(0);
        getBidInstancePriceRequest.setInternetChargeType("");
        getBidInstancePriceRequest.setPurchaseCount(0);
        getBidInstancePriceRequest.setZoneName("");
        GetBidInstancePriceResponse response = bccClient.getBidInstancePrice(getBidInstancePriceRequest);
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
     * getDeploySet
     *
     */
    @Test
    public void getDeploySetTest() {
        GetDeploySetRequest getDeploySetRequest = new GetDeploySetRequest();
        getDeploySetRequest.setId("");
        GetDeploySetResponse response = bccClient.getDeploySet(getDeploySetRequest);
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
     * getPriceBySpec
     *
     */
    @Test
    public void getPriceBySpecTest() {
        GetPriceBySpecRequest getPriceBySpecRequest = new GetPriceBySpecRequest();
        getPriceBySpecRequest.setSpecId("");
        getPriceBySpecRequest.setSpec("");
        getPriceBySpecRequest.setPaymentTiming("");
        getPriceBySpecRequest.setZoneName("");
        getPriceBySpecRequest.setPurchaseCount(0);
        getPriceBySpecRequest.setPurchaseLength(0);
        GetPriceBySpecResponse response = bccClient.getPriceBySpec(getPriceBySpecRequest);
        System.out.println(response);
    }
    /**
     * getReservedInstance
     *
     */
    @Test
    public void getReservedInstanceTest() {
        GetReservedInstanceRequest getReservedInstanceRequest = new GetReservedInstanceRequest();
        getReservedInstanceRequest.setMarker("");
        getReservedInstanceRequest.setMaxKeys(0);
        getReservedInstanceRequest.setReservedInstanceIds(new ArrayList<>());
        getReservedInstanceRequest.setReservedInstanceName("");
        getReservedInstanceRequest.setZoneName("");
        getReservedInstanceRequest.setReservedInstanceStatus("");
        getReservedInstanceRequest.setSpec("");
        getReservedInstanceRequest.setOfferingType("");
        getReservedInstanceRequest.setOsType("");
        getReservedInstanceRequest.setInstanceId("");
        getReservedInstanceRequest.setInstanceName("");
        getReservedInstanceRequest.setIsDeduct(false);
        getReservedInstanceRequest.setEhcClusterId("");
        getReservedInstanceRequest.setSortKey("");
        getReservedInstanceRequest.setSortDir("");
        getReservedInstanceRequest.setReservedInstanceSource("");
        getReservedInstanceRequest.setScope("");
        GetReservedInstanceResponse response = bccClient.getReservedInstance(getReservedInstanceRequest);
        System.out.println(response);
    }
    /**
     * getReservedInstancePrice
     *
     */
    @Test
    public void getReservedInstancePriceTest() {
        GetReservedInstancePriceRequest getReservedInstancePriceRequest = new GetReservedInstancePriceRequest();
        getReservedInstancePriceRequest.setSpecId("");
        getReservedInstancePriceRequest.setSpec("");
        getReservedInstancePriceRequest.setOfferingType("");
        getReservedInstancePriceRequest.setScope("");
        getReservedInstancePriceRequest.setZoneName("");
        getReservedInstancePriceRequest.setReservedInstanceCount(0);
        getReservedInstancePriceRequest.setPriceTimeUnit("");
        getReservedInstancePriceRequest.setReservedInstanceTime(0);
        getReservedInstancePriceRequest.setPurchaseNum(0);
        GetReservedInstancePriceResponse response = bccClient.getReservedInstancePrice(getReservedInstancePriceRequest);
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
     * getSnapshot
     *
     */
    @Test
    public void getSnapshotTest() {
        GetSnapshotRequest getSnapshotRequest = new GetSnapshotRequest();
        getSnapshotRequest.setSnapshotId("");
        GetSnapshotResponse response = bccClient.getSnapshot(getSnapshotRequest);
        System.out.println(response);
    }
    /**
     * getTask
     *
     */
    @Test
    public void getTaskTest() {
        GetTaskRequest getTaskRequest = new GetTaskRequest();
        getTaskRequest.setTaskIds(new ArrayList<>());
        getTaskRequest.setMaxKeys(0);
        GetTaskResponse response = bccClient.getTask(getTaskRequest);
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
     * getVolumeCluster
     *
     */
    @Test
    public void getVolumeClusterTest() {
        GetVolumeClusterRequest getVolumeClusterRequest = new GetVolumeClusterRequest();
        getVolumeClusterRequest.setClusterId("");
        GetVolumeClusterResponse response = bccClient.getVolumeCluster(getVolumeClusterRequest);
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
     * getZoneBySpec
     *
     */
    @Test
    public void getZoneBySpecTest() {
        GetZoneBySpecRequest getZoneBySpecRequest = new GetZoneBySpecRequest();
        getZoneBySpecRequest.setInstanceType("");
        getZoneBySpecRequest.setProductType("");
        getZoneBySpecRequest.setSpec("");
        getZoneBySpecRequest.setSpecId("");
        GetZoneBySpecResponse response = bccClient.getZoneBySpec(getZoneBySpecRequest);
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
     * importKeypair
     *
     */
    @Test
    public void importKeypairTest() {
        ImportKeypairRequest importKeypairRequest = new ImportKeypairRequest();
        importKeypairRequest.setName("");
        importKeypairRequest.setDescription("");
        importKeypairRequest.setPublicKey("");
        ImportKeypairResponse response = bccClient.importKeypair(importKeypairRequest);
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
     * keypairDetail
     *
     */
    @Test
    public void keypairDetailTest() {
        KeypairDetailRequest keypairDetailRequest = new KeypairDetailRequest();
        keypairDetailRequest.setKeypairId("");
        KeypairDetailResponse response = bccClient.keypairDetail(keypairDetailRequest);
        System.out.println(response);
    }
    /**
     * listAsps
     *
     */
    @Test
    public void listAspsTest() {
        ListAspsRequest listAspsRequest = new ListAspsRequest();
        listAspsRequest.setMarker("");
        listAspsRequest.setMaxKeys(0);
        listAspsRequest.setAspName("");
        listAspsRequest.setVolumeName("");
        ListAspsResponse response = bccClient.listAsps(listAspsRequest);
        System.out.println(response);
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
     * listBidFlavor
     *
     */
    @Test
    public void listBidFlavorTest() {
        ListBidFlavorResponse response = bccClient.listBidFlavor();
        System.out.println(response);
    }
    /**
     * listDeploySet
     *
     */
    @Test
    public void listDeploySetTest() {
        ListDeploySetResponse response = bccClient.listDeploySet();
        System.out.println(response);
    }
    /**
     * listFlavorSpec
     *
     */
    @Test
    public void listFlavorSpecTest() {
        ListFlavorSpecRequest listFlavorSpecRequest = new ListFlavorSpecRequest();
        listFlavorSpecRequest.setZoneName("");
        listFlavorSpecRequest.setSpecs("");
        listFlavorSpecRequest.setSpecIds("");
        ListFlavorSpecResponse response = bccClient.listFlavorSpec(listFlavorSpecRequest);
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
     * listKeypair
     *
     */
    @Test
    public void listKeypairTest() {
        ListKeypairRequest listKeypairRequest = new ListKeypairRequest();
        listKeypairRequest.setMarker("");
        listKeypairRequest.setMaxKeys(0);
        ListKeypairResponse response = bccClient.listKeypair(listKeypairRequest);
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
     * listReservedInstanceTransferIn
     *
     */
    @Test
    public void listReservedInstanceTransferInTest() {
        ListReservedInstanceTransferInRequest listReservedInstanceTransferInRequest = new ListReservedInstanceTransferInRequest();
        listReservedInstanceTransferInRequest.setMarker("");
        listReservedInstanceTransferInRequest.setMaxKeys(0);
        listReservedInstanceTransferInRequest.setReservedInstanceIds(new ArrayList<>());
        listReservedInstanceTransferInRequest.setTransferRecordIds(new ArrayList<>());
        listReservedInstanceTransferInRequest.setSpec("");
        listReservedInstanceTransferInRequest.setStatus("");
        ListReservedInstanceTransferInResponse response = bccClient.listReservedInstanceTransferIn(listReservedInstanceTransferInRequest);
        System.out.println(response);
    }
    /**
     * listReservedInstanceTransferOut
     *
     */
    @Test
    public void listReservedInstanceTransferOutTest() {
        ListReservedInstanceTransferOutRequest listReservedInstanceTransferOutRequest = new ListReservedInstanceTransferOutRequest();
        listReservedInstanceTransferOutRequest.setMarker("");
        listReservedInstanceTransferOutRequest.setMaxKeys(0);
        listReservedInstanceTransferOutRequest.setReservedInstanceIds(new ArrayList<>());
        listReservedInstanceTransferOutRequest.setTransferRecordIds(new ArrayList<>());
        listReservedInstanceTransferOutRequest.setSpec("");
        listReservedInstanceTransferOutRequest.setStatus("");
        ListReservedInstanceTransferOutResponse response = bccClient.listReservedInstanceTransferOut(listReservedInstanceTransferOutRequest);
        System.out.println(response);
    }
    /**
     * listSecurityGroups
     *
     */
    @Test
    public void listSecurityGroupsTest() {
        ListSecurityGroupsRequest listSecurityGroupsRequest = new ListSecurityGroupsRequest();
        listSecurityGroupsRequest.setMarker("");
        listSecurityGroupsRequest.setMaxKeys(0);
        listSecurityGroupsRequest.setInstanceId("");
        listSecurityGroupsRequest.setVpcId("");
        listSecurityGroupsRequest.setSecurityGroupId("");
        listSecurityGroupsRequest.setSecurityGroupIds("");
        ListSecurityGroupsResponse response = bccClient.listSecurityGroups(listSecurityGroupsRequest);
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
     * listSnapchain
     *
     */
    @Test
    public void listSnapchainTest() {
        ListSnapchainRequest listSnapchainRequest = new ListSnapchainRequest();
        listSnapchainRequest.setOrderBy("");
        listSnapchainRequest.setOrder("");
        listSnapchainRequest.setPageSize(0);
        listSnapchainRequest.setPageNo(0);
        listSnapchainRequest.setVolumeId("");
        ListSnapchainResponse response = bccClient.listSnapchain(listSnapchainRequest);
        System.out.println(response);
    }
    /**
     * listSnapshotShare
     *
     */
    @Test
    public void listSnapshotShareTest() {
        ListSnapshotShareRequest listSnapshotShareRequest = new ListSnapshotShareRequest();
        listSnapshotShareRequest.setMarker("");
        listSnapshotShareRequest.setMaxKeys(0);
        ListSnapshotShareResponse response = bccClient.listSnapshotShare(listSnapshotShareRequest);
        System.out.println(response);
    }
    /**
     * listSnapshots
     *
     */
    @Test
    public void listSnapshotsTest() {
        ListSnapshotsRequest listSnapshotsRequest = new ListSnapshotsRequest();
        listSnapshotsRequest.setMarker("");
        listSnapshotsRequest.setMaxKeys(0);
        listSnapshotsRequest.setVolumeId("");
        ListSnapshotsResponse response = bccClient.listSnapshots(listSnapshotsRequest);
        System.out.println(response);
    }
    /**
     * listTask
     *
     */
    @Test
    public void listTaskTest() {
        ListTaskRequest listTaskRequest = new ListTaskRequest();
        listTaskRequest.setTaskIds(new ArrayList<>());
        listTaskRequest.setMarker("");
        listTaskRequest.setMaxKeys(0);
        listTaskRequest.setTaskAction("");
        listTaskRequest.setTaskStatus("");
        listTaskRequest.setStartTime("");
        listTaskRequest.setEndTime("");
        listTaskRequest.setResourceIds(new ArrayList<>());
        ListTaskResponse response = bccClient.listTask(listTaskRequest);
        System.out.println(response);
    }
    /**
     * listVolumeClusters
     *
     */
    @Test
    public void listVolumeClustersTest() {
        ListVolumeClustersRequest listVolumeClustersRequest = new ListVolumeClustersRequest();
        listVolumeClustersRequest.setMarker("");
        listVolumeClustersRequest.setMaxKeys(0);
        listVolumeClustersRequest.setZoneName("");
        listVolumeClustersRequest.setClusterName("");
        ListVolumeClustersResponse response = bccClient.listVolumeClusters(listVolumeClustersRequest);
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
     * listZones
     *
     */
    @Test
    public void listZonesTest() {
        ListZonesResponse response = bccClient.listZones();
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
     * modifyEhcCluster
     *
     */
    @Test
    public void modifyEhcClusterTest() {
        ModifyEhcClusterRequest modifyEhcClusterRequest = new ModifyEhcClusterRequest();
        modifyEhcClusterRequest.setEhcClusterId("");
        modifyEhcClusterRequest.setName("");
        modifyEhcClusterRequest.setDescription("");
        bccClient.modifyEhcCluster(modifyEhcClusterRequest);
    }
    /**
     * modifyInstUserOpAuthorizeRuleAttribute
     *
     */
    @Test
    public void modifyInstUserOpAuthorizeRuleAttributeTest() {
        ModifyInstUserOpAuthorizeRuleAttributeRequest modifyInstUserOpAuthorizeRuleAttributeRequest = new ModifyInstUserOpAuthorizeRuleAttributeRequest();
        modifyInstUserOpAuthorizeRuleAttributeRequest.setAction("");
        modifyInstUserOpAuthorizeRuleAttributeRequest.setEnableRule(0);
        modifyInstUserOpAuthorizeRuleAttributeRequest.setAuthorizeMaintenanceOperations(new ArrayList<>());
        modifyInstUserOpAuthorizeRuleAttributeRequest.setRuleName("");
        modifyInstUserOpAuthorizeRuleAttributeRequest.setRuleId("");
        ModifyInstUserOpAuthorizeRuleAttributeResponse response = bccClient.modifyInstUserOpAuthorizeRuleAttribute(modifyInstUserOpAuthorizeRuleAttributeRequest);
        System.out.println(response);
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
     * modifyReservedInstances
     *
     */
    @Test
    public void modifyReservedInstancesTest() {
        ModifyReservedInstancesRequest modifyReservedInstancesRequest = new ModifyReservedInstancesRequest();
        modifyReservedInstancesRequest.setReservedInstances(new ArrayList<>());
        ModifyReservedInstancesResponse response = bccClient.modifyReservedInstances(modifyReservedInstancesRequest);
        System.out.println(response);
    }
    /**
     * modifySnapshotAttribute
     *
     */
    @Test
    public void modifySnapshotAttributeTest() {
        ModifySnapshotAttributeRequest modifySnapshotAttributeRequest = new ModifySnapshotAttributeRequest();
        modifySnapshotAttributeRequest.setSnapshotId("");
        modifySnapshotAttributeRequest.setSnapshotName("");
        modifySnapshotAttributeRequest.setRetentionInDays(0);
        modifySnapshotAttributeRequest.setDesc("");
        bccClient.modifySnapshotAttribute(modifySnapshotAttributeRequest);
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
     * modifyVolumeDeleteProtectionV2
     *
     */
    @Test
    public void modifyVolumeDeleteProtectionV2Test() {
        ModifyVolumeDeleteProtectionV2Request modifyVolumeDeleteProtectionV2Request = new ModifyVolumeDeleteProtectionV2Request();
        modifyVolumeDeleteProtectionV2Request.setVolumeIds(new ArrayList<>());
        modifyVolumeDeleteProtectionV2Request.setEnableDeleteProtection(false);
        bccClient.modifyVolumeDeleteProtectionV2(modifyVolumeDeleteProtectionV2Request);
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
     * purchaseReservedVolumeCluster
     *
     */
    @Test
    public void purchaseReservedVolumeClusterTest() {
        PurchaseReservedVolumeClusterRequest purchaseReservedVolumeClusterRequest = new PurchaseReservedVolumeClusterRequest();
        purchaseReservedVolumeClusterRequest.setClusterId("");
        purchaseReservedVolumeClusterRequest.setBilling(null);
        PurchaseReservedVolumeClusterResponse response = bccClient.purchaseReservedVolumeCluster(purchaseReservedVolumeClusterRequest);
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
     * refuseReservedInstanceTransfer
     *
     */
    @Test
    public void refuseReservedInstanceTransferTest() {
        RefuseReservedInstanceTransferRequest refuseReservedInstanceTransferRequest = new RefuseReservedInstanceTransferRequest();
        refuseReservedInstanceTransferRequest.setTransferRecordIds(new ArrayList<>());
        bccClient.refuseReservedInstanceTransfer(refuseReservedInstanceTransferRequest);
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
     * remoteCopySnapshot
     *
     */
    @Test
    public void remoteCopySnapshotTest() {
        RemoteCopySnapshotRequest remoteCopySnapshotRequest = new RemoteCopySnapshotRequest();
        remoteCopySnapshotRequest.setSnapshotId("");
        remoteCopySnapshotRequest.setDestRegionInfos(new ArrayList<>());
        RemoteCopySnapshotResponse response = bccClient.remoteCopySnapshot(remoteCopySnapshotRequest);
        System.out.println(response);
    }
    /**
     * renameImage
     *
     */
    @Test
    public void renameImageTest() {
        RenameImageRequest renameImageRequest = new RenameImageRequest();
        renameImageRequest.setImageId("");
        renameImageRequest.setImageIds(new ArrayList<>());
        renameImageRequest.setName("");
        bccClient.renameImage(renameImageRequest);
    }
    /**
     * renameKeypair
     *
     */
    @Test
    public void renameKeypairTest() {
        RenameKeypairRequest renameKeypairRequest = new RenameKeypairRequest();
        renameKeypairRequest.setKeypairId("");
        renameKeypairRequest.setName("");
        bccClient.renameKeypair(renameKeypairRequest);
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
     * renewReservedInstance
     *
     */
    @Test
    public void renewReservedInstanceTest() {
        RenewReservedInstanceRequest renewReservedInstanceRequest = new RenewReservedInstanceRequest();
        renewReservedInstanceRequest.setReservedInstanceIds(new ArrayList<>());
        renewReservedInstanceRequest.setReservedInstanceTime("");
        renewReservedInstanceRequest.setReservedInstanceTimeUnit("");
        renewReservedInstanceRequest.setAutoRenew(false);
        renewReservedInstanceRequest.setAutoRenewTimeUnit("");
        renewReservedInstanceRequest.setAutoRenewTime(0);
        RenewReservedInstanceResponse response = bccClient.renewReservedInstance(renewReservedInstanceRequest);
        System.out.println(response);
    }
    /**
     * replaceInstanceSecurityGroup
     *
     */
    @Test
    public void replaceInstanceSecurityGroupTest() {
        ReplaceInstanceSecurityGroupRequest replaceInstanceSecurityGroupRequest = new ReplaceInstanceSecurityGroupRequest();
        replaceInstanceSecurityGroupRequest.setInstanceIds(new ArrayList<>());
        replaceInstanceSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        replaceInstanceSecurityGroupRequest.setSecurityGroupType("");
        ReplaceInstanceSecurityGroupResponse response = bccClient.replaceInstanceSecurityGroup(replaceInstanceSecurityGroupRequest);
        System.out.println(response);
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
     * resizeVolumeCluster
     *
     */
    @Test
    public void resizeVolumeClusterTest() {
        ResizeVolumeClusterRequest resizeVolumeClusterRequest = new ResizeVolumeClusterRequest();
        resizeVolumeClusterRequest.setClusterId("");
        resizeVolumeClusterRequest.setNewClusterSizeInGB(0);
        ResizeVolumeClusterResponse response = bccClient.resizeVolumeCluster(resizeVolumeClusterRequest);
        System.out.println(response);
    }
    /**
     * revokeReservedInstanceTransfer
     *
     */
    @Test
    public void revokeReservedInstanceTransferTest() {
        RevokeReservedInstanceTransferRequest revokeReservedInstanceTransferRequest = new RevokeReservedInstanceTransferRequest();
        revokeReservedInstanceTransferRequest.setTransferRecordIds(new ArrayList<>());
        bccClient.revokeReservedInstanceTransfer(revokeReservedInstanceTransferRequest);
    }
    /**
     * revokeSecurityGroupRule
     *
     */
    @Test
    public void revokeSecurityGroupRuleTest() {
        RevokeSecurityGroupRuleRequest revokeSecurityGroupRuleRequest = new RevokeSecurityGroupRuleRequest();
        revokeSecurityGroupRuleRequest.setSecurityGroupId("");
        revokeSecurityGroupRuleRequest.setSgVersion(0);
        revokeSecurityGroupRuleRequest.setRule(null);
        bccClient.revokeSecurityGroupRule(revokeSecurityGroupRuleRequest);
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
     * unbindInstanceSecurityGroup
     *
     */
    @Test
    public void unbindInstanceSecurityGroupTest() {
        UnbindInstanceSecurityGroupRequest unbindInstanceSecurityGroupRequest = new UnbindInstanceSecurityGroupRequest();
        unbindInstanceSecurityGroupRequest.setInstanceIds(new ArrayList<>());
        unbindInstanceSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        unbindInstanceSecurityGroupRequest.setSecurityGroupType("");
        UnbindInstanceSecurityGroupResponse response = bccClient.unbindInstanceSecurityGroup(unbindInstanceSecurityGroupRequest);
        System.out.println(response);
    }
    /**
     * unbindReservedInstanceFromTags
     *
     */
    @Test
    public void unbindReservedInstanceFromTagsTest() {
        UnbindReservedInstanceFromTagsRequest unbindReservedInstanceFromTagsRequest = new UnbindReservedInstanceFromTagsRequest();
        unbindReservedInstanceFromTagsRequest.setReservedInstanceIds(new ArrayList<>());
        unbindReservedInstanceFromTagsRequest.setChangeTags(new ArrayList<>());
        bccClient.unbindReservedInstanceFromTags(unbindReservedInstanceFromTagsRequest);
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
     * unbindTagSnapchain
     *
     */
    @Test
    public void unbindTagSnapchainTest() {
        UnbindTagSnapchainRequest unbindTagSnapchainRequest = new UnbindTagSnapchainRequest();
        unbindTagSnapchainRequest.setChainId("");
        unbindTagSnapchainRequest.setChangeTags(new ArrayList<>());
        bccClient.unbindTagSnapchain(unbindTagSnapchainRequest);
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
     * unbindTagVolumeCluster
     *
     */
    @Test
    public void unbindTagVolumeClusterTest() {
        UnbindTagVolumeClusterRequest unbindTagVolumeClusterRequest = new UnbindTagVolumeClusterRequest();
        unbindTagVolumeClusterRequest.setClusterId("");
        unbindTagVolumeClusterRequest.setChangeTags(new ArrayList<>());
        bccClient.unbindTagVolumeCluster(unbindTagVolumeClusterRequest);
    }
    /**
     * updateAsp
     *
     */
    @Test
    public void updateAspTest() {
        UpdateAspRequest updateAspRequest = new UpdateAspRequest();
        updateAspRequest.setAspId("");
        updateAspRequest.setName("");
        updateAspRequest.setTimePoints(new ArrayList<>());
        updateAspRequest.setRepeatWeekdays(new ArrayList<>());
        updateAspRequest.setRetentionDays("");
        bccClient.updateAsp(updateAspRequest);
    }
    /**
     * updateDeploySet
     *
     */
    @Test
    public void updateDeploySetTest() {
        UpdateDeploySetRequest updateDeploySetRequest = new UpdateDeploySetRequest();
        updateDeploySetRequest.setDeployId("");
        updateDeploySetRequest.setName("");
        updateDeploySetRequest.setDesc("");
        bccClient.updateDeploySet(updateDeploySetRequest);
    }
    /**
     * updateDeploySetRelation
     *
     */
    @Test
    public void updateDeploySetRelationTest() {
        UpdateDeploySetRelationRequest updateDeploySetRelationRequest = new UpdateDeploySetRelationRequest();
        updateDeploySetRelationRequest.setInstanceId("");
        updateDeploySetRelationRequest.setDeploysetIdList(new ArrayList<>());
        UpdateDeploySetRelationResponse response = bccClient.updateDeploySetRelation(updateDeploySetRelationRequest);
        System.out.println(response);
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
    /**
     * updateKeypairDescription
     *
     */
    @Test
    public void updateKeypairDescriptionTest() {
        UpdateKeypairDescriptionRequest updateKeypairDescriptionRequest = new UpdateKeypairDescriptionRequest();
        updateKeypairDescriptionRequest.setKeypairId("");
        updateKeypairDescriptionRequest.setDescription("");
        bccClient.updateKeypairDescription(updateKeypairDescriptionRequest);
    }
    /**
     * updateSecurityGroupRule
     *
     */
    @Test
    public void updateSecurityGroupRuleTest() {
        UpdateSecurityGroupRuleRequest updateSecurityGroupRuleRequest = new UpdateSecurityGroupRuleRequest();
        updateSecurityGroupRuleRequest.setSgVersion(0);
        updateSecurityGroupRuleRequest.setSecurityGroupRuleId("");
        updateSecurityGroupRuleRequest.setRemark("");
        updateSecurityGroupRuleRequest.setPortRange("");
        updateSecurityGroupRuleRequest.setSourceIp("");
        updateSecurityGroupRuleRequest.setSourceGroupId("");
        updateSecurityGroupRuleRequest.setDestIp("");
        updateSecurityGroupRuleRequest.setDestGroupId("");
        updateSecurityGroupRuleRequest.setProtocol("");
        bccClient.updateSecurityGroupRule(updateSecurityGroupRuleRequest);
    }
}
