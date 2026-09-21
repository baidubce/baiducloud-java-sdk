package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountListUsingGETResponse extends BaseBceResponse {

    /**
    * usernames
    */
    private List<Account> usernames;

    public List<Account> getUsernames() {
        return usernames;
    }

    public AccountListUsingGETResponse setUsernames(List<Account> usernames) {
        this.usernames = usernames;
        return this;
    }

    @Override
    public String toString() {
        return "AccountListUsingGETResponse{" + "usernames=" + usernames + "\n" + "}";
    }

}
