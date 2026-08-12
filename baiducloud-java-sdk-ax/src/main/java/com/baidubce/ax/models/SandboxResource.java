package com.baidubce.ax.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SandboxResource {
    /**
     * CPU 资源量。
     */
    private String cpu;

    /**
     * 内存资源量。
     */
    private String memory;

    public SandboxResource setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getCpu() {
        return this.cpu;
    }

    public SandboxResource setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public String getMemory() {
        return this.memory;
    }

    @Override
    public String toString() {
        return "SandboxResource{" + "cpu=" + cpu + "\n" + "memory=" + memory + "\n" + "}";
    }

}