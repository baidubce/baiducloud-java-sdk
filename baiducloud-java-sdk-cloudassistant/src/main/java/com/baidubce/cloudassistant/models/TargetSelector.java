package com.baidubce.cloudassistant.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetSelector {
    /**
     * 实例类型。枚举值：BCC，BBC
     */
    private String instanceType;

    /**
     * 实例标签列表
     */
    private List<Tag> tags;

    /**
     * importInstances
     */
    private TargetImport importInstances;

    public TargetSelector setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public TargetSelector setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public TargetSelector setImportInstances(TargetImport importInstances) {
        this.importInstances = importInstances;
        return this;
    }

    public TargetImport getImportInstances() {
        return this.importInstances;
    }

    @Override
    public String toString() {
        return "TargetSelector{" + "instanceType=" + instanceType + "\n" + "tags=" + tags + "\n" + "importInstances=" + importInstances + "\n" + "}";
    }

}