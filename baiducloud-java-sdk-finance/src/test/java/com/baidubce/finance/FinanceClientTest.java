package com.baidubce.finance;

import com.baidubce.finance.models.CreateRenewResourceRuleRequest;
import com.baidubce.finance.models.GetRenewResourceListRequest;
import com.baidubce.finance.models.GetRenewResourceListResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for FinanceClient
 */
public class FinanceClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private FinanceClient financeClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        config.setCredentials(new DefaultBceCredentials(AK, SK));

        financeClient = new FinanceClient(config);
    }

    /**
     * createRenewResourceRule
     *
     */
    @Test
    public void createRenewResourceRuleTest() {
        CreateRenewResourceRuleRequest createRenewResourceRuleRequest = new CreateRenewResourceRuleRequest();
        createRenewResourceRuleRequest.setAccountId("");
        createRenewResourceRuleRequest.setServiceType("");
        createRenewResourceRuleRequest.setRegion("");
        createRenewResourceRuleRequest.setInstanceId("");
        createRenewResourceRuleRequest.setRenewTimeUnit("");
        createRenewResourceRuleRequest.setRenewTime("");
        financeClient.createRenewResourceRule(createRenewResourceRuleRequest);
    }
    /**
     * getRenewResourceList
     *
     */
    @Test
    public void getRenewResourceListTest() {
        GetRenewResourceListRequest getRenewResourceListRequest = new GetRenewResourceListRequest();
        getRenewResourceListRequest.setQueryAccountId("");
        getRenewResourceListRequest.setServiceType("");
        getRenewResourceListRequest.setRegion("");
        getRenewResourceListRequest.setExpiredDays(0);
        getRenewResourceListRequest.setShortOrInstanceIds(new ArrayList<>());
        getRenewResourceListRequest.setPageNo(0);
        getRenewResourceListRequest.setPageSize(0);
        GetRenewResourceListResponse response = financeClient.getRenewResourceList(getRenewResourceListRequest);
        System.out.println(response);
    }
}
