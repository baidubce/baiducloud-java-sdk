package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskDetailV2Request extends BaseBceRequest {

    /**
    * namespace
    */
    @JsonIgnore
    private String namespace;

    /**
    * dagId
    */
    @JsonIgnore
    private String dagId;

    /**
    * taskId
    */
    @JsonIgnore
    private String taskId;

    /**
    * ignoreChildren
    */
    @JsonIgnore
    private String ignoreChildren;

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    public String getNamespace() {
        return namespace;
    }

    public GetTaskDetailV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDagId() {
        return dagId;
    }

    public GetTaskDetailV2Request setDagId(String dagId) {
        this.dagId = dagId;
        return this;
    }

    public String getTaskId() {
        return taskId;
    }

    public GetTaskDetailV2Request setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getIgnoreChildren() {
        return ignoreChildren;
    }

    public GetTaskDetailV2Request setIgnoreChildren(String ignoreChildren) {
        this.ignoreChildren = ignoreChildren;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public GetTaskDetailV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

}
