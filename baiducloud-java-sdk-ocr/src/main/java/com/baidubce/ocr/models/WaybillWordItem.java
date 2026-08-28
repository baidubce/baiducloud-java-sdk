package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WaybillWordItem {
    /**
     * 字段识别结果
     */
    private String word;

    public WaybillWordItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "WaybillWordItem{" + "word=" + word + "\n" + "}";
    }

}