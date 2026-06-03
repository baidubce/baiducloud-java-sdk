package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeZonesResponse extends BaseBceResponse {

    /**
    * 可用区名称列表，例如 \"zoneA\"、\"zoneB\"
    */
    private List<String> zones;

    public List<String> getZones() {
        return zones;
    }

    public DescribeZonesResponse setZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeZonesResponse{" + "zones=" + zones + "\n" + "}";
    }

}
