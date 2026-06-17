package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferOutRecord {
    /**
     * 券转移记录id
     */
    private String transferRecordId;

    /**
     * 接收人账号(脱敏处理)
     */
    private String recipientUserId;

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

    public TransferOutRecord setTransferRecordId(String transferRecordId) {
        this.transferRecordId = transferRecordId;
        return this;
    }

    public String getTransferRecordId() {
        return this.transferRecordId;
    }

    public TransferOutRecord setRecipientUserId(String recipientUserId) {
        this.recipientUserId = recipientUserId;
        return this;
    }

    public String getRecipientUserId() {
        return this.recipientUserId;
    }

    public TransferOutRecord setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public TransferOutRecord setReservedInstanceInfo(ReservedInstanceInfo reservedInstanceInfo) {
        this.reservedInstanceInfo = reservedInstanceInfo;
        return this;
    }

    public ReservedInstanceInfo getReservedInstanceInfo() {
        return this.reservedInstanceInfo;
    }

    public TransferOutRecord setApplicationTime(String applicationTime) {
        this.applicationTime = applicationTime;
        return this;
    }

    public String getApplicationTime() {
        return this.applicationTime;
    }

    public TransferOutRecord setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public TransferOutRecord setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public String toString() {
        return "TransferOutRecord{" + "transferRecordId=" + transferRecordId + "\n" + "recipientUserId=" + recipientUserId + "\n" + "status=" + status + "\n"
                + "reservedInstanceInfo=" + reservedInstanceInfo + "\n" + "applicationTime=" + applicationTime + "\n" + "expireTime=" + expireTime + "\n" + "endTime=" + endTime
                + "\n" + "}";
    }

}