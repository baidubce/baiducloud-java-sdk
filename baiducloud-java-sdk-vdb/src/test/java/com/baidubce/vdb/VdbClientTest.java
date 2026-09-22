package com.baidubce.vdb;

import com.baidubce.vdb.models.AccountListUsingGETRequest;
import com.baidubce.vdb.models.AccountListUsingGETResponse;
import com.baidubce.vdb.models.BindEipUsingPOSTRequest;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTResponse;
import com.baidubce.vdb.models.DeleteInstanceUsingDELETERequest;
import com.baidubce.vdb.models.DeleteRecordUsingDELETERequest;
import com.baidubce.vdb.models.Deleteinstanceusingdelete1Request;
import com.baidubce.vdb.models.DescribeInstanceConfigsUsingGETRequest;
import com.baidubce.vdb.models.GetConfigUsingGETRequest;
import com.baidubce.vdb.models.GetConfigUsingGETResponse;
import com.baidubce.vdb.models.GetFreeInstanceQuotaUsingGETResponse;
import com.baidubce.vdb.models.GetInstanceListUsingGETRequest;
import com.baidubce.vdb.models.GetInstanceListUsingGETResponse;
import com.baidubce.vdb.models.GetNodeSpecListUsingGETRequest;
import com.baidubce.vdb.models.GetPriceUsingPOSTRequest;
import com.baidubce.vdb.models.GetPriceUsingPOSTResponse;
import com.baidubce.vdb.models.GetQuotaUsingGETRequest;
import com.baidubce.vdb.models.GetQuotaUsingGETResponse;
import com.baidubce.vdb.models.GetTLSCertificateUsingGETRequest;
import com.baidubce.vdb.models.GetTLSCertificateUsingGETResponse;
import com.baidubce.vdb.models.GetTLSInfoUsingGETRequest;
import com.baidubce.vdb.models.GetTLSInfoUsingGETResponse;
import com.baidubce.vdb.models.Getinstancelistusingget1Request;
import com.baidubce.vdb.models.Getinstancelistusingget1Response;
import com.baidubce.vdb.models.InstanceDetailUsingGETRequest;
import com.baidubce.vdb.models.InstanceDetailUsingGETResponse;
import com.baidubce.vdb.models.ListRecordsUsingGETRequest;
import com.baidubce.vdb.models.ListRecordsUsingGETResponse;
import com.baidubce.vdb.models.ManualBackupUsingPOSTRequest;
import com.baidubce.vdb.models.ModifyInstanceConfigUsingPOSTRequest;
import com.baidubce.vdb.models.ModifyPasswordUsingPOSTRequest;
import com.baidubce.vdb.models.ModifyPublicAccessUsingPUTRequest;
import com.baidubce.vdb.models.ModifyTLSUsingPUTRequest;
import com.baidubce.vdb.models.PasswordUsingGETRequest;
import com.baidubce.vdb.models.PasswordUsingGETResponse;
import com.baidubce.vdb.models.RecoverInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.RecoverUsingPOSTRequest;
import com.baidubce.vdb.models.ResizeInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.ResizeInstanceUsingPOSTResponse;
import com.baidubce.vdb.models.SetCommentUsingPOSTRequest;
import com.baidubce.vdb.models.SetConfigUsingPOSTRequest;
import com.baidubce.vdb.models.UnbindEipUsingPOSTRequest;
import com.baidubce.vdb.models.UpdateInstanceDomainUsingPOSTRequest;
import com.baidubce.vdb.models.UpdateInstanceNameUsingPOSTRequest;
import com.baidubce.vdb.models.ZoneListUsingGETRequest;
import com.baidubce.vdb.models.ZoneListUsingGETResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for VdbClient
 */
