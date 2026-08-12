package com.baidubce.ax;

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

import com.baidubce.ax.models.BatchReleaseSandboxesRequest;
import com.baidubce.ax.models.BatchReleaseSandboxesResponse;
import com.baidubce.ax.models.ConnectSandboxRequest;
import com.baidubce.ax.models.ConnectSandboxResponse;
import com.baidubce.ax.models.CreateSandboxRequest;
import com.baidubce.ax.models.CreateSandboxResponse;
import com.baidubce.ax.models.CreateSandboxSnapshotRequest;
import com.baidubce.ax.models.CreateSandboxSnapshotResponse;
import com.baidubce.ax.models.DeleteSandboxRequest;
import com.baidubce.ax.models.ForkSandboxRequest;
import com.baidubce.ax.models.ForkSandboxResponse;
import com.baidubce.ax.models.GetSandboxRequest;
import com.baidubce.ax.models.GetSandboxResourcesRequest;
import com.baidubce.ax.models.GetSandboxResourcesResponse;
import com.baidubce.ax.models.GetSandboxResponse;
import com.baidubce.ax.models.GetSandboxSnapshotRequest;
import com.baidubce.ax.models.GetSandboxSnapshotResponse;
import com.baidubce.ax.models.ListSandboxSnapshotsRequest;
import com.baidubce.ax.models.ListSandboxSnapshotsResponse;
import com.baidubce.ax.models.ListSandboxesRequest;
import com.baidubce.ax.models.ListSandboxesResponse;
import com.baidubce.ax.models.ListSandboxesV2ByPathRequest;
import com.baidubce.ax.models.ListSandboxesV2ByPathResponse;
import com.baidubce.ax.models.ListSandboxesV2Request;
import com.baidubce.ax.models.ListSandboxesV2Response;
import com.baidubce.ax.models.PauseSandboxRequest;
import com.baidubce.ax.models.QuerySandboxesRequest;
import com.baidubce.ax.models.QuerySandboxesResponse;
import com.baidubce.ax.models.ResumeSandboxRequest;
import com.baidubce.ax.models.ResumeSandboxResponse;
import com.baidubce.ax.models.SetSandboxTimeoutRequest;

