package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlDeadlockInfoResponse extends BaseBceResponse {

    /**
    * 死锁元信息
    */
    private Object metaInfo;

    /**
    * 死锁ID
    */
    private String deadLockId;

    /**
    * 生成时间
    */
    private String timestamp;

    /**
    * 原始死锁信息
    */
    private String rawContent;

    /**
    * 死锁事务信息
    */
    private List<MysqlDeadLockTransaction> transactionLocks;

    public Object getMetaInfo() {
        return metaInfo;
    }

    public GetMysqlDeadlockInfoResponse setMetaInfo(Object metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }

    public String getDeadLockId() {
        return deadLockId;
    }

    public GetMysqlDeadlockInfoResponse setDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public GetMysqlDeadlockInfoResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getRawContent() {
        return rawContent;
    }

    public GetMysqlDeadlockInfoResponse setRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    public List<MysqlDeadLockTransaction> getTransactionLocks() {
        return transactionLocks;
    }

    public GetMysqlDeadlockInfoResponse setTransactionLocks(List<MysqlDeadLockTransaction> transactionLocks) {
        this.transactionLocks = transactionLocks;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlDeadlockInfoResponse{" + "metaInfo=" + metaInfo + "\n" + "deadLockId=" + deadLockId + "\n" + "timestamp=" + timestamp + "\n" + "rawContent=" + rawContent
                + "\n" + "transactionLocks=" + transactionLocks + "\n" + "}";
    }

}
