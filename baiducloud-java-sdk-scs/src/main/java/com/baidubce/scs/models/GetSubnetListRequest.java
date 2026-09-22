package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSubnetListRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    public String getVpcId() {
        return vpcId;
    }

    public GetSubnetListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetSubnetListRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

}
