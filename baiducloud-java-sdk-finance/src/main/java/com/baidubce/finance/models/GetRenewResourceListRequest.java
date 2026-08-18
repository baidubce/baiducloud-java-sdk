package com.baidubce.finance.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRenewResourceListRequest extends BaseBceRequest {

    /**
    * 查询资源账户，若为空则表示当前登陆账户。只有主账户可以代查其财务圈（或者虚商组织）子账户的资源信息，其他查询场景会提示AccessDenied
    */
    private String queryAccountId;

    /**
    * 产品类型，例：BCC，EIP等，注意仅允许查询支持自动续费的产品
    */
    private String serviceType;

    /**
    * 区域，bj,su,gz等
    */
    private String region;

    /**
    * 查询预付费资源过期天数，可以为null，默认查询全量，不能为负，不能大于90天
    */
    private Integer expiredDays;

    /**
    * 资源长短ID列表，可以通过订单 或者 月账单等OPEN API查询到相关感兴趣的资源ID信息。
    */
    private List<String> shortOrInstanceIds;

    /**
    * 分页查询的页数，从1开始计数，缺省值为1
    */
    private Integer pageNo;

    /**
    * 每页包含的最大数量，最大数量通常不超过1000，缺省值为100。
    */
    private Integer pageSize;

    public String getQueryAccountId() {
        return queryAccountId;
    }

    public GetRenewResourceListRequest setQueryAccountId(String queryAccountId) {
        this.queryAccountId = queryAccountId;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public GetRenewResourceListRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public GetRenewResourceListRequest setRegion(String region) {
        this.region = region;
        return this;
    }

    public Integer getExpiredDays() {
        return expiredDays;
    }

    public GetRenewResourceListRequest setExpiredDays(Integer expiredDays) {
        this.expiredDays = expiredDays;
        return this;
    }

    public List<String> getShortOrInstanceIds() {
        return shortOrInstanceIds;
    }

    public GetRenewResourceListRequest setShortOrInstanceIds(List<String> shortOrInstanceIds) {
        this.shortOrInstanceIds = shortOrInstanceIds;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetRenewResourceListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetRenewResourceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
