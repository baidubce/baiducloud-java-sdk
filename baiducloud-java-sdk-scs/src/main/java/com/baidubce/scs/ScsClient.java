package com.baidubce.scs;

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

public class ScsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_BACKUP = "backup";
    private static final String CONSTANT_URL = "url";
    private static final String CONSTANT_TLS = "tls";
    private static final String CONSTANT_BIND_TAG = "bindTag";
    private static final String CONSTANT_ACL_USER_ACTIONS = "aclUserActions";
    private static final String CONSTANT_AUTHORITY = "authority";
    private static final String CONSTANT_LOG = "log";
    private static final String CONSTANT_RECYCLER = "recycler";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_ENTRANCE = "entrance";
    private static final String CONSTANT_DISCONNECT = "disconnect";
    private static final String CONSTANT_WHITELIST = "whitelist";
    private static final String CONSTANT_POLICY = "policy";
    private static final String CONSTANT_TEMPLATE = "template";
    private static final String CONSTANT_FLUSH = "flush";
    private static final String CONSTANT_GROUP = "group";
    private static final String CONSTANT_CREATE = "create";
    private static final String CONSTANT_SWAP_DOMAIN = "swapDomain";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_SYNC_GROUP = "syncGroup";
    private static final String CONSTANT_MODIFY_BNS_GROUP = "modifyBnsGroup";
    private static final String CONSTANT_SUBNET = "subnet";
    private static final String CONSTANT_RESTART = "restart";
    private static final String CONSTANT_DEPLOY_SET = "deploySet";
    private static final String CONSTANT_RELEASE = "release";
    private static final String CONSTANT_RENEW = "renew";
    private static final String CONSTANT_APPLY = "apply";
    private static final String CONSTANT_MODIFY_PARAMS = "modifyParams";
    private static final String CONSTANT_RECOVER__H_T_T_P = "recover HTTP";
    private static final String CONSTANT_1_1 = "1.1";
    private static final String CONSTANT_QPS = "qps";
    private static final String CONSTANT_RENAME = "rename";
    private static final String CONSTANT_MODIFY_BANDWIDTH = "modifyBandwidth";
    private static final String CONSTANT_SECURITY_GROUP = "securityGroup";
    private static final String CONSTANT_UPDATE = "update";
    private static final String CONSTANT_DELETE__H_T_T_P = "delete HTTP";
    private static final String CONSTANT_SECURITY_IP = "securityIp";
    private static final String CONSTANT_MODIFY_POLICY = "modifyPolicy";
    private static final String CONSTANT_ADD_PARAMS = "addParams";
    private static final String CONSTANT_DELETE_AUTO_SCALING_CONFIG = "deleteAutoScalingConfig";
    private static final String CONSTANT_REMOVE_CLUSTER = "removeCluster";
    private static final String CONSTANT_CHECK = "check";
    private static final String CONSTANT_PRICE = "price";
    private static final String CONSTANT_STALE_READABLE = "stale_readable";
    private static final String CONSTANT_FORBID_WRITE = "forbidWrite";
    private static final String CONSTANT_BLB_STATUS = "blbStatus";
    private static final String CONSTANT_UN_BIND_TAG = "unBindTag";
    private static final String CONSTANT_TO_PREPAY = "toPrepay";
    private static final String CONSTANT_SET_AS_MASTER = "setAsMaster";
    private static final String CONSTANT_AZONE_MIGRATION = "azoneMigration";
    private static final String CONSTANT_MODIFY_ENTRANCE = "modifyEntrance";
    private static final String CONSTANT_STATUS = "status";
    private static final String CONSTANT_PARAMETER = "parameter";
    private static final String CONSTANT_USAGE = "usage";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_RENAME_DOMAIN = "renameDomain";
    private static final String CONSTANT_RECORD = "record";
    private static final String CONSTANT_PROXY_NODE = "proxyNode";
    private static final String CONSTANT_TIME_WINDOW = "timeWindow";
    private static final String CONSTANT_AUDIT = "audit";
    private static final String CONSTANT_SWITCH = "switch";
    private static final String CONSTANT_MODIFY_PASSWD = "modifyPasswd";
    private static final String CONSTANT_SET_AS_LEADER = "setAsLeader";
    private static final String CONSTANT_SWITCH_MASTER_SLAVE = "switchMasterSlave";
    private static final String CONSTANT_MODIFY_PASSWORD = "modifyPassword";
    private static final String CONSTANT_UPGRADE_PROXY = "upgradeProxy";
    private static final String CONSTANT_COMMENT = "comment";
    private static final String CONSTANT_CLUSTER_TYPE_CHANGE = "clusterTypeChange";
    private static final String CONSTANT_NODETYPES = "nodetypes";
    private static final String CONSTANT_CANCEL_TO_POSTPAY = "cancelToPostpay";
    private static final String CONSTANT_DELETE_PARAMS = "deleteParams";
    private static final String CONSTANT_QUIT = "quit";
    private static final String CONSTANT_AUTO_SCALING_CONFIG = "autoScalingConfig";
    private static final String CONSTANT_UNBIND = "unbind";
    private static final String CONSTANT_SYSTEM = "system";
    private static final String CONSTANT_JOIN = "join";
    private static final String CONSTANT_TO_POSTPAY = "toPostpay";
    private static final String CONSTANT_DELAY_INFO = "delayInfo";
    private static final String CONSTANT_UPGRADE_VERSION = "upgradeVersion";
    private static final String CONSTANT_SET_AS_SLAVE = "setAsSlave";
    private static final String CONSTANT_SYNC_STATUS = "syncStatus";
    private static final String CONSTANT_ADD_CLUSTER = "addCluster";
    private static final String CONSTANT_CHANGE = "change";
    private static final String CONSTANT_BIND = "bind";
    private static final String CONSTANT_TDE = "tde";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public ScsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public ScsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * accountList
     * 
     * @param request 入参结构体
     * @return AccountListResponse
     */
    public AccountListResponse accountList(AccountListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACL_USER_ACTIONS);
        return invokeHttpClient(internalRequest, AccountListResponse.class);
    }

    /**
     * addIpWhitelist
     * 
     * @param request 入参结构体
     */
    public void addIpWhitelist(AddIpWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_IP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addParametersToParameterTemplate
     * 
     * @param request 入参结构体
     */
    public void addParametersToParameterTemplate(AddParametersToParameterTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_ADD_PARAMS, request.getTemplateShowId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * applicationParameterTemplate
     * 
     * @param request 入参结构体
     */
    public void applicationParameterTemplate(ApplicationParameterTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_APPLY, request.getTemplateShowId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * auditLogSwitch
     * 
     * @param request 入参结构体
     */
    public void auditLogSwitch(AuditLogSwitchRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_LOG, CONSTANT_AUDIT, CONSTANT_SWITCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchRestoreInstances
     * 
     * @param request 入参结构体
     */
    public void batchRestoreInstances(BatchRestoreInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_RECYCLER, CONSTANT_RECOVER__H_T_T_P, CONSTANT_1_1);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindSecurityGroup
     * 
     * @param request 入参结构体
     * @return BindSecurityGroupResponse
     */
    public BindSecurityGroupResponse bindSecurityGroup(BindSecurityGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_GROUP, CONSTANT_BIND);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BindSecurityGroupResponse.class);
    }

    /**
     * bindTags
     * 
     * @param request 入参结构体
     */
    public void bindTags(BindTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BIND_TAG);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * cancelPrepaidToPostpaid
     * 
     * @param request 入参结构体
     */
    public void cancelPrepaidToPostpaid(CancelPrepaidToPostpaidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, CONSTANT_CANCEL_TO_POSTPAY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * changeAccessPassword
     * 
     * @param request 入参结构体
     */
    public void changeAccessPassword(ChangeAccessPasswordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_MODIFY_PASSWORD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * changeAccountPassword
     * 
     * @param request 入参结构体
     */
    public void changeAccountPassword(ChangeAccountPasswordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, request.getInstanceId(), CONSTANT_ACL_USER_ACTIONS, CONSTANT_MODIFY_PASSWD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * changeConfiguration
     * 
     * @param request 入参结构体
     * @return ChangeConfigurationResponse
     */
    public ChangeConfigurationResponse changeConfiguration(ChangeConfigurationRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_CHANGE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ChangeConfigurationResponse.class);
    }

    /**
     * clearInstance
     * 
     * @param request 入参结构体
     */
    public void clearInstance(ClearInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_FLUSH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * clusterStatusCheck
     * 
     * @param request 入参结构体
     * @return ClusterStatusCheckResponse
     */
    public ClusterStatusCheckResponse clusterStatusCheck(ClusterStatusCheckRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_STATUS);
        return invokeHttpClient(internalRequest, ClusterStatusCheckResponse.class);
    }

    /**
     * clusterTypeUpgrade
     * 
     * @param request 入参结构体
     * @return ClusterTypeUpgradeResponse
     */
    public ClusterTypeUpgradeResponse clusterTypeUpgrade(ClusterTypeUpgradeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_CLUSTER_TYPE_CHANGE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ClusterTypeUpgradeResponse.class);
    }

    /**
     * createAccount
     * 
     * @param request 入参结构体
     */
    public void createAccount(CreateAccountRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACL_USER_ACTIONS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAnInstance
     * 
     * @param request 入参结构体
     * @return CreateAnInstanceResponse
     */
    public CreateAnInstanceResponse createAnInstance(CreateAnInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_INSTANCE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAnInstanceResponse.class);
    }

    /**
     * createDeploymentSet
     * 
     * @param request 入参结构体
     * @return CreateDeploymentSetResponse
     */
    public CreateDeploymentSetResponse createDeploymentSet(CreateDeploymentSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_DEPLOY_SET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateDeploymentSetResponse.class);
    }

    /**
     * createEntrance
     * 
     * @param request 入参结构体
     * @return CreateEntranceResponse
     */
    public CreateEntranceResponse createEntrance(CreateEntranceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENTRANCE, CONSTANT_CREATE, request.getInstanceId());
        return invokeHttpClient(internalRequest, CreateEntranceResponse.class);
    }

    /**
     * createHotGroup
     * 
     * @param request 入参结构体
     * @return CreateHotGroupResponse
     */
    public CreateHotGroupResponse createHotGroup(CreateHotGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateHotGroupResponse.class);
    }

    /**
     * createInstanceWhiteGroup
     * 
     * @param request 入参结构体
     */
    public void createInstanceWhiteGroup(CreateInstanceWhiteGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_WHITELIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createParameterTemplate
     * 
     * @param request 入参结构体
     * @return CreateParameterTemplateResponse
     */
    public CreateParameterTemplateResponse createParameterTemplate(CreateParameterTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateParameterTemplateResponse.class);
    }

    /**
     * createSyncGroup
     * 
     * @param request 入参结构体
     * @return CreateSyncGroupResponse
     */
    public CreateSyncGroupResponse createSyncGroup(CreateSyncGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SYNC_GROUP, CONSTANT_CREATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSyncGroupResponse.class);
    }

    /**
     * deleteAccount
     * 
     * @param request 入参结构体
     */
    public void deleteAccount(DeleteAccountRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, request.getInstanceId(), CONSTANT_ACL_USER_ACTIONS, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteDeploymentSet
     * 
     * @param request 入参结构体
     */
    public void deleteDeploymentSet(DeleteDeploymentSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_DEPLOY_SET, request.getDeploySetId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteInstanceWhiteGroup
     * 
     * @param request 入参结构体
     */
    public void deleteInstanceWhiteGroup(DeleteInstanceWhiteGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_WHITELIST);
        if (request.getGroupName() != null) {
            internalRequest.addParameter("groupName", request.getGroupName());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteInstances
     * 
     * @param request 入参结构体
     */
    public void deleteInstances(DeleteInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_RECYCLER, CONSTANT_DELETE__H_T_T_P, CONSTANT_1_1);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteIpWhitelist
     * 
     * @param request 入参结构体
     */
    public void deleteIpWhitelist(DeleteIpWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_IP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteManualBackup
     * 
     * @param request 入参结构体
     */
    public void deleteManualBackup(DeleteManualBackupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, request.getBatchId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteMemoryScalingConfig
     * 
     * @param request 入参结构体
     */
    public void deleteMemoryScalingConfig(DeleteMemoryScalingConfigRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_DELETE_AUTO_SCALING_CONFIG);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteParameterTemplate
     * 
     * @param request 入参结构体
     */
    public void deleteParameterTemplate(DeleteParameterTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_DELETE, request.getTemplateShowId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteSyncGroup
     * 
     * @param request 入参结构体
     */
    public void deleteSyncGroup(DeleteSyncGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_SYNC_GROUP, request.getSyncGroupShowId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disconnectEntrance
     * 
     * @param request 入参结构体
     * @return DisconnectEntranceResponse
     */
    public DisconnectEntranceResponse disconnectEntrance(DisconnectEntranceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ENTRANCE, CONSTANT_DISCONNECT, request.getInstanceId());
        return invokeHttpClient(internalRequest, DisconnectEntranceResponse.class);
    }

    /**
     * domainNameExchange
     * 
     * @param request 入参结构体
     */
    public void domainNameExchange(DomainNameExchangeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_INSTANCE, CONSTANT_SWAP_DOMAIN);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * gePriceForResizeInstance
     * 
     * @param request 入参结构体
     * @return GePriceForResizeInstanceResponse
     */
    public GePriceForResizeInstanceResponse gePriceForResizeInstance(GePriceForResizeInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GePriceForResizeInstanceResponse.class);
    }

    /**
     * getApplicationParameterTemplateRecords
     * 
     * @param request 入参结构体
     * @return GetApplicationParameterTemplateRecordsResponse
     */
    public GetApplicationParameterTemplateRecordsResponse getApplicationParameterTemplateRecords(GetApplicationParameterTemplateRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_RECORD, request.getTemplateShowId());
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, GetApplicationParameterTemplateRecordsResponse.class);
    }

    /**
     * getAvailableZones
     * 
     * @return GetAvailableZonesResponse
     */
    public GetAvailableZonesResponse getAvailableZones() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, CONSTANT_V1, CONSTANT_ZONE);
        return invokeHttpClient(internalRequest, GetAvailableZonesResponse.class);
    }

    /**
     * getBackUpUrl
     * 
     * @param request 入参结构体
     * @return GetBackUpUrlResponse
     */
    public GetBackUpUrlResponse getBackUpUrl(GetBackUpUrlRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, request.getBackupId(), CONSTANT_URL);
        return invokeHttpClient(internalRequest, GetBackUpUrlResponse.class);
    }

    /**
     * getBackUpUsage
     * 
     * @param request 入参结构体
     * @return GetBackUpUsageResponse
     */
    public GetBackUpUsageResponse getBackUpUsage(GetBackUpUsageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, CONSTANT_USAGE);
        return invokeHttpClient(internalRequest, GetBackUpUsageResponse.class);
    }

    /**
     * getBackupList
     * 
     * @param request 入参结构体
     * @return GetBackupListResponse
     */
    public GetBackupListResponse getBackupList(GetBackupListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP);
        return invokeHttpClient(internalRequest, GetBackupListResponse.class);
    }

    /**
     * getBackupStrategy
     * 
     * @param request 入参结构体
     * @return GetBackupStrategyResponse
     */
    public GetBackupStrategyResponse getBackupStrategy(GetBackupStrategyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, CONSTANT_POLICY);
        return invokeHttpClient(internalRequest, GetBackupStrategyResponse.class);
    }

    /**
     * getClusterBlbStatus
     * 
     * @param request 入参结构体
     * @return GetClusterBlbStatusResponse
     */
    public GetClusterBlbStatusResponse getClusterBlbStatus(GetClusterBlbStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BLB_STATUS);
        return invokeHttpClient(internalRequest, GetClusterBlbStatusResponse.class);
    }

    /**
     * getDeploymentSetList
     * 
     * @return GetDeploymentSetListResponse
     */
    public GetDeploymentSetListResponse getDeploymentSetList() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, CONSTANT_V1, CONSTANT_DEPLOY_SET);
        internalRequest.addParameter("maxKeys", "1");
        internalRequest.addParameter("marker", "-1");
        return invokeHttpClient(internalRequest, GetDeploymentSetListResponse.class);
    }

    /**
     * getHotGroupDetail
     * 
     * @param request 入参结构体
     * @return GetHotGroupDetailResponse
     */
    public GetHotGroupDetailResponse getHotGroupDetail(GetHotGroupDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        return invokeHttpClient(internalRequest, GetHotGroupDetailResponse.class);
    }

    /**
     * getHotGroupList
     * 
     * @param request 入参结构体
     * @return GetHotGroupListResponse
     */
    public GetHotGroupListResponse getHotGroupList(GetHotGroupListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetHotGroupListResponse.class);
    }

    /**
     * getInstanceDetail
     * 
     * @param request 入参结构体
     * @return GetInstanceDetailResponse
     */
    public GetInstanceDetailResponse getInstanceDetail(GetInstanceDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId());
        return invokeHttpClient(internalRequest, GetInstanceDetailResponse.class);
    }

    /**
     * getInstanceList
     * 
     * @param request 入参结构体
     * @return GetInstanceListResponse
     */
    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_INSTANCE);
        return invokeHttpClient(internalRequest, GetInstanceListResponse.class);
    }

    /**
     * getInstanceSpecList
     * 
     * @return GetInstanceSpecListResponse
     */
    public GetInstanceSpecListResponse getInstanceSpecList() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, CONSTANT_V2, CONSTANT_NODETYPES);
        return invokeHttpClient(internalRequest, GetInstanceSpecListResponse.class);
    }

    /**
     * getInstanceWhiteGroup
     * 
     * @param request 入参结构体
     * @return GetInstanceWhiteGroupResponse
     */
    public GetInstanceWhiteGroupResponse getInstanceWhiteGroup(GetInstanceWhiteGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_WHITELIST);
        if (request.getGroupName() != null) {
            internalRequest.addParameter("groupName", request.getGroupName());
        }
        return invokeHttpClient(internalRequest, GetInstanceWhiteGroupResponse.class);
    }

    /**
     * getParameterList
     * 
     * @param request 入参结构体
     * @return GetParameterListResponse
     */
    public GetParameterListResponse getParameterList(GetParameterListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PARAMETER);
        return invokeHttpClient(internalRequest, GetParameterListResponse.class);
    }

    /**
     * getParameterTemplateList
     * 
     * @param request 入参结构体
     * @return GetParameterTemplateListResponse
     */
    public GetParameterTemplateListResponse getParameterTemplateList(GetParameterTemplateListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_LIST);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, GetParameterTemplateListResponse.class);
    }

    /**
     * getPriceForCreateInstance
     * 
     * @param request 入参结构体
     * @return GetPriceForCreateInstanceResponse
     */
    public GetPriceForCreateInstanceResponse getPriceForCreateInstance(GetPriceForCreateInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetPriceForCreateInstanceResponse.class);
    }

    /**
     * getRecycleList
     * 
     * @param request 入参结构体
     * @return GetRecycleListResponse
     */
    public GetRecycleListResponse getRecycleList(GetRecycleListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_RECYCLER, CONSTANT_LIST);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, GetRecycleListResponse.class);
    }

    /**
     * getSubnetList
     * 
     * @param request 入参结构体
     * @return GetSubnetListResponse
     */
    public GetSubnetListResponse getSubnetList(GetSubnetListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_SUBNET);
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        return invokeHttpClient(internalRequest, GetSubnetListResponse.class);
    }

    /**
     * getSyncGroupStatus
     * 
     * @param request 入参结构体
     * @return GetSyncGroupStatusResponse
     */
    public GetSyncGroupStatusResponse getSyncGroupStatus(GetSyncGroupStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SYNC_GROUP, request.getSyncGroupShowId(), CONSTANT_SYNC_STATUS);
        return invokeHttpClient(internalRequest, GetSyncGroupStatusResponse.class);
    }

    /**
     * getSystemParameterList
     * 
     * @param request 入参结构体
     * @return GetSystemParameterListResponse
     */
    public GetSystemParameterListResponse getSystemParameterList(GetSystemParameterListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_SYSTEM);
        if (request.getEngine() != null) {
            internalRequest.addParameter("engine", request.getEngine());
        }
        if (request.getEngineVersion() != null) {
            internalRequest.addParameter("engineVersion", request.getEngineVersion());
        }
        if (request.getClusterType() != null) {
            internalRequest.addParameter("clusterType", request.getClusterType());
        }
        return invokeHttpClient(internalRequest, GetSystemParameterListResponse.class);
    }

    /**
     * getTimeWindow
     * 
     * @param request 入参结构体
     * @return GetTimeWindowResponse
     */
    public GetTimeWindowResponse getTimeWindow(GetTimeWindowRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TIME_WINDOW);
        return invokeHttpClient(internalRequest, GetTimeWindowResponse.class);
    }

    /**
     * getTlsCert
     * 
     * @param request 入参结构体
     * @return GetTlsCertResponse
     */
    public GetTlsCertResponse getTlsCert(GetTlsCertRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TLS);
        return invokeHttpClient(internalRequest, GetTlsCertResponse.class);
    }

    /**
     * hotGroupAddCluster
     * 
     * @param request 入参结构体
     */
    public void hotGroupAddCluster(HotGroupAddClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_JOIN);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * hotGroupChangeMasterRole
     * 
     * @param request 入参结构体
     */
    public void hotGroupChangeMasterRole(HotGroupChangeMasterRoleRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_SET_AS_LEADER, request.getInstanceId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * hotGroupForbidWrite
     * 
     * @param request 入参结构体
     */
    public void hotGroupForbidWrite(HotGroupForbidWriteRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_FORBID_WRITE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * hotGroupModifyName
     * 
     * @param request 入参结构体
     */
    public void hotGroupModifyName(HotGroupModifyNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * hotGroupPreCheck
     * 
     * @param request 入参结构体
     * @return HotGroupPreCheckResponse
     */
    public HotGroupPreCheckResponse hotGroupPreCheck(HotGroupPreCheckRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, CONSTANT_CHECK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, HotGroupPreCheckResponse.class);
    }

    /**
     * hotGroupRemoveCluster
     * 
     * @param request 入参结构体
     */
    public void hotGroupRemoveCluster(HotGroupRemoveClusterRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_QUIT, request.getInstanceId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * hotGroupSetFlowControlRules
     * 
     * @param request 入参结构体
     */
    public void hotGroupSetFlowControlRules(HotGroupSetFlowControlRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_QPS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * hotGroupStaleReadable
     * 
     * @param request 入参结构体
     */
    public void hotGroupStaleReadable(HotGroupStaleReadableRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_STALE_READABLE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * hotGroupSyncStatus
     * 
     * @param request 入参结构体
     * @return HotGroupSyncStatusResponse
     */
    public HotGroupSyncStatusResponse hotGroupSyncStatus(HotGroupSyncStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_SYNC_STATUS);
        return invokeHttpClient(internalRequest, HotGroupSyncStatusResponse.class);
    }

    /**
     * instanceVersionUpgrade
     * 
     * @param request 入参结构体
     */
    public void instanceVersionUpgrade(InstanceVersionUpgradeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_UPGRADE_VERSION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * logDetails
     * 
     * @param request 入参结构体
     * @return LogDetailsResponse
     */
    public LogDetailsResponse logDetails(LogDetailsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_LOG, request.getLogId());
        if (request.getValidSeconds() != null) {
            internalRequest.addParameter("validSeconds", request.getValidSeconds());
        }
        return invokeHttpClient(internalRequest, LogDetailsResponse.class);
    }

    /**
     * logList
     * 
     * @param request 入参结构体
     * @return LogListResponse
     */
    public LogListResponse logList(LogListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_LOG, CONSTANT_LIST);
        internalRequest.addParameter("fileType", "runlog");
        if (request.getStartTime() != null) {
            internalRequest.addParameter("startTime", request.getStartTime());
        }
        if (request.getEndTime() != null) {
            internalRequest.addParameter("endTime", request.getEndTime());
        }
        return invokeHttpClient(internalRequest, LogListResponse.class);
    }

    /**
     * manualBackup
     * 
     * @param request 入参结构体
     */
    public void manualBackup(ManualBackupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * manuallyModifyBandwidth
     * 
     * @param request 入参结构体
     * @return ManuallyModifyBandwidthResponse
     */
    public ManuallyModifyBandwidthResponse manuallyModifyBandwidth(ManuallyModifyBandwidthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_MODIFY_BANDWIDTH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ManuallyModifyBandwidthResponse.class);
    }

    /**
     * masterSlaveSwitch
     * 
     * @param request 入参结构体
     */
    public void masterSlaveSwitch(MasterSlaveSwitchRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SWITCH_MASTER_SLAVE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyBackupComment
     * 
     * @param request 入参结构体
     */
    public void modifyBackupComment(ModifyBackupCommentRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, request.getBatchId(), CONSTANT_COMMENT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyDeploymentSet
     * 
     * @param request 入参结构体
     */
    public void modifyDeploymentSet(ModifyDeploymentSetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_DEPLOY_SET, request.getDeploySetId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyEntrance
     * 
     * @param request 入参结构体
     */
    public void modifyEntrance(ModifyEntranceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_AZONE_MIGRATION, CONSTANT_MODIFY_ENTRANCE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyInstanceDomainName
     * 
     * @param request 入参结构体
     */
    public void modifyInstanceDomainName(ModifyInstanceDomainNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_RENAME_DOMAIN);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyInstanceName
     * 
     * @param request 入参结构体
     */
    public void modifyInstanceName(ModifyInstanceNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_RENAME);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyParameterTemplateName
     * 
     * @param request 入参结构体
     */
    public void modifyParameterTemplateName(ModifyParameterTemplateNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_RENAME, request.getTemplateShowId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyParameters
     * 
     * @param request 入参结构体
     */
    public void modifyParameters(ModifyParametersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PARAMETER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyReplicationZone
     * 
     * @param request 入参结构体
     */
    public void modifyReplicationZone(ModifyReplicationZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_AZONE_MIGRATION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifySyncGroupName
     * 
     * @param request 入参结构体
     */
    public void modifySyncGroupName(ModifySyncGroupNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SYNC_GROUP, request.getSyncGroupShowId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyTimeWindow
     * 
     * @param request 入参结构体
     */
    public void modifyTimeWindow(ModifyTimeWindowRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TIME_WINDOW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * parameterTemplateDeleteParameters
     * 
     * @param request 入参结构体
     */
    public void parameterTemplateDeleteParameters(ParameterTemplateDeleteParametersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_DELETE_PARAMS, request.getTemplateShowId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * parameterTemplateDetails
     * 
     * @param request 入参结构体
     * @return ParameterTemplateDetailsResponse
     */
    public ParameterTemplateDetailsResponse parameterTemplateDetails(ParameterTemplateDetailsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_TEMPLATE, request.getTemplateShowId());
        return invokeHttpClient(internalRequest, ParameterTemplateDetailsResponse.class);
    }

    /**
     * parameterTemplateModifyParameters
     * 
     * @param request 入参结构体
     */
    public void parameterTemplateModifyParameters(ParameterTemplateModifyParametersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_TEMPLATE, CONSTANT_MODIFY_PARAMS, request.getTemplateShowId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * postPaidToPrepaid
     * 
     * @param request 入参结构体
     * @return PostPaidToPrepaidResponse
     */
    public PostPaidToPrepaidResponse postPaidToPrepaid(PostPaidToPrepaidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, CONSTANT_TO_PREPAY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PostPaidToPrepaidResponse.class);
    }

    /**
     * prepaidToPostpaid
     * 
     * @param request 入参结构体
     * @return PrepaidToPostpaidResponse
     */
    public PrepaidToPostpaidResponse prepaidToPostpaid(PrepaidToPostpaidRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, CONSTANT_TO_POSTPAY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PrepaidToPostpaidResponse.class);
    }

    /**
     * proxyNodeReplace
     * 
     * @param request 入参结构体
     */
    public void proxyNodeReplace(ProxyNodeReplaceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PROXY_NODE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * proxyVersionUpgradeOrRestart
     * 
     * @param request 入参结构体
     */
    public void proxyVersionUpgradeOrRestart(ProxyVersionUpgradeOrRestartRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_UPGRADE_PROXY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryIpWhitelist
     * 
     * @param request 入参结构体
     * @return QueryIpWhitelistResponse
     */
    public QueryIpWhitelistResponse queryIpWhitelist(QueryIpWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_IP);
        return invokeHttpClient(internalRequest, QueryIpWhitelistResponse.class);
    }

    /**
     * queryMemoryScalingConfig
     * 
     * @param request 入参结构体
     * @return QueryMemoryScalingConfigResponse
     */
    public QueryMemoryScalingConfigResponse queryMemoryScalingConfig(QueryMemoryScalingConfigRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_AUTO_SCALING_CONFIG);
        return invokeHttpClient(internalRequest, QueryMemoryScalingConfigResponse.class);
    }

    /**
     * releaseHotGroup
     * 
     * @param request 入参结构体
     */
    public void releaseHotGroup(ReleaseHotGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId(), CONSTANT_RELEASE);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseInstance
     * 
     * @param request 入参结构体
     */
    public void releaseInstance(ReleaseInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_1_1);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renewInstance
     * 
     * @param request 入参结构体
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, CONSTANT_RENEW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RenewInstanceResponse.class);
    }

    /**
     * restartInstance
     * 
     * @param request 入参结构体
     */
    public void restartInstance(RestartInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_RESTART);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * setBackupPolicy
     * 
     * @param request 入参结构体
     */
    public void setBackupPolicy(SetBackupPolicyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, CONSTANT_MODIFY_POLICY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * setClusterAsMaster
     * 
     * @param request 入参结构体
     */
    public void setClusterAsMaster(SetClusterAsMasterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SET_AS_MASTER);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * setClusterAsSlave
     * 
     * @param request 入参结构体
     */
    public void setClusterAsSlave(SetClusterAsSlaveRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SET_AS_SLAVE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * setMemoryScalingConfig
     * 
     * @param request 入参结构体
     */
    public void setMemoryScalingConfig(SetMemoryScalingConfigRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_AUTO_SCALING_CONFIG);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * setPermissions
     * 
     * @param request 入参结构体
     */
    public void setPermissions(SetPermissionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, request.getInstanceId(), CONSTANT_ACL_USER_ACTIONS, CONSTANT_AUTHORITY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * syncGroupAddInstance
     * 
     * @param request 入参结构体
     */
    public void syncGroupAddInstance(SyncGroupAddInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_SYNC_GROUP, request.getGroupId(), CONSTANT_ADD_CLUSTER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * syncGroupDelayInfo
     * 
     * @param request 入参结构体
     * @return SyncGroupDelayInfoResponse
     */
    public SyncGroupDelayInfoResponse syncGroupDelayInfo(SyncGroupDelayInfoRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_SYNC_GROUP, request.getGroupId(), CONSTANT_DELAY_INFO);
        return invokeHttpClient(internalRequest, SyncGroupDelayInfoResponse.class);
    }

    /**
     * syncGroupDetail
     * 
     * @param request 入参结构体
     * @return SyncGroupDetailResponse
     */
    public SyncGroupDetailResponse syncGroupDetail(SyncGroupDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SYNC_GROUP, request.getSyncGroupShowId());
        return invokeHttpClient(internalRequest, SyncGroupDetailResponse.class);
    }

    /**
     * syncGroupList
     * 
     * @return SyncGroupListResponse
     */
    public SyncGroupListResponse syncGroupList() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_SYNC_GROUP, CONSTANT_LIST);
        internalRequest.addParameter("page", "1");
        internalRequest.addParameter("pageSize", "10");
        return invokeHttpClient(internalRequest, SyncGroupListResponse.class);
    }

    /**
     * syncGroupModifyBnsgroup
     * 
     * @param request 入参结构体
     */
    public void syncGroupModifyBnsgroup(SyncGroupModifyBnsgroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_SYNC_GROUP, request.getGroupId(), CONSTANT_MODIFY_BNS_GROUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * syncGroupPreCheck
     * 
     * @param request 入参结构体
     * @return SyncGroupPreCheckResponse
     */
    public SyncGroupPreCheckResponse syncGroupPreCheck(SyncGroupPreCheckRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_SYNC_GROUP, CONSTANT_CHECK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, SyncGroupPreCheckResponse.class);
    }

    /**
     * syncGroupRemoveInstance
     * 
     * @param request 入参结构体
     */
    public void syncGroupRemoveInstance(SyncGroupRemoveInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_SYNC_GROUP, request.getGroupId(), CONSTANT_REMOVE_CLUSTER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * tdeEncryption
     * 
     * @param request 入参结构体
     * @return TdeEncryptionResponse
     */
    public TdeEncryptionResponse tdeEncryption(TdeEncryptionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TDE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TdeEncryptionResponse.class);
    }

    /**
     * unbindSecurityGroup
     * 
     * @param request 入参结构体
     * @return UnbindSecurityGroupResponse
     */
    public UnbindSecurityGroupResponse unbindSecurityGroup(UnbindSecurityGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_GROUP, CONSTANT_UNBIND);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UnbindSecurityGroupResponse.class);
    }

    /**
     * unbindTags
     * 
     * @param request 入参结构体
     */
    public void unbindTags(UnbindTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_UN_BIND_TAG);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceWhiteGroup
     * 
     * @param request 入参结构体
     */
    public void updateInstanceWhiteGroup(UpdateInstanceWhiteGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_WHITELIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateSecurityGroup
     * 
     * @param request 入参结构体
     * @return UpdateSecurityGroupResponse
     */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_GROUP, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateSecurityGroupResponse.class);
    }

    /**
     * updateTlsEncryption
     * 
     * @param request 入参结构体
     */
    public void updateTlsEncryption(UpdateTlsEncryptionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TLS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * viewSecurityGroup
     * 
     * @param request 入参结构体
     * @return ViewSecurityGroupResponse
     */
    public ViewSecurityGroupResponse viewSecurityGroup(ViewSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_GROUP);
        return invokeHttpClient(internalRequest, ViewSecurityGroupResponse.class);
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
