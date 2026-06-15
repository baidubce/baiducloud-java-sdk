package com.baidubce.et;

import com.baidubce.et.models.ApplyPhysicalDedicatedLineRequest;
import com.baidubce.et.models.ApplyPhysicalDedicatedLineResponse;
import com.baidubce.et.models.AssociatedDedicatedChannelRequest;
import com.baidubce.et.models.CreateDedicatedChannelBfdRequest;
import com.baidubce.et.models.CreateDedicatedChannelRequest;
import com.baidubce.et.models.CreateDedicatedChannelResponse;
import com.baidubce.et.models.CreateDedicatedChannelRouteParametersRequest;
import com.baidubce.et.models.CreateDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.CreateDedicatedChannelRouteRulesResponse;
import com.baidubce.et.models.CreateDedicatedChannelUserObjectRequest;
import com.baidubce.et.models.DeleteDedicatedChannelBfdRequest;
import com.baidubce.et.models.DeleteDedicatedChannelRequest;
import com.baidubce.et.models.DeleteDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.DeletePhysicalDedicatedLineRequest;
import com.baidubce.et.models.DisableDedicatedChannelIpv6Request;
import com.baidubce.et.models.EnableDedicatedChannelIpv6Request;
import com.baidubce.et.models.QueryDedicatedChannelRequest;
import com.baidubce.et.models.QueryDedicatedChannelResponse;
import com.baidubce.et.models.QueryDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.QueryDedicatedChannelRouteRulesResponse;
import com.baidubce.et.models.QueryDedicatedLineDetailRequest;
import com.baidubce.et.models.QueryDedicatedLineDetailResponse;
import com.baidubce.et.models.QueryDedicatedLinesRequest;
import com.baidubce.et.models.QueryDedicatedLinesResponse;
import com.baidubce.et.models.RemoveDedicatedChannelRouteParametersRequest;
import com.baidubce.et.models.RemoveDedicatedChannelUserObjectRequest;
import com.baidubce.et.models.ResubmitDedicatedChannelRequest;
import com.baidubce.et.models.UnrelatedDedicatedLineChannelRequest;
import com.baidubce.et.models.UpdateDedicatedChannelBfdRequest;
import com.baidubce.et.models.UpdateDedicatedChannelRequest;
import com.baidubce.et.models.UpdateDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.UpdatePhysicalDedicatedLineRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for EtClient
 */
