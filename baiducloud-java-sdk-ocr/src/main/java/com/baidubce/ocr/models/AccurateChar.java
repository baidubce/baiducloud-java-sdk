package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccurateChar {
    /**
     * 单字符识别结果，当 recognize_granularity=small 时返回该字段
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * 单字符置信度，当 recognize_granularity=small 且 char_probability=true 时返回该字段
     */
    @JsonProperty("char_prob")
    private Integer charProb;

    /**
     * location
     */
    private AccurateLocation location;

    public AccurateChar setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public AccurateChar setCharProb(Integer charProb) {
        this.charProb = charProb;
        return this;
    }

    public Integer getCharProb() {
        return this.charProb;
    }

    public AccurateChar setLocation(AccurateLocation location) {
        this.location = location;
        return this;
    }

    public AccurateLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "AccurateChar{" + "ocrChar=" + ocrChar + "\n" + "charProb=" + charProb + "\n" + "location=" + location + "\n" + "}";
    }

}