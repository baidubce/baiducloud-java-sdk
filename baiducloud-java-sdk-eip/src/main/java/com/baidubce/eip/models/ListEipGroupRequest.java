package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListEipGroupRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * status
    */
    @JsonIgnore
    private String status;

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

    public String getId() {
        return id;
    }

    public ListEipGroupRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListEipGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListEipGroupRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListEipGroupRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListEipGroupRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
