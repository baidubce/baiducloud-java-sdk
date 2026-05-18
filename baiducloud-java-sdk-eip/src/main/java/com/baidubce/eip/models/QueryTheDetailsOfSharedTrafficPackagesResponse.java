package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheDetailsOfSharedTrafficPackagesResponse extends BaseBceResponse {

    /**
    * 共享流量包id
    */
    private String id;

    /**
    * 共享流量包扣费策略，包含 \"FullTimeDurationPackage\" 全时；\"TimeDurationPackage\" 闲时
    */
    private String deductPolicy;

    /**
    * 共享流量包线路类型，当前支持 \"WebOutBytes\" 动态
    */
    private String packageType;

    /**
    * 共享流量包状态，包含 \"RUNNING\" 使用中；\"EXPIRED\" 已过期；\"USED_UP\" 已用完
    */
    private String status;

    /**
    * 共享流量包总容量，容量单位 Byte
    */
    private String capacity;

    /**
    * 共享流量包已使用容量，容量单位 Byte
    */
    private String usedCapacity;

    /**
    * 共享流量包创建时间
    */
    private String createTime;

    /**
    * 共享流量包激活时间
    */
    private String activeTime;

    /**
    * 共享流量包过期时间
    */
    private String expireTime;

    public String getId() {
        return id;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getDeductPolicy() {
        return deductPolicy;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setDeductPolicy(String deductPolicy) {
        this.deductPolicy = deductPolicy;
        return this;
    }

    public String getPackageType() {
        return packageType;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCapacity() {
        return capacity;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getUsedCapacity() {
        return usedCapacity;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getActiveTime() {
        return activeTime;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public QueryTheDetailsOfSharedTrafficPackagesResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheDetailsOfSharedTrafficPackagesResponse{" + "id=" + id + "\n" + "deductPolicy=" + deductPolicy + "\n" + "packageType=" + packageType + "\n" + "status="
                + status + "\n" + "capacity=" + capacity + "\n" + "usedCapacity=" + usedCapacity + "\n" + "createTime=" + createTime + "\n" + "activeTime=" + activeTime + "\n"
                + "expireTime=" + expireTime + "\n" + "}";
    }

}
