package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BccFlavorGroup {
    /**
     * 实例套餐规格族
     */
    private String groupId;

    /**
     * 实例套餐规格
     */
    private List<BccFlavor> flavors;

    public BccFlavorGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public BccFlavorGroup setFlavors(List<BccFlavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public List<BccFlavor> getFlavors() {
        return this.flavors;
    }

    @Override
    public String toString() {
        return "BccFlavorGroup{" + "groupId=" + groupId + "\n" + "flavors=" + flavors + "\n" + "}";
    }

}