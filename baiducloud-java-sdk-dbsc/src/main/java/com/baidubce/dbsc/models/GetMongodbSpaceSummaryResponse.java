package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbSpaceSummaryResponse extends BaseBceResponse {

    /**
    * 磁盘总大小（字节）
    */
    private String totalDiskSize;

    /**
    * 已用空间（字节）
    */
    private String usedSpace;

    /**
    * 可用空间（字节）
    */
    private String availableSpace;

    /**
    * 预计可用天数
    */
    private String availableDays;

    /**
    * 日均增长空间（字节）
    */
    private String dayGrowSpaceAvg;

    public String getTotalDiskSize() {
        return totalDiskSize;
    }

    public GetMongodbSpaceSummaryResponse setTotalDiskSize(String totalDiskSize) {
        this.totalDiskSize = totalDiskSize;
        return this;
    }

    public String getUsedSpace() {
        return usedSpace;
    }

    public GetMongodbSpaceSummaryResponse setUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
        return this;
    }

    public String getAvailableSpace() {
        return availableSpace;
    }

    public GetMongodbSpaceSummaryResponse setAvailableSpace(String availableSpace) {
        this.availableSpace = availableSpace;
        return this;
    }

    public String getAvailableDays() {
        return availableDays;
    }

    public GetMongodbSpaceSummaryResponse setAvailableDays(String availableDays) {
        this.availableDays = availableDays;
        return this;
    }

    public String getDayGrowSpaceAvg() {
        return dayGrowSpaceAvg;
    }

    public GetMongodbSpaceSummaryResponse setDayGrowSpaceAvg(String dayGrowSpaceAvg) {
        this.dayGrowSpaceAvg = dayGrowSpaceAvg;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbSpaceSummaryResponse{" + "totalDiskSize=" + totalDiskSize + "\n" + "usedSpace=" + usedSpace + "\n" + "availableSpace=" + availableSpace + "\n"
                + "availableDays=" + availableDays + "\n" + "dayGrowSpaceAvg=" + dayGrowSpaceAvg + "\n" + "}";
    }

}
