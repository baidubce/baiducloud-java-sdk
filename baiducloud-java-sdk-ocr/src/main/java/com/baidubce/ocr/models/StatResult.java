package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatResult {
    /**
     * 本次批改任务的题目总数
     */
    private Integer all;

    /**
     * 已完成批改的题目数量
     */
    private Integer corrected;

    /**
     * 批改中的题目数量
     */
    private Integer correcting;

    public StatResult setAll(Integer all) {
        this.all = all;
        return this;
    }

    public Integer getAll() {
        return this.all;
    }

    public StatResult setCorrected(Integer corrected) {
        this.corrected = corrected;
        return this;
    }

    public Integer getCorrected() {
        return this.corrected;
    }

    public StatResult setCorrecting(Integer correcting) {
        this.correcting = correcting;
        return this;
    }

    public Integer getCorrecting() {
        return this.correcting;
    }

    @Override
    public String toString() {
        return "StatResult{" + "all=" + all + "\n" + "corrected=" + corrected + "\n" + "correcting=" + correcting + "\n" + "}";
    }

}