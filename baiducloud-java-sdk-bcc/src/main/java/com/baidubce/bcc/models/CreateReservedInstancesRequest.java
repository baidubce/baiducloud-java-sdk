package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateReservedInstancesRequest extends BaseBceRequest {

    /**
    * 预留实例券名称，规则：支持大小写字母、数字、中文以及-_ /.特殊字符，必须以中文或字母开头，长度1-65，可重复；客户未命名的情况下自动命名：reservedInstance-${随机生成}，同样遵循以上命名规则
    */
    private String reservedInstanceName;

    /**
    * 实例券的可用范围；默认：AZ
    */
    private String scope;

    /**
    * 可用区，例如cn-bj-a
    */
    private String zoneName;

    /**
    * 实例规格，例如bcc.g4.c2m8
    */
    private String spec;

    /**
    * 默认值全预付：FullyPrepay
    */
    private String offeringType;

    /**
    * 实例数量，默认为1，不可变更
    */
    private Integer instanceCount;

    /**
    * 预留实例券数量，默认1，不能超过配额，默认配额20，若需要更多配额，请联系工单（可链接）申请
    */
    private Integer reservedInstanceCount;

    /**
    * 预留实例券购买时长，支持3，6，9，12，24，36个月
    */
    private Integer reservedInstanceTime;

    /**
    * 预留实例券购买时长单位，默认为month，不可变更
    */
    private String reservedInstanceTimeUnit;

    /**
    * 自动续费开关，默认为false
    */
    private Boolean autoRenew;

    /**
    * 预留实例券自动续费时长单位,默认为month，不可变更
    */
    private String autoRenewTimeUnit;

    /**
    * 预留实例券自动续费时长，支持3，6，9，12，24，36个月,autoRenew为true时，必选且必须与reservedInstanceTime一致
    */
    private Integer autoRenewTime;

    /**
    * 生效时间，默认立即生效；自定义生效时间，最长不能超过1天。且只能设置为15min为间隔的整点（比如：10:00、10:15、10:30、10:45、11:00）
    */
    private String effectiveTime;

    /**
    * 标签信息（查询预留实例券返回）
    */
    private List<TagModel> tags;

    /**
    * 代金券id
    */
    private String ticketId;

    /**
    * 创建roce预留实例券时可选参数，若为空则使用默认EHC集群
    */
    private String ehcClusterId;

    public String getReservedInstanceName() {
        return reservedInstanceName;
    }

    public CreateReservedInstancesRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public CreateReservedInstancesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateReservedInstancesRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public CreateReservedInstancesRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getOfferingType() {
        return offeringType;
    }

    public CreateReservedInstancesRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    public Integer getInstanceCount() {
        return instanceCount;
    }

    public CreateReservedInstancesRequest setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getReservedInstanceCount() {
        return reservedInstanceCount;
    }

    public CreateReservedInstancesRequest setReservedInstanceCount(Integer reservedInstanceCount) {
        this.reservedInstanceCount = reservedInstanceCount;
        return this;
    }

    public Integer getReservedInstanceTime() {
        return reservedInstanceTime;
    }

    public CreateReservedInstancesRequest setReservedInstanceTime(Integer reservedInstanceTime) {
        this.reservedInstanceTime = reservedInstanceTime;
        return this;
    }

    public String getReservedInstanceTimeUnit() {
        return reservedInstanceTimeUnit;
    }

    public CreateReservedInstancesRequest setReservedInstanceTimeUnit(String reservedInstanceTimeUnit) {
        this.reservedInstanceTimeUnit = reservedInstanceTimeUnit;
        return this;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public CreateReservedInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public CreateReservedInstancesRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public CreateReservedInstancesRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public CreateReservedInstancesRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateReservedInstancesRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getTicketId() {
        return ticketId;
    }

    public CreateReservedInstancesRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    public String getEhcClusterId() {
        return ehcClusterId;
    }

    public CreateReservedInstancesRequest setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

}
