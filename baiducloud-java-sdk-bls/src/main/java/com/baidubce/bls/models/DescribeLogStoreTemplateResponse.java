package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLogStoreTemplateResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    /**
    * 请求成功为空，失败为具体的错误信息
    */
    private String message;

    /**
    * 模板名称，同user下唯一
    */
    private String name;

    /**
    * 日志组匹配模式，支持*通配符
    */
    private List<String> projectPatterns;

    /**
    * 日志集匹配模式，支持*通配符
    */
    private List<String> logstorePatterns;

    /**
    * 日志集模板优先级，值越大，优先级越高，同user下唯一
    */
    private Integer priority;

    /**
    * 创建时间，UTC时间，格式：2025-04-20T10:01:12Z
    */
    private String createdTimestamp;

    /**
    * 更新时间，UTC时间，格式：2025-04-20T10:01:12Z
    */
    private String updatedTimestamp;

    /**
    * template
    */
    private Template template;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLogStoreTemplateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLogStoreTemplateResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLogStoreTemplateResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeLogStoreTemplateResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getProjectPatterns() {
        return projectPatterns;
    }

    public DescribeLogStoreTemplateResponse setProjectPatterns(List<String> projectPatterns) {
        this.projectPatterns = projectPatterns;
        return this;
    }

    public List<String> getLogstorePatterns() {
        return logstorePatterns;
    }

    public DescribeLogStoreTemplateResponse setLogstorePatterns(List<String> logstorePatterns) {
        this.logstorePatterns = logstorePatterns;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public DescribeLogStoreTemplateResponse setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public DescribeLogStoreTemplateResponse setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public DescribeLogStoreTemplateResponse setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Template getTemplate() {
        return template;
    }

    public DescribeLogStoreTemplateResponse setTemplate(Template template) {
        this.template = template;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLogStoreTemplateResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "name=" + name + "\n" + "projectPatterns="
                + projectPatterns + "\n" + "logstorePatterns=" + logstorePatterns + "\n" + "priority=" + priority + "\n" + "createdTimestamp=" + createdTimestamp + "\n"
                + "updatedTimestamp=" + updatedTimestamp + "\n" + "template=" + template + "\n" + "}";
    }

}
