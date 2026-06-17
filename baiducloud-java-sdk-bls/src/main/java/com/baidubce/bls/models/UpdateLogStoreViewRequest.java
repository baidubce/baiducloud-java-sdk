package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateLogStoreViewRequest extends BaseBceRequest {

    /**
    * 日志组名称，默认default
    */
    private String project;

    /**
    * 日志视图名称
    */
    private String name;

    /**
    * 与日志视图相关联的日志集列表
    */
    private List<LogStore> logstores;

    public String getProject() {
        return project;
    }

    public UpdateLogStoreViewRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateLogStoreViewRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<LogStore> getLogstores() {
        return logstores;
    }

    public UpdateLogStoreViewRequest setLogstores(List<LogStore> logstores) {
        this.logstores = logstores;
        return this;
    }

}
