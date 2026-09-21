package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlSpaceSummaryResponse extends BaseBceResponse {

    /**
    * totalDiskSize
    */
    private Object totalDiskSize;

    /**
    * 已用空间（字节）
    */
    private Float usedSpace;

    /**
    * 可用空间（字节）
    */
    private Float availableSpace;

    /**
    * 预计可用天数
    */
    private Float availableDays;

    /**
    * 日均增长空间（字节）
    */
    private Float dayGrowSpaceAvg;

    public Object getTotalDiskSize() {
        return totalDiskSize;
    }

    public GetMysqlSpaceSummaryResponse setTotalDiskSize(Object totalDiskSize) {
        this.totalDiskSize = totalDiskSize;
        return this;
    }

    public Float getUsedSpace() {
        return usedSpace;
    }

    public GetMysqlSpaceSummaryResponse setUsedSpace(Float usedSpace) {
        this.usedSpace = usedSpace;
        return this;
    }

    public Float getAvailableSpace() {
        return availableSpace;
    }

    public GetMysqlSpaceSummaryResponse setAvailableSpace(Float availableSpace) {
        this.availableSpace = availableSpace;
        return this;
    }

    public Float getAvailableDays() {
        return availableDays;
    }

    public GetMysqlSpaceSummaryResponse setAvailableDays(Float availableDays) {
        this.availableDays = availableDays;
        return this;
    }

    public Float getDayGrowSpaceAvg() {
        return dayGrowSpaceAvg;
    }

    public GetMysqlSpaceSummaryResponse setDayGrowSpaceAvg(Float dayGrowSpaceAvg) {
        this.dayGrowSpaceAvg = dayGrowSpaceAvg;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlSpaceSummaryResponse{" + "totalDiskSize=" + totalDiskSize + "\n" + "usedSpace=" + usedSpace + "\n" + "availableSpace=" + availableSpace + "\n"
                + "availableDays=" + availableDays + "\n" + "dayGrowSpaceAvg=" + dayGrowSpaceAvg + "\n" + "}";
    }

}
