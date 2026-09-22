package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupRemoveInstanceRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * 待移除的成员实例展示ID
    */
    private String memberId;

    /**
    * 成员实例所在地域
    */
    private String region;

    public String getGroupId() {
        return groupId;
    }

    public SyncGroupRemoveInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getMemberId() {
        return memberId;
    }

    public SyncGroupRemoveInstanceRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public SyncGroupRemoveInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }

}
