package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeAlarmMaskingsRequest;
import com.baidubce.bcm.models.DescribeAlarmMaskingsResponse;

public class ExampleDescribeAlarmMaskings {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeAlarmMaskingsRequest describeAlarmMaskingsRequest = new DescribeAlarmMaskingsRequest();
        describeAlarmMaskingsRequest.setMaskingName("");
        describeAlarmMaskingsRequest.setMaskingId("");
        describeAlarmMaskingsRequest.setOrder("");
        describeAlarmMaskingsRequest.setOrderBy("");
        describeAlarmMaskingsRequest.setPageNo(0);
        describeAlarmMaskingsRequest.setPageSize(0);
        try {
            DescribeAlarmMaskingsResponse response = client.describeAlarmMaskings(describeAlarmMaskingsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
