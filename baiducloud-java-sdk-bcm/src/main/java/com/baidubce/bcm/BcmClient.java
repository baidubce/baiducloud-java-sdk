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
import com.baidubce.bcm.models.CreateAlarmTemplateRequest;
import com.baidubce.bcm.models.CreateAlarmTemplateResponse;
import com.baidubce.bcm.models.CreateInstanceGroupRequest;
import com.baidubce.bcm.models.CreateInstanceGroupResponse;
import com.baidubce.bcm.models.CreateNotifyTemplateRequest;
import com.baidubce.bcm.models.CreateNotifyTemplateResponse;
import com.baidubce.bcm.models.DeleteAlarmMaskingsRequest;
import com.baidubce.bcm.models.DeleteAlarmMaskingsResponse;
import com.baidubce.bcm.models.DeleteAlarmPoliciesRequest;
import com.baidubce.bcm.models.DeleteAlarmPoliciesResponse;
import com.baidubce.bcm.models.DeleteAlarmPolicyActionsRequest;
import com.baidubce.bcm.models.DeleteAlarmPolicyActionsResponse;
import com.baidubce.bcm.models.DeleteAlarmTemplatesRequest;
import com.baidubce.bcm.models.DeleteAlarmTemplatesResponse;
import com.baidubce.bcm.models.DeleteInstanceGroupInstancesRequest;
import com.baidubce.bcm.models.DeleteInstanceGroupInstancesResponse;
import com.baidubce.bcm.models.DeleteInstanceGroupRequest;
import com.baidubce.bcm.models.DeleteInstanceGroupResponse;
import com.baidubce.bcm.models.DeleteNotifyTemplateRequest;
import com.baidubce.bcm.models.DeleteNotifyTemplateResponse;
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
import com.baidubce.bcm.models.DescribeAlarmTemplateRequest;
import com.baidubce.bcm.models.DescribeAlarmTemplateResponse;
import com.baidubce.bcm.models.DescribeAlarmTemplatesRequest;
import com.baidubce.bcm.models.DescribeAlarmTemplatesResponse;
import com.baidubce.bcm.models.DescribeAlarmsRequest;
import com.baidubce.bcm.models.DescribeAlarmsResponse;
import com.baidubce.bcm.models.DescribeDimensionValuesRequest;
import com.baidubce.bcm.models.DescribeDimensionValuesResponse;
import com.baidubce.bcm.models.DescribeInstanceGroupRequest;
import com.baidubce.bcm.models.DescribeInstanceGroupResponse;
import com.baidubce.bcm.models.DescribeInstanceGroupsRequest;
import com.baidubce.bcm.models.DescribeInstanceGroupsResponse;
import com.baidubce.bcm.models.DescribeMetricDataLatestRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestResponse;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopResponse;
import com.baidubce.bcm.models.DescribeMetricDataRequest;
import com.baidubce.bcm.models.DescribeMetricDataResponse;
import com.baidubce.bcm.models.DescribeNotifyTemplateRequest;
import com.baidubce.bcm.models.DescribeNotifyTemplateResponse;
import com.baidubce.bcm.models.DescribeNotifyTemplatesRequest;
import com.baidubce.bcm.models.DescribeNotifyTemplatesResponse;
import com.baidubce.bcm.models.DescribeReceiversRequest;
import com.baidubce.bcm.models.DescribeReceiversResponse;
import com.baidubce.bcm.models.DescribeSystemTemplateRulesRequest;
import com.baidubce.bcm.models.DescribeSystemTemplateRulesResponse;
import com.baidubce.bcm.models.ExportAlarmTemplatesRequest;
import com.baidubce.bcm.models.ExportAlarmTemplatesResponse;
import com.baidubce.bcm.models.ImportAlarmTemplatesRequest;
import com.baidubce.bcm.models.ImportAlarmTemplatesResponse;
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
import com.baidubce.bcm.models.UpdateAlarmTemplateRequest;
import com.baidubce.bcm.models.UpdateAlarmTemplateResponse;
import com.baidubce.bcm.models.UpdateInstanceGroupRequest;
import com.baidubce.bcm.models.UpdateInstanceGroupResponse;
import com.baidubce.bcm.models.UpdateNotifyTemplateRequest;
import com.baidubce.bcm.models.UpdateNotifyTemplateResponse;

