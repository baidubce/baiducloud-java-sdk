package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisassociateVpcRequest extends BaseBceRequest {

    /**
    * zoneId
    */
    @JsonIgnore
    private String zoneId;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 关联或者解关联的VPC所属的区域
    */
    private String region;

    /**
    * 想要关联或者解关联的VPC的ID列表
    */
    private List<String> vpcIds;

    public String getZoneId() {
        return zoneId;
    }

    public DisassociateVpcRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public DisassociateVpcRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DisassociateVpcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public DisassociateVpcRequest setRegion(String region) {
        this.region = region;
        return this;
    }

    public List<String> getVpcIds() {
        return vpcIds;
    }

    public DisassociateVpcRequest setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }

}
