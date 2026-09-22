package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBackUpUsageResponse extends BaseBceResponse {

    /**
    * 逻辑日志备份计费大小Bytes（备份到bos的rdb/aof）
    */
    private Long logicalLogBackupBillingSizeBytes;

    /**
    * 快照数据备份总大小Bytes
    */
    private Long snapshotDataBackupSizeBytes;

    /**
    * 物理数据备份总大小Bytes（备份到bos的rdb）
    */
    private Long physicalDataBackupSizeBytes;

    /**
    * 逻辑日志备份总大小Bytes（备份到bos的rdb/aof）
    */
    private Long logicalLogBackupSizeBytes;

    /**
    * 逻辑数据备份总大小
    */
    private Long logicalDataBackupSizeBytes;

    /**
    * 物理日志备份总大小
    */
    private Long physicalLogBackupSizeBytes;

    /**
    * 固定为Redis
    */
    private String dataType;

    public Long getLogicalLogBackupBillingSizeBytes() {
        return logicalLogBackupBillingSizeBytes;
    }

    public GetBackUpUsageResponse setLogicalLogBackupBillingSizeBytes(Long logicalLogBackupBillingSizeBytes) {
        this.logicalLogBackupBillingSizeBytes = logicalLogBackupBillingSizeBytes;
        return this;
    }

    public Long getSnapshotDataBackupSizeBytes() {
        return snapshotDataBackupSizeBytes;
    }

    public GetBackUpUsageResponse setSnapshotDataBackupSizeBytes(Long snapshotDataBackupSizeBytes) {
        this.snapshotDataBackupSizeBytes = snapshotDataBackupSizeBytes;
        return this;
    }

    public Long getPhysicalDataBackupSizeBytes() {
        return physicalDataBackupSizeBytes;
    }

    public GetBackUpUsageResponse setPhysicalDataBackupSizeBytes(Long physicalDataBackupSizeBytes) {
        this.physicalDataBackupSizeBytes = physicalDataBackupSizeBytes;
        return this;
    }

    public Long getLogicalLogBackupSizeBytes() {
        return logicalLogBackupSizeBytes;
    }

    public GetBackUpUsageResponse setLogicalLogBackupSizeBytes(Long logicalLogBackupSizeBytes) {
        this.logicalLogBackupSizeBytes = logicalLogBackupSizeBytes;
        return this;
    }

    public Long getLogicalDataBackupSizeBytes() {
        return logicalDataBackupSizeBytes;
    }

    public GetBackUpUsageResponse setLogicalDataBackupSizeBytes(Long logicalDataBackupSizeBytes) {
        this.logicalDataBackupSizeBytes = logicalDataBackupSizeBytes;
        return this;
    }

    public Long getPhysicalLogBackupSizeBytes() {
        return physicalLogBackupSizeBytes;
    }

    public GetBackUpUsageResponse setPhysicalLogBackupSizeBytes(Long physicalLogBackupSizeBytes) {
        this.physicalLogBackupSizeBytes = physicalLogBackupSizeBytes;
        return this;
    }

    public String getDataType() {
        return dataType;
    }

    public GetBackUpUsageResponse setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    @Override
    public String toString() {
        return "GetBackUpUsageResponse{" + "logicalLogBackupBillingSizeBytes=" + logicalLogBackupBillingSizeBytes + "\n" + "snapshotDataBackupSizeBytes="
                + snapshotDataBackupSizeBytes + "\n" + "physicalDataBackupSizeBytes=" + physicalDataBackupSizeBytes + "\n" + "logicalLogBackupSizeBytes="
                + logicalLogBackupSizeBytes + "\n" + "logicalDataBackupSizeBytes=" + logicalDataBackupSizeBytes + "\n" + "physicalLogBackupSizeBytes=" + physicalLogBackupSizeBytes
                + "\n" + "dataType=" + dataType + "\n" + "}";
    }

}
