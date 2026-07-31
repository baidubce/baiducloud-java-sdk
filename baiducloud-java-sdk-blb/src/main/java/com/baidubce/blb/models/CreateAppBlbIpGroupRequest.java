package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbIpGroupRequest extends BaseBceRequest {

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
    * IP组的名称，方便记忆。长度1~65个字节，字母开头，_可包含字母数字-/.字符。若不传该参数，会自动生成
    */
    private String name;

    /**
    * IP组的描述，最大支持200字符
    */
    private String desc;

    /**
    * IP组挂载的IP组成员列表
    */
    private List<AppIpGroupMemberForCreate> memberList;

    public String getBlbId() {
        return blbId;
    }

    public CreateAppBlbIpGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbIpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAppBlbIpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateAppBlbIpGroupRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public List<AppIpGroupMemberForCreate> getMemberList() {
        return memberList;
    }

    public CreateAppBlbIpGroupRequest setMemberList(List<AppIpGroupMemberForCreate> memberList) {
        this.memberList = memberList;
        return this;
    }

}
