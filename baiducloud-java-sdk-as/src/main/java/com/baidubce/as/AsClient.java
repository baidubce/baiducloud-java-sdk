package com.baidubce.as;

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

import com.baidubce.as.models.AdjustNumV2Request;
import com.baidubce.as.models.AdjustNumV2Response;
import com.baidubce.as.models.AttachNodeV2Request;
import com.baidubce.as.models.AttachNodeV2Response;
import com.baidubce.as.models.CreateAsGroupV2Request;
import com.baidubce.as.models.CreateAsGroupV2Response;
import com.baidubce.as.models.CreateRuleV2Request;
import com.baidubce.as.models.CreateRuleV2Response;
import com.baidubce.as.models.DeleteAsGroupV2Request;
import com.baidubce.as.models.DeleteRuleV2Request;
import com.baidubce.as.models.DetachNodeV2Request;
import com.baidubce.as.models.DetachNodeV2Response;
import com.baidubce.as.models.ExecRuleV2Request;
import com.baidubce.as.models.ExecRuleV2Response;
import com.baidubce.as.models.GetAsGroupV2Request;
import com.baidubce.as.models.GetAsGroupV2Response;
import com.baidubce.as.models.GetRuleV2Request;
import com.baidubce.as.models.GetRuleV2Response;
import com.baidubce.as.models.ListAsGroupV2Request;
import com.baidubce.as.models.ListAsGroupV2Response;
import com.baidubce.as.models.ListAsNodeV2Request;
import com.baidubce.as.models.ListAsNodeV2Response;
import com.baidubce.as.models.ListRuleV2Request;
import com.baidubce.as.models.ListRuleV2Response;
import com.baidubce.as.models.ListTaskV2Request;
import com.baidubce.as.models.ListTaskV2Response;
import com.baidubce.as.models.ScalingDownV2Request;
import com.baidubce.as.models.ScalingDownV2Response;
import com.baidubce.as.models.ScalingUpV2Request;
import com.baidubce.as.models.ScalingUpV2Response;
import com.baidubce.as.models.UpdateIsManagedV2Request;
import com.baidubce.as.models.UpdateProtectV2Request;

