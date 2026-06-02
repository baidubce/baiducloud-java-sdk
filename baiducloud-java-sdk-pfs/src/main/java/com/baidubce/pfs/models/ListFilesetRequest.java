package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFilesetRequest extends BaseBceRequest {

    /**
    * fileset所属PFS实例的短id
    */
    private String instanceId;

    /**
    * 基于filesetId进行过滤
    */
    private String filesetId;

    /**
    * 基于filesetName进行过滤
    */
    private String filesetName;

    /**
    * 只支持page
    */
    private String manner;

    /**
    * 排序，desc倒序，asc正序
    */
    private String order;

    /**
    * orderBy，默认createTime
    */
    private String orderBy;

    /**
    * 默认1
    */
    private Integer pageNo;

    /**
    * 默认10
    */
    private Integer pageSize;

    public String getInstanceId() {
        return instanceId;
    }

    public ListFilesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getFilesetId() {
        return filesetId;
    }

    public ListFilesetRequest setFilesetId(String filesetId) {
        this.filesetId = filesetId;
        return this;
    }

    public String getFilesetName() {
        return filesetName;
    }

    public ListFilesetRequest setFilesetName(String filesetName) {
        this.filesetName = filesetName;
        return this;
    }

    public String getManner() {
        return manner;
    }

    public ListFilesetRequest setManner(String manner) {
        this.manner = manner;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListFilesetRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListFilesetRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListFilesetRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListFilesetRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
