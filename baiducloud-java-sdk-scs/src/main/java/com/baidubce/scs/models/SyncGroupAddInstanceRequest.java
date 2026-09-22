package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupAddInstanceRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * 待添加的成员实例展示ID
    */
    private String memberId;

    /**
    * 成员实例所在地域
    */
    private String region;

    public String getGroupId() {
        return groupId;
    }

    public SyncGroupAddInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getMemberId() {
        return memberId;
    }

    public SyncGroupAddInstanceRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public SyncGroupAddInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }

}
