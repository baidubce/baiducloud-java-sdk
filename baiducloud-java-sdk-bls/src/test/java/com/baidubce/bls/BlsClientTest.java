package com.baidubce.bls;

import com.baidubce.bls.models.AsyncSearchRequest;
import com.baidubce.bls.models.AsyncSearchResponse;
import com.baidubce.bls.models.BatchGetLogStoreRequest;
import com.baidubce.bls.models.BatchGetLogStoreResponse;
import com.baidubce.bls.models.BulkDeleteLogShipperRequest;
import com.baidubce.bls.models.BulkDeleteLogShipperResponse;
import com.baidubce.bls.models.BulkSetLogShipperStatusRequest;
import com.baidubce.bls.models.BulkSetLogShipperStatusResponse;
import com.baidubce.bls.models.CreateAlarmPolicyRequest;
import com.baidubce.bls.models.CreateAlarmPolicyResponse;
import com.baidubce.bls.models.CreateDownloadTaskRequest;
import com.baidubce.bls.models.CreateDownloadTaskResponse;
import com.baidubce.bls.models.CreateFastQueryRequest;
import com.baidubce.bls.models.CreateFastQueryResponse;
import com.baidubce.bls.models.CreateIndexRequest;
import com.baidubce.bls.models.CreateIndexResponse;
import com.baidubce.bls.models.CreateLogShipperRequest;
import com.baidubce.bls.models.CreateLogShipperResponse;
import com.baidubce.bls.models.CreateLogStoreRequest;
import com.baidubce.bls.models.CreateLogStoreResponse;
import com.baidubce.bls.models.CreateLogStoreTemplateRequest;
import com.baidubce.bls.models.CreateLogStoreTemplateResponse;
import com.baidubce.bls.models.CreateLogStoreViewRequest;
import com.baidubce.bls.models.CreateProjectRequest;
import com.baidubce.bls.models.CreateProjectResponse;
import com.baidubce.bls.models.CreateTaskRequest;
import com.baidubce.bls.models.CreateTaskResponse;
import com.baidubce.bls.models.DeleteAlarmPolicyRequest;
import com.baidubce.bls.models.DeleteAlarmPolicyResponse;
import com.baidubce.bls.models.DeleteDownloadTaskRequest;
import com.baidubce.bls.models.DeleteDownloadTaskResponse;
import com.baidubce.bls.models.DeleteFastQueryRequest;
import com.baidubce.bls.models.DeleteFastQueryResponse;
import com.baidubce.bls.models.DeleteIndexRequest;
import com.baidubce.bls.models.DeleteIndexResponse;
import com.baidubce.bls.models.DeleteLogStoreRequest;
import com.baidubce.bls.models.DeleteLogStoreResponse;
import com.baidubce.bls.models.DeleteLogStoreTemplatesRequest;
import com.baidubce.bls.models.DeleteLogStoreTemplatesResponse;
import com.baidubce.bls.models.DeleteLogStoreViewRequest;
import com.baidubce.bls.models.DeleteLogStoreViewResponse;
import com.baidubce.bls.models.DeleteProjectRequest;
import com.baidubce.bls.models.DeleteProjectResponse;
import com.baidubce.bls.models.DeleteSingleLogShipperRequest;
import com.baidubce.bls.models.DeleteSingleLogShipperResponse;
import com.baidubce.bls.models.DescribeAlarmPolicyRequest;
import com.baidubce.bls.models.DescribeAlarmPolicyResponse;
import com.baidubce.bls.models.DescribeAlarmRecordRequest;
import com.baidubce.bls.models.DescribeAlarmRecordResponse;
import com.baidubce.bls.models.DescribeDownloadTaskRequest;
import com.baidubce.bls.models.DescribeDownloadTaskResponse;
import com.baidubce.bls.models.DescribeFastQueryRequest;
import com.baidubce.bls.models.DescribeFastQueryResponse;
import com.baidubce.bls.models.DescribeIndexRequest;
import com.baidubce.bls.models.DescribeIndexResponse;
import com.baidubce.bls.models.DescribeLogStoreRequest;
import com.baidubce.bls.models.DescribeLogStoreResponse;
import com.baidubce.bls.models.DescribeLogStoreTemplateRequest;
import com.baidubce.bls.models.DescribeLogStoreTemplateResponse;
import com.baidubce.bls.models.DescribeLogStoreTemplatesRequest;
import com.baidubce.bls.models.DescribeLogStoreTemplatesResponse;
import com.baidubce.bls.models.DescribeLogStoreViewRequest;
import com.baidubce.bls.models.DescribeLogStoreViewResponse;
import com.baidubce.bls.models.DescribeProjectRequest;
import com.baidubce.bls.models.DescribeProjectResponse;
import com.baidubce.bls.models.DisableAlarmPolicyRequest;
import com.baidubce.bls.models.DisableAlarmPolicyResponse;
import com.baidubce.bls.models.EnableAlarmPolicyRequest;
import com.baidubce.bls.models.EnableAlarmPolicyResponse;
import com.baidubce.bls.models.FieldCapsRequest;
import com.baidubce.bls.models.FieldCapsResponse;
import com.baidubce.bls.models.GetDownloadTaskLinkRequest;
import com.baidubce.bls.models.GetDownloadTaskLinkResponse;
import com.baidubce.bls.models.GetLogShipperRequest;
import com.baidubce.bls.models.GetLogShipperResponse;
import com.baidubce.bls.models.ListAlarmExecutionStatsRequest;
import com.baidubce.bls.models.ListAlarmExecutionStatsResponse;
import com.baidubce.bls.models.ListAlarmExecutionsRequest;
import com.baidubce.bls.models.ListAlarmExecutionsResponse;
import com.baidubce.bls.models.ListAlarmPolicyRequest;
import com.baidubce.bls.models.ListAlarmPolicyResponse;
import com.baidubce.bls.models.ListAlarmRecordRequest;
import com.baidubce.bls.models.ListAlarmRecordResponse;
import com.baidubce.bls.models.ListDownloadTaskRequest;
import com.baidubce.bls.models.ListDownloadTaskResponse;
import com.baidubce.bls.models.ListFastQueryRequest;
import com.baidubce.bls.models.ListFastQueryResponse;
import com.baidubce.bls.models.ListLogShipperRecordRequest;
import com.baidubce.bls.models.ListLogShipperRecordResponse;
import com.baidubce.bls.models.ListLogShipperRequest;
import com.baidubce.bls.models.ListLogShipperResponse;
import com.baidubce.bls.models.ListLogStoreRequest;
import com.baidubce.bls.models.ListLogStoreResponse;
import com.baidubce.bls.models.ListLogStoreViewRequest;
import com.baidubce.bls.models.ListLogStoreViewResponse;
import com.baidubce.bls.models.ListLogStreamRequest;
import com.baidubce.bls.models.ListLogStreamResponse;
import com.baidubce.bls.models.ListProjectRequest;
import com.baidubce.bls.models.ListProjectResponse;
import com.baidubce.bls.models.PullLogRecordRequest;
import com.baidubce.bls.models.PullLogRecordResponse;
import com.baidubce.bls.models.PushLogRecordRequest;
import com.baidubce.bls.models.PushLogRecordResponse;
import com.baidubce.bls.models.QueryLogHistogramRequest;
import com.baidubce.bls.models.QueryLogHistogramResponse;
import com.baidubce.bls.models.QueryLogRecordRequest;
import com.baidubce.bls.models.QueryLogRecordResponse;
import com.baidubce.bls.models.ResolveIndexRequest;
import com.baidubce.bls.models.ResolveIndexResponse;
import com.baidubce.bls.models.SetSingleLogShipperStatusRequest;
import com.baidubce.bls.models.SetSingleLogShipperStatusResponse;
import com.baidubce.bls.models.TermsEnumRequest;
import com.baidubce.bls.models.TermsEnumResponse;
import com.baidubce.bls.models.UpdateAlarmPolicyRequest;
import com.baidubce.bls.models.UpdateAlarmPolicyResponse;
import com.baidubce.bls.models.UpdateFastQueryRequest;
import com.baidubce.bls.models.UpdateFastQueryResponse;
import com.baidubce.bls.models.UpdateIndexRequest;
import com.baidubce.bls.models.UpdateIndexResponse;
import com.baidubce.bls.models.UpdateLogShipperRequest;
import com.baidubce.bls.models.UpdateLogShipperResponse;
import com.baidubce.bls.models.UpdateLogStoreRequest;
import com.baidubce.bls.models.UpdateLogStoreResponse;
import com.baidubce.bls.models.UpdateLogStoreTemplateRequest;
import com.baidubce.bls.models.UpdateLogStoreTemplateResponse;
import com.baidubce.bls.models.UpdateLogStoreViewRequest;
import com.baidubce.bls.models.UpdateProjectRequest;
import com.baidubce.bls.models.UpdateProjectResponse;
import com.baidubce.bls.models.UpdateTaskRequest;
import com.baidubce.bls.models.ValidateAlarmConditionRequest;
import com.baidubce.bls.models.ValidateAlarmConditionResponse;
import com.baidubce.bls.models.ValidateAlarmPolicySQLRequest;
import com.baidubce.bls.models.ValidateAlarmPolicySQLResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * API tests for BlsClient
 */
