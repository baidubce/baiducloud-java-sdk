package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAccountRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 要删除的账号名称。
    */
    private String userName;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public DeleteAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

}
