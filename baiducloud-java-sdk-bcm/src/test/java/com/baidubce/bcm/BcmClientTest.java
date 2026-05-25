package com.baidubce.bcm;

import com.baidubce.bcm.models.DescribeDbStatementV3Request;
import com.baidubce.bcm.models.DescribeDbStatementV3Response;
import com.baidubce.bcm.models.DescribeDimensionValuesRequest;
import com.baidubce.bcm.models.DescribeDimensionValuesResponse;
import com.baidubce.bcm.models.DescribeExceptionsV3Request;
import com.baidubce.bcm.models.DescribeExceptionsV3Response;
import com.baidubce.bcm.models.DescribeLLMDimensionValuesV3Request;
import com.baidubce.bcm.models.DescribeLLMDimensionValuesV3Response;
import com.baidubce.bcm.models.DescribeLLMMetricDataV3Request;
import com.baidubce.bcm.models.DescribeLLMServicesV3Request;
import com.baidubce.bcm.models.DescribeLLMServicesV3Response;
import com.baidubce.bcm.models.DescribeLLMSessionV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionV3Response;
import com.baidubce.bcm.models.DescribeLLMSessionsStatisticsV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionsStatisticsV3Response;
import com.baidubce.bcm.models.DescribeLLMSessionsV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionsV3Response;
import com.baidubce.bcm.models.DescribeLLMSpansV3Request;
import com.baidubce.bcm.models.DescribeLLMSpansV3Response;
import com.baidubce.bcm.models.DescribeLLMTraceV3Request;
import com.baidubce.bcm.models.DescribeLLMTraceV3Response;
import com.baidubce.bcm.models.DescribeLLMTracesStatisticsV3Request;
import com.baidubce.bcm.models.DescribeLLMTracesStatisticsV3Response;
import com.baidubce.bcm.models.DescribeLLMTracesV3Request;
import com.baidubce.bcm.models.DescribeLLMTracesV3Response;
import com.baidubce.bcm.models.DescribeMetricDataRequest;
import com.baidubce.bcm.models.DescribeMetricDataResponse;
import com.baidubce.bcm.models.DescribeSpanFieldValuesV3Request;
import com.baidubce.bcm.models.DescribeSpanFieldValuesV3Response;
import com.baidubce.bcm.models.DescribeSpansV3Request;
import com.baidubce.bcm.models.DescribeSpansV3Response;
import com.baidubce.bcm.models.DescribeTopologyV3Request;
import com.baidubce.bcm.models.DescribeTopologyV3Response;
import com.baidubce.bcm.models.DescribeTraceMetricDataV3Request;
import com.baidubce.bcm.models.DescribeTraceMetricDataV3Response;
import com.baidubce.bcm.models.DescribeTraceV3Request;
import com.baidubce.bcm.models.DescribeTraceV3Response;
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
     * describeDbStatementV3
     *
     */
    @Test
    public void describeDbStatementV3Test() {
        DescribeDbStatementV3Request describeDbStatementV3Request = new DescribeDbStatementV3Request();
        describeDbStatementV3Request.setBeginDatetime("");
        describeDbStatementV3Request.setEndDatetime("");
        describeDbStatementV3Request.setService("");
        describeDbStatementV3Request.setStatements(new ArrayList<>());
        DescribeDbStatementV3Response response = bcmClient.describeDbStatementV3(describeDbStatementV3Request);
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
        DescribeDimensionValuesResponse response = bcmClient.describeDimensionValues(describeDimensionValuesRequest);
        System.out.println(response);
    }
    /**
     * describeExceptionsV3
     *
     */
    @Test
    public void describeExceptionsV3Test() {
        DescribeExceptionsV3Request describeExceptionsV3Request = new DescribeExceptionsV3Request();
        describeExceptionsV3Request.setBeginDatetime("");
        describeExceptionsV3Request.setEndDatetime("");
        describeExceptionsV3Request.setService("");
        describeExceptionsV3Request.setExceptions(new ArrayList<>());
        DescribeExceptionsV3Response response = bcmClient.describeExceptionsV3(describeExceptionsV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMDimensionValuesV3
     *
     */
    @Test
    public void describeLLMDimensionValuesV3Test() {
        DescribeLLMDimensionValuesV3Request describeLLMDimensionValuesV3Request = new DescribeLLMDimensionValuesV3Request();
        describeLLMDimensionValuesV3Request.setBeginDatetime("");
        describeLLMDimensionValuesV3Request.setEndDatetime("");
        describeLLMDimensionValuesV3Request.setKey("");
        describeLLMDimensionValuesV3Request.setFilters(new ArrayList<>());
        DescribeLLMDimensionValuesV3Response response = bcmClient.describeLLMDimensionValuesV3(describeLLMDimensionValuesV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMMetricDataV3
     *
     */
    @Test
    public void describeLLMMetricDataV3Test() {
        DescribeLLMMetricDataV3Request describeLLMMetricDataV3Request = new DescribeLLMMetricDataV3Request();
        describeLLMMetricDataV3Request.setBeginDatetime("");
        describeLLMMetricDataV3Request.setEndDatetime("");
        describeLLMMetricDataV3Request.setMetrics(new ArrayList<>());
        describeLLMMetricDataV3Request.setFilters(new ArrayList<>());
        describeLLMMetricDataV3Request.setGroupBy(new ArrayList<>());
        describeLLMMetricDataV3Request.setOrderBy("");
        describeLLMMetricDataV3Request.setOrder("");
        describeLLMMetricDataV3Request.setLimit(0);
        describeLLMMetricDataV3Request.setPeriodSeconds(0);
        describeLLMMetricDataV3Request.setAggregate(new ArrayList<>());
        DescribeTraceMetricDataV3Response response = bcmClient.describeLLMMetricDataV3(describeLLMMetricDataV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMServicesV3
     *
     */
    @Test
    public void describeLLMServicesV3Test() {
        DescribeLLMServicesV3Request describeLLMServicesV3Request = new DescribeLLMServicesV3Request();
        describeLLMServicesV3Request.setBeginDatetime("");
        describeLLMServicesV3Request.setEndDatetime("");
        describeLLMServicesV3Request.setServiceName("");
        describeLLMServicesV3Request.setServiceId("");
        describeLLMServicesV3Request.setEnv("");
        describeLLMServicesV3Request.setTag(null);
        describeLLMServicesV3Request.setOrderBy("");
        describeLLMServicesV3Request.setOrder("");
        DescribeLLMServicesV3Response response = bcmClient.describeLLMServicesV3(describeLLMServicesV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMSessionV3
     *
     */
    @Test
    public void describeLLMSessionV3Test() {
        DescribeLLMSessionV3Request describeLLMSessionV3Request = new DescribeLLMSessionV3Request();
        describeLLMSessionV3Request.setSessionID("");
        describeLLMSessionV3Request.setBeginDatetime("");
        describeLLMSessionV3Request.setEndDatetime("");
        DescribeLLMSessionV3Response response = bcmClient.describeLLMSessionV3(describeLLMSessionV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMSessionsStatisticsV3
     *
     */
    @Test
    public void describeLLMSessionsStatisticsV3Test() {
        DescribeLLMSessionsStatisticsV3Request describeLLMSessionsStatisticsV3Request = new DescribeLLMSessionsStatisticsV3Request();
        describeLLMSessionsStatisticsV3Request.setBeginDatetime("");
        describeLLMSessionsStatisticsV3Request.setEndDatetime("");
        describeLLMSessionsStatisticsV3Request.setFilters(new ArrayList<>());
        DescribeLLMSessionsStatisticsV3Response response = bcmClient.describeLLMSessionsStatisticsV3(describeLLMSessionsStatisticsV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMSessionsV3
     *
     */
    @Test
    public void describeLLMSessionsV3Test() {
        DescribeLLMSessionsV3Request describeLLMSessionsV3Request = new DescribeLLMSessionsV3Request();
        describeLLMSessionsV3Request.setBeginDatetime("");
        describeLLMSessionsV3Request.setEndDatetime("");
        describeLLMSessionsV3Request.setFilters(new ArrayList<>());
        describeLLMSessionsV3Request.setOrderBy("");
        describeLLMSessionsV3Request.setOrder("");
        describeLLMSessionsV3Request.setPageNo(0);
        describeLLMSessionsV3Request.setPageSize(0);
        DescribeLLMSessionsV3Response response = bcmClient.describeLLMSessionsV3(describeLLMSessionsV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMSpansV3
     *
     */
    @Test
    public void describeLLMSpansV3Test() {
        DescribeLLMSpansV3Request describeLLMSpansV3Request = new DescribeLLMSpansV3Request();
        describeLLMSpansV3Request.setBeginDatetime("");
        describeLLMSpansV3Request.setEndDatetime("");
        describeLLMSpansV3Request.setParseLLMInputOutput(false);
        describeLLMSpansV3Request.setFilters(new ArrayList<>());
        describeLLMSpansV3Request.setOrderBy("");
        describeLLMSpansV3Request.setOrder("");
        describeLLMSpansV3Request.setMarker("");
        DescribeLLMSpansV3Response response = bcmClient.describeLLMSpansV3(describeLLMSpansV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMTraceV3
     *
     */
    @Test
    public void describeLLMTraceV3Test() {
        DescribeLLMTraceV3Request describeLLMTraceV3Request = new DescribeLLMTraceV3Request();
        describeLLMTraceV3Request.setBeginDatetime("");
        describeLLMTraceV3Request.setEndDatetime("");
        describeLLMTraceV3Request.setTraceId("");
        describeLLMTraceV3Request.setFilters(new ArrayList<>());
        describeLLMTraceV3Request.setReturnHeight(false);
        DescribeLLMTraceV3Response response = bcmClient.describeLLMTraceV3(describeLLMTraceV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMTracesStatisticsV3
     *
     */
    @Test
    public void describeLLMTracesStatisticsV3Test() {
        DescribeLLMTracesStatisticsV3Request describeLLMTracesStatisticsV3Request = new DescribeLLMTracesStatisticsV3Request();
        describeLLMTracesStatisticsV3Request.setBeginDatetime("");
        describeLLMTracesStatisticsV3Request.setEndDatetime("");
        describeLLMTracesStatisticsV3Request.setFilters(new ArrayList<>());
        DescribeLLMTracesStatisticsV3Response response = bcmClient.describeLLMTracesStatisticsV3(describeLLMTracesStatisticsV3Request);
        System.out.println(response);
    }
    /**
     * describeLLMTracesV3
     *
     */
    @Test
    public void describeLLMTracesV3Test() {
        DescribeLLMTracesV3Request describeLLMTracesV3Request = new DescribeLLMTracesV3Request();
        describeLLMTracesV3Request.setBeginDatetime("");
        describeLLMTracesV3Request.setEndDatetime("");
        describeLLMTracesV3Request.setFilters(new ArrayList<>());
        describeLLMTracesV3Request.setOrderBy("");
        describeLLMTracesV3Request.setOrder("");
        describeLLMTracesV3Request.setPageNo(0);
        describeLLMTracesV3Request.setPageSize(0);
        DescribeLLMTracesV3Response response = bcmClient.describeLLMTracesV3(describeLLMTracesV3Request);
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
        DescribeMetricDataResponse response = bcmClient.describeMetricData(describeMetricDataRequest);
        System.out.println(response);
    }
    /**
     * describeSpanFieldValuesV3
     *
     */
    @Test
    public void describeSpanFieldValuesV3Test() {
        DescribeSpanFieldValuesV3Request describeSpanFieldValuesV3Request = new DescribeSpanFieldValuesV3Request();
        describeSpanFieldValuesV3Request.setAction("");
        describeSpanFieldValuesV3Request.setBeginDatetime("");
        describeSpanFieldValuesV3Request.setEndDatetime("");
        describeSpanFieldValuesV3Request.setKey("");
        describeSpanFieldValuesV3Request.setFilters(new ArrayList<>());
        DescribeSpanFieldValuesV3Response response = bcmClient.describeSpanFieldValuesV3(describeSpanFieldValuesV3Request);
        System.out.println(response);
    }
    /**
     * describeSpansV3
     *
     */
    @Test
    public void describeSpansV3Test() {
        DescribeSpansV3Request describeSpansV3Request = new DescribeSpansV3Request();
        describeSpansV3Request.setAction("");
        describeSpansV3Request.setBeginDatetime("");
        describeSpansV3Request.setEndDatetime("");
        describeSpansV3Request.setFilters(new ArrayList<>());
        describeSpansV3Request.setOrderBy("");
        describeSpansV3Request.setOrder("");
        describeSpansV3Request.setMarker("");
        DescribeSpansV3Response response = bcmClient.describeSpansV3(describeSpansV3Request);
        System.out.println(response);
    }
    /**
     * describeTopologyV3
     *
     */
    @Test
    public void describeTopologyV3Test() {
        DescribeTopologyV3Request describeTopologyV3Request = new DescribeTopologyV3Request();
        describeTopologyV3Request.setAction("");
        describeTopologyV3Request.setServiceName("");
        describeTopologyV3Request.setEnv("");
        describeTopologyV3Request.setBeginDatetime("");
        describeTopologyV3Request.setEndDatetime("");
        DescribeTopologyV3Response response = bcmClient.describeTopologyV3(describeTopologyV3Request);
        System.out.println(response);
    }
    /**
     * describeTraceMetricDataV3
     *
     */
    @Test
    public void describeTraceMetricDataV3Test() {
        DescribeTraceMetricDataV3Request describeTraceMetricDataV3Request = new DescribeTraceMetricDataV3Request();
        describeTraceMetricDataV3Request.setAction("");
        describeTraceMetricDataV3Request.setBeginDatetime("");
        describeTraceMetricDataV3Request.setEndDatetime("");
        describeTraceMetricDataV3Request.setMetrics(new ArrayList<>());
        describeTraceMetricDataV3Request.setMetricsName("");
        describeTraceMetricDataV3Request.setFilters(new ArrayList<>());
        describeTraceMetricDataV3Request.setGroupBy(new ArrayList<>());
        describeTraceMetricDataV3Request.setPeriodSeconds(0);
        describeTraceMetricDataV3Request.setAggregate(new ArrayList<>());
        DescribeTraceMetricDataV3Response response = bcmClient.describeTraceMetricDataV3(describeTraceMetricDataV3Request);
        System.out.println(response);
    }
    /**
     * describeTraceV3
     *
     */
    @Test
    public void describeTraceV3Test() {
        DescribeTraceV3Request describeTraceV3Request = new DescribeTraceV3Request();
        describeTraceV3Request.setAction("");
        describeTraceV3Request.setSpanDatetime("");
        describeTraceV3Request.setBeginDatetime("");
        describeTraceV3Request.setEndDatetime("");
        describeTraceV3Request.setTraceId("");
        describeTraceV3Request.setFilters(new ArrayList<>());
        describeTraceV3Request.setReturnHeight(false);
        DescribeTraceV3Response response = bcmClient.describeTraceV3(describeTraceV3Request);
        System.out.println(response);
    }
}
