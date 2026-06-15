package com.baidubce.bcc.models;

/**
 * Gets or Sets InstanceType
 */
public enum InstanceType {

    N1("N1"),

    N2("N2"),

    N3("N3"),

    N4("N4"),

    N5("N5"),

    N6("N6"),

    C1("C1"),

    C2("C2"),

    S1("S1"),

    G1("G1"),

    F1("F1");

    private String value;

    InstanceType(String value) {
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