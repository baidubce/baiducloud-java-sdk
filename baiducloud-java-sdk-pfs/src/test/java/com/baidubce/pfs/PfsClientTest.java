package com.baidubce.pfs;

import com.baidubce.pfs.models.CancelL2BucketLinkRequest;
import com.baidubce.pfs.models.CancelL2BucketLinkResponse;
import com.baidubce.pfs.models.CreateFilesetRequest;
import com.baidubce.pfs.models.CreateFilesetResponse;
import com.baidubce.pfs.models.CreateL2BucketLinkRequest;
import com.baidubce.pfs.models.CreateL2BucketLinkResponse;
import com.baidubce.pfs.models.CreateL2PolicyRequest;
import com.baidubce.pfs.models.CreateL2PolicyResponse;
import com.baidubce.pfs.models.CreatePfsRequest;
import com.baidubce.pfs.models.CreatePfsResponse;
import com.baidubce.pfs.models.DeleteFilesetRequest;
import com.baidubce.pfs.models.DeleteFilesetResponse;
import com.baidubce.pfs.models.DeleteL2BucketLinkRequest;
import com.baidubce.pfs.models.DeleteL2BucketLinkResponse;
import com.baidubce.pfs.models.DeleteL2PolicyRequest;
import com.baidubce.pfs.models.DeleteL2PolicyResponse;
import com.baidubce.pfs.models.DeletePfsRequest;
import com.baidubce.pfs.models.DescFilesetRequest;
import com.baidubce.pfs.models.DescFilesetResponse;
import com.baidubce.pfs.models.DescL2BucketLinkRequest;
import com.baidubce.pfs.models.DescL2BucketLinkResponse;
import com.baidubce.pfs.models.DescL2PolicyRequest;
import com.baidubce.pfs.models.DescL2PolicyResponse;
import com.baidubce.pfs.models.DescPfsRequest;
import com.baidubce.pfs.models.DescPfsResponse;
import com.baidubce.pfs.models.InstanceListClientsRequest;
import com.baidubce.pfs.models.InstanceListClientsResponse;
import com.baidubce.pfs.models.ListFilesetRequest;
import com.baidubce.pfs.models.ListFilesetResponse;
import com.baidubce.pfs.models.ListL2BucketLinkRequest;
import com.baidubce.pfs.models.ListL2BucketLinkResponse;
import com.baidubce.pfs.models.ListL2PolicyRequest;
import com.baidubce.pfs.models.ListL2PolicyResponse;
import com.baidubce.pfs.models.ListPfsRequest;
import com.baidubce.pfs.models.ListPfsResponse;
import com.baidubce.pfs.models.LstPerL2BktLnkExecLogRequest;
import com.baidubce.pfs.models.LstPerL2BktLnkExecLogResponse;
import com.baidubce.pfs.models.MountTargetListClientsRequest;
import com.baidubce.pfs.models.MountTargetListClientsResponse;
import com.baidubce.pfs.models.PauseL2BucketLinkRequest;
import com.baidubce.pfs.models.PauseL2BucketLinkResponse;
import com.baidubce.pfs.models.QryL2PolExecDetailRequest;
import com.baidubce.pfs.models.QryL2PolExecDetailResponse;
import com.baidubce.pfs.models.QryL2PolExecLogRequest;
import com.baidubce.pfs.models.QryL2PolExecLogResponse;
import com.baidubce.pfs.models.ResumeL2BucketLinkRequest;
import com.baidubce.pfs.models.ResumeL2BucketLinkResponse;
import com.baidubce.pfs.models.UpdPerL2BktLnkInfoRequest;
import com.baidubce.pfs.models.UpdPerL2BktLnkInfoResponse;
import com.baidubce.pfs.models.UpdateFilesetRequest;
import com.baidubce.pfs.models.UpdateFilesetResponse;
import com.baidubce.pfs.models.UpdateL2PolicyRequest;
import com.baidubce.pfs.models.UpdateL2PolicyResponse;
import com.baidubce.pfs.models.UpdatePFSTagRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for PfsClient
 */
