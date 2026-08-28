package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HouseholdWordItem {
    /**
     * 所属字段的具体内容
     */
    private String words;

    public HouseholdWordItem setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "HouseholdWordItem{" + "words=" + words + "\n" + "}";
    }

}