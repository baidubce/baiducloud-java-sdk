package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MilvusComponent {
    /**
     * 
     */
    private String diskSizeType;

    /**
     * 
     */
    private Integer replicas;

    /**
     * 
     */
    private String spec;

    /**
     * 
     */
    private String type;

    public MilvusComponent setDiskSizeType(String diskSizeType) {
        this.diskSizeType = diskSizeType;
        return this;
    }

    public String getDiskSizeType() {
        return this.diskSizeType;
    }

    public MilvusComponent setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public Integer getReplicas() {
        return this.replicas;
    }

    public MilvusComponent setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public MilvusComponent setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "MilvusComponent{" + "diskSizeType=" + diskSizeType + "\n" + "replicas=" + replicas + "\n" + "spec=" + spec + "\n" + "type=" + type + "\n" + "}";
    }

}