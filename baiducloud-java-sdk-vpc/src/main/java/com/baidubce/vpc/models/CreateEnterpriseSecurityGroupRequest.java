package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEnterpriseSecurityGroupRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 创建的企业安全组的名字,支持大小写字母、数字、中文以及-\_/.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    /**
    * 对所创建的企业安全组的描述信息
    */
    private String desc;

    /**
    * 创建企业安全组时绑定的安全组规则列表
    */
    private List<EnterpriseSecurityGroupRuleModel> rules;

    /**
    * 创建企业安全组时绑定的标签列表
    */
    private List<TagModel> tags;

    public String getClientToken() {
        return clientToken;
    }

    public CreateEnterpriseSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateEnterpriseSecurityGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateEnterpriseSecurityGroupRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public List<EnterpriseSecurityGroupRuleModel> getRules() {
        return rules;
    }

    public CreateEnterpriseSecurityGroupRequest setRules(List<EnterpriseSecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateEnterpriseSecurityGroupRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
