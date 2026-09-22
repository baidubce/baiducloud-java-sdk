package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHotGroupListRequest extends BaseBceRequest {

    /**
    * 每页数量
    */
    private Integer pageSize;

    /**
    * 页码
    */
    private Integer pageNo;

    public Integer getPageSize() {
        return pageSize;
    }

    public GetHotGroupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetHotGroupListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

}
