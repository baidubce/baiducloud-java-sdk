package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VinCodeResult {
    /**
     * location
     */
    private VinCodeLocation location;

    /**
     * VIN码识别结果
     */
    private String words;

    public VinCodeResult setLocation(VinCodeLocation location) {
        this.location = location;
        return this;
    }

    public VinCodeLocation getLocation() {
        return this.location;
    }

    public VinCodeResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "VinCodeResult{" + "location=" + location + "\n" + "words=" + words + "\n" + "}";
    }

}