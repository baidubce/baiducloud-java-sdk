package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupModifyNameRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * 新的名称。规则：支持大小写字母、数字以及-_.等特殊字符，长度6~32
    */
    private String groupName;

    public String getGroupId() {
        return groupId;
    }

    public HotGroupModifyNameRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public HotGroupModifyNameRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
