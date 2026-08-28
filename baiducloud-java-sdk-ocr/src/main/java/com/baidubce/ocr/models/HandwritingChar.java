package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingChar {
    /**
     * 单字符识别结果
     */
    @JsonProperty("char")
    private String ocrChar;

    /**
     * 单字符识别结果的候选词内容
     */
    private List<HandwritingCandidate> candidates;

    /**
     * location
     */
    private HandWritingLocation location;

    public HandwritingChar setChar(String ocrChar) {
        this.ocrChar = ocrChar;
        return this;
    }

    public String getChar() {
        return this.ocrChar;
    }

    public HandwritingChar setCandidates(List<HandwritingCandidate> candidates) {
        this.candidates = candidates;
        return this;
    }

    public List<HandwritingCandidate> getCandidates() {
        return this.candidates;
    }

    public HandwritingChar setLocation(HandWritingLocation location) {
        this.location = location;
        return this;
    }

    public HandWritingLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "HandwritingChar{" + "ocrChar=" + ocrChar + "\n" + "candidates=" + candidates + "\n" + "location=" + location + "\n" + "}";
    }

}