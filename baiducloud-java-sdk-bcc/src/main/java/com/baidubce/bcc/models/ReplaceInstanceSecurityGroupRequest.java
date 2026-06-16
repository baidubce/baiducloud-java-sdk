package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplaceInstanceSecurityGroupRequest extends BaseBceRequest {

    /**
    * 待替换的虚机的短id列表
    */
    private List<String> instanceIds;

    /**
    * 目标安全组的短id列表
    */
    private List<String> securityGroupIds;

    /**
    * 目标安全组类型（企业安全组：enterprise，普通安全组：normal）
    */
    private String securityGroupType;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public ReplaceInstanceSecurityGroupRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public ReplaceInstanceSecurityGroupRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public String getSecurityGroupType() {
        return securityGroupType;
    }

    public ReplaceInstanceSecurityGroupRequest setSecurityGroupType(String securityGroupType) {
        this.securityGroupType = securityGroupType;
        return this;
    }

}
