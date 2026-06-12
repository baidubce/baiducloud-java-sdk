package com.baidubce.bcm;

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

import com.baidubce.bcm.models.AddAlarmPolicyActionsRequest;
import com.baidubce.bcm.models.AddAlarmPolicyActionsResponse;
import com.baidubce.bcm.models.CreateAlarmMaskingRequest;
import com.baidubce.bcm.models.CreateAlarmMaskingResponse;
import com.baidubce.bcm.models.CreateAlarmPolicyRequest;
import com.baidubce.bcm.models.CreateAlarmPolicyResponse;
import com.baidubce.bcm.models.DeleteAlarmMaskingsRequest;
import com.baidubce.bcm.models.DeleteAlarmMaskingsResponse;
import com.baidubce.bcm.models.DeleteAlarmPoliciesRequest;
import com.baidubce.bcm.models.DeleteAlarmPoliciesResponse;
import com.baidubce.bcm.models.DeleteAlarmPolicyActionsRequest;
import com.baidubce.bcm.models.DeleteAlarmPolicyActionsResponse;
import com.baidubce.bcm.models.DescribeAlarmMaskingRequest;
import com.baidubce.bcm.models.DescribeAlarmMaskingResponse;
import com.baidubce.bcm.models.DescribeAlarmMaskingsRequest;
import com.baidubce.bcm.models.DescribeAlarmMaskingsResponse;
import com.baidubce.bcm.models.DescribeAlarmPoliciesRequest;
import com.baidubce.bcm.models.DescribeAlarmPoliciesResponse;
import com.baidubce.bcm.models.DescribeAlarmPolicyRequest;
import com.baidubce.bcm.models.DescribeAlarmPolicyResponse;
import com.baidubce.bcm.models.DescribeAlarmRequest;
import com.baidubce.bcm.models.DescribeAlarmResponse;
import com.baidubce.bcm.models.DescribeAlarmsRequest;
import com.baidubce.bcm.models.DescribeAlarmsResponse;
import com.baidubce.bcm.models.DescribeDimensionValuesRequest;
import com.baidubce.bcm.models.DescribeDimensionValuesResponse;
import com.baidubce.bcm.models.DescribeMetricDataLatestRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestResponse;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopResponse;
import com.baidubce.bcm.models.DescribeMetricDataRequest;
import com.baidubce.bcm.models.DescribeMetricDataResponse;
import com.baidubce.bcm.models.UpdateAlarmMaskingRequest;
import com.baidubce.bcm.models.UpdateAlarmMaskingResponse;
import com.baidubce.bcm.models.UpdateAlarmMaskingStatesRequest;
import com.baidubce.bcm.models.UpdateAlarmMaskingStatesResponse;
import com.baidubce.bcm.models.UpdateAlarmPolicyNotifyEnabledRequest;
import com.baidubce.bcm.models.UpdateAlarmPolicyNotifyEnabledResponse;
import com.baidubce.bcm.models.UpdateAlarmPolicyRequest;
import com.baidubce.bcm.models.UpdateAlarmPolicyResponse;
import com.baidubce.bcm.models.UpdateAlarmPolicyStateRequest;
import com.baidubce.bcm.models.UpdateAlarmPolicyStateResponse;

