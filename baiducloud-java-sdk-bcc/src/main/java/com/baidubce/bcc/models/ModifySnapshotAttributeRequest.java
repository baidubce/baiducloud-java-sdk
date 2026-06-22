package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifySnapshotAttributeRequest extends BaseBceRequest {

    /**
    * snapshotId
    */
    @JsonIgnore
    private String snapshotId;

    /**
    * 修改后的快照名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String snapshotName;

    /**
    * 快照的保留时间，删除时间将从修改时间点开始重新计算。取值范围为1-10000天
    */
    private Integer retentionInDays;

    /**
    * 快照描述信息
    */
    private String desc;

    public String getSnapshotId() {
        return snapshotId;
    }

    public ModifySnapshotAttributeRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public ModifySnapshotAttributeRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    public Integer getRetentionInDays() {
        return retentionInDays;
    }

    public ModifySnapshotAttributeRequest setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ModifySnapshotAttributeRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

}
