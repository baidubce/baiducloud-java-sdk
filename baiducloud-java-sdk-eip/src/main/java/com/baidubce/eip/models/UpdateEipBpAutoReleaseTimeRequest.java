package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateEipBpAutoReleaseTimeRequest extends BaseBceRequest {

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
    * 更新后带宽包的自动释放时间
    */
    private String autoReleaseTime;

    public String getId() {
        return id;
    }

    public UpdateEipBpAutoReleaseTimeRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateEipBpAutoReleaseTimeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAutoReleaseTime() {
        return autoReleaseTime;
    }

    public UpdateEipBpAutoReleaseTimeRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }

}
