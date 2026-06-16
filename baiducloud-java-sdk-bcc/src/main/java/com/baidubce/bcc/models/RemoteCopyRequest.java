package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteCopyRequest {
    /**
     * 快照名称
     */
    private String name;

    /**
     * 待复制快照的目标区域
     */
    private String destRegion;

    public RemoteCopyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public RemoteCopyRequest setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }

    public String getDestRegion() {
        return this.destRegion;
    }

    @Override
    public String toString() {
        return "RemoteCopyRequest{" + "name=" + name + "\n" + "destRegion=" + destRegion + "\n" + "}";
    }

}