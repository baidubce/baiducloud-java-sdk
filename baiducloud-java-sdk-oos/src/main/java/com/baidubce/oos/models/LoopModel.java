package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoopModel {
    /**
     * 循环初始上下文
     */
    private Object initContext;

    /**
     * 工作机选择器列表
     */
    private List<TagSelector> workerSelectors;

    public LoopModel setInitContext(Object initContext) {
        this.initContext = initContext;
        return this;
    }

    public Object getInitContext() {
        return this.initContext;
    }

    public LoopModel setWorkerSelectors(List<TagSelector> workerSelectors) {
        this.workerSelectors = workerSelectors;
        return this;
    }

    public List<TagSelector> getWorkerSelectors() {
        return this.workerSelectors;
    }

    @Override
    public String toString() {
        return "LoopModel{" + "initContext=" + initContext + "\n" + "workerSelectors=" + workerSelectors + "\n" + "}";
    }

}