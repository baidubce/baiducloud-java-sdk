package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateParameterTemplateRequest extends BaseBceRequest {

    /**
    * 模板名称，格式要求：大小写字母、数字、中文以及-_/.特殊字符，必须以字母或者中文开头，长度1-65
    */
    private String name;

    /**
    * 引擎（当前仅支持redis）
    */
    private String engine;

    /**
    * 引擎版本
    */
    private String engineVersion;

    /**
    * 集群类型（master_slave\cluster）
    */
    private String clusterType;

    /**
    * 模板类型（1、自定义参数模板）
    */
    private Integer templateType;

    /**
    * 备注
    */
    private String comment;

    /**
    * 参数列表，系统模版内的数据，和引擎及引擎版本有关
    */
    private List<Parameters> parameters;

    public String getName() {
        return name;
    }

    public CreateParameterTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public CreateParameterTemplateRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public CreateParameterTemplateRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getClusterType() {
        return clusterType;
    }

    public CreateParameterTemplateRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public CreateParameterTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public CreateParameterTemplateRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public CreateParameterTemplateRequest setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
        return this;
    }

}
