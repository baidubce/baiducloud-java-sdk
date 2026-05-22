package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateARegularSecurityGroupV2Request extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 创建的安全组的名字,支持大小写字母、数字、中文以及-\_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    /**
    * 安全组所属的VPC ID。
    */
    private String vpcId;

    /**
    * 对所创建的安全组的描述信息
    */
    private String desc;

    /**
    * 创建安全组时绑定的安全组规则列表
    */
    private List<SecurityGroupRuleModel> rules;

    /**
    * 创建安全组时绑定的标签列表
    */
    private List<TagModel> tags;

    public String getClientToken() {
        return clientToken;
    }

    public CreateARegularSecurityGroupV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateARegularSecurityGroupV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateARegularSecurityGroupV2Request setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateARegularSecurityGroupV2Request setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public List<SecurityGroupRuleModel> getRules() {
        return rules;
    }

    public CreateARegularSecurityGroupV2Request setRules(List<SecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateARegularSecurityGroupV2Request setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
