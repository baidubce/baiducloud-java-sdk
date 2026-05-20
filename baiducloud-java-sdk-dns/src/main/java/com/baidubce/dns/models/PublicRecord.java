package com.baidubce.dns.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PublicRecord {
    /**
     * 解析记录id。
     */
    private String id;

    /**
     * 主机记录。
     */
    private String rr;

    /**
     * 域名状态，包含：正常(running)、暂停中(stopped)、服务异常(failed)。
     */
    private String status;

    /**
     * 解析记录类型，包含：“A”，“CNAME”，“MX”，“TXT”，“NS”，“AAAA”，“SRV”。
     */
    private String type;

    /**
     * 记录值，例如 IP：192.168.1.1，CNAME：cname.baidu.com，MX：mail.baidu.com。
     */
    private String value;

    /**
     * 解析记录在本地DNS服务器的缓存时间（单位：秒），基础版默认300秒，普惠版默认120秒，企业版默认1秒。取值为正整数。
     */
    private Integer ttl;

    /**
     * 解析线路或线路组名称，默认为default，包含：默认(default)、电信(ct)、移动(cmnet)、联通(cnc)、教育网(edu)、搜索引擎(百度)(search)。
     */
    private String line;

    /**
     * 描述，长度不超过255个字符。
     */
    private String description;

    /**
     * MX记录的优先级，取值范围：[0,50]。记录类型为MX记录时返回。
     */
    private Integer priority;

    public PublicRecord setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PublicRecord setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getRr() {
        return this.rr;
    }

    public PublicRecord setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public PublicRecord setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public PublicRecord setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public PublicRecord setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public Integer getTtl() {
        return this.ttl;
    }

    public PublicRecord setLine(String line) {
        this.line = line;
        return this;
    }

    public String getLine() {
        return this.line;
    }

    public PublicRecord setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public PublicRecord setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public String toString() {
        return "PublicRecord{" + "id=" + id + "\n" + "rr=" + rr + "\n" + "status=" + status + "\n" + "type=" + type + "\n" + "value=" + value + "\n" + "ttl=" + ttl + "\n"
                + "line=" + line + "\n" + "description=" + description + "\n" + "priority=" + priority + "\n" + "}";
    }

}