package com.baidubce.as.models;

/**
 * Gets or Sets PeriodType
 */
public enum PeriodType {

    DAY("DAY"),

    WEEK("WEEK"),

    MONTH("MONTH"),

    CRONEXPRESSION("CronExpression");

    private String value;

    PeriodType(String value) {
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