package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnterpriseSecurityGroupModel {
    /**
     * 企业安全组ID
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
     * 企业安全组创建时间
     */
    private String createdTime;

    /**
     * 企业安全组更新时间
     */
    private String updatedTime;

    /**
     * 企业安全组规则
     */
    private List<EnterpriseSecurityGroupRuleModel> rules;

    /**
     * 企业安全组绑定的标签列表
     */
    private List<TagModel> tags;

    public EnterpriseSecurityGroupModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public EnterpriseSecurityGroupModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EnterpriseSecurityGroupModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public EnterpriseSecurityGroupModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public EnterpriseSecurityGroupModel setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public EnterpriseSecurityGroupModel setRules(List<EnterpriseSecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

    public List<EnterpriseSecurityGroupRuleModel> getRules() {
        return this.rules;
    }

    public EnterpriseSecurityGroupModel setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "EnterpriseSecurityGroupModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime="
                + updatedTime + "\n" + "rules=" + rules + "\n" + "tags=" + tags + "\n" + "}";
    }

}