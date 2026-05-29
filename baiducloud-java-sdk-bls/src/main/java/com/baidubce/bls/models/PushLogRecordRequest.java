package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushLogRecordRequest extends BaseBceRequest {

    /**
    * logStoreName
    */
    @JsonIgnore
    private String logStoreName;

    /**
    * project
    */
    @JsonIgnore
    private String project;

    /**
    * 日志流名称，长度不能超过 192 字符，包含的字符仅限于：`a-z, A-Z, 0-9, '_', '-', '.' '/'`
    */
    private String logStreamName;

    /**
    * 数据类型，JSON/TEXT，默认为 TEXT
    */
    private String type;

    /**
    * 日志记录
    */
    private List<LogRecord> logRecords;

    /**
    * 日志标签
    */
    private List<LogTag> tags;

    public String getLogStoreName() {
        return logStoreName;
    }

    public PushLogRecordRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public PushLogRecordRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStreamName() {
        return logStreamName;
    }

    public PushLogRecordRequest setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getType() {
        return type;
    }

    public PushLogRecordRequest setType(String type) {
        this.type = type;
        return this;
    }

    public List<LogRecord> getLogRecords() {
        return logRecords;
    }

    public PushLogRecordRequest setLogRecords(List<LogRecord> logRecords) {
        this.logRecords = logRecords;
        return this;
    }

    public List<LogTag> getTags() {
        return tags;
    }

    public PushLogRecordRequest setTags(List<LogTag> tags) {
        this.tags = tags;
        return this;
    }

}
