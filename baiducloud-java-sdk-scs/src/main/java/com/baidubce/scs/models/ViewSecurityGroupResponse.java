package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewSecurityGroupResponse extends BaseBceResponse {

    /**
    * 安全组列表。
    */
    private List<Group> groups;

    /**
    * 安全组规则列表。
    */
    private List<Rule> activeRules;

    public List<Group> getGroups() {
        return groups;
    }

    public ViewSecurityGroupResponse setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public List<Rule> getActiveRules() {
        return activeRules;
    }

    public ViewSecurityGroupResponse setActiveRules(List<Rule> activeRules) {
        this.activeRules = activeRules;
        return this;
    }

    @Override
    public String toString() {
        return "ViewSecurityGroupResponse{" + "groups=" + groups + "\n" + "activeRules=" + activeRules + "\n" + "}";
    }

}