public class VdbClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private VdbClient vdbClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        config.setCredentials(new DefaultBceCredentials(AK, SK));

        vdbClient = new VdbClient(config);
    }

    /**
     * accountListUsingGET
     *
     */
    @Test
    public void accountListUsingGETTest() {
        AccountListUsingGETRequest accountListUsingGETRequest = new AccountListUsingGETRequest();
        accountListUsingGETRequest.setInstanceId("");
        accountListUsingGETRequest.setEngineType("");
        AccountListUsingGETResponse response = vdbClient.accountListUsingGET(accountListUsingGETRequest);
        System.out.println(response);
    }
    /**
     * bindEipUsingPOST
     *
     */
    @Test
    public void bindEipUsingPOSTTest() {
        BindEipUsingPOSTRequest bindEipUsingPOSTRequest = new BindEipUsingPOSTRequest();
        bindEipUsingPOSTRequest.setInstanceId("");
        bindEipUsingPOSTRequest.setEngineType("");
        bindEipUsingPOSTRequest.setEip("");
        vdbClient.bindEipUsingPOST(bindEipUsingPOSTRequest);
    }
    /**
     * createInstanceUsingPOST
     *
     */
    @Test
    public void createInstanceUsingPOSTTest() {
        CreateInstanceUsingPOSTRequest createInstanceUsingPOSTRequest = new CreateInstanceUsingPOSTRequest();
        createInstanceUsingPOSTRequest.setEngineType("");
        createInstanceUsingPOSTRequest.setAutoRenew(false);
        createInstanceUsingPOSTRequest.setAutoRenewTime(0);
        createInstanceUsingPOSTRequest.setAutoRenewTimeUnit("");
        createInstanceUsingPOSTRequest.setComponents(new ArrayList<>());
        createInstanceUsingPOSTRequest.setDuration(0);
        createInstanceUsingPOSTRequest.setEnv("");
        createInstanceUsingPOSTRequest.setInstanceParam(null);
        createInstanceUsingPOSTRequest.setProductType("");
        createInstanceUsingPOSTRequest.setTimeUnit("");
        CreateInstanceUsingPOSTResponse response = vdbClient.createInstanceUsingPOST(createInstanceUsingPOSTRequest);
        System.out.println(response);
    }
    /**
     * deleteInstanceUsingDELETE
     *
     */
    @Test
    public void deleteInstanceUsingDELETETest() {
        DeleteInstanceUsingDELETERequest deleteInstanceUsingDELETERequest = new DeleteInstanceUsingDELETERequest();
        deleteInstanceUsingDELETERequest.setInstanceId("");
        deleteInstanceUsingDELETERequest.setEngineType("");
        vdbClient.deleteInstanceUsingDELETE(deleteInstanceUsingDELETERequest);
    }
    /**
     * deleteRecordUsingDELETE
     *
     */
    @Test
    public void deleteRecordUsingDELETETest() {
        DeleteRecordUsingDELETERequest deleteRecordUsingDELETERequest = new DeleteRecordUsingDELETERequest();
        deleteRecordUsingDELETERequest.setInstanceId("");
        deleteRecordUsingDELETERequest.setEngineType("");
        deleteRecordUsingDELETERequest.setBatchId("");
        deleteRecordUsingDELETERequest.setBackupId("");
        vdbClient.deleteRecordUsingDELETE(deleteRecordUsingDELETERequest);
    }
    /**
     * deleteinstanceusingdelete1
     *
     */
    @Test
    public void deleteinstanceusingdelete1Test() {
        Deleteinstanceusingdelete1Request deleteinstanceusingdelete1Request = new Deleteinstanceusingdelete1Request();
        deleteinstanceusingdelete1Request.setInstanceId("");
        deleteinstanceusingdelete1Request.setEngineType("");
        vdbClient.deleteinstanceusingdelete1(deleteinstanceusingdelete1Request);
    }
    /**
     * describeInstanceConfigsUsingGET
     *
     */
    @Test
    public void describeInstanceConfigsUsingGETTest() {
        DescribeInstanceConfigsUsingGETRequest describeInstanceConfigsUsingGETRequest = new DescribeInstanceConfigsUsingGETRequest();
        describeInstanceConfigsUsingGETRequest.setInstanceId("");
        vdbClient.describeInstanceConfigsUsingGET(describeInstanceConfigsUsingGETRequest);
    }
    /**
     * getConfigUsingGET
     *
     */
    @Test
    public void getConfigUsingGETTest() {
        GetConfigUsingGETRequest getConfigUsingGETRequest = new GetConfigUsingGETRequest();
        getConfigUsingGETRequest.setInstanceId("");
        getConfigUsingGETRequest.setEngineType("");
        GetConfigUsingGETResponse response = vdbClient.getConfigUsingGET(getConfigUsingGETRequest);
        System.out.println(response);
    }
    /**
     * getFreeInstanceQuotaUsingGET
     *
     */
    @Test
    public void getFreeInstanceQuotaUsingGETTest() {
        GetFreeInstanceQuotaUsingGETResponse response = vdbClient.getFreeInstanceQuotaUsingGET();
        System.out.println(response);
    }
    /**
     * getInstanceListUsingGET
     *
     */
    @Test
    public void getInstanceListUsingGETTest() {
        GetInstanceListUsingGETRequest getInstanceListUsingGETRequest = new GetInstanceListUsingGETRequest();
        getInstanceListUsingGETRequest.setEngineType("");
        getInstanceListUsingGETRequest.setInstanceType("");
        GetInstanceListUsingGETResponse response = vdbClient.getInstanceListUsingGET(getInstanceListUsingGETRequest);
        System.out.println(response);
    }
    /**
     * getNodeSpecListUsingGET
     *
     */
    @Test
    public void getNodeSpecListUsingGETTest() {
        GetNodeSpecListUsingGETRequest getNodeSpecListUsingGETRequest = new GetNodeSpecListUsingGETRequest();
        getNodeSpecListUsingGETRequest.setEngineType("");
        vdbClient.getNodeSpecListUsingGET(getNodeSpecListUsingGETRequest);
    }
    /**
     * getPriceUsingPOST
     *
     */
    @Test
    public void getPriceUsingPOSTTest() {
        GetPriceUsingPOSTRequest getPriceUsingPOSTRequest = new GetPriceUsingPOSTRequest();
        getPriceUsingPOSTRequest.setEngineType("");
        getPriceUsingPOSTRequest.setAutoRenew(false);
        getPriceUsingPOSTRequest.setAutoRenewTime(0);
        getPriceUsingPOSTRequest.setAutoRenewTimeUnit("");
        getPriceUsingPOSTRequest.setComponents(new ArrayList<>());
        getPriceUsingPOSTRequest.setDuration(0);
        getPriceUsingPOSTRequest.setEnv("");
        getPriceUsingPOSTRequest.setInstanceParam(null);
        getPriceUsingPOSTRequest.setProductType("");
        getPriceUsingPOSTRequest.setTimeUnit("");
        GetPriceUsingPOSTResponse response = vdbClient.getPriceUsingPOST(getPriceUsingPOSTRequest);
        System.out.println(response);
    }
    /**
     * getQuotaUsingGET
     *
     */
    @Test
    public void getQuotaUsingGETTest() {
        GetQuotaUsingGETRequest getQuotaUsingGETRequest = new GetQuotaUsingGETRequest();
        getQuotaUsingGETRequest.setInstanceId("");
        getQuotaUsingGETRequest.setEngineType("");
        GetQuotaUsingGETResponse response = vdbClient.getQuotaUsingGET(getQuotaUsingGETRequest);
        System.out.println(response);
    }
    /**
     * getTLSCertificateUsingGET
     *
     */
    @Test
    public void getTLSCertificateUsingGETTest() {
        GetTLSCertificateUsingGETRequest getTLSCertificateUsingGETRequest = new GetTLSCertificateUsingGETRequest();
        getTLSCertificateUsingGETRequest.setInstanceId("");
        getTLSCertificateUsingGETRequest.setEngineType("");
        GetTLSCertificateUsingGETResponse response = vdbClient.getTLSCertificateUsingGET(getTLSCertificateUsingGETRequest);
        System.out.println(response);
    }
    /**
     * getTLSInfoUsingGET
     *
     */
    @Test
    public void getTLSInfoUsingGETTest() {
        GetTLSInfoUsingGETRequest getTLSInfoUsingGETRequest = new GetTLSInfoUsingGETRequest();
        getTLSInfoUsingGETRequest.setInstanceId("");
        getTLSInfoUsingGETRequest.setEngineType("");
        GetTLSInfoUsingGETResponse response = vdbClient.getTLSInfoUsingGET(getTLSInfoUsingGETRequest);
        System.out.println(response);
    }
    /**
     * getinstancelistusingget1
     *
     */
    @Test
    public void getinstancelistusingget1Test() {
        Getinstancelistusingget1Request getinstancelistusingget1Request = new Getinstancelistusingget1Request();
        getinstancelistusingget1Request.setEngineType("");
        Getinstancelistusingget1Response response = vdbClient.getinstancelistusingget1(getinstancelistusingget1Request);
        System.out.println(response);
    }
    /**
     * instanceDetailUsingGET
     *
     */
    @Test
    public void instanceDetailUsingGETTest() {
        InstanceDetailUsingGETRequest instanceDetailUsingGETRequest = new InstanceDetailUsingGETRequest();
        instanceDetailUsingGETRequest.setInstanceId("");
        instanceDetailUsingGETRequest.setEngineType("");
        InstanceDetailUsingGETResponse response = vdbClient.instanceDetailUsingGET(instanceDetailUsingGETRequest);
        System.out.println(response);
    }
    /**
     * listRecordsUsingGET
     *
     */
    @Test
    public void listRecordsUsingGETTest() {
        ListRecordsUsingGETRequest listRecordsUsingGETRequest = new ListRecordsUsingGETRequest();
        listRecordsUsingGETRequest.setInstanceId("");
        listRecordsUsingGETRequest.setEngineType("");
        listRecordsUsingGETRequest.setListOrder("");
        listRecordsUsingGETRequest.setPage("");
        listRecordsUsingGETRequest.setPageSize("");
        ListRecordsUsingGETResponse response = vdbClient.listRecordsUsingGET(listRecordsUsingGETRequest);
        System.out.println(response);
    }
    /**
     * manualBackupUsingPOST
     *
     */
    @Test
    public void manualBackupUsingPOSTTest() {
        ManualBackupUsingPOSTRequest manualBackupUsingPOSTRequest = new ManualBackupUsingPOSTRequest();
        manualBackupUsingPOSTRequest.setInstanceId("");
        manualBackupUsingPOSTRequest.setEngineType("");
        manualBackupUsingPOSTRequest.setComment("");
        vdbClient.manualBackupUsingPOST(manualBackupUsingPOSTRequest);
    }
    /**
     * modifyInstanceConfigUsingPOST
     *
     */
    @Test
    public void modifyInstanceConfigUsingPOSTTest() {
        ModifyInstanceConfigUsingPOSTRequest modifyInstanceConfigUsingPOSTRequest = new ModifyInstanceConfigUsingPOSTRequest();
        modifyInstanceConfigUsingPOSTRequest.setInstanceId("");
        modifyInstanceConfigUsingPOSTRequest.setReason("");
        modifyInstanceConfigUsingPOSTRequest.setUserConfigs(new ArrayList<>());
        vdbClient.modifyInstanceConfigUsingPOST(modifyInstanceConfigUsingPOSTRequest);
    }
    /**
     * modifyPasswordUsingPOST
     *
     */
    @Test
    public void modifyPasswordUsingPOSTTest() {
        ModifyPasswordUsingPOSTRequest modifyPasswordUsingPOSTRequest = new ModifyPasswordUsingPOSTRequest();
        modifyPasswordUsingPOSTRequest.setInstanceId("");
        modifyPasswordUsingPOSTRequest.setEngineType("");
        modifyPasswordUsingPOSTRequest.setFrom("");
        modifyPasswordUsingPOSTRequest.setPassword("");
        modifyPasswordUsingPOSTRequest.setUsername("");
        vdbClient.modifyPasswordUsingPOST(modifyPasswordUsingPOSTRequest);
    }
    /**
     * modifyPublicAccessUsingPUT
     *
     */
    @Test
    public void modifyPublicAccessUsingPUTTest() {
        ModifyPublicAccessUsingPUTRequest modifyPublicAccessUsingPUTRequest = new ModifyPublicAccessUsingPUTRequest();
        modifyPublicAccessUsingPUTRequest.setInstanceId("");
        modifyPublicAccessUsingPUTRequest.setPublicAccess(false);
        vdbClient.modifyPublicAccessUsingPUT(modifyPublicAccessUsingPUTRequest);
    }
    /**
     * modifyTLSUsingPUT
     *
     */
    @Test
    public void modifyTLSUsingPUTTest() {
        ModifyTLSUsingPUTRequest modifyTLSUsingPUTRequest = new ModifyTLSUsingPUTRequest();
        modifyTLSUsingPUTRequest.setEngineType("");
        modifyTLSUsingPUTRequest.setAction("");
        modifyTLSUsingPUTRequest.setInstanceId("");
        vdbClient.modifyTLSUsingPUT(modifyTLSUsingPUTRequest);
    }
    /**
     * passwordUsingGET
     *
     */
    @Test
    public void passwordUsingGETTest() {
        PasswordUsingGETRequest passwordUsingGETRequest = new PasswordUsingGETRequest();
        passwordUsingGETRequest.setInstanceId("");
        passwordUsingGETRequest.setUsername("");
        passwordUsingGETRequest.setEngineType("");
        PasswordUsingGETResponse response = vdbClient.passwordUsingGET(passwordUsingGETRequest);
        System.out.println(response);
    }
    /**
     * recoverInstanceUsingPOST
     *
     */
    @Test
    public void recoverInstanceUsingPOSTTest() {
        RecoverInstanceUsingPOSTRequest recoverInstanceUsingPOSTRequest = new RecoverInstanceUsingPOSTRequest();
        recoverInstanceUsingPOSTRequest.setInstanceId("");
        recoverInstanceUsingPOSTRequest.setEngineType("");
        vdbClient.recoverInstanceUsingPOST(recoverInstanceUsingPOSTRequest);
    }
    /**
     * recoverUsingPOST
     *
     */
    @Test
    public void recoverUsingPOSTTest() {
        RecoverUsingPOSTRequest recoverUsingPOSTRequest = new RecoverUsingPOSTRequest();
        recoverUsingPOSTRequest.setInstanceId("");
        recoverUsingPOSTRequest.setEngineType("");
        recoverUsingPOSTRequest.setBackupId("");
        recoverUsingPOSTRequest.setBatchId("");
        recoverUsingPOSTRequest.setConfirmed(false);
        vdbClient.recoverUsingPOST(recoverUsingPOSTRequest);
    }
    /**
     * resizeInstanceUsingPOST
     *
     */
    @Test
    public void resizeInstanceUsingPOSTTest() {
        ResizeInstanceUsingPOSTRequest resizeInstanceUsingPOSTRequest = new ResizeInstanceUsingPOSTRequest();
        resizeInstanceUsingPOSTRequest.setEngineType("");
        resizeInstanceUsingPOSTRequest.setComponents(new ArrayList<>());
        resizeInstanceUsingPOSTRequest.setDataNodeNum(0);
        resizeInstanceUsingPOSTRequest.setDiskFlavor(0);
        resizeInstanceUsingPOSTRequest.setDiskType("");
        resizeInstanceUsingPOSTRequest.setEnv("");
        resizeInstanceUsingPOSTRequest.setInstanceId("");
        resizeInstanceUsingPOSTRequest.setMasterNodeSpec("");
        resizeInstanceUsingPOSTRequest.setMasterNum(0);
        resizeInstanceUsingPOSTRequest.setNodeSpec("");
        resizeInstanceUsingPOSTRequest.setNodeType("");
        resizeInstanceUsingPOSTRequest.setOrderId("");
        resizeInstanceUsingPOSTRequest.setProxyNodeSpec("");
        resizeInstanceUsingPOSTRequest.setProxyNum(0);
        ResizeInstanceUsingPOSTResponse response = vdbClient.resizeInstanceUsingPOST(resizeInstanceUsingPOSTRequest);
        System.out.println(response);
    }
    /**
     * setCommentUsingPOST
     *
     */
    @Test
    public void setCommentUsingPOSTTest() {
        SetCommentUsingPOSTRequest setCommentUsingPOSTRequest = new SetCommentUsingPOSTRequest();
        setCommentUsingPOSTRequest.setInstanceId("");
        setCommentUsingPOSTRequest.setEngineType("");
        setCommentUsingPOSTRequest.setBackupId("");
        setCommentUsingPOSTRequest.setBatchId("");
        setCommentUsingPOSTRequest.setComment("");
        vdbClient.setCommentUsingPOST(setCommentUsingPOSTRequest);
    }
    /**
     * setConfigUsingPOST
     *
     */
    @Test
    public void setConfigUsingPOSTTest() {
        SetConfigUsingPOSTRequest setConfigUsingPOSTRequest = new SetConfigUsingPOSTRequest();
        setConfigUsingPOSTRequest.setInstanceId("");
        setConfigUsingPOSTRequest.setEngineType("");
        setConfigUsingPOSTRequest.setAutoBackupConfig("");
        setConfigUsingPOSTRequest.setAutoBackupEnabled(false);
        setConfigUsingPOSTRequest.setIsEncrypt("");
        vdbClient.setConfigUsingPOST(setConfigUsingPOSTRequest);
    }
    /**
     * unbindEipUsingPOST
     *
     */
    @Test
    public void unbindEipUsingPOSTTest() {
        UnbindEipUsingPOSTRequest unbindEipUsingPOSTRequest = new UnbindEipUsingPOSTRequest();
        unbindEipUsingPOSTRequest.setInstanceId("");
        unbindEipUsingPOSTRequest.setEngineType("");
        vdbClient.unbindEipUsingPOST(unbindEipUsingPOSTRequest);
    }
    /**
     * updateInstanceDomainUsingPOST
     *
     */
    @Test
    public void updateInstanceDomainUsingPOSTTest() {
        UpdateInstanceDomainUsingPOSTRequest updateInstanceDomainUsingPOSTRequest = new UpdateInstanceDomainUsingPOSTRequest();
        updateInstanceDomainUsingPOSTRequest.setInstanceId("");
        updateInstanceDomainUsingPOSTRequest.setEngineType("");
        updateInstanceDomainUsingPOSTRequest.setDomain("");
        vdbClient.updateInstanceDomainUsingPOST(updateInstanceDomainUsingPOSTRequest);
    }
    /**
     * updateInstanceNameUsingPOST
     *
     */
    @Test
    public void updateInstanceNameUsingPOSTTest() {
        UpdateInstanceNameUsingPOSTRequest updateInstanceNameUsingPOSTRequest = new UpdateInstanceNameUsingPOSTRequest();
        updateInstanceNameUsingPOSTRequest.setInstanceId("");
        updateInstanceNameUsingPOSTRequest.setEngineType("");
        updateInstanceNameUsingPOSTRequest.setInstanceName("");
        vdbClient.updateInstanceNameUsingPOST(updateInstanceNameUsingPOSTRequest);
    }
    /**
     * zoneListUsingGET
     *
     */
    @Test
    public void zoneListUsingGETTest() {
        ZoneListUsingGETRequest zoneListUsingGETRequest = new ZoneListUsingGETRequest();
        zoneListUsingGETRequest.setFrom("");
        zoneListUsingGETRequest.setEngineType("");
        ZoneListUsingGETResponse response = vdbClient.zoneListUsingGET(zoneListUsingGETRequest);
        System.out.println(response);
    }
}
