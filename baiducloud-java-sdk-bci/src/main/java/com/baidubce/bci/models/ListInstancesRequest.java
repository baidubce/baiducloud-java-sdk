package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesRequest extends BaseBceRequest {

    /**
    * keywordType
    */
    @JsonIgnore
    private String keywordType;

    /**
    * keyword
    */
    @JsonIgnore
    private String keyword;

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

    public String getKeywordType() {
        return keywordType;
    }

    public ListInstancesRequest setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListInstancesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListInstancesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
