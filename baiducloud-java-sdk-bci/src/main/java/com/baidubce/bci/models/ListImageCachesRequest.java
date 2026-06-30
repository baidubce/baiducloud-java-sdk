package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListImageCachesRequest extends BaseBceRequest {

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

    public Integer getPageSize() {
        return pageSize;
    }

    public ListImageCachesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListImageCachesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

}
