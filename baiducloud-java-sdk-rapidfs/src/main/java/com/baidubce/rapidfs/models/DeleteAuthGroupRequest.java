package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAuthGroupRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 所属 RapidFS 实例唯一 Id
    */
    private String instanceId;

    /**
    * 待删除的权限组id，**权限组有绑定数据源的情况下会删除失败**
    */
    private String authGroupId;

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAuthGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteAuthGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAuthGroupId() {
        return authGroupId;
    }

    public DeleteAuthGroupRequest setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

}
