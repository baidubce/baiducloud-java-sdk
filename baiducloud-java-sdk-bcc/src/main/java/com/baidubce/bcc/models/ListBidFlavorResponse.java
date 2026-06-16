package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBidFlavorResponse extends BaseBceResponse {

    /**
    * 各个可用区的套餐规格
    */
    private List<ZoneResource> zoneResources;

    public List<ZoneResource> getZoneResources() {
        return zoneResources;
    }

    public ListBidFlavorResponse setZoneResources(List<ZoneResource> zoneResources) {
        this.zoneResources = zoneResources;
        return this;
    }

    @Override
    public String toString() {
        return "ListBidFlavorResponse{" + "zoneResources=" + zoneResources + "\n" + "}";
    }

}
