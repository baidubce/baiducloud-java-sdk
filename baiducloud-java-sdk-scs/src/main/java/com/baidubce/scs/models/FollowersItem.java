package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowersItem {
    /**
     * 从角色实例ID
     */
    private String followerId;

    /**
     * 从角色实例所在地域
     */
    private String followerRegion;

    public FollowersItem setFollowerId(String followerId) {
        this.followerId = followerId;
        return this;
    }

    public String getFollowerId() {
        return this.followerId;
    }

    public FollowersItem setFollowerRegion(String followerRegion) {
        this.followerRegion = followerRegion;
        return this;
    }

    public String getFollowerRegion() {
        return this.followerRegion;
    }

    @Override
    public String toString() {
        return "FollowersItem{" + "followerId=" + followerId + "\n" + "followerRegion=" + followerRegion + "\n" + "}";
    }

}