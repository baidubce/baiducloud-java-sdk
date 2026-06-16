package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task {
    /**
     * 下载任务的唯一ID
     */
    private String uuid;

    /**
     * 下载任务名称
     */
    private String name;

    /**
     * 日志组名称
     */
    private String project;

    /**
     * 日志集名称
     */
    private String logStoreName;

    /**
     * 查询语句
     */
    private String query;

    /**
     * 日志开始时间
     */
    private String queryStartTime;

    /**
     * 日志结束时间
     */
    private String queryEndTime;

    /**
     * 下载文件的格式
     */
    private String format;

    /**
     * 下载日志行数
     */
    private Integer limit;

    /**
     * 排序方式
     */
    private String order;

    /**
     * 下载任务的状态，其中 WAITING：等待执行，RUNNING：执行中，SUCCESS：执行完成，FAILED：执行失败，EXPIRED：文件过期
     */
    private String state;

    /**
     * 下载任务执行失败码
     */
    private String failedCode;

    /**
     * 下载任务执行失败的具体原因
     */
    private String failedMessage;

    /**
     * 写入的日志行数
     */
    private Integer writtenRows;

    /**
     * 下载文件目录
     */
    private String fileDir;

    /**
     * 下载文件名称
     */
    private String fileName;

    /**
     * 开始执行下载任务时间
     */
    private String execStartTime;

    /**
     * 下载任务执行结束时间
     */
    private String execEndTime;

    /**
     * 下载任务创建时间
     */
    private String createdTime;

    /**
     * 下载任务更新时间
     */
    private String updatedTime;

    public Task setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Task setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public Task setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public Task setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public Task setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }

    public String getQueryStartTime() {
        return this.queryStartTime;
    }

    public Task setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    public String getQueryEndTime() {
        return this.queryEndTime;
    }

    public Task setFormat(String format) {
        this.format = format;
        return this;
    }

    public String getFormat() {
        return this.format;
    }

    public Task setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Task setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public Task setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Task setFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }

    public String getFailedCode() {
        return this.failedCode;
    }

    public Task setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    public String getFailedMessage() {
        return this.failedMessage;
    }

    public Task setWrittenRows(Integer writtenRows) {
        this.writtenRows = writtenRows;
        return this;
    }

    public Integer getWrittenRows() {
        return this.writtenRows;
    }

    public Task setFileDir(String fileDir) {
        this.fileDir = fileDir;
        return this;
    }

    public String getFileDir() {
        return this.fileDir;
    }

    public Task setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Task setExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
        return this;
    }

    public String getExecStartTime() {
        return this.execStartTime;
    }

    public Task setExecEndTime(String execEndTime) {
        this.execEndTime = execEndTime;
        return this;
    }

    public String getExecEndTime() {
        return this.execEndTime;
    }

    public Task setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public Task setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override
    public String toString() {
        return "Task{" + "uuid=" + uuid + "\n" + "name=" + name + "\n" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "query=" + query + "\n"
                + "queryStartTime=" + queryStartTime + "\n" + "queryEndTime=" + queryEndTime + "\n" + "format=" + format + "\n" + "limit=" + limit + "\n" + "order=" + order + "\n"
                + "state=" + state + "\n" + "failedCode=" + failedCode + "\n" + "failedMessage=" + failedMessage + "\n" + "writtenRows=" + writtenRows + "\n" + "fileDir="
                + fileDir + "\n" + "fileName=" + fileName + "\n" + "execStartTime=" + execStartTime + "\n" + "execEndTime=" + execEndTime + "\n" + "createdTime=" + createdTime
                + "\n" + "updatedTime=" + updatedTime + "\n" + "}";
    }

}