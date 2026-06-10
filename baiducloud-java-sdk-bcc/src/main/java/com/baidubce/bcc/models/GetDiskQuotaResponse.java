package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDiskQuotaResponse extends BaseBceResponse {

    /**
    * 磁盘总容量上限（GB）
    */
    private String cdsTotalCapacityGB;

    /**
    * 磁盘已使用总容量（GB）
    */
    private String cdsUsedCapacityGB;

    /**
    * 可用区可创建的磁盘信息
    */
    private List<DiskInfo> diskInfos;

    public String getCdsTotalCapacityGB() {
        return cdsTotalCapacityGB;
    }

    public GetDiskQuotaResponse setCdsTotalCapacityGB(String cdsTotalCapacityGB) {
        this.cdsTotalCapacityGB = cdsTotalCapacityGB;
        return this;
    }

    public String getCdsUsedCapacityGB() {
        return cdsUsedCapacityGB;
    }

    public GetDiskQuotaResponse setCdsUsedCapacityGB(String cdsUsedCapacityGB) {
        this.cdsUsedCapacityGB = cdsUsedCapacityGB;
        return this;
    }

    public List<DiskInfo> getDiskInfos() {
        return diskInfos;
    }

    public GetDiskQuotaResponse setDiskInfos(List<DiskInfo> diskInfos) {
        this.diskInfos = diskInfos;
        return this;
    }

    @Override
    public String toString() {
        return "GetDiskQuotaResponse{" + "cdsTotalCapacityGB=" + cdsTotalCapacityGB + "\n" + "cdsUsedCapacityGB=" + cdsUsedCapacityGB + "\n" + "diskInfos=" + diskInfos + "\n"
                + "}";
    }

}
