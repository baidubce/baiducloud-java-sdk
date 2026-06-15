package com.baidubce.bcm;

import com.baidubce.bcm.models.AddAlarmPolicyActionsRequest;
import com.baidubce.bcm.models.AddAlarmPolicyActionsResponse;
import com.baidubce.bcm.models.CreateAlarmMaskingRequest;
import com.baidubce.bcm.models.CreateAlarmMaskingResponse;
import com.baidubce.bcm.models.CreateAlarmPolicyRequest;
import com.baidubce.bcm.models.CreateAlarmPolicyResponse;
import com.baidubce.bcm.models.CreateAlarmTemplateRequest;
import com.baidubce.bcm.models.CreateAlarmTemplateResponse;
import com.baidubce.bcm.models.CreateInstanceGroupRequest;
import com.baidubce.bcm.models.CreateInstanceGroupResponse;
import com.baidubce.bcm.models.CreateNotifyTemplateRequest;
import com.baidubce.bcm.models.CreateNotifyTemplateResponse;
import com.baidubce.bcm.models.DeleteAlarmMaskingsRequest;
import com.baidubce.bcm.models.DeleteAlarmMaskingsResponse;
import com.baidubce.bcm.models.DeleteAlarmPoliciesRequest;
import com.baidubce.bcm.models.DeleteAlarmPoliciesResponse;
import com.baidubce.bcm.models.DeleteAlarmPolicyActionsRequest;
import com.baidubce.bcm.models.DeleteAlarmPolicyActionsResponse;
import com.baidubce.bcm.models.DeleteAlarmTemplatesRequest;
import com.baidubce.bcm.models.DeleteAlarmTemplatesResponse;
import com.baidubce.bcm.models.DeleteInstanceGroupInstancesRequest;
import com.baidubce.bcm.models.DeleteInstanceGroupInstancesResponse;
import com.baidubce.bcm.models.DeleteInstanceGroupRequest;
import com.baidubce.bcm.models.DeleteInstanceGroupResponse;
import com.baidubce.bcm.models.DeleteNotifyTemplateRequest;
import com.baidubce.bcm.models.DeleteNotifyTemplateResponse;
import com.baidubce.bcm.models.DescribeAlarmMaskingRequest;
import com.baidubce.bcm.models.DescribeAlarmMaskingResponse;
import com.baidubce.bcm.models.DescribeAlarmMaskingsRequest;
import com.baidubce.bcm.models.DescribeAlarmMaskingsResponse;
import com.baidubce.bcm.models.DescribeAlarmPoliciesRequest;
import com.baidubce.bcm.models.DescribeAlarmPoliciesResponse;
import com.baidubce.bcm.models.DescribeAlarmPolicyRequest;
import com.baidubce.bcm.models.DescribeAlarmPolicyResponse;
import com.baidubce.bcm.models.DescribeAlarmRequest;
import com.baidubce.bcm.models.DescribeAlarmResponse;
import com.baidubce.bcm.models.DescribeAlarmTemplateRequest;
import com.baidubce.bcm.models.DescribeAlarmTemplateResponse;
import com.baidubce.bcm.models.DescribeAlarmTemplatesRequest;
import com.baidubce.bcm.models.DescribeAlarmTemplatesResponse;
import com.baidubce.bcm.models.DescribeAlarmsRequest;
import com.baidubce.bcm.models.DescribeAlarmsResponse;
import com.baidubce.bcm.models.DescribeDimensionValuesRequest;
import com.baidubce.bcm.models.DescribeDimensionValuesResponse;
import com.baidubce.bcm.models.DescribeInstanceGroupRequest;
import com.baidubce.bcm.models.DescribeInstanceGroupResponse;
import com.baidubce.bcm.models.DescribeInstanceGroupsRequest;
import com.baidubce.bcm.models.DescribeInstanceGroupsResponse;
import com.baidubce.bcm.models.DescribeMetricDataLatestRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestResponse;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopResponse;
import com.baidubce.bcm.models.DescribeMetricDataRequest;
import com.baidubce.bcm.models.DescribeMetricDataResponse;
import com.baidubce.bcm.models.DescribeNotifyTemplateRequest;
import com.baidubce.bcm.models.DescribeNotifyTemplateResponse;
import com.baidubce.bcm.models.DescribeNotifyTemplatesRequest;
import com.baidubce.bcm.models.DescribeNotifyTemplatesResponse;
import com.baidubce.bcm.models.DescribeReceiversRequest;
import com.baidubce.bcm.models.DescribeReceiversResponse;
import com.baidubce.bcm.models.DescribeSystemTemplateRulesRequest;
import com.baidubce.bcm.models.DescribeSystemTemplateRulesResponse;
import com.baidubce.bcm.models.ExportAlarmTemplatesRequest;
import com.baidubce.bcm.models.ExportAlarmTemplatesResponse;
import com.baidubce.bcm.models.ImportAlarmTemplatesRequest;
import com.baidubce.bcm.models.ImportAlarmTemplatesResponse;
import com.baidubce.bcm.models.UpdateAlarmMaskingRequest;
import com.baidubce.bcm.models.UpdateAlarmMaskingResponse;
import com.baidubce.bcm.models.UpdateAlarmMaskingStatesRequest;
import com.baidubce.bcm.models.UpdateAlarmMaskingStatesResponse;
import com.baidubce.bcm.models.UpdateAlarmPolicyNotifyEnabledRequest;
import com.baidubce.bcm.models.UpdateAlarmPolicyNotifyEnabledResponse;
import com.baidubce.bcm.models.UpdateAlarmPolicyRequest;
import com.baidubce.bcm.models.UpdateAlarmPolicyResponse;
import com.baidubce.bcm.models.UpdateAlarmPolicyStateRequest;
import com.baidubce.bcm.models.UpdateAlarmPolicyStateResponse;
import com.baidubce.bcm.models.UpdateAlarmTemplateRequest;
import com.baidubce.bcm.models.UpdateAlarmTemplateResponse;
import com.baidubce.bcm.models.UpdateInstanceGroupRequest;
import com.baidubce.bcm.models.UpdateInstanceGroupResponse;
import com.baidubce.bcm.models.UpdateNotifyTemplateRequest;
import com.baidubce.bcm.models.UpdateNotifyTemplateResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for BcmClient
 */
