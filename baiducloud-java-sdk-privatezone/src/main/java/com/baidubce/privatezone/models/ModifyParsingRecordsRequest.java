package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyParsingRecordsRequest extends BaseBceRequest {

    /**
    * recordId
    */
    @JsonIgnore
    private String recordId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 主机记录
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
    * 生存时间，值为[5,24*3600]，默认为60
    */
    private Integer ttl;

    /**
    * MX记录的优先级，取值范围：[0,100]。记录类型为MX记录时，此参数必选。
    */
    private Integer priority;

    /**
    * 描述
    */
    private String description;

    public String getRecordId() {
        return recordId;
    }

    public ModifyParsingRecordsRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ModifyParsingRecordsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRr() {
        return rr;
    }

    public ModifyParsingRecordsRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ModifyParsingRecordsRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public String getType() {
        return type;
    }

    public ModifyParsingRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getTtl() {
        return ttl;
    }

    public ModifyParsingRecordsRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public ModifyParsingRecordsRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyParsingRecordsRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