public class BcmClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V3 = "v3";
    private static final String CONSTANT_BCM = "bcm";
    private static final String CONSTANT_QUERY = "query";
    private static final String CONSTANT_AH = "ah";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public BcmClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public BcmClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addAlarmPolicyActions
     * 
     * @param request 入参结构体
     * @return AddAlarmPolicyActionsResponse
     */
    public AddAlarmPolicyActionsResponse addAlarmPolicyActions(AddAlarmPolicyActionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "AddAlarmPolicyActions");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AddAlarmPolicyActionsResponse.class);
    }

    /**
     * createAlarmMasking
     * 
     * @param request 入参结构体
     * @return CreateAlarmMaskingResponse
     */
    public CreateAlarmMaskingResponse createAlarmMasking(CreateAlarmMaskingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "CreateAlarmMasking");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAlarmMaskingResponse.class);
    }

    /**
     * createAlarmPolicy
     * 
     * @param request 入参结构体
     * @return CreateAlarmPolicyResponse
     */
    public CreateAlarmPolicyResponse createAlarmPolicy(CreateAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "CreateAlarmPolicy");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAlarmPolicyResponse.class);
    }

    /**
     * deleteAlarmMaskings
     * 
     * @param request 入参结构体
     * @return DeleteAlarmMaskingsResponse
     */
    public DeleteAlarmMaskingsResponse deleteAlarmMaskings(DeleteAlarmMaskingsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DeleteAlarmMaskings");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteAlarmMaskingsResponse.class);
    }

    /**
     * deleteAlarmPolicies
     * 
     * @param request 入参结构体
     * @return DeleteAlarmPoliciesResponse
     */
    public DeleteAlarmPoliciesResponse deleteAlarmPolicies(DeleteAlarmPoliciesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DeleteAlarmPolicies");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteAlarmPoliciesResponse.class);
    }

    /**
     * deleteAlarmPolicyActions
     * 
     * @param request 入参结构体
     * @return DeleteAlarmPolicyActionsResponse
     */
    public DeleteAlarmPolicyActionsResponse deleteAlarmPolicyActions(DeleteAlarmPolicyActionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DeleteAlarmPolicyActions");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteAlarmPolicyActionsResponse.class);
    }

    /**
     * describeAlarm
     * 
     * @param request 入参结构体
     * @return DescribeAlarmResponse
     */
    public DescribeAlarmResponse describeAlarm(DescribeAlarmRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM, CONSTANT_AH);
        internalRequest.addParameter("action", "DescribeAlarm");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmResponse.class);
    }

    /**
     * describeAlarmMasking
     * 
     * @param request 入参结构体
     * @return DescribeAlarmMaskingResponse
     */
    public DescribeAlarmMaskingResponse describeAlarmMasking(DescribeAlarmMaskingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeAlarmMasking");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmMaskingResponse.class);
    }

    /**
     * describeAlarmMaskings
     * 
     * @param request 入参结构体
     * @return DescribeAlarmMaskingsResponse
     */
    public DescribeAlarmMaskingsResponse describeAlarmMaskings(DescribeAlarmMaskingsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeAlarmMaskings");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmMaskingsResponse.class);
    }

    /**
     * describeAlarmPolicies
     * 
     * @param request 入参结构体
     * @return DescribeAlarmPoliciesResponse
     */
    public DescribeAlarmPoliciesResponse describeAlarmPolicies(DescribeAlarmPoliciesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeAlarmPolicies");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmPoliciesResponse.class);
    }

    /**
     * describeAlarmPolicy
     * 
     * @param request 入参结构体
     * @return DescribeAlarmPolicyResponse
     */
    public DescribeAlarmPolicyResponse describeAlarmPolicy(DescribeAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeAlarmPolicy");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmPolicyResponse.class);
    }

    /**
     * describeAlarms
     * 
     * @param request 入参结构体
     * @return DescribeAlarmsResponse
     */
    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM, CONSTANT_AH);
        internalRequest.addParameter("action", "DescribeAlarms");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmsResponse.class);
    }

    /**
     * describeDimensionValues
     * 
     * @param request 入参结构体
     * @return DescribeDimensionValuesResponse
     */
    public DescribeDimensionValuesResponse describeDimensionValues(DescribeDimensionValuesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeDimensionValues");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeDimensionValuesResponse.class);
    }

    /**
     * describeMetricData
     * 
     * @param request 入参结构体
     * @return DescribeMetricDataResponse
     */
    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeMetricData");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetricDataResponse.class);
    }

    /**
     * describeMetricDataLatest
     * 
     * @param request 入参结构体
     * @return DescribeMetricDataLatestResponse
     */
    public DescribeMetricDataLatestResponse describeMetricDataLatest(DescribeMetricDataLatestRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeMetricDataLatest");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetricDataLatestResponse.class);
    }

    /**
     * describeMetricDataLatestTop
     * 
     * @param request 入参结构体
     * @return DescribeMetricDataLatestTopResponse
     */
    public DescribeMetricDataLatestTopResponse describeMetricDataLatestTop(DescribeMetricDataLatestTopRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeMetricDataLatestTop");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetricDataLatestTopResponse.class);
    }

    /**
     * updateAlarmMasking
     * 
     * @param request 入参结构体
     * @return UpdateAlarmMaskingResponse
     */
    public UpdateAlarmMaskingResponse updateAlarmMasking(UpdateAlarmMaskingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateAlarmMasking");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAlarmMaskingResponse.class);
    }

    /**
     * updateAlarmMaskingStates
     * 
     * @param request 入参结构体
     * @return UpdateAlarmMaskingStatesResponse
     */
    public UpdateAlarmMaskingStatesResponse updateAlarmMaskingStates(UpdateAlarmMaskingStatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateAlarmMaskingStates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAlarmMaskingStatesResponse.class);
    }

    /**
     * updateAlarmPolicy
     * 
     * @param request 入参结构体
     * @return UpdateAlarmPolicyResponse
     */
    public UpdateAlarmPolicyResponse updateAlarmPolicy(UpdateAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateAlarmPolicy");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAlarmPolicyResponse.class);
    }

    /**
     * updateAlarmPolicyNotifyEnabled
     * 
     * @param request 入参结构体
     * @return UpdateAlarmPolicyNotifyEnabledResponse
     */
    public UpdateAlarmPolicyNotifyEnabledResponse updateAlarmPolicyNotifyEnabled(UpdateAlarmPolicyNotifyEnabledRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateAlarmPolicyNotifyEnabled");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAlarmPolicyNotifyEnabledResponse.class);
    }

    /**
     * updateAlarmPolicyState
     * 
     * @param request 入参结构体
     * @return UpdateAlarmPolicyStateResponse
     */
    public UpdateAlarmPolicyStateResponse updateAlarmPolicyState(UpdateAlarmPolicyStateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateAlarmPolicyState");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAlarmPolicyStateResponse.class);
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
