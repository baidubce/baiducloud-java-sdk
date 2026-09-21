package com.baidubce.dbsc;

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
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for DbscClient
 */
public class DbscClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private DbscClient dbscClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        config.setCredentials(new DefaultBceCredentials(AK, SK));

        dbscClient = new DbscClient(config);
    }

    /**
     * checkMysqlRateLimitSupport
     *
     */
    @Test
    public void checkMysqlRateLimitSupportTest() {
        CheckMysqlRateLimitSupportResponse response = dbscClient.checkMysqlRateLimitSupport();
        System.out.println(response);
    }
    /**
     * createMysqlRateLimitTask
     *
     */
    @Test
    public void createMysqlRateLimitTaskTest() {
        CreateMysqlRateLimitTaskRequest createMysqlRateLimitTaskRequest = new CreateMysqlRateLimitTaskRequest();
        createMysqlRateLimitTaskRequest.setAppId("");
        createMysqlRateLimitTaskRequest.setNodeId("");
        createMysqlRateLimitTaskRequest.setFilterKey("");
        createMysqlRateLimitTaskRequest.setFilterLimit(0);
        createMysqlRateLimitTaskRequest.setFilterType("");
        dbscClient.createMysqlRateLimitTask(createMysqlRateLimitTaskRequest);
    }
    /**
     * createRedisBigKeyAnalysisTask
     *
     */
    @Test
    public void createRedisBigKeyAnalysisTaskTest() {
        CreateRedisBigKeyAnalysisTaskRequest createRedisBigKeyAnalysisTaskRequest = new CreateRedisBigKeyAnalysisTaskRequest();
        createRedisBigKeyAnalysisTaskRequest.setAppId("");
        createRedisBigKeyAnalysisTaskRequest.setClusterId("");
        createRedisBigKeyAnalysisTaskRequest.setBackupType(0);
        createRedisBigKeyAnalysisTaskRequest.setBackupId("");
        CreateRedisBigKeyAnalysisTaskResponse response = dbscClient.createRedisBigKeyAnalysisTask(createRedisBigKeyAnalysisTaskRequest);
        System.out.println(response);
    }
    /**
     * deleteMysqlRateLimitTask
     *
     */
    @Test
    public void deleteMysqlRateLimitTaskTest() {
        dbscClient.deleteMysqlRateLimitTask();
    }
    /**
     * deleteRedisBigKeyAnalysisTask
     *
     */
    @Test
    public void deleteRedisBigKeyAnalysisTaskTest() {
        DeleteRedisBigKeyAnalysisTaskRequest deleteRedisBigKeyAnalysisTaskRequest = new DeleteRedisBigKeyAnalysisTaskRequest();
        deleteRedisBigKeyAnalysisTaskRequest.setIds(new ArrayList<>());
        deleteRedisBigKeyAnalysisTaskRequest.setAppId("");
        dbscClient.deleteRedisBigKeyAnalysisTask(deleteRedisBigKeyAnalysisTaskRequest);
    }
    /**
     * getMongodbCollectionIndexes
     *
     */
    @Test
    public void getMongodbCollectionIndexesTest() {
        dbscClient.getMongodbCollectionIndexes();
    }
    /**
     * getMongodbCollectionSpace
     *
     */
    @Test
    public void getMongodbCollectionSpaceTest() {
        GetMongodbCollectionSpaceRequest getMongodbCollectionSpaceRequest = new GetMongodbCollectionSpaceRequest();
        getMongodbCollectionSpaceRequest.setNodeId("");
        getMongodbCollectionSpaceRequest.setDatabase("");
        getMongodbCollectionSpaceRequest.setCollection("");
        getMongodbCollectionSpaceRequest.setOrderBy("");
        getMongodbCollectionSpaceRequest.setOrder("");
        getMongodbCollectionSpaceRequest.setPage(0);
        getMongodbCollectionSpaceRequest.setPageSize(0);
        GetMongodbCollectionSpaceResponse response = dbscClient.getMongodbCollectionSpace(getMongodbCollectionSpaceRequest);
        System.out.println(response);
    }
    /**
     * getMongodbCollectionSpaceTrend
     *
     */
    @Test
    public void getMongodbCollectionSpaceTrendTest() {
        GetMongodbCollectionSpaceTrendRequest getMongodbCollectionSpaceTrendRequest = new GetMongodbCollectionSpaceTrendRequest();
        getMongodbCollectionSpaceTrendRequest.setDatabase("");
        getMongodbCollectionSpaceTrendRequest.setCollection("");
        getMongodbCollectionSpaceTrendRequest.setPeriod(0);
        getMongodbCollectionSpaceTrendRequest.setNodeId("");
        getMongodbCollectionSpaceTrendRequest.setStart("");
        getMongodbCollectionSpaceTrendRequest.setEnd("");
        getMongodbCollectionSpaceTrendRequest.setMetrics("");
        getMongodbCollectionSpaceTrendRequest.setStatistics("");
        GetMongodbCollectionSpaceTrendResponse response = dbscClient.getMongodbCollectionSpaceTrend(getMongodbCollectionSpaceTrendRequest);
        System.out.println(response);
    }
    /**
     * getMongodbDatabaseSpace
     *
     */
    @Test
    public void getMongodbDatabaseSpaceTest() {
        GetMongodbDatabaseSpaceRequest getMongodbDatabaseSpaceRequest = new GetMongodbDatabaseSpaceRequest();
        getMongodbDatabaseSpaceRequest.setNodeId("");
        getMongodbDatabaseSpaceRequest.setDatabase("");
        getMongodbDatabaseSpaceRequest.setOrderBy("");
        getMongodbDatabaseSpaceRequest.setOrder("");
        getMongodbDatabaseSpaceRequest.setPage(0);
        getMongodbDatabaseSpaceRequest.setPageSize(0);
        GetMongodbDatabaseSpaceResponse response = dbscClient.getMongodbDatabaseSpace(getMongodbDatabaseSpaceRequest);
        System.out.println(response);
    }
    /**
     * getMongodbDatabaseSpaceTrend
     *
     */
    @Test
    public void getMongodbDatabaseSpaceTrendTest() {
        GetMongodbDatabaseSpaceTrendRequest getMongodbDatabaseSpaceTrendRequest = new GetMongodbDatabaseSpaceTrendRequest();
        getMongodbDatabaseSpaceTrendRequest.setDatabase("");
        getMongodbDatabaseSpaceTrendRequest.setPeriod(0);
        getMongodbDatabaseSpaceTrendRequest.setNodeId("");
        getMongodbDatabaseSpaceTrendRequest.setStart("");
        getMongodbDatabaseSpaceTrendRequest.setEnd("");
        getMongodbDatabaseSpaceTrendRequest.setMetrics("");
        getMongodbDatabaseSpaceTrendRequest.setStatistics("");
        GetMongodbDatabaseSpaceTrendResponse response = dbscClient.getMongodbDatabaseSpaceTrend(getMongodbDatabaseSpaceTrendRequest);
        System.out.println(response);
    }
    /**
     * getMongodbSlowLogTimeDistribution
     *
     */
    @Test
    public void getMongodbSlowLogTimeDistributionTest() {
        GetMongodbSlowLogTimeDistributionRequest getMongodbSlowLogTimeDistributionRequest = new GetMongodbSlowLogTimeDistributionRequest();
        getMongodbSlowLogTimeDistributionRequest.setStart("");
        getMongodbSlowLogTimeDistributionRequest.setEnd("");
        getMongodbSlowLogTimeDistributionRequest.setNodeId("");
        getMongodbSlowLogTimeDistributionRequest.setDbNames("");
        getMongodbSlowLogTimeDistributionRequest.setFingerprintMd5("");
        GetMongodbSlowLogTimeDistributionResponse response = dbscClient.getMongodbSlowLogTimeDistribution(getMongodbSlowLogTimeDistributionRequest);
        System.out.println(response);
    }
    /**
     * getMongodbSlowLogTrend
     *
     */
    @Test
    public void getMongodbSlowLogTrendTest() {
        GetMongodbSlowLogTrendRequest getMongodbSlowLogTrendRequest = new GetMongodbSlowLogTrendRequest();
        getMongodbSlowLogTrendRequest.setStart("");
        getMongodbSlowLogTrendRequest.setEnd("");
        getMongodbSlowLogTrendRequest.setPeriod("");
        getMongodbSlowLogTrendRequest.setNodeId("");
        GetMongodbSlowLogTrendResponse response = dbscClient.getMongodbSlowLogTrend(getMongodbSlowLogTrendRequest);
        System.out.println(response);
    }
    /**
     * getMongodbSlowQueryTemplate
     *
     */
    @Test
    public void getMongodbSlowQueryTemplateTest() {
        GetMongodbSlowQueryTemplateRequest getMongodbSlowQueryTemplateRequest = new GetMongodbSlowQueryTemplateRequest();
        getMongodbSlowQueryTemplateRequest.setStart("");
        getMongodbSlowQueryTemplateRequest.setEnd("");
        getMongodbSlowQueryTemplateRequest.setNodeId("");
        getMongodbSlowQueryTemplateRequest.setUsers("");
        getMongodbSlowQueryTemplateRequest.setDbNames("");
        getMongodbSlowQueryTemplateRequest.setClientIps("");
        getMongodbSlowQueryTemplateRequest.setFingerprintMd5("");
        getMongodbSlowQueryTemplateRequest.setNamespace("");
        getMongodbSlowQueryTemplateRequest.setOrderBy("");
        getMongodbSlowQueryTemplateRequest.setOrder("");
        getMongodbSlowQueryTemplateRequest.setPage(0);
        getMongodbSlowQueryTemplateRequest.setPageSize(0);
        GetMongodbSlowQueryTemplateResponse response = dbscClient.getMongodbSlowQueryTemplate(getMongodbSlowQueryTemplateRequest);
        System.out.println(response);
    }
    /**
     * getMongodbSpaceSummary
     *
     */
    @Test
    public void getMongodbSpaceSummaryTest() {
        GetMongodbSpaceSummaryRequest getMongodbSpaceSummaryRequest = new GetMongodbSpaceSummaryRequest();
        getMongodbSpaceSummaryRequest.setNodeId("");
        GetMongodbSpaceSummaryResponse response = dbscClient.getMongodbSpaceSummary(getMongodbSpaceSummaryRequest);
        System.out.println(response);
    }
    /**
     * getMysqlActiveSessions
     *
     */
    @Test
    public void getMysqlActiveSessionsTest() {
        GetMysqlActiveSessionsResponse response = dbscClient.getMysqlActiveSessions();
        System.out.println(response);
    }
    /**
     * getMysqlDatabaseSpace
     *
     */
    @Test
    public void getMysqlDatabaseSpaceTest() {
        GetMysqlDatabaseSpaceRequest getMysqlDatabaseSpaceRequest = new GetMysqlDatabaseSpaceRequest();
        getMysqlDatabaseSpaceRequest.setNodeId("");
        getMysqlDatabaseSpaceRequest.setDatabase("");
        getMysqlDatabaseSpaceRequest.setOrderBy("");
        getMysqlDatabaseSpaceRequest.setOrder("");
        getMysqlDatabaseSpaceRequest.setPage(0);
        getMysqlDatabaseSpaceRequest.setPageSize(0);
        GetMysqlDatabaseSpaceResponse response = dbscClient.getMysqlDatabaseSpace(getMysqlDatabaseSpaceRequest);
        System.out.println(response);
    }
    /**
     * getMysqlDeadlockInfo
     *
     */
    @Test
    public void getMysqlDeadlockInfoTest() {
        GetMysqlDeadlockInfoResponse response = dbscClient.getMysqlDeadlockInfo();
        System.out.println(response);
    }
    /**
     * getMysqlKillSessionHistory
     *
     */
    @Test
    public void getMysqlKillSessionHistoryTest() {
        GetMysqlKillSessionHistoryResponse response = dbscClient.getMysqlKillSessionHistory();
        System.out.println(response);
    }
    /**
     * getMysqlRateLimitTaskDetail
     *
     */
    @Test
    public void getMysqlRateLimitTaskDetailTest() {
        GetMysqlRateLimitTaskDetailRequest getMysqlRateLimitTaskDetailRequest = new GetMysqlRateLimitTaskDetailRequest();
        getMysqlRateLimitTaskDetailRequest.setFilterId(0);
        GetMysqlRateLimitTaskDetailResponse response = dbscClient.getMysqlRateLimitTaskDetail(getMysqlRateLimitTaskDetailRequest);
        System.out.println(response);
    }
    /**
     * getMysqlSlowLogTemplate
     *
     */
    @Test
    public void getMysqlSlowLogTemplateTest() {
        GetMysqlSlowLogTemplateRequest getMysqlSlowLogTemplateRequest = new GetMysqlSlowLogTemplateRequest();
        getMysqlSlowLogTemplateRequest.setStart("");
        getMysqlSlowLogTemplateRequest.setEnd("");
        getMysqlSlowLogTemplateRequest.setNodeId("");
        getMysqlSlowLogTemplateRequest.setUsers("");
        getMysqlSlowLogTemplateRequest.setDbNames("");
        getMysqlSlowLogTemplateRequest.setClientIps("");
        getMysqlSlowLogTemplateRequest.setFingerprintMd5("");
        getMysqlSlowLogTemplateRequest.setOrderBy("");
        getMysqlSlowLogTemplateRequest.setOrder("");
        getMysqlSlowLogTemplateRequest.setPage(0);
        getMysqlSlowLogTemplateRequest.setPageSize(0);
        GetMysqlSlowLogTemplateResponse response = dbscClient.getMysqlSlowLogTemplate(getMysqlSlowLogTemplateRequest);
        System.out.println(response);
    }
    /**
     * getMysqlSlowLogTimeDistribution
     *
     */
    @Test
    public void getMysqlSlowLogTimeDistributionTest() {
        GetMysqlSlowLogTimeDistributionRequest getMysqlSlowLogTimeDistributionRequest = new GetMysqlSlowLogTimeDistributionRequest();
        getMysqlSlowLogTimeDistributionRequest.setStart("");
        getMysqlSlowLogTimeDistributionRequest.setEnd("");
        getMysqlSlowLogTimeDistributionRequest.setNodeId("");
        getMysqlSlowLogTimeDistributionRequest.setDbNames("");
        getMysqlSlowLogTimeDistributionRequest.setFingerprintMd5("");
        GetMysqlSlowLogTimeDistributionResponse response = dbscClient.getMysqlSlowLogTimeDistribution(getMysqlSlowLogTimeDistributionRequest);
        System.out.println(response);
    }
    /**
     * getMysqlSlowLogTrend
     *
     */
    @Test
    public void getMysqlSlowLogTrendTest() {
        GetMysqlSlowLogTrendRequest getMysqlSlowLogTrendRequest = new GetMysqlSlowLogTrendRequest();
        getMysqlSlowLogTrendRequest.setStart("");
        getMysqlSlowLogTrendRequest.setEnd("");
        getMysqlSlowLogTrendRequest.setPeriod("");
        getMysqlSlowLogTrendRequest.setNodeId("");
        GetMysqlSlowLogTrendResponse response = dbscClient.getMysqlSlowLogTrend(getMysqlSlowLogTrendRequest);
        System.out.println(response);
    }
    /**
     * getMysqlSpaceSummary
     *
     */
    @Test
    public void getMysqlSpaceSummaryTest() {
        GetMysqlSpaceSummaryRequest getMysqlSpaceSummaryRequest = new GetMysqlSpaceSummaryRequest();
        getMysqlSpaceSummaryRequest.setNodeId("");
        GetMysqlSpaceSummaryResponse response = dbscClient.getMysqlSpaceSummary(getMysqlSpaceSummaryRequest);
        System.out.println(response);
    }
    /**
     * getMysqlTableIndexes
     *
     */
    @Test
    public void getMysqlTableIndexesTest() {
        GetMysqlTableIndexesResponse response = dbscClient.getMysqlTableIndexes();
        System.out.println(response);
    }
    /**
     * getMysqlTableSpace
     *
     */
    @Test
    public void getMysqlTableSpaceTest() {
        GetMysqlTableSpaceRequest getMysqlTableSpaceRequest = new GetMysqlTableSpaceRequest();
        getMysqlTableSpaceRequest.setNodeId("");
        getMysqlTableSpaceRequest.setDatabase("");
        getMysqlTableSpaceRequest.setTable("");
        getMysqlTableSpaceRequest.setOrderBy("");
        getMysqlTableSpaceRequest.setOrder("");
        getMysqlTableSpaceRequest.setPage(0);
        getMysqlTableSpaceRequest.setPageSize(0);
        GetMysqlTableSpaceResponse response = dbscClient.getMysqlTableSpace(getMysqlTableSpaceRequest);
        System.out.println(response);
    }
    /**
     * getPegadbSlowLogTemplate
     *
     */
    @Test
    public void getPegadbSlowLogTemplateTest() {
        GetPegadbSlowLogTemplateRequest getPegadbSlowLogTemplateRequest = new GetPegadbSlowLogTemplateRequest();
        getPegadbSlowLogTemplateRequest.setNodeId("");
        getPegadbSlowLogTemplateRequest.setStart("");
        getPegadbSlowLogTemplateRequest.setEnd("");
        getPegadbSlowLogTemplateRequest.setDbEngine("");
        getPegadbSlowLogTemplateRequest.setPage(0);
        getPegadbSlowLogTemplateRequest.setPageSize(0);
        getPegadbSlowLogTemplateRequest.setOrderBy("");
        getPegadbSlowLogTemplateRequest.setOrder("");
        GetPegadbSlowLogTemplateResponse response = dbscClient.getPegadbSlowLogTemplate(getPegadbSlowLogTemplateRequest);
        System.out.println(response);
    }
    /**
     * getPegadbSlowLogTimeDistribution
     *
     */
    @Test
    public void getPegadbSlowLogTimeDistributionTest() {
        GetPegadbSlowLogTimeDistributionRequest getPegadbSlowLogTimeDistributionRequest = new GetPegadbSlowLogTimeDistributionRequest();
        getPegadbSlowLogTimeDistributionRequest.setNodeId("");
        getPegadbSlowLogTimeDistributionRequest.setStart("");
        getPegadbSlowLogTimeDistributionRequest.setEnd("");
        getPegadbSlowLogTimeDistributionRequest.setDbEngine("");
        GetPegadbSlowLogTimeDistributionResponse response = dbscClient.getPegadbSlowLogTimeDistribution(getPegadbSlowLogTimeDistributionRequest);
        System.out.println(response);
    }
    /**
     * getPegadbSlowLogTrend
     *
     */
    @Test
    public void getPegadbSlowLogTrendTest() {
        GetPegadbSlowLogTrendRequest getPegadbSlowLogTrendRequest = new GetPegadbSlowLogTrendRequest();
        getPegadbSlowLogTrendRequest.setNodeId("");
        getPegadbSlowLogTrendRequest.setStart("");
        getPegadbSlowLogTrendRequest.setEnd("");
        getPegadbSlowLogTrendRequest.setDbEngine("");
        getPegadbSlowLogTrendRequest.setPeriod(0);
        GetPegadbSlowLogTrendResponse response = dbscClient.getPegadbSlowLogTrend(getPegadbSlowLogTrendRequest);
        System.out.println(response);
    }
    /**
     * getPostgresqlSlowLogTemplate
     *
     */
    @Test
    public void getPostgresqlSlowLogTemplateTest() {
        GetPostgresqlSlowLogTemplateRequest getPostgresqlSlowLogTemplateRequest = new GetPostgresqlSlowLogTemplateRequest();
        getPostgresqlSlowLogTemplateRequest.setUsers("");
        getPostgresqlSlowLogTemplateRequest.setPage(0);
        getPostgresqlSlowLogTemplateRequest.setOrderBy("");
        getPostgresqlSlowLogTemplateRequest.setOrder("");
        GetPostgresqlSlowLogTemplateResponse response = dbscClient.getPostgresqlSlowLogTemplate(getPostgresqlSlowLogTemplateRequest);
        System.out.println(response);
    }
    /**
     * getPostgresqlSlowLogTimeDistribution
     *
     */
    @Test
    public void getPostgresqlSlowLogTimeDistributionTest() {
        GetPostgresqlSlowLogTimeDistributionRequest getPostgresqlSlowLogTimeDistributionRequest = new GetPostgresqlSlowLogTimeDistributionRequest();
        getPostgresqlSlowLogTimeDistributionRequest.setAppId("");
        getPostgresqlSlowLogTimeDistributionRequest.setNodeId("");
        getPostgresqlSlowLogTimeDistributionRequest.setStart("");
        getPostgresqlSlowLogTimeDistributionRequest.setEnd("");
        getPostgresqlSlowLogTimeDistributionRequest.setDbNames(new ArrayList<>());
        getPostgresqlSlowLogTimeDistributionRequest.setUsers(new ArrayList<>());
        getPostgresqlSlowLogTimeDistributionRequest.setClientIPs(new ArrayList<>());
        GetPostgresqlSlowLogTimeDistributionResponse response = dbscClient.getPostgresqlSlowLogTimeDistribution(getPostgresqlSlowLogTimeDistributionRequest);
        System.out.println(response);
    }
    /**
     * getPostgresqlSlowLogTrend
     *
     */
    @Test
    public void getPostgresqlSlowLogTrendTest() {
        GetPostgresqlSlowLogTrendResponse response = dbscClient.getPostgresqlSlowLogTrend();
        System.out.println(response);
    }
    /**
     * getRedisBigKeyAnalysisResult
     *
     */
    @Test
    public void getRedisBigKeyAnalysisResultTest() {
        GetRedisBigKeyAnalysisResultResponse response = dbscClient.getRedisBigKeyAnalysisResult();
        System.out.println(response);
    }
    /**
     * getRedisSlowLogTemplate
     *
     */
    @Test
    public void getRedisSlowLogTemplateTest() {
        GetRedisSlowLogTemplateRequest getRedisSlowLogTemplateRequest = new GetRedisSlowLogTemplateRequest();
        getRedisSlowLogTemplateRequest.setNodeId("");
        getRedisSlowLogTemplateRequest.setStart("");
        getRedisSlowLogTemplateRequest.setEnd("");
        getRedisSlowLogTemplateRequest.setDbEngine("");
        getRedisSlowLogTemplateRequest.setPage(0);
        getRedisSlowLogTemplateRequest.setPageSize(0);
        getRedisSlowLogTemplateRequest.setOrderBy("");
        getRedisSlowLogTemplateRequest.setOrder("");
        GetRedisSlowLogTemplateResponse response = dbscClient.getRedisSlowLogTemplate(getRedisSlowLogTemplateRequest);
        System.out.println(response);
    }
    /**
     * getRedisSlowLogTimeDistribution
     *
     */
    @Test
    public void getRedisSlowLogTimeDistributionTest() {
        GetRedisSlowLogTimeDistributionRequest getRedisSlowLogTimeDistributionRequest = new GetRedisSlowLogTimeDistributionRequest();
        getRedisSlowLogTimeDistributionRequest.setNodeId("");
        getRedisSlowLogTimeDistributionRequest.setStart("");
        getRedisSlowLogTimeDistributionRequest.setEnd("");
        getRedisSlowLogTimeDistributionRequest.setDbEngine("");
        GetRedisSlowLogTimeDistributionResponse response = dbscClient.getRedisSlowLogTimeDistribution(getRedisSlowLogTimeDistributionRequest);
        System.out.println(response);
    }
    /**
     * getRedisSlowLogTrend
     *
     */
    @Test
    public void getRedisSlowLogTrendTest() {
        GetRedisSlowLogTrendRequest getRedisSlowLogTrendRequest = new GetRedisSlowLogTrendRequest();
        getRedisSlowLogTrendRequest.setNodeId("");
        getRedisSlowLogTrendRequest.setStart("");
        getRedisSlowLogTrendRequest.setEnd("");
        getRedisSlowLogTrendRequest.setDbEngine("");
        getRedisSlowLogTrendRequest.setPeriod(0);
        GetRedisSlowLogTrendResponse response = dbscClient.getRedisSlowLogTrend(getRedisSlowLogTrendRequest);
        System.out.println(response);
    }
    /**
     * killMysqlSession
     *
     */
    @Test
    public void killMysqlSessionTest() {
        KillMysqlSessionRequest killMysqlSessionRequest = new KillMysqlSessionRequest();
        killMysqlSessionRequest.setAppId("");
        killMysqlSessionRequest.setNodeId("");
        killMysqlSessionRequest.setIdItems(new ArrayList<>());
        KillMysqlSessionResponse response = dbscClient.killMysqlSession(killMysqlSessionRequest);
        System.out.println(response);
    }
    /**
     * listMongodbSlowLogs
     *
     */
    @Test
    public void listMongodbSlowLogsTest() {
        ListMongodbSlowLogsRequest listMongodbSlowLogsRequest = new ListMongodbSlowLogsRequest();
        listMongodbSlowLogsRequest.setStart("");
        listMongodbSlowLogsRequest.setEnd("");
        listMongodbSlowLogsRequest.setNodeId("");
        listMongodbSlowLogsRequest.setUsers("");
        listMongodbSlowLogsRequest.setDbNames("");
        listMongodbSlowLogsRequest.setClientIps("");
        listMongodbSlowLogsRequest.setNamespace("");
        listMongodbSlowLogsRequest.setFingerprintMd5("");
        listMongodbSlowLogsRequest.setOrderBy("");
        listMongodbSlowLogsRequest.setOrder("");
        listMongodbSlowLogsRequest.setPage(0);
        listMongodbSlowLogsRequest.setPageSize(0);
        ListMongodbSlowLogsResponse response = dbscClient.listMongodbSlowLogs(listMongodbSlowLogsRequest);
        System.out.println(response);
    }
    /**
     * listMysqlRateLimitTasks
     *
     */
    @Test
    public void listMysqlRateLimitTasksTest() {
        ListMysqlRateLimitTasksResponse response = dbscClient.listMysqlRateLimitTasks();
        System.out.println(response);
    }
    /**
     * listMysqlSlowLogs
     *
     */
    @Test
    public void listMysqlSlowLogsTest() {
        ListMysqlSlowLogsRequest listMysqlSlowLogsRequest = new ListMysqlSlowLogsRequest();
        listMysqlSlowLogsRequest.setStart("");
        listMysqlSlowLogsRequest.setEnd("");
        listMysqlSlowLogsRequest.setNodeId("");
        listMysqlSlowLogsRequest.setUsers("");
        listMysqlSlowLogsRequest.setDbNames("");
        listMysqlSlowLogsRequest.setClientIps("");
        listMysqlSlowLogsRequest.setFingerprintMd5("");
        listMysqlSlowLogsRequest.setOrderBy("");
        listMysqlSlowLogsRequest.setOrder("");
        listMysqlSlowLogsRequest.setPage(0);
        listMysqlSlowLogsRequest.setPageSize(0);
        ListMysqlSlowLogsResponse response = dbscClient.listMysqlSlowLogs(listMysqlSlowLogsRequest);
        System.out.println(response);
    }
    /**
     * listPegadbSlowLogs
     *
     */
    @Test
    public void listPegadbSlowLogsTest() {
        ListPegadbSlowLogsRequest listPegadbSlowLogsRequest = new ListPegadbSlowLogsRequest();
        listPegadbSlowLogsRequest.setNodeId("");
        listPegadbSlowLogsRequest.setStart("");
        listPegadbSlowLogsRequest.setEnd("");
        listPegadbSlowLogsRequest.setDbEngine("");
        listPegadbSlowLogsRequest.setPage(0);
        listPegadbSlowLogsRequest.setPageSize(0);
        listPegadbSlowLogsRequest.setOrderBy("");
        listPegadbSlowLogsRequest.setOrder("");
        ListPegadbSlowLogsResponse response = dbscClient.listPegadbSlowLogs(listPegadbSlowLogsRequest);
        System.out.println(response);
    }
    /**
     * listPostgresqlSlowLogs
     *
     */
    @Test
    public void listPostgresqlSlowLogsTest() {
        ListPostgresqlSlowLogsRequest listPostgresqlSlowLogsRequest = new ListPostgresqlSlowLogsRequest();
        listPostgresqlSlowLogsRequest.setAppId("");
        listPostgresqlSlowLogsRequest.setNodeId("");
        listPostgresqlSlowLogsRequest.setStart("");
        listPostgresqlSlowLogsRequest.setEnd("");
        listPostgresqlSlowLogsRequest.setPage(0);
        listPostgresqlSlowLogsRequest.setPageSize(0);
        listPostgresqlSlowLogsRequest.setDbNames(new ArrayList<>());
        listPostgresqlSlowLogsRequest.setClientIPs(new ArrayList<>());
        listPostgresqlSlowLogsRequest.setUsers(new ArrayList<>());
        listPostgresqlSlowLogsRequest.setOrderBy("");
        listPostgresqlSlowLogsRequest.setOrder("");
        ListPostgresqlSlowLogsResponse response = dbscClient.listPostgresqlSlowLogs(listPostgresqlSlowLogsRequest);
        System.out.println(response);
    }
    /**
     * listRedisBigKeyAnalysisTasks
     *
     */
    @Test
    public void listRedisBigKeyAnalysisTasksTest() {
        ListRedisBigKeyAnalysisTasksRequest listRedisBigKeyAnalysisTasksRequest = new ListRedisBigKeyAnalysisTasksRequest();
        listRedisBigKeyAnalysisTasksRequest.setClusterId("");
        ListRedisBigKeyAnalysisTasksResponse response = dbscClient.listRedisBigKeyAnalysisTasks(listRedisBigKeyAnalysisTasksRequest);
        System.out.println(response);
    }
    /**
     * listRedisSlowLogs
     *
     */
    @Test
    public void listRedisSlowLogsTest() {
        ListRedisSlowLogsRequest listRedisSlowLogsRequest = new ListRedisSlowLogsRequest();
        listRedisSlowLogsRequest.setNodeId("");
        listRedisSlowLogsRequest.setStart("");
        listRedisSlowLogsRequest.setEnd("");
        listRedisSlowLogsRequest.setDbEngine("");
        listRedisSlowLogsRequest.setPage(0);
        listRedisSlowLogsRequest.setPageSize(0);
        listRedisSlowLogsRequest.setOrderBy("");
        listRedisSlowLogsRequest.setOrder("");
        ListRedisSlowLogsResponse response = dbscClient.listRedisSlowLogs(listRedisSlowLogsRequest);
        System.out.println(response);
    }
    /**
     * startStopMysqlInstanceFlowLimitingTask
     *
     */
    @Test
    public void startStopMysqlInstanceFlowLimitingTaskTest() {
        StartStopMysqlInstanceFlowLimitingTaskRequest startStopMysqlInstanceFlowLimitingTaskRequest = new StartStopMysqlInstanceFlowLimitingTaskRequest();
        startStopMysqlInstanceFlowLimitingTaskRequest.setFilterId(0);
        startStopMysqlInstanceFlowLimitingTaskRequest.setAction("");
        startStopMysqlInstanceFlowLimitingTaskRequest.setAppId("");
        startStopMysqlInstanceFlowLimitingTaskRequest.setNodeId("");
        dbscClient.startStopMysqlInstanceFlowLimitingTask(startStopMysqlInstanceFlowLimitingTaskRequest);
    }
    /**
     * updateMysqlRateLimitTask
     *
     */
    @Test
    public void updateMysqlRateLimitTaskTest() {
        UpdateMysqlRateLimitTaskRequest updateMysqlRateLimitTaskRequest = new UpdateMysqlRateLimitTaskRequest();
        updateMysqlRateLimitTaskRequest.setFilterId(0);
        updateMysqlRateLimitTaskRequest.setAppId("");
        updateMysqlRateLimitTaskRequest.setNodeId("");
        updateMysqlRateLimitTaskRequest.setFilterKey("");
        updateMysqlRateLimitTaskRequest.setFilterLimit(0);
        updateMysqlRateLimitTaskRequest.setFilterType("");
        dbscClient.updateMysqlRateLimitTask(updateMysqlRateLimitTaskRequest);
    }
}
