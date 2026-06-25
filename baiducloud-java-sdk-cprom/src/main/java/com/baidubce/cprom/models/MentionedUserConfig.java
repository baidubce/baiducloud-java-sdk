package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MentionedUserConfig {
    /**
     * 是否 @ 所有人
     */
    private Boolean atAll;

    /**
     * 需要 @ 的用户 ID 列表
     */
    private List<String> userIds;

    public MentionedUserConfig setAtAll(Boolean atAll) {
        this.atAll = atAll;
        return this;
    }

    public Boolean getAtAll() {
        return this.atAll;
    }

    public MentionedUserConfig setUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    public List<String> getUserIds() {
        return this.userIds;
    }

    @Override
    public String toString() {
        return "MentionedUserConfig{" + "atAll=" + atAll + "\n" + "userIds=" + userIds + "\n" + "}";
    }

}