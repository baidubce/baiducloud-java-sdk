package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 新扩容CDS磁盘的容量大小，必须为大于当前CDS容量的整数，单位为GB，大小为0~32765GB的正整数。
    */
    private Integer newCdsSizeInGB;

    /**
    * 调整后的额外IOPS数量，支持升配和降配，newVolumeType、newCdsSizeInGB和newExtraIO不允许同时为空。
    */
    private Integer newExtraIO;

    /**
    * CDS支持对预付费和后付费云磁盘进行升配和降配。newVolumeType和newCdsSizeInGB不允许同时为空。
    */
    private String newVolumeType;

    public String getVolumeId() {
        return volumeId;
    }

    public ResizeVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public Integer getNewCdsSizeInGB() {
        return newCdsSizeInGB;
    }

    public ResizeVolumeRequest setNewCdsSizeInGB(Integer newCdsSizeInGB) {
        this.newCdsSizeInGB = newCdsSizeInGB;
        return this;
    }

    public Integer getNewExtraIO() {
        return newExtraIO;
    }

    public ResizeVolumeRequest setNewExtraIO(Integer newExtraIO) {
        this.newExtraIO = newExtraIO;
        return this;
    }

    public String getNewVolumeType() {
        return newVolumeType;
    }

    public ResizeVolumeRequest setNewVolumeType(String newVolumeType) {
        this.newVolumeType = newVolumeType;
        return this;
    }

}
