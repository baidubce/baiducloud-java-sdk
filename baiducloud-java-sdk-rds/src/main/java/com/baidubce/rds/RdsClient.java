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

import com.baidubce.rds.models.BatchConfigurationOfInstancesRequest;
import com.baidubce.rds.models.BatchConfigurationOfInstancesResponse;
import com.baidubce.rds.models.BindingTagsRequest;
import com.baidubce.rds.models.ClusterStatusCheckRequest;
import com.baidubce.rds.models.ClusterStatusCheckResponse;
import com.baidubce.rds.models.CreateAPrimaryInstanceRequest;
import com.baidubce.rds.models.CreateAPrimaryInstanceResponse;
import com.baidubce.rds.models.CreateAProxyInstanceRequest;
import com.baidubce.rds.models.CreateAProxyInstanceResponse;
import com.baidubce.rds.models.CreateReadOnlyInstanceRequest;
import com.baidubce.rds.models.CreateReadOnlyInstanceResponse;
import com.baidubce.rds.models.DialTestInterfaceRequest;
import com.baidubce.rds.models.DialTestInterfaceResponse;
import com.baidubce.rds.models.DoesTheInstanceSupportEnablingAutomaticExpansionRequest;
import com.baidubce.rds.models.DoesTheInstanceSupportEnablingAutomaticExpansionResponse;
import com.baidubce.rds.models.InstanceEnablesAutomaticRenewalRequest;
import com.baidubce.rds.models.QueryInstanceListRequest;
import com.baidubce.rds.models.QueryInstanceListResponse;
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
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigRequest;
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigResponse;
import com.baidubce.rds.models.TransformationExampleRequest;
import com.baidubce.rds.models.TransformationExampleResponse;
import com.baidubce.rds.models.UpdateAutomaticStorageExpansionConfigurationRequest;
import com.baidubce.rds.models.UpdateInstanceConnectionInformationRequest;
import com.baidubce.rds.models.UpdateInstanceNameRequest;
import com.baidubce.rds.models.UpdateInstancePublicNetworkAccessStatusRequest;
import com.baidubce.rds.models.UpdateInstanceSynchronizationModeRequest;
import com.baidubce.rds.models.UpdateTimeWindowRequest;

public class RdsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_TAGS = "tags";
    private static final String CONSTANT_STATUS = "status";
    private static final String CONSTANT_DISK_AUTO_RESIZE = "diskAutoResize";
    private static final String CONSTANT_CONFIG = "config";
    private static final String CONSTANT_PROBE = "probe";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_RENEW = "renew";
    private static final String CONSTANT_AUTO_RESIZE_CONFIG = "autoResizeConfig";
    private static final String CONSTANT_ZONE = "zone";
    private static final String CONSTANT_SUBNET = "subnet";
    private static final String CONSTANT_MAINTAINTIME = "maintaintime";
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
