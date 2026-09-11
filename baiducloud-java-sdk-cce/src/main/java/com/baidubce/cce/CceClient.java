package com.baidubce.cce;

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

import com.baidubce.cce.models.CreateAShrinkingNodeGroupTaskV2Request;
import com.baidubce.cce.models.CreateAShrinkingNodeGroupTaskV2Response;
import com.baidubce.cce.models.CreateAnAutoscalerV2Request;
import com.baidubce.cce.models.CreateAnAutoscalerV2Response;
import com.baidubce.cce.models.CreateExpansionNodeGroupTaskV2Request;
import com.baidubce.cce.models.CreateExpansionNodeGroupTaskV2Response;
import com.baidubce.cce.models.CreateNodeGroupV2Request;
import com.baidubce.cce.models.CreateNodeGroupV2Response;
import com.baidubce.cce.models.DeleteNodeGroupV2Request;
import com.baidubce.cce.models.DeleteNodeGroupV2Response;
import com.baidubce.cce.models.DeleteNodesClusterScalingV2Request;
import com.baidubce.cce.models.DeleteNodesClusterScalingV2Response;
import com.baidubce.cce.models.GetNodeDetailsV2Request;
import com.baidubce.cce.models.GetNodeDetailsV2Response;
import com.baidubce.cce.models.GetNodeGroupDetailsV2Request;
import com.baidubce.cce.models.GetNodeGroupDetailsV2Response;
import com.baidubce.cce.models.GetPackageListV2Request;
import com.baidubce.cce.models.GetPackageListV2Response;
import com.baidubce.cce.models.GetTaskListV2Request;
import com.baidubce.cce.models.GetTaskListV2Response;
import com.baidubce.cce.models.GetTheListOfClusterNodeGroupsV2Request;
import com.baidubce.cce.models.GetTheListOfClusterNodeGroupsV2Response;
import com.baidubce.cce.models.GetTheListOfClusterNodesV2Request;
import com.baidubce.cce.models.GetTheListOfClusterNodesV2Response;
import com.baidubce.cce.models.ModifyIGAutoScalerRequest;
import com.baidubce.cce.models.ModifyIGAutoScalerResponse;
import com.baidubce.cce.models.ModifyNodeGroupNodeShrinkProtectionStatusV2Request;
import com.baidubce.cce.models.ModifyNodeGroupNodeShrinkProtectionStatusV2Response;
import com.baidubce.cce.models.ModifyTheNumberOfNodeReplicasInANodeGroupV2Request;
import com.baidubce.cce.models.ModifyTheNumberOfNodeReplicasInANodeGroupV2Response;
import com.baidubce.cce.models.MoveIntoAnExistingNodeV2Request;
import com.baidubce.cce.models.MoveIntoAnExistingNodeV2Response;
import com.baidubce.cce.models.QueryTheConfigurationOfAutoscalerV2Request;
import com.baidubce.cce.models.QueryTheConfigurationOfAutoscalerV2Response;
import com.baidubce.cce.models.RetrieveTheNodeGroupNodeListV2Request;
import com.baidubce.cce.models.RetrieveTheNodeGroupNodeListV2Response;
import com.baidubce.cce.models.StepsToObtainNodeEventsV2Request;
import com.baidubce.cce.models.StepsToObtainNodeEventsV2Response;
import com.baidubce.cce.models.SynchronizeNodeMetadataV2Request;
import com.baidubce.cce.models.SynchronizeNodeMetadataV2Response;
import com.baidubce.cce.models.UpdateAutoscalerConfigurationV2Request;
import com.baidubce.cce.models.UpdateAutoscalerConfigurationV2Response;
import com.baidubce.cce.models.UpdateNodeAttributesV2Request;
import com.baidubce.cce.models.UpdateNodeAttributesV2Response;
import com.baidubce.cce.models.ViewTaskDetailsV2Request;
import com.baidubce.cce.models.ViewTaskDetailsV2Response;

