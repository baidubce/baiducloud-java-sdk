package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySubnetListRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    public String getZoneName() {
        return zoneName;
    }

    public QuerySubnetListRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QuerySubnetListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

}
