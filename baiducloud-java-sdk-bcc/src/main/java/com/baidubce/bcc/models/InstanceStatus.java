package com.baidubce.bcc.models;

/**
 * Gets or Sets InstanceStatus
 */
public enum InstanceStatus {

    STARTING("Starting"),

    RUNNING("Running"),

    STOPPING("Stopping"),

    STOPPED("Stopped"),

    RECYCLED("Recycled"),

    DELETED("Deleted"),

    SCALING("Scaling"),

    EXPIRED("Expired"),

    ERROR("Error"),

    SNAPSHOTPROCESSING("SnapshotProcessing"),

    IMAGEPROCESSING("ImageProcessing"),

    RECHARGING("Recharging"),

    VOLUMERESIZING("VolumeResizing"),

    BILLINGCHANGING("BillingChanging"),

    CHANGESUBNET("ChangeSubnet"),

    CHANGEVPC("ChangeVpc"),

    ATTACHINGPORT("AttachingPort"),

    DETACHINGPORT("DetachingPort"),

    MOVING("Moving");

    private String value;

    InstanceStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}