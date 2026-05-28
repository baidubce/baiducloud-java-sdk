package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRecordRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

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
    * 主机记录，例如“www”，记录值和zone的name长度加在一起不能超过255字符。
    */
    private String rr;

    /**
    * 解析记录类型，包含：“A”, “CNAME”, “MX”, “TXT”, “NS”, “AAAA”, “SRV”。
    */
    private String type;

    /**
    * 记录值，例如 IP：“192.168.1.1”，CNAME：“cname.baidu.com”，MX：“mail.baidu.com”。
    */
    private String value;

    /**
    * 解析记录在本地DNS服务器的缓存时间（单位：秒），基础版默认300秒，普惠版默认120秒，企业版默认1秒，取值为正整数。
    */
    private Integer ttl;

    /**
    * 描述，长度不超过255个字符。
    */
    private String description;

    /**
    * MX记录的优先级，取值范围：[0,50]。记录类型为MX记录时，此参数必选。
    */
    private Integer priority;

    public String getZoneName() {
        return zoneName;
    }

    public UpdateRecordRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getRecordId() {
        return recordId;
    }

    public UpdateRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRr() {
        return rr;
    }

    public UpdateRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateRecordRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UpdateRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getTtl() {
        return ttl;
    }

    public UpdateRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateRecordRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public UpdateRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
