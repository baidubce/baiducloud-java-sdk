package com.baidubce.apm;

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

import com.baidubce.apm.models.ApmCreateAlarmPolicyRequest;
import com.baidubce.apm.models.ApmCreateAlarmPolicyResponse;
import com.baidubce.apm.models.ApmDeleteAlarmPolicyRequest;
import com.baidubce.apm.models.ApmDeleteAlarmPolicyResponse;
import com.baidubce.apm.models.ApmDescribeAlarmPoliciesRequest;
import com.baidubce.apm.models.ApmDescribeAlarmPoliciesResponse;
import com.baidubce.apm.models.ApmDescribeAlarmPolicyRequest;
import com.baidubce.apm.models.ApmDescribeAlarmPolicyResponse;
import com.baidubce.apm.models.ApmDescribeAlarmRequest;
import com.baidubce.apm.models.ApmDescribeAlarmResponse;
import com.baidubce.apm.models.ApmDescribeAlarmsRequest;
import com.baidubce.apm.models.ApmDescribeAlarmsResponse;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyActionRequest;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyActionResponse;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyRequest;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyResponse;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyStateRequest;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyStateResponse;
import com.baidubce.apm.models.BindServiceTagRequest;
import com.baidubce.apm.models.BindServiceTagResponse;
import com.baidubce.apm.models.DeleteServicesRequest;
import com.baidubce.apm.models.DeleteServicesResponse;
import com.baidubce.apm.models.DescribeDbStatementRequest;
import com.baidubce.apm.models.DescribeDbStatementResponse;
import com.baidubce.apm.models.DescribeDefaultConfigResponse;
import com.baidubce.apm.models.DescribeDimensionValuesRequest;
import com.baidubce.apm.models.DescribeDimensionValuesResponse;
import com.baidubce.apm.models.DescribeEnvResponse;
import com.baidubce.apm.models.DescribeExceptionsRequest;
import com.baidubce.apm.models.DescribeExceptionsResponse;
import com.baidubce.apm.models.DescribeLLMDimensionValuesRequest;
import com.baidubce.apm.models.DescribeLLMDimensionValuesResponse;
import com.baidubce.apm.models.DescribeLLMMetricDataRequest;
import com.baidubce.apm.models.DescribeLLMMetricDataResponse;
import com.baidubce.apm.models.DescribeLLMServicesRequest;
import com.baidubce.apm.models.DescribeLLMServicesResponse;
import com.baidubce.apm.models.DescribeLLMSessionRequest;
import com.baidubce.apm.models.DescribeLLMSessionResponse;
import com.baidubce.apm.models.DescribeLLMSessionsRequest;
import com.baidubce.apm.models.DescribeLLMSessionsResponse;
import com.baidubce.apm.models.DescribeLLMSessionsStatisticsRequest;
import com.baidubce.apm.models.DescribeLLMSessionsStatisticsResponse;
import com.baidubce.apm.models.DescribeLLMSpansRequest;
import com.baidubce.apm.models.DescribeLLMSpansResponse;
import com.baidubce.apm.models.DescribeLLMTraceRequest;
import com.baidubce.apm.models.DescribeLLMTraceResponse;
import com.baidubce.apm.models.DescribeLLMTracesRequest;
import com.baidubce.apm.models.DescribeLLMTracesResponse;
import com.baidubce.apm.models.DescribeLLMTracesStatisticsRequest;
import com.baidubce.apm.models.DescribeLLMTracesStatisticsResponse;
import com.baidubce.apm.models.DescribeMetricDataRequest;
import com.baidubce.apm.models.DescribeMetricDataResponse;
import com.baidubce.apm.models.DescribeRetentionLimitResponse;
import com.baidubce.apm.models.DescribeServiceConfigRequest;
import com.baidubce.apm.models.DescribeServiceConfigResponse;
import com.baidubce.apm.models.DescribeServicesMetricsRequest;
import com.baidubce.apm.models.DescribeServicesMetricsResponse;
import com.baidubce.apm.models.DescribeServicesNamesRequest;
import com.baidubce.apm.models.DescribeServicesNamesResponse;
import com.baidubce.apm.models.DescribeSpanFieldValuesRequest;
import com.baidubce.apm.models.DescribeSpanFieldValuesResponse;
import com.baidubce.apm.models.DescribeSpansRequest;
import com.baidubce.apm.models.DescribeSpansResponse;
import com.baidubce.apm.models.DescribeTopologyRequest;
import com.baidubce.apm.models.DescribeTopologyResponse;
import com.baidubce.apm.models.DescribeTraceMetricDataRequest;
import com.baidubce.apm.models.DescribeTraceMetricDataResponse;
import com.baidubce.apm.models.DescribeTraceRequest;
import com.baidubce.apm.models.DescribeTraceResponse;
import com.baidubce.apm.models.UpdateServiceConfigRequest;
import com.baidubce.apm.models.UpdateServiceConfigResponse;

