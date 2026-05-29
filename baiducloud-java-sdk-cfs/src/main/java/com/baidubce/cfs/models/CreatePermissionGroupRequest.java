package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePermissionGroupRequest extends BaseBceRequest {

    /**
    * 新创建的权限组的名字，长度1~65个字节，字母开头，可包含字母数字和- _ .字符。
    */
    private String accessGroupName;

    /**
    * 对于新创建的权限组的描述，不能超过1024个字节
    */
    private String description;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public CreatePermissionGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreatePermissionGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
