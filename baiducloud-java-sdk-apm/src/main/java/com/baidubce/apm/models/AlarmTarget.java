package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmTarget {
    /**
     * 目标类型，可选项：`ALL_SERVICES` - 全部服务，`SERVICE_TAGS` - 服务标签，`SERVICES` - 服务实例
     */
    private String type;

    /**
     * 若type=SERVICE_TAGS，填写目标tags
     */
    private List<Tag> tags;

    /**
     * 若type=SERVICES，填写目标服务名称列表
     */
    private List<String> services;

    public AlarmTarget setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AlarmTarget setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public AlarmTarget setServices(List<String> services) {
        this.services = services;
        return this;
    }

    public List<String> getServices() {
        return this.services;
    }

    @Override
    public String toString() {
        return "AlarmTarget{" + "type=" + type + "\n" + "tags=" + tags + "\n" + "services=" + services + "\n" + "}";
    }

}