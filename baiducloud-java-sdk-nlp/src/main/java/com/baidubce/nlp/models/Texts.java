package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Texts {
    /**
     * 输入的第一段文本
     */
    @JsonProperty("text_1")
    private String text1;

    /**
     * 输入的第二段文本
     */
    @JsonProperty("text_2")
    private String text2;

    public Texts setText1(String text1) {
        this.text1 = text1;
        return this;
    }

    public String getText1() {
        return this.text1;
    }

    public Texts setText2(String text2) {
        this.text2 = text2;
        return this;
    }

    public String getText2() {
        return this.text2;
    }

    @Override
    public String toString() {
        return "Texts{" + "text1=" + text1 + "\n" + "text2=" + text2 + "\n" + "}";
    }

}