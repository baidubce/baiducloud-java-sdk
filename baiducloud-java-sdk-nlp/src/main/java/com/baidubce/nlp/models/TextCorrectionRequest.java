package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextCorrectionRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 待纠错文本，字数上限为3000字节（汉字=3字节）
    */
    private String text;

    public String getCharset() {
        return charset;
    }

    public TextCorrectionRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getText() {
        return text;
    }

    public TextCorrectionRequest setText(String text) {
        this.text = text;
        return this;
    }

}
