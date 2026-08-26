package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceCatalog {
    /**
     * 云产品标识，可作为指标查询接口的scope参数
     */
    private String scope;

    /**
     * 云产品显示名称，根据locale返回中文或英文名称
     */
    private String scopeLabel;

    /**
     * 云产品下的资源类型列表
     */
    private List<ResourceCatalogItem> resources;

    /**
     * 云产品适用的地域列表。仅配置了固定地域信息时返回；例如全局产品返回global
     */
    private List<String> regions;

    public ResourceCatalog setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public ResourceCatalog setScopeLabel(String scopeLabel) {
        this.scopeLabel = scopeLabel;
        return this;
    }

    public String getScopeLabel() {
        return this.scopeLabel;
    }

    public ResourceCatalog setResources(List<ResourceCatalogItem> resources) {
        this.resources = resources;
        return this;
    }

    public List<ResourceCatalogItem> getResources() {
        return this.resources;
    }

    public ResourceCatalog setRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public List<String> getRegions() {
        return this.regions;
    }

    @Override
    public String toString() {
        return "ResourceCatalog{" + "scope=" + scope + "\n" + "scopeLabel=" + scopeLabel + "\n" + "resources=" + resources + "\n" + "regions=" + regions + "\n" + "}";
    }

}