package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskRequest extends BaseBceRequest {

    /**
    * 任务ID列表，最多100个。
    */
    private List<String> taskIds;

    /**
    * 默认值100。
    */
    private Integer maxKeys;

    public List<String> getTaskIds() {
        return taskIds;
    }

    public GetTaskRequest setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public GetTaskRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
