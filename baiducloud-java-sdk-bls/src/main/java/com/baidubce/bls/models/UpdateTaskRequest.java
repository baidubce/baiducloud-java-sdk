package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateTaskRequest extends BaseBceRequest {

    /**
    * taskId
    */
    @JsonIgnore
    private String taskId;

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

    public String getTaskId() {
        return taskId;
    }

    public UpdateTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateTaskRequest setName(String name) {
        this.name = name;
        return this;
    }

    public TaskConfig getConfig() {
        return config;
    }

    public UpdateTaskRequest setConfig(TaskConfig config) {
        this.config = config;
        return this;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public UpdateTaskRequest setHosts(List<Host> hosts) {
        this.hosts = hosts;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public UpdateTaskRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