public class PfsClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private PfsClient pfsClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        pfsClient = new PfsClient(config);
    }

    /**
     * cancelL2BucketLink
     *
     */
    @Test
    public void cancelL2BucketLinkTest() {
        CancelL2BucketLinkRequest cancelL2BucketLinkRequest = new CancelL2BucketLinkRequest();
        cancelL2BucketLinkRequest.setBucketLinkId("");
        cancelL2BucketLinkRequest.setInstanceId("");
        CancelL2BucketLinkResponse response = pfsClient.cancelL2BucketLink(cancelL2BucketLinkRequest);
        System.out.println(response);
    }
    /**
     * createFileset
     *
     */
    @Test
    public void createFilesetTest() {
        CreateFilesetRequest createFilesetRequest = new CreateFilesetRequest();
        createFilesetRequest.setInstanceId("");
        createFilesetRequest.setFilesetName("");
        createFilesetRequest.setFilesetPath("");
        createFilesetRequest.setBlockQuota(0);
        createFilesetRequest.setFilesQuota(0L);
        createFilesetRequest.setQpsLimit(0);
        createFilesetRequest.setBandwidthLimitMb(0);
        CreateFilesetResponse response = pfsClient.createFileset(createFilesetRequest);
        System.out.println(response);
    }
    /**
     * createL2BucketLink
     *
     */
    @Test
    public void createL2BucketLinkTest() {
        CreateL2BucketLinkRequest createL2BucketLinkRequest = new CreateL2BucketLinkRequest();
        createL2BucketLinkRequest.setInstanceId("");
        createL2BucketLinkRequest.setConflictPolicy("");
        createL2BucketLinkRequest.setBucketName("");
        createL2BucketLinkRequest.setBucketPrefix("");
        createL2BucketLinkRequest.setThroughputLimitBytes("");
        createL2BucketLinkRequest.setReportObjectName("");
        createL2BucketLinkRequest.setBucketLinkName("");
        createL2BucketLinkRequest.setTransferType(0);
        createL2BucketLinkRequest.setPfsPath("");
        createL2BucketLinkRequest.setCron("");
        createL2BucketLinkRequest.setBucketBelongUserId("");
        createL2BucketLinkRequest.setLccId("");
        createL2BucketLinkRequest.setScope(0);
        CreateL2BucketLinkResponse response = pfsClient.createL2BucketLink(createL2BucketLinkRequest);
        System.out.println(response);
    }
    /**
     * createL2Policy
     *
     */
    @Test
    public void createL2PolicyTest() {
        CreateL2PolicyRequest createL2PolicyRequest = new CreateL2PolicyRequest();
        createL2PolicyRequest.setInstanceId("");
        createL2PolicyRequest.setPolicyName("");
        createL2PolicyRequest.setPath("");
        createL2PolicyRequest.setExpiredTime(0);
        createL2PolicyRequest.setType(0);
        createL2PolicyRequest.setExecuteTime(0);
        createL2PolicyRequest.setBucketName("");
        createL2PolicyRequest.setBucketPrefix("");
        CreateL2PolicyResponse response = pfsClient.createL2Policy(createL2PolicyRequest);
        System.out.println(response);
    }
    /**
     * createPfs
     *
     */
    @Test
    public void createPfsTest() {
        CreatePfsRequest createPfsRequest = new CreatePfsRequest();
        createPfsRequest.setName("");
        createPfsRequest.setInstanceType("");
        createPfsRequest.setCapacity(0);
        createPfsRequest.setSubnetId("");
        createPfsRequest.setDescription("");
        createPfsRequest.setTags(new ArrayList<>());
        CreatePfsResponse response = pfsClient.createPfs(createPfsRequest);
        System.out.println(response);
    }
    /**
     * deleteFileset
     *
     */
    @Test
    public void deleteFilesetTest() {
        DeleteFilesetRequest deleteFilesetRequest = new DeleteFilesetRequest();
        deleteFilesetRequest.setInstanceId("");
        deleteFilesetRequest.setFilesetId("");
        DeleteFilesetResponse response = pfsClient.deleteFileset(deleteFilesetRequest);
        System.out.println(response);
    }
    /**
     * deleteL2BucketLink
     *
     */
    @Test
    public void deleteL2BucketLinkTest() {
        DeleteL2BucketLinkRequest deleteL2BucketLinkRequest = new DeleteL2BucketLinkRequest();
        deleteL2BucketLinkRequest.setInstanceId("");
        deleteL2BucketLinkRequest.setBucketLinkId("");
        DeleteL2BucketLinkResponse response = pfsClient.deleteL2BucketLink(deleteL2BucketLinkRequest);
        System.out.println(response);
    }
    /**
     * deleteL2Policy
     *
     */
    @Test
    public void deleteL2PolicyTest() {
        DeleteL2PolicyRequest deleteL2PolicyRequest = new DeleteL2PolicyRequest();
        deleteL2PolicyRequest.setInstanceId("");
        deleteL2PolicyRequest.setPolicyId("");
        DeleteL2PolicyResponse response = pfsClient.deleteL2Policy(deleteL2PolicyRequest);
        System.out.println(response);
    }
    /**
     * deletePfs
     *
     */
    @Test
    public void deletePfsTest() {
        DeletePfsRequest deletePfsRequest = new DeletePfsRequest();
        deletePfsRequest.setInstanceId("");
        pfsClient.deletePfs(deletePfsRequest);
    }
    /**
     * descFileset
     *
     */
    @Test
    public void descFilesetTest() {
        DescFilesetRequest descFilesetRequest = new DescFilesetRequest();
        descFilesetRequest.setInstanceId("");
        descFilesetRequest.setFilesetId("");
        DescFilesetResponse response = pfsClient.descFileset(descFilesetRequest);
        System.out.println(response);
    }
    /**
     * descL2BucketLink
     *
     */
    @Test
    public void descL2BucketLinkTest() {
        DescL2BucketLinkRequest descL2BucketLinkRequest = new DescL2BucketLinkRequest();
        descL2BucketLinkRequest.setInstanceId("");
        descL2BucketLinkRequest.setBucketLinkId("");
        DescL2BucketLinkResponse response = pfsClient.descL2BucketLink(descL2BucketLinkRequest);
        System.out.println(response);
    }
    /**
     * descL2Policy
     *
     */
    @Test
    public void descL2PolicyTest() {
        DescL2PolicyRequest descL2PolicyRequest = new DescL2PolicyRequest();
        descL2PolicyRequest.setInstanceId("");
        descL2PolicyRequest.setPolicyId("");
        DescL2PolicyResponse response = pfsClient.descL2Policy(descL2PolicyRequest);
        System.out.println(response);
    }
    /**
     * descPfs
     *
     */
    @Test
    public void descPfsTest() {
        DescPfsRequest descPfsRequest = new DescPfsRequest();
        descPfsRequest.setInstanceId("");
        DescPfsResponse response = pfsClient.descPfs(descPfsRequest);
        System.out.println(response);
    }
    /**
     * instanceListClients
     *
     */
    @Test
    public void instanceListClientsTest() {
        InstanceListClientsRequest instanceListClientsRequest = new InstanceListClientsRequest();
        instanceListClientsRequest.setInstanceId("");
        instanceListClientsRequest.setMaxKeys(0);
        instanceListClientsRequest.setManner("");
        instanceListClientsRequest.setMarker("");
        InstanceListClientsResponse response = pfsClient.instanceListClients(instanceListClientsRequest);
        System.out.println(response);
    }
    /**
     * listFileset
     *
     */
    @Test
    public void listFilesetTest() {
        ListFilesetRequest listFilesetRequest = new ListFilesetRequest();
        listFilesetRequest.setInstanceId("");
        listFilesetRequest.setFilesetId("");
        listFilesetRequest.setFilesetName("");
        listFilesetRequest.setManner("");
        listFilesetRequest.setOrder("");
        listFilesetRequest.setOrderBy("");
        listFilesetRequest.setPageNo(0);
        listFilesetRequest.setPageSize(0);
        ListFilesetResponse response = pfsClient.listFileset(listFilesetRequest);
        System.out.println(response);
    }
    /**
     * listL2BucketLink
     *
     */
    @Test
    public void listL2BucketLinkTest() {
        ListL2BucketLinkRequest listL2BucketLinkRequest = new ListL2BucketLinkRequest();
        listL2BucketLinkRequest.setInstanceId("");
        listL2BucketLinkRequest.setMaxKeys(0);
        listL2BucketLinkRequest.setManner("");
        listL2BucketLinkRequest.setMarker("");
        ListL2BucketLinkResponse response = pfsClient.listL2BucketLink(listL2BucketLinkRequest);
        System.out.println(response);
    }
    /**
     * listL2Policy
     *
     */
    @Test
    public void listL2PolicyTest() {
        ListL2PolicyRequest listL2PolicyRequest = new ListL2PolicyRequest();
        listL2PolicyRequest.setInstanceId("");
        listL2PolicyRequest.setMaxKeys(0);
        listL2PolicyRequest.setMarker("");
        ListL2PolicyResponse response = pfsClient.listL2Policy(listL2PolicyRequest);
        System.out.println(response);
    }
    /**
     * listPfs
     *
     */
    @Test
    public void listPfsTest() {
        ListPfsRequest listPfsRequest = new ListPfsRequest();
        listPfsRequest.setMaxKeys(0);
        listPfsRequest.setMarker("");
        listPfsRequest.setFilterTag("");
        ListPfsResponse response = pfsClient.listPfs(listPfsRequest);
        System.out.println(response);
    }
    /**
     * lstPerL2BktLnkExecLog
     *
     */
    @Test
    public void lstPerL2BktLnkExecLogTest() {
        LstPerL2BktLnkExecLogRequest lstPerL2BktLnkExecLogRequest = new LstPerL2BktLnkExecLogRequest();
        lstPerL2BktLnkExecLogRequest.setInstanceId("");
        lstPerL2BktLnkExecLogRequest.setBucketLinkId("");
        lstPerL2BktLnkExecLogRequest.setStartTime(0);
        lstPerL2BktLnkExecLogRequest.setEndTime(0);
        LstPerL2BktLnkExecLogResponse response = pfsClient.lstPerL2BktLnkExecLog(lstPerL2BktLnkExecLogRequest);
        System.out.println(response);
    }
    /**
     * mountTargetListClients
     *
     */
    @Test
    public void mountTargetListClientsTest() {
        MountTargetListClientsRequest mountTargetListClientsRequest = new MountTargetListClientsRequest();
        mountTargetListClientsRequest.setMountTargetId("");
        mountTargetListClientsRequest.setMaxKeys(0);
        mountTargetListClientsRequest.setManner("");
        mountTargetListClientsRequest.setMarker("");
        MountTargetListClientsResponse response = pfsClient.mountTargetListClients(mountTargetListClientsRequest);
        System.out.println(response);
    }
    /**
     * pauseL2BucketLink
     *
     */
    @Test
    public void pauseL2BucketLinkTest() {
        PauseL2BucketLinkRequest pauseL2BucketLinkRequest = new PauseL2BucketLinkRequest();
        pauseL2BucketLinkRequest.setInstanceId("");
        pauseL2BucketLinkRequest.setBucketLinkId("");
        PauseL2BucketLinkResponse response = pfsClient.pauseL2BucketLink(pauseL2BucketLinkRequest);
        System.out.println(response);
    }
    /**
     * qryL2PolExecDetail
     *
     */
    @Test
    public void qryL2PolExecDetailTest() {
        QryL2PolExecDetailRequest qryL2PolExecDetailRequest = new QryL2PolExecDetailRequest();
        qryL2PolExecDetailRequest.setInstanceId("");
        qryL2PolExecDetailRequest.setPolicyId("");
        qryL2PolExecDetailRequest.setJobId("");
        QryL2PolExecDetailResponse response = pfsClient.qryL2PolExecDetail(qryL2PolExecDetailRequest);
        System.out.println(response);
    }
    /**
     * qryL2PolExecLog
     *
     */
    @Test
    public void qryL2PolExecLogTest() {
        QryL2PolExecLogRequest qryL2PolExecLogRequest = new QryL2PolExecLogRequest();
        qryL2PolExecLogRequest.setInstanceId("");
        qryL2PolExecLogRequest.setPolicyId("");
        qryL2PolExecLogRequest.setStartTime(0);
        qryL2PolExecLogRequest.setEndTime(0);
        QryL2PolExecLogResponse response = pfsClient.qryL2PolExecLog(qryL2PolExecLogRequest);
        System.out.println(response);
    }
    /**
     * resumeL2BucketLink
     *
     */
    @Test
    public void resumeL2BucketLinkTest() {
        ResumeL2BucketLinkRequest resumeL2BucketLinkRequest = new ResumeL2BucketLinkRequest();
        resumeL2BucketLinkRequest.setInstanceId("");
        resumeL2BucketLinkRequest.setBucketLinkId("");
        ResumeL2BucketLinkResponse response = pfsClient.resumeL2BucketLink(resumeL2BucketLinkRequest);
        System.out.println(response);
    }
    /**
     * updPerL2BktLnkInfo
     *
     */
    @Test
    public void updPerL2BktLnkInfoTest() {
        UpdPerL2BktLnkInfoRequest updPerL2BktLnkInfoRequest = new UpdPerL2BktLnkInfoRequest();
        updPerL2BktLnkInfoRequest.setInstanceId("");
        updPerL2BktLnkInfoRequest.setBucketLinkId("");
        updPerL2BktLnkInfoRequest.setNewCron("");
        updPerL2BktLnkInfoRequest.setNewBucketLinkName("");
        updPerL2BktLnkInfoRequest.setNewConflictPolicy(0);
        updPerL2BktLnkInfoRequest.setNewThroughputLimitBytes(0);
        updPerL2BktLnkInfoRequest.setNewScope(0);
        UpdPerL2BktLnkInfoResponse response = pfsClient.updPerL2BktLnkInfo(updPerL2BktLnkInfoRequest);
        System.out.println(response);
    }
    /**
     * updateFileset
     *
     */
    @Test
    public void updateFilesetTest() {
        UpdateFilesetRequest updateFilesetRequest = new UpdateFilesetRequest();
        updateFilesetRequest.setInstanceId("");
        updateFilesetRequest.setFilesetId("");
        updateFilesetRequest.setFilesetName("");
        updateFilesetRequest.setBlockQuota(0);
        updateFilesetRequest.setFilesQuota(0L);
        updateFilesetRequest.setQpsLimit(0);
        updateFilesetRequest.setBandwidthLimitMb(0);
        UpdateFilesetResponse response = pfsClient.updateFileset(updateFilesetRequest);
        System.out.println(response);
    }
    /**
     * updateL2Policy
     *
     */
    @Test
    public void updateL2PolicyTest() {
        UpdateL2PolicyRequest updateL2PolicyRequest = new UpdateL2PolicyRequest();
        updateL2PolicyRequest.setInstanceId("");
        updateL2PolicyRequest.setPolicyId("");
        updateL2PolicyRequest.setNewPolicyName("");
        updateL2PolicyRequest.setExpiredTime(0);
        updateL2PolicyRequest.setExecuteTime(0);
        updateL2PolicyRequest.setBucketName("");
        updateL2PolicyRequest.setBucketPrefix("");
        UpdateL2PolicyResponse response = pfsClient.updateL2Policy(updateL2PolicyRequest);
        System.out.println(response);
    }
    /**
     * updatePFSTag
     *
     */
    @Test
    public void updatePFSTagTest() {
        UpdatePFSTagRequest updatePFSTagRequest = new UpdatePFSTagRequest();
        updatePFSTagRequest.setInstanceId(new ArrayList<>());
        updatePFSTagRequest.setTags(new ArrayList<>());
        pfsClient.updatePFSTag(updatePFSTagRequest);
    }
}
