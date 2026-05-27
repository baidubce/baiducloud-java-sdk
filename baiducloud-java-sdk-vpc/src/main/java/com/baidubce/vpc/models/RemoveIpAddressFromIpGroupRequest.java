package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveIpAddressFromIpGroupRequest extends BaseBceRequest {

    /**
    * ipSetId
    */
    @JsonIgnore
    private String ipSetId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 删除的IP地址信息，单次最多指定10个
    */
    private List<String> ipAddressInfo;

    public String getIpSetId() {
        return ipSetId;
    }

    public RemoveIpAddressFromIpGroupRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RemoveIpAddressFromIpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getIpAddressInfo() {
        return ipAddressInfo;
    }

    public RemoveIpAddressFromIpGroupRequest setIpAddressInfo(List<String> ipAddressInfo) {
        this.ipAddressInfo = ipAddressInfo;
        return this;
    }

}
