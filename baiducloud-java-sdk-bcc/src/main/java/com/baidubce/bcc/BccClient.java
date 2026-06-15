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

public class BccClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V2 = "v2";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_ATTRIBUTE = "attribute";
    private static final String CONSTANT_GET_USERDATA = "getUserdata";
    private static final String CONSTANT_IMAGE = "image";
    private static final String CONSTANT_TAG = "tag";
    private static final String CONSTANT_VOLUME = "volume";
    private static final String CONSTANT_BATCH_DEL_IP = "batchDelIp";
    private static final String CONSTANT_PROGRESS = "progress";
    private static final String CONSTANT_DISK = "disk";
    private static final String CONSTANT_QUOTA = "quota";
    private static final String CONSTANT_BATCH = "batch";
    private static final String CONSTANT_CHARGING = "charging";
    private static final String CONSTANT_GET_PRICE = "getPrice";
    private static final String CONSTANT_RECOVERY = "recovery";
    private static final String CONSTANT_GET_AVAILABLE_IMAGES_BY_SPEC = "getAvailableImagesBySpec";
    private static final String CONSTANT_ROLE = "role";
    private static final String CONSTANT_RENAME = "rename";
    private static final String CONSTANT_SUBNET = "subnet";
    private static final String CONSTANT_CHANGE_SUBNET = "changeSubnet";
    private static final String CONSTANT_BATCH_CREATE_AUTO_RENEW_RULES = "batchCreateAutoRenewRules";
    private static final String CONSTANT_VPC = "vpc";
    private static final String CONSTANT_CHANGE_VPC = "changeVpc";
    private static final String CONSTANT_BATCH_DELETE_AUTO_RENEW_RULES = "batchDeleteAutoRenewRules";
    private static final String CONSTANT_VNC = "vnc";
    private static final String CONSTANT_ADD_IPV6 = "addIpv6";
    private static final String CONSTANT_DELETION_PROTECTION = "deletionProtection";
    private static final String CONSTANT_RECYCLE = "recycle";
    private static final String CONSTANT_BATCH_ACTION = "batchAction";
    private static final String CONSTANT_SHARED_USERS = "sharedUsers";
    private static final String CONSTANT_NO_CHARGE = "noCharge";
    private static final String CONSTANT_REBUILD = "rebuild";
    private static final String CONSTANT_INSTANCE_BATCH_BY_SPEC = "instanceBatchBySpec";
    private static final String CONSTANT_MODIFY_RELATED_DELETE_POLICY = "modifyRelatedDeletePolicy";
    private static final String CONSTANT_DEPLOYSET = "deployset";
    private static final String CONSTANT_DEL_RELATION = "delRelation";
    private static final String CONSTANT_DEL_IPV6 = "delIpv6";
    private static final String CONSTANT_ENI = "eni";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_BATCH_ADD_IP = "batchAddIp";
    private static final String CONSTANT_INSTANCE_BY_SPEC = "instanceBySpec";
    private static final String CONSTANT_BATCH_DELETE = "batchDelete";
    private static final String CONSTANT_BATCH_REFUND_RESOURCE = "batchRefundResource";
    private static final String CONSTANT_LIST_BY_INSTANCE_ID = "listByInstanceId";
    private static final String CONSTANT_IMPORT = "import";
    private static final String CONSTANT_OS = "os";
    private static final String CONSTANT_RESCUE = "rescue";
    private static final String CONSTANT_MODE = "mode";
    private static final String CONSTANT_EXIT = "exit";
    private static final String CONSTANT_ENTER = "enter";
    private static final String CONSTANT_DELETE = "delete";

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
     * deleteImage
     * 
     * @param request 入参结构体
     */
    public void deleteImage(DeleteImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_IMAGE, request.getImageId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
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
     * getRoleList
     * 
     * @return GetRoleListResponse
     */
    public GetRoleListResponse getRoleList() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V2, CONSTANT_INSTANCE, CONSTANT_ROLE, CONSTANT_LIST);
        return invokeHttpClient(internalRequest, GetRoleListResponse.class);
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
