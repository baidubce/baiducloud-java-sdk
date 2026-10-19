package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveInstanceAutoScalingConfigResponse extends BaseBceResponse {

    /**
    * 实例是否启用了存储自动扩容，0表示未启用，1表示已启用
    */
    private Integer autoResizeDisk;

    /**
    * 可用空间阈值, 单位%
    */
    private Integer freeSpaceThreshold;

    /**
    * 自动扩容磁盘的上限,单位GB
    */
    private Integer diskMaxLimit;

    /**
    * 触发自动扩容时，目标磁盘大小增长百分比，单位%
    */
    private Integer extendStepPercent;

    public Integer getAutoResizeDisk() {
        return autoResizeDisk;
    }

    public RetrieveInstanceAutoScalingConfigResponse setAutoResizeDisk(Integer autoResizeDisk) {
        this.autoResizeDisk = autoResizeDisk;
        return this;
    }

    public Integer getFreeSpaceThreshold() {
        return freeSpaceThreshold;
    }

    public RetrieveInstanceAutoScalingConfigResponse setFreeSpaceThreshold(Integer freeSpaceThreshold) {
        this.freeSpaceThreshold = freeSpaceThreshold;
        return this;
    }

    public Integer getDiskMaxLimit() {
        return diskMaxLimit;
    }

    public RetrieveInstanceAutoScalingConfigResponse setDiskMaxLimit(Integer diskMaxLimit) {
        this.diskMaxLimit = diskMaxLimit;
        return this;
    }

    public Integer getExtendStepPercent() {
        return extendStepPercent;
    }

    public RetrieveInstanceAutoScalingConfigResponse setExtendStepPercent(Integer extendStepPercent) {
        this.extendStepPercent = extendStepPercent;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveInstanceAutoScalingConfigResponse{" + "autoResizeDisk=" + autoResizeDisk + "\n" + "freeSpaceThreshold=" + freeSpaceThreshold + "\n" + "diskMaxLimit="
                + diskMaxLimit + "\n" + "extendStepPercent=" + extendStepPercent + "\n" + "}";
    }

}
