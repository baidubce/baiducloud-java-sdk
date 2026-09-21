package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneListUsingGETResponse extends BaseBceResponse {

    /**
    * zones
    */
    private List<ZoneDetail> zones;

    public List<ZoneDetail> getZones() {
        return zones;
    }

    public ZoneListUsingGETResponse setZones(List<ZoneDetail> zones) {
        this.zones = zones;
        return this;
    }

    @Override
    public String toString() {
        return "ZoneListUsingGETResponse{" + "zones=" + zones + "\n" + "}";
    }

}
