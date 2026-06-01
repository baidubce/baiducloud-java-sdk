package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDedicatedChannelBfdRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 报文发送间隔, 200-1000间的整数，单位为ms,推荐值为300
    */
    private Integer sendInterval;

    /**
    * 报文接收间隔, 200-1000间的整数，单位为ms,推荐值为300
    */
    private Integer receivInterval;

    /**
    * 检测时间倍数, 3-10间的整数，推荐值为4
    */
    private Integer detectMultiplier;

    public String getEtId() {
        return etId;
    }

    public UpdateDedicatedChannelBfdRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public UpdateDedicatedChannelBfdRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateDedicatedChannelBfdRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getSendInterval() {
        return sendInterval;
    }

    public UpdateDedicatedChannelBfdRequest setSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
        return this;
    }

    public Integer getReceivInterval() {
        return receivInterval;
    }

    public UpdateDedicatedChannelBfdRequest setReceivInterval(Integer receivInterval) {
        this.receivInterval = receivInterval;
        return this;
    }

    public Integer getDetectMultiplier() {
        return detectMultiplier;
    }

    public UpdateDedicatedChannelBfdRequest setDetectMultiplier(Integer detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
        return this;
    }

}
