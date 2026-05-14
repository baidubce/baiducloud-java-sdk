package com.baidubce.snic.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnicResponse extends BaseBceResponse {

    /**
    * 服务网卡的id
    */
    private String id;

    /**
    * ip地址
    */
    private String ipAddress;

    public String getId() {
        return id;
    }

    public CreateSnicResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public CreateSnicResponse setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSnicResponse{" + "id=" + id + "\n" + "ipAddress=" + ipAddress + "\n" + "}";
    }

}
