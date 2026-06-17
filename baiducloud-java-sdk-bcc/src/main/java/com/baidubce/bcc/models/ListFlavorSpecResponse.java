package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFlavorSpecResponse extends BaseBceResponse {

    /**
    * 各可用区下可用实例资源套餐规格列表
    */
    private List<ZoneResourceDetailSpec> zoneResources;

    public List<ZoneResourceDetailSpec> getZoneResources() {
        return zoneResources;
    }

    public ListFlavorSpecResponse setZoneResources(List<ZoneResourceDetailSpec> zoneResources) {
        this.zoneResources = zoneResources;
        return this;
    }

    @Override
    public String toString() {
        return "ListFlavorSpecResponse{" + "zoneResources=" + zoneResources + "\n" + "}";
    }

}
