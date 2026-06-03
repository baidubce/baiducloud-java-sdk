package com.baidubce.pfs;

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

import com.baidubce.pfs.models.CancelL2BucketLinkRequest;
import com.baidubce.pfs.models.CancelL2BucketLinkResponse;
import com.baidubce.pfs.models.CreateFilesetRequest;
import com.baidubce.pfs.models.CreateFilesetResponse;
import com.baidubce.pfs.models.CreateL2BucketLinkRequest;
import com.baidubce.pfs.models.CreateL2BucketLinkResponse;
import com.baidubce.pfs.models.CreateL2PolicyRequest;
import com.baidubce.pfs.models.CreateL2PolicyResponse;
import com.baidubce.pfs.models.CreatePfsRequest;
import com.baidubce.pfs.models.CreatePfsResponse;
import com.baidubce.pfs.models.DeleteFilesetRequest;
import com.baidubce.pfs.models.DeleteFilesetResponse;
import com.baidubce.pfs.models.DeleteL2BucketLinkRequest;
import com.baidubce.pfs.models.DeleteL2BucketLinkResponse;
import com.baidubce.pfs.models.DeleteL2PolicyRequest;
import com.baidubce.pfs.models.DeleteL2PolicyResponse;
import com.baidubce.pfs.models.DeletePfsRequest;
import com.baidubce.pfs.models.DescFilesetRequest;
import com.baidubce.pfs.models.DescFilesetResponse;
import com.baidubce.pfs.models.DescL2BucketLinkRequest;
import com.baidubce.pfs.models.DescL2BucketLinkResponse;
import com.baidubce.pfs.models.DescL2PolicyRequest;
import com.baidubce.pfs.models.DescL2PolicyResponse;
import com.baidubce.pfs.models.DescPfsRequest;
import com.baidubce.pfs.models.DescPfsResponse;
import com.baidubce.pfs.models.InstanceListClientsRequest;
import com.baidubce.pfs.models.InstanceListClientsResponse;
import com.baidubce.pfs.models.ListFilesetRequest;
import com.baidubce.pfs.models.ListFilesetResponse;
import com.baidubce.pfs.models.ListL2BucketLinkRequest;
import com.baidubce.pfs.models.ListL2BucketLinkResponse;
import com.baidubce.pfs.models.ListL2PolicyRequest;
import com.baidubce.pfs.models.ListL2PolicyResponse;
import com.baidubce.pfs.models.ListPfsRequest;
import com.baidubce.pfs.models.ListPfsResponse;
import com.baidubce.pfs.models.LstPerL2BktLnkExecLogRequest;
import com.baidubce.pfs.models.LstPerL2BktLnkExecLogResponse;
import com.baidubce.pfs.models.MountTargetListClientsRequest;
import com.baidubce.pfs.models.MountTargetListClientsResponse;
import com.baidubce.pfs.models.PauseL2BucketLinkRequest;
import com.baidubce.pfs.models.PauseL2BucketLinkResponse;
import com.baidubce.pfs.models.QryL2PolExecDetailRequest;
import com.baidubce.pfs.models.QryL2PolExecDetailResponse;
import com.baidubce.pfs.models.QryL2PolExecLogRequest;
import com.baidubce.pfs.models.QryL2PolExecLogResponse;
import com.baidubce.pfs.models.ResumeL2BucketLinkRequest;
import com.baidubce.pfs.models.ResumeL2BucketLinkResponse;
import com.baidubce.pfs.models.UpdPerL2BktLnkInfoRequest;
import com.baidubce.pfs.models.UpdPerL2BktLnkInfoResponse;
import com.baidubce.pfs.models.UpdateFilesetRequest;
import com.baidubce.pfs.models.UpdateFilesetResponse;
import com.baidubce.pfs.models.UpdateL2PolicyRequest;
import com.baidubce.pfs.models.UpdateL2PolicyResponse;
import com.baidubce.pfs.models.UpdatePFSTagRequest;

