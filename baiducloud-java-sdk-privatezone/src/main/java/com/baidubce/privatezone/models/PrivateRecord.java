package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrivateRecord {
    /**
     * 解析记录的ID
     */
    private String recordId;

    /**
     * 主机记录
     */
    private String rr;

    /**
     * 记录值
     */
    private String value;

    /**
     * 解析记录状态
     */
    private String status;

    /**
     * 解析记录的类型
     */
    private String type;

    /**
     * 生存时间，默认为60
     */
    private Integer ttl;

    /**
     * MX记录优先级，其他类型该值为0
     */
    private Integer priority;

    /**
     * 描述
     */
    private String description;

    public PrivateRecord setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public PrivateRecord setRr(String rr) {
        this.rr = rr;
        return this;
    }

    public String getRr() {
        return this.rr;
    }

    public PrivateRecord setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public PrivateRecord setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public PrivateRecord setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public PrivateRecord setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public Integer getTtl() {
        return this.ttl;
    }

    public PrivateRecord setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public PrivateRecord setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "PrivateRecord{" + "recordId=" + recordId + "\n" + "rr=" + rr + "\n" + "value=" + value + "\n" + "status=" + status + "\n" + "type=" + type + "\n" + "ttl=" + ttl
                + "\n" + "priority=" + priority + "\n" + "description=" + description + "\n" + "}";
    }

}