public class EtClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private EtClient etClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        etClient = new EtClient(config);
    }

    /**
     * applyPhysicalDedicatedLine
     *
     */
    @Test
    public void applyPhysicalDedicatedLineTest() {
        ApplyPhysicalDedicatedLineRequest applyPhysicalDedicatedLineRequest = new ApplyPhysicalDedicatedLineRequest();
        applyPhysicalDedicatedLineRequest.setClientToken("");
        applyPhysicalDedicatedLineRequest.setName("");
        applyPhysicalDedicatedLineRequest.setDescription("");
        applyPhysicalDedicatedLineRequest.setIsp("");
        applyPhysicalDedicatedLineRequest.setIntfType("");
        applyPhysicalDedicatedLineRequest.setApType("");
        applyPhysicalDedicatedLineRequest.setApAddr("");
        applyPhysicalDedicatedLineRequest.setLinkDelay(0);
        applyPhysicalDedicatedLineRequest.setUserName("");
        applyPhysicalDedicatedLineRequest.setUserPhone("");
        applyPhysicalDedicatedLineRequest.setUserEmail("");
        applyPhysicalDedicatedLineRequest.setUserIdc("");
        applyPhysicalDedicatedLineRequest.setBilling(null);
        applyPhysicalDedicatedLineRequest.setAutoRenew(null);
        applyPhysicalDedicatedLineRequest.setTags(new ArrayList<>());
        ApplyPhysicalDedicatedLineResponse response = etClient.applyPhysicalDedicatedLine(applyPhysicalDedicatedLineRequest);
        System.out.println(response);
    }
    /**
     * associatedDedicatedChannel
     *
     */
    @Test
    public void associatedDedicatedChannelTest() {
        AssociatedDedicatedChannelRequest associatedDedicatedChannelRequest = new AssociatedDedicatedChannelRequest();
        associatedDedicatedChannelRequest.setEtId("");
        associatedDedicatedChannelRequest.setEtChannelId("");
        associatedDedicatedChannelRequest.setClientToken("");
        associatedDedicatedChannelRequest.setExtraChannelId("");
        etClient.associatedDedicatedChannel(associatedDedicatedChannelRequest);
    }
    /**
     * createDedicatedChannel
     *
     */
    @Test
    public void createDedicatedChannelTest() {
        CreateDedicatedChannelRequest createDedicatedChannelRequest = new CreateDedicatedChannelRequest();
        createDedicatedChannelRequest.setEtId("");
        createDedicatedChannelRequest.setClientToken("");
        createDedicatedChannelRequest.setAuthorizedUsers(new ArrayList<>());
        createDedicatedChannelRequest.setDescription("");
        createDedicatedChannelRequest.setBaiduAddress("");
        createDedicatedChannelRequest.setName("");
        createDedicatedChannelRequest.setNetworks(new ArrayList<>());
        createDedicatedChannelRequest.setCustomerAddress("");
        createDedicatedChannelRequest.setRouteType("");
        createDedicatedChannelRequest.setVlanId(0);
        createDedicatedChannelRequest.setBgpAsn("");
        createDedicatedChannelRequest.setBgpKey("");
        createDedicatedChannelRequest.setEnableIpv6(0);
        createDedicatedChannelRequest.setBaiduIpv6Address("");
        createDedicatedChannelRequest.setCustomerIpv6Address("");
        createDedicatedChannelRequest.setIpv6Networks(new ArrayList<>());
        createDedicatedChannelRequest.setTags(new ArrayList<>());
        CreateDedicatedChannelResponse response = etClient.createDedicatedChannel(createDedicatedChannelRequest);
        System.out.println(response);
    }
    /**
     * createDedicatedChannelBfd
     *
     */
    @Test
    public void createDedicatedChannelBfdTest() {
        CreateDedicatedChannelBfdRequest createDedicatedChannelBfdRequest = new CreateDedicatedChannelBfdRequest();
        createDedicatedChannelBfdRequest.setEtId("");
        createDedicatedChannelBfdRequest.setEtChannelId("");
        createDedicatedChannelBfdRequest.setClientToken("");
        createDedicatedChannelBfdRequest.setSendInterval(0);
        createDedicatedChannelBfdRequest.setReceivInterval(0);
        createDedicatedChannelBfdRequest.setDetectMultiplier(0);
        etClient.createDedicatedChannelBfd(createDedicatedChannelBfdRequest);
    }
    /**
     * createDedicatedChannelRouteParameters
     *
     */
    @Test
    public void createDedicatedChannelRouteParametersTest() {
        CreateDedicatedChannelRouteParametersRequest createDedicatedChannelRouteParametersRequest = new CreateDedicatedChannelRouteParametersRequest();
        createDedicatedChannelRouteParametersRequest.setEtId("");
        createDedicatedChannelRouteParametersRequest.setEtChannelId("");
        createDedicatedChannelRouteParametersRequest.setClientToken("");
        createDedicatedChannelRouteParametersRequest.setNetworks(new ArrayList<>());
        createDedicatedChannelRouteParametersRequest.setIpv6Networks(new ArrayList<>());
        createDedicatedChannelRouteParametersRequest.setRouteType("");
        etClient.createDedicatedChannelRouteParameters(createDedicatedChannelRouteParametersRequest);
    }
    /**
     * createDedicatedChannelRouteRules
     *
     */
    @Test
    public void createDedicatedChannelRouteRulesTest() {
        CreateDedicatedChannelRouteRulesRequest createDedicatedChannelRouteRulesRequest = new CreateDedicatedChannelRouteRulesRequest();
        createDedicatedChannelRouteRulesRequest.setEtId("");
        createDedicatedChannelRouteRulesRequest.setEtChannelId("");
        createDedicatedChannelRouteRulesRequest.setClientToken("");
        createDedicatedChannelRouteRulesRequest.setIpVersion(0);
        createDedicatedChannelRouteRulesRequest.setDestAddress("");
        createDedicatedChannelRouteRulesRequest.setNexthopType("");
        createDedicatedChannelRouteRulesRequest.setNexthopId("");
        createDedicatedChannelRouteRulesRequest.setDescription("");
        CreateDedicatedChannelRouteRulesResponse response = etClient.createDedicatedChannelRouteRules(createDedicatedChannelRouteRulesRequest);
        System.out.println(response);
    }
    /**
     * createDedicatedChannelUserObject
     *
     */
    @Test
    public void createDedicatedChannelUserObjectTest() {
        CreateDedicatedChannelUserObjectRequest createDedicatedChannelUserObjectRequest = new CreateDedicatedChannelUserObjectRequest();
        createDedicatedChannelUserObjectRequest.setEtId("");
        createDedicatedChannelUserObjectRequest.setEtChannelId("");
        createDedicatedChannelUserObjectRequest.setClientToken("");
        createDedicatedChannelUserObjectRequest.setAuthorizedUsers(new ArrayList<>());
        etClient.createDedicatedChannelUserObject(createDedicatedChannelUserObjectRequest);
    }
    /**
     * deleteDedicatedChannel
     *
     */
    @Test
    public void deleteDedicatedChannelTest() {
        DeleteDedicatedChannelRequest deleteDedicatedChannelRequest = new DeleteDedicatedChannelRequest();
        deleteDedicatedChannelRequest.setEtId("");
        deleteDedicatedChannelRequest.setEtChannelId("");
        deleteDedicatedChannelRequest.setClientToken("");
        etClient.deleteDedicatedChannel(deleteDedicatedChannelRequest);
    }
    /**
     * deleteDedicatedChannelBfd
     *
     */
    @Test
    public void deleteDedicatedChannelBfdTest() {
        DeleteDedicatedChannelBfdRequest deleteDedicatedChannelBfdRequest = new DeleteDedicatedChannelBfdRequest();
        deleteDedicatedChannelBfdRequest.setEtId("");
        deleteDedicatedChannelBfdRequest.setEtChannelId("");
        deleteDedicatedChannelBfdRequest.setClientToken("");
        etClient.deleteDedicatedChannelBfd(deleteDedicatedChannelBfdRequest);
    }
    /**
     * deleteDedicatedChannelRouteRules
     *
     */
    @Test
    public void deleteDedicatedChannelRouteRulesTest() {
        DeleteDedicatedChannelRouteRulesRequest deleteDedicatedChannelRouteRulesRequest = new DeleteDedicatedChannelRouteRulesRequest();
        deleteDedicatedChannelRouteRulesRequest.setEtId("");
        deleteDedicatedChannelRouteRulesRequest.setEtChannelId("");
        deleteDedicatedChannelRouteRulesRequest.setRouteRuleId("");
        deleteDedicatedChannelRouteRulesRequest.setClientToken("");
        etClient.deleteDedicatedChannelRouteRules(deleteDedicatedChannelRouteRulesRequest);
    }
    /**
     * deletePhysicalDedicatedLine
     *
     */
    @Test
    public void deletePhysicalDedicatedLineTest() {
        DeletePhysicalDedicatedLineRequest deletePhysicalDedicatedLineRequest = new DeletePhysicalDedicatedLineRequest();
        deletePhysicalDedicatedLineRequest.setDcphyId("");
        deletePhysicalDedicatedLineRequest.setClientToken("");
        etClient.deletePhysicalDedicatedLine(deletePhysicalDedicatedLineRequest);
    }
    /**
     * disableDedicatedChannelIpv6
     *
     */
    @Test
    public void disableDedicatedChannelIpv6Test() {
        DisableDedicatedChannelIpv6Request disableDedicatedChannelIpv6Request = new DisableDedicatedChannelIpv6Request();
        disableDedicatedChannelIpv6Request.setEtId("");
        disableDedicatedChannelIpv6Request.setEtChannelId("");
        disableDedicatedChannelIpv6Request.setClientToken("");
        etClient.disableDedicatedChannelIpv6(disableDedicatedChannelIpv6Request);
    }
    /**
     * enableDedicatedChannelIpv6
     *
     */
    @Test
    public void enableDedicatedChannelIpv6Test() {
        EnableDedicatedChannelIpv6Request enableDedicatedChannelIpv6Request = new EnableDedicatedChannelIpv6Request();
        enableDedicatedChannelIpv6Request.setEtId("");
        enableDedicatedChannelIpv6Request.setEtChannelId("");
        enableDedicatedChannelIpv6Request.setClientToken("");
        enableDedicatedChannelIpv6Request.setBaiduIpv6Address("");
        enableDedicatedChannelIpv6Request.setCustomerIpv6Address("");
        enableDedicatedChannelIpv6Request.setIpv6Networks(new ArrayList<>());
        etClient.enableDedicatedChannelIpv6(enableDedicatedChannelIpv6Request);
    }
    /**
     * queryDedicatedChannel
     *
     */
    @Test
    public void queryDedicatedChannelTest() {
        QueryDedicatedChannelRequest queryDedicatedChannelRequest = new QueryDedicatedChannelRequest();
        queryDedicatedChannelRequest.setEtId("");
        queryDedicatedChannelRequest.setClientToken("");
        queryDedicatedChannelRequest.setEtChannelId("");
        QueryDedicatedChannelResponse response = etClient.queryDedicatedChannel(queryDedicatedChannelRequest);
        System.out.println(response);
    }
    /**
     * queryDedicatedChannelRouteRules
     *
     */
    @Test
    public void queryDedicatedChannelRouteRulesTest() {
        QueryDedicatedChannelRouteRulesRequest queryDedicatedChannelRouteRulesRequest = new QueryDedicatedChannelRouteRulesRequest();
        queryDedicatedChannelRouteRulesRequest.setEtId("");
        queryDedicatedChannelRouteRulesRequest.setEtChannelId("");
        queryDedicatedChannelRouteRulesRequest.setMarker("");
        queryDedicatedChannelRouteRulesRequest.setMaxKeys(0);
        queryDedicatedChannelRouteRulesRequest.setDestAddress("");
        QueryDedicatedChannelRouteRulesResponse response = etClient.queryDedicatedChannelRouteRules(queryDedicatedChannelRouteRulesRequest);
        System.out.println(response);
    }
    /**
     * queryDedicatedLineDetail
     *
     */
    @Test
    public void queryDedicatedLineDetailTest() {
        QueryDedicatedLineDetailRequest queryDedicatedLineDetailRequest = new QueryDedicatedLineDetailRequest();
        queryDedicatedLineDetailRequest.setDcphyId("");
        QueryDedicatedLineDetailResponse response = etClient.queryDedicatedLineDetail(queryDedicatedLineDetailRequest);
        System.out.println(response);
    }
    /**
     * queryDedicatedLines
     *
     */
    @Test
    public void queryDedicatedLinesTest() {
        QueryDedicatedLinesRequest queryDedicatedLinesRequest = new QueryDedicatedLinesRequest();
        queryDedicatedLinesRequest.setMarker("");
        queryDedicatedLinesRequest.setMaxKeys(0);
        queryDedicatedLinesRequest.setStatus("");
        QueryDedicatedLinesResponse response = etClient.queryDedicatedLines(queryDedicatedLinesRequest);
        System.out.println(response);
    }
    /**
     * removeDedicatedChannelRouteParameters
     *
     */
    @Test
    public void removeDedicatedChannelRouteParametersTest() {
        RemoveDedicatedChannelRouteParametersRequest removeDedicatedChannelRouteParametersRequest = new RemoveDedicatedChannelRouteParametersRequest();
        removeDedicatedChannelRouteParametersRequest.setEtId("");
        removeDedicatedChannelRouteParametersRequest.setEtChannelId("");
        removeDedicatedChannelRouteParametersRequest.setClientToken("");
        removeDedicatedChannelRouteParametersRequest.setNetworks(new ArrayList<>());
        removeDedicatedChannelRouteParametersRequest.setIpv6Networks(new ArrayList<>());
        removeDedicatedChannelRouteParametersRequest.setRouteType("");
        etClient.removeDedicatedChannelRouteParameters(removeDedicatedChannelRouteParametersRequest);
    }
    /**
     * removeDedicatedChannelUserObject
     *
     */
    @Test
    public void removeDedicatedChannelUserObjectTest() {
        RemoveDedicatedChannelUserObjectRequest removeDedicatedChannelUserObjectRequest = new RemoveDedicatedChannelUserObjectRequest();
        removeDedicatedChannelUserObjectRequest.setEtId("");
        removeDedicatedChannelUserObjectRequest.setEtChannelId("");
        removeDedicatedChannelUserObjectRequest.setClientToken("");
        removeDedicatedChannelUserObjectRequest.setAuthorizedUsers(new ArrayList<>());
        etClient.removeDedicatedChannelUserObject(removeDedicatedChannelUserObjectRequest);
    }
    /**
     * resubmitDedicatedChannel
     *
     */
    @Test
    public void resubmitDedicatedChannelTest() {
        ResubmitDedicatedChannelRequest resubmitDedicatedChannelRequest = new ResubmitDedicatedChannelRequest();
        resubmitDedicatedChannelRequest.setEtId("");
        resubmitDedicatedChannelRequest.setEtChannelId("");
        resubmitDedicatedChannelRequest.setClientToken("");
        resubmitDedicatedChannelRequest.setAuthorizedUsers(new ArrayList<>());
        resubmitDedicatedChannelRequest.setDescription("");
        resubmitDedicatedChannelRequest.setBaiduAddress("");
        resubmitDedicatedChannelRequest.setName("");
        resubmitDedicatedChannelRequest.setNetworks(new ArrayList<>());
        resubmitDedicatedChannelRequest.setCustomerAddress("");
        resubmitDedicatedChannelRequest.setRouteType("");
        resubmitDedicatedChannelRequest.setVlanId(0);
        resubmitDedicatedChannelRequest.setEnableIpv6(0);
        resubmitDedicatedChannelRequest.setBaiduIpv6Address("");
        resubmitDedicatedChannelRequest.setCustomerIpv6Address("");
        resubmitDedicatedChannelRequest.setIpv6Networks(new ArrayList<>());
        etClient.resubmitDedicatedChannel(resubmitDedicatedChannelRequest);
    }
    /**
     * unrelatedDedicatedLineChannel
     *
     */
    @Test
    public void unrelatedDedicatedLineChannelTest() {
        UnrelatedDedicatedLineChannelRequest unrelatedDedicatedLineChannelRequest = new UnrelatedDedicatedLineChannelRequest();
        unrelatedDedicatedLineChannelRequest.setEtId("");
        unrelatedDedicatedLineChannelRequest.setEtChannelId("");
        unrelatedDedicatedLineChannelRequest.setClientToken("");
        unrelatedDedicatedLineChannelRequest.setExtraChannelId("");
        etClient.unrelatedDedicatedLineChannel(unrelatedDedicatedLineChannelRequest);
    }
    /**
     * updateDedicatedChannel
     *
     */
    @Test
    public void updateDedicatedChannelTest() {
        UpdateDedicatedChannelRequest updateDedicatedChannelRequest = new UpdateDedicatedChannelRequest();
        updateDedicatedChannelRequest.setEtId("");
        updateDedicatedChannelRequest.setEtChannelId("");
        updateDedicatedChannelRequest.setClientToken("");
        updateDedicatedChannelRequest.setName("");
        updateDedicatedChannelRequest.setDescription("");
        updateDedicatedChannelRequest.setBgpRouteLimit(0);
        etClient.updateDedicatedChannel(updateDedicatedChannelRequest);
    }
    /**
     * updateDedicatedChannelBfd
     *
     */
    @Test
    public void updateDedicatedChannelBfdTest() {
        UpdateDedicatedChannelBfdRequest updateDedicatedChannelBfdRequest = new UpdateDedicatedChannelBfdRequest();
        updateDedicatedChannelBfdRequest.setEtId("");
        updateDedicatedChannelBfdRequest.setEtChannelId("");
        updateDedicatedChannelBfdRequest.setClientToken("");
        updateDedicatedChannelBfdRequest.setSendInterval(0);
        updateDedicatedChannelBfdRequest.setReceivInterval(0);
        updateDedicatedChannelBfdRequest.setDetectMultiplier(0);
        etClient.updateDedicatedChannelBfd(updateDedicatedChannelBfdRequest);
    }
    /**
     * updateDedicatedChannelRouteRules
     *
     */
    @Test
    public void updateDedicatedChannelRouteRulesTest() {
        UpdateDedicatedChannelRouteRulesRequest updateDedicatedChannelRouteRulesRequest = new UpdateDedicatedChannelRouteRulesRequest();
        updateDedicatedChannelRouteRulesRequest.setEtId("");
        updateDedicatedChannelRouteRulesRequest.setEtChannelId("");
        updateDedicatedChannelRouteRulesRequest.setRouteRuleId("");
        updateDedicatedChannelRouteRulesRequest.setClientToken("");
        updateDedicatedChannelRouteRulesRequest.setDescription("");
        etClient.updateDedicatedChannelRouteRules(updateDedicatedChannelRouteRulesRequest);
    }
    /**
     * updatePhysicalDedicatedLine
     *
     */
    @Test
    public void updatePhysicalDedicatedLineTest() {
        UpdatePhysicalDedicatedLineRequest updatePhysicalDedicatedLineRequest = new UpdatePhysicalDedicatedLineRequest();
        updatePhysicalDedicatedLineRequest.setDcphyId("");
        updatePhysicalDedicatedLineRequest.setClientToken("");
        updatePhysicalDedicatedLineRequest.setName("");
        updatePhysicalDedicatedLineRequest.setDescription("");
        updatePhysicalDedicatedLineRequest.setUserName("");
        updatePhysicalDedicatedLineRequest.setUserPhone("");
        updatePhysicalDedicatedLineRequest.setUserEmail("");
        updatePhysicalDedicatedLineRequest.setLinkDelay(0);
        etClient.updatePhysicalDedicatedLine(updatePhysicalDedicatedLineRequest);
    }
}
