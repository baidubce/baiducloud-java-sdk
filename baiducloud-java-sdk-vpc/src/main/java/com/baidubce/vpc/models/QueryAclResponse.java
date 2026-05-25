package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAclResponse extends BaseBceResponse {

    /**
    * VPC的ID
    */
    private String vpcId;

    /**
    * VPC的名称
    */
    private String vpcName;

    /**
    * VPC的CIDR
    */
    private String vpcCidr;

    /**
    * ACL的Entry列表
    */
    private List<AclEntry> aclEntrys;

    public String getVpcId() {
        return vpcId;
    }

    public QueryAclResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public QueryAclResponse setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcCidr() {
        return vpcCidr;
    }

    public QueryAclResponse setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public List<AclEntry> getAclEntrys() {
        return aclEntrys;
    }

    public QueryAclResponse setAclEntrys(List<AclEntry> aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }

    @Override
    public String toString() {
        return "QueryAclResponse{" + "vpcId=" + vpcId + "\n" + "vpcName=" + vpcName + "\n" + "vpcCidr=" + vpcCidr + "\n" + "aclEntrys=" + aclEntrys + "\n" + "}";
    }

}
