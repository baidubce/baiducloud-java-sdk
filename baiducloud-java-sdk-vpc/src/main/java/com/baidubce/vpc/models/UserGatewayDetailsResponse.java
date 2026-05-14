package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGatewayDetailsResponse extends BaseBceResponse {

    /**
    * 用户网关ID
    */
    private String cgwId;

    /**
    * 用户网关名称
    */
    private String name;

    /**
    * 用户网关IP
    */
    private String ip;

    /**
    * 用户网关描述
    */
    private String description;

    /**
    * 用户网关创建时间
    */
    private String createdTime;

    /**
    * 用户网关更新时间
    */
    private String updatedTime;

    public String getCgwId() {
        return cgwId;
    }

    public UserGatewayDetailsResponse setCgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserGatewayDetailsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public UserGatewayDetailsResponse setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UserGatewayDetailsResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public UserGatewayDetailsResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public UserGatewayDetailsResponse setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    @Override
    public String toString() {
        return "UserGatewayDetailsResponse{" + "cgwId=" + cgwId + "\n" + "name=" + name + "\n" + "ip=" + ip + "\n" + "description=" + description + "\n" + "createdTime="
                + createdTime + "\n" + "updatedTime=" + updatedTime + "\n" + "}";
    }

}
