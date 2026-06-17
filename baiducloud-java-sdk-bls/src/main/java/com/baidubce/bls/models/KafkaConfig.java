package com.baidubce.bls.models;

/**
 * Gets or Sets KafkaConfig
 */
public enum KafkaConfig {

    BROKERS("brokers"),

    TOPIC("topic"),

    MAXRETRIES("maxRetries");

    private String value;

    KafkaConfig(String value) {
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