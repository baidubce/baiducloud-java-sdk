package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAppBlbIpGroupMemberRequest extends BaseBceRequest {

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
    * 要删除的IP组成员id数组
    */
    private List<String> memberIdList;

    public String getBlbId() {
        return blbId;
    }

    public DeleteAppBlbIpGroupMemberRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAppBlbIpGroupMemberRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public DeleteAppBlbIpGroupMemberRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public List<String> getMemberIdList() {
        return memberIdList;
    }

    public DeleteAppBlbIpGroupMemberRequest setMemberIdList(List<String> memberIdList) {
        this.memberIdList = memberIdList;
        return this;
    }

}
