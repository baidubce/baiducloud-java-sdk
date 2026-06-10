package com.baidubce.bcc;

import com.baidubce.bcc.models.AttachVolumeRequest;
import com.baidubce.bcc.models.AttachVolumeResponse;
import com.baidubce.bcc.models.BindTagVolumeRequest;
import com.baidubce.bcc.models.CreateVolumeRequest;
import com.baidubce.bcc.models.CreateVolumeResponse;
import com.baidubce.bcc.models.DetachVolumeRequest;
import com.baidubce.bcc.models.GetCdsPriceRequest;
import com.baidubce.bcc.models.GetCdsPriceResponse;
import com.baidubce.bcc.models.GetDiskQuotaRequest;
import com.baidubce.bcc.models.GetDiskQuotaResponse;
import com.baidubce.bcc.models.GetVolumeRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressRequest;
import com.baidubce.bcc.models.GetVolumeResizeProgressResponse;
import com.baidubce.bcc.models.GetVolumeResponse;
import com.baidubce.bcc.models.ListVolumesRequest;
import com.baidubce.bcc.models.ListVolumesResponse;
import com.baidubce.bcc.models.ModifyCdsAttributeRequest;
import com.baidubce.bcc.models.ModifyVolumeChargeTypeRequest;
import com.baidubce.bcc.models.PurchaseReservedVolumeRequest;
import com.baidubce.bcc.models.PurchaseReservedVolumeResponse;
import com.baidubce.bcc.models.ReleaseVolumeRequest;
import com.baidubce.bcc.models.RenameVolumeRequest;
import com.baidubce.bcc.models.ResizeVolumeRequest;
import com.baidubce.bcc.models.ResizeVolumeResponse;
import com.baidubce.bcc.models.RollbackVolumeRequest;
import com.baidubce.bcc.models.UnbindTagVolumeRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for BccClient
 */
