package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelSnapshotShareRequest extends BaseBceRequest {

    /**
    * 源快照需取消共享ID，共享方取消快照共享时必填。
    */
    private String sourceSnapshotId;

    /**
    * 共享方可指定取消共享的接收方账号ID，不填时默认取消全部共享。
    */
    private List<String> accountIds;

    /**
    * 已接收需取消共享的快照ID，接收方必填。
    */
    private String shareSnapshotId;

    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }

    public CancelSnapshotShareRequest setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }

    public CancelSnapshotShareRequest setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    public String getShareSnapshotId() {
        return shareSnapshotId;
    }

    public CancelSnapshotShareRequest setShareSnapshotId(String shareSnapshotId) {
        this.shareSnapshotId = shareSnapshotId;
        return this;
    }

}
