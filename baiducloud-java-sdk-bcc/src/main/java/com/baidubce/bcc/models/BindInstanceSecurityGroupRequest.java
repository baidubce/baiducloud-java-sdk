package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindInstanceSecurityGroupRequest extends BaseBceRequest {

    /**
    * 待绑定的虚机的短id列表
    */
    private List<String> instanceIds;

    /**
    * 待绑定的安全组的短id列表
    */
    private List<String> securityGroupIds;

    /**
    * 待绑定的安全组类型（enterprise/normal）
    */
    private String securityGroupType;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public BindInstanceSecurityGroupRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public BindInstanceSecurityGroupRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public String getSecurityGroupType() {
        return securityGroupType;
    }

    public BindInstanceSecurityGroupRequest setSecurityGroupType(String securityGroupType) {
        this.securityGroupType = securityGroupType;
        return this;
    }

}
