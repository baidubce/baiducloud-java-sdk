package com.baidubce.privatezone.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchForDetailsOfPrivatzoneResponse extends BaseBceResponse {
    /**
     * Zone的ID
     */
    private String zoneId;

    /**
     * Zone的名称
     */
    private String zoneName;

    /**
     * 含有的解析记录总数
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

    /**
     * 关联的Vpc列表
     */
    private List<Vpc> bindVpcs;

    public SearchForDetailsOfPrivatzoneResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public SearchForDetailsOfPrivatzoneResponse setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public SearchForDetailsOfPrivatzoneResponse setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public Integer getRecordCount() {
        return this.recordCount;
    }

    public SearchForDetailsOfPrivatzoneResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public SearchForDetailsOfPrivatzoneResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public SearchForDetailsOfPrivatzoneResponse setBindVpcs(List<Vpc> bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }

    public List<Vpc> getBindVpcs() {
        return this.bindVpcs;
    }

    @Override
    public String toString() {
        return "SearchForDetailsOfPrivatzoneResponse{" + "zoneId=" + zoneId + "\n" + "zoneName=" + zoneName + "\n" + "recordCount=" + recordCount + "\n" + "createTime="
                + createTime + "\n" + "updateTime=" + updateTime + "\n" + "bindVpcs=" + bindVpcs + "\n" + "}";
    }

}