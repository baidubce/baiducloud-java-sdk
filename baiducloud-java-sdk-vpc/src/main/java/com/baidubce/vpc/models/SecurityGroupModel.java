package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecurityGroupModel {
    /**
     * 安全组ID
     */
    private String id;

    /**
     * 名称,支持大小写字母、数字、中文以及-\_ /.特殊字符，必须以字母开头，长度1-65。
     */
    private String name;

    /**
     * 描述
     */
    private String desc;

    /**
     * 私有网络VPC ID
     */
    private String vpcId;

    /**
     * 安全组创建时间
     */
    private String createdTime;

    /**
     * 安全组版本号
     */
    private Long sgVersion;

    /**
     * 安全组规则
     */
    private List<SecurityGroupRuleModel> rules;

    /**
     * 安全组绑定的标签列表
     */
    private List<TagModel> tags;

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

    public SecurityGroupModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public SecurityGroupModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public SecurityGroupModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public SecurityGroupModel setSgVersion(Long sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public Long getSgVersion() {
        return this.sgVersion;
    }

    public SecurityGroupModel setRules(List<SecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

    public List<SecurityGroupRuleModel> getRules() {
        return this.rules;
    }

    public SecurityGroupModel setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "SecurityGroupModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "vpcId=" + vpcId + "\n" + "createdTime=" + createdTime + "\n"
                + "sgVersion=" + sgVersion + "\n" + "rules=" + rules + "\n" + "tags=" + tags + "\n" + "}";
    }

}