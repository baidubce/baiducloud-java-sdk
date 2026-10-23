package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3AccessRuleRequest extends BaseBceRequest {

    /**
    * 权限组名称
    */
    private String accessGroupName;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 页码，默认 1
    */
    private Integer pageNo;

    /**
    * 每页条数，默认 10
    */
    private Integer pageSize;

    /**
    * 排序字段，默认 priority
    */
    private String orderBy;

    /**
    * 排序方向，asc / desc，默认 asc
    */
    private String order;

    /**
    * 按 IP 过滤，ipv4 / ipv6，为空时展示所有，默认空字符串
    */
    private String ipFilter;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public ListL3AccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public ListL3AccessRuleRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListL3AccessRuleRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListL3AccessRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListL3AccessRuleRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListL3AccessRuleRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getIpFilter() {
        return ipFilter;
    }

    public ListL3AccessRuleRequest setIpFilter(String ipFilter) {
        this.ipFilter = ipFilter;
        return this;
    }

}
