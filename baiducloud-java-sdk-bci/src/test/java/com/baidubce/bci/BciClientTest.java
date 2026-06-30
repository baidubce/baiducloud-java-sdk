package com.baidubce.bci;

import com.baidubce.bci.models.Batch-delete-image-cachesRequest;
import com.baidubce.bci.models.Batch-delete-instancesRequest;
import com.baidubce.bci.models.BatchDeleteImageCachesBodyRequest;
import com.baidubce.bci.models.BatchDeleteImageCachesRequest;
import com.baidubce.bci.models.BatchDeleteInstancesBodyRequest;
import com.baidubce.bci.models.BatchDeleteInstancesRequest;
import com.baidubce.bci.models.Create-image-cacheRequest;
import com.baidubce.bci.models.Create-instanceRequest;
import com.baidubce.bci.models.CreateImageCacheBodyRequest;
import com.baidubce.bci.models.CreateImageCacheRequest;
import com.baidubce.bci.models.CreateImageCacheResponse;
import com.baidubce.bci.models.CreateInstanceBodyRequest;
import com.baidubce.bci.models.CreateInstanceRequest;
import com.baidubce.bci.models.CreateInstanceResponse;
import com.baidubce.bci.models.Delete-instanceRequest;
import com.baidubce.bci.models.Get-instanceRequest;
import com.baidubce.bci.models.GetInstanceResponse;
import com.baidubce.bci.models.List-image-cachesRequest;
import com.baidubce.bci.models.List-instancesRequest;
import com.baidubce.bci.models.ListImageCachesResponse;
import com.baidubce.bci.models.ListInstancesResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for BciClient
 */
public class BciClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private BciClient bciClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        bciClient = new BciClient(config);
    }

    /**
     * batch-delete-image-caches
     *
     */
    @Test
    public void batchDeleteImageCachesTest() {
        BatchDeleteImageCachesRequest batchDeleteImageCachesRequest = new BatchDeleteImageCachesRequest();
        batchDeleteImageCachesRequest.setImageCacheIds(new ArrayList<>());
        bciClient.batchDeleteImageCaches(batchDeleteImageCachesRequest);
    }
    /**
     * batch-delete-instances
     *
     */
    @Test
    public void batchDeleteInstancesTest() {
        BatchDeleteInstancesRequest batchDeleteInstancesRequest = new BatchDeleteInstancesRequest();
        batchDeleteInstancesRequest.setInstanceIds(new ArrayList<>());
        batchDeleteInstancesRequest.setRelatedReleaseFlag(false);
        bciClient.batchDeleteInstances(batchDeleteInstancesRequest);
    }
    /**
     * create-image-cache
     *
     */
    @Test
    public void createImageCacheTest() {
        CreateImageCacheRequest createImageCacheRequest = new CreateImageCacheRequest();
        createImageCacheRequest.setImageCacheName("");
        createImageCacheRequest.setOriginImages(new ArrayList<>());
        createImageCacheRequest.setSubnetId("");
        createImageCacheRequest.setSecurityGroupId("");
        createImageCacheRequest.setZoneName("");
        createImageCacheRequest.setTemporaryStorageSize(0);
        createImageCacheRequest.setNeedEip(false);
        createImageCacheRequest.setEipIp("");
        createImageCacheRequest.setAutoMatchImageCache(false);
        createImageCacheRequest.setImageRegistrySecrets(new ArrayList<>());
        CreateImageCacheResponse response = bciClient.createImageCache(createImageCacheRequest);
        System.out.println(response);
    }
    /**
     * create-instance
     *
     */
    @Test
    public void createInstanceTest() {
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest();
        createInstanceRequest.setClientToken("");
        createInstanceRequest.setName("");
        createInstanceRequest.setZoneName("");
        createInstanceRequest.setSecurityGroupIds(new ArrayList<>());
        createInstanceRequest.setSubnetIds(new ArrayList<>());
        createInstanceRequest.setRestartPolicy("");
        createInstanceRequest.setEipIp("");
        createInstanceRequest.setAutoCreateEip(false);
        createInstanceRequest.setEipName("");
        createInstanceRequest.setEipRouteType("");
        createInstanceRequest.setEipBandwidthInMbps(0);
        createInstanceRequest.setEipBillingMethod("");
        createInstanceRequest.setGpuType("");
        createInstanceRequest.setTerminationGracePeriodSeconds(0L);
        createInstanceRequest.setHostName("");
        createInstanceRequest.setTags(new ArrayList<>());
        createInstanceRequest.setImageRegistryCredentials(new ArrayList<>());
        createInstanceRequest.setContainers(new ArrayList<>());
        createInstanceRequest.setInitContainers(new ArrayList<>());
        createInstanceRequest.setVolume(null);
        CreateInstanceResponse response = bciClient.createInstance(createInstanceRequest);
        System.out.println(response);
    }
    /**
     * delete-instance
     *
     */
    @Test
    public void deleteInstanceTest() {
        DeleteInstanceRequest deleteInstanceRequest = new DeleteInstanceRequest();
        deleteInstanceRequest.setInstanceId("");
        deleteInstanceRequest.setRelatedReleaseFlag(false);
        bciClient.deleteInstance(deleteInstanceRequest);
    }
    /**
     * get-instance
     *
     */
    @Test
    public void getInstanceTest() {
        GetInstanceRequest getInstanceRequest = new GetInstanceRequest();
        getInstanceRequest.setInstanceId("");
        GetInstanceResponse response = bciClient.getInstance(getInstanceRequest);
        System.out.println(response);
    }
    /**
     * list-image-caches
     *
     */
    @Test
    public void listImageCachesTest() {
        ListImageCachesRequest listImageCachesRequest = new ListImageCachesRequest();
        listImageCachesRequest.setPageSize(0);
        listImageCachesRequest.setPageNo(0);
        ListImageCachesResponse response = bciClient.listImageCaches(listImageCachesRequest);
        System.out.println(response);
    }
    /**
     * list-instances
     *
     */
    @Test
    public void listInstancesTest() {
        ListInstancesRequest listInstancesRequest = new ListInstancesRequest();
        listInstancesRequest.setKeywordType("");
        listInstancesRequest.setKeyword("");
        listInstancesRequest.setMarker("");
        listInstancesRequest.setMaxKeys(0);
        ListInstancesResponse response = bciClient.listInstances(listInstancesRequest);
        System.out.println(response);
    }
}
