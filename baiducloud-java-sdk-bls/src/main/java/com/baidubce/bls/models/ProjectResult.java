package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectResult {
    /**
     * project
     */
    private Project project;

    public ProjectResult setProject(Project project) {
        this.project = project;
        return this;
    }

    public Project getProject() {
        return this.project;
    }

    @Override
    public String toString() {
        return "ProjectResult{" + "project=" + project + "\n" + "}";
    }

}