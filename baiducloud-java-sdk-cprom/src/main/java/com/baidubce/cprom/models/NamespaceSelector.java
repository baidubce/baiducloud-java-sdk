package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NamespaceSelector {
    /**
     * 命名空间列表
     */
    private List<String> matchNames;

    public NamespaceSelector setMatchNames(List<String> matchNames) {
        this.matchNames = matchNames;
        return this;
    }

    public List<String> getMatchNames() {
        return this.matchNames;
    }

    @Override
    public String toString() {
        return "NamespaceSelector{" + "matchNames=" + matchNames + "\n" + "}";
    }

}