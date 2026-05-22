package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbResponse extends BaseBceResponse {

    /**
    * 分配的服务地址IP，通过这个IP即能访问该实例
    */
    private String address;

    /**
    * LoadBalancer的名称
    */
    private String name;

    /**
    * LoadBalancer的描述
    */
    private String desc;

    /**
    * LoadBalancer的ID。后续针对该实例的操作，均需要在请求中带上此ID
    */
    private String blbId;

    public String getAddress() {
        return address;
    }

    public CreateAppBlbResponse setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAppBlbResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateAppBlbResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getBlbId() {
        return blbId;
    }

    public CreateAppBlbResponse setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAppBlbResponse{" + "address=" + address + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "blbId=" + blbId + "\n" + "}";
    }

}
