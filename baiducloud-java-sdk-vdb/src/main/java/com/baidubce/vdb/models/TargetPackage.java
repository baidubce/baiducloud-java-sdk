package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetPackage {
    /**
     * 
     */
    private String targetMilvusKernelVersion;

    /**
     * 
     */
    private String targetPackageVersion;

    /**
     * 
     */
    private String upgradeNote;

    public TargetPackage setTargetMilvusKernelVersion(String targetMilvusKernelVersion) {
        this.targetMilvusKernelVersion = targetMilvusKernelVersion;
        return this;
    }

    public String getTargetMilvusKernelVersion() {
        return this.targetMilvusKernelVersion;
    }

    public TargetPackage setTargetPackageVersion(String targetPackageVersion) {
        this.targetPackageVersion = targetPackageVersion;
        return this;
    }

    public String getTargetPackageVersion() {
        return this.targetPackageVersion;
    }

    public TargetPackage setUpgradeNote(String upgradeNote) {
        this.upgradeNote = upgradeNote;
        return this;
    }

    public String getUpgradeNote() {
        return this.upgradeNote;
    }

    @Override
    public String toString() {
        return "TargetPackage{" + "targetMilvusKernelVersion=" + targetMilvusKernelVersion + "\n" + "targetPackageVersion=" + targetPackageVersion + "\n" + "upgradeNote="
                + upgradeNote + "\n" + "}";
    }

}