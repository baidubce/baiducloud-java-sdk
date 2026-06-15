package com.baidubce.rapidfs;

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

import com.baidubce.rapidfs.models.AddCacheNodesRequest;
import com.baidubce.rapidfs.models.AddCacheNodesResponse;
import com.baidubce.rapidfs.models.CancelCacheRuleJobRequest;
import com.baidubce.rapidfs.models.CancelMetaSyncJobRequest;
import com.baidubce.rapidfs.models.CheckBeforeAddCacheNodesRequest;
import com.baidubce.rapidfs.models.CheckBeforeAddCacheNodesResponse;
import com.baidubce.rapidfs.models.CheckBeforeCreateInstanceRequest;
import com.baidubce.rapidfs.models.CheckBeforeCreateInstanceResponse;
import com.baidubce.rapidfs.models.CreateAndAssignTagRequest;
import com.baidubce.rapidfs.models.CreateAuthGroupRequest;
import com.baidubce.rapidfs.models.CreateAuthGroupResponse;
import com.baidubce.rapidfs.models.CreateCacheRuleRequest;
import com.baidubce.rapidfs.models.CreateCacheRuleResponse;
import com.baidubce.rapidfs.models.CreateInstanceRequest;
import com.baidubce.rapidfs.models.CreateInstanceResponse;
import com.baidubce.rapidfs.models.CreateMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.CreateMetaSyncRuleResponse;
import com.baidubce.rapidfs.models.DeleteAuthGroupRequest;
import com.baidubce.rapidfs.models.DeleteCacheRuleRequest;
import com.baidubce.rapidfs.models.DeleteInstanceRequest;
import com.baidubce.rapidfs.models.DeleteInstanceResponse;
import com.baidubce.rapidfs.models.DeleteMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.DescribeAihcResourcePoolsRequest;
import com.baidubce.rapidfs.models.DescribeAihcResourcePoolsResponse;
import com.baidubce.rapidfs.models.DescribeAllocatableDataSrcQuotaRequest;
import com.baidubce.rapidfs.models.DescribeAllocatableDataSrcQuotaResponse;
import com.baidubce.rapidfs.models.DescribeAuthGroupRequest;
import com.baidubce.rapidfs.models.DescribeAuthGroupResponse;
import com.baidubce.rapidfs.models.DescribeAuthGroupsRequest;
import com.baidubce.rapidfs.models.DescribeAuthGroupsResponse;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupRequest;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupResponse;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupsRequest;
import com.baidubce.rapidfs.models.DescribeCacheDeployGroupsResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodeBccCandidatesRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeBccCandidatesResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodeQuotaRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeQuotaResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodeRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeResponse;
import com.baidubce.rapidfs.models.DescribeCacheNodesRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodesResponse;
import com.baidubce.rapidfs.models.DescribeCacheRuleJobsRequest;
import com.baidubce.rapidfs.models.DescribeCacheRuleJobsResponse;
import com.baidubce.rapidfs.models.DescribeCacheRuleRequest;
import com.baidubce.rapidfs.models.DescribeCacheRuleResponse;
import com.baidubce.rapidfs.models.DescribeCacheRulesRequest;
import com.baidubce.rapidfs.models.DescribeCacheRulesResponse;
import com.baidubce.rapidfs.models.DescribeCceClustersRequest;
import com.baidubce.rapidfs.models.DescribeCceClustersResponse;
import com.baidubce.rapidfs.models.DescribeDataSrcRequest;
import com.baidubce.rapidfs.models.DescribeDataSrcResponse;
import com.baidubce.rapidfs.models.DescribeDataSrcsRequest;
import com.baidubce.rapidfs.models.DescribeDataSrcsResponse;
import com.baidubce.rapidfs.models.DescribeInstanceRequest;
import com.baidubce.rapidfs.models.DescribeInstanceResponse;
import com.baidubce.rapidfs.models.DescribeInstancesRequest;
import com.baidubce.rapidfs.models.DescribeInstancesResponse;
import com.baidubce.rapidfs.models.DescribeMetaSyncJobsRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncJobsResponse;
import com.baidubce.rapidfs.models.DescribeMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncRuleResponse;
import com.baidubce.rapidfs.models.DescribeMetaSyncRulesRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncRulesResponse;
import com.baidubce.rapidfs.models.DescribeOrderRequest;
import com.baidubce.rapidfs.models.DescribeOrderResponse;
import com.baidubce.rapidfs.models.DescribePriceRequest;
import com.baidubce.rapidfs.models.DescribePriceResponse;
import com.baidubce.rapidfs.models.DescribeSpecsRequest;
import com.baidubce.rapidfs.models.DescribeSpecsResponse;
import com.baidubce.rapidfs.models.DescribeTokenRequest;
import com.baidubce.rapidfs.models.DescribeTokenResponse;
import com.baidubce.rapidfs.models.DescribeZonesResponse;
import com.baidubce.rapidfs.models.DisableMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.EnableMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.ExecuteCacheRuleJobRequest;
import com.baidubce.rapidfs.models.ExecuteMetaSyncJobRequest;
import com.baidubce.rapidfs.models.ImportDataSrcRequest;
import com.baidubce.rapidfs.models.ImportDataSrcResponse;
import com.baidubce.rapidfs.models.ModifyAuthGroupRequest;
import com.baidubce.rapidfs.models.ModifyDataSrcRequest;
import com.baidubce.rapidfs.models.ModifyMetaSyncRuleRequest;
import com.baidubce.rapidfs.models.ModifyTokenRequest;
import com.baidubce.rapidfs.models.RemoveCacheNodesRequest;
import com.baidubce.rapidfs.models.RemoveDataSrcRequest;
import com.baidubce.rapidfs.models.RemoveDataSrcResponse;
import com.baidubce.rapidfs.models.ResizeInstanceRequest;
import com.baidubce.rapidfs.models.ResizeInstanceResponse;
import com.baidubce.rapidfs.models.RestartCacheNodesRequest;
import com.baidubce.rapidfs.models.StartCacheNodesRequest;
import com.baidubce.rapidfs.models.StopCacheNodesRequest;

