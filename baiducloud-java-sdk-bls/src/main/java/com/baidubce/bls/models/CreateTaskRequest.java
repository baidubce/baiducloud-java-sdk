package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTaskRequest extends BaseBceRequest {

    /**
    * 传输任务名字
    */
    private String name;

    /**
    * config
    */
    private TaskConfig config;

    /**
    * 运行任务的主机列表
    */
    private List<Host> hosts;

    /**
    * 待创建的标签列表，具体参数格式参见下述
    */
    private List<Tag> tags;

    public String getName() {
        return name;
    }

    public CreateTaskRequest setName(String name) {
        this.name = name;
        return this;
    }

    public TaskConfig getConfig() {
        return config;
    }

    public CreateTaskRequest setConfig(TaskConfig config) {
        this.config = config;
        return this;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public CreateTaskRequest setHosts(List<Host> hosts) {
        this.hosts = hosts;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateTaskRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
