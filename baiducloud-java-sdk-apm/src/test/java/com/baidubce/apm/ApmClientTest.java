package com.baidubce.apm;

import com.baidubce.apm.models.ApmCreateAlarmPolicyRequest;
import com.baidubce.apm.models.ApmCreateAlarmPolicyResponse;
import com.baidubce.apm.models.ApmDeleteAlarmPolicyRequest;
import com.baidubce.apm.models.ApmDeleteAlarmPolicyResponse;
import com.baidubce.apm.models.ApmDescribeAlarmPoliciesRequest;
import com.baidubce.apm.models.ApmDescribeAlarmPoliciesResponse;
import com.baidubce.apm.models.ApmDescribeAlarmPolicyRequest;
import com.baidubce.apm.models.ApmDescribeAlarmPolicyResponse;
import com.baidubce.apm.models.ApmDescribeAlarmRequest;
import com.baidubce.apm.models.ApmDescribeAlarmResponse;
import com.baidubce.apm.models.ApmDescribeAlarmsRequest;
import com.baidubce.apm.models.ApmDescribeAlarmsResponse;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyActionRequest;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyActionResponse;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyRequest;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyResponse;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyStateRequest;
import com.baidubce.apm.models.ApmUpdateAlarmPolicyStateResponse;
import com.baidubce.apm.models.BindServiceTagRequest;
import com.baidubce.apm.models.BindServiceTagResponse;
import com.baidubce.apm.models.DeleteServicesRequest;
import com.baidubce.apm.models.DeleteServicesResponse;
import com.baidubce.apm.models.DescribeDbStatementRequest;
import com.baidubce.apm.models.DescribeDbStatementResponse;
import com.baidubce.apm.models.DescribeDefaultConfigResponse;
import com.baidubce.apm.models.DescribeDimensionValuesRequest;
import com.baidubce.apm.models.DescribeDimensionValuesResponse;
import com.baidubce.apm.models.DescribeEnvResponse;
import com.baidubce.apm.models.DescribeExceptionsRequest;
import com.baidubce.apm.models.DescribeExceptionsResponse;
import com.baidubce.apm.models.DescribeLLMDimensionValuesRequest;
import com.baidubce.apm.models.DescribeLLMDimensionValuesResponse;
import com.baidubce.apm.models.DescribeLLMMetricDataRequest;
import com.baidubce.apm.models.DescribeLLMMetricDataResponse;
import com.baidubce.apm.models.DescribeLLMServicesRequest;
import com.baidubce.apm.models.DescribeLLMServicesResponse;
import com.baidubce.apm.models.DescribeLLMSessionRequest;
import com.baidubce.apm.models.DescribeLLMSessionResponse;
import com.baidubce.apm.models.DescribeLLMSessionsRequest;
import com.baidubce.apm.models.DescribeLLMSessionsResponse;
import com.baidubce.apm.models.DescribeLLMSessionsStatisticsRequest;
import com.baidubce.apm.models.DescribeLLMSessionsStatisticsResponse;
import com.baidubce.apm.models.DescribeLLMSpansRequest;
import com.baidubce.apm.models.DescribeLLMSpansResponse;
import com.baidubce.apm.models.DescribeLLMTraceRequest;
import com.baidubce.apm.models.DescribeLLMTraceResponse;
import com.baidubce.apm.models.DescribeLLMTracesRequest;
import com.baidubce.apm.models.DescribeLLMTracesResponse;
import com.baidubce.apm.models.DescribeLLMTracesStatisticsRequest;
import com.baidubce.apm.models.DescribeLLMTracesStatisticsResponse;
import com.baidubce.apm.models.DescribeMetricDataRequest;
import com.baidubce.apm.models.DescribeMetricDataResponse;
import com.baidubce.apm.models.DescribeRetentionLimitResponse;
import com.baidubce.apm.models.DescribeServiceConfigRequest;
import com.baidubce.apm.models.DescribeServiceConfigResponse;
import com.baidubce.apm.models.DescribeServicesMetricsRequest;
import com.baidubce.apm.models.DescribeServicesMetricsResponse;
import com.baidubce.apm.models.DescribeServicesNamesRequest;
import com.baidubce.apm.models.DescribeServicesNamesResponse;
import com.baidubce.apm.models.DescribeSpanFieldValuesRequest;
import com.baidubce.apm.models.DescribeSpanFieldValuesResponse;
import com.baidubce.apm.models.DescribeSpansRequest;
import com.baidubce.apm.models.DescribeSpansResponse;
import com.baidubce.apm.models.DescribeTopologyRequest;
import com.baidubce.apm.models.DescribeTopologyResponse;
import com.baidubce.apm.models.DescribeTraceMetricDataRequest;
import com.baidubce.apm.models.DescribeTraceMetricDataResponse;
import com.baidubce.apm.models.DescribeTraceRequest;
import com.baidubce.apm.models.DescribeTraceResponse;
import com.baidubce.apm.models.UpdateServiceConfigRequest;
import com.baidubce.apm.models.UpdateServiceConfigResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for ApmClient
 */
