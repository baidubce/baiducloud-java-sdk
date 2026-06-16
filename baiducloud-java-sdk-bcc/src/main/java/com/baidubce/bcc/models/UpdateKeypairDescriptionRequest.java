package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateKeypairDescriptionRequest extends BaseBceRequest {

    /**
    * keypairId
    */
    @JsonIgnore
    private String keypairId;

    /**
    * 新的密钥对描述, 只能包含中文、字母、数字、点号“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”、冒号“：”、斜杠 “/” 和中文句号“。”
    */
    private String description;

    public String getKeypairId() {
        return keypairId;
    }

    public UpdateKeypairDescriptionRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateKeypairDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
