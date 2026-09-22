package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonIdMatchRequest extends BaseBceRequest {

    /**
    * 证件号
    */
    @JsonProperty("id_card_number")
    private String idCardNumber;

    /**
    * 姓名（注：需要是UTF-8编码的中文）
    */
    private String name;

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public PersonIdMatchRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public PersonIdMatchRequest setName(String name) {
        this.name = name;
        return this;
    }

}
