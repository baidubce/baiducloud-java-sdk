package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryFileSystemRequest extends BaseBceRequest {

    /**
    * userId
    */
    @JsonIgnore
    private String userId;

    /**
    * fsId
    */
    @JsonIgnore
    private String fsId;

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
    * filterTag
    */
    @JsonIgnore
    private String filterTag;

    public String getUserId() {
        return userId;
    }

    public QueryFileSystemRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getFsId() {
        return fsId;
    }

    public QueryFileSystemRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryFileSystemRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryFileSystemRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getFilterTag() {
        return filterTag;
    }

    public QueryFileSystemRequest setFilterTag(String filterTag) {
        this.filterTag = filterTag;
        return this;
    }

}
