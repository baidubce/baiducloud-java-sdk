package com.baidubce.scs.models;

/**
 * Gets or Sets ClusterType
 */
public enum ClusterType {

    CLUSTER("cluster"),

    MASTER_SLAVE("master_slave");

    private String value;

    ClusterType(String value) {
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