public class BlsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private BlsClient blsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        blsClient = new BlsClient(config);
    }

    /**
     * asyncSearch
     *
     */
    @Test
    public void asyncSearchTest() {
        AsyncSearchRequest asyncSearchRequest = new AsyncSearchRequest();
        asyncSearchRequest.setName("");
        asyncSearchRequest.setQuery(null);
        asyncSearchRequest.setAggs(null);
        asyncSearchRequest.setFields(new ArrayList<>());
        asyncSearchRequest.setSort(new HashMap<>());
        asyncSearchRequest.setSearchAfter(new ArrayList<>());
        asyncSearchRequest.setHighlight(null);
        asyncSearchRequest.setSize(0);
        AsyncSearchResponse response = blsClient.asyncSearch(asyncSearchRequest);
        System.out.println(response);
    }
    /**
     * batchGetLogStore
     *
     */
    @Test
    public void batchGetLogStoreTest() {
        BatchGetLogStoreRequest batchGetLogStoreRequest = new BatchGetLogStoreRequest();
        batchGetLogStoreRequest.setLogStores(new ArrayList<>());
        BatchGetLogStoreResponse response = blsClient.batchGetLogStore(batchGetLogStoreRequest);
        System.out.println(response);
    }
    /**
     * bulkDeleteLogShipper
     *
     */
    @Test
    public void bulkDeleteLogShipperTest() {
        BulkDeleteLogShipperRequest bulkDeleteLogShipperRequest = new BulkDeleteLogShipperRequest();
        bulkDeleteLogShipperRequest.setLogShipperIDs(new ArrayList<>());
        BulkDeleteLogShipperResponse response = blsClient.bulkDeleteLogShipper(bulkDeleteLogShipperRequest);
        System.out.println(response);
    }
    /**
     * bulkSetLogShipperStatus
     *
     */
    @Test
    public void bulkSetLogShipperStatusTest() {
        BulkSetLogShipperStatusRequest bulkSetLogShipperStatusRequest = new BulkSetLogShipperStatusRequest();
        bulkSetLogShipperStatusRequest.setDesiredStatus("");
        bulkSetLogShipperStatusRequest.setLogShipperIDs(new ArrayList<>());
        BulkSetLogShipperStatusResponse response = blsClient.bulkSetLogShipperStatus(bulkSetLogShipperStatusRequest);
        System.out.println(response);
    }
    /**
     * createAlarmPolicy
     *
     */
    @Test
    public void createAlarmPolicyTest() {
        CreateAlarmPolicyRequest createAlarmPolicyRequest = new CreateAlarmPolicyRequest();
        createAlarmPolicyRequest.setName("");
        createAlarmPolicyRequest.setObjects(new ArrayList<>());
        createAlarmPolicyRequest.setTargets(new ArrayList<>());
        createAlarmPolicyRequest.setTriggerConditions(new ArrayList<>());
        createAlarmPolicyRequest.setGroups(new ArrayList<>());
        createAlarmPolicyRequest.setSchedule(null);
        createAlarmPolicyRequest.setPendingCount(0);
        createAlarmPolicyRequest.setRepeatIntervalMinute(0);
        createAlarmPolicyRequest.setRecoverWithoutNotice(false);
        createAlarmPolicyRequest.setState("");
        createAlarmPolicyRequest.setNoticeState("");
        createAlarmPolicyRequest.setNotices(new ArrayList<>());
        createAlarmPolicyRequest.setNoticeRawLogs(new ArrayList<>());
        CreateAlarmPolicyResponse response = blsClient.createAlarmPolicy(createAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * createDownloadTask
     *
     */
    @Test
    public void createDownloadTaskTest() {
        CreateDownloadTaskRequest createDownloadTaskRequest = new CreateDownloadTaskRequest();
        createDownloadTaskRequest.setName("");
        createDownloadTaskRequest.setProject("");
        createDownloadTaskRequest.setLogStoreName("");
        createDownloadTaskRequest.setLogStreamName("");
        createDownloadTaskRequest.setQuery("");
        createDownloadTaskRequest.setQueryStartTime("");
        createDownloadTaskRequest.setQueryEndTime("");
        createDownloadTaskRequest.setFormat("");
        createDownloadTaskRequest.setLimit(0);
        createDownloadTaskRequest.setOrder("");
        createDownloadTaskRequest.setFileDir("");
        CreateDownloadTaskResponse response = blsClient.createDownloadTask(createDownloadTaskRequest);
        System.out.println(response);
    }
    /**
     * createFastQuery
     *
     */
    @Test
    public void createFastQueryTest() {
        CreateFastQueryRequest createFastQueryRequest = new CreateFastQueryRequest();
        createFastQueryRequest.setFastQueryName("");
        createFastQueryRequest.setQuery("");
        createFastQueryRequest.setDescription("");
        createFastQueryRequest.setProject("");
        createFastQueryRequest.setLogStoreName("");
        createFastQueryRequest.setLogStreamName("");
        CreateFastQueryResponse response = blsClient.createFastQuery(createFastQueryRequest);
        System.out.println(response);
    }
    /**
     * createIndex
     *
     */
    @Test
    public void createIndexTest() {
        CreateIndexRequest createIndexRequest = new CreateIndexRequest();
        createIndexRequest.setLogStoreName("");
        createIndexRequest.setProject("");
        createIndexRequest.setFulltext(false);
        createIndexRequest.setCaseSensitive(false);
        createIndexRequest.setIncludeChinese(false);
        createIndexRequest.setSeparators("");
        createIndexRequest.setFields(new HashMap<>());
        CreateIndexResponse response = blsClient.createIndex(createIndexRequest);
        System.out.println(response);
    }
    /**
     * createLogShipper
     *
     */
    @Test
    public void createLogShipperTest() {
        CreateLogShipperRequest createLogShipperRequest = new CreateLogShipperRequest();
        createLogShipperRequest.setProject("");
        createLogShipperRequest.setLogStoreName("");
        createLogShipperRequest.setLogShipperName("");
        createLogShipperRequest.setStartTime("");
        createLogShipperRequest.setDestType("");
        createLogShipperRequest.setDestConfig(null);
        CreateLogShipperResponse response = blsClient.createLogShipper(createLogShipperRequest);
        System.out.println(response);
    }
    /**
     * createLogStore
     *
     */
    @Test
    public void createLogStoreTest() {
        CreateLogStoreRequest createLogStoreRequest = new CreateLogStoreRequest();
        createLogStoreRequest.setProject("");
        createLogStoreRequest.setLogStoreName("");
        createLogStoreRequest.setRetention(0);
        createLogStoreRequest.setTags(new ArrayList<>());
        createLogStoreRequest.setIndex(null);
        createLogStoreRequest.setShardCount(0);
        createLogStoreRequest.setMaxShardCount(0);
        createLogStoreRequest.setDisableShardAutoSplit(false);
        createLogStoreRequest.setIndexEnabled(false);
        createLogStoreRequest.setHotRetention(0);
        createLogStoreRequest.setEnableHotRetention(false);
        CreateLogStoreResponse response = blsClient.createLogStore(createLogStoreRequest);
        System.out.println(response);
    }
    /**
     * createLogStoreTemplate
     *
     */
    @Test
    public void createLogStoreTemplateTest() {
        CreateLogStoreTemplateRequest createLogStoreTemplateRequest = new CreateLogStoreTemplateRequest();
        createLogStoreTemplateRequest.setName("");
        createLogStoreTemplateRequest.setProjectPatterns(new ArrayList<>());
        createLogStoreTemplateRequest.setLogstorePatterns(new ArrayList<>());
        createLogStoreTemplateRequest.setPriority(0);
        createLogStoreTemplateRequest.setTemplate(null);
        CreateLogStoreTemplateResponse response = blsClient.createLogStoreTemplate(createLogStoreTemplateRequest);
        System.out.println(response);
    }
    /**
     * createLogStoreView
     *
     */
    @Test
    public void createLogStoreViewTest() {
        CreateLogStoreViewRequest createLogStoreViewRequest = new CreateLogStoreViewRequest();
        createLogStoreViewRequest.setProject("");
        createLogStoreViewRequest.setName("");
        createLogStoreViewRequest.setLogstores(new ArrayList<>());
        blsClient.createLogStoreView(createLogStoreViewRequest);
    }
    /**
     * createProject
     *
     */
    @Test
    public void createProjectTest() {
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setName("");
        createProjectRequest.setDescription("");
        CreateProjectResponse response = blsClient.createProject(createProjectRequest);
        System.out.println(response);
    }
    /**
     * createTask
     *
     */
    @Test
    public void createTaskTest() {
        CreateTaskRequest createTaskRequest = new CreateTaskRequest();
        createTaskRequest.setName("");
        createTaskRequest.setConfig(null);
        createTaskRequest.setHosts(new ArrayList<>());
        createTaskRequest.setTags(new ArrayList<>());
        CreateTaskResponse response = blsClient.createTask(createTaskRequest);
        System.out.println(response);
    }
    /**
     * deleteAlarmPolicy
     *
     */
    @Test
    public void deleteAlarmPolicyTest() {
        DeleteAlarmPolicyRequest deleteAlarmPolicyRequest = new DeleteAlarmPolicyRequest();
        deleteAlarmPolicyRequest.setNames(new ArrayList<>());
        DeleteAlarmPolicyResponse response = blsClient.deleteAlarmPolicy(deleteAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * deleteDownloadTask
     *
     */
    @Test
    public void deleteDownloadTaskTest() {
        DeleteDownloadTaskRequest deleteDownloadTaskRequest = new DeleteDownloadTaskRequest();
        deleteDownloadTaskRequest.setUuid("");
        DeleteDownloadTaskResponse response = blsClient.deleteDownloadTask(deleteDownloadTaskRequest);
        System.out.println(response);
    }
    /**
     * deleteFastQuery
     *
     */
    @Test
    public void deleteFastQueryTest() {
        DeleteFastQueryRequest deleteFastQueryRequest = new DeleteFastQueryRequest();
        deleteFastQueryRequest.setFastQueryName("");
        DeleteFastQueryResponse response = blsClient.deleteFastQuery(deleteFastQueryRequest);
        System.out.println(response);
    }
    /**
     * deleteIndex
     *
     */
    @Test
    public void deleteIndexTest() {
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest();
        deleteIndexRequest.setLogStoreName("");
        deleteIndexRequest.setProject("");
        DeleteIndexResponse response = blsClient.deleteIndex(deleteIndexRequest);
        System.out.println(response);
    }
    /**
     * deleteLogStore
     *
     */
    @Test
    public void deleteLogStoreTest() {
        DeleteLogStoreRequest deleteLogStoreRequest = new DeleteLogStoreRequest();
        deleteLogStoreRequest.setLogStoreName("");
        deleteLogStoreRequest.setProject("");
        DeleteLogStoreResponse response = blsClient.deleteLogStore(deleteLogStoreRequest);
        System.out.println(response);
    }
    /**
     * deleteLogStoreTemplates
     *
     */
    @Test
    public void deleteLogStoreTemplatesTest() {
        DeleteLogStoreTemplatesRequest deleteLogStoreTemplatesRequest = new DeleteLogStoreTemplatesRequest();
        deleteLogStoreTemplatesRequest.setNames(new ArrayList<>());
        DeleteLogStoreTemplatesResponse response = blsClient.deleteLogStoreTemplates(deleteLogStoreTemplatesRequest);
        System.out.println(response);
    }
    /**
     * deleteLogStoreView
     *
     */
    @Test
    public void deleteLogStoreViewTest() {
        DeleteLogStoreViewRequest deleteLogStoreViewRequest = new DeleteLogStoreViewRequest();
        deleteLogStoreViewRequest.setName("");
        deleteLogStoreViewRequest.setProject("");
        DeleteLogStoreViewResponse response = blsClient.deleteLogStoreView(deleteLogStoreViewRequest);
        System.out.println(response);
    }
    /**
     * deleteProject
     *
     */
    @Test
    public void deleteProjectTest() {
        DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
        deleteProjectRequest.setUuid("");
        DeleteProjectResponse response = blsClient.deleteProject(deleteProjectRequest);
        System.out.println(response);
    }
    /**
     * deleteSingleLogShipper
     *
     */
    @Test
    public void deleteSingleLogShipperTest() {
        DeleteSingleLogShipperRequest deleteSingleLogShipperRequest = new DeleteSingleLogShipperRequest();
        deleteSingleLogShipperRequest.setLogShipperID("");
        DeleteSingleLogShipperResponse response = blsClient.deleteSingleLogShipper(deleteSingleLogShipperRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmPolicy
     *
     */
    @Test
    public void describeAlarmPolicyTest() {
        DescribeAlarmPolicyRequest describeAlarmPolicyRequest = new DescribeAlarmPolicyRequest();
        describeAlarmPolicyRequest.setPolicyName("");
        DescribeAlarmPolicyResponse response = blsClient.describeAlarmPolicy(describeAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmRecord
     *
     */
    @Test
    public void describeAlarmRecordTest() {
        DescribeAlarmRecordRequest describeAlarmRecordRequest = new DescribeAlarmRecordRequest();
        describeAlarmRecordRequest.setAlarmId("");
        DescribeAlarmRecordResponse response = blsClient.describeAlarmRecord(describeAlarmRecordRequest);
        System.out.println(response);
    }
    /**
     * describeDownloadTask
     *
     */
    @Test
    public void describeDownloadTaskTest() {
        DescribeDownloadTaskRequest describeDownloadTaskRequest = new DescribeDownloadTaskRequest();
        describeDownloadTaskRequest.setUuid("");
        DescribeDownloadTaskResponse response = blsClient.describeDownloadTask(describeDownloadTaskRequest);
        System.out.println(response);
    }
    /**
     * describeFastQuery
     *
     */
    @Test
    public void describeFastQueryTest() {
        DescribeFastQueryRequest describeFastQueryRequest = new DescribeFastQueryRequest();
        describeFastQueryRequest.setFastQueryName("");
        DescribeFastQueryResponse response = blsClient.describeFastQuery(describeFastQueryRequest);
        System.out.println(response);
    }
    /**
     * describeIndex
     *
     */
    @Test
    public void describeIndexTest() {
        DescribeIndexRequest describeIndexRequest = new DescribeIndexRequest();
        describeIndexRequest.setLogStoreName("");
        describeIndexRequest.setProject("");
        DescribeIndexResponse response = blsClient.describeIndex(describeIndexRequest);
        System.out.println(response);
    }
    /**
     * describeLogStore
     *
     */
    @Test
    public void describeLogStoreTest() {
        DescribeLogStoreRequest describeLogStoreRequest = new DescribeLogStoreRequest();
        describeLogStoreRequest.setLogStoreName("");
        describeLogStoreRequest.setProject("");
        DescribeLogStoreResponse response = blsClient.describeLogStore(describeLogStoreRequest);
        System.out.println(response);
    }
    /**
     * describeLogStoreTemplate
     *
     */
    @Test
    public void describeLogStoreTemplateTest() {
        DescribeLogStoreTemplateRequest describeLogStoreTemplateRequest = new DescribeLogStoreTemplateRequest();
        describeLogStoreTemplateRequest.setName("");
        DescribeLogStoreTemplateResponse response = blsClient.describeLogStoreTemplate(describeLogStoreTemplateRequest);
        System.out.println(response);
    }
    /**
     * describeLogStoreTemplates
     *
     */
    @Test
    public void describeLogStoreTemplatesTest() {
        DescribeLogStoreTemplatesRequest describeLogStoreTemplatesRequest = new DescribeLogStoreTemplatesRequest();
        describeLogStoreTemplatesRequest.setName("");
        describeLogStoreTemplatesRequest.setOrderBy("");
        describeLogStoreTemplatesRequest.setOrder("");
        describeLogStoreTemplatesRequest.setPageNo(0);
        describeLogStoreTemplatesRequest.setPageSize(0);
        DescribeLogStoreTemplatesResponse response = blsClient.describeLogStoreTemplates(describeLogStoreTemplatesRequest);
        System.out.println(response);
    }
    /**
     * describeLogStoreView
     *
     */
    @Test
    public void describeLogStoreViewTest() {
        DescribeLogStoreViewRequest describeLogStoreViewRequest = new DescribeLogStoreViewRequest();
        describeLogStoreViewRequest.setName("");
        describeLogStoreViewRequest.setProject("");
        DescribeLogStoreViewResponse response = blsClient.describeLogStoreView(describeLogStoreViewRequest);
        System.out.println(response);
    }
    /**
     * describeProject
     *
     */
    @Test
    public void describeProjectTest() {
        DescribeProjectRequest describeProjectRequest = new DescribeProjectRequest();
        describeProjectRequest.setUuid("");
        DescribeProjectResponse response = blsClient.describeProject(describeProjectRequest);
        System.out.println(response);
    }
    /**
     * disableAlarmPolicy
     *
     */
    @Test
    public void disableAlarmPolicyTest() {
        DisableAlarmPolicyRequest disableAlarmPolicyRequest = new DisableAlarmPolicyRequest();
        disableAlarmPolicyRequest.setNames(new ArrayList<>());
        DisableAlarmPolicyResponse response = blsClient.disableAlarmPolicy(disableAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * enableAlarmPolicy
     *
     */
    @Test
    public void enableAlarmPolicyTest() {
        EnableAlarmPolicyRequest enableAlarmPolicyRequest = new EnableAlarmPolicyRequest();
        enableAlarmPolicyRequest.setNames(new ArrayList<>());
        EnableAlarmPolicyResponse response = blsClient.enableAlarmPolicy(enableAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * fieldCaps
     *
     */
    @Test
    public void fieldCapsTest() {
        FieldCapsRequest fieldCapsRequest = new FieldCapsRequest();
        fieldCapsRequest.setName("");
        fieldCapsRequest.setFields(new ArrayList<>());
        FieldCapsResponse response = blsClient.fieldCaps(fieldCapsRequest);
        System.out.println(response);
    }
    /**
     * getDownloadTaskLink
     *
     */
    @Test
    public void getDownloadTaskLinkTest() {
        GetDownloadTaskLinkRequest getDownloadTaskLinkRequest = new GetDownloadTaskLinkRequest();
        getDownloadTaskLinkRequest.setUuid("");
        GetDownloadTaskLinkResponse response = blsClient.getDownloadTaskLink(getDownloadTaskLinkRequest);
        System.out.println(response);
    }
    /**
     * getLogShipper
     *
     */
    @Test
    public void getLogShipperTest() {
        GetLogShipperRequest getLogShipperRequest = new GetLogShipperRequest();
        getLogShipperRequest.setLogShipperID("");
        GetLogShipperResponse response = blsClient.getLogShipper(getLogShipperRequest);
        System.out.println(response);
    }
    /**
     * listAlarmExecutionStats
     *
     */
    @Test
    public void listAlarmExecutionStatsTest() {
        ListAlarmExecutionStatsRequest listAlarmExecutionStatsRequest = new ListAlarmExecutionStatsRequest();
        listAlarmExecutionStatsRequest.setPolicyId("");
        listAlarmExecutionStatsRequest.setPolicyName("");
        listAlarmExecutionStatsRequest.setLogStoreName("");
        listAlarmExecutionStatsRequest.setStates(new ArrayList<>());
        listAlarmExecutionStatsRequest.setStartDateTime("");
        listAlarmExecutionStatsRequest.setEndDateTime("");
        listAlarmExecutionStatsRequest.setOrderBy("");
        listAlarmExecutionStatsRequest.setOrder("");
        listAlarmExecutionStatsRequest.setPageNo(0);
        listAlarmExecutionStatsRequest.setPageSize(0);
        ListAlarmExecutionStatsResponse response = blsClient.listAlarmExecutionStats(listAlarmExecutionStatsRequest);
        System.out.println(response);
    }
    /**
     * listAlarmExecutions
     *
     */
    @Test
    public void listAlarmExecutionsTest() {
        ListAlarmExecutionsRequest listAlarmExecutionsRequest = new ListAlarmExecutionsRequest();
        listAlarmExecutionsRequest.setPolicyId("");
        listAlarmExecutionsRequest.setLogStoreName("");
        listAlarmExecutionsRequest.setState("");
        listAlarmExecutionsRequest.setNoticeStates(new ArrayList<>());
        listAlarmExecutionsRequest.setStartDateTime("");
        listAlarmExecutionsRequest.setEndDateTime("");
        listAlarmExecutionsRequest.setOrderBy("");
        listAlarmExecutionsRequest.setOrder("");
        listAlarmExecutionsRequest.setPageNo(0);
        listAlarmExecutionsRequest.setPageSize(0);
        ListAlarmExecutionsResponse response = blsClient.listAlarmExecutions(listAlarmExecutionsRequest);
        System.out.println(response);
    }
    /**
     * listAlarmPolicy
     *
     */
    @Test
    public void listAlarmPolicyTest() {
        ListAlarmPolicyRequest listAlarmPolicyRequest = new ListAlarmPolicyRequest();
        listAlarmPolicyRequest.setPolicyNamePattern("");
        listAlarmPolicyRequest.setPolicyIdPattern("");
        listAlarmPolicyRequest.setLogStoreNamePattern("");
        listAlarmPolicyRequest.setState("");
        listAlarmPolicyRequest.setNoticeState("");
        listAlarmPolicyRequest.setOrderBy("");
        listAlarmPolicyRequest.setOrder("");
        listAlarmPolicyRequest.setPageNo(0);
        listAlarmPolicyRequest.setPageSize(0);
        ListAlarmPolicyResponse response = blsClient.listAlarmPolicy(listAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * listAlarmRecord
     *
     */
    @Test
    public void listAlarmRecordTest() {
        ListAlarmRecordRequest listAlarmRecordRequest = new ListAlarmRecordRequest();
        listAlarmRecordRequest.setPolicyNamePattern("");
        listAlarmRecordRequest.setPolicyIdPattern("");
        listAlarmRecordRequest.setLogStoreNamePattern("");
        listAlarmRecordRequest.setLevel("");
        listAlarmRecordRequest.setState("");
        listAlarmRecordRequest.setStartDateTime("");
        listAlarmRecordRequest.setEndDateTime("");
        listAlarmRecordRequest.setOrderBy("");
        listAlarmRecordRequest.setOrder("");
        listAlarmRecordRequest.setPageNo(0);
        listAlarmRecordRequest.setPageSize(0);
        ListAlarmRecordResponse response = blsClient.listAlarmRecord(listAlarmRecordRequest);
        System.out.println(response);
    }
    /**
     * listDownloadTask
     *
     */
    @Test
    public void listDownloadTaskTest() {
        ListDownloadTaskRequest listDownloadTaskRequest = new ListDownloadTaskRequest();
        listDownloadTaskRequest.setProject("");
        listDownloadTaskRequest.setLogStoreName("");
        listDownloadTaskRequest.setOrderBy("");
        listDownloadTaskRequest.setOrder("");
        listDownloadTaskRequest.setPageNo(0);
        listDownloadTaskRequest.setPageSize(0);
        ListDownloadTaskResponse response = blsClient.listDownloadTask(listDownloadTaskRequest);
        System.out.println(response);
    }
    /**
     * listFastQuery
     *
     */
    @Test
    public void listFastQueryTest() {
        ListFastQueryRequest listFastQueryRequest = new ListFastQueryRequest();
        listFastQueryRequest.setProject("");
        listFastQueryRequest.setLogStoreName("");
        listFastQueryRequest.setNamePattern("");
        listFastQueryRequest.setOrder("");
        listFastQueryRequest.setOrderBy("");
        listFastQueryRequest.setPageNo(0);
        listFastQueryRequest.setPageSize(0);
        ListFastQueryResponse response = blsClient.listFastQuery(listFastQueryRequest);
        System.out.println(response);
    }
    /**
     * listLogShipper
     *
     */
    @Test
    public void listLogShipperTest() {
        ListLogShipperRequest listLogShipperRequest = new ListLogShipperRequest();
        listLogShipperRequest.setLogShipperID("");
        listLogShipperRequest.setLogShipperName("");
        listLogShipperRequest.setProject("");
        listLogShipperRequest.setLogStoreName("");
        listLogShipperRequest.setDestType("");
        listLogShipperRequest.setStatus("");
        listLogShipperRequest.setOrderBy("");
        listLogShipperRequest.setOrder("");
        listLogShipperRequest.setPageNo(0);
        listLogShipperRequest.setPageSize(0);
        ListLogShipperResponse response = blsClient.listLogShipper(listLogShipperRequest);
        System.out.println(response);
    }
    /**
     * listLogShipperRecord
     *
     */
    @Test
    public void listLogShipperRecordTest() {
        ListLogShipperRecordRequest listLogShipperRecordRequest = new ListLogShipperRecordRequest();
        listLogShipperRecordRequest.setLogShipperID("");
        listLogShipperRecordRequest.setSinceHours(0);
        listLogShipperRecordRequest.setPageNo(0);
        listLogShipperRecordRequest.setPageSize(0);
        ListLogShipperRecordResponse response = blsClient.listLogShipperRecord(listLogShipperRecordRequest);
        System.out.println(response);
    }
    /**
     * listLogStore
     *
     */
    @Test
    public void listLogStoreTest() {
        ListLogStoreRequest listLogStoreRequest = new ListLogStoreRequest();
        listLogStoreRequest.setProject("");
        listLogStoreRequest.setNamePattern("");
        listLogStoreRequest.setOrder("");
        listLogStoreRequest.setOrderBy("");
        listLogStoreRequest.setPageNo(0);
        listLogStoreRequest.setPageSize(0);
        ListLogStoreResponse response = blsClient.listLogStore(listLogStoreRequest);
        System.out.println(response);
    }
    /**
     * listLogStoreView
     *
     */
    @Test
    public void listLogStoreViewTest() {
        ListLogStoreViewRequest listLogStoreViewRequest = new ListLogStoreViewRequest();
        listLogStoreViewRequest.setProject("");
        listLogStoreViewRequest.setName("");
        listLogStoreViewRequest.setOrder("");
        listLogStoreViewRequest.setOrderBy("");
        listLogStoreViewRequest.setPageNo(0);
        listLogStoreViewRequest.setPageSize(0);
        ListLogStoreViewResponse response = blsClient.listLogStoreView(listLogStoreViewRequest);
        System.out.println(response);
    }
    /**
     * listLogStream
     *
     */
    @Test
    public void listLogStreamTest() {
        ListLogStreamRequest listLogStreamRequest = new ListLogStreamRequest();
        listLogStreamRequest.setProject("");
        listLogStreamRequest.setLogStoreName("");
        listLogStreamRequest.setNamePattern("");
        listLogStreamRequest.setOrder("");
        listLogStreamRequest.setOrderBy("");
        listLogStreamRequest.setPageNo(0);
        listLogStreamRequest.setPageSize(0);
        ListLogStreamResponse response = blsClient.listLogStream(listLogStreamRequest);
        System.out.println(response);
    }
    /**
     * listProject
     *
     */
    @Test
    public void listProjectTest() {
        ListProjectRequest listProjectRequest = new ListProjectRequest();
        listProjectRequest.setName("");
        listProjectRequest.setDescription("");
        listProjectRequest.setOrderBy("");
        listProjectRequest.setOrder("");
        listProjectRequest.setPageNo(0);
        listProjectRequest.setPageSize(0);
        ListProjectResponse response = blsClient.listProject(listProjectRequest);
        System.out.println(response);
    }
    /**
     * pullLogRecord
     *
     */
    @Test
    public void pullLogRecordTest() {
        PullLogRecordRequest pullLogRecordRequest = new PullLogRecordRequest();
        pullLogRecordRequest.setLogStoreName("");
        pullLogRecordRequest.setLogStreamName("");
        pullLogRecordRequest.setStartDateTime("");
        pullLogRecordRequest.setEndDateTime("");
        pullLogRecordRequest.setProject("");
        pullLogRecordRequest.setLimit(0);
        pullLogRecordRequest.setMarker("");
        PullLogRecordResponse response = blsClient.pullLogRecord(pullLogRecordRequest);
        System.out.println(response);
    }
    /**
     * pushLogRecord
     *
     */
    @Test
    public void pushLogRecordTest() {
        PushLogRecordRequest pushLogRecordRequest = new PushLogRecordRequest();
        pushLogRecordRequest.setLogStoreName("");
        pushLogRecordRequest.setProject("");
        pushLogRecordRequest.setLogStreamName("");
        pushLogRecordRequest.setType("");
        pushLogRecordRequest.setLogRecords(new ArrayList<>());
        pushLogRecordRequest.setTags(new ArrayList<>());
        PushLogRecordResponse response = blsClient.pushLogRecord(pushLogRecordRequest);
        System.out.println(response);
    }
    /**
     * queryLogHistogram
     *
     */
    @Test
    public void queryLogHistogramTest() {
        QueryLogHistogramRequest queryLogHistogramRequest = new QueryLogHistogramRequest();
        queryLogHistogramRequest.setLogStoreName("");
        queryLogHistogramRequest.setQuery("");
        queryLogHistogramRequest.setStartDateTime("");
        queryLogHistogramRequest.setEndDateTime("");
        queryLogHistogramRequest.setProject("");
        queryLogHistogramRequest.setLogStreamName("");
        QueryLogHistogramResponse response = blsClient.queryLogHistogram(queryLogHistogramRequest);
        System.out.println(response);
    }
    /**
     * queryLogRecord
     *
     */
    @Test
    public void queryLogRecordTest() {
        QueryLogRecordRequest queryLogRecordRequest = new QueryLogRecordRequest();
        queryLogRecordRequest.setLogStoreName("");
        queryLogRecordRequest.setQuery("");
        queryLogRecordRequest.setStartDateTime("");
        queryLogRecordRequest.setEndDateTime("");
        queryLogRecordRequest.setProject("");
        queryLogRecordRequest.setLogStreamName("");
        queryLogRecordRequest.setMarker("");
        queryLogRecordRequest.setLimit(0);
        queryLogRecordRequest.setSort("");
        queryLogRecordRequest.setPageNo(0);
        queryLogRecordRequest.setPageSize(0);
        QueryLogRecordResponse response = blsClient.queryLogRecord(queryLogRecordRequest);
        System.out.println(response);
    }
    /**
     * resolveIndex
     *
     */
    @Test
    public void resolveIndexTest() {
        ResolveIndexRequest resolveIndexRequest = new ResolveIndexRequest();
        resolveIndexRequest.setName("");
        ResolveIndexResponse response = blsClient.resolveIndex(resolveIndexRequest);
        System.out.println(response);
    }
    /**
     * setSingleLogShipperStatus
     *
     */
    @Test
    public void setSingleLogShipperStatusTest() {
        SetSingleLogShipperStatusRequest setSingleLogShipperStatusRequest = new SetSingleLogShipperStatusRequest();
        setSingleLogShipperStatusRequest.setLogShipperID("");
        setSingleLogShipperStatusRequest.setStatus("");
        SetSingleLogShipperStatusResponse response = blsClient.setSingleLogShipperStatus(setSingleLogShipperStatusRequest);
        System.out.println(response);
    }
    /**
     * termsEnum
     *
     */
    @Test
    public void termsEnumTest() {
        TermsEnumRequest termsEnumRequest = new TermsEnumRequest();
        termsEnumRequest.setName("");
        termsEnumRequest.setField("");
        termsEnumRequest.setString("");
        termsEnumRequest.setSize(0);
        termsEnumRequest.setIndexFilter(null);
        TermsEnumResponse response = blsClient.termsEnum(termsEnumRequest);
        System.out.println(response);
    }
    /**
     * updateAlarmPolicy
     *
     */
    @Test
    public void updateAlarmPolicyTest() {
        UpdateAlarmPolicyRequest updateAlarmPolicyRequest = new UpdateAlarmPolicyRequest();
        updateAlarmPolicyRequest.setName("");
        updateAlarmPolicyRequest.setObjects(new ArrayList<>());
        updateAlarmPolicyRequest.setTargets(new ArrayList<>());
        updateAlarmPolicyRequest.setTriggerConditions(new ArrayList<>());
        updateAlarmPolicyRequest.setGroups(new ArrayList<>());
        updateAlarmPolicyRequest.setSchedule(null);
        updateAlarmPolicyRequest.setPendingCount(0);
        updateAlarmPolicyRequest.setRepeatIntervalMinute(0);
        updateAlarmPolicyRequest.setRecoverWithoutNotice(false);
        updateAlarmPolicyRequest.setState("");
        updateAlarmPolicyRequest.setNoticeState("");
        updateAlarmPolicyRequest.setNotices(new ArrayList<>());
        updateAlarmPolicyRequest.setNoticeRawLogs(new ArrayList<>());
        UpdateAlarmPolicyResponse response = blsClient.updateAlarmPolicy(updateAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * updateFastQuery
     *
     */
    @Test
    public void updateFastQueryTest() {
        UpdateFastQueryRequest updateFastQueryRequest = new UpdateFastQueryRequest();
        updateFastQueryRequest.setName("");
        updateFastQueryRequest.setFastQueryName("");
        updateFastQueryRequest.setQuery("");
        updateFastQueryRequest.setDescription("");
        updateFastQueryRequest.setProject("");
        updateFastQueryRequest.setLogStoreName("");
        updateFastQueryRequest.setLogStreamName("");
        UpdateFastQueryResponse response = blsClient.updateFastQuery(updateFastQueryRequest);
        System.out.println(response);
    }
    /**
     * updateIndex
     *
     */
    @Test
    public void updateIndexTest() {
        UpdateIndexRequest updateIndexRequest = new UpdateIndexRequest();
        updateIndexRequest.setLogStoreName("");
        updateIndexRequest.setProject("");
        updateIndexRequest.setFulltext(false);
        updateIndexRequest.setCaseSensitive(false);
        updateIndexRequest.setIncludeChinese(false);
        updateIndexRequest.setSeparators("");
        updateIndexRequest.setFields(new HashMap<>());
        UpdateIndexResponse response = blsClient.updateIndex(updateIndexRequest);
        System.out.println(response);
    }
    /**
     * updateLogShipper
     *
     */
    @Test
    public void updateLogShipperTest() {
        UpdateLogShipperRequest updateLogShipperRequest = new UpdateLogShipperRequest();
        updateLogShipperRequest.setLogShipperID("");
        updateLogShipperRequest.setProject("");
        updateLogShipperRequest.setLogShipperName("");
        updateLogShipperRequest.setDestConfig(null);
        UpdateLogShipperResponse response = blsClient.updateLogShipper(updateLogShipperRequest);
        System.out.println(response);
    }
    /**
     * updateLogStore
     *
     */
    @Test
    public void updateLogStoreTest() {
        UpdateLogStoreRequest updateLogStoreRequest = new UpdateLogStoreRequest();
        updateLogStoreRequest.setLogStoreName("");
        updateLogStoreRequest.setProject("");
        updateLogStoreRequest.setRetention(0);
        updateLogStoreRequest.setTags(new ArrayList<>());
        updateLogStoreRequest.setShardCount(0);
        updateLogStoreRequest.setMaxShardCount(0);
        updateLogStoreRequest.setDisableShardAutoSplit(false);
        updateLogStoreRequest.setIndexEnabled(false);
        updateLogStoreRequest.setHotRetention(0);
        UpdateLogStoreResponse response = blsClient.updateLogStore(updateLogStoreRequest);
        System.out.println(response);
    }
    /**
     * updateLogStoreTemplate
     *
     */
    @Test
    public void updateLogStoreTemplateTest() {
        UpdateLogStoreTemplateRequest updateLogStoreTemplateRequest = new UpdateLogStoreTemplateRequest();
        updateLogStoreTemplateRequest.setName("");
        updateLogStoreTemplateRequest.setProjectPatterns(new ArrayList<>());
        updateLogStoreTemplateRequest.setLogstorePatterns(new ArrayList<>());
        updateLogStoreTemplateRequest.setPriority(0);
        updateLogStoreTemplateRequest.setTemplate(null);
        UpdateLogStoreTemplateResponse response = blsClient.updateLogStoreTemplate(updateLogStoreTemplateRequest);
        System.out.println(response);
    }
    /**
     * updateLogStoreView
     *
     */
    @Test
    public void updateLogStoreViewTest() {
        UpdateLogStoreViewRequest updateLogStoreViewRequest = new UpdateLogStoreViewRequest();
        updateLogStoreViewRequest.setProject("");
        updateLogStoreViewRequest.setName("");
        updateLogStoreViewRequest.setLogstores(new ArrayList<>());
        blsClient.updateLogStoreView(updateLogStoreViewRequest);
    }
    /**
     * updateProject
     *
     */
    @Test
    public void updateProjectTest() {
        UpdateProjectRequest updateProjectRequest = new UpdateProjectRequest();
        updateProjectRequest.setUuid("");
        updateProjectRequest.setDescription("");
        updateProjectRequest.setTop(false);
        UpdateProjectResponse response = blsClient.updateProject(updateProjectRequest);
        System.out.println(response);
    }
    /**
     * updateTask
     *
     */
    @Test
    public void updateTaskTest() {
        UpdateTaskRequest updateTaskRequest = new UpdateTaskRequest();
        updateTaskRequest.setTaskId("");
        updateTaskRequest.setName("");
        updateTaskRequest.setConfig(null);
        updateTaskRequest.setHosts(new ArrayList<>());
        updateTaskRequest.setTags(new ArrayList<>());
        blsClient.updateTask(updateTaskRequest);
    }
    /**
     * validateAlarmCondition
     *
     */
    @Test
    public void validateAlarmConditionTest() {
        ValidateAlarmConditionRequest validateAlarmConditionRequest = new ValidateAlarmConditionRequest();
        validateAlarmConditionRequest.setFieldTypes(new ArrayList<>());
        validateAlarmConditionRequest.setConditions(new ArrayList<>());
        ValidateAlarmConditionResponse response = blsClient.validateAlarmCondition(validateAlarmConditionRequest);
        System.out.println(response);
    }
    /**
     * validateAlarmPolicySQL
     *
     */
    @Test
    public void validateAlarmPolicySQLTest() {
        ValidateAlarmPolicySQLRequest validateAlarmPolicySQLRequest = new ValidateAlarmPolicySQLRequest();
        validateAlarmPolicySQLRequest.setLogStores(new ArrayList<>());
        validateAlarmPolicySQLRequest.setQuery("");
        ValidateAlarmPolicySQLResponse response = blsClient.validateAlarmPolicySQL(validateAlarmPolicySQLRequest);
        System.out.println(response);
    }
}
