package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTaskResponse extends BaseBceResponse {

    /**
    * 是否截断
    */
    private Boolean isTruncated;

    /**
    * 当前页标记
    */
    private String marker;

    /**
    * 每页最大数量
    */
    private Integer maxKeys;

    /**
    * 下一页标记
    */
    private String nextMarker;

    /**
    * 任务详情列表
    */
    private List<TaskDetail> tasks;

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListTaskResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListTaskResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListTaskResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListTaskResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<TaskDetail> getTasks() {
        return tasks;
    }

    public ListTaskResponse setTasks(List<TaskDetail> tasks) {
        this.tasks = tasks;
        return this;
    }

    @Override
    public String toString() {
        return "ListTaskResponse{" + "isTruncated=" + isTruncated + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n" + "nextMarker=" + nextMarker + "\n" + "tasks="
                + tasks + "\n" + "}";
    }

}
