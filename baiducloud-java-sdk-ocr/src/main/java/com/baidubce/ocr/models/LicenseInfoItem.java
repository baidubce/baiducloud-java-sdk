package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseInfoItem {
    /**
     * 字段名，如号牌号码、车辆类型、所有人、品牌型号、车辆识别代码、发动机号码、核定载人数、质量、尺寸、检验记录等
     */
    @JsonProperty("word_name")
    private String wordName;

    /**
     * word_name字段对应的识别结果
     */
    private String word;

    public LicenseInfoItem setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordName() {
        return this.wordName;
    }

    public LicenseInfoItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "LicenseInfoItem{" + "wordName=" + wordName + "\n" + "word=" + word + "\n" + "}";
    }

}