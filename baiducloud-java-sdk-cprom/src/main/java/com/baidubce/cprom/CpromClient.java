package com.baidubce.cprom;

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
import com.baidubce.common.BaseBceResponse;

import com.baidubce.cprom.models.BindClusterRequest;
import com.baidubce.cprom.models.BindClusterResponse;
import com.baidubce.cprom.models.ClaimAlertEventRequest;
import com.baidubce.cprom.models.ClaimAlertEventResponse;
import com.baidubce.cprom.models.CreateAlertRequest;
import com.baidubce.cprom.models.CreateAlertResponse;
import com.baidubce.cprom.models.CreateCustomScrapeTaskRequest;
import com.baidubce.cprom.models.CreateCustomScrapeTaskResponse;
import com.baidubce.cprom.models.CreateInstanceRequest;
import com.baidubce.cprom.models.CreateNotificationPolicyRequest;
import com.baidubce.cprom.models.CreateNotificationPolicyResponse;
import com.baidubce.cprom.models.CreatePodmonitorRequest;
import com.baidubce.cprom.models.CreatePodmonitorResponse;
import com.baidubce.cprom.models.CreateServiceMonitorRequest;
import com.baidubce.cprom.models.CreateServiceMonitorResponse;
import com.baidubce.cprom.models.DeleteAlertRequest;
import com.baidubce.cprom.models.DeleteCustomScrapeTaskRequest;
import com.baidubce.cprom.models.DeleteInstanceRequest;
import com.baidubce.cprom.models.DeleteNotificationPolicyRequest;
import com.baidubce.cprom.models.DeletePodmonitorRequest;
import com.baidubce.cprom.models.DeleteServiceMonitorRequest;
import com.baidubce.cprom.models.GenerateInstanceTokenRequest;
import com.baidubce.cprom.models.GetAlertDetailRequest;
import com.baidubce.cprom.models.GetAlertDetailResponse;
import com.baidubce.cprom.models.GetAlertEventDetailRequest;
import com.baidubce.cprom.models.GetAlertEventDetailResponse;
import com.baidubce.cprom.models.GetClusterBindStatusRequest;
import com.baidubce.cprom.models.GetClusterBindStatusResponse;
import com.baidubce.cprom.models.GetNotificationPolicyRequest;
import com.baidubce.cprom.models.GetNotificationPolicyResponse;
import com.baidubce.cprom.models.ListAlertEventsRequest;
import com.baidubce.cprom.models.ListAlertEventsResponse;
import com.baidubce.cprom.models.ListAlertTemplatesResponse;
import com.baidubce.cprom.models.ListAlertsRequest;
import com.baidubce.cprom.models.ListAlertsResponse;
import com.baidubce.cprom.models.ListBindableCloudProductsResponse;
import com.baidubce.cprom.models.ListInstancesRequest;
import com.baidubce.cprom.models.ListInstancesResponse;
import com.baidubce.cprom.models.ListNotificationPoliciesRequest;
import com.baidubce.cprom.models.ListNotificationPoliciesResponse;
import com.baidubce.cprom.models.ListPodMonitorsRequest;
import com.baidubce.cprom.models.ListPodMonitorsResponse;
import com.baidubce.cprom.models.ListRelatedCloudProductsRequest;
import com.baidubce.cprom.models.ListRelatedCloudProductsResponse;
import com.baidubce.cprom.models.ListServiceMonitorsRequest;
import com.baidubce.cprom.models.ListServiceMonitorsResponse;
import com.baidubce.cprom.models.RemoteReadRequest;
import com.baidubce.cprom.models.RemoteReadResponse;
import com.baidubce.cprom.models.RemoteWriteRequest;
import com.baidubce.cprom.models.TogglePodMonitorServiceRequest;
import com.baidubce.cprom.models.ToggleServiceMonitorServiceRequest;
import com.baidubce.cprom.models.UpdateAlertRequest;
import com.baidubce.cprom.models.UpdateNotificationPolicyRequest;
import com.baidubce.cprom.models.UpdatePodMonitorRequest;
import com.baidubce.cprom.models.UpdateRelatedCloudProductsRequest;
import com.baidubce.cprom.models.UpdateServiceMonitorRequest;

