package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPrivateZoneResponse extends BaseBceResponse {

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

    public String getZoneId() {
        return zoneId;
    }

    public GetPrivateZoneResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetPrivateZoneResponse setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public GetPrivateZoneResponse setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetPrivateZoneResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetPrivateZoneResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public List<Vpc> getBindVpcs() {
        return bindVpcs;
    }

    public GetPrivateZoneResponse setBindVpcs(List<Vpc> bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }

    @Override
    public String toString() {
        return "GetPrivateZoneResponse{" + "zoneId=" + zoneId + "\n" + "zoneName=" + zoneName + "\n" + "recordCount=" + recordCount + "\n" + "createTime=" + createTime + "\n"
                + "updateTime=" + updateTime + "\n" + "bindVpcs=" + bindVpcs + "\n" + "}";
    }

}