public class RapidfsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V2 = "v2";
    private static final String CONSTANT_CACHENODE = "cachenode";
    private static final String CONSTANT_ORDER = "order";
    private static final String CONSTANT_AUTHGROUP = "authgroup";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_METASYNCRULE = "metasyncrule";
    private static final String CONSTANT_DATASRC = "datasrc";
    private static final String CONSTANT_CACHEDEPLOYGROUP = "cachedeploygroup";
    private static final String CONSTANT_CACHERULE = "cacherule";
    private static final String CONSTANT_AIHCRESOURCEPOOL = "aihcresourcepool";
    private static final String CONSTANT_TAG = "tag";
    private static final String CONSTANT_CCECLUSTER = "ccecluster";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_PRICE = "price";
    private static final String CONSTANT_SPECIFICATION = "specification";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public RapidfsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public RapidfsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addCacheNodes
     * 
     * @param request 入参结构体
     * @return AddCacheNodesResponse
     */
    public AddCacheNodesResponse addCacheNodes(AddCacheNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "AddCacheNodes");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AddCacheNodesResponse.class);
    }

    /**
     * cancelCacheRuleJob
     * 
     * @param request 入参结构体
     */
    public void cancelCacheRuleJob(CancelCacheRuleJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHERULE);
        internalRequest.addParameter("action", "CancelCacheJob");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * cancelMetaSyncJob
     * 
     * @param request 入参结构体
     */
    public void cancelMetaSyncJob(CancelMetaSyncJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "CancelMetaSyncJob");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * checkBeforeAddCacheNodes
     * 
     * @param request 入参结构体
     * @return CheckBeforeAddCacheNodesResponse
     */
    public CheckBeforeAddCacheNodesResponse checkBeforeAddCacheNodes(CheckBeforeAddCacheNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "CheckBeforeAddCacheNodes");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CheckBeforeAddCacheNodesResponse.class);
    }

    /**
     * checkBeforeCreateInstance
     * 
     * @param request 入参结构体
     * @return CheckBeforeCreateInstanceResponse
     */
    public CheckBeforeCreateInstanceResponse checkBeforeCreateInstance(CheckBeforeCreateInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "CheckBeforeCreateInstance");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CheckBeforeCreateInstanceResponse.class);
    }

    /**
     * createAndAssignTag
     * 
     * @param request 入参结构体
     */
    public void createAndAssignTag(CreateAndAssignTagRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_TAG);
        internalRequest.addParameter("action", "CreateAndAssignTag");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAuthGroup
     * 
     * @param request 入参结构体
     * @return CreateAuthGroupResponse
     */
    public CreateAuthGroupResponse createAuthGroup(CreateAuthGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_AUTHGROUP);
        internalRequest.addParameter("action", "CreateAuthGroup");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAuthGroupResponse.class);
    }

    /**
     * createCacheRule
     * 
     * @param request 入参结构体
     * @return CreateCacheRuleResponse
     */
    public CreateCacheRuleResponse createCacheRule(CreateCacheRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHERULE);
        internalRequest.addParameter("action", "CreateCacheRule");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateCacheRuleResponse.class);
    }

    /**
     * createInstance
     * 
     * @param request 入参结构体
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "CreateInstance");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateInstanceResponse.class);
    }

    /**
     * createMetaSyncRule
     * 
     * @param request 入参结构体
     * @return CreateMetaSyncRuleResponse
     */
    public CreateMetaSyncRuleResponse createMetaSyncRule(CreateMetaSyncRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "CreateMetaSyncRule");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateMetaSyncRuleResponse.class);
    }

    /**
     * deleteAuthGroup
     * 
     * @param request 入参结构体
     */
    public void deleteAuthGroup(DeleteAuthGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_AUTHGROUP);
        internalRequest.addParameter("action", "DeleteAuthGroup");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteCacheRule
     * 
     * @param request 入参结构体
     */
    public void deleteCacheRule(DeleteCacheRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHERULE);
        internalRequest.addParameter("action", "DeleteCacheRule");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteInstance
     * 
     * @param request 入参结构体
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "DeleteInstance");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteInstanceResponse.class);
    }

    /**
     * deleteMetaSyncRule
     * 
     * @param request 入参结构体
     */
    public void deleteMetaSyncRule(DeleteMetaSyncRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "DeleteMetaSyncRule");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * describeAihcResourcePools
     * 
     * @param request 入参结构体
     * @return DescribeAihcResourcePoolsResponse
     */
    public DescribeAihcResourcePoolsResponse describeAihcResourcePools(DescribeAihcResourcePoolsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_AIHCRESOURCEPOOL);
        internalRequest.addParameter("action", "DescribeAihcResourcePools");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAihcResourcePoolsResponse.class);
    }

    /**
     * describeAllocatableDataSrcQuota
     * 
     * @param request 入参结构体
     * @return DescribeAllocatableDataSrcQuotaResponse
     */
    public DescribeAllocatableDataSrcQuotaResponse describeAllocatableDataSrcQuota(DescribeAllocatableDataSrcQuotaRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_DATASRC);
        internalRequest.addParameter("action", "DescribeAllocatableDataSrcQuota");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAllocatableDataSrcQuotaResponse.class);
    }

    /**
     * describeAuthGroup
     * 
     * @param request 入参结构体
     * @return DescribeAuthGroupResponse
     */
    public DescribeAuthGroupResponse describeAuthGroup(DescribeAuthGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_AUTHGROUP);
        internalRequest.addParameter("action", "DescribeAuthGroup");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAuthGroupResponse.class);
    }

    /**
     * describeAuthGroups
     * 
     * @param request 入参结构体
     * @return DescribeAuthGroupsResponse
     */
    public DescribeAuthGroupsResponse describeAuthGroups(DescribeAuthGroupsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_AUTHGROUP);
        internalRequest.addParameter("action", "DescribeAuthGroups");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAuthGroupsResponse.class);
    }

    /**
     * describeCacheDeployGroup
     * 
     * @param request 入参结构体
     * @return DescribeCacheDeployGroupResponse
     */
    public DescribeCacheDeployGroupResponse describeCacheDeployGroup(DescribeCacheDeployGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHEDEPLOYGROUP);
        internalRequest.addParameter("action", "DescribeCacheDeployGroup");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheDeployGroupResponse.class);
    }

    /**
     * describeCacheDeployGroups
     * 
     * @param request 入参结构体
     * @return DescribeCacheDeployGroupsResponse
     */
    public DescribeCacheDeployGroupsResponse describeCacheDeployGroups(DescribeCacheDeployGroupsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHEDEPLOYGROUP);
        internalRequest.addParameter("action", "DescribeCacheDeployGroups");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheDeployGroupsResponse.class);
    }

    /**
     * describeCacheNode
     * 
     * @param request 入参结构体
     * @return DescribeCacheNodeResponse
     */
    public DescribeCacheNodeResponse describeCacheNode(DescribeCacheNodeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "DescribeCacheNode");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheNodeResponse.class);
    }

    /**
     * describeCacheNodeBccCandidates
     * 
     * @param request 入参结构体
     * @return DescribeCacheNodeBccCandidatesResponse
     */
    public DescribeCacheNodeBccCandidatesResponse describeCacheNodeBccCandidates(DescribeCacheNodeBccCandidatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "DescribeCacheNodeBccCandidates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheNodeBccCandidatesResponse.class);
    }

    /**
     * describeCacheNodeQuota
     * 
     * @param request 入参结构体
     * @return DescribeCacheNodeQuotaResponse
     */
    public DescribeCacheNodeQuotaResponse describeCacheNodeQuota(DescribeCacheNodeQuotaRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "DescribeCacheNodeQuota");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheNodeQuotaResponse.class);
    }

    /**
     * describeCacheNodes
     * 
     * @param request 入参结构体
     * @return DescribeCacheNodesResponse
     */
    public DescribeCacheNodesResponse describeCacheNodes(DescribeCacheNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "DescribeCacheNodes");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheNodesResponse.class);
    }

    /**
     * describeCacheRule
     * 
     * @param request 入参结构体
     * @return DescribeCacheRuleResponse
     */
    public DescribeCacheRuleResponse describeCacheRule(DescribeCacheRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHERULE);
        internalRequest.addParameter("action", "DescribeCacheRule");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheRuleResponse.class);
    }

    /**
     * describeCacheRuleJobs
     * 
     * @param request 入参结构体
     * @return DescribeCacheRuleJobsResponse
     */
    public DescribeCacheRuleJobsResponse describeCacheRuleJobs(DescribeCacheRuleJobsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHERULE);
        internalRequest.addParameter("action", "DescribeCacheJobs");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheRuleJobsResponse.class);
    }

    /**
     * describeCacheRules
     * 
     * @param request 入参结构体
     * @return DescribeCacheRulesResponse
     */
    public DescribeCacheRulesResponse describeCacheRules(DescribeCacheRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHERULE);
        internalRequest.addParameter("action", "DescribeCacheRules");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCacheRulesResponse.class);
    }

    /**
     * describeCceClusters
     * 
     * @param request 入参结构体
     * @return DescribeCceClustersResponse
     */
    public DescribeCceClustersResponse describeCceClusters(DescribeCceClustersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CCECLUSTER);
        internalRequest.addParameter("action", "DescribeCceClusters");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeCceClustersResponse.class);
    }

    /**
     * describeDataSrc
     * 
     * @param request 入参结构体
     * @return DescribeDataSrcResponse
     */
    public DescribeDataSrcResponse describeDataSrc(DescribeDataSrcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_DATASRC);
        internalRequest.addParameter("action", "DescribeDataSrc");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeDataSrcResponse.class);
    }

    /**
     * describeDataSrcs
     * 
     * @param request 入参结构体
     * @return DescribeDataSrcsResponse
     */
    public DescribeDataSrcsResponse describeDataSrcs(DescribeDataSrcsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_DATASRC);
        internalRequest.addParameter("action", "DescribeDataSrcs");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeDataSrcsResponse.class);
    }

    /**
     * describeInstance
     * 
     * @param request 入参结构体
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "DescribeInstance");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeInstanceResponse.class);
    }

    /**
     * describeInstances
     * 
     * @param request 入参结构体
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "DescribeInstances");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeInstancesResponse.class);
    }

    /**
     * describeMetaSyncJobs
     * 
     * @param request 入参结构体
     * @return DescribeMetaSyncJobsResponse
     */
    public DescribeMetaSyncJobsResponse describeMetaSyncJobs(DescribeMetaSyncJobsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "DescribeMetaSyncJobs");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetaSyncJobsResponse.class);
    }

    /**
     * describeMetaSyncRule
     * 
     * @param request 入参结构体
     * @return DescribeMetaSyncRuleResponse
     */
    public DescribeMetaSyncRuleResponse describeMetaSyncRule(DescribeMetaSyncRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "DescribeMetaSyncRule");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetaSyncRuleResponse.class);
    }

    /**
     * describeMetaSyncRules
     * 
     * @param request 入参结构体
     * @return DescribeMetaSyncRulesResponse
     */
    public DescribeMetaSyncRulesResponse describeMetaSyncRules(DescribeMetaSyncRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "DescribeMetaSyncRules");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetaSyncRulesResponse.class);
    }

    /**
     * describeOrder
     * 
     * @param request 入参结构体
     * @return DescribeOrderResponse
     */
    public DescribeOrderResponse describeOrder(DescribeOrderRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_ORDER);
        internalRequest.addParameter("action", "DescribeOrder");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeOrderResponse.class);
    }

    /**
     * describePrice
     * 
     * @param request 入参结构体
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePrice(DescribePriceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_PRICE);
        internalRequest.addParameter("action", "DescribePrice");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribePriceResponse.class);
    }

    /**
     * describeSpecs
     * 
     * @param request 入参结构体
     * @return DescribeSpecsResponse
     */
    public DescribeSpecsResponse describeSpecs(DescribeSpecsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_SPECIFICATION);
        internalRequest.addParameter("action", "DescribeSpecs");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeSpecsResponse.class);
    }

    /**
     * describeToken
     * 
     * @param request 入参结构体
     * @return DescribeTokenResponse
     */
    public DescribeTokenResponse describeToken(DescribeTokenRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "DescribeToken");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTokenResponse.class);
    }

    /**
     * describeZones
     * 
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, VERSION_V2, CONSTANT_ZONE);
        internalRequest.addParameter("action", "DescribeZones");
        return invokeHttpClient(internalRequest, DescribeZonesResponse.class);
    }

    /**
     * disableMetaSyncRule
     * 
     * @param request 入参结构体
     */
    public void disableMetaSyncRule(DisableMetaSyncRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "DisableMetaSyncRule");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * enableMetaSyncRule
     * 
     * @param request 入参结构体
     */
    public void enableMetaSyncRule(EnableMetaSyncRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "EnableMetaSyncRule");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * executeCacheRuleJob
     * 
     * @param request 入参结构体
     */
    public void executeCacheRuleJob(ExecuteCacheRuleJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHERULE);
        internalRequest.addParameter("action", "ExecuteCacheJob");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * executeMetaSyncJob
     * 
     * @param request 入参结构体
     */
    public void executeMetaSyncJob(ExecuteMetaSyncJobRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "ExecuteMetaSyncJob");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * importDataSrc
     * 
     * @param request 入参结构体
     * @return ImportDataSrcResponse
     */
    public ImportDataSrcResponse importDataSrc(ImportDataSrcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_DATASRC);
        internalRequest.addParameter("action", "ImportDataSrc");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ImportDataSrcResponse.class);
    }

    /**
     * modifyAuthGroup
     * 
     * @param request 入参结构体
     */
    public void modifyAuthGroup(ModifyAuthGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_AUTHGROUP);
        internalRequest.addParameter("action", "ModifyAuthGroup");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyDataSrc
     * 
     * @param request 入参结构体
     */
    public void modifyDataSrc(ModifyDataSrcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_DATASRC);
        internalRequest.addParameter("action", "ModifyDataSrc");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyMetaSyncRule
     * 
     * @param request 入参结构体
     */
    public void modifyMetaSyncRule(ModifyMetaSyncRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_METASYNCRULE);
        internalRequest.addParameter("action", "ModifyMetaSyncRule");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyToken
     * 
     * @param request 入参结构体
     */
    public void modifyToken(ModifyTokenRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "ModifyToken");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeCacheNodes
     * 
     * @param request 入参结构体
     */
    public void removeCacheNodes(RemoveCacheNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "RemoveCacheNodes");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * removeDataSrc
     * 
     * @param request 入参结构体
     * @return RemoveDataSrcResponse
     */
    public RemoveDataSrcResponse removeDataSrc(RemoveDataSrcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_DATASRC);
        internalRequest.addParameter("action", "RemoveDataSrc");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RemoveDataSrcResponse.class);
    }

    /**
     * resizeInstance
     * 
     * @param request 入参结构体
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_INSTANCE);
        internalRequest.addParameter("action", "ResizeInstance");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResizeInstanceResponse.class);
    }

    /**
     * restartCacheNodes
     * 
     * @param request 入参结构体
     */
    public void restartCacheNodes(RestartCacheNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "RestartCacheNodes");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * startCacheNodes
     * 
     * @param request 入参结构体
     */
    public void startCacheNodes(StartCacheNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "StartCacheNodes");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * stopCacheNodes
     * 
     * @param request 入参结构体
     */
    public void stopCacheNodes(StopCacheNodesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_CACHENODE);
        internalRequest.addParameter("action", "StopCacheNodes");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
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
