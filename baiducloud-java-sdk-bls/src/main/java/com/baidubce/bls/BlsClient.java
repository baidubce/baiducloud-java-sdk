package com.baidubce.bls;

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

import com.baidubce.bls.models.CreateProjectRequest;
import com.baidubce.bls.models.CreateProjectResponse;
import com.baidubce.bls.models.DeleteProjectRequest;
import com.baidubce.bls.models.DeleteProjectResponse;
import com.baidubce.bls.models.DescribeProjectRequest;
import com.baidubce.bls.models.DescribeProjectResponse;
import com.baidubce.bls.models.ListProjectRequest;
import com.baidubce.bls.models.ListProjectResponse;
import com.baidubce.bls.models.PullLogRecordRequest;
import com.baidubce.bls.models.PullLogRecordResponse;
import com.baidubce.bls.models.PushLogRecordRequest;
import com.baidubce.bls.models.PushLogRecordResponse;
import com.baidubce.bls.models.QueryLogHistogramRequest;
import com.baidubce.bls.models.QueryLogHistogramResponse;
import com.baidubce.bls.models.QueryLogRecordRequest;
import com.baidubce.bls.models.QueryLogRecordResponse;
import com.baidubce.bls.models.UpdateProjectRequest;
import com.baidubce.bls.models.UpdateProjectResponse;

public class BlsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String VERSION_V2 = "v2";
    private static final String CONSTANT_PROJECT = "project";
    private static final String CONSTANT_LOGSTORE = "logstore";
    private static final String CONSTANT_LOGRECORD = "logrecord";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_LOGHISTOGRAM = "loghistogram";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public BlsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public BlsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * createProject
     * 
     * @param request 入参结构体
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PROJECT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateProjectResponse.class);
    }

    /**
     * deleteProject
     * 
     * @param request 入参结构体
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_PROJECT, request.getUuid());
        return invokeHttpClient(internalRequest, DeleteProjectResponse.class);
    }

    /**
     * describeProject
     * 
     * @param request 入参结构体
     * @return DescribeProjectResponse
     */
    public DescribeProjectResponse describeProject(DescribeProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_PROJECT, request.getUuid());
        return invokeHttpClient(internalRequest, DescribeProjectResponse.class);
    }

    /**
     * listProject
     * 
     * @param request 入参结构体
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PROJECT, CONSTANT_LIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListProjectResponse.class);
    }

    /**
     * pullLogRecord
     * 
     * @param request 入参结构体
     * @return PullLogRecordResponse
     */
    public PullLogRecordResponse pullLogRecord(PullLogRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGRECORD);
        if (request.getLogStreamName() != null) {
            internalRequest.addParameter("logStreamName", request.getLogStreamName());
        }
        if (request.getStartDateTime() != null) {
            internalRequest.addParameter("startDateTime", request.getStartDateTime());
        }
        if (request.getEndDateTime() != null) {
            internalRequest.addParameter("endDateTime", request.getEndDateTime());
        }
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLimit() != null) {
            internalRequest.addParameter("limit", String.valueOf(request.getLimit()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        return invokeHttpClient(internalRequest, PullLogRecordResponse.class);
    }

    /**
     * pushLogRecord
     * 
     * @param request 入参结构体
     * @return PushLogRecordResponse
     */
    public PushLogRecordResponse pushLogRecord(PushLogRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGRECORD);
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PushLogRecordResponse.class);
    }

    /**
     * queryLogHistogram
     * 
     * @param request 入参结构体
     * @return QueryLogHistogramResponse
     */
    public QueryLogHistogramResponse queryLogHistogram(QueryLogHistogramRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGHISTOGRAM);
        if (request.getQuery() != null) {
            internalRequest.addParameter("query", request.getQuery());
        }
        if (request.getStartDateTime() != null) {
            internalRequest.addParameter("startDateTime", request.getStartDateTime());
        }
        if (request.getEndDateTime() != null) {
            internalRequest.addParameter("endDateTime", request.getEndDateTime());
        }
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLogStreamName() != null) {
            internalRequest.addParameter("logStreamName", request.getLogStreamName());
        }
        return invokeHttpClient(internalRequest, QueryLogHistogramResponse.class);
    }

    /**
     * queryLogRecord
     * 
     * @param request 入参结构体
     * @return QueryLogRecordResponse
     */
    public QueryLogRecordResponse queryLogRecord(QueryLogRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LOGSTORE, request.getLogStoreName(), CONSTANT_LOGRECORD);
        if (request.getQuery() != null) {
            internalRequest.addParameter("query", request.getQuery());
        }
        if (request.getStartDateTime() != null) {
            internalRequest.addParameter("startDateTime", request.getStartDateTime());
        }
        if (request.getEndDateTime() != null) {
            internalRequest.addParameter("endDateTime", request.getEndDateTime());
        }
        if (request.getProject() != null) {
            internalRequest.addParameter("project", request.getProject());
        }
        if (request.getLogStreamName() != null) {
            internalRequest.addParameter("logStreamName", request.getLogStreamName());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getLimit() != null) {
            internalRequest.addParameter("limit", String.valueOf(request.getLimit()));
        }
        if (request.getSort() != null) {
            internalRequest.addParameter("sort", request.getSort());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, QueryLogRecordResponse.class);
    }

    /**
     * updateProject
     * 
     * @param request 入参结构体
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PROJECT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateProjectResponse.class);
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
