package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BbcResources {
    /**
     * 实例套餐规格信息
     */
    private List<BbcFlavorGroup> flavorGroups;

    public BbcResources setFlavorGroups(List<BbcFlavorGroup> flavorGroups) {
        this.flavorGroups = flavorGroups;
        return this;
    }

    public List<BbcFlavorGroup> getFlavorGroups() {
        return this.flavorGroups;
    }

    @Override
    public String toString() {
        return "BbcResources{" + "flavorGroups=" + flavorGroups + "\n" + "}";
    }

}