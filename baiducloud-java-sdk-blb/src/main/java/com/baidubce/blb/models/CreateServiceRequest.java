package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateServiceRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 服务发布点的名称，大小写字母、数字以及-_/.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 服务发布点的描述，最大支持200字符
    */
    private String description;

    /**
    * 对应服务名称,大小写字母、数字长度1-65
    */
    private String serviceName;

    /**
    * 绑定实例id，当前只支持绑定blb
    */
    private String instanceId;

    /**
    * 用户授权列表，默认拒绝所有
    */
    private List<Auth> authList;

    public String getClientToken() {
        return clientToken;
    }

    public CreateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateServiceRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public CreateServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<Auth> getAuthList() {
        return authList;
    }

    public CreateServiceRequest setAuthList(List<Auth> authList) {
        this.authList = authList;
        return this;
    }

}
