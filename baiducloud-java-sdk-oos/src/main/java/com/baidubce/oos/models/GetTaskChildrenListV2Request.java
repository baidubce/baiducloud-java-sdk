package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskChildrenListV2Request extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 执行（Execution）ID
    */
    private String executionId;

    /**
    * 任务（Task）ID
    */
    private String taskId;

    /**
    * 名称空间，如果用户未使用自定义名称空间，可以不传此字段，默认为“default”，
    */
    private String namespace;

    /**
    * 按state进行筛选，选填，若未设置，返回所有状态的子执行
    */
    private List<String> states;

    /**
    * 页数，从 1 开始计数
    */
    private Integer pageNo;

    /**
    * 每页展示数量，最大值 100，最小值 1
    */
    private Integer pageSize;

    public String getLocale() {
        return locale;
    }

    public GetTaskChildrenListV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getExecutionId() {
        return executionId;
    }

    public GetTaskChildrenListV2Request setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    public String getTaskId() {
        return taskId;
    }

    public GetTaskChildrenListV2Request setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public GetTaskChildrenListV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<String> getStates() {
        return states;
    }

    public GetTaskChildrenListV2Request setStates(List<String> states) {
        this.states = states;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetTaskChildrenListV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetTaskChildrenListV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
