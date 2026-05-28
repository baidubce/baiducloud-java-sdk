package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeBlbSecurityGroupsResponse extends BaseBceResponse {

    /**
    * 普通安全组信息，由BlbSecurityGroupModel组成的集合
    */
    private List<BlbSecurityGroupModel> blbSecurityGroups;

    public List<BlbSecurityGroupModel> getBlbSecurityGroups() {
        return blbSecurityGroups;
    }

    public DescribeBlbSecurityGroupsResponse setBlbSecurityGroups(List<BlbSecurityGroupModel> blbSecurityGroups) {
        this.blbSecurityGroups = blbSecurityGroups;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeBlbSecurityGroupsResponse{" + "blbSecurityGroups=" + blbSecurityGroups + "\n" + "}";
    }

}
