package com.baidubce.cloudassistant.models;

/**
 * Gets or Sets TargetSelectorType
 */
public enum TargetSelectorType {

    INSTANCES_LIST("INSTANCES_LIST"),

    ALL_INSTANCES("ALL_INSTANCES"),

    TAG_INSTANCES("TAG_INSTANCES"),

    INSTANCES_IMPORT("INSTANCES_IMPORT");

    private String value;

    TargetSelectorType(String value) {
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