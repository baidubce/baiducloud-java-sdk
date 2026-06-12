package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mention {
    /**
     * 提醒方式，可选值：NONE（不通知）/ ALL（通知全体）/ USERS（通知用户）
     */
    private String type;

    /**
     * 当type=USERS时必填，通知用户ID列表
     */
    private List<String> userIds;

    public Mention setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Mention setUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    public List<String> getUserIds() {
        return this.userIds;
    }

    @Override
    public String toString() {
        return "Mention{" + "type=" + type + "\n" + "userIds=" + userIds + "\n" + "}";
    }

}