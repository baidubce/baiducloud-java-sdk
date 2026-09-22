package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupAddClusterRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * 从角色集群ID
    */
    private String followerId;

    /**
    * 从角色集群所在地域
    */
    private String followerRegion;

    /**
    * 是否同步主角色的参数（sync: 同步主角色参数， nosync：不同步主角色参数）
    */
    private String syncMaster;

    public String getGroupId() {
        return groupId;
    }

    public HotGroupAddClusterRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getFollowerId() {
        return followerId;
    }

    public HotGroupAddClusterRequest setFollowerId(String followerId) {
        this.followerId = followerId;
        return this;
    }

    public String getFollowerRegion() {
        return followerRegion;
    }

    public HotGroupAddClusterRequest setFollowerRegion(String followerRegion) {
        this.followerRegion = followerRegion;
        return this;
    }

    public String getSyncMaster() {
        return syncMaster;
    }

    public HotGroupAddClusterRequest setSyncMaster(String syncMaster) {
        this.syncMaster = syncMaster;
        return this;
    }

}
