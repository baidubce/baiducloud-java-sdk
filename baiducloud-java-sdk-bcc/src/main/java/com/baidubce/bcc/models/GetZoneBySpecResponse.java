package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetZoneBySpecResponse extends BaseBceResponse {

    /**
    * 可用区列表
    */
    private List<String> zoneNames;

    public List<String> getZoneNames() {
        return zoneNames;
    }

    public GetZoneBySpecResponse setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    @Override
    public String toString() {
        return "GetZoneBySpecResponse{" + "zoneNames=" + zoneNames + "\n" + "}";
    }

}