public class BccClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private BccClient bccClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        bccClient = new BccClient(config);
    }

    /**
     * attachVolume
     *
     */
    @Test
    public void attachVolumeTest() {
        AttachVolumeRequest attachVolumeRequest = new AttachVolumeRequest();
        attachVolumeRequest.setVolumeId("");
        attachVolumeRequest.setInstanceId("");
        attachVolumeRequest.setDeleteWithInstance(false);
        attachVolumeRequest.setDeleteAutoSnapshot(false);
        AttachVolumeResponse response = bccClient.attachVolume(attachVolumeRequest);
        System.out.println(response);
    }
    /**
     * bindTagVolume
     *
     */
    @Test
    public void bindTagVolumeTest() {
        BindTagVolumeRequest bindTagVolumeRequest = new BindTagVolumeRequest();
        bindTagVolumeRequest.setVolumeId("");
        bindTagVolumeRequest.setChangeTags(new ArrayList<>());
        bccClient.bindTagVolume(bindTagVolumeRequest);
    }
    /**
     * createVolume
     *
     */
    @Test
    public void createVolumeTest() {
        CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest();
        createVolumeRequest.setZoneName("");
        createVolumeRequest.setStorageType("");
        createVolumeRequest.setCdsSizeInGB(0);
        createVolumeRequest.setCdsExtraIo(0);
        createVolumeRequest.setSnapshotId("");
        createVolumeRequest.setShareSnapshotId("");
        createVolumeRequest.setEnableDeleteProtection("");
        createVolumeRequest.setInstanceId("");
        createVolumeRequest.setEncryptKey("");
        createVolumeRequest.setName("");
        createVolumeRequest.setDescription("");
        createVolumeRequest.setRenewTimeUnit("");
        createVolumeRequest.setRenewTime(0);
        createVolumeRequest.setRelationTag(false);
        createVolumeRequest.setTags(new ArrayList<>());
        createVolumeRequest.setResGroupId("");
        createVolumeRequest.setBilling(null);
        createVolumeRequest.setClusterId("");
        createVolumeRequest.setChargeType("");
        createVolumeRequest.setAutoSnapshotPolicy(null);
        createVolumeRequest.setDeleteWithInstance(false);
        createVolumeRequest.setDeleteAutoSnapshot(false);
        createVolumeRequest.setPurchaseCount(0);
        CreateVolumeResponse response = bccClient.createVolume(createVolumeRequest);
        System.out.println(response);
    }
    /**
     * detachVolume
     *
     */
    @Test
    public void detachVolumeTest() {
        DetachVolumeRequest detachVolumeRequest = new DetachVolumeRequest();
        detachVolumeRequest.setVolumeId("");
        detachVolumeRequest.setInstanceId("");
        bccClient.detachVolume(detachVolumeRequest);
    }
    /**
     * getCdsPrice
     *
     */
    @Test
    public void getCdsPriceTest() {
        GetCdsPriceRequest getCdsPriceRequest = new GetCdsPriceRequest();
        getCdsPriceRequest.setStorageType("");
        getCdsPriceRequest.setCdsSizeInGB(0);
        getCdsPriceRequest.setPaymentTiming("");
        getCdsPriceRequest.setZoneName("");
        getCdsPriceRequest.setPurchaseCount(0);
        getCdsPriceRequest.setPurchaseLength(0);
        getCdsPriceRequest.setCdsExtraIo(0);
        GetCdsPriceResponse response = bccClient.getCdsPrice(getCdsPriceRequest);
        System.out.println(response);
    }
    /**
     * getDiskQuota
     *
     */
    @Test
    public void getDiskQuotaTest() {
        GetDiskQuotaRequest getDiskQuotaRequest = new GetDiskQuotaRequest();
        getDiskQuotaRequest.setZoneName("");
        GetDiskQuotaResponse response = bccClient.getDiskQuota(getDiskQuotaRequest);
        System.out.println(response);
    }
    /**
     * getVolume
     *
     */
    @Test
    public void getVolumeTest() {
        GetVolumeRequest getVolumeRequest = new GetVolumeRequest();
        getVolumeRequest.setVolumeId("");
        GetVolumeResponse response = bccClient.getVolume(getVolumeRequest);
        System.out.println(response);
    }
    /**
     * getVolumeResizeProgress
     *
     */
    @Test
    public void getVolumeResizeProgressTest() {
        GetVolumeResizeProgressRequest getVolumeResizeProgressRequest = new GetVolumeResizeProgressRequest();
        getVolumeResizeProgressRequest.setVolumeId("");
        GetVolumeResizeProgressResponse response = bccClient.getVolumeResizeProgress(getVolumeResizeProgressRequest);
        System.out.println(response);
    }
    /**
     * listVolumes
     *
     */
    @Test
    public void listVolumesTest() {
        ListVolumesRequest listVolumesRequest = new ListVolumesRequest();
        listVolumesRequest.setMarker("");
        listVolumesRequest.setMaxKeys(0);
        listVolumesRequest.setInstanceId("");
        listVolumesRequest.setZoneName("");
        listVolumesRequest.setClusterId("");
        listVolumesRequest.setChargeFilter("");
        listVolumesRequest.setUsageFilter("");
        listVolumesRequest.setName("");
        listVolumesRequest.setProductCategory("");
        ListVolumesResponse response = bccClient.listVolumes(listVolumesRequest);
        System.out.println(response);
    }
    /**
     * modifyCdsAttribute
     *
     */
    @Test
    public void modifyCdsAttributeTest() {
        ModifyCdsAttributeRequest modifyCdsAttributeRequest = new ModifyCdsAttributeRequest();
        modifyCdsAttributeRequest.setVolumeId("");
        modifyCdsAttributeRequest.setCdsName("");
        modifyCdsAttributeRequest.setDesc("");
        modifyCdsAttributeRequest.setDeleteWithInstance(false);
        modifyCdsAttributeRequest.setDeleteAutoSnapshot(false);
        bccClient.modifyCdsAttribute(modifyCdsAttributeRequest);
    }
    /**
     * modifyVolumeChargeType
     *
     */
    @Test
    public void modifyVolumeChargeTypeTest() {
        ModifyVolumeChargeTypeRequest modifyVolumeChargeTypeRequest = new ModifyVolumeChargeTypeRequest();
        modifyVolumeChargeTypeRequest.setVolumeId("");
        modifyVolumeChargeTypeRequest.setBilling(null);
        modifyVolumeChargeTypeRequest.setEffectiveType("");
        bccClient.modifyVolumeChargeType(modifyVolumeChargeTypeRequest);
    }
    /**
     * purchaseReservedVolume
     *
     */
    @Test
    public void purchaseReservedVolumeTest() {
        PurchaseReservedVolumeRequest purchaseReservedVolumeRequest = new PurchaseReservedVolumeRequest();
        purchaseReservedVolumeRequest.setVolumeId("");
        purchaseReservedVolumeRequest.setBilling(null);
        purchaseReservedVolumeRequest.setInstanceId("");
        PurchaseReservedVolumeResponse response = bccClient.purchaseReservedVolume(purchaseReservedVolumeRequest);
        System.out.println(response);
    }
    /**
     * releaseVolume
     *
     */
    @Test
    public void releaseVolumeTest() {
        ReleaseVolumeRequest releaseVolumeRequest = new ReleaseVolumeRequest();
        releaseVolumeRequest.setVolumeId("");
        releaseVolumeRequest.setAutoSnapshot("");
        releaseVolumeRequest.setManualSnapshot("");
        releaseVolumeRequest.setCdsAttributeActive(false);
        releaseVolumeRequest.setRecycle("");
        bccClient.releaseVolume(releaseVolumeRequest);
    }
    /**
     * renameVolume
     *
     */
    @Test
    public void renameVolumeTest() {
        RenameVolumeRequest renameVolumeRequest = new RenameVolumeRequest();
        renameVolumeRequest.setVolumeId("");
        renameVolumeRequest.setName("");
        bccClient.renameVolume(renameVolumeRequest);
    }
    /**
     * resizeVolume
     *
     */
    @Test
    public void resizeVolumeTest() {
        ResizeVolumeRequest resizeVolumeRequest = new ResizeVolumeRequest();
        resizeVolumeRequest.setVolumeId("");
        resizeVolumeRequest.setNewCdsSizeInGB(0);
        resizeVolumeRequest.setNewExtraIO(0);
        resizeVolumeRequest.setNewVolumeType("");
        ResizeVolumeResponse response = bccClient.resizeVolume(resizeVolumeRequest);
        System.out.println(response);
    }
    /**
     * rollbackVolume
     *
     */
    @Test
    public void rollbackVolumeTest() {
        RollbackVolumeRequest rollbackVolumeRequest = new RollbackVolumeRequest();
        rollbackVolumeRequest.setVolumeId("");
        rollbackVolumeRequest.setSnapshotId("");
        bccClient.rollbackVolume(rollbackVolumeRequest);
    }
    /**
     * unbindTagVolume
     *
     */
    @Test
    public void unbindTagVolumeTest() {
        UnbindTagVolumeRequest unbindTagVolumeRequest = new UnbindTagVolumeRequest();
        unbindTagVolumeRequest.setVolumeId("");
        unbindTagVolumeRequest.setChangeTags(new ArrayList<>());
        bccClient.unbindTagVolume(unbindTagVolumeRequest);
    }
}
