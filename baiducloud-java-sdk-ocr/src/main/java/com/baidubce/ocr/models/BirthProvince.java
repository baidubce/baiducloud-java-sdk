package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BirthProvince {
    /**
     * 出生地点_省
     */
    private String words;

    public BirthProvince setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "BirthProvince{" + "words=" + words + "\n" + "}";
    }

}