package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTheMountTargetPermissionGroupRequest extends BaseBceRequest {

    /**
    * fsId
    */
    @JsonIgnore
    private String fsId;

    /**
    * mountID
    */
    @JsonIgnore
    private String mountID;

    /**
    * 修改的的权限组的名称，长度1~65个字节，字母开头，可包含字母数字和- _ .字符。
    */
    private String accessGroupName;

    public String getFsId() {
        return fsId;
    }

    public ModifyTheMountTargetPermissionGroupRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getMountID() {
        return mountID;
    }

    public ModifyTheMountTargetPermissionGroupRequest setMountID(String mountID) {
        this.mountID = mountID;
        return this;
    }

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public ModifyTheMountTargetPermissionGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

}