public class BcmClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private BcmClient bcmClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        bcmClient = new BcmClient(config);
    }

    /**
     * addAlarmPolicyActions
     *
     */
    @Test
    public void addAlarmPolicyActionsTest() {
        AddAlarmPolicyActionsRequest addAlarmPolicyActionsRequest = new AddAlarmPolicyActionsRequest();
        addAlarmPolicyActionsRequest.setId("");
        addAlarmPolicyActionsRequest.setActions(new ArrayList<>());
        AddAlarmPolicyActionsResponse response = bcmClient.addAlarmPolicyActions(addAlarmPolicyActionsRequest);
        System.out.println(response);
    }
    /**
     * createAlarmMasking
     *
     */
    @Test
    public void createAlarmMaskingTest() {
        CreateAlarmMaskingRequest createAlarmMaskingRequest = new CreateAlarmMaskingRequest();
        createAlarmMaskingRequest.setName("");
        createAlarmMaskingRequest.setScope("");
        createAlarmMaskingRequest.setResourceType("");
        createAlarmMaskingRequest.setPolicyId("");
        createAlarmMaskingRequest.setInstances(new ArrayList<>());
        createAlarmMaskingRequest.setRegion("");
        createAlarmMaskingRequest.setMetricNames(new ArrayList<>());
        createAlarmMaskingRequest.setPeriodType("");
        createAlarmMaskingRequest.setBeginTime("");
        createAlarmMaskingRequest.setEndTime("");
        createAlarmMaskingRequest.setTz("");
        createAlarmMaskingRequest.setDailyBeginTimestamp(0);
        createAlarmMaskingRequest.setDailyEndTimestamp(0);
        CreateAlarmMaskingResponse response = bcmClient.createAlarmMasking(createAlarmMaskingRequest);
        System.out.println(response);
    }
    /**
     * createAlarmPolicy
     *
     */
    @Test
    public void createAlarmPolicyTest() {
        CreateAlarmPolicyRequest createAlarmPolicyRequest = new CreateAlarmPolicyRequest();
        createAlarmPolicyRequest.setName("");
        createAlarmPolicyRequest.setScope("");
        createAlarmPolicyRequest.setResourceType("");
        createAlarmPolicyRequest.setTarget(null);
        createAlarmPolicyRequest.setRules(new ArrayList<>());
        createAlarmPolicyRequest.setPendingCount(0);
        createAlarmPolicyRequest.setOnMissingData("");
        createAlarmPolicyRequest.setNoDataNotifyPendingMinutes(0);
        createAlarmPolicyRequest.setType("");
        createAlarmPolicyRequest.setLevel("");
        createAlarmPolicyRequest.setActions(new ArrayList<>());
        createAlarmPolicyRequest.setNotifyEnabled(false);
        createAlarmPolicyRequest.setCallbacks(new ArrayList<>());
        createAlarmPolicyRequest.setRenotifyCount(0);
        createAlarmPolicyRequest.setRenotifyIntervalMinutes(0);
        createAlarmPolicyRequest.setNotifyMergeWindowSeconds(0);
        CreateAlarmPolicyResponse response = bcmClient.createAlarmPolicy(createAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * createAlarmTemplate
     *
     */
    @Test
    public void createAlarmTemplateTest() {
        CreateAlarmTemplateRequest createAlarmTemplateRequest = new CreateAlarmTemplateRequest();
        createAlarmTemplateRequest.setScope("");
        createAlarmTemplateRequest.setResourceType("");
        createAlarmTemplateRequest.setSubResourceType("");
        createAlarmTemplateRequest.setName("");
        createAlarmTemplateRequest.setComment("");
        createAlarmTemplateRequest.setRules(new ArrayList<>());
        CreateAlarmTemplateResponse response = bcmClient.createAlarmTemplate(createAlarmTemplateRequest);
        System.out.println(response);
    }
    /**
     * createInstanceGroup
     *
     */
    @Test
    public void createInstanceGroupTest() {
        CreateInstanceGroupRequest createInstanceGroupRequest = new CreateInstanceGroupRequest();
        createInstanceGroupRequest.setScope("");
        createInstanceGroupRequest.setResourceType("");
        createInstanceGroupRequest.setName("");
        createInstanceGroupRequest.setInstances(new ArrayList<>());
        CreateInstanceGroupResponse response = bcmClient.createInstanceGroup(createInstanceGroupRequest);
        System.out.println(response);
    }
    /**
     * createNotifyTemplate
     *
     */
    @Test
    public void createNotifyTemplateTest() {
        CreateNotifyTemplateRequest createNotifyTemplateRequest = new CreateNotifyTemplateRequest();
        createNotifyTemplateRequest.setName("");
        createNotifyTemplateRequest.setSilencePeriods(new ArrayList<>());
        createNotifyTemplateRequest.setReceivers(new ArrayList<>());
        createNotifyTemplateRequest.setCallbacks(new ArrayList<>());
        CreateNotifyTemplateResponse response = bcmClient.createNotifyTemplate(createNotifyTemplateRequest);
        System.out.println(response);
    }
    /**
     * deleteAlarmMaskings
     *
     */
    @Test
    public void deleteAlarmMaskingsTest() {
        DeleteAlarmMaskingsRequest deleteAlarmMaskingsRequest = new DeleteAlarmMaskingsRequest();
        deleteAlarmMaskingsRequest.setIds(new ArrayList<>());
        DeleteAlarmMaskingsResponse response = bcmClient.deleteAlarmMaskings(deleteAlarmMaskingsRequest);
        System.out.println(response);
    }
    /**
     * deleteAlarmPolicies
     *
     */
    @Test
    public void deleteAlarmPoliciesTest() {
        DeleteAlarmPoliciesRequest deleteAlarmPoliciesRequest = new DeleteAlarmPoliciesRequest();
        deleteAlarmPoliciesRequest.setIds(new ArrayList<>());
        DeleteAlarmPoliciesResponse response = bcmClient.deleteAlarmPolicies(deleteAlarmPoliciesRequest);
        System.out.println(response);
    }
    /**
     * deleteAlarmPolicyActions
     *
     */
    @Test
    public void deleteAlarmPolicyActionsTest() {
        DeleteAlarmPolicyActionsRequest deleteAlarmPolicyActionsRequest = new DeleteAlarmPolicyActionsRequest();
        deleteAlarmPolicyActionsRequest.setId("");
        deleteAlarmPolicyActionsRequest.setActions(new ArrayList<>());
        DeleteAlarmPolicyActionsResponse response = bcmClient.deleteAlarmPolicyActions(deleteAlarmPolicyActionsRequest);
        System.out.println(response);
    }
    /**
     * deleteAlarmTemplates
     *
     */
    @Test
    public void deleteAlarmTemplatesTest() {
        DeleteAlarmTemplatesRequest deleteAlarmTemplatesRequest = new DeleteAlarmTemplatesRequest();
        deleteAlarmTemplatesRequest.setIds(new ArrayList<>());
        DeleteAlarmTemplatesResponse response = bcmClient.deleteAlarmTemplates(deleteAlarmTemplatesRequest);
        System.out.println(response);
    }
    /**
     * deleteInstanceGroup
     *
     */
    @Test
    public void deleteInstanceGroupTest() {
        DeleteInstanceGroupRequest deleteInstanceGroupRequest = new DeleteInstanceGroupRequest();
        deleteInstanceGroupRequest.setId("");
        DeleteInstanceGroupResponse response = bcmClient.deleteInstanceGroup(deleteInstanceGroupRequest);
        System.out.println(response);
    }
    /**
     * deleteInstanceGroupInstances
     *
     */
    @Test
    public void deleteInstanceGroupInstancesTest() {
        DeleteInstanceGroupInstancesRequest deleteInstanceGroupInstancesRequest = new DeleteInstanceGroupInstancesRequest();
        deleteInstanceGroupInstancesRequest.setId("");
        deleteInstanceGroupInstancesRequest.setInstances(new ArrayList<>());
        DeleteInstanceGroupInstancesResponse response = bcmClient.deleteInstanceGroupInstances(deleteInstanceGroupInstancesRequest);
        System.out.println(response);
    }
    /**
     * deleteNotifyTemplate
     *
     */
    @Test
    public void deleteNotifyTemplateTest() {
        DeleteNotifyTemplateRequest deleteNotifyTemplateRequest = new DeleteNotifyTemplateRequest();
        deleteNotifyTemplateRequest.setNotifyId("");
        DeleteNotifyTemplateResponse response = bcmClient.deleteNotifyTemplate(deleteNotifyTemplateRequest);
        System.out.println(response);
    }
    /**
     * describeAlarm
     *
     */
    @Test
    public void describeAlarmTest() {
        DescribeAlarmRequest describeAlarmRequest = new DescribeAlarmRequest();
        describeAlarmRequest.setId("");
        DescribeAlarmResponse response = bcmClient.describeAlarm(describeAlarmRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmMasking
     *
     */
    @Test
    public void describeAlarmMaskingTest() {
        DescribeAlarmMaskingRequest describeAlarmMaskingRequest = new DescribeAlarmMaskingRequest();
        describeAlarmMaskingRequest.setId("");
        DescribeAlarmMaskingResponse response = bcmClient.describeAlarmMasking(describeAlarmMaskingRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmMaskings
     *
     */
    @Test
    public void describeAlarmMaskingsTest() {
        DescribeAlarmMaskingsRequest describeAlarmMaskingsRequest = new DescribeAlarmMaskingsRequest();
        describeAlarmMaskingsRequest.setMaskingName("");
        describeAlarmMaskingsRequest.setMaskingId("");
        describeAlarmMaskingsRequest.setOrder("");
        describeAlarmMaskingsRequest.setOrderBy("");
        describeAlarmMaskingsRequest.setPageNo(0);
        describeAlarmMaskingsRequest.setPageSize(0);
        DescribeAlarmMaskingsResponse response = bcmClient.describeAlarmMaskings(describeAlarmMaskingsRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmPolicies
     *
     */
    @Test
    public void describeAlarmPoliciesTest() {
        DescribeAlarmPoliciesRequest describeAlarmPoliciesRequest = new DescribeAlarmPoliciesRequest();
        describeAlarmPoliciesRequest.setPolicyName("");
        describeAlarmPoliciesRequest.setPolicyId("");
        describeAlarmPoliciesRequest.setScope("");
        describeAlarmPoliciesRequest.setResourceType("");
        describeAlarmPoliciesRequest.setRecursive(false);
        describeAlarmPoliciesRequest.setSubResourceType("");
        describeAlarmPoliciesRequest.setNotifyEnabled(false);
        describeAlarmPoliciesRequest.setType("");
        describeAlarmPoliciesRequest.setOrder("");
        describeAlarmPoliciesRequest.setOrderBy("");
        describeAlarmPoliciesRequest.setPageNo(0);
        describeAlarmPoliciesRequest.setPageSize(0);
        DescribeAlarmPoliciesResponse response = bcmClient.describeAlarmPolicies(describeAlarmPoliciesRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmPolicy
     *
     */
    @Test
    public void describeAlarmPolicyTest() {
        DescribeAlarmPolicyRequest describeAlarmPolicyRequest = new DescribeAlarmPolicyRequest();
        describeAlarmPolicyRequest.setId("");
        describeAlarmPolicyRequest.setRequireSubResourceType(false);
        DescribeAlarmPolicyResponse response = bcmClient.describeAlarmPolicy(describeAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmTemplate
     *
     */
    @Test
    public void describeAlarmTemplateTest() {
        DescribeAlarmTemplateRequest describeAlarmTemplateRequest = new DescribeAlarmTemplateRequest();
        describeAlarmTemplateRequest.setId("");
        DescribeAlarmTemplateResponse response = bcmClient.describeAlarmTemplate(describeAlarmTemplateRequest);
        System.out.println(response);
    }
    /**
     * describeAlarmTemplates
     *
     */
    @Test
    public void describeAlarmTemplatesTest() {
        DescribeAlarmTemplatesRequest describeAlarmTemplatesRequest = new DescribeAlarmTemplatesRequest();
        describeAlarmTemplatesRequest.setName("");
        describeAlarmTemplatesRequest.setScope("");
        describeAlarmTemplatesRequest.setResourceType("");
        describeAlarmTemplatesRequest.setSubResourceType("");
        describeAlarmTemplatesRequest.setOrder("");
        describeAlarmTemplatesRequest.setOrderBy("");
        describeAlarmTemplatesRequest.setPageNo(0);
        describeAlarmTemplatesRequest.setPageSize(0);
        DescribeAlarmTemplatesResponse response = bcmClient.describeAlarmTemplates(describeAlarmTemplatesRequest);
        System.out.println(response);
    }
    /**
     * describeAlarms
     *
     */
    @Test
    public void describeAlarmsTest() {
        DescribeAlarmsRequest describeAlarmsRequest = new DescribeAlarmsRequest();
        describeAlarmsRequest.setStartTime("");
        describeAlarmsRequest.setEndTime("");
        describeAlarmsRequest.setPolicyName("");
        describeAlarmsRequest.setScope("");
        describeAlarmsRequest.setResourceType("");
        describeAlarmsRequest.setState("");
        describeAlarmsRequest.setType("");
        describeAlarmsRequest.setOrder("");
        describeAlarmsRequest.setOrderBy("");
        describeAlarmsRequest.setPageNo(0);
        describeAlarmsRequest.setPageSize(0);
        DescribeAlarmsResponse response = bcmClient.describeAlarms(describeAlarmsRequest);
        System.out.println(response);
    }
    /**
     * describeDimensionValues
     *
     */
    @Test
    public void describeDimensionValuesTest() {
        DescribeDimensionValuesRequest describeDimensionValuesRequest = new DescribeDimensionValuesRequest();
        describeDimensionValuesRequest.setAction("");
        describeDimensionValuesRequest.setScope("");
        describeDimensionValuesRequest.setResourceType("");
        describeDimensionValuesRequest.setRegion("");
        describeDimensionValuesRequest.setBeginDatetime("");
        describeDimensionValuesRequest.setEndDatetime("");
        describeDimensionValuesRequest.setMetricName("");
        describeDimensionValuesRequest.setDimensionKey("");
        describeDimensionValuesRequest.setFilters(new ArrayList<>());
        DescribeDimensionValuesResponse response = bcmClient.describeDimensionValues(describeDimensionValuesRequest);
        System.out.println(response);
    }
    /**
     * describeInstanceGroup
     *
     */
    @Test
    public void describeInstanceGroupTest() {
        DescribeInstanceGroupRequest describeInstanceGroupRequest = new DescribeInstanceGroupRequest();
        describeInstanceGroupRequest.setId("");
        DescribeInstanceGroupResponse response = bcmClient.describeInstanceGroup(describeInstanceGroupRequest);
        System.out.println(response);
    }
    /**
     * describeInstanceGroups
     *
     */
    @Test
    public void describeInstanceGroupsTest() {
        DescribeInstanceGroupsRequest describeInstanceGroupsRequest = new DescribeInstanceGroupsRequest();
        describeInstanceGroupsRequest.setScope("");
        describeInstanceGroupsRequest.setResourceType("");
        describeInstanceGroupsRequest.setName("");
        describeInstanceGroupsRequest.setOrder("");
        describeInstanceGroupsRequest.setOrderBy("");
        describeInstanceGroupsRequest.setPageNo(0);
        describeInstanceGroupsRequest.setPageSize(0);
        DescribeInstanceGroupsResponse response = bcmClient.describeInstanceGroups(describeInstanceGroupsRequest);
        System.out.println(response);
    }
    /**
     * describeMetricData
     *
     */
    @Test
    public void describeMetricDataTest() {
        DescribeMetricDataRequest describeMetricDataRequest = new DescribeMetricDataRequest();
        describeMetricDataRequest.setAction("");
        describeMetricDataRequest.setScope("");
        describeMetricDataRequest.setResourceType("");
        describeMetricDataRequest.setRegion("");
        describeMetricDataRequest.setBeginDatetime("");
        describeMetricDataRequest.setEndDatetime("");
        describeMetricDataRequest.setMetricName("");
        describeMetricDataRequest.setFilters(new ArrayList<>());
        describeMetricDataRequest.setLimit(0);
        describeMetricDataRequest.setOffset(0);
        describeMetricDataRequest.setPeriodSeconds(0);
        describeMetricDataRequest.setAggregationOverTime(new ArrayList<>());
        DescribeMetricDataResponse response = bcmClient.describeMetricData(describeMetricDataRequest);
        System.out.println(response);
    }
    /**
     * describeMetricDataLatest
     *
     */
    @Test
    public void describeMetricDataLatestTest() {
        DescribeMetricDataLatestRequest describeMetricDataLatestRequest = new DescribeMetricDataLatestRequest();
        describeMetricDataLatestRequest.setAction("");
        describeMetricDataLatestRequest.setScope("");
        describeMetricDataLatestRequest.setResourceType("");
        describeMetricDataLatestRequest.setRegion("");
        describeMetricDataLatestRequest.setEndDatetime("");
        describeMetricDataLatestRequest.setMetricName("");
        describeMetricDataLatestRequest.setFilters(new ArrayList<>());
        describeMetricDataLatestRequest.setLimit(0);
        describeMetricDataLatestRequest.setOffset(0);
        describeMetricDataLatestRequest.setPeriodSeconds(0);
        describeMetricDataLatestRequest.setAggregationOverTime(new ArrayList<>());
        DescribeMetricDataLatestResponse response = bcmClient.describeMetricDataLatest(describeMetricDataLatestRequest);
        System.out.println(response);
    }
    /**
     * describeMetricDataLatestTop
     *
     */
    @Test
    public void describeMetricDataLatestTopTest() {
        DescribeMetricDataLatestTopRequest describeMetricDataLatestTopRequest = new DescribeMetricDataLatestTopRequest();
        describeMetricDataLatestTopRequest.setAction("");
        describeMetricDataLatestTopRequest.setScope("");
        describeMetricDataLatestTopRequest.setRegion("");
        describeMetricDataLatestTopRequest.setEndDatetime("");
        describeMetricDataLatestTopRequest.setMetricName("");
        describeMetricDataLatestTopRequest.setFilters(new ArrayList<>());
        describeMetricDataLatestTopRequest.setLimit(0);
        describeMetricDataLatestTopRequest.setAsc(false);
        describeMetricDataLatestTopRequest.setPeriodSeconds(0);
        describeMetricDataLatestTopRequest.setAggregationOverTime("");
        DescribeMetricDataLatestTopResponse response = bcmClient.describeMetricDataLatestTop(describeMetricDataLatestTopRequest);
        System.out.println(response);
    }
    /**
     * describeNotifyTemplate
     *
     */
    @Test
    public void describeNotifyTemplateTest() {
        DescribeNotifyTemplateRequest describeNotifyTemplateRequest = new DescribeNotifyTemplateRequest();
        describeNotifyTemplateRequest.setId("");
        DescribeNotifyTemplateResponse response = bcmClient.describeNotifyTemplate(describeNotifyTemplateRequest);
        System.out.println(response);
    }
    /**
     * describeNotifyTemplates
     *
     */
    @Test
    public void describeNotifyTemplatesTest() {
        DescribeNotifyTemplatesRequest describeNotifyTemplatesRequest = new DescribeNotifyTemplatesRequest();
        describeNotifyTemplatesRequest.setName("");
        describeNotifyTemplatesRequest.setPolicyId("");
        describeNotifyTemplatesRequest.setOrder("");
        describeNotifyTemplatesRequest.setOrderBy("");
        describeNotifyTemplatesRequest.setPageNo(0);
        describeNotifyTemplatesRequest.setPageSize(0);
        DescribeNotifyTemplatesResponse response = bcmClient.describeNotifyTemplates(describeNotifyTemplatesRequest);
        System.out.println(response);
    }
    /**
     * describeReceivers
     *
     */
    @Test
    public void describeReceiversTest() {
        DescribeReceiversRequest describeReceiversRequest = new DescribeReceiversRequest();
        describeReceiversRequest.setType("");
        describeReceiversRequest.setName("");
        describeReceiversRequest.setPageNo(0);
        describeReceiversRequest.setPageSize(0);
        DescribeReceiversResponse response = bcmClient.describeReceivers(describeReceiversRequest);
        System.out.println(response);
    }
    /**
     * describeSystemTemplateRules
     *
     */
    @Test
    public void describeSystemTemplateRulesTest() {
        DescribeSystemTemplateRulesRequest describeSystemTemplateRulesRequest = new DescribeSystemTemplateRulesRequest();
        describeSystemTemplateRulesRequest.setScope("");
        describeSystemTemplateRulesRequest.setResourceType("");
        describeSystemTemplateRulesRequest.setSubResourceType("");
        describeSystemTemplateRulesRequest.setSource("");
        DescribeSystemTemplateRulesResponse response = bcmClient.describeSystemTemplateRules(describeSystemTemplateRulesRequest);
        System.out.println(response);
    }
    /**
     * exportAlarmTemplates
     *
     */
    @Test
    public void exportAlarmTemplatesTest() {
        ExportAlarmTemplatesRequest exportAlarmTemplatesRequest = new ExportAlarmTemplatesRequest();
        exportAlarmTemplatesRequest.setNames(new ArrayList<>());
        ExportAlarmTemplatesResponse response = bcmClient.exportAlarmTemplates(exportAlarmTemplatesRequest);
        System.out.println(response);
    }
    /**
     * importAlarmTemplates
     *
     */
    @Test
    public void importAlarmTemplatesTest() {
        ImportAlarmTemplatesRequest importAlarmTemplatesRequest = new ImportAlarmTemplatesRequest();
        importAlarmTemplatesRequest.setOverwrite(false);
        importAlarmTemplatesRequest.setTemplates(new ArrayList<>());
        ImportAlarmTemplatesResponse response = bcmClient.importAlarmTemplates(importAlarmTemplatesRequest);
        System.out.println(response);
    }
    /**
     * updateAlarmMasking
     *
     */
    @Test
    public void updateAlarmMaskingTest() {
        UpdateAlarmMaskingRequest updateAlarmMaskingRequest = new UpdateAlarmMaskingRequest();
        updateAlarmMaskingRequest.setId("");
        updateAlarmMaskingRequest.setState("");
        updateAlarmMaskingRequest.setName("");
        updateAlarmMaskingRequest.setScope("");
        updateAlarmMaskingRequest.setResourceType("");
        updateAlarmMaskingRequest.setPolicyId("");
        updateAlarmMaskingRequest.setInstances(new ArrayList<>());
        updateAlarmMaskingRequest.setRegion("");
        updateAlarmMaskingRequest.setMetricNames(new ArrayList<>());
        updateAlarmMaskingRequest.setPeriodType("");
        updateAlarmMaskingRequest.setBeginTime("");
        updateAlarmMaskingRequest.setEndTime("");
        updateAlarmMaskingRequest.setTz("");
        updateAlarmMaskingRequest.setDailyBeginTimestamp(0);
        updateAlarmMaskingRequest.setDailyEndTimestamp(0);
        UpdateAlarmMaskingResponse response = bcmClient.updateAlarmMasking(updateAlarmMaskingRequest);
        System.out.println(response);
    }
    /**
     * updateAlarmMaskingStates
     *
     */
    @Test
    public void updateAlarmMaskingStatesTest() {
        UpdateAlarmMaskingStatesRequest updateAlarmMaskingStatesRequest = new UpdateAlarmMaskingStatesRequest();
        updateAlarmMaskingStatesRequest.setIds(new ArrayList<>());
        updateAlarmMaskingStatesRequest.setState("");
        UpdateAlarmMaskingStatesResponse response = bcmClient.updateAlarmMaskingStates(updateAlarmMaskingStatesRequest);
        System.out.println(response);
    }
    /**
     * updateAlarmPolicy
     *
     */
    @Test
    public void updateAlarmPolicyTest() {
        UpdateAlarmPolicyRequest updateAlarmPolicyRequest = new UpdateAlarmPolicyRequest();
        updateAlarmPolicyRequest.setId("");
        updateAlarmPolicyRequest.setState("");
        updateAlarmPolicyRequest.setName("");
        updateAlarmPolicyRequest.setScope("");
        updateAlarmPolicyRequest.setResourceType("");
        updateAlarmPolicyRequest.setTarget(null);
        updateAlarmPolicyRequest.setRules(new ArrayList<>());
        updateAlarmPolicyRequest.setPendingCount(0);
        updateAlarmPolicyRequest.setOnMissingData("");
        updateAlarmPolicyRequest.setNoDataNotifyPendingMinutes(0);
        updateAlarmPolicyRequest.setType("");
        updateAlarmPolicyRequest.setLevel("");
        updateAlarmPolicyRequest.setActions(new ArrayList<>());
        updateAlarmPolicyRequest.setNotifyEnabled(false);
        updateAlarmPolicyRequest.setCallbacks(new ArrayList<>());
        updateAlarmPolicyRequest.setRenotifyCount(0);
        updateAlarmPolicyRequest.setRenotifyIntervalMinutes(0);
        updateAlarmPolicyRequest.setNotifyMergeWindowSeconds(0);
        UpdateAlarmPolicyResponse response = bcmClient.updateAlarmPolicy(updateAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * updateAlarmPolicyNotifyEnabled
     *
     */
    @Test
    public void updateAlarmPolicyNotifyEnabledTest() {
        UpdateAlarmPolicyNotifyEnabledRequest updateAlarmPolicyNotifyEnabledRequest = new UpdateAlarmPolicyNotifyEnabledRequest();
        updateAlarmPolicyNotifyEnabledRequest.setIds(new ArrayList<>());
        updateAlarmPolicyNotifyEnabledRequest.setNotifyEnabled(false);
        UpdateAlarmPolicyNotifyEnabledResponse response = bcmClient.updateAlarmPolicyNotifyEnabled(updateAlarmPolicyNotifyEnabledRequest);
        System.out.println(response);
    }
    /**
     * updateAlarmPolicyState
     *
     */
    @Test
    public void updateAlarmPolicyStateTest() {
        UpdateAlarmPolicyStateRequest updateAlarmPolicyStateRequest = new UpdateAlarmPolicyStateRequest();
        updateAlarmPolicyStateRequest.setIds(new ArrayList<>());
        updateAlarmPolicyStateRequest.setState("");
        UpdateAlarmPolicyStateResponse response = bcmClient.updateAlarmPolicyState(updateAlarmPolicyStateRequest);
        System.out.println(response);
    }
    /**
     * updateAlarmTemplate
     *
     */
    @Test
    public void updateAlarmTemplateTest() {
        UpdateAlarmTemplateRequest updateAlarmTemplateRequest = new UpdateAlarmTemplateRequest();
        updateAlarmTemplateRequest.setId("");
        updateAlarmTemplateRequest.setScope("");
        updateAlarmTemplateRequest.setResourceType("");
        updateAlarmTemplateRequest.setSubResourceType("");
        updateAlarmTemplateRequest.setName("");
        updateAlarmTemplateRequest.setComment("");
        updateAlarmTemplateRequest.setRules(new ArrayList<>());
        UpdateAlarmTemplateResponse response = bcmClient.updateAlarmTemplate(updateAlarmTemplateRequest);
        System.out.println(response);
    }
    /**
     * updateInstanceGroup
     *
     */
    @Test
    public void updateInstanceGroupTest() {
        UpdateInstanceGroupRequest updateInstanceGroupRequest = new UpdateInstanceGroupRequest();
        updateInstanceGroupRequest.setId("");
        updateInstanceGroupRequest.setScope("");
        updateInstanceGroupRequest.setResourceType("");
        updateInstanceGroupRequest.setName("");
        updateInstanceGroupRequest.setInstances(new ArrayList<>());
        UpdateInstanceGroupResponse response = bcmClient.updateInstanceGroup(updateInstanceGroupRequest);
        System.out.println(response);
    }
    /**
     * updateNotifyTemplate
     *
     */
    @Test
    public void updateNotifyTemplateTest() {
        UpdateNotifyTemplateRequest updateNotifyTemplateRequest = new UpdateNotifyTemplateRequest();
        updateNotifyTemplateRequest.setId("");
        updateNotifyTemplateRequest.setName("");
        updateNotifyTemplateRequest.setSilencePeriods(new ArrayList<>());
        updateNotifyTemplateRequest.setReceivers(new ArrayList<>());
        updateNotifyTemplateRequest.setCallbacks(new ArrayList<>());
        UpdateNotifyTemplateResponse response = bcmClient.updateNotifyTemplate(updateNotifyTemplateRequest);
        System.out.println(response);
    }
}
