package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMysqlSlowLogTemplateRequest;
import com.baidubce.dbsc.models.GetMysqlSlowLogTemplateResponse;

public class ExampleGetMysqlSlowLogTemplate {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMysqlSlowLogTemplateRequest getMysqlSlowLogTemplateRequest = new GetMysqlSlowLogTemplateRequest();
        getMysqlSlowLogTemplateRequest.setStart("");
        getMysqlSlowLogTemplateRequest.setEnd("");
        getMysqlSlowLogTemplateRequest.setNodeId("");
        getMysqlSlowLogTemplateRequest.setUsers("");
        getMysqlSlowLogTemplateRequest.setDbNames("");
        getMysqlSlowLogTemplateRequest.setClientIps("");
        getMysqlSlowLogTemplateRequest.setFingerprintMd5("");
        getMysqlSlowLogTemplateRequest.setOrderBy("");
        getMysqlSlowLogTemplateRequest.setOrder("");
        getMysqlSlowLogTemplateRequest.setPage(0);
        getMysqlSlowLogTemplateRequest.setPageSize(0);
        try {
            GetMysqlSlowLogTemplateResponse response = client.getMysqlSlowLogTemplate(getMysqlSlowLogTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
