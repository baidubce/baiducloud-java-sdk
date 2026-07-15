package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbIpGroupMemberRequest extends BaseBceRequest {

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
    * 所属IP组的标识符
    */
    private String ipGroupId;

    /**
    * IP组成员列表
    */
    private List<AppIpGroupMemberForCreate> memberList;

    public String getBlbId() {
        return blbId;
    }

    public CreateAppBlbIpGroupMemberRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbIpGroupMemberRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public CreateAppBlbIpGroupMemberRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public List<AppIpGroupMemberForCreate> getMemberList() {
        return memberList;
    }

    public CreateAppBlbIpGroupMemberRequest setMemberList(List<AppIpGroupMemberForCreate> memberList) {
        this.memberList = memberList;
        return this;
    }

}
