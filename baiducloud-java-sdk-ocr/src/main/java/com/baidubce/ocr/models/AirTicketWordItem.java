package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirTicketWordItem {
    /**
     * 识别文本
     */
    private String word;

    public AirTicketWordItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "AirTicketWordItem{" + "word=" + word + "\n" + "}";
    }

}