package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 待识别的文本内容，不超过1000字节
    */
    private String text;

    public String getCharset() {
        return charset;
    }

    public AddressRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getText() {
        return text;
    }

    public AddressRequest setText(String text) {
        this.text = text;
        return this;
    }

}
