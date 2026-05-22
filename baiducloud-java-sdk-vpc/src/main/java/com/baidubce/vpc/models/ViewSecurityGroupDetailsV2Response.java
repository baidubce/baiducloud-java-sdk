package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewSecurityGroupDetailsV2Response extends BaseBceResponse {

    /**
    * 安全组ID
    */
    private String id;

    /**
    * 安全组名称
    */
    private String name;

    /**
    * 安全组所属VPC的ID
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
    * 安全组版本
    */
    private Long sgVersion;

    /**
    * 安全组所关联的实例数目
    */
    private Integer bindInstanceNum;

    /**
    * 安全组规则信息，由SecurityGroupModel组成的集合
    */
    private List<SecurityGroupRuleModel> rules;

    /**
    * 标签信息，由Tag组成的集合
    */
    private List<TagModel> tags;

    public String getId() {
        return id;
    }

    public ViewSecurityGroupDetailsV2Response setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ViewSecurityGroupDetailsV2Response setName(String name) {
        this.name = name;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public ViewSecurityGroupDetailsV2Response setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ViewSecurityGroupDetailsV2Response setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public ViewSecurityGroupDetailsV2Response setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Long getSgVersion() {
        return sgVersion;
    }

    public ViewSecurityGroupDetailsV2Response setSgVersion(Long sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public Integer getBindInstanceNum() {
        return bindInstanceNum;
    }

    public ViewSecurityGroupDetailsV2Response setBindInstanceNum(Integer bindInstanceNum) {
        this.bindInstanceNum = bindInstanceNum;
        return this;
    }

    public List<SecurityGroupRuleModel> getRules() {
        return rules;
    }

    public ViewSecurityGroupDetailsV2Response setRules(List<SecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public ViewSecurityGroupDetailsV2Response setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "ViewSecurityGroupDetailsV2Response{" + "id=" + id + "\n" + "name=" + name + "\n" + "vpcId=" + vpcId + "\n" + "desc=" + desc + "\n" + "createdTime=" + createdTime
                + "\n" + "sgVersion=" + sgVersion + "\n" + "bindInstanceNum=" + bindInstanceNum + "\n" + "rules=" + rules + "\n" + "tags=" + tags + "\n" + "}";
    }

}