public class ApmClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private ApmClient apmClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        apmClient = new ApmClient(config);
    }

    /**
     * apmCreateAlarmPolicy
     *
     */
    @Test
    public void apmCreateAlarmPolicyTest() {
        ApmCreateAlarmPolicyRequest apmCreateAlarmPolicyRequest = new ApmCreateAlarmPolicyRequest();
        apmCreateAlarmPolicyRequest.setName("");
        apmCreateAlarmPolicyRequest.setState("");
        apmCreateAlarmPolicyRequest.setTarget(null);
        apmCreateAlarmPolicyRequest.setMetricKind("");
        apmCreateAlarmPolicyRequest.setRule(null);
        apmCreateAlarmPolicyRequest.setFilters(new ArrayList<>());
        apmCreateAlarmPolicyRequest.setPendingCount(0);
        apmCreateAlarmPolicyRequest.setRenotifyIntervalInMinutes(0);
        apmCreateAlarmPolicyRequest.setRenotifyCount(0);
        apmCreateAlarmPolicyRequest.setNotifyRecovery(false);
        apmCreateAlarmPolicyRequest.setOnMissingData("");
        apmCreateAlarmPolicyRequest.setNoDataNotifyPendingIntervalInMinutes(0);
        apmCreateAlarmPolicyRequest.setLevel("");
        apmCreateAlarmPolicyRequest.setActions(new ArrayList<>());
        ApmCreateAlarmPolicyResponse response = apmClient.apmCreateAlarmPolicy(apmCreateAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * apmDeleteAlarmPolicy
     *
     */
    @Test
    public void apmDeleteAlarmPolicyTest() {
        ApmDeleteAlarmPolicyRequest apmDeleteAlarmPolicyRequest = new ApmDeleteAlarmPolicyRequest();
        apmDeleteAlarmPolicyRequest.setIds(new ArrayList<>());
        ApmDeleteAlarmPolicyResponse response = apmClient.apmDeleteAlarmPolicy(apmDeleteAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * apmDescribeAlarm
     *
     */
    @Test
    public void apmDescribeAlarmTest() {
        ApmDescribeAlarmRequest apmDescribeAlarmRequest = new ApmDescribeAlarmRequest();
        apmDescribeAlarmRequest.setId("");
        ApmDescribeAlarmResponse response = apmClient.apmDescribeAlarm(apmDescribeAlarmRequest);
        System.out.println(response);
    }
    /**
     * apmDescribeAlarmPolicies
     *
     */
    @Test
    public void apmDescribeAlarmPoliciesTest() {
        ApmDescribeAlarmPoliciesRequest apmDescribeAlarmPoliciesRequest = new ApmDescribeAlarmPoliciesRequest();
        apmDescribeAlarmPoliciesRequest.setPolicyName("");
        apmDescribeAlarmPoliciesRequest.setPolicyId("");
        apmDescribeAlarmPoliciesRequest.setState("");
        apmDescribeAlarmPoliciesRequest.setLevel("");
        apmDescribeAlarmPoliciesRequest.setMetricKind("");
        apmDescribeAlarmPoliciesRequest.setOrderBy("");
        apmDescribeAlarmPoliciesRequest.setOrder("");
        apmDescribeAlarmPoliciesRequest.setPageNo(0);
        apmDescribeAlarmPoliciesRequest.setPageSize(0);
        ApmDescribeAlarmPoliciesResponse response = apmClient.apmDescribeAlarmPolicies(apmDescribeAlarmPoliciesRequest);
        System.out.println(response);
    }
    /**
     * apmDescribeAlarmPolicy
     *
     */
    @Test
    public void apmDescribeAlarmPolicyTest() {
        ApmDescribeAlarmPolicyRequest apmDescribeAlarmPolicyRequest = new ApmDescribeAlarmPolicyRequest();
        apmDescribeAlarmPolicyRequest.setId("");
        ApmDescribeAlarmPolicyResponse response = apmClient.apmDescribeAlarmPolicy(apmDescribeAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * apmDescribeAlarms
     *
     */
    @Test
    public void apmDescribeAlarmsTest() {
        ApmDescribeAlarmsRequest apmDescribeAlarmsRequest = new ApmDescribeAlarmsRequest();
        apmDescribeAlarmsRequest.setBeginDatetime("");
        apmDescribeAlarmsRequest.setEndDatetime("");
        apmDescribeAlarmsRequest.setPolicyName("");
        apmDescribeAlarmsRequest.setLevel("");
        apmDescribeAlarmsRequest.setMetricKind("");
        apmDescribeAlarmsRequest.setState("");
        apmDescribeAlarmsRequest.setOrderBy("");
        apmDescribeAlarmsRequest.setOrder("");
        apmDescribeAlarmsRequest.setPageNo(0);
        apmDescribeAlarmsRequest.setPageSize(0);
        ApmDescribeAlarmsResponse response = apmClient.apmDescribeAlarms(apmDescribeAlarmsRequest);
        System.out.println(response);
    }
    /**
     * apmUpdateAlarmPolicy
     *
     */
    @Test
    public void apmUpdateAlarmPolicyTest() {
        ApmUpdateAlarmPolicyRequest apmUpdateAlarmPolicyRequest = new ApmUpdateAlarmPolicyRequest();
        apmUpdateAlarmPolicyRequest.setId("");
        apmUpdateAlarmPolicyRequest.setName("");
        apmUpdateAlarmPolicyRequest.setTarget(null);
        apmUpdateAlarmPolicyRequest.setMetricKind("");
        apmUpdateAlarmPolicyRequest.setRule(null);
        apmUpdateAlarmPolicyRequest.setFilters(new ArrayList<>());
        apmUpdateAlarmPolicyRequest.setPendingCount(0);
        apmUpdateAlarmPolicyRequest.setRenotifyIntervalInMinutes(0);
        apmUpdateAlarmPolicyRequest.setRenotifyCount(0);
        apmUpdateAlarmPolicyRequest.setNotifyRecovery(false);
        apmUpdateAlarmPolicyRequest.setOnMissingData("");
        apmUpdateAlarmPolicyRequest.setNoDataNotifyPendingIntervalInMinutes(0);
        apmUpdateAlarmPolicyRequest.setLevel("");
        apmUpdateAlarmPolicyRequest.setActions(new ArrayList<>());
        ApmUpdateAlarmPolicyResponse response = apmClient.apmUpdateAlarmPolicy(apmUpdateAlarmPolicyRequest);
        System.out.println(response);
    }
    /**
     * apmUpdateAlarmPolicyAction
     *
     */
    @Test
    public void apmUpdateAlarmPolicyActionTest() {
        ApmUpdateAlarmPolicyActionRequest apmUpdateAlarmPolicyActionRequest = new ApmUpdateAlarmPolicyActionRequest();
        apmUpdateAlarmPolicyActionRequest.setId("");
        apmUpdateAlarmPolicyActionRequest.setActions(new ArrayList<>());
        ApmUpdateAlarmPolicyActionResponse response = apmClient.apmUpdateAlarmPolicyAction(apmUpdateAlarmPolicyActionRequest);
        System.out.println(response);
    }
    /**
     * apmUpdateAlarmPolicyState
     *
     */
    @Test
    public void apmUpdateAlarmPolicyStateTest() {
        ApmUpdateAlarmPolicyStateRequest apmUpdateAlarmPolicyStateRequest = new ApmUpdateAlarmPolicyStateRequest();
        apmUpdateAlarmPolicyStateRequest.setIds(new ArrayList<>());
        apmUpdateAlarmPolicyStateRequest.setState("");
        ApmUpdateAlarmPolicyStateResponse response = apmClient.apmUpdateAlarmPolicyState(apmUpdateAlarmPolicyStateRequest);
        System.out.println(response);
    }
    /**
     * bindServiceTag
     *
     */
    @Test
    public void bindServiceTagTest() {
        BindServiceTagRequest bindServiceTagRequest = new BindServiceTagRequest();
        bindServiceTagRequest.setServiceName("");
        bindServiceTagRequest.setServiceId("");
        bindServiceTagRequest.setTags(new ArrayList<>());
        BindServiceTagResponse response = apmClient.bindServiceTag(bindServiceTagRequest);
        System.out.println(response);
    }
    /**
     * deleteServices
     *
     */
    @Test
    public void deleteServicesTest() {
        DeleteServicesRequest deleteServicesRequest = new DeleteServicesRequest();
        deleteServicesRequest.setServiceNames(new ArrayList<>());
        DeleteServicesResponse response = apmClient.deleteServices(deleteServicesRequest);
        System.out.println(response);
    }
    /**
     * describeDbStatement
     *
     */
    @Test
    public void describeDbStatementTest() {
        DescribeDbStatementRequest describeDbStatementRequest = new DescribeDbStatementRequest();
        describeDbStatementRequest.setBeginDatetime("");
        describeDbStatementRequest.setEndDatetime("");
        describeDbStatementRequest.setService("");
        describeDbStatementRequest.setStatements(new ArrayList<>());
        DescribeDbStatementResponse response = apmClient.describeDbStatement(describeDbStatementRequest);
        System.out.println(response);
    }
    /**
     * describeDefaultConfig
     *
     */
    @Test
    public void describeDefaultConfigTest() {
        DescribeDefaultConfigResponse response = apmClient.describeDefaultConfig();
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
        describeDimensionValuesRequest.setBeginDatetime("");
        describeDimensionValuesRequest.setEndDatetime("");
        describeDimensionValuesRequest.setDimensionKey("");
        describeDimensionValuesRequest.setFilters(new ArrayList<>());
        DescribeDimensionValuesResponse response = apmClient.describeDimensionValues(describeDimensionValuesRequest);
        System.out.println(response);
    }
    /**
     * describeEnv
     *
     */
    @Test
    public void describeEnvTest() {
        DescribeEnvResponse response = apmClient.describeEnv();
        System.out.println(response);
    }
    /**
     * describeExceptions
     *
     */
    @Test
    public void describeExceptionsTest() {
        DescribeExceptionsRequest describeExceptionsRequest = new DescribeExceptionsRequest();
        describeExceptionsRequest.setBeginDatetime("");
        describeExceptionsRequest.setEndDatetime("");
        describeExceptionsRequest.setService("");
        describeExceptionsRequest.setExceptions(new ArrayList<>());
        DescribeExceptionsResponse response = apmClient.describeExceptions(describeExceptionsRequest);
        System.out.println(response);
    }
    /**
     * describeLLMDimensionValues
     *
     */
    @Test
    public void describeLLMDimensionValuesTest() {
        DescribeLLMDimensionValuesRequest describeLLMDimensionValuesRequest = new DescribeLLMDimensionValuesRequest();
        describeLLMDimensionValuesRequest.setBeginDatetime("");
        describeLLMDimensionValuesRequest.setEndDatetime("");
        describeLLMDimensionValuesRequest.setKey("");
        describeLLMDimensionValuesRequest.setFilters(new ArrayList<>());
        DescribeLLMDimensionValuesResponse response = apmClient.describeLLMDimensionValues(describeLLMDimensionValuesRequest);
        System.out.println(response);
    }
    /**
     * describeLLMMetricData
     *
     */
    @Test
    public void describeLLMMetricDataTest() {
        DescribeLLMMetricDataRequest describeLLMMetricDataRequest = new DescribeLLMMetricDataRequest();
        describeLLMMetricDataRequest.setBeginDatetime("");
        describeLLMMetricDataRequest.setEndDatetime("");
        describeLLMMetricDataRequest.setMetrics(new ArrayList<>());
        describeLLMMetricDataRequest.setFilters(new ArrayList<>());
        describeLLMMetricDataRequest.setGroupBy(new ArrayList<>());
        describeLLMMetricDataRequest.setOrderBy("");
        describeLLMMetricDataRequest.setOrder("");
        describeLLMMetricDataRequest.setLimit(0);
        describeLLMMetricDataRequest.setPeriodSeconds(0);
        describeLLMMetricDataRequest.setAggregate(new ArrayList<>());
        DescribeLLMMetricDataResponse response = apmClient.describeLLMMetricData(describeLLMMetricDataRequest);
        System.out.println(response);
    }
    /**
     * describeLLMServices
     *
     */
    @Test
    public void describeLLMServicesTest() {
        DescribeLLMServicesRequest describeLLMServicesRequest = new DescribeLLMServicesRequest();
        describeLLMServicesRequest.setBeginDatetime("");
        describeLLMServicesRequest.setEndDatetime("");
        describeLLMServicesRequest.setServiceName("");
        describeLLMServicesRequest.setServiceId("");
        describeLLMServicesRequest.setEnv("");
        describeLLMServicesRequest.setTag(null);
        describeLLMServicesRequest.setOrderBy("");
        describeLLMServicesRequest.setOrder("");
        DescribeLLMServicesResponse response = apmClient.describeLLMServices(describeLLMServicesRequest);
        System.out.println(response);
    }
    /**
     * describeLLMSession
     *
     */
    @Test
    public void describeLLMSessionTest() {
        DescribeLLMSessionRequest describeLLMSessionRequest = new DescribeLLMSessionRequest();
        describeLLMSessionRequest.setSessionID("");
        describeLLMSessionRequest.setBeginDatetime("");
        describeLLMSessionRequest.setEndDatetime("");
        DescribeLLMSessionResponse response = apmClient.describeLLMSession(describeLLMSessionRequest);
        System.out.println(response);
    }
    /**
     * describeLLMSessions
     *
     */
    @Test
    public void describeLLMSessionsTest() {
        DescribeLLMSessionsRequest describeLLMSessionsRequest = new DescribeLLMSessionsRequest();
        describeLLMSessionsRequest.setBeginDatetime("");
        describeLLMSessionsRequest.setEndDatetime("");
        describeLLMSessionsRequest.setFilters(new ArrayList<>());
        describeLLMSessionsRequest.setOrderBy("");
        describeLLMSessionsRequest.setOrder("");
        describeLLMSessionsRequest.setPageNo(0);
        describeLLMSessionsRequest.setPageSize(0);
        DescribeLLMSessionsResponse response = apmClient.describeLLMSessions(describeLLMSessionsRequest);
        System.out.println(response);
    }
    /**
     * describeLLMSessionsStatistics
     *
     */
    @Test
    public void describeLLMSessionsStatisticsTest() {
        DescribeLLMSessionsStatisticsRequest describeLLMSessionsStatisticsRequest = new DescribeLLMSessionsStatisticsRequest();
        describeLLMSessionsStatisticsRequest.setBeginDatetime("");
        describeLLMSessionsStatisticsRequest.setEndDatetime("");
        describeLLMSessionsStatisticsRequest.setFilters(new ArrayList<>());
        DescribeLLMSessionsStatisticsResponse response = apmClient.describeLLMSessionsStatistics(describeLLMSessionsStatisticsRequest);
        System.out.println(response);
    }
    /**
     * describeLLMSpans
     *
     */
    @Test
    public void describeLLMSpansTest() {
        DescribeLLMSpansRequest describeLLMSpansRequest = new DescribeLLMSpansRequest();
        describeLLMSpansRequest.setBeginDatetime("");
        describeLLMSpansRequest.setEndDatetime("");
        describeLLMSpansRequest.setParseLLMInputOutput(false);
        describeLLMSpansRequest.setFilters(new ArrayList<>());
        describeLLMSpansRequest.setOrderBy("");
        describeLLMSpansRequest.setOrder("");
        describeLLMSpansRequest.setMarker("");
        DescribeLLMSpansResponse response = apmClient.describeLLMSpans(describeLLMSpansRequest);
        System.out.println(response);
    }
    /**
     * describeLLMTrace
     *
     */
    @Test
    public void describeLLMTraceTest() {
        DescribeLLMTraceRequest describeLLMTraceRequest = new DescribeLLMTraceRequest();
        describeLLMTraceRequest.setBeginDatetime("");
        describeLLMTraceRequest.setEndDatetime("");
        describeLLMTraceRequest.setTraceId("");
        describeLLMTraceRequest.setFilters(new ArrayList<>());
        describeLLMTraceRequest.setReturnHeight(false);
        DescribeLLMTraceResponse response = apmClient.describeLLMTrace(describeLLMTraceRequest);
        System.out.println(response);
    }
    /**
     * describeLLMTraces
     *
     */
    @Test
    public void describeLLMTracesTest() {
        DescribeLLMTracesRequest describeLLMTracesRequest = new DescribeLLMTracesRequest();
        describeLLMTracesRequest.setBeginDatetime("");
        describeLLMTracesRequest.setEndDatetime("");
        describeLLMTracesRequest.setFilters(new ArrayList<>());
        describeLLMTracesRequest.setOrderBy("");
        describeLLMTracesRequest.setOrder("");
        describeLLMTracesRequest.setPageNo(0);
        describeLLMTracesRequest.setPageSize(0);
        DescribeLLMTracesResponse response = apmClient.describeLLMTraces(describeLLMTracesRequest);
        System.out.println(response);
    }
    /**
     * describeLLMTracesStatistics
     *
     */
    @Test
    public void describeLLMTracesStatisticsTest() {
        DescribeLLMTracesStatisticsRequest describeLLMTracesStatisticsRequest = new DescribeLLMTracesStatisticsRequest();
        describeLLMTracesStatisticsRequest.setBeginDatetime("");
        describeLLMTracesStatisticsRequest.setEndDatetime("");
        describeLLMTracesStatisticsRequest.setFilters(new ArrayList<>());
        DescribeLLMTracesStatisticsResponse response = apmClient.describeLLMTracesStatistics(describeLLMTracesStatisticsRequest);
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
        describeMetricDataRequest.setMetrics(new ArrayList<>());
        describeMetricDataRequest.setMetricsName("");
        describeMetricDataRequest.setMetricsCompareTo(new ArrayList<>());
        describeMetricDataRequest.setMetricsFilters(new ArrayList<>());
        describeMetricDataRequest.setBeginDatetime("");
        describeMetricDataRequest.setEndDatetime("");
        describeMetricDataRequest.setFilters(new ArrayList<>());
        describeMetricDataRequest.setGroupBy(new ArrayList<>());
        describeMetricDataRequest.setOrderBy("");
        describeMetricDataRequest.setOrder("");
        describeMetricDataRequest.setLimit(0);
        describeMetricDataRequest.setPeriodSeconds(0);
        describeMetricDataRequest.setReserveEmptyDimensions(false);
        DescribeMetricDataResponse response = apmClient.describeMetricData(describeMetricDataRequest);
        System.out.println(response);
    }
    /**
     * describeRetentionLimit
     *
     */
    @Test
    public void describeRetentionLimitTest() {
        DescribeRetentionLimitResponse response = apmClient.describeRetentionLimit();
        System.out.println(response);
    }
    /**
     * describeServiceConfig
     *
     */
    @Test
    public void describeServiceConfigTest() {
        DescribeServiceConfigRequest describeServiceConfigRequest = new DescribeServiceConfigRequest();
        describeServiceConfigRequest.setServiceName("");
        DescribeServiceConfigResponse response = apmClient.describeServiceConfig(describeServiceConfigRequest);
        System.out.println(response);
    }
    /**
     * describeServicesMetrics
     *
     */
    @Test
    public void describeServicesMetricsTest() {
        DescribeServicesMetricsRequest describeServicesMetricsRequest = new DescribeServicesMetricsRequest();
        describeServicesMetricsRequest.setBeginDatetime("");
        describeServicesMetricsRequest.setEndDatetime("");
        describeServicesMetricsRequest.setServices(new ArrayList<>());
        describeServicesMetricsRequest.setMetrics(new ArrayList<>());
        describeServicesMetricsRequest.setMetricFilters(new ArrayList<>());
        DescribeServicesMetricsResponse response = apmClient.describeServicesMetrics(describeServicesMetricsRequest);
        System.out.println(response);
    }
    /**
     * describeServicesNames
     *
     */
    @Test
    public void describeServicesNamesTest() {
        DescribeServicesNamesRequest describeServicesNamesRequest = new DescribeServicesNamesRequest();
        describeServicesNamesRequest.setBeginDatetime("");
        describeServicesNamesRequest.setEndDatetime("");
        describeServicesNamesRequest.setServiceName("");
        describeServicesNamesRequest.setServiceId("");
        describeServicesNamesRequest.setLanguage("");
        describeServicesNamesRequest.setEnv("");
        describeServicesNamesRequest.setSource("");
        describeServicesNamesRequest.setTag(null);
        describeServicesNamesRequest.setOrderBy("");
        describeServicesNamesRequest.setOrder("");
        describeServicesNamesRequest.setMetricFilters(new ArrayList<>());
        DescribeServicesNamesResponse response = apmClient.describeServicesNames(describeServicesNamesRequest);
        System.out.println(response);
    }
    /**
     * describeSpanFieldValues
     *
     */
    @Test
    public void describeSpanFieldValuesTest() {
        DescribeSpanFieldValuesRequest describeSpanFieldValuesRequest = new DescribeSpanFieldValuesRequest();
        describeSpanFieldValuesRequest.setAction("");
        describeSpanFieldValuesRequest.setBeginDatetime("");
        describeSpanFieldValuesRequest.setEndDatetime("");
        describeSpanFieldValuesRequest.setKey("");
        describeSpanFieldValuesRequest.setFilters(new ArrayList<>());
        DescribeSpanFieldValuesResponse response = apmClient.describeSpanFieldValues(describeSpanFieldValuesRequest);
        System.out.println(response);
    }
    /**
     * describeSpans
     *
     */
    @Test
    public void describeSpansTest() {
        DescribeSpansRequest describeSpansRequest = new DescribeSpansRequest();
        describeSpansRequest.setAction("");
        describeSpansRequest.setBeginDatetime("");
        describeSpansRequest.setEndDatetime("");
        describeSpansRequest.setFilters(new ArrayList<>());
        describeSpansRequest.setOrderBy("");
        describeSpansRequest.setOrder("");
        describeSpansRequest.setMarker("");
        DescribeSpansResponse response = apmClient.describeSpans(describeSpansRequest);
        System.out.println(response);
    }
    /**
     * describeTopology
     *
     */
    @Test
    public void describeTopologyTest() {
        DescribeTopologyRequest describeTopologyRequest = new DescribeTopologyRequest();
        describeTopologyRequest.setAction("");
        describeTopologyRequest.setServiceName("");
        describeTopologyRequest.setEnv("");
        describeTopologyRequest.setBeginDatetime("");
        describeTopologyRequest.setEndDatetime("");
        DescribeTopologyResponse response = apmClient.describeTopology(describeTopologyRequest);
        System.out.println(response);
    }
    /**
     * describeTrace
     *
     */
    @Test
    public void describeTraceTest() {
        DescribeTraceRequest describeTraceRequest = new DescribeTraceRequest();
        describeTraceRequest.setAction("");
        describeTraceRequest.setSpanDatetime("");
        describeTraceRequest.setBeginDatetime("");
        describeTraceRequest.setEndDatetime("");
        describeTraceRequest.setTraceId("");
        describeTraceRequest.setFilters(new ArrayList<>());
        describeTraceRequest.setReturnHeight(false);
        DescribeTraceResponse response = apmClient.describeTrace(describeTraceRequest);
        System.out.println(response);
    }
    /**
     * describeTraceMetricData
     *
     */
    @Test
    public void describeTraceMetricDataTest() {
        DescribeTraceMetricDataRequest describeTraceMetricDataRequest = new DescribeTraceMetricDataRequest();
        describeTraceMetricDataRequest.setAction("");
        describeTraceMetricDataRequest.setBeginDatetime("");
        describeTraceMetricDataRequest.setEndDatetime("");
        describeTraceMetricDataRequest.setMetrics(new ArrayList<>());
        describeTraceMetricDataRequest.setMetricsName("");
        describeTraceMetricDataRequest.setFilters(new ArrayList<>());
        describeTraceMetricDataRequest.setGroupBy(new ArrayList<>());
        describeTraceMetricDataRequest.setPeriodSeconds(0);
        describeTraceMetricDataRequest.setAggregate(new ArrayList<>());
        DescribeTraceMetricDataResponse response = apmClient.describeTraceMetricData(describeTraceMetricDataRequest);
        System.out.println(response);
    }
    /**
     * updateServiceConfig
     *
     */
    @Test
    public void updateServiceConfigTest() {
        UpdateServiceConfigRequest updateServiceConfigRequest = new UpdateServiceConfigRequest();
        updateServiceConfigRequest.setServiceNames(new ArrayList<>());
        updateServiceConfigRequest.setSampleConfig(null);
        updateServiceConfigRequest.setLoggingConfig(null);
        updateServiceConfigRequest.setRequestConfig(null);
        updateServiceConfigRequest.setTopoConfig(null);
        updateServiceConfigRequest.setMllmResourceDumpConfig(null);
        UpdateServiceConfigResponse response = apmClient.updateServiceConfig(updateServiceConfigRequest);
        System.out.println(response);
    }
}
