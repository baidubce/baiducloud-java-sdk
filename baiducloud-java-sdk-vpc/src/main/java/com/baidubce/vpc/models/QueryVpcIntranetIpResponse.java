package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryVpcIntranetIpResponse extends BaseBceResponse {

    /**
    * VPC内PrivateIpAddress的列表
    */
    private List<VpcPrivateIpAddress> vpcPrivateIpAddresses;

    public List<VpcPrivateIpAddress> getVpcPrivateIpAddresses() {
        return vpcPrivateIpAddresses;
    }

    public QueryVpcIntranetIpResponse setVpcPrivateIpAddresses(List<VpcPrivateIpAddress> vpcPrivateIpAddresses) {
        this.vpcPrivateIpAddresses = vpcPrivateIpAddresses;
        return this;
    }

    @Override
    public String toString() {
        return "QueryVpcIntranetIpResponse{" + "vpcPrivateIpAddresses=" + vpcPrivateIpAddresses + "\n" + "}";
    }

}
