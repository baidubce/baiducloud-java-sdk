package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDownloadTaskRequest extends BaseBceRequest {

    /**
    * 下载任务名称
    */
    private String name;

    /**
    * 日志组名称，默认default
    */
    private String project;

    /**
    * 日志集名称
    */
    private String logStoreName;

    /**
    * 日志流名称，默认在全部日志流中下载数据
    */
    private String logStreamName;

    /**
    * 检索语句，默认下载全部数据
    */
    private String query;

    /**
    * 日志开始时间，UTC时间，格式ISO8601，例如：2020-01-10T13:23:34Z
    */
    private String queryStartTime;

    /**
    * 日志结束时间，UTC时间，格式ISO8601，例如：2020-01-10T13:23:34Z
    */
    private String queryEndTime;

    /**
    * 下载文件的格式，默认json，支持 json,csv
    */
    private String format;

    /**
    * 下载日志的行数，默认1000000，最大1000000
    */
    private Integer limit;

    /**
    * 排序方式，默认desc，按照时间倒序排序，支持desc和asc
    */
    private String order;

    /**
    * 下载文件的bos目录，默认放到bls资源账号的下载目录，用户不可见；如果不为空，表示放到用户自己的bos目录 需要确保bos的bucket存在，目录可以不存在，会自动创建。
    */
    private String fileDir;

    public String getName() {
        return name;
    }

    public CreateDownloadTaskRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getProject() {
        return project;
    }

    public CreateDownloadTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public CreateDownloadTaskRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStreamName() {
        return logStreamName;
    }

    public CreateDownloadTaskRequest setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public CreateDownloadTaskRequest setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQueryStartTime() {
        return queryStartTime;
    }

    public CreateDownloadTaskRequest setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }

    public String getQueryEndTime() {
        return queryEndTime;
    }

    public CreateDownloadTaskRequest setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public CreateDownloadTaskRequest setFormat(String format) {
        this.format = format;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public CreateDownloadTaskRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public CreateDownloadTaskRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getFileDir() {
        return fileDir;
    }

    public CreateDownloadTaskRequest setFileDir(String fileDir) {
        this.fileDir = fileDir;
        return this;
    }

}