public class PfsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_PFS = "pfs";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_TAG = "tag";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public PfsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public PfsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * cancelL2BucketLink
     * 
     * @param request 入参结构体
     * @return CancelL2BucketLinkResponse
     */
    public CancelL2BucketLinkResponse cancelL2BucketLink(CancelL2BucketLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CancelL2BucketLink");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CancelL2BucketLinkResponse.class);
    }

    /**
     * createFileset
     * 
     * @param request 入参结构体
     * @return CreateFilesetResponse
     */
    public CreateFilesetResponse createFileset(CreateFilesetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateFileset");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateFilesetResponse.class);
    }

    /**
     * createL2BucketLink
     * 
     * @param request 入参结构体
     * @return CreateL2BucketLinkResponse
     */
    public CreateL2BucketLinkResponse createL2BucketLink(CreateL2BucketLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateL2BucketLink");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateL2BucketLinkResponse.class);
    }

    /**
     * createL2Policy
     * 
     * @param request 入参结构体
     * @return CreateL2PolicyResponse
     */
    public CreateL2PolicyResponse createL2Policy(CreateL2PolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "CreateL2Policy");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateL2PolicyResponse.class);
    }

    /**
     * createPfs
     * 
     * @param request 入参结构体
     * @return CreatePfsResponse
     */
    public CreatePfsResponse createPfs(CreatePfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreatePfsResponse.class);
    }

    /**
     * deleteFileset
     * 
     * @param request 入参结构体
     * @return DeleteFilesetResponse
     */
    public DeleteFilesetResponse deleteFileset(DeleteFilesetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteFileset");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteFilesetResponse.class);
    }

    /**
     * deleteL2BucketLink
     * 
     * @param request 入参结构体
     * @return DeleteL2BucketLinkResponse
     */
    public DeleteL2BucketLinkResponse deleteL2BucketLink(DeleteL2BucketLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteL2BucketLink");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteL2BucketLinkResponse.class);
    }

    /**
     * deleteL2Policy
     * 
     * @param request 入参结构体
     * @return DeleteL2PolicyResponse
     */
    public DeleteL2PolicyResponse deleteL2Policy(DeleteL2PolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DeleteL2Policy");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteL2PolicyResponse.class);
    }

    /**
     * deletePfs
     * 
     * @param request 入参结构体
     */
    public void deletePfs(DeletePfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * descFileset
     * 
     * @param request 入参结构体
     * @return DescFilesetResponse
     */
    public DescFilesetResponse descFileset(DescFilesetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeFileset");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescFilesetResponse.class);
    }

    /**
     * descL2BucketLink
     * 
     * @param request 入参结构体
     * @return DescL2BucketLinkResponse
     */
    public DescL2BucketLinkResponse descL2BucketLink(DescL2BucketLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeL2BucketLink");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescL2BucketLinkResponse.class);
    }

    /**
     * descL2Policy
     * 
     * @param request 入参结构体
     * @return DescL2PolicyResponse
     */
    public DescL2PolicyResponse descL2Policy(DescL2PolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "DescribeL2Policy");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescL2PolicyResponse.class);
    }

    /**
     * descPfs
     * 
     * @param request 入参结构体
     * @return DescPfsResponse
     */
    public DescPfsResponse descPfs(DescPfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        return invokeHttpClient(internalRequest, DescPfsResponse.class);
    }

    /**
     * instanceListClients
     * 
     * @param request 入参结构体
     * @return InstanceListClientsResponse
     */
    public InstanceListClientsResponse instanceListClients(InstanceListClientsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "InstanceListClients");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, InstanceListClientsResponse.class);
    }

    /**
     * listFileset
     * 
     * @param request 入参结构体
     * @return ListFilesetResponse
     */
    public ListFilesetResponse listFileset(ListFilesetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ListFileset");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListFilesetResponse.class);
    }

    /**
     * listL2BucketLink
     * 
     * @param request 入参结构体
     * @return ListL2BucketLinkResponse
     */
    public ListL2BucketLinkResponse listL2BucketLink(ListL2BucketLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ListL2BucketLink");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListL2BucketLinkResponse.class);
    }

    /**
     * listL2Policy
     * 
     * @param request 入参结构体
     * @return ListL2PolicyResponse
     */
    public ListL2PolicyResponse listL2Policy(ListL2PolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ListL2Policy");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ListL2PolicyResponse.class);
    }

    /**
     * listPfs
     * 
     * @param request 入参结构体
     * @return ListPfsResponse
     */
    public ListPfsResponse listPfs(ListPfsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V1, CONSTANT_PFS, CONSTANT_INSTANCE);
        internalRequest.addParameter("manner", "marker");
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getFilterTag() != null) {
            internalRequest.addParameter("filterTag", request.getFilterTag());
        }
        return invokeHttpClient(internalRequest, ListPfsResponse.class);
    }

    /**
     * lstPerL2BktLnkExecLog
     * 
     * @param request 入参结构体
     * @return LstPerL2BktLnkExecLogResponse
     */
    public LstPerL2BktLnkExecLogResponse lstPerL2BktLnkExecLog(LstPerL2BktLnkExecLogRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ListPeriodL2BucketLinkExecuteLog");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, LstPerL2BktLnkExecLogResponse.class);
    }

    /**
     * mountTargetListClients
     * 
     * @param request 入参结构体
     * @return MountTargetListClientsResponse
     */
    public MountTargetListClientsResponse mountTargetListClients(MountTargetListClientsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "MountTargetListClients");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, MountTargetListClientsResponse.class);
    }

    /**
     * pauseL2BucketLink
     * 
     * @param request 入参结构体
     * @return PauseL2BucketLinkResponse
     */
    public PauseL2BucketLinkResponse pauseL2BucketLink(PauseL2BucketLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "PauseL2BucketLink");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PauseL2BucketLinkResponse.class);
    }

    /**
     * qryL2PolExecDetail
     * 
     * @param request 入参结构体
     * @return QryL2PolExecDetailResponse
     */
    public QryL2PolExecDetailResponse qryL2PolExecDetail(QryL2PolExecDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "QueryL2PolicyExecuteDetail");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, QryL2PolExecDetailResponse.class);
    }

    /**
     * qryL2PolExecLog
     * 
     * @param request 入参结构体
     * @return QryL2PolExecLogResponse
     */
    public QryL2PolExecLogResponse qryL2PolExecLog(QryL2PolExecLogRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "QueryL2PolicyExecuteLog");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, QryL2PolExecLogResponse.class);
    }

    /**
     * resumeL2BucketLink
     * 
     * @param request 入参结构体
     * @return ResumeL2BucketLinkResponse
     */
    public ResumeL2BucketLinkResponse resumeL2BucketLink(ResumeL2BucketLinkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "ResumeL2BucketLink");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResumeL2BucketLinkResponse.class);
    }

    /**
     * updPerL2BktLnkInfo
     * 
     * @param request 入参结构体
     * @return UpdPerL2BktLnkInfoResponse
     */
    public UpdPerL2BktLnkInfoResponse updPerL2BktLnkInfo(UpdPerL2BktLnkInfoRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "UpdatePeriodL2BucketLinkInfo");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdPerL2BktLnkInfoResponse.class);
    }

    /**
     * updateFileset
     * 
     * @param request 入参结构体
     * @return UpdateFilesetResponse
     */
    public UpdateFilesetResponse updateFileset(UpdateFilesetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "UpdateFileset");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateFilesetResponse.class);
    }

    /**
     * updateL2Policy
     * 
     * @param request 入参结构体
     * @return UpdateL2PolicyResponse
     */
    public UpdateL2PolicyResponse updateL2Policy(UpdateL2PolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, null);
        internalRequest.addParameter("action", "UpdateL2Policy");
        internalRequest.addHeader("Version", "v2");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateL2PolicyResponse.class);
    }

    /**
     * updatePFSTag
     * 
     * @param request 入参结构体
     */
    public void updatePFSTag(UpdatePFSTagRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_PFS, CONSTANT_TAG);
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
