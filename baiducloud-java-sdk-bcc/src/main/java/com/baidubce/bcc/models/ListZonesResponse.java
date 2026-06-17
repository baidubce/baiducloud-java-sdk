package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListZonesResponse extends BaseBceResponse {

    /**
    * 可用区列表信息
    */
    private List<ZoneModel> zones;

    public List<ZoneModel> getZones() {
        return zones;
    }

    public ListZonesResponse setZones(List<ZoneModel> zones) {
        this.zones = zones;
        return this;
    }

    @Override
    public String toString() {
        return "ListZonesResponse{" + "zones=" + zones + "\n" + "}";
    }

}
