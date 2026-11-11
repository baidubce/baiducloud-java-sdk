package com.baidubce.rds;

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

public class RdsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_ACCOUNT = "account";
    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_TABLE_LEVEL = "tableLevel";
    private static final String CONSTANT_UPDATE_DESC = "update_desc";
    private static final String CONSTANT_STATUS = "status";
    private static final String CONSTANT_BACKUP = "backup";
    private static final String CONSTANT_BINLOGS = "binlogs";
    private static final String CONSTANT_PARA_TEMPLATE = "paraTemplate";
    private static final String CONSTANT_TEMPLATE = "template";
    private static final String CONSTANT_DETAIL = "detail";
    private static final String CONSTANT_PORT = "port";
    private static final String CONSTANT_SLOWLOGS = "slowlogs";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_DESC = "desc";
    private static final String CONSTANT_RENEW = "renew";
    private static final String CONSTANT_PASSWORD = "password";
    private static final String CONSTANT_SSL = "ssl";
    private static final String CONSTANT_STATIC = "static";
    private static final String CONSTANT_CA = "ca";
    private static final String CONSTANT_AUTO_RESIZE_CONFIG = "autoResizeConfig";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_DATABASES = "databases";
    private static final String CONSTANT_PARAMETER = "parameter";
    private static final String CONSTANT_HISTORY = "history";
    private static final String CONSTANT_SUBNET = "subnet";
    private static final String CONSTANT_SECURITY_IP = "securityIp";
    private static final String CONSTANT_ERRORLOGS = "errorlogs";
    private static final String CONSTANT_DUPLICATE = "duplicate";
    private static final String CONSTANT_MAINTAINTIME = "maintaintime";
    private static final String CONSTANT_TAGS = "tags";
    private static final String CONSTANT_RECOVERY_TO_SOURCE_INSTANCE_BY_SNAPSHOT = "recoveryToSourceInstanceBySnapshot";
    private static final String CONSTANT_DISK_AUTO_RESIZE = "diskAutoResize";
    private static final String CONSTANT_CONFIG = "config";
    private static final String CONSTANT_CREATE = "create";
    private static final String CONSTANT_PROBE = "probe";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_PG = "pg";
    private static final String CONSTANT_LOG_LIST = "logList";
    private static final String CONSTANT_PRIVILEGES = "privileges";
    private static final String CONSTANT_RECOVERY_TO_SOURCE_INSTANCE_BY_DATETIME = "recoveryToSourceInstanceByDatetime";
    private static final String CONSTANT_TARGET = "target";
    private static final String CONSTANT_REGION = "region";
    private static final String CONSTANT_REMARK = "remark";
    private static final String CONSTANT_DOWNLOAD = "download";
    private static final String CONSTANT_AUTO_EXPANSION = "autoExpansion";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public RdsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public RdsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addAccountApiAtTableGranularity
     * 
     * @param request 入参结构体
     */
    public void addAccountApiAtTableGranularity(AddAccountApiAtTableGranularityRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACCOUNT, CONSTANT_TABLE_LEVEL, CONSTANT_CREATE);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * batchConfigurationOfInstances
     * 
     * @param request 入参结构体
     * @return BatchConfigurationOfInstancesResponse
     */
    public BatchConfigurationOfInstancesResponse batchConfigurationOfInstances(BatchConfigurationOfInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("resize", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchConfigurationOfInstancesResponse.class);
    }

    /**
     * bindingTags
     * 
     * @param request 入参结构体
     */
    public void bindingTags(BindingTagsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, CONSTANT_TAGS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * changeAccountPassword
     * 
     * @param request 入参结构体
     */
    public void changeAccountPassword(ChangeAccountPasswordRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        VERSION_V1,
                        CONSTANT_INSTANCE,
                        request.getInstanceId(),
                        CONSTANT_ACCOUNT,
                        request.getAccountName(),
                        CONSTANT_PASSWORD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * checkTheWhitelist
     * 
     * @param request 入参结构体
     * @return CheckTheWhitelistResponse
     */
    public CheckTheWhitelistResponse checkTheWhitelist(CheckTheWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_IP);
        return invokeHttpClient(internalRequest, CheckTheWhitelistResponse.class);
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
     * copyParameterTemplate
     * 
     * @param request 入参结构体
     */
    public void copyParameterTemplate(CopyParameterTemplateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, CONSTANT_PARA_TEMPLATE, CONSTANT_DUPLICATE, CONSTANT_TEMPLATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createADatabase
     * 
     * @param request 入参结构体
     */
    public void createADatabase(CreateADatabaseRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_DATABASES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAPrimaryInstance
     * 
     * @param request 入参结构体
     * @return CreateAPrimaryInstanceResponse
     */
    public CreateAPrimaryInstanceResponse createAPrimaryInstance(CreateAPrimaryInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAPrimaryInstanceResponse.class);
    }

    /**
     * createAProxyInstance
     * 
     * @param request 入参结构体
     * @return CreateAProxyInstanceResponse
     */
    public CreateAProxyInstanceResponse createAProxyInstance(CreateAProxyInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE);
        internalRequest.addParameter("rdsproxy", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAProxyInstanceResponse.class);
    }

    /**
     * createAccount
     * 
     * @param request 入参结构体
     */
    public void createAccount(CreateAccountRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACCOUNT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createReadOnlyInstance
     * 
     * @param request 入参结构体
     * @return CreateReadOnlyInstanceResponse
     */
    public CreateReadOnlyInstanceResponse createReadOnlyInstance(CreateReadOnlyInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE);
        internalRequest.addParameter("readReplica", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateReadOnlyInstanceResponse.class);
    }

    /**
     * deleteAccount
     * 
     * @param request 入参结构体
     */
    public void deleteAccount(DeleteAccountRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACCOUNT, request.getAccountName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteTheDatabase
     * 
     * @param request 入参结构体
     */
    public void deleteTheDatabase(DeleteTheDatabaseRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_DATABASES, request.getDbName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteTheSpecifiedBackupSet
     * 
     * @param request 入参结构体
     */
    public void deleteTheSpecifiedBackupSet(DeleteTheSpecifiedBackupSetRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, request.getSnapshotId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * dialTestInterface
     * 
     * @param request 入参结构体
     * @return DialTestInterfaceResponse
     */
    public DialTestInterfaceResponse dialTestInterface(DialTestInterfaceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PROBE);
        return invokeHttpClient(internalRequest, DialTestInterfaceResponse.class);
    }

    /**
     * doesTheInstanceSupportEnablingAutomaticExpansion
     * 
     * @param request 入参结构体
     * @return DoesTheInstanceSupportEnablingAutomaticExpansionResponse
     */
    public DoesTheInstanceSupportEnablingAutomaticExpansionResponse doesTheInstanceSupportEnablingAutomaticExpansion(
            DoesTheInstanceSupportEnablingAutomaticExpansionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_AUTO_EXPANSION);
        return invokeHttpClient(internalRequest, DoesTheInstanceSupportEnablingAutomaticExpansionResponse.class);
    }

    /**
     * errorLogList
     * 
     * @param request 入参结构体
     * @return ErrorLogListResponse
     */
    public ErrorLogListResponse errorLogList(ErrorLogListRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_INSTANCE,
                        request.getInstanceId(),
                        CONSTANT_ERRORLOGS,
                        CONSTANT_LOG_LIST,
                        request.getDatetime());
        return invokeHttpClient(internalRequest, ErrorLogListResponse.class);
    }

    /**
     * getParameterTemplateDetails
     * 
     * @param request 入参结构体
     * @return GetParameterTemplateDetailsResponse
     */
    public GetParameterTemplateDetailsResponse getParameterTemplateDetails(GetParameterTemplateDetailsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_INSTANCE,
                        CONSTANT_PARA_TEMPLATE,
                        CONSTANT_TEMPLATE,
                        CONSTANT_DETAIL,
                        request.getTemplateId());
        return invokeHttpClient(internalRequest, GetParameterTemplateDetailsResponse.class);
    }

    /**
     * getParameterTemplateList
     * 
     * @param request 入参结构体
     * @return GetParameterTemplateListResponse
     */
    public GetParameterTemplateListResponse getParameterTemplateList(GetParameterTemplateListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, CONSTANT_PARA_TEMPLATE);
        internalRequest.addParameter("pageNo", "1");
        internalRequest.addParameter("pageSize", "10");
        internalRequest.addParameter("type", "system");
        if (request.getDbType() != null) {
            internalRequest.addParameter("dbType", request.getDbType());
        }
        if (request.getDbVersion() != null) {
            internalRequest.addParameter("dbVersion", request.getDbVersion());
        }
        return invokeHttpClient(internalRequest, GetParameterTemplateListResponse.class);
    }

    /**
     * getPgLogDetails
     * 
     * @param request 入参结构体
     * @return GetPgLogDetailsResponse
     */
    public GetPgLogDetailsResponse getPgLogDetails(GetPgLogDetailsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PG, CONSTANT_DOWNLOAD);
        if (request.getPglogId() != null) {
            internalRequest.addParameter("pglogId", request.getPglogId());
        }
        if (request.getDownloadValidTimeInSec() != null) {
            internalRequest.addParameter("downloadValidTimeInSec", String.valueOf(request.getDownloadValidTimeInSec()));
        }
        return invokeHttpClient(internalRequest, GetPgLogDetailsResponse.class);
    }

    /**
     * getPgLogList
     * 
     * @param request 入参结构体
     * @return GetPgLogListResponse
     */
    public GetPgLogListResponse getPgLogList(GetPgLogListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PG, CONSTANT_LIST);
        if (request.getDate() != null) {
            internalRequest.addParameter("date", request.getDate());
        }
        return invokeHttpClient(internalRequest, GetPgLogListResponse.class);
    }

    /**
     * instanceEnablesAutomaticRenewal
     * 
     * @param request 入参结构体
     */
    public void instanceEnablesAutomaticRenewal(InstanceEnablesAutomaticRenewalRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE);
        internalRequest.addParameter("autoRenew", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * manuallyInitiateFullPhysicalBackup
     * 
     * @param request 入参结构体
     */
    public void manuallyInitiateFullPhysicalBackup(ManuallyInitiateFullPhysicalBackupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyAccountNotes
     * 
     * @param request 入参结构体
     */
    public void modifyAccountNotes(ModifyAccountNotesRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACCOUNT, request.getAccountName(), CONSTANT_DESC);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyAccountPermissions
     * 
     * @param request 入参结构体
     */
    public void modifyAccountPermissions(ModifyAccountPermissionsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        VERSION_V1,
                        CONSTANT_INSTANCE,
                        request.getInstanceId(),
                        CONSTANT_ACCOUNT,
                        request.getAccountName(),
                        CONSTANT_PRIVILEGES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyBackupStrategy
     * 
     * @param request 入参结构体
     */
    public void modifyBackupStrategy(ModifyBackupStrategyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("modifyBackupPolicy", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyConfigurationParameters
     * 
     * @param request 入参结构体
     */
    public void modifyConfigurationParameters(ModifyConfigurationParametersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PARAMETER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyDatabasePort
     * 
     * @param request 入参结构体
     */
    public void modifyDatabasePort(ModifyDatabasePortRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PORT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyDescriptionInformation
     * 
     * @param request 入参结构体
     */
    public void modifyDescriptionInformation(ModifyDescriptionInformationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_DATABASES, request.getDbName(), CONSTANT_REMARK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * obtainBinlogInformation
     * 
     * @param request 入参结构体
     * @return ObtainBinlogInformationResponse
     */
    public ObtainBinlogInformationResponse obtainBinlogInformation(ObtainBinlogInformationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_INSTANCE,
                        request.getInstanceId(),
                        CONSTANT_BINLOGS,
                        request.getLogId(),
                        request.getDownloadValidTimeInSec());
        return invokeHttpClient(internalRequest, ObtainBinlogInformationResponse.class);
    }

    /**
     * obtainSslEncryptionCertificate
     * 
     * @return ObtainSslEncryptionCertificateResponse
     */
    public ObtainSslEncryptionCertificateResponse obtainSslEncryptionCertificate() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, CONSTANT_SSL, CONSTANT_STATIC, CONSTANT_CA);
        return invokeHttpClient(internalRequest, ObtainSslEncryptionCertificateResponse.class);
    }

    /**
     * obtainSslEncryptionInformation
     * 
     * @param request 入参结构体
     * @return ObtainSslEncryptionInformationResponse
     */
    public ObtainSslEncryptionInformationResponse obtainSslEncryptionInformation(ObtainSslEncryptionInformationRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, CONSTANT_SSL, request.getInstanceId());
        return invokeHttpClient(internalRequest, ObtainSslEncryptionInformationResponse.class);
    }

    /**
     * queryAccountDetails
     * 
     * @param request 入参结构体
     * @return QueryAccountDetailsResponse
     */
    public QueryAccountDetailsResponse queryAccountDetails(QueryAccountDetailsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACCOUNT, request.getAccountName());
        return invokeHttpClient(internalRequest, QueryAccountDetailsResponse.class);
    }

    /**
     * queryAccountList
     * 
     * @param request 入参结构体
     * @return QueryAccountListResponse
     */
    public QueryAccountListResponse queryAccountList(QueryAccountListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACCOUNT);
        return invokeHttpClient(internalRequest, QueryAccountListResponse.class);
    }

    /**
     * queryAndModifyHistory
     * 
     * @param request 入参结构体
     * @return QueryAndModifyHistoryResponse
     */
    public QueryAndModifyHistoryResponse queryAndModifyHistory(QueryAndModifyHistoryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PARAMETER, CONSTANT_HISTORY);
        return invokeHttpClient(internalRequest, QueryAndModifyHistoryResponse.class);
    }

    /**
     * queryBackupDetails
     * 
     * @param request 入参结构体
     * @return QueryBackupDetailsResponse
     */
    public QueryBackupDetailsResponse queryBackupDetails(QueryBackupDetailsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, request.getBackupId());
        return invokeHttpClient(internalRequest, QueryBackupDetailsResponse.class);
    }

    /**
     * queryBackupList
     * 
     * @param request 入参结构体
     * @return QueryBackupListResponse
     */
    public QueryBackupListResponse queryBackupList(QueryBackupListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryBackupListResponse.class);
    }

    /**
     * queryInstanceList
     * 
     * @param request 入参结构体
     * @return QueryInstanceListResponse
     */
    public QueryInstanceListResponse queryInstanceList(QueryInstanceListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getVnetIp() != null) {
            internalRequest.addParameter("vnetIp", request.getVnetIp());
        }
        return invokeHttpClient(internalRequest, QueryInstanceListResponse.class);
    }

    /**
     * queryParameterList
     * 
     * @param request 入参结构体
     * @return QueryParameterListResponse
     */
    public QueryParameterListResponse queryParameterList(QueryParameterListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_PARAMETER);
        internalRequest.addParameter("keyword", "keyword");
        return invokeHttpClient(internalRequest, QueryParameterListResponse.class);
    }

    /**
     * querySubnetList
     * 
     * @param request 入参结构体
     * @return QuerySubnetListResponse
     */
    public QuerySubnetListResponse querySubnetList(QuerySubnetListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SUBNET);
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        if (request.getVpcId() != null) {
            internalRequest.addParameter("vpcId", request.getVpcId());
        }
        return invokeHttpClient(internalRequest, QuerySubnetListResponse.class);
    }

    /**
     * queryTaskList
     * 
     * @param request 入参结构体
     * @return QueryTaskListResponse
     */
    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, CONSTANT_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, QueryTaskListResponse.class);
    }

    /**
     * queryTheDetailsOfTheSpecifiedInstance
     * 
     * @param request 入参结构体
     * @return QueryTheDetailsOfTheSpecifiedInstanceResponse
     */
    public QueryTheDetailsOfTheSpecifiedInstanceResponse queryTheDetailsOfTheSpecifiedInstance(QueryTheDetailsOfTheSpecifiedInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        return invokeHttpClient(internalRequest, QueryTheDetailsOfTheSpecifiedInstanceResponse.class);
    }

    /**
     * queryTheListOfAvailableZones
     * 
     * @return QueryTheListOfAvailableZonesResponse
     */
    public QueryTheListOfAvailableZonesResponse queryTheListOfAvailableZones() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_ZONE);
        return invokeHttpClient(internalRequest, QueryTheListOfAvailableZonesResponse.class);
    }

    /**
     * releaseInstance
     * 
     * @param request 入参结构体
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_INSTANCE);
        if (request.getInstanceIds() != null) {
            internalRequest.addParameter("instanceIds", request.getInstanceIds());
        }
        return invokeHttpClient(internalRequest, ReleaseInstanceResponse.class);
    }

    /**
     * renewalExample
     * 
     * @param request 入参结构体
     * @return RenewalExampleResponse
     */
    public RenewalExampleResponse renewalExample(RenewalExampleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_INSTANCE, CONSTANT_RENEW);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RenewalExampleResponse.class);
    }

    /**
     * restartTheInstance
     * 
     * @param request 入参结构体
     */
    public void restartTheInstance(RestartTheInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("reboot", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * restoreLibraryTablesBasedOnBackupSets
     * 
     * @param request 入参结构体
     */
    public void restoreLibraryTablesBasedOnBackupSets(RestoreLibraryTablesBasedOnBackupSetsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_RECOVERY_TO_SOURCE_INSTANCE_BY_SNAPSHOT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * restoreTheDatabaseTableByTimePoint
     * 
     * @param request 入参结构体
     */
    public void restoreTheDatabaseTableByTimePoint(RestoreTheDatabaseTableByTimePointRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_RECOVERY_TO_SOURCE_INSTANCE_BY_DATETIME);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * retrieveDatabaseList
     * 
     * @param request 入参结构体
     * @return RetrieveDatabaseListResponse
     */
    public RetrieveDatabaseListResponse retrieveDatabaseList(RetrieveDatabaseListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_DATABASES);
        return invokeHttpClient(internalRequest, RetrieveDatabaseListResponse.class);
    }

    /**
     * retrieveInstanceAutoScalingConfig
     * 
     * @param request 入参结构体
     * @return RetrieveInstanceAutoScalingConfigResponse
     */
    public RetrieveInstanceAutoScalingConfigResponse retrieveInstanceAutoScalingConfig(RetrieveInstanceAutoScalingConfigRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_AUTO_RESIZE_CONFIG);
        return invokeHttpClient(internalRequest, RetrieveInstanceAutoScalingConfigResponse.class);
    }

    /**
     * retrieveTheBinlogList
     * 
     * @param request 入参结构体
     * @return RetrieveTheBinlogListResponse
     */
    public RetrieveTheBinlogListResponse retrieveTheBinlogList(RetrieveTheBinlogListRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BINLOGS, request.getDatetime());
        return invokeHttpClient(internalRequest, RetrieveTheBinlogListResponse.class);
    }

    /**
     * setEncryptionPolicyApi
     * 
     * @param request 入参结构体
     */
    public void setEncryptionPolicyApi(SetEncryptionPolicyApiRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("updateEncryptPolicy", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * slowLogList
     * 
     * @param request 入参结构体
     * @return SlowLogListResponse
     */
    public SlowLogListResponse slowLogList(SlowLogListRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_INSTANCE,
                        request.getInstanceId(),
                        CONSTANT_SLOWLOGS,
                        CONSTANT_LOG_LIST,
                        request.getDatetime());
        return invokeHttpClient(internalRequest, SlowLogListResponse.class);
    }

    /**
     * tableGranularityQueryUserDetailsApi
     * 
     * @param request 入参结构体
     * @return TableGranularityQueryUserDetailsApiResponse
     */
    public TableGranularityQueryUserDetailsApiResponse tableGranularityQueryUserDetailsApi(TableGranularityQueryUserDetailsApiRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_INSTANCE, CONSTANT_ACCOUNT, CONSTANT_TABLE_LEVEL, CONSTANT_DETAIL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TableGranularityQueryUserDetailsApiResponse.class);
    }

    /**
     * tableGranularityQueryUserListApi
     * 
     * @param request 入参结构体
     * @return TableGranularityQueryUserListApiResponse
     */
    public TableGranularityQueryUserListApiResponse tableGranularityQueryUserListApi(TableGranularityQueryUserListApiRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_ACCOUNT, CONSTANT_TABLE_LEVEL, CONSTANT_LIST);
        return invokeHttpClient(internalRequest, TableGranularityQueryUserListApiResponse.class);
    }

    /**
     * tableGranularityUpdateUserDescriptionApi
     * 
     * @param request 入参结构体
     */
    public void tableGranularityUpdateUserDescriptionApi(TableGranularityUpdateUserDescriptionApiRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_INSTANCE, CONSTANT_ACCOUNT, CONSTANT_TABLE_LEVEL, CONSTANT_UPDATE_DESC);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * targetRegionMappingListApi
     * 
     * @param request 入参结构体
     * @return TargetRegionMappingListApiResponse
     */
    public TargetRegionMappingListApiResponse targetRegionMappingListApi(TargetRegionMappingListApiRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BACKUP, CONSTANT_TARGET, CONSTANT_REGION);
        return invokeHttpClient(internalRequest, TargetRegionMappingListApiResponse.class);
    }

    /**
     * transformationExample
     * 
     * @param request 入参结构体
     * @return TransformationExampleResponse
     */
    public TransformationExampleResponse transformationExample(TransformationExampleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("resize", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TransformationExampleResponse.class);
    }

    /**
     * updateAutomaticStorageExpansionConfiguration
     * 
     * @param request 入参结构体
     */
    public void updateAutomaticStorageExpansionConfiguration(UpdateAutomaticStorageExpansionConfigurationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        VERSION_V1,
                        CONSTANT_INSTANCE,
                        request.getInstanceId(),
                        CONSTANT_DISK_AUTO_RESIZE,
                        CONSTANT_CONFIG,
                        request.getAction());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceConnectionInformation
     * 
     * @param request 入参结构体
     */
    public void updateInstanceConnectionInformation(UpdateInstanceConnectionInformationRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("modifyEndpoint", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceName
     * 
     * @param request 入参结构体
     */
    public void updateInstanceName(UpdateInstanceNameRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("rename", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstancePublicNetworkAccessStatus
     * 
     * @param request 入参结构体
     */
    public void updateInstancePublicNetworkAccessStatus(UpdateInstancePublicNetworkAccessStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("modifyPublicAccess", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceSynchronizationMode
     * 
     * @param request 入参结构体
     */
    public void updateInstanceSynchronizationMode(UpdateInstanceSynchronizationModeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId());
        internalRequest.addParameter("modifySyncMode", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateTimeWindow
     * 
     * @param request 入参结构体
     */
    public void updateTimeWindow(UpdateTimeWindowRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_MAINTAINTIME);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateWhitelist
     * 
     * @param request 入参结构体
     */
    public void updateWhitelist(UpdateWhitelistRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_SECURITY_IP);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
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
