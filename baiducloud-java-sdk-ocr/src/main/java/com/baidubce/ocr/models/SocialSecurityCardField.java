package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocialSecurityCardField {
    /**
     * 识别结果
     */
    private String word;

    public SocialSecurityCardField setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "SocialSecurityCardField{" + "word=" + word + "\n" + "}";
    }

}