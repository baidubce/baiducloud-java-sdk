package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTemplateListV2Request extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 名称空间，默认 default
    */
    private String namespace;

    /**
    * 模板名称
    */
    private String name;

    /**
    * 模板 ID
    */
    private String id;

    /**
    * 模板类型 INDIVIDUAL/GLOBAL
    */
    private String type;

    /**
    * 排序字段，默认为创建时间
    */
    private String sort;

    /**
    * 是否升序，默认 false
    */
    private Boolean ascending;

    /**
    * 页数，从 1 开始计数
    */
    private Integer pageNo;

    /**
    * 每页展示数量，最大值：100
    */
    private Integer pageSize;

    /**
    * 支持的实例类型筛选
    */
    private String supportedInstanceType;

    public String getLocale() {
        return locale;
    }

    public GetTemplateListV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public GetTemplateListV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetTemplateListV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetTemplateListV2Request setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetTemplateListV2Request setType(String type) {
        this.type = type;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public GetTemplateListV2Request setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Boolean getAscending() {
        return ascending;
    }

    public GetTemplateListV2Request setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetTemplateListV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetTemplateListV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getSupportedInstanceType() {
        return supportedInstanceType;
    }

    public GetTemplateListV2Request setSupportedInstanceType(String supportedInstanceType) {
        this.supportedInstanceType = supportedInstanceType;
        return this;
    }

}
