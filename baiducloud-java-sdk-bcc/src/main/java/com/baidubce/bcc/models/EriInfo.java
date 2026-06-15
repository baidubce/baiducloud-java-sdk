package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EriInfo {
    /**
     * eri网卡名（查询实例列表、查询指定实例详情）
     */
    private String name;

    /**
     * eri网卡ID（查询实例列表、查询指定实例详情）
     */
    private String eriId;

    public EriInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EriInfo setEriId(String eriId) {
        this.eriId = eriId;
        return this;
    }

    public String getEriId() {
        return this.eriId;
    }

    @Override
    public String toString() {
        return "EriInfo{" + "name=" + name + "\n" + "eriId=" + eriId + "\n" + "}";
    }

}