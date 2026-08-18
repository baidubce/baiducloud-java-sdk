package com.baidubce.finance.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.finance.FinanceClient;
import com.baidubce.finance.models.GetRenewResourceListRequest;
import com.baidubce.finance.models.GetRenewResourceListResponse;
import java.util.ArrayList;

public class ExampleGetRenewResourceList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        FinanceClient client = new FinanceClient(bceClientConfig);
        GetRenewResourceListRequest getRenewResourceListRequest = new GetRenewResourceListRequest();
        getRenewResourceListRequest.setQueryAccountId("");
        getRenewResourceListRequest.setServiceType("");
        getRenewResourceListRequest.setRegion("");
        getRenewResourceListRequest.setExpiredDays(0);
        getRenewResourceListRequest.setShortOrInstanceIds(new ArrayList<>());
        getRenewResourceListRequest.setPageNo(0);
        getRenewResourceListRequest.setPageSize(0);
        try {
            GetRenewResourceListResponse response = client.getRenewResourceList(getRenewResourceListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
