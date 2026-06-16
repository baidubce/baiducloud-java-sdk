package com.baidubce.bls;

import com.baidubce.bls.models.CreateDownloadTaskRequest;
import com.baidubce.bls.models.CreateDownloadTaskResponse;
import com.baidubce.bls.models.CreateProjectRequest;
import com.baidubce.bls.models.CreateProjectResponse;
import com.baidubce.bls.models.DeleteDownloadTaskRequest;
import com.baidubce.bls.models.DeleteDownloadTaskResponse;
import com.baidubce.bls.models.DeleteProjectRequest;
import com.baidubce.bls.models.DeleteProjectResponse;
import com.baidubce.bls.models.DescribeDownloadTaskRequest;
import com.baidubce.bls.models.DescribeDownloadTaskResponse;
import com.baidubce.bls.models.DescribeProjectRequest;
import com.baidubce.bls.models.DescribeProjectResponse;
import com.baidubce.bls.models.GetDownloadTaskLinkRequest;
import com.baidubce.bls.models.GetDownloadTaskLinkResponse;
import com.baidubce.bls.models.ListDownloadTaskRequest;
import com.baidubce.bls.models.ListDownloadTaskResponse;
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
import com.baidubce.bls.models.UpdateProjectRequest;
import com.baidubce.bls.models.UpdateProjectResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

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
}
