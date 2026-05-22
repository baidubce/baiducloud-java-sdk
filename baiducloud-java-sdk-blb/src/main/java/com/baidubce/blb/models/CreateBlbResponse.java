package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBlbResponse extends BaseBceResponse {

    /**
    * 分配的内网服务地址IP，通过这个IP即能通过内网访问该实例
    */
    private String address;

    /**
    * LoadBalancer的名称
    */
    private String name;

    /**
    * LoadBalancer的ID。后续针对该实例的操作，均需要在请求中带上此ID
    */
    private String blbId;

    /**
    * LoadBalancer的描述
    */
    private String desc;

    public String getAddress() {
        return address;
    }

    public CreateBlbResponse setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateBlbResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getBlbId() {
        return blbId;
    }

    public CreateBlbResponse setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateBlbResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "CreateBlbResponse{" + "address=" + address + "\n" + "name=" + name + "\n" + "blbId=" + blbId + "\n" + "desc=" + desc + "\n" + "}";
    }

}
