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

import com.baidubce.rds.models.CreateAPrimaryInstanceRequest;
import com.baidubce.rds.models.CreateAPrimaryInstanceResponse;
import com.baidubce.rds.models.CreateAProxyInstanceRequest;
import com.baidubce.rds.models.CreateAProxyInstanceResponse;
import com.baidubce.rds.models.CreateReadOnlyInstanceRequest;
import com.baidubce.rds.models.CreateReadOnlyInstanceResponse;
import com.baidubce.rds.models.QueryTaskListRequest;
import com.baidubce.rds.models.QueryTaskListResponse;

public class RdsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_TASK = "task";

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
