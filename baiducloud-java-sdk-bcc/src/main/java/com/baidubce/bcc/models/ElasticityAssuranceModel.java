package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElasticityAssuranceModel {
    /**
     * 弹性保障短ID
     */
    private String elasticityAssuranceId;

    /**
     * 弹性保障名称
     */
    @JsonProperty("ElasticityAssuranceName")
    private String elasticityAssuranceName;

    /**
     * 实例规格
     */
    private String spec;

    /**
     * 弹性保障状态，如CREATING/ACTIVE
     */
    private String status;

    /**
     * 逻辑可用区
     */
    private String zoneName;

    /**
     * 购买的总保障容量，单位为台
     */
    private Integer capacity;

    /**
     * 当前已匹配的后付费实例数量
     */
    private Integer usedCapacity;

    /**
     * 当前剩余保障容量
     */
    private Integer availableCapacity;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 到期时间
     */
    private String expireTime;

    /**
     * 是否开启自动续费
     */
    private Boolean autoRenew;

    /**
     * 自动续费时长，单位为月；未开启时为空
     */
    private Integer autoRenewPeriod;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    /**
     * 当前关联的按量实例列表
     */
    private List<InstanceModel> instances;

    public ElasticityAssuranceModel setElasticityAssuranceId(String elasticityAssuranceId) {
        this.elasticityAssuranceId = elasticityAssuranceId;
        return this;
    }

    public String getElasticityAssuranceId() {
        return this.elasticityAssuranceId;
    }

    public ElasticityAssuranceModel setElasticityAssuranceName(String elasticityAssuranceName) {
        this.elasticityAssuranceName = elasticityAssuranceName;
        return this;
    }

    public String getElasticityAssuranceName() {
        return this.elasticityAssuranceName;
    }

    public ElasticityAssuranceModel setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public ElasticityAssuranceModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ElasticityAssuranceModel setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public ElasticityAssuranceModel setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public ElasticityAssuranceModel setUsedCapacity(Integer usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    public Integer getUsedCapacity() {
        return this.usedCapacity;
    }

    public ElasticityAssuranceModel setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    public Integer getAvailableCapacity() {
        return this.availableCapacity;
    }

    public ElasticityAssuranceModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public ElasticityAssuranceModel setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public ElasticityAssuranceModel setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ElasticityAssuranceModel setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }

    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public ElasticityAssuranceModel setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public ElasticityAssuranceModel setInstances(List<InstanceModel> instances) {
        this.instances = instances;
        return this;
    }

    public List<InstanceModel> getInstances() {
        return this.instances;
    }

    @Override
    public String toString() {
        return "ElasticityAssuranceModel{" + "elasticityAssuranceId=" + elasticityAssuranceId + "\n" + "elasticityAssuranceName=" + elasticityAssuranceName + "\n" + "spec=" + spec
                + "\n" + "status=" + status + "\n" + "zoneName=" + zoneName + "\n" + "capacity=" + capacity + "\n" + "usedCapacity=" + usedCapacity + "\n" + "availableCapacity="
                + availableCapacity + "\n" + "createTime=" + createTime + "\n" + "expireTime=" + expireTime + "\n" + "autoRenew=" + autoRenew + "\n" + "autoRenewPeriod="
                + autoRenewPeriod + "\n" + "tags=" + tags + "\n" + "instances=" + instances + "\n" + "}";
    }

}