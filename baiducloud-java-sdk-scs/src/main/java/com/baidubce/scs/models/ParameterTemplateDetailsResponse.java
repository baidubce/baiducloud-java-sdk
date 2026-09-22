package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParameterTemplateDetailsResponse extends BaseBceResponse {

    /**
    * 参数模板数字ID
    */
    private Integer templateId;

    /**
    * 参数模板ID
    */
    private String templateShowId;

    /**
    * 参数模板名称
    */
    private String templateName;

    /**
    * 参数模板参数数量
    */
    private Integer parameterNum;

    /**
    * 集群类型  (master_slave、default、cluster)
    */
    private String clusterType;

    /**
    * 引擎类型
    */
    private String engine;

    /**
    * 引擎版本
    */
    private String engineVersion;

    /**
    * 参数模板类型（1为自定义参数模板）
    */
    private Integer templateType;

    /**
    * 是否需要重启(该参数模版是否有需要重启生效的参数)，0：不需要，1：需要
    */
    private Integer needReboot;

    /**
    * 备注
    */
    private String comment;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * 更新时间
    */
    private String updateTime;

    /**
    * 参数列表
    */
    private List<Parameters> parameters;

    public Integer getTemplateId() {
        return templateId;
    }

    public ParameterTemplateDetailsResponse setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTemplateShowId() {
        return templateShowId;
    }

    public ParameterTemplateDetailsResponse setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public ParameterTemplateDetailsResponse setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public Integer getParameterNum() {
        return parameterNum;
    }

    public ParameterTemplateDetailsResponse setParameterNum(Integer parameterNum) {
        this.parameterNum = parameterNum;
        return this;
    }

    public String getClusterType() {
        return clusterType;
    }

    public ParameterTemplateDetailsResponse setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public ParameterTemplateDetailsResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public ParameterTemplateDetailsResponse setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public ParameterTemplateDetailsResponse setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }

    public Integer getNeedReboot() {
        return needReboot;
    }

    public ParameterTemplateDetailsResponse setNeedReboot(Integer needReboot) {
        this.needReboot = needReboot;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ParameterTemplateDetailsResponse setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public ParameterTemplateDetailsResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public ParameterTemplateDetailsResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public ParameterTemplateDetailsResponse setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        return "ParameterTemplateDetailsResponse{" + "templateId=" + templateId + "\n" + "templateShowId=" + templateShowId + "\n" + "templateName=" + templateName + "\n"
                + "parameterNum=" + parameterNum + "\n" + "clusterType=" + clusterType + "\n" + "engine=" + engine + "\n" + "engineVersion=" + engineVersion + "\n"
                + "templateType=" + templateType + "\n" + "needReboot=" + needReboot + "\n" + "comment=" + comment + "\n" + "createTime=" + createTime + "\n" + "updateTime="
                + updateTime + "\n" + "parameters=" + parameters + "\n" + "}";
    }

}
