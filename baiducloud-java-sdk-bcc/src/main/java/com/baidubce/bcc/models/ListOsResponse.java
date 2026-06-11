package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListOsResponse extends BaseBceResponse {

    /**
    * 返回的OS列表
    */
    private List<OsModel> osInfo;

    public List<OsModel> getOsInfo() {
        return osInfo;
    }

    public ListOsResponse setOsInfo(List<OsModel> osInfo) {
        this.osInfo = osInfo;
        return this;
    }

    @Override
    public String toString() {
        return "ListOsResponse{" + "osInfo=" + osInfo + "\n" + "}";
    }

}
