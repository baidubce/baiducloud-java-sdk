package com.baidubce.aihc;

import com.baidubce.aihc.models.CreateADatasetV2Request;
import com.baidubce.aihc.models.CreateADatasetV2Response;
import com.baidubce.aihc.models.CreateAModelV2Request;
import com.baidubce.aihc.models.CreateAModelV2Response;
import com.baidubce.aihc.models.CreateDatasetVersionV2Request;
import com.baidubce.aihc.models.CreateDatasetVersionV2Response;
import com.baidubce.aihc.models.GetAListOfModelVersionsV2Response;
import com.baidubce.aihc.models.GetDatasetDetailsV2Response;
import com.baidubce.aihc.models.GetDatasetVersionDetailsV2Response;
import com.baidubce.aihc.models.GetModelDetailsV2Response;
import com.baidubce.aihc.models.GetModelListV2Response;
import com.baidubce.aihc.models.GetModelVersionDetailsV2Response;
import com.baidubce.aihc.models.ModifyDatasetV2Request;
import com.baidubce.aihc.models.ModifyTheModelV2Request;
import com.baidubce.aihc.models.NewModelVersionV2Request;
import com.baidubce.aihc.models.NewModelVersionV2Response;
import com.baidubce.aihc.models.RetrieveTheDatasetListV2Response;
import com.baidubce.aihc.models.RetrieveTheDatasetVersionListV2Response;
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
     * createADatasetV2
     *
     */
    @Test
    public void createADatasetV2Test() {
        CreateADatasetV2Request createADatasetV2Request = new CreateADatasetV2Request();
        createADatasetV2Request.setName("");
        createADatasetV2Request.setStorageType("");
        createADatasetV2Request.setStorageInstance("");
        createADatasetV2Request.setImportFormat("");
        createADatasetV2Request.setDescription("");
        createADatasetV2Request.setOwner("");
        createADatasetV2Request.setVisibilityScope("");
        createADatasetV2Request.setVisibilityUser(new ArrayList<>());
        createADatasetV2Request.setVisibilityGroup(new ArrayList<>());
        createADatasetV2Request.setInitVersionEntry(null);
        CreateADatasetV2Response response = aihcClient.createADatasetV2(createADatasetV2Request);
        System.out.println(response);
    }
    /**
     * createAModelV2
     *
     */
    @Test
    public void createAModelV2Test() {
        CreateAModelV2Request createAModelV2Request = new CreateAModelV2Request();
        createAModelV2Request.setName("");
        createAModelV2Request.setDescription("");
        createAModelV2Request.setModelFormat("");
        createAModelV2Request.setOwner("");
        createAModelV2Request.setVisibilityScope("");
        createAModelV2Request.setInitVersionEntry(null);
        CreateAModelV2Response response = aihcClient.createAModelV2(createAModelV2Request);
        System.out.println(response);
    }
    /**
     * createDatasetVersionV2
     *
     */
    @Test
    public void createDatasetVersionV2Test() {
        CreateDatasetVersionV2Request createDatasetVersionV2Request = new CreateDatasetVersionV2Request();
        createDatasetVersionV2Request.setDescription("");
        createDatasetVersionV2Request.setStoragePath("");
        createDatasetVersionV2Request.setMountPath("");
        CreateDatasetVersionV2Response response = aihcClient.createDatasetVersionV2(createDatasetVersionV2Request);
        System.out.println(response);
    }
    /**
     * deleteDatasetV2
     *
     */
    @Test
    public void deleteDatasetV2Test() {
        aihcClient.deleteDatasetV2();
    }
    /**
     * deleteDatasetVersionV2
     *
     */
    @Test
    public void deleteDatasetVersionV2Test() {
        aihcClient.deleteDatasetVersionV2();
    }
    /**
     * deleteModelV2
     *
     */
    @Test
    public void deleteModelV2Test() {
        aihcClient.deleteModelV2();
    }
    /**
     * deleteModelVersionV2
     *
     */
    @Test
    public void deleteModelVersionV2Test() {
        aihcClient.deleteModelVersionV2();
    }
    /**
     * getAListOfModelVersionsV2
     *
     */
    @Test
    public void getAListOfModelVersionsV2Test() {
        GetAListOfModelVersionsV2Response response = aihcClient.getAListOfModelVersionsV2();
        System.out.println(response);
    }
    /**
     * getDatasetDetailsV2
     *
     */
    @Test
    public void getDatasetDetailsV2Test() {
        GetDatasetDetailsV2Response response = aihcClient.getDatasetDetailsV2();
        System.out.println(response);
    }
    /**
     * getDatasetVersionDetailsV2
     *
     */
    @Test
    public void getDatasetVersionDetailsV2Test() {
        GetDatasetVersionDetailsV2Response response = aihcClient.getDatasetVersionDetailsV2();
        System.out.println(response);
    }
    /**
     * getModelDetailsV2
     *
     */
    @Test
    public void getModelDetailsV2Test() {
        GetModelDetailsV2Response response = aihcClient.getModelDetailsV2();
        System.out.println(response);
    }
    /**
     * getModelListV2
     *
     */
    @Test
    public void getModelListV2Test() {
        GetModelListV2Response response = aihcClient.getModelListV2();
        System.out.println(response);
    }
    /**
     * getModelVersionDetailsV2
     *
     */
    @Test
    public void getModelVersionDetailsV2Test() {
        GetModelVersionDetailsV2Response response = aihcClient.getModelVersionDetailsV2();
        System.out.println(response);
    }
    /**
     * modifyDatasetV2
     *
     */
    @Test
    public void modifyDatasetV2Test() {
        ModifyDatasetV2Request modifyDatasetV2Request = new ModifyDatasetV2Request();
        modifyDatasetV2Request.setName("");
        modifyDatasetV2Request.setDescription("");
        modifyDatasetV2Request.setVisibilityScope("");
        modifyDatasetV2Request.setVisibilityUser(new ArrayList<>());
        modifyDatasetV2Request.setVisibilityGroup(new ArrayList<>());
        aihcClient.modifyDatasetV2(modifyDatasetV2Request);
    }
    /**
     * modifyTheModelV2
     *
     */
    @Test
    public void modifyTheModelV2Test() {
        ModifyTheModelV2Request modifyTheModelV2Request = new ModifyTheModelV2Request();
        modifyTheModelV2Request.setName("");
        modifyTheModelV2Request.setDescription("");
        aihcClient.modifyTheModelV2(modifyTheModelV2Request);
    }
    /**
     * newModelVersionV2
     *
     */
    @Test
    public void newModelVersionV2Test() {
        NewModelVersionV2Request newModelVersionV2Request = new NewModelVersionV2Request();
        newModelVersionV2Request.setStorageBucket("");
        newModelVersionV2Request.setStoragePath("");
        newModelVersionV2Request.setDescription("");
        newModelVersionV2Request.setSource("");
        newModelVersionV2Request.setModelMetrics("");
        NewModelVersionV2Response response = aihcClient.newModelVersionV2(newModelVersionV2Request);
        System.out.println(response);
    }
    /**
     * retrieveTheDatasetListV2
     *
     */
    @Test
    public void retrieveTheDatasetListV2Test() {
        RetrieveTheDatasetListV2Response response = aihcClient.retrieveTheDatasetListV2();
        System.out.println(response);
    }
    /**
     * retrieveTheDatasetVersionListV2
     *
     */
    @Test
    public void retrieveTheDatasetVersionListV2Test() {
        RetrieveTheDatasetVersionListV2Response response = aihcClient.retrieveTheDatasetVersionListV2();
        System.out.println(response);
    }
}
