package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbIpGroupMemberRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * IP组的id
    */
    private String ipGroupId;

    /**
    * IP组成员列表
    */
    private List<AppIpGroupMember> memberList;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbIpGroupMemberRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbIpGroupMemberRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public UpdateAppBlbIpGroupMemberRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public List<AppIpGroupMember> getMemberList() {
        return memberList;
    }

    public UpdateAppBlbIpGroupMemberRequest setMemberList(List<AppIpGroupMember> memberList) {
        this.memberList = memberList;
        return this;
    }

}
