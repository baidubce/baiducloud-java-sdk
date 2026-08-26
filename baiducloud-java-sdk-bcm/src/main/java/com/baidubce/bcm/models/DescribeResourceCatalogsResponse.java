package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeResourceCatalogsResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 云产品资源目录列表
    */
    private List<ResourceCatalog> catalogs;

    /**
    * 云产品标识，可作为指标查询接口的scope参数
    */
    @JsonProperty("catalogs[].scope")
    private String catalogsScope;

    /**
    * 云产品显示名称，根据locale返回中文或英文名称
    */
    @JsonProperty("catalogs[].scopeLabel")
    private String catalogsScopeLabel;

    /**
    * 云产品下的资源类型列表
    */
    @JsonProperty("catalogs[].resources")
    private List<ResourceCatalogItem> catalogsResources;

    /**
    * 资源类型标识，可作为指标查询接口的resourceType参数
    */
    @JsonProperty("catalogs[].resources[].resourceType")
    private String catalogsResourcesResourceType;

    /**
    * 资源类型显示名称，根据locale返回中文或英文名称
    */
    @JsonProperty("catalogs[].resources[].resourceTypeLabel")
    private String catalogsResourcesResourceTypeLabel;

    /**
    * 云产品适用的地域列表。仅配置了固定地域信息时返回；例如全局产品返回global
    */
    @JsonProperty("catalogs[].regions")
    private List<String> catalogsRegions;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeResourceCatalogsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeResourceCatalogsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeResourceCatalogsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<ResourceCatalog> getCatalogs() {
        return catalogs;
    }

    public DescribeResourceCatalogsResponse setCatalogs(List<ResourceCatalog> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

    public String getCatalogsScope() {
        return catalogsScope;
    }

    public DescribeResourceCatalogsResponse setCatalogsScope(String catalogsScope) {
        this.catalogsScope = catalogsScope;
        return this;
    }

    public String getCatalogsScopeLabel() {
        return catalogsScopeLabel;
    }

    public DescribeResourceCatalogsResponse setCatalogsScopeLabel(String catalogsScopeLabel) {
        this.catalogsScopeLabel = catalogsScopeLabel;
        return this;
    }

    public List<ResourceCatalogItem> getCatalogsResources() {
        return catalogsResources;
    }

    public DescribeResourceCatalogsResponse setCatalogsResources(List<ResourceCatalogItem> catalogsResources) {
        this.catalogsResources = catalogsResources;
        return this;
    }

    public String getCatalogsResourcesResourceType() {
        return catalogsResourcesResourceType;
    }

    public DescribeResourceCatalogsResponse setCatalogsResourcesResourceType(String catalogsResourcesResourceType) {
        this.catalogsResourcesResourceType = catalogsResourcesResourceType;
        return this;
    }

    public String getCatalogsResourcesResourceTypeLabel() {
        return catalogsResourcesResourceTypeLabel;
    }

    public DescribeResourceCatalogsResponse setCatalogsResourcesResourceTypeLabel(String catalogsResourcesResourceTypeLabel) {
        this.catalogsResourcesResourceTypeLabel = catalogsResourcesResourceTypeLabel;
        return this;
    }

    public List<String> getCatalogsRegions() {
        return catalogsRegions;
    }

    public DescribeResourceCatalogsResponse setCatalogsRegions(List<String> catalogsRegions) {
        this.catalogsRegions = catalogsRegions;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeResourceCatalogsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "catalogs=" + catalogs + "\n"
                + "catalogsScope=" + catalogsScope + "\n" + "catalogsScopeLabel=" + catalogsScopeLabel + "\n" + "catalogsResources=" + catalogsResources + "\n"
                + "catalogsResourcesResourceType=" + catalogsResourcesResourceType + "\n" + "catalogsResourcesResourceTypeLabel=" + catalogsResourcesResourceTypeLabel + "\n"
                + "catalogsRegions=" + catalogsRegions + "\n" + "}";
    }

}
