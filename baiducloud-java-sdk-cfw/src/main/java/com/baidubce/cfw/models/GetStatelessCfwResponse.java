package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetStatelessCfwResponse extends BaseBceResponse {

    /**
    * CFW的id
    */
    private String cfwId;

    /**
    * CFW的名称
    */
    private String name;

    /**
    * CFW的描述
    */
    private String description;

    /**
    * CFW的创建时间，标准UTC时间
    */
    private String createdTime;

    /**
    * CFW绑定实例的数量
    */
    private Integer bindInstanceNum;

    /**
    * CFW类型，0表示网络型防火墙
    */
    private Integer type;

    /**
    * CFW防护边界，取值1，表示vpc边界
    */
    private Integer border;

    /**
    * 无状态防火墙默认策略，白名单模式取值deny、黑名单模式取值allow
    */
    private String defaultAction;

    /**
    * 无状态防火墙协议，取值 [ TCP
    */
    private String protocol;

    /**
    * 无状态防火墙IP列表
    */
    private List<String> ipList;

    public String getCfwId() {
        return cfwId;
    }

    public GetStatelessCfwResponse setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetStatelessCfwResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetStatelessCfwResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public GetStatelessCfwResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Integer getBindInstanceNum() {
        return bindInstanceNum;
    }

    public GetStatelessCfwResponse setBindInstanceNum(Integer bindInstanceNum) {
        this.bindInstanceNum = bindInstanceNum;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public GetStatelessCfwResponse setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getBorder() {
        return border;
    }

    public GetStatelessCfwResponse setBorder(Integer border) {
        this.border = border;
        return this;
    }

    public String getDefaultAction() {
        return defaultAction;
    }

    public GetStatelessCfwResponse setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public GetStatelessCfwResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public List<String> getIpList() {
        return ipList;
    }

    public GetStatelessCfwResponse setIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    @Override
    public String toString() {
        return "GetStatelessCfwResponse{" + "cfwId=" + cfwId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "createdTime=" + createdTime + "\n"
                + "bindInstanceNum=" + bindInstanceNum + "\n" + "type=" + type + "\n" + "border=" + border + "\n" + "defaultAction=" + defaultAction + "\n" + "protocol="
                + protocol + "\n" + "ipList=" + ipList + "\n" + "}";
    }

}
