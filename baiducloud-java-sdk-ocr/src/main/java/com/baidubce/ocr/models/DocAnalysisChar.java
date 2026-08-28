package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisChar {
    /**
     * 每个单字的内容
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * charsLocation
     */
    @JsonProperty("chars_location")
    private CharsLocation charsLocation;

    public DocAnalysisChar setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public DocAnalysisChar setCharsLocation(CharsLocation charsLocation) {
        this.charsLocation = charsLocation;
        return this;
    }

    public CharsLocation getCharsLocation() {
        return this.charsLocation;
    }

    @Override
    public String toString() {
        return "DocAnalysisChar{" + "ocrChar=" + ocrChar + "\n" + "charsLocation=" + charsLocation + "\n" + "}";
    }

}