package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAccountDetailsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * accountName
    */
    @JsonIgnore
    private String accountName;

    public String getInstanceId() {
        return instanceId;
    }

    public QueryAccountDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public QueryAccountDetailsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

}
