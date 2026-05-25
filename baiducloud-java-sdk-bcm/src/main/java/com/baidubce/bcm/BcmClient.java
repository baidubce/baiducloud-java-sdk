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

import com.baidubce.bcm.models.DescribeDbStatementV3Request;
import com.baidubce.bcm.models.DescribeDbStatementV3Response;
import com.baidubce.bcm.models.DescribeDimensionValuesRequest;
import com.baidubce.bcm.models.DescribeDimensionValuesResponse;
import com.baidubce.bcm.models.DescribeExceptionsV3Request;
import com.baidubce.bcm.models.DescribeExceptionsV3Response;
import com.baidubce.bcm.models.DescribeLLMDimensionValuesV3Request;
import com.baidubce.bcm.models.DescribeLLMDimensionValuesV3Response;
import com.baidubce.bcm.models.DescribeLLMMetricDataV3Request;
import com.baidubce.bcm.models.DescribeLLMServicesV3Request;
import com.baidubce.bcm.models.DescribeLLMServicesV3Response;
import com.baidubce.bcm.models.DescribeLLMSessionV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionV3Response;
import com.baidubce.bcm.models.DescribeLLMSessionsStatisticsV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionsStatisticsV3Response;
import com.baidubce.bcm.models.DescribeLLMSessionsV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionsV3Response;
import com.baidubce.bcm.models.DescribeLLMSpansV3Request;
import com.baidubce.bcm.models.DescribeLLMSpansV3Response;
import com.baidubce.bcm.models.DescribeLLMTraceV3Request;
import com.baidubce.bcm.models.DescribeLLMTraceV3Response;
import com.baidubce.bcm.models.DescribeLLMTracesStatisticsV3Request;
import com.baidubce.bcm.models.DescribeLLMTracesStatisticsV3Response;
import com.baidubce.bcm.models.DescribeLLMTracesV3Request;
import com.baidubce.bcm.models.DescribeLLMTracesV3Response;
import com.baidubce.bcm.models.DescribeMetricDataRequest;
import com.baidubce.bcm.models.DescribeMetricDataResponse;
import com.baidubce.bcm.models.DescribeSpanFieldValuesV3Request;
import com.baidubce.bcm.models.DescribeSpanFieldValuesV3Response;
import com.baidubce.bcm.models.DescribeSpansV3Request;
import com.baidubce.bcm.models.DescribeSpansV3Response;
import com.baidubce.bcm.models.DescribeTopologyV3Request;
import com.baidubce.bcm.models.DescribeTopologyV3Response;
import com.baidubce.bcm.models.DescribeTraceMetricDataV3Request;
import com.baidubce.bcm.models.DescribeTraceMetricDataV3Response;
import com.baidubce.bcm.models.DescribeTraceV3Request;
import com.baidubce.bcm.models.DescribeTraceV3Response;

