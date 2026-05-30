package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePfsRequest extends BaseBceRequest {

    /**
    * 实例名称<br>• 长度为1~128个英文或中文字符。<br>• 必须以大小字母或中文开头。<br>• 可以包含数字、中文、半角冒号（:）、下划线（_）或者短划线（-）
    */
    private String name;

    /**
    * 可选类型包括：base、basic、baseX、plus、plus2、plusl2X
    */
    private String instanceType;

    /**
    * 购买文件系统存储容量大小，详情见容量限制表（单位GB）
    */
    private Integer capacity;

    /**
    * 子网短ID
    */
    private String subnetId;

    /**
    * 实例描述
    */
    private String description;

    /**
    * 实例标签
    */
    private List<Tag> tags;

    public String getName() {
        return name;
    }

    public CreatePfsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public CreatePfsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public CreatePfsRequest setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreatePfsRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreatePfsRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreatePfsRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
