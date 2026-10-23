package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3AccessGroupRequest extends BaseBceRequest {

    /**
    * 搜索关键字，需与 keywordType 同时传才生效
    */
    private String keyword;

    /**
    * 搜索字段，当前仅支持 name（按权限组名模糊匹配）
    */
    private String keywordType;

    /**
    * 可用区；不传则返回所有可用区
    */
    private String zoneName;

    /**
    * 排序方向，asc / desc，默认 desc
    */
    private String order;

    /**
    * 排序字段，默认 createTime
    */
    private String orderBy;

    /**
    * 页码，从 1 开始；传 ≤ 0 会被纠正为 1，默认 1
    */
    private Integer pageNo;

    /**
    * 每页条数；传 ≤ 0 会被纠正为 10，默认 10
    */
    private Integer pageSize;

    public String getKeyword() {
        return keyword;
    }

    public ListL3AccessGroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public ListL3AccessGroupRequest setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public ListL3AccessGroupRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListL3AccessGroupRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListL3AccessGroupRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListL3AccessGroupRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListL3AccessGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
