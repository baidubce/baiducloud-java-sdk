package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceNameResponse extends BaseBceResponse {

    /**
    * 实例ID
    */
    private String id;

    /**
    * 实例名称
    */
    private String name;

    /**
    * 实例类型
    */
    private String instanceType;

    /**
    * 公共访问地址
    */
    private String publicURL;

    /**
    * 地域
    */
    private String region;

    /**
    * 实例状态
    */
    private String status;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * tags
    */
    private LogicalTag tags;

    public String getId() {
        return id;
    }

    public UpdateInstanceNameResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateInstanceNameResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public UpdateInstanceNameResponse setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getPublicURL() {
        return publicURL;
    }

    public UpdateInstanceNameResponse setPublicURL(String publicURL) {
        this.publicURL = publicURL;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public UpdateInstanceNameResponse setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdateInstanceNameResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public UpdateInstanceNameResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public LogicalTag getTags() {
        return tags;
    }

    public UpdateInstanceNameResponse setTags(LogicalTag tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateInstanceNameResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "instanceType=" + instanceType + "\n" + "publicURL=" + publicURL + "\n" + "region="
                + region + "\n" + "status=" + status + "\n" + "createTime=" + createTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}
