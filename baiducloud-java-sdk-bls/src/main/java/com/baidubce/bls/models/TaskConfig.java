package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskConfig {
    /**
     * srcConfig
     */
    private SrcConfig srcConfig;

    /**
     * destConfig
     */
    private DestConfig destConfig;

    public TaskConfig setSrcConfig(SrcConfig srcConfig) {
        this.srcConfig = srcConfig;
        return this;
    }

    public SrcConfig getSrcConfig() {
        return this.srcConfig;
    }

    public TaskConfig setDestConfig(DestConfig destConfig) {
        this.destConfig = destConfig;
        return this;
    }

    public DestConfig getDestConfig() {
        return this.destConfig;
    }

    @Override
    public String toString() {
        return "TaskConfig{" + "srcConfig=" + srcConfig + "\n" + "destConfig=" + destConfig + "\n" + "}";
    }

}