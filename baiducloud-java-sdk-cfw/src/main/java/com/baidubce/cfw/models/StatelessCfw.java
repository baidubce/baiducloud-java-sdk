package com.baidubce.cfw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatelessCfw {
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
     * CFW的创建时间，标准UTC时间格式
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
     * CFW默认策略，白名单模式取值deny、黑名单模式取值allow
     */
    private String defaultAction;

    /**
     * CFW协议，取值 \[ TCP \| UDP \| ICMP \| ALL \]
     */
    private String protocol;

    /**
     * CFW IP列表
     */
    private List<String> ipList;

    public StatelessCfw setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getCfwId() {
        return this.cfwId;
    }

    public StatelessCfw setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public StatelessCfw setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public StatelessCfw setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public StatelessCfw setBindInstanceNum(Integer bindInstanceNum) {
        this.bindInstanceNum = bindInstanceNum;
        return this;
    }

    public Integer getBindInstanceNum() {
        return this.bindInstanceNum;
    }

    public StatelessCfw setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public StatelessCfw setBorder(Integer border) {
        this.border = border;
        return this;
    }

    public Integer getBorder() {
        return this.border;
    }

    public StatelessCfw setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    public String getDefaultAction() {
        return this.defaultAction;
    }

    public StatelessCfw setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public StatelessCfw setIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    public List<String> getIpList() {
        return this.ipList;
    }

    @Override
    public String toString() {
        return "StatelessCfw{" + "cfwId=" + cfwId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "createdTime=" + createdTime + "\n" + "bindInstanceNum="
                + bindInstanceNum + "\n" + "type=" + type + "\n" + "border=" + border + "\n" + "defaultAction=" + defaultAction + "\n" + "protocol=" + protocol + "\n" + "ipList="
                + ipList + "\n" + "}";
    }

}