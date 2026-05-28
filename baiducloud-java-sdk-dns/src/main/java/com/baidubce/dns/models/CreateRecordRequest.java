package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRecordRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 主机记录，例如“www”。记录值和zone的name长度加在一起不能超过255字符。
    */
    private String rr;

    /**
    * 解析记录类型，包含：“A”, “CNAME”, “MX”, “TXT”, “NS”, “AAAA”, “SRV”。
    */
    private String type;

    /**
    * 记录值，例如 IP：“192.168.1.1”，CNAME：“cname.baidu.com”，MX：“mail.baidu.com”，SRV：优先级 权重 端口 目标地址，每项中间需以空格分隔。例：“0 6 8080 vipserver.test.com”。
    */
    private String value;

    /**
    * 解析记录在本地DNS服务器的缓存时间（单位：秒），基础版默认300秒，普惠版默认120秒，企业版默认1秒。取值为正整数。
    */
    private Integer ttl;

    /**
    * 解析线路或线路组名称，默认为default，基础版和普惠版包含：默认(default)、电信(ct)、移动(cmnet)、联通(cnc)、教育网(edu)、搜索引擎(百度)(search)；企业版线路取值见[LineName](DNS/API参考/附录.md#LineName)，企业版还可以传线路组名称。
    */
    private String line;

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

    public CreateRecordRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRr() {
        return rr;
    }

    public CreateRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateRecordRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CreateRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getTtl() {
        return ttl;
    }

    public CreateRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public String getLine() {
        return line;
    }

    public CreateRecordRequest setLine(String line) {
        this.line = line;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateRecordRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public CreateRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
