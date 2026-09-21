package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HasInspectingTaskResponse extends BaseBceResponse {

    /**
    * 是否存在巡检中的任务，true 表示存在
    */
    private Boolean（根元素）;

    public Boolean get（根元素）()
    {
        return （根元素）;
    }

    public HasInspectingTaskResponse set（根元素）(Boolean（根元素）)
    {
        this.（根元素） = （根元素）;
        return this;
    }

    @Override
    public String toString() {
        return "HasInspectingTaskResponse{"
+ "（根元素）=" + （根元素） + "\n"
+ "}";
    }

}
