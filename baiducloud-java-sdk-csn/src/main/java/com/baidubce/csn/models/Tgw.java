package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tgw {
    /**
     * TGW的ID
     */
    private String tgwId;

    /**
     * 云智能网的ID
     */
    private String csnId;

    /**
     * TGW的名称
     */
    private String name;

    /**
     * TGW的region
     */
    private String region;

    /**
     * TGW的描述信息
     */
    private String description;

    public Tgw setTgwId(String tgwId) {
        this.tgwId = tgwId;
        return this;
    }

    public String getTgwId() {
        return this.tgwId;
    }

    public Tgw setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getCsnId() {
        return this.csnId;
    }

    public Tgw setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Tgw setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Tgw setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Tgw{" + "tgwId=" + tgwId + "\n" + "csnId=" + csnId + "\n" + "name=" + name + "\n" + "region=" + region + "\n" + "description=" + description + "\n" + "}";
    }

}