package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTbspIpProtectLevelRequest extends BaseBceRequest {

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
    * DDoS增强防护包防护对象IP地址
    */
    private String ip;

    /**
    * 防护等级，可为1（宽松）、2（适中）、3（严格）
    */
    private Integer protectLevel;

    public String getId() {
        return id;
    }

    public ModifyTbspIpProtectLevelRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ModifyTbspIpProtectLevelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public ModifyTbspIpProtectLevelRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public Integer getProtectLevel() {
        return protectLevel;
    }

    public ModifyTbspIpProtectLevelRequest setProtectLevel(Integer protectLevel) {
        this.protectLevel = protectLevel;
        return this;
    }

}
