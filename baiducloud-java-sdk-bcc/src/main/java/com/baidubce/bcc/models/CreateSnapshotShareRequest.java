package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnapshotShareRequest extends BaseBceRequest {

    /**
    * 需要操作共享的快照
    */
    private String snapshotId;

    /**
    * 共享的账号列表，最多支持100个百度云主账号，对于共享状态为"接受共享"快照，配置共享账号不会生效，如果传空则会为"共享中"的快照取消共享状态
    */
    private List<String> accountIds;

    public String getSnapshotId() {
        return snapshotId;
    }

    public CreateSnapshotShareRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }

    public CreateSnapshotShareRequest setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

}
