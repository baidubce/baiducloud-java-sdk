package com.baidubce.dbsc;

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

import com.baidubce.dbsc.models.CheckMysqlRateLimitSupportResponse;
import com.baidubce.dbsc.models.CreateMysqlRateLimitTaskRequest;
import com.baidubce.dbsc.models.CreateRedisBigKeyAnalysisTaskRequest;
import com.baidubce.dbsc.models.CreateRedisBigKeyAnalysisTaskResponse;
import com.baidubce.dbsc.models.DeleteRedisBigKeyAnalysisTaskRequest;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceRequest;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceResponse;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceTrendRequest;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceTrendResponse;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceRequest;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceResponse;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceTrendRequest;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceTrendResponse;
import com.baidubce.dbsc.models.GetMongodbSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetMongodbSlowLogTimeDistributionResponse;
import com.baidubce.dbsc.models.GetMongodbSlowLogTrendRequest;
import com.baidubce.dbsc.models.GetMongodbSlowLogTrendResponse;
import com.baidubce.dbsc.models.GetMongodbSlowQueryTemplateRequest;
import com.baidubce.dbsc.models.GetMongodbSlowQueryTemplateResponse;
import com.baidubce.dbsc.models.GetMongodbSpaceSummaryRequest;
import com.baidubce.dbsc.models.GetMongodbSpaceSummaryResponse;
import com.baidubce.dbsc.models.GetMysqlActiveSessionsRequest;
import com.baidubce.dbsc.models.GetMysqlActiveSessionsResponse;
import com.baidubce.dbsc.models.GetMysqlDatabaseSpaceRequest;
import com.baidubce.dbsc.models.GetMysqlDatabaseSpaceResponse;
import com.baidubce.dbsc.models.GetMysqlDeadlockInfoResponse;
import com.baidubce.dbsc.models.GetMysqlKillSessionHistoryResponse;
import com.baidubce.dbsc.models.GetMysqlRateLimitTaskDetailRequest;
import com.baidubce.dbsc.models.GetMysqlRateLimitTaskDetailResponse;
import com.baidubce.dbsc.models.GetMysqlSlowLogTemplateRequest;
import com.baidubce.dbsc.models.GetMysqlSlowLogTemplateResponse;
import com.baidubce.dbsc.models.GetMysqlSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetMysqlSlowLogTimeDistributionResponse;
import com.baidubce.dbsc.models.GetMysqlSlowLogTrendRequest;
import com.baidubce.dbsc.models.GetMysqlSlowLogTrendResponse;
import com.baidubce.dbsc.models.GetMysqlSpaceSummaryRequest;
import com.baidubce.dbsc.models.GetMysqlSpaceSummaryResponse;
import com.baidubce.dbsc.models.GetMysqlTableIndexesResponse;
import com.baidubce.dbsc.models.GetMysqlTableSpaceRequest;
import com.baidubce.dbsc.models.GetMysqlTableSpaceResponse;
import com.baidubce.dbsc.models.GetPegadbSlowLogTemplateRequest;
import com.baidubce.dbsc.models.GetPegadbSlowLogTemplateResponse;
import com.baidubce.dbsc.models.GetPegadbSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetPegadbSlowLogTimeDistributionResponse;
import com.baidubce.dbsc.models.GetPegadbSlowLogTrendRequest;
import com.baidubce.dbsc.models.GetPegadbSlowLogTrendResponse;
import com.baidubce.dbsc.models.GetPostgresqlSlowLogTemplateRequest;
import com.baidubce.dbsc.models.GetPostgresqlSlowLogTemplateResponse;
import com.baidubce.dbsc.models.GetPostgresqlSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetPostgresqlSlowLogTimeDistributionResponse;
import com.baidubce.dbsc.models.GetPostgresqlSlowLogTrendResponse;
import com.baidubce.dbsc.models.GetRedisBigKeyAnalysisResultResponse;
import com.baidubce.dbsc.models.GetRedisSlowLogTemplateRequest;
import com.baidubce.dbsc.models.GetRedisSlowLogTemplateResponse;
import com.baidubce.dbsc.models.GetRedisSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetRedisSlowLogTimeDistributionResponse;
import com.baidubce.dbsc.models.GetRedisSlowLogTrendRequest;
import com.baidubce.dbsc.models.GetRedisSlowLogTrendResponse;
import com.baidubce.dbsc.models.KillMysqlSessionRequest;
import com.baidubce.dbsc.models.KillMysqlSessionResponse;
import com.baidubce.dbsc.models.ListMongodbSlowLogsRequest;
import com.baidubce.dbsc.models.ListMongodbSlowLogsResponse;
import com.baidubce.dbsc.models.ListMysqlRateLimitTasksResponse;
import com.baidubce.dbsc.models.ListMysqlSlowLogsRequest;
import com.baidubce.dbsc.models.ListMysqlSlowLogsResponse;
import com.baidubce.dbsc.models.ListPegadbSlowLogsRequest;
import com.baidubce.dbsc.models.ListPegadbSlowLogsResponse;
import com.baidubce.dbsc.models.ListPostgresqlSlowLogsRequest;
import com.baidubce.dbsc.models.ListPostgresqlSlowLogsResponse;
import com.baidubce.dbsc.models.ListRedisBigKeyAnalysisTasksRequest;
import com.baidubce.dbsc.models.ListRedisBigKeyAnalysisTasksResponse;
import com.baidubce.dbsc.models.ListRedisSlowLogsRequest;
import com.baidubce.dbsc.models.ListRedisSlowLogsResponse;
import com.baidubce.dbsc.models.StartStopMysqlInstanceFlowLimitingTaskRequest;
import com.baidubce.dbsc.models.UpdateMysqlRateLimitTaskRequest;

