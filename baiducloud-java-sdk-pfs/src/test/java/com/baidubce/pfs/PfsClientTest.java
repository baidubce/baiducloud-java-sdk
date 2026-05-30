package com.baidubce.pfs;

import com.baidubce.pfs.models.CreatePfsRequest;
import com.baidubce.pfs.models.CreatePfsResponse;
import com.baidubce.pfs.models.DeletePfsRequest;
import com.baidubce.pfs.models.DescPfsRequest;
import com.baidubce.pfs.models.DescPfsResponse;
import com.baidubce.pfs.models.ListPfsRequest;
import com.baidubce.pfs.models.ListPfsResponse;
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
