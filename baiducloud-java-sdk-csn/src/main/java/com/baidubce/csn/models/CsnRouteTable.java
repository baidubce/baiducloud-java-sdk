package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsnRouteTable {
    /**
     * 路由表ID
     */
    private String csnRtId;

    /**
     * 路由表名称
     */
    private String name;

    /**
     * 路由表描述信息
     */
    private String description;

    /**
     * 路由表类型，取值 [ default \| custom ]，分别表示默认路由表、自定义路由表
     */
    private String type;

    public CsnRouteTable setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

    public String getCsnRtId() {
        return this.csnRtId;
    }

    public CsnRouteTable setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CsnRouteTable setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public CsnRouteTable setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "CsnRouteTable{" + "csnRtId=" + csnRtId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "type=" + type + "\n" + "}";
    }

}