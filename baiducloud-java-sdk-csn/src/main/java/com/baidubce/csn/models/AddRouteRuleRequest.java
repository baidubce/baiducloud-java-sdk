package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddRouteRuleRequest extends BaseBceRequest {

    /**
    * csnRtId
    */
    @JsonIgnore
    private String csnRtId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 网络实例在云智能网中的身份的ID
    */
    private String attachId;

    /**
    * 路由的目的地址，当前只支持0.0.0.0/0
    */
    private String destAddress;

    /**
    * 路由类型，当前只支持custom
    */
    private String routeType;

    public String getCsnRtId() {
        return csnRtId;
    }

    public AddRouteRuleRequest setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAttachId() {
        return attachId;
    }

    public AddRouteRuleRequest setAttachId(String attachId) {
        this.attachId = attachId;
        return this;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public AddRouteRuleRequest setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getRouteType() {
        return routeType;
    }

    public AddRouteRuleRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

}
