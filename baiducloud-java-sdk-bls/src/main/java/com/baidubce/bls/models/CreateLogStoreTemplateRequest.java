package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateLogStoreTemplateRequest extends BaseBceRequest {

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
    * template
    */
    private Template template;

    public String getName() {
        return name;
    }

    public CreateLogStoreTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getProjectPatterns() {
        return projectPatterns;
    }

    public CreateLogStoreTemplateRequest setProjectPatterns(List<String> projectPatterns) {
        this.projectPatterns = projectPatterns;
        return this;
    }

    public List<String> getLogstorePatterns() {
        return logstorePatterns;
    }

    public CreateLogStoreTemplateRequest setLogstorePatterns(List<String> logstorePatterns) {
        this.logstorePatterns = logstorePatterns;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public CreateLogStoreTemplateRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Template getTemplate() {
        return template;
    }

    public CreateLogStoreTemplateRequest setTemplate(Template template) {
        this.template = template;
        return this;
    }

}
