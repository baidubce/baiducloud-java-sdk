package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SentimentClassifyRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 文本内容，最大2048字符
    */
    private String text;

    public String getCharset() {
        return charset;
    }

    public SentimentClassifyRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getText() {
        return text;
    }

    public SentimentClassifyRequest setText(String text) {
        this.text = text;
        return this;
    }

}
