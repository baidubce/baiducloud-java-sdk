package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HkMacauTaiwanExitentrypermitField {
    /**
     * 字段识别结果
     */
    private String word;

    /**
     * location
     */
    private HkMacauTaiwanExitentrypermitLocation location;

    /**
     * probability
     */
    private HkMacauTaiwanExitentrypermitProbability probability;

    public HkMacauTaiwanExitentrypermitField setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public HkMacauTaiwanExitentrypermitField setLocation(HkMacauTaiwanExitentrypermitLocation location) {
        this.location = location;
        return this;
    }

    public HkMacauTaiwanExitentrypermitLocation getLocation() {
        return this.location;
    }

    public HkMacauTaiwanExitentrypermitField setProbability(HkMacauTaiwanExitentrypermitProbability probability) {
        this.probability = probability;
        return this;
    }

    public HkMacauTaiwanExitentrypermitProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "HkMacauTaiwanExitentrypermitField{" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}