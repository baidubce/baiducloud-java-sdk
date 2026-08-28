package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebImageWordsResult {
    /**
     * 识别结果字符串
     */
    private String words;

    public WebImageWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "WebImageWordsResult{" + "words=" + words + "\n" + "}";
    }

}