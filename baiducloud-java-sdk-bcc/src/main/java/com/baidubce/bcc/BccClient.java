package com.baidubce.bcc;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.auth.SignOptions;
import com.baidubce.util.RequestBodyUtils;
import java.util.Arrays;
import java.util.HashSet;
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;

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

public class BccClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V2 = "v2";
    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_VOLUME = "volume";
    private static final String CONSTANT_CLUSTER = "cluster";
    private static final String CONSTANT_TAG = "tag";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_EHC = "ehc";
    private static final String CONSTANT_CREATE = "create";
    private static final String CONSTANT_IMAGE = "image";
    private static final String CONSTANT_REGION = "region";
    private static final String CONSTANT_DESCRIBE_REGIONS = "describeRegions";
    private static final String CONSTANT_SNAPSHOT = "snapshot";
    private static final String CONSTANT_DISK = "disk";
    private static final String CONSTANT_QUOTA = "quota";
    private static final String CONSTANT_RESERVED = "reserved";
    private static final String CONSTANT_GET_PRICE = "getPrice";
    private static final String CONSTANT_RECOVERY = "recovery";
    private static final String CONSTANT_DEPLOYSET = "deployset";
    private static final String CONSTANT_GET_AVAILABLE_IMAGES_BY_SPEC = "getAvailableImagesBySpec";
    private static final String CONSTANT_ROLE = "role";
    private static final String CONSTANT_MODIFY = "modify";
    private static final String CONSTANT_DELETE_PROTECTION = "deleteProtection";
    private static final String CONSTANT_BCC = "bcc";
    private static final String CONSTANT_SECURITY_GROUP = "securityGroup";
    private static final String CONSTANT_PRICE = "price";
    private static final String CONSTANT_BATCH_CREATE_AUTO_RENEW_RULES = "batchCreateAutoRenewRules";
    private static final String CONSTANT_TRANSFER = "transfer";
    private static final String CONSTANT_ASP = "asp";
    private static final String CONSTANT_UPDATE = "update";
    private static final String CONSTANT_CHAIN = "chain";
    private static final String CONSTANT_IN = "in";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_AUTO_RENEW = "autoRenew";
    private static final String CONSTANT_KEYPAIR = "keypair";
    private static final String CONSTANT_VNC = "vnc";
    private static final String CONSTANT_UN_SHARE = "unShare";
    private static final String CONSTANT_RECYCLE = "recycle";
    private static final String CONSTANT_ACCEPT = "accept";
    private static final String CONSTANT_SHARED_USERS = "sharedUsers";
    private static final String CONSTANT_NO_CHARGE = "noCharge";
    private static final String CONSTANT_REBUILD = "rebuild";
    private static final String CONSTANT_INSTANCE_BATCH_BY_SPEC = "instanceBatchBySpec";
    private static final String CONSTANT_MODIFY_RELATED_DELETE_POLICY = "modifyRelatedDeletePolicy";
    private static final String CONSTANT_DEL_RELATION = "delRelation";
    private static final String CONSTANT_FLAVOR_SPEC = "flavorSpec";
    private static final String CONSTANT_REVOKE = "revoke";
    private static final String CONSTANT_CANCEL_BID_ORDER = "cancelBidOrder";
    private static final String CONSTANT_BID_FLAVOR = "bidFlavor";
    private static final String CONSTANT_INSTANCE_BY_SPEC = "instanceBySpec";
    private static final String CONSTANT_BATCH_DELETE = "batchDelete";
    private static final String CONSTANT_BATCH_REFUND_RESOURCE = "batchRefundResource";
    private static final String CONSTANT_REFUSE = "refuse";
    private static final String CONSTANT_LIST_BY_INSTANCE_ID = "listByInstanceId";
    private static final String CONSTANT_OS = "os";
    private static final String CONSTANT_SECURITYGROUP = "securitygroup";
    private static final String CONSTANT_UNBIND = "unbind";
    private static final String CONSTANT_BATCH_ACTION = "batchAction";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_DETAIL = "detail";
    private static final String CONSTANT_BIND = "bind";
    private static final String CONSTANT_RULE = "rule";
    private static final String CONSTANT_ATTRIBUTE = "attribute";
    private static final String CONSTANT_GET_USERDATA = "getUserdata";
    private static final String CONSTANT_RESERVED_INSTANCE = "reservedInstance";
    private static final String CONSTANT_FLAVOR_ZONES = "flavorZones";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_CANCEL_AUTO_RENEW = "cancelAutoRenew";
    private static final String CONSTANT_BATCH_DEL_IP = "batchDelIp";
    private static final String CONSTANT_PROGRESS = "progress";
    private static final String CONSTANT_BATCH = "batch";
    private static final String CONSTANT_CHARGING = "charging";
    private static final String CONSTANT_BID_PRICE = "bidPrice";
    private static final String CONSTANT_SNAPSHOT_SHARE = "snapshotShare";
    private static final String CONSTANT_RENAME = "rename";
    private static final String CONSTANT_SUBNET = "subnet";
    private static final String CONSTANT_CHANGE_SUBNET = "changeSubnet";
    private static final String CONSTANT_REPLACE = "replace";
    private static final String CONSTANT_VPC = "vpc";
    private static final String CONSTANT_CHANGE_VPC = "changeVpc";
    private static final String CONSTANT_BATCH_DELETE_AUTO_RENEW_RULES = "batchDeleteAutoRenewRules";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_ADD_IPV6 = "addIpv6";
    private static final String CONSTANT_DELETION_PROTECTION = "deletionProtection";
    private static final String CONSTANT_OUT = "out";
    private static final String CONSTANT_SHARE = "share";
    private static final String CONSTANT_UPDATE_RELATION = "updateRelation";
    private static final String CONSTANT_DEL_IPV6 = "delIpv6";
    private static final String CONSTANT_ENI = "eni";
    private static final String CONSTANT_BATCH_ADD_IP = "batchAddIp";
    private static final String CONSTANT_REMOTE_COPY = "remote_copy";
    private static final String CONSTANT_IMPORT = "import";
    private static final String CONSTANT_RESCUE = "rescue";
    private static final String CONSTANT_MODE = "mode";
    private static final String CONSTANT_EXIT = "exit";
    private static final String CONSTANT_RENEW = "renew";
    private static final String CONSTANT_ENTER = "enter";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public BccClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public BccClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * acceptReservedInstanceTransfer
     * 
     * @param request 入参结构体
     */
    public void acceptReservedInstanceTransfer(AcceptReservedInstanceTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_TRANSFER, CONSTANT_ACCEPT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addIpv6
     * 
     * @param request 入参结构体
     * @return AddIpv6Response
     */
    public AddIpv6Response addIpv6(AddIpv6Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_ADD_IPV6);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AddIpv6Response.class);
    }

    /**
     * attachAsp
     * 
     * @param request 入参结构体
     */
    public void attachAsp(AttachAspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_ASP, request.getAspId());
        internalRequest.addParameter("attach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * attachKeypair
     * 
     * @param request 入参结构体
     */
    public void attachKeypair(AttachKeypairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_KEYPAIR, request.getKeypairId());
        internalRequest.addParameter("attach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * attachVolume
     * 
     * @param request 入参结构体
     * @return AttachVolumeResponse
     */
    public AttachVolumeResponse attachVolume(AttachVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("attach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AttachVolumeResponse.class);
    }

    /**
     * authorizeSecurityGroupRule
     * 
     * @param request 入参结构体
     */
    public void authorizeSecurityGroupRule(AuthorizeSecurityGroupRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SECURITY_GROUP, request.getSecurityGroupId());
        internalRequest.addParameter("authorizeRule", null);
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * authorizeServerEvent
     * 
     * @param request 入参结构体
     * @return AuthorizeServerEventResponse
     */
    public AuthorizeServerEventResponse authorizeServerEvent(AuthorizeServerEventRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AuthorizeServerEventResponse.class);
    }

    /**
     * autoReleaseInstance
     * 
     * @param request 入参结构体
     */
    public void autoReleaseInstance(AutoReleaseInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("autorelease", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * autoRenewReservedInstance
     * 
     * @param request 入参结构体
     * @return AutoRenewReservedInstanceResponse
     */
    public AutoRenewReservedInstanceResponse autoRenewReservedInstance(AutoRenewReservedInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_AUTO_RENEW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AutoRenewReservedInstanceResponse.class);
    }

    /**
     * autoRenewVolumeCluster
     * 
     * @param request 入参结构体
     */
    public void autoRenewVolumeCluster(AutoRenewVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER, CONSTANT_AUTO_RENEW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchAddIp
     * 
     * @param request 入参结构体
     */
    public void batchAddIp(BatchAddIpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_ADD_IP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchChangeToPostpaid
     * 
     * @param request 入参结构体
     * @return BatchChangeToPostpaidResponse
     */
    public BatchChangeToPostpaidResponse batchChangeToPostpaid(BatchChangeToPostpaidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH, CONSTANT_CHARGING);
        internalRequest.addParameter("toPostpay", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchChangeToPostpaidResponse.class);
    }

    /**
     * batchChangeToPrepaid
     * 
     * @param request 入参结构体
     * @return BatchChangeToPrepaidResponse
     */
    public BatchChangeToPrepaidResponse batchChangeToPrepaid(BatchChangeToPrepaidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH, CONSTANT_CHARGING);
        internalRequest.addParameter("toPrepay", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchChangeToPrepaidResponse.class);
    }

    /**
     * batchDeleteIp
     * 
     * @param request 入参结构体
     */
    public void batchDeleteIp(BatchDeleteIpRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_DEL_IP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchRefundResource
     * 
     * @param request 入参结构体
     * @return BatchRefundResourceResponse
     */
    public BatchRefundResourceResponse batchRefundResource(BatchRefundResourceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_REFUND_RESOURCE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchRefundResourceResponse.class);
    }

    /**
     * batchStartInstance
     * 
     * @param request 入参结构体
     */
    public void batchStartInstance(BatchStartInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_ACTION);
        internalRequest.addParameter("start", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchStopInstance
     * 
     * @param request 入参结构体
     */
    public void batchStopInstance(BatchStopInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_ACTION);
        internalRequest.addParameter("stop", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindInstanceSecurityGroup
     * 
     * @param request 入参结构体
     * @return BindInstanceSecurityGroupResponse
     */
    public BindInstanceSecurityGroupResponse bindInstanceSecurityGroup(BindInstanceSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SECURITYGROUP, CONSTANT_BIND);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BindInstanceSecurityGroupResponse.class);
    }

    /**
     * bindInstanceToSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void bindInstanceToSecurityGroup(BindInstanceToSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindInstanceToTags
     * 
     * @param request 入参结构体
     */
    public void bindInstanceToTags(BindInstanceToTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TAG);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindReservedInstanceToTags
     * 
     * @param request 入参结构体
     */
    public void bindReservedInstanceToTags(BindReservedInstanceToTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_BCC, CONSTANT_RESERVED, CONSTANT_TAG);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindRole
     * 
     * @param request 入参结构体
     * @return BindRoleResponse
     */
    public BindRoleResponse bindRole(BindRoleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_ROLE);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BindRoleResponse.class);
    }

    /**
     * bindTagImage
     * 
     * @param request 入参结构体
     */
    public void bindTagImage(BindTagImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_IMAGE, request.getImageId(), CONSTANT_TAG);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindTagSnapchain
     * 
     * @param request 入参结构体
     */
    public void bindTagSnapchain(BindTagSnapchainRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SNAPSHOT, CONSTANT_CHAIN, request.getChainId(), CONSTANT_TAG);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindTagVolume
     * 
     * @param request 入参结构体
     */
    public void bindTagVolume(BindTagVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId(), CONSTANT_TAG);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindTagVolumeCluster
     * 
     * @param request 入参结构体
     */
    public void bindTagVolumeCluster(BindTagVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER, request.getClusterId(), CONSTANT_TAG);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * cancelAutoRenewReservedInstance
     * 
     * @param request 入参结构体
     * @return CancelAutoRenewReservedInstanceResponse
     */
    public CancelAutoRenewReservedInstanceResponse cancelAutoRenewReservedInstance(CancelAutoRenewReservedInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_CANCEL_AUTO_RENEW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CancelAutoRenewReservedInstanceResponse.class);
    }

    /**
     * cancelAutoRenewVolumeCluster
     * 
     * @param request 入参结构体
     */
    public void cancelAutoRenewVolumeCluster(CancelAutoRenewVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER, CONSTANT_CANCEL_AUTO_RENEW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * cancelBidOrder
     * 
     * @param request 入参结构体
     * @return CancelBidOrderResponse
     */
    public CancelBidOrderResponse cancelBidOrder(CancelBidOrderRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_CANCEL_BID_ORDER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CancelBidOrderResponse.class);
    }

    /**
     * cancelRemoteCopyImage
     * 
     * @param request 入参结构体
     */
    public void cancelRemoteCopyImage(CancelRemoteCopyImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_IMAGE, request.getImageId());
        internalRequest.addParameter("cancelRemoteCopy", null);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * cancelSnapshotShare
     * 
     * @param request 入参结构体
     * @return CancelSnapshotShareResponse
     */
    public CancelSnapshotShareResponse cancelSnapshotShare(CancelSnapshotShareRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_SNAPSHOT, CONSTANT_UN_SHARE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CancelSnapshotShareResponse.class);
    }

    /**
     * changeToPrepaid
     * 
     * @param request 入参结构体
     * @return ChangeToPrepaidResponse
     */
    public ChangeToPrepaidResponse changeToPrepaid(ChangeToPrepaidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("toPrepay", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ChangeToPrepaidResponse.class);
    }

    /**
     * changeVpc
     * 
     * @param request 入参结构体
     */
    public void changeVpc(ChangeVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VPC, CONSTANT_CHANGE_VPC);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * checkServerEvent
     * 
     * @param request 入参结构体
     * @return CheckServerEventResponse
     */
    public CheckServerEventResponse checkServerEvent(CheckServerEventRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CheckServerEventResponse.class);
    }

    /**
     * createAsp
     * 
     * @param request 入参结构体
     * @return CreateAspResponse
     */
    public CreateAspResponse createAsp(CreateAspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_ASP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAspResponse.class);
    }

    /**
     * createAuthorizationRule
     * 
     * @param request 入参结构体
     * @return CreateAuthorizationRuleResponse
     */
    public CreateAuthorizationRuleResponse createAuthorizationRule(CreateAuthorizationRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAuthorizationRuleResponse.class);
    }

    /**
     * createAutoRenewRule
     * 
     * @param request 入参结构体
     */
    public void createAutoRenewRule(CreateAutoRenewRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_CREATE_AUTO_RENEW_RULES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createBidInstance
     * 
     * @param request 入参结构体
     * @return CreateBidInstanceResponse
     */
    public CreateBidInstanceResponse createBidInstance(CreateBidInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE_BY_SPEC);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateBidInstanceResponse.class);
    }

    /**
     * createDeploySet
     * 
     * @param request 入参结构体
     * @return CreateDeploySetResponse
     */
    public CreateDeploySetResponse createDeploySet(CreateDeploySetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEPLOYSET, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDeploySetResponse.class);
    }

    /**
     * createEhcCluster
     * 
     * @param request 入参结构体
     * @return CreateEhcClusterResponse
     */
    public CreateEhcClusterResponse createEhcCluster(CreateEhcClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_EHC, CONSTANT_CLUSTER, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateEhcClusterResponse.class);
    }

    /**
     * createImage
     * 
     * @param request 入参结构体
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_IMAGE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateImageResponse.class);
    }

    /**
     * createInstanceBySpec
     * 
     * @param request 入参结构体
     * @return CreateInstanceBySpecResponse
     */
    public CreateInstanceBySpecResponse createInstanceBySpec(CreateInstanceBySpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE_BY_SPEC);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateInstanceBySpecResponse.class);
    }

    /**
     * createKeypair
     * 
     * @param request 入参结构体
     * @return CreateKeypairResponse
     */
    public CreateKeypairResponse createKeypair(CreateKeypairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_KEYPAIR);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateKeypairResponse.class);
    }

    /**
     * createReservedInstanceTransfer
     * 
     * @param request 入参结构体
     */
    public void createReservedInstanceTransfer(CreateReservedInstanceTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_TRANSFER, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createReservedInstances
     * 
     * @param request 入参结构体
     * @return CreateReservedInstancesResponse
     */
    public CreateReservedInstancesResponse createReservedInstances(CreateReservedInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateReservedInstancesResponse.class);
    }

    /**
     * createSecurityGroup
     * 
     * @param request 入参结构体
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_SECURITY_GROUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSecurityGroupResponse.class);
    }

    /**
     * createSnapshot
     * 
     * @param request 入参结构体
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_SNAPSHOT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSnapshotResponse.class);
    }

    /**
     * createSnapshotShare
     * 
     * @param request 入参结构体
     * @return CreateSnapshotShareResponse
     */
    public CreateSnapshotShareResponse createSnapshotShare(CreateSnapshotShareRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_SNAPSHOT, CONSTANT_SHARE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSnapshotShareResponse.class);
    }

    /**
     * createVolume
     * 
     * @param request 入参结构体
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateVolumeResponse.class);
    }

    /**
     * createVolumeCluster
     * 
     * @param request 入参结构体
     * @return CreateVolumeClusterResponse
     */
    public CreateVolumeClusterResponse createVolumeCluster(CreateVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateVolumeClusterResponse.class);
    }

    /**
     * delIpv6
     * 
     * @param request 入参结构体
     */
    public void delIpv6(DelIpv6Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEL_IPV6);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAsp
     * 
     * @param request 入参结构体
     */
    public void deleteAsp(DeleteAspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_ASP, request.getAspId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAutoRenewRule
     * 
     * @param request 入参结构体
     */
    public void deleteAutoRenewRule(DeleteAutoRenewRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_DELETE_AUTO_RENEW_RULES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDeploySet
     * 
     * @param request 入参结构体
     */
    public void deleteDeploySet(DeleteDeploySetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEPLOYSET, request.getDeployId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteEhcCluster
     * 
     * @param request 入参结构体
     */
    public void deleteEhcCluster(DeleteEhcClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_EHC, CONSTANT_CLUSTER, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteImage
     * 
     * @param request 入参结构体
     */
    public void deleteImage(DeleteImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_IMAGE, request.getImageId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteInstUserOpAuthorizeRule
     * 
     * @param request 入参结构体
     * @return DeleteInstUserOpAuthorizeRuleResponse
     */
    public DeleteInstUserOpAuthorizeRuleResponse deleteInstUserOpAuthorizeRule(DeleteInstUserOpAuthorizeRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteInstUserOpAuthorizeRuleResponse.class);
    }

    /**
     * deleteInstanceDeploySet
     * 
     * @param request 入参结构体
     */
    public void deleteInstanceDeploySet(DeleteInstanceDeploySetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEPLOYSET, CONSTANT_DEL_RELATION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteKeypair
     * 
     * @param request 入参结构体
     */
    public void deleteKeypair(DeleteKeypairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_KEYPAIR, request.getKeypairId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deletePrepayInstance
     * 
     * @param request 入参结构体
     * @return DeletePrepayInstanceResponse
     */
    public DeletePrepayInstanceResponse deletePrepayInstance(DeletePrepayInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DELETE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeletePrepayInstanceResponse.class);
    }

    /**
     * deleteRecycledInstance
     * 
     * @param request 入参结构体
     */
    public void deleteRecycledInstance(DeleteRecycledInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_RECYCLE, CONSTANT_INSTANCE, request.getInstanceId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_SECURITY_GROUP, request.getSecurityGroupId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSecurityGroupRule
     * 
     * @param request 入参结构体
     */
    public void deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_SECURITY_GROUP, CONSTANT_RULE, request.getSecurityGroupRuleId());
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSnapshot
     * 
     * @param request 入参结构体
     */
    public void deleteSnapshot(DeleteSnapshotRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_SNAPSHOT, request.getSnapshotId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deletesInstanceDeploySet
     * 
     * @param request 入参结构体
     */
    public void deletesInstanceDeploySet(DeletesInstanceDeploySetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEPLOYSET, CONSTANT_DEL_RELATION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * describeAuthorizeRules
     * 
     * @param request 入参结构体
     * @return DescribeAuthorizeRulesResponse
     */
    public DescribeAuthorizeRulesResponse describeAuthorizeRules(DescribeAuthorizeRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAuthorizeRulesResponse.class);
    }

    /**
     * describePlannedEventRecords
     * 
     * @param request 入参结构体
     * @return DescribePlannedEventRecordsResponse
     */
    public DescribePlannedEventRecordsResponse describePlannedEventRecords(DescribePlannedEventRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribePlannedEventRecordsResponse.class);
    }

    /**
     * describePlannedEvents
     * 
     * @param request 入参结构体
     * @return DescribePlannedEventsResponse
     */
    public DescribePlannedEventsResponse describePlannedEvents(DescribePlannedEventsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribePlannedEventsResponse.class);
    }

    /**
     * describeRegions
     * 
     * @param request 入参结构体
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_REGION, CONSTANT_DESCRIBE_REGIONS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeRegionsResponse.class);
    }

    /**
     * describeUnplannedEventRecords
     * 
     * @param request 入参结构体
     * @return DescribeUnplannedEventRecordsResponse
     */
    public DescribeUnplannedEventRecordsResponse describeUnplannedEventRecords(DescribeUnplannedEventRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeUnplannedEventRecordsResponse.class);
    }

    /**
     * describeUnplannedEvents
     * 
     * @param request 入参结构体
     * @return DescribeUnplannedEventsResponse
     */
    public DescribeUnplannedEventsResponse describeUnplannedEvents(DescribeUnplannedEventsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeUnplannedEventsResponse.class);
    }

    /**
     * detachAsp
     * 
     * @param request 入参结构体
     */
    public void detachAsp(DetachAspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_ASP, request.getAspId());
        internalRequest.addParameter("detach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * detachKeypair
     * 
     * @param request 入参结构体
     */
    public void detachKeypair(DetachKeypairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_KEYPAIR, request.getKeypairId());
        internalRequest.addParameter("detach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * detachVolume
     * 
     * @param request 入参结构体
     */
    public void detachVolume(DetachVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("detach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * ehcClusterList
     * 
     * @param request 入参结构体
     * @return EhcClusterListResponse
     */
    public EhcClusterListResponse ehcClusterList(EhcClusterListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_EHC, CONSTANT_CLUSTER, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, EhcClusterListResponse.class);
    }

    /**
     * enterRescueMode
     * 
     * @param request 入参结构体
     * @return EnterRescueModeResponse
     */
    public EnterRescueModeResponse enterRescueMode(EnterRescueModeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESCUE, CONSTANT_MODE, CONSTANT_ENTER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, EnterRescueModeResponse.class);
    }

    /**
     * exitRescueMode
     * 
     * @param request 入参结构体
     * @return ExitRescueModeResponse
     */
    public ExitRescueModeResponse exitRescueMode(ExitRescueModeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESCUE, CONSTANT_MODE, CONSTANT_EXIT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ExitRescueModeResponse.class);
    }

    /**
     * getAsp
     * 
     * @param request 入参结构体
     * @return GetAspResponse
     */
    public GetAspResponse getAsp(GetAspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_ASP, request.getAspId());
        return invokeHttpClient(internalRequest, GetAspResponse.class);
    }

    /**
     * getAvailableImagesBySpec
     * 
     * @param request 入参结构体
     * @return GetAvailableImagesBySpecResponse
     */
    public GetAvailableImagesBySpecResponse getAvailableImagesBySpec(GetAvailableImagesBySpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_IMAGE, CONSTANT_GET_AVAILABLE_IMAGES_BY_SPEC);
        if (request.getSpec() != null) {
            internalRequest.addParameter("spec", request.getSpec());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getOsName() != null) {
            internalRequest.addParameter("osName", request.getOsName());
        }
        return invokeHttpClient(internalRequest, GetAvailableImagesBySpecResponse.class);
    }

    /**
     * getBidInstancePrice
     * 
     * @param request 入参结构体
     * @return GetBidInstancePriceResponse
     */
    public GetBidInstancePriceResponse getBidInstancePrice(GetBidInstancePriceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BID_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetBidInstancePriceResponse.class);
    }

    /**
     * getCdsPrice
     * 
     * @param request 入参结构体
     * @return GetCdsPriceResponse
     */
    public GetCdsPriceResponse getCdsPrice(GetCdsPriceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, CONSTANT_GET_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetCdsPriceResponse.class);
    }

    /**
     * getDeploySet
     * 
     * @param request 入参结构体
     * @return GetDeploySetResponse
     */
    public GetDeploySetResponse getDeploySet(GetDeploySetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_DEPLOYSET, request.getId());
        return invokeHttpClient(internalRequest, GetDeploySetResponse.class);
    }

    /**
     * getDiskQuota
     * 
     * @param request 入参结构体
     * @return GetDiskQuotaResponse
     */
    public GetDiskQuotaResponse getDiskQuota(GetDiskQuotaRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, CONSTANT_DISK, CONSTANT_QUOTA);
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        return invokeHttpClient(internalRequest, GetDiskQuotaResponse.class);
    }

    /**
     * getImage
     * 
     * @param request 入参结构体
     * @return GetImageResponse
     */
    public GetImageResponse getImage(GetImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_IMAGE, request.getImageId());
        return invokeHttpClient(internalRequest, GetImageResponse.class);
    }

    /**
     * getInstance
     * 
     * @param request 入参结构体
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        return invokeHttpClient(internalRequest, GetInstanceResponse.class);
    }

    /**
     * getInstanceNoChargeList
     * 
     * @param request 入参结构体
     * @return GetInstanceNoChargeListResponse
     */
    public GetInstanceNoChargeListResponse getInstanceNoChargeList(GetInstanceNoChargeListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_NO_CHARGE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getInternalIp() != null) {
            internalRequest.addParameter("internalIp", request.getInternalIp());
        }
        if (request.getKeypairId() != null) {
            internalRequest.addParameter("keypairId", request.getKeypairId());
        }
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        if (request.getInstanceIds() != null) {
            internalRequest.addParameter("instanceIds", request.getInstanceIds());
        }
        return invokeHttpClient(internalRequest, GetInstanceNoChargeListResponse.class);
    }

    /**
     * getInstanceUserDataInfo
     * 
     * @param request 入参结构体
     * @return GetInstanceUserDataInfoResponse
     */
    public GetInstanceUserDataInfoResponse getInstanceUserDataInfo(GetInstanceUserDataInfoRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_ATTRIBUTE, CONSTANT_GET_USERDATA);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetInstanceUserDataInfoResponse.class);
    }

    /**
     * getInstanceVnc
     * 
     * @param request 入参结构体
     * @return GetInstanceVncResponse
     */
    public GetInstanceVncResponse getInstanceVnc(GetInstanceVncRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_VNC);
        return invokeHttpClient(internalRequest, GetInstanceVncResponse.class);
    }

    /**
     * getPriceBySpec
     * 
     * @param request 入参结构体
     * @return GetPriceBySpecResponse
     */
    public GetPriceBySpecResponse getPriceBySpec(GetPriceBySpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetPriceBySpecResponse.class);
    }

    /**
     * getReservedInstance
     * 
     * @param request 入参结构体
     * @return GetReservedInstanceResponse
     */
    public GetReservedInstanceResponse getReservedInstance(GetReservedInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_LIST);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetReservedInstanceResponse.class);
    }

    /**
     * getReservedInstancePrice
     * 
     * @param request 入参结构体
     * @return GetReservedInstancePriceResponse
     */
    public GetReservedInstancePriceResponse getReservedInstancePrice(GetReservedInstancePriceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_RESERVED_INSTANCE, CONSTANT_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetReservedInstancePriceResponse.class);
    }

    /**
     * getRoleList
     * 
     * @return GetRoleListResponse
     */
    public GetRoleListResponse getRoleList() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_ROLE, CONSTANT_LIST);
        return invokeHttpClient(internalRequest, GetRoleListResponse.class);
    }

    /**
     * getSnapshot
     * 
     * @param request 入参结构体
     * @return GetSnapshotResponse
     */
    public GetSnapshotResponse getSnapshot(GetSnapshotRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_SNAPSHOT, request.getSnapshotId());
        return invokeHttpClient(internalRequest, GetSnapshotResponse.class);
    }

    /**
     * getTask
     * 
     * @param request 入参结构体
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(GetTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_TASK, CONSTANT_DETAIL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetTaskResponse.class);
    }

    /**
     * getVolume
     * 
     * @param request 入参结构体
     * @return GetVolumeResponse
     */
    public GetVolumeResponse getVolume(GetVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        return invokeHttpClient(internalRequest, GetVolumeResponse.class);
    }

    /**
     * getVolumeCluster
     * 
     * @param request 入参结构体
     * @return GetVolumeClusterResponse
     */
    public GetVolumeClusterResponse getVolumeCluster(GetVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER, request.getClusterId());
        return invokeHttpClient(internalRequest, GetVolumeClusterResponse.class);
    }

    /**
     * getVolumeResizeProgress
     * 
     * @param request 入参结构体
     * @return GetVolumeResizeProgressResponse
     */
    public GetVolumeResizeProgressResponse getVolumeResizeProgress(GetVolumeResizeProgressRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, CONSTANT_PROGRESS, request.getVolumeId());
        return invokeHttpClient(internalRequest, GetVolumeResizeProgressResponse.class);
    }

    /**
     * getZoneBySpec
     * 
     * @param request 入参结构体
     * @return GetZoneBySpecResponse
     */
    public GetZoneBySpecResponse getZoneBySpec(GetZoneBySpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, CONSTANT_FLAVOR_ZONES);
        if (request.getInstanceType() != null) {
            internalRequest.addParameter("instanceType", request.getInstanceType());
        }
        if (request.getProductType() != null) {
            internalRequest.addParameter("productType", request.getProductType());
        }
        if (request.getSpec() != null) {
            internalRequest.addParameter("spec", request.getSpec());
        }
        if (request.getSpecId() != null) {
            internalRequest.addParameter("specId", request.getSpecId());
        }
        return invokeHttpClient(internalRequest, GetZoneBySpecResponse.class);
    }

    /**
     * importImage
     * 
     * @param request 入参结构体
     * @return ImportImageResponse
     */
    public ImportImageResponse importImage(ImportImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_IMAGE, CONSTANT_IMPORT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ImportImageResponse.class);
    }

    /**
     * importKeypair
     * 
     * @param request 入参结构体
     * @return ImportKeypairResponse
     */
    public ImportKeypairResponse importKeypair(ImportKeypairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_KEYPAIR);
        internalRequest.addParameter("import", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ImportKeypairResponse.class);
    }

    /**
     * instanceBatchResizeBySpec
     * 
     * @param request 入参结构体
     * @return InstanceBatchResizeBySpecResponse
     */
    public InstanceBatchResizeBySpecResponse instanceBatchResizeBySpec(InstanceBatchResizeBySpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE_BATCH_BY_SPEC);
        internalRequest.addParameter("resize", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, InstanceBatchResizeBySpecResponse.class);
    }

    /**
     * instanceDeletionProtection
     * 
     * @param request 入参结构体
     */
    public void instanceDeletionProtection(InstanceDeletionProtectionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_DELETION_PROTECTION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * instanceRecovery
     * 
     * @param request 入参结构体
     */
    public void instanceRecovery(InstanceRecoveryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RECOVERY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * keypairDetail
     * 
     * @param request 入参结构体
     * @return KeypairDetailResponse
     */
    public KeypairDetailResponse keypairDetail(KeypairDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_KEYPAIR, request.getKeypairId());
        return invokeHttpClient(internalRequest, KeypairDetailResponse.class);
    }

    /**
     * listAsps
     * 
     * @param request 入参结构体
     * @return ListAspsResponse
     */
    public ListAspsResponse listAsps(ListAspsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_ASP);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getAspName() != null) {
            internalRequest.addParameter("aspName", request.getAspName());
        }
        if (request.getVolumeName() != null) {
            internalRequest.addParameter("volumeName", request.getVolumeName());
        }
        return invokeHttpClient(internalRequest, ListAspsResponse.class);
    }

    /**
     * listAvailableResizeSpec
     * 
     * @param request 入参结构体
     * @return ListAvailableResizeSpecResponse
     */
    public ListAvailableResizeSpecResponse listAvailableResizeSpec(ListAvailableResizeSpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("resizeList", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListAvailableResizeSpecResponse.class);
    }

    /**
     * listBidFlavor
     * 
     * @return ListBidFlavorResponse
     */
    public ListBidFlavorResponse listBidFlavor() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BID_FLAVOR);
        return invokeHttpClient(internalRequest, ListBidFlavorResponse.class);
    }

    /**
     * listDeploySet
     * 
     * @return ListDeploySetResponse
     */
    public ListDeploySetResponse listDeploySet() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEPLOYSET, CONSTANT_LIST);
        return invokeHttpClient(internalRequest, ListDeploySetResponse.class);
    }

    /**
     * listFlavorSpec
     * 
     * @param request 入参结构体
     * @return ListFlavorSpecResponse
     */
    public ListFlavorSpecResponse listFlavorSpec(ListFlavorSpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_FLAVOR_SPEC);
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        if (request.getSpecs() != null) {
            internalRequest.addParameter("specs", request.getSpecs());
        }
        if (request.getSpecIds() != null) {
            internalRequest.addParameter("specIds", request.getSpecIds());
        }
        return invokeHttpClient(internalRequest, ListFlavorSpecResponse.class);
    }

    /**
     * listImages
     * 
     * @param request 入参结构体
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_IMAGE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getImageType() != null) {
            internalRequest.addParameter("imageType", request.getImageType());
        }
        if (request.getImageName() != null) {
            internalRequest.addParameter("imageName", request.getImageName());
        }
        return invokeHttpClient(internalRequest, ListImagesResponse.class);
    }

    /**
     * listInstanceByIds
     * 
     * @param request 入参结构体
     * @return ListInstanceByIdsResponse
     */
    public ListInstanceByIdsResponse listInstanceByIds(ListInstanceByIdsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_LIST_BY_INSTANCE_ID);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListInstanceByIdsResponse.class);
    }

    /**
     * listInstanceEnis
     * 
     * @param request 入参结构体
     * @return ListInstanceEnisResponse
     */
    public ListInstanceEnisResponse listInstanceEnis(ListInstanceEnisRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_ENI, request.getInstanceId());
        return invokeHttpClient(internalRequest, ListInstanceEnisResponse.class);
    }

    /**
     * listInstances
     * 
     * @param request 入参结构体
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getInternalIp() != null) {
            internalRequest.addParameter("internalIp", request.getInternalIp());
        }
        if (request.getDedicatedHostId() != null) {
            internalRequest.addParameter("dedicatedHostId", request.getDedicatedHostId());
        }
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        if (request.getShowRdmaTopo() != null) {
            internalRequest.addParameter("showRdmaTopo", request.getShowRdmaTopo());
        }
        if (request.getInstanceIds() != null) {
            internalRequest.addParameter("instanceIds", request.getInstanceIds());
        }
        if (request.getInstanceNames() != null) {
            internalRequest.addParameter("instanceNames", request.getInstanceNames());
        }
        if (request.getFuzzyInstanceName() != null) {
            internalRequest.addParameter("fuzzyInstanceName", request.getFuzzyInstanceName());
        }
        if (request.getVolumeIds() != null) {
            internalRequest.addParameter("volumeIds", request.getVolumeIds());
        }
        if (request.getDeploySetIds() != null) {
            internalRequest.addParameter("deploySetIds", request.getDeploySetIds());
        }
        if (request.getSecurityGroupIds() != null) {
            internalRequest.addParameter("securityGroupIds", request.getSecurityGroupIds());
        }
        if (request.getPaymentTiming() != null) {
            internalRequest.addParameter("paymentTiming", request.getPaymentTiming());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getTags() != null) {
            internalRequest.addParameter("tags", request.getTags());
        }
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getPrivateIps() != null) {
            internalRequest.addParameter("privateIps", request.getPrivateIps());
        }
        if (request.getEhcClusterId() != null) {
            internalRequest.addParameter("ehcClusterId", request.getEhcClusterId());
        }
        return invokeHttpClient(internalRequest, ListInstancesResponse.class);
    }

    /**
     * listKeypair
     * 
     * @param request 入参结构体
     * @return ListKeypairResponse
     */
    public ListKeypairResponse listKeypair(ListKeypairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_KEYPAIR);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, ListKeypairResponse.class);
    }

    /**
     * listOs
     * 
     * @param request 入参结构体
     * @return ListOsResponse
     */
    public ListOsResponse listOs(ListOsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_IMAGE, CONSTANT_OS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListOsResponse.class);
    }

    /**
     * listRecycleInstance
     * 
     * @param request 入参结构体
     * @return ListRecycleInstanceResponse
     */
    public ListRecycleInstanceResponse listRecycleInstance(ListRecycleInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_RECYCLE, CONSTANT_INSTANCE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListRecycleInstanceResponse.class);
    }

    /**
     * listReservedInstanceTransferIn
     * 
     * @param request 入参结构体
     * @return ListReservedInstanceTransferInResponse
     */
    public ListReservedInstanceTransferInResponse listReservedInstanceTransferIn(ListReservedInstanceTransferInRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_TRANSFER, CONSTANT_IN, CONSTANT_LIST);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListReservedInstanceTransferInResponse.class);
    }

    /**
     * listReservedInstanceTransferOut
     * 
     * @param request 入参结构体
     * @return ListReservedInstanceTransferOutResponse
     */
    public ListReservedInstanceTransferOutResponse listReservedInstanceTransferOut(ListReservedInstanceTransferOutRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_TRANSFER, CONSTANT_OUT, CONSTANT_LIST);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListReservedInstanceTransferOutResponse.class);
    }

    /**
     * listSecurityGroups
     * 
     * @param request 入参结构体
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_SECURITY_GROUP);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getSecurityGroupId() != null) {
            internalRequest.addParameter("securityGroupId", request.getSecurityGroupId());
        }
        if (request.getSecurityGroupIds() != null) {
            internalRequest.addParameter("securityGroupIds", request.getSecurityGroupIds());
        }
        return invokeHttpClient(internalRequest, ListSecurityGroupsResponse.class);
    }

    /**
     * listSharedUser
     * 
     * @param request 入参结构体
     * @return ListSharedUserResponse
     */
    public ListSharedUserResponse listSharedUser(ListSharedUserRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_IMAGE, request.getImageId(), CONSTANT_SHARED_USERS);
        return invokeHttpClient(internalRequest, ListSharedUserResponse.class);
    }

    /**
     * listSnapchain
     * 
     * @param request 入参结构体
     * @return ListSnapchainResponse
     */
    public ListSnapchainResponse listSnapchain(ListSnapchainRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_SNAPSHOT, CONSTANT_CHAIN);
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getVolumeId() != null) {
            internalRequest.addParameter("volumeId", request.getVolumeId());
        }
        return invokeHttpClient(internalRequest, ListSnapchainResponse.class);
    }

    /**
     * listSnapshotShare
     * 
     * @param request 入参结构体
     * @return ListSnapshotShareResponse
     */
    public ListSnapshotShareResponse listSnapshotShare(ListSnapshotShareRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_SNAPSHOT, CONSTANT_SNAPSHOT_SHARE, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListSnapshotShareResponse.class);
    }

    /**
     * listSnapshots
     * 
     * @param request 入参结构体
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_SNAPSHOT);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getVolumeId() != null) {
            internalRequest.addParameter("volumeId", request.getVolumeId());
        }
        return invokeHttpClient(internalRequest, ListSnapshotsResponse.class);
    }

    /**
     * listTask
     * 
     * @param request 入参结构体
     * @return ListTaskResponse
     */
    public ListTaskResponse listTask(ListTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_TASK, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListTaskResponse.class);
    }

    /**
     * listVolumeClusters
     * 
     * @param request 入参结构体
     * @return ListVolumeClustersResponse
     */
    public ListVolumeClustersResponse listVolumeClusters(ListVolumeClustersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        if (request.getClusterName() != null) {
            internalRequest.addParameter("clusterName", request.getClusterName());
        }
        return invokeHttpClient(internalRequest, ListVolumeClustersResponse.class);
    }

    /**
     * listVolumes
     * 
     * @param request 入参结构体
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        if (request.getClusterId() != null) {
            internalRequest.addParameter("clusterId", request.getClusterId());
        }
        if (request.getChargeFilter() != null) {
            internalRequest.addParameter("chargeFilter", request.getChargeFilter());
        }
        if (request.getUsageFilter() != null) {
            internalRequest.addParameter("usageFilter", request.getUsageFilter());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getProductCategory() != null) {
            internalRequest.addParameter("productCategory", request.getProductCategory());
        }
        return invokeHttpClient(internalRequest, ListVolumesResponse.class);
    }

    /**
     * listZones
     * 
     * @return ListZonesResponse
     */
    public ListZonesResponse listZones() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V2, CONSTANT_ZONE);
        return invokeHttpClient(internalRequest, ListZonesResponse.class);
    }

    /**
     * modifyCdsAttribute
     * 
     * @param request 入参结构体
     */
    public void modifyCdsAttribute(ModifyCdsAttributeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("modify", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyEhcCluster
     * 
     * @param request 入参结构体
     */
    public void modifyEhcCluster(ModifyEhcClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_EHC, CONSTANT_CLUSTER, CONSTANT_MODIFY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyInstUserOpAuthorizeRuleAttribute
     * 
     * @param request 入参结构体
     * @return ModifyInstUserOpAuthorizeRuleAttributeResponse
     */
    public ModifyInstUserOpAuthorizeRuleAttributeResponse modifyInstUserOpAuthorizeRuleAttribute(ModifyInstUserOpAuthorizeRuleAttributeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ModifyInstUserOpAuthorizeRuleAttributeResponse.class);
    }

    /**
     * modifyInstanceAttributes
     * 
     * @param request 入参结构体
     */
    public void modifyInstanceAttributes(ModifyInstanceAttributesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("modifyAttribute", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyInstanceDesc
     * 
     * @param request 入参结构体
     */
    public void modifyInstanceDesc(ModifyInstanceDescRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("modifyDesc", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyInstanceHostname
     * 
     * @param request 入参结构体
     */
    public void modifyInstanceHostname(ModifyInstanceHostnameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("changeHostname", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyInstancePassword
     * 
     * @param request 入参结构体
     */
    public void modifyInstancePassword(ModifyInstancePasswordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("changePass", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyRelatedDeletePolicy
     * 
     * @param request 入参结构体
     */
    public void modifyRelatedDeletePolicy(ModifyRelatedDeletePolicyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_MODIFY_RELATED_DELETE_POLICY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyReservedInstances
     * 
     * @param request 入参结构体
     * @return ModifyReservedInstancesResponse
     */
    public ModifyReservedInstancesResponse modifyReservedInstances(ModifyReservedInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_MODIFY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ModifyReservedInstancesResponse.class);
    }

    /**
     * modifyVolumeChargeType
     * 
     * @param request 入参结构体
     */
    public void modifyVolumeChargeType(ModifyVolumeChargeTypeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("modifyChargeType", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyVolumeDeleteProtectionV2
     * 
     * @param request 入参结构体
     */
    public void modifyVolumeDeleteProtectionV2(ModifyVolumeDeleteProtectionV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, CONSTANT_MODIFY, CONSTANT_DELETE_PROTECTION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * purchaseReservedInstance
     * 
     * @param request 入参结构体
     * @return PurchaseReservedInstanceResponse
     */
    public PurchaseReservedInstanceResponse purchaseReservedInstance(PurchaseReservedInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getRelatedRenewFlag() != null) {
            internalRequest.addParameter("relatedRenewFlag", request.getRelatedRenewFlag());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PurchaseReservedInstanceResponse.class);
    }

    /**
     * purchaseReservedVolume
     * 
     * @param request 入参结构体
     * @return PurchaseReservedVolumeResponse
     */
    public PurchaseReservedVolumeResponse purchaseReservedVolume(PurchaseReservedVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("purchaseReserved", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PurchaseReservedVolumeResponse.class);
    }

    /**
     * purchaseReservedVolumeCluster
     * 
     * @param request 入参结构体
     * @return PurchaseReservedVolumeClusterResponse
     */
    public PurchaseReservedVolumeClusterResponse purchaseReservedVolumeCluster(PurchaseReservedVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER, request.getClusterId());
        internalRequest.addParameter("purchaseReserved", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PurchaseReservedVolumeClusterResponse.class);
    }

    /**
     * rebootInstance
     * 
     * @param request 入参结构体
     */
    public void rebootInstance(RebootInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("reboot", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * rebuildBatchInstance
     * 
     * @param request 入参结构体
     */
    public void rebuildBatchInstance(RebuildBatchInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_REBUILD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * rebuildInstance
     * 
     * @param request 入参结构体
     */
    public void rebuildInstance(RebuildInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("rebuild", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * refuseReservedInstanceTransfer
     * 
     * @param request 入参结构体
     */
    public void refuseReservedInstanceTransfer(RefuseReservedInstanceTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_TRANSFER, CONSTANT_REFUSE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseInstanceByPost
     * 
     * @param request 入参结构体
     */
    public void releaseInstanceByPost(ReleaseInstanceByPostRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseMultipleInstanceByPost
     * 
     * @param request 入参结构体
     */
    public void releaseMultipleInstanceByPost(ReleaseMultipleInstanceByPostRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_BATCH_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseVolume
     * 
     * @param request 入参结构体
     */
    public void releaseVolume(ReleaseVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * remoteCopyImage
     * 
     * @param request 入参结构体
     * @return RemoteCopyImageResponse
     */
    public RemoteCopyImageResponse remoteCopyImage(RemoteCopyImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_IMAGE, request.getImageId());
        internalRequest.addParameter("remoteCopy", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RemoteCopyImageResponse.class);
    }

    /**
     * remoteCopySnapshot
     * 
     * @param request 入参结构体
     * @return RemoteCopySnapshotResponse
     */
    public RemoteCopySnapshotResponse remoteCopySnapshot(RemoteCopySnapshotRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SNAPSHOT, CONSTANT_REMOTE_COPY, request.getSnapshotId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RemoteCopySnapshotResponse.class);
    }

    /**
     * renameImage
     * 
     * @param request 入参结构体
     */
    public void renameImage(RenameImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_IMAGE, CONSTANT_RENAME);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renameKeypair
     * 
     * @param request 入参结构体
     */
    public void renameKeypair(RenameKeypairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_KEYPAIR, request.getKeypairId());
        internalRequest.addParameter("rename", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renameVolume
     * 
     * @param request 入参结构体
     */
    public void renameVolume(RenameVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("rename", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renewReservedInstance
     * 
     * @param request 入参结构体
     * @return RenewReservedInstanceResponse
     */
    public RenewReservedInstanceResponse renewReservedInstance(RenewReservedInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_RENEW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RenewReservedInstanceResponse.class);
    }

    /**
     * replaceInstanceSecurityGroup
     * 
     * @param request 入参结构体
     * @return ReplaceInstanceSecurityGroupResponse
     */
    public ReplaceInstanceSecurityGroupResponse replaceInstanceSecurityGroup(ReplaceInstanceSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SECURITYGROUP, CONSTANT_REPLACE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ReplaceInstanceSecurityGroupResponse.class);
    }

    /**
     * resizeInstanceBySpec
     * 
     * @param request 入参结构体
     */
    public void resizeInstanceBySpec(ResizeInstanceBySpecRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE_BY_SPEC, request.getInstanceId());
        internalRequest.addParameter("resize", null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resizeVolume
     * 
     * @param request 入参结构体
     * @return ResizeVolumeResponse
     */
    public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("resize", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResizeVolumeResponse.class);
    }

    /**
     * resizeVolumeCluster
     * 
     * @param request 入参结构体
     * @return ResizeVolumeClusterResponse
     */
    public ResizeVolumeClusterResponse resizeVolumeCluster(ResizeVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER, request.getClusterId());
        internalRequest.addParameter("resize", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResizeVolumeClusterResponse.class);
    }

    /**
     * revokeReservedInstanceTransfer
     * 
     * @param request 入参结构体
     */
    public void revokeReservedInstanceTransfer(RevokeReservedInstanceTransferRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_RESERVED, CONSTANT_TRANSFER, CONSTANT_REVOKE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * revokeSecurityGroupRule
     * 
     * @param request 入参结构体
     */
    public void revokeSecurityGroupRule(RevokeSecurityGroupRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SECURITY_GROUP, request.getSecurityGroupId());
        internalRequest.addParameter("revokeRule", null);
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * rollbackVolume
     * 
     * @param request 入参结构体
     */
    public void rollbackVolume(RollbackVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("rollback", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * shareImage
     * 
     * @param request 入参结构体
     */
    public void shareImage(ShareImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_IMAGE, request.getImageId());
        internalRequest.addParameter("share", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * startInstance
     * 
     * @param request 入参结构体
     */
    public void startInstance(StartInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("start", null);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * stopInstance
     * 
     * @param request 入参结构体
     */
    public void stopInstance(StopInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("stop", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unShareImage
     * 
     * @param request 入参结构体
     */
    public void unShareImage(UnShareImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_IMAGE, request.getImageId());
        internalRequest.addParameter("unshare", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindInstanceFromSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void unbindInstanceFromSecurityGroup(UnbindInstanceFromSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindInstanceFromTags
     * 
     * @param request 入参结构体
     */
    public void unbindInstanceFromTags(UnbindInstanceFromTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TAG);
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindInstanceSecurityGroup
     * 
     * @param request 入参结构体
     * @return UnbindInstanceSecurityGroupResponse
     */
    public UnbindInstanceSecurityGroupResponse unbindInstanceSecurityGroup(UnbindInstanceSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SECURITYGROUP, CONSTANT_UNBIND);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UnbindInstanceSecurityGroupResponse.class);
    }

    /**
     * unbindReservedInstanceFromTags
     * 
     * @param request 入参结构体
     */
    public void unbindReservedInstanceFromTags(UnbindReservedInstanceFromTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_BCC, CONSTANT_RESERVED, CONSTANT_TAG);
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindRole
     * 
     * @param request 入参结构体
     * @return UnbindRoleResponse
     */
    public UnbindRoleResponse unbindRole(UnbindRoleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_ROLE);
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UnbindRoleResponse.class);
    }

    /**
     * unbindTagImage
     * 
     * @param request 入参结构体
     */
    public void unbindTagImage(UnbindTagImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_IMAGE, request.getImageId(), CONSTANT_TAG);
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindTagSnapchain
     * 
     * @param request 入参结构体
     */
    public void unbindTagSnapchain(UnbindTagSnapchainRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SNAPSHOT, CONSTANT_CHAIN, request.getChainId(), CONSTANT_TAG);
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindTagVolume
     * 
     * @param request 入参结构体
     */
    public void unbindTagVolume(UnbindTagVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId(), CONSTANT_TAG);
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindTagVolumeCluster
     * 
     * @param request 入参结构体
     */
    public void unbindTagVolumeCluster(UnbindTagVolumeClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, CONSTANT_CLUSTER, request.getClusterId(), CONSTANT_TAG);
        internalRequest.addParameter("unbind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAsp
     * 
     * @param request 入参结构体
     */
    public void updateAsp(UpdateAspRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_ASP, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDeploySet
     * 
     * @param request 入参结构体
     */
    public void updateDeploySet(UpdateDeploySetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEPLOYSET, request.getDeployId());
        internalRequest.addParameter("modifyAttribute", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateDeploySetRelation
     * 
     * @param request 入参结构体
     * @return UpdateDeploySetRelationResponse
     */
    public UpdateDeploySetRelationResponse updateDeploySetRelation(UpdateDeploySetRelationRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_DEPLOYSET, CONSTANT_UPDATE_RELATION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateDeploySetRelationResponse.class);
    }

    /**
     * updateInstanceSubnet
     * 
     * @param request 入参结构体
     */
    public void updateInstanceSubnet(UpdateInstanceSubnetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SUBNET, CONSTANT_CHANGE_SUBNET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateKeypairDescription
     * 
     * @param request 入参结构体
     */
    public void updateKeypairDescription(UpdateKeypairDescriptionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_KEYPAIR, request.getKeypairId());
        internalRequest.addParameter("updateDesc", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSecurityGroupRule
     * 
     * @param request 入参结构体
     */
    public void updateSecurityGroupRule(UpdateSecurityGroupRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_SECURITY_GROUP, CONSTANT_RULE, CONSTANT_UPDATE);
        if (request.getSgVersion() != null) {
            internalRequest.addParameter("sgVersion", String.valueOf(request.getSgVersion()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
    * Creates and initializes a new request object for the specified resource.
    *
    * @param bceRequest    The original BCE request created by the user.
    * @param httpMethod    The HTTP method to use when sending the request.
    * @param pathVariables The optional variables used in the URI path.
    * @return A new request object populated with endpoint, resource path and specific
    *         parameters to send.
    */
    protected InternalRequest createRequest(AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
        return super.createRequest(bceRequest, httpMethod, createSignOptions(), pathVariables);
    }

    /**
    * 创建签名选项
    *
    * @return 配置了服务所需签名头的 SignOptions
    */
    private SignOptions createSignOptions() {
        SignOptions signOptions = new SignOptions();
        signOptions.setHeadersToSign(new HashSet<String>(Arrays.asList(HEADERS_TO_SIGN)));
        return signOptions;
    }
}
