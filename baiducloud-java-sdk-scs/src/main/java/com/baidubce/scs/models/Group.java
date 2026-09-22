package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Group {
    /**
     * 安全组备注。
     */
    private String securityGroupRemark;

    /**
     * 安全组名称。
     */
    private String securityGroupName;

    /**
     * 安全组ID。
     */
    private String securityGroupId;

    /**
     * 安全组长ID。
     */
    private String securityGroupUuid;

    /**
     * vpcId。
     */
    private String vpcId;

    /**
     * vpc名称。
     */
    private String vpcName;

    /**
     * 安全组规则。
     */
    private List<Rule> outbound;

    public Group setSecurityGroupRemark(String securityGroupRemark) {
        this.securityGroupRemark = securityGroupRemark;
        return this;
    }

    public String getSecurityGroupRemark() {
        return this.securityGroupRemark;
    }

    public Group setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public Group setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public Group setSecurityGroupUuid(String securityGroupUuid) {
        this.securityGroupUuid = securityGroupUuid;
        return this;
    }

    public String getSecurityGroupUuid() {
        return this.securityGroupUuid;
    }

    public Group setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Group setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public Group setOutbound(List<Rule> outbound) {
        this.outbound = outbound;
        return this;
    }

    public List<Rule> getOutbound() {
        return this.outbound;
    }

    @Override
    public String toString() {
        return "Group{" + "securityGroupRemark=" + securityGroupRemark + "\n" + "securityGroupName=" + securityGroupName + "\n" + "securityGroupId=" + securityGroupId + "\n"
                + "securityGroupUuid=" + securityGroupUuid + "\n" + "vpcId=" + vpcId + "\n" + "vpcName=" + vpcName + "\n" + "outbound=" + outbound + "\n" + "}";
    }

}