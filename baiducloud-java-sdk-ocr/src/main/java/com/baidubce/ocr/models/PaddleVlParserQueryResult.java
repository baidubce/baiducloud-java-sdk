package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaddleVlParserQueryResult {
    /**
     * 任务ID
     */
    @JsonProperty("task_id")
    private String taskId;

    /**
     * 任务状态
     */
    private String status;

    /**
     * 解析报错信息，包含任务失败、额度不够
     */
    @JsonProperty("task_error")
    private String taskError;

    /**
     * 文档解析结果的markdown格式链接，链接有效期30天
     */
    @JsonProperty("markdown_url")
    private String markdownUrl;

    /**
     * 文档解析结果的bos链接，链接有效期30天
     */
    @JsonProperty("parse_result_url")
    private String parseResultUrl;

    public PaddleVlParserQueryResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public PaddleVlParserQueryResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public PaddleVlParserQueryResult setTaskError(String taskError) {
        this.taskError = taskError;
        return this;
    }

    public String getTaskError() {
        return this.taskError;
    }

    public PaddleVlParserQueryResult setMarkdownUrl(String markdownUrl) {
        this.markdownUrl = markdownUrl;
        return this;
    }

    public String getMarkdownUrl() {
        return this.markdownUrl;
    }

    public PaddleVlParserQueryResult setParseResultUrl(String parseResultUrl) {
        this.parseResultUrl = parseResultUrl;
        return this;
    }

    public String getParseResultUrl() {
        return this.parseResultUrl;
    }

    @Override
    public String toString() {
        return "PaddleVlParserQueryResult{" + "taskId=" + taskId + "\n" + "status=" + status + "\n" + "taskError=" + taskError + "\n" + "markdownUrl=" + markdownUrl + "\n"
                + "parseResultUrl=" + parseResultUrl + "\n" + "}";
    }

}