package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservedInstance {
    /**
     * 要调整的预留实例券id
     */
    private String reservedInstanceId;

    /**
     * 要调整的目标可用区，例如cn-bj-b。不支持同时修改reservedInstanceName
     */
    private String zoneName;

    /**
     * 
     */
    private String reservedInstanceName;

    /**
     * 变更roce预留实例券时可选参数，若为空则使用默认EHC集群
     */
    private String ehcClusterId;

    public ReservedInstance setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }

    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public ReservedInstance setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public ReservedInstance setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }

    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public ReservedInstance setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    public String getEhcClusterId() {
        return this.ehcClusterId;
    }

    @Override
    public String toString() {
        return "ReservedInstance{" + "reservedInstanceId=" + reservedInstanceId + "\n" + "zoneName=" + zoneName + "\n" + "reservedInstanceName=" + reservedInstanceName + "\n"
                + "ehcClusterId=" + ehcClusterId + "\n" + "}";
    }

}