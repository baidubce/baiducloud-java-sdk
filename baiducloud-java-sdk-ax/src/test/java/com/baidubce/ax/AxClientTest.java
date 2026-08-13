package com.baidubce.ax;

import com.baidubce.ax.models.BatchReleaseSandboxesRequest;
import com.baidubce.ax.models.BatchReleaseSandboxesResponse;
import com.baidubce.ax.models.ConnectSandboxRequest;
import com.baidubce.ax.models.ConnectSandboxResponse;
import com.baidubce.ax.models.CreateSandboxRequest;
import com.baidubce.ax.models.CreateSandboxResponse;
import com.baidubce.ax.models.CreateSandboxSnapshotRequest;
import com.baidubce.ax.models.CreateSandboxSnapshotResponse;
import com.baidubce.ax.models.DeleteSandboxRequest;
import com.baidubce.ax.models.ForkSandboxRequest;
import com.baidubce.ax.models.ForkSandboxResponse;
import com.baidubce.ax.models.GetSandboxResourcesRequest;
import com.baidubce.ax.models.GetSandboxResourcesResponse;
import com.baidubce.ax.models.GetSandboxSnapshotRequest;
import com.baidubce.ax.models.GetSandboxSnapshotResponse;
import com.baidubce.ax.models.ListSandboxSnapshotsRequest;
import com.baidubce.ax.models.ListSandboxSnapshotsResponse;
import com.baidubce.ax.models.ListSandboxesRequest;
import com.baidubce.ax.models.ListSandboxesResponse;
import com.baidubce.ax.models.ListSandboxesV2ByPathRequest;
import com.baidubce.ax.models.ListSandboxesV2ByPathResponse;
import com.baidubce.ax.models.ListSandboxesV2Request;
import com.baidubce.ax.models.ListSandboxesV2Response;
import com.baidubce.ax.models.PauseSandboxRequest;
import com.baidubce.ax.models.QuerySandboxesRequest;
import com.baidubce.ax.models.QuerySandboxesResponse;
import com.baidubce.ax.models.ResumeSandboxRequest;
import com.baidubce.ax.models.ResumeSandboxResponse;
import com.baidubce.ax.models.SetSandboxTimeoutRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.BceApiKeyCredentials;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * API tests for AxClient
 */
