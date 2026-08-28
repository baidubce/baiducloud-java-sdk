package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeChar {
    /**
     * 每个单字的内容
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * 单字符置信度，result_type=small 且 char_probability=true 时返回
     */
    @JsonProperty("char_prob")
    private Double charProb;

    /**
     * charsLocation
     */
    @JsonProperty("chars_location")
    private DocAnaysisOfficeLocation charsLocation;

    public DocAnalysisOfficeChar setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public DocAnalysisOfficeChar setCharProb(Double charProb) {
        this.charProb = charProb;
        return this;
    }

    public Double getCharProb() {
        return this.charProb;
    }

    public DocAnalysisOfficeChar setCharsLocation(DocAnaysisOfficeLocation charsLocation) {
        this.charsLocation = charsLocation;
        return this;
    }

    public DocAnaysisOfficeLocation getCharsLocation() {
        return this.charsLocation;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeChar{" + "ocrChar=" + ocrChar + "\n" + "charProb=" + charProb + "\n" + "charsLocation=" + charsLocation + "\n" + "}";
    }

}