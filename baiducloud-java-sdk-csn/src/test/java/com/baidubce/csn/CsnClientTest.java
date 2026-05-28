package com.baidubce.csn;

import com.baidubce.csn.models.AddRouteRuleRequest;
import com.baidubce.csn.models.AttachCsnInstanceRequest;
import com.baidubce.csn.models.BindCsnBpRequest;
import com.baidubce.csn.models.CreateAssociationRelationRequest;
import com.baidubce.csn.models.CreateCsnBpRequest;
import com.baidubce.csn.models.CreateCsnBpResponse;
import com.baidubce.csn.models.CreateCsnRequest;
import com.baidubce.csn.models.CreateCsnResponse;
import com.baidubce.csn.models.CreateRegionBandwidthRequest;
import com.baidubce.csn.models.CreateStudyRelationRequest;
import com.baidubce.csn.models.DeleteAssociationRelationRequest;
import com.baidubce.csn.models.DeleteCsnBpRequest;
import com.baidubce.csn.models.DeleteCsnRequest;
import com.baidubce.csn.models.DeleteRegionBandwidthRequest;
import com.baidubce.csn.models.DeleteRouteRuleRequest;
import com.baidubce.csn.models.DeleteStudyRelationRequest;
import com.baidubce.csn.models.DetachCsnInstanceRequest;
import com.baidubce.csn.models.QueryAssociationRelationRequest;
import com.baidubce.csn.models.QueryAssociationRelationResponse;
import com.baidubce.csn.models.QueryCsnBpDetailRequest;
import com.baidubce.csn.models.QueryCsnBpDetailResponse;
import com.baidubce.csn.models.QueryCsnBpListRequest;
import com.baidubce.csn.models.QueryCsnBpListResponse;
import com.baidubce.csn.models.QueryCsnBpPriceRequest;
import com.baidubce.csn.models.QueryCsnBpPriceResponse;
import com.baidubce.csn.models.QueryCsnDetailRequest;
import com.baidubce.csn.models.QueryCsnDetailResponse;
import com.baidubce.csn.models.QueryCsnInstanceRequest;
import com.baidubce.csn.models.QueryCsnInstanceResponse;
import com.baidubce.csn.models.QueryCsnListRequest;
import com.baidubce.csn.models.QueryCsnListResponse;
import com.baidubce.csn.models.QueryRegionBandwidthByCsnRequest;
import com.baidubce.csn.models.QueryRegionBandwidthByCsnResponse;
import com.baidubce.csn.models.QueryRegionBandwidthRequest;
import com.baidubce.csn.models.QueryRegionBandwidthResponse;
import com.baidubce.csn.models.QueryRouteRuleRequest;
import com.baidubce.csn.models.QueryRouteRuleResponse;
import com.baidubce.csn.models.QueryRouteTableListRequest;
import com.baidubce.csn.models.QueryRouteTableListResponse;
import com.baidubce.csn.models.QueryStudyRelationRequest;
import com.baidubce.csn.models.QueryStudyRelationResponse;
import com.baidubce.csn.models.QueryTgwListRequest;
import com.baidubce.csn.models.QueryTgwListResponse;
import com.baidubce.csn.models.QueryTgwRouteRequest;
import com.baidubce.csn.models.QueryTgwRouteResponse;
import com.baidubce.csn.models.ResizeCsnBpRequest;
import com.baidubce.csn.models.UnbindCsnBpRequest;
import com.baidubce.csn.models.UpdateCsnBpRequest;
import com.baidubce.csn.models.UpdateCsnRequest;
import com.baidubce.csn.models.UpdateRegionBandwidthRequest;
import com.baidubce.csn.models.UpdateTgwRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for CsnClient
 */
