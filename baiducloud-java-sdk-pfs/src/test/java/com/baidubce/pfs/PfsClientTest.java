package com.baidubce.pfs;

import com.baidubce.pfs.models.CreateFilesetRequest;
import com.baidubce.pfs.models.CreateFilesetResponse;
import com.baidubce.pfs.models.CreatePfsRequest;
import com.baidubce.pfs.models.CreatePfsResponse;
import com.baidubce.pfs.models.DeleteFilesetRequest;
import com.baidubce.pfs.models.DeleteFilesetResponse;
import com.baidubce.pfs.models.DeletePfsRequest;
import com.baidubce.pfs.models.DescFilesetRequest;
import com.baidubce.pfs.models.DescFilesetResponse;
import com.baidubce.pfs.models.DescPfsRequest;
import com.baidubce.pfs.models.DescPfsResponse;
import com.baidubce.pfs.models.InstanceListClientsRequest;
import com.baidubce.pfs.models.InstanceListClientsResponse;
import com.baidubce.pfs.models.ListFilesetRequest;
import com.baidubce.pfs.models.ListFilesetResponse;
import com.baidubce.pfs.models.ListPfsRequest;
import com.baidubce.pfs.models.ListPfsResponse;
import com.baidubce.pfs.models.MountTargetListClientsRequest;
import com.baidubce.pfs.models.MountTargetListClientsResponse;
import com.baidubce.pfs.models.UpdateFilesetRequest;
import com.baidubce.pfs.models.UpdateFilesetResponse;
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