public class BcmClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_APM = "apm";

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
     * describeDbStatementV3
     * 
     * @param request 入参结构体
     * @return DescribeDbStatementV3Response
     */
    public DescribeDbStatementV3Response describeDbStatementV3(DescribeDbStatementV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeDbStatement");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeDbStatementV3Response.class);
    }

    /**
     * describeDimensionValues
     * 
     * @param request 入参结构体
     * @return DescribeDimensionValuesResponse
     */
    public DescribeDimensionValuesResponse describeDimensionValues(DescribeDimensionValuesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeDimensionValues");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeDimensionValuesResponse.class);
    }

    /**
     * describeExceptionsV3
     * 
     * @param request 入参结构体
     * @return DescribeExceptionsV3Response
     */
    public DescribeExceptionsV3Response describeExceptionsV3(DescribeExceptionsV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeExceptions");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeExceptionsV3Response.class);
    }

    /**
     * describeLLMDimensionValuesV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMDimensionValuesV3Response
     */
    public DescribeLLMDimensionValuesV3Response describeLLMDimensionValuesV3(DescribeLLMDimensionValuesV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMDimensionValues");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMDimensionValuesV3Response.class);
    }

    /**
     * describeLLMMetricDataV3
     * 
     * @param request 入参结构体
     * @return DescribeTraceMetricDataV3Response
     */
    public DescribeTraceMetricDataV3Response describeLLMMetricDataV3(DescribeLLMMetricDataV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMMetricData");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTraceMetricDataV3Response.class);
    }

    /**
     * describeLLMServicesV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMServicesV3Response
     */
    public DescribeLLMServicesV3Response describeLLMServicesV3(DescribeLLMServicesV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMServices");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMServicesV3Response.class);
    }

    /**
     * describeLLMSessionV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMSessionV3Response
     */
    public DescribeLLMSessionV3Response describeLLMSessionV3(DescribeLLMSessionV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMSession");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSessionV3Response.class);
    }

    /**
     * describeLLMSessionsStatisticsV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMSessionsStatisticsV3Response
     */
    public DescribeLLMSessionsStatisticsV3Response describeLLMSessionsStatisticsV3(DescribeLLMSessionsStatisticsV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMSessionsStatistics");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSessionsStatisticsV3Response.class);
    }

    /**
     * describeLLMSessionsV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMSessionsV3Response
     */
    public DescribeLLMSessionsV3Response describeLLMSessionsV3(DescribeLLMSessionsV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMSessions");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSessionsV3Response.class);
    }

    /**
     * describeLLMSpansV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMSpansV3Response
     */
    public DescribeLLMSpansV3Response describeLLMSpansV3(DescribeLLMSpansV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMSpans");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMSpansV3Response.class);
    }

    /**
     * describeLLMTraceV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMTraceV3Response
     */
    public DescribeLLMTraceV3Response describeLLMTraceV3(DescribeLLMTraceV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMTrace");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMTraceV3Response.class);
    }

    /**
     * describeLLMTracesStatisticsV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMTracesStatisticsV3Response
     */
    public DescribeLLMTracesStatisticsV3Response describeLLMTracesStatisticsV3(DescribeLLMTracesStatisticsV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMTracesStatistics");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMTracesStatisticsV3Response.class);
    }

    /**
     * describeLLMTracesV3
     * 
     * @param request 入参结构体
     * @return DescribeLLMTracesV3Response
     */
    public DescribeLLMTracesV3Response describeLLMTracesV3(DescribeLLMTracesV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeLLMTraces");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeLLMTracesV3Response.class);
    }

    /**
     * describeMetricData
     * 
     * @param request 入参结构体
     * @return DescribeMetricDataResponse
     */
    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeMetricData");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeMetricDataResponse.class);
    }

    /**
     * describeSpanFieldValuesV3
     * 
     * @param request 入参结构体
     * @return DescribeSpanFieldValuesV3Response
     */
    public DescribeSpanFieldValuesV3Response describeSpanFieldValuesV3(DescribeSpanFieldValuesV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeSpanFieldValues");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeSpanFieldValuesV3Response.class);
    }

    /**
     * describeSpansV3
     * 
     * @param request 入参结构体
     * @return DescribeSpansV3Response
     */
    public DescribeSpansV3Response describeSpansV3(DescribeSpansV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeSpans");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeSpansV3Response.class);
    }

    /**
     * describeTopologyV3
     * 
     * @param request 入参结构体
     * @return DescribeTopologyV3Response
     */
    public DescribeTopologyV3Response describeTopologyV3(DescribeTopologyV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeTopology");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTopologyV3Response.class);
    }

    /**
     * describeTraceMetricDataV3
     * 
     * @param request 入参结构体
     * @return DescribeTraceMetricDataV3Response
     */
    public DescribeTraceMetricDataV3Response describeTraceMetricDataV3(DescribeTraceMetricDataV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeTraceMetricData");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTraceMetricDataV3Response.class);
    }

    /**
     * describeTraceV3
     * 
     * @param request 入参结构体
     * @return DescribeTraceV3Response
     */
    public DescribeTraceV3Response describeTraceV3(DescribeTraceV3Request request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V1, CONSTANT_APM);
        internalRequest.addParameter("action", "DescribeTrace");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeTraceV3Response.class);
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