public class AxClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private static final String API_KEY = "";
    private AxClient axClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        // config.setCredentials(new DefaultBceCredentials(AK, SK));

        // ==== API Key 鉴权 ====
        config.setCredentials(new BceApiKeyCredentials(API_KEY));

        axClient = new AxClient(config);
    }

    /**
     * batchReleaseSandboxes
     *
     */
    @Test
    public void batchReleaseSandboxesTest() {
        BatchReleaseSandboxesRequest batchReleaseSandboxesRequest = new BatchReleaseSandboxesRequest();
        batchReleaseSandboxesRequest.setSandboxIds(new ArrayList<>());
        BatchReleaseSandboxesResponse response = axClient.batchReleaseSandboxes(batchReleaseSandboxesRequest);
        System.out.println(response);
    }
    /**
     * connectSandbox
     *
     */
    @Test
    public void connectSandboxTest() {
        ConnectSandboxRequest connectSandboxRequest = new ConnectSandboxRequest();
        connectSandboxRequest.setSandboxID("");
        connectSandboxRequest.setTimeout(0);
        connectSandboxRequest.setSnapshotID("");
        ConnectSandboxResponse response = axClient.connectSandbox(connectSandboxRequest);
        System.out.println(response);
    }
    /**
     * createSandbox
     *
     */
    @Test
    public void createSandboxTest() {
        CreateSandboxRequest createSandboxRequest = new CreateSandboxRequest();
        createSandboxRequest.setTemplateID("");
        createSandboxRequest.setTimeout(0);
        createSandboxRequest.setMetadata(new HashMap<>());
        createSandboxRequest.setEnvVars(new HashMap<>());
        createSandboxRequest.setSecure(false);
        createSandboxRequest.setAllowInternetAccess(false);
        createSandboxRequest.setAutoPause(false);
        createSandboxRequest.setAutoResume(new HashMap<>());
        createSandboxRequest.setRuntimeType("");
        createSandboxRequest.setMcp(new HashMap<>());
        createSandboxRequest.setVolumeMounts(new ArrayList<>());
        CreateSandboxResponse response = axClient.createSandbox(createSandboxRequest);
        System.out.println(response);
    }
    /**
     * createSandboxSnapshot
     *
     */
    @Test
    public void createSandboxSnapshotTest() {
        CreateSandboxSnapshotRequest createSandboxSnapshotRequest = new CreateSandboxSnapshotRequest();
        createSandboxSnapshotRequest.setSandboxID("");
        createSandboxSnapshotRequest.setName("");
        CreateSandboxSnapshotResponse response = axClient.createSandboxSnapshot(createSandboxSnapshotRequest);
        System.out.println(response);
    }
    /**
     * deleteSandbox
     *
     */
    @Test
    public void deleteSandboxTest() {
        DeleteSandboxRequest deleteSandboxRequest = new DeleteSandboxRequest();
        deleteSandboxRequest.setSandboxID("");
        axClient.deleteSandbox(deleteSandboxRequest);
    }
    /**
     * forkSandbox
     *
     */
    @Test
    public void forkSandboxTest() {
        ForkSandboxRequest forkSandboxRequest = new ForkSandboxRequest();
        forkSandboxRequest.setSandboxID("");
        ForkSandboxResponse response = axClient.forkSandbox(forkSandboxRequest);
        System.out.println(response);
    }
    /**
     * getSandboxResources
     *
     */
    @Test
    public void getSandboxResourcesTest() {
        GetSandboxResourcesRequest getSandboxResourcesRequest = new GetSandboxResourcesRequest();
        getSandboxResourcesRequest.setSandboxID("");
        GetSandboxResourcesResponse response = axClient.getSandboxResources(getSandboxResourcesRequest);
        System.out.println(response);
    }
    /**
     * getSandboxSnapshot
     *
     */
    @Test
    public void getSandboxSnapshotTest() {
        GetSandboxSnapshotRequest getSandboxSnapshotRequest = new GetSandboxSnapshotRequest();
        getSandboxSnapshotRequest.setSandboxID("");
        getSandboxSnapshotRequest.setSnapshotID("");
        GetSandboxSnapshotResponse response = axClient.getSandboxSnapshot(getSandboxSnapshotRequest);
        System.out.println(response);
    }
    /**
     * listSandboxSnapshots
     *
     */
    @Test
    public void listSandboxSnapshotsTest() {
        ListSandboxSnapshotsRequest listSandboxSnapshotsRequest = new ListSandboxSnapshotsRequest();
        listSandboxSnapshotsRequest.setSandboxID("");
        ListSandboxSnapshotsResponse response = axClient.listSandboxSnapshots(listSandboxSnapshotsRequest);
        System.out.println(response);
    }
    /**
     * listSandboxes
     *
     */
    @Test
    public void listSandboxesTest() {
        ListSandboxesRequest listSandboxesRequest = new ListSandboxesRequest();
        listSandboxesRequest.setMetadata("");
        ListSandboxesResponse response = axClient.listSandboxes(listSandboxesRequest);
        System.out.println(response);
    }
    /**
     * listSandboxesV2
     *
     */
    @Test
    public void listSandboxesV2Test() {
        ListSandboxesV2Request listSandboxesV2Request = new ListSandboxesV2Request();
        listSandboxesV2Request.setLimit(0);
        listSandboxesV2Request.setNextToken("");
        listSandboxesV2Request.setMetadata("");
        listSandboxesV2Request.setState("");
        ListSandboxesV2Response response = axClient.listSandboxesV2(listSandboxesV2Request);
        System.out.println(response);
    }
    /**
     * listSandboxesV2ByPath
     *
     */
    @Test
    public void listSandboxesV2ByPathTest() {
        ListSandboxesV2ByPathRequest listSandboxesV2ByPathRequest = new ListSandboxesV2ByPathRequest();
        listSandboxesV2ByPathRequest.setLimit(0);
        listSandboxesV2ByPathRequest.setNextToken("");
        listSandboxesV2ByPathRequest.setMetadata("");
        listSandboxesV2ByPathRequest.setState("");
        ListSandboxesV2ByPathResponse response = axClient.listSandboxesV2ByPath(listSandboxesV2ByPathRequest);
        System.out.println(response);
    }
    /**
     * pauseSandbox
     *
     */
    @Test
    public void pauseSandboxTest() {
        PauseSandboxRequest pauseSandboxRequest = new PauseSandboxRequest();
        pauseSandboxRequest.setSandboxID("");
        pauseSandboxRequest.setHibernateMode("");
        axClient.pauseSandbox(pauseSandboxRequest);
    }
    /**
     * querySandboxes
     *
     */
    @Test
    public void querySandboxesTest() {
        QuerySandboxesRequest querySandboxesRequest = new QuerySandboxesRequest();
        querySandboxesRequest.setLimit(0);
        querySandboxesRequest.setNextToken("");
        querySandboxesRequest.setSandboxIds(new ArrayList<>());
        querySandboxesRequest.setImagePaths(new ArrayList<>());
        querySandboxesRequest.setMetadata(new HashMap<>());
        querySandboxesRequest.setState(new ArrayList<>());
        QuerySandboxesResponse response = axClient.querySandboxes(querySandboxesRequest);
        System.out.println(response);
    }
    /**
     * resumeSandbox
     *
     */
    @Test
    public void resumeSandboxTest() {
        ResumeSandboxRequest resumeSandboxRequest = new ResumeSandboxRequest();
        resumeSandboxRequest.setSandboxID("");
        resumeSandboxRequest.setTimeout(0);
        resumeSandboxRequest.setAutoPause(false);
        ResumeSandboxResponse response = axClient.resumeSandbox(resumeSandboxRequest);
        System.out.println(response);
    }
    /**
     * setSandboxTimeout
     *
     */
    @Test
    public void setSandboxTimeoutTest() {
        SetSandboxTimeoutRequest setSandboxTimeoutRequest = new SetSandboxTimeoutRequest();
        setSandboxTimeoutRequest.setSandboxID("");
        setSandboxTimeoutRequest.setTimeout(0);
        axClient.setSandboxTimeout(setSandboxTimeoutRequest);
    }
}
