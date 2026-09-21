package com.baidubce.vdb;

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

import com.baidubce.vdb.models.AccountListUsingGETRequest;
import com.baidubce.vdb.models.AccountListUsingGETResponse;
import com.baidubce.vdb.models.BindEipUsingPOSTRequest;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTResponse;
import com.baidubce.vdb.models.DeleteInstanceUsingDELETERequest;
import com.baidubce.vdb.models.DeleteRecordUsingDELETERequest;
import com.baidubce.vdb.models.DeleteRecyclerInstanceRequest;
import com.baidubce.vdb.models.DescribeInstanceConfigsRequest;
import com.baidubce.vdb.models.GetConfigUsingGETRequest;
import com.baidubce.vdb.models.GetConfigUsingGETResponse;
import com.baidubce.vdb.models.GetFreeInstanceQuotaResponse;
import com.baidubce.vdb.models.GetInstanceListUsingGETRequest;
import com.baidubce.vdb.models.GetInstanceListUsingGETResponse;
import com.baidubce.vdb.models.GetNodeSpecListUsingGETRequest;
import com.baidubce.vdb.models.GetPriceUsingPOSTRequest;
import com.baidubce.vdb.models.GetPriceUsingPOSTResponse;
import com.baidubce.vdb.models.GetQuotaUsingGETRequest;
import com.baidubce.vdb.models.GetQuotaUsingGETResponse;
import com.baidubce.vdb.models.GetTLSCertificateUsingGETRequest;
import com.baidubce.vdb.models.GetTLSCertificateUsingGETResponse;
import com.baidubce.vdb.models.GetTLSInfoUsingGETRequest;
import com.baidubce.vdb.models.GetTLSInfoUsingGETResponse;
import com.baidubce.vdb.models.Getinstancelistusingget1Request;
import com.baidubce.vdb.models.Getinstancelistusingget1Response;
import com.baidubce.vdb.models.InstanceDetailUsingGETRequest;
import com.baidubce.vdb.models.InstanceDetailUsingGETResponse;
import com.baidubce.vdb.models.ListRecordsUsingGETRequest;
import com.baidubce.vdb.models.ListRecordsUsingGETResponse;
import com.baidubce.vdb.models.ManualBackupUsingPOSTRequest;
import com.baidubce.vdb.models.ModifyInstanceConfigRequest;
import com.baidubce.vdb.models.ModifyPasswordUsingPOSTRequest;
import com.baidubce.vdb.models.ModifyPublicAccessRequest;
import com.baidubce.vdb.models.ModifyTLSUsingPUTRequest;
import com.baidubce.vdb.models.PasswordUsingGETRequest;
import com.baidubce.vdb.models.PasswordUsingGETResponse;
import com.baidubce.vdb.models.RecoverInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.RecoverUsingPOSTRequest;
import com.baidubce.vdb.models.ResizeInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.ResizeInstanceUsingPOSTResponse;
import com.baidubce.vdb.models.SetCommentUsingPOSTRequest;
import com.baidubce.vdb.models.SetConfigUsingPOSTRequest;
import com.baidubce.vdb.models.UnbindEipUsingPOSTRequest;
import com.baidubce.vdb.models.UpdateInstanceDomainRequest;
import com.baidubce.vdb.models.UpdateInstanceNameRequest;
import com.baidubce.vdb.models.ZoneListUsingGETRequest;
import com.baidubce.vdb.models.ZoneListUsingGETResponse;

