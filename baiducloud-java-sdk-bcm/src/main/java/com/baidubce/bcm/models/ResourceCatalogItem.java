package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceCatalogItem {
    /**
     * 资源类型标识，可作为指标查询接口的resourceType参数
     */
    private String resourceType;

    /**
     * 资源类型显示名称，根据locale返回中文或英文名称
     */
    private String resourceTypeLabel;

    public ResourceCatalogItem setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public ResourceCatalogItem setResourceTypeLabel(String resourceTypeLabel) {
        this.resourceTypeLabel = resourceTypeLabel;
        return this;
    }

    public String getResourceTypeLabel() {
        return this.resourceTypeLabel;
    }

    @Override
    public String toString() {
        return "ResourceCatalogItem{" + "resourceType=" + resourceType + "\n" + "resourceTypeLabel=" + resourceTypeLabel + "\n" + "}";
    }

}