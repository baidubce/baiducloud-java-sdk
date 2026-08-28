package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebImageLocChar {
    /**
     * 单字符识别结果
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * location
     */
    private WebImageLocLocation location;

    public WebImageLocChar setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public WebImageLocChar setLocation(WebImageLocLocation location) {
        this.location = location;
        return this;
    }

    public WebImageLocLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "WebImageLocChar{" + "ocrChar=" + ocrChar + "\n" + "location=" + location + "\n" + "}";
    }

}