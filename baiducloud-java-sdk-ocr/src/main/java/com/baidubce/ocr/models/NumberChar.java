package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberChar {
    /**
     * 单字符识别结果
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * location
     */
    private NumbersLocation location;

    public NumberChar setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public NumberChar setLocation(NumbersLocation location) {
        this.location = location;
        return this;
    }

    public NumbersLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "NumberChar{" + "ocrChar=" + ocrChar + "\n" + "location=" + location + "\n" + "}";
    }

}