package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRecycleInstanceRequest extends BaseBceRequest {

    /**
    * 批量获取列表的查询的起始位置，是一个由系统生成的字符串
    */
    private String marker;

    /**
    * 每页包含的最大数量，最大数量通常不超过1000，缺省值为1000。
    */
    private Integer maxKeys;

    /**
    * 虚机Id
    */
    private String instanceId;

    /**
    * 虚机名称
    */
    private String name;

    /**
    * 支付方式，包括包年包月（Prepaid）和按量付费（Postpaid）
    */
    private String paymentTiming;

    /**
    * 查询进入回收站时间大于等于该起始时间，格式yyyy-MM-ddTHH:mm:ssZ
    */
    private String recycleBegin;

    /**
    * 查询进入回收站时间小于等于该终止时间，格式yyyy-MM-ddTHH:mm:ssZ
    */
    private String recycleEnd;

    public String getMarker() {
        return marker;
    }

    public ListRecycleInstanceRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListRecycleInstanceRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ListRecycleInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListRecycleInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public ListRecycleInstanceRequest setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getRecycleBegin() {
        return recycleBegin;
    }

    public ListRecycleInstanceRequest setRecycleBegin(String recycleBegin) {
        this.recycleBegin = recycleBegin;
        return this;
    }

    public String getRecycleEnd() {
        return recycleEnd;
    }

    public ListRecycleInstanceRequest setRecycleEnd(String recycleEnd) {
        this.recycleEnd = recycleEnd;
        return this;
    }

}
