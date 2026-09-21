package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.GetReportListRequest;
import com.baidubce.cce.models.GetReportListResponse;

public class ExampleGetReportList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        GetReportListRequest getReportListRequest = new GetReportListRequest();
        getReportListRequest.setClusterID("");
        getReportListRequest.setOrder("");
        getReportListRequest.setOrderBy("");
        getReportListRequest.setInspectionType("");
        getReportListRequest.setInspectionStatus("");
        try {
            GetReportListResponse response = client.getReportList(getReportListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
