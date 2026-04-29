package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrivateZone {
    /**
     * Zone的ID
     */
    private String zoneId;

    /**
     * Zone的名称
     */
    private String zoneName;

    /**
     * 解析记录数
     */
    private Integer recordCount;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    public PrivateZone setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public PrivateZone setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public PrivateZone setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public Integer getRecordCount() {
        return this.recordCount;
    }

    public PrivateZone setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public PrivateZone setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "PrivateZone{" + "zoneId=" + zoneId + "\n" + "zoneName=" + zoneName + "\n" + "recordCount=" + recordCount + "\n" + "createTime=" + createTime + "\n" + "updateTime="
                + updateTime + "\n" + "}";
    }

}