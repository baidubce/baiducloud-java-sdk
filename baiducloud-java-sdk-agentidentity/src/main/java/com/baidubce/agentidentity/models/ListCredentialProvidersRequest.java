package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListCredentialProvidersRequest extends BaseBceRequest {

    /**
    * 页码，默认 1
    */
    private Integer pageNo;

    /**
    * 每页数量，默认 10，最大 100
    */
    private Integer pageSize;

    /**
    * 按类型过滤：API_KEY / OAUTH2 / STS
    */
    private String type;

    /**
    * 按名称过滤
    */
    private String name;

    public Integer getPageNo() {
        return pageNo;
    }

    public ListCredentialProvidersRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListCredentialProvidersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getType() {
        return type;
    }

    public ListCredentialProvidersRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListCredentialProvidersRequest setName(String name) {
        this.name = name;
        return this;
    }

}
