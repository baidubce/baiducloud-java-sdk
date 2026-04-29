package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddParsingRecordsRequest extends BaseBceRequest {

    /**
    * zoneId
    */
    @JsonIgnore
    private String zoneId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 主机记录,不能与已有记录重复,记录值和zone的name长度加在一起不能超过255
    */
    private String rr;

    /**
    * 记录值
    */
    private String value;

    /**
    * 解析记录类型，目前支持A, AAAA,CNAME, TXT, MX, PTR, SRV
    */
    private String type;

    /**
    * MX记录的优先级，取值范围：[0,100]。记录类型为MX记录时，此参数必选。
    */
    private Integer priority;

    /**
    * 生存时间，值为[5,24*3600]，默认为60
    */
    private Integer ttl;

    /**
    * 描述
    */
    private String description;

    public String getZoneId() {
        return zoneId;
    }

    public AddParsingRecordsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddParsingRecordsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRr() {
        return rr;
    }

    public AddParsingRecordsRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getValue() {
        return value;
    }

    public AddParsingRecordsRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public String getType() {
        return type;
    }

    public AddParsingRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public AddParsingRecordsRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getTtl() {
        return ttl;
    }

    public AddParsingRecordsRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddParsingRecordsRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
