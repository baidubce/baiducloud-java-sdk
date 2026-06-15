package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeInstanceGroupResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 实例组ID
    */
    private String id;

    /**
    * 云产品类型
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * 实例组名称
    */
    private String name;

    /**
    * 实例列表
    */
    private List<InstanceGroupInstance> instances;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeInstanceGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeInstanceGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeInstanceGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public DescribeInstanceGroupResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeInstanceGroupResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeInstanceGroupResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeInstanceGroupResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<InstanceGroupInstance> getInstances() {
        return instances;
    }

    public DescribeInstanceGroupResponse setInstances(List<InstanceGroupInstance> instances) {
        this.instances = instances;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeInstanceGroupResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "scope=" + scope + "\n"
                + "resourceType=" + resourceType + "\n" + "name=" + name + "\n" + "instances=" + instances + "\n" + "}";
    }

}
