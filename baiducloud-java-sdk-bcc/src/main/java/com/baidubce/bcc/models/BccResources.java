package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BccResources {
    /**
     * 
     */
    private List<BccFlavorGroup> flavorGroups;

    public BccResources setFlavorGroups(List<BccFlavorGroup> flavorGroups) {
        this.flavorGroups = flavorGroups;
        return this;
    }

    public List<BccFlavorGroup> getFlavorGroups() {
        return this.flavorGroups;
    }

    @Override
    public String toString() {
        return "BccResources{" + "flavorGroups=" + flavorGroups + "\n" + "}";
    }

}