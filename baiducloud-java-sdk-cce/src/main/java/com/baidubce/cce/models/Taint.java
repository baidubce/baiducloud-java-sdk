package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Taint {
    /**
     * 
     */
    private String key;

    /**
     * 
     */
    private String value;

    /**
     * 
     */
    private String effect;

    public Taint setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public Taint setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public Taint setEffect(String effect) {
        this.effect = effect;
        return this;
    }

    public String getEffect() {
        return this.effect;
    }

    @Override
    public String toString() {
        return "Taint{" + "key=" + key + "\n" + "value=" + value + "\n" + "effect=" + effect + "\n" + "}";
    }

}