package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeBlbEnterpriseSecurityGroupsResponse extends BaseBceResponse {

    /**
    * 企业安全组信息，由BlbEnterpriseSecurityGroupModel组成的集合
    */
    private List<BlbEnterpriseSecurityGroupModel> enterpriseSecurityGroups;

    public List<BlbEnterpriseSecurityGroupModel> getEnterpriseSecurityGroups() {
        return enterpriseSecurityGroups;
    }

    public DescribeBlbEnterpriseSecurityGroupsResponse setEnterpriseSecurityGroups(List<BlbEnterpriseSecurityGroupModel> enterpriseSecurityGroups) {
        this.enterpriseSecurityGroups = enterpriseSecurityGroups;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeBlbEnterpriseSecurityGroupsResponse{" + "enterpriseSecurityGroups=" + enterpriseSecurityGroups + "\n" + "}";
    }

}