public class CceClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_EVENT = "event";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_CLUSTER = "cluster";
    private static final String CONSTANT_INSTANCEGROUPS = "instancegroups";
    private static final String CONSTANT_CLUSTER_I_D = "[clusterID]";
    private static final String CONSTANT_INSTANCEGROUP = "instancegroup";
    private static final String CONSTANT_INSTANCE_GROUP_I_D = "[instanceGroupID]";
    private static final String CONSTANT_ATTACH_INSTANCES = "attachInstances";
    private static final String CONSTANT_INSTANCE_SCALE_DOWN = "instanceScaleDown";
    private static final String CONSTANT_AUTOSCALER = "autoscaler";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_SCALEUP = "scaleup";
    private static final String CONSTANT_REPLICAS = "replicas";
    private static final String CONSTANT_INSTANCES = "instances";
    private static final String CONSTANT_TASKS = "tasks";
    private static final String CONSTANT_SYNC = "sync";
    private static final String CONSTANT_API = "api";
    private static final String CONSTANT_CCE = "cce";
    private static final String CONSTANT_ARTIFACT_SERVICE = "artifact-service";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_MACHINE_SPECS = "machine-specs";
    private static final String CONSTANT_SCALEDOWN = "scaledown";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public CceClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public CceClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * createAShrinkingNodeGroupTaskV2
     * 
     * @param request 入参结构体
     * @return CreateAShrinkingNodeGroupTaskV2Response
     */
    public CreateAShrinkingNodeGroupTaskV2Response createAShrinkingNodeGroupTaskV2(CreateAShrinkingNodeGroupTaskV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V2,
                        CONSTANT_CLUSTER,
                        request.getClusterID(),
                        CONSTANT_INSTANCEGROUP,
                        request.getInstanceGroupID(),
                        CONSTANT_SCALEDOWN);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAShrinkingNodeGroupTaskV2Response.class);
    }

    /**
     * createAnAutoscalerV2
     * 
     * @param request 入参结构体
     * @return CreateAnAutoscalerV2Response
     */
    public CreateAnAutoscalerV2Response createAnAutoscalerV2(CreateAnAutoscalerV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_AUTOSCALER, request.getClusterID());
        return invokeHttpClient(internalRequest, CreateAnAutoscalerV2Response.class);
    }

    /**
     * createExpansionNodeGroupTaskV2
     * 
     * @param request 入参结构体
     * @return CreateExpansionNodeGroupTaskV2Response
     */
    public CreateExpansionNodeGroupTaskV2Response createExpansionNodeGroupTaskV2(CreateExpansionNodeGroupTaskV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V2,
                        CONSTANT_CLUSTER,
                        request.getClusterID(),
                        CONSTANT_INSTANCEGROUP,
                        request.getInstanceGroupID(),
                        CONSTANT_SCALEUP);
        if (request.getUpToReplicas() != null) {
            internalRequest.addParameter("upToReplicas", String.valueOf(request.getUpToReplicas()));
        }
        if (request.getUpReplicas() != null) {
            internalRequest.addParameter("upReplicas", String.valueOf(request.getUpReplicas()));
        }
        return invokeHttpClient(internalRequest, CreateExpansionNodeGroupTaskV2Response.class);
    }

    /**
     * createNodeGroupV2
     * 
     * @param request 入参结构体
     * @return CreateNodeGroupV2Response
     */
    public CreateNodeGroupV2Response createNodeGroupV2(CreateNodeGroupV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCEGROUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateNodeGroupV2Response.class);
    }

    /**
     * deleteNodeGroupV2
     * 
     * @param request 入参结构体
     * @return DeleteNodeGroupV2Response
     */
    public DeleteNodeGroupV2Response deleteNodeGroupV2(DeleteNodeGroupV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCEGROUP, request.getInstanceGroupID());
        if (request.getDeleteInstances() != null) {
            internalRequest.addParameter("deleteInstances", String.valueOf(request.getDeleteInstances()));
        }
        if (request.getReleaseAllResource() != null) {
            internalRequest.addParameter("releaseAllResource", String.valueOf(request.getReleaseAllResource()));
        }
        return invokeHttpClient(internalRequest, DeleteNodeGroupV2Response.class);
    }

    /**
     * deleteNodesClusterScalingV2
     * 
     * @param request 入参结构体
     * @return DeleteNodesClusterScalingV2Response
     */
    public DeleteNodesClusterScalingV2Response deleteNodesClusterScalingV2(DeleteNodesClusterScalingV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteNodesClusterScalingV2Response.class);
    }

    /**
     * getNodeDetailsV2
     * 
     * @param request 入参结构体
     * @return GetNodeDetailsV2Response
     */
    public GetNodeDetailsV2Response getNodeDetailsV2(GetNodeDetailsV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCE, request.getInstanceID());
        return invokeHttpClient(internalRequest, GetNodeDetailsV2Response.class);
    }

    /**
     * getNodeGroupDetailsV2
     * 
     * @param request 入参结构体
     * @return GetNodeGroupDetailsV2Response
     */
    public GetNodeGroupDetailsV2Response getNodeGroupDetailsV2(GetNodeGroupDetailsV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCEGROUP, request.getInstanceGroupID());
        return invokeHttpClient(internalRequest, GetNodeGroupDetailsV2Response.class);
    }

    /**
     * getPackageListV2
     * 
     * @param request 入参结构体
     * @return GetPackageListV2Response
     */
    public GetPackageListV2Response getPackageListV2(GetPackageListV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_API, CONSTANT_CCE, CONSTANT_ARTIFACT_SERVICE, CONSTANT_V1, CONSTANT_MACHINE_SPECS);
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetPackageListV2Response.class);
    }

    /**
     * getTaskListV2
     * 
     * @param request 入参结构体
     * @return GetTaskListV2Response
     */
    public GetTaskListV2Response getTaskListV2(GetTaskListV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_TASKS, request.getTaskType());
        if (request.getTargetID() != null) {
            internalRequest.addParameter("targetID", request.getTargetID());
        }
        if (request.getOperationType() != null) {
            internalRequest.addParameter("operationType", request.getOperationType());
        }
        if (request.getPhase() != null) {
            internalRequest.addParameter("phase", request.getPhase());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetTaskListV2Response.class);
    }

    /**
     * getTheListOfClusterNodeGroupsV2
     * 
     * @param request 入参结构体
     * @return GetTheListOfClusterNodeGroupsV2Response
     */
    public GetTheListOfClusterNodeGroupsV2Response getTheListOfClusterNodeGroupsV2(GetTheListOfClusterNodeGroupsV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCEGROUPS);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getAutoscalerEnabled() != null) {
            internalRequest.addParameter("autoscalerEnabled", request.getAutoscalerEnabled());
        }
        if (request.getChargingType() != null) {
            internalRequest.addParameter("chargingType", request.getChargingType());
        }
        return invokeHttpClient(internalRequest, GetTheListOfClusterNodeGroupsV2Response.class);
    }

    /**
     * getTheListOfClusterNodesV2
     * 
     * @param request 入参结构体
     * @return GetTheListOfClusterNodesV2Response
     */
    public GetTheListOfClusterNodesV2Response getTheListOfClusterNodesV2(GetTheListOfClusterNodesV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCES);
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetTheListOfClusterNodesV2Response.class);
    }

    /**
     * modifyIGAutoScaler
     * 
     * @param request 入参结构体
     * @return ModifyIGAutoScalerResponse
     */
    public ModifyIGAutoScalerResponse modifyIGAutoScaler(ModifyIGAutoScalerRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V2,
                        CONSTANT_CLUSTER,
                        request.getClusterID(),
                        CONSTANT_INSTANCEGROUP,
                        request.getInstanceGroupID(),
                        CONSTANT_AUTOSCALER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ModifyIGAutoScalerResponse.class);
    }

    /**
     * modifyNodeGroupNodeShrinkProtectionStatusV2
     * 
     * @param request 入参结构体
     * @return ModifyNodeGroupNodeShrinkProtectionStatusV2Response
     */
    public ModifyNodeGroupNodeShrinkProtectionStatusV2Response modifyNodeGroupNodeShrinkProtectionStatusV2(ModifyNodeGroupNodeShrinkProtectionStatusV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCE_SCALE_DOWN);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ModifyNodeGroupNodeShrinkProtectionStatusV2Response.class);
    }

    /**
     * modifyTheNumberOfNodeReplicasInANodeGroupV2
     * 
     * @param request 入参结构体
     * @return ModifyTheNumberOfNodeReplicasInANodeGroupV2Response
     */
    public ModifyTheNumberOfNodeReplicasInANodeGroupV2Response modifyTheNumberOfNodeReplicasInANodeGroupV2(ModifyTheNumberOfNodeReplicasInANodeGroupV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V2,
                        CONSTANT_CLUSTER,
                        request.getClusterID(),
                        CONSTANT_INSTANCEGROUP,
                        request.getInstanceGroupID(),
                        CONSTANT_REPLICAS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ModifyTheNumberOfNodeReplicasInANodeGroupV2Response.class);
    }

    /**
     * moveIntoAnExistingNodeV2
     * 
     * @param request 入参结构体
     * @return MoveIntoAnExistingNodeV2Response
     */
    public MoveIntoAnExistingNodeV2Response moveIntoAnExistingNodeV2(MoveIntoAnExistingNodeV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.PUT,
                        CONSTANT_V2,
                        CONSTANT_CLUSTER,
                        CONSTANT_CLUSTER_I_D,
                        CONSTANT_INSTANCEGROUP,
                        CONSTANT_INSTANCE_GROUP_I_D,
                        CONSTANT_ATTACH_INSTANCES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, MoveIntoAnExistingNodeV2Response.class);
    }

    /**
     * queryTheConfigurationOfAutoscalerV2
     * 
     * @param request 入参结构体
     * @return QueryTheConfigurationOfAutoscalerV2Response
     */
    public QueryTheConfigurationOfAutoscalerV2Response queryTheConfigurationOfAutoscalerV2(QueryTheConfigurationOfAutoscalerV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_AUTOSCALER, request.getClusterID());
        return invokeHttpClient(internalRequest, QueryTheConfigurationOfAutoscalerV2Response.class);
    }

    /**
     * retrieveTheNodeGroupNodeListV2
     * 
     * @param request 入参结构体
     * @return RetrieveTheNodeGroupNodeListV2Response
     */
    public RetrieveTheNodeGroupNodeListV2Response retrieveTheNodeGroupNodeListV2(RetrieveTheNodeGroupNodeListV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        CONSTANT_V2,
                        CONSTANT_CLUSTER,
                        request.getClusterID(),
                        CONSTANT_INSTANCEGROUP,
                        request.getInstanceGroupID(),
                        CONSTANT_INSTANCES);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, RetrieveTheNodeGroupNodeListV2Response.class);
    }

    /**
     * stepsToObtainNodeEventsV2
     * 
     * @param request 入参结构体
     * @return StepsToObtainNodeEventsV2Response
     */
    public StepsToObtainNodeEventsV2Response stepsToObtainNodeEventsV2(StepsToObtainNodeEventsV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_EVENT, CONSTANT_INSTANCE, request.getInstanceID());
        return invokeHttpClient(internalRequest, StepsToObtainNodeEventsV2Response.class);
    }

    /**
     * synchronizeNodeMetadataV2
     * 
     * @param request 入参结构体
     * @return SynchronizeNodeMetadataV2Response
     */
    public SynchronizeNodeMetadataV2Response synchronizeNodeMetadataV2(SynchronizeNodeMetadataV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_SYNC, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCES);
        return invokeHttpClient(internalRequest, SynchronizeNodeMetadataV2Response.class);
    }

    /**
     * updateAutoscalerConfigurationV2
     * 
     * @param request 入参结构体
     * @return UpdateAutoscalerConfigurationV2Response
     */
    public UpdateAutoscalerConfigurationV2Response updateAutoscalerConfigurationV2(UpdateAutoscalerConfigurationV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_AUTOSCALER, request.getClusterID());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAutoscalerConfigurationV2Response.class);
    }

    /**
     * updateNodeAttributesV2
     * 
     * @param request 入参结构体
     * @return UpdateNodeAttributesV2Response
     */
    public UpdateNodeAttributesV2Response updateNodeAttributesV2(UpdateNodeAttributesV2Request request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_CLUSTER, request.getClusterID(), CONSTANT_INSTANCE, request.getInstanceID());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateNodeAttributesV2Response.class);
    }

    /**
     * viewTaskDetailsV2
     * 
     * @param request 入参结构体
     * @return ViewTaskDetailsV2Response
     */
    public ViewTaskDetailsV2Response viewTaskDetailsV2(ViewTaskDetailsV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_TASK, request.getTaskType(), request.getTaskID());
        return invokeHttpClient(internalRequest, ViewTaskDetailsV2Response.class);
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
