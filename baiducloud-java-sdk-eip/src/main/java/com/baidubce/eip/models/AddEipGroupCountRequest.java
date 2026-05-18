package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddEipGroupCountRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 共享带宽包新增IPv4 EIP的数量。该值大于0，公网IP数量最多可以包括n个（n\*5Mbps小于共享带宽包总量）。
    */
    private Integer eipAddCount;

    /**
    * 共享带宽包新增IPv6 EIP的数量。该值大于0，公网IP数量最多受配额控制，默认是256。
    */
    private Integer eipv6AddCount;

    public String getId() {
        return id;
    }

    public AddEipGroupCountRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddEipGroupCountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getEipAddCount() {
        return eipAddCount;
    }

    public AddEipGroupCountRequest setEipAddCount(Integer eipAddCount) {
        this.eipAddCount = eipAddCount;
        return this;
    }

    public Integer getEipv6AddCount() {
        return eipv6AddCount;
    }

    public AddEipGroupCountRequest setEipv6AddCount(Integer eipv6AddCount) {
        this.eipv6AddCount = eipv6AddCount;
        return this;
    }

}
