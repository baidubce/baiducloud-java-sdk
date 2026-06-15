package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseMultipleInstanceByPostRequest extends BaseBceRequest {

    /**
    * 实例id列表，列表元素数量不超过100个
    */
    private List<String> instanceIds;

    /**
    * 是否关联释放当前时刻，实例挂载的按量付费EIP（加入共享带宽的EIP自动解绑，不支持关联释放）和按量付费数据盘（只有该字段为true时deleteCdsSnapshotFlag字段才会有效，若该字段为false，deleteCdsSnapshotFlag字段的值无效）
    */
    private Boolean relatedReleaseFlag;

    /**
    * 是否释放云磁盘
    */
    private Boolean deleteRelatedCdsFlag;

    /**
    * 是否释放云磁盘快照
    */
    private Boolean deleteCdsSnapshotFlag;

    /**
    * 实例释放时是否删除关联的ENI
    */
    private Boolean deleteRelatedEnisFlag;

    /**
    * 实例释放时是否进入回收站
    */
    private Boolean bccRecycleFlag;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public ReleaseMultipleInstanceByPostRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public Boolean getRelatedReleaseFlag() {
        return relatedReleaseFlag;
    }

    public ReleaseMultipleInstanceByPostRequest setRelatedReleaseFlag(Boolean relatedReleaseFlag) {
        this.relatedReleaseFlag = relatedReleaseFlag;
        return this;
    }

    public Boolean getDeleteRelatedCdsFlag() {
        return deleteRelatedCdsFlag;
    }

    public ReleaseMultipleInstanceByPostRequest setDeleteRelatedCdsFlag(Boolean deleteRelatedCdsFlag) {
        this.deleteRelatedCdsFlag = deleteRelatedCdsFlag;
        return this;
    }

    public Boolean getDeleteCdsSnapshotFlag() {
        return deleteCdsSnapshotFlag;
    }

    public ReleaseMultipleInstanceByPostRequest setDeleteCdsSnapshotFlag(Boolean deleteCdsSnapshotFlag) {
        this.deleteCdsSnapshotFlag = deleteCdsSnapshotFlag;
        return this;
    }

    public Boolean getDeleteRelatedEnisFlag() {
        return deleteRelatedEnisFlag;
    }

    public ReleaseMultipleInstanceByPostRequest setDeleteRelatedEnisFlag(Boolean deleteRelatedEnisFlag) {
        this.deleteRelatedEnisFlag = deleteRelatedEnisFlag;
        return this;
    }

    public Boolean getBccRecycleFlag() {
        return bccRecycleFlag;
    }

    public ReleaseMultipleInstanceByPostRequest setBccRecycleFlag(Boolean bccRecycleFlag) {
        this.bccRecycleFlag = bccRecycleFlag;
        return this;
    }

}