public class AsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_GROUP = "group";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_RULE = "rule";
    private static final String CONSTANT_NODE = "node";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_TASK = "task";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public AsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public AsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * adjustNumV2
     * 
     * @param request 入参结构体
     * @return AdjustNumV2Response
     */
    public AdjustNumV2Response adjustNumV2(AdjustNumV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        if (request.getAdjustNode() != null) {
            internalRequest.addParameter("adjustNode", request.getAdjustNode());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AdjustNumV2Response.class);
    }

    /**
     * attachNodeV2
     * 
     * @param request 入参结构体
     * @return AttachNodeV2Response
     */
    public AttachNodeV2Response attachNodeV2(AttachNodeV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        if (request.getAttachNode() != null) {
            internalRequest.addParameter("attachNode", request.getAttachNode());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AttachNodeV2Response.class);
    }

    /**
     * createAsGroupV2
     * 
     * @param request 入参结构体
     * @return CreateAsGroupV2Response
     */
    public CreateAsGroupV2Response createAsGroupV2(CreateAsGroupV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAsGroupV2Response.class);
    }

    /**
     * createRuleV2
     * 
     * @param request 入参结构体
     * @return CreateRuleV2Response
     */
    public CreateRuleV2Response createRuleV2(CreateRuleV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_RULE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateRuleV2Response.class);
    }

    /**
     * deleteAsGroupV2
     * 
     * @param request 入参结构体
     */
    public void deleteAsGroupV2(DeleteAsGroupV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRuleV2
     * 
     * @param request 入参结构体
     */
    public void deleteRuleV2(DeleteRuleV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_RULE, request.getRuleId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * detachNodeV2
     * 
     * @param request 入参结构体
     * @return DetachNodeV2Response
     */
    public DetachNodeV2Response detachNodeV2(DetachNodeV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        if (request.getDetachNode() != null) {
            internalRequest.addParameter("detachNode", request.getDetachNode());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DetachNodeV2Response.class);
    }

    /**
     * execRuleV2
     * 
     * @param request 入参结构体
     * @return ExecRuleV2Response
     */
    public ExecRuleV2Response execRuleV2(ExecRuleV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        if (request.getExecRule() != null) {
            internalRequest.addParameter("execRule", request.getExecRule());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ExecRuleV2Response.class);
    }

    /**
     * getAsGroupV2
     * 
     * @param request 入参结构体
     * @return GetAsGroupV2Response
     */
    public GetAsGroupV2Response getAsGroupV2(GetAsGroupV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_GROUP, request.getGroupId());
        return invokeHttpClient(internalRequest, GetAsGroupV2Response.class);
    }

    /**
     * getRuleV2
     * 
     * @param request 入参结构体
     * @return GetRuleV2Response
     */
    public GetRuleV2Response getRuleV2(GetRuleV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_RULE, request.getRuleId());
        return invokeHttpClient(internalRequest, GetRuleV2Response.class);
    }

    /**
     * listAsGroupV2
     * 
     * @param request 入参结构体
     * @return ListAsGroupV2Response
     */
    public ListAsGroupV2Response listAsGroupV2(ListAsGroupV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_GROUP);
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getSubKeywordType() != null) {
            internalRequest.addParameter("subKeywordType", request.getSubKeywordType());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        return invokeHttpClient(internalRequest, ListAsGroupV2Response.class);
    }

    /**
     * listAsNodeV2
     * 
     * @param request 入参结构体
     * @return ListAsNodeV2Response
     */
    public ListAsNodeV2Response listAsNodeV2(ListAsNodeV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_NODE);
        if (request.getGroupid() != null) {
            internalRequest.addParameter("groupid", request.getGroupid());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        return invokeHttpClient(internalRequest, ListAsNodeV2Response.class);
    }

    /**
     * listRuleV2
     * 
     * @param request 入参结构体
     * @return ListRuleV2Response
     */
    public ListRuleV2Response listRuleV2(ListRuleV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_RULE);
        if (request.getGroupid() != null) {
            internalRequest.addParameter("groupid", request.getGroupid());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        return invokeHttpClient(internalRequest, ListRuleV2Response.class);
    }

    /**
     * listTaskV2
     * 
     * @param request 入参结构体
     * @return ListTaskV2Response
     */
    public ListTaskV2Response listTaskV2(ListTaskV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_TASK);
        if (request.getGroupid() != null) {
            internalRequest.addParameter("groupid", request.getGroupid());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getStartTime() != null) {
            internalRequest.addParameter("startTime", request.getStartTime());
        }
        if (request.getEndTime() != null) {
            internalRequest.addParameter("endTime", request.getEndTime());
        }
        return invokeHttpClient(internalRequest, ListTaskV2Response.class);
    }

    /**
     * scalingDownV2
     * 
     * @param request 入参结构体
     * @return ScalingDownV2Response
     */
    public ScalingDownV2Response scalingDownV2(ScalingDownV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        if (request.getScalingDown() != null) {
            internalRequest.addParameter("scalingDown", request.getScalingDown());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ScalingDownV2Response.class);
    }

    /**
     * scalingUpV2
     * 
     * @param request 入参结构体
     * @return ScalingUpV2Response
     */
    public ScalingUpV2Response scalingUpV2(ScalingUpV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_GROUP, request.getGroupId());
        if (request.getScalingUp() != null) {
            internalRequest.addParameter("scalingUp", request.getScalingUp());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ScalingUpV2Response.class);
    }

    /**
     * updateIsManagedV2
     * 
     * @param request 入参结构体
     */
    public void updateIsManagedV2(UpdateIsManagedV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V1, CONSTANT_NODE, request.getGroupId());
        if (request.getUpdateIsManaged() != null) {
            internalRequest.addParameter("updateIsManaged", request.getUpdateIsManaged());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateProtectV2
     * 
     * @param request 入参结构体
     */
    public void updateProtectV2(UpdateProtectV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_GROUP, request.getGroupId());
        if (request.getUpdateProtect() != null) {
            internalRequest.addParameter("updateProtect", request.getUpdateProtect());
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
