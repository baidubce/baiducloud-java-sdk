package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlertsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

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

    public String getInstanceId() {
        return instanceId;
    }

    public ListAlertsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlertsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public ListAlertsRequest setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListAlertsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

}
