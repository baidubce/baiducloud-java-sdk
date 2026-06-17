package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Host {
    /**
     * 主机ID
     */
    private String hostId;

    public Host setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    public String getHostId() {
        return this.hostId;
    }

    @Override
    public String toString() {
        return "Host{" + "hostId=" + hostId + "\n" + "}";
    }

}