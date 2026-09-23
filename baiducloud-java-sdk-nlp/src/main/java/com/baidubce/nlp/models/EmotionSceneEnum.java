package com.baidubce.nlp.models;

/**
 * Gets or Sets EmotionSceneEnum
 */
public enum EmotionSceneEnum {

    DEFAULT("default"),

    TALK("talk"),

    TASK("task"),

    CUSTOMER_SERVICE("customer_service");

    private String value;

    EmotionSceneEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}