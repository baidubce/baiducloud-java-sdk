package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DagActionModel {
    /**
     * 是否暂停
     */
    private Boolean pause;

    /**
     * 是否恢复
     */
    private Boolean resume;

    public DagActionModel setPause(Boolean pause) {
        this.pause = pause;
        return this;
    }

    public Boolean getPause() {
        return this.pause;
    }

    public DagActionModel setResume(Boolean resume) {
        this.resume = resume;
        return this;
    }

    public Boolean getResume() {
        return this.resume;
    }

    @Override
    public String toString() {
        return "DagActionModel{" + "pause=" + pause + "\n" + "resume=" + resume + "\n" + "}";
    }

}