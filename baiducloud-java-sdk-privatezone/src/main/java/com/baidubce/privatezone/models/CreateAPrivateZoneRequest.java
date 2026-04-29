package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAPrivateZoneRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * Zone名称，由两个及其以上的字母或者数字组成，最大长度不能超过240
    */
    private String zoneName;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAPrivateZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateAPrivateZoneRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

}