public class VdbClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_VDB = "vdb";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_PRICE = "price";
    private static final String CONSTANT_ACCOUNT = "account";
    private static final String CONSTANT_RESET_PASSWORD = "resetPassword";
    private static final String CONSTANT_MODIFY_PUBLIC_ACCESS = "modifyPublicAccess";
    private static final String CONSTANT_DETAIL = "detail";
    private static final String CONSTANT_DESCRIBE_INSTANCE_CONFIGS = "describeInstanceConfigs";
    private static final String CONSTANT_MODIFY_INSTANCE_CONFIG = "modifyInstanceConfig";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_PASSWORD = "password";
    private static final String CONSTANT_BACKUP = "backup";
    private static final String CONSTANT_SET_COMMENT = "setComment";
    private static final String CONSTANT_RECYCLER = "recycler";
    private static final String CONSTANT_MODIFY_DOMAIN = "modifyDomain";
    private static final String CONSTANT_RECOVER = "recover";
    private static final String CONSTANT_BIND_EIP = "bindEip";
    private static final String CONSTANT_MANUAL_BACKUP = "manualBackup";
    private static final String CONSTANT_SECURITY = "security";
    private static final String CONSTANT_MODIFY_T_L_S = "modifyTLS";
    private static final String CONSTANT_CREATE = "create";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_RESIZE = "resize";
    private static final String CONSTANT_GET_T_L_S_CERTIFICATE = "getTLSCertificate";
    private static final String CONSTANT_DELETE_RECORD = "deleteRecord";
    private static final String CONSTANT_LIST_RECORDS = "listRecords";
    private static final String CONSTANT_GET_CONFIG = "getConfig";
    private static final String CONSTANT_GET_NODE_SPEC_LIST = "getNodeSpecList";
    private static final String CONSTANT_UNBIND_EIP = "unbindEip";
    private static final String CONSTANT_QUOTA = "quota";
    private static final String CONSTANT_MODIFY_NAME = "modifyName";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_GET_T_L_S_INFO = "getTLSInfo";
    private static final String CONSTANT_FREE_QUOTA = "freeQuota";
    private static final String CONSTANT_SET_CONFIG = "setConfig";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public VdbClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public VdbClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * accountListUsingGET
     * 
     * @param request 入参结构体
     * @return AccountListUsingGETResponse
     */
    public AccountListUsingGETResponse accountListUsingGET(AccountListUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_ACCOUNT, CONSTANT_LIST);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, AccountListUsingGETResponse.class);
    }

    /**
     * bindEipUsingPOST
     * 
     * @param request 入参结构体
     */
    public void bindEipUsingPOST(BindEipUsingPOSTRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_BIND_EIP);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createInstanceUsingPOST
     * 
     * @param request 入参结构体
     * @return CreateInstanceUsingPOSTResponse
     */
    public CreateInstanceUsingPOSTResponse createInstanceUsingPOST(CreateInstanceUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_CREATE);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, CreateInstanceUsingPOSTResponse.class);
    }

    /**
     * deleteInstanceUsingDELETE
     * 
     * @param request 入参结构体
     */
    public void deleteInstanceUsingDELETE(DeleteInstanceUsingDELETERequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_DELETE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRecordUsingDELETE
     * 
     * @param request 入参结构体
     */
    public void deleteRecordUsingDELETE(DeleteRecordUsingDELETERequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_DELETE_RECORD);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        if (request.getBatchId() != null) {
            internalRequest.addParameter("batchId", request.getBatchId());
        }
        if (request.getBackupId() != null) {
            internalRequest.addParameter("backupId", request.getBackupId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRecyclerInstance
     * 
     * @param request 入参结构体
     */
    public void deleteRecyclerInstance(DeleteRecyclerInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_VDB, CONSTANT_RECYCLER, CONSTANT_INSTANCE, CONSTANT_DELETE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * describeInstanceConfigs
     * 
     * @param request 入参结构体
     */
    public void describeInstanceConfigs(DescribeInstanceConfigsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_DESCRIBE_INSTANCE_CONFIGS);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getConfigUsingGET
     * 
     * @param request 入参结构体
     * @return GetConfigUsingGETResponse
     */
    public GetConfigUsingGETResponse getConfigUsingGET(GetConfigUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_GET_CONFIG);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, GetConfigUsingGETResponse.class);
    }

    /**
     * getFreeInstanceQuota
     * 
     * @return GetFreeInstanceQuotaResponse
     */
    public GetFreeInstanceQuotaResponse getFreeInstanceQuota() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_FREE_QUOTA);
        return invokeHttpClient(internalRequest, GetFreeInstanceQuotaResponse.class);
    }

    /**
     * getInstanceListUsingGET
     * 
     * @param request 入参结构体
     * @return GetInstanceListUsingGETResponse
     */
    public GetInstanceListUsingGETResponse getInstanceListUsingGET(GetInstanceListUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_LIST);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        if (request.getInstanceType() != null) {
            internalRequest.addParameter("instanceType", request.getInstanceType());
        }
        return invokeHttpClient(internalRequest, GetInstanceListUsingGETResponse.class);
    }

    /**
     * getNodeSpecListUsingGET
     * 
     * @param request 入参结构体
     */
    public void getNodeSpecListUsingGET(GetNodeSpecListUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_GET_NODE_SPEC_LIST);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getPriceUsingPOST
     * 
     * @param request 入参结构体
     * @return GetPriceUsingPOSTResponse
     */
    public GetPriceUsingPOSTResponse getPriceUsingPOST(GetPriceUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_PRICE);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, GetPriceUsingPOSTResponse.class);
    }

    /**
     * getQuotaUsingGET
     * 
     * @param request 入参结构体
     * @return GetQuotaUsingGETResponse
     */
    public GetQuotaUsingGETResponse getQuotaUsingGET(GetQuotaUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_QUOTA);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, GetQuotaUsingGETResponse.class);
    }

    /**
     * getTLSCertificateUsingGET
     * 
     * @param request 入参结构体
     * @return GetTLSCertificateUsingGETResponse
     */
    public GetTLSCertificateUsingGETResponse getTLSCertificateUsingGET(GetTLSCertificateUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_SECURITY, CONSTANT_GET_T_L_S_CERTIFICATE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, GetTLSCertificateUsingGETResponse.class);
    }

    /**
     * getTLSInfoUsingGET
     * 
     * @param request 入参结构体
     * @return GetTLSInfoUsingGETResponse
     */
    public GetTLSInfoUsingGETResponse getTLSInfoUsingGET(GetTLSInfoUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_SECURITY, CONSTANT_GET_T_L_S_INFO);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, GetTLSInfoUsingGETResponse.class);
    }

    /**
     * getinstancelistusingget1
     * 
     * @param request 入参结构体
     * @return Getinstancelistusingget1Response
     */
    public Getinstancelistusingget1Response getinstancelistusingget1(Getinstancelistusingget1Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_RECYCLER, CONSTANT_INSTANCE, CONSTANT_LIST);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, Getinstancelistusingget1Response.class);
    }

    /**
     * instanceDetailUsingGET
     * 
     * @param request 入参结构体
     * @return InstanceDetailUsingGETResponse
     */
    public InstanceDetailUsingGETResponse instanceDetailUsingGET(InstanceDetailUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_DETAIL);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, InstanceDetailUsingGETResponse.class);
    }

    /**
     * listRecordsUsingGET
     * 
     * @param request 入参结构体
     * @return ListRecordsUsingGETResponse
     */
    public ListRecordsUsingGETResponse listRecordsUsingGET(ListRecordsUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_LIST_RECORDS);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        if (request.getListOrder() != null) {
            internalRequest.addParameter("listOrder", request.getListOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", request.getPage());
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", request.getPageSize());
        }
        return invokeHttpClient(internalRequest, ListRecordsUsingGETResponse.class);
    }

    /**
     * manualBackupUsingPOST
     * 
     * @param request 入参结构体
     */
    public void manualBackupUsingPOST(ManualBackupUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_MANUAL_BACKUP);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyInstanceConfig
     * 
     * @param request 入参结构体
     */
    public void modifyInstanceConfig(ModifyInstanceConfigRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_MODIFY_INSTANCE_CONFIG);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyPasswordUsingPOST
     * 
     * @param request 入参结构体
     */
    public void modifyPasswordUsingPOST(ModifyPasswordUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_ACCOUNT, CONSTANT_RESET_PASSWORD);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyPublicAccess
     * 
     * @param request 入参结构体
     */
    public void modifyPublicAccess(ModifyPublicAccessRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_MODIFY_PUBLIC_ACCESS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyTLSUsingPUT
     * 
     * @param request 入参结构体
     */
    public void modifyTLSUsingPUT(ModifyTLSUsingPUTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_VDB, CONSTANT_SECURITY, CONSTANT_MODIFY_T_L_S);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * passwordUsingGET
     * 
     * @param request 入参结构体
     * @return PasswordUsingGETResponse
     */
    public PasswordUsingGETResponse passwordUsingGET(PasswordUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_ACCOUNT, CONSTANT_PASSWORD);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getUsername() != null) {
            internalRequest.addParameter("username", request.getUsername());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, PasswordUsingGETResponse.class);
    }

    /**
     * recoverInstanceUsingPOST
     * 
     * @param request 入参结构体
     */
    public void recoverInstanceUsingPOST(RecoverInstanceUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_RECYCLER, CONSTANT_INSTANCE, CONSTANT_RECOVER);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * recoverUsingPOST
     * 
     * @param request 入参结构体
     */
    public void recoverUsingPOST(RecoverUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_RECOVER);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resizeInstanceUsingPOST
     * 
     * @param request 入参结构体
     * @return ResizeInstanceUsingPOSTResponse
     */
    public ResizeInstanceUsingPOSTResponse resizeInstanceUsingPOST(ResizeInstanceUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, CONSTANT_RESIZE);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResizeInstanceUsingPOSTResponse.class);
    }

    /**
     * setCommentUsingPOST
     * 
     * @param request 入参结构体
     */
    public void setCommentUsingPOST(SetCommentUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_SET_COMMENT);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * setConfigUsingPOST
     * 
     * @param request 入参结构体
     */
    public void setConfigUsingPOST(SetConfigUsingPOSTRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_BACKUP, CONSTANT_SET_CONFIG);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindEipUsingPOST
     * 
     * @param request 入参结构体
     */
    public void unbindEipUsingPOST(UnbindEipUsingPOSTRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_UNBIND_EIP);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceDomain
     * 
     * @param request 入参结构体
     */
    public void updateInstanceDomain(UpdateInstanceDomainRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_MODIFY_DOMAIN);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateInstanceName
     * 
     * @param request 入参结构体
     */
    public void updateInstanceName(UpdateInstanceNameRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_VDB, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_MODIFY_NAME);
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * zoneListUsingGET
     * 
     * @param request 入参结构体
     * @return ZoneListUsingGETResponse
     */
    public ZoneListUsingGETResponse zoneListUsingGET(ZoneListUsingGETRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_VDB, CONSTANT_ZONE);
        if (request.getFrom() != null) {
            internalRequest.addParameter("from", request.getFrom());
        }
        if (request.getEngineType() != null) {
            internalRequest.addParameter("engineType", request.getEngineType());
        }
        return invokeHttpClient(internalRequest, ZoneListUsingGETResponse.class);
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
