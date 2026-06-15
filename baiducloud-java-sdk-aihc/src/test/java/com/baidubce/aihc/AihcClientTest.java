package com.baidubce.aihc;

import com.baidubce.aihc.models.CreateDatasetRequest;
import com.baidubce.aihc.models.CreateDatasetResponse;
import com.baidubce.aihc.models.CreateDatasetVersionRequest;
import com.baidubce.aihc.models.CreateDatasetVersionResponse;
import com.baidubce.aihc.models.CreateModelRequest;
import com.baidubce.aihc.models.CreateModelResponse;
import com.baidubce.aihc.models.CreateModelVersionRequest;
import com.baidubce.aihc.models.CreateModelVersionResponse;
import com.baidubce.aihc.models.DeleteDatasetRequest;
import com.baidubce.aihc.models.DeleteDatasetVersionRequest;
import com.baidubce.aihc.models.DeleteModelRequest;
import com.baidubce.aihc.models.DeleteModelVersionRequest;
import com.baidubce.aihc.models.DescribeDatasetRequest;
import com.baidubce.aihc.models.DescribeDatasetResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionRequest;
import com.baidubce.aihc.models.DescribeDatasetVersionResponse;
import com.baidubce.aihc.models.DescribeDatasetVersionsRequest;
import com.baidubce.aihc.models.DescribeDatasetVersionsResponse;
import com.baidubce.aihc.models.DescribeDatasetsRequest;
import com.baidubce.aihc.models.DescribeDatasetsResponse;
import com.baidubce.aihc.models.DescribeModelRequest;
import com.baidubce.aihc.models.DescribeModelResponse;
import com.baidubce.aihc.models.DescribeModelVersionRequest;
import com.baidubce.aihc.models.DescribeModelVersionResponse;
import com.baidubce.aihc.models.DescribeModelVersionsRequest;
import com.baidubce.aihc.models.DescribeModelVersionsResponse;
import com.baidubce.aihc.models.DescribeModelsRequest;
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
        createDatasetVersionRequest.setDatasetId("");
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
        createModelVersionRequest.setModelId("");
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
        DeleteDatasetRequest deleteDatasetRequest = new DeleteDatasetRequest();
        deleteDatasetRequest.setDatasetId("");
        aihcClient.deleteDataset(deleteDatasetRequest);
    }
    /**
     * deleteDatasetVersion
     *
     */
    @Test
    public void deleteDatasetVersionTest() {
        DeleteDatasetVersionRequest deleteDatasetVersionRequest = new DeleteDatasetVersionRequest();
        deleteDatasetVersionRequest.setDatasetId("");
        deleteDatasetVersionRequest.setVersionId("");
        aihcClient.deleteDatasetVersion(deleteDatasetVersionRequest);
    }
    /**
     * deleteModel
     *
     */
    @Test
    public void deleteModelTest() {
        DeleteModelRequest deleteModelRequest = new DeleteModelRequest();
        deleteModelRequest.setModelId("");
        aihcClient.deleteModel(deleteModelRequest);
    }
    /**
     * deleteModelVersion
     *
     */
    @Test
    public void deleteModelVersionTest() {
        DeleteModelVersionRequest deleteModelVersionRequest = new DeleteModelVersionRequest();
        deleteModelVersionRequest.setModelId("");
        deleteModelVersionRequest.setVersionId("");
        aihcClient.deleteModelVersion(deleteModelVersionRequest);
    }
    /**
     * describeDataset
     *
     */
    @Test
    public void describeDatasetTest() {
        DescribeDatasetRequest describeDatasetRequest = new DescribeDatasetRequest();
        describeDatasetRequest.setDatasetId("");
        DescribeDatasetResponse response = aihcClient.describeDataset(describeDatasetRequest);
        System.out.println(response);
    }
    /**
     * describeDatasetVersion
     *
     */
    @Test
    public void describeDatasetVersionTest() {
        DescribeDatasetVersionRequest describeDatasetVersionRequest = new DescribeDatasetVersionRequest();
        describeDatasetVersionRequest.setDatasetId("");
        describeDatasetVersionRequest.setVersionId("");
        DescribeDatasetVersionResponse response = aihcClient.describeDatasetVersion(describeDatasetVersionRequest);
        System.out.println(response);
    }
    /**
     * describeDatasetVersions
     *
     */
    @Test
    public void describeDatasetVersionsTest() {
        DescribeDatasetVersionsRequest describeDatasetVersionsRequest = new DescribeDatasetVersionsRequest();
        describeDatasetVersionsRequest.setDatasetId("");
        describeDatasetVersionsRequest.setPageNumber(0);
        describeDatasetVersionsRequest.setPageSize(0);
        DescribeDatasetVersionsResponse response = aihcClient.describeDatasetVersions(describeDatasetVersionsRequest);
        System.out.println(response);
    }
    /**
     * describeDatasets
     *
     */
    @Test
    public void describeDatasetsTest() {
        DescribeDatasetsRequest describeDatasetsRequest = new DescribeDatasetsRequest();
        describeDatasetsRequest.setKeyword("");
        describeDatasetsRequest.setStorageType("");
        describeDatasetsRequest.setStorageInstances("");
        describeDatasetsRequest.setImportFormat("");
        describeDatasetsRequest.setPageNumber(0);
        describeDatasetsRequest.setPageSize(0);
        DescribeDatasetsResponse response = aihcClient.describeDatasets(describeDatasetsRequest);
        System.out.println(response);
    }
    /**
     * describeModel
     *
     */
    @Test
    public void describeModelTest() {
        DescribeModelRequest describeModelRequest = new DescribeModelRequest();
        describeModelRequest.setModelId("");
        DescribeModelResponse response = aihcClient.describeModel(describeModelRequest);
        System.out.println(response);
    }
    /**
     * describeModelVersion
     *
     */
    @Test
    public void describeModelVersionTest() {
        DescribeModelVersionRequest describeModelVersionRequest = new DescribeModelVersionRequest();
        describeModelVersionRequest.setModelId("");
        describeModelVersionRequest.setVersionId("");
        DescribeModelVersionResponse response = aihcClient.describeModelVersion(describeModelVersionRequest);
        System.out.println(response);
    }
    /**
     * describeModelVersions
     *
     */
    @Test
    public void describeModelVersionsTest() {
        DescribeModelVersionsRequest describeModelVersionsRequest = new DescribeModelVersionsRequest();
        describeModelVersionsRequest.setModelId("");
        describeModelVersionsRequest.setPageNumber(0);
        describeModelVersionsRequest.setPageSize(0);
        DescribeModelVersionsResponse response = aihcClient.describeModelVersions(describeModelVersionsRequest);
        System.out.println(response);
    }
    /**
     * describeModels
     *
     */
    @Test
    public void describeModelsTest() {
        DescribeModelsRequest describeModelsRequest = new DescribeModelsRequest();
        describeModelsRequest.setKeyword("");
        describeModelsRequest.setPageNumber(0);
        describeModelsRequest.setPageSize(0);
        DescribeModelsResponse response = aihcClient.describeModels(describeModelsRequest);
        System.out.println(response);
    }
    /**
     * modifyDataset
     *
     */
    @Test
    public void modifyDatasetTest() {
        ModifyDatasetRequest modifyDatasetRequest = new ModifyDatasetRequest();
        modifyDatasetRequest.setDatasetId("");
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
        modifyModelRequest.setModelId("");
        modifyModelRequest.setName("");
        modifyModelRequest.setDescription("");
        aihcClient.modifyModel(modifyModelRequest);
    }
}
