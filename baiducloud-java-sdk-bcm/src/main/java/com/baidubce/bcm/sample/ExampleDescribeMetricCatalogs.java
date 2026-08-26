package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeMetricCatalogsRequest;
import com.baidubce.bcm.models.DescribeMetricCatalogsResponse;
import java.util.ArrayList;

public class ExampleDescribeMetricCatalogs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeMetricCatalogsRequest describeMetricCatalogsRequest = new DescribeMetricCatalogsRequest();
        describeMetricCatalogsRequest.setLocale("");
        describeMetricCatalogsRequest.setScope("");
        describeMetricCatalogsRequest.setResourceType("");
        describeMetricCatalogsRequest.setCatalog("");
        describeMetricCatalogsRequest.setFilters(new ArrayList<>());
        describeMetricCatalogsRequest.setFiltersKey("");
        describeMetricCatalogsRequest.setFiltersOp("");
        describeMetricCatalogsRequest.setFiltersValue("");
        describeMetricCatalogsRequest.setFiltersValues(new ArrayList<>());
        describeMetricCatalogsRequest.setIncludingDimensions(new ArrayList<>());
        describeMetricCatalogsRequest.setExcludingDimensions(new ArrayList<>());
        try {
            DescribeMetricCatalogsResponse response = client.describeMetricCatalogs(describeMetricCatalogsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
