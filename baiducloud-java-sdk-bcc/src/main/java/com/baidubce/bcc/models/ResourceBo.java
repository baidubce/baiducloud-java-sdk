package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceBo {
    /**
     * 实例ID
     */
    private String id;

    /**
     * 实例长ID
     */
    private String serialNumber;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 进入回收站的时间
     */
    private String recycleTime;

    /**
     * 从回收站删除的时间
     */
    private String deleteTime;

    /**
     * 付费类型 prepay/postpay
     */
    private String paymentTiming;

    /**
     * 资源名称，这里为"云服务器"
     */
    private String serviceName;

    /**
     * 资源类型，这里为"BCC"
     */
    private String serviceType;

    /**
     * configItem
     */
    private ConfigItem configItem;

    /**
     * 实例配置列表
     */
    private List<String> configItems;

    public ResourceBo setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ResourceBo setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ResourceBo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ResourceBo setRecycleTime(String recycleTime) {
        this.recycleTime = recycleTime;
        return this;
    }

    public String getRecycleTime() {
        return this.recycleTime;
    }

    public ResourceBo setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    public String getDeleteTime() {
        return this.deleteTime;
    }

    public ResourceBo setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public ResourceBo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public ResourceBo setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public ResourceBo setConfigItem(ConfigItem configItem) {
        this.configItem = configItem;
        return this;
    }

    public ConfigItem getConfigItem() {
        return this.configItem;
    }

    public ResourceBo setConfigItems(List<String> configItems) {
        this.configItems = configItems;
        return this;
    }

    public List<String> getConfigItems() {
        return this.configItems;
    }

    @Override
    public String toString() {
        return "ResourceBo{" + "id=" + id + "\n" + "serialNumber=" + serialNumber + "\n" + "name=" + name + "\n" + "recycleTime=" + recycleTime + "\n" + "deleteTime=" + deleteTime
                + "\n" + "paymentTiming=" + paymentTiming + "\n" + "serviceName=" + serviceName + "\n" + "serviceType=" + serviceType + "\n" + "configItem=" + configItem + "\n"
                + "configItems=" + configItems + "\n" + "}";
    }

}