public class DbscClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_DIAGNOSIS = "diagnosis";
    private static final String CONSTANT_MYSQL = "mysql";
    private static final String CONSTANT_SQLFILTER = "sqlfilter";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_SESSION = "session";
    private static final String CONSTANT_KILL = "kill";
    private static final String CONSTANT_LIST = "list";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_ACTION = "action";
    private static final String CONSTANT_API = "api";
    private static final String CONSTANT_REDIS = "redis";
    private static final String CONSTANT_SLOWLOG = "slowlog";
    private static final String CONSTANT_TREND = "trend";
    private static final String CONSTANT_STATS = "stats";
    private static final String CONSTANT_DURATION = "duration";
    private static final String CONSTANT_DEADLOCK = "deadlock";
    private static final String CONSTANT_LATEST = "latest";
    private static final String CONSTANT_MONGODB = "mongodb";
    private static final String CONSTANT_SPACE = "space";
    private static final String CONSTANT_COLLECTION = "collection";
    private static final String CONSTANT_PEGA = "pega";
    private static final String CONSTANT_SCHEMA = "schema";
    private static final String CONSTANT_TABLE = "table";
    private static final String CONSTANT_INDEX = "index";
    private static final String CONSTANT_BIG_KEY = "big-key";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_TEMPLATE = "template";
    private static final String CONSTANT_DATABASE = "database";
    private static final String CONSTANT_POSTGRESQL = "postgresql";
    private static final String CONSTANT_HISTORY = "history";
    private static final String CONSTANT_SUMMARY = "summary";
    private static final String CONSTANT_RESULT = "result";
    private static final String CONSTANT_ALLOWED = "allowed";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public DbscClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public DbscClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * checkMysqlRateLimitSupport
     * 
     * @return CheckMysqlRateLimitSupportResponse
     */
    public CheckMysqlRateLimitSupportResponse checkMysqlRateLimitSupport() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SQLFILTER, CONSTANT_ALLOWED);
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("nodeId", "nodeId");
        return invokeHttpClient(internalRequest, CheckMysqlRateLimitSupportResponse.class);
    }

    /**
     * createMysqlRateLimitTask
     * 
     * @param request 入参结构体
     */
    public void createMysqlRateLimitTask(CreateMysqlRateLimitTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SQLFILTER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createRedisBigKeyAnalysisTask
     * 
     * @param request 入参结构体
     * @return CreateRedisBigKeyAnalysisTaskResponse
     */
    public CreateRedisBigKeyAnalysisTaskResponse createRedisBigKeyAnalysisTask(CreateRedisBigKeyAnalysisTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_BIG_KEY, CONSTANT_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateRedisBigKeyAnalysisTaskResponse.class);
    }

    /**
     * deleteMysqlRateLimitTask
     * 
     */
    public void deleteMysqlRateLimitTask() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SQLFILTER, CONSTANT_DELETE);
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("nodeId", "nodeId");
        internalRequest.addParameter("filterId", "filterId");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteRedisBigKeyAnalysisTask
     * 
     * @param request 入参结构体
     */
    public void deleteRedisBigKeyAnalysisTask(DeleteRedisBigKeyAnalysisTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_BIG_KEY, CONSTANT_TASK);
        if (request.getIds() != null && !request.getIds().isEmpty()) {
            internalRequest.addParameter("ids", String.join(",", request.getIds()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getMongodbCollectionIndexes
     * 
     */
    public void getMongodbCollectionIndexes() {
        InternalRequest internalRequest =
                this.createRequest(
                        new BaseBceRequest(),
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_API,
                        CONSTANT_DIAGNOSIS,
                        CONSTANT_MONGODB,
                        CONSTANT_SCHEMA,
                        CONSTANT_COLLECTION,
                        CONSTANT_INDEX);
        internalRequest.addParameter("product", "string");
        internalRequest.addParameter("appId", "string");
        internalRequest.addParameter("nodeId", "string");
        internalRequest.addParameter("database", "string");
        internalRequest.addParameter("collection", "string");
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * getMongodbCollectionSpace
     * 
     * @param request 入参结构体
     * @return GetMongodbCollectionSpaceResponse
     */
    public GetMongodbCollectionSpaceResponse getMongodbCollectionSpace(GetMongodbCollectionSpaceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_MONGODB, CONSTANT_SPACE, CONSTANT_COLLECTION);
        internalRequest.addParameter("appId", "appId");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getDatabase() != null) {
            internalRequest.addParameter("database", request.getDatabase());
        }
        if (request.getCollection() != null) {
            internalRequest.addParameter("collection", request.getCollection());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetMongodbCollectionSpaceResponse.class);
    }

    /**
     * getMongodbCollectionSpaceTrend
     * 
     * @param request 入参结构体
     * @return GetMongodbCollectionSpaceTrendResponse
     */
    public GetMongodbCollectionSpaceTrendResponse getMongodbCollectionSpaceTrend(GetMongodbCollectionSpaceTrendRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_API,
                        CONSTANT_DIAGNOSIS,
                        CONSTANT_MONGODB,
                        CONSTANT_SPACE,
                        CONSTANT_COLLECTION,
                        CONSTANT_TREND);
        internalRequest.addParameter("appId", "appId");
        if (request.getDatabase() != null) {
            internalRequest.addParameter("database", request.getDatabase());
        }
        if (request.getCollection() != null) {
            internalRequest.addParameter("collection", request.getCollection());
        }
        if (request.getPeriod() != null) {
            internalRequest.addParameter("period", String.valueOf(request.getPeriod()));
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getMetrics() != null) {
            internalRequest.addParameter("metrics", request.getMetrics());
        }
        if (request.getStatistics() != null) {
            internalRequest.addParameter("statistics", request.getStatistics());
        }
        return invokeHttpClient(internalRequest, GetMongodbCollectionSpaceTrendResponse.class);
    }

    /**
     * getMongodbDatabaseSpace
     * 
     * @param request 入参结构体
     * @return GetMongodbDatabaseSpaceResponse
     */
    public GetMongodbDatabaseSpaceResponse getMongodbDatabaseSpace(GetMongodbDatabaseSpaceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_MONGODB, CONSTANT_SPACE, CONSTANT_DATABASE);
        internalRequest.addParameter("appId", "appId");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getDatabase() != null) {
            internalRequest.addParameter("database", request.getDatabase());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetMongodbDatabaseSpaceResponse.class);
    }

    /**
     * getMongodbDatabaseSpaceTrend
     * 
     * @param request 入参结构体
     * @return GetMongodbDatabaseSpaceTrendResponse
     */
    public GetMongodbDatabaseSpaceTrendResponse getMongodbDatabaseSpaceTrend(GetMongodbDatabaseSpaceTrendRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_MONGODB, CONSTANT_SPACE, CONSTANT_DATABASE, CONSTANT_TREND);
        internalRequest.addParameter("appId", "appId");
        if (request.getDatabase() != null) {
            internalRequest.addParameter("database", request.getDatabase());
        }
        if (request.getPeriod() != null) {
            internalRequest.addParameter("period", String.valueOf(request.getPeriod()));
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getMetrics() != null) {
            internalRequest.addParameter("metrics", request.getMetrics());
        }
        if (request.getStatistics() != null) {
            internalRequest.addParameter("statistics", request.getStatistics());
        }
        return invokeHttpClient(internalRequest, GetMongodbDatabaseSpaceTrendResponse.class);
    }

    /**
     * getMongodbSlowLogTimeDistribution
     * 
     * @param request 入参结构体
     * @return GetMongodbSlowLogTimeDistributionResponse
     */
    public GetMongodbSlowLogTimeDistributionResponse getMongodbSlowLogTimeDistribution(GetMongodbSlowLogTimeDistributionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SLOWLOG, CONSTANT_STATS, CONSTANT_DURATION);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getDbNames() != null) {
            internalRequest.addParameter("dbNames", request.getDbNames());
        }
        if (request.getFingerprintMd5() != null) {
            internalRequest.addParameter("fingerprintMd5", request.getFingerprintMd5());
        }
        return invokeHttpClient(internalRequest, GetMongodbSlowLogTimeDistributionResponse.class);
    }

    /**
     * getMongodbSlowLogTrend
     * 
     * @param request 入参结构体
     * @return GetMongodbSlowLogTrendResponse
     */
    public GetMongodbSlowLogTrendResponse getMongodbSlowLogTrend(GetMongodbSlowLogTrendRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SLOWLOG, CONSTANT_TREND);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getPeriod() != null) {
            internalRequest.addParameter("period", request.getPeriod());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        return invokeHttpClient(internalRequest, GetMongodbSlowLogTrendResponse.class);
    }

    /**
     * getMongodbSlowQueryTemplate
     * 
     * @param request 入参结构体
     * @return GetMongodbSlowQueryTemplateResponse
     */
    public GetMongodbSlowQueryTemplateResponse getMongodbSlowQueryTemplate(GetMongodbSlowQueryTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MONGODB, CONSTANT_SLOWLOG, CONSTANT_TEMPLATE);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getUsers() != null) {
            internalRequest.addParameter("users", request.getUsers());
        }
        if (request.getDbNames() != null) {
            internalRequest.addParameter("dbNames", request.getDbNames());
        }
        if (request.getClientIps() != null) {
            internalRequest.addParameter("clientIps", request.getClientIps());
        }
        if (request.getFingerprintMd5() != null) {
            internalRequest.addParameter("fingerprintMd5", request.getFingerprintMd5());
        }
        if (request.getNamespace() != null) {
            internalRequest.addParameter("namespace", request.getNamespace());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetMongodbSlowQueryTemplateResponse.class);
    }

    /**
     * getMongodbSpaceSummary
     * 
     * @param request 入参结构体
     * @return GetMongodbSpaceSummaryResponse
     */
    public GetMongodbSpaceSummaryResponse getMongodbSpaceSummary(GetMongodbSpaceSummaryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_MONGODB, CONSTANT_SPACE, CONSTANT_SUMMARY);
        internalRequest.addParameter("appId", "appId");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        return invokeHttpClient(internalRequest, GetMongodbSpaceSummaryResponse.class);
    }

    /**
     * getMysqlActiveSessions
     * 
     * @param request 入参结构体
     * @return GetMysqlActiveSessionsResponse
     */
    public GetMysqlActiveSessionsResponse getMysqlActiveSessions(GetMysqlActiveSessionsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SESSION, CONSTANT_LIST);
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("nodeId", "appId");
        return invokeHttpClient(internalRequest, GetMysqlActiveSessionsResponse.class);
    }

    /**
     * getMysqlDatabaseSpace
     * 
     * @param request 入参结构体
     * @return GetMysqlDatabaseSpaceResponse
     */
    public GetMysqlDatabaseSpaceResponse getMysqlDatabaseSpace(GetMysqlDatabaseSpaceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SPACE, CONSTANT_DATABASE);
        internalRequest.addParameter("appId", "appId");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getDatabase() != null) {
            internalRequest.addParameter("database", request.getDatabase());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetMysqlDatabaseSpaceResponse.class);
    }

    /**
     * getMysqlDeadlockInfo
     * 
     * @return GetMysqlDeadlockInfoResponse
     */
    public GetMysqlDeadlockInfoResponse getMysqlDeadlockInfo() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_DEADLOCK, CONSTANT_LATEST);
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("nodeId", "nodeId");
        return invokeHttpClient(internalRequest, GetMysqlDeadlockInfoResponse.class);
    }

    /**
     * getMysqlKillSessionHistory
     * 
     * @return GetMysqlKillSessionHistoryResponse
     */
    public GetMysqlKillSessionHistoryResponse getMysqlKillSessionHistory() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.POST, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SESSION, CONSTANT_KILL, CONSTANT_HISTORY);
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("nodeId", "nodeId");
        internalRequest.addParameter("start", "start");
        internalRequest.addParameter("end", "end");
        return invokeHttpClient(internalRequest, GetMysqlKillSessionHistoryResponse.class);
    }

    /**
     * getMysqlRateLimitTaskDetail
     * 
     * @param request 入参结构体
     * @return GetMysqlRateLimitTaskDetailResponse
     */
    public GetMysqlRateLimitTaskDetailResponse getMysqlRateLimitTaskDetail(GetMysqlRateLimitTaskDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SQLFILTER);
        internalRequest.addParameter("filterId", null);
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("nodeId", "nodeId");
        if (request.getFilterId() != null) {
            internalRequest.addParameter("filterId", String.valueOf(request.getFilterId()));
        }
        return invokeHttpClient(internalRequest, GetMysqlRateLimitTaskDetailResponse.class);
    }

    /**
     * getMysqlSlowLogTemplate
     * 
     * @param request 入参结构体
     * @return GetMysqlSlowLogTemplateResponse
     */
    public GetMysqlSlowLogTemplateResponse getMysqlSlowLogTemplate(GetMysqlSlowLogTemplateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SLOWLOG, CONSTANT_TEMPLATE);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getUsers() != null) {
            internalRequest.addParameter("users", request.getUsers());
        }
        if (request.getDbNames() != null) {
            internalRequest.addParameter("dbNames", request.getDbNames());
        }
        if (request.getClientIps() != null) {
            internalRequest.addParameter("clientIps", request.getClientIps());
        }
        if (request.getFingerprintMd5() != null) {
            internalRequest.addParameter("fingerprintMd5", request.getFingerprintMd5());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetMysqlSlowLogTemplateResponse.class);
    }

    /**
     * getMysqlSlowLogTimeDistribution
     * 
     * @param request 入参结构体
     * @return GetMysqlSlowLogTimeDistributionResponse
     */
    public GetMysqlSlowLogTimeDistributionResponse getMysqlSlowLogTimeDistribution(GetMysqlSlowLogTimeDistributionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SLOWLOG, CONSTANT_STATS, CONSTANT_DURATION);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getDbNames() != null) {
            internalRequest.addParameter("dbNames", request.getDbNames());
        }
        if (request.getFingerprintMd5() != null) {
            internalRequest.addParameter("fingerprintMd5", request.getFingerprintMd5());
        }
        return invokeHttpClient(internalRequest, GetMysqlSlowLogTimeDistributionResponse.class);
    }

    /**
     * getMysqlSlowLogTrend
     * 
     * @param request 入参结构体
     * @return GetMysqlSlowLogTrendResponse
     */
    public GetMysqlSlowLogTrendResponse getMysqlSlowLogTrend(GetMysqlSlowLogTrendRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SLOWLOG, CONSTANT_TREND);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getPeriod() != null) {
            internalRequest.addParameter("period", request.getPeriod());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        return invokeHttpClient(internalRequest, GetMysqlSlowLogTrendResponse.class);
    }

    /**
     * getMysqlSpaceSummary
     * 
     * @param request 入参结构体
     * @return GetMysqlSpaceSummaryResponse
     */
    public GetMysqlSpaceSummaryResponse getMysqlSpaceSummary(GetMysqlSpaceSummaryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SPACE, CONSTANT_SUMMARY);
        internalRequest.addParameter("appId", "appId");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        return invokeHttpClient(internalRequest, GetMysqlSpaceSummaryResponse.class);
    }

    /**
     * getMysqlTableIndexes
     * 
     * @return GetMysqlTableIndexesResponse
     */
    public GetMysqlTableIndexesResponse getMysqlTableIndexes() {
        InternalRequest internalRequest =
                this.createRequest(
                        new BaseBceRequest(),
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_API,
                        CONSTANT_DIAGNOSIS,
                        CONSTANT_MYSQL,
                        CONSTANT_SCHEMA,
                        CONSTANT_TABLE,
                        CONSTANT_INDEX);
        internalRequest.addParameter("product", "string");
        internalRequest.addParameter("appId", "string");
        internalRequest.addParameter("database", "string");
        internalRequest.addParameter("table", "string");
        return invokeHttpClient(internalRequest, GetMysqlTableIndexesResponse.class);
    }

    /**
     * getMysqlTableSpace
     * 
     * @param request 入参结构体
     * @return GetMysqlTableSpaceResponse
     */
    public GetMysqlTableSpaceResponse getMysqlTableSpace(GetMysqlTableSpaceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SPACE, CONSTANT_TABLE);
        internalRequest.addParameter("appId", "appId");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getDatabase() != null) {
            internalRequest.addParameter("database", request.getDatabase());
        }
        if (request.getTable() != null) {
            internalRequest.addParameter("table", request.getTable());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, GetMysqlTableSpaceResponse.class);
    }

    /**
     * getPegadbSlowLogTemplate
     * 
     * @param request 入参结构体
     * @return GetPegadbSlowLogTemplateResponse
     */
    public GetPegadbSlowLogTemplateResponse getPegadbSlowLogTemplate(GetPegadbSlowLogTemplateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_PEGA, CONSTANT_SLOWLOG, CONSTANT_SUMMARY);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, GetPegadbSlowLogTemplateResponse.class);
    }

    /**
     * getPegadbSlowLogTimeDistribution
     * 
     * @param request 入参结构体
     * @return GetPegadbSlowLogTimeDistributionResponse
     */
    public GetPegadbSlowLogTimeDistributionResponse getPegadbSlowLogTimeDistribution(GetPegadbSlowLogTimeDistributionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_PEGA, CONSTANT_SLOWLOG, CONSTANT_STATS, CONSTANT_DURATION);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        return invokeHttpClient(internalRequest, GetPegadbSlowLogTimeDistributionResponse.class);
    }

    /**
     * getPegadbSlowLogTrend
     * 
     * @param request 入参结构体
     * @return GetPegadbSlowLogTrendResponse
     */
    public GetPegadbSlowLogTrendResponse getPegadbSlowLogTrend(GetPegadbSlowLogTrendRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_PEGA, CONSTANT_SLOWLOG, CONSTANT_TREND);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        if (request.getPeriod() != null) {
            internalRequest.addParameter("period", String.valueOf(request.getPeriod()));
        }
        return invokeHttpClient(internalRequest, GetPegadbSlowLogTrendResponse.class);
    }

    /**
     * getPostgresqlSlowLogTemplate
     * 
     * @param request 入参结构体
     * @return GetPostgresqlSlowLogTemplateResponse
     */
    public GetPostgresqlSlowLogTemplateResponse getPostgresqlSlowLogTemplate(GetPostgresqlSlowLogTemplateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_POSTGRESQL, CONSTANT_SLOWLOG, CONSTANT_TEMPLATE);
        internalRequest.addParameter("", null);
        internalRequest.addParameter("product", "string");
        internalRequest.addParameter("appId", "string");
        internalRequest.addParameter("nodeId", "string");
        internalRequest.addParameter("start", "string");
        internalRequest.addParameter("end", "string");
        internalRequest.addParameter("dbNames", "dbNames");
        internalRequest.addParameter("clientIps", "clientIps");
        internalRequest.addParameter("fingerprintMd5", "fingerprintMd5page");
        internalRequest.addParameter("pageSize", "int");
        if (request.getUsers() != null) {
            internalRequest.addParameter("users", request.getUsers());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, GetPostgresqlSlowLogTemplateResponse.class);
    }

    /**
     * getPostgresqlSlowLogTimeDistribution
     * 
     * @param request 入参结构体
     * @return GetPostgresqlSlowLogTimeDistributionResponse
     */
    public GetPostgresqlSlowLogTimeDistributionResponse getPostgresqlSlowLogTimeDistribution(GetPostgresqlSlowLogTimeDistributionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.GET,
                        VERSION_V1,
                        CONSTANT_API,
                        CONSTANT_DIAGNOSIS,
                        CONSTANT_POSTGRESQL,
                        CONSTANT_SLOWLOG,
                        CONSTANT_STATS,
                        CONSTANT_DURATION);
        internalRequest.addParameter("product", "string");
        if (request.getAppId() != null) {
            internalRequest.addParameter("appId", request.getAppId());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbNames() != null && !request.getDbNames().isEmpty()) {
            internalRequest.addParameter("dbNames", String.join(",", request.getDbNames()));
        }
        if (request.getUsers() != null && !request.getUsers().isEmpty()) {
            internalRequest.addParameter("users", String.join(",", request.getUsers()));
        }
        if (request.getClientIPs() != null && !request.getClientIPs().isEmpty()) {
            internalRequest.addParameter("clientIPs", String.join(",", request.getClientIPs()));
        }
        return invokeHttpClient(internalRequest, GetPostgresqlSlowLogTimeDistributionResponse.class);
    }

    /**
     * getPostgresqlSlowLogTrend
     * 
     * @return GetPostgresqlSlowLogTrendResponse
     */
    public GetPostgresqlSlowLogTrendResponse getPostgresqlSlowLogTrend() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_POSTGRESQL, CONSTANT_SLOWLOG, CONSTANT_TREND);
        internalRequest.addParameter("product", "string");
        internalRequest.addParameter("appId", "string");
        internalRequest.addParameter("nodeId", "string");
        internalRequest.addParameter("start", "string");
        internalRequest.addParameter("end", "string");
        internalRequest.addParameter("period", "int");
        return invokeHttpClient(internalRequest, GetPostgresqlSlowLogTrendResponse.class);
    }

    /**
     * getRedisBigKeyAnalysisResult
     * 
     * @return GetRedisBigKeyAnalysisResultResponse
     */
    public GetRedisBigKeyAnalysisResultResponse getRedisBigKeyAnalysisResult() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_BIG_KEY, CONSTANT_TASK, CONSTANT_LIST);
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("page", "page");
        internalRequest.addParameter("pageSize", "pageSize");
        return invokeHttpClient(internalRequest, GetRedisBigKeyAnalysisResultResponse.class);
    }

    /**
     * getRedisSlowLogTemplate
     * 
     * @param request 入参结构体
     * @return GetRedisSlowLogTemplateResponse
     */
    public GetRedisSlowLogTemplateResponse getRedisSlowLogTemplate(GetRedisSlowLogTemplateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_SLOWLOG, CONSTANT_SUMMARY);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, GetRedisSlowLogTemplateResponse.class);
    }

    /**
     * getRedisSlowLogTimeDistribution
     * 
     * @param request 入参结构体
     * @return GetRedisSlowLogTimeDistributionResponse
     */
    public GetRedisSlowLogTimeDistributionResponse getRedisSlowLogTimeDistribution(GetRedisSlowLogTimeDistributionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_SLOWLOG, CONSTANT_STATS, CONSTANT_DURATION);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        return invokeHttpClient(internalRequest, GetRedisSlowLogTimeDistributionResponse.class);
    }

    /**
     * getRedisSlowLogTrend
     * 
     * @param request 入参结构体
     * @return GetRedisSlowLogTrendResponse
     */
    public GetRedisSlowLogTrendResponse getRedisSlowLogTrend(GetRedisSlowLogTrendRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_SLOWLOG, CONSTANT_TREND);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        if (request.getPeriod() != null) {
            internalRequest.addParameter("period", String.valueOf(request.getPeriod()));
        }
        return invokeHttpClient(internalRequest, GetRedisSlowLogTrendResponse.class);
    }

    /**
     * killMysqlSession
     * 
     * @param request 入参结构体
     * @return KillMysqlSessionResponse
     */
    public KillMysqlSessionResponse killMysqlSession(KillMysqlSessionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SESSION, CONSTANT_KILL);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, KillMysqlSessionResponse.class);
    }

    /**
     * listMongodbSlowLogs
     * 
     * @param request 入参结构体
     * @return ListMongodbSlowLogsResponse
     */
    public ListMongodbSlowLogsResponse listMongodbSlowLogs(ListMongodbSlowLogsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MONGODB, CONSTANT_SLOWLOG, CONSTANT_LIST);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getUsers() != null) {
            internalRequest.addParameter("users", request.getUsers());
        }
        if (request.getDbNames() != null) {
            internalRequest.addParameter("dbNames", request.getDbNames());
        }
        if (request.getClientIps() != null) {
            internalRequest.addParameter("clientIps", request.getClientIps());
        }
        if (request.getNamespace() != null) {
            internalRequest.addParameter("namespace", request.getNamespace());
        }
        if (request.getFingerprintMd5() != null) {
            internalRequest.addParameter("fingerprintMd5", request.getFingerprintMd5());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListMongodbSlowLogsResponse.class);
    }

    /**
     * listMysqlRateLimitTasks
     * 
     * @return ListMysqlRateLimitTasksResponse
     */
    public ListMysqlRateLimitTasksResponse listMysqlRateLimitTasks() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SQLFILTER, CONSTANT_LIST);
        internalRequest.addParameter("appId", "rds-OEEsaajh");
        internalRequest.addParameter("nodeId", "rds-OEEsaajh");
        return invokeHttpClient(internalRequest, ListMysqlRateLimitTasksResponse.class);
    }

    /**
     * listMysqlSlowLogs
     * 
     * @param request 入参结构体
     * @return ListMysqlSlowLogsResponse
     */
    public ListMysqlSlowLogsResponse listMysqlSlowLogs(ListMysqlSlowLogsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SLOWLOG, CONSTANT_LIST);
        internalRequest.addParameter("appId", "appId");
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getUsers() != null) {
            internalRequest.addParameter("users", request.getUsers());
        }
        if (request.getDbNames() != null) {
            internalRequest.addParameter("dbNames", request.getDbNames());
        }
        if (request.getClientIps() != null) {
            internalRequest.addParameter("clientIps", request.getClientIps());
        }
        if (request.getFingerprintMd5() != null) {
            internalRequest.addParameter("fingerprintMd5", request.getFingerprintMd5());
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        return invokeHttpClient(internalRequest, ListMysqlSlowLogsResponse.class);
    }

    /**
     * listPegadbSlowLogs
     * 
     * @param request 入参结构体
     * @return ListPegadbSlowLogsResponse
     */
    public ListPegadbSlowLogsResponse listPegadbSlowLogs(ListPegadbSlowLogsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_PEGA, CONSTANT_SLOWLOG, CONSTANT_LIST);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, ListPegadbSlowLogsResponse.class);
    }

    /**
     * listPostgresqlSlowLogs
     * 
     * @param request 入参结构体
     * @return ListPostgresqlSlowLogsResponse
     */
    public ListPostgresqlSlowLogsResponse listPostgresqlSlowLogs(ListPostgresqlSlowLogsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_POSTGRESQL, CONSTANT_SLOWLOG, CONSTANT_LIST);
        internalRequest.addParameter("product", "string");
        if (request.getAppId() != null) {
            internalRequest.addParameter("appId", request.getAppId());
        }
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getDbNames() != null && !request.getDbNames().isEmpty()) {
            internalRequest.addParameter("dbNames", String.join(",", request.getDbNames()));
        }
        if (request.getClientIPs() != null && !request.getClientIPs().isEmpty()) {
            internalRequest.addParameter("clientIPs", String.join(",", request.getClientIPs()));
        }
        if (request.getUsers() != null && !request.getUsers().isEmpty()) {
            internalRequest.addParameter("users", String.join(",", request.getUsers()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, ListPostgresqlSlowLogsResponse.class);
    }

    /**
     * listRedisBigKeyAnalysisTasks
     * 
     * @param request 入参结构体
     * @return ListRedisBigKeyAnalysisTasksResponse
     */
    public ListRedisBigKeyAnalysisTasksResponse listRedisBigKeyAnalysisTasks(ListRedisBigKeyAnalysisTasksRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_BIG_KEY, CONSTANT_TASK, CONSTANT_RESULT);
        internalRequest.addParameter("id", "id");
        internalRequest.addParameter("appId", "appId");
        internalRequest.addParameter("nodeId", "nodeId");
        internalRequest.addParameter("dataType", "dataType");
        internalRequest.addParameter("orderBy", "orderBy");
        internalRequest.addParameter("order", "order");
        if (request.getClusterId() != null) {
            internalRequest.addParameter("clusterId", request.getClusterId());
        }
        return invokeHttpClient(internalRequest, ListRedisBigKeyAnalysisTasksResponse.class);
    }

    /**
     * listRedisSlowLogs
     * 
     * @param request 入参结构体
     * @return ListRedisSlowLogsResponse
     */
    public ListRedisSlowLogsResponse listRedisSlowLogs(ListRedisSlowLogsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_API, CONSTANT_DIAGNOSIS, CONSTANT_REDIS, CONSTANT_SLOWLOG, CONSTANT_LIST);
        internalRequest.addParameter("appId", "string");
        if (request.getNodeId() != null) {
            internalRequest.addParameter("nodeId", request.getNodeId());
        }
        if (request.getStart() != null) {
            internalRequest.addParameter("start", request.getStart());
        }
        if (request.getEnd() != null) {
            internalRequest.addParameter("end", request.getEnd());
        }
        if (request.getDbEngine() != null) {
            internalRequest.addParameter("dbEngine", request.getDbEngine());
        }
        if (request.getPage() != null) {
            internalRequest.addParameter("page", String.valueOf(request.getPage()));
        }
        if (request.getPageSize() != null) {
            internalRequest.addParameter("pageSize", String.valueOf(request.getPageSize()));
        }
        if (request.getOrderBy() != null) {
            internalRequest.addParameter("orderBy", request.getOrderBy());
        }
        if (request.getOrder() != null) {
            internalRequest.addParameter("order", request.getOrder());
        }
        return invokeHttpClient(internalRequest, ListRedisSlowLogsResponse.class);
    }

    /**
     * startStopMysqlInstanceFlowLimitingTask
     * 
     * @param request 入参结构体
     */
    public void startStopMysqlInstanceFlowLimitingTask(StartStopMysqlInstanceFlowLimitingTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_V1, CONSTANT_DIAGNOSIS, CONSTANT_MYSQL, CONSTANT_SQLFILTER, CONSTANT_ACTION);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateMysqlRateLimitTask
     * 
     * @param request 入参结构体
     */
    public void updateMysqlRateLimitTask(UpdateMysqlRateLimitTaskRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_MYSQL, CONSTANT_SQLFILTER);
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
