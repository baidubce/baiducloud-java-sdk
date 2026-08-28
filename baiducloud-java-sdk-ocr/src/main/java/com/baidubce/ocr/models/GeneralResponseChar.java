package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralResponseChar {
    /**
     * 单字符识别结果
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * location
     */
    private GeneralLocation location;

    public GeneralResponseChar setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public GeneralResponseChar setLocation(GeneralLocation location) {
        this.location = location;
        return this;
    }

    public GeneralLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "GeneralResponseChar{" + "ocrChar=" + ocrChar + "\n" + "location=" + location + "\n" + "}";
    }

}