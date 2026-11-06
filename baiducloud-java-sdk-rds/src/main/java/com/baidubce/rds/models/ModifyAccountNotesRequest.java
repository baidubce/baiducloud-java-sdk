package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyAccountNotesRequest extends BaseBceRequest {

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

    /**
    * 账号的描述信息
    */
    private String remark;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyAccountNotesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public ModifyAccountNotesRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public ModifyAccountNotesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }

}
