package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateBlbModifyProtectionRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * true表示允许修改（关闭保护）；false表示不允许修改（开启保护）
    */
    private Boolean allowModify;

    /**
    * 保护原因，长度0-128字符
    */
    private String modificationProtectionReason;

    public String getBlbId() {
        return blbId;
    }

    public UpdateBlbModifyProtectionRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateBlbModifyProtectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Boolean getAllowModify() {
        return allowModify;
    }

    public UpdateBlbModifyProtectionRequest setAllowModify(Boolean allowModify) {
        this.allowModify = allowModify;
        return this;
    }

    public String getModificationProtectionReason() {
        return modificationProtectionReason;
    }

    public UpdateBlbModifyProtectionRequest setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }

}
