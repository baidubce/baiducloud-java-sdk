package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddTbspAreaBlockingRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * DDoS增强防护包防护对象IP地址
    */
    private String ip;

    /**
    * 区域封禁时长 (单位: 分钟)，最小值为30，最大值为1440，添加固定时长区域封禁时blockTime必填
    */
    private Integer blockTime;

    /**
    * 封禁类型，可为fixedDuration(固定时长)或systemDetermines（系统判定），不填默认fixedDuration类型
    */
    private String blockType;

    public String getId() {
        return id;
    }

    public AddTbspAreaBlockingRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddTbspAreaBlockingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public AddTbspAreaBlockingRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public Integer getBlockTime() {
        return blockTime;
    }

    public AddTbspAreaBlockingRequest setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    public String getBlockType() {
        return blockType;
    }

    public AddTbspAreaBlockingRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }

}
