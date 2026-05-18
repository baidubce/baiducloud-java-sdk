package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListEipBpRequest extends BaseBceRequest {

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
    * bindType
    */
    @JsonIgnore
    private String bindType;

    /**
    * type
    */
    @JsonIgnore
    private String type;

    public String getMarker() {
        return marker;
    }

    public ListEipBpRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListEipBpRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getId() {
        return id;
    }

    public ListEipBpRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListEipBpRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getBindType() {
        return bindType;
    }

    public ListEipBpRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }

    public String getType() {
        return type;
    }

    public ListEipBpRequest setType(String type) {
        this.type = type;
        return this;
    }

}
