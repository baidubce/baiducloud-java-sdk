package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimnetRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 待比较文本1，最大512字节
    */
    @JsonProperty("text_1")
    private String text1;

    /**
    * 待比较文本2，最大512字节
    */
    @JsonProperty("text_2")
    private String text2;

    /**
    * 默认为"ERNIE"。ERNIE模型：基于百度自研的ERNIE预训练语言模型，具备更强语义理解能力，能够深层理解文本间的语义关系，且语义匹配效果更好
    */
    private String model;

    public String getCharset() {
        return charset;
    }

    public SimnetRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getText1() {
        return text1;
    }

    public SimnetRequest setText1(String text1) {
        this.text1 = text1;
        return this;
    }

    public String getText2() {
        return text2;
    }

    public SimnetRequest setText2(String text2) {
        this.text2 = text2;
        return this;
    }

    public String getModel() {
        return model;
    }

    public SimnetRequest setModel(String model) {
        this.model = model;
        return this;
    }

}
