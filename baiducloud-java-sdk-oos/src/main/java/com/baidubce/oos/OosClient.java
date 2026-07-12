package com.baidubce.oos;

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

import com.baidubce.oos.models.CheckTemplateV2Request;
import com.baidubce.oos.models.CheckTemplateV2Response;
import com.baidubce.oos.models.CreateExecutionV2Request;
import com.baidubce.oos.models.CreateExecutionV2Response;
import com.baidubce.oos.models.CreateTemplateV2Request;
import com.baidubce.oos.models.CreateTemplateV2Response;
import com.baidubce.oos.models.DeleteTemplateV2Request;
import com.baidubce.oos.models.DeleteTemplateV2Response;
import com.baidubce.oos.models.GetExecutionDetailV2Request;
import com.baidubce.oos.models.GetExecutionDetailV2Response;
import com.baidubce.oos.models.GetExecutionListV2Request;
import com.baidubce.oos.models.GetExecutionListV2Response;
import com.baidubce.oos.models.GetOperatorListV2Request;
import com.baidubce.oos.models.GetOperatorListV2Response;
import com.baidubce.oos.models.GetTaskChildrenListV2Request;
import com.baidubce.oos.models.GetTaskChildrenListV2Response;
import com.baidubce.oos.models.GetTaskDetailV2Request;
import com.baidubce.oos.models.GetTaskDetailV2Response;
import com.baidubce.oos.models.GetTemplateDetailV2Request;
import com.baidubce.oos.models.GetTemplateDetailV2Response;
import com.baidubce.oos.models.GetTemplateListV2Request;
import com.baidubce.oos.models.GetTemplateListV2Response;
import com.baidubce.oos.models.UpdateTemplateV2Request;
import com.baidubce.oos.models.UpdateTemplateV2Response;

public class OosClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V2 = "v2";
    private static final String CONSTANT_TEMPLATE = "template";
    private static final String CONSTANT_EXECUTION = "execution";
    private static final String CONSTANT_CHECK = "check";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_OPERATOR = "operator";
    private static final String CONSTANT_CHILDREN = "children";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public OosClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public OosClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * checkTemplateV2
     * 
     * @param request 入参结构体
     * @return CheckTemplateV2Response
     */
    public CheckTemplateV2Response checkTemplateV2(CheckTemplateV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_TEMPLATE, CONSTANT_CHECK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CheckTemplateV2Response.class);
    }

    /**
     * createExecutionV2
     * 
     * @param request 入参结构体
     * @return CreateExecutionV2Response
     */
    public CreateExecutionV2Response createExecutionV2(CreateExecutionV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_EXECUTION);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateExecutionV2Response.class);
    }

    /**
     * createTemplateV2
     * 
     * @param request 入参结构体
     * @return CreateTemplateV2Response
     */
    public CreateTemplateV2Response createTemplateV2(CreateTemplateV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_TEMPLATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateTemplateV2Response.class);
    }

    /**
     * deleteTemplateV2
     * 
     * @param request 入参结构体
     * @return DeleteTemplateV2Response
     */
    public DeleteTemplateV2Response deleteTemplateV2(DeleteTemplateV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V2, CONSTANT_TEMPLATE);
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getNamespace() != null) {
            internalRequest.addParameter("namespace", request.getNamespace());
        }
        return invokeHttpClient(internalRequest, DeleteTemplateV2Response.class);
    }

    /**
     * getExecutionDetailV2
     * 
     * @param request 入参结构体
     * @return GetExecutionDetailV2Response
     */
    public GetExecutionDetailV2Response getExecutionDetailV2(GetExecutionDetailV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_EXECUTION);
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getNamespace() != null) {
            internalRequest.addParameter("namespace", request.getNamespace());
        }
        if (request.getWithLog() != null) {
            internalRequest.addParameter("withLog", request.getWithLog());
        }
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        return invokeHttpClient(internalRequest, GetExecutionDetailV2Response.class);
    }

    /**
     * getExecutionListV2
     * 
     * @param request 入参结构体
     * @return GetExecutionListV2Response
     */
    public GetExecutionListV2Response getExecutionListV2(GetExecutionListV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_EXECUTION, CONSTANT_LIST);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetExecutionListV2Response.class);
    }

    /**
     * getOperatorListV2
     * 
     * @param request 入参结构体
     * @return GetOperatorListV2Response
     */
    public GetOperatorListV2Response getOperatorListV2(GetOperatorListV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_OPERATOR, CONSTANT_LIST);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetOperatorListV2Response.class);
    }

    /**
     * getTaskChildrenListV2
     * 
     * @param request 入参结构体
     * @return GetTaskChildrenListV2Response
     */
    public GetTaskChildrenListV2Response getTaskChildrenListV2(GetTaskChildrenListV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_TASK, CONSTANT_CHILDREN, CONSTANT_LIST);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetTaskChildrenListV2Response.class);
    }

    /**
     * getTaskDetailV2
     * 
     * @param request 入参结构体
     * @return GetTaskDetailV2Response
     */
    public GetTaskDetailV2Response getTaskDetailV2(GetTaskDetailV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_TASK);
        if (request.getDagId() != null) {
            internalRequest.addParameter("dagId", request.getDagId());
        }
        if (request.getTaskId() != null) {
            internalRequest.addParameter("taskId", request.getTaskId());
        }
        if (request.getNamespace() != null) {
            internalRequest.addParameter("namespace", request.getNamespace());
        }
        if (request.getIgnoreChildren() != null) {
            internalRequest.addParameter("ignoreChildren", request.getIgnoreChildren());
        }
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        return invokeHttpClient(internalRequest, GetTaskDetailV2Response.class);
    }

    /**
     * getTemplateDetailV2
     * 
     * @param request 入参结构体
     * @return GetTemplateDetailV2Response
     */
    public GetTemplateDetailV2Response getTemplateDetailV2(GetTemplateDetailV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_TEMPLATE);
        if (request.getNamespace() != null) {
            internalRequest.addParameter("namespace", request.getNamespace());
        }
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        return invokeHttpClient(internalRequest, GetTemplateDetailV2Response.class);
    }

    /**
     * getTemplateListV2
     * 
     * @param request 入参结构体
     * @return GetTemplateListV2Response
     */
    public GetTemplateListV2Response getTemplateListV2(GetTemplateListV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_TEMPLATE, CONSTANT_LIST);
        if (request.getLocale() != null) {
            internalRequest.addParameter("locale", request.getLocale());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetTemplateListV2Response.class);
    }

    /**
     * updateTemplateV2
     * 
     * @param request 入参结构体
     * @return UpdateTemplateV2Response
     */
    public UpdateTemplateV2Response updateTemplateV2(UpdateTemplateV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_TEMPLATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateTemplateV2Response.class);
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
