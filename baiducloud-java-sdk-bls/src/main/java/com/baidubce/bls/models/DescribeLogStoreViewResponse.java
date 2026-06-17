package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLogStoreViewResponse extends BaseBceResponse {

    /**
    * 日志组名称
    */
    private String project;

    /**
    * 日志视图名称
    */
    private String name;

    /**
    * 所关联的日志集列表
    */
    private List<LogStore> logstores;

    /**
    * 日志视图创建的日期时间
    */
    private String createdTimestamp;

    /**
    * 最后修改的日期时间
    */
    private String updatedTimestamp;

    public String getProject() {
        return project;
    }

    public DescribeLogStoreViewResponse setProject(String project) {
        this.project = project;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeLogStoreViewResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<LogStore> getLogstores() {
        return logstores;
    }

    public DescribeLogStoreViewResponse setLogstores(List<LogStore> logstores) {
        this.logstores = logstores;
        return this;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public DescribeLogStoreViewResponse setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public DescribeLogStoreViewResponse setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLogStoreViewResponse{" + "project=" + project + "\n" + "name=" + name + "\n" + "logstores=" + logstores + "\n" + "createdTimestamp=" + createdTimestamp
                + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n" + "}";
    }

}
