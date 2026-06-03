package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyAuthGroupRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 权限组id
    */
    private String authGroupId;

    /**
    * 所属 RapidFS 实例唯一 Id
    */
    private String instanceId;

    /**
    * 权限组名称
    */
    private String authGroupName;

    /**
    * 描述信息
    */
    private String description;

    /**
    * 修改之后的权限规则列表。默认权限组不允许增加或删除权限规则
    */
    private List<AuthInfo> authInfos;

    /**
    * 表示修改前的权限规则列表，默认不传。可与 authInfos 搭配使用实现条件更新的效果，如果请求的权限规则列表与产品侧记录不一致，返回 400
    */
    private List<AuthInfo> originalAuthInfos;

    public String getClientToken() {
        return clientToken;
    }

    public ModifyAuthGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAuthGroupId() {
        return authGroupId;
    }

    public ModifyAuthGroupRequest setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyAuthGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAuthGroupName() {
        return authGroupName;
    }

    public ModifyAuthGroupRequest setAuthGroupName(String authGroupName) {
        this.authGroupName = authGroupName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyAuthGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<AuthInfo> getAuthInfos() {
        return authInfos;
    }

    public ModifyAuthGroupRequest setAuthInfos(List<AuthInfo> authInfos) {
        this.authInfos = authInfos;
        return this;
    }

    public List<AuthInfo> getOriginalAuthInfos() {
        return originalAuthInfos;
    }

    public ModifyAuthGroupRequest setOriginalAuthInfos(List<AuthInfo> originalAuthInfos) {
        this.originalAuthInfos = originalAuthInfos;
        return this;
    }

}
