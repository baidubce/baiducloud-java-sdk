package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BbcFlavorGroup {
    /**
     * 实例套餐规格族
     */
    private String groupId;

    /**
     * 
     */
    private List<BbcFlavor> flavors;

    public BbcFlavorGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public BbcFlavorGroup setFlavors(List<BbcFlavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public List<BbcFlavor> getFlavors() {
        return this.flavors;
    }

    @Override
    public String toString() {
        return "BbcFlavorGroup{" + "groupId=" + groupId + "\n" + "flavors=" + flavors + "\n" + "}";
    }

}