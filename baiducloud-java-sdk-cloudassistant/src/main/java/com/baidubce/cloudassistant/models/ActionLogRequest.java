package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionLogRequest extends BaseBceRequest {

    /**
    * 执行ID
    */
    private String runId;

    /**
    * 执行ID下某一子执行ID
    */
    private String childId;

    /**
    * 首次请求为0，后续翻页，填写上一次请求返回的nextCursor
    */
    private Integer cursor;

    public String getRunId() {
        return runId;
    }

    public ActionLogRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getChildId() {
        return childId;
    }

    public ActionLogRequest setChildId(String childId) {
        this.childId = childId;
        return this;
    }

    public Integer getCursor() {
        return cursor;
    }

    public ActionLogRequest setCursor(Integer cursor) {
        this.cursor = cursor;
        return this;
    }

}
