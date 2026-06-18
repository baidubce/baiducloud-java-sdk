package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySummaryOfMainAccountResponse extends BaseBceResponse {

    /**
    * 主账号id
    */
    private String accountId;

    /**
    * limitInfo
    */
    private AccountLimitInfo limitInfo;

    /**
    * countInfo
    */
    private AccountCountInfo countInfo;

    public String getAccountId() {
        return accountId;
    }

    public QuerySummaryOfMainAccountResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public AccountLimitInfo getLimitInfo() {
        return limitInfo;
    }

    public QuerySummaryOfMainAccountResponse setLimitInfo(AccountLimitInfo limitInfo) {
        this.limitInfo = limitInfo;
        return this;
    }

    public AccountCountInfo getCountInfo() {
        return countInfo;
    }

    public QuerySummaryOfMainAccountResponse setCountInfo(AccountCountInfo countInfo) {
        this.countInfo = countInfo;
        return this;
    }

    @Override
    public String toString() {
        return "QuerySummaryOfMainAccountResponse{" + "accountId=" + accountId + "\n" + "limitInfo=" + limitInfo + "\n" + "countInfo=" + countInfo + "\n" + "}";
    }

}
