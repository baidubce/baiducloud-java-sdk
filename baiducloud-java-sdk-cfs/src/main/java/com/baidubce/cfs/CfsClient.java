package com.baidubce.cfs;

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
import com.baidubce.common.BaseBceResponse;

import com.baidubce.cfs.models.BatchCreationOfPermissionGroupRulesRequest;
import com.baidubce.cfs.models.BatchCreationOfPermissionGroupRulesResponse;
import com.baidubce.cfs.models.CreateFileSystemRequest;
import com.baidubce.cfs.models.CreateFileSystemResponse;
import com.baidubce.cfs.models.CreateMountingTargetRequest;
import com.baidubce.cfs.models.CreateMountingTargetResponse;
import com.baidubce.cfs.models.CreatePermissionGroupRequest;
import com.baidubce.cfs.models.CreatePermissionGroupRulesRequest;
import com.baidubce.cfs.models.CreatePermissionGroupRulesResponse;
import com.baidubce.cfs.models.DeletePermissionGroupRequest;
import com.baidubce.cfs.models.DeletePermissionGroupRuleRequest;
import com.baidubce.cfs.models.DropFileSystemRequest;
import com.baidubce.cfs.models.DropMountTargetRequest;
import com.baidubce.cfs.models.ModifyTheMountTargetPermissionGroupRequest;
import com.baidubce.cfs.models.QueryFileSystemRequest;
import com.baidubce.cfs.models.QueryFileSystemResponse;
import com.baidubce.cfs.models.QueryMountedClientRequest;
import com.baidubce.cfs.models.QueryMountedClientResponse;
import com.baidubce.cfs.models.QueryMountingTargetRequest;
import com.baidubce.cfs.models.QueryMountingTargetResponse;
import com.baidubce.cfs.models.QueryPermissionGroupRequest;
import com.baidubce.cfs.models.QueryPermissionGroupResponse;
import com.baidubce.cfs.models.QueryPermissionGroupRulesRequest;
import com.baidubce.cfs.models.QueryPermissionGroupRulesResponse;
import com.baidubce.cfs.models.UpdateFileSystemLabelsRequest;
import com.baidubce.cfs.models.UpdateFileSystemRequest;
import com.baidubce.cfs.models.UpdatePermissionGroupRequest;
import com.baidubce.cfs.models.UpdatePermissionGroupRulesRequest;

