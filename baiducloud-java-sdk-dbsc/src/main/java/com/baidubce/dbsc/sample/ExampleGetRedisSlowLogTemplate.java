package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetRedisSlowLogTemplateRequest;
import com.baidubce.dbsc.models.GetRedisSlowLogTemplateResponse;

public class ExampleGetRedisSlowLogTemplate {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetRedisSlowLogTemplateRequest getRedisSlowLogTemplateRequest = new GetRedisSlowLogTemplateRequest();
        getRedisSlowLogTemplateRequest.setNodeId("");
        getRedisSlowLogTemplateRequest.setStart("");
        getRedisSlowLogTemplateRequest.setEnd("");
        getRedisSlowLogTemplateRequest.setDbEngine("");
        getRedisSlowLogTemplateRequest.setPage(0);
        getRedisSlowLogTemplateRequest.setPageSize(0);
        getRedisSlowLogTemplateRequest.setOrderBy("");
        getRedisSlowLogTemplateRequest.setOrder("");
        try {
            GetRedisSlowLogTemplateResponse response = client.getRedisSlowLogTemplate(getRedisSlowLogTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
