package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRouteResult {
    /**
     * 已删除的路由名称
     */
    private String routeName;

    /**
     * 删除时间，格式为 `YYYY-MM-DD HH:mm:ss`
     */
    private String deletedTime;

    public DeleteRouteResult setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    public String getRouteName() {
        return this.routeName;
    }

    public DeleteRouteResult setDeletedTime(String deletedTime) {
        this.deletedTime = deletedTime;
        return this;
    }

    public String getDeletedTime() {
        return this.deletedTime;
    }

    @Override
    public String toString() {
        return "DeleteRouteResult{" + "routeName=" + routeName + "\n" + "deletedTime=" + deletedTime + "\n" + "}";
    }

}