package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryPermissionGroupRulesRequest extends BaseBceRequest {

    /**
    * agName
    */
    @JsonIgnore
    private String agName;

    /**
    * arId
    */
    @JsonIgnore
    private String arId;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    public String getAgName() {
        return agName;
    }

    public QueryPermissionGroupRulesRequest setAgName(String agName) {
        this.agName = agName;
        return this;
    }

    public String getArId() {
        return arId;
    }

    public QueryPermissionGroupRulesRequest setArId(String arId) {
        this.arId = arId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryPermissionGroupRulesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryPermissionGroupRulesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
