package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetPermissionsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 要设置的账号名称。
    */
    private String userName;

    /**
    * 该账号设置的权限。1：读写；2：只读；
    */
    private Integer userType;

    public String getInstanceId() {
        return instanceId;
    }

    public SetPermissionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SetPermissionsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Integer getUserType() {
        return userType;
    }

    public SetPermissionsRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

}
