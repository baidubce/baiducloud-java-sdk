package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListVolumesRequest extends BaseBceRequest {

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * clusterId
    */
    @JsonIgnore
    private String clusterId;

    /**
    * chargeFilter
    */
    @JsonIgnore
    private String chargeFilter;

    /**
    * usageFilter
    */
    @JsonIgnore
    private String usageFilter;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * productCategory
    */
    @JsonIgnore
    private String productCategory;

    public String getMarker() {
        return marker;
    }

    public ListVolumesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListVolumesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ListVolumesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public ListVolumesRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public ListVolumesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getChargeFilter() {
        return chargeFilter;
    }

    public ListVolumesRequest setChargeFilter(String chargeFilter) {
        this.chargeFilter = chargeFilter;
        return this;
    }

    public String getUsageFilter() {
        return usageFilter;
    }

    public ListVolumesRequest setUsageFilter(String usageFilter) {
        this.usageFilter = usageFilter;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListVolumesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public ListVolumesRequest setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

}
