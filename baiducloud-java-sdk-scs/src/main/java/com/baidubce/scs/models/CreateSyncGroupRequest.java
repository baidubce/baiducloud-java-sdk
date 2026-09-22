package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSyncGroupRequest extends BaseBceRequest {

    /**
    * 多活实例组名称。规则：支持大小写字母、数字以及-_.等特殊字符，以字母开头，长度6~32位
    */
    private String syncGroupName;

    /**
    * 多活实例组成员。最多支持5个成员。
    */
    private List<Member> members;

    public String getSyncGroupName() {
        return syncGroupName;
    }

    public CreateSyncGroupRequest setSyncGroupName(String syncGroupName) {
        this.syncGroupName = syncGroupName;
        return this;
    }

    public List<Member> getMembers() {
        return members;
    }

    public CreateSyncGroupRequest setMembers(List<Member> members) {
        this.members = members;
        return this;
    }

}
