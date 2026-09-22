package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationParameterTemplateRequest extends BaseBceRequest {

    /**
    * templateShowId
    */
    @JsonIgnore
    private String templateShowId;

    /**
    * 是否有额外的修改（0：无；1：有），没有修改的参数不需要传parameters
    */
    private String extra;

    /**
    * 实例ID集合
    */
    private List<CacheClusterShowIdItem> cacheClusterList;

    /**
    * 是否需要重启（0 不重启 1 维护时间重启 2 立即重启 如果是热活的主集群的话不可以重启）
    */
    private Integer rebootType;

    /**
    * 参数模版中需要修改的参数，extra=1时有效
    */
    private List<Parameters> parameters;

    public String getTemplateShowId() {
        return templateShowId;
    }

    public ApplicationParameterTemplateRequest setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public ApplicationParameterTemplateRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public List<CacheClusterShowIdItem> getCacheClusterList() {
        return cacheClusterList;
    }

    public ApplicationParameterTemplateRequest setCacheClusterList(List<CacheClusterShowIdItem> cacheClusterList) {
        this.cacheClusterList = cacheClusterList;
        return this;
    }

    public Integer getRebootType() {
        return rebootType;
    }

    public ApplicationParameterTemplateRequest setRebootType(Integer rebootType) {
        this.rebootType = rebootType;
        return this;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public ApplicationParameterTemplateRequest setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
        return this;
    }

}
