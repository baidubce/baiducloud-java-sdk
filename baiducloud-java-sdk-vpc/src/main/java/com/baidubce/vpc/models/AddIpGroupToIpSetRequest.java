package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddIpGroupToIpSetRequest extends BaseBceRequest {

    /**
    * ipGroupId
    */
    @JsonIgnore
    private String ipGroupId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 关联的IP地址组ID，其ipVersion需与指定的IP地址族一致，单次最多指定5个
    */
    private List<String> ipSetIds;

    public String getIpGroupId() {
        return ipGroupId;
    }

    public AddIpGroupToIpSetRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddIpGroupToIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getIpSetIds() {
        return ipSetIds;
    }

    public AddIpGroupToIpSetRequest setIpSetIds(List<String> ipSetIds) {
        this.ipSetIds = ipSetIds;
        return this;
    }

}
