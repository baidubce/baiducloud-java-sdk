package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAuthGroupRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 权限组名
    */
    private String authGroupName;

    /**
    * 所属 rapidFS 实例ID
    */
    private String instanceId;

    /**
    * 权限组实例描述信息
    */
    private String description;

    /**
    * 待创建权限组具体权限列表，AuthInfo结构详见附录。如果请求中的 authInfos 不包含 cidr 为 "0.0.0.0/0" 的权限规则，则产品后端会**额外**创建默认权限规则 { cidr: "0.0.0.0/0" mode: "ReadWrite" description: "allow read/write in
    * default, cannot be deleted" }
    */
    private List<AuthInfo> authInfos;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAuthGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAuthGroupName() {
        return authGroupName;
    }

    public CreateAuthGroupRequest setAuthGroupName(String authGroupName) {
        this.authGroupName = authGroupName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateAuthGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAuthGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<AuthInfo> getAuthInfos() {
        return authInfos;
    }

    public CreateAuthGroupRequest setAuthInfos(List<AuthInfo> authInfos) {
        this.authInfos = authInfos;
        return this;
    }

}
