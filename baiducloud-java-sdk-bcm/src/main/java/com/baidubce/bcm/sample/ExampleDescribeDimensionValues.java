package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeDimensionValuesRequest;
import com.baidubce.bcm.models.DescribeDimensionValuesResponse;
import java.util.ArrayList;

public class ExampleDescribeDimensionValues {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
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
        try {
            DescribeDimensionValuesResponse response = client.describeDimensionValues(describeDimensionValuesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
