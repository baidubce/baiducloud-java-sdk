package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferInRecord {
    /**
     * 券转移记录id
     */
    private String transferRecordId;

    /**
     * 转让人账号(脱敏处理)
     */
    private String grantorUserId;

    /**
     * 券转移记录状态
     */
    private String status;

    /**
     * reservedInstanceInfo
     */
    private ReservedInstanceInfo reservedInstanceInfo;

    /**
     * 券转移发起时间
     */
    private String applicationTime;

    /**
     * 券转移过期时间
     */
    private String expireTime;

    /**
     * 券转移结束时间
     */
    private String endTime;

    public TransferInRecord setTransferRecordId(String transferRecordId) {
        this.transferRecordId = transferRecordId;
        return this;
    }

    public String getTransferRecordId() {
        return this.transferRecordId;
    }

    public TransferInRecord setGrantorUserId(String grantorUserId) {
        this.grantorUserId = grantorUserId;
        return this;
    }

    public String getGrantorUserId() {
        return this.grantorUserId;
    }

    public TransferInRecord setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public TransferInRecord setReservedInstanceInfo(ReservedInstanceInfo reservedInstanceInfo) {
        this.reservedInstanceInfo = reservedInstanceInfo;
        return this;
    }

    public ReservedInstanceInfo getReservedInstanceInfo() {
        return this.reservedInstanceInfo;
    }

    public TransferInRecord setApplicationTime(String applicationTime) {
        this.applicationTime = applicationTime;
        return this;
    }

    public String getApplicationTime() {
        return this.applicationTime;
    }

    public TransferInRecord setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public TransferInRecord setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public String toString() {
        return "TransferInRecord{" + "transferRecordId=" + transferRecordId + "\n" + "grantorUserId=" + grantorUserId + "\n" + "status=" + status + "\n" + "reservedInstanceInfo="
                + reservedInstanceInfo + "\n" + "applicationTime=" + applicationTime + "\n" + "expireTime=" + expireTime + "\n" + "endTime=" + endTime + "\n" + "}";
    }

}