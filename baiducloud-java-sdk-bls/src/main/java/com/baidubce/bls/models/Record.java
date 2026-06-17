package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Record {
    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String endTime;

    /**
     * 
     */
    private Integer finishedCount;

    public Record setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Record setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Record setFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
        return this;
    }

    public Integer getFinishedCount() {
        return this.finishedCount;
    }

    @Override
    public String toString() {
        return "Record{" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "finishedCount=" + finishedCount + "\n" + "}";
    }

}