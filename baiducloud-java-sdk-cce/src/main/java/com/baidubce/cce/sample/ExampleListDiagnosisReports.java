package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.ListDiagnosisReportsRequest;
import com.baidubce.cce.models.ListDiagnosisReportsResponse;

public class ExampleListDiagnosisReports {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        ListDiagnosisReportsRequest listDiagnosisReportsRequest = new ListDiagnosisReportsRequest();
        listDiagnosisReportsRequest.setClusterID("");
        listDiagnosisReportsRequest.setPageNo(0);
        listDiagnosisReportsRequest.setPageSize(0);
        listDiagnosisReportsRequest.setOrder("");
        listDiagnosisReportsRequest.setOrderBy("");
        listDiagnosisReportsRequest.setResultFilter("");
        try {
            ListDiagnosisReportsResponse response = client.listDiagnosisReports(listDiagnosisReportsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