public class AxClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_SANDBOXES = "sandboxes";
    private static final String CONSTANT_RESOURCES = "resources";
    private static final String CONSTANT_TIMEOUT = "timeout";
    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_RESUME = "resume";
    private static final String CONSTANT_SNAPSHOTS = "snapshots";
    private static final String CONSTANT_BATCH_RELEASE = "batchRelease";
    private static final String CONSTANT_CONNECT = "connect";
    private static final String CONSTANT_FORK = "fork";
    private static final String CONSTANT_QUERY = "query";
    private static final String CONSTANT_PAUSE = "pause";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public AxClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public AxClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * batchReleaseSandboxes
     * 
     * @param request 入参结构体
     * @return BatchReleaseSandboxesResponse
     */
    public BatchReleaseSandboxesResponse batchReleaseSandboxes(BatchReleaseSandboxesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, CONSTANT_BATCH_RELEASE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BatchReleaseSandboxesResponse.class);
    }

    /**
     * connectSandbox
     * 
     * @param request 入参结构体
     * @return ConnectSandboxResponse
     */
    public ConnectSandboxResponse connectSandbox(ConnectSandboxRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_CONNECT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ConnectSandboxResponse.class);
    }

    /**
     * createSandbox
     * 
     * @param request 入参结构体
     * @return CreateSandboxResponse
     */
    public CreateSandboxResponse createSandbox(CreateSandboxRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSandboxResponse.class);
    }

    /**
     * createSandboxSnapshot
     * 
     * @param request 入参结构体
     * @return CreateSandboxSnapshotResponse
     */
    public CreateSandboxSnapshotResponse createSandboxSnapshot(CreateSandboxSnapshotRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_SNAPSHOTS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateSandboxSnapshotResponse.class);
    }

    /**
     * deleteSandbox
     * 
     * @param request 入参结构体
     */
    public void deleteSandbox(DeleteSandboxRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_SANDBOXES, request.getSandboxID());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * forkSandbox
     * 
     * @param request 入参结构体
     * @return ForkSandboxResponse
     */
    public ForkSandboxResponse forkSandbox(ForkSandboxRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_FORK);
        return invokeHttpClient(internalRequest, ForkSandboxResponse.class);
    }

    /**
     * getSandbox
     * 
     * @param request 入参结构体
     * @return GetSandboxResponse
     */
    public GetSandboxResponse getSandbox(GetSandboxRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_SANDBOXES, request.getSandboxID());
        return invokeHttpClient(internalRequest, GetSandboxResponse.class);
    }

    /**
     * getSandboxResources
     * 
     * @param request 入参结构体
     * @return GetSandboxResourcesResponse
     */
    public GetSandboxResourcesResponse getSandboxResources(GetSandboxResourcesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_RESOURCES);
        return invokeHttpClient(internalRequest, GetSandboxResourcesResponse.class);
    }

    /**
     * getSandboxSnapshot
     * 
     * @param request 入参结构体
     * @return GetSandboxSnapshotResponse
     */
    public GetSandboxSnapshotResponse getSandboxSnapshot(GetSandboxSnapshotRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_SNAPSHOTS, request.getSnapshotID());
        return invokeHttpClient(internalRequest, GetSandboxSnapshotResponse.class);
    }

    /**
     * listSandboxSnapshots
     * 
     * @param request 入参结构体
     * @return ListSandboxSnapshotsResponse
     */
    public ListSandboxSnapshotsResponse listSandboxSnapshots(ListSandboxSnapshotsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_SNAPSHOTS);
        return invokeHttpClient(internalRequest, ListSandboxSnapshotsResponse.class);
    }

    /**
     * listSandboxes
     * 
     * @param request 入参结构体
     * @return ListSandboxesResponse
     */
    public ListSandboxesResponse listSandboxes(ListSandboxesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_SANDBOXES);
        if (request.getMetadata() != null) {
            internalRequest.addParameter("metadata", request.getMetadata());
        }
        return invokeHttpClient(internalRequest, ListSandboxesResponse.class);
    }

    /**
     * listSandboxesV2
     * 
     * @param request 入参结构体
     * @return ListSandboxesV2Response
     */
    public ListSandboxesV2Response listSandboxesV2(ListSandboxesV2Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_SANDBOXES);
        if (request.getLimit() != null) {
            internalRequest.addParameter("limit", String.valueOf(request.getLimit()));
        }
        if (request.getNextToken() != null) {
            internalRequest.addParameter("nextToken", request.getNextToken());
        }
        if (request.getMetadata() != null) {
            internalRequest.addParameter("metadata", request.getMetadata());
        }
        if (request.getState() != null) {
            internalRequest.addParameter("state", request.getState());
        }
        return invokeHttpClient(internalRequest, ListSandboxesV2Response.class);
    }

    /**
     * listSandboxesV2ByPath
     * 
     * @param request 入参结构体
     * @return ListSandboxesV2ByPathResponse
     */
    public ListSandboxesV2ByPathResponse listSandboxesV2ByPath(ListSandboxesV2ByPathRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_SANDBOXES, CONSTANT_V2);
        if (request.getLimit() != null) {
            internalRequest.addParameter("limit", String.valueOf(request.getLimit()));
        }
        if (request.getNextToken() != null) {
            internalRequest.addParameter("nextToken", request.getNextToken());
        }
        if (request.getMetadata() != null) {
            internalRequest.addParameter("metadata", request.getMetadata());
        }
        if (request.getState() != null) {
            internalRequest.addParameter("state", request.getState());
        }
        return invokeHttpClient(internalRequest, ListSandboxesV2ByPathResponse.class);
    }

    /**
     * pauseSandbox
     * 
     * @param request 入参结构体
     */
    public void pauseSandbox(PauseSandboxRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_PAUSE);
        if (request.getHibernateMode() != null) {
            internalRequest.addParameter("hibernateMode", request.getHibernateMode());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * querySandboxes
     * 
     * @param request 入参结构体
     * @return QuerySandboxesResponse
     */
    public QuerySandboxesResponse querySandboxes(QuerySandboxesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, CONSTANT_QUERY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, QuerySandboxesResponse.class);
    }

    /**
     * resumeSandbox
     * 
     * @param request 入参结构体
     * @return ResumeSandboxResponse
     */
    public ResumeSandboxResponse resumeSandbox(ResumeSandboxRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_RESUME);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResumeSandboxResponse.class);
    }

    /**
     * setSandboxTimeout
     * 
     * @param request 入参结构体
     */
    public void setSandboxTimeout(SetSandboxTimeoutRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_SANDBOXES, request.getSandboxID(), CONSTANT_TIMEOUT);
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
