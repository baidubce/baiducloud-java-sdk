package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MonitorObject {
    /**
     * 类型
     */
    private String type;

    /**
     * 名称列表
     */
    private List<String> names;

    /**
     * 关联的策略资源列表
     */
    private List<PolicyResource> resources;

    /**
     * 监控类型的可读名称
     */
    private String typeName;

    public MonitorObject setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public MonitorObject setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public List<String> getNames() {
        return this.names;
    }

    public MonitorObject setResources(List<PolicyResource> resources) {
        this.resources = resources;
        return this;
    }

    public List<PolicyResource> getResources() {
        return this.resources;
    }

    public MonitorObject setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getTypeName() {
        return this.typeName;
    }

    @Override
    public String toString() {
        return "MonitorObject{" + "type=" + type + "\n" + "names=" + names + "\n" + "resources=" + resources + "\n" + "typeName=" + typeName + "\n" + "}";
    }

}