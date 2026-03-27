package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewGatewayLimitRulesRequest {

    /**
    * serviceType
    */
    @JsonIgnore
    private String serviceType;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * glrId
    */
    @JsonIgnore
    private String glrId;

    /**
    * resourceId
    */
    @JsonIgnore
    private String resourceId;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private String maxKeys;

    public String getServiceType() {
        return serviceType;
    }

    public ViewGatewayLimitRulesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public ViewGatewayLimitRulesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getGlrId() {
        return glrId;
    }

    public ViewGatewayLimitRulesRequest setGlrId(String glrId) {
        this.glrId = glrId;
        return this;
    }

    public String getResourceId() {
        return resourceId;
    }

    public ViewGatewayLimitRulesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ViewGatewayLimitRulesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMaxKeys() {
        return maxKeys;
    }

    public ViewGatewayLimitRulesRequest setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
