package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfAvailableZonesResponse extends BaseBceResponse {

    /**
    * 可用区列表
    */
    private List<ZoneDetail> zones;

    public List<ZoneDetail> getZones() {
        return zones;
    }

    public QueryTheListOfAvailableZonesResponse setZones(List<ZoneDetail> zones) {
        this.zones = zones;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheListOfAvailableZonesResponse{" + "zones=" + zones + "\n" + "}";
    }

}
