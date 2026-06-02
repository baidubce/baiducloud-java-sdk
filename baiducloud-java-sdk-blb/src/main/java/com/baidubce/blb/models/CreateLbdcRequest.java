package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateLbdcRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 集群名称，长度1~65个字节，字母开头，_可包含字母数字-/.字符
    */
    private String name;

    /**
    * 集群类型，取值为"4Layer"或者"7Layer"
    */
    private String type;

    /**
    * 集群性能容量单位CCU（Cluster Capacity Unit）是用来衡量BLB集群处理流量时涉及的各个指标。
    */
    private Integer ccuCount;

    /**
    * LBDC的描述，最大支持200字符
    */
    private String desc;

    /**
    * billing
    */
    private BillingForCreate billing;

    /**
    * renewReservation
    */
    private ReservationForCreate renewReservation;

    /**
    * 标签
    */
    private List<TagModel> tags;

    public String getClientToken() {
        return clientToken;
    }

    public CreateLbdcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateLbdcRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateLbdcRequest setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getCcuCount() {
        return ccuCount;
    }

    public CreateLbdcRequest setCcuCount(Integer ccuCount) {
        this.ccuCount = ccuCount;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateLbdcRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public BillingForCreate getBilling() {
        return billing;
    }

    public CreateLbdcRequest setBilling(BillingForCreate billing) {
        this.billing = billing;
        return this;
    }

    public ReservationForCreate getRenewReservation() {
        return renewReservation;
    }

    public CreateLbdcRequest setRenewReservation(ReservationForCreate renewReservation) {
        this.renewReservation = renewReservation;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateLbdcRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
