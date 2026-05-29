package com.baidubce.cfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessGroupModel {
    /**
     * 
     */
    private String accessGroupName;

    /**
     * 
     */
    private List<AccessRuleModel> accessRules;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Integer fsCount;

    public AccessGroupModel setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public AccessGroupModel setAccessRules(List<AccessRuleModel> accessRules) {
        this.accessRules = accessRules;
        return this;
    }

    public List<AccessRuleModel> getAccessRules() {
        return this.accessRules;
    }

    public AccessGroupModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public AccessGroupModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AccessGroupModel setFsCount(Integer fsCount) {
        this.fsCount = fsCount;
        return this;
    }

    public Integer getFsCount() {
        return this.fsCount;
    }

    @Override
    public String toString() {
        return "AccessGroupModel{" + "accessGroupName=" + accessGroupName + "\n" + "accessRules=" + accessRules + "\n" + "createTime=" + createTime + "\n" + "description="
                + description + "\n" + "fsCount=" + fsCount + "\n" + "}";
    }

}