package com.baidubce.bcm.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmResource {
    /**
     * 云产品
     */
    private String scope;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 实例所属地域
     */
    private String region;

    /**
     * 实例ID键值对，key为维度名，value为维度值
     */
    private Map<String, String> identifiers;

    /**
     * 实例属性键值对
     */
    private Map<String, String> properties;

    public AlarmResource setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public AlarmResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public AlarmResource setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public AlarmResource setIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public Map<String, String> getIdentifiers() {
        return this.identifiers;
    }

    public AlarmResource setProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    @Override
    public String toString() {
        return "AlarmResource{" + "scope=" + scope + "\n" + "resourceType=" + resourceType + "\n" + "region=" + region + "\n" + "identifiers=" + identifiers + "\n" + "properties="
                + properties + "\n" + "}";
    }

}