package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListDownloadTaskRequest extends BaseBceRequest {

    /**
    * 日志组名称关键字查询，精确匹配
    */
    private String project;

    /**
    * 日志集关键字查询，模糊匹配
    */
    private String logStoreName;

    /**
    * 排序字段，默认按照创建时间排序，支持createdTime: 创建时间，updatedTime: 修改时间, name: 名称
    */
    private String orderBy;

    /**
    * 排序顺序，desc为降序，asc为升序，默认为 desc
    */
    private String order;

    /**
    * 起始页码，默认为 1
    */
    private Integer pageNo;

    /**
    * 每页显示数据大小，默认为 10
    */
    private Integer pageSize;

    public String getProject() {
        return project;
    }

    public ListDownloadTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public ListDownloadTaskRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListDownloadTaskRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListDownloadTaskRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListDownloadTaskRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListDownloadTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
