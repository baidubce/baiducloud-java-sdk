package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSecurityGroupRequest extends BaseBceRequest {

    /**
    * 安全组名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 安全组描述信息
    */
    private String desc;

    /**
    * 安全组所属的vpcId
    */
    private String vpcId;

    /**
    * 标签列表
    */
    private List<Tag> tags;

    /**
    * 安全组规则列表
    */
    private List<SecurityGroupRuleModel> rules;

    public String getName() {
        return name;
    }

    public CreateSecurityGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateSecurityGroupRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateSecurityGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateSecurityGroupRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<SecurityGroupRuleModel> getRules() {
        return rules;
    }

    public CreateSecurityGroupRequest setRules(List<SecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

}