public class CpromClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_NOTIFY_RULE = "notify_rule";
    private static final String CONSTANT_BCM_SCOPES = "bcm_scopes";
    private static final String CONSTANT_INSTANCE = "instance";
    private static final String CONSTANT_SERVICE_MONITOR = "service_monitor";
    private static final String CONSTANT_ALERTING_RULE = "alerting_rule";
    private static final String CONSTANT_POD_MONITOR = "pod_monitor";
    private static final String CONSTANT_SCRAPE_JOB = "scrape_job";
    private static final String CONSTANT_BCM_JOB = "bcm_job";
    private static final String CONSTANT_SCOPES = "scopes";
    private static final String CONSTANT_POD_MONITOR_SERVICE = "pod_monitor_service";
    private static final String CONSTANT_EVENT = "event";
    private static final String CONSTANT_CLAIM = "claim";
    private static final String CONSTANT_PROMETHEUS = "prometheus";
    private static final String CONSTANT_API = "api";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_QUERY_RANGE = "query_range";
    private static final String CONSTANT_TOKEN = "token";
    private static final String CONSTANT_CLUSTER_BINDING = "cluster_binding";
    private static final String CONSTANT_WRITE = "write";
    private static final String CONSTANT_ALERTING_RULE_TEMPLATE = "alerting_rule_template";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public CpromClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public CpromClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * bindCluster
     * 
     * @param request 入参结构体
     * @return BindClusterResponse
     */
    public BindClusterResponse bindCluster(BindClusterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId());
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BindClusterResponse.class);
    }

    /**
     * claimAlertEvent
     * 
     * @param request 入参结构体
     * @return ClaimAlertEventResponse
     */
    public ClaimAlertEventResponse claimAlertEvent(ClaimAlertEventRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_EVENT, CONSTANT_CLAIM);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ClaimAlertEventResponse.class);
    }

    /**
     * createAlert
     * 
     * @param request 入参结构体
     * @return CreateAlertResponse
     */
    public CreateAlertResponse createAlert(CreateAlertRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_ALERTING_RULE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAlertResponse.class);
    }

    /**
     * createCustomScrapeTask
     * 
     * @param request 入参结构体
     * @return CreateCustomScrapeTaskResponse
     */
    public CreateCustomScrapeTaskResponse createCustomScrapeTask(CreateCustomScrapeTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_SCRAPE_JOB);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateCustomScrapeTaskResponse.class);
    }

    /**
     * createInstance
     * 
     * @param request 入参结构体
     */
    public void createInstance(CreateInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_INSTANCE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createNotificationPolicy
     * 
     * @param request 入参结构体
     * @return CreateNotificationPolicyResponse
     */
    public CreateNotificationPolicyResponse createNotificationPolicy(CreateNotificationPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_NOTIFY_RULE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateNotificationPolicyResponse.class);
    }

    /**
     * createPodmonitor
     * 
     * @param request 入参结构体
     * @return CreatePodmonitorResponse
     */
    public CreatePodmonitorResponse createPodmonitor(CreatePodmonitorRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_POD_MONITOR);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreatePodmonitorResponse.class);
    }

    /**
     * createServiceMonitor
     * 
     * @param request 入参结构体
     * @return CreateServiceMonitorResponse
     */
    public CreateServiceMonitorResponse createServiceMonitor(CreateServiceMonitorRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_SERVICE_MONITOR);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateServiceMonitorResponse.class);
    }

    /**
     * deleteAlert
     * 
     * @param request 入参结构体
     */
    public void deleteAlert(DeleteAlertRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_ALERTING_RULE, request.getAlertingRuleId());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteCustomScrapeTask
     * 
     * @param request 入参结构体
     */
    public void deleteCustomScrapeTask(DeleteCustomScrapeTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_SCRAPE_JOB, request.getScrapeJobId());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteInstance
     * 
     * @param request 入参结构体
     */
    public void deleteInstance(DeleteInstanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId());
        if (request.getDeleteGrafana() != null) {
            internalRequest.addParameter("deleteGrafana", String.valueOf(request.getDeleteGrafana()));
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteNotificationPolicy
     * 
     * @param request 入参结构体
     */
    public void deleteNotificationPolicy(DeleteNotificationPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_NOTIFY_RULE, request.getNotifyRuleId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deletePodmonitor
     * 
     * @param request 入参结构体
     */
    public void deletePodmonitor(DeletePodmonitorRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_POD_MONITOR, request.getPodMonitorName());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteServiceMonitor
     * 
     * @param request 入参结构体
     */
    public void deleteServiceMonitor(DeleteServiceMonitorRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, CONSTANT_V2, CONSTANT_SERVICE_MONITOR, request.getServiceMonitorName());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * generateInstanceToken
     * 
     * @param request 入参结构体
     */
    public void generateInstanceToken(GenerateInstanceTokenRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_V2, CONSTANT_INSTANCE, request.getInstanceId(), CONSTANT_TOKEN);
        if (request.getAction() != null) {
            internalRequest.addParameter("Action", request.getAction());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getAlertDetail
     * 
     * @param request 入参结构体
     * @return GetAlertDetailResponse
     */
    public GetAlertDetailResponse getAlertDetail(GetAlertDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_ALERTING_RULE, request.getAlertingRuleId());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        return invokeHttpClient(internalRequest, GetAlertDetailResponse.class);
    }

    /**
     * getAlertEventDetail
     * 
     * @param request 入参结构体
     * @return GetAlertEventDetailResponse
     */
    public GetAlertEventDetailResponse getAlertEventDetail(GetAlertEventDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_EVENT, request.getEventId());
        return invokeHttpClient(internalRequest, GetAlertEventDetailResponse.class);
    }

    /**
     * getClusterBindStatus
     * 
     * @param request 入参结构体
     * @return GetClusterBindStatusResponse
     */
    public GetClusterBindStatusResponse getClusterBindStatus(GetClusterBindStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_CLUSTER_BINDING);
        if (request.getClusterId() != null) {
            internalRequest.addParameter("clusterId", request.getClusterId());
        }
        return invokeHttpClient(internalRequest, GetClusterBindStatusResponse.class);
    }

    /**
     * getNotificationPolicy
     * 
     * @param request 入参结构体
     * @return GetNotificationPolicyResponse
     */
    public GetNotificationPolicyResponse getNotificationPolicy(GetNotificationPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_NOTIFY_RULE, request.getNotifyRuleId());
        return invokeHttpClient(internalRequest, GetNotificationPolicyResponse.class);
    }

    /**
     * listAlertEvents
     * 
     * @param request 入参结构体
     * @return ListAlertEventsResponse
     */
    public ListAlertEventsResponse listAlertEvents(ListAlertEventsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_EVENT);
        if (request.getStartTime() != null) {
            internalRequest.addParameter("startTime", String.valueOf(request.getStartTime()));
        }
        if (request.getEndTime() != null) {
            internalRequest.addParameter("endTime", String.valueOf(request.getEndTime()));
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getMonitorInstanceId() != null) {
            internalRequest.addParameter("monitorInstanceId", request.getMonitorInstanceId());
        }
        if (request.getAlertingRuleId() != null) {
            internalRequest.addParameter("alertingRuleId", request.getAlertingRuleId());
        }
        if (request.getAlertingRuleName() != null) {
            internalRequest.addParameter("alertingRuleName", request.getAlertingRuleName());
        }
        if (request.getNotifyRuleId() != null) {
            internalRequest.addParameter("notifyRuleId", request.getNotifyRuleId());
        }
        if (request.getNotifyRuleName() != null) {
            internalRequest.addParameter("notifyRuleName", request.getNotifyRuleName());
        }
        if (request.getSeverity() != null) {
            internalRequest.addParameter("severity", request.getSeverity());
        }
        if (request.getStatus() != null) {
            internalRequest.addParameter("status", request.getStatus());
        }
        if (request.getExpr() != null) {
            internalRequest.addParameter("expr", request.getExpr());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getAlarmTags() != null) {
            internalRequest.addParameter("alarmTags", request.getAlarmTags());
        }
        return invokeHttpClient(internalRequest, ListAlertEventsResponse.class);
    }

    /**
     * listAlertTemplates
     * 
     * @return ListAlertTemplatesResponse
     */
    public ListAlertTemplatesResponse listAlertTemplates() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, CONSTANT_V2, CONSTANT_ALERTING_RULE_TEMPLATE);
        return invokeHttpClient(internalRequest, ListAlertTemplatesResponse.class);
    }

    /**
     * listAlerts
     * 
     * @param request 入参结构体
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(ListAlertsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_ALERTING_RULE);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        return invokeHttpClient(internalRequest, ListAlertsResponse.class);
    }

    /**
     * listBindableCloudProducts
     * 
     * @return ListBindableCloudProductsResponse
     */
    public ListBindableCloudProductsResponse listBindableCloudProducts() {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, CONSTANT_V2, CONSTANT_BCM_SCOPES);
        return invokeHttpClient(internalRequest, ListBindableCloudProductsResponse.class);
    }

    /**
     * listInstances
     * 
     * @param request 入参结构体
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_INSTANCE);
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPhase() != null) {
            internalRequest.addParameter("phase", request.getPhase());
        }
        return invokeHttpClient(internalRequest, ListInstancesResponse.class);
    }

    /**
     * listNotificationPolicies
     * 
     * @param request 入参结构体
     * @return ListNotificationPoliciesResponse
     */
    public ListNotificationPoliciesResponse listNotificationPolicies(ListNotificationPoliciesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_NOTIFY_RULE);
        internalRequest.addParameter("pageNo", "1");
        internalRequest.addParameter("pageSize", "10");
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        return invokeHttpClient(internalRequest, ListNotificationPoliciesResponse.class);
    }

    /**
     * listPodMonitors
     * 
     * @param request 入参结构体
     * @return ListPodMonitorsResponse
     */
    public ListPodMonitorsResponse listPodMonitors(ListPodMonitorsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_POD_MONITOR);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, ListPodMonitorsResponse.class);
    }

    /**
     * listRelatedCloudProducts
     * 
     * @param request 入参结构体
     * @return ListRelatedCloudProductsResponse
     */
    public ListRelatedCloudProductsResponse listRelatedCloudProducts(ListRelatedCloudProductsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_BCM_JOB, CONSTANT_SCOPES);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        return invokeHttpClient(internalRequest, ListRelatedCloudProductsResponse.class);
    }

    /**
     * listServiceMonitors
     * 
     * @param request 入参结构体
     * @return ListServiceMonitorsResponse
     */
    public ListServiceMonitorsResponse listServiceMonitors(ListServiceMonitorsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, CONSTANT_V2, CONSTANT_SERVICE_MONITOR);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        if (request.getPageNo() != null) {
            internalRequest.addParameter("pageNo", String.valueOf(request.getPageNo()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getKeywordType() != null) {
            internalRequest.addParameter("keywordType", request.getKeywordType());
        }
        if (request.getKeyword() != null) {
            internalRequest.addParameter("keyword", request.getKeyword());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, ListServiceMonitorsResponse.class);
    }

    /**
     * remoteRead
     * 
     * @param request 入参结构体
     * @return RemoteReadResponse
     */
    public RemoteReadResponse remoteRead(RemoteReadRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_PROMETHEUS, CONSTANT_API, CONSTANT_V1, CONSTANT_QUERY_RANGE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, RemoteReadResponse.class);
    }

    /**
     * remoteWrite
     * 
     * @param request 入参结构体
     */
    public void remoteWrite(RemoteWriteRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_PROMETHEUS, CONSTANT_API, CONSTANT_V1, CONSTANT_WRITE);
        if (request.getContentType() != null) {
            internalRequest.addHeader("Content-Type", String.valueOf(request.getContentType()));
        }
        if (request.getContentEncoding() != null) {
            internalRequest.addHeader("Content-Encoding", String.valueOf(request.getContentEncoding()));
        }
        if (request.getInstanceId() != null) {
            internalRequest.addHeader("InstanceId", String.valueOf(request.getInstanceId()));
        }
        if (request.getAuthorization() != null) {
            internalRequest.addHeader("Authorization", String.valueOf(request.getAuthorization()));
        }
        if (request.getBody() != null) {
            RequestBodyUtils.fillPayloadAsStream(internalRequest, request.getBody());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * togglePodMonitorService
     * 
     * @param request 入参结构体
     */
    public void togglePodMonitorService(TogglePodMonitorServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_POD_MONITOR_SERVICE);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * toggleServiceMonitorService
     * 
     * @param request 入参结构体
     */
    public void toggleServiceMonitorService(ToggleServiceMonitorServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_SERVICE_MONITOR);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAlert
     * 
     * @param request 入参结构体
     */
    public void updateAlert(UpdateAlertRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_ALERTING_RULE, request.getAlertingRuleId());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateNotificationPolicy
     * 
     * @param request 入参结构体
     */
    public void updateNotificationPolicy(UpdateNotificationPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_NOTIFY_RULE, request.getNotifyRuleId());
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updatePodMonitor
     * 
     * @param request 入参结构体
     */
    public void updatePodMonitor(UpdatePodMonitorRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_POD_MONITOR, request.getPodMonitorName());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateRelatedCloudProducts
     * 
     * @param request 入参结构体
     */
    public void updateRelatedCloudProducts(UpdateRelatedCloudProductsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_BCM_JOB, CONSTANT_SCOPES);
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateServiceMonitor
     * 
     * @param request 入参结构体
     */
    public void updateServiceMonitor(UpdateServiceMonitorRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, CONSTANT_V2, CONSTANT_SERVICE_MONITOR, request.getServiceMonitorName());
        if (request.getInstanceId() != null) {
            internalRequest.addParameter("instanceId", request.getInstanceId());
        }
        if (request.getAgentId() != null) {
            internalRequest.addParameter("agentId", request.getAgentId());
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
