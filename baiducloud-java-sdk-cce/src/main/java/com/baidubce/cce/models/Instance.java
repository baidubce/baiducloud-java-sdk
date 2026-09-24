package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instance {
    /**
     * 
     */
    private Object spec;

    /**
     * 
     */
    private Object status;

    /**
     * 
     */
    private String createdAt;

    /**
     * 
     */
    private String updatedAt;

    public Instance setSpec(Object spec) {
        this.spec = spec;
        return this;
    }

    public Object getSpec() {
        return this.spec;
    }

    public Instance setStatus(Object status) {
        this.status = status;
        return this;
    }

    public Object getStatus() {
        return this.status;
    }

    public Instance setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public Instance setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public String toString() {
        return "Instance{" + "spec=" + spec + "\n" + "status=" + status + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "}";
    }

}