public class BcmClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V3 = "v3";
    private static final String CONSTANT_BCM = "bcm";
    private static final String CONSTANT_AH = "ah";
    private static final String CONSTANT_QUERY = "query";

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
     * createAlarmTemplate
     * 
     * @param request 入参结构体
     * @return CreateAlarmTemplateResponse
     */
    public CreateAlarmTemplateResponse createAlarmTemplate(CreateAlarmTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "CreateAlarmTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAlarmTemplateResponse.class);
    }

    /**
     * createInstanceGroup
     * 
     * @param request 入参结构体
     * @return CreateInstanceGroupResponse
     */
    public CreateInstanceGroupResponse createInstanceGroup(CreateInstanceGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "CreateInstanceGroup");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateInstanceGroupResponse.class);
    }

    /**
     * createNotifyTemplate
     * 
     * @param request 入参结构体
     * @return CreateNotifyTemplateResponse
     */
    public CreateNotifyTemplateResponse createNotifyTemplate(CreateNotifyTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "CreateNotifyTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateNotifyTemplateResponse.class);
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
     * deleteAlarmTemplates
     * 
     * @param request 入参结构体
     * @return DeleteAlarmTemplatesResponse
     */
    public DeleteAlarmTemplatesResponse deleteAlarmTemplates(DeleteAlarmTemplatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DeleteAlarmTemplates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteAlarmTemplatesResponse.class);
    }

    /**
     * deleteInstanceGroup
     * 
     * @param request 入参结构体
     * @return DeleteInstanceGroupResponse
     */
    public DeleteInstanceGroupResponse deleteInstanceGroup(DeleteInstanceGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DeleteInstanceGroup");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteInstanceGroupResponse.class);
    }

    /**
     * deleteInstanceGroupInstances
     * 
     * @param request 入参结构体
     * @return DeleteInstanceGroupInstancesResponse
     */
    public DeleteInstanceGroupInstancesResponse deleteInstanceGroupInstances(DeleteInstanceGroupInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DeleteInstanceGroupInstances");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteInstanceGroupInstancesResponse.class);
    }

    /**
     * deleteNotifyTemplate
     * 
     * @param request 入参结构体
     * @return DeleteNotifyTemplateResponse
     */
    public DeleteNotifyTemplateResponse deleteNotifyTemplate(DeleteNotifyTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DeleteNotifyTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DeleteNotifyTemplateResponse.class);
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
     * describeAlarmTemplate
     * 
     * @param request 入参结构体
     * @return DescribeAlarmTemplateResponse
     */
    public DescribeAlarmTemplateResponse describeAlarmTemplate(DescribeAlarmTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeAlarmTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmTemplateResponse.class);
    }

    /**
     * describeAlarmTemplates
     * 
     * @param request 入参结构体
     * @return DescribeAlarmTemplatesResponse
     */
    public DescribeAlarmTemplatesResponse describeAlarmTemplates(DescribeAlarmTemplatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeAlarmTemplates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeAlarmTemplatesResponse.class);
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
     * describeInstanceGroup
     * 
     * @param request 入参结构体
     * @return DescribeInstanceGroupResponse
     */
    public DescribeInstanceGroupResponse describeInstanceGroup(DescribeInstanceGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeInstanceGroup");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeInstanceGroupResponse.class);
    }

    /**
     * describeInstanceGroups
     * 
     * @param request 入参结构体
     * @return DescribeInstanceGroupsResponse
     */
    public DescribeInstanceGroupsResponse describeInstanceGroups(DescribeInstanceGroupsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeInstanceGroups");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeInstanceGroupsResponse.class);
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
     * describeNotifyTemplate
     * 
     * @param request 入参结构体
     * @return DescribeNotifyTemplateResponse
     */
    public DescribeNotifyTemplateResponse describeNotifyTemplate(DescribeNotifyTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeNotifyTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeNotifyTemplateResponse.class);
    }

    /**
     * describeNotifyTemplates
     * 
     * @param request 入参结构体
     * @return DescribeNotifyTemplatesResponse
     */
    public DescribeNotifyTemplatesResponse describeNotifyTemplates(DescribeNotifyTemplatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeNotifyTemplates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeNotifyTemplatesResponse.class);
    }

    /**
     * describeReceivers
     * 
     * @param request 入参结构体
     * @return DescribeReceiversResponse
     */
    public DescribeReceiversResponse describeReceivers(DescribeReceiversRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeReceivers");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeReceiversResponse.class);
    }

    /**
     * describeSystemTemplateRules
     * 
     * @param request 入参结构体
     * @return DescribeSystemTemplateRulesResponse
     */
    public DescribeSystemTemplateRulesResponse describeSystemTemplateRules(DescribeSystemTemplateRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "DescribeSystemTemplateRules");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DescribeSystemTemplateRulesResponse.class);
    }

    /**
     * exportAlarmTemplates
     * 
     * @param request 入参结构体
     * @return ExportAlarmTemplatesResponse
     */
    public ExportAlarmTemplatesResponse exportAlarmTemplates(ExportAlarmTemplatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "ExportAlarmTemplates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ExportAlarmTemplatesResponse.class);
    }

    /**
     * importAlarmTemplates
     * 
     * @param request 入参结构体
     * @return ImportAlarmTemplatesResponse
     */
    public ImportAlarmTemplatesResponse importAlarmTemplates(ImportAlarmTemplatesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "ImportAlarmTemplates");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ImportAlarmTemplatesResponse.class);
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
     * updateAlarmTemplate
     * 
     * @param request 入参结构体
     * @return UpdateAlarmTemplateResponse
     */
    public UpdateAlarmTemplateResponse updateAlarmTemplate(UpdateAlarmTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateAlarmTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateAlarmTemplateResponse.class);
    }

    /**
     * updateInstanceGroup
     * 
     * @param request 入参结构体
     * @return UpdateInstanceGroupResponse
     */
    public UpdateInstanceGroupResponse updateInstanceGroup(UpdateInstanceGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateInstanceGroup");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateInstanceGroupResponse.class);
    }

    /**
     * updateNotifyTemplate
     * 
     * @param request 入参结构体
     * @return UpdateNotifyTemplateResponse
     */
    public UpdateNotifyTemplateResponse updateNotifyTemplate(UpdateNotifyTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V3, CONSTANT_BCM);
        internalRequest.addParameter("action", "UpdateNotifyTemplate");
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UpdateNotifyTemplateResponse.class);
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
