package com.baidubce.as.models;

/**
 * Gets or Sets ExecCmdStrategyType
 */
public enum ExecCmdStrategyType {

    PROCEED("Proceed"),

    PAUSE("Pause");

    private String value;

    ExecCmdStrategyType(String value) {
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