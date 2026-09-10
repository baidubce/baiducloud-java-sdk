package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String finishTime;

    /**
     * 
     */
    private String phase;

    /**
     * 
     */
    private List<Object> processes;

    public Task setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Task setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Task setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Task setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public String getFinishTime() {
        return this.finishTime;
    }

    public Task setPhase(String phase) {
        this.phase = phase;
        return this;
    }

    public String getPhase() {
        return this.phase;
    }

    public Task setProcesses(List<Object> processes) {
        this.processes = processes;
        return this;
    }

    public List<Object> getProcesses() {
        return this.processes;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + "\n" + "type=" + type + "\n" + "description=" + description + "\n" + "startTime=" + startTime + "\n" + "finishTime=" + finishTime + "\n"
                + "phase=" + phase + "\n" + "processes=" + processes + "\n" + "}";
    }

}