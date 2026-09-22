package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupPreCheckRequest extends BaseBceRequest {

    /**
    * leader
    */
    private Leader leader;

    /**
    * 从角色信息
    */
    private List<FollowersItem> followers;

    public Leader getLeader() {
        return leader;
    }

    public HotGroupPreCheckRequest setLeader(Leader leader) {
        this.leader = leader;
        return this;
    }

    public List<FollowersItem> getFollowers() {
        return followers;
    }

    public HotGroupPreCheckRequest setFollowers(List<FollowersItem> followers) {
        this.followers = followers;
        return this;
    }

}
