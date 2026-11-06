package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAccountListResponse extends BaseBceResponse {

    /**
    * Account对象
    */
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public QueryAccountListResponse setAccounts(List<Account> accounts) {
        this.accounts = accounts;
        return this;
    }

    @Override
    public String toString() {
        return "QueryAccountListResponse{" + "accounts=" + accounts + "\n" + "}";
    }

}
