package com.baidubce.bcc;

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

import com.baidubce.bcc.models.AttachVolumeRequest;
import com.baidubce.bcc.models.AttachVolumeResponse;
import com.baidubce.bcc.models.BindTagVolumeRequest;
import com.baidubce.bcc.models.CreateVolumeRequest;
import com.baidubce.bcc.models.CreateVolumeResponse;
import com.baidubce.bcc.models.DetachVolumeRequest;
import com.baidubce.bcc.models.GetCdsPriceRequest;
import com.baidubce.bcc.models.GetCdsPriceResponse;
import com.baidubce.bcc.models.GetDiskQuotaRequest;
import com.baidubce.bcc.models.GetDiskQuotaResponse;
import com.baidubce.bcc.models.GetVolumeRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressResponse;
import com.baidubce.bcc.models.GetVolumeResponse;
import com.baidubce.bcc.models.ListVolumesRequest;
import com.baidubce.bcc.models.ListVolumesResponse;
import com.baidubce.bcc.models.ModifyCdsAttributeRequest;
import com.baidubce.bcc.models.ModifyVolumeChargeTypeRequest;
import com.baidubce.bcc.models.PurchaseReservedVolumeRequest;
import com.baidubce.bcc.models.PurchaseReservedVolumeResponse;
import com.baidubce.bcc.models.ReleaseVolumeRequest;
import com.baidubce.bcc.models.RenameVolumeRequest;
import com.baidubce.bcc.models.ResizeVolumeRequest;
import com.baidubce.bcc.models.ResizeVolumeResponse;
import com.baidubce.bcc.models.RollbackVolumeRequest;
import com.baidubce.bcc.models.UnbindTagVolumeRequest;

public class BccClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V2 = "v2";
    private static final String CONSTANT_VOLUME = "volume";
    private static final String CONSTANT_TAG = "tag";
    private static final String CONSTANT_PROGRESS = "progress";
    private static final String CONSTANT_DISK = "disk";
    private static final String CONSTANT_QUOTA = "quota";
    private static final String CONSTANT_GET_PRICE = "getPrice";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public BccClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public BccClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * attachVolume
     * 
     * @param request 入参结构体
     * @return AttachVolumeResponse
     */
    public AttachVolumeResponse attachVolume(AttachVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("attach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AttachVolumeResponse.class);
    }

    /**
     * bindTagVolume
     * 
     * @param request 入参结构体
     */
    public void bindTagVolume(BindTagVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId(), CONSTANT_TAG);
        internalRequest.addParameter("bind", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createVolume
     * 
     * @param request 入参结构体
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateVolumeResponse.class);
    }

    /**
     * detachVolume
     * 
     * @param request 入参结构体
     */
    public void detachVolume(DetachVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("detach", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getCdsPrice
     * 
     * @param request 入参结构体
     * @return GetCdsPriceResponse
     */
    public GetCdsPriceResponse getCdsPrice(GetCdsPriceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, CONSTANT_GET_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetCdsPriceResponse.class);
    }

    /**
     * getDiskQuota
     * 
     * @param request 入参结构体
     * @return GetDiskQuotaResponse
     */
    public GetDiskQuotaResponse getDiskQuota(GetDiskQuotaRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, CONSTANT_DISK, CONSTANT_QUOTA);
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        return invokeHttpClient(internalRequest, GetDiskQuotaResponse.class);
    }

    /**
     * getVolume
     * 
     * @param request 入参结构体
     * @return GetVolumeResponse
     */
    public GetVolumeResponse getVolume(GetVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        return invokeHttpClient(internalRequest, GetVolumeResponse.class);
    }

    /**
     * getVolumeResizeProgress
     * 
     * @param request 入参结构体
     * @return GetVolumeResizeProgressResponse
     */
    public GetVolumeResizeProgressResponse getVolumeResizeProgress(GetVolumeResizeProgressRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME, CONSTANT_PROGRESS, request.getVolumeId());
        return invokeHttpClient(internalRequest, GetVolumeResizeProgressResponse.class);
    }

    /**
     * listVolumes
     * 
     * @param request 入参结构体
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V2, CONSTANT_VOLUME);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getZoneName() != null) {
            internalRequest.addParameter("zoneName", request.getZoneName());
        }
        if (request.getClusterId() != null) {
            internalRequest.addParameter("clusterId", request.getClusterId());
        }
        if (request.getChargeFilter() != null) {
            internalRequest.addParameter("chargeFilter", request.getChargeFilter());
        }
        if (request.getUsageFilter() != null) {
            internalRequest.addParameter("usageFilter", request.getUsageFilter());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getProductCategory() != null) {
            internalRequest.addParameter("productCategory", request.getProductCategory());
        }
        return invokeHttpClient(internalRequest, ListVolumesResponse.class);
    }

    /**
     * modifyCdsAttribute
     * 
     * @param request 入参结构体
     */
    public void modifyCdsAttribute(ModifyCdsAttributeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("modify", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyVolumeChargeType
     * 
     * @param request 入参结构体
     */
    public void modifyVolumeChargeType(ModifyVolumeChargeTypeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("modifyChargeType", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * purchaseReservedVolume
     * 
     * @param request 入参结构体
     * @return PurchaseReservedVolumeResponse
     */
    public PurchaseReservedVolumeResponse purchaseReservedVolume(PurchaseReservedVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("purchaseReserved", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PurchaseReservedVolumeResponse.class);
    }

    /**
     * releaseVolume
     * 
     * @param request 入参结构体
     */
    public void releaseVolume(ReleaseVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renameVolume
     * 
     * @param request 入参结构体
     */
    public void renameVolume(RenameVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("rename", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resizeVolume
     * 
     * @param request 入参结构体
     * @return ResizeVolumeResponse
     */
    public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("resize", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResizeVolumeResponse.class);
    }

    /**
     * rollbackVolume
     * 
     * @param request 入参结构体
     */
    public void rollbackVolume(RollbackVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId());
        internalRequest.addParameter("rollback", null);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindTagVolume
     * 
     * @param request 入参结构体
     */
    public void unbindTagVolume(UnbindTagVolumeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V2, CONSTANT_VOLUME, request.getVolumeId(), CONSTANT_TAG);
        internalRequest.addParameter("unbind", null);
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
