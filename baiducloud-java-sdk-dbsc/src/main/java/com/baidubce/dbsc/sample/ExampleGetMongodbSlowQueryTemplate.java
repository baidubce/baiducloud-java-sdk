package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMongodbSlowQueryTemplateRequest;
import com.baidubce.dbsc.models.GetMongodbSlowQueryTemplateResponse;

public class ExampleGetMongodbSlowQueryTemplate {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMongodbSlowQueryTemplateRequest getMongodbSlowQueryTemplateRequest = new GetMongodbSlowQueryTemplateRequest();
        getMongodbSlowQueryTemplateRequest.setStart("");
        getMongodbSlowQueryTemplateRequest.setEnd("");
        getMongodbSlowQueryTemplateRequest.setNodeId("");
        getMongodbSlowQueryTemplateRequest.setUsers("");
        getMongodbSlowQueryTemplateRequest.setDbNames("");
        getMongodbSlowQueryTemplateRequest.setClientIps("");
        getMongodbSlowQueryTemplateRequest.setFingerprintMd5("");
        getMongodbSlowQueryTemplateRequest.setNamespace("");
        getMongodbSlowQueryTemplateRequest.setOrderBy("");
        getMongodbSlowQueryTemplateRequest.setOrder("");
        getMongodbSlowQueryTemplateRequest.setPage(0);
        getMongodbSlowQueryTemplateRequest.setPageSize(0);
        try {
            GetMongodbSlowQueryTemplateResponse response = client.getMongodbSlowQueryTemplate(getMongodbSlowQueryTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