public class ApmClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_APM = "apm";
    private static final String CONSTANT_QUERY = "query";
    private static final String CONSTANT_ALARM = "alarm";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public ApmClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public ApmClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * apmCreateAlarmPolicy
     * 
     * @param request 入参结构体
     * @return ApmCreateAlarmPolicyResponse
     */
    public ApmCreateAlarmPolicyResponse apmCreateAlarmPolicy(ApmCreateAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "CreateAlarmPolicy");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmCreateAlarmPolicyResponse.class);
    }

    /**
     * apmDeleteAlarmPolicy
     * 
     * @param request 入参结构体
     * @return ApmDeleteAlarmPolicyResponse
     */
    public ApmDeleteAlarmPolicyResponse apmDeleteAlarmPolicy(ApmDeleteAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DeleteAlarmPolicy");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmDeleteAlarmPolicyResponse.class);
    }

    /**
     * apmDescribeAlarm
     * 
     * @param request 入参结构体
     * @return ApmDescribeAlarmResponse
     */
    public ApmDescribeAlarmResponse apmDescribeAlarm(ApmDescribeAlarmRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_ALARM);
        internalRequest.addParameter("action", "DescribeAlarm");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmDescribeAlarmResponse.class);
    }

    /**
     * apmDescribeAlarmPolicies
     * 
     * @param request 入参结构体
     * @return ApmDescribeAlarmPoliciesResponse
     */
    public ApmDescribeAlarmPoliciesResponse apmDescribeAlarmPolicies(ApmDescribeAlarmPoliciesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeAlarmPolicies");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmDescribeAlarmPoliciesResponse.class);
    }

    /**
     * apmDescribeAlarmPolicy
     * 
     * @param request 入参结构体
     * @return ApmDescribeAlarmPolicyResponse
     */
    public ApmDescribeAlarmPolicyResponse apmDescribeAlarmPolicy(ApmDescribeAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeAlarmPolicy");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmDescribeAlarmPolicyResponse.class);
    }

    /**
     * apmDescribeAlarms
     * 
     * @param request 入参结构体
     * @return ApmDescribeAlarmsResponse
     */
    public ApmDescribeAlarmsResponse apmDescribeAlarms(ApmDescribeAlarmsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_ALARM);
        internalRequest.addParameter("action", "DescribeAlarms");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmDescribeAlarmsResponse.class);
    }

    /**
     * apmUpdateAlarmPolicy
     * 
     * @param request 入参结构体
     * @return ApmUpdateAlarmPolicyResponse
     */
    public ApmUpdateAlarmPolicyResponse apmUpdateAlarmPolicy(ApmUpdateAlarmPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "UpdateAlarmPolicy");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmUpdateAlarmPolicyResponse.class);
    }

    /**
     * apmUpdateAlarmPolicyAction
     * 
     * @param request 入参结构体
     * @return ApmUpdateAlarmPolicyActionResponse
     */
    public ApmUpdateAlarmPolicyActionResponse apmUpdateAlarmPolicyAction(ApmUpdateAlarmPolicyActionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "UpdateAlarmPolicyAction");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmUpdateAlarmPolicyActionResponse.class);
    }

    /**
     * apmUpdateAlarmPolicyState
     * 
     * @param request 入参结构体
     * @return ApmUpdateAlarmPolicyStateResponse
     */
    public ApmUpdateAlarmPolicyStateResponse apmUpdateAlarmPolicyState(ApmUpdateAlarmPolicyStateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "UpdateAlarmPolicyState");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ApmUpdateAlarmPolicyStateResponse.class);
    }

    /**
     * bindServiceTag
     * 
     * @param request 入参结构体
     * @return BindServiceTagResponse
     */
    public BindServiceTagResponse bindServiceTag(BindServiceTagRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "BindServiceTag");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BindServiceTagResponse.class);
    }

    /**
     * deleteServices
     * 
     * @param request 入参结构体
     * @return DeleteServicesResponse
     */
    public DeleteServicesResponse deleteServices(DeleteServicesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DeleteServices");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteServicesResponse.class);
    }

    /**
     * describeDbStatement
     * 
     * @param request 入参结构体
     * @return DescribeDbStatementResponse
     */
    public DescribeDbStatementResponse describeDbStatement(DescribeDbStatementRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeDbStatement");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeDbStatementResponse.class);
    }

    /**
     * describeDefaultConfig
     * 
     * @return DescribeDefaultConfigResponse
     */
    public DescribeDefaultConfigResponse describeDefaultConfig() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeDefaultConfig");
        return invokeHttpClient(internalRequest, DescribeDefaultConfigResponse.class);
    }

    /**
     * describeDimensionValues
     * 
     * @param request 入参结构体
     * @return DescribeDimensionValuesResponse
     */
    public DescribeDimensionValuesResponse describeDimensionValues(DescribeDimensionValuesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeDimensionValues");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeDimensionValuesResponse.class);
    }

    /**
     * describeEnv
     * 
     * @return DescribeEnvResponse
     */
    public DescribeEnvResponse describeEnv() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeEnv");
        return invokeHttpClient(internalRequest, DescribeEnvResponse.class);
    }

    /**
     * describeExceptions
     * 
     * @param request 入参结构体
     * @return DescribeExceptionsResponse
     */
    public DescribeExceptionsResponse describeExceptions(DescribeExceptionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeExceptions");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeExceptionsResponse.class);
    }

    /**
     * describeLLMDimensionValues
     * 
     * @param request 入参结构体
     * @return DescribeLLMDimensionValuesResponse
     */
    public DescribeLLMDimensionValuesResponse describeLLMDimensionValues(DescribeLLMDimensionValuesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMDimensionValues");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMDimensionValuesResponse.class);
    }

    /**
     * describeLLMMetricData
     * 
     * @param request 入参结构体
     * @return DescribeLLMMetricDataResponse
     */
    public DescribeLLMMetricDataResponse describeLLMMetricData(DescribeLLMMetricDataRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMMetricData");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMMetricDataResponse.class);
    }

    /**
     * describeLLMServices
     * 
     * @param request 入参结构体
     * @return DescribeLLMServicesResponse
     */
    public DescribeLLMServicesResponse describeLLMServices(DescribeLLMServicesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMServices");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMServicesResponse.class);
    }

    /**
     * describeLLMSession
     * 
     * @param request 入参结构体
     * @return DescribeLLMSessionResponse
     */
    public DescribeLLMSessionResponse describeLLMSession(DescribeLLMSessionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMSession");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSessionResponse.class);
    }

    /**
     * describeLLMSessions
     * 
     * @param request 入参结构体
     * @return DescribeLLMSessionsResponse
     */
    public DescribeLLMSessionsResponse describeLLMSessions(DescribeLLMSessionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMSessions");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSessionsResponse.class);
    }

    /**
     * describeLLMSessionsStatistics
     * 
     * @param request 入参结构体
     * @return DescribeLLMSessionsStatisticsResponse
     */
    public DescribeLLMSessionsStatisticsResponse describeLLMSessionsStatistics(DescribeLLMSessionsStatisticsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMSessionsStatistics");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSessionsStatisticsResponse.class);
    }

    /**
     * describeLLMSpans
     * 
     * @param request 入参结构体
     * @return DescribeLLMSpansResponse
     */
    public DescribeLLMSpansResponse describeLLMSpans(DescribeLLMSpansRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMSpans");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSpansResponse.class);
    }

    /**
     * describeLLMTrace
     * 
     * @param request 入参结构体
     * @return DescribeLLMTraceResponse
     */
    public DescribeLLMTraceResponse describeLLMTrace(DescribeLLMTraceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMTrace");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMTraceResponse.class);
    }

    /**
     * describeLLMTraces
     * 
     * @param request 入参结构体
     * @return DescribeLLMTracesResponse
     */
    public DescribeLLMTracesResponse describeLLMTraces(DescribeLLMTracesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMTraces");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMTracesResponse.class);
    }

    /**
     * describeLLMTracesStatistics
     * 
     * @param request 入参结构体
     * @return DescribeLLMTracesStatisticsResponse
     */
    public DescribeLLMTracesStatisticsResponse describeLLMTracesStatistics(DescribeLLMTracesStatisticsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeLLMTracesStatistics");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMTracesStatisticsResponse.class);
    }

    /**
     * describeMetricData
     * 
     * @param request 入参结构体
     * @return DescribeMetricDataResponse
     */
    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeMetricData");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetricDataResponse.class);
    }

    /**
     * describeRetentionLimit
     * 
     * @return DescribeRetentionLimitResponse
     */
    public DescribeRetentionLimitResponse describeRetentionLimit() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeRetentionLimit");
        return invokeHttpClient(internalRequest, DescribeRetentionLimitResponse.class);
    }

    /**
     * describeServiceConfig
     * 
     * @param request 入参结构体
     * @return DescribeServiceConfigResponse
     */
    public DescribeServiceConfigResponse describeServiceConfig(DescribeServiceConfigRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeServiceConfig");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeServiceConfigResponse.class);
    }

    /**
     * describeServicesMetrics
     * 
     * @param request 入参结构体
     * @return DescribeServicesMetricsResponse
     */
    public DescribeServicesMetricsResponse describeServicesMetrics(DescribeServicesMetricsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeServicesMetrics");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeServicesMetricsResponse.class);
    }

    /**
     * describeServicesNames
     * 
     * @param request 入参结构体
     * @return DescribeServicesNamesResponse
     */
    public DescribeServicesNamesResponse describeServicesNames(DescribeServicesNamesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeServicesNames");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeServicesNamesResponse.class);
    }

    /**
     * describeSpanFieldValues
     * 
     * @param request 入参结构体
     * @return DescribeSpanFieldValuesResponse
     */
    public DescribeSpanFieldValuesResponse describeSpanFieldValues(DescribeSpanFieldValuesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeSpanFieldValues");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeSpanFieldValuesResponse.class);
    }

    /**
     * describeSpans
     * 
     * @param request 入参结构体
     * @return DescribeSpansResponse
     */
    public DescribeSpansResponse describeSpans(DescribeSpansRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeSpans");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeSpansResponse.class);
    }

    /**
     * describeTopology
     * 
     * @param request 入参结构体
     * @return DescribeTopologyResponse
     */
    public DescribeTopologyResponse describeTopology(DescribeTopologyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeTopology");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTopologyResponse.class);
    }

    /**
     * describeTrace
     * 
     * @param request 入参结构体
     * @return DescribeTraceResponse
     */
    public DescribeTraceResponse describeTrace(DescribeTraceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeTrace");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTraceResponse.class);
    }

    /**
     * describeTraceMetricData
     * 
     * @param request 入参结构体
     * @return DescribeTraceMetricDataResponse
     */
    public DescribeTraceMetricDataResponse describeTraceMetricData(DescribeTraceMetricDataRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM, CONSTANT_QUERY);
        internalRequest.addParameter("action", "DescribeTraceMetricData");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTraceMetricDataResponse.class);
    }

    /**
     * updateServiceConfig
     * 
     * @param request 入参结构体
     * @return UpdateServiceConfigResponse
     */
    public UpdateServiceConfigResponse updateServiceConfig(UpdateServiceConfigRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "UpdateServiceConfig");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateServiceConfigResponse.class);
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
