package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DccHostId {
    /**
     * 主机ID。
     */
    private String hostId;

    /**
     * 区域名称，如“zoneA"。
     */
    private String azone;

    public DccHostId setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    public String getHostId() {
        return this.hostId;
    }

    public DccHostId setAzone(String azone) {
        this.azone = azone;
        return this;
    }

    public String getAzone() {
        return this.azone;
    }

    @Override
    public String toString() {
        return "DccHostId{" + "hostId=" + hostId + "\n" + "azone=" + azone + "\n" + "}";
    }

}