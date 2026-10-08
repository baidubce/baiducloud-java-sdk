package com.baidubce.scs.models;

/**
 * Gets or Sets Engine
 */
public enum Engine {

    REDIS("redis"),

    PEGADB("PegaDB");

    private String value;

    Engine(String value) {
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