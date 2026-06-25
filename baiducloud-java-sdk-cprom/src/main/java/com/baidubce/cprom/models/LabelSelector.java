package com.baidubce.cprom.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelSelector {
    /**
     * 标签键值对，如{"k8s-app":"metrics-server"}
     */
    private Map<String, String> matchLabels;

    public LabelSelector setMatchLabels(Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public Map<String, String> getMatchLabels() {
        return this.matchLabels;
    }

    @Override
    public String toString() {
        return "LabelSelector{" + "matchLabels=" + matchLabels + "\n" + "}";
    }

}