public class CfsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_ACCESS_GROUP = "accessGroup";
    private static final String CONSTANT_CFS = "cfs";
    private static final String CONSTANT_BATCH_CREATE_ACCESS_RULE = "batchCreateAccessRule";
    private static final String CONSTANT_CLIENTS = "clients";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public CfsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public CfsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * batchCreationOfPermissionGroupRules
     * 
     * @param request 入参结构体
     * @return BatchCreationOfPermissionGroupRulesResponse
     */
    public BatchCreationOfPermissionGroupRulesResponse batchCreationOfPermissionGroupRules(BatchCreationOfPermissionGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ACCESS_GROUP, CONSTANT_BATCH_CREATE_ACCESS_RULE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchCreationOfPermissionGroupRulesResponse.class);
    }

    /**
     * createFileSystem
     * 
     * @param request 入参结构体
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CFS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateFileSystemResponse.class);
    }

    /**
     * createMountingTarget
     * 
     * @param request 入参结构体
     * @return CreateMountingTargetResponse
     */
    public CreateMountingTargetResponse createMountingTarget(CreateMountingTargetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CFS, request.getFsId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateMountingTargetResponse.class);
    }

    /**
     * createPermissionGroup
     * 
     * @param request 入参结构体
     */
    public void createPermissionGroup(CreatePermissionGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ACCESS_GROUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createPermissionGroupRules
     * 
     * @param request 入参结构体
     * @return CreatePermissionGroupRulesResponse
     */
    public CreatePermissionGroupRulesResponse createPermissionGroupRules(CreatePermissionGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_ACCESS_GROUP, request.getAgName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreatePermissionGroupRulesResponse.class);
    }

    /**
     * deletePermissionGroup
     * 
     * @param request 入参结构体
     */
    public void deletePermissionGroup(DeletePermissionGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ACCESS_GROUP, request.getAgName());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deletePermissionGroupRule
     * 
     * @param request 入参结构体
     */
    public void deletePermissionGroupRule(DeletePermissionGroupRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_ACCESS_GROUP, request.getAgName(), request.getArId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * dropFileSystem
     * 
     * @param request 入参结构体
     */
    public void dropFileSystem(DropFileSystemRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_CFS, request.getFsId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * dropMountTarget
     * 
     * @param request 入参结构体
     */
    public void dropMountTarget(DropMountTargetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_CFS, request.getFsId(), request.getMountId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyTheMountTargetPermissionGroup
     * 
     * @param request 入参结构体
     */
    public void modifyTheMountTargetPermissionGroup(ModifyTheMountTargetPermissionGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFS, request.getFsId(), request.getMountID());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryFileSystem
     * 
     * @param request 入参结构体
     * @return QueryFileSystemResponse
     */
    public QueryFileSystemResponse queryFileSystem(QueryFileSystemRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CFS);
        if (request.getUserId() != null) {
            internalRequest.addParameter("userId", request.getUserId());
        }
        if (request.getFsId() != null) {
            internalRequest.addParameter("fsId", request.getFsId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getFilterTag() != null) {
            internalRequest.addParameter("filterTag", request.getFilterTag());
        }
        return invokeHttpClient(internalRequest, QueryFileSystemResponse.class);
    }

    /**
     * queryMountedClient
     * 
     * @param request 入参结构体
     * @return QueryMountedClientResponse
     */
    public QueryMountedClientResponse queryMountedClient(QueryMountedClientRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CFS, CONSTANT_CLIENTS);
        if (request.getFsId() != null) {
            internalRequest.addParameter("fsId", request.getFsId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryMountedClientResponse.class);
    }

    /**
     * queryMountingTarget
     * 
     * @param request 入参结构体
     * @return QueryMountingTargetResponse
     */
    public QueryMountingTargetResponse queryMountingTarget(QueryMountingTargetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CFS, request.getFId());
        internalRequest.addParameter("", null);
        if (request.getMountId() != null) {
            internalRequest.addParameter("mountId", request.getMountId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryMountingTargetResponse.class);
    }

    /**
     * queryPermissionGroup
     * 
     * @param request 入参结构体
     * @return QueryPermissionGroupResponse
     */
    public QueryPermissionGroupResponse queryPermissionGroup(QueryPermissionGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ACCESS_GROUP);
        if (request.getAgName() != null) {
            internalRequest.addParameter("agName", request.getAgName());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryPermissionGroupResponse.class);
    }

    /**
     * queryPermissionGroupRules
     * 
     * @param request 入参结构体
     * @return QueryPermissionGroupRulesResponse
     */
    public QueryPermissionGroupRulesResponse queryPermissionGroupRules(QueryPermissionGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_ACCESS_GROUP, request.getAgName());
        if (request.getArId() != null) {
            internalRequest.addParameter("arId", request.getArId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryPermissionGroupRulesResponse.class);
    }

    /**
     * updateFileSystem
     * 
     * @param request 入参结构体
     */
    public void updateFileSystem(UpdateFileSystemRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CFS, request.getFsId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateFileSystemLabels
     * 
     * @param request 入参结构体
     */
    public void updateFileSystemLabels(UpdateFileSystemLabelsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CFS);
        internalRequest.addParameter("tag", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updatePermissionGroup
     * 
     * @param request 入参结构体
     */
    public void updatePermissionGroup(UpdatePermissionGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ACCESS_GROUP, request.getAgName());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updatePermissionGroupRules
     * 
     * @param request 入参结构体
     */
    public void updatePermissionGroupRules(UpdatePermissionGroupRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_ACCESS_GROUP, request.getAgName(), request.getArId());
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
