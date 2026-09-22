package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupStaleReadableRequest extends BaseBceRequest {

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
    * 是否开启从角色脏读（true：开启，false：关闭）
    */
    private Boolean staleReadable;

    public String getGroupId() {
        return groupId;
    }

    public HotGroupStaleReadableRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getFollowerId() {
        return followerId;
    }

    public HotGroupStaleReadableRequest setFollowerId(String followerId) {
        this.followerId = followerId;
        return this;
    }

    public Boolean getStaleReadable() {
        return staleReadable;
    }

    public HotGroupStaleReadableRequest setStaleReadable(Boolean staleReadable) {
        this.staleReadable = staleReadable;
        return this;
    }

}
