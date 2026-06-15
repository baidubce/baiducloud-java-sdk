package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePrepayInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 是否关联释放当前时刻，实例挂载的EIP和数据盘。默认值：false，不关联释放。注意：实例关联的预付费CDS盘会强制随实例一起释放。
    */
    private Boolean relatedReleaseFlag;

    /**
    * 是否释放云磁盘快照。默认值：false，不关联释放
    */
    private Boolean deleteCdsSnapshotFlag;

    /**
    * 实例释放时是否删除关联的ENI。默认值：false，不关联释放
    */
    private Boolean deleteRelatedEnisFlag;

    public String getInstanceId() {
        return instanceId;
    }

    public DeletePrepayInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getRelatedReleaseFlag() {
        return relatedReleaseFlag;
    }

    public DeletePrepayInstanceRequest setRelatedReleaseFlag(Boolean relatedReleaseFlag) {
        this.relatedReleaseFlag = relatedReleaseFlag;
        return this;
    }

    public Boolean getDeleteCdsSnapshotFlag() {
        return deleteCdsSnapshotFlag;
    }

    public DeletePrepayInstanceRequest setDeleteCdsSnapshotFlag(Boolean deleteCdsSnapshotFlag) {
        this.deleteCdsSnapshotFlag = deleteCdsSnapshotFlag;
        return this;
    }

    public Boolean getDeleteRelatedEnisFlag() {
        return deleteRelatedEnisFlag;
    }

    public DeletePrepayInstanceRequest setDeleteRelatedEnisFlag(Boolean deleteRelatedEnisFlag) {
        this.deleteRelatedEnisFlag = deleteRelatedEnisFlag;
        return this;
    }

}
