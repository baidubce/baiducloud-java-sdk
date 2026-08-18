package com.baidubce.finance.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRenewResourceListResponse extends BaseBceResponse {

    /**
    * 查询账户不是子账户时，返回查询账户accountId；是子账户时，返回查询账户所在企业组织的主账户的accountId
    */
    private String accountId;

    /**
    * 查询账户不是子账户时，返回查询账户的登录名；是子账户时，返回查询账户所在企业组织的主账户的登录名
    */
    private String loginName;

    /**
    * 查询账户不是子账户时，返回”/”；是子账户时，返回查询账户的accountId
    */
    private String subAccountId;

    /**
    * 查询账户不是子账户时，返回”/”；是子账户时，返回查询账户的登录名
    */
    private String subLoginName;

    /**
    * 查询账户不是子账户时，返回”/”；是子账户时，返回查询账户所在组织单元的单元名
    */
    private String ouName;

    /**
    * 分页查询编号，从1开始计数
    */
    private Integer pageNo;

    /**
    * 分页查询分页大小
    */
    private Integer pageSize;

    /**
    * 当前查询条件总条目
    */
    private Integer totalCount;

    /**
    * 资源自动续费信息详情列表
    */
    private List<RenewResource> resources;

    public String getAccountId() {
        return accountId;
    }

    public GetRenewResourceListResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getLoginName() {
        return loginName;
    }

    public GetRenewResourceListResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public String getSubAccountId() {
        return subAccountId;
    }

    public GetRenewResourceListResponse setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }

    public String getSubLoginName() {
        return subLoginName;
    }

    public GetRenewResourceListResponse setSubLoginName(String subLoginName) {
        this.subLoginName = subLoginName;
        return this;
    }

    public String getOuName() {
        return ouName;
    }

    public GetRenewResourceListResponse setOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetRenewResourceListResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetRenewResourceListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetRenewResourceListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<RenewResource> getResources() {
        return resources;
    }

    public GetRenewResourceListResponse setResources(List<RenewResource> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public String toString() {
        return "GetRenewResourceListResponse{" + "accountId=" + accountId + "\n" + "loginName=" + loginName + "\n" + "subAccountId=" + subAccountId + "\n" + "subLoginName="
                + subLoginName + "\n" + "ouName=" + ouName + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "resources="
                + resources + "\n" + "}";
    }

}
