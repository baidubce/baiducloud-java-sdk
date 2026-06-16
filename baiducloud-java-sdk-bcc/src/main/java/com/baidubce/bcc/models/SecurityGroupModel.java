package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecurityGroupModel {
    /**
     * 安全组ID
     */
    private String id;

    /**
     * 安全组名称
     */
    private String name;

    /**
     * 安全组所属VPC ID
     */
    private String vpcId;

    /**
     * 安全组描述
     */
    private String desc;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 更新时间
     */
    private String updatedTime;

    /**
     * 安全组版本号
     */
    private Integer sgVersion;

    /**
     * 安全组规则列表
     */
    private List<SecurityGroupRuleModel> rules;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    public SecurityGroupModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public SecurityGroupModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SecurityGroupModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public SecurityGroupModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public SecurityGroupModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public SecurityGroupModel setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public SecurityGroupModel setSgVersion(Integer sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public Integer getSgVersion() {
        return this.sgVersion;
    }

    public SecurityGroupModel setRules(List<SecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

    public List<SecurityGroupRuleModel> getRules() {
        return this.rules;
    }

    public SecurityGroupModel setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "SecurityGroupModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "vpcId=" + vpcId + "\n" + "desc=" + desc + "\n" + "createdTime=" + createdTime + "\n"
                + "updatedTime=" + updatedTime + "\n" + "sgVersion=" + sgVersion + "\n" + "rules=" + rules + "\n" + "tags=" + tags + "\n" + "}";
    }

}