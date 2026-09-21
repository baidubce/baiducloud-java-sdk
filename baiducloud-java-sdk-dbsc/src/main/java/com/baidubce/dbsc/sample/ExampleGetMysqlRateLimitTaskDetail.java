package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMysqlRateLimitTaskDetailRequest;
import com.baidubce.dbsc.models.GetMysqlRateLimitTaskDetailResponse;

public class ExampleGetMysqlRateLimitTaskDetail {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMysqlRateLimitTaskDetailRequest getMysqlRateLimitTaskDetailRequest = new GetMysqlRateLimitTaskDetailRequest();
        getMysqlRateLimitTaskDetailRequest.setFilterId(0);
        try {
            GetMysqlRateLimitTaskDetailResponse response = client.getMysqlRateLimitTaskDetail(getMysqlRateLimitTaskDetailRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
