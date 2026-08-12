package com.baidubce.ax.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SandboxContainerResourceStatus {
    /**
     * 容器名称。
     */
    private String name;

    /**
     * desired
     */
    private SandboxResource desired;

    /**
     * allocated
     */
    private SandboxResource allocated;

    /**
     * current
     */
    private SandboxResource current;

    public SandboxContainerResourceStatus setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SandboxContainerResourceStatus setDesired(SandboxResource desired) {
        this.desired = desired;
        return this;
    }

    public SandboxResource getDesired() {
        return this.desired;
    }

    public SandboxContainerResourceStatus setAllocated(SandboxResource allocated) {
        this.allocated = allocated;
        return this;
    }

    public SandboxResource getAllocated() {
        return this.allocated;
    }

    public SandboxContainerResourceStatus setCurrent(SandboxResource current) {
        this.current = current;
        return this;
    }

    public SandboxResource getCurrent() {
        return this.current;
    }

    @Override
    public String toString() {
        return "SandboxContainerResourceStatus{" + "name=" + name + "\n" + "desired=" + desired + "\n" + "allocated=" + allocated + "\n" + "current=" + current + "\n" + "}";
    }

}