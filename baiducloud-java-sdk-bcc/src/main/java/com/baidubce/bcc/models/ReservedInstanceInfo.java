package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservedInstanceInfo {
    /**
     * 预留实例券id（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String reservedInstanceId;

    /**
     * 预留实例券长id（查询预留实例券、预留实例券转出列表返回）
     */
    private String reservedInstanceUuid;

    /**
     * 预留实例券名称（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String reservedInstanceName;

    /**
     * 预留实例券生效范围（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String scope;

    /**
     * 预留实例券可用区（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String zoneName;

    /**
     * 逻辑可用区（查询预留实例券、预留实例券转出列表返回）
     */
    private String logicalZone;

    /**
     * 预留实例券实例规格（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String spec;

    /**
     * 预留实例券类型（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String reservedType;

    /**
     * 预留实例券付费方式（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String offeringType;

    /**
     * 预留实例券镜像类型（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String osType;

    /**
     * 预留实例券状态（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String reservedInstanceStatus;

    /**
     * 预留实例券实例数量（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private Integer instanceCount;

    /**
     * 预留实例券生效时间（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String effectiveTime;

    /**
     * 预留实例券过期时间（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String expireTime;

    /**
     * 转入时间（查询预留实例券、预留实例券转出列表返回）
     */
    private String transferInTime;

    /**
     * 预留实例券是否开启自动续费（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private Boolean autoRenew;

    /**
     * 预留实例券自动续费单位（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String renewTimeUnit;

    /**
     * 预留实例券续费时长（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private Integer renewTime;

    /**
     * 预留实例券下次自动续费时间（查询预留实例券、预留实例券转出列表、预留实例券转入列表返回）
     */
    private String nextRenewTime;

    /**
     * 规格子类型（查询预留实例券、预留实例券转出列表返回）
     */
    private String flavorSubType;

    /**
     * 产品类别类别（查询预留实例券、预留实例券转出列表返回）
     */
    private String productCategory;

    /**
     * 是否需要EHC集群（查询预留实例券、预留实例券转出列表返回）
     */
    private Boolean isNeedEhcCluster;

    /**
     * 标签信息（查询预留实例券返回）
     */
    private List<TagModel> tags;

    /**
     * 抵扣实例ID（查询预留实例券、预留实例券转出列表返回）
     */
    private String instanceId;

    /**
     * 实例ID列表（查询预留实例券返回）
     */
    private List<String> instanceIds;

    /**
     * 抵扣实例名称（查询预留实例券、预留实例券转出列表返回）
     */
    private String instanceName;

    /**
     * 抵扣实例名称（查询预留实例券返回）
     */
    private List<String> instanceNames;

    /**
     * 是否已转入（查询预留实例券返回）
     */
    private Boolean transferIn;

    /**
     * 授予者用户ID（查询预留实例券返回）
     */
    private String grantorUserId;

    /**
     * 时间粒度（查询预留实例券返回）
     */
    private String timeGranularity;

    /**
     * 预留实例时间（查询预留实例券返回）
     */
    private Integer reservedInstanceTime;

    /**
     * 预留实例券所在ehc集群id（查询预留实例券返回）
     */
    private String ehcClusterId;

    public ReservedInstanceInfo setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }

    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public ReservedInstanceInfo setReservedInstanceUuid(String reservedInstanceUuid) {
        this.reservedInstanceUuid = reservedInstanceUuid;
        return this;
    }

    public String getReservedInstanceUuid() {
        return this.reservedInstanceUuid;
    }

    public ReservedInstanceInfo setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }

    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public ReservedInstanceInfo setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public ReservedInstanceInfo setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public ReservedInstanceInfo setLogicalZone(String logicalZone) {
        this.logicalZone = logicalZone;
        return this;
    }

    public String getLogicalZone() {
        return this.logicalZone;
    }

    public ReservedInstanceInfo setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public ReservedInstanceInfo setReservedType(String reservedType) {
        this.reservedType = reservedType;
        return this;
    }

    public String getReservedType() {
        return this.reservedType;
    }

    public ReservedInstanceInfo setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    public String getOfferingType() {
        return this.offeringType;
    }

    public ReservedInstanceInfo setOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getOsType() {
        return this.osType;
    }

    public ReservedInstanceInfo setReservedInstanceStatus(String reservedInstanceStatus) {
        this.reservedInstanceStatus = reservedInstanceStatus;
        return this;
    }

    public String getReservedInstanceStatus() {
        return this.reservedInstanceStatus;
    }

    public ReservedInstanceInfo setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public ReservedInstanceInfo setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ReservedInstanceInfo setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public ReservedInstanceInfo setTransferInTime(String transferInTime) {
        this.transferInTime = transferInTime;
        return this;
    }

    public String getTransferInTime() {
        return this.transferInTime;
    }

    public ReservedInstanceInfo setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ReservedInstanceInfo setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }

    public String getRenewTimeUnit() {
        return this.renewTimeUnit;
    }

    public ReservedInstanceInfo setRenewTime(Integer renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    public Integer getRenewTime() {
        return this.renewTime;
    }

    public ReservedInstanceInfo setNextRenewTime(String nextRenewTime) {
        this.nextRenewTime = nextRenewTime;
        return this;
    }

    public String getNextRenewTime() {
        return this.nextRenewTime;
    }

    public ReservedInstanceInfo setFlavorSubType(String flavorSubType) {
        this.flavorSubType = flavorSubType;
        return this;
    }

    public String getFlavorSubType() {
        return this.flavorSubType;
    }

    public ReservedInstanceInfo setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public ReservedInstanceInfo setIsNeedEhcCluster(Boolean isNeedEhcCluster) {
        this.isNeedEhcCluster = isNeedEhcCluster;
        return this;
    }

    public Boolean getIsNeedEhcCluster() {
        return this.isNeedEhcCluster;
    }

    public ReservedInstanceInfo setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public ReservedInstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public ReservedInstanceInfo setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ReservedInstanceInfo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public ReservedInstanceInfo setInstanceNames(List<String> instanceNames) {
        this.instanceNames = instanceNames;
        return this;
    }

    public List<String> getInstanceNames() {
        return this.instanceNames;
    }

    public ReservedInstanceInfo setTransferIn(Boolean transferIn) {
        this.transferIn = transferIn;
        return this;
    }

    public Boolean getTransferIn() {
        return this.transferIn;
    }

    public ReservedInstanceInfo setGrantorUserId(String grantorUserId) {
        this.grantorUserId = grantorUserId;
        return this;
    }

    public String getGrantorUserId() {
        return this.grantorUserId;
    }

    public ReservedInstanceInfo setTimeGranularity(String timeGranularity) {
        this.timeGranularity = timeGranularity;
        return this;
    }

    public String getTimeGranularity() {
        return this.timeGranularity;
    }

    public ReservedInstanceInfo setReservedInstanceTime(Integer reservedInstanceTime) {
        this.reservedInstanceTime = reservedInstanceTime;
        return this;
    }

    public Integer getReservedInstanceTime() {
        return this.reservedInstanceTime;
    }

    public ReservedInstanceInfo setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    public String getEhcClusterId() {
        return this.ehcClusterId;
    }

    @Override
    public String toString() {
        return "ReservedInstanceInfo{" + "reservedInstanceId=" + reservedInstanceId + "\n" + "reservedInstanceUuid=" + reservedInstanceUuid + "\n" + "reservedInstanceName="
                + reservedInstanceName + "\n" + "scope=" + scope + "\n" + "zoneName=" + zoneName + "\n" + "logicalZone=" + logicalZone + "\n" + "spec=" + spec + "\n"
                + "reservedType=" + reservedType + "\n" + "offeringType=" + offeringType + "\n" + "osType=" + osType + "\n" + "reservedInstanceStatus=" + reservedInstanceStatus
                + "\n" + "instanceCount=" + instanceCount + "\n" + "effectiveTime=" + effectiveTime + "\n" + "expireTime=" + expireTime + "\n" + "transferInTime=" + transferInTime
                + "\n" + "autoRenew=" + autoRenew + "\n" + "renewTimeUnit=" + renewTimeUnit + "\n" + "renewTime=" + renewTime + "\n" + "nextRenewTime=" + nextRenewTime + "\n"
                + "flavorSubType=" + flavorSubType + "\n" + "productCategory=" + productCategory + "\n" + "isNeedEhcCluster=" + isNeedEhcCluster + "\n" + "tags=" + tags + "\n"
                + "instanceId=" + instanceId + "\n" + "instanceIds=" + instanceIds + "\n" + "instanceName=" + instanceName + "\n" + "instanceNames=" + instanceNames + "\n"
                + "transferIn=" + transferIn + "\n" + "grantorUserId=" + grantorUserId + "\n" + "timeGranularity=" + timeGranularity + "\n" + "reservedInstanceTime="
                + reservedInstanceTime + "\n" + "ehcClusterId=" + ehcClusterId + "\n" + "}";
    }

}