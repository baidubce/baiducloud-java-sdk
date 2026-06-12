package com.baidubce.aihc;

import com.baidubce.aihc.models.CreateDatasetRequest;
import com.baidubce.aihc.models.CreateDatasetResponse;
import com.baidubce.aihc.models.CreateDatasetVersionRequest;
import com.baidubce.aihc.models.CreateDatasetVersionResponse;
import com.baidubce.aihc.models.CreateModelRequest;
import com.baidubce.aihc.models.CreateModelResponse;
import com.baidubce.aihc.models.CreateModelVersionRequest;
import com.baidubce.aihc.models.CreateModelVersionResponse;
import com.baidubce.aihc.models.DescribeDatasetResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionsResponse;
import com.baidubce.aihc.models.DescribeDatasetsResponse;
import com.baidubce.aihc.models.DescribeModelResponse;
import com.baidubce.aihc.models.DescribeModelVersionResponse;
import com.baidubce.aihc.models.DescribeModelVersionsResponse;
import com.baidubce.aihc.models.DescribeModelsResponse;
import com.baidubce.aihc.models.ModifyDatasetRequest;
import com.baidubce.aihc.models.ModifyModelRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for AihcClient
 */
public class AihcClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private AihcClient aihcClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        aihcClient = new AihcClient(config);
    }

    /**
     * createDataset
     *
     */
    @Test
    public void createDatasetTest() {
        CreateDatasetRequest createDatasetRequest = new CreateDatasetRequest();
        createDatasetRequest.setName("");
        createDatasetRequest.setStorageType("");
        createDatasetRequest.setStorageInstance("");
        createDatasetRequest.setImportFormat("");
        createDatasetRequest.setDescription("");
        createDatasetRequest.setOwner("");
        createDatasetRequest.setVisibilityScope("");
        createDatasetRequest.setVisibilityUser(new ArrayList<>());
        createDatasetRequest.setVisibilityGroup(new ArrayList<>());
        createDatasetRequest.setInitVersionEntry(null);
        CreateDatasetResponse response = aihcClient.createDataset(createDatasetRequest);
        System.out.println(response);
    }
    /**
     * createDatasetVersion
     *
     */
    @Test
    public void createDatasetVersionTest() {
        CreateDatasetVersionRequest createDatasetVersionRequest = new CreateDatasetVersionRequest();
        createDatasetVersionRequest.setDescription("");
        createDatasetVersionRequest.setStoragePath("");
        createDatasetVersionRequest.setMountPath("");
        CreateDatasetVersionResponse response = aihcClient.createDatasetVersion(createDatasetVersionRequest);
        System.out.println(response);
    }
    /**
     * createModel
     *
     */
    @Test
    public void createModelTest() {
        CreateModelRequest createModelRequest = new CreateModelRequest();
        createModelRequest.setName("");
        createModelRequest.setDescription("");
        createModelRequest.setModelFormat("");
        createModelRequest.setOwner("");
        createModelRequest.setVisibilityScope("");
        createModelRequest.setInitVersionEntry(null);
        CreateModelResponse response = aihcClient.createModel(createModelRequest);
        System.out.println(response);
    }
    /**
     * createModelVersion
     *
     */
    @Test
    public void createModelVersionTest() {
        CreateModelVersionRequest createModelVersionRequest = new CreateModelVersionRequest();
        createModelVersionRequest.setStorageBucket("");
        createModelVersionRequest.setStoragePath("");
        createModelVersionRequest.setDescription("");
        createModelVersionRequest.setSource("");
        createModelVersionRequest.setModelMetrics("");
        CreateModelVersionResponse response = aihcClient.createModelVersion(createModelVersionRequest);
        System.out.println(response);
    }
    /**
     * deleteDataset
     *
     */
    @Test
    public void deleteDatasetTest() {
        aihcClient.deleteDataset();
    }
    /**
     * deleteDatasetVersion
     *
     */
    @Test
    public void deleteDatasetVersionTest() {
        aihcClient.deleteDatasetVersion();
    }
    /**
     * deleteModel
     *
     */
    @Test
    public void deleteModelTest() {
        aihcClient.deleteModel();
    }
    /**
     * deleteModelVersion
     *
     */
    @Test
    public void deleteModelVersionTest() {
        aihcClient.deleteModelVersion();
    }
    /**
     * describeDataset
     *
     */
    @Test
    public void describeDatasetTest() {
        DescribeDatasetResponse response = aihcClient.describeDataset();
        System.out.println(response);
    }
    /**
     * describeDatasetVersion
     *
     */
    @Test
    public void describeDatasetVersionTest() {
        DescribeDatasetVersionResponse response = aihcClient.describeDatasetVersion();
        System.out.println(response);
    }
    /**
     * describeDatasetVersions
     *
     */
    @Test
    public void describeDatasetVersionsTest() {
        DescribeDatasetVersionsResponse response = aihcClient.describeDatasetVersions();
        System.out.println(response);
    }
    /**
     * describeDatasets
     *
     */
    @Test
    public void describeDatasetsTest() {
        DescribeDatasetsResponse response = aihcClient.describeDatasets();
        System.out.println(response);
    }
    /**
     * describeModel
     *
     */
    @Test
    public void describeModelTest() {
        DescribeModelResponse response = aihcClient.describeModel();
        System.out.println(response);
    }
    /**
     * describeModelVersion
     *
     */
    @Test
    public void describeModelVersionTest() {
        DescribeModelVersionResponse response = aihcClient.describeModelVersion();
        System.out.println(response);
    }
    /**
     * describeModelVersions
     *
     */
    @Test
    public void describeModelVersionsTest() {
        DescribeModelVersionsResponse response = aihcClient.describeModelVersions();
        System.out.println(response);
    }
    /**
     * describeModels
     *
     */
    @Test
    public void describeModelsTest() {
        DescribeModelsResponse response = aihcClient.describeModels();
        System.out.println(response);
    }
    /**
     * modifyDataset
     *
     */
    @Test
    public void modifyDatasetTest() {
        ModifyDatasetRequest modifyDatasetRequest = new ModifyDatasetRequest();
        modifyDatasetRequest.setName("");
        modifyDatasetRequest.setDescription("");
        modifyDatasetRequest.setVisibilityScope("");
        modifyDatasetRequest.setVisibilityUser(new ArrayList<>());
        modifyDatasetRequest.setVisibilityGroup(new ArrayList<>());
        aihcClient.modifyDataset(modifyDatasetRequest);
    }
    /**
     * modifyModel
     *
     */
    @Test
    public void modifyModelTest() {
        ModifyModelRequest modifyModelRequest = new ModifyModelRequest();
        modifyModelRequest.setName("");
        modifyModelRequest.setDescription("");
        aihcClient.modifyModel(modifyModelRequest);
    }
}
