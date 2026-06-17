package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReservedInstanceRequest extends BaseBceRequest {

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
    * 预留实例券的id集合
    */
    private List<String> reservedInstanceIds;

    /**
    * 实例券的名称
    */
    private String reservedInstanceName;

    /**
    * 可用区，例如：cn-bj-a
    */
    private String zoneName;

    /**
    * 预留实例券的状态
    */
    private String reservedInstanceStatus;

    /**
    * 实例规格，例如：bcc.g4.c2m8
    */
    private String spec;

    /**
    * FullyPrepay：全预付
    */
    private String offeringType;

    /**
    * 支持的镜像类型，all/linux/windows
    */
    private String osType;

    /**
    * 抵扣实例ID
    */
    private String instanceId;

    /**
    * 实例名称
    */
    private String instanceName;

    /**
    * 是否有抵扣实例：true/false
    */
    private Boolean isDeduct;

    /**
    * ehc集群id
    */
    private String ehcClusterId;

    /**
    * 排序字段：osType/instanceCount/effectiveTime/expireTime
    */
    private String sortKey;

    /**
    * 排序方式：desc/asc
    */
    private String sortDir;

    /**
    * 预留实例券来源
    */
    private String reservedInstanceSource;

    /**
    * 生效范围
    */
    private String scope;

    public String getMarker() {
        return marker;
    }

    public GetReservedInstanceRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public GetReservedInstanceRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public GetReservedInstanceRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public String getReservedInstanceName() {
        return reservedInstanceName;
    }

    public GetReservedInstanceRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetReservedInstanceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getReservedInstanceStatus() {
        return reservedInstanceStatus;
    }

    public GetReservedInstanceRequest setReservedInstanceStatus(String reservedInstanceStatus) {
        this.reservedInstanceStatus = reservedInstanceStatus;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public GetReservedInstanceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getOfferingType() {
        return offeringType;
    }

    public GetReservedInstanceRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    public String getOsType() {
        return osType;
    }

    public GetReservedInstanceRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public GetReservedInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public GetReservedInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public Boolean getIsDeduct() {
        return isDeduct;
    }

    public GetReservedInstanceRequest setIsDeduct(Boolean isDeduct) {
        this.isDeduct = isDeduct;
        return this;
    }

    public String getEhcClusterId() {
        return ehcClusterId;
    }

    public GetReservedInstanceRequest setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    public String getSortKey() {
        return sortKey;
    }

    public GetReservedInstanceRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public String getSortDir() {
        return sortDir;
    }

    public GetReservedInstanceRequest setSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public String getReservedInstanceSource() {
        return reservedInstanceSource;
    }

    public GetReservedInstanceRequest setReservedInstanceSource(String reservedInstanceSource) {
        this.reservedInstanceSource = reservedInstanceSource;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public GetReservedInstanceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

}