public class CsnClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private CsnClient csnClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        csnClient = new CsnClient(config);
    }

    /**
     * addRouteRule
     *
     */
    @Test
    public void addRouteRuleTest() {
        AddRouteRuleRequest addRouteRuleRequest = new AddRouteRuleRequest();
        addRouteRuleRequest.setCsnRtId("");
        addRouteRuleRequest.setClientToken("");
        addRouteRuleRequest.setAttachId("");
        addRouteRuleRequest.setDestAddress("");
        addRouteRuleRequest.setRouteType("");
        csnClient.addRouteRule(addRouteRuleRequest);
    }
    /**
     * attachCsnInstance
     *
     */
    @Test
    public void attachCsnInstanceTest() {
        AttachCsnInstanceRequest attachCsnInstanceRequest = new AttachCsnInstanceRequest();
        attachCsnInstanceRequest.setCsnId("");
        attachCsnInstanceRequest.setClientToken("");
        attachCsnInstanceRequest.setInstanceType("");
        attachCsnInstanceRequest.setInstanceId("");
        attachCsnInstanceRequest.setInstanceRegion("");
        attachCsnInstanceRequest.setInstanceAccountId("");
        csnClient.attachCsnInstance(attachCsnInstanceRequest);
    }
    /**
     * bindCsnBp
     *
     */
    @Test
    public void bindCsnBpTest() {
        BindCsnBpRequest bindCsnBpRequest = new BindCsnBpRequest();
        bindCsnBpRequest.setCsnBpId("");
        bindCsnBpRequest.setClientToken("");
        bindCsnBpRequest.setCsnId("");
        csnClient.bindCsnBp(bindCsnBpRequest);
    }
    /**
     * createAssociationRelation
     *
     */
    @Test
    public void createAssociationRelationTest() {
        CreateAssociationRelationRequest createAssociationRelationRequest = new CreateAssociationRelationRequest();
        createAssociationRelationRequest.setCsnRtId("");
        createAssociationRelationRequest.setClientToken("");
        createAssociationRelationRequest.setAttachId("");
        createAssociationRelationRequest.setDescription("");
        csnClient.createAssociationRelation(createAssociationRelationRequest);
    }
    /**
     * createCsn
     *
     */
    @Test
    public void createCsnTest() {
        CreateCsnRequest createCsnRequest = new CreateCsnRequest();
        createCsnRequest.setClientToken("");
        createCsnRequest.setName("");
        createCsnRequest.setDescription("");
        createCsnRequest.setTags(new ArrayList<>());
        CreateCsnResponse response = csnClient.createCsn(createCsnRequest);
        System.out.println(response);
    }
    /**
     * createCsnBp
     *
     */
    @Test
    public void createCsnBpTest() {
        CreateCsnBpRequest createCsnBpRequest = new CreateCsnBpRequest();
        createCsnBpRequest.setClientToken("");
        createCsnBpRequest.setName("");
        createCsnBpRequest.setInterworkType("");
        createCsnBpRequest.setBandwidth(0);
        createCsnBpRequest.setGeographicA("");
        createCsnBpRequest.setGeographicB("");
        createCsnBpRequest.setBilling(null);
        createCsnBpRequest.setTags(new ArrayList<>());
        CreateCsnBpResponse response = csnClient.createCsnBp(createCsnBpRequest);
        System.out.println(response);
    }
    /**
     * createRegionBandwidth
     *
     */
    @Test
    public void createRegionBandwidthTest() {
        CreateRegionBandwidthRequest createRegionBandwidthRequest = new CreateRegionBandwidthRequest();
        createRegionBandwidthRequest.setCsnBpId("");
        createRegionBandwidthRequest.setClientToken("");
        createRegionBandwidthRequest.setLocalRegion("");
        createRegionBandwidthRequest.setPeerRegion("");
        createRegionBandwidthRequest.setBandwidth(0);
        csnClient.createRegionBandwidth(createRegionBandwidthRequest);
    }
    /**
     * createStudyRelation
     *
     */
    @Test
    public void createStudyRelationTest() {
        CreateStudyRelationRequest createStudyRelationRequest = new CreateStudyRelationRequest();
        createStudyRelationRequest.setCsnRtId("");
        createStudyRelationRequest.setClientToken("");
        createStudyRelationRequest.setAttachId("");
        createStudyRelationRequest.setDescription("");
        csnClient.createStudyRelation(createStudyRelationRequest);
    }
    /**
     * deleteAssociationRelation
     *
     */
    @Test
    public void deleteAssociationRelationTest() {
        DeleteAssociationRelationRequest deleteAssociationRelationRequest = new DeleteAssociationRelationRequest();
        deleteAssociationRelationRequest.setCsnRtId("");
        deleteAssociationRelationRequest.setAttachId("");
        deleteAssociationRelationRequest.setClientToken("");
        csnClient.deleteAssociationRelation(deleteAssociationRelationRequest);
    }
    /**
     * deleteCsn
     *
     */
    @Test
    public void deleteCsnTest() {
        DeleteCsnRequest deleteCsnRequest = new DeleteCsnRequest();
        deleteCsnRequest.setCsnId("");
        deleteCsnRequest.setClientToken("");
        csnClient.deleteCsn(deleteCsnRequest);
    }
    /**
     * deleteCsnBp
     *
     */
    @Test
    public void deleteCsnBpTest() {
        DeleteCsnBpRequest deleteCsnBpRequest = new DeleteCsnBpRequest();
        deleteCsnBpRequest.setCsnBpId("");
        deleteCsnBpRequest.setClientToken("");
        csnClient.deleteCsnBp(deleteCsnBpRequest);
    }
    /**
     * deleteRegionBandwidth
     *
     */
    @Test
    public void deleteRegionBandwidthTest() {
        DeleteRegionBandwidthRequest deleteRegionBandwidthRequest = new DeleteRegionBandwidthRequest();
        deleteRegionBandwidthRequest.setCsnBpId("");
        deleteRegionBandwidthRequest.setClientToken("");
        deleteRegionBandwidthRequest.setLocalRegion("");
        deleteRegionBandwidthRequest.setPeerRegion("");
        csnClient.deleteRegionBandwidth(deleteRegionBandwidthRequest);
    }
    /**
     * deleteRouteRule
     *
     */
    @Test
    public void deleteRouteRuleTest() {
        DeleteRouteRuleRequest deleteRouteRuleRequest = new DeleteRouteRuleRequest();
        deleteRouteRuleRequest.setCsnRtId("");
        deleteRouteRuleRequest.setCsnRtRuleId("");
        deleteRouteRuleRequest.setClientToken("");
        csnClient.deleteRouteRule(deleteRouteRuleRequest);
    }
    /**
     * deleteStudyRelation
     *
     */
    @Test
    public void deleteStudyRelationTest() {
        DeleteStudyRelationRequest deleteStudyRelationRequest = new DeleteStudyRelationRequest();
        deleteStudyRelationRequest.setCsnRtId("");
        deleteStudyRelationRequest.setAttachId("");
        deleteStudyRelationRequest.setClientToken("");
        csnClient.deleteStudyRelation(deleteStudyRelationRequest);
    }
    /**
     * detachCsnInstance
     *
     */
    @Test
    public void detachCsnInstanceTest() {
        DetachCsnInstanceRequest detachCsnInstanceRequest = new DetachCsnInstanceRequest();
        detachCsnInstanceRequest.setCsnId("");
        detachCsnInstanceRequest.setClientToken("");
        detachCsnInstanceRequest.setInstanceType("");
        detachCsnInstanceRequest.setInstanceId("");
        detachCsnInstanceRequest.setInstanceRegion("");
        detachCsnInstanceRequest.setInstanceAccountId("");
        csnClient.detachCsnInstance(detachCsnInstanceRequest);
    }
    /**
     * queryAssociationRelation
     *
     */
    @Test
    public void queryAssociationRelationTest() {
        QueryAssociationRelationRequest queryAssociationRelationRequest = new QueryAssociationRelationRequest();
        queryAssociationRelationRequest.setCsnRtId("");
        QueryAssociationRelationResponse response = csnClient.queryAssociationRelation(queryAssociationRelationRequest);
        System.out.println(response);
    }
    /**
     * queryCsnBpDetail
     *
     */
    @Test
    public void queryCsnBpDetailTest() {
        QueryCsnBpDetailRequest queryCsnBpDetailRequest = new QueryCsnBpDetailRequest();
        queryCsnBpDetailRequest.setCsnBpId("");
        QueryCsnBpDetailResponse response = csnClient.queryCsnBpDetail(queryCsnBpDetailRequest);
        System.out.println(response);
    }
    /**
     * queryCsnBpList
     *
     */
    @Test
    public void queryCsnBpListTest() {
        QueryCsnBpListRequest queryCsnBpListRequest = new QueryCsnBpListRequest();
        queryCsnBpListRequest.setMarker("");
        queryCsnBpListRequest.setMaxKeys(0);
        QueryCsnBpListResponse response = csnClient.queryCsnBpList(queryCsnBpListRequest);
        System.out.println(response);
    }
    /**
     * queryCsnBpPrice
     *
     */
    @Test
    public void queryCsnBpPriceTest() {
        QueryCsnBpPriceRequest queryCsnBpPriceRequest = new QueryCsnBpPriceRequest();
        queryCsnBpPriceRequest.setName("");
        queryCsnBpPriceRequest.setBandwidth(0);
        queryCsnBpPriceRequest.setGeographicA("");
        queryCsnBpPriceRequest.setGeographicB("");
        queryCsnBpPriceRequest.setBilling(null);
        QueryCsnBpPriceResponse response = csnClient.queryCsnBpPrice(queryCsnBpPriceRequest);
        System.out.println(response);
    }
    /**
     * queryCsnDetail
     *
     */
    @Test
    public void queryCsnDetailTest() {
        QueryCsnDetailRequest queryCsnDetailRequest = new QueryCsnDetailRequest();
        queryCsnDetailRequest.setCsnId("");
        QueryCsnDetailResponse response = csnClient.queryCsnDetail(queryCsnDetailRequest);
        System.out.println(response);
    }
    /**
     * queryCsnInstance
     *
     */
    @Test
    public void queryCsnInstanceTest() {
        QueryCsnInstanceRequest queryCsnInstanceRequest = new QueryCsnInstanceRequest();
        queryCsnInstanceRequest.setCsnId("");
        queryCsnInstanceRequest.setMarker("");
        queryCsnInstanceRequest.setMaxKeys(0);
        QueryCsnInstanceResponse response = csnClient.queryCsnInstance(queryCsnInstanceRequest);
        System.out.println(response);
    }
    /**
     * queryCsnList
     *
     */
    @Test
    public void queryCsnListTest() {
        QueryCsnListRequest queryCsnListRequest = new QueryCsnListRequest();
        queryCsnListRequest.setMarker("");
        queryCsnListRequest.setMaxKeys(0);
        QueryCsnListResponse response = csnClient.queryCsnList(queryCsnListRequest);
        System.out.println(response);
    }
    /**
     * queryRegionBandwidth
     *
     */
    @Test
    public void queryRegionBandwidthTest() {
        QueryRegionBandwidthRequest queryRegionBandwidthRequest = new QueryRegionBandwidthRequest();
        queryRegionBandwidthRequest.setCsnBpId("");
        QueryRegionBandwidthResponse response = csnClient.queryRegionBandwidth(queryRegionBandwidthRequest);
        System.out.println(response);
    }
    /**
     * queryRegionBandwidthByCsn
     *
     */
    @Test
    public void queryRegionBandwidthByCsnTest() {
        QueryRegionBandwidthByCsnRequest queryRegionBandwidthByCsnRequest = new QueryRegionBandwidthByCsnRequest();
        queryRegionBandwidthByCsnRequest.setCsnId("");
        QueryRegionBandwidthByCsnResponse response = csnClient.queryRegionBandwidthByCsn(queryRegionBandwidthByCsnRequest);
        System.out.println(response);
    }
    /**
     * queryRouteRule
     *
     */
    @Test
    public void queryRouteRuleTest() {
        QueryRouteRuleRequest queryRouteRuleRequest = new QueryRouteRuleRequest();
        queryRouteRuleRequest.setCsnRtId("");
        queryRouteRuleRequest.setMarker("");
        queryRouteRuleRequest.setMaxKeys(0);
        QueryRouteRuleResponse response = csnClient.queryRouteRule(queryRouteRuleRequest);
        System.out.println(response);
    }
    /**
     * queryRouteTableList
     *
     */
    @Test
    public void queryRouteTableListTest() {
        QueryRouteTableListRequest queryRouteTableListRequest = new QueryRouteTableListRequest();
        queryRouteTableListRequest.setCsnId("");
        queryRouteTableListRequest.setMarker("");
        queryRouteTableListRequest.setMaxKeys(0);
        QueryRouteTableListResponse response = csnClient.queryRouteTableList(queryRouteTableListRequest);
        System.out.println(response);
    }
    /**
     * queryStudyRelation
     *
     */
    @Test
    public void queryStudyRelationTest() {
        QueryStudyRelationRequest queryStudyRelationRequest = new QueryStudyRelationRequest();
        queryStudyRelationRequest.setCsnRtId("");
        QueryStudyRelationResponse response = csnClient.queryStudyRelation(queryStudyRelationRequest);
        System.out.println(response);
    }
    /**
     * queryTgwList
     *
     */
    @Test
    public void queryTgwListTest() {
        QueryTgwListRequest queryTgwListRequest = new QueryTgwListRequest();
        queryTgwListRequest.setCsnId("");
        queryTgwListRequest.setMarker("");
        queryTgwListRequest.setMaxKeys(0);
        QueryTgwListResponse response = csnClient.queryTgwList(queryTgwListRequest);
        System.out.println(response);
    }
    /**
     * queryTgwRoute
     *
     */
    @Test
    public void queryTgwRouteTest() {
        QueryTgwRouteRequest queryTgwRouteRequest = new QueryTgwRouteRequest();
        queryTgwRouteRequest.setCsnId("");
        queryTgwRouteRequest.setTgwId("");
        queryTgwRouteRequest.setMarker("");
        queryTgwRouteRequest.setMaxKeys(0);
        QueryTgwRouteResponse response = csnClient.queryTgwRoute(queryTgwRouteRequest);
        System.out.println(response);
    }
    /**
     * resizeCsnBp
     *
     */
    @Test
    public void resizeCsnBpTest() {
        ResizeCsnBpRequest resizeCsnBpRequest = new ResizeCsnBpRequest();
        resizeCsnBpRequest.setCsnBpId("");
        resizeCsnBpRequest.setClientToken("");
        resizeCsnBpRequest.setBandwidth(0);
        csnClient.resizeCsnBp(resizeCsnBpRequest);
    }
    /**
     * unbindCsnBp
     *
     */
    @Test
    public void unbindCsnBpTest() {
        UnbindCsnBpRequest unbindCsnBpRequest = new UnbindCsnBpRequest();
        unbindCsnBpRequest.setCsnBpId("");
        unbindCsnBpRequest.setClientToken("");
        unbindCsnBpRequest.setCsnId("");
        csnClient.unbindCsnBp(unbindCsnBpRequest);
    }
    /**
     * updateCsn
     *
     */
    @Test
    public void updateCsnTest() {
        UpdateCsnRequest updateCsnRequest = new UpdateCsnRequest();
        updateCsnRequest.setCsnId("");
        updateCsnRequest.setClientToken("");
        updateCsnRequest.setName("");
        updateCsnRequest.setDescription("");
        csnClient.updateCsn(updateCsnRequest);
    }
    /**
     * updateCsnBp
     *
     */
    @Test
    public void updateCsnBpTest() {
        UpdateCsnBpRequest updateCsnBpRequest = new UpdateCsnBpRequest();
        updateCsnBpRequest.setCsnBpId("");
        updateCsnBpRequest.setClientToken("");
        updateCsnBpRequest.setName("");
        csnClient.updateCsnBp(updateCsnBpRequest);
    }
    /**
     * updateRegionBandwidth
     *
     */
    @Test
    public void updateRegionBandwidthTest() {
        UpdateRegionBandwidthRequest updateRegionBandwidthRequest = new UpdateRegionBandwidthRequest();
        updateRegionBandwidthRequest.setCsnBpId("");
        updateRegionBandwidthRequest.setClientToken("");
        updateRegionBandwidthRequest.setLocalRegion("");
        updateRegionBandwidthRequest.setPeerRegion("");
        updateRegionBandwidthRequest.setBandwidth(0);
        csnClient.updateRegionBandwidth(updateRegionBandwidthRequest);
    }
    /**
     * updateTgw
     *
     */
    @Test
    public void updateTgwTest() {
        UpdateTgwRequest updateTgwRequest = new UpdateTgwRequest();
        updateTgwRequest.setCsnId("");
        updateTgwRequest.setTgwId("");
        updateTgwRequest.setName("");
        updateTgwRequest.setDescription("");
        csnClient.updateTgw(updateTgwRequest);
    }
}
