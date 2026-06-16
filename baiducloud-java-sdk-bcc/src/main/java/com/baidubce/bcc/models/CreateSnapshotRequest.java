package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnapshotRequest extends BaseBceRequest {

    /**
    * 用于创建快照的磁盘ID，系统盘则为实例ID
    */
    private String volumeId;

    /**
    * 快照名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String snapshotName;

    /**
    * 快照描述信息，选填，只支持中文、字母、数字、点号“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”、冒号“：”、斜杠 “/” 和中文句号“。”
    */
    private String desc;

    /**
    * 绑定标签信息
    */
    private List<TagModel> tags;

    /**
    * 快照的保留时间，默认-1永久保留，取值范围为1-10000天
    */
    private Integer retentionInDays;

    public String getVolumeId() {
        return volumeId;
    }

    public CreateSnapshotRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public CreateSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateSnapshotRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateSnapshotRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public Integer getRetentionInDays() {
        return retentionInDays;
    }

    public CreateSnapshotRequest setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

}
