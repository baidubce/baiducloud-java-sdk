package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationRegistryRequest {
    /**
     * Registry ID
     */
    private Integer id;

    public ReplicationRegistryRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ReplicationRegistryRequest{" + "id=" + id + "\n" + "}";
    }

}