package com.baidubce.cloudassistant;

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

import com.baidubce.cloudassistant.models.ActionListRequest;
import com.baidubce.cloudassistant.models.ActionListResponse;
import com.baidubce.cloudassistant.models.ActionLogRequest;
import com.baidubce.cloudassistant.models.ActionLogResponse;
import com.baidubce.cloudassistant.models.ActionRunListRequest;
import com.baidubce.cloudassistant.models.ActionRunListResponse;
import com.baidubce.cloudassistant.models.ActionRunRequest;
import com.baidubce.cloudassistant.models.ActionRunResponse;
import com.baidubce.cloudassistant.models.BatchGetAgentRequest;
import com.baidubce.cloudassistant.models.BatchGetAgentResponse;
import com.baidubce.cloudassistant.models.CreateActionRequest;
import com.baidubce.cloudassistant.models.CreateActionResponse;
import com.baidubce.cloudassistant.models.DeleteActionRequest;
import com.baidubce.cloudassistant.models.DeleteActionResponse;
import com.baidubce.cloudassistant.models.GetActionRequest;
import com.baidubce.cloudassistant.models.GetActionResponse;
import com.baidubce.cloudassistant.models.GetActionRunRequest;
import com.baidubce.cloudassistant.models.GetActionRunResponse;
import com.baidubce.cloudassistant.models.UpdateActionRequest;
import com.baidubce.cloudassistant.models.UpdateActionResponse;

public class CloudassistantClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_CA = "ca";
    private static final String CONSTANT_ACTION = "action";
    private static final String CONSTANT_ACTION_RUN = "actionRun";
    private static final String CONSTANT_AGENT = "agent";
    private static final String CONSTANT_BATCH = "batch";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_LOG = "log";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public CloudassistantClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public CloudassistantClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * actionList
     * 
     * @param request 入参结构体
     * @return ActionListResponse
     */
    public ActionListResponse actionList(ActionListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION, CONSTANT_LIST);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ActionListResponse.class);
    }

    /**
     * actionLog
     * 
     * @param request 入参结构体
     * @return ActionLogResponse
     */
    public ActionLogResponse actionLog(ActionLogRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CA, CONSTANT_LOG);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ActionLogResponse.class);
    }

    /**
     * actionRun
     * 
     * @param request 入参结构体
     * @return ActionRunResponse
     */
    public ActionRunResponse actionRun(ActionRunRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION_RUN);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ActionRunResponse.class);
    }

    /**
     * actionRunList
     * 
     * @param request 入参结构体
     * @return ActionRunListResponse
     */
    public ActionRunListResponse actionRunList(ActionRunListRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION_RUN, CONSTANT_LIST);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ActionRunListResponse.class);
    }

    /**
     * batchGetAgent
     * 
     * @param request 入参结构体
     * @return BatchGetAgentResponse
     */
    public BatchGetAgentResponse batchGetAgent(BatchGetAgentRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CA, CONSTANT_AGENT, CONSTANT_BATCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchGetAgentResponse.class);
    }

    /**
     * createAction
     * 
     * @param request 入参结构体
     * @return CreateActionResponse
     */
    public CreateActionResponse createAction(CreateActionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateActionResponse.class);
    }

    /**
     * deleteAction
     * 
     * @param request 入参结构体
     * @return DeleteActionResponse
     */
    public DeleteActionResponse deleteAction(DeleteActionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION, request.getId());
        return invokeHttpClient(internalRequest, DeleteActionResponse.class);
    }

    /**
     * getAction
     * 
     * @param request 入参结构体
     * @return GetActionResponse
     */
    public GetActionResponse getAction(GetActionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION);
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        return invokeHttpClient(internalRequest, GetActionResponse.class);
    }

    /**
     * getActionRun
     * 
     * @param request 入参结构体
     * @return GetActionRunResponse
     */
    public GetActionRunResponse getActionRun(GetActionRunRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION_RUN);
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getWithLog() != null) {
            internalRequest.addParameter("withLog", request.getWithLog());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getChildRunState() != null) {
            internalRequest.addParameter("childRunState", request.getChildRunState());
        }
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        return invokeHttpClient(internalRequest, GetActionRunResponse.class);
    }

    /**
     * updateAction
     * 
     * @param request 入参结构体
     * @return UpdateActionResponse
     */
    public UpdateActionResponse updateAction(UpdateActionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_CA, CONSTANT_ACTION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateActionResponse.class);
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
