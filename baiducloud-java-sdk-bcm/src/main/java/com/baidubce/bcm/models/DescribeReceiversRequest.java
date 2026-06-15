package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeReceiversRequest extends BaseBceRequest {

    /**
    * 对象类型，可选值：USER（单用户）/ USER_GROUP（用户组）
    */
    private String type;

    /**
    * 用户名或用户组名，支持部分匹配
    */
    private String name;

    /**
    * 页号，从1开始
    */
    private Integer pageNo;

    /**
    * 页大小
    */
    private Integer pageSize;

    public String getType() {
        return type;
    }

    public DescribeReceiversRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeReceiversRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeReceiversRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeReceiversRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
