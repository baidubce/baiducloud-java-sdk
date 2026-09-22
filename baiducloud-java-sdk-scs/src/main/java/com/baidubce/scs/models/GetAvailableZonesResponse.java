package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAvailableZonesResponse extends BaseBceResponse {

    /**
    * 可用区列表
    */
    private List<ZoneNames> zones;

    public List<ZoneNames> getZones() {
        return zones;
    }

    public GetAvailableZonesResponse setZones(List<ZoneNames> zones) {
        this.zones = zones;
        return this;
    }

    @Override
    public String toString() {
        return "GetAvailableZonesResponse{" + "zones=" + zones + "\n" + "}";
    }

}
