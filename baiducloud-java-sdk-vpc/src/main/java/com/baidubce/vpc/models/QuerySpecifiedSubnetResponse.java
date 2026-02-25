
package com.baidubce.vpc.models;



import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySpecifiedSubnetResponse extends BaseBceResponse  {
    /**
     * subnet
     */
    private SubnetDetail subnet;

    public QuerySpecifiedSubnetResponse setSubnet(SubnetDetail subnet) {
        this.subnet = subnet;
        return this;
    }

    public SubnetDetail getSubnet() {
        return this.subnet;
    }

    @Override
    public String toString() {
        return "QuerySpecifiedSubnetResponse{"
                + "subnet=" + subnet + "\n"
                + "}";